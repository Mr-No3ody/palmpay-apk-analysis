package C9;

import J9.C0327k;
import Pa.i0;
import Pa.r0;
import android.content.Intent;
import android.net.Uri;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.bean.response.CreateCashInOutOrderRsp;
import com.transsnet.palmpay.cash_in.bean.response.QueryUssdLastOrderResp;
import com.transsnet.palmpay.cash_in.bean.response.UssdLastOrderResp;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.dialog.FundUSSDCompleteLastOrderDialog;
import com.transsnet.palmpay.cash_in.ui.viewmodel.FundViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.OrderStatusData;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0154v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RechargeActivity f1332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RechargeActivity f1333c;

    public /* synthetic */ C0154v(RechargeActivity rechargeActivity, RechargeActivity rechargeActivity2, int i7) {
        this.f1331a = i7;
        this.f1332b = rechargeActivity;
        this.f1333c = rechargeActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strB;
        String str;
        int i7 = 23;
        HashMap map = null;
        String str2 = "";
        RechargeActivity rechargeActivity = this.f1333c;
        RechargeActivity rechargeActivity2 = this.f1332b;
        switch (this.f1331a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    rechargeActivity2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    rechargeActivity2.showLoadingDialog(false, true);
                    CreateCashInOutOrderRsp createCashInOutOrderRsp = (CreateCashInOutOrderRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (createCashInOutOrderRsp.isSuccess()) {
                        OrderStatusData orderStatusData = createCashInOutOrderRsp.data;
                        if (orderStatusData != null) {
                            rechargeActivity.f26878k0 = orderStatusData.getOrderNo();
                            PreviewPayInfoV2Req req = new PreviewPayInfoV2Req();
                            req.orderAmount = rechargeActivity.f26867Q;
                            req.orderNo = orderStatusData.getOrderNo();
                            req.orderType = "2";
                            if (Intrinsics.c(RechargeActivity.f26859s0, rechargeActivity.f26864H)) {
                                i7 = 5;
                            } else if (Intrinsics.c(RechargeActivity.f26860t0, rechargeActivity.f26864H)) {
                                i7 = 6;
                            } else if (!Intrinsics.c(RechargeActivity.f26858r0, rechargeActivity.f26864H)) {
                                i7 = 0;
                            }
                            req.payerAccountType = String.valueOf(i7);
                            req.transType = "01";
                            FundViewModel fundViewModel = (FundViewModel) rechargeActivity.l();
                            fundViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            p140j8.f.s(fundViewModel, new J9.m(req, null), fundViewModel.f27100i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    } else {
                        p220oa.h.x(rechargeActivity, createCashInOutOrderRsp.getRespMsg());
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    rechargeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    rechargeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    rechargeActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    rechargeActivity2.showLoadingDialog(false, true);
                    PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (previewPayInfoResp.isSuccess()) {
                        PreviewPayInfoResp.DataBean data = previewPayInfoResp.getData();
                        if (data != null) {
                            PayByOrderReq req2 = new PayByOrderReq();
                            req2.cacheKey = data.cacheKey;
                            req2.amount = data.payAmount;
                            req2.currency = BaseApplication.getCurrency();
                            req2.orderNo = rechargeActivity.f26878k0;
                            req2.orderType = "2";
                            if (Intrinsics.c(rechargeActivity.f26864H, RechargeActivity.f26858r0)) {
                                PaymentMethod paymentMethod = rechargeActivity.f26868X;
                                if (paymentMethod != null) {
                                    req2.payType = paymentMethod.payType;
                                    req2.payerAccountId = paymentMethod.accountId;
                                    req2.payerCardCvv = paymentMethod.cvv;
                                    req2.payerCardExpiryMon = paymentMethod.expiryMonth;
                                    req2.payerCardExpiryYear = paymentMethod.expiryYear;
                                    req2.payerCardNo = paymentMethod.cardNo;
                                    req2.payerBankCode = paymentMethod.bankCode;
                                    req2.reUseable = paymentMethod.reUseable;
                                }
                            } else {
                                PaymentMethod paymentMethod2 = rechargeActivity.f26869Y;
                                if (paymentMethod2 != null) {
                                    req2.payType = paymentMethod2.payType;
                                    req2.payerAccountId = paymentMethod2.accountId;
                                    req2.payerCardCvv = paymentMethod2.cvv;
                                    req2.payerCardExpiryMon = paymentMethod2.expiryMonth;
                                    req2.payerCardExpiryYear = paymentMethod2.expiryYear;
                                    req2.payerCardNo = paymentMethod2.cardNo;
                                    req2.payerCardPin = paymentMethod2.cardPin;
                                    req2.payerBankCode = paymentMethod2.bankCode;
                                    req2.reUseable = paymentMethod2.reUseable;
                                }
                                rechargeActivity.f26870Z = previewPayInfoResp.getData();
                            }
                            req2.transType = "01";
                            FundViewModel fundViewModel2 = (FundViewModel) rechargeActivity.l();
                            fundViewModel2.getClass();
                            Intrinsics.checkNotNullParameter(req2, "req");
                            p140j8.f.s(fundViewModel2, new C0327k(req2, null), fundViewModel2.f27099g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    } else {
                        p220oa.h.x(rechargeActivity, previewPayInfoResp.getRespMsg());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    rechargeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    rechargeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    rechargeActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    rechargeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        UssdLastOrderResp ussdLastOrderResp = (UssdLastOrderResp) commonBeanResult.data;
                        if (ussdLastOrderResp != null && ussdLastOrderResp.hasUssdRecord) {
                            String str3 = ussdLastOrderResp.orderNo;
                            new FundUSSDCompleteLastOrderDialog(rechargeActivity, str3 != null ? str3 : "", new C0156x(rechargeActivity, ussdLastOrderResp)).show();
                        }
                    } else {
                        p220oa.h.x(rechargeActivity, commonBeanResult.getRespMsg());
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    rechargeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    rechargeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it3).getClass();
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof com.transsnet.palmpay.core.base.o) {
                    rechargeActivity2.showLoadingDialog(true, true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    rechargeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                    boolean zIsSuccess = commonBeanResult2.isSuccess();
                    RechargeActivity rechargeActivity3 = this.f1333c;
                    if (zIsSuccess) {
                        QueryUssdLastOrderResp queryUssdLastOrderResp = (QueryUssdLastOrderResp) commonBeanResult2.data;
                        if (queryUssdLastOrderResp != null && rechargeActivity3.f26868X == null && queryUssdLastOrderResp.orderNo != null) {
                            PaymentMethod paymentMethod3 = new PaymentMethod();
                            String str4 = queryUssdLastOrderResp.bankUrl;
                            if (str4 == null) {
                                str4 = "";
                            }
                            paymentMethod3.bankUrl = str4;
                            String str5 = queryUssdLastOrderResp.bankCode;
                            if (str5 == null) {
                                str5 = "";
                            }
                            paymentMethod3.bankCode = str5;
                            String str6 = queryUssdLastOrderResp.bankName;
                            paymentMethod3.bankName = str6 != null ? str6 : "";
                            paymentMethod3.payType = 13;
                            paymentMethod3.senderAccountType = 23;
                            rechargeActivity3.f26868X = paymentMethod3;
                            rechargeActivity3.u(MsgEvent.MSG_EVENT_STOP_FOREGROUND);
                            rechargeActivity3.r(paymentMethod3.bankUrl, paymentMethod3.senderAccountType, paymentMethod3.bankName, paymentMethod3.expiryFlag, null);
                        }
                    } else {
                        p220oa.h.x(rechargeActivity3, commonBeanResult2.getRespMsg());
                    }
                } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                    rechargeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    rechargeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 4:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5 instanceof com.transsnet.palmpay.core.base.o) {
                    rechargeActivity2.showLoadingDialog(true, true);
                } else if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                    rechargeActivity2.showLoadingDialog(false, true);
                    PayByOrderResp payByOrderResp = (PayByOrderResp) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                    if (payByOrderResp.isSuccess()) {
                        if (Intrinsics.c(rechargeActivity.f26864H, RechargeActivity.f26858r0)) {
                            USSDFundResultReq req3 = new USSDFundResultReq();
                            req3.amout = rechargeActivity.f26867Q;
                            PaymentMethod paymentMethod4 = rechargeActivity.f26868X;
                            if (paymentMethod4 != null && (str = paymentMethod4.bankCode) != null) {
                                str2 = str;
                            }
                            req3.bankCode = str2;
                            req3.orderNo = payByOrderResp.getData().orderNo;
                            req3.transType = "2";
                            req3.payId = payByOrderResp.getData().payId;
                            FundViewModel fundViewModel3 = (FundViewModel) rechargeActivity.l();
                            fundViewModel3.getClass();
                            Intrinsics.checkNotNullParameter(req3, "req");
                            J9.q qVar = new J9.q(req3, null);
                            com.transsnet.palmpay.core.base.l lVar = fundViewModel3.f27102o;
                            lVar.f27356m = req3;
                            Unit unit = Unit.f38893a;
                            p140j8.f.v(fundViewModel3, qVar, lVar, 0L);
                        } else {
                            CheckPayReq checkPayReq = new CheckPayReq();
                            checkPayReq.orderNo = payByOrderResp.getData().orderNo;
                            checkPayReq.orderType = "2";
                            checkPayReq.payId = payByOrderResp.getData().payId;
                            checkPayReq.subPayId = payByOrderResp.getData().subPayId;
                            checkPayReq.url = payByOrderResp.getData().url;
                            checkPayReq.verifyMethod = payByOrderResp.getData().verifyMethod;
                            checkPayReq.payRouteId = payByOrderResp.getData().payRouteId;
                            checkPayReq.transType = "01";
                            checkPayReq.otpReference = payByOrderResp.getData().otpReference;
                            checkPayReq.orderAmount = rechargeActivity.f26867Q;
                            PreviewPayInfoResp.DataBean dataBean = rechargeActivity.f26870Z;
                            if (dataBean != null) {
                                checkPayReq.payAmount = dataBean.payAmount;
                                Intrinsics.e(dataBean);
                                long j6 = dataBean.fee;
                                PreviewPayInfoResp.DataBean dataBean2 = rechargeActivity.f26870Z;
                                Intrinsics.e(dataBean2);
                                checkPayReq.feeAmount = j6 + dataBean2.vat;
                            }
                            com.transsnet.palmpay.core.ui.activity.d0 d0Var = new com.transsnet.palmpay.core.ui.activity.d0(rechargeActivity);
                            d0Var.f27748b = checkPayReq;
                            d0Var.f27751e = rechargeActivity.f26869Y;
                            d0Var.f27749c = payByOrderResp;
                            if (rechargeActivity.f26870Z != null) {
                                map = new HashMap();
                                PreviewPayInfoResp.DataBean dataBean3 = rechargeActivity.f26870Z;
                                Intrinsics.e(dataBean3);
                                if (dataBean3.deductionPointAmount > 0) {
                                    String string = rechargeActivity.getString(p025ba.k.core_points_used);
                                    PreviewPayInfoResp.DataBean dataBean4 = rechargeActivity.f26870Z;
                                    Intrinsics.e(dataBean4);
                                    if (dataBean4.deductionPointAmount > 0) {
                                        PreviewPayInfoResp.DataBean dataBean5 = rechargeActivity.f26870Z;
                                        Intrinsics.e(dataBean5);
                                        String strE = r0.E(dataBean5.deductionPointAmount);
                                        PreviewPayInfoResp.DataBean dataBean6 = rechargeActivity.f26870Z;
                                        Intrinsics.e(dataBean6);
                                        strB = C0.G.p("P", strE, " = ", r0.B(dataBean6.deductionPointAmount, false));
                                    } else {
                                        PreviewPayInfoResp.DataBean dataBean7 = rechargeActivity.f26870Z;
                                        Intrinsics.e(dataBean7);
                                        strB = r0.B(dataBean7.deductionPointAmount, false);
                                        Intrinsics.e(strB);
                                    }
                                    map.put(string, strB);
                                }
                                PreviewPayInfoResp.DataBean dataBean8 = rechargeActivity.f26870Z;
                                if ((dataBean8 != null ? dataBean8.payerShowVat : 0L) > 0) {
                                    String string2 = rechargeActivity.getString(p025ba.k.core_vat);
                                    PreviewPayInfoResp.DataBean dataBean9 = rechargeActivity.f26870Z;
                                    map.put(string2, r0.B(dataBean9 != null ? dataBean9.payerShowVat : 0L, false));
                                }
                                PreviewPayInfoResp.DataBean dataBean10 = rechargeActivity.f26870Z;
                                if ((dataBean10 != null ? dataBean10.feeExclVat : 0L) > 0) {
                                    String string3 = rechargeActivity.getString(p025ba.k.core_fee);
                                    PreviewPayInfoResp.DataBean dataBean11 = rechargeActivity.f26870Z;
                                    map.put(string3, r0.B(dataBean11 != null ? dataBean11.feeExclVat : 0L, false));
                                }
                                String string4 = rechargeActivity.getString(p025ba.k.core_amount);
                                PreviewPayInfoResp.DataBean dataBean12 = rechargeActivity.f26870Z;
                                Intrinsics.e(dataBean12);
                                map.put(string4, r0.B(dataBean12.orderAmount, false));
                            }
                            d0Var.f27752f = map;
                            d0Var.a();
                        }
                    } else {
                        String respCode = payByOrderResp.getRespCode();
                        if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                            String respCode2 = payByOrderResp.getRespCode();
                            String respMsg = payByOrderResp.getRespMsg();
                            i0.i0(rechargeActivity, respCode2, respMsg != null ? respMsg : "", true);
                        } else {
                            p220oa.h.x(rechargeActivity, payByOrderResp.getRespMsg());
                        }
                    }
                } else if (it5 instanceof com.transsnet.palmpay.core.base.m) {
                    rechargeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    rechargeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (it6 instanceof com.transsnet.palmpay.core.base.o) {
                    rechargeActivity2.showLoadingDialog(true, true);
                } else if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                    rechargeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it6).f27360a;
                    if (commonBeanResult3.isSuccess()) {
                        String str7 = ((BillDetail) commonBeanResult3.data).rechargePIN;
                        if (str7 != null) {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            Uri uri = Uri.parse("tel:".concat(str7));
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            intent.setData(uri);
                            rechargeActivity.startActivity(intent);
                        }
                    } else {
                        p220oa.h.x(rechargeActivity, commonBeanResult3.getRespMsg());
                    }
                } else if (it6 instanceof com.transsnet.palmpay.core.base.m) {
                    rechargeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    rechargeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it6).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it6).getClass();
                }
                return Unit.f38893a;
        }
    }
}
