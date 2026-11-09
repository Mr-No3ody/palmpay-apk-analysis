package p310ub;

import Pa.i0;
import Pa.r0;
import Ya.g;
import Z4.e;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentQRBillDetailResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentBillDetailActivity;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;

/* JADX INFO: renamed from: ub.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2067b0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OcInstallmentBillDetailActivity f42825f;

    public C2067b0(OcInstallmentBillDetailActivity ocInstallmentBillDetailActivity) {
        this.f42825f = ocInstallmentBillDetailActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42825f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42825f.showLoadingDialog(false);
        ToastUtils.showLong(message, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:322:0x0504  */
    @Override // Z4.e
    public final void y(Object obj) {
        boolean z3;
        Integer payerAccountType;
        String orderNo;
        String orderStatusDesc;
        String faqLink;
        Long returnPoint;
        Long loyaltyPoint;
        Long taxFee;
        Long payFee;
        Long payAmount;
        Long updateTime;
        Long payAmount2;
        Long taxFee2;
        Long taxFee3;
        Long payFee2;
        Long returnPoint2;
        Long loyaltyPoint2;
        Long orderAmount;
        Long discountAmount;
        Long discountAmount2;
        Long couponAmount;
        Long couponAmount2;
        Integer payerAccountType2;
        Long updateTime2;
        Long createTime;
        OcInstallmentQRBillDetailResp ocInstallmentQRBillDetailResp = (OcInstallmentQRBillDetailResp) obj;
        OcInstallmentBillDetailActivity ocInstallmentBillDetailActivity = this.f42825f;
        boolean z8 = false;
        ocInstallmentBillDetailActivity.showLoadingDialog(false);
        if (ocInstallmentQRBillDetailResp == null || !ocInstallmentQRBillDetailResp.isSuccess()) {
            ocInstallmentBillDetailActivity.showErrorMessageDialog(ocInstallmentQRBillDetailResp != null ? ocInstallmentQRBillDetailResp.getRespMsg() : null);
            return;
        }
        OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData data = ocInstallmentQRBillDetailResp.getData();
        ocInstallmentBillDetailActivity.f29513M = data;
        if (data == null || !i0.W(ocInstallmentBillDetailActivity)) {
            return;
        }
        OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData = ocInstallmentBillDetailActivity.f29513M;
        ModelCopyableText modelCopyableText = ocInstallmentBillDetailActivity.f29519i;
        if (modelCopyableText == null) {
            Intrinsics.n("mTradingNumberTv");
            throw null;
        }
        modelCopyableText.setMessage(ocInstallmentBillDetailActivity.f29515d);
        TextView textView = ocInstallmentBillDetailActivity.f29520j;
        if (textView == null) {
            Intrinsics.n("mOrderDateTv");
            throw null;
        }
        long jLongValue = 0;
        textView.setText(ocInstallmentBillDetailActivity.getString(k.core_transaction_date, r0.Q((ocInstallmentQRBillDetailData == null || (createTime = ocInstallmentQRBillDetailData.getCreateTime()) == null) ? 0L : createTime.longValue())));
        TextView textView2 = ocInstallmentBillDetailActivity.f29521o;
        if (textView2 == null) {
            Intrinsics.n("mPostedDateTv");
            throw null;
        }
        textView2.setText(ocInstallmentBillDetailActivity.getString(k.core_post_date, r0.Q((ocInstallmentQRBillDetailData == null || (updateTime2 = ocInstallmentQRBillDetailData.getUpdateTime()) == null) ? 0L : updateTime2.longValue())));
        ModelTitleContentImg modelTitleContentImg = ocInstallmentBillDetailActivity.f29517f;
        if (modelTitleContentImg == null) {
            Intrinsics.n("mItemPayMethod");
            throw null;
        }
        modelTitleContentImg.setVisibility(0);
        ModelTitleContentImg modelTitleContentImg2 = ocInstallmentBillDetailActivity.f29517f;
        if (modelTitleContentImg2 == null) {
            Intrinsics.n("mItemPayMethod");
            throw null;
        }
        r0.S1(modelTitleContentImg2, (ocInstallmentQRBillDetailData == null || (payerAccountType2 = ocInstallmentQRBillDetailData.getPayerAccountType()) == null) ? 0 : payerAccountType2.intValue(), ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getBankName() : null, ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getBankUrl() : null, ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getPayerCardNo() : null);
        ocInstallmentBillDetailActivity.o().f31471i.setImageResource((ocInstallmentQRBillDetailData == null || !ocInstallmentQRBillDetailData.isMemberType()) ? r.cv_bill_installment2 : r.cv_bill_installment);
        ocInstallmentBillDetailActivity.o().f31467d.setText(ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.symbolAmount() : null);
        OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData2 = ocInstallmentBillDetailActivity.f29513M;
        if (((ocInstallmentQRBillDetailData2 == null || (couponAmount2 = ocInstallmentQRBillDetailData2.getCouponAmount()) == null) ? 0L : couponAmount2.longValue()) > 0) {
            ocInstallmentBillDetailActivity.n().f31437o.setVisibility(0);
            ModelBillDetailTextItem1 modelBillDetailTextItem1 = ocInstallmentBillDetailActivity.n().f31437o;
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData3 = ocInstallmentBillDetailActivity.f29513M;
            modelBillDetailTextItem1.setContent("- " + r0.B((ocInstallmentQRBillDetailData3 == null || (couponAmount = ocInstallmentQRBillDetailData3.getCouponAmount()) == null) ? 0L : couponAmount.longValue(), true));
        } else {
            ocInstallmentBillDetailActivity.n().f31437o.setVisibility(8);
        }
        OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData4 = ocInstallmentBillDetailActivity.f29513M;
        if (((ocInstallmentQRBillDetailData4 == null || (discountAmount2 = ocInstallmentQRBillDetailData4.getDiscountAmount()) == null) ? 0L : discountAmount2.longValue()) > 0) {
            ocInstallmentBillDetailActivity.n().f31438p.setVisibility(0);
            ModelBillDetailTextItem1 modelBillDetailTextItem2 = ocInstallmentBillDetailActivity.n().f31438p;
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData5 = ocInstallmentBillDetailActivity.f29513M;
            modelBillDetailTextItem2.setContent("- " + r0.B((ocInstallmentQRBillDetailData5 == null || (discountAmount = ocInstallmentQRBillDetailData5.getDiscountAmount()) == null) ? 0L : discountAmount.longValue(), true));
        } else {
            ocInstallmentBillDetailActivity.n().f31438p.setVisibility(8);
        }
        ocInstallmentBillDetailActivity.n().f31430c.f31455d.setText(r0.B((ocInstallmentQRBillDetailData == null || (orderAmount = ocInstallmentQRBillDetailData.getOrderAmount()) == null) ? 0L : orderAmount.longValue(), false));
        if (((ocInstallmentQRBillDetailData == null || (loyaltyPoint2 = ocInstallmentQRBillDetailData.getLoyaltyPoint()) == null) ? 0L : loyaltyPoint2.longValue()) > 0) {
            ocInstallmentBillDetailActivity.n().f31433f.setVisibility(0);
            ocInstallmentBillDetailActivity.n().f31433f.f31455d.setText("- P " + (ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getLoyaltyPoint() : null));
        } else {
            ocInstallmentBillDetailActivity.n().f31433f.setVisibility(8);
        }
        if (((ocInstallmentQRBillDetailData == null || (returnPoint2 = ocInstallmentQRBillDetailData.getReturnPoint()) == null) ? 0L : returnPoint2.longValue()) > 0) {
            ocInstallmentBillDetailActivity.n().f31434g.setVisibility(0);
            ocInstallmentBillDetailActivity.n().f31434g.f31455d.setText("P " + (ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getReturnPoint() : null));
        } else {
            ocInstallmentBillDetailActivity.n().f31434g.setVisibility(8);
        }
        OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData6 = ocInstallmentBillDetailActivity.f29513M;
        if ((ocInstallmentQRBillDetailData6 != null ? ocInstallmentQRBillDetailData6.getBusinessDiscountAmount() : 0L) > 0) {
            ModelBillDetailTextItem1 mItemPayShopCoupon = ocInstallmentBillDetailActivity.n().f31439v;
            Intrinsics.checkNotNullExpressionValue(mItemPayShopCoupon, "mItemPayShopCoupon");
            h.C(mItemPayShopCoupon);
            ModelBillDetailTextItem1 modelBillDetailTextItem3 = ocInstallmentBillDetailActivity.n().f31439v;
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData7 = ocInstallmentBillDetailActivity.f29513M;
            modelBillDetailTextItem3.setContent("- " + r0.B(ocInstallmentQRBillDetailData7 != null ? ocInstallmentQRBillDetailData7.getBusinessDiscountAmount() : 0L, true));
        } else {
            ModelBillDetailTextItem1 mItemPayShopCoupon2 = ocInstallmentBillDetailActivity.n().f31439v;
            Intrinsics.checkNotNullExpressionValue(mItemPayShopCoupon2, "mItemPayShopCoupon");
            h.c(mItemPayShopCoupon2);
        }
        ModelBillDetailTextItem1 modelBillDetailTextItem4 = ocInstallmentBillDetailActivity.n().f31436j;
        long grantAwardValue = ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getGrantAwardValue() : 0L;
        if (grantAwardValue > 0) {
            Intrinsics.e(modelBillDetailTextItem4);
            h.C(modelBillDetailTextItem4);
            TextView textView3 = modelBillDetailTextItem4.f31455d;
            textView3.setText(grantAwardValue + "MB");
            textView3.setTextColor(Color.parseColor("#FFAA0C"));
        } else {
            Intrinsics.e(modelBillDetailTextItem4);
            h.c(modelBillDetailTextItem4);
        }
        ocInstallmentBillDetailActivity.n().f31432e.setVisibility(8);
        long jLongValue2 = ((ocInstallmentQRBillDetailData == null || (payFee2 = ocInstallmentQRBillDetailData.getPayFee()) == null) ? 0L : payFee2.longValue()) + ((ocInstallmentQRBillDetailData == null || (taxFee3 = ocInstallmentQRBillDetailData.getTaxFee()) == null) ? 0L : taxFee3.longValue());
        Long lValueOf = Long.valueOf(jLongValue2);
        if (jLongValue2 <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue3 = lValueOf.longValue();
            ocInstallmentBillDetailActivity.n().f31432e.setVisibility(0);
            ocInstallmentBillDetailActivity.n().f31432e.f31455d.setText(r0.B(jLongValue3, false));
            ocInstallmentBillDetailActivity.n().f31432e.setTips(r0.W(ocInstallmentBillDetailActivity, (ocInstallmentQRBillDetailData == null || (taxFee2 = ocInstallmentQRBillDetailData.getTaxFee()) == null) ? 0L : taxFee2.longValue()));
        }
        ocInstallmentBillDetailActivity.n().f31440w.f31455d.setText(r0.B((ocInstallmentQRBillDetailData == null || (payAmount2 = ocInstallmentQRBillDetailData.getPayAmount()) == null) ? 0L : payAmount2.longValue(), false));
        ocInstallmentBillDetailActivity.o().f31468e.setText(ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getOrderStatusDesc() : null);
        ocInstallmentBillDetailActivity.o().f31468e.setTextColor(-1);
        if (!TextUtils.isEmpty(ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getErrorMsg() : null)) {
            LinearLayout linearLayout = ocInstallmentBillDetailActivity.f29523v;
            if (linearLayout == null) {
                Intrinsics.n("mErrorReasonArea");
                throw null;
            }
            linearLayout.setVisibility(0);
            TextView textView4 = ocInstallmentBillDetailActivity.f29508A;
            if (textView4 == null) {
                Intrinsics.n("mErrorReasonTv");
                throw null;
            }
            textView4.setText(ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getErrorMsg() : null);
        }
        Integer orderStatus = ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getOrderStatus() : null;
        if ((orderStatus != null && orderStatus.intValue() == 0) || ((orderStatus != null && orderStatus.intValue() == 5) || ((orderStatus != null && orderStatus.intValue() == 8) || ((orderStatus != null && orderStatus.intValue() == 9) || ((orderStatus != null && orderStatus.intValue() == 10) || (orderStatus != null && orderStatus.intValue() == 11)))))) {
            ModelTitleContentImg modelTitleContentImg3 = ocInstallmentBillDetailActivity.f29517f;
            if (modelTitleContentImg3 == null) {
                Intrinsics.n("mItemPayMethod");
                throw null;
            }
            modelTitleContentImg3.d();
            ModelTitleContentImg modelTitleContentImg4 = ocInstallmentBillDetailActivity.f29518g;
            if (modelTitleContentImg4 == null) {
                Intrinsics.n("mItemBillType");
                throw null;
            }
            modelTitleContentImg4.d();
            ocInstallmentBillDetailActivity.n().d();
            RelativeLayout relativeLayout = ocInstallmentBillDetailActivity.f29524w;
            if (relativeLayout == null) {
                Intrinsics.n("mContactServiceArea");
                throw null;
            }
            relativeLayout.setVisibility(0);
        } else if ((orderStatus == null || orderStatus.intValue() != 1) && ((orderStatus == null || orderStatus.intValue() != 7) && ((orderStatus != null && orderStatus.intValue() == 3) || (orderStatus != null && orderStatus.intValue() == 6)))) {
            ocInstallmentBillDetailActivity.findViewById(p025ba.e.lhtidp_root).setVisibility(8);
        }
        ReportTransactionItem reportTransactionItem = ocInstallmentBillDetailActivity.f29512L;
        if (reportTransactionItem == null) {
            Intrinsics.n("mReportItem");
            throw null;
        }
        String string = ocInstallmentBillDetailActivity.getString(k.core_email_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        if (ocInstallmentBillDetailActivity.f29513M != null) {
            orderInfoForCustomerService.paymentType = ocInstallmentBillDetailActivity.getString(k.core_instalment);
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData8 = ocInstallmentBillDetailActivity.f29513M;
            orderInfoForCustomerService.time = (ocInstallmentQRBillDetailData8 == null || (updateTime = ocInstallmentQRBillDetailData8.getUpdateTime()) == null) ? 0L : updateTime.longValue();
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData9 = ocInstallmentBillDetailActivity.f29513M;
            orderInfoForCustomerService.amount = (ocInstallmentQRBillDetailData9 == null || (payAmount = ocInstallmentQRBillDetailData9.getPayAmount()) == null) ? 0L : payAmount.longValue();
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData10 = ocInstallmentBillDetailActivity.f29513M;
            orderInfoForCustomerService.fee = (ocInstallmentQRBillDetailData10 == null || (payFee = ocInstallmentQRBillDetailData10.getPayFee()) == null) ? 0L : payFee.longValue();
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData11 = ocInstallmentBillDetailActivity.f29513M;
            String str = "";
            if (ocInstallmentQRBillDetailData11 == null || (orderNo = ocInstallmentQRBillDetailData11.getOrderNo()) == null) {
                orderNo = "";
            }
            orderInfoForCustomerService.orderNumber = orderNo;
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData12 = ocInstallmentBillDetailActivity.f29513M;
            if (ocInstallmentQRBillDetailData12 == null || (orderStatusDesc = ocInstallmentQRBillDetailData12.getOrderStatusDesc()) == null) {
                orderStatusDesc = "";
            }
            orderInfoForCustomerService.orderStatus = orderStatusDesc;
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData13 = ocInstallmentBillDetailActivity.f29513M;
            orderInfoForCustomerService.vat = (ocInstallmentQRBillDetailData13 == null || (taxFee = ocInstallmentQRBillDetailData13.getTaxFee()) == null) ? 0L : taxFee.longValue();
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData14 = ocInstallmentBillDetailActivity.f29513M;
            orderInfoForCustomerService.pointsUsed = (ocInstallmentQRBillDetailData14 == null || (loyaltyPoint = ocInstallmentQRBillDetailData14.getLoyaltyPoint()) == null) ? 0L : loyaltyPoint.longValue();
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData15 = ocInstallmentBillDetailActivity.f29513M;
            if (ocInstallmentQRBillDetailData15 != null && (returnPoint = ocInstallmentQRBillDetailData15.getReturnPoint()) != null) {
                jLongValue = returnPoint.longValue();
            }
            orderInfoForCustomerService.pointsEarned = jLongValue;
            OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData16 = ocInstallmentBillDetailActivity.f29513M;
            if (ocInstallmentQRBillDetailData16 != null && (faqLink = ocInstallmentQRBillDetailData16.getFaqLink()) != null) {
                str = faqLink;
            }
            orderInfoForCustomerService.faqUrl = str;
            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_INSTALMENT_PAYMENT;
            ModelTitleContentImg modelTitleContentImg5 = ocInstallmentBillDetailActivity.f29517f;
            if (modelTitleContentImg5 == null) {
                Intrinsics.n("mItemPayMethod");
                throw null;
            }
            orderInfoForCustomerService.paymentMethod = modelTitleContentImg5.f31588d.getText().toString();
        }
        reportTransactionItem.a(string, orderInfoForCustomerService);
        View view = ocInstallmentBillDetailActivity.mPaymentPlanView;
        if (view == null) {
            Intrinsics.n("mPaymentPlanView");
            throw null;
        }
        if (((ocInstallmentQRBillDetailData == null || (payerAccountType = ocInstallmentQRBillDetailData.getPayerAccountType()) == null) ? 0 : payerAccountType.intValue()) != 36) {
            z3 = false;
        } else {
            if (ocInstallmentQRBillDetailData != null && ocInstallmentQRBillDetailData.isCustomerType()) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        h.s(view, z3);
        TextView textView5 = ocInstallmentBillDetailActivity.f29511H;
        if (textView5 == null) {
            Intrinsics.n("mPaymentPlanNum");
            throw null;
        }
        textView5.setText(ocInstallmentBillDetailActivity.getString(g.cs_pay_in_s, ocInstallmentQRBillDetailData != null ? ocInstallmentQRBillDetailData.getInstallmentsNumber() : null));
        if (ocInstallmentQRBillDetailData != null && ocInstallmentQRBillDetailData.isCustomerType()) {
            ocInstallmentBillDetailActivity.o().f31466c.setText(ocInstallmentBillDetailActivity.getString(k.core_to, ocInstallmentQRBillDetailData.getMerchantName()));
            return;
        }
        if (ocInstallmentQRBillDetailData != null && ocInstallmentQRBillDetailData.isMemberType()) {
            z8 = true;
        }
        if (z8) {
            ocInstallmentBillDetailActivity.o().f31466c.setText(ocInstallmentBillDetailActivity.getString(k.core_received_from, ocInstallmentQRBillDetailData.getMemberName()));
        }
    }
}
