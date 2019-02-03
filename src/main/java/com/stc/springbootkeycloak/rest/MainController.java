package com.stc.springbootkeycloak.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

   @GetMapping("/")
   public String helloWorld() {
      return "Hello world !!!"; // + user.getName() ;
   }

   @GetMapping("/test")
   public String helloWorldTest() {
      return "Hello world test"; // + user.getName() ;
   }
}
