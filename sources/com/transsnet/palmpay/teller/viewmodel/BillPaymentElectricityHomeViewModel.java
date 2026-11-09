package com.transsnet.palmpay.teller.viewmodel;

import C0.G;
import N8.q0;
import Pa.H;
import Pd.f;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p086fe.C;
import p086fe.C1676l;
import p086fe.C1684p;
import p086fe.C1695v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentElectricityHomeViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentElectricityHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentElectricityHomeViewModel.kt\ncom/transsnet/palmpay/teller/viewmodel/BillPaymentElectricityHomeViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n85#2,13:262\n134#2,13:276\n134#2,13:289\n134#2,13:302\n134#2,13:315\n134#2,13:328\n134#2,13:341\n1#3:275\n*S KotlinDebug\n*F\n+ 1 BillPaymentElectricityHomeViewModel.kt\ncom/transsnet/palmpay/teller/viewmodel/BillPaymentElectricityHomeViewModel\n*L\n54#1:262,13\n87#1:276,13\n113#1:289,13\n139#1:302,13\n158#1:315,13\n216#1:328,13\n243#1:341,13\n*E\n"})
public final class BillPaymentElectricityHomeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f34387A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f34388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34390g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34392j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f34393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f34394p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f34395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f34396w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillPaymentElectricityHomeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34389f = new l();
        this.f34390g = new l();
        this.f34391i = new l();
        this.f34392j = new l();
        this.f34393o = new l();
        this.f34394p = new l();
        this.t = new l();
        this.f34395v = new l();
        this.f34396w = new l();
        this.f34387A = new l();
    }

    public final void d(String str, boolean z3, boolean z8) {
        String strB = H.b(G.o("queryBillerListByCategoryId", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        BillPaymentHomeParams billPaymentHomeParams = new BillPaymentHomeParams(str, z3, z8);
        l lVar = this.f34391i;
        lVar.f27356m = billPaymentHomeParams;
        AbstractC0780y.m(V.h(this), null, null, new C1676l(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void e(String str, boolean z3, boolean z8) {
        if (TextUtils.isEmpty(str)) {
            ToastUtils.showLong(f.qt_select_biller_first);
            return;
        }
        String strB = H.b(G.o("queryElectricityItemListByBillerId", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        BillPaymentHomeParams billPaymentHomeParams = new BillPaymentHomeParams("1", z3, z8);
        l lVar = this.f34387A;
        lVar.f27356m = billPaymentHomeParams;
        AbstractC0780y.m(V.h(this), null, null, new C1684p(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void f(String billerId) {
        Intrinsics.checkNotNullParameter(billerId, "billerId");
        if (BaseApplication.hasLogin()) {
            String strO = G.o("queryTvTipsListByBillerId", billerId);
            l lVar = this.f34396w;
            lVar.f27356m = billerId;
            AbstractC0780y.m(V.h(this), null, null, new C1695v(lVar, q0.y(strO, "_", BaseApplication.getCountryLocale()), null, billerId), 3);
        }
    }

    public final void g(String str) {
        String strB = H.b(G.o("queryTransactionLimitAmountByCategoryId", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        AbstractC0780y.m(V.h(this), null, null, new C(this.f34392j, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }
}
