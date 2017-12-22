package main

import (
	"fmt"
	"html/template"
	"log"
	"net/http"
	"strings"
)

func sayhelloName(w http.ResponseWriter, r *http.Request) {
	r.ParseForm()       // parse arguments, you have to call this by yourself
	fmt.Println(r.Form) // print form information in server side
	fmt.Println("path", r.URL.Path)
	fmt.Println("scheme", r.URL.Scheme)
	fmt.Println(r.Form["url_long"])
	for k, v := range r.Form {
		fmt.Println("key:", k)
		fmt.Println("val:", strings.Join(v, ""))
	}
	fmt.Fprintf(w, "Hello naowal!") // send data to client side
}

func success(w http.ResponseWriter, r *http.Request) {
		r.ParseForm()       // parse arguments, you have to call this by yourself
	fmt.Println(r.Form) // print form information in server side
	fmt.Println("path", r.URL.Path)
	fmt.Println("scheme", r.URL.Scheme)
	fmt.Println(r.Form["url_long"])
	for k, v := range r.Form {
		fmt.Println("key:", k)
		fmt.Println("val:", strings.Join(v, ""))
	}
	t, _ := template.ParseFiles("success.gtpl")
	t.Execute(w, nil)

	//print to client side
	//print in client side
	
	fmt.Fprintln(w, "your subscribe id= "+r.FormValue("subscr_id"))
	
	fmt.Fprintln(w, "your subscribe date= "+r.FormValue("subscr_date"))
	
	fmt.Fprintf(w, "Payment success!") // send data to client side
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
