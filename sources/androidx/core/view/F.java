package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    @Nullable
    public static q0 a(@NonNull View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        q0 q0VarH = q0.h(null, rootWindowInsets);
        o0 o0Var = q0VarH.f16277a;
        o0Var.s(q0VarH);
        o0Var.d(view.getRootView());
        return q0VarH;
    }

    public static void b(@NonNull View view, int i7, int i10) {
        view.setScrollIndicators(i7, i10);
    }
}
