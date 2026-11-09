package androidx.work.impl.utils;

import V0.C;
import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    static {
        C.d("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z3) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z8 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z8 = true;
            }
            if (z3 == z8) {
                C.c().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z3 ? 1 : 2, 1);
                C.c().getClass();
            }
        } catch (Exception unused) {
            C.c().getClass();
        }
    }
}
