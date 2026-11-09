package com.transsnet.palmpay.teller.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.PaymentItemListReq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p086fe.O0;
import p086fe.P0;
import p086fe.Q0;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/viewmodel/EditBeneficiaryViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditBeneficiaryViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34428g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34430j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f34431o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditBeneficiaryViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34426e = new l();
        this.f34427f = new l();
        this.f34428g = new l();
        this.f34429i = new l();
        this.f34430j = new l();
        this.f34431o = new l();
    }

    public final void d(String str, boolean z3) {
        if ("8".equals(str) || TransType.TRANS_TYPE_MERCHANT_PAYMENT.equals(str)) {
            O0 o10 = new O0(1, null);
            BillPaymentHomeParams billPaymentHomeParams = new BillPaymentHomeParams(str, z3);
            l lVar = this.f34427f;
            lVar.f27356m = billPaymentHomeParams;
            Unit unit = Unit.f38893a;
            f.v(this, o10, lVar, 0L);
            return;
        }
        P0 p3 = new P0(str, null);
        BillPaymentHomeParams billPaymentHomeParams2 = new BillPaymentHomeParams(str, z3);
        l lVar2 = this.f34426e;
        lVar2.f27356m = billPaymentHomeParams2;
        Unit unit2 = Unit.f38893a;
        f.v(this, p3, lVar2, 0L);
    }

    public final void e(String str, String str2, boolean z3) {
        PaymentItemListReq paymentItemListReq = new PaymentItemListReq();
        paymentItemListReq.categoryId = str;
        paymentItemListReq.billerId = str2;
        Q0 q10 = new Q0(str, paymentItemListReq, null);
        BillPaymentHomeParams billPaymentHomeParams = new BillPaymentHomeParams(str, z3);
        l lVar = this.f34428g;
        lVar.f27356m = billPaymentHomeParams;
        Unit unit = Unit.f38893a;
        f.v(this, q10, lVar, 0L);
    }
}
