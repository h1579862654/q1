package com.pojo;


public class TFun {

  private long id;
  private String name;
  private String url;

  @Override
  public String toString() {
    return "TFun{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", url='" + url + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
