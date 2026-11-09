package C9;

import Pa.r0;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.ui.activity.CashInReceiptActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: C9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0143j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashInReceiptActivity f1311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashInReceiptActivity f1312c;

    public /* synthetic */ C0143j(CashInReceiptActivity cashInReceiptActivity, CashInReceiptActivity cashInReceiptActivity2, int i7) {
        this.f1310a = i7;
        this.f1311b = cashInReceiptActivity;
        this.f1312c = cashInReceiptActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x03ae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QueryOrderDetailRsp queryOrderDetailRsp;
        BillDetail billDetail;
        String strReplace;
        switch (this.f1310a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                CashInReceiptActivity cashInReceiptActivity = this.f1311b;
                if (z3) {
                    cashInReceiptActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    cashInReceiptActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (commonBeanResult.isSuccess() && (queryOrderDetailRsp = (QueryOrderDetailRsp) commonBeanResult.data) != null) {
                        CashInReceiptActivity cashInReceiptActivity2 = this.f1312c;
                        Object value = cashInReceiptActivity2.f26807Q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ((LinearLayout) value).setVisibility(8);
                        Object value2 = cashInReceiptActivity2.f26815g.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((TextView) value2).setVisibility(8);
                        Object value3 = cashInReceiptActivity2.f26814f.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        ((TextView) value3).setVisibility(8);
                        Object value4 = cashInReceiptActivity2.f26813e.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((TextView) value4).setText(cashInReceiptActivity2.getString(p366y9.d.ci_transfer_transaction_receipt_bottom_tip));
                        if (!TextUtils.isEmpty(queryOrderDetailRsp.payeeName)) {
                            CashInReceiptActivity.n(cashInReceiptActivity2).setText(queryOrderDetailRsp.payeeName);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cashInReceiptActivity2.getString(p366y9.d.ci_palmpay_text));
                        sb2.append(" | ");
                        if (!TextUtils.isEmpty(queryOrderDetailRsp.payeeMappingCode)) {
                            String str = queryOrderDetailRsp.payeeMappingCode;
                            sb2.append(str != null ? r0.w(str) : null);
                        }
                        Object value5 = cashInReceiptActivity2.f26818k0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        ((TextView) value5).setText(sb2);
                        Object value6 = cashInReceiptActivity2.f26824s0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        TextView textView = (TextView) value6;
                        Long l5 = queryOrderDetailRsp.amount;
                        textView.setText(r0.B(l5 != null ? l5.longValue() : 0L, false));
                        if (!TextUtils.isEmpty(queryOrderDetailRsp.payerName)) {
                            Object value7 = cashInReceiptActivity2.f26809Y.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            ((TextView) value7).setText(queryOrderDetailRsp.payerName);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp.payerMobileNo)) {
                            Object value8 = cashInReceiptActivity2.f26808X.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            C0.G.x("PalmPay | ", r0.E0(queryOrderDetailRsp.payerMobileNo), (TextView) value8);
                        }
                        boolean zIsEmpty = TextUtils.isEmpty(queryOrderDetailRsp.receiptDesc);
                        p355xf.t tVar = cashInReceiptActivity2.f26823r0;
                        if (zIsEmpty) {
                            Object value9 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                            p220oa.h.c((TextView) value9);
                        } else {
                            Object value10 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                            p220oa.h.C((TextView) value10);
                            Object value11 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                            ((TextView) value11).setText(queryOrderDetailRsp.receiptDesc);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp.remark)) {
                            CashInReceiptActivity.o(cashInReceiptActivity2).setText(queryOrderDetailRsp.remark);
                            Object value12 = cashInReceiptActivity2.f26827v.getValue();
                            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                            ((TextView) value12).setVisibility(0);
                            CashInReceiptActivity.o(cashInReceiptActivity2).setVisibility(0);
                        }
                        if (!TextUtils.isEmpty(cashInReceiptActivity2.f26826u0)) {
                            CashInReceiptActivity.q(cashInReceiptActivity2).setText(cashInReceiptActivity2.f26826u0);
                            Object value13 = cashInReceiptActivity2.f26820p.getValue();
                            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                            ((TextView) value13).setVisibility(0);
                            CashInReceiptActivity.q(cashInReceiptActivity2).setVisibility(0);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp.payId)) {
                            CashInReceiptActivity.p(cashInReceiptActivity2).setText(queryOrderDetailRsp.payId);
                            Object value14 = cashInReceiptActivity2.f26817j.getValue();
                            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                            ((TextView) value14).setVisibility(0);
                            CashInReceiptActivity.p(cashInReceiptActivity2).setVisibility(0);
                        }
                        Long l6 = queryOrderDetailRsp.orderSuccessTime;
                        if ((l6 != null ? l6.longValue() : 0L) > 0) {
                            Object value15 = cashInReceiptActivity2.f26822q0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                            TextView textView2 = (TextView) value15;
                            Long l8 = queryOrderDetailRsp.orderSuccessTime;
                            textView2.setText(r0.Q(l8 != null ? l8.longValue() : 0L));
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    cashInReceiptActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashInReceiptActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                CashInReceiptActivity cashInReceiptActivity3 = this.f1311b;
                if (z8) {
                    cashInReceiptActivity3.showLoadingDialog(true, true);
                } else {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        cashInReceiptActivity3.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult2.isSuccess() && (billDetail = (BillDetail) commonBeanResult2.data) != null) {
                            CashInReceiptActivity cashInReceiptActivity4 = this.f1312c;
                            Object value16 = cashInReceiptActivity4.f26815g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                            ((TextView) value16).setVisibility(0);
                            p355xf.t tVar2 = cashInReceiptActivity4.f26814f;
                            Object value17 = tVar2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                            ((TextView) value17).setVisibility(0);
                            Object value18 = cashInReceiptActivity4.f26813e.getValue();
                            Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                            ((TextView) value18).setText(cashInReceiptActivity4.getString(p366y9.d.ci_transaction_receipt_bottom_tip));
                            String str2 = billDetail.bankReceiptsEmail;
                            if (str2 != null) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    Object value19 = tVar2.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                                    ((TextView) value19).setText(str2);
                                }
                            }
                            if (!TextUtils.isEmpty(billDetail.payeeName)) {
                                CashInReceiptActivity.n(cashInReceiptActivity4).setText(billDetail.payeeName);
                            } else if (billDetail.payeeAccountType == 1) {
                                CashInReceiptActivity.n(cashInReceiptActivity4).setText(BaseApplication.get().getUser().getFullName());
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(cashInReceiptActivity4.getString(p366y9.d.ci_palmpay_text));
                            sb3.append(" | ");
                            if (!TextUtils.isEmpty(BaseApplication.get().getUser().getPhoneNumber())) {
                                sb3.append(r0.D0(BaseApplication.get().getUser().getPhoneNumber()));
                            }
                            Object value20 = cashInReceiptActivity4.f26818k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value20, "getValue(...)");
                            ((TextView) value20).setText(sb3);
                            Object value21 = cashInReceiptActivity4.f26824s0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value21, "getValue(...)");
                            ((TextView) value21).setText(r0.B(billDetail.businessAmount, false));
                            Object value22 = cashInReceiptActivity4.f26810Z.getValue();
                            Intrinsics.checkNotNullExpressionValue(value22, "getValue(...)");
                            ((RelativeLayout) value22).setVisibility(8);
                            if (!TextUtils.isEmpty(billDetail.remark)) {
                                CashInReceiptActivity.o(cashInReceiptActivity4).setText(billDetail.remark);
                                Object value23 = cashInReceiptActivity4.f26827v.getValue();
                                Intrinsics.checkNotNullExpressionValue(value23, "getValue(...)");
                                ((TextView) value23).setVisibility(0);
                                CashInReceiptActivity.o(cashInReceiptActivity4).setVisibility(0);
                            }
                            if (!TextUtils.isEmpty(cashInReceiptActivity4.f26826u0)) {
                                CashInReceiptActivity.q(cashInReceiptActivity4).setText(cashInReceiptActivity4.f26826u0);
                                Object value24 = cashInReceiptActivity4.f26820p.getValue();
                                Intrinsics.checkNotNullExpressionValue(value24, "getValue(...)");
                                ((TextView) value24).setVisibility(0);
                                CashInReceiptActivity.q(cashInReceiptActivity4).setVisibility(0);
                            }
                            if (billDetail.orderSuccessTime > 0) {
                                Object value25 = cashInReceiptActivity4.f26822q0.getValue();
                                Intrinsics.checkNotNullExpressionValue(value25, "getValue(...)");
                                ((TextView) value25).setText(r0.Q(billDetail.orderSuccessTime));
                            }
                            Object value26 = cashInReceiptActivity4.f26807Q.getValue();
                            Intrinsics.checkNotNullExpressionValue(value26, "getValue(...)");
                            ((LinearLayout) value26).setVisibility(0);
                            Object value27 = cashInReceiptActivity4.f26805L.getValue();
                            Intrinsics.checkNotNullExpressionValue(value27, "getValue(...)");
                            ((TextView) value27).setText(billDetail.bankName);
                            Object value28 = cashInReceiptActivity4.f26806M.getValue();
                            Intrinsics.checkNotNullExpressionValue(value28, "getValue(...)");
                            ((LinearLayout) value28).setVisibility(TextUtils.isEmpty(billDetail.bankName) ? 8 : 0);
                            Object value29 = cashInReceiptActivity4.f26803C.getValue();
                            Intrinsics.checkNotNullExpressionValue(value29, "getValue(...)");
                            ((TextView) value29).setText(billDetail.payerAccountType == 5 ? cashInReceiptActivity4.getString(p366y9.d.ci_card_number_with_colon) : cashInReceiptActivity4.getString(p366y9.d.ci_account_number_with_colon));
                            Object value30 = cashInReceiptActivity4.f26802B.getValue();
                            Intrinsics.checkNotNullExpressionValue(value30, "getValue(...)");
                            TextView textView3 = (TextView) value30;
                            String str3 = billDetail.bankAccNo;
                            if (str3 == null) {
                                strReplace = null;
                            } else {
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = null;
                                }
                                if (str3 != null) {
                                    strReplace = new Regex("(\\d{3})(\\d*)(\\d{4})").replace(str3, "$1****$3");
                                } else {
                                    strReplace = null;
                                }
                            }
                            textView3.setText(strReplace);
                            Object value31 = cashInReceiptActivity4.f26804H.getValue();
                            Intrinsics.checkNotNullExpressionValue(value31, "getValue(...)");
                            ((LinearLayout) value31).setVisibility(TextUtils.isEmpty(billDetail.bankAccNo) ? 8 : 0);
                            String str4 = billDetail.fundMethodDesc;
                            if (str4 == null) {
                                CashInReceiptActivity.m(cashInReceiptActivity4).setText(r0.u0(billDetail.payerAccountType));
                            } else {
                                String str5 = TextUtils.isEmpty(str4) ? null : str4;
                                if (str5 != null) {
                                    CashInReceiptActivity.m(cashInReceiptActivity4).setText(str5);
                                } else {
                                    CashInReceiptActivity.m(cashInReceiptActivity4).setText(r0.u0(billDetail.payerAccountType));
                                }
                            }
                            Object value32 = cashInReceiptActivity4.f26801A.getValue();
                            Intrinsics.checkNotNullExpressionValue(value32, "getValue(...)");
                            ((LinearLayout) value32).setVisibility(TextUtils.isEmpty(CashInReceiptActivity.m(cashInReceiptActivity4).getText().toString()) ? 8 : 0);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        cashInReceiptActivity3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        cashInReceiptActivity3.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z10 = it3 instanceof com.transsnet.palmpay.core.base.o;
                CashInReceiptActivity cashInReceiptActivity5 = this.f1311b;
                if (z10) {
                    cashInReceiptActivity5.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    cashInReceiptActivity5.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (commonBeanResult3.isSuccess()) {
                        BindBankCardDetail bindBankCardDetail = (BindBankCardDetail) commonBeanResult3.data;
                        if (bindBankCardDetail != null) {
                            CashInReceiptActivity cashInReceiptActivity6 = this.f1312c;
                            Object value33 = cashInReceiptActivity6.f26824s0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value33, "getValue(...)");
                            ((TextView) value33).setText(r0.B(bindBankCardDetail.payAmount, false));
                            if (bindBankCardDetail.updateTime > 0) {
                                Object value34 = cashInReceiptActivity6.f26822q0.getValue();
                                Intrinsics.checkNotNullExpressionValue(value34, "getValue(...)");
                                ((TextView) value34).setText(r0.Q(bindBankCardDetail.updateTime));
                            }
                            Object value35 = cashInReceiptActivity6.f26810Z.getValue();
                            Intrinsics.checkNotNullExpressionValue(value35, "getValue(...)");
                            p220oa.h.c((RelativeLayout) value35);
                            CashInReceiptActivity.n(cashInReceiptActivity6).setText(bindBankCardDetail.payeeName);
                            Object value36 = cashInReceiptActivity6.f26818k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value36, "getValue(...)");
                            C0.G.x("PalmPay | ", r0.Y(BaseApplication.getInstance().getUser().getPhoneNumber()), (TextView) value36);
                            Object value37 = cashInReceiptActivity6.f26807Q.getValue();
                            Intrinsics.checkNotNullExpressionValue(value37, "getValue(...)");
                            p220oa.h.C((LinearLayout) value37);
                            String str6 = bindBankCardDetail.bankName;
                            if (str6 != null) {
                                if (TextUtils.isEmpty(str6)) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    Object value38 = cashInReceiptActivity6.f26805L.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value38, "getValue(...)");
                                    ((TextView) value38).setText(bindBankCardDetail.bankName);
                                    Object value39 = cashInReceiptActivity6.f26806M.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value39, "getValue(...)");
                                    p220oa.h.C((LinearLayout) value39);
                                }
                            }
                            CashInReceiptActivity.m(cashInReceiptActivity6).setText(r0.u0(bindBankCardDetail.payerAccountType));
                            Object value40 = cashInReceiptActivity6.f26801A.getValue();
                            Intrinsics.checkNotNullExpressionValue(value40, "getValue(...)");
                            p220oa.h.s((LinearLayout) value40, true ^ TextUtils.isEmpty(CashInReceiptActivity.m(cashInReceiptActivity6).getText().toString()));
                            Object value41 = cashInReceiptActivity6.f26803C.getValue();
                            Intrinsics.checkNotNullExpressionValue(value41, "getValue(...)");
                            ((TextView) value41).setText(cashInReceiptActivity6.getString(p366y9.d.ci_card_number_with_colon));
                            String str7 = bindBankCardDetail.bankCardNo;
                            if (str7 != null) {
                                String str8 = TextUtils.isEmpty(str7) ? null : str7;
                                if (str8 != null) {
                                    Object value42 = cashInReceiptActivity6.f26802B.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value42, "getValue(...)");
                                    ((TextView) value42).setText(str8);
                                    Object value43 = cashInReceiptActivity6.f26804H.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value43, "getValue(...)");
                                    p220oa.h.C((LinearLayout) value43);
                                }
                            }
                            if (!TextUtils.isEmpty(bindBankCardDetail.orderId)) {
                                CashInReceiptActivity.q(cashInReceiptActivity6).setText(bindBankCardDetail.orderId);
                                Object value44 = cashInReceiptActivity6.f26820p.getValue();
                                Intrinsics.checkNotNullExpressionValue(value44, "getValue(...)");
                                p220oa.h.C((TextView) value44);
                                p220oa.h.C(CashInReceiptActivity.q(cashInReceiptActivity6));
                            }
                            if (!TextUtils.isEmpty(bindBankCardDetail.payId)) {
                                CashInReceiptActivity.p(cashInReceiptActivity6).setText(bindBankCardDetail.payId);
                                Object value45 = cashInReceiptActivity6.f26817j.getValue();
                                Intrinsics.checkNotNullExpressionValue(value45, "getValue(...)");
                                p220oa.h.C((TextView) value45);
                                p220oa.h.C(CashInReceiptActivity.p(cashInReceiptActivity6));
                            }
                        }
                    } else {
                        ToastUtils.showLong(commonBeanResult3.getRespMsg(), new Object[0]);
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    cashInReceiptActivity5.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashInReceiptActivity5.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
