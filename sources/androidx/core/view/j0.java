package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f16247h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f16248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f16249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f16250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f16251l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f16252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.core.graphics.e[] f16253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.core.graphics.e f16254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f16255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.core.graphics.e f16256g;

    public j0(@NonNull q0 q0Var, @NonNull WindowInsets windowInsets) {
        super(q0Var);
        this.f16254e = null;
        this.f16252c = windowInsets;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private androidx.core.graphics.e u(int i7, boolean z3) {
        androidx.core.graphics.e eVarA = androidx.core.graphics.e.f16057e;
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                eVarA = androidx.core.graphics.e.a(eVarA, v(i10, z3));
            }
        }
        return eVarA;
    }

    private androidx.core.graphics.e w() {
        q0 q0Var = this.f16255f;
        return q0Var != null ? q0Var.f16277a.i() : androidx.core.graphics.e.f16057e;
    }

    @Nullable
    private androidx.core.graphics.e x(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f16247h) {
            z();
        }
        Method method = f16248i;
        if (method != null && f16249j != null && f16250k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke != null) {
                    Rect rect = (Rect) f16250k.get(f16251l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.e.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void z() {
        try {
            f16248i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f16249j = cls;
            f16250k = cls.getDeclaredField("mVisibleInsets");
            f16251l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f16250k.setAccessible(true);
            f16251l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f16247h = true;
    }

    @Override // androidx.core.view.o0
    public void d(@NonNull View view) {
        androidx.core.graphics.e eVarX = x(view);
        if (eVarX == null) {
            eVarX = androidx.core.graphics.e.f16057e;
        }
        r(eVarX);
    }

    @Override // androidx.core.view.o0
    public void e(@NonNull q0 q0Var) {
        q0Var.f16277a.s(this.f16255f);
        q0Var.f16277a.r(this.f16256g);
    }

    @Override // androidx.core.view.o0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f16256g, ((j0) obj).f16256g);
        }
        return false;
    }

    @Override // androidx.core.view.o0
    @NonNull
    public androidx.core.graphics.e g(int i7) {
        return u(i7, false);
    }

    @Override // androidx.core.view.o0
    @NonNull
    public final androidx.core.graphics.e k() {
        if (this.f16254e == null) {
            WindowInsets windowInsets = this.f16252c;
            this.f16254e = androidx.core.graphics.e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f16254e;
    }

    @Override // androidx.core.view.o0
    @NonNull
    public q0 m(int i7, int i10, int i11, int i12) {
        i0 g0Var;
        q0 q0VarH = q0.h(null, this.f16252c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            g0Var = new h0(q0VarH);
        } else {
            g0Var = i13 >= 29 ? new g0(q0VarH) : new f0(q0VarH);
        }
        g0Var.g(q0.e(k(), i7, i10, i11, i12));
        g0Var.e(q0.e(i(), i7, i10, i11, i12));
        return g0Var.b();
    }

    @Override // androidx.core.view.o0
    public boolean o() {
        return this.f16252c.isRound();
    }

    @Override // androidx.core.view.o0
    @SuppressLint({"WrongConstant"})
    public boolean p(int i7) {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i7 & i10) != 0 && !y(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.view.o0
    public void q(androidx.core.graphics.e[] eVarArr) {
        this.f16253d = eVarArr;
    }

    @Override // androidx.core.view.o0
    public void r(@NonNull androidx.core.graphics.e eVar) {
        this.f16256g = eVar;
    }

    @Override // androidx.core.view.o0
    public void s(@Nullable q0 q0Var) {
        this.f16255f = q0Var;
    }

    @NonNull
    public androidx.core.graphics.e v(int i7, boolean z3) {
        androidx.core.graphics.e eVarI;
        int i10;
        if (i7 == 1) {
            return z3 ? androidx.core.graphics.e.b(0, Math.max(w().f16059b, k().f16059b), 0, 0) : androidx.core.graphics.e.b(0, k().f16059b, 0, 0);
        }
        if (i7 == 2) {
            if (z3) {
                androidx.core.graphics.e eVarW = w();
                androidx.core.graphics.e eVarI2 = i();
                return androidx.core.graphics.e.b(Math.max(eVarW.f16058a, eVarI2.f16058a), 0, Math.max(eVarW.f16060c, eVarI2.f16060c), Math.max(eVarW.f16061d, eVarI2.f16061d));
            }
            androidx.core.graphics.e eVarK = k();
            q0 q0Var = this.f16255f;
            eVarI = q0Var != null ? q0Var.f16277a.i() : null;
            int iMin = eVarK.f16061d;
            if (eVarI != null) {
                iMin = Math.min(iMin, eVarI.f16061d);
            }
            return androidx.core.graphics.e.b(eVarK.f16058a, 0, eVarK.f16060c, iMin);
        }
        androidx.core.graphics.e eVar = androidx.core.graphics.e.f16057e;
        if (i7 == 8) {
            androidx.core.graphics.e[] eVarArr = this.f16253d;
            eVarI = eVarArr != null ? eVarArr[p140j8.f.m(8)] : null;
            if (eVarI != null) {
                return eVarI;
            }
            androidx.core.graphics.e eVarK2 = k();
            androidx.core.graphics.e eVarW2 = w();
            int i11 = eVarK2.f16061d;
            if (i11 > eVarW2.f16061d) {
                return androidx.core.graphics.e.b(0, 0, 0, i11);
            }
            androidx.core.graphics.e eVar2 = this.f16256g;
            if (eVar2 != null && !eVar2.equals(eVar) && (i10 = this.f16256g.f16061d) > eVarW2.f16061d) {
                return androidx.core.graphics.e.b(0, 0, 0, i10);
            }
        } else {
            if (i7 == 16) {
                return j();
            }
            if (i7 == 32) {
                return h();
            }
            if (i7 == 64) {
                return l();
            }
            if (i7 == 128) {
                q0 q0Var2 = this.f16255f;
                C1058j c1058jF = q0Var2 != null ? q0Var2.f16277a.f() : f();
                if (c1058jF != null) {
                    int i12 = Build.VERSION.SDK_INT;
                    return androidx.core.graphics.e.b(i12 >= 28 ? X.a.i(c1058jF.f16246a) : 0, i12 >= 28 ? X.a.k(c1058jF.f16246a) : 0, i12 >= 28 ? X.a.j(c1058jF.f16246a) : 0, i12 >= 28 ? X.a.h(c1058jF.f16246a) : 0);
                }
            }
        }
        return eVar;
    }

    public boolean y(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !v(i7, false).equals(androidx.core.graphics.e.f16057e);
    }

    public j0(@NonNull q0 q0Var, @NonNull j0 j0Var) {
        this(q0Var, new WindowInsets(j0Var.f16252c));
    }
}
