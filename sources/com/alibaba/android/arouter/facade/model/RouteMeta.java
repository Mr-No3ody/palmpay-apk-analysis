package com.alibaba.android.arouter.facade.model;

import C0.G;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.enums.RouteType;
import java.util.Map;
import javax.lang.model.element.Element;

/* JADX INFO: loaded from: classes.dex */
public class RouteMeta {
    private Class<?> destination;
    private int extra;
    private String group;
    private Map<String, Autowired> injectConfig;
    private String name;
    private Map<String, Integer> paramsType;
    private String path;
    private int priority;
    private Element rawType;
    private RouteType type;

    public RouteMeta() {
        this.priority = -1;
    }

    public static RouteMeta build(RouteType routeType, Class<?> cls, String str, String str2, int i7, int i10) {
        return new RouteMeta(routeType, null, cls, null, str, str2, null, i7, i10);
    }

    public Class<?> getDestination() {
        return this.destination;
    }

    public int getExtra() {
        return this.extra;
    }

    public String getGroup() {
        return this.group;
    }

    public Map<String, Autowired> getInjectConfig() {
        return this.injectConfig;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, Integer> getParamsType() {
        return this.paramsType;
    }

    public String getPath() {
        return this.path;
    }

    public int getPriority() {
        return this.priority;
    }

    public Element getRawType() {
        return this.rawType;
    }

    public RouteType getType() {
        return this.type;
    }

    public RouteMeta setDestination(Class<?> cls) {
        this.destination = cls;
        return this;
    }

    public RouteMeta setExtra(int i7) {
        this.extra = i7;
        return this;
    }

    public RouteMeta setGroup(String str) {
        this.group = str;
        return this;
    }

    public void setInjectConfig(Map<String, Autowired> map) {
        this.injectConfig = map;
    }

    public void setName(String str) {
        this.name = str;
    }

    public RouteMeta setParamsType(Map<String, Integer> map) {
        this.paramsType = map;
        return this;
    }

    public RouteMeta setPath(String str) {
        this.path = str;
        return this;
    }

    public RouteMeta setPriority(int i7) {
        this.priority = i7;
        return this;
    }

    public RouteMeta setRawType(Element element) {
        this.rawType = element;
        return this;
    }

    public RouteMeta setType(RouteType routeType) {
        this.type = routeType;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RouteMeta{type=");
        sb2.append(this.type);
        sb2.append(", rawType=");
        sb2.append(this.rawType);
        sb2.append(", destination=");
        sb2.append(this.destination);
        sb2.append(", path='");
        sb2.append(this.path);
        sb2.append("', group='");
        sb2.append(this.group);
        sb2.append("', priority=");
        sb2.append(this.priority);
        sb2.append(", extra=");
        sb2.append(this.extra);
        sb2.append(", paramsType=");
        sb2.append(this.paramsType);
        sb2.append(", name='");
        return G.r(sb2, this.name, "'}");
    }

    public static RouteMeta build(RouteType routeType, Class<?> cls, String str, String str2, Map<String, Integer> map, int i7, int i10) {
        return new RouteMeta(routeType, null, cls, null, str, str2, map, i7, i10);
    }

    public RouteMeta(Route route, Class<?> cls, RouteType routeType) {
        this(routeType, null, cls, route.name(), route.path(), route.group(), null, route.priority(), route.extras());
    }

    public RouteMeta(Route route, Element element, RouteType routeType, Map<String, Integer> map) {
        this(routeType, element, null, route.name(), route.path(), route.group(), map, route.priority(), route.extras());
    }

    public RouteMeta(RouteType routeType, Element element, Class<?> cls, String str, String str2, String str3, Map<String, Integer> map, int i7, int i10) {
        this.type = routeType;
        this.name = str;
        this.destination = cls;
        this.rawType = element;
        this.path = str2;
        this.group = str3;
        this.paramsType = map;
        this.priority = i7;
        this.extra = i10;
    }
}
