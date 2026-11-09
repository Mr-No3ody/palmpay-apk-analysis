package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f16276b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f16277a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f16276b = n0.f16267q;
        } else {
            f16276b = o0.f16271b;
        }
    }

    public q0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f16277a = new n0(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f16277a = new m0(this, windowInsets);
        } else if (i7 >= 28) {
            this.f16277a = new l0(this, windowInsets);
        } else {
            this.f16277a = new k0(this, windowInsets);
        }
    }

    public static androidx.core.graphics.e e(androidx.core.graphics.e eVar, int i7, int i10, int i11, int i12) {
        int iMax = Math.max(0, eVar.f16058a - i7);
        int iMax2 = Math.max(0, eVar.f16059b - i10);
        int iMax3 = Math.max(0, eVar.f16060c - i11);
        int iMax4 = Math.max(0, eVar.f16061d - i12);
        return (iMax == i7 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? eVar : androidx.core.graphics.e.b(iMax, iMax2, iMax3, iMax4);
    }

    public static q0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        q0 q0Var = new q0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = N.f16168a;
            q0 q0VarA = F.a(view);
            o0 o0Var = q0Var.f16277a;
            o0Var.s(q0VarA);
            o0Var.d(view.getRootView());
        }
        return q0Var;
    }

    public final int a() {
        return this.f16277a.k().f16061d;
    }

    public final int b() {
        return this.f16277a.k().f16058a;
    }

    public final int c() {
        return this.f16277a.k().f16060c;
    }

    public final int d() {
        return this.f16277a.k().f16059b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return Objects.equals(this.f16277a, ((q0) obj).f16277a);
    }

    public final q0 f(int i7, int i10, int i11, int i12) {
        i0 g0Var;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            g0Var = new h0(this);
        } else {
            g0Var = i13 >= 29 ? new g0(this) : new f0(this);
        }
        g0Var.g(androidx.core.graphics.e.b(i7, i10, i11, i12));
        return g0Var.b();
    }

    public final WindowInsets g() {
        o0 o0Var = this.f16277a;
        if (o0Var instanceof j0) {
            return ((j0) o0Var).f16252c;
        }
        return null;
    }

    public final int hashCode() {
        o0 o0Var = this.f16277a;
        if (o0Var == null) {
            return 0;
        }
        return o0Var.hashCode();
    }

    public q0(q0 q0Var) {
        if (q0Var != null) {
            o0 o0Var = q0Var.f16277a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && (o0Var instanceof n0)) {
                this.f16277a = new n0(this, (n0) o0Var);
            } else if (i7 >= 29 && (o0Var instanceof m0)) {
                this.f16277a = new m0(this, (m0) o0Var);
            } else if (i7 >= 28 && (o0Var instanceof l0)) {
                this.f16277a = new l0(this, (l0) o0Var);
            } else if (o0Var instanceof k0) {
                this.f16277a = new k0(this, (k0) o0Var);
            } else if (o0Var instanceof j0) {
                this.f16277a = new j0(this, (j0) o0Var);
            } else {
                this.f16277a = new o0(this);
            }
            o0Var.e(this);
            return;
        }
        this.f16277a = new o0(this);
    }
}
