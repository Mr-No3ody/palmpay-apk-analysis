package com.transsnet.palmpay.util;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class SystemProperties {
    private static Method sysPropGet;
    private static Method sysPropSet;

    static {
        try {
            for (Method method : Class.forName("android.os.SystemProperties").getMethods()) {
                String name = method.getName();
                if (name.equals("get")) {
                    sysPropGet = method;
                } else if (name.equals("set")) {
                    sysPropSet = method;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private SystemProperties() {
    }

    public static String get(String str, String str2) {
        try {
            return (String) sysPropGet.invoke(null, str, str2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return str2;
        }
    }

    public static void set(String str, String str2) {
        try {
            sysPropSet.invoke(null, str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
