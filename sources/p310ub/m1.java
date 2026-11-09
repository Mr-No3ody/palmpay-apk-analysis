package p310ub;

import C0.G;
import Pa.C0525w;
import Pa.r0;
import Ya.d;
import Ya.g;
import Z4.e;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.network.ErrorCodes;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.ui.dialog.BillDetailProcessDialog;
import com.transsnet.palmpay.credit.bean.resp.TopUpOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle2;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OcRepayOrderDetailInPalmPayActivity f42891f;

    public m1(OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity) {
        this.f42891f = ocRepayOrderDetailInPalmPayActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42891f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42891f.showLoadingDialog(false);
        ToastUtils.showShort(message, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0226  */
    /* JADX WARN: Code duplicated, block: B:167:0x040c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0418  */
    /* JADX WARN: Code duplicated, block: B:170:0x041c  */
    /* JADX WARN: Code duplicated, block: B:172:0x041f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0435  */
    /* JADX WARN: Code duplicated, block: B:176:0x0439  */
    /* JADX WARN: Code duplicated, block: B:178:0x043c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x012f  */
    @Override // Z4.e
    public final void y(Object obj) {
        final TopUpOrderDetailRsp.DataBean dataBean;
        Drawable drawableSuccessIcon$default;
        String string;
        int i7;
        String string2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        long j6;
        final int i10 = 1;
        TopUpOrderDetailRsp topUpOrderDetailRsp = (TopUpOrderDetailRsp) obj;
        final OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity = this.f42891f;
        ocRepayOrderDetailInPalmPayActivity.showLoadingDialog(false);
        if (topUpOrderDetailRsp == null) {
            ToastUtils.showShort(ocRepayOrderDetailInPalmPayActivity.getString(g.cs_cl_service_busy), new Object[0]);
            return;
        }
        if (!topUpOrderDetailRsp.isSuccess() || (dataBean = topUpOrderDetailRsp.data) == null) {
            ToastUtils.showShort(topUpOrderDetailRsp.getRespMsg(), new Object[0]);
            return;
        }
        int i11 = OcRepayOrderDetailInPalmPayActivity.f29822o;
        ocRepayOrderDetailInPalmPayActivity.r().removeAllViews();
        ocRepayOrderDetailInPalmPayActivity.s().removeAllViews();
        OrderResultHeaderModel orderResultHeaderModelT = ocRepayOrderDetailInPalmPayActivity.t();
        int i12 = dataBean.status;
        if (i12 == 1) {
            drawableSuccessIcon$default = OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, ocRepayOrderDetailInPalmPayActivity, 0.0f, 2, null);
        } else if (i12 == 2) {
            drawableSuccessIcon$default = OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, ocRepayOrderDetailInPalmPayActivity, 0.0f, 2, null);
        } else if (i12 == 3 || i12 == 6) {
            drawableSuccessIcon$default = OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, ocRepayOrderDetailInPalmPayActivity, 0.0f, 2, null);
        } else if (i12 != 7) {
            drawableSuccessIcon$default = OrderResultHeaderModel.a.processingIcon$default(OrderResultHeaderModel.f31610A, ocRepayOrderDetailInPalmPayActivity, 0.0f, 2, null);
        } else {
            drawableSuccessIcon$default = OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, ocRepayOrderDetailInPalmPayActivity, 0.0f, 2, null);
        }
        orderResultHeaderModelT.l(drawableSuccessIcon$default);
        OrderResultHeaderModel orderResultHeaderModelT2 = ocRepayOrderDetailInPalmPayActivity.t();
        String str = ocRepayOrderDetailInPalmPayActivity.f29827i;
        if (str == null) {
            string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_oc_cl_repay);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 3248) {
                if (iHashCode != 3340) {
                    if (iHashCode == 3341 && str.equals(TransType.TRANS_TYPE_CL_REPAY)) {
                        string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_cl_repay);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_oc_cl_repay);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    }
                } else if (str.equals(TransType.TRANS_TYPE_CL_BORROW)) {
                    string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_cl_disbursement);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_oc_cl_repay);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
            } else if (str.equals(TransType.TRANS_TYPE_OK_CARD)) {
                string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_oc_repay);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_oc_cl_repay);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        }
        orderResultHeaderModelT2.o(string);
        ocRepayOrderDetailInPalmPayActivity.t().c(r0.B(dataBean.amountInfo.transAmount, true));
        OrderResultHeaderModel orderResultHeaderModelT3 = ocRepayOrderDetailInPalmPayActivity.t();
        String str2 = ocRepayOrderDetailInPalmPayActivity.f29827i;
        if (str2 == null) {
            i7 = r.cv_ok_card_icon;
        } else {
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3248) {
                if (iHashCode2 != 3340) {
                    if (iHashCode2 == 3341 && str2.equals(TransType.TRANS_TYPE_CL_REPAY)) {
                        i7 = d.cv_cl_cash_loan_repay;
                    } else {
                        i7 = r.cv_ok_card_icon;
                    }
                } else if (str2.equals(TransType.TRANS_TYPE_CL_BORROW)) {
                    i7 = d.cv_cl_cash_loan_borrow;
                } else {
                    i7 = r.cv_ok_card_icon;
                }
            } else if (str2.equals(TransType.TRANS_TYPE_OK_CARD)) {
                i7 = r.cv_ok_card_icon;
            } else {
                i7 = r.cv_ok_card_icon;
            }
        }
        orderResultHeaderModelT3.d(i7);
        OrderResultHeaderModel orderResultHeaderModelT4 = ocRepayOrderDetailInPalmPayActivity.t();
        int i13 = dataBean.status;
        if (i13 == 1) {
            string2 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_successful);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else if (i13 == 2) {
            string2 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else if (i13 == 3 || i13 == 6) {
            string2 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_successful);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else if (i13 != 7) {
            string2 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_pending);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else {
            string2 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        orderResultHeaderModelT4.k(string2);
        ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusArrow().setVisibility(dataBean.orderStatusInfo == null ? 8 : 0);
        ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusLayout().setEnabled(dataBean.orderStatusInfo != null);
        final int i14 = 0;
        h.l(new View.OnClickListener() { // from class: ub.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity2 = ocRepayOrderDetailInPalmPayActivity;
                TopUpOrderDetailRsp.DataBean dataBean2 = dataBean;
                switch (i14) {
                    case 0:
                        int i15 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        BillDetailProcessDialog billDetailProcessDialog = new BillDetailProcessDialog(ocRepayOrderDetailInPalmPayActivity2);
                        billDetailProcessDialog.show();
                        billDetailProcessDialog.fillData(dataBean2.orderStatusInfo);
                        break;
                    default:
                        int i16 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        ocRepayOrderDetailInPalmPayActivity2.w(dataBean2.stampDutyText);
                        break;
                }
            }
        }, ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusLayout());
        F6.d.h(ocRepayOrderDetailInPalmPayActivity.TAG, 3, G.o("transType = ", dataBean.transType));
        if (!TextUtils.equals(dataBean.transType, TransType.TRANS_TYPE_CL_BORROW)) {
            TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean = dataBean.amountInfo;
            long j10 = amountInfoBean != null ? amountInfoBean.couponAmount : 0L;
            boolean z3 = dataBean.payerStampDuty > 0 || dataBean.payeeStampDuty > 0;
            if (j10 > 0 || z3) {
                String string3 = ocRepayOrderDetailInPalmPayActivity.getString(v.cv_amount);
                TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean2 = dataBean.amountInfo;
                marginLayoutParams = null;
                ocRepayOrderDetailInPalmPayActivity.n(string3, String.valueOf(r0.B(amountInfoBean2 != null ? amountInfoBean2.amount : 0L, true)), false, null);
                if (j10 > 0) {
                    ocRepayOrderDetailInPalmPayActivity.n(ocRepayOrderDetailInPalmPayActivity.getString(k.core_coupon), G.o("- ", r0.B(j10, true)), false, null);
                }
                if (z3) {
                    String strB = r0.B(dataBean.payerStampDuty, true);
                    final String str3 = dataBean.payerStampDutyText;
                    if (str3 == null) {
                        str3 = dataBean.payeeStampDutyText;
                    }
                    long j11 = dataBean.payeeStampDuty;
                    if (j11 > 0) {
                        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.B(j11, true)).setStrikethrough().append("  ").append(strB).create();
                        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                        ocRepayOrderDetailInPalmPayActivity.n(ocRepayOrderDetailInPalmPayActivity.getString(g.cs_cl_stamp_duty_title), spannableStringBuilderCreate, true, new View.OnClickListener() { // from class: ub.j1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str4 = str3;
                                OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity2 = ocRepayOrderDetailInPalmPayActivity;
                                switch (i10) {
                                    case 0:
                                        int i15 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                                        ocRepayOrderDetailInPalmPayActivity2.w(str4);
                                        break;
                                    default:
                                        int i16 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                                        ocRepayOrderDetailInPalmPayActivity2.w(str4);
                                        break;
                                }
                            }
                        });
                    } else {
                        final int i15 = 0;
                        ocRepayOrderDetailInPalmPayActivity.n(ocRepayOrderDetailInPalmPayActivity.getString(g.cs_cl_stamp_duty_title), strB, true, new View.OnClickListener() { // from class: ub.j1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str4 = str3;
                                OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity2 = ocRepayOrderDetailInPalmPayActivity;
                                switch (i15) {
                                    case 0:
                                        int i16 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                                        ocRepayOrderDetailInPalmPayActivity2.w(str4);
                                        break;
                                    default:
                                        int i17 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                                        ocRepayOrderDetailInPalmPayActivity2.w(str4);
                                        break;
                                }
                            }
                        });
                    }
                }
                String string4 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_total);
                TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean3 = dataBean.amountInfo;
                ocRepayOrderDetailInPalmPayActivity.s().addView(new OrderResultAmountStyle2(ocRepayOrderDetailInPalmPayActivity, string4, String.valueOf(r0.B(amountInfoBean3 != null ? amountInfoBean3.transAmount : 0L, true))));
                ocRepayOrderDetailInPalmPayActivity.p(ocRepayOrderDetailInPalmPayActivity.v(), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_receipt_transaction_type));
                String strU = ocRepayOrderDetailInPalmPayActivity.u(dataBean);
                if (TextUtils.isEmpty(strU)) {
                    strU = null;
                }
                if (strU != null) {
                    ocRepayOrderDetailInPalmPayActivity.p(strU, 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_payment_method));
                }
                ocRepayOrderDetailInPalmPayActivity.p(dataBean.orderId, ErrorCodes.MALFORMED_URL_EXCEPTION, ocRepayOrderDetailInPalmPayActivity.getString(k.core_reference_no_2));
                ocRepayOrderDetailInPalmPayActivity.p(r0.R(dataBean.updateTime), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_completion_time));
            } else {
                ocRepayOrderDetailInPalmPayActivity.q(ocRepayOrderDetailInPalmPayActivity.v(), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_receipt_transaction_type));
                String strU2 = ocRepayOrderDetailInPalmPayActivity.u(dataBean);
                if (TextUtils.isEmpty(strU2)) {
                    strU2 = null;
                }
                if (strU2 != null) {
                    ocRepayOrderDetailInPalmPayActivity.q(strU2, 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_payment_method));
                }
                ocRepayOrderDetailInPalmPayActivity.q(dataBean.orderId, ErrorCodes.MALFORMED_URL_EXCEPTION, ocRepayOrderDetailInPalmPayActivity.getString(k.core_reference_no_2));
                ocRepayOrderDetailInPalmPayActivity.q(r0.R(dataBean.updateTime), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_completion_time));
            }
            if (ocRepayOrderDetailInPalmPayActivity.r().getChildCount() == 0) {
                layoutParams = ocRepayOrderDetailInPalmPayActivity.s().getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams2 = marginLayoutParams;
                }
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = 0;
                    ocRepayOrderDetailInPalmPayActivity.s().setLayoutParams(marginLayoutParams2);
                }
                layoutParams2 = ocRepayOrderDetailInPalmPayActivity.r().getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams3 = marginLayoutParams;
                }
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.bottomMargin = 0;
                    ocRepayOrderDetailInPalmPayActivity.r().setLayoutParams(marginLayoutParams3);
                }
            }
        }
        String string5 = ocRepayOrderDetailInPalmPayActivity.getString(v.cv_loan_amount);
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean4 = dataBean.amountInfo;
        ocRepayOrderDetailInPalmPayActivity.n(string5, String.valueOf(r0.B(amountInfoBean4 != null ? amountInfoBean4.amount : 0L, true)), false, null);
        long j12 = dataBean.stampDuty;
        if (j12 > 0) {
            ocRepayOrderDetailInPalmPayActivity.n(ocRepayOrderDetailInPalmPayActivity.getString(g.cs_cl_stamp_duty_title), G.o("- ", r0.B(j12, true)), true, new View.OnClickListener() { // from class: ub.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity2 = ocRepayOrderDetailInPalmPayActivity;
                    TopUpOrderDetailRsp.DataBean dataBean2 = dataBean;
                    switch (i10) {
                        case 0:
                            int i16 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                            BillDetailProcessDialog billDetailProcessDialog = new BillDetailProcessDialog(ocRepayOrderDetailInPalmPayActivity2);
                            billDetailProcessDialog.show();
                            billDetailProcessDialog.fillData(dataBean2.orderStatusInfo);
                            break;
                        default:
                            int i17 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                            ocRepayOrderDetailInPalmPayActivity2.w(dataBean2.stampDutyText);
                            break;
                    }
                }
            });
        }
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean5 = dataBean.amountInfo;
        if ((amountInfoBean5 != null ? amountInfoBean5.couponAmount : 0L) > 0) {
            String string6 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_coupon);
            TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean6 = dataBean.amountInfo;
            ocRepayOrderDetailInPalmPayActivity.n(string6, G.o("- ", r0.B(amountInfoBean6 != null ? amountInfoBean6.couponAmount : 0L, true)), false, null);
        }
        if (TextUtils.isEmpty(dataBean.extensionInfo)) {
            j6 = 0;
        } else {
            C0525w c0525wF = C0525w.f();
            String str4 = dataBean.extensionInfo;
            c0525wF.getClass();
            TopUpOrderDetailRsp.DataBean.ExtensionInfo extensionInfo = (TopUpOrderDetailRsp.DataBean.ExtensionInfo) C0525w.d(str4, TopUpOrderDetailRsp.DataBean.ExtensionInfo.class);
            if (extensionInfo == null || !extensionInfo.whetherManagementFee) {
                j6 = 0;
            } else {
                j6 = extensionInfo.managementFee;
                ocRepayOrderDetailInPalmPayActivity.n(ocRepayOrderDetailInPalmPayActivity.getString(v.cv_management_fee), G.o("- ", r0.B(j6, true)), false, null);
            }
        }
        BigDecimal bigDecimalB = r0.b(String.valueOf(j6), String.valueOf(dataBean.stampDuty));
        String string7 = ocRepayOrderDetailInPalmPayActivity.getString(k.core_receive_amount);
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean7 = dataBean.amountInfo;
        ocRepayOrderDetailInPalmPayActivity.s().addView(new OrderResultAmountStyle2(ocRepayOrderDetailInPalmPayActivity, string7, r0.B(r0.U1(String.valueOf(amountInfoBean7 != null ? amountInfoBean7.transAmount : 0L), String.valueOf(bigDecimalB)).longValueExact(), true)));
        OrderResultHeaderModel orderResultHeaderModelT5 = ocRepayOrderDetailInPalmPayActivity.t();
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean8 = dataBean.amountInfo;
        orderResultHeaderModelT5.c(r0.B(r0.U1(String.valueOf(amountInfoBean8 != null ? amountInfoBean8.transAmount : 0L), String.valueOf(bigDecimalB)).longValueExact(), true));
        ocRepayOrderDetailInPalmPayActivity.p(ocRepayOrderDetailInPalmPayActivity.v(), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_receipt_transaction_type));
        ocRepayOrderDetailInPalmPayActivity.p(ocRepayOrderDetailInPalmPayActivity.getString(k.core_palmpay_payment_balance), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_receive_account));
        ocRepayOrderDetailInPalmPayActivity.p(dataBean.orderId, ErrorCodes.MALFORMED_URL_EXCEPTION, ocRepayOrderDetailInPalmPayActivity.getString(k.core_reference_no_2));
        ocRepayOrderDetailInPalmPayActivity.p(r0.R(dataBean.updateTime), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_completion_time));
        marginLayoutParams = null;
        if (ocRepayOrderDetailInPalmPayActivity.r().getChildCount() == 0) {
            layoutParams = ocRepayOrderDetailInPalmPayActivity.s().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams2 = marginLayoutParams;
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = 0;
                ocRepayOrderDetailInPalmPayActivity.s().setLayoutParams(marginLayoutParams2);
            }
            layoutParams2 = ocRepayOrderDetailInPalmPayActivity.r().getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams3 = marginLayoutParams;
            }
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.bottomMargin = 0;
                ocRepayOrderDetailInPalmPayActivity.r().setLayoutParams(marginLayoutParams3);
            }
        }
    }
}
