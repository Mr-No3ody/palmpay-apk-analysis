package com.transsnet.palmpay.managemoney.ui.fragment;

import Wd.C0751z;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.rsp.GetCashBoxNewcomerResp;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.CreateOrderResp;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderPreFragment f32614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OrderPreFragment f32615c;

    public /* synthetic */ g0(OrderPreFragment orderPreFragment, OrderPreFragment orderPreFragment2, int i7) {
        this.f32613a = i7;
        this.f32614b = orderPreFragment;
        this.f32615c = orderPreFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z3 = false;
        OrderPreFragment orderPreFragment = this.f32615c;
        OrderPreFragment orderPreFragment2 = this.f32614b;
        switch (this.f32613a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    orderPreFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    orderPreFragment2.showLoadingDialog(false, true);
                    GetCashBoxNewcomerResp getCashBoxNewcomerResp = (GetCashBoxNewcomerResp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a).data;
                    if (getCashBoxNewcomerResp != null && getCashBoxNewcomerResp.cashBoxMemberStatus) {
                        z3 = true;
                    }
                    orderPreFragment.f32531L = z3;
                    ProductBean productBeanU = orderPreFragment.u();
                    if (productBeanU != null) {
                        orderPreFragment.t(productBeanU);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    orderPreFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    orderPreFragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                    ToastUtils.showLong(nVar.f27358a, new Object[0]);
                    ToastUtils.showShort(nVar.f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    orderPreFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    orderPreFragment2.showLoadingDialog(false, true);
                    CreateOrderResp createOrderResp = (CreateOrderResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (createOrderResp.isSuccess()) {
                        ProductBean data = createOrderResp.getData();
                        if (data != null) {
                            OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                            androidx.fragment.app.E e10 = orderPreFragment.f27319c;
                            Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                            C0751z c0751z = new C0751z((BaseActivity) e10, 3);
                            c0751z.f4971b = data.getOrderId();
                            c0751z.c(Long.valueOf(data.getPrincipal()));
                            c0751z.f4972c = TransType.TRANS_TYPE_FIXED_SAVING;
                            c0751z.f4974e = TransType.TRANS_TYPE_REFUND_2;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new CoreCashierPaymentExtra(orderPreFragment.getString(Jc.f.mm_annual_interest_rates), N8.q0.j(Pa.r0.z0(String.valueOf(Pa.r0.w1(String.valueOf(data.getAnnualizedIncomeRatio()), "100"))), "%p.a.")));
                            arrayList.add(new CoreCashierPaymentExtra(orderPreFragment.getString(Jc.f.mm_duration_days), data.getDurationDay() + " Days"));
                            arrayList.add(new CoreCashierPaymentExtra(orderPreFragment.getString(Jc.f.mm_maturity_date), orderPreFragment.f32530H ? N8.q0.j(TimeUtils.millis2String(data.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH)), "\nAuto-Renewal Enabled") : TimeUtils.millis2String(data.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH))));
                            c0751z.b(arrayList);
                            c0751z.d();
                        }
                    } else if (Intrinsics.c(createOrderResp.getRespCode(), "fb_open_error_code")) {
                        String respMsg = createOrderResp.getRespMsg();
                        if (respMsg != null) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, orderPreFragment.getResources().getString(Jc.f.mm_fb_open_code_title), respMsg, orderPreFragment.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                            androidx.fragment.app.Z childFragmentManager = orderPreFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager, "showErrorDialog");
                        }
                    } else {
                        Pa.i0.i0(orderPreFragment.getContext(), createOrderResp.getRespCode(), createOrderResp.getRespMsg(), false);
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    orderPreFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    orderPreFragment2.showLoadingDialog(false, true);
                    String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                    if (!TextUtils.isEmpty(str)) {
                        p220oa.h.y(orderPreFragment, str);
                    }
                }
                return Unit.f38893a;
        }
    }
}
