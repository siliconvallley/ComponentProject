package com.dh.common_library;

/**
 * @author 86351
 * @date 2020/9/17
 * @description 路径对象（公共基础库中，所有子模块都可以调用）
 * path : ”order/OrderMainActivity”
 * clazz : OrderMainActivity.class
 */
public class PathBean {
    private String path;
    private Class clazz;

    public PathBean() {
    }

    public PathBean(String path, Class clazz) {
        this.path = path;
        this.clazz = clazz;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
