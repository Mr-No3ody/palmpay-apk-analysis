package androidx.activity;

import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements EdgeToEdgeImpl {
    public static void a(I i7, LifecycleOwner lifecycleOwner, Function1 onBackPressed) {
        Intrinsics.checkNotNullParameter(i7, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        p294tb.I onBackPressedCallback = new p294tb.I(onBackPressed, 3);
        if (lifecycleOwner != null) {
            i7.a(lifecycleOwner, onBackPressedCallback);
            return;
        }
        i7.getClass();
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        i7.b(onBackPressedCallback);
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
    }
}
