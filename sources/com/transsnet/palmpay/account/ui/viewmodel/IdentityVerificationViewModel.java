package com.transsnet.palmpay.account.ui.viewmodel;

import C0.G;
import N8.q0;
import Pa.H;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p097g9.C1714l;
import p097g9.C1715m;
import p097g9.C1716n;
import p097g9.C1721t;
import p097g9.C1726y;
import p097g9.E;
import p097g9.K;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationViewModel.kt\ncom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,198:1\n134#2,13:199\n134#2,13:212\n134#2,13:225\n134#2,13:238\n134#2,13:251\n134#2,13:264\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationViewModel.kt\ncom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel\n*L\n92#1:199,13\n109#1:212,13\n127#1:225,13\n144#1:238,13\n161#1:251,13\n178#1:264,13\n*E\n"})
public final class IdentityVerificationViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f26417A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f26418B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f26419C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f26420H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f26421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f26422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f26423g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f26424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f26425j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f26426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f26427p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f26428v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f26429w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityVerificationViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26421e = new l();
        this.f26422f = new l();
        this.f26423g = new l();
        this.f26424i = new l();
        this.f26425j = new l();
        this.f26426o = new l();
        this.f26427p = new l();
        this.t = new l();
        this.f26428v = new l();
        this.f26429w = new l();
        this.f26417A = new l();
        this.f26418B = new l();
        this.f26419C = new l();
        this.f26420H = new l();
    }

    public final void d(AddUserExtraInfoReq addUserExtraInfoReq) {
        f.s(this, new C1714l(addUserExtraInfoReq, null), this.f26424i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void e(ApplyBalanceV2Req applyBalanceV2Req) {
        f.s(this, new C1715m(applyBalanceV2Req, null), this.f26425j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void f(CheckIdentifyReq checkIdentifyReq) {
        f.s(this, new C1716n(checkIdentifyReq, null), this.f26423g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void g(boolean z3) {
        String strB = H.b(G.o("queryAnnualIncome", BaseApplication.getCountryLocale()));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.f26417A;
        lVar.f27356m = boolValueOf;
        AbstractC0780y.m(V.h(this), null, null, new C1721t(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null), 3);
    }

    public final void h(boolean z3) {
        String strB = H.b(G.o("queryNationality", BaseApplication.getCountryLocale()));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.f26418B;
        lVar.f27356m = boolValueOf;
        AbstractC0780y.m(V.h(this), null, null, new C1726y(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null), 3);
    }

    public final void i(boolean z3) {
        String strB = H.b(G.o("queryOfficialPosition", BaseApplication.getCountryLocale()));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.f26419C;
        lVar.f27356m = boolValueOf;
        AbstractC0780y.m(V.h(this), null, null, new E(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null), 3);
    }

    public final void j(boolean z3) {
        String countryLocale = BaseApplication.getCountryLocale();
        String strB = H.b(G.o("getCountryRegionListV2", countryLocale));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.t;
        lVar.f27356m = boolValueOf;
        AbstractC0780y.m(V.h(this), null, null, new p097g9.H(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, countryLocale), 3);
    }

    public final void k(boolean z3) {
        String strB = H.b(G.o("querySourceOfFunds", BaseApplication.getCountryLocale()));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.f26429w;
        lVar.f27356m = boolValueOf;
        AbstractC0780y.m(V.h(this), null, null, new K(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null), 3);
    }
}
