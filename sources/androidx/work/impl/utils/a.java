package androidx.work.impl.utils;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
