package com.facebook.jni;

import D3.a;
import com.facebook.jni.annotations.DoNotStrip;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class ThreadScopeSupport {
    static {
        a.r("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j6) {
        runStdFunctionImpl(j6);
    }

    private static native void runStdFunctionImpl(long j6);
}
