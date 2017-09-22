package com.hakanyildiz.tvmassignment;

public class Content {

  private final long id;
  private final String param1;
  private final String param2;

  public Content(long id, String param1, String param2) {
      this.id = id;
      this.param1 = param1;
      this.param2 = param2;
      }

  public long getId() {
      return id;
  }

  public String getParam1() {
	return param1;
}
  public String getParam2() {
	return param2;
}
 
}
