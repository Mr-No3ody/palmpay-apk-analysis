package V9;

import C9.V;
import Fe.C0254b;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.firebase.perf.util.Constants;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.contacts.bean.req.AddRelationShipReq;
import com.transsnet.palmpay.contacts.bean.resp.QueryRecipientRelationshipListResp;
import com.transsnet.palmpay.contacts.ui.activity.AddContactActivity;
import com.transsnet.palmpay.contacts.ui.activity.AddNewFaveActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactMenuActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactSearchOrScanResultActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.activity.SetContactRemarkActivity;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.PaymentMethodResp;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.CoreCommentResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.core.bean.rsp.PayMerchantOrderAddRsp;
import com.transsnet.palmpay.core.bean.rsp.PayMoneyToPalmpayBusinessDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.PayPalmPayBusinessOrderAddRsp;
import com.transsnet.palmpay.core.bean.rsp.UssdListRsp;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.core.dialog.CommentTicketDialog;
import com.transsnet.palmpay.core.service.RequestContactDeleteService;
import com.transsnet.palmpay.core.ui.activity.CoreCommentActivity;
import com.transsnet.palmpay.core.ui.activity.CoreUssdListActivity;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.credit.bean.resp.CLBillDetailData;
import com.transsnet.palmpay.credit.bean.resp.CLBillDetailResp;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcActivityConfigData;
import com.transsnet.palmpay.credit.bean.resp.OcActivityConfigResp;
import com.transsnet.palmpay.credit.bean.resp.OcAutoRepaymentData;
import com.transsnet.palmpay.credit.bean.resp.OcAutoRepaymentListResp;
import com.transsnet.palmpay.credit.contract.MobileContactListContract$IView;
import com.transsnet.palmpay.credit.ui.activity.MonoConnectActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLAutoRepaymentExplainActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailMoreActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLDoubleResultRetainDialog;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.device.ui.activity.DeviceDetail2Activity;
import com.transsnet.palmpay.jara_packet.bean.resp.CommissionDetailsResp;
import com.transsnet.palmpay.jara_packet.ui.activity.JaraCommissionDetailActivity;
import com.transsnet.palmpay.main.export.bean.rsp.AutoDeductOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.CommissionOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantOrderDetailRsp;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherResp;
import com.transsnet.palmpay.send_money.bean.QueryRecordResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBizConfigResp;
import com.transsnet.palmpay.send_money.contract.CollectMoneyResultContract$IView;
import com.transsnet.palmpay.send_money.contract.MoneyTransferRecordContract$IView;
import com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;
import com.transsnet.palmpay.ui.activity.autodecuct.AutoDeductOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.bankcard.SetRepaymentDefaultCardActivity;
import com.transsnet.palmpay.ui.activity.detail.CommissionDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.MerchantOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.OfflineQrPaymenttDetailActivity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessPreviewActivity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessResultActivity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPartnerPreviewActivity;
import com.transsnet.palmpay.ui.activity.qr.QrCodePayMoneyFragment;
import com.transsnet.palmpay.ui.activity.settings.AboutActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p052da.f0;

