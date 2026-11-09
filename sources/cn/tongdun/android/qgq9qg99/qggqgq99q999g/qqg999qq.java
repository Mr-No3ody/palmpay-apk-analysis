package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.system.Os;
import androidx.annotation.Nullable;
import cn.tongdun.android.shell.common.HelperJNI;

/* JADX INFO: loaded from: classes.dex */
public final class qqg999qq {
    @Nullable
    public static String q999ggg99999qqggqqg9qg() {
        Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(66, (Object) null);
        int iIntValue = objQ999ggg99999qqggqqg9qg != null ? ((Integer) objQ999ggg99999qqggqqg9qg).intValue() : Os.getuid();
        if (iIntValue == -1) {
            return null;
        }
        return String.valueOf(iIntValue);
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context) {
        return (context == null || context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
