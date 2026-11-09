package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f16192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f16193b;

    public Y(View view, W w3) {
        q0 q0VarB;
        this.f16192a = w3;
        WeakHashMap weakHashMap = N.f16168a;
        q0 q0VarA = F.a(view);
        if (q0VarA != null) {
            int i7 = Build.VERSION.SDK_INT;
            q0VarB = (i7 >= 30 ? new h0(q0VarA) : i7 >= 29 ? new g0(q0VarA) : new f0(q0VarA)).b();
        } else {
            q0VarB = null;
        }
        this.f16193b = q0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o0 o0Var;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f16193b = q0.h(view, windowInsets);
            return Z.i(view, windowInsets);
        }
        q0 q0VarH = q0.h(view, windowInsets);
        if (this.f16193b == null) {
            WeakHashMap weakHashMap = N.f16168a;
            this.f16193b = F.a(view);
        }
        if (this.f16193b == null) {
            this.f16193b = q0VarH;
            return Z.i(view, windowInsets);
        }
        W wJ = Z.j(view);
        if (wJ != null && Objects.equals(wJ.mDispachedInsets, windowInsets)) {
            return Z.i(view, windowInsets);
        }
        q0 q0Var = this.f16193b;
        int i7 = 1;
        int i10 = 0;
        while (true) {
            o0Var = q0VarH.f16277a;
            if (i7 > 256) {
                break;
            }
            if (!o0Var.g(i7).equals(q0Var.f16277a.g(i7))) {
                i10 |= i7;
            }
            i7 <<= 1;
        }
        if (i10 == 0) {
            return Z.i(view, windowInsets);
        }
        q0 q0Var2 = this.f16193b;
        if ((i10 & 8) != 0) {
            interpolator = o0Var.g(8).f16061d > q0Var2.f16277a.g(8).f16061d ? Z.f16194e : Z.f16195f;
        } else {
            interpolator = Z.f16196g;
        }
        d0 d0Var = new d0(i10, interpolator, 160L);
        d0Var.f16210a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(d0Var.f16210a.a());
        androidx.core.graphics.e eVarG = o0Var.g(i10);
        androidx.core.graphics.e eVarG2 = q0Var2.f16277a.g(i10);
        int iMin = Math.min(eVarG.f16058a, eVarG2.f16058a);
        int i11 = eVarG.f16059b;
        int i12 = eVarG2.f16059b;
        int iMin2 = Math.min(i11, i12);
        int i13 = eVarG.f16060c;
        int i14 = eVarG2.f16060c;
        int iMin3 = Math.min(i13, i14);
        int i15 = eVarG.f16061d;
        int i16 = i10;
        int i17 = eVarG2.f16061d;
        V v3 = new V(androidx.core.graphics.e.b(iMin, iMin2, iMin3, Math.min(i15, i17)), androidx.core.graphics.e.b(Math.max(eVarG.f16058a, eVarG2.f16058a), Math.max(i11, i12), Math.max(i13, i14), Math.max(i15, i17)));
        Z.f(view, d0Var, windowInsets, false);
        duration.addUpdateListener(new X(d0Var, q0VarH, q0Var2, i16, view));
        duration.addListener(new Hb.w(3, d0Var, view));
        ViewTreeObserverOnPreDrawListenerC1067t.a(view, new androidx.appcompat.view.menu.e(view, d0Var, v3, duration, 1, false));
        this.f16193b = q0VarH;
        return Z.i(view, windowInsets);
    }
}
