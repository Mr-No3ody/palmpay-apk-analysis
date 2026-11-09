package com.transsnet.palmpay.teller.viewmodel;

import C0.G;
import N8.q0;
import Wf.AbstractC0780y;
import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.PaymentItemListReq;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p086fe.H;
import p086fe.K;
import p086fe.N;
import p086fe.S;
import p086fe.Y;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeNGViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentHomeNGViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentHomeNGViewModel.kt\ncom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeNGViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n85#2,13:250\n134#2,13:263\n134#2,13:276\n134#2,13:289\n134#2,13:302\n134#2,13:315\n134#2,13:328\n1#3:341\n*S KotlinDebug\n*F\n+ 1 BillPaymentHomeNGViewModel.kt\ncom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeNGViewModel\n*L\n53#1:250,13\n76#1:263,13\n97#1:276,13\n131#1:289,13\n158#1:302,13\n178#1:315,13\n196#1:328,13\n*E\n"})
public final class BillPaymentHomeNGViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34399g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34401j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f34402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f34403p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f34404v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillPaymentHomeNGViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34397e = new l();
        this.f34398f = new l();
        this.f34399g = new l();
        this.f34400i = new l();
        this.f34401j = new l();
        this.f34402o = new l();
        this.f34403p = new l();
        this.t = new l();
        this.f34404v = new l();
    }

    public final void d(CreateTellerOrderReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        H h7 = new H(req, null);
        l lVar = this.f34401j;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        f.v(this, h7, lVar, 0L);
    }

    public final void e(String str, boolean z3, boolean z8) {
        String strB = Pa.H.b(q0.k("queryBillerListByCategoryId", str, BaseApplication.getCountryLocale()));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        BillPaymentHomeParams billPaymentHomeParams = new BillPaymentHomeParams(str, z3, z8);
        l lVar = this.f34397e;
        lVar.f27356m = billPaymentHomeParams;
        AbstractC0780y.m(V.h(this), null, null, new K(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void f(boolean z3, boolean z8, String str, String str2) {
        PaymentItemListReq paymentItemListReq = new PaymentItemListReq();
        paymentItemListReq.categoryId = str;
        paymentItemListReq.billerId = str2;
        if (TextUtils.isEmpty(str2) && !TransType.TRANS_TYPE_P2P_CASH_IN.equals(str) && !TransType.TRANS_TYPE_P2P_CASH_OUT.equals(str)) {
            ToastUtils.showLong(Pd.f.qt_select_biller_first);
            return;
        }
        String strB = Pa.H.b("queryPaymentItemListByCategoryAndBillerId", paymentItemListReq);
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        BillPaymentHomeParams billPaymentHomeParams = new BillPaymentHomeParams(str, z3, z8);
        l lVar = this.f34398f;
        lVar.f27356m = billPaymentHomeParams;
        AbstractC0780y.m(V.h(this), null, null, new N(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, paymentItemListReq), 3);
    }

    public final void g(String str) {
        String strB = Pa.H.b(G.o("queryLastBillerByCategoryId", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        AbstractC0780y.m(V.h(this), null, null, new S(this.f34400i, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void h(String str) {
        String strB = Pa.H.b(G.o("queryTransactionLimitAmountByCategoryId", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        AbstractC0780y.m(V.h(this), null, null, new p086fe.V(this.f34399g, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void i(ArrayList transType) {
        Intrinsics.checkNotNullParameter(transType, "transType");
        AbstractC0780y.m(V.h(this), null, null, new Y(this.t, G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
    }
}
