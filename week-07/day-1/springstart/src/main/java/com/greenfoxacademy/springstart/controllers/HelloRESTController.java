package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 2017. 05. 02..
 */

@RestController

public class HelloRESTController {

  AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping(value="/greeting")
  @ResponseBody

  public Greeting greeting(@RequestParam(value = "name", defaultValue="World") String name) {


    Greeting greeting = new Greeting(atomicLong.getAndIncrement(), "Hello, " + name + "!");

    return greeting;

  }
}
