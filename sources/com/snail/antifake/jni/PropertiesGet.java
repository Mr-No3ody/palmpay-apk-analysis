package com.snail.antifake.jni;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertiesGet {
    static {
        System.loadLibrary("property_get");
    }

    public static String a(String str) {
        return native_get(str);
    }

    private static native String native_get(String str);

    private static native String native_get(String str, String str2);
}
