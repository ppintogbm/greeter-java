package com.gbm.samples.greeterjava;

// import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  private static final String template = "Hello %s";
  private final AtomicLong requestCounter = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(defaultValue = "World", name = "name") String name){
    return new Greeting(requestCounter.incrementAndGet(), String.format(template, name));
  }

  @GetMapping("/greeting/{name}")
  public Greeting greeting(@PathVariable Map<String,String> pathVarsMap){
    return greeting(pathVarsMap.get("name"));
  }

}
