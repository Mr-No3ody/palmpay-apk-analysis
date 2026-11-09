package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.cashier.CashierCouponItem;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierQueryUserCouponsRsp;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodResp;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.bean.req.PreviewCalcPayInfoReq;
import com.transsnet.palmpay.core.dialog.CashierCouponListDialog;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionLayout;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoreCashierPreviewActivity f27616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoreCashierPreviewActivity f27617c;

    public /* synthetic */ E(CoreCashierPreviewActivity coreCashierPreviewActivity, CoreCashierPreviewActivity coreCashierPreviewActivity2, int i7) {
        this.f27615a = i7;
        this.f27616b = coreCashierPreviewActivity;
        this.f27617c = coreCashierPreviewActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String respMsg;
        List<CashierCouponItem> list;
        ArrayList arrayList;
        String str = "";
        int i7 = 0;
        CoreCashierPreviewActivity context = this.f27617c;
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27616b;
        switch (this.f27615a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    coreCashierPreviewActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                    DefaultCalcOfPaymentMethodResp defaultCalcOfPaymentMethodResp = (DefaultCalcOfPaymentMethodResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (defaultCalcOfPaymentMethodResp.isSuccess()) {
                        DefaultCalcOfPaymentMethodResp.DataBean dataBean = defaultCalcOfPaymentMethodResp.data;
                        if (dataBean != null) {
                            context.m0(dataBean);
                        }
                    } else {
                        String respCode = defaultCalcOfPaymentMethodResp.getRespCode();
                        String respMsg2 = defaultCalcOfPaymentMethodResp.getRespMsg();
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (respCode != null) {
                            if (respCode.equals("33000039") || respCode.equals("33000040") || respCode.equals("33000041") || respCode.equals("33000093")) {
                                i0.i0(context, respCode, respMsg2 != null ? respMsg2 : "", true);
                            } else if (FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE.equals(respCode)) {
                                F6.d.c("CashierErrorInfo", respMsg2 != null ? respMsg2 : "");
                                context.finish();
                                Unit unit = Unit.f38893a;
                            } else {
                                ToastUtils.showLong(respMsg2 != null ? respMsg2 : "", new Object[0]);
                                context.finish();
                                Unit unit2 = Unit.f38893a;
                            }
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    context.finish();
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    coreCashierPreviewActivity.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
                        if (commonBeanResult != null && (respMsg = commonBeanResult.getRespMsg()) != null) {
                            str = respMsg;
                        }
                        ToastUtils.showLong(str, new Object[0]);
                    } else {
                        CashierQueryUserCouponsRsp cashierQueryUserCouponsRsp = (CashierQueryUserCouponsRsp) commonBeanResult.data;
                        if (cashierQueryUserCouponsRsp != null) {
                            context.X();
                            ModelPaymentPromotionLayout modelPaymentPromotionLayout = context.f27510U0;
                            if (modelPaymentPromotionLayout != null) {
                                CashierQueryUserCouponsRsp cashierQueryUserCouponsRsp2 = (CashierQueryUserCouponsRsp) commonBeanResult.data;
                                if (cashierQueryUserCouponsRsp2 != null && (list = cashierQueryUserCouponsRsp2.list) != null) {
                                    List<CashierCouponItem> list2 = list;
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        Iterator<T> it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            if (Intrinsics.c(((CashierCouponItem) it3.next()).available, Boolean.TRUE) && (i7 = i7 + 1) < 0) {
                                                C1850q.j();
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                modelPaymentPromotionLayout.setMAvailableCouponCount(i7);
                            }
                            CashierCouponListDialog cashierCouponListDialogM = context.M();
                            PreviewCalcPayInfoReq previewCalcPayInfoReqD = context.D(context.f27504O0);
                            Boolean bool = Boolean.FALSE;
                            previewCalcPayInfoReqD.useDiscount = bool;
                            previewCalcPayInfoReqD.useBonus = bool;
                            previewCalcPayInfoReqD.isRedeemPoint = bool;
                            previewCalcPayInfoReqD.isUseCoupon = Boolean.TRUE;
                            cashierCouponListDialogM.setPreviewPayReq(previewCalcPayInfoReqD);
                            CashierCouponItem cashierCouponItem = context.f27503N0;
                            if (cashierCouponItem != null) {
                                CashierCouponListDialog cashierCouponListDialogM2 = context.M();
                                Long l5 = cashierCouponItem.couponId;
                                cashierCouponListDialogM2.setDefaultCouponId(l5 != null ? l5.longValue() : 0L);
                            } else {
                                context.M().setDefaultCouponId(-1L);
                            }
                            List<CashierCouponItem> list3 = cashierQueryUserCouponsRsp.list;
                            if (list3 != null) {
                                context.M().setCoupons(list3);
                            }
                            context.M().setTransType(context.getF27455e());
                            context.M().show();
                        }
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof com.transsnet.palmpay.core.base.o) {
                    coreCashierPreviewActivity.showLoadingDialog(true, true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                    CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                    if (commonListResultV2.isSuccess()) {
                        Collection collection = commonListResultV2.data;
                        Collection collection2 = collection;
                        if (collection2 == null || collection2.isEmpty()) {
                            arrayList = new ArrayList();
                        } else {
                            Collection collection3 = collection;
                            Iterator it5 = collection3.iterator();
                            while (it5.hasNext()) {
                                ((CashierPaymentMethodBean) it5.next()).enable = true;
                            }
                            arrayList = CollectionsKt.Z(collection3);
                        }
                        if (arrayList.isEmpty()) {
                            String respMsg3 = commonListResultV2.getRespMsg();
                            if (respMsg3 == null) {
                                respMsg3 = context.getString(p025ba.k.core_fail_to_pay_order);
                                Intrinsics.checkNotNullExpressionValue(respMsg3, "getString(...)");
                            }
                            CoreCashierPreviewActivity.B(context, respMsg3);
                            context.I();
                            CashierPayMethodRetryDialog cashierPayMethodRetryDialogO = context.O();
                            if (cashierPayMethodRetryDialogO != null) {
                                cashierPayMethodRetryDialogO.dismiss();
                            }
                        } else {
                            int i10 = CoreCashierPreviewActivity.f27486Y0;
                            CashierPayMethodRetryDialog cashierPayMethodRetryDialogO2 = context.O();
                            String paymentRetryToken = cashierPayMethodRetryDialogO2 != null ? cashierPayMethodRetryDialogO2.getPaymentRetryToken() : null;
                            CashierPayMethodRetryDialog cashierPayMethodRetryDialogO3 = context.O();
                            if (cashierPayMethodRetryDialogO3 != null) {
                                cashierPayMethodRetryDialogO3.setPaymentRetryToken(paymentRetryToken);
                                long j6 = context.f27461p;
                                if (j6 < 0) {
                                    cashierPayMethodRetryDialogO3.setPayAmount(context.f27458i);
                                } else {
                                    cashierPayMethodRetryDialogO3.setPayAmount(j6);
                                }
                                CashierPayMethodRetryDialog.setPayMethods$default(cashierPayMethodRetryDialogO3, arrayList, false, 2, null);
                            }
                            CashierPayMethodRetryDialog cashierPayMethodRetryDialogO4 = context.O();
                            if (cashierPayMethodRetryDialogO4 != null) {
                                cashierPayMethodRetryDialogO4.show();
                            }
                        }
                    } else {
                        CoreCashierPreviewActivity.B(context, commonListResultV2.getRespMsg());
                        context.I();
                        CashierPayMethodRetryDialog cashierPayMethodRetryDialogO5 = context.O();
                        if (cashierPayMethodRetryDialogO5 != null) {
                            cashierPayMethodRetryDialogO5.dismiss();
                        }
                    }
                } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    coreCashierPreviewActivity.showLoadingDialog(false, true);
                    CoreCashierPreviewActivity.B(context, ((com.transsnet.palmpay.core.base.n) it4).f27358a);
                    context.I();
                    CashierPayMethodRetryDialog cashierPayMethodRetryDialogO6 = context.O();
                    if (cashierPayMethodRetryDialogO6 != null) {
                        cashierPayMethodRetryDialogO6.dismiss();
                    }
                }
                return Unit.f38893a;
        }
    }
}
