package androidx.core.app;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
