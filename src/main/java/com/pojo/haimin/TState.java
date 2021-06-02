package com.pojo.haimin;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-06-02 2:51 星期三
 */
public class TState {
    private int key;//申请表主键
    private String time;//审核时间
    private int type;//申请表类型
    private int iid;//根据申请表类型找相关表id
    private int state;//状态
    private String butto;//那个按钮(通过,拒绝)

    public String getButto() {
        return butto;
    }

    public void setButto(String butto) {
        this.butto = butto;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
