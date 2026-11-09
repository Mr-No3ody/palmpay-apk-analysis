package androidx.core.view;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f16271b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f16272a;

    static {
        i0 g0Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            g0Var = new h0();
        } else {
            g0Var = i7 >= 29 ? new g0() : new f0();
        }
        f16271b = g0Var.b().f16277a.a().f16277a.b().f16277a.c();
    }

    public o0(@NonNull q0 q0Var) {
        this.f16272a = q0Var;
    }

    @NonNull
    public q0 a() {
        return this.f16272a;
    }

    @NonNull
    public q0 b() {
        return this.f16272a;
    }

    @NonNull
    public q0 c() {
        return this.f16272a;
    }

    public void d(@NonNull View view) {
    }

    public void e(@NonNull q0 q0Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return o() == o0Var.o() && n() == o0Var.n() && Objects.equals(k(), o0Var.k()) && Objects.equals(i(), o0Var.i()) && Objects.equals(f(), o0Var.f());
    }

    @Nullable
    public C1058j f() {
        return null;
    }

    @NonNull
    public androidx.core.graphics.e g(int i7) {
        return androidx.core.graphics.e.f16057e;
    }

    @NonNull
    public androidx.core.graphics.e h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
    }

    @NonNull
    public androidx.core.graphics.e i() {
        return androidx.core.graphics.e.f16057e;
    }

    @NonNull
    public androidx.core.graphics.e j() {
        return k();
    }

    @NonNull
    public androidx.core.graphics.e k() {
        return androidx.core.graphics.e.f16057e;
    }

    @NonNull
    public androidx.core.graphics.e l() {
        return k();
    }

    @NonNull
    public q0 m(int i7, int i10, int i11, int i12) {
        return f16271b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i7) {
        return true;
    }

    public void q(androidx.core.graphics.e[] eVarArr) {
    }

    public void r(@NonNull androidx.core.graphics.e eVar) {
    }

    public void s(@Nullable q0 q0Var) {
    }

    public void t(androidx.core.graphics.e eVar) {
    }
}
