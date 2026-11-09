package com.didiglobal.booster.instrument;

import android.os.HandlerThread;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public class ShadowHandlerThread extends HandlerThread {
    public ShadowHandlerThread(String str, String str2) {
        super(ShadowThread.makeThreadName(str, str2));
    }

    public static HandlerThread newHandlerThread(String str, String str2) {
        return new HandlerThread(ShadowThread.makeThreadName(str, str2));
    }

    public ShadowHandlerThread(String str, int i7, String str2) {
        super(ShadowThread.makeThreadName(str, str2), i7);
    }

    public static HandlerThread newHandlerThread(String str, int i7, String str2) {
        return new HandlerThread(ShadowThread.makeThreadName(str, str2), Math.min(Process.THREAD_PRIORITY_DEFAULT, i7));
    }
}
