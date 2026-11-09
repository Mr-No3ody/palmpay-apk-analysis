package androidx.biometric;

import android.os.Looper;
import androidx.lifecycle.a0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class A extends a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13034A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13035B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13036C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13037H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public androidx.lifecycle.F f13038L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.F f13039M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public androidx.lifecycle.F f13040Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public androidx.lifecycle.F f13041X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public androidx.lifecycle.F f13042Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f13044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p059e1.a f13045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v f13046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f13047g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public top.zibin.luban.io.a f13048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p279s5.d f13049j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public androidx.lifecycle.F f13050k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z f13051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f13052p;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public androidx.lifecycle.F f13054q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public androidx.lifecycle.F f13055r0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13057w;
    public int t = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f13043Z = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f13053p0 = 0;

    public static void i(androidx.lifecycle.F f10, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            f10.k(obj);
        } else {
            f10.i(obj);
        }
    }

    public final int d() {
        if (this.f13046f != null) {
            return this.f13047g != null ? 15 : 255;
        }
        return 0;
    }

    public final void e(C0902f c0902f) {
        if (this.f13039M == null) {
            this.f13039M = new androidx.lifecycle.F();
        }
        i(this.f13039M, c0902f);
    }

    public final void f(CharSequence charSequence) {
        if (this.f13055r0 == null) {
            this.f13055r0 = new androidx.lifecycle.F();
        }
        i(this.f13055r0, charSequence);
    }

    public final void g(int i7) {
        if (this.f13054q0 == null) {
            this.f13054q0 = new androidx.lifecycle.F();
        }
        i(this.f13054q0, Integer.valueOf(i7));
    }

    public final void h(boolean z3) {
        if (this.f13042Y == null) {
            this.f13042Y = new androidx.lifecycle.F();
        }
        i(this.f13042Y, Boolean.valueOf(z3));
    }
}