/* JADX INFO: renamed from: V9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0714c extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10192g;

    public /* synthetic */ C0714c(Object obj, int i7) {
        this.f10191f = i7;
        this.f10192g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void R(Object obj) {
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        CommissionDetailActivity commissionDetailActivity = (CommissionDetailActivity) this.f10192g;
        commissionDetailActivity.showLoadingDialog(false);
        if (!commonBeanResult.isSuccess()) {
            CommissionDetailActivity.m(commissionDetailActivity, commonBeanResult.getRespMsg());
            return;
        }
        CommissionOrderDetailRsp commissionOrderDetailRsp = (CommissionOrderDetailRsp) commonBeanResult.data;
        if (commissionOrderDetailRsp == null) {
            int i7 = CommissionDetailActivity.f34675w;
            return;
        }
        commissionDetailActivity.f34677b.f31471i.setImageResource(com.transsnet.palmpay.custom_view.r.cv_bill_default_icon);
        commissionDetailActivity.f34677b.f31466c.setText(Ac.h.main_from_palmpay);
        commissionDetailActivity.f34677b.f31467d.setText("+" + r0.A(commissionOrderDetailRsp.commissionCash));
        commissionDetailActivity.f34677b.f31468e.setText(p025ba.k.core_completed);
        commissionDetailActivity.f34678c.f31454c.setText(p025ba.k.core_amount);
        commissionDetailActivity.f34678c.f31454c.setAllCaps(true);
        commissionDetailActivity.f34678c.f31455d.setText(r0.B(commissionOrderDetailRsp.commissionCash, true));
        commissionDetailActivity.f34678c.f31454c.setTextColor(commissionDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
        commissionDetailActivity.f34678c.f31455d.setTextColor(commissionDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
        commissionDetailActivity.f34679d.f31454c.setText(Ac.h.main_commission_cash);
        commissionDetailActivity.f34679d.f31454c.setAllCaps(true);
        commissionDetailActivity.f34679d.f31455d.setText(r0.B(commissionOrderDetailRsp.commissionCash, true));
        commissionDetailActivity.f34680e.f31454c.setText(Ac.h.main_commission_points);
        commissionDetailActivity.f34680e.f31454c.setAllCaps(true);
        commissionDetailActivity.f34680e.f31455d.setText(r0.x0(commissionOrderDetailRsp.commissionPoints));
        commissionDetailActivity.f34680e.f31455d.setTextColor(commissionDetailActivity.getResources().getColor(L6.b.ppColorError));
        commissionDetailActivity.f34681f.f31454c.setText(p025ba.k.core_total);
        commissionDetailActivity.f34681f.f31454c.setAllCaps(true);
        commissionDetailActivity.f34681f.f31454c.setTextColor(commissionDetailActivity.getResources().getColor(L6.b.ppColorPrimary));
        commissionDetailActivity.f34681f.f31455d.setTextColor(commissionDetailActivity.getResources().getColor(L6.b.ppColorPrimary));
        commissionDetailActivity.f34681f.f31455d.setText(r0.B(commissionOrderDetailRsp.commissionCash, true));
        commissionDetailActivity.f34682g.f31587c.setText(p025ba.k.core_payment_type);
        String str = commissionOrderDetailRsp.paymentType;
        commissionDetailActivity.t = str;
        if (TransType.TRANS_TYPE_P2P_CASH_IN.equals(str)) {
            commissionDetailActivity.f34682g.f31588d.setText(p025ba.k.core_p2p_cash_in);
        } else if (TransType.TRANS_TYPE_P2P_CASH_OUT.equals(commissionOrderDetailRsp.paymentType)) {
            commissionDetailActivity.f34682g.f31588d.setText(p025ba.k.core_p2p_cash_out);
        } else if (TransType.TRANS_TYPE_MERCHANT_PAYMENT.equals(commissionOrderDetailRsp.paymentType)) {
            commissionDetailActivity.f34682g.f31588d.setText(Ac.h.main_merchant_payment);
        }
        commissionDetailActivity.f34683i.f31587c.setText(Ac.h.main_transaction_location);
        if (TextUtils.isEmpty(commissionOrderDetailRsp.tradeAddress)) {
            commissionDetailActivity.f34683i.setVisibility(8);
        } else {
            commissionDetailActivity.f34683i.f31588d.setText(commissionOrderDetailRsp.tradeAddress);
        }
        String str2 = commissionOrderDetailRsp.referenceNumber;
        commissionDetailActivity.f34687v = str2;
        commissionDetailActivity.f34684j.setMessage(str2);
        commissionDetailActivity.f34685o.setText(commissionDetailActivity.getString(p025ba.k.core_create_time_s, r0.R(commissionOrderDetailRsp.createTime)));
        commissionDetailActivity.f34686p.setText(commissionDetailActivity.getString(p025ba.k.core_transaction_date, r0.R(commissionOrderDetailRsp.transactionTime)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void S(Object obj) {
        int i7 = 1;
        boolean z3 = false;
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        MerchantOrderDetailActivity merchantOrderDetailActivity = (MerchantOrderDetailActivity) this.f10192g;
        merchantOrderDetailActivity.showLoadingDialog(false);
        if (!commonBeanResult.isSuccess()) {
            MerchantOrderDetailActivity.m(merchantOrderDetailActivity, commonBeanResult.getRespMsg());
            return;
        }
        MerchantOrderDetailRsp merchantOrderDetailRsp = (MerchantOrderDetailRsp) commonBeanResult.data;
        int i10 = MerchantOrderDetailActivity.f34703Q;
        if (merchantOrderDetailRsp == null) {
            return;
        }
        if (TransType.TRANS_SCENE_REFUND.equalsIgnoreCase(merchantOrderDetailRsp.orderType)) {
            merchantOrderDetailActivity.f34711b.f31471i.setImageResource(com.transsnet.palmpay.custom_view.r.cv_palmpay_icon_circle_purple);
            merchantOrderDetailActivity.f34711b.f31466c.setText(Ac.h.main_from_palmpay);
            merchantOrderDetailActivity.f34711b.f31467d.setText("+" + r0.A(merchantOrderDetailRsp.payAmount));
            merchantOrderDetailActivity.f34712c.f31454c.setText(p025ba.k.core_amount);
            merchantOrderDetailActivity.f34712c.f31455d.setText(r0.B((long) merchantOrderDetailRsp.orderAmount, true));
            if (merchantOrderDetailRsp.orderStatus == 5) {
                merchantOrderDetailActivity.f34711b.f31468e.setText(p025ba.k.core_failed);
                merchantOrderDetailActivity.f34712c.d();
            } else {
                merchantOrderDetailActivity.f34711b.f31468e.setText(p025ba.k.core_completed);
                merchantOrderDetailActivity.f34712c.f31454c.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                merchantOrderDetailActivity.f34712c.f31455d.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
            }
            if (!TextUtils.isEmpty(merchantOrderDetailRsp.orderDesc)) {
                merchantOrderDetailActivity.f34711b.f31468e.setText(merchantOrderDetailRsp.orderDesc);
            }
            merchantOrderDetailActivity.f34713d.setVisibility(8);
            merchantOrderDetailActivity.f34714e.setVisibility(8);
            merchantOrderDetailActivity.f34715f.setVisibility(8);
            merchantOrderDetailActivity.f34716g.setVisibility(8);
            merchantOrderDetailActivity.f34719o.setVisibility(8);
            merchantOrderDetailActivity.f34718j.f31587c.setText(p025ba.k.core_payment_type);
            merchantOrderDetailActivity.f34718j.f31588d.setText(p025ba.k.core_refund);
            merchantOrderDetailActivity.f34722w.setVisibility(0);
            String str = merchantOrderDetailRsp.refundOrderId;
            if (!TextUtils.isEmpty(str)) {
                merchantOrderDetailActivity.f34722w.setText(new SpanUtils().append(merchantOrderDetailActivity.getString(p025ba.k.core_original_reference_no)).setForegroundColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorTextDisable)).append(merchantOrderDetailRsp.refundOrderId).setForegroundColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorPrimary)).create());
                merchantOrderDetailActivity.f34722w.setOnClickListener(new V(merchantOrderDetailActivity, 14, str, z3));
            }
            merchantOrderDetailActivity.f34720p.setMessage(merchantOrderDetailRsp.orderNo);
            merchantOrderDetailActivity.t.setText(merchantOrderDetailActivity.getString(p025ba.k.core_post_date, r0.Q(merchantOrderDetailRsp.createTime)));
            merchantOrderDetailActivity.f34721v.setText(merchantOrderDetailActivity.getString(p025ba.k.core_transaction_date, r0.Q(merchantOrderDetailRsp.updateTime)));
            merchantOrderDetailActivity.f34711b.t.setVisibility(0);
            return;
        }
        if (TextUtils.isEmpty(merchantOrderDetailRsp.merchantLogoUrl)) {
            merchantOrderDetailActivity.f34711b.f31471i.setImageResource(com.transsnet.palmpay.custom_view.r.cv_default_merchat);
        } else {
            com.bumptech.glide.b.f(merchantOrderDetailActivity.f34711b.f31471i).load(Uri.parse(merchantOrderDetailRsp.merchantLogoUrl)).a(((G1.d) ((G1.d) new G1.d().I(new com.bumptech.glide.load.resource.bitmap.i(), true)).j(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).x(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).S(merchantOrderDetailActivity.f34711b.f31471i);
        }
        merchantOrderDetailActivity.f34711b.f31466c.setText(merchantOrderDetailRsp.merchantName);
        merchantOrderDetailActivity.f34711b.f31467d.setText("-" + r0.A(merchantOrderDetailRsp.payAmount));
        merchantOrderDetailActivity.f34711b.f31468e.setText(merchantOrderDetailRsp.orderStatusDesc);
        merchantOrderDetailActivity.f34712c.f31454c.setText(p025ba.k.core_amount);
        merchantOrderDetailActivity.f34712c.f31455d.setText(r0.B(merchantOrderDetailRsp.orderAmount, true));
        merchantOrderDetailActivity.f34712c.f31454c.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
        merchantOrderDetailActivity.f34712c.f31455d.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
        merchantOrderDetailActivity.f34713d.f31454c.setText(p025ba.k.core_fee);
        merchantOrderDetailActivity.f34713d.f31454c.setAllCaps(true);
        merchantOrderDetailActivity.f34713d.f31455d.setText(r0.B(merchantOrderDetailRsp.payerFee + merchantOrderDetailRsp.payerVat, true));
        merchantOrderDetailActivity.f34713d.setTips(r0.W(merchantOrderDetailActivity, merchantOrderDetailRsp.payerVat));
        merchantOrderDetailActivity.f34713d.setVisibility(merchantOrderDetailRsp.payerFee + merchantOrderDetailRsp.payerVat > 0 ? 0 : 8);
        merchantOrderDetailActivity.f34714e.f31454c.setText(p025ba.k.core_points_used);
        merchantOrderDetailActivity.f34714e.f31454c.setAllCaps(true);
        merchantOrderDetailActivity.f34714e.f31455d.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorError));
        merchantOrderDetailActivity.f34714e.f31455d.setText(r0.x0(merchantOrderDetailRsp.loyaltyPoint));
        merchantOrderDetailActivity.f34714e.setVisibility(merchantOrderDetailRsp.loyaltyPoint > 0 ? 0 : 8);
        merchantOrderDetailActivity.f34715f.f31454c.setText(p025ba.k.core_points_earned);
        merchantOrderDetailActivity.f34715f.f31454c.setAllCaps(true);
        merchantOrderDetailActivity.f34715f.f31455d.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorError));
        merchantOrderDetailActivity.f34715f.f31455d.setText(r0.x0(merchantOrderDetailRsp.returnPoint));
        merchantOrderDetailActivity.f34715f.setVisibility(merchantOrderDetailRsp.returnPoint > 0 ? 0 : 8);
        merchantOrderDetailActivity.f34704A.f31454c.setText(p025ba.k.core_coupon);
        merchantOrderDetailActivity.f34704A.f31454c.setAllCaps(true);
        if (merchantOrderDetailRsp.couponAmount > 0) {
            merchantOrderDetailActivity.f34704A.setVisibility(0);
            merchantOrderDetailActivity.f34704A.f31455d.setText(r0.B(merchantOrderDetailRsp.couponAmount, true));
            merchantOrderDetailActivity.f34704A.setRemark(merchantOrderDetailActivity.getResources().getString(p025ba.k.core_id_with_colon, merchantOrderDetailRsp.couponId));
        }
        merchantOrderDetailActivity.f34716g.f31454c.setText(p025ba.k.core_total);
        merchantOrderDetailActivity.f34716g.f31454c.setAllCaps(true);
        merchantOrderDetailActivity.f34716g.f31454c.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorPrimary));
        merchantOrderDetailActivity.f34716g.f31455d.setTextColor(merchantOrderDetailActivity.getResources().getColor(L6.b.ppColorPrimary));
        merchantOrderDetailActivity.f34716g.f31455d.setText(r0.B(merchantOrderDetailRsp.totalAmount, true));
        int i11 = merchantOrderDetailRsp.orderStatus;
        if (i11 == 5 || i11 == 4) {
            merchantOrderDetailActivity.f34717i.setVisibility(0);
            merchantOrderDetailActivity.f34717i.f31587c.setText(p025ba.k.core_refund);
            merchantOrderDetailActivity.f34717i.f31588d.setText(merchantOrderDetailRsp.orderStatus == 4 ? p025ba.k.core_success : p025ba.k.core_failed);
        }
        merchantOrderDetailActivity.f34718j.f31587c.setText(p025ba.k.core_payment_type);
        merchantOrderDetailActivity.f34718j.f31588d.setText(Ac.h.main_merchant_payment);
        merchantOrderDetailActivity.f34719o.f31587c.setText(p025ba.k.core_pay_method);
        r0.S1(merchantOrderDetailActivity.f34719o, merchantOrderDetailRsp.payerAccountType, merchantOrderDetailRsp.bankName, merchantOrderDetailRsp.bankUrl, merchantOrderDetailRsp.payerCardNo);
        merchantOrderDetailActivity.f34720p.setMessage(merchantOrderDetailRsp.orderNo);
        merchantOrderDetailActivity.t.setText(merchantOrderDetailActivity.getString(p025ba.k.core_post_date, r0.Q(merchantOrderDetailRsp.createTime)));
        merchantOrderDetailActivity.f34721v.setText(merchantOrderDetailActivity.getString(p025ba.k.core_transaction_date, r0.Q(merchantOrderDetailRsp.updateTime)));
        int i12 = merchantOrderDetailRsp.orderStatus;
        if (i12 == 3 || i12 == 6) {
            merchantOrderDetailActivity.f34712c.d();
            merchantOrderDetailActivity.f34713d.d();
            merchantOrderDetailActivity.f34714e.d();
            merchantOrderDetailActivity.f34715f.d();
            merchantOrderDetailActivity.f34716g.d();
            merchantOrderDetailActivity.f34719o.d();
            merchantOrderDetailActivity.f34718j.d();
        }
        if (!TextUtils.isEmpty(merchantOrderDetailRsp.errorMessage) && merchantOrderDetailRsp.orderStatus == 3) {
            merchantOrderDetailActivity.f34706C.setText(merchantOrderDetailRsp.errorMessage);
            merchantOrderDetailActivity.f34705B.setVisibility(0);
        }
        if (merchantOrderDetailRsp.orderStatus == 3) {
            merchantOrderDetailActivity.f34707H.setVisibility(0);
            merchantOrderDetailActivity.f34708L.setOnClickListener(new p160ke.e(merchantOrderDetailActivity, i7));
        }
        if ("pending".equalsIgnoreCase(merchantOrderDetailRsp.orderStatusDesc)) {
            merchantOrderDetailActivity.f34709M.setVisibility(8);
        }
        if ("Complete".equalsIgnoreCase(merchantOrderDetailRsp.orderStatusDesc) || "Completed".equalsIgnoreCase(merchantOrderDetailRsp.orderStatusDesc) || "Fail".equalsIgnoreCase(merchantOrderDetailRsp.orderStatusDesc) || "Failed".equalsIgnoreCase(merchantOrderDetailRsp.orderStatusDesc)) {
            merchantOrderDetailActivity.f34711b.t.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T(Object obj) {
        PayMoneyToPalmpayBusinessDetailRsp payMoneyToPalmpayBusinessDetailRsp = (PayMoneyToPalmpayBusinessDetailRsp) ((CommonBeanResult) obj).data;
        OfflineQrPaymenttDetailActivity offlineQrPaymenttDetailActivity = (OfflineQrPaymenttDetailActivity) this.f10192g;
        offlineQrPaymenttDetailActivity.f34730i = payMoneyToPalmpayBusinessDetailRsp;
        if (payMoneyToPalmpayBusinessDetailRsp != null && i0.W(offlineQrPaymenttDetailActivity)) {
            offlineQrPaymenttDetailActivity.f34726d.setMessage(offlineQrPaymenttDetailActivity.f34730i.orderId);
            offlineQrPaymenttDetailActivity.f34727e.setText(offlineQrPaymenttDetailActivity.getString(p025ba.k.core_transaction_date, r0.Q(offlineQrPaymenttDetailActivity.f34730i.createTime)));
            offlineQrPaymenttDetailActivity.f34728f.setText(offlineQrPaymenttDetailActivity.getString(p025ba.k.core_post_date, r0.Q(offlineQrPaymenttDetailActivity.f34730i.createTime)));
            offlineQrPaymenttDetailActivity.f34729g.f31430c.setContent(r0.A(offlineQrPaymenttDetailActivity.f34730i.amount));
            offlineQrPaymenttDetailActivity.f34729g.f31440w.setContent(r0.A(offlineQrPaymenttDetailActivity.f34730i.amount));
            TextView textView = offlineQrPaymenttDetailActivity.f34729g.f31432e.f31455d;
            PayMoneyToPalmpayBusinessDetailRsp payMoneyToPalmpayBusinessDetailRsp2 = offlineQrPaymenttDetailActivity.f34730i;
            textView.setText(r0.B(payMoneyToPalmpayBusinessDetailRsp2.payFee + payMoneyToPalmpayBusinessDetailRsp2.taxFee, false));
            offlineQrPaymenttDetailActivity.f34729g.f31432e.setTips(r0.W(offlineQrPaymenttDetailActivity, offlineQrPaymenttDetailActivity.f34730i.taxFee));
            offlineQrPaymenttDetailActivity.f34729g.f31433f.setContent("P " + offlineQrPaymenttDetailActivity.f34730i.deductPoint);
            offlineQrPaymenttDetailActivity.f34729g.f31434g.setContent("P " + offlineQrPaymenttDetailActivity.f34730i.redeemPoint);
            if (offlineQrPaymenttDetailActivity.f34730i.couponAmount > 0) {
                offlineQrPaymenttDetailActivity.f34729g.f31437o.setVisibility(0);
                offlineQrPaymenttDetailActivity.f34729g.f31437o.setContent("- " + r0.B(offlineQrPaymenttDetailActivity.f34730i.couponAmount, true));
            } else {
                offlineQrPaymenttDetailActivity.f34729g.f31437o.setVisibility(8);
            }
            long j6 = offlineQrPaymenttDetailActivity.f34730i.discountAmount;
            if (j6 > 0) {
                offlineQrPaymenttDetailActivity.f34729g.f31438p.setContent(r0.A(j6));
                offlineQrPaymenttDetailActivity.f34729g.f31438p.setVisibility(0);
            } else {
                offlineQrPaymenttDetailActivity.f34729g.f31438p.setVisibility(8);
            }
            offlineQrPaymenttDetailActivity.f34725c.f31588d.setText(p025ba.k.core_pay_to_palmpaybusiness);
            offlineQrPaymenttDetailActivity.f34724b.f31468e.setText(offlineQrPaymenttDetailActivity.f34730i.orderStatusDesc);
            String balanceAccountId = BaseApplication.getInstance().getUser().getBalanceAccountId();
            if (TextUtils.isEmpty(balanceAccountId) || !balanceAccountId.equals(offlineQrPaymenttDetailActivity.f34730i.recipientAccountId)) {
                offlineQrPaymenttDetailActivity.f34724b.f31467d.setText("-" + r0.A(offlineQrPaymenttDetailActivity.f34730i.payAmount));
                offlineQrPaymenttDetailActivity.f34729g.f31440w.setContent(r0.A(offlineQrPaymenttDetailActivity.f34730i.payAmount));
                TextView textView2 = offlineQrPaymenttDetailActivity.f34724b.f31466c;
                int i7 = p025ba.k.core_to_s;
                PayMoneyToPalmpayBusinessDetailRsp payMoneyToPalmpayBusinessDetailRsp3 = offlineQrPaymenttDetailActivity.f34730i;
                textView2.setText(offlineQrPaymenttDetailActivity.getString(i7, payMoneyToPalmpayBusinessDetailRsp3.recipientFirstName, i0.n(i0.D(payMoneyToPalmpayBusinessDetailRsp3.recipientPhone), false)));
            } else {
                offlineQrPaymenttDetailActivity.f34724b.f31467d.setText("+" + r0.A(offlineQrPaymenttDetailActivity.f34730i.recipientAmount));
                offlineQrPaymenttDetailActivity.f34729g.f31440w.setContent(r0.A(offlineQrPaymenttDetailActivity.f34730i.recipientAmount));
                TextView textView3 = offlineQrPaymenttDetailActivity.f34724b.f31466c;
                int i10 = p025ba.k.core_from_s;
                PayMoneyToPalmpayBusinessDetailRsp payMoneyToPalmpayBusinessDetailRsp4 = offlineQrPaymenttDetailActivity.f34730i;
                textView3.setText(offlineQrPaymenttDetailActivity.getString(i10, payMoneyToPalmpayBusinessDetailRsp4.senderNickname, i0.n(i0.D(payMoneyToPalmpayBusinessDetailRsp4.senderPhone), false)));
            }
            if ("fail".equalsIgnoreCase(offlineQrPaymenttDetailActivity.f34730i.orderStatusDesc) || TransferByLoanResult.STATUS_FAILED.equalsIgnoreCase(offlineQrPaymenttDetailActivity.f34730i.orderStatusDesc)) {
                ReportTransactionItem reportTransactionItem = offlineQrPaymenttDetailActivity.f34731j;
                OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                orderInfoForCustomerService.paymentType = offlineQrPaymenttDetailActivity.getString(p025ba.k.core_fund);
                PayMoneyToPalmpayBusinessDetailRsp payMoneyToPalmpayBusinessDetailRsp5 = offlineQrPaymenttDetailActivity.f34730i;
                orderInfoForCustomerService.time = payMoneyToPalmpayBusinessDetailRsp5.createTime;
                orderInfoForCustomerService.amount = payMoneyToPalmpayBusinessDetailRsp5.payAmount;
                orderInfoForCustomerService.fee = payMoneyToPalmpayBusinessDetailRsp5.payFee;
                orderInfoForCustomerService.orderNumber = payMoneyToPalmpayBusinessDetailRsp5.orderId;
                orderInfoForCustomerService.orderStatus = payMoneyToPalmpayBusinessDetailRsp5.orderStatusDesc;
                orderInfoForCustomerService.vat = payMoneyToPalmpayBusinessDetailRsp5.taxFee;
                orderInfoForCustomerService.pointsUsed = payMoneyToPalmpayBusinessDetailRsp5.deductPoint;
                orderInfoForCustomerService.pointsEarned = payMoneyToPalmpayBusinessDetailRsp5.redeemPoint;
                reportTransactionItem.setEmailData(orderInfoForCustomerService);
            }
        }
        offlineQrPaymenttDetailActivity.showLoadingDialog(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void U(Object obj) {
        String str;
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        if (commonBeanResult == null) {
            return;
        }
        if (!commonBeanResult.isSuccess()) {
            ToastUtils.showShort(commonBeanResult.getRespMsg());
            return;
        }
        PayMoneyToPalmpayBusinessDetailRsp payMoneyToPalmpayBusinessDetailRsp = (PayMoneyToPalmpayBusinessDetailRsp) commonBeanResult.data;
        PayMoneyToPalmPayBusinessResultActivity payMoneyToPalmPayBusinessResultActivity = (PayMoneyToPalmPayBusinessResultActivity) this.f10192g;
        payMoneyToPalmPayBusinessResultActivity.f34837L = payMoneyToPalmpayBusinessDetailRsp;
        if (payMoneyToPalmpayBusinessDetailRsp == null || !i0.W(payMoneyToPalmPayBusinessResultActivity)) {
            return;
        }
        PayMoneyToPalmpayBusinessDetailRsp payMoneyToPalmpayBusinessDetailRsp2 = payMoneyToPalmPayBusinessResultActivity.f34837L;
        ((TextView) payMoneyToPalmPayBusinessResultActivity.t.f42647d).setText(r0.B(payMoneyToPalmpayBusinessDetailRsp2.amount, true));
        ((TextView) payMoneyToPalmPayBusinessResultActivity.f34849p.f42647d).setText(i0.k(payMoneyToPalmPayBusinessResultActivity.f34837L.recipientFirstName + " " + payMoneyToPalmPayBusinessResultActivity.f34837L.recipientLastName, payMoneyToPalmpayBusinessDetailRsp2.recipientPhone));
        ((TextView) payMoneyToPalmPayBusinessResultActivity.f34850v.f42647d).setText(payMoneyToPalmpayBusinessDetailRsp2.orderId);
        int i7 = payMoneyToPalmpayBusinessDetailRsp2.sendAccountType;
        if (i7 == 1) {
            ModelPaymentMethodItem modelPaymentMethodItem = payMoneyToPalmPayBusinessResultActivity.f34844f;
            String string = payMoneyToPalmPayBusinessResultActivity.getString(p025ba.k.core_palmpay_payment_name);
            TextView textView = modelPaymentMethodItem.f28396d;
            if (textView != null) {
                textView.setText(string);
            }
        } else if (i7 == 5 || i7 == 6) {
            ModelPaymentMethodItem modelPaymentMethodItem2 = payMoneyToPalmPayBusinessResultActivity.f34844f;
            String str2 = payMoneyToPalmpayBusinessDetailRsp2.senderBankName;
            String str3 = payMoneyToPalmpayBusinessDetailRsp2.senderBankCard;
            if (TextUtils.isEmpty(str3)) {
                str = "";
            } else {
                str = "(**** " + r0.f0(str3) + ")";
            }
            TextView textView2 = modelPaymentMethodItem2.f28395c;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            TextView textView3 = modelPaymentMethodItem2.f28396d;
            if (textView3 != null) {
                textView3.setText(str);
            }
        } else if (i7 == 8 || i7 == 13) {
            ModelPaymentMethodItem modelPaymentMethodItem3 = payMoneyToPalmPayBusinessResultActivity.f34844f;
            String string2 = payMoneyToPalmPayBusinessResultActivity.getResources().getString(p025ba.k.core_mobile_wallet);
            TextView textView4 = modelPaymentMethodItem3.f28396d;
            if (textView4 != null) {
                textView4.setText(string2);
            }
        } else {
            payMoneyToPalmPayBusinessResultActivity.f34844f.setVisibility(8);
        }
        int i10 = payMoneyToPalmpayBusinessDetailRsp2.orderStatus;
        if (i10 == 5) {
            payMoneyToPalmPayBusinessResultActivity.f34845g.g(payMoneyToPalmPayBusinessResultActivity.getResources().getString(p025ba.k.core_pay_palmpay_business_success));
            payMoneyToPalmPayBusinessResultActivity.f34839a.setText(p025ba.k.core_complete);
            payMoneyToPalmPayBusinessResultActivity.f34846i.setVisibility(0);
            payMoneyToPalmPayBusinessResultActivity.f34847j.setVisibility(0);
            payMoneyToPalmPayBusinessResultActivity.f34848o.setVisibility(0);
            return;
        }
        if (i10 != 15) {
            payMoneyToPalmPayBusinessResultActivity.f34845g.d(payMoneyToPalmPayBusinessResultActivity.getResources().getString(p025ba.k.core_topup_airtime_fail));
            payMoneyToPalmPayBusinessResultActivity.f34839a.setText(p025ba.k.core_try_again);
            payMoneyToPalmPayBusinessResultActivity.f34847j.setVisibility(8);
        } else {
            payMoneyToPalmPayBusinessResultActivity.f34845g.e(payMoneyToPalmPayBusinessResultActivity.f34833A, payMoneyToPalmPayBusinessResultActivity.f34851w);
            payMoneyToPalmPayBusinessResultActivity.f34839a.setText("Complete");
            payMoneyToPalmPayBusinessResultActivity.f34847j.setVisibility(0);
        }
    }

    private final void V(Object obj) {
        List<PaymentMethod> list;
        PaymentMethodResp paymentMethodResp = (PaymentMethodResp) obj;
        QrCodePayMoneyFragment qrCodePayMoneyFragment = (QrCodePayMoneyFragment) this.f10192g;
        if (!paymentMethodResp.isSuccess() || (list = paymentMethodResp.data) == null) {
            qrCodePayMoneyFragment.showLoadingDialog(false);
            ToastUtils.showLong(paymentMethodResp.getRespMsg());
            return;
        }
        qrCodePayMoneyFragment.f34887M = list;
        Iterator<PaymentMethod> it = list.iterator();
        while (it.hasNext()) {
            PaymentMethod next = it.next();
            if (next.payType == 2 && next.reUseable == 0) {
                it.remove();
            }
        }
        Intrinsics.checkNotNullParameter("main_sp_qr_default_pm_accountid", "key");
        String string = SPUtils.getInstance(p059e1.a.G("main_sp_qr_default_pm_accountid")).getString(p367ya.a.d().e("main_sp_qr_default_pm_accountid"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        PaymentMethod paymentMethod = null;
        if (TextUtils.isEmpty(string)) {
            List<PaymentMethod> list2 = qrCodePayMoneyFragment.f34887M;
            if (list2 != null && !list2.isEmpty()) {
                for (PaymentMethod paymentMethod2 : list2) {
                    if (paymentMethod2.senderAccountType == 1) {
                        paymentMethod = paymentMethod2;
                        break;
                    }
                }
            }
            qrCodePayMoneyFragment.f34888Q = paymentMethod;
        } else {
            List list3 = qrCodePayMoneyFragment.f34887M;
            if (list3 != null && !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        paymentMethod = (PaymentMethod) list3.get(0);
                        break;
                    }
                    PaymentMethod paymentMethod3 = (PaymentMethod) it2.next();
                    if (string.equals(paymentMethod3.accountId)) {
                        paymentMethod = paymentMethod3;
                        break;
                    }
                }
            }
            qrCodePayMoneyFragment.f34888Q = paymentMethod;
        }
        PaymentMethod paymentMethod4 = qrCodePayMoneyFragment.f34888Q;
        if (paymentMethod4 == null) {
            qrCodePayMoneyFragment.showLoadingDialog(false);
        } else {
            qrCodePayMoneyFragment.t.setPaymentMethod(paymentMethod4);
            qrCodePayMoneyFragment.u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W(Object obj) {
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        JaraCommissionDetailActivity jaraCommissionDetailActivity = (JaraCommissionDetailActivity) this.f10192g;
        jaraCommissionDetailActivity.showLoadingDialog(false);
        if (!commonBeanResult.isSuccess()) {
            JaraCommissionDetailActivity.m(jaraCommissionDetailActivity, commonBeanResult.getRespMsg());
            return;
        }
        CommissionDetailsResp commissionDetailsResp = (CommissionDetailsResp) commonBeanResult.data;
        if (commissionDetailsResp == null) {
            int i7 = JaraCommissionDetailActivity.f31847j;
            return;
        }
        jaraCommissionDetailActivity.f31849b.f31471i.setImageResource(com.transsnet.palmpay.custom_view.r.cv_bill_default_icon);
        jaraCommissionDetailActivity.f31849b.f31466c.setText(p236pc.f.jp_earnings);
        jaraCommissionDetailActivity.f31849b.f31467d.setText(r0.y(commissionDetailsResp.getTotalCommission()));
        jaraCommissionDetailActivity.f31849b.f31468e.setText(p025ba.k.core_completed);
        jaraCommissionDetailActivity.f31850c.f31454c.setText(p025ba.k.core_amount);
        jaraCommissionDetailActivity.f31850c.f31454c.setAllCaps(true);
        jaraCommissionDetailActivity.f31850c.f31455d.setText(r0.B(commissionDetailsResp.getTotalCommission(), true));
        jaraCommissionDetailActivity.f31850c.f31454c.setTextColor(jaraCommissionDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
        jaraCommissionDetailActivity.f31850c.f31455d.setTextColor(jaraCommissionDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
        jaraCommissionDetailActivity.f31851d.f31587c.setText(p025ba.k.core_payment_type);
        jaraCommissionDetailActivity.f31851d.f31588d.setText(p025ba.k.core_jara_packet);
        jaraCommissionDetailActivity.f31852e.setText(new SpanUtils().append(jaraCommissionDetailActivity.getString(p236pc.f.jp_original_record)).setForegroundColor(jaraCommissionDetailActivity.getColor(L6.b.ppColorTextDisable)).append(" ").append(jaraCommissionDetailActivity.getString(p236pc.f.jp_receive_jara_history)).setForegroundColor(jaraCommissionDetailActivity.getColor(L6.b.ppColorPrimary)).create());
        jaraCommissionDetailActivity.f31853f.setText(jaraCommissionDetailActivity.getString(p025ba.k.core_reference_no, String.valueOf(commissionDetailsResp.getRewardsBillNo())));
        jaraCommissionDetailActivity.f31854g.setText(jaraCommissionDetailActivity.getString(p025ba.k.core_post_date, r0.R(commissionDetailsResp.getTransationBeginTime())));
        jaraCommissionDetailActivity.f31855i.setText(jaraCommissionDetailActivity.getString(p025ba.k.core_transaction_date, r0.R(commissionDetailsResp.getTransationEndTime())));
    }

    private final void X(Object obj) {
        CLCurrentBillResp cLCurrentBillResp = (CLCurrentBillResp) obj;
        CLBillDetailActivity cLBillDetailActivity = (CLBillDetailActivity) this.f10192g;
        cLBillDetailActivity.showLoadingDialog(false);
        if (cLCurrentBillResp == null || !cLCurrentBillResp.isSuccess() || cLCurrentBillResp.getData() == null) {
            ToastUtils.showShort(cLCurrentBillResp != null ? cLCurrentBillResp.getRespMsg() : null, new Object[0]);
        } else {
            cLBillDetailActivity.f28814G0 = cLCurrentBillResp.getData();
            cLBillDetailActivity.v();
        }
    }

    @Override // Z4.e, io.reactivex.Observer
    public void onComplete() {
        switch (this.f10191f) {
            case 12:
                super.onComplete();
                ((DeviceDetail2Activity) this.f10192g).showLoadingDialog(false);
                break;
            default:
                super.onComplete();
                break;
        }
    }

    @Override // Z4.e, io.reactivex.Observer
    public void onError(Throwable th) {
        switch (this.f10191f) {
            case 21:
                super.onError(th);
                ToastUtils.showShort(th.getMessage());
                break;
            default:
                super.onError(th);
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        BaseFragment baseFragment;
        switch (this.f10191f) {
            case 0:
                ((AddContactActivity) this.f10192g).addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((AddNewFaveActivity) this.f10192g).addSubscription(d2);
                break;
            case 2:
                ((ContactMenuActivity) this.f10192g).addSubscription(d2);
                break;
            case 3:
                ((SetContactRemarkActivity) this.f10192g).addSubscription(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "disposable");
                ((EditBeneficiaryActivity) this.f10192g).addSubscription(d2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CoreCommentActivity) this.f10192g).addSubscription(d2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CoreUssdListActivity) this.f10192g).addSubscription(d2);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLDoubleResultRetainDialog) this.f10192g).addSubscription(d2);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((RepayRemindDialog) this.f10192g).addSubscription(d2);
                break;
            case 9:
                ((AutoDeductOrderDetailActivity) this.f10192g).addSubscription(d2);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(d2, "d");
                WeakReference weakReference = ((p129ib.m) this.f10192g).f37482a;
                if (weakReference != null && (baseFragment = (BaseFragment) weakReference.get()) != null) {
                    baseFragment.f(d2);
                    break;
                }
                break;
            case 11:
                ((SetRepaymentDefaultCardActivity) this.f10192g).addSubscription(d2);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((DeviceDetail2Activity) this.f10192g).addSubscription(d2);
                break;
            case 13:
                ((CommissionDetailActivity) this.f10192g).addSubscription(d2);
                break;
            case 14:
                ((MerchantOrderDetailActivity) this.f10192g).addSubscription(d2);
                break;
            case 15:
                ((OfflineQrPaymenttDetailActivity) this.f10192g).addSubscription(d2);
                break;
            case 16:
                ((p235pb.h) this.f10192g).addSubscription(d2);
                break;
            case 17:
                ((p255qd.a) this.f10192g).addSubscription(d2);
                break;
            case 18:
                ((p255qd.g) this.f10192g).addSubscription(d2);
                break;
            case 19:
                ((p255qd.v) this.f10192g).addSubscription(d2);
                break;
            case 20:
                ((PayMoneyToPalmPayBusinessPreviewActivity) this.f10192g).addSubscription(d2);
                break;
            case 21:
                ((PayMoneyToPalmPayBusinessResultActivity) this.f10192g).addSubscription(d2);
                break;
            case 22:
                ((PayMoneyToPartnerPreviewActivity) this.f10192g).addSubscription(d2);
                break;
            case 23:
                ((QrCodePayMoneyFragment) this.f10192g).f(d2);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((MonoConnectActivity) this.f10192g).addSubscription(d2);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((JaraCommissionDetailActivity) this.f10192g).addSubscription(d2);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((AboutActivity) this.f10192g).f34944b = d2;
                break;
            case 27:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLAutoRepaymentExplainActivity) this.f10192g).addSubscription(d2);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLBillDetailActivity) this.f10192g).addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLBillDetailMoreActivity) this.f10192g).addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        Object obj = this.f10192g;
        switch (this.f10191f) {
            case 0:
                ((AddContactActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                ((AddNewFaveActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 2:
                ((ContactMenuActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 3:
                ((SetContactRemarkActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            case 5:
                ((CoreCommentActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 6:
                CoreUssdListActivity coreUssdListActivity = (CoreUssdListActivity) obj;
                coreUssdListActivity.showLoadingDialog(false);
                int i7 = CoreUssdListActivity.f27608d;
                SwipeRecyclerView swipeRecyclerViewM = coreUssdListActivity.m();
                if (swipeRecyclerViewM != null) {
                    swipeRecyclerViewM.setRefreshing(false);
                }
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(message, "message");
                androidx.camera.core.impl.utils.n.u(message);
                BaseChainResponsibilityDialog nextChain = ((CLDoubleResultRetainDialog) obj).getNextChain();
                if (nextChain != null) {
                    nextChain.handlerChain();
                }
                break;
            case 8:
                androidx.camera.core.impl.utils.n.u(message);
                ((RepayRemindDialog) obj).dismiss();
                break;
            case 9:
                AutoDeductOrderDetailActivity autoDeductOrderDetailActivity = (AutoDeductOrderDetailActivity) obj;
                autoDeductOrderDetailActivity.showLoadingDialog(false);
                AutoDeductOrderDetailActivity.m(autoDeductOrderDetailActivity, message);
                break;
            case 10:
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 11:
                ((SetRepaymentDefaultCardActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 12:
                ((DeviceDetail2Activity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 13:
                CommissionDetailActivity commissionDetailActivity = (CommissionDetailActivity) obj;
                commissionDetailActivity.showLoadingDialog(false);
                CommissionDetailActivity.m(commissionDetailActivity, message);
                break;
            case 14:
                MerchantOrderDetailActivity merchantOrderDetailActivity = (MerchantOrderDetailActivity) obj;
                merchantOrderDetailActivity.showLoadingDialog(false);
                MerchantOrderDetailActivity.m(merchantOrderDetailActivity, message);
                break;
            case 15:
                ToastUtils.showShort(message);
                ((OfflineQrPaymenttDetailActivity) obj).showLoadingDialog(false);
                break;
            case 16:
                IBaseView iBaseView = ((p235pb.h) obj).f27351a;
                if (iBaseView != null) {
                    ((MobileContactListContract$IView) iBaseView).showError(message);
                }
                break;
            case 17:
                F6.d.c(message, new Object[0]);
                IBaseView iBaseView2 = ((p255qd.a) obj).f27351a;
                if (iBaseView2 != null) {
                    ((CollectMoneyResultContract$IView) iBaseView2).showApplyVoucherError(message);
                }
                break;
            case 18:
                IBaseView iBaseView3 = ((p255qd.g) obj).f27351a;
                if (iBaseView3 != null) {
                    ((MoneyTransferRecordContract$IView) iBaseView3).showQueryError(message);
                }
                break;
            case 19:
                F6.d.c(message, new Object[0]);
                IBaseView iBaseView4 = ((p255qd.v) obj).f27351a;
                if (iBaseView4 != null) {
                    ((TransferToMobileContract$IView) iBaseView4).showQueryMemberDetailError(message);
                }
                break;
            case 20:
                ((PayMoneyToPalmPayBusinessPreviewActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 21:
                ToastUtils.showShort(message);
                break;
            case 22:
                ((PayMoneyToPartnerPreviewActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 23:
                ((QrCodePayMoneyFragment) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(message, "message");
                MonoConnectActivity monoConnectActivity = (MonoConnectActivity) obj;
                monoConnectActivity.finish();
                monoConnectActivity.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                JaraCommissionDetailActivity jaraCommissionDetailActivity = (JaraCommissionDetailActivity) obj;
                jaraCommissionDetailActivity.showLoadingDialog(false);
                JaraCommissionDetailActivity.m(jaraCommissionDetailActivity, message);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(message, "message");
                ((CLBillDetailActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ((CLBillDetailMoreActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        List<T> data;
        OcActivityConfigData data2;
        Boolean hasAvailableCoupon;
        List<OcAutoRepaymentData> data3;
        Long managementFee;
        Long paidExtensionServiceFee;
        Integer loanType;
        Long discountInterestSum;
        Long paidServiceFee;
        Long unpaidServiceFee;
        Double interestRatio;
        Integer loanDays;
        Long managementFee2;
        Long loanAmount;
        Long managementFee3;
        Integer reductionWay;
        Long totalAmount;
        Long paidExtensionServiceFee2;
        Long discountInterestSum2;
        Long paidPenalty;
        Long unpaidPenalty;
        Long paidServiceFee2;
        Long unpaidServiceFee2;
        Long paidInterest;
        Long unpaidInterest;
        Long loanAmount2;
        String string = "";
        int i7 = 8;
        String channelName = null;
        boolean zBooleanValue = false;
        zBooleanValue = false;
        zBooleanValue = false;
        Object obj2 = this.f10192g;
        switch (this.f10191f) {
            case 0:
                PalmPayContactQueryResp palmPayContactQueryResp = (PalmPayContactQueryResp) obj;
                AddContactActivity addContactActivity = (AddContactActivity) obj2;
                addContactActivity.showLoadingDialog(false);
                if (!palmPayContactQueryResp.isSuccess()) {
                    ToastUtils.showLong(palmPayContactQueryResp.getRespMsg());
                    return;
                }
                if (palmPayContactQueryResp.getData() != null) {
                    if (palmPayContactQueryResp.getData().isFriend()) {
                        ContactProfileActivity.n(addContactActivity, palmPayContactQueryResp.getData());
                        return;
                    }
                    PalmPayContact data4 = palmPayContactQueryResp.getData();
                    data4.setRequestSource("2");
                    int i10 = ContactSearchOrScanResultActivity.f27183i;
                    addContactActivity.startActivity(new Intent(addContactActivity, (Class<?>) ContactSearchOrScanResultActivity.class).putExtra("contact", data4));
                    return;
                }
                int i11 = AddContactActivity.f27130j;
                ViewStub viewStub = (ViewStub) addContactActivity.findViewById(R9.d.no_search_result_stub);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                if (addContactActivity.f27137i == null) {
                    addContactActivity.f27137i = (ViewGroup) addContactActivity.findViewById(R9.d.no_search_result_view);
                }
                ViewGroup viewGroup = addContactActivity.f27137i;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    return;
                }
                return;
            case 1:
                CommonListResultV2 response = (CommonListResultV2) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccess() || (data = response.data) == 0) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(data, "data");
                int i12 = AddNewFaveActivity.f27138o;
                AddNewFaveActivity addNewFaveActivity = (AddNewFaveActivity) obj2;
                if (!data.isEmpty()) {
                    Bc.i iVar = addNewFaveActivity.f27145j;
                    if (iVar != null) {
                        ((FlexboxLayout) iVar.f730i).removeAllViews();
                    }
                    int size = data.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        QueryRecipientRelationshipListResp queryRecipientRelationshipListResp = (QueryRecipientRelationshipListResp) data.get(i13);
                        TextView textView = new TextView(addNewFaveActivity);
                        textView.setLayoutParams(new FlexboxLayout.LayoutParams(DensityUtil.dp2px(65.0f), DensityUtil.dp2px(26.0f)));
                        textView.setBackgroundResource(R9.c.ct_common_relationship_bg);
                        textView.setTextColor(addNewFaveActivity.getResources().getColorStateList(R9.b.ct_relationship_select_color));
                        textView.setGravity(17);
                        textView.setText(queryRecipientRelationshipListResp.relationshipName);
                        textView.setTag(Integer.valueOf(queryRecipientRelationshipListResp.relationship));
                        textView.setTextSize(1, 12.0f);
                        textView.setOnClickListener(new ViewOnClickListenerC0715d(addNewFaveActivity, zBooleanValue ? 1 : 0));
                        Bc.i iVar2 = addNewFaveActivity.f27145j;
                        if (iVar2 != null) {
                            ((FlexboxLayout) iVar2.f730i).addView(textView);
                        }
                    }
                }
                if (TextUtils.isEmpty(addNewFaveActivity.f27142f)) {
                    return;
                }
                PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) addNewFaveActivity.l();
                AddRelationShipReq req = new AddRelationShipReq();
                req.phone = addNewFaveActivity.f27142f;
                req.bindingmemberid = addNewFaveActivity.f27141e;
                palmPayFriendsViewModel.getClass();
                Intrinsics.checkNotNullParameter(req, "req");
                p140j8.f.s(palmPayFriendsViewModel, new Z9.l(req, null), palmPayFriendsViewModel.f27305i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            case 2:
                CommonResult commonResult = (CommonResult) obj;
                ContactMenuActivity contactMenuActivity = (ContactMenuActivity) obj2;
                contactMenuActivity.showLoadingDialog(false);
                if (!commonResult.isSuccess()) {
                    ToastUtils.showLong(commonResult.getRespMsg());
                    return;
                }
                RequestContact requestContact = new RequestContact();
                requestContact.setMemberId(p367ya.a.d().i());
                requestContact.setContactsMemberId(contactMenuActivity.f27166c.getContactsMemberId());
                contactMenuActivity.startService(new Intent(contactMenuActivity, (Class<?>) RequestContactDeleteService.class).putExtra("contact_info", ((Gson) C0525w.f().f7166b).toJson(requestContact)));
                if (ActivityUtils.isActivityExistsInStack((Class<?>) PalmPayContactsListActivity.class)) {
                    ActivityUtils.finishToActivity((Class<?>) PalmPayContactsListActivity.class, false);
                    return;
                } else {
                    ARouter.getInstance().build("/main/home").navigation(contactMenuActivity);
                    return;
                }
            case 3:
                PalmPayContactQueryResp palmPayContactQueryResp2 = (PalmPayContactQueryResp) obj;
                SetContactRemarkActivity setContactRemarkActivity = (SetContactRemarkActivity) obj2;
                setContactRemarkActivity.showLoadingDialog(false);
                if (!palmPayContactQueryResp2.isSuccess()) {
                    ToastUtils.showLong(palmPayContactQueryResp2.getRespMsg());
                    return;
                } else {
                    org.greenrobot.eventbus.c.b().f(palmPayContactQueryResp2.getData());
                    setContactRemarkActivity.finish();
                    return;
                }
            case 4:
                CommonResult response2 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                if (response2.isSuccess()) {
                    p367ya.a.d().f44149a.k("key_notification", true);
                    return;
                }
                return;
            case 5:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                CoreCommentActivity coreCommentActivity = (CoreCommentActivity) obj2;
                coreCommentActivity.showLoadingDialog(false);
                if (commonBeanResult != null) {
                    if (commonBeanResult.isSuccess()) {
                        CoreCommentResp coreCommentResp = (CoreCommentResp) commonBeanResult.data;
                        CommentTicketDialog commentTicketDialog = new CommentTicketDialog(coreCommentActivity, coreCommentResp.tips, coreCommentResp.image);
                        commentTicketDialog.show();
                        commentTicketDialog.setOnDismissListener(new Dd.b(coreCommentActivity, 21));
                        return;
                    }
                    com.transsnet.palmpay.custom_view.dialog.t tVar = new com.transsnet.palmpay.custom_view.dialog.t(coreCommentActivity);
                    tVar.a();
                    tVar.f31304c = commonBeanResult.getRespMsg();
                    int i14 = p025ba.k.core_confirm;
                    tVar.f31312k = null;
                    tVar.f31305d = tVar.f31302a.getString(i14);
                    tVar.d(0);
                    return;
                }
                return;
            case 6:
                CommonListResultV2 response3 = (CommonListResultV2) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                CoreUssdListActivity coreUssdListActivity = (CoreUssdListActivity) obj2;
                coreUssdListActivity.showLoadingDialog(false);
                if (response3.isSuccess()) {
                    List<T> list = response3.data;
                    if (list != 0) {
                        f0 f0Var = coreUssdListActivity.f27611c;
                        if (f0Var != null) {
                            if (list.isEmpty()) {
                                f0Var.f4985b = list;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                int size2 = list.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    if (!Intrinsics.c(((UssdListRsp) list.get(i15)).getChannelName(), channelName)) {
                                        channelName = ((UssdListRsp) list.get(i15)).getChannelName();
                                        arrayList.add(new UssdListRsp("", ((UssdListRsp) list.get(i15)).getChannelUrl(), ((UssdListRsp) list.get(i15)).getChannelName(), ""));
                                    }
                                    arrayList.add(list.get(i15));
                                }
                                f0Var.f4985b = arrayList;
                            }
                        }
                        f0 f0Var2 = coreUssdListActivity.f27611c;
                        if (f0Var2 != null) {
                            f0Var2.notifyDataSetChanged();
                        }
                    }
                } else {
                    ToastUtils.showLong(response3.getRespMsg(), new Object[0]);
                }
                int i16 = CoreUssdListActivity.f27608d;
                SwipeRecyclerView swipeRecyclerViewM = coreUssdListActivity.m();
                if (swipeRecyclerViewM != null) {
                    swipeRecyclerViewM.setRefreshing(false);
                    return;
                }
                return;
            case 7:
                OcActivityConfigResp ocActivityConfigResp = (OcActivityConfigResp) obj;
                if (ocActivityConfigResp != null && (data2 = ocActivityConfigResp.getData()) != null && (hasAvailableCoupon = data2.getHasAvailableCoupon()) != null) {
                    zBooleanValue = hasAvailableCoupon.booleanValue();
                }
                CLDoubleResultRetainDialog cLDoubleResultRetainDialog = (CLDoubleResultRetainDialog) obj2;
                if (zBooleanValue) {
                    cLDoubleResultRetainDialog.interceptChain();
                    return;
                }
                BaseChainResponsibilityDialog nextChain = cLDoubleResultRetainDialog.getNextChain();
                if (nextChain != null) {
                    nextChain.handlerChain();
                    return;
                }
                return;
            case 8:
                CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
                ((RepayRemindDialog) obj2).updateView(commonBeanResult2 != null ? (CouponItem) commonBeanResult2.data : null);
                return;
            case 9:
                CommonBeanResult commonBeanResult3 = (CommonBeanResult) obj;
                AutoDeductOrderDetailActivity autoDeductOrderDetailActivity = (AutoDeductOrderDetailActivity) obj2;
                autoDeductOrderDetailActivity.showLoadingDialog(false);
                if (!commonBeanResult3.isSuccess()) {
                    AutoDeductOrderDetailActivity.m(autoDeductOrderDetailActivity, commonBeanResult3.getRespMsg());
                    return;
                }
                AutoDeductOrderDetailRsp autoDeductOrderDetailRsp = (AutoDeductOrderDetailRsp) commonBeanResult3.data;
                autoDeductOrderDetailActivity.f34613b.f31471i.setImageResource(com.transsnet.palmpay.custom_view.r.cv_default_merchat);
                autoDeductOrderDetailActivity.f34614c.f31454c.setText(p025ba.k.core_amount);
                autoDeductOrderDetailActivity.f34615d.f31454c.setText(p025ba.k.core_fee);
                autoDeductOrderDetailActivity.f34616e.f31454c.setText(p025ba.k.core_vat);
                autoDeductOrderDetailActivity.f34617f.f31454c.setText(p025ba.k.core_points_used);
                autoDeductOrderDetailActivity.f34618g.f31454c.setText(p025ba.k.core_points_earned);
                autoDeductOrderDetailActivity.f34619i.f31454c.setText(p025ba.k.core_total);
                autoDeductOrderDetailActivity.f34619i.f31454c.setAllCaps(true);
                autoDeductOrderDetailActivity.f34619i.f31454c.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorPrimary));
                autoDeductOrderDetailActivity.f34619i.f31455d.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorPrimary));
                autoDeductOrderDetailActivity.f34620j.f31587c.setText(p025ba.k.core_payment_type);
                autoDeductOrderDetailActivity.f34620j.f31588d.setText(Ac.h.main_auto_deduct);
                autoDeductOrderDetailActivity.f34621o.f31587c.setText(p025ba.k.core_pay_method);
                if (autoDeductOrderDetailRsp == null) {
                    return;
                }
                if (TextUtils.isEmpty(autoDeductOrderDetailRsp.payId) ? false : autoDeductOrderDetailRsp.payId.startsWith("3600")) {
                    autoDeductOrderDetailActivity.f34615d.setVisibility(8);
                    autoDeductOrderDetailActivity.f34616e.setVisibility(8);
                    autoDeductOrderDetailActivity.f34617f.setVisibility(8);
                    autoDeductOrderDetailActivity.f34618g.setVisibility(8);
                    autoDeductOrderDetailActivity.f34619i.setVisibility(8);
                    com.bumptech.glide.b.f(autoDeductOrderDetailActivity.f34613b.f31471i).load(new MerchantLogo(autoDeductOrderDetailRsp.merchantNo)).a(((G1.d) ((G1.d) new G1.d().I(new com.bumptech.glide.load.resource.bitmap.i(), true)).j(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).x(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).S(autoDeductOrderDetailActivity.f34613b.f31471i);
                    autoDeductOrderDetailActivity.f34620j.f31588d.setText(autoDeductOrderDetailActivity.getString(Ac.h.main_auto_deduct) + " " + autoDeductOrderDetailActivity.getString(p025ba.k.core_refund).toLowerCase());
                    TextView textView2 = autoDeductOrderDetailActivity.f34613b.f31466c;
                    StringBuilder sb2 = new StringBuilder("From ");
                    sb2.append(autoDeductOrderDetailRsp.merchantName);
                    textView2.setText(sb2.toString());
                    autoDeductOrderDetailActivity.f34613b.f31467d.setText("+" + r0.A(autoDeductOrderDetailRsp.payAmount));
                    TextView textView3 = autoDeductOrderDetailActivity.f34613b.f31468e;
                    int i17 = autoDeductOrderDetailRsp.orderStatus;
                    if (i17 == 2) {
                        string = autoDeductOrderDetailActivity.getString(p025ba.k.core_completed);
                    } else if (i17 == 3 || i17 == 5 || i17 == 4) {
                        string = autoDeductOrderDetailActivity.getString(p025ba.k.core_failed);
                    } else if (i17 == 1 || i17 == 0) {
                        string = autoDeductOrderDetailActivity.getString(p025ba.k.core_pending);
                    }
                    textView3.setText(string);
                    autoDeductOrderDetailActivity.f34614c.f31455d.setText(r0.B(autoDeductOrderDetailRsp.payAmount, true));
                    autoDeductOrderDetailActivity.f34614c.f31454c.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                    autoDeductOrderDetailActivity.f34614c.f31455d.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                    autoDeductOrderDetailActivity.f34621o.f31588d.setText(p025ba.k.core_palmpay_payment_name);
                    autoDeductOrderDetailActivity.f34621o.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_small);
                    autoDeductOrderDetailActivity.f34623v.setVisibility(0);
                    String str = autoDeductOrderDetailRsp.refundOrderId;
                    if (!TextUtils.isEmpty(str)) {
                        autoDeductOrderDetailActivity.f34623v.setText(new SpanUtils().append(autoDeductOrderDetailActivity.getString(p025ba.k.core_original_reference_no)).setForegroundColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorTextDisable)).append(autoDeductOrderDetailRsp.refundOrderId).setForegroundColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorPrimary)).create());
                        autoDeductOrderDetailActivity.f34623v.setOnClickListener(new p054dd.n(i7, autoDeductOrderDetailActivity, str));
                    }
                    autoDeductOrderDetailActivity.f34622p.setMessage(autoDeductOrderDetailRsp.orderNo);
                    autoDeductOrderDetailActivity.t.setText(autoDeductOrderDetailActivity.getString(p025ba.k.core_transaction_date, r0.R(autoDeductOrderDetailRsp.updateTime)));
                    autoDeductOrderDetailActivity.f34613b.t.setVisibility(0);
                    return;
                }
                com.bumptech.glide.b.f(autoDeductOrderDetailActivity.f34613b.f31471i).load(new MerchantLogo(autoDeductOrderDetailRsp.merchantNo)).a(((G1.d) ((G1.d) new G1.d().I(new com.bumptech.glide.load.resource.bitmap.i(), true)).j(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).x(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).S(autoDeductOrderDetailActivity.f34613b.f31471i);
                autoDeductOrderDetailActivity.f34613b.f31466c.setText("To " + autoDeductOrderDetailRsp.merchantName);
                autoDeductOrderDetailActivity.f34613b.f31467d.setText("-" + r0.A(autoDeductOrderDetailRsp.payAmount));
                autoDeductOrderDetailActivity.f34613b.f31468e.setText(autoDeductOrderDetailRsp.orderStatusDesc);
                autoDeductOrderDetailActivity.f34614c.f31455d.setText(r0.B((long) autoDeductOrderDetailRsp.orderAmount, true));
                autoDeductOrderDetailActivity.f34614c.f31454c.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                autoDeductOrderDetailActivity.f34614c.f31455d.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                autoDeductOrderDetailActivity.f34615d.f31454c.setAllCaps(true);
                autoDeductOrderDetailActivity.f34615d.f31455d.setText(r0.B(autoDeductOrderDetailRsp.payerFee, true));
                autoDeductOrderDetailActivity.f34615d.setVisibility(autoDeductOrderDetailRsp.payerFee > 0 ? 0 : 8);
                autoDeductOrderDetailActivity.f34616e.f31454c.setAllCaps(true);
                autoDeductOrderDetailActivity.f34616e.f31455d.setText(r0.B(autoDeductOrderDetailRsp.payerVat, true));
                autoDeductOrderDetailActivity.f34616e.setVisibility(autoDeductOrderDetailRsp.payerVat > 0 ? 0 : 8);
                autoDeductOrderDetailActivity.f34617f.f31454c.setAllCaps(true);
                autoDeductOrderDetailActivity.f34617f.f31455d.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorError));
                autoDeductOrderDetailActivity.f34617f.f31455d.setText(r0.x0(autoDeductOrderDetailRsp.loyaltyPoint));
                autoDeductOrderDetailActivity.f34617f.setVisibility(autoDeductOrderDetailRsp.loyaltyPoint > 0 ? 0 : 8);
                autoDeductOrderDetailActivity.f34618g.f31454c.setAllCaps(true);
                autoDeductOrderDetailActivity.f34618g.f31455d.setTextColor(autoDeductOrderDetailActivity.getResources().getColor(L6.b.ppColorError));
                autoDeductOrderDetailActivity.f34618g.f31455d.setText(r0.x0(autoDeductOrderDetailRsp.returnPoint));
                autoDeductOrderDetailActivity.f34618g.setVisibility(autoDeductOrderDetailRsp.returnPoint > 0 ? 0 : 8);
                autoDeductOrderDetailActivity.f34619i.f31455d.setText(r0.B(autoDeductOrderDetailRsp.totalAmount, true));
                int i18 = autoDeductOrderDetailRsp.payerAccountType;
                if (i18 == 1) {
                    autoDeductOrderDetailActivity.f34621o.f31588d.setText(p025ba.k.core_palmpay_payment_name);
                    autoDeductOrderDetailActivity.f34621o.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_small);
                } else if (i18 == 6 || i18 == 5) {
                    String strH = i0.h(autoDeductOrderDetailRsp.bankName, autoDeductOrderDetailRsp.bankCard);
                    if (TextUtils.isEmpty(strH)) {
                        autoDeductOrderDetailActivity.f34621o.f31588d.setText(p025ba.k.core_bank_card);
                        autoDeductOrderDetailActivity.f34621o.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_default_bank_logo);
                    } else {
                        autoDeductOrderDetailActivity.f34621o.f31588d.setText(strH);
                    }
                    if (!TextUtils.isEmpty(autoDeductOrderDetailRsp.bankLogo)) {
                        ModelTitleContentImg modelTitleContentImg = autoDeductOrderDetailActivity.f34621o;
                        com.bumptech.glide.b.e(modelTitleContentImg.f31417a).load(autoDeductOrderDetailRsp.bankLogo).S(modelTitleContentImg.f31589e);
                    }
                } else if (i18 == 28) {
                    i0.h(autoDeductOrderDetailRsp.bankName, autoDeductOrderDetailRsp.bankCard);
                    autoDeductOrderDetailActivity.f34621o.f31588d.setText(p025ba.k.core_ok_card);
                    autoDeductOrderDetailActivity.f34621o.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_ok_card_icon);
                } else {
                    autoDeductOrderDetailActivity.f34621o.setVisibility(8);
                }
                autoDeductOrderDetailActivity.f34622p.setMessage(autoDeductOrderDetailRsp.orderNo);
                autoDeductOrderDetailActivity.t.setText(autoDeductOrderDetailActivity.getString(p025ba.k.core_transaction_date, r0.R(autoDeductOrderDetailRsp.updateTime)));
                int i19 = autoDeductOrderDetailRsp.orderStatus;
                if (i19 == 3 || i19 == 6) {
                    autoDeductOrderDetailActivity.f34614c.d();
                    autoDeductOrderDetailActivity.f34615d.d();
                    autoDeductOrderDetailActivity.f34616e.d();
                    autoDeductOrderDetailActivity.f34617f.d();
                    autoDeductOrderDetailActivity.f34618g.d();
                    autoDeductOrderDetailActivity.f34619i.d();
                    autoDeductOrderDetailActivity.f34621o.d();
                    autoDeductOrderDetailActivity.f34620j.d();
                }
                if ("Complete".equalsIgnoreCase(autoDeductOrderDetailRsp.orderStatusDesc) || "Completed".equalsIgnoreCase(autoDeductOrderDetailRsp.orderStatusDesc) || "Fail".equalsIgnoreCase(autoDeductOrderDetailRsp.orderStatusDesc) || "Failed".equalsIgnoreCase(autoDeductOrderDetailRsp.orderStatusDesc)) {
                    autoDeductOrderDetailActivity.f34613b.t.setVisibility(0);
                }
                autoDeductOrderDetailActivity.f34624w.setMaxList1Size(2);
                autoDeductOrderDetailActivity.f34624w.c(autoDeductOrderDetailRsp.orderStatusInfo);
                return;
            case 10:
                CommonResult response4 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response4, "response");
                if (response4.isSuccess()) {
                    return;
                }
                ToastUtils.showLong(response4.getRespMsg(), new Object[0]);
                return;
            case 11:
                CommonResult commonResult2 = (CommonResult) obj;
                SetRepaymentDefaultCardActivity setRepaymentDefaultCardActivity = (SetRepaymentDefaultCardActivity) obj2;
                setRepaymentDefaultCardActivity.showLoadingDialog(false);
                if (commonResult2.isSuccess()) {
                    ((C0254b) setRepaymentDefaultCardActivity.f27350a).queryLinkBankCardList();
                    return;
                } else {
                    ToastUtils.showLong(commonResult2.getRespMsg());
                    return;
                }
            case 12:
                CommonResult commonResult3 = (CommonResult) obj;
                Intrinsics.e(commonResult3);
                if (!commonResult3.isSuccess()) {
                    ToastUtils.showLong(commonResult3.getRespMsg(), new Object[0]);
                    return;
                }
                DeviceDetail2Activity deviceDetail2Activity = (DeviceDetail2Activity) obj2;
                com.transsnet.palmpay.custom_view.dialog.t tVar2 = new com.transsnet.palmpay.custom_view.dialog.t(deviceDetail2Activity);
                tVar2.b();
                tVar2.c(com.transsnet.palmpay.custom_view.v.cv_operation_success);
                tVar2.f31311j = new Dd.b(deviceDetail2Activity, 26);
                tVar2.d(Constants.MAX_URL_LENGTH);
                return;
            case 13:
                R(obj);
                return;
            case 14:
                S(obj);
                return;
            case 15:
                T(obj);
                return;
            case 16:
                List<PalmPayContact> list2 = (List) obj;
                IBaseView iBaseView = ((p235pb.h) obj2).f27351a;
                if (iBaseView != null) {
                    ((MobileContactListContract$IView) iBaseView).showPhoneContact(list2);
                    return;
                }
                return;
            case 17:
                ApplyVoucherResp applyVoucherResp = (ApplyVoucherResp) obj;
                IBaseView iBaseView2 = ((p255qd.a) obj2).f27351a;
                if (iBaseView2 != null) {
                    ((CollectMoneyResultContract$IView) iBaseView2).showApplyVoucherResult(applyVoucherResp);
                    return;
                }
                return;
            case 18:
                QueryRecordResp queryRecordResp = (QueryRecordResp) obj;
                IBaseView iBaseView3 = ((p255qd.g) obj2).f27351a;
                if (iBaseView3 != null) {
                    ((MoneyTransferRecordContract$IView) iBaseView3).showMoneyTransferRecordList(queryRecordResp);
                    return;
                }
                return;
            case 19:
                CommonBeanResult<TransferBizConfigResp> commonBeanResult4 = (CommonBeanResult) obj;
                IBaseView iBaseView4 = ((p255qd.v) obj2).f27351a;
                if (iBaseView4 != null) {
                    ((TransferToMobileContract$IView) iBaseView4).getTransferConfig(commonBeanResult4);
                    return;
                }
                return;
            case 20:
                CommonBeanResult commonBeanResult5 = (CommonBeanResult) obj;
                PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity = (PayMoneyToPalmPayBusinessPreviewActivity) obj2;
                payMoneyToPalmPayBusinessPreviewActivity.showLoadingDialog(false);
                if (!commonBeanResult5.isSuccess()) {
                    ToastUtils.showLong(commonBeanResult5.getRespMsg());
                    return;
                }
                String str2 = ((PayPalmPayBusinessOrderAddRsp) commonBeanResult5.data).orderId;
                int i20 = PayMoneyToPalmPayBusinessPreviewActivity.f34816C0;
                payMoneyToPalmPayBusinessPreviewActivity.f27793i = str2;
                payMoneyToPalmPayBusinessPreviewActivity.E();
                return;
            case 21:
                U(obj);
                return;
            case 22:
                PayMerchantOrderAddRsp payMerchantOrderAddRsp = (PayMerchantOrderAddRsp) obj;
                PayMoneyToPartnerPreviewActivity payMoneyToPartnerPreviewActivity = (PayMoneyToPartnerPreviewActivity) obj2;
                payMoneyToPartnerPreviewActivity.showLoadingDialog(false);
                if (payMerchantOrderAddRsp.isSuccess()) {
                    String str3 = payMerchantOrderAddRsp.data;
                    int i21 = PayMoneyToPartnerPreviewActivity.f34852B0;
                    payMoneyToPartnerPreviewActivity.f27793i = str3;
                    payMoneyToPartnerPreviewActivity.E();
                    return;
                }
                if (!CommonResult.CODE_POST_PAY_ERROR_ONE.equals(payMerchantOrderAddRsp.getRespCode()) && !CommonResult.CODE_POST_PAY_ERROR_TWO.equals(payMerchantOrderAddRsp.getRespCode()) && !CommonResult.CODE_POST_PAY_ERROR_THREE.equals(payMerchantOrderAddRsp.getRespCode())) {
                    ToastUtils.showLong(payMerchantOrderAddRsp.getRespMsg());
                    return;
                }
                O6.c cVar = new O6.c(payMoneyToPartnerPreviewActivity);
                cVar.f6596b = O6.d.f("");
                cVar.f6598d = payMerchantOrderAddRsp.getRespMsg();
                cVar.f6606l = 8388611;
                cVar.f6600f = payMoneyToPartnerPreviewActivity.getString(p025ba.k.core_confirm);
                cVar.f6602h = null;
                O6.d dVarA = cVar.a();
                dVarA.setCanceledOnTouchOutside(false);
                dVarA.setCancelable(true);
                dVarA.show();
                return;
            case 23:
                V(obj);
                return;
            case 24:
                CommonResult response5 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response5, "response");
                MonoConnectActivity monoConnectActivity = (MonoConnectActivity) obj2;
                monoConnectActivity.showLoadingDialog(false);
                if (!response5.isSuccess()) {
                    p220oa.h.x(monoConnectActivity, response5.getRespMsg());
                    monoConnectActivity.finish();
                    return;
                }
                int i22 = MonoConnectActivity.f28694q0;
                if (Intrinsics.c(monoConnectActivity.f29249C, "oc_use_type_router")) {
                    monoConnectActivity.r();
                    return;
                } else {
                    monoConnectActivity.finish();
                    return;
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                W(obj);
                return;
            case 26:
                ((Boolean) obj).getClass();
                ((AboutActivity) obj2).f34943a = 0;
                return;
            case 27:
                OcAutoRepaymentListResp ocAutoRepaymentListResp = (OcAutoRepaymentListResp) obj;
                if (ocAutoRepaymentListResp == null || !ocAutoRepaymentListResp.isSuccess() || ocAutoRepaymentListResp.getData() == null || (data3 = ocAutoRepaymentListResp.getData()) == null || data3.isEmpty()) {
                    return;
                }
                CLAutoRepaymentExplainActivity cLAutoRepaymentExplainActivity = (CLAutoRepaymentExplainActivity) obj2;
                ArrayList arrayList2 = cLAutoRepaymentExplainActivity.f28802f;
                if (arrayList2 == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                arrayList2.clear();
                ArrayList arrayList3 = cLAutoRepaymentExplainActivity.f28802f;
                if (arrayList3 == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                List<OcAutoRepaymentData> data5 = ocAutoRepaymentListResp.getData();
                Intrinsics.e(data5);
                arrayList3.addAll(data5);
                p351xb.b bVar = cLAutoRepaymentExplainActivity.f28803g;
                if (bVar != null) {
                    bVar.notifyDataSetChanged();
                    return;
                } else {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
            case 28:
                X(obj);
                return;
            default:
                CLBillDetailResp cLBillDetailResp = (CLBillDetailResp) obj;
                CLBillDetailMoreActivity cLBillDetailMoreActivity = (CLBillDetailMoreActivity) obj2;
                cLBillDetailMoreActivity.showLoadingDialog(false);
                if (cLBillDetailResp == null || !cLBillDetailResp.isSuccess() || cLBillDetailResp.getData() == null) {
                    ToastUtils.showShort(cLBillDetailResp != null ? cLBillDetailResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                cLBillDetailMoreActivity.f28865p0 = cLBillDetailResp.getData();
                Object value = cLBillDetailMoreActivity.f28862k0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                TextView textView4 = (TextView) value;
                CLBillDetailData cLBillDetailData = cLBillDetailMoreActivity.f28865p0;
                textView4.setText(r0.B((cLBillDetailData == null || (loanAmount2 = cLBillDetailData.getLoanAmount()) == null) ? 0L : loanAmount2.longValue(), false));
                Object value2 = cLBillDetailMoreActivity.f28854Y.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                TextView textView5 = (TextView) value2;
                CLBillDetailData cLBillDetailData2 = cLBillDetailMoreActivity.f28865p0;
                long jLongValue = (cLBillDetailData2 == null || (unpaidInterest = cLBillDetailData2.getUnpaidInterest()) == null) ? 0L : unpaidInterest.longValue();
                CLBillDetailData cLBillDetailData3 = cLBillDetailMoreActivity.f28865p0;
                textView5.setText(r0.B(jLongValue + ((cLBillDetailData3 == null || (paidInterest = cLBillDetailData3.getPaidInterest()) == null) ? 0L : paidInterest.longValue()), false));
                Object value3 = cLBillDetailMoreActivity.f28852Q.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                TextView textView6 = (TextView) value3;
                CLBillDetailData cLBillDetailData4 = cLBillDetailMoreActivity.f28865p0;
                long jLongValue2 = (cLBillDetailData4 == null || (unpaidServiceFee2 = cLBillDetailData4.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee2.longValue();
                CLBillDetailData cLBillDetailData5 = cLBillDetailMoreActivity.f28865p0;
                textView6.setText(r0.B(jLongValue2 + ((cLBillDetailData5 == null || (paidServiceFee2 = cLBillDetailData5.getPaidServiceFee()) == null) ? 0L : paidServiceFee2.longValue()), false));
                Object value4 = cLBillDetailMoreActivity.f28851M.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                TextView textView7 = (TextView) value4;
                CLBillDetailData cLBillDetailData6 = cLBillDetailMoreActivity.f28865p0;
                long jLongValue3 = (cLBillDetailData6 == null || (unpaidPenalty = cLBillDetailData6.getUnpaidPenalty()) == null) ? 0L : unpaidPenalty.longValue();
                CLBillDetailData cLBillDetailData7 = cLBillDetailMoreActivity.f28865p0;
                textView7.setText(r0.B(jLongValue3 + ((cLBillDetailData7 == null || (paidPenalty = cLBillDetailData7.getPaidPenalty()) == null) ? 0L : paidPenalty.longValue()), false));
                Object value5 = cLBillDetailMoreActivity.f28848C.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                TextView textView8 = (TextView) value5;
                CLBillDetailData cLBillDetailData8 = cLBillDetailMoreActivity.f28865p0;
                C0.G.x("-", r0.B((cLBillDetailData8 == null || (discountInterestSum2 = cLBillDetailData8.getDiscountInterestSum()) == null) ? 0L : discountInterestSum2.longValue(), true), textView8);
                Object value6 = cLBillDetailMoreActivity.f28846A.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                TextView textView9 = (TextView) value6;
                CLBillDetailData cLBillDetailData9 = cLBillDetailMoreActivity.f28865p0;
                textView9.setText(r0.B((cLBillDetailData9 == null || (paidExtensionServiceFee2 = cLBillDetailData9.getPaidExtensionServiceFee()) == null) ? 0L : paidExtensionServiceFee2.longValue(), true));
                Object value7 = cLBillDetailMoreActivity.f28870w.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                TextView textView10 = (TextView) value7;
                CLBillDetailData cLBillDetailData10 = cLBillDetailMoreActivity.f28865p0;
                textView10.setText(r0.B((cLBillDetailData10 == null || (totalAmount = cLBillDetailData10.getTotalAmount()) == null) ? 0L : totalAmount.longValue(), false));
                Object value8 = cLBillDetailMoreActivity.f28849H.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                TextView textView11 = (TextView) value8;
                CLBillDetailData cLBillDetailData11 = cLBillDetailMoreActivity.f28865p0;
                textView11.setText(cLBillDetailMoreActivity.getString((cLBillDetailData11 == null || (reductionWay = cLBillDetailData11.getReductionWay()) == null || reductionWay.intValue() != 1) ? Ya.g.cs_cl_borrow_all_discount : Ya.g.cs_cl_coupon));
                Object value9 = cLBillDetailMoreActivity.f28869v.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                TextView textView12 = (TextView) value9;
                CLBillDetailData cLBillDetailData12 = cLBillDetailMoreActivity.f28865p0;
                textView12.setText(cLBillDetailData12 != null ? cLBillDetailData12.getLoanAccount() : null);
                Object value10 = cLBillDetailMoreActivity.f28864p.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                TextView textView13 = (TextView) value10;
                CLBillDetailData cLBillDetailData13 = cLBillDetailMoreActivity.f28865p0;
                textView13.setText(r0.B((cLBillDetailData13 == null || (managementFee3 = cLBillDetailData13.getManagementFee()) == null) ? 0L : managementFee3.longValue(), true));
                Object value11 = cLBillDetailMoreActivity.f28863o.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                TextView textView14 = (TextView) value11;
                CLBillDetailData cLBillDetailData14 = cLBillDetailMoreActivity.f28865p0;
                String strValueOf = String.valueOf((cLBillDetailData14 == null || (loanAmount = cLBillDetailData14.getLoanAmount()) == null) ? 0L : loanAmount.longValue());
                CLBillDetailData cLBillDetailData15 = cLBillDetailMoreActivity.f28865p0;
                textView14.setText(r0.B(r0.U1(strValueOf, String.valueOf((cLBillDetailData15 == null || (managementFee2 = cLBillDetailData15.getManagementFee()) == null) ? 0L : managementFee2.longValue())).longValueExact(), true));
                Object value12 = cLBillDetailMoreActivity.f28861j.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                TextView textView15 = (TextView) value12;
                CLBillDetailData cLBillDetailData16 = cLBillDetailMoreActivity.f28865p0;
                String strX1 = r0.X1(cLBillDetailData16 != null ? cLBillDetailData16.getLoanStartDate() : null, "MMM dd, yyyy");
                CLBillDetailData cLBillDetailData17 = cLBillDetailMoreActivity.f28865p0;
                textView15.setText(strX1 + " - " + r0.X1(cLBillDetailData17 != null ? cLBillDetailData17.getLoanEndDate() : null, "MMM dd, yyyy"));
                Object value13 = cLBillDetailMoreActivity.f28860i.getValue();
                Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                TextView textView16 = (TextView) value13;
                int i23 = Ya.g.cs_cl_more_detail_days;
                CLBillDetailData cLBillDetailData18 = cLBillDetailMoreActivity.f28865p0;
                textView16.setText(cLBillDetailMoreActivity.getString(i23, Integer.valueOf((cLBillDetailData18 == null || (loanDays = cLBillDetailData18.getLoanDays()) == null) ? 0 : loanDays.intValue())));
                DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                Object value14 = cLBillDetailMoreActivity.f28859g.getValue();
                Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                TextView textView17 = (TextView) value14;
                CLBillDetailData cLBillDetailData19 = cLBillDetailMoreActivity.f28865p0;
                textView17.setText(decimalFormat.format((cLBillDetailData19 == null || (interestRatio = cLBillDetailData19.getInterestRatio()) == null) ? 0.0d : interestRatio.doubleValue()));
                Object value15 = cLBillDetailMoreActivity.f28856d.getValue();
                Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                ((TextView) value15).setText(cLBillDetailMoreActivity.getString(Ya.g.cs_cl_bill_proto_view));
                CLBillDetailData cLBillDetailData20 = cLBillDetailMoreActivity.f28865p0;
                long jLongValue4 = (cLBillDetailData20 == null || (unpaidServiceFee = cLBillDetailData20.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee.longValue();
                CLBillDetailData cLBillDetailData21 = cLBillDetailMoreActivity.f28865p0;
                long jLongValue5 = jLongValue4 + ((cLBillDetailData21 == null || (paidServiceFee = cLBillDetailData21.getPaidServiceFee()) == null) ? 0L : paidServiceFee.longValue());
                p355xf.t tVar3 = cLBillDetailMoreActivity.f28853X;
                if (jLongValue5 > 0) {
                    Object value16 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                    ((TextView) value16).setCompoundDrawablesWithIntrinsicBounds(0, 0, p116hb.b.cs_cl_info_icon, 0);
                } else {
                    Object value17 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                    ((TextView) value17).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                CLBillDetailData cLBillDetailData22 = cLBillDetailMoreActivity.f28865p0;
                long jLongValue6 = (cLBillDetailData22 == null || (discountInterestSum = cLBillDetailData22.getDiscountInterestSum()) == null) ? 0L : discountInterestSum.longValue();
                p355xf.t tVar4 = cLBillDetailMoreActivity.f28850L;
                if (jLongValue6 > 0) {
                    Object value18 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                    ((LinearLayout) value18).setVisibility(0);
                } else {
                    Object value19 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                    ((LinearLayout) value19).setVisibility(8);
                }
                CLBillDetailData cLBillDetailData23 = cLBillDetailMoreActivity.f28865p0;
                if (cLBillDetailData23 != null && (loanType = cLBillDetailData23.getLoanType()) != null && loanType.intValue() == 2) {
                    Object value20 = cLBillDetailMoreActivity.f28858f.getValue();
                    Intrinsics.checkNotNullExpressionValue(value20, "getValue(...)");
                    ((LinearLayout) value20).setVisibility(0);
                }
                CLBillDetailData cLBillDetailData24 = cLBillDetailMoreActivity.f28865p0;
                long jLongValue7 = (cLBillDetailData24 == null || (paidExtensionServiceFee = cLBillDetailData24.getPaidExtensionServiceFee()) == null) ? 0L : paidExtensionServiceFee.longValue();
                p355xf.t tVar5 = cLBillDetailMoreActivity.f28847B;
                if (jLongValue7 > 0) {
                    Object value21 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value21, "getValue(...)");
                    ((LinearLayout) value21).setVisibility(0);
                } else {
                    Object value22 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value22, "getValue(...)");
                    ((LinearLayout) value22).setVisibility(8);
                }
                Object value23 = cLBillDetailMoreActivity.t.getValue();
                Intrinsics.checkNotNullExpressionValue(value23, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value23;
                CLBillDetailData cLBillDetailData25 = cLBillDetailMoreActivity.f28865p0;
                linearLayout.setVisibility(((cLBillDetailData25 == null || (managementFee = cLBillDetailData25.getManagementFee()) == null) ? 0L : managementFee.longValue()) > 0 ? 0 : 8);
                return;
        }
    }
}
