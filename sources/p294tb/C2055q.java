package p294tb;

import C9.C0155w;
import G1.d;
import N8.q0;
import O6.c;
import Pa.C0525w;
import Pa.r0;
import Ya.g;
import Z4.e;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.network.ErrorCodes;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.b;
import com.bumptech.glide.load.resource.bitmap.i;
import com.google.api.Service;
import com.google.gson.Gson;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.bean.other.OcInstallmentRepayExtensionBean;
import com.transsnet.palmpay.credit.bean.req.CLComparePhotoData;
import com.transsnet.palmpay.credit.bean.req.CLComparePhotoResp;
import com.transsnet.palmpay.credit.bean.req.ContactData;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.resp.CLBillDetailData;
import com.transsnet.palmpay.credit.bean.resp.CLBillDetailResp;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.bean.resp.CLOrderDetailData;
import com.transsnet.palmpay.credit.bean.resp.CLOrderDetailResp;
import com.transsnet.palmpay.credit.bean.resp.InsRepaymentPlanDetail;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultResp;
import com.transsnet.palmpay.credit.bean.resp.OcBillInsRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.OcBillInsRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.OcClOverdueBillData;
import com.transsnet.palmpay.credit.bean.resp.OcClOverdueBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcFeedbackHistoryDetail;
import com.transsnet.palmpay.credit.bean.resp.OcFeedbackHistoryResp;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseData;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseResp;
import com.transsnet.palmpay.credit.bean.resp.OcInsRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.OcInsRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.OcInviteCodeData;
import com.transsnet.palmpay.credit.bean.resp.OcInviteCodeResp;
import com.transsnet.palmpay.credit.bean.resp.OcOrderDetailData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderDetailResp;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusData;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusResp;
import com.transsnet.palmpay.credit.bean.resp.OverdueCashLoanDetail;
import com.transsnet.palmpay.credit.bean.resp.OverdueOkCardDetail;
import com.transsnet.palmpay.credit.bean.resp.QueryOneLoopInfoNetworkItem;
import com.transsnet.palmpay.credit.bean.resp.QueryOneLoopInfoResp;
import com.transsnet.palmpay.credit.bean.resp.SpreadInfoDto;
import com.transsnet.palmpay.credit.bean.resp.SpreadRepaymentPlan;
import com.transsnet.palmpay.credit.bean.resp.TopUpOrderDetailRsp;
import com.transsnet.palmpay.credit.bean.rsp.AllBillDetail;
import com.transsnet.palmpay.credit.bean.rsp.BillSpreadRepaymentPlan;
import com.transsnet.palmpay.credit.bean.rsp.FinanceStatusData;
import com.transsnet.palmpay.credit.bean.rsp.FinanceStatusResp;
import com.transsnet.palmpay.credit.bean.rsp.OcAllBillListData;
import com.transsnet.palmpay.credit.bean.rsp.OcAllBillListResp;
import com.transsnet.palmpay.credit.bean.rsp.OcBillInstallmentBillData;
import com.transsnet.palmpay.credit.bean.rsp.OcBillInstallmentBillResp;
import com.transsnet.palmpay.credit.bean.rsp.OcOfflineInstallmentBillData;
import com.transsnet.palmpay.credit.bean.rsp.OcOfflineInstallmentBillResp;
import com.transsnet.palmpay.credit.bean.rsp.OfflineInstallmentRepaymentPlanPO;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRsp;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInstallmentDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInstallmentUpGradeResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepayOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTotalOverdueActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAllBillActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillInstallmentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackListActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcIncreaseRecordActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInviteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcLastProtocolActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMainActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMediaActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOfflineInstallmentDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOtpVerifyActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcPromotionActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSettingActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLCompareFailedDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLUploadImgDialog;
import com.transsnet.palmpay.credit.ui.dialog.OcFeedbackSubmitResultDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDrawHistoryResp;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithRewardsListFragment;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantDisburseOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantListResp;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantOrderDetailResp;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantListActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantOrderDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p220oa.h;
import p295tc.l;
import p310ub.C2102t0;
import p310ub.C2106v0;
import p310ub.K;
import p351xb.o;
import p355xf.t;
import p368yb.C2137e;
import p368yb.C2154w;
import p368yb.D;

