package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 业主表
 */
public class User implements Serializable {
    private Integer id;//序列号
    private String userId;//业主标识
    private String name;//用户名
    private String phone;//手机号
    private String nickname;//微信昵称
    private String headimgurl;//头像路径
    private String wxOpenid;//微信open id
    private Date regtime;	//注册时间
    private Integer status;	//用户状态 0:正常 1:已禁用 2:已删除
    private Integer cid; //社区标识ID
    private Integer communityId;//社区标识

    private String community;//社区名称
    private Integer cStatus;//社区状态

    public Integer getcStatus() {
        return cStatus;
    }

    public void setcStatus(Integer cStatus) {
        this.cStatus = cStatus;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public Integer getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", userId:'" + userId + '\'' +
                ", name:'" + name + '\'' +
                ", phone:'" + phone + '\'' +
                ", nickname:'" + nickname + '\'' +
                ", headimgurl:'" + headimgurl + '\'' +
                ", wxOpenid:'" + wxOpenid + '\'' +
                ", regtime:" + regtime +
                ", status:" + status +
                ", cid:" + cid +
                ", communityId:" + communityId +
                ", community:" + community +
                '}';
    }
}
