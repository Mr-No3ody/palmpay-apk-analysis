package androidx.camera.core.impl;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.arch.core.util.Function;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 implements Function {
    public static C1005t0 a(Context context, Bundle bundle) {
        boolean z3 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrB = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrB2 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        p140j8.f.G("QuirkSettingsLoader");
        p140j8.f.G("QuirkSettingsLoader");
        Arrays.toString(strArrB);
        p140j8.f.G("QuirkSettingsLoader");
        Arrays.toString(strArrB2);
        p140j8.f.G("QuirkSettingsLoader");
        return new C1005t0(z3, new HashSet(c(strArrB)), new HashSet(c(strArrB2)));
    }

    public static String[] b(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i7 = bundle.getInt(str, -1);
        if (i7 == -1) {
            p140j8.f.G("QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i7);
        } catch (Resources.NotFoundException unused) {
            p140j8.f.G("QuirkSettingsLoader");
            return new String[0];
        }
    }

    public static HashSet c(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!Quirk.class.isAssignableFrom(cls)) {
                    p140j8.f.G("QuirkSettingsLoader");
                    cls = null;
                }
            } catch (ClassNotFoundException unused) {
                p140j8.f.G("QuirkSettingsLoader");
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }
}
