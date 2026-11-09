package androidx.appcompat.app;

import android.app.LocaleManager;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.appcompat.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0839q {
    @DoNotInline
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    @DoNotInline
    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
