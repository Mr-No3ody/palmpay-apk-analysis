package com.transsnet.mtn.sdk.util;

/* JADX INFO: loaded from: classes3.dex */
public class NDKTools {
    static {
        System.loadLibrary("tools");
    }

    public static native String getEncryptKey();
}
