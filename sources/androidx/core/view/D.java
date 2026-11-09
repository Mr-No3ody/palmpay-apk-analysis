package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class D implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f16161a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OnApplyWindowInsetsListener f16163c;

    public D(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f16162b = view;
        this.f16163c = onApplyWindowInsetsListener;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q0 q0VarH = q0.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f16163c;
        if (i7 < 30) {
            E.a(windowInsets, this.f16162b);
            if (q0VarH.equals(this.f16161a)) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view, q0VarH).g();
            }
        }
        this.f16161a = q0VarH;
        q0 q0VarOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, q0VarH);
        if (i7 >= 30) {
            return q0VarOnApplyWindowInsets.g();
        }
        WeakHashMap weakHashMap = N.f16168a;
        C.c(view);
        return q0VarOnApplyWindowInsets.g();
    }
}
