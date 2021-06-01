package com.pojo;


public class TPro {

  private int id;
  private int uuid;
  private String pname;
  private String pswer;


  @Override
  public String toString() {
    return "TPro{" +
            "id=" + id +
            ", uuid=" + uuid +
            ", pname='" + pname + '\'' +
            ", pswer='" + pswer + '\'' +
            '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUuid() {
    return uuid;
  }

  public void setUuid(int uuid) {
    this.uuid = uuid;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public String getPswer() {
    return pswer;
  }

  public void setPswer(String pswer) {
    this.pswer = pswer;
  }

}
