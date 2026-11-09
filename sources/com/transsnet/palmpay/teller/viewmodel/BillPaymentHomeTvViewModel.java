package com.transsnet.palmpay.teller.viewmodel;

import C0.G;
import N8.q0;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p086fe.C1663e0;
import p086fe.C1669h0;
import p086fe.C1700x0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeTvViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentHomeTvViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentHomeTvViewModel.kt\ncom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeTvViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n85#2,13:249\n134#2,13:263\n134#2,13:276\n134#2,13:289\n134#2,13:302\n134#2,13:315\n134#2,13:328\n85#2,13:341\n1#3:262\n*S KotlinDebug\n*F\n+ 1 BillPaymentHomeTvViewModel.kt\ncom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeTvViewModel\n*L\n60#1:249,13\n92#1:263,13\n118#1:276,13\n138#1:289,13\n157#1:302,13\n174#1:315,13\n203#1:328,13\n239#1:341,13\n*E\n"})
public final class BillPaymentHomeTvViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public t0 f34405A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f34406B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34409g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34411j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f34412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f34413p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f34414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f34415w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillPaymentHomeTvViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34407e = new l();
        this.f34408f = new l();
        this.f34409g = new l();
        this.f34410i = new l();
        this.f34411j = new l();
        this.f34412o = new l();
        this.f34413p = new l();
        this.t = new l();
        this.f34414v = new l();
        this.f34415w = new l();
        this.f34406B = new l();
    }

    public final void d(String str, boolean z3, boolean z8) {
        String strO = G.o("queryBillerListByCategoryId", str);
        BillPaymentHomeParams billPaymentHomeParams = new BillPaymentHomeParams(str, z3, z8);
        l lVar = this.f34407e;
        lVar.f27356m = billPaymentHomeParams;
        AbstractC0780y.m(V.h(this), null, null, new C1663e0(lVar, q0.y(strO, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void e() {
        AbstractC0780y.m(V.h(this), null, null, new C1669h0(this.t, G.o("Pref_queryTvAccountList_", BaseApplication.getCountryLocale()), null), 3);
    }

    public final void f(String str) {
        AbstractC0780y.m(V.h(this), null, null, new C1700x0(this.f34410i, q0.y(G.o("queryTransactionLimitAmountByCategoryId", str), "_", BaseApplication.getCountryLocale()), null, str), 3);
    }
}
