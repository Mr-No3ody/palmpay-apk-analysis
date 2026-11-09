package com.transsnet.palmpay.betting.viewmodel;

import C0.G;
import N8.q0;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.camera.video.u;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.teller.bean.CreateBettingOrderReq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p367ya.a;
import x9.C2115a;
import x9.C2117c;
import x9.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/betting/viewmodel/BettingDepositViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBettingDepositViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BettingDepositViewModel.kt\ncom/transsnet/palmpay/betting/viewmodel/BettingDepositViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,235:1\n134#2,13:236\n134#2,13:249\n85#2,13:262\n*S KotlinDebug\n*F\n+ 1 BettingDepositViewModel.kt\ncom/transsnet/palmpay/betting/viewmodel/BettingDepositViewModel\n*L\n90#1:236,13\n132#1:249,13\n210#1:262,13\n*E\n"})
public final class BettingDepositViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f26769A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f26770B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f26771C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f26773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f26774g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f26775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f26776j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f26777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f26778p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f26779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f26780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BettingDepositViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26772e = "8";
        this.f26773f = new l();
        this.f26774g = new l();
        this.f26775i = new l();
        this.f26776j = new l();
        this.f26777o = new l();
        this.f26778p = new l();
        new l();
        this.t = new l();
        this.f26779v = new l();
        this.f26780w = new l();
        this.f26769A = new l();
        this.f26770B = new l();
        this.f26771C = new l();
        new l();
    }

    public final void d(CreateBettingOrderReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        C2115a c2115a = new C2115a(req, null);
        l lVar = this.f26779v;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        f.v(this, c2115a, lVar, 0L);
    }

    public final void e(Function0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        C2117c c2117c = new C2117c(1, null);
        l lVar = this.f26773f;
        lVar.f27356m = function;
        Unit unit = Unit.f38893a;
        f.v(this, c2117c, lVar, 0L);
    }

    public final void f(Function0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        l lVar = this.f26775i;
        lVar.f27356m = function;
        AbstractC0780y.m(V.h(this), null, null, new i(lVar, q0.y(a.d().i(), "_queryBettingHomeInfoV3_", BaseApplication.getCountryLocale()), null), 3);
    }

    public final void g(String str, String str2, Function0 function0) {
        if (BaseApplication.hasLogin()) {
            String strP = G.p("queryBettingOptionsAmountV3", str, "_", str2);
            l lVar = this.f26778p;
            if (function0 != null) {
                lVar.f27356m = function0;
            }
            AbstractC0780y.m(V.h(this), null, null, new x9.l(lVar, u.n(a.d().i(), "_", strP, "_", BaseApplication.getCountryLocale()), null, str, str2), 3);
        }
    }
}
