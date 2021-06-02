package com.pojo.haimin;


public class TApply {
  private String name;//用户名
  private String phone;//用户电话
  private int type;//1学校申请驻入2学生申请3员工申请4老师申请
  private int iid;//关联相应表id
  private String typeArray[]={"学校申请驻入","学生申请","员工申请","老师申请"};
  private String note;//申请备注
  private String snote;//审批备注
  private String starttime;//申请时间
  private String lasttime;//审批时间
  private int state;//0正常1注销2审核中3拒绝
  private int id;//申请表id

  public int getIid() {
    return iid;
  }

  public void setIid(int iid) {
    this.iid = iid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getSnote() {
    return snote;
  }

  public void setSnote(String snote) {
    this.snote = snote;
  }

  public String getStarttime() {
    return starttime;
  }

  public void setStarttime(String starttime) {
    this.starttime = starttime;
  }

  public String getLasttime() {
    return lasttime;
  }

  public void setLasttime(String lasttime) {
    this.lasttime = lasttime;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


}
