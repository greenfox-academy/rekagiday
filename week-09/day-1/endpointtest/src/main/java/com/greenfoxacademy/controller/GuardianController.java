package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.ErrorHandler;
import com.greenfoxacademy.model.Groot;
import com.greenfoxacademy.model.Yondu;
import com.greenfoxacademy.service.GrootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  ErrorHandler errorHandler;

  @Autowired
  Groot groot;

  @GetMapping (value = "/groot")
  public GrootService groot(@RequestParam (value = "message") String message) {
    if (message.length() == 0)
      return errorHandler;
    groot.setReceived(message);
    return groot;
  }

  @Autowired
  Yondu yondu;

  @GetMapping(value = "/yondu")
  public Yondu yondu(@RequestParam(value = "distance") String distance,
                     @RequestParam (value = "time") String time) {
    yondu.setDistance(Double.parseDouble(distance));
    yondu.setTime(Double.parseDouble(time));
    yondu.setSpeed();
    return yondu;
  }


}