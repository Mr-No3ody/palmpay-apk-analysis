package com.transsnet.palmpay.viewmodule;

import C0.G;
import Pe.I;
import Pe.J;
import Pe.M;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.QueryServiceStateByCategoryIdReq;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/viewmodule/LifeBillsHomeViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLifeBillsHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifeBillsHomeViewModel.kt\ncom/transsnet/palmpay/viewmodule/LifeBillsHomeViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,87:1\n85#2,13:88\n*S KotlinDebug\n*F\n+ 1 LifeBillsHomeViewModel.kt\ncom/transsnet/palmpay/viewmodule/LifeBillsHomeViewModel\n*L\n35#1:88,13\n*E\n"})
public final class LifeBillsHomeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f35375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f35376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f35377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeBillsHomeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f35375e = new l();
        this.f35376f = new l();
        this.f35377g = new l();
    }

    public final void d() {
        f.s(this, new I(1, null), this.f35375e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void e() {
        if (BaseApplication.hasLogin()) {
            QueryServiceStateByCategoryIdReq queryServiceStateByCategoryIdReq = new QueryServiceStateByCategoryIdReq();
            queryServiceStateByCategoryIdReq.categoryId = C1850q.e(TransType.TRANS_TYPE_BIND_REPAY_CARD, "0", "1", "2", "14", "8", AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE, "5", "16", TransType.TRANS_TYPE_REPAY_CASH_LOAN, TransType.TRANS_TYPE_AIRTIME_LOAN, "15", "17", "18", "19", "20", TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN, TransType.TRANS_TYPE_P2P_CASH_IN, TransType.TRANS_TYPE_P2P_CASH_OUT, TransType.TRANS_TYPE_MERCHANT_PAYMENT, TransType.TRANS_TYPE_COMMISSION, "27", TransType.TRANS_TYPE_BIND_BANK_CARD, "29", "30", "31");
            f.s(this, new J(queryServiceStateByCategoryIdReq, null), this.f35377g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void f() {
        AbstractC0780y.m(V.h(this), null, null, new M(this.f35376f, G.o("Pref_getBillPaymentMenu_", BaseApplication.getCountryLocale()), null), 3);
    }
}
