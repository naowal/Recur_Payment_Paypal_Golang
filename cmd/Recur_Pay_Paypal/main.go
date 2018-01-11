package main

import (
	"fmt"
	"html/template"
	"log"
	"net/http"
	"strings"
	//"bytes"
	//"net/url"
	//"github.com/naowal/Recur_Pay_Paypal"
)

func FollowRedirectHandler(w http.ResponseWriter, r *http.Request, hosted_button_id string,successurl string,denyurl string){
	
	var target string
	hosted_button_id = "R8NP968R5KGQY"
	successurl = "localhost:8080"
	denyurl = "localhost:8080"
	target = "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_s-xclick&rm=2&hosted_button_id=" + hosted_button_id +
		"&return=" + successurl + "&cancel_return=" + denyurl
		
		http.Redirect(w, r, target, http.StatusFound)
}

func FollowPostHandler(w http.ResponseWriter, r *http.Request) {

			r.ParseForm()       // parse arguments, you have to call this by yourself
			fmt.Println(r.Form) // print form information in server side
			fmt.Println("path", r.URL.Path)
			fmt.Println("scheme", r.URL.Scheme)
			for k, v := range r.Form {
				fmt.Println("key:", k)
				fmt.Println("val:", strings.Join(v, ""))
			}
	//print to client side
			fmt.Fprintln(w, "your subscribe id= "+r.FormValue("subscr_id"))
			fmt.Fprintln(w, "your subscribe date= "+r.FormValue("subscr_date"))			
			//post.ServeHTTP(w, r)
}


func sayhelloName(w http.ResponseWriter, r *http.Request) {
	if r.Method == "POST" {
		FollowPostHandler(w,r)
		} else {
			FollowRedirectHandler(w,r,"R8NP968R5KGQY","localhost:8080","localhost:8080/deny")
			}
}

func sentpost(w http.ResponseWriter, r *http.Request) {
	http.Redirect(w,r,"https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_s-xclick&rm=2&hosted_button_id=R8NP968R5KGQY",http.StatusFound)
}

func success(w http.ResponseWriter, r *http.Request) {
	
}

func deny(w http.ResponseWriter, r *http.Request) {
	r.ParseForm()       // parse arguments, you have to call this by yourself
	fmt.Println(r.Form) // print form information in server side
	fmt.Println("path", r.URL.Path)
	fmt.Println("scheme", r.URL.Scheme)
	fmt.Println(r.Form["url_long"])
	for k, v := range r.Form {
		fmt.Println("key:", k)
		fmt.Println("val:", strings.Join(v, ""))
	}
	fmt.Fprintf(w, "Payment Deny!") // send data to client side
}

func recur_payment(w http.ResponseWriter, r *http.Request) {
		t, _ := template.ParseFiles("recur_payment.gtpl")
		t.Execute(w, nil)

}

func profile(w http.ResponseWriter, r *http.Request) {
		t, _ := template.ParseFiles("profile.gtpl")
		t.Execute(w, nil)

}



func main() {
	http.HandleFunc("/", sayhelloName) // set router
	http.HandleFunc("/recur_payment", recur_payment)
	http.HandleFunc("/success", success)
	http.HandleFunc("/deny", deny)
	http.HandleFunc("/profile", profile)
	err := http.ListenAndServe(":8080", nil) // set listen port
	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}
