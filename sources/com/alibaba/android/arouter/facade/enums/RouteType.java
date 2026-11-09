package com.alibaba.android.arouter.facade.enums;

/* JADX INFO: loaded from: classes.dex */
public enum RouteType {
    ACTIVITY(0, "android.app.Activity"),
    SERVICE(1, "android.app.Service"),
    PROVIDER(2, "com.alibaba.android.arouter.facade.template.IProvider"),
    CONTENT_PROVIDER(-1, "android.app.ContentProvider"),
    BOARDCAST(-1, ""),
    METHOD(-1, ""),
    FRAGMENT(-1, "android.app.Fragment"),
    UNKNOWN(-1, "Unknown route type");

    String className;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    int f20357id;

    RouteType(int i7, String str) {
        this.f20357id = i7;
        this.className = str;
    }

    public static RouteType parse(String str) {
        for (RouteType routeType : values()) {
            if (routeType.getClassName().equals(str)) {
                return routeType;
            }
        }
        return UNKNOWN;
    }

    public String getClassName() {
        return this.className;
    }

    public int getId() {
        return this.f20357id;
    }

    public RouteType setClassName(String str) {
        this.className = str;
        return this;
    }

    public RouteType setId(int i7) {
        this.f20357id = i7;
        return this;
    }
}
