package cn.tongdun.android.location.qgq9qg99;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    public static boolean q999ggg99999qqggqqg9qg(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
