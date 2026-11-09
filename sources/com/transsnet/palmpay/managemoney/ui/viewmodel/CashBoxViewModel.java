package com.transsnet.palmpay.managemoney.ui.viewmodel;

import Qc.C0567h;
import Qc.C0572m;
import Qc.C0578t;
import Qc.C0584z;
import Qc.M;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.main.export.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashBoxViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f32733A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f32734B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f32735C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f32736H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final l f32737L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final l f32738M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final l f32739Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final l f32740X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final l f32741Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final l f32742Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f32743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f32744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f32745g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f32746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f32747j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final l f32748k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f32749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f32750p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final l f32751p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final l f32752q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final l f32753r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final l f32754s0;
    public final l t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final l f32755t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final l f32756u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f32757v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final l f32758v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f32759w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final l f32760w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final l f32761x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashBoxViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f32743e = new l();
        this.f32744f = new l();
        this.f32745g = new l();
        this.f32746i = new l();
        this.f32747j = new l();
        this.f32749o = new l();
        this.f32750p = new l();
        this.t = new l();
        this.f32757v = new l();
        this.f32759w = new l();
        new l();
        this.f32733A = new l();
        this.f32734B = new l();
        this.f32735C = new l();
        this.f32736H = new l();
        this.f32737L = new l();
        this.f32738M = new l();
        this.f32739Q = new l();
        this.f32740X = new l();
        this.f32741Y = new l();
        this.f32742Z = new l();
        this.f32748k0 = new l();
        this.f32751p0 = new l();
        this.f32752q0 = new l();
        this.f32753r0 = new l();
        this.f32754s0 = new l();
        this.f32755t0 = new l();
        this.f32756u0 = new l();
        this.f32758v0 = new l();
        this.f32760w0 = new l();
        this.f32761x0 = new l();
    }

    public static final int d(CashBoxViewModel cashBoxViewModel) {
        cashBoxViewModel.getClass();
        String str = c.f31994b.getInstance().f31995a;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -853258278) {
                if (iHashCode != 3480) {
                    if (iHashCode == 3208415) {
                        str.equals("home");
                        return 1;
                    }
                } else if (str.equals("me")) {
                    return 3;
                }
            } else if (str.equals("finance")) {
                return 2;
            }
        }
        return 1;
    }

    public final void e(long j6) {
        f.s(this, new C0567h(j6, null), this.f32757v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void f() {
        f.s(this, new C0572m(1, null), this.f32741Y, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void g() {
        f.s(this, new C0578t(1, null), this.f32740X, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void h() {
        if (Kc.f.f4999b.getInstance().f5000a != null) {
            return;
        }
        AbstractC0780y.m(V.h(this), null, null, new C0584z(this, null), 3);
    }

    public final void i(int i7, String source, String closeReason) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        f.s(this, new M(i7, source, closeReason, null), this.f32748k0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
