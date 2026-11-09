package androidx.appcompat.app;

import android.os.PowerManager;
import androidx.annotation.DoNotInline;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    @DoNotInline
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    @DoNotInline
    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
