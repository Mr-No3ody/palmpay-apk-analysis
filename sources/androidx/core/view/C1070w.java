package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1070w extends C1052d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f16296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WindowInsetsController f16297d;

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.v] */
    @Override // androidx.core.view.C1052d
    public final void a() {
        WindowInsetsController windowInsetsController = this.f16297d;
        View view = this.f16296c;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.a();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r10 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.v
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i7) {
                atomicBoolean.set((i7 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r10);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r10);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // androidx.core.view.C1052d
    public final void b() {
        View view = this.f16296c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f16297d;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.b();
    }
}
