package androidx.core.view;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f16235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.core.graphics.e[] f16236b;

    public i0() {
        this(new q0((q0) null));
    }

    public final void a() {
        androidx.core.graphics.e[] eVarArr = this.f16236b;
        if (eVarArr != null) {
            androidx.core.graphics.e eVarG = eVarArr[0];
            androidx.core.graphics.e eVarG2 = eVarArr[1];
            q0 q0Var = this.f16235a;
            if (eVarG2 == null) {
                eVarG2 = q0Var.f16277a.g(2);
            }
            if (eVarG == null) {
                eVarG = q0Var.f16277a.g(1);
            }
            g(androidx.core.graphics.e.a(eVarG, eVarG2));
            androidx.core.graphics.e eVar = this.f16236b[p140j8.f.m(16)];
            if (eVar != null) {
                f(eVar);
            }
            androidx.core.graphics.e eVar2 = this.f16236b[p140j8.f.m(32)];
            if (eVar2 != null) {
                d(eVar2);
            }
            androidx.core.graphics.e eVar3 = this.f16236b[p140j8.f.m(64)];
            if (eVar3 != null) {
                h(eVar3);
            }
        }
    }

    @NonNull
    public abstract q0 b();

    public void c(int i7, @NonNull androidx.core.graphics.e eVar) {
        if (this.f16236b == null) {
            this.f16236b = new androidx.core.graphics.e[9];
        }
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.f16236b[p140j8.f.m(i10)] = eVar;
            }
        }
    }

    public void d(@NonNull androidx.core.graphics.e eVar) {
    }

    public abstract void e(@NonNull androidx.core.graphics.e eVar);

    public void f(@NonNull androidx.core.graphics.e eVar) {
    }

    public abstract void g(@NonNull androidx.core.graphics.e eVar);

    public void h(@NonNull androidx.core.graphics.e eVar) {
    }

    public i0(@NonNull q0 q0Var) {
        this.f16235a = q0Var;
    }
}
