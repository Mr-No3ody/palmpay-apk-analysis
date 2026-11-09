package com.palmpay.lib.apm.launchcounter.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f23791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReflectUtils f23792b;

    public c(ReflectUtils reflectUtils, boolean z3) {
        this.f23792b = reflectUtils;
        this.f23791a = z3;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ReflectUtils reflectUtils = this.f23792b;
        String name = method.getName();
        try {
            return ReflectUtils.reflect(reflectUtils.object).method(name, objArr).get();
        } catch (ReflectUtils.ReflectException e10) {
            if (this.f23791a) {
                Map map = (Map) reflectUtils.object;
                int length = objArr == null ? 0 : objArr.length;
                if (length == 0 && name.startsWith("get")) {
                    return map.get(ReflectUtils.property(name.substring(3)));
                }
                if (length == 0 && name.startsWith("is")) {
                    return map.get(ReflectUtils.property(name.substring(2)));
                }
                if (length == 1 && name.startsWith("set")) {
                    map.put(ReflectUtils.property(name.substring(3)), objArr[0]);
                    return null;
                }
            }
            throw e10;
        }
    }
}
