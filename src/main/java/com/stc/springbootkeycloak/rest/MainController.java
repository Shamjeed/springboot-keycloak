package com.stc.springbootkeycloak.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

   @GetMapping("/")
   public String helloWorld() {
      return "Welcome !!!";
   }

   @GetMapping("/user")
   public String user() {
      return "Welcome to user page ";
   }

   @GetMapping("/admin")
   public String admin() {
      return "Welcome to admin page";
   }
}
