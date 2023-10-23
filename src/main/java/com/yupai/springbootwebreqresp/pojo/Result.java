package com.yupai.springbootwebreqresp.pojo;
//统一返回值类型

public class Result {
    private Integer code;
    private String message;
    private Object data;

    //无参构造方法：
    public Result(){

    }
    //有参构造方法
    public Result(Integer code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    //下面是一些get set方法
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    //一些静态方法，用于快速构造Result 对象
    public static Result success(Object data){
        return new Result( 200,"success",data);
    }

    public static Result success(){
        return new Result(200,"success",null);
    }
    public static Result error(String message){
        return new Result(500,message,null);
    }
    //toString 方法

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
