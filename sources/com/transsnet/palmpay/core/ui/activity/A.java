package com.transsnet.palmpay.core.ui.activity;

import Pa.C0525w;
import Pa.r0;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.core.bean.cashier.CalcOfCombinationInfoBean;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.FlexiPayGuideBean;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.core.bean.rsp.ManualCalcOfPaymentMethodBean;
import com.transsnet.palmpay.core.bean.rsp.USSDFundResp;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p052da.C1650w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoreCashierPreviewActivity f27410b;

    public /* synthetic */ A(CoreCashierPreviewActivity coreCashierPreviewActivity, int i7) {
        this.f27409a = i7;
        this.f27410b = coreCashierPreviewActivity;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function2 function2;
        CalcOfPaymentMethodResultBean data;
        CashierPaymentMethodBean cashierPaymentMethodBean;
        CalcOfCombinationInfoBean calcOfCombinationInfoBean;
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog;
        SelectBankDialogV2 selectBankDialogV2Q;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27410b;
        switch (this.f27409a) {
            case 0:
                Ma.p pVar = (Ma.p) obj;
                CommonBeanResult rsp = (CommonBeanResult) obj2;
                int i7 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                if (rsp.isSuccess()) {
                    p355xf.t tVar = coreCashierPreviewActivity.f27512W0;
                    CashierSelectPayMethodDialog cashierSelectPayMethodDialog2 = (CashierSelectPayMethodDialog) tVar.getValue();
                    if (cashierSelectPayMethodDialog2 != null && cashierSelectPayMethodDialog2.isShowing() && (cashierSelectPayMethodDialog = (CashierSelectPayMethodDialog) tVar.getValue()) != null) {
                        cashierSelectPayMethodDialog.dismiss();
                    }
                    CashierPaymentMethodBean cashierPaymentMethodBean2 = pVar != null ? pVar.f5911a : null;
                    ManualCalcOfPaymentMethodBean manualCalcOfPaymentMethodBean = (ManualCalcOfPaymentMethodBean) rsp.data;
                    if (manualCalcOfPaymentMethodBean == null || (data = manualCalcOfPaymentMethodBean.getCalculationDto()) == null) {
                        coreCashierPreviewActivity.V();
                    } else {
                        coreCashierPreviewActivity.W();
                        Intrinsics.checkNotNullParameter(data, "data");
                        coreCashierPreviewActivity.f27502M0 = data;
                        coreCashierPreviewActivity.f27462v = data.cacheKey;
                        Long l5 = data.payAmount;
                        coreCashierPreviewActivity.f27461p = l5 != null ? l5.longValue() : 0L;
                        if (cashierPaymentMethodBean2 instanceof FlexiPayGuideBean) {
                            coreCashierPreviewActivity.f27504O0 = cashierPaymentMethodBean2;
                            coreCashierPreviewActivity.N().f35823e = cashierPaymentMethodBean2;
                            coreCashierPreviewActivity.N().notifyDataSetChanged();
                        } else {
                            List<CashierPaymentMethodBean> paymentMethodList = manualCalcOfPaymentMethodBean.getPaymentMethodList();
                            if (paymentMethodList != null && !paymentMethodList.isEmpty()) {
                                coreCashierPreviewActivity.o0(manualCalcOfPaymentMethodBean.getPaymentMethodList(), manualCalcOfPaymentMethodBean.getCalculationDto());
                            } else if (cashierPaymentMethodBean2 != null) {
                                CalcOfPaymentMethodResultBean calculationDto = manualCalcOfPaymentMethodBean.getCalculationDto();
                                CashierCombinationPaymentMethodBean mainPaymentMethod = (calculationDto == null || (calcOfCombinationInfoBean = calculationDto.combinationInfo) == null) ? null : calcOfCombinationInfoBean.getMainPaymentMethod();
                                coreCashierPreviewActivity.f27497J0 = mainPaymentMethod;
                                if (!(cashierPaymentMethodBean2 instanceof CashierCombinationPaymentMethodBean)) {
                                    coreCashierPreviewActivity.f27504O0 = cashierPaymentMethodBean2;
                                    coreCashierPreviewActivity.l0();
                                } else if (mainPaymentMethod != null) {
                                    coreCashierPreviewActivity.f27504O0 = mainPaymentMethod;
                                    coreCashierPreviewActivity.N().f35823e = coreCashierPreviewActivity.f27497J0;
                                    C1650w c1650wN = coreCashierPreviewActivity.N();
                                    CashierCombinationPaymentMethodBean item = coreCashierPreviewActivity.f27497J0;
                                    Intrinsics.e(item);
                                    c1650wN.getClass();
                                    Intrinsics.checkNotNullParameter(item, "item");
                                    c1650wN.f35830v = true;
                                    c1650wN.t = item;
                                    c1650wN.f35827j = false;
                                    c1650wN.e();
                                    c1650wN.f();
                                } else {
                                    ArrayList arrayList = coreCashierPreviewActivity.f27500L0;
                                    if (arrayList != null) {
                                        for (Object obj7 : arrayList) {
                                            if (((CashierPaymentMethodBean) obj7).defaultMethodFlag) {
                                                obj3 = obj7;
                                                cashierPaymentMethodBean = (CashierPaymentMethodBean) obj3;
                                                if (cashierPaymentMethodBean != null) {
                                                    coreCashierPreviewActivity.f27504O0 = cashierPaymentMethodBean;
                                                }
                                            }
                                        }
                                        cashierPaymentMethodBean = (CashierPaymentMethodBean) obj3;
                                        if (cashierPaymentMethodBean != null) {
                                            coreCashierPreviewActivity.f27504O0 = cashierPaymentMethodBean;
                                        }
                                    }
                                    coreCashierPreviewActivity.l0();
                                }
                            }
                        }
                        CashierPaymentMethodBean cashierPaymentMethodBean3 = coreCashierPreviewActivity.f27504O0;
                        Long l6 = data.paymentMethodsDiscount;
                        if (cashierPaymentMethodBean3 != null) {
                            cashierPaymentMethodBean3.paymentMethodsDiscount = l6 != null ? l6.longValue() : 0L;
                        }
                        coreCashierPreviewActivity.p0(data, false);
                    }
                }
                if (pVar != null && (function2 = pVar.f5913c) != null) {
                    function2.invoke(pVar.f5911a, rsp);
                }
                break;
            case 1:
                USSDFundResultReq uSSDFundResultReq = (USSDFundResultReq) obj;
                USSDFundResp resp = (USSDFundResp) obj2;
                int i10 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(resp, "resp");
                if (resp.isSuccess()) {
                    coreCashierPreviewActivity.getClass();
                    Intrinsics.checkNotNullParameter(resp, "resp");
                    ARouter.getInstance().build("/core/ussd_pay_result").withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(resp.data)).withString("extra_type", uSSDFundResultReq != null ? uSSDFundResultReq.transType : null).withString("orderId", uSSDFundResultReq != null ? uSSDFundResultReq.orderNo : null).navigation();
                } else {
                    p220oa.h.x(coreCashierPreviewActivity, resp.getRespMsg());
                }
                break;
            case 2:
                PayByOrderResp rsp2 = (PayByOrderResp) obj2;
                int i11 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(rsp2, "rsp");
                coreCashierPreviewActivity.L(rsp2, (PayByOrderReq) obj);
                break;
            case 3:
                PayByOrderResp rsp3 = (PayByOrderResp) obj2;
                int i12 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(rsp3, "rsp");
                coreCashierPreviewActivity.L(rsp3, null);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                QueryBankListRsp response = (QueryBankListRsp) obj2;
                int i13 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccess()) {
                    List<BankInfo> list = response.data;
                    if (list != null) {
                        SelectBankDialogV2 selectBankDialogV2Q2 = coreCashierPreviewActivity.q();
                        if (selectBankDialogV2Q2 != null) {
                            selectBankDialogV2Q2.setBankCardInfos(list);
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE) && (selectBankDialogV2Q = coreCashierPreviewActivity.q()) != null) {
                            selectBankDialogV2Q.show();
                        }
                    }
                } else {
                    ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                }
                break;
            case 5:
                CashierPaymentMethodBean selectPayment = (CashierPaymentMethodBean) obj;
                CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                int i14 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(selectPayment, "selectPayment");
                Intrinsics.checkNotNullParameter(rsp4, "rsp");
                if (rsp4.isSuccess()) {
                    coreCashierPreviewActivity.g0(false);
                    coreCashierPreviewActivity.H();
                    if (!(selectPayment instanceof CashierCombinationPaymentMethodBean)) {
                        ArrayList arrayList2 = coreCashierPreviewActivity.f27496I0;
                        for (Object obj8 : arrayList2) {
                            if (r0.l(selectPayment, (CashierPaymentMethodBean) obj8)) {
                                obj6 = obj8;
                                if (((CashierPaymentMethodBean) obj6) == null) {
                                    r0.c(arrayList2, selectPayment);
                                }
                                coreCashierPreviewActivity.l0();
                                break;
                            }
                        }
                        if (((CashierPaymentMethodBean) obj6) == null) {
                            r0.c(arrayList2, selectPayment);
                        }
                        coreCashierPreviewActivity.l0();
                    }
                }
                break;
            case 6:
                CommonBeanResult rsp5 = (CommonBeanResult) obj2;
                int i15 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter((CashierPaymentMethodBean) obj, "<unused var>");
                Intrinsics.checkNotNullParameter(rsp5, "rsp");
                if (rsp5.isSuccess()) {
                    coreCashierPreviewActivity.Y("PalmPayCashierPreview_FlexiPayGuide_Click");
                    coreCashierPreviewActivity.g0(true);
                } else {
                    coreCashierPreviewActivity.d0();
                    String respMsg = rsp5.getRespMsg();
                    if (respMsg != null && !StringsKt.F(respMsg)) {
                        ToastUtils.showLong(rsp5.getRespMsg(), new Object[0]);
                    }
                }
                break;
            case 7:
                CashierPaymentMethodBean selectPayment2 = (CashierPaymentMethodBean) obj;
                CommonBeanResult rsp6 = (CommonBeanResult) obj2;
                int i16 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(selectPayment2, "selectPayment");
                Intrinsics.checkNotNullParameter(rsp6, "rsp");
                CashierPayMethodRetryDialog cashierPayMethodRetryDialogO = coreCashierPreviewActivity.O();
                if (cashierPayMethodRetryDialogO != null) {
                    cashierPayMethodRetryDialogO.onManualCalcFinished(rsp6.isSuccess(), rsp6.getRespMsg(), coreCashierPreviewActivity.f27454d, coreCashierPreviewActivity.getF27455e(), selectPayment2, (ManualCalcOfPaymentMethodBean) rsp6.data);
                }
                break;
            case 8:
                CommonBeanResult rsp7 = (CommonBeanResult) obj2;
                int i17 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter((CashierPaymentMethodBean) obj, "<unused var>");
                Intrinsics.checkNotNullParameter(rsp7, "rsp");
                coreCashierPreviewActivity.g0(false);
                if (!rsp7.isSuccess()) {
                    coreCashierPreviewActivity.H();
                    String respMsg2 = rsp7.getRespMsg();
                    if (respMsg2 != null && !StringsKt.F(respMsg2)) {
                        ToastUtils.showLong(rsp7.getRespMsg(), new Object[0]);
                    }
                }
                break;
            case 9:
                CashierPaymentMethodBean selectPayment3 = (CashierPaymentMethodBean) obj;
                int i18 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(selectPayment3, "selectPayment");
                Intrinsics.checkNotNullParameter((CommonBeanResult) obj2, "rsp");
                for (Object obj9 : coreCashierPreviewActivity.f27496I0) {
                    if (r0.l(selectPayment3, (CashierPaymentMethodBean) obj9)) {
                        obj5 = obj9;
                        if (((CashierPaymentMethodBean) obj5) == null) {
                            r0.c(coreCashierPreviewActivity.f27496I0, selectPayment3);
                        }
                        coreCashierPreviewActivity.l0();
                        break;
                    }
                }
                if (((CashierPaymentMethodBean) obj5) == null) {
                    r0.c(coreCashierPreviewActivity.f27496I0, selectPayment3);
                }
                coreCashierPreviewActivity.l0();
                break;
            default:
                CashierPaymentMethodBean selectPayment4 = (CashierPaymentMethodBean) obj;
                int i19 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(selectPayment4, "selectPayment");
                Intrinsics.checkNotNullParameter((CommonBeanResult) obj2, "rsp");
                for (Object obj10 : coreCashierPreviewActivity.f27496I0) {
                    if (r0.l(selectPayment4, (CashierPaymentMethodBean) obj10)) {
                        obj4 = obj10;
                        if (((CashierPaymentMethodBean) obj4) == null) {
                            r0.c(coreCashierPreviewActivity.f27496I0, selectPayment4);
                        }
                        coreCashierPreviewActivity.l0();
                        break;
                    }
                }
                if (((CashierPaymentMethodBean) obj4) == null) {
                    r0.c(coreCashierPreviewActivity.f27496I0, selectPayment4);
                }
                coreCashierPreviewActivity.l0();
                break;
        }
        return Unit.f38893a;
    }
}
