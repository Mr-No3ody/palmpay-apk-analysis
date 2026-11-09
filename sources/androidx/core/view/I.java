package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void f(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
