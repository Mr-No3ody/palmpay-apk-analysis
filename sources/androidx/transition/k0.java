package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f18070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1241b f18071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1241b f18072c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f18070a = new r0();
        } else {
            f18070a = new q0();
        }
        f18071b = new C1241b("translationAlpha", 8, Float.class);
        f18072c = new C1241b("clipBounds", 9, Rect.class);
    }

    public static void a(View view, int i7, int i10, int i11, int i12) {
        f18070a.j(view, i7, i10, i11, i12);
    }

    public static void b(View view, float f10) {
        f18070a.f(view, f10);
    }

    public static void c(View view, int i7) {
        f18070a.g(view, i7);
    }
}
