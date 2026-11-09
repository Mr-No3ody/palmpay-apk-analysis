package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    @DoNotInline
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    @DoNotInline
    public static androidx.core.os.h b(Configuration configuration) {
        return androidx.core.os.h.a(configuration.getLocales().toLanguageTags());
    }

    @DoNotInline
    public static void c(androidx.core.os.h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(hVar.e()));
    }

    @DoNotInline
    public static void d(Configuration configuration, androidx.core.os.h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(hVar.e()));
    }
}
