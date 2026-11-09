package com.didiglobal.booster.instrument;

import N8.q0;

/* JADX INFO: loaded from: classes.dex */
public class ShadowThread extends Thread {
    static final String MARK = "\u200b";

    public ShadowThread(String str) {
        super(makeThreadName(str));
    }

    public static String makeThreadName(String str) {
        if (str == null) {
            return "";
        }
        return str.startsWith(MARK) ? str : MARK.concat(str);
    }

    public static Thread newThread(String str) {
        return new Thread(str);
    }

    public static Thread setThreadName(Thread thread, String str) {
        thread.setName(makeThreadName(thread.getName(), str));
        return thread;
    }

    public ShadowThread(Runnable runnable, String str) {
        super(runnable, makeThreadName(str));
    }

    public static String makeThreadName(String str, String str2) {
        if (str == null) {
            return str2;
        }
        return str.startsWith(MARK) ? str : q0.y(str2, "#", str);
    }

    public static Thread newThread(Runnable runnable, String str) {
        return new Thread(runnable, str);
    }

    public ShadowThread(ThreadGroup threadGroup, Runnable runnable, String str) {
        super(threadGroup, runnable, makeThreadName(str));
    }

    public static Thread newThread(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public ShadowThread(String str, String str2) {
        super(makeThreadName(str, str2));
    }

    public static Thread newThread(String str, String str2) {
        return new Thread(makeThreadName(str, str2));
    }

    public ShadowThread(ThreadGroup threadGroup, String str, String str2) {
        super(threadGroup, makeThreadName(str, str2));
    }

    public static Thread newThread(ThreadGroup threadGroup, String str, String str2) {
        return new Thread(threadGroup, makeThreadName(str, str2));
    }

    public ShadowThread(Runnable runnable, String str, String str2) {
        super(runnable, makeThreadName(str, str2));
    }

    public static Thread newThread(Runnable runnable, String str, String str2) {
        return new Thread(runnable, makeThreadName(str, str2));
    }

    public ShadowThread(ThreadGroup threadGroup, Runnable runnable, String str, String str2) {
        super(threadGroup, runnable, makeThreadName(str, str2));
    }

    public static Thread newThread(ThreadGroup threadGroup, Runnable runnable, String str, String str2) {
        return new Thread(threadGroup, runnable, makeThreadName(str, str2));
    }

    public ShadowThread(ThreadGroup threadGroup, Runnable runnable, String str, long j6, String str2) {
        super(threadGroup, runnable, makeThreadName(str, str2), j6);
    }

    public static Thread newThread(ThreadGroup threadGroup, Runnable runnable, String str, long j6, String str2) {
        return new Thread(threadGroup, runnable, makeThreadName(str, str2), j6);
    }
}
