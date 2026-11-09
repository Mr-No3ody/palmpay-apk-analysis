package com.bytedance.shadowhook;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowHook {

    public interface ILibLoader {
        void loadLibrary(String str);
    }

    private static native String nativeGetArch();

    private static native boolean nativeGetDebuggable();

    private static native boolean nativeGetDisable();

    private static native int nativeGetInitErrno();

    private static native int nativeGetMode();

    private static native boolean nativeGetRecordable();

    private static native String nativeGetRecords(int i7);

    private static native String nativeGetVersion();

    private static native int nativeInit(int i7, boolean z3);

    private static native void nativeSetDebuggable(boolean z3);

    private static native void nativeSetDisable(boolean z3);

    private static native void nativeSetRecordable(boolean z3);

    private static native String nativeToErrmsg(int i7);
}