/* JADX INFO: renamed from: tb.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2055q extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f42500g;

    public /* synthetic */ C2055q(Object obj, int i7) {
        this.f42499f = i7;
        this.f42500g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void R(Object obj) {
        String string;
        int i7 = 3;
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity = (ThirdPartyMerchantOrderDetailActivity) this.f42500g;
        thirdPartyMerchantOrderDetailActivity.showLoadingDialog(false);
        if (!commonBeanResult.isSuccess()) {
            ThirdPartyMerchantOrderDetailActivity.m(thirdPartyMerchantOrderDetailActivity, commonBeanResult.getRespMsg());
            return;
        }
        ThirdPartyMerchantOrderDetailResp thirdPartyMerchantOrderDetailResp = (ThirdPartyMerchantOrderDetailResp) commonBeanResult.data;
        int i10 = ThirdPartyMerchantOrderDetailActivity.f35001M;
        if (thirdPartyMerchantOrderDetailResp == null) {
            return;
        }
        if (TextUtils.isEmpty(thirdPartyMerchantOrderDetailResp.getMerchantLogoUrl())) {
            thirdPartyMerchantOrderDetailActivity.f35008b.f31471i.setImageResource(r.cv_default_merchat);
        } else {
            b.f(thirdPartyMerchantOrderDetailActivity.f35008b.f31471i).load(Uri.parse(thirdPartyMerchantOrderDetailResp.getMerchantLogoUrl())).a(((d) ((d) new d().I(new i(), true)).j(r.cv_default_merchat)).x(r.cv_default_merchat)).S(thirdPartyMerchantOrderDetailActivity.f35008b.f31471i);
        }
        thirdPartyMerchantOrderDetailActivity.f35008b.f31466c.setText(thirdPartyMerchantOrderDetailResp.getMerchantName());
        thirdPartyMerchantOrderDetailActivity.f35008b.f31467d.setText(r0.I0(thirdPartyMerchantOrderDetailResp.getPayAmount()));
        TextView textView = thirdPartyMerchantOrderDetailActivity.f35008b.f31468e;
        int orderStatus = thirdPartyMerchantOrderDetailResp.getOrderStatus();
        if (orderStatus == 2) {
            string = thirdPartyMerchantOrderDetailActivity.getString(k.core_completed);
        } else if (orderStatus == 3 || orderStatus == 5 || orderStatus == 4) {
            string = thirdPartyMerchantOrderDetailActivity.getString(k.core_failed);
        } else {
            string = (orderStatus == 1 || orderStatus == 0) ? thirdPartyMerchantOrderDetailActivity.getString(k.core_pending) : "";
        }
        textView.setText(string);
        if (thirdPartyMerchantOrderDetailResp.getOrderStatus() == 2) {
            String orderNo = thirdPartyMerchantOrderDetailResp.getOrderNo();
            long orderAmount = thirdPartyMerchantOrderDetailResp.getOrderAmount();
            String merchantName = thirdPartyMerchantOrderDetailResp.getMerchantName();
            thirdPartyMerchantOrderDetailActivity.f35008b.f31473o.setVisibility(0);
            thirdPartyMerchantOrderDetailActivity.f35008b.f31473o.setOnClickListener(new p297te.i(thirdPartyMerchantOrderDetailActivity, orderAmount, orderNo, merchantName));
        }
        thirdPartyMerchantOrderDetailActivity.f35009c.f31454c.setText(k.core_amount);
        thirdPartyMerchantOrderDetailActivity.f35009c.f31455d.setText(r0.B(thirdPartyMerchantOrderDetailResp.getOrderAmount(), true));
        thirdPartyMerchantOrderDetailActivity.f35009c.f31454c.setTextColor(thirdPartyMerchantOrderDetailActivity.getColor(L6.b.ppColorTextPrimary));
        thirdPartyMerchantOrderDetailActivity.f35009c.f31455d.setTextColor(thirdPartyMerchantOrderDetailActivity.getColor(L6.b.ppColorTextPrimary));
        thirdPartyMerchantOrderDetailActivity.f35010d.f31454c.setText(k.core_fee);
        thirdPartyMerchantOrderDetailActivity.f35010d.f31454c.setAllCaps(true);
        thirdPartyMerchantOrderDetailActivity.f35010d.f31455d.setText(r0.B(thirdPartyMerchantOrderDetailResp.getPayerVat() + thirdPartyMerchantOrderDetailResp.getPayerFee(), true));
        thirdPartyMerchantOrderDetailActivity.f35010d.setTips(r0.W(thirdPartyMerchantOrderDetailActivity, thirdPartyMerchantOrderDetailResp.getPayerVat()));
        thirdPartyMerchantOrderDetailActivity.f35011e.f31454c.setText(k.core_points_used);
        thirdPartyMerchantOrderDetailActivity.f35011e.f31454c.setAllCaps(true);
        thirdPartyMerchantOrderDetailActivity.f35011e.f31455d.setTextColor(thirdPartyMerchantOrderDetailActivity.getColor(L6.b.ppColorError));
        thirdPartyMerchantOrderDetailActivity.f35011e.f31455d.setText(r0.x0(thirdPartyMerchantOrderDetailResp.getLoyaltyPoint()));
        thirdPartyMerchantOrderDetailActivity.f35012f.f31454c.setText(k.core_points_earned);
        thirdPartyMerchantOrderDetailActivity.f35012f.f31454c.setAllCaps(true);
        thirdPartyMerchantOrderDetailActivity.f35012f.f31455d.setTextColor(thirdPartyMerchantOrderDetailActivity.getColor(L6.b.ppColorError));
        thirdPartyMerchantOrderDetailActivity.f35012f.f31455d.setText(r0.x0(thirdPartyMerchantOrderDetailResp.getReturnPoint()));
        thirdPartyMerchantOrderDetailActivity.f35013g.f31454c.setText(k.core_total);
        thirdPartyMerchantOrderDetailActivity.f35013g.f31454c.setAllCaps(true);
        thirdPartyMerchantOrderDetailActivity.f35013g.f31454c.setTextColor(thirdPartyMerchantOrderDetailActivity.getColor(L6.b.ppColorPrimary));
        thirdPartyMerchantOrderDetailActivity.f35013g.f31455d.setTextColor(thirdPartyMerchantOrderDetailActivity.getColor(L6.b.ppColorPrimary));
        thirdPartyMerchantOrderDetailActivity.f35013g.f31455d.setText(r0.B(thirdPartyMerchantOrderDetailResp.getTotalAmount(), true));
        if (thirdPartyMerchantOrderDetailResp.getOrderStatus() == 5 || thirdPartyMerchantOrderDetailResp.getOrderStatus() == 4) {
            thirdPartyMerchantOrderDetailActivity.f35014i.setVisibility(0);
            thirdPartyMerchantOrderDetailActivity.f35014i.f31587c.setText(k.core_refund);
            thirdPartyMerchantOrderDetailActivity.f35014i.f31588d.setText(thirdPartyMerchantOrderDetailResp.getOrderStatus() == 4 ? k.core_success : k.core_failed);
        }
        thirdPartyMerchantOrderDetailActivity.f35015j.f31587c.setText(k.core_payment_type);
        thirdPartyMerchantOrderDetailActivity.f35015j.f31588d.setText(thirdPartyMerchantOrderDetailResp.getMerchantName());
        r0.S1(thirdPartyMerchantOrderDetailActivity.f35016o, thirdPartyMerchantOrderDetailResp.getPayerAccountType(), thirdPartyMerchantOrderDetailResp.getBankName(), thirdPartyMerchantOrderDetailResp.getBankUrl(), thirdPartyMerchantOrderDetailResp.getPayerCardNo());
        thirdPartyMerchantOrderDetailActivity.t.setMessage(thirdPartyMerchantOrderDetailResp.getOrderNo());
        thirdPartyMerchantOrderDetailActivity.f35018v.setText(thirdPartyMerchantOrderDetailActivity.getString(k.core_post_date, r0.Q(thirdPartyMerchantOrderDetailResp.getCreateTime())));
        thirdPartyMerchantOrderDetailActivity.f35019w.setText(thirdPartyMerchantOrderDetailActivity.getString(k.core_transaction_date, r0.Q(thirdPartyMerchantOrderDetailResp.getUpdateTime())));
        if (thirdPartyMerchantOrderDetailResp.getOrderStatus() == 3 || thirdPartyMerchantOrderDetailResp.getOrderStatus() == 6) {
            thirdPartyMerchantOrderDetailActivity.f35009c.d();
            thirdPartyMerchantOrderDetailActivity.f35010d.d();
            thirdPartyMerchantOrderDetailActivity.f35011e.d();
            thirdPartyMerchantOrderDetailActivity.f35012f.d();
            thirdPartyMerchantOrderDetailActivity.f35013g.d();
            thirdPartyMerchantOrderDetailActivity.f35016o.d();
            thirdPartyMerchantOrderDetailActivity.f35017p.d();
            thirdPartyMerchantOrderDetailActivity.f35015j.d();
        }
        if (!TextUtils.isEmpty(thirdPartyMerchantOrderDetailResp.getErrorMessage()) && thirdPartyMerchantOrderDetailResp.getOrderStatus() == 3) {
            thirdPartyMerchantOrderDetailActivity.f35003B.setText(thirdPartyMerchantOrderDetailResp.getErrorMessage());
            thirdPartyMerchantOrderDetailActivity.f35002A.setVisibility(0);
        }
        if (thirdPartyMerchantOrderDetailResp.getOrderStatus() == 3) {
            thirdPartyMerchantOrderDetailActivity.f35004C.setVisibility(0);
            thirdPartyMerchantOrderDetailActivity.f35005H.setOnClickListener(new W(i7, thirdPartyMerchantOrderDetailActivity, thirdPartyMerchantOrderDetailResp));
        }
        if ("pending".equalsIgnoreCase(thirdPartyMerchantOrderDetailResp.getOrderDesc())) {
            thirdPartyMerchantOrderDetailActivity.f35006L.setVisibility(8);
        }
    }

    private final void S(Object obj) {
        List<AllBillDetail> overdueBillList;
        List<AllBillDetail> featureBillList;
        List<AllBillDetail> currentBillList;
        Long outstandingAmount;
        Long outstandingAmount2;
        OcAllBillListResp ocAllBillListResp = (OcAllBillListResp) obj;
        OcAllBillActivity ocAllBillActivity = (OcAllBillActivity) this.f42500g;
        ocAllBillActivity.showLoadingDialog(false);
        if (ocAllBillListResp == null || !ocAllBillListResp.isSuccess() || ocAllBillListResp.getData() == null) {
            ToastUtils.showLong(ocAllBillListResp != null ? ocAllBillListResp.getRespMsg() : null, new Object[0]);
            return;
        }
        ocAllBillActivity.f29235Y = ocAllBillListResp.getData();
        Object value = ocAllBillActivity.f29244v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        OcAllBillListData ocAllBillListData = ocAllBillActivity.f29235Y;
        textView.setText(r0.B((ocAllBillListData == null || (outstandingAmount2 = ocAllBillListData.getOutstandingAmount()) == null) ? 0L : outstandingAmount2.longValue(), true));
        OcAllBillListData ocAllBillListData2 = ocAllBillActivity.f29235Y;
        long jLongValue = (ocAllBillListData2 == null || (outstandingAmount = ocAllBillListData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue();
        t tVar = ocAllBillActivity.f29237e;
        if (jLongValue > 0) {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((LinearLayout) value2).setVisibility(0);
        } else {
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((LinearLayout) value3).setVisibility(8);
        }
        ArrayList arrayList = ocAllBillActivity.f29227A;
        arrayList.clear();
        ArrayList arrayList2 = ocAllBillActivity.f29228B;
        arrayList2.clear();
        ArrayList arrayList3 = ocAllBillActivity.f29229C;
        arrayList3.clear();
        OcAllBillListData ocAllBillListData3 = ocAllBillActivity.f29235Y;
        if (ocAllBillListData3 != null && (currentBillList = ocAllBillListData3.getCurrentBillList()) != null) {
            arrayList.addAll(currentBillList);
        }
        OcAllBillListData ocAllBillListData4 = ocAllBillActivity.f29235Y;
        if (ocAllBillListData4 != null && (featureBillList = ocAllBillListData4.getFeatureBillList()) != null) {
            arrayList2.addAll(featureBillList);
        }
        OcAllBillListData ocAllBillListData5 = ocAllBillActivity.f29235Y;
        if (ocAllBillListData5 != null && (overdueBillList = ocAllBillListData5.getOverdueBillList()) != null) {
            arrayList3.addAll(overdueBillList);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        t tVar2 = ocAllBillActivity.f29241j;
        if (zIsEmpty) {
            Object value4 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((TextView) value4).setVisibility(8);
            ocAllBillActivity.o().setVisibility(8);
        } else {
            Object value5 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((TextView) value5).setVisibility(0);
            ocAllBillActivity.o().setVisibility(0);
            ocAllBillActivity.f29230H.notifyDataSetChanged();
        }
        boolean zIsEmpty2 = arrayList2.isEmpty();
        t tVar3 = ocAllBillActivity.f29239g;
        if (zIsEmpty2) {
            Object value6 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((TextView) value6).setVisibility(8);
            ocAllBillActivity.r().setVisibility(8);
        } else {
            Object value7 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((TextView) value7).setVisibility(0);
            ocAllBillActivity.r().setVisibility(0);
            ocAllBillActivity.f29231L.notifyDataSetChanged();
        }
        boolean zIsEmpty3 = arrayList3.isEmpty();
        t tVar4 = ocAllBillActivity.f29243p;
        if (zIsEmpty3) {
            Object value8 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
            ((TextView) value8).setVisibility(8);
            ocAllBillActivity.q().setVisibility(8);
        } else {
            Object value9 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ((TextView) value9).setText(ocAllBillActivity.getString(g.cs_outstanding_bills, Integer.valueOf(arrayList3.size())));
            Object value10 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
            ((TextView) value10).setVisibility(0);
            ocAllBillActivity.q().setVisibility(0);
            ocAllBillActivity.f29232M.notifyDataSetChanged();
        }
        if (!Intrinsics.c(ocAllBillActivity.f29233Q, "oc_due_bill")) {
            int size = arrayList2.size() + arrayList.size();
            if (size <= 1) {
                ocAllBillActivity.n().setVisibility(8);
                return;
            } else {
                ocAllBillActivity.n().setText(ocAllBillActivity.getString(g.cs_install_cycle_remain, Integer.valueOf(size)));
                ocAllBillActivity.n().setVisibility(0);
                return;
            }
        }
        int size2 = arrayList3.size() + arrayList2.size() + arrayList.size();
        if (size2 > 1) {
            ocAllBillActivity.n().setText(ocAllBillActivity.getString(g.cs_install_cycle_remain, Integer.valueOf(size2)));
            ocAllBillActivity.n().setVisibility(0);
        } else {
            ocAllBillActivity.n().setVisibility(8);
        }
        Object value11 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        ((TextView) value11).setVisibility(8);
        ocAllBillActivity.r().setVisibility(8);
    }

    private final void T(Object obj) {
        OcBillInstallmentBillData ocBillInstallmentBillData;
        List<BillSpreadRepaymentPlan> spreadRepaymentPlanList;
        Long unpaidAmount;
        Long paidAmount;
        Long spreadPrincipal;
        Long paidAmount2;
        Long spreadServiceFee;
        Long spreadPrincipal2;
        Long unpaidAmount2;
        Integer spreadTerm;
        OcBillInstallmentBillResp ocBillInstallmentBillResp = (OcBillInstallmentBillResp) obj;
        OcBillInstallmentActivity ocBillInstallmentActivity = (OcBillInstallmentActivity) this.f42500g;
        ocBillInstallmentActivity.showLoadingDialog(false);
        if (ocBillInstallmentBillResp == null || !ocBillInstallmentBillResp.isSuccess() || ocBillInstallmentBillResp.getData() == null) {
            ToastUtils.showLong(ocBillInstallmentBillResp != null ? ocBillInstallmentBillResp.getRespMsg() : null, new Object[0]);
            return;
        }
        ocBillInstallmentActivity.f29365B = ocBillInstallmentBillResp.getData();
        Object value = ocBillInstallmentActivity.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        int i7 = g.cs_pay_in;
        OcBillInstallmentBillData ocBillInstallmentBillData2 = ocBillInstallmentActivity.f29365B;
        textView.setText(ocBillInstallmentActivity.getString(i7, Integer.valueOf((ocBillInstallmentBillData2 == null || (spreadTerm = ocBillInstallmentBillData2.getSpreadTerm()) == null) ? 0 : spreadTerm.intValue())));
        Object value2 = ocBillInstallmentActivity.f29376v.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView textView2 = (TextView) value2;
        OcBillInstallmentBillData ocBillInstallmentBillData3 = ocBillInstallmentActivity.f29365B;
        textView2.setText(r0.B((ocBillInstallmentBillData3 == null || (unpaidAmount2 = ocBillInstallmentBillData3.getUnpaidAmount()) == null) ? 0L : unpaidAmount2.longValue(), true));
        OcBillInstallmentBillData ocBillInstallmentBillData4 = ocBillInstallmentActivity.f29365B;
        long jLongValue = (ocBillInstallmentBillData4 == null || (spreadPrincipal2 = ocBillInstallmentBillData4.getSpreadPrincipal()) == null) ? 0L : spreadPrincipal2.longValue();
        OcBillInstallmentBillData ocBillInstallmentBillData5 = ocBillInstallmentActivity.f29365B;
        long jLongValue2 = (ocBillInstallmentBillData5 == null || (spreadServiceFee = ocBillInstallmentBillData5.getSpreadServiceFee()) == null) ? 0L : spreadServiceFee.longValue();
        long j6 = jLongValue + jLongValue2;
        Object value3 = ocBillInstallmentActivity.f29375p.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(r0.B(jLongValue, true));
        Object value4 = ocBillInstallmentActivity.f29374o.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setText(r0.B(jLongValue2, true));
        Object value5 = ocBillInstallmentActivity.f29373j.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        TextView textView3 = (TextView) value5;
        OcBillInstallmentBillData ocBillInstallmentBillData6 = ocBillInstallmentActivity.f29365B;
        textView3.setText(r0.B((ocBillInstallmentBillData6 == null || (paidAmount2 = ocBillInstallmentBillData6.getPaidAmount()) == null) ? 0L : paidAmount2.longValue(), true));
        Object value6 = ocBillInstallmentActivity.f29372i.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setText(r0.B(j6, true));
        t tVar = ocBillInstallmentActivity.f29371g;
        Object value7 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ProgressBar progressBar = (ProgressBar) value7;
        OcBillInstallmentBillData ocBillInstallmentBillData7 = ocBillInstallmentActivity.f29365B;
        progressBar.setMax((int) ((ocBillInstallmentBillData7 == null || (spreadPrincipal = ocBillInstallmentBillData7.getSpreadPrincipal()) == null) ? 0L : spreadPrincipal.longValue()));
        Object value8 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ProgressBar progressBar2 = (ProgressBar) value8;
        OcBillInstallmentBillData ocBillInstallmentBillData8 = ocBillInstallmentActivity.f29365B;
        progressBar2.setProgress((int) ((ocBillInstallmentBillData8 == null || (paidAmount = ocBillInstallmentBillData8.getPaidAmount()) == null) ? 0L : paidAmount.longValue()));
        OcBillInstallmentBillData ocBillInstallmentBillData9 = ocBillInstallmentActivity.f29365B;
        long jLongValue3 = (ocBillInstallmentBillData9 == null || (unpaidAmount = ocBillInstallmentBillData9.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue();
        t tVar2 = ocBillInstallmentActivity.f29369e;
        if (jLongValue3 > 0) {
            Object value9 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ((LinearLayout) value9).setVisibility(0);
        } else {
            Object value10 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
            ((LinearLayout) value10).setVisibility(8);
        }
        ArrayList arrayList = ocBillInstallmentActivity.f29366C;
        arrayList.clear();
        OcBillInstallmentBillData ocBillInstallmentBillData10 = ocBillInstallmentActivity.f29365B;
        List<BillSpreadRepaymentPlan> spreadRepaymentPlanList2 = ocBillInstallmentBillData10 != null ? ocBillInstallmentBillData10.getSpreadRepaymentPlanList() : null;
        if (spreadRepaymentPlanList2 != null && !spreadRepaymentPlanList2.isEmpty() && (ocBillInstallmentBillData = ocBillInstallmentActivity.f29365B) != null && (spreadRepaymentPlanList = ocBillInstallmentBillData.getSpreadRepaymentPlanList()) != null) {
            arrayList.addAll(spreadRepaymentPlanList);
        }
        ocBillInstallmentActivity.f29367H.notifyDataSetChanged();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void U(Object obj) {
        CLInitData data;
        CLInitData data2;
        CLInitResp cLInitResp = (CLInitResp) obj;
        OcContactActivity ocContactActivity = (OcContactActivity) this.f42500g;
        ocContactActivity.showLoadingDialog(false);
        repeatContacts = null;
        List<ContactData> repeatContacts = null;
        if (cLInitResp != null && cLInitResp.isSuccess()) {
            OcApplyData ocApplyData = ocContactActivity.f29248B;
            if (ocApplyData != null) {
                CLInitData data3 = cLInitResp.getData();
                ocApplyData.setApplyId(data3 != null ? data3.getApplyId() : null);
            }
            if (Intrinsics.c(ocContactActivity.f29249C, "oc_use_type_router")) {
                ocContactActivity.r();
                return;
            } else {
                ocContactActivity.finish();
                return;
            }
        }
        List<ContactData> repeatContacts2 = (cLInitResp == null || (data2 = cLInitResp.getData()) == null) ? null : data2.getRepeatContacts();
        if (repeatContacts2 == null || repeatContacts2.isEmpty()) {
            ToastUtils.showShort(cLInitResp != null ? cLInitResp.getRespMsg() : null, new Object[0]);
            return;
        }
        if (cLInitResp != null && (data = cLInitResp.getData()) != null) {
            repeatContacts = data.getRepeatContacts();
        }
        int i7 = OcContactActivity.f29378l1;
        List<ContactData> list = repeatContacts;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ContactData contactData : repeatContacts) {
            if (Intrinsics.c(contactData.getPhone(), StringsKt.V(ocContactActivity.H().getText().toString()).toString())) {
                if (ocContactActivity.f29409g1 < 2) {
                    ocContactActivity.K().setText(ocContactActivity.getString(g.cs_oc_repeat_phone_number));
                    ocContactActivity.K().setVisibility(0);
                    ocContactActivity.I().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                } else {
                    ocContactActivity.M().setText(ocContactActivity.getString(g.cs_oc_repeat_phone_number));
                    ocContactActivity.M().setVisibility(0);
                    ocContactActivity.N().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                }
            } else if (Intrinsics.c(contactData.getPhone(), StringsKt.V(ocContactActivity.Q().getText().toString()).toString())) {
                if (ocContactActivity.f29409g1 < 2) {
                    ocContactActivity.T().setText(ocContactActivity.getString(g.cs_oc_repeat_phone_number));
                    ocContactActivity.T().setVisibility(0);
                    ocContactActivity.R().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                } else {
                    ocContactActivity.V().setText(ocContactActivity.getString(g.cs_oc_repeat_phone_number));
                    ocContactActivity.V().setVisibility(0);
                    ocContactActivity.W().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                }
            }
        }
    }

    private final void V(Object obj) {
        OcFeedbackHistoryResp ocFeedbackHistoryResp = (OcFeedbackHistoryResp) obj;
        if (ocFeedbackHistoryResp == null || !ocFeedbackHistoryResp.isSuccess()) {
            ToastUtils.showShort(ocFeedbackHistoryResp != null ? ocFeedbackHistoryResp.getRespMsg() : null, new Object[0]);
            return;
        }
        OcFeedbackListActivity context = (OcFeedbackListActivity) this.f42500g;
        ArrayList arrayList = context.f29456e;
        if (arrayList == null) {
            Intrinsics.n("mData");
            throw null;
        }
        arrayList.clear();
        List<OcFeedbackHistoryDetail> data = ocFeedbackHistoryResp.getData();
        if (data != null && !data.isEmpty()) {
            ArrayList arrayList2 = context.f29456e;
            if (arrayList2 == null) {
                Intrinsics.n("mData");
                throw null;
            }
            List<OcFeedbackHistoryDetail> data2 = ocFeedbackHistoryResp.getData();
            Intrinsics.e(data2);
            arrayList2.addAll(data2);
        }
        C2154w c2154w = context.f29457f;
        if (c2154w != null) {
            c2154w.notifyDataSetChanged();
            return;
        }
        ArrayList data3 = context.f29456e;
        if (data3 == null) {
            Intrinsics.n("mData");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data3, "data");
        context.f29457f = new C2154w(context, data3);
        Object value = context.f29455d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setAdapter(context.f29457f);
        C2154w c2154w2 = context.f29457f;
        if (c2154w2 != null) {
            Sd.b itemClickListener = new Sd.b(context, 28);
            Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            c2154w2.f4993c = itemClickListener;
        }
    }

    private final void W(Object obj) {
        List<SpreadInfoDto> spreadInfoDtoList;
        OcInsRepaymentPlanResp ocInsRepaymentPlanResp = (OcInsRepaymentPlanResp) obj;
        OcInstallmentRepayActivity ocInstallmentRepayActivity = (OcInstallmentRepayActivity) this.f42500g;
        ocInstallmentRepayActivity.showLoadingDialog(false);
        if (ocInsRepaymentPlanResp != null && ocInsRepaymentPlanResp.isSuccess() && ocInsRepaymentPlanResp.getData() != null) {
            OcInsRepaymentPlanData data = ocInsRepaymentPlanResp.getData();
            List<SpreadInfoDto> spreadInfoDtoList2 = data != null ? data.getSpreadInfoDtoList() : null;
            if (spreadInfoDtoList2 != null && !spreadInfoDtoList2.isEmpty()) {
                ocInstallmentRepayActivity.f29545p0 = ocInsRepaymentPlanResp.getData();
                OcInsRepaymentPlanData data2 = ocInsRepaymentPlanResp.getData();
                ocInstallmentRepayActivity.f29546q0 = ((data2 == null || (spreadInfoDtoList = data2.getSpreadInfoDtoList()) == null) ? 1 : spreadInfoDtoList.size()) - 1;
                ArrayList arrayList = ocInstallmentRepayActivity.f29547r0;
                arrayList.clear();
                OcInsRepaymentPlanData data3 = ocInsRepaymentPlanResp.getData();
                List<SpreadInfoDto> spreadInfoDtoList3 = data3 != null ? data3.getSpreadInfoDtoList() : null;
                Intrinsics.e(spreadInfoDtoList3);
                arrayList.addAll(spreadInfoDtoList3);
                D d2 = ocInstallmentRepayActivity.f29548s0;
                if (d2 != null) {
                    d2.f44158d = ocInstallmentRepayActivity.f29546q0;
                }
                if (d2 != null) {
                    d2.notifyDataSetChanged();
                }
                OcInstallmentRepayActivity.m(ocInstallmentRepayActivity);
                return;
            }
        }
        ToastUtils.showShort(ocInsRepaymentPlanResp != null ? ocInsRepaymentPlanResp.getRespMsg() : null, new Object[0]);
    }

    private final void X(Object obj) {
        OcInviteCodeData data;
        Integer invitationStatus;
        OcInviteCodeResp ocInviteCodeResp = (OcInviteCodeResp) obj;
        OcInviteActivity ocInviteActivity = (OcInviteActivity) this.f42500g;
        ocInviteActivity.showLoadingDialog(false);
        if (ocInviteCodeResp == null || !ocInviteCodeResp.isSuccess() || (data = ocInviteCodeResp.getData()) == null || (invitationStatus = data.getInvitationStatus()) == null || invitationStatus.intValue() != 1) {
            ToastUtils.showShort(ocInviteCodeResp != null ? ocInviteCodeResp.getRespMsg() : null, new Object[0]);
        } else {
            ARouter.getInstance().build("/credit_score/oc_protocol_activity").withString("oc_apply_enter_point", "INVITE").navigation();
            ocInviteActivity.finish();
        }
    }

    private final void Y(Object obj) {
        Integer type;
        OcSignStatusResp ocSignStatusResp = (OcSignStatusResp) obj;
        OcLastProtocolActivity ocLastProtocolActivity = (OcLastProtocolActivity) this.f42500g;
        int length = 0;
        ocLastProtocolActivity.showLoadingDialog(false);
        if (ocSignStatusResp == null || !ocSignStatusResp.isSuccess() || ocSignStatusResp.getData() == null) {
            h.x(ocLastProtocolActivity, ocSignStatusResp != null ? ocSignStatusResp.getRespMsg() : null);
            return;
        }
        OcSignStatusData data = ocSignStatusResp.getData();
        t tVar = ocLastProtocolActivity.f29557Z;
        if (data != null && (type = data.getType()) != null && type.intValue() == 0) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((Group) value).setVisibility(8);
            return;
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((Group) value2).setVisibility(0);
        ArrayList arrayList = new ArrayList();
        ApplyProtoContent applyProtoContent = new ApplyProtoContent(0, "I've read and agreed to ");
        ApplyProtoContent applyProtoContent2 = new ApplyProtoContent(1, "Flexi Terms & Conditions");
        ApplyProtoContent applyProtoContent3 = new ApplyProtoContent(1, ", ");
        ApplyProtoContent applyProtoContent4 = new ApplyProtoContent(2, "Privacy Policy");
        ApplyProtoContent applyProtoContent5 = new ApplyProtoContent(2, ", ");
        ApplyProtoContent applyProtoContent6 = new ApplyProtoContent(3, "Flexi Cash Terms&Conditions");
        ApplyProtoContent applyProtoContent7 = new ApplyProtoContent(3, ", ");
        ApplyProtoContent applyProtoContent8 = new ApplyProtoContent(4, "Loan Application agreement");
        arrayList.add(applyProtoContent);
        arrayList.add(applyProtoContent2);
        arrayList.add(applyProtoContent3);
        arrayList.add(applyProtoContent4);
        arrayList.add(applyProtoContent5);
        arrayList.add(applyProtoContent6);
        arrayList.add(applyProtoContent7);
        arrayList.add(applyProtoContent8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ApplyProtoContent applyProtoContent9 = (ApplyProtoContent) next;
            spannableStringBuilder.append((CharSequence) applyProtoContent9.content);
            Integer num = applyProtoContent9.clickType;
            if (num == null || num.intValue() != 0) {
                spannableStringBuilder.setSpan(new C0155w(5, ocLastProtocolActivity, applyProtoContent9), length, spannableStringBuilder.length(), 33);
            }
            length = spannableStringBuilder.length() - 1;
        }
        t tVar2 = ocLastProtocolActivity.f29558k0;
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(spannableStringBuilder);
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setHighlightColor(ocLastProtocolActivity.getColor(p.transparent));
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void Z(Object obj) {
        Integer remainingDays;
        FinanceStatusResp financeStatusResp = (FinanceStatusResp) obj;
        int iIntValue = 0;
        if (financeStatusResp == null || !financeStatusResp.isSuccess() || financeStatusResp.getData() == null) {
            ToastUtils.showLong(financeStatusResp != null ? financeStatusResp.getRespMsg() : null, new Object[0]);
            return;
        }
        financeStatusResp.getData();
        int i7 = OcMainActivity.f29575e;
        OcMainActivity ocMainActivity = (OcMainActivity) this.f42500g;
        FinanceStatusData data = financeStatusResp.getData();
        OkCardMainPageRspData okCardAccount = data != null ? data.getOkCardAccount() : null;
        if (okCardAccount != null && (remainingDays = okCardAccount.getRemainingDays()) != null) {
            iIntValue = remainingDays.intValue();
        }
        if (iIntValue > 0) {
            ARouter.getInstance().build("/credit_score/oc_apply_result_activity").withString("oc_apply_result", ((Gson) C0525w.f().f7166b).toJson(new OcApplyResultData("", 2, 0L, 0L, 0L, "Please try again after " + (okCardAccount != null ? okCardAccount.getRemainingDays() : null) + " days", 2, "", null))).navigation();
            ocMainActivity.finish();
            return;
        }
        OcMainFragment ocMainFragment = new OcMainFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("oc_show_top_bar_left", true);
        bundle.putString("oc_login_type", "0");
        bundle.putInt("oc_apply_source", ocMainActivity.f29576d);
        if (ocMainActivity.getIntent() != null) {
            String stringExtra = ocMainActivity.getIntent().getStringExtra("oc_show_proto_dialog_type");
            bundle.putString("oc_show_proto_dialog_type", stringExtra != null ? stringExtra : "1");
            bundle.putString("oc_installment_sn_no", ocMainActivity.getIntent().getStringExtra("oc_installment_sn_no"));
        } else {
            bundle.putString("oc_show_proto_dialog_type", "1");
        }
        ocMainFragment.setArguments(bundle);
        h.i(ocMainActivity, Ya.e.oc_fl, ocMainFragment);
    }

    private final void a0(Object obj) {
        CLInitResp cLInitResp = (CLInitResp) obj;
        OcMediaActivity ocMediaActivity = (OcMediaActivity) this.f42500g;
        ocMediaActivity.showLoadingDialog(false);
        if (cLInitResp == null || !cLInitResp.isSuccess()) {
            ToastUtils.showShort(cLInitResp != null ? cLInitResp.getRespMsg() : null, new Object[0]);
            return;
        }
        OcApplyData ocApplyData = ocMediaActivity.f29248B;
        if (ocApplyData != null) {
            CLInitData data = cLInitResp.getData();
            ocApplyData.setApplyId(data != null ? data.getApplyId() : null);
        }
        ocMediaActivity.r();
    }

    private final void b0(Object obj) {
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData;
        List<OfflineInstallmentRepaymentPlanPO> installmentRepaymentPlanPOList;
        Long unpaidAmount;
        Long paidAmount;
        Long installmentAmount;
        Long unpaidAmount2;
        Long paidAmount2;
        Long installmentServiceFee;
        Long installmentAmount2;
        Long unpaidAmount3;
        Integer installmentTerm;
        OcOfflineInstallmentBillResp ocOfflineInstallmentBillResp = (OcOfflineInstallmentBillResp) obj;
        OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = (OcOfflineInstallmentDetailActivity) this.f42500g;
        ocOfflineInstallmentDetailActivity.showLoadingDialog(false);
        if (ocOfflineInstallmentBillResp == null || !ocOfflineInstallmentBillResp.isSuccess() || ocOfflineInstallmentBillResp.getData() == null) {
            ToastUtils.showLong(ocOfflineInstallmentBillResp != null ? ocOfflineInstallmentBillResp.getRespMsg() : null, new Object[0]);
            return;
        }
        ocOfflineInstallmentDetailActivity.f29592B = ocOfflineInstallmentBillResp.getData();
        Object value = ocOfflineInstallmentDetailActivity.f29604w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PpTitleBar ppTitleBar = (PpTitleBar) value;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData2 = ocOfflineInstallmentDetailActivity.f29592B;
        ppTitleBar.setTitle(ocOfflineInstallmentBillData2 != null ? ocOfflineInstallmentBillData2.getBizDesc() : null);
        Object value2 = ocOfflineInstallmentDetailActivity.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView textView = (TextView) value2;
        int i7 = g.cs_pay_in;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData3 = ocOfflineInstallmentDetailActivity.f29592B;
        textView.setText(ocOfflineInstallmentDetailActivity.getString(i7, Integer.valueOf((ocOfflineInstallmentBillData3 == null || (installmentTerm = ocOfflineInstallmentBillData3.getInstallmentTerm()) == null) ? 0 : installmentTerm.intValue())));
        Object value3 = ocOfflineInstallmentDetailActivity.f29603v.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        TextView textView2 = (TextView) value3;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData4 = ocOfflineInstallmentDetailActivity.f29592B;
        textView2.setText(r0.B((ocOfflineInstallmentBillData4 == null || (unpaidAmount3 = ocOfflineInstallmentBillData4.getUnpaidAmount()) == null) ? 0L : unpaidAmount3.longValue(), true));
        Object value4 = ocOfflineInstallmentDetailActivity.f29602p.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        TextView textView3 = (TextView) value4;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData5 = ocOfflineInstallmentDetailActivity.f29592B;
        textView3.setText(r0.B((ocOfflineInstallmentBillData5 == null || (installmentAmount2 = ocOfflineInstallmentBillData5.getInstallmentAmount()) == null) ? 0L : installmentAmount2.longValue(), true));
        Object value5 = ocOfflineInstallmentDetailActivity.f29601o.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        TextView textView4 = (TextView) value5;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData6 = ocOfflineInstallmentDetailActivity.f29592B;
        textView4.setText(r0.B((ocOfflineInstallmentBillData6 == null || (installmentServiceFee = ocOfflineInstallmentBillData6.getInstallmentServiceFee()) == null) ? 0L : installmentServiceFee.longValue(), true));
        Object value6 = ocOfflineInstallmentDetailActivity.f29600j.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        TextView textView5 = (TextView) value6;
        int i10 = g.cs_paid_off;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData7 = ocOfflineInstallmentDetailActivity.f29592B;
        textView5.setText(ocOfflineInstallmentDetailActivity.getString(i10, r0.B((ocOfflineInstallmentBillData7 == null || (paidAmount2 = ocOfflineInstallmentBillData7.getPaidAmount()) == null) ? 0L : paidAmount2.longValue(), true)));
        Object value7 = ocOfflineInstallmentDetailActivity.f29599i.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        TextView textView6 = (TextView) value7;
        int i11 = g.cs_remain;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData8 = ocOfflineInstallmentDetailActivity.f29592B;
        textView6.setText(ocOfflineInstallmentDetailActivity.getString(i11, r0.B((ocOfflineInstallmentBillData8 == null || (unpaidAmount2 = ocOfflineInstallmentBillData8.getUnpaidAmount()) == null) ? 0L : unpaidAmount2.longValue(), true)));
        t tVar = ocOfflineInstallmentDetailActivity.f29598g;
        Object value8 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ProgressBar progressBar = (ProgressBar) value8;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData9 = ocOfflineInstallmentDetailActivity.f29592B;
        progressBar.setMax((int) ((ocOfflineInstallmentBillData9 == null || (installmentAmount = ocOfflineInstallmentBillData9.getInstallmentAmount()) == null) ? 0L : installmentAmount.longValue()));
        Object value9 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ProgressBar progressBar2 = (ProgressBar) value9;
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData10 = ocOfflineInstallmentDetailActivity.f29592B;
        progressBar2.setProgress((int) ((ocOfflineInstallmentBillData10 == null || (paidAmount = ocOfflineInstallmentBillData10.getPaidAmount()) == null) ? 0L : paidAmount.longValue()));
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData11 = ocOfflineInstallmentDetailActivity.f29592B;
        long jLongValue = (ocOfflineInstallmentBillData11 == null || (unpaidAmount = ocOfflineInstallmentBillData11.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue();
        t tVar2 = ocOfflineInstallmentDetailActivity.f29596e;
        if (jLongValue > 0) {
            Object value10 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
            ((LinearLayout) value10).setVisibility(0);
        } else {
            Object value11 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            ((LinearLayout) value11).setVisibility(8);
        }
        ArrayList arrayList = ocOfflineInstallmentDetailActivity.f29593C;
        arrayList.clear();
        OcOfflineInstallmentBillData ocOfflineInstallmentBillData12 = ocOfflineInstallmentDetailActivity.f29592B;
        List<OfflineInstallmentRepaymentPlanPO> installmentRepaymentPlanPOList2 = ocOfflineInstallmentBillData12 != null ? ocOfflineInstallmentBillData12.getInstallmentRepaymentPlanPOList() : null;
        if (installmentRepaymentPlanPOList2 != null && !installmentRepaymentPlanPOList2.isEmpty() && (ocOfflineInstallmentBillData = ocOfflineInstallmentDetailActivity.f29592B) != null && (installmentRepaymentPlanPOList = ocOfflineInstallmentBillData.getInstallmentRepaymentPlanPOList()) != null) {
            arrayList.addAll(installmentRepaymentPlanPOList);
        }
        ocOfflineInstallmentDetailActivity.f29594H.notifyDataSetChanged();
    }

    private final void c0(Object obj) {
        QueryOneLoopInfoResp queryOneLoopInfoResp = (QueryOneLoopInfoResp) obj;
        if (!queryOneLoopInfoResp.isSuccess()) {
            ToastUtils.showLong(queryOneLoopInfoResp.getRespMsg());
            return;
        }
        C2102t0 c2102t0 = (C2102t0) this.f42500g;
        OcOneLoopActivity ocOneLoopActivity = (OcOneLoopActivity) c2102t0.f42923a;
        ocOneLoopActivity.f29607B0 = queryOneLoopInfoResp;
        C2106v0 c2106v0 = ocOneLoopActivity.f29618u0;
        OcOneLoopActivity ocOneLoopActivity2 = c2106v0.f42934a;
        QueryOneLoopInfoResp queryOneLoopInfoResp2 = ocOneLoopActivity2.f29607B0;
        if (queryOneLoopInfoResp2 != null && queryOneLoopInfoResp2.getData() != null && ocOneLoopActivity2.f29607B0.getData().getNetworkList() != null && !ocOneLoopActivity2.f29607B0.getData().getNetworkList().isEmpty()) {
            ocOneLoopActivity2.f29606A0.initModelMobileInputLayout(ocOneLoopActivity2.f29609D0, ocOneLoopActivity2.f29607B0.getData().getNetworkList(), c2106v0, BaseApplication.getCountryLocale(), null, null, null, ocOneLoopActivity2.isDarkMode());
            for (QueryOneLoopInfoNetworkItem queryOneLoopInfoNetworkItem : ocOneLoopActivity2.f29607B0.getData().getNetworkList()) {
                if (TextUtils.equals(ocOneLoopActivity2.f29607B0.getData().getNetworkName(), queryOneLoopInfoNetworkItem.getName())) {
                    ocOneLoopActivity2.f29608C0 = queryOneLoopInfoNetworkItem.getName();
                    ocOneLoopActivity2.f29606A0.updateSelectItem(queryOneLoopInfoNetworkItem);
                }
            }
            QueryOneLoopInfoNetworkItem queryOneLoopInfoNetworkItem2 = ocOneLoopActivity2.f29607B0.getData().getNetworkList().get(0);
            ocOneLoopActivity2.f29608C0 = queryOneLoopInfoNetworkItem2.getName();
            ocOneLoopActivity2.f29606A0.updateSelectItem(queryOneLoopInfoNetworkItem2);
        }
        C2102t0.a(((OcOneLoopActivity) c2102t0.f42923a).f29619v0);
    }

    private final void d0(Object obj) {
        CommonResult commonResult = (CommonResult) obj;
        OcOtpVerifyActivity ocOtpVerifyActivity = (OcOtpVerifyActivity) this.f42500g;
        ocOtpVerifyActivity.showLoadingDialog(false);
        if (commonResult == null || !commonResult.isSuccess()) {
            ToastUtils.showLong(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
        } else {
            ocOtpVerifyActivity.r();
        }
    }

    private final void e0(Object obj) {
        OkCardMainPageRsp okCardMainPageRsp = (OkCardMainPageRsp) obj;
        OcPromotionActivity ocPromotionActivity = (OcPromotionActivity) this.f42500g;
        ocPromotionActivity.showLoadingDialog(false);
        if (okCardMainPageRsp == null || !okCardMainPageRsp.isSuccess()) {
            ToastUtils.showShort(okCardMainPageRsp != null ? okCardMainPageRsp.getRespMsg() : null, new Object[0]);
        } else {
            ARouter.getInstance().build("/credit_score/oc_protocol_activity").withString("oc_apply_enter_point", "PROMOTION").navigation();
            ocPromotionActivity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x033d  */
    /* JADX WARN: Code duplicated, block: B:97:0x036a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0377  */
    private final void f0(Object obj) {
        Integer accountType;
        RelativeLayout relativeLayout;
        OcOrderDetailResp ocOrderDetailResp = (OcOrderDetailResp) obj;
        OcRepayOrderDetailActivity ocRepayOrderDetailActivity = (OcRepayOrderDetailActivity) this.f42500g;
        ocRepayOrderDetailActivity.showLoadingDialog(false);
        if (ocOrderDetailResp == null) {
            ToastUtils.showShort(TransferByLoanResult.STATUS_FAILED, new Object[0]);
            return;
        }
        if (!ocOrderDetailResp.isSuccess() || ocOrderDetailResp.getData() == null) {
            ToastUtils.showShort(ocOrderDetailResp.getRespMsg(), new Object[0]);
            return;
        }
        ocRepayOrderDetailActivity.f29811X = ocOrderDetailResp;
        OcOrderDetailData data = ocOrderDetailResp.getData();
        if (data != null) {
            if (!TextUtils.isEmpty(data.getBizDesc())) {
                ocRepayOrderDetailActivity.q().f31466c.setText(data.getBizDesc());
                ocRepayOrderDetailActivity.o().f31588d.setText(data.getBizDesc());
            }
            if (TextUtils.isEmpty(data.getPayTypeName())) {
                ocRepayOrderDetailActivity.p().setVisibility(8);
            } else {
                ocRepayOrderDetailActivity.p().f31588d.setText(data.getPayTypeName());
                ocRepayOrderDetailActivity.p().f31589e.setImageResource(r.cv_palmpay_logo_small);
            }
            Object value = ocRepayOrderDetailActivity.f29812d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(ocRepayOrderDetailActivity.getString(k.core_transaction_date, r0.Q(data.getCreateTime())));
            t tVar = ocRepayOrderDetailActivity.f29813e;
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(ocRepayOrderDetailActivity.getString(k.core_post_date, r0.Q(data.getUpdateTime())));
            Object value3 = ocRepayOrderDetailActivity.f29815g.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setText(ocRepayOrderDetailActivity.getString(k.core_reference_no, ocRepayOrderDetailActivity.f29809M));
            t tVar2 = ocRepayOrderDetailActivity.f29814f;
            Object value4 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((TextView) value4).setText(ocRepayOrderDetailActivity.getString(g.cs_oc_palmpay_order_no, data.getReference()));
            Object value5 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((TextView) value5).setVisibility(0);
            Long principal = data.getPrincipal();
            if ((principal != null ? principal.longValue() : 0L) > 0) {
                ocRepayOrderDetailActivity.n().f31432e.f31454c.setText(ocRepayOrderDetailActivity.getString(g.cs_oc_principal_title));
                TextView textView = ocRepayOrderDetailActivity.n().f31432e.f31455d;
                Long principal2 = data.getPrincipal();
                textView.setText(r0.B(principal2 != null ? principal2.longValue() : 0L, false));
                ocRepayOrderDetailActivity.n().f31432e.setVisibility(0);
            } else {
                ocRepayOrderDetailActivity.n().f31432e.setVisibility(8);
            }
            Integer operationType = data.getOperationType();
            if (operationType != null && operationType.intValue() == 12) {
                ocRepayOrderDetailActivity.n().f31431d.f31454c.setText(ocRepayOrderDetailActivity.getString(g.cs_oc_penalty_fee));
                TextView textView2 = ocRepayOrderDetailActivity.n().f31431d.f31455d;
                Long penalty = data.getPenalty();
                textView2.setText(r0.B(penalty != null ? penalty.longValue() : 0L, false));
                ocRepayOrderDetailActivity.n().f31431d.setVisibility(0);
                ocRepayOrderDetailActivity.n().t.f31454c.setText(ocRepayOrderDetailActivity.getString(g.cs_oc_extension_fee));
                TextView textView3 = ocRepayOrderDetailActivity.n().t.f31455d;
                Long extensionServiceFee = data.getExtensionServiceFee();
                textView3.setText(r0.B(extensionServiceFee != null ? extensionServiceFee.longValue() : 0L, false));
                ocRepayOrderDetailActivity.n().t.setVisibility(0);
            } else {
                ocRepayOrderDetailActivity.n().f31431d.setVisibility(8);
                ocRepayOrderDetailActivity.n().t.setVisibility(8);
            }
            Integer operationType2 = data.getOperationType();
            t tVar3 = ocRepayOrderDetailActivity.f29818o;
            if (operationType2 != null && operationType2.intValue() == 16) {
                Object value6 = ocRepayOrderDetailActivity.f29817j.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((TextView) value6).setText(ocRepayOrderDetailActivity.getString(g.cs_order_detail_pay_in, data.getInstallmentTerm()));
                Object value7 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((ConstraintLayout) value7).setVisibility(0);
            } else {
                Object value8 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((ConstraintLayout) value8).setVisibility(8);
            }
            ocRepayOrderDetailActivity.q().f31467d.setText(r0.A(data.getAmount()));
            ocRepayOrderDetailActivity.n().f31430c.setVisibility(0);
            TextView textView4 = ocRepayOrderDetailActivity.n().f31430c.f31455d;
            TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo = data.getAmountInfo();
            textView4.setText(r0.B(amountInfo != null ? amountInfo.amount : 0L, false));
            TextView textView5 = ocRepayOrderDetailActivity.n().f31440w.f31455d;
            TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo2 = data.getAmountInfo();
            textView5.setText(r0.B(amountInfo2 != null ? amountInfo2.transAmount : 0L, false));
            TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo3 = data.getAmountInfo();
            if ((amountInfo3 != null ? amountInfo3.couponAmount : 0L) > 0) {
                TextView textView6 = ocRepayOrderDetailActivity.n().f31437o.f31455d;
                TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo4 = data.getAmountInfo();
                textView6.setText("-" + r0.B(amountInfo4 != null ? amountInfo4.couponAmount : 0L, false));
                ocRepayOrderDetailActivity.n().f31437o.setVisibility(0);
            }
            ocRepayOrderDetailActivity.q().f31467d.setText(r0.A(data.getAmount()));
            Integer status = data.getStatus();
            int iIntValue = status != null ? status.intValue() : -1;
            ocRepayOrderDetailActivity.q().t.setVisibility(8);
            if (iIntValue == 1) {
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_completed), "getString(...)");
            } else if (iIntValue == 2) {
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_failed), "getString(...)");
            } else if (iIntValue == 6) {
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_completed), "getString(...)");
            } else if (iIntValue != 7) {
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_pending), "getString(...)");
            } else {
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_failed), "getString(...)");
            }
            Integer status2 = data.getStatus();
            int iIntValue2 = status2 != null ? status2.intValue() : -1;
            TextView mTradeStateTv = ocRepayOrderDetailActivity.q().f31468e;
            Intrinsics.checkNotNullExpressionValue(mTradeStateTv, "mTradeStateTv");
            if (iIntValue2 == 1) {
                mTradeStateTv.setTextColor(-1);
                mTradeStateTv.setText(k.core_completed);
                Object value9 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((TextView) value9).setVisibility(0);
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_completed), "getString(...)");
            } else if (iIntValue2 == 2) {
                mTradeStateTv.setTextColor(-1);
                mTradeStateTv.setText(k.core_failed);
                ocRepayOrderDetailActivity.n().d();
                ocRepayOrderDetailActivity.p().d();
                ocRepayOrderDetailActivity.o().d();
                Object value10 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((TextView) value10).setVisibility(0);
                relativeLayout = ocRepayOrderDetailActivity.f29805B;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_failed), "getString(...)");
            } else if (iIntValue2 == 3 || iIntValue2 == 6) {
                mTradeStateTv.setTextColor(-1);
                mTradeStateTv.setText(k.core_completed);
                Object value11 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                ((TextView) value11).setVisibility(0);
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_completed), "getString(...)");
            } else if (iIntValue2 != 7) {
                ocRepayOrderDetailActivity.q().f31468e.setTextColor(-1);
                mTradeStateTv.setText(k.core_pending);
                ocRepayOrderDetailActivity.findViewById(p025ba.e.lhtidp_root).setVisibility(8);
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_pending), "getString(...)");
            } else {
                mTradeStateTv.setTextColor(-1);
                mTradeStateTv.setText(k.core_failed);
                ocRepayOrderDetailActivity.n().d();
                ocRepayOrderDetailActivity.p().d();
                ocRepayOrderDetailActivity.o().d();
                Object value12 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                ((TextView) value12).setVisibility(0);
                relativeLayout = ocRepayOrderDetailActivity.f29805B;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                Intrinsics.checkNotNullExpressionValue(ocRepayOrderDetailActivity.getString(k.core_failed), "getString(...)");
            }
            LinearLayout linearLayout = ocRepayOrderDetailActivity.f29807H;
            if (linearLayout != null) {
                Integer operationType3 = data.getOperationType();
                linearLayout.setVisibility((operationType3 == null || operationType3.intValue() != 4 || (accountType = data.getAccountType()) == null || accountType.intValue() != 6) ? 8 : 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g0(Object obj) {
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity = (OcRepayOrderDetailInPalmPayActivity) this.f42500g;
        ocRepayOrderDetailInPalmPayActivity.showLoadingDialog(false);
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            ToastUtils.showShort(commonBeanResult != null ? commonBeanResult.getRespMsg() : null, new Object[0]);
            return;
        }
        MerchantDisburseOrderDetailRsp merchantDisburseOrderDetailRsp = (MerchantDisburseOrderDetailRsp) commonBeanResult.data;
        int i7 = OcRepayOrderDetailInPalmPayActivity.f29822o;
        if (merchantDisburseOrderDetailRsp != null) {
            ocRepayOrderDetailInPalmPayActivity.r().removeAllViews();
            ocRepayOrderDetailInPalmPayActivity.s().removeAllViews();
            ocRepayOrderDetailInPalmPayActivity.t().l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, ocRepayOrderDetailInPalmPayActivity, merchantDisburseOrderDetailRsp.orderStatusDesc, 0.0f, 4, null));
            ocRepayOrderDetailInPalmPayActivity.t().o(ocRepayOrderDetailInPalmPayActivity.getString(g.cs_bill_detail_transfer_from_s_short, merchantDisburseOrderDetailRsp.merchantName));
            OrderResultHeaderModel orderResultHeaderModelT = ocRepayOrderDetailInPalmPayActivity.t();
            Long orderAmount = merchantDisburseOrderDetailRsp.orderAmount;
            Intrinsics.checkNotNullExpressionValue(orderAmount, "orderAmount");
            orderResultHeaderModelT.c(r0.B(orderAmount.longValue(), false));
            ocRepayOrderDetailInPalmPayActivity.t().d(r.cv_ok_card_icon);
            OrderResultHeaderModel orderResultHeaderModelT2 = ocRepayOrderDetailInPalmPayActivity.t();
            Integer orderStatus = merchantDisburseOrderDetailRsp.orderStatus;
            Intrinsics.checkNotNullExpressionValue(orderStatus, "orderStatus");
            orderResultHeaderModelT2.k(ocRepayOrderDetailInPalmPayActivity.o(orderStatus.intValue()));
            ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusArrow().setVisibility(8);
            ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusLayout().setEnabled(false);
            ocRepayOrderDetailInPalmPayActivity.q(ocRepayOrderDetailInPalmPayActivity.getString(g.cs_oc_overpayment_title), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_receipt_transaction_type));
            ocRepayOrderDetailInPalmPayActivity.q(merchantDisburseOrderDetailRsp.orderId, ErrorCodes.MALFORMED_URL_EXCEPTION, ocRepayOrderDetailInPalmPayActivity.getString(k.core_reference_no_2));
            ocRepayOrderDetailInPalmPayActivity.q(r0.R(merchantDisburseOrderDetailRsp.updateTime), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_completion_time));
        }
    }

    private final void h0(Object obj) {
        List<SpreadRepaymentPlan> spreadRepaymentPlanList;
        Long currentAmountSum;
        List<SpreadRepaymentPlan> spreadRepaymentPlanList2;
        List<SpreadRepaymentPlan> spreadRepaymentPlanList3;
        OcBillInsRepaymentPlanResp ocBillInsRepaymentPlanResp = (OcBillInsRepaymentPlanResp) obj;
        OcRepayResultActivity ocRepayResultActivity = (OcRepayResultActivity) this.f42500g;
        ocRepayResultActivity.showLoadingDialog(false);
        if (ocBillInsRepaymentPlanResp != null && ocBillInsRepaymentPlanResp.isSuccess() && ocBillInsRepaymentPlanResp.getData() != null) {
            OcBillInsRepaymentPlanData data = ocBillInsRepaymentPlanResp.getData();
            if (!TextUtils.isEmpty(data != null ? data.getExtensionInfo() : null)) {
                C0525w c0525wF = C0525w.f();
                OcBillInsRepaymentPlanData data2 = ocBillInsRepaymentPlanResp.getData();
                String extensionInfo = data2 != null ? data2.getExtensionInfo() : null;
                c0525wF.getClass();
                Object objD = C0525w.d(extensionInfo, OcInstallmentRepayExtensionBean.class);
                Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                OcInstallmentRepayExtensionBean ocInstallmentRepayExtensionBean = (OcInstallmentRepayExtensionBean) objD;
                SpreadInfoDto spreadInfoDto = ocInstallmentRepayExtensionBean.getSpreadInfoDto();
                List<SpreadRepaymentPlan> spreadRepaymentPlanList4 = spreadInfoDto != null ? spreadInfoDto.getSpreadRepaymentPlanList() : null;
                if (spreadRepaymentPlanList4 == null || spreadRepaymentPlanList4.isEmpty()) {
                    return;
                }
                SpreadInfoDto spreadInfoDto2 = ocInstallmentRepayExtensionBean.getSpreadInfoDto();
                if (((spreadInfoDto2 == null || (spreadRepaymentPlanList3 = spreadInfoDto2.getSpreadRepaymentPlanList()) == null) ? 0 : spreadRepaymentPlanList3.size()) > 1) {
                    SpreadInfoDto spreadInfoDto3 = ocInstallmentRepayExtensionBean.getSpreadInfoDto();
                    SpreadRepaymentPlan spreadRepaymentPlan = (spreadInfoDto3 == null || (spreadRepaymentPlanList2 = spreadInfoDto3.getSpreadRepaymentPlanList()) == null) ? null : spreadRepaymentPlanList2.get(1);
                    Object value = ocRepayResultActivity.t.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((TextView) value).setText(r0.B((spreadRepaymentPlan == null || (currentAmountSum = spreadRepaymentPlan.getCurrentAmountSum()) == null) ? 0L : currentAmountSum.longValue(), true));
                    Object value2 = ocRepayResultActivity.f29854v.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((TextView) value2).setText(ocRepayResultActivity.getString(g.cs_coming_due_on, r0.X1(spreadRepaymentPlan != null ? spreadRepaymentPlan.getRepaymentDateStamp() : null, "dd MMM")));
                    Object value3 = ocRepayResultActivity.f29848p.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    TextView textView = (TextView) value3;
                    int i7 = g.cs_coming_repayment_plan;
                    SpreadInfoDto spreadInfoDto4 = ocInstallmentRepayExtensionBean.getSpreadInfoDto();
                    textView.setText(ocRepayResultActivity.getString(i7, Integer.valueOf((spreadInfoDto4 == null || (spreadRepaymentPlanList = spreadInfoDto4.getSpreadRepaymentPlanList()) == null) ? 0 : spreadRepaymentPlanList.size())));
                    Object value4 = ocRepayResultActivity.f29830A.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((TextView) value4).setVisibility(0);
                    Object value5 = ocRepayResultActivity.f29855w.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    ((ConstraintLayout) value5).setVisibility(0);
                    return;
                }
                return;
            }
        }
        if ((ocBillInsRepaymentPlanResp == null || ocBillInsRepaymentPlanResp.isSuccess()) ? false : true) {
            ToastUtils.showShort(ocBillInsRepaymentPlanResp.getRespMsg(), new Object[0]);
        }
    }

    private final void i0(Object obj) {
        Integer cardLevel;
        OkCardMainPageRsp okCardMainPageRsp = (OkCardMainPageRsp) obj;
        ((OcSettingActivity) this.f42500g).showLoadingDialog(false);
        if (okCardMainPageRsp == null || !okCardMainPageRsp.isSuccess() || okCardMainPageRsp.getData() == null) {
            ToastUtils.showShort(okCardMainPageRsp != null ? okCardMainPageRsp.getRespMsg() : null, new Object[0]);
            Unit unit = Unit.f38893a;
            return;
        }
        OkCardMainPageRspData data = okCardMainPageRsp.getData();
        if (data == null || (cardLevel = data.getCardLevel()) == null || cardLevel.intValue() != 1) {
            q0.u("/credit_score/oc_repayment_info_activity");
        } else {
            q0.u("/credit_score/oc_gold_card_upgarde_activity");
        }
    }

    private final void j0(Object obj) {
        ArrayList arrayList;
        l lVar;
        ArrayList arrayList2;
        CommonListResultV2 response = (CommonListResultV2) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            return;
        }
        ReferEarnWithRewardsListFragment referEarnWithRewardsListFragment = (ReferEarnWithRewardsListFragment) this.f42500g;
        if (referEarnWithRewardsListFragment.f31958o == 1 && (lVar = referEarnWithRewardsListFragment.f31957j) != null && (arrayList2 = lVar.f42578b) != null) {
            arrayList2.clear();
        }
        l lVar2 = referEarnWithRewardsListFragment.f31957j;
        if (lVar2 != null && (arrayList = lVar2.f42578b) != null) {
            arrayList.addAll(response.data);
        }
        l lVar3 = referEarnWithRewardsListFragment.f31957j;
        if (lVar3 != null) {
            lVar3.notifyDataSetChanged();
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42499f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLInstallmentDetailActivity) this.f42500g).addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLInstallmentUpGradeResultActivity) this.f42500g).addSubscription(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLOpenResultActivity) this.f42500g).addSubscription(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLRepayOrderDetailActivity) this.f42500g).addSubscription(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLTakePhotoActivity) this.f42500g).addSubscription(d2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLTotalOverdueActivity) this.f42500g).addSubscription(d2);
                break;
            case 6:
                ((ThirdPartyMerchantListActivity) this.f42500g).addSubscription(d2);
                break;
            case 7:
                ((ThirdPartyMerchantOrderDetailActivity) this.f42500g).addSubscription(d2);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcAllBillActivity) this.f42500g).addSubscription(d2);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcApplyResultActivity) this.f42500g).addSubscription(d2);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcBillInstallmentActivity) this.f42500g).addSubscription(d2);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcContactActivity) this.f42500g).addSubscription(d2);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcFeedbackActivity) this.f42500g).addSubscription(d2);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcFeedbackListActivity) this.f42500g).addSubscription(d2);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcIncreaseRecordActivity) this.f42500g).addSubscription(d2);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcInstallmentRepayActivity) this.f42500g).addSubscription(d2);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcInviteActivity) this.f42500g).addSubscription(d2);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcLastProtocolActivity) this.f42500g).addSubscription(d2);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcMainActivity) this.f42500g).addSubscription(d2);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcMediaActivity) this.f42500g).addSubscription(d2);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcOfflineInstallmentDetailActivity) this.f42500g).addSubscription(d2);
                break;
            case 21:
                ((OcOneLoopActivity) ((C2102t0) this.f42500g).f42923a).addSubscription(d2);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcOtpVerifyActivity) this.f42500g).addSubscription(d2);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcPromotionActivity) this.f42500g).addSubscription(d2);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcRepayOrderDetailActivity) this.f42500g).addSubscription(d2);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcRepayOrderDetailInPalmPayActivity) this.f42500g).addSubscription(d2);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcRepayResultActivity) this.f42500g).addSubscription(d2);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcSettingActivity) this.f42500g).addSubscription(d2);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((ReferEarnWithRewardsListFragment) this.f42500g).f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((ReferEarnWithdrawListFragment) this.f42500g).f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        Object obj = this.f42500g;
        switch (this.f42499f) {
            case 0:
                ((CLInstallmentDetailActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                int i7 = CLInstallmentUpGradeResultActivity.f28931j;
                CLInstallmentUpGradeResultActivity cLInstallmentUpGradeResultActivity = (CLInstallmentUpGradeResultActivity) obj;
                cLInstallmentUpGradeResultActivity.n();
                cLInstallmentUpGradeResultActivity.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                cLInstallmentUpGradeResultActivity.f28933g.postDelayed((Runnable) cLInstallmentUpGradeResultActivity.f28934i.getValue(), 5000L);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                ((CLRepayOrderDetailActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                CLTakePhotoActivity cLTakePhotoActivity = (CLTakePhotoActivity) obj;
                CLUploadImgDialog cLUploadImgDialog = cLTakePhotoActivity.f29137C0;
                if (cLUploadImgDialog != null) {
                    cLUploadImgDialog.dismiss();
                }
                CLTakePhotoActivity.y(cLTakePhotoActivity);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(message, "message");
                ((CLTotalOverdueActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 6:
                ((ThirdPartyMerchantListActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 7:
                ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity = (ThirdPartyMerchantOrderDetailActivity) obj;
                thirdPartyMerchantOrderDetailActivity.showLoadingDialog(false);
                ThirdPartyMerchantOrderDetailActivity.m(thirdPartyMerchantOrderDetailActivity, message);
                break;
            case 8:
                ((OcAllBillActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(message, "message");
                OcApplyResultActivity ocApplyResultActivity = (OcApplyResultActivity) obj;
                ocApplyResultActivity.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                int i10 = OcApplyResultActivity.f29276O0;
                ocApplyResultActivity.z();
                break;
            case 10:
                ((OcBillInstallmentActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcContactActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcFeedbackActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcFeedbackListActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcIncreaseRecordActivity) obj).showLoadingDialog(false);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcInstallmentRepayActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcInviteActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcLastProtocolActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcMediaActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 20:
                ((OcOfflineInstallmentDetailActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 21:
                ToastUtils.showLong(message);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcOtpVerifyActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcPromotionActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcRepayOrderDetailActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcRepayOrderDetailInPalmPayActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcRepayResultActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcSettingActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(message, "message");
                F6.d.c(String.valueOf(message), new Object[0]);
                ToastUtils.showLong(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                F6.d.c(String.valueOf(message), new Object[0]);
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:224:0x0467  */
    /* JADX WARN: Code duplicated, block: B:415:0x094d  */
    /* JADX WARN: Code duplicated, block: B:416:0x0957  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        Integer termLeft;
        Long paidExtensionServiceFee;
        Integer loanType;
        Integer loanType2;
        Long extensionRepaymentDate;
        Integer largeLoanTerm;
        CLBillDetailData cLBillDetailData;
        List<InsRepaymentPlanDetail> repaymentPlanPOList;
        Long unpaidAmount;
        Long outstandingAmount;
        Integer checkStatus;
        Integer status;
        Integer status2;
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo;
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo2;
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo3;
        TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo4;
        String payTypeName;
        String string;
        CLComparePhotoData data;
        Integer failTimes;
        CLComparePhotoData data2;
        Integer faceOptSecondThreshold;
        CLComparePhotoData data3;
        Integer faceOptSecondThreshold2;
        CLComparePhotoData data4;
        Integer failTimes2;
        CLComparePhotoData data5;
        Integer faceOptFirstThreshold;
        CLComparePhotoData data6;
        Integer failTimes3;
        CLComparePhotoData data7;
        Integer faceOptFirstThreshold2;
        CLComparePhotoData data8;
        Integer failTimes4;
        CLTotalOverdueActivity cLTotalOverdueActivity;
        Long outstandingAmount2;
        Long repaymentDate;
        List<OverdueCashLoanDetail> overdueListCashLoan;
        Long outstandingAmount3;
        Long repaymentDateStamp;
        List<OverdueOkCardDetail> overdueListOkCard;
        String respMsg;
        SwipeRecyclerView swipeRecyclerViewT;
        p295tc.p pVar;
        int i7 = 7;
        int i10 = 6;
        String str = "";
        Object obj2 = this.f42500g;
        int iIntValue = 0;
        switch (this.f42499f) {
            case 0:
                Long extensionSendPrincipal = null;
                CLBillDetailResp cLBillDetailResp = (CLBillDetailResp) obj;
                CLInstallmentDetailActivity cLInstallmentDetailActivity = (CLInstallmentDetailActivity) obj2;
                cLInstallmentDetailActivity.showLoadingDialog(false);
                if (cLBillDetailResp == null || !cLBillDetailResp.isSuccess() || cLBillDetailResp.getData() == null) {
                    ToastUtils.showLong(cLBillDetailResp != null ? cLBillDetailResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                CLBillDetailData data9 = cLBillDetailResp.getData();
                cLInstallmentDetailActivity.f28926u0 = data9;
                if (((data9 == null || (outstandingAmount = data9.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) == 0) {
                    cLInstallmentDetailActivity.m().setTextColor(cLInstallmentDetailActivity.getColor(Ya.b.cs_pay_off_txt_color));
                    cLInstallmentDetailActivity.m().setText(cLInstallmentDetailActivity.getString(g.cs_cl_paid_off));
                    cLInstallmentDetailActivity.m().setBackgroundResource(Ya.d.cs_cl_pay_off_txt_bg);
                } else {
                    cLInstallmentDetailActivity.m().setTextColor(cLInstallmentDetailActivity.getColor(L6.b.ppColorTextPrimary));
                    TextView textViewM = cLInstallmentDetailActivity.m();
                    int i11 = g.cs_cl_terms_left;
                    CLBillDetailData cLBillDetailData2 = cLInstallmentDetailActivity.f28926u0;
                    textViewM.setText(cLInstallmentDetailActivity.getString(i11, Integer.valueOf((cLBillDetailData2 == null || (termLeft = cLBillDetailData2.getTermLeft()) == null) ? 0 : termLeft.intValue())));
                    cLInstallmentDetailActivity.m().setBackgroundResource(Ya.d.cs_oc_pay_in_txt_bg);
                }
                Object value = cLInstallmentDetailActivity.f28924s0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                TextView textView = (TextView) value;
                CLBillDetailData cLBillDetailData3 = cLInstallmentDetailActivity.f28926u0;
                textView.setText(com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData3 != null ? cLBillDetailData3.getUnpaidAmount() : null));
                Object value2 = cLInstallmentDetailActivity.f28918k0.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                TextView textView2 = (TextView) value2;
                CLBillDetailData cLBillDetailData4 = cLInstallmentDetailActivity.f28926u0;
                textView2.setText(com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData4 != null ? cLBillDetailData4.getUnpaidPrincipal() : null));
                Object value3 = cLInstallmentDetailActivity.f28909X.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                TextView textView3 = (TextView) value3;
                CLBillDetailData cLBillDetailData5 = cLInstallmentDetailActivity.f28926u0;
                textView3.setText(com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData5 != null ? cLBillDetailData5.getUnpaidInterest() : null));
                Object value4 = cLInstallmentDetailActivity.f28906L.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                TextView textView4 = (TextView) value4;
                CLBillDetailData cLBillDetailData6 = cLInstallmentDetailActivity.f28926u0;
                textView4.setText(com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData6 != null ? cLBillDetailData6.getUnpaidServiceFee() : null));
                Object value5 = cLInstallmentDetailActivity.f28904C.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                TextView textView5 = (TextView) value5;
                CLBillDetailData cLBillDetailData7 = cLInstallmentDetailActivity.f28926u0;
                textView5.setText(com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData7 != null ? cLBillDetailData7.getUnpaidPenalty() : null));
                Object value6 = cLInstallmentDetailActivity.f28902A.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                TextView textView6 = (TextView) value6;
                CLBillDetailData cLBillDetailData8 = cLInstallmentDetailActivity.f28926u0;
                textView6.setText(com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData8 != null ? cLBillDetailData8.getPaidExtensionServiceFee() : null));
                Object value7 = cLInstallmentDetailActivity.f28927v.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                TextView textView7 = (TextView) value7;
                int i12 = g.cs_cl_installment_loan_amount;
                CLBillDetailData cLBillDetailData9 = cLInstallmentDetailActivity.f28926u0;
                textView7.setText(cLInstallmentDetailActivity.getString(i12, com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData9 != null ? cLBillDetailData9.getLoanAmount() : null)));
                Object value8 = cLInstallmentDetailActivity.f28920p.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                TextView textView8 = (TextView) value8;
                int i13 = g.cs_cl_installment_repaid_amount;
                CLBillDetailData cLBillDetailData10 = cLInstallmentDetailActivity.f28926u0;
                textView8.setText(cLInstallmentDetailActivity.getString(i13, com.palmpay.lib.apm.launchcounter.util.d.a(cLBillDetailData10 != null ? cLBillDetailData10.getRepaymentAmount() : null)));
                Object value9 = cLInstallmentDetailActivity.f28913e.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value9;
                CLBillDetailData cLBillDetailData11 = cLInstallmentDetailActivity.f28926u0;
                h.s(linearLayout, ((cLBillDetailData11 == null || (unpaidAmount = cLBillDetailData11.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue()) > 0);
                ArrayList arrayList = cLInstallmentDetailActivity.f28928v0;
                arrayList.clear();
                CLBillDetailData cLBillDetailData12 = cLInstallmentDetailActivity.f28926u0;
                List<InsRepaymentPlanDetail> repaymentPlanPOList2 = cLBillDetailData12 != null ? cLBillDetailData12.getRepaymentPlanPOList() : null;
                if (repaymentPlanPOList2 != null && !repaymentPlanPOList2.isEmpty() && (cLBillDetailData = cLInstallmentDetailActivity.f28926u0) != null && (repaymentPlanPOList = cLBillDetailData.getRepaymentPlanPOList()) != null) {
                    arrayList.addAll(repaymentPlanPOList);
                }
                CLBillDetailData cLBillDetailData13 = cLInstallmentDetailActivity.f28926u0;
                int iIntValue2 = (cLBillDetailData13 == null || (largeLoanTerm = cLBillDetailData13.getLargeLoanTerm()) == null) ? 0 : largeLoanTerm.intValue();
                o oVar = cLInstallmentDetailActivity.f28930w0;
                oVar.f43802d = iIntValue2;
                oVar.notifyDataSetChanged();
                CLBillDetailData cLBillDetailData14 = cLInstallmentDetailActivity.f28926u0;
                t tVar = cLInstallmentDetailActivity.f28916i;
                t tVar2 = cLInstallmentDetailActivity.f28929w;
                t tVar3 = cLInstallmentDetailActivity.f28903B;
                t tVar4 = cLInstallmentDetailActivity.f28905H;
                t tVar5 = cLInstallmentDetailActivity.f28908Q;
                t tVar6 = cLInstallmentDetailActivity.f28911Z;
                t tVar7 = cLInstallmentDetailActivity.f28921p0;
                if (cLBillDetailData14 == null || (loanType2 = cLBillDetailData14.getLoanType()) == null || loanType2.intValue() != 1) {
                    Object value10 = tVar7.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    ((View) value10).setVisibility(0);
                    Object value11 = tVar6.getValue();
                    Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                    ((Group) value11).setVisibility(0);
                    Object value12 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                    ((Group) value12).setVisibility(0);
                    Object value13 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                    ((Group) value13).setVisibility(0);
                    Object value14 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                    ((Group) value14).setVisibility(0);
                    CLBillDetailData cLBillDetailData15 = cLInstallmentDetailActivity.f28926u0;
                    boolean z3 = ((cLBillDetailData15 == null || (paidExtensionServiceFee = cLBillDetailData15.getPaidExtensionServiceFee()) == null) ? 0L : paidExtensionServiceFee.longValue()) > 0;
                    Object value15 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                    h.s((Group) value15, z3);
                    Object value16 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                    ((LinearLayout) value16).setVisibility(8);
                } else {
                    Object value17 = cLInstallmentDetailActivity.f28915g.getValue();
                    Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                    TextView textView9 = (TextView) value17;
                    CLBillDetailData cLBillDetailData16 = cLInstallmentDetailActivity.f28926u0;
                    if (cLBillDetailData16 != null) {
                        extensionSendPrincipal = cLBillDetailData16.getExtensionSendPrincipal();
                    }
                    textView9.setText(com.palmpay.lib.apm.launchcounter.util.d.a(extensionSendPrincipal));
                    Object value18 = cLInstallmentDetailActivity.f28914f.getValue();
                    Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                    TextView textView10 = (TextView) value18;
                    CLBillDetailData cLBillDetailData17 = cLInstallmentDetailActivity.f28926u0;
                    textView10.setText(r0.X1(Long.valueOf((cLBillDetailData17 == null || (extensionRepaymentDate = cLBillDetailData17.getExtensionRepaymentDate()) == null) ? 0L : extensionRepaymentDate.longValue()), "MMM dd, yyyy"));
                    Object value19 = tVar7.getValue();
                    Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                    ((View) value19).setVisibility(8);
                    Object value20 = tVar6.getValue();
                    Intrinsics.checkNotNullExpressionValue(value20, "getValue(...)");
                    ((Group) value20).setVisibility(8);
                    Object value21 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value21, "getValue(...)");
                    ((Group) value21).setVisibility(8);
                    Object value22 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value22, "getValue(...)");
                    ((Group) value22).setVisibility(8);
                    Object value23 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value23, "getValue(...)");
                    ((Group) value23).setVisibility(8);
                    Object value24 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value24, "getValue(...)");
                    ((Group) value24).setVisibility(8);
                    Object value25 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value25, "getValue(...)");
                    ((LinearLayout) value25).setVisibility(0);
                }
                CLBillDetailData cLBillDetailData18 = cLInstallmentDetailActivity.f28926u0;
                if (cLBillDetailData18 != null && (loanType = cLBillDetailData18.getLoanType()) != null && loanType.intValue() == 2) {
                    Object value26 = cLInstallmentDetailActivity.f28923r0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value26, "getValue(...)");
                    ((TextView) value26).setVisibility(0);
                }
                Object value27 = cLInstallmentDetailActivity.f28912d.getValue();
                Intrinsics.checkNotNullExpressionValue(value27, "getValue(...)");
                ((Button) value27).setEnabled(true);
                return;
            case 1:
                CLOpenAccountResp cLOpenAccountResp = (CLOpenAccountResp) obj;
                CLInstallmentUpGradeResultActivity cLInstallmentUpGradeResultActivity = (CLInstallmentUpGradeResultActivity) obj2;
                cLInstallmentUpGradeResultActivity.showLoadingDialog(false);
                if (cLOpenAccountResp != null && cLOpenAccountResp.isSuccess() && cLOpenAccountResp.getData() != null) {
                    cLInstallmentUpGradeResultActivity.f28932f = cLOpenAccountResp.getData();
                }
                CLOpenAccountData cLOpenAccountData = cLInstallmentUpGradeResultActivity.f28932f;
                if (cLOpenAccountData == null || (checkStatus = cLOpenAccountData.getCheckStatus()) == null || checkStatus.intValue() != 0) {
                    cLInstallmentUpGradeResultActivity.n();
                    return;
                } else {
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanReviewing");
                    return;
                }
            case 2:
                Intrinsics.checkNotNullParameter((CommonBeanResult) obj, "response");
                return;
            case 3:
                CLOrderDetailResp cLOrderDetailResp = (CLOrderDetailResp) obj;
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = (CLRepayOrderDetailActivity) obj2;
                cLRepayOrderDetailActivity.showLoadingDialog(false);
                if (cLOrderDetailResp == null) {
                    ToastUtils.showShort(TransferByLoanResult.STATUS_FAILED, new Object[0]);
                    return;
                }
                if (!cLOrderDetailResp.isSuccess() || cLOrderDetailResp.getData() == null) {
                    ToastUtils.showShort(cLOrderDetailResp.getRespMsg(), new Object[0]);
                    return;
                }
                cLRepayOrderDetailActivity.f29025L = cLOrderDetailResp;
                CLOrderDetailData data10 = cLOrderDetailResp.getData();
                if (data10 != null) {
                    OcOrderDetailData postpayOrder = data10.getPostpayOrder();
                    boolean zIsEmpty = TextUtils.isEmpty(postpayOrder != null ? postpayOrder.getBizDesc() : null);
                    t tVar8 = cLRepayOrderDetailActivity.f29032o;
                    if (!zIsEmpty) {
                        TextView textView11 = cLRepayOrderDetailActivity.p().f31466c;
                        OcOrderDetailData postpayOrder2 = data10.getPostpayOrder();
                        textView11.setText(postpayOrder2 != null ? postpayOrder2.getBizDesc() : null);
                        Object value28 = tVar8.getValue();
                        Intrinsics.checkNotNullExpressionValue(value28, "getValue(...)");
                        TextView textView12 = ((ModelTitleContentImg) value28).f31588d;
                        OcOrderDetailData postpayOrder3 = data10.getPostpayOrder();
                        textView12.setText(postpayOrder3 != null ? postpayOrder3.getBizDesc() : null);
                    }
                    Object value29 = cLRepayOrderDetailActivity.f29031j.getValue();
                    Intrinsics.checkNotNullExpressionValue(value29, "getValue(...)");
                    TextView textView13 = (TextView) value29;
                    Long billId = data10.getBillId();
                    h.s(textView13, billId == null || billId.longValue() != 0);
                    OcOrderDetailData postpayOrder4 = data10.getPostpayOrder();
                    if (TextUtils.isEmpty(postpayOrder4 != null ? postpayOrder4.getPayTypeName() : null)) {
                        cLRepayOrderDetailActivity.o().setVisibility(8);
                    } else {
                        OcOrderDetailData postpayOrder5 = data10.getPostpayOrder();
                        if (postpayOrder5 != null && (payTypeName = postpayOrder5.getPayTypeName()) != null) {
                            str = payTypeName;
                        }
                        cLRepayOrderDetailActivity.o().f31588d.setText(str);
                        cLRepayOrderDetailActivity.o().f31589e.setImageResource(r.cv_palmpay_logo_small);
                    }
                    Object value30 = cLRepayOrderDetailActivity.f29026d.getValue();
                    Intrinsics.checkNotNullExpressionValue(value30, "getValue(...)");
                    TextView textView14 = (TextView) value30;
                    int i14 = k.core_transaction_date;
                    OcOrderDetailData postpayOrder6 = data10.getPostpayOrder();
                    textView14.setText(cLRepayOrderDetailActivity.getString(i14, r0.Q(postpayOrder6 != null ? postpayOrder6.getCreateTime() : 0L)));
                    t tVar9 = cLRepayOrderDetailActivity.f29027e;
                    Object value31 = tVar9.getValue();
                    Intrinsics.checkNotNullExpressionValue(value31, "getValue(...)");
                    TextView textView15 = (TextView) value31;
                    int i15 = k.core_post_date;
                    OcOrderDetailData postpayOrder7 = data10.getPostpayOrder();
                    textView15.setText(cLRepayOrderDetailActivity.getString(i15, r0.Q(postpayOrder7 != null ? postpayOrder7.getUpdateTime() : 0L)));
                    Object value32 = cLRepayOrderDetailActivity.f29029g.getValue();
                    Intrinsics.checkNotNullExpressionValue(value32, "getValue(...)");
                    ((TextView) value32).setText(cLRepayOrderDetailActivity.getString(k.core_reference_no, cLRepayOrderDetailActivity.f29023C));
                    t tVar10 = cLRepayOrderDetailActivity.f29028f;
                    Object value33 = tVar10.getValue();
                    Intrinsics.checkNotNullExpressionValue(value33, "getValue(...)");
                    TextView textView16 = (TextView) value33;
                    int i16 = g.cs_oc_palmpay_order_no;
                    OcOrderDetailData postpayOrder8 = data10.getPostpayOrder();
                    textView16.setText(cLRepayOrderDetailActivity.getString(i16, postpayOrder8 != null ? postpayOrder8.getReference() : null));
                    Object value34 = tVar10.getValue();
                    Intrinsics.checkNotNullExpressionValue(value34, "getValue(...)");
                    ((TextView) value34).setVisibility(0);
                    TextView textView17 = cLRepayOrderDetailActivity.p().f31467d;
                    Long repaymentAmount = data10.getRepaymentAmount();
                    textView17.setText(r0.A(repaymentAmount != null ? repaymentAmount.longValue() : 0L));
                    TextView textView18 = cLRepayOrderDetailActivity.n().f31430c.f31455d;
                    OcOrderDetailData postpayOrder9 = data10.getPostpayOrder();
                    textView18.setText(r0.B((postpayOrder9 == null || (amountInfo4 = postpayOrder9.getAmountInfo()) == null) ? 0L : amountInfo4.amount, false));
                    cLRepayOrderDetailActivity.n().f31432e.f31454c.setText(cLRepayOrderDetailActivity.getString(g.cs_cl_order_detail_principal));
                    TextView textView19 = cLRepayOrderDetailActivity.n().f31432e.f31455d;
                    Long principal = data10.getPrincipal();
                    textView19.setText(r0.B(principal != null ? principal.longValue() : 0L, false));
                    cLRepayOrderDetailActivity.n().f31431d.f31454c.setText(cLRepayOrderDetailActivity.getString(g.cs_cl_order_detail_interest));
                    TextView textView20 = cLRepayOrderDetailActivity.n().f31431d.f31455d;
                    Long interest = data10.getInterest();
                    textView20.setText(r0.B(interest != null ? interest.longValue() : 0L, false));
                    cLRepayOrderDetailActivity.n().f31438p.f31454c.setText(cLRepayOrderDetailActivity.getString(g.cs_cl_order_detail_service_fee));
                    TextView textView21 = cLRepayOrderDetailActivity.n().f31438p.f31455d;
                    Long serviceFee = data10.getServiceFee();
                    textView21.setText(r0.B(serviceFee != null ? serviceFee.longValue() : 0L, false));
                    cLRepayOrderDetailActivity.n().t.f31454c.setText(cLRepayOrderDetailActivity.getString(g.cs_cl_order_detail_penalty));
                    TextView textView22 = cLRepayOrderDetailActivity.n().t.f31455d;
                    Long penalty = data10.getPenalty();
                    textView22.setText(r0.B(penalty != null ? penalty.longValue() : 0L, false));
                    cLRepayOrderDetailActivity.n().f31439v.f31454c.setText(cLRepayOrderDetailActivity.getString(g.cs_cl_extend_service_fee));
                    TextView textView23 = cLRepayOrderDetailActivity.n().f31439v.f31455d;
                    Long extensionServiceFee = data10.getExtensionServiceFee();
                    textView23.setText(r0.B(extensionServiceFee != null ? extensionServiceFee.longValue() : 0L, false));
                    cLRepayOrderDetailActivity.n().f31430c.setVisibility(0);
                    cLRepayOrderDetailActivity.n().f31432e.setVisibility(0);
                    cLRepayOrderDetailActivity.n().f31431d.setVisibility(0);
                    cLRepayOrderDetailActivity.n().f31438p.setVisibility(0);
                    cLRepayOrderDetailActivity.n().t.setVisibility(0);
                    Long extensionServiceFee2 = data10.getExtensionServiceFee();
                    if ((extensionServiceFee2 != null ? extensionServiceFee2.longValue() : 0L) > 0) {
                        cLRepayOrderDetailActivity.n().f31439v.setVisibility(0);
                    }
                    cLRepayOrderDetailActivity.n().f31440w.setVisibility(0);
                    TextView textView24 = cLRepayOrderDetailActivity.n().f31440w.f31455d;
                    OcOrderDetailData postpayOrder10 = data10.getPostpayOrder();
                    textView24.setText(r0.B((postpayOrder10 == null || (amountInfo3 = postpayOrder10.getAmountInfo()) == null) ? 0L : amountInfo3.transAmount, false));
                    cLRepayOrderDetailActivity.n().f31440w.f31454c.setTextColor(cLRepayOrderDetailActivity.getColor(Ya.b.cs_cl_main_color));
                    cLRepayOrderDetailActivity.n().f31440w.f31455d.setTextColor(cLRepayOrderDetailActivity.getColor(Ya.b.cs_cl_main_color));
                    OcOrderDetailData postpayOrder11 = data10.getPostpayOrder();
                    if (((postpayOrder11 == null || (amountInfo2 = postpayOrder11.getAmountInfo()) == null) ? 0L : amountInfo2.couponAmount) > 0) {
                        cLRepayOrderDetailActivity.n().f31437o.f31454c.setText(cLRepayOrderDetailActivity.getString(g.cs_cl_order_detail_coupon));
                        TextView textView25 = cLRepayOrderDetailActivity.n().f31437o.f31455d;
                        OcOrderDetailData postpayOrder12 = data10.getPostpayOrder();
                        textView25.setText("-" + r0.B((postpayOrder12 == null || (amountInfo = postpayOrder12.getAmountInfo()) == null) ? 0L : amountInfo.couponAmount, false));
                        cLRepayOrderDetailActivity.n().f31437o.setVisibility(0);
                    }
                    OcOrderDetailData postpayOrder13 = data10.getPostpayOrder();
                    int iIntValue3 = (postpayOrder13 == null || (status2 = postpayOrder13.getStatus()) == null) ? -1 : status2.intValue();
                    cLRepayOrderDetailActivity.p().t.setVisibility(8);
                    if (iIntValue3 == 1) {
                        Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_completed), "getString(...)");
                    } else if (iIntValue3 == 2) {
                        Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_failed), "getString(...)");
                    } else if (iIntValue3 == 6) {
                        Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_completed), "getString(...)");
                    } else if (iIntValue3 != 7) {
                        Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_pending), "getString(...)");
                    } else {
                        Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_failed), "getString(...)");
                    }
                    OcOrderDetailData postpayOrder14 = data10.getPostpayOrder();
                    int iIntValue4 = (postpayOrder14 == null || (status = postpayOrder14.getStatus()) == null) ? -1 : status.intValue();
                    TextView mTradeStateTv = cLRepayOrderDetailActivity.p().f31468e;
                    Intrinsics.checkNotNullExpressionValue(mTradeStateTv, "mTradeStateTv");
                    if (iIntValue4 != 1) {
                        if (iIntValue4 != 2) {
                            if (iIntValue4 != 3 && iIntValue4 != 6) {
                                if (iIntValue4 != 7) {
                                    cLRepayOrderDetailActivity.p().f31468e.setTextColor(-1);
                                    mTradeStateTv.setText(k.core_pending);
                                    cLRepayOrderDetailActivity.findViewById(p025ba.e.lhtidp_root).setVisibility(8);
                                    Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_pending), "getString(...)");
                                    return;
                                }
                            }
                        }
                        mTradeStateTv.setTextColor(-1);
                        mTradeStateTv.setText(k.core_failed);
                        cLRepayOrderDetailActivity.n().d();
                        cLRepayOrderDetailActivity.o().d();
                        Object value35 = tVar8.getValue();
                        Intrinsics.checkNotNullExpressionValue(value35, "getValue(...)");
                        ((ModelTitleContentImg) value35).d();
                        Object value36 = tVar9.getValue();
                        Intrinsics.checkNotNullExpressionValue(value36, "getValue(...)");
                        ((TextView) value36).setVisibility(0);
                        RelativeLayout relativeLayout = cLRepayOrderDetailActivity.f29035w;
                        if (relativeLayout != null) {
                            relativeLayout.setVisibility(0);
                        }
                        Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_failed), "getString(...)");
                        return;
                    }
                    mTradeStateTv.setTextColor(-1);
                    mTradeStateTv.setText(k.core_completed);
                    Object value37 = tVar9.getValue();
                    Intrinsics.checkNotNullExpressionValue(value37, "getValue(...)");
                    ((TextView) value37).setVisibility(0);
                    Intrinsics.checkNotNullExpressionValue(cLRepayOrderDetailActivity.getString(k.core_completed), "getString(...)");
                    return;
                }
                return;
            case 4:
                CLComparePhotoResp cLComparePhotoResp = (CLComparePhotoResp) obj;
                CLTakePhotoActivity cLTakePhotoActivity = (CLTakePhotoActivity) obj2;
                CLUploadImgDialog cLUploadImgDialog = cLTakePhotoActivity.f29137C0;
                if (cLUploadImgDialog != null) {
                    cLUploadImgDialog.dismiss();
                }
                CLTakePhotoActivity.y(cLTakePhotoActivity);
                if (cLComparePhotoResp != null && cLComparePhotoResp.isSuccess()) {
                    cLTakePhotoActivity.z();
                    return;
                }
                String respMsg2 = cLComparePhotoResp != null ? cLComparePhotoResp.getRespMsg() : null;
                String respCode = cLComparePhotoResp != null ? cLComparePhotoResp.getRespCode() : null;
                if (respCode != null) {
                    switch (respCode) {
                        case "VL000014":
                            string = cLTakePhotoActivity.getString(g.cs_face_not_recognized);
                            break;
                        case "VL000015":
                            string = cLTakePhotoActivity.getString(g.cs_mutiple_faces);
                            break;
                        case "VL000016":
                            string = cLTakePhotoActivity.getString(g.cs_blurry_photo);
                            break;
                        default:
                            string = cLTakePhotoActivity.getString(g.cs_take_photo_common_error_title);
                            break;
                    }
                } else {
                    string = cLTakePhotoActivity.getString(g.cs_take_photo_common_error_title);
                }
                String str2 = string;
                if (((cLComparePhotoResp == null || (data8 = cLComparePhotoResp.getData()) == null || (failTimes4 = data8.getFailTimes()) == null) ? 0 : failTimes4.intValue()) <= ((cLComparePhotoResp == null || (data7 = cLComparePhotoResp.getData()) == null || (faceOptFirstThreshold2 = data7.getFaceOptFirstThreshold()) == null) ? 0 : faceOptFirstThreshold2.intValue())) {
                    CLCompareFailedDialog cLCompareFailedDialog = new CLCompareFailedDialog(cLTakePhotoActivity, null, cLTakePhotoActivity.getString(k.core_try_again), str2, respMsg2, null, 32, null);
                    cLCompareFailedDialog.setSkipListener(new o0(cLTakePhotoActivity, i10));
                    cLCompareFailedDialog.show();
                    return;
                }
                if (((cLComparePhotoResp == null || (data6 = cLComparePhotoResp.getData()) == null || (failTimes3 = data6.getFailTimes()) == null) ? 0 : failTimes3.intValue()) > ((cLComparePhotoResp == null || (data5 = cLComparePhotoResp.getData()) == null || (faceOptFirstThreshold = data5.getFaceOptFirstThreshold()) == null) ? 0 : faceOptFirstThreshold.intValue())) {
                    if (((cLComparePhotoResp == null || (data4 = cLComparePhotoResp.getData()) == null || (failTimes2 = data4.getFailTimes()) == null) ? 0 : failTimes2.intValue()) <= ((cLComparePhotoResp == null || (data3 = cLComparePhotoResp.getData()) == null || (faceOptSecondThreshold2 = data3.getFaceOptSecondThreshold()) == null) ? 0 : faceOptSecondThreshold2.intValue())) {
                        String string2 = cLTakePhotoActivity.getString(k.core_try_again1);
                        String string3 = cLTakePhotoActivity.getString(k.core_skip);
                        int i17 = g.cs_attempts_left;
                        int iIntValue5 = (cLComparePhotoResp == null || (data2 = cLComparePhotoResp.getData()) == null || (faceOptSecondThreshold = data2.getFaceOptSecondThreshold()) == null) ? 0 : faceOptSecondThreshold.intValue();
                        if (cLComparePhotoResp != null && (data = cLComparePhotoResp.getData()) != null && (failTimes = data.getFailTimes()) != null) {
                            iIntValue = failTimes.intValue();
                        }
                        CLCompareFailedDialog cLCompareFailedDialog2 = new CLCompareFailedDialog(cLTakePhotoActivity, string2, string3, str2, respMsg2, cLTakePhotoActivity.getString(i17, Integer.valueOf(iIntValue5 - iIntValue)));
                        cLCompareFailedDialog2.setTryAgainListener(new o0(cLTakePhotoActivity, i7));
                        cLCompareFailedDialog2.setSkipListener(new o0(cLTakePhotoActivity, 8));
                        cLCompareFailedDialog2.show();
                        return;
                    }
                }
                c cVar = new c(cLTakePhotoActivity);
                cVar.f6596b = O6.d.f(cLTakePhotoActivity.getString(g.cs_frequency_exceeds_limit));
                cVar.f6598d = cLTakePhotoActivity.getString(g.cs_reached_limit_task);
                cVar.f6606l = 8388611;
                String string4 = cLTakePhotoActivity.getString(k.core_confirm);
                o0 o0Var = new o0(cLTakePhotoActivity, 9);
                cVar.f6600f = string4;
                cVar.f6602h = o0Var;
                O6.d dVarA = cVar.a();
                Intrinsics.checkNotNullExpressionValue(dVarA, "create(...)");
                dVarA.setCanceledOnTouchOutside(false);
                dVarA.setCancelable(true);
                dVarA.show();
                return;
            case 5:
                OcClOverdueBillResp ocClOverdueBillResp = (OcClOverdueBillResp) obj;
                CLTotalOverdueActivity cLTotalOverdueActivity2 = (CLTotalOverdueActivity) obj2;
                cLTotalOverdueActivity2.showLoadingDialog(false);
                if (ocClOverdueBillResp == null || !ocClOverdueBillResp.isSuccess()) {
                    return;
                }
                OcClOverdueBillData data11 = ocClOverdueBillResp.getData();
                cLTotalOverdueActivity2.f29162A = data11;
                List<OverdueOkCardDetail> overdueListOkCard2 = data11 != null ? data11.getOverdueListOkCard() : null;
                t tVar11 = cLTotalOverdueActivity2.f29171v;
                if (overdueListOkCard2 == null || overdueListOkCard2.isEmpty()) {
                    cLTotalOverdueActivity = cLTotalOverdueActivity2;
                    Object value38 = tVar11.getValue();
                    Intrinsics.checkNotNullExpressionValue(value38, "getValue(...)");
                    ((ConstraintLayout) value38).setVisibility(8);
                } else {
                    OcClOverdueBillData ocClOverdueBillData = cLTotalOverdueActivity2.f29162A;
                    OverdueOkCardDetail overdueOkCardDetail = (ocClOverdueBillData == null || (overdueListOkCard = ocClOverdueBillData.getOverdueListOkCard()) == null) ? null : overdueListOkCard.get(0);
                    long jLongValue = (overdueOkCardDetail == null || (repaymentDateStamp = overdueOkCardDetail.getRepaymentDateStamp()) == null) ? 0L : repaymentDateStamp.longValue();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(jLongValue));
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    long jC = (q0.c(calendar2, 13, 0, 14, 0) - calendar.getTimeInMillis()) / ((long) 86400000);
                    cLTotalOverdueActivity = cLTotalOverdueActivity2;
                    t tVar12 = cLTotalOverdueActivity.f29170p;
                    Object value39 = tVar12.getValue();
                    Intrinsics.checkNotNullExpressionValue(value39, "getValue(...)");
                    ((TextView) value39).setText(jC > 1 ? cLTotalOverdueActivity.getString(g.cs_total_overdue_day, Long.valueOf(jC), "s") : cLTotalOverdueActivity.getString(g.cs_total_overdue_day, Long.valueOf(jC), ""));
                    Object value40 = tVar12.getValue();
                    Intrinsics.checkNotNullExpressionValue(value40, "getValue(...)");
                    ((TextView) value40).setVisibility(0);
                    Object value41 = cLTotalOverdueActivity.t.getValue();
                    Intrinsics.checkNotNullExpressionValue(value41, "getValue(...)");
                    ((TextView) value41).setText(cLTotalOverdueActivity.getString(g.cs_cl_total_due_on_date, r0.X1(overdueOkCardDetail != null ? overdueOkCardDetail.getRepaymentDateStamp() : null, "dd MMM")));
                    Object value42 = cLTotalOverdueActivity.f29169o.getValue();
                    Intrinsics.checkNotNullExpressionValue(value42, "getValue(...)");
                    ((TextView) value42).setText(r0.B((overdueOkCardDetail == null || (outstandingAmount3 = overdueOkCardDetail.getOutstandingAmount()) == null) ? 0L : outstandingAmount3.longValue(), true));
                    Object value43 = tVar11.getValue();
                    Intrinsics.checkNotNullExpressionValue(value43, "getValue(...)");
                    ((ConstraintLayout) value43).setVisibility(0);
                }
                OcClOverdueBillData ocClOverdueBillData2 = cLTotalOverdueActivity.f29162A;
                List<OverdueCashLoanDetail> overdueListCashLoan2 = ocClOverdueBillData2 != null ? ocClOverdueBillData2.getOverdueListCashLoan() : null;
                t tVar13 = cLTotalOverdueActivity.f29167i;
                if (overdueListCashLoan2 == null || overdueListCashLoan2.isEmpty()) {
                    Object value44 = tVar13.getValue();
                    Intrinsics.checkNotNullExpressionValue(value44, "getValue(...)");
                    ((ConstraintLayout) value44).setVisibility(8);
                    return;
                }
                OcClOverdueBillData ocClOverdueBillData3 = cLTotalOverdueActivity.f29162A;
                OverdueCashLoanDetail overdueCashLoanDetail = (ocClOverdueBillData3 == null || (overdueListCashLoan = ocClOverdueBillData3.getOverdueListCashLoan()) == null) ? null : overdueListCashLoan.get(0);
                long jLongValue2 = (overdueCashLoanDetail == null || (repaymentDate = overdueCashLoanDetail.getRepaymentDate()) == null) ? 0L : repaymentDate.longValue();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(new Date(jLongValue2));
                calendar3.set(11, 0);
                calendar3.set(12, 0);
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.set(11, 0);
                calendar4.set(12, 0);
                long jC2 = (q0.c(calendar4, 13, 0, 14, 0) - calendar3.getTimeInMillis()) / ((long) 86400000);
                t tVar14 = cLTotalOverdueActivity.f29165f;
                Object value45 = tVar14.getValue();
                Intrinsics.checkNotNullExpressionValue(value45, "getValue(...)");
                ((TextView) value45).setText(jC2 > 1 ? cLTotalOverdueActivity.getString(g.cs_total_overdue_day, Long.valueOf(jC2), "s") : cLTotalOverdueActivity.getString(g.cs_total_overdue_day, Long.valueOf(jC2), ""));
                Object value46 = tVar14.getValue();
                Intrinsics.checkNotNullExpressionValue(value46, "getValue(...)");
                ((TextView) value46).setVisibility(0);
                Object value47 = cLTotalOverdueActivity.f29166g.getValue();
                Intrinsics.checkNotNullExpressionValue(value47, "getValue(...)");
                ((TextView) value47).setText(cLTotalOverdueActivity.getString(g.cs_cl_total_due_on_date, r0.X1(overdueCashLoanDetail != null ? overdueCashLoanDetail.getRepaymentDate() : null, "dd MMM")));
                Object value48 = cLTotalOverdueActivity.f29164e.getValue();
                Intrinsics.checkNotNullExpressionValue(value48, "getValue(...)");
                ((TextView) value48).setText(r0.B((overdueCashLoanDetail == null || (outstandingAmount2 = overdueCashLoanDetail.getOutstandingAmount()) == null) ? 0L : outstandingAmount2.longValue(), true));
                Object value49 = tVar13.getValue();
                Intrinsics.checkNotNullExpressionValue(value49, "getValue(...)");
                ((ConstraintLayout) value49).setVisibility(0);
                return;
            case 6:
                ThirdPartyMerchantListResp thirdPartyMerchantListResp = (ThirdPartyMerchantListResp) obj;
                ThirdPartyMerchantListActivity thirdPartyMerchantListActivity = (ThirdPartyMerchantListActivity) obj2;
                thirdPartyMerchantListActivity.showLoadingDialog(false);
                if (!thirdPartyMerchantListResp.isSuccess()) {
                    ToastUtils.showLong(thirdPartyMerchantListResp.getRespMsg());
                    return;
                }
                if (thirdPartyMerchantListResp.getData() != null && !thirdPartyMerchantListResp.getData().isEmpty()) {
                    thirdPartyMerchantListActivity.f35000b.a(thirdPartyMerchantListResp.getData());
                    return;
                }
                ModelEmptyView modelEmptyView = new ModelEmptyView(thirdPartyMerchantListActivity);
                modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
                modelEmptyView.f31512c.setText(Ac.h.main_no_bill_record);
                thirdPartyMerchantListActivity.f34999a.setEmptyView(modelEmptyView);
                return;
            case 7:
                R(obj);
                return;
            case 8:
                S(obj);
                return;
            case 9:
                OcApplyResultResp ocApplyResultResp = (OcApplyResultResp) obj;
                OcApplyResultActivity ocApplyResultActivity = (OcApplyResultActivity) obj2;
                ocApplyResultActivity.showLoadingDialog(false);
                if (ocApplyResultResp != null && ocApplyResultResp.isSuccess() && ocApplyResultResp.getData() != null) {
                    ocApplyResultActivity.f29283D0 = ocApplyResultResp.getData();
                }
                int i18 = OcApplyResultActivity.f29276O0;
                ocApplyResultActivity.z();
                return;
            case 10:
                T(obj);
                return;
            case 11:
                U(obj);
                return;
            case 12:
                CommonResult commonResult = (CommonResult) obj;
                OcFeedbackActivity ocFeedbackActivity = (OcFeedbackActivity) obj2;
                ocFeedbackActivity.showLoadingDialog(false);
                if (commonResult != null && commonResult.isSuccess()) {
                    String string5 = ocFeedbackActivity.getString(g.cs_oc_feedback_success_msg);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    OcFeedbackSubmitResultDialog ocFeedbackSubmitResultDialog = new OcFeedbackSubmitResultDialog(ocFeedbackActivity, 0, string5);
                    ocFeedbackSubmitResultDialog.setOnDismissListener(new K(ocFeedbackActivity, iIntValue));
                    ocFeedbackSubmitResultDialog.show();
                    return;
                }
                if (commonResult != null && (respMsg = commonResult.getRespMsg()) != null) {
                    str = respMsg;
                }
                int i19 = OcFeedbackActivity.f29425H;
                OcFeedbackSubmitResultDialog ocFeedbackSubmitResultDialog2 = new OcFeedbackSubmitResultDialog(ocFeedbackActivity, 1, str);
                ocFeedbackSubmitResultDialog2.setOnDismissListener(new K(ocFeedbackActivity, iIntValue));
                ocFeedbackSubmitResultDialog2.show();
                return;
            case 13:
                V(obj);
                return;
            case 14:
                OcIncreaseResp ocIncreaseResp = (OcIncreaseResp) obj;
                if (ocIncreaseResp == null || !ocIncreaseResp.isSuccess()) {
                    ToastUtils.showShort(ocIncreaseResp != null ? ocIncreaseResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                List<OcIncreaseData> data12 = ocIncreaseResp.getData();
                if (data12 == null || data12.isEmpty()) {
                    return;
                }
                OcIncreaseRecordActivity ocIncreaseRecordActivity = (OcIncreaseRecordActivity) obj2;
                ArrayList arrayList2 = ocIncreaseRecordActivity.f29505e;
                if (arrayList2 == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                List<OcIncreaseData> data13 = ocIncreaseResp.getData();
                Intrinsics.e(data13);
                arrayList2.addAll(data13);
                C2137e c2137e = ocIncreaseRecordActivity.f29506f;
                if (c2137e != null) {
                    c2137e.notifyDataSetChanged();
                    return;
                } else {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
            case 15:
                W(obj);
                return;
            case 16:
                X(obj);
                return;
            case 17:
                Y(obj);
                return;
            case 18:
                Z(obj);
                return;
            case 19:
                a0(obj);
                return;
            case 20:
                b0(obj);
                return;
            case 21:
                c0(obj);
                return;
            case 22:
                d0(obj);
                return;
            case 23:
                e0(obj);
                return;
            case 24:
                f0(obj);
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                g0(obj);
                return;
            case 26:
                h0(obj);
                return;
            case 27:
                i0(obj);
                return;
            case 28:
                j0(obj);
                return;
            default:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccess()) {
                    ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                    return;
                }
                ReferEarnWithdrawListFragment referEarnWithdrawListFragment = (ReferEarnWithdrawListFragment) obj2;
                referEarnWithdrawListFragment.f31964p = ((ReferEarnWithDrawHistoryResp) response.data).totalPage;
                if (referEarnWithdrawListFragment.f31963o == 1 && (pVar = referEarnWithdrawListFragment.f31962j) != null) {
                    pVar.b();
                }
                p295tc.p pVar2 = referEarnWithdrawListFragment.f31962j;
                if (pVar2 != null) {
                    pVar2.a(((ReferEarnWithDrawHistoryResp) response.data).list);
                }
                p295tc.p pVar3 = referEarnWithdrawListFragment.f31962j;
                if (pVar3 != null) {
                    pVar3.notifyDataSetChanged();
                }
                if (!((ReferEarnWithDrawHistoryResp) response.data).list.isEmpty() || (swipeRecyclerViewT = referEarnWithdrawListFragment.t()) == null) {
                    return;
                }
                swipeRecyclerViewT.c();
                return;
        }
    }
}
