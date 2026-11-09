package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.luck.picture.lib.config.FileSizeUnit;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    @Nullable
    @DoNotInline
    public static OnBackInvokedDispatcher a(@NonNull View view) {
        return view.findOnBackInvokedDispatcher();
    }

    @NonNull
    @DoNotInline
    public static OnBackInvokedCallback b(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new androidx.activity.C(runnable, 2);
    }

    @DoNotInline
    public static void c(@NonNull Object obj, @NonNull Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(FileSizeUnit.ACCURATE_MB, (OnBackInvokedCallback) obj2);
    }

    @DoNotInline
    public static void d(@NonNull Object obj, @NonNull Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
