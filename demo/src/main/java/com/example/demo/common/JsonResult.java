package com.example.demo.common;

/**
 * 返回结果集
 */
public class JsonResult<T> {
    //响应状态  成功：SUCCESS  失败：FAIL
    private Enum code;
    //响应消息
    private String message;
    //响应数据
    private T data;

    public JsonResult() {
    }

    public JsonResult(Enum code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonResult(Enum code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Enum getCode() {
        return code;
    }

    public void setCode(Enum code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
