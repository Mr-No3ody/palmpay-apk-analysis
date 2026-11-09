package com.didiglobal.booster.instrument;

import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class ShadowTimer extends Timer {
    public ShadowTimer(String str) {
        super(str);
    }

    public static Timer newTimer(String str) {
        return new Timer(str);
    }

    public ShadowTimer(boolean z3, String str) {
        super(str, z3);
    }

    public static Timer newTimer(String str, String str2) {
        return new Timer(ShadowThread.makeThreadName(str, str2));
    }

    public ShadowTimer(String str, String str2) {
        super(ShadowThread.makeThreadName(str, str2));
    }

    public static Timer newTimer(boolean z3, String str) {
        return new Timer(str, z3);
    }

    public ShadowTimer(String str, boolean z3, String str2) {
        super(ShadowThread.makeThreadName(str, str2), z3);
    }

    public static Timer newTimer(String str, boolean z3, String str2) {
        return new Timer(ShadowThread.makeThreadName(str, str2), z3);
    }
}
