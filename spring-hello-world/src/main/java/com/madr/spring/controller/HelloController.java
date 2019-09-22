package com.madr.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple controller.
 */
@RestController
public class HelloController {

  @GetMapping
  public ResponseEntity<?> justHelloWorld() {
    return new ResponseEntity<String>( "Hello World !!!", HttpStatus.OK);
  }
}
