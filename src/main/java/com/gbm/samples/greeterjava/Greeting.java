package com.gbm.samples.greeterjava;

public class Greeting {
  private final long request;
  private final String content;
  
  public Greeting(long request, String content){
    this.request = request;
    this.content = content;
  }

  public long getRequest() {
    return this.request;
  }


  public String getContent() {
    return this.content;
  }

  
}
