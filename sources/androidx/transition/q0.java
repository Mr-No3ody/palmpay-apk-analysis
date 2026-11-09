package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends K {
    public static boolean t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f18098u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f18099v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f18100w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f18101x = true;

    @Override // androidx.transition.K
    public void g(View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i7);
        } else if (f18101x) {
            try {
                p0.a(view, i7);
            } catch (NoSuchMethodError unused) {
                f18101x = false;
            }
        }
    }

    public void i(View view, Matrix matrix) {
        if (t) {
            try {
                n0.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                t = false;
            }
        }
    }

    public void j(View view, int i7, int i10, int i11, int i12) {
        if (f18100w) {
            try {
                o0.a(view, i7, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f18100w = false;
            }
        }
    }

    public void k(View view, Matrix matrix) {
        if (f18098u) {
            try {
                n0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f18098u = false;
            }
        }
    }

    public void l(View view, Matrix matrix) {
        if (f18099v) {
            try {
                n0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f18099v = false;
            }
        }
    }
}
