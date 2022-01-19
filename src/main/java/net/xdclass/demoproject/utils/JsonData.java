package net.xdclass.demoproject.utils;

import lombok.Data;

/**
 * @program: demo-project
 * @description: json数据
 * @author: mdh
 * @create: 2022-01-18 19:37
 **/
@Data
public class JsonData {
    private int code;
    private Object data;
    private String msg;

    public JsonData() {
    }

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static JsonData buildSuccess(Object data) {
        return new JsonData(0, data,"success!");
    }

    public static JsonData buildError(String msg) {
        return new JsonData(-1, msg);
    }

    public static JsonData buildError(String msg, int code) {
        return new JsonData(code,  msg);
    }

}