package com.didiglobal.booster.instrument;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Intrinsics {
    private Intrinsics() {
    }

    public static <T extends Throwable> T sanitizeStackTrace(T t, Class<?> cls) {
        return (T) sanitizeStackTrace(t, cls.getName());
    }

    public static <T extends Throwable> T sanitizeStackTrace(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        ArrayList arrayList = new ArrayList(Arrays.asList(stackTrace));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(((StackTraceElement) it.next()).getClassName())) {
                it.remove();
            }
        }
        if (stackTrace.length != arrayList.size()) {
            t.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        }
        return t;
    }
}
