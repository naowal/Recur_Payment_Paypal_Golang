
// sentFollowpay
package main

import (
	"fmt"
	"net/http"
	"strings"
)


func FollowRedirectHandler(hosted_button_id string,successurl string,denyurl string) http.Handler {
	target = "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_s-xclick&rm=2&hosted_button_id=" + hosted_button_id +
		"&return=" + successurl + "&cancel_return=" + denyurl
		
	return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
		http.Redirect(w, r, target, http.StatusFound)
	})
}

func FollowPostHandler(post http.HandlerFunc) http.Handler {
	return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
		switch r.Method {
		case http.MethodPost:
			r.ParseForm()       // parse arguments, you have to call this by yourself
			fmt.Println(r.Form) // print form information in server side
			fmt.Println("path", r.URL.Path)
			fmt.Println("scheme", r.URL.Scheme)
			fmt.Println(r.Form["url_long"])
			for k, v := range r.Form {
				fmt.Println("key:", k)
				fmt.Println("val:", strings.Join(v, ""))
			}

	//print to client side
			fmt.Fprintln(w, "your subscribe id= "+r.FormValue("subscr_id"))
			fmt.Fprintln(w, "your subscribe date= "+r.FormValue("subscr_date"))			
			post.ServeHTTP(w, r)
		default:
			return
		}
	})
}


