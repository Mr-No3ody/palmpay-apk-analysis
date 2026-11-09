package com.transsnet.palmpay.viewmodule;

import C0.G;
import Pe.a0;
import Pe.c0;
import Pe.g0;
import Pe.j0;
import Pe.k0;
import Pe.l0;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.horcrux.svg.d0;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.CommonListReq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/viewmodule/PalmZoneViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmZoneViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmZoneViewModel.kt\ncom/transsnet/palmpay/viewmodule/PalmZoneViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n85#2,13:180\n1#3:193\n*S KotlinDebug\n*F\n+ 1 PalmZoneViewModel.kt\ncom/transsnet/palmpay/viewmodule/PalmZoneViewModel\n*L\n103#1:180,13\n*E\n"})
public final class PalmZoneViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f35388A = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f35389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f35390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f35391g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f35392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f35393j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f35394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f35395p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f35396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f35397w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalmZoneViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f35389e = new l();
        this.f35390f = new l();
        this.f35391g = new l();
        this.f35392i = new l();
        this.f35393j = new l();
        this.f35394o = new l();
        this.f35395p = new l();
        this.t = new l();
        this.f35396v = new l();
        this.f35397w = new l();
    }

    public final void d(Long l5, int i7) {
        if (d0.t()) {
            d.F("/account/add_extra");
            return;
        }
        a0 a0Var = new a0(l5, null);
        Integer numValueOf = Integer.valueOf(i7);
        l lVar = this.f35396v;
        lVar.f27356m = numValueOf;
        Unit unit = Unit.f38893a;
        f.v(this, a0Var, lVar, 0L);
    }

    public final void e(Long l5, String str) {
        if (d0.t()) {
            d.F("/account/add_extra");
        } else {
            f.s(this, new c0(str, l5, null), this.f35395p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void f() {
        if (BaseApplication.hasLogin()) {
            AbstractC0780y.m(V.h(this), null, null, new g0(this.f35392i, G.o("Pref_HomeRewardsPageInfo_", BaseApplication.getCountryLocale()), null), 3);
        }
    }

    public final void g() {
        if (BaseApplication.hasLogin()) {
            f.s(this, new j0(1, null), this.f35397w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void h() {
        if (BaseApplication.hasLogin()) {
            f.s(this, new k0(1, null), this.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void i(CommonListReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(this, new l0(req, null), this.f35393j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
