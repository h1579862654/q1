package com.pojo;


public class User {

  private int id;
  private String phone;
  private String pass;
  private String name;
  private int type;
  private int sex;
  private String head;
  private String signature;
  private int state;

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", phone='" + phone + '\'' +
            ", pass='" + pass + '\'' +
            ", name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", sex='" + sex + '\'' +
            ", head='" + head + '\'' +
            ", signature='" + signature + '\'' +
            ", state='" + state + '\'' +
            '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
