package androidx.appcompat.app;

import Pa.AbstractC0524v;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import com.luck.picture.lib.config.FileSizeUnit;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    @DoNotInline
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    @DoNotInline
    public static OnBackInvokedCallback b(Object obj, I i7) {
        Objects.requireNonNull(i7);
        androidx.activity.C c6 = new androidx.activity.C(i7, 1);
        AbstractC0524v.q(obj).registerOnBackInvokedCallback(FileSizeUnit.ACCURATE_MB, c6);
        return c6;
    }

    @DoNotInline
    public static void c(Object obj, Object obj2) {
        AbstractC0524v.q(obj).unregisterOnBackInvokedCallback(AbstractC0524v.m(obj2));
    }
}
