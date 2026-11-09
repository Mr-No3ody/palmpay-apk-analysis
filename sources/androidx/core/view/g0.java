package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f16224c;

    public g0() {
        this.f16224c = Jg.n.e();
    }

    @Override // androidx.core.view.i0
    @NonNull
    public q0 b() {
        a();
        q0 q0VarH = q0.h(null, this.f16224c.build());
        q0VarH.f16277a.q(this.f16236b);
        return q0VarH;
    }

    @Override // androidx.core.view.i0
    public void d(@NonNull androidx.core.graphics.e eVar) {
        this.f16224c.setMandatorySystemGestureInsets(eVar.d());
    }

    @Override // androidx.core.view.i0
    public void e(@NonNull androidx.core.graphics.e eVar) {
        this.f16224c.setStableInsets(eVar.d());
    }

    @Override // androidx.core.view.i0
    public void f(@NonNull androidx.core.graphics.e eVar) {
        this.f16224c.setSystemGestureInsets(eVar.d());
    }

    @Override // androidx.core.view.i0
    public void g(@NonNull androidx.core.graphics.e eVar) {
        this.f16224c.setSystemWindowInsets(eVar.d());
    }

    @Override // androidx.core.view.i0
    public void h(@NonNull androidx.core.graphics.e eVar) {
        this.f16224c.setTappableElementInsets(eVar.d());
    }

    public g0(@NonNull q0 q0Var) {
        WindowInsets.Builder builderE;
        super(q0Var);
        WindowInsets windowInsetsG = q0Var.g();
        if (windowInsetsG != null) {
            builderE = Jg.n.f(windowInsetsG);
        } else {
            builderE = Jg.n.e();
        }
        this.f16224c = builderE;
    }
}
