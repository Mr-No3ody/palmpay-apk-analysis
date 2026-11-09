package T8;

import Bc.B;
import Bc.C0108e;
import C0.AbstractC0130w;
import C0.G;
import C0.K;
import C0.P;
import C9.ViewOnClickListenerC0146m;
import Fe.h0;
import N8.m0;
import N8.q0;
import Pa.C0525w;
import Pa.i0;
import Pa.k0;
import Pa.n0;
import Pa.r0;
import Rd.C0585a;
import Rd.C0588d;
import Rd.C0597m;
import Rd.N;
import Uc.I0;
import Wd.ViewOnClickListenerC0743q;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.lifecycle.V;
import com.adjust.sdk.network.ErrorCodes;
import com.google.api.Service;
import com.google.gson.Gson;
import com.palmpay.lib.ui.button.PpButton;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.NameCheckRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveAuthorizationConfirmFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveBirthCertificateFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationConfirmBvnFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStepFace2Fragment;
import com.transsnet.palmpay.airtime.bean.AirtimeGroupPurchaseDetailData;
import com.transsnet.palmpay.airtime.bean.rsp.AutoRenewTaskBean;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskRsp;
import com.transsnet.palmpay.airtime.ui.AirtimeGroupPurchaseResultActivity;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.dialog.NotEnoughAssetsDialog;
import com.transsnet.palmpay.contacts.bean.resp.RelationShipLogListResp;
import com.transsnet.palmpay.contacts.ui.activity.LinkFaveNoticeListActivity;
import com.transsnet.palmpay.core.bean.BillProcessData2;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.core.bean.rsp.GetCashBoxNewcomerResp;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentGroup;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryMobileWalletTypeByPhoneRsp;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.model.OrderDetailInfoListModel;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle2;
import com.transsnet.palmpay.custom_view.model.OrderResultCopyToken;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.databundle.ui.activity.BuyFlashSaleActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoRenewTaskStatusActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;
import com.transsnet.palmpay.managemoney.bean.PayStatus;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxOrderDetailResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetIdentityResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxStatResp;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.bean.resp.WithdrawOrderDetailResp;
import com.transsnet.palmpay.managemoney.ui.activity.C;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxAutoSaveOperationActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxOrderResultActivity;
import com.transsnet.palmpay.managemoney.ui.activity.FixedSavingOrderForBreakResultActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PaybackDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity;
import com.transsnet.palmpay.managemoney.ui.activity.ViewOnClickListenerC1567m;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxUseCouponResultDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveSuccessDialogFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxAutoSaveFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxIntroductionFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxMainFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxTransactionHistoryFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.FundTransactionHistoryFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderDetailFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.TargetSavingsTransactionHistoryFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.TransactionDetailFragment;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashDetailActivity;
import com.transsnet.palmpay.teller.bean.AgentOrderDetailRsp;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.activity.AgentOrderDetailActivity;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentOrderDetailActivity;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.teller.ui.dialog.InputFlashSaleNumberDialog;
import com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem;
import com.transsnet.palmpay.teller.ui.view.ModelPointClaimItem;
import com.transsnet.palmpay.ui.activity.BillPaymentEditActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.F;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o9.L;
import p141j9.C1799g;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9061c;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.f9059a = i7;
        this.f9060b = obj;
        this.f9061c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj) {
        ImageView tokenItemIv;
        ImageView orderStatusArrow;
        Boolean needClaimPoint;
        Long unclaimedReturnPoint;
        C0597m c0597m;
        C0597m c0597m2;
        LinearLayout orderStatusLayout;
        ImageView orderStatusArrow2;
        List<BillProcessData2> list;
        C0597m c0597m3;
        C0597m c0597m4;
        C0597m c0597m5;
        int i7 = 2;
        boolean zBooleanValue = false;
        zBooleanValue = false;
        final int i10 = 1;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        BillPaymentOrderDetailActivity billPaymentOrderDetailActivity = (BillPaymentOrderDetailActivity) this.f9060b;
        if (z3) {
            billPaymentOrderDetailActivity.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            billPaymentOrderDetailActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonBeanResult.isSuccess();
            BillPaymentOrderDetailActivity billPaymentOrderDetailActivity2 = (BillPaymentOrderDetailActivity) this.f9061c;
            if (zIsSuccess) {
                final BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = (BillPaymentOrderDetailRsp) commonBeanResult.data;
                BillPaymentOrderDetailActivity.a aVar = BillPaymentOrderDetailActivity.f34162i;
                if (i0.W(billPaymentOrderDetailActivity2) && billPaymentOrderDetailRsp != null) {
                    billPaymentOrderDetailActivity2.f34165f = billPaymentOrderDetailRsp;
                    if (!TextUtils.isEmpty(billPaymentOrderDetailRsp.getRechargePIN())) {
                        C0597m c0597m6 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m6 != null) {
                            c0597m6.f8397d.setVisibility(0);
                        }
                        C0597m c0597m7 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m7 != null) {
                            OrderResultCopyToken orderResultCopyToken = c0597m7.f8397d;
                            final int i11 = zBooleanValue ? 1 : 0;
                            View.OnClickListener listener = new View.OnClickListener() { // from class: Wd.h
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    String icon;
                                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = billPaymentOrderDetailRsp;
                                    switch (i11) {
                                        case 0:
                                            BillPaymentOrderDetailActivity.a aVar2 = BillPaymentOrderDetailActivity.f34162i;
                                            ToastUtils.showLong(com.transsnet.palmpay.custom_view.v.cv_copy_successful);
                                            ClipboardUtils.copyText(billPaymentOrderDetailRsp2.getRechargePIN());
                                            break;
                                        default:
                                            BillPaymentOrderDetailActivity.a aVar3 = BillPaymentOrderDetailActivity.f34162i;
                                            String str = "";
                                            if (!Intrinsics.c(billPaymentOrderDetailRsp2.getCategoryId(), TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT) ? (icon = billPaymentOrderDetailRsp2.getIcon()) != null : (icon = billPaymentOrderDetailRsp2.getBillerLogo()) != null) {
                                                str = icon;
                                            }
                                            p070ee.c.k(str, billPaymentOrderDetailRsp2);
                                            break;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            orderResultCopyToken.setOnClickListener(listener);
                        }
                        C0597m c0597m8 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m8 != null) {
                            c0597m8.f8397d.a(!TextUtils.isEmpty(billPaymentOrderDetailRsp.getTokenName()) ? billPaymentOrderDetailRsp.getTokenName() : billPaymentOrderDetailActivity2.getString(p025ba.k.core_token));
                        }
                        C0597m c0597m9 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m9 != null) {
                            c0597m9.f8397d.b(billPaymentOrderDetailRsp.getRechargePIN());
                        }
                    } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getItemRemark())) {
                        C0597m c0597m10 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m10 != null) {
                            c0597m10.f8397d.setVisibility(8);
                        }
                    } else {
                        C0597m c0597m11 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m11 != null) {
                            c0597m11.f8397d.setVisibility(0);
                        }
                        C0597m c0597m12 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m12 != null && (tokenItemIv = c0597m12.f8397d.getTokenItemIv()) != null) {
                            p220oa.h.s(tokenItemIv, false);
                        }
                        if (TransType.TRANS_TYPE_EX_GRATIA_REFUND.equals(billPaymentOrderDetailRsp.getCategoryId())) {
                            C0597m c0597m13 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m13 != null) {
                                c0597m13.f8397d.a(billPaymentOrderDetailActivity2.getString(v.cv_detail));
                            }
                        } else {
                            C0597m c0597m14 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m14 != null) {
                                c0597m14.f8397d.a(billPaymentOrderDetailActivity2.getString(Vd.a.qt_bundle_details));
                            }
                        }
                        C0597m c0597m15 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m15 != null) {
                            c0597m15.f8397d.b(billPaymentOrderDetailRsp.getItemRemark());
                        }
                    }
                    if (TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT.equals(billPaymentOrderDetailRsp.getCategoryId())) {
                        Integer orderStatus = billPaymentOrderDetailRsp.getOrderStatus();
                        if ((orderStatus != null ? orderStatus.intValue() : 0) == 1) {
                            C0597m c0597m16 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if ((c0597m16 != null ? c0597m16.f8402j.getParent() : null) != null) {
                                try {
                                    C0597m c0597m17 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                                    if (c0597m17 != null) {
                                        c0597m17.f8402j.setLayoutResource(Pd.d.qt_stub_gift_card_info);
                                    }
                                    C0597m c0597m18 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                                    View viewInflate = c0597m18 != null ? c0597m18.f8402j.inflate() : null;
                                    C0597m c0597m19 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                                    if (c0597m19 != null) {
                                        p220oa.h.s(c0597m19.f8402j, true);
                                    }
                                    ModelGiftCardItem modelGiftCardItem = viewInflate != null ? (ModelGiftCardItem) viewInflate.findViewById(Pd.c.model_gift_card_item) : null;
                                    if (modelGiftCardItem != null) {
                                        modelGiftCardItem.d(billPaymentOrderDetailRsp);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            String paymentItemName = billPaymentOrderDetailRsp.getPaymentItemName();
                            if (paymentItemName != null) {
                                if (paymentItemName.length() <= 0) {
                                    paymentItemName = null;
                                }
                                if (paymentItemName != null && (c0597m5 = (C0597m) billPaymentOrderDetailActivity2.f27334c) != null) {
                                    OrderDetailInfoListModel orderDetailInfoListModel = c0597m5.f8396c;
                                    int i12 = Pd.f.qt_giftcard_value;
                                    String currencySymbol = billPaymentOrderDetailRsp.getCurrencySymbol();
                                    if (currencySymbol == null) {
                                        currencySymbol = "";
                                    }
                                    orderDetailInfoListModel.addView(new OrderResultItemModel(billPaymentOrderDetailActivity2, i12, currencySymbol.concat(paymentItemName)));
                                }
                            }
                            String countryName = billPaymentOrderDetailRsp.getCountryName();
                            if (countryName != null) {
                                if (countryName.length() <= 0) {
                                    countryName = null;
                                }
                                if (countryName != null && (c0597m4 = (C0597m) billPaymentOrderDetailActivity2.f27334c) != null) {
                                    c0597m4.f8396c.addView(new OrderResultItemModel(billPaymentOrderDetailActivity2, Pd.f.qt_applicable_country, countryName));
                                }
                            }
                        }
                    }
                    Uri uriF = p070ee.c.f(billPaymentOrderDetailRsp.getCategoryId());
                    String billerLogo = TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT.equals(billPaymentOrderDetailRsp.getCategoryId()) ? billPaymentOrderDetailRsp.getBillerLogo() : billPaymentOrderDetailRsp.getIcon();
                    if (TextUtils.isEmpty(billerLogo)) {
                        C0597m c0597m20 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m20 != null) {
                            c0597m20.f8399f.e(uriF);
                        }
                    } else {
                        C0597m c0597m21 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m21 != null) {
                            c0597m21.f8399f.h(billerLogo);
                        }
                    }
                    if (5 == billPaymentOrderDetailRsp.getBusinessType()) {
                        C0597m c0597m22 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m22 != null) {
                            c0597m22.f8399f.o(billPaymentOrderDetailRsp.getBillerName());
                        }
                    } else if (Intrinsics.c(billPaymentOrderDetailRsp.getRenewal(), Boolean.TRUE)) {
                        C0597m c0597m23 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m23 != null) {
                            c0597m23.f8399f.o(billPaymentOrderDetailActivity2.getString(Pd.f.qt_x_renew, billPaymentOrderDetailRsp.getBillerName()));
                        }
                    } else {
                        C0597m c0597m24 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m24 != null) {
                            c0597m24.f8399f.o(billPaymentOrderDetailRsp.getBillerName());
                        }
                    }
                    C0597m c0597m25 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                    if (c0597m25 != null) {
                        c0597m25.f8399f.k(billPaymentOrderDetailRsp.getOrderStatusDesc());
                    }
                    C0597m c0597m26 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                    long jLongValue = 0;
                    if (c0597m26 != null) {
                        OrderResultHeaderModel orderResultHeaderModel = c0597m26.f8399f;
                        Long payAmount = billPaymentOrderDetailRsp.getPayAmount();
                        orderResultHeaderModel.c(r0.B(payAmount != null ? payAmount.longValue() : 0L, false));
                    }
                    C0597m c0597m27 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                    if (c0597m27 != null) {
                        c0597m27.f8399f.l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, billPaymentOrderDetailActivity2, billPaymentOrderDetailRsp.getOrderStatusDesc(), 0.0f, 4, null));
                    }
                    Integer orderStatus2 = billPaymentOrderDetailRsp.getOrderStatus();
                    if (orderStatus2 != null && orderStatus2.intValue() == 2 && !TextUtils.isEmpty(billPaymentOrderDetailRsp.getErrorMessage()) && (c0597m3 = (C0597m) billPaymentOrderDetailActivity2.f27334c) != null) {
                        c0597m3.f8399f.m(billPaymentOrderDetailRsp.getErrorMessage() + (TextUtils.isEmpty(billPaymentOrderDetailRsp.getErrorCode()) ? "" : q0.k("(", billPaymentOrderDetailRsp.getErrorCode(), ")")) + " ");
                    }
                    BillProcessDetail orderStatusInfo = billPaymentOrderDetailRsp.getOrderStatusInfo();
                    boolean z8 = ((orderStatusInfo == null || (list = orderStatusInfo.fullTips) == null) ? 0 : list.size()) > 0;
                    if (z8) {
                        C0597m c0597m28 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m28 != null && (orderStatusArrow = c0597m28.f8399f.getOrderStatusArrow()) != null) {
                            orderStatusArrow.setVisibility(0);
                        }
                    } else {
                        C0597m c0597m29 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m29 != null && (orderStatusArrow2 = c0597m29.f8399f.getOrderStatusArrow()) != null) {
                            orderStatusArrow2.setVisibility(8);
                        }
                    }
                    C0597m c0597m30 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                    if (c0597m30 != null && (orderStatusLayout = c0597m30.f8399f.getOrderStatusLayout()) != null) {
                        orderStatusLayout.setOnClickListener(new Fb.k(billPaymentOrderDetailActivity2, i7, billPaymentOrderDetailRsp, z8));
                    }
                    if (!TextUtils.isEmpty(billPaymentOrderDetailRsp.getPendingCouponRemark())) {
                        C0597m c0597m31 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m31 != null) {
                            c0597m31.f8399f.i();
                        }
                        C0597m c0597m32 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m32 != null) {
                            c0597m32.f8399f.j(k0.b(billPaymentOrderDetailRsp.getPendingCouponRemark()).toString());
                        }
                        C0597m c0597m33 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m33 != null) {
                            c0597m33.f8399f.p(new W8.d(11));
                        }
                    }
                    C0597m c0597m34 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                    if (c0597m34 != null) {
                        LinearLayout linearLayout = c0597m34.f8395b;
                        int i13 = v.cv_order_amount;
                        Long businessAmount = billPaymentOrderDetailRsp.getBusinessAmount();
                        linearLayout.addView(new OrderResultAmountStyle1(billPaymentOrderDetailActivity2, i13, r0.B(businessAmount != null ? businessAmount.longValue() : 0L, false)));
                    }
                    Long payFee = billPaymentOrderDetailRsp.getPayFee();
                    long jLongValue2 = payFee != null ? payFee.longValue() : 0L;
                    Long vatFee = billPaymentOrderDetailRsp.getVatFee();
                    long jLongValue3 = jLongValue2 + (vatFee != null ? vatFee.longValue() : 0L);
                    Long lValueOf = Long.valueOf(jLongValue3);
                    if (jLongValue3 <= 0) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(billPaymentOrderDetailActivity2, v.cv_fee, r0.B(lValueOf.longValue(), false));
                        orderResultAmountStyle1.setOnClickListener(new Oc.j(24, billPaymentOrderDetailRsp, billPaymentOrderDetailActivity2));
                        C0597m c0597m35 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m35 != null) {
                            c0597m35.f8395b.addView(orderResultAmountStyle1);
                        }
                    }
                    Long loyaltyPoint = billPaymentOrderDetailRsp.getLoyaltyPoint();
                    if (loyaltyPoint != null) {
                        if (loyaltyPoint.longValue() <= 0) {
                            loyaltyPoint = null;
                        }
                        if (loyaltyPoint != null) {
                            String strO = G.o("- ", r0.x0(loyaltyPoint.longValue()));
                            C0597m c0597m36 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m36 != null) {
                                c0597m36.f8395b.addView(new OrderResultAmountStyle1(billPaymentOrderDetailActivity2, v.cv_palm_points_used, strO));
                            }
                        }
                    }
                    Long discountAmount = billPaymentOrderDetailRsp.getDiscountAmount();
                    if (discountAmount != null) {
                        if (discountAmount.longValue() <= 0) {
                            discountAmount = null;
                        }
                        if (discountAmount != null) {
                            String strO2 = G.o("- ", r0.B(discountAmount.longValue(), true));
                            C0597m c0597m37 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m37 != null) {
                                c0597m37.f8395b.addView(new OrderResultAmountStyle1(billPaymentOrderDetailActivity2, v.cv_discount, strO2));
                            }
                        }
                    }
                    Long flexiDiscount = billPaymentOrderDetailRsp.getFlexiDiscount();
                    if (flexiDiscount != null) {
                        if (flexiDiscount.longValue() <= 0) {
                            flexiDiscount = null;
                        }
                        if (flexiDiscount != null) {
                            String strO3 = G.o("- ", r0.B(flexiDiscount.longValue(), true));
                            C0597m c0597m38 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m38 != null) {
                                c0597m38.f8395b.addView(new OrderResultAmountStyle1(billPaymentOrderDetailActivity2, p025ba.k.core_flexi_discount, strO3));
                            }
                        }
                    }
                    Long couponAmount = billPaymentOrderDetailRsp.getCouponAmount();
                    if (couponAmount != null) {
                        if (couponAmount.longValue() <= 0) {
                            couponAmount = null;
                        }
                        if (couponAmount != null) {
                            String strO4 = G.o("- ", r0.B(couponAmount.longValue(), true));
                            C0597m c0597m39 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m39 != null) {
                                c0597m39.f8395b.addView(new OrderResultAmountStyle1(billPaymentOrderDetailActivity2, v.cv_coupon, strO4));
                            }
                        }
                    }
                    Long bonusAmount = billPaymentOrderDetailRsp.getBonusAmount();
                    if (bonusAmount != null) {
                        if (bonusAmount.longValue() <= 0) {
                            bonusAmount = null;
                        }
                        if (bonusAmount != null) {
                            String strO5 = G.o("- ", r0.B(bonusAmount.longValue(), true));
                            C0597m c0597m40 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m40 != null) {
                                c0597m40.f8395b.addView(new OrderResultAmountStyle1(billPaymentOrderDetailActivity2, v.cv_all_data_bonus_used, strO5));
                            }
                        }
                    }
                    int i14 = (TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW.equals(billPaymentOrderDetailActivity2.f34164e) || TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW_SECURITY_ORDER_CODE.equals(billPaymentOrderDetailActivity2.f34164e)) ? Pd.f.qt_withdraw_amount : v.cv_payment_amount;
                    C0597m c0597m41 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                    if (c0597m41 != null) {
                        LinearLayout linearLayout2 = c0597m41.f8395b;
                        Long payAmount2 = billPaymentOrderDetailRsp.getPayAmount();
                        linearLayout2.addView(new OrderResultAmountStyle2(billPaymentOrderDetailActivity2, i14, r0.B(payAmount2 != null ? payAmount2.longValue() : 0L, false)));
                    }
                    Integer orderStatus3 = billPaymentOrderDetailRsp.getOrderStatus();
                    if ((orderStatus3 != null ? orderStatus3.intValue() : 0) == 1) {
                        Long commissionAmount = billPaymentOrderDetailRsp.getCommissionAmount();
                        if ((commissionAmount != null ? commissionAmount.longValue() : 0L) > 0 && (c0597m2 = (C0597m) billPaymentOrderDetailActivity2.f27334c) != null) {
                            LinearLayout linearLayout3 = c0597m2.f8395b;
                            int i15 = p025ba.k.core_commission_earned;
                            Long commissionAmount2 = billPaymentOrderDetailRsp.getCommissionAmount();
                            linearLayout3.addView(new OrderResultAmountStyle2(billPaymentOrderDetailActivity2, i15, r0.B(commissionAmount2 != null ? commissionAmount2.longValue() : 0L, false)));
                        }
                    }
                    Long returnPoint = billPaymentOrderDetailRsp.getReturnPoint();
                    if (returnPoint != null) {
                        if (returnPoint.longValue() <= 0) {
                            returnPoint = null;
                        }
                        if (returnPoint != null) {
                            Long returnPoint2 = billPaymentOrderDetailRsp.getReturnPoint();
                            String strO6 = G.o("+ ", r0.x0(returnPoint2 != null ? returnPoint2.longValue() : 0L));
                            C0597m c0597m42 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m42 != null) {
                                c0597m42.f8395b.addView(new OrderResultAmountStyle2(billPaymentOrderDetailActivity2, v.cv_all_point_earned, strO6));
                            }
                        }
                    }
                    Long returnBonus = billPaymentOrderDetailRsp.getReturnBonus();
                    if (returnBonus != null) {
                        if (returnBonus.longValue() <= 0) {
                            returnBonus = null;
                        }
                        if (returnBonus != null) {
                            Long returnBonus2 = billPaymentOrderDetailRsp.getReturnBonus();
                            String strT = i0.t(returnBonus2 != null ? returnBonus2.longValue() : 0L);
                            C0597m c0597m43 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                            if (c0597m43 != null) {
                                c0597m43.f8395b.addView(new OrderResultAmountStyle2(billPaymentOrderDetailActivity2, v.cv_all_data_bonus_earned, strT));
                            }
                        }
                    }
                    List<OrderDetailItemBean> list2 = billPaymentOrderDetailRsp.extendFields;
                    if (list2 != null && (c0597m = (C0597m) billPaymentOrderDetailActivity2.f27334c) != null) {
                        c0597m.f8396c.a(list2, new V9.q(billPaymentOrderDetailActivity2, 14));
                    }
                    Integer orderStatus4 = billPaymentOrderDetailRsp.getOrderStatus();
                    if (orderStatus4 != null && orderStatus4.intValue() == 1) {
                        C0597m c0597m44 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m44 != null) {
                            c0597m44.f8400g.setVisibility(0);
                        }
                        C0597m c0597m45 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m45 != null) {
                            c0597m45.f8400g.setOnClickListener(new View.OnClickListener() { // from class: Wd.h
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    String icon;
                                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = billPaymentOrderDetailRsp;
                                    switch (i10) {
                                        case 0:
                                            BillPaymentOrderDetailActivity.a aVar2 = BillPaymentOrderDetailActivity.f34162i;
                                            ToastUtils.showLong(com.transsnet.palmpay.custom_view.v.cv_copy_successful);
                                            ClipboardUtils.copyText(billPaymentOrderDetailRsp2.getRechargePIN());
                                            break;
                                        default:
                                            BillPaymentOrderDetailActivity.a aVar3 = BillPaymentOrderDetailActivity.f34162i;
                                            String str = "";
                                            if (!Intrinsics.c(billPaymentOrderDetailRsp2.getCategoryId(), TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT) ? (icon = billPaymentOrderDetailRsp2.getIcon()) != null : (icon = billPaymentOrderDetailRsp2.getBillerLogo()) != null) {
                                                str = icon;
                                            }
                                            p070ee.c.k(str, billPaymentOrderDetailRsp2);
                                            break;
                                    }
                                }
                            });
                        }
                        C0597m c0597m46 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if ((c0597m46 != null ? c0597m46.f8401i.getParent() : null) != null) {
                            try {
                                C0597m c0597m47 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                                if (c0597m47 != null) {
                                    c0597m47.f8401i.setLayoutResource(Pd.d.qt_stub_order_detail_reward);
                                }
                                C0597m c0597m48 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                                View viewInflate2 = c0597m48 != null ? c0597m48.f8401i.inflate() : null;
                                C0597m c0597m49 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                                if (c0597m49 != null) {
                                    p220oa.h.s(c0597m49.f8401i, true);
                                }
                                ModelPointClaimItem modelPointClaimItem = viewInflate2 != null ? (ModelPointClaimItem) viewInflate2.findViewById(Pd.c.modelPointClaimItem) : null;
                                if (modelPointClaimItem != null) {
                                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = billPaymentOrderDetailActivity2.f34165f;
                                    if (billPaymentOrderDetailRsp2 != null && (unclaimedReturnPoint = billPaymentOrderDetailRsp2.getUnclaimedReturnPoint()) != null) {
                                        jLongValue = unclaimedReturnPoint.longValue();
                                    }
                                    long j6 = jLongValue;
                                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp3 = billPaymentOrderDetailActivity2.f34165f;
                                    if (billPaymentOrderDetailRsp3 != null && (needClaimPoint = billPaymentOrderDetailRsp3.getNeedClaimPoint()) != null) {
                                        zBooleanValue = needClaimPoint.booleanValue();
                                    }
                                    modelPointClaimItem.a(j6, zBooleanValue);
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    } else {
                        C0597m c0597m50 = (C0597m) billPaymentOrderDetailActivity2.f27334c;
                        if (c0597m50 != null) {
                            c0597m50.f8400g.setVisibility(8);
                        }
                    }
                }
            } else {
                String respMsg = commonBeanResult.getRespMsg();
                String str = respMsg != null ? respMsg : "";
                BillPaymentOrderDetailActivity.a aVar2 = BillPaymentOrderDetailActivity.f34162i;
                O6.c cVar = new O6.c(billPaymentOrderDetailActivity2);
                cVar.e(p025ba.k.core_title_error_info);
                cVar.f6598d = str;
                cVar.d(p025ba.k.core_try_again, new I0(billPaymentOrderDetailActivity2, 17));
                cVar.g();
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            billPaymentOrderDetailActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            billPaymentOrderDetailActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object b(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        BillerTransactionResultActivity billerTransactionResultActivity = (BillerTransactionResultActivity) this.f9060b;
        if (z3) {
            billerTransactionResultActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            BillerTransactionResultActivity billerTransactionResultActivity2 = (BillerTransactionResultActivity) this.f9061c;
            if (z8) {
                billerTransactionResultActivity.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                int i7 = BillerTransactionResultActivity.f34181Y;
                if (i0.W(billerTransactionResultActivity2)) {
                    if (commonBeanResult.isSuccess() && Intrinsics.c(commonBeanResult.data, Boolean.TRUE)) {
                        billerTransactionResultActivity2.r();
                        ToastUtils.showLong(billerTransactionResultActivity2.getString(Pd.f.qt_low_balance_setup_complete), new Object[0]);
                        n0.g().w("PaySuccess_Lowbalance_SetSuccessToast_show", F.b(new Pair("transType", TransType.TRANS_TYPE_BUNDLE)));
                    } else if (Intrinsics.c(commonBeanResult.getRespCode(), "11100115")) {
                        String respMsg = commonBeanResult.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                        if (i0.W(billerTransactionResultActivity2)) {
                            O6.c cVar = new O6.c(billerTransactionResultActivity2);
                            cVar.f6598d = respMsg;
                            cVar.f6606l = 17;
                            cVar.d(Pd.f.qt_low_balance_enable_push, new ViewOnClickListenerC0743q(billerTransactionResultActivity2, 2));
                            cVar.g();
                        }
                        n0.g().w("PaySuccess_Lowbalance_SetSuccessPopup_show", F.b(new Pair("transType", TransType.TRANS_TYPE_BUNDLE)));
                    } else {
                        billerTransactionResultActivity2.s();
                        n0.g().w("PaySuccess_Lowbalance_SetFailedToast_show", F.b(new Pair("transType", TransType.TRANS_TYPE_BUNDLE)));
                    }
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                billerTransactionResultActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                billerTransactionResultActivity.showLoadingDialog(false, true);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
                if (i0.W(billerTransactionResultActivity2)) {
                    int i10 = BillerTransactionResultActivity.f34181Y;
                    billerTransactionResultActivity2.s();
                    n0.g().w("PaySuccess_Lowbalance_SetFailedToast_show", F.b(new Pair("transType", TransType.TRANS_TYPE_BUNDLE)));
                }
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        CashBoxMainActivity cashBoxMainActivity = (CashBoxMainActivity) this.f9060b;
        if (z3) {
            cashBoxMainActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            CashBoxMainActivity cashBoxMainActivity2 = (CashBoxMainActivity) this.f9061c;
            if (z8) {
                cashBoxMainActivity.showLoadingDialog(false, true);
                GetCashBoxNewcomerResp getCashBoxNewcomerResp = (GetCashBoxNewcomerResp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a).data;
                if (getCashBoxNewcomerResp == null || !getCashBoxNewcomerResp.cashBoxMemberStatus) {
                    BarUtils.setStatusBarLightMode(cashBoxMainActivity2, !i0.T());
                    Z supportFragmentManager = cashBoxMainActivity2.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1161a c1161a = new C1161a(supportFragmentManager);
                    c1161a.e(Jc.c.layoutContainer, CashBoxMainFragment.f32383V0.newInstance(), null);
                    c1161a.h(true);
                    if (!TextUtils.isEmpty(cashBoxMainActivity2.getIntent().getStringExtra("orderNo"))) {
                        n0.g().l("CashBoxActivity_SuccessPopup_View");
                        CashBoxUseCouponResultDialogFragment cashBoxUseCouponResultDialogFragmentNewInstance$default = CashBoxUseCouponResultDialogFragment.a.newInstance$default(CashBoxUseCouponResultDialogFragment.f32289C, false, cashBoxMainActivity2.getIntent().getLongExtra("orderAmount", 0L), null, 5, null);
                        Z supportFragmentManager2 = cashBoxMainActivity2.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                        cashBoxUseCouponResultDialogFragmentNewInstance$default.show(supportFragmentManager2, "showCashBoxUseCouponResultDialog");
                    }
                } else {
                    cashBoxMainActivity2.initStatusBar(true);
                    BarUtils.setStatusBarLightMode(cashBoxMainActivity2, !i0.T());
                    cashBoxMainActivity2.requestLayoutFullScreen();
                    int i7 = CashBoxMainActivity.f32040e;
                    cashBoxMainActivity2.m();
                    Z supportFragmentManager3 = cashBoxMainActivity2.getSupportFragmentManager();
                    supportFragmentManager3.getClass();
                    C1161a c1161a2 = new C1161a(supportFragmentManager3);
                    c1161a2.e(Jc.c.layoutContainer, CashBoxIntroductionFragment.f32374H.newInstance(), "introduction");
                    c1161a2.h(true);
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                cashBoxMainActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                cashBoxMainActivity.showLoadingDialog(false, true);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
                Z supportFragmentManager4 = cashBoxMainActivity2.getSupportFragmentManager();
                supportFragmentManager4.getClass();
                C1161a c1161a3 = new C1161a(supportFragmentManager4);
                c1161a3.e(Jc.c.layoutContainer, CashBoxIntroductionFragment.f32374H.newInstance(), null);
                c1161a3.h(true);
            }
        }
        return Unit.f38893a;
    }

    private final Object d(Object obj) {
        LinearLayout linearLayout;
        Long principal;
        Long paymentAmount;
        Activity activityIsActivityExistsInStack;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        CashBoxOrderResultActivity cashBoxOrderResultActivity = (CashBoxOrderResultActivity) this.f9060b;
        if (z3) {
            cashBoxOrderResultActivity.showLoadingDialog(true, true);
        } else {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                cashBoxOrderResultActivity.showLoadingDialog(false, true);
                GetCashBoxOrderDetailResp getCashBoxOrderDetailResp = (GetCashBoxOrderDetailResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                int i7 = CashBoxOrderResultActivity.f32054B;
                CashBoxOrderResultActivity cashBoxOrderResultActivity2 = (CashBoxOrderResultActivity) this.f9061c;
                if (cashBoxOrderResultActivity2.n() == 1 && (activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.managemoney.ui.activity.CashBoxDepositWithdrawActivity")) != null) {
                    activityIsActivityExistsInStack.finish();
                }
                GetCashBoxOrderDetailResp.CashBoxOrderDetail data = getCashBoxOrderDetailResp.getData();
                if (data != null && data.getPayStatus() == 1) {
                    n0.g().u((ViewEvent) G.g(cashBoxOrderResultActivity2.n() == 1 ? "CashBox_Save_Result_View_Success" : "CashBox_Withdraw_Result_View_Success", true));
                }
                PayStatus.Companion companion = PayStatus.INSTANCE;
                GetCashBoxOrderDetailResp.CashBoxOrderDetail data2 = getCashBoxOrderDetailResp.getData();
                PayStatus payStatusNewInstance = companion.newInstance(data2 != null ? data2.getPayStatus() : 0);
                CashBoxOrderResultActivity.m(cashBoxOrderResultActivity2).d(payStatusNewInstance.getStatusText());
                CashBoxOrderResultActivity.m(cashBoxOrderResultActivity2).h("");
                CashBoxOrderResultActivity.m(cashBoxOrderResultActivity2).f(payStatusNewInstance.getStatsDrawableRes());
                TransactionResultHeaderModel transactionResultHeaderModelM = CashBoxOrderResultActivity.m(cashBoxOrderResultActivity2);
                GetCashBoxOrderDetailResp.CashBoxOrderDetail data3 = getCashBoxOrderDetailResp.getData();
                transactionResultHeaderModelM.c(r0.B((data3 == null || (paymentAmount = data3.getPaymentAmount()) == null) ? 0L : paymentAmount.longValue(), true));
                t tVar = cashBoxOrderResultActivity2.f32063o;
                LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
                if (linearLayout2 != null) {
                    linearLayout2.removeAllViews();
                }
                LinearLayout linearLayout3 = (LinearLayout) tVar.getValue();
                if (linearLayout3 != null) {
                    com.transsnet.palmpay.managemoney.ui.view.d dVar = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderResultActivity2.getResources().getString(Jc.f.mm_amount), 14.0f, Jc.a.mm_color_858a8f, null, null, false, null, 504);
                    GetCashBoxOrderDetailResp.CashBoxOrderDetail data4 = getCashBoxOrderDetailResp.getData();
                    com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B((data4 == null || (principal = data4.getPrincipal()) == null) ? 0L : principal.longValue(), true), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                    DensityUtil.dp2px(40.0f);
                    linearLayout3.addView(new PlanInfoItem(cashBoxOrderResultActivity2, dVar, dVar2));
                }
                LinearLayout linearLayout4 = (LinearLayout) tVar.getValue();
                if (linearLayout4 != null) {
                    com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderResultActivity2.getResources().getString(p025ba.k.core_payment_type), 14.0f, Jc.a.mm_color_858a8f, null, null, false, null, 504);
                    GetCashBoxOrderDetailResp.CashBoxOrderDetail data5 = getCashBoxOrderDetailResp.getData();
                    com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(TextUtils.equals(data5 != null ? data5.getTransactionType() : null, TransType.TRANS_TYPE_CASH_BOX_DEPOSIT) ? cashBoxOrderResultActivity2.getString(Jc.f.mm_cashbox_deposit) : cashBoxOrderResultActivity2.getString(Jc.f.mm_cashbox_withdraw), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                    DensityUtil.dp2px(40.0f);
                    linearLayout4.addView(new PlanInfoItem(cashBoxOrderResultActivity2, dVar3, dVar4));
                }
                GetCashBoxOrderDetailResp.CashBoxOrderDetail data6 = getCashBoxOrderDetailResp.getData();
                if ((data6 != null ? data6.getCompletionTime() : 0L) > 0 && (linearLayout = (LinearLayout) tVar.getValue()) != null) {
                    com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderResultActivity2.getResources().getString(Jc.f.mm_completion_time), 14.0f, Jc.a.mm_color_858a8f, null, null, false, null, 504);
                    GetCashBoxOrderDetailResp.CashBoxOrderDetail data7 = getCashBoxOrderDetailResp.getData();
                    com.transsnet.palmpay.managemoney.ui.view.d dVar6 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.R(data7 != null ? data7.getCompletionTime() : 0L), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                    DensityUtil.dp2px(40.0f);
                    linearLayout.addView(new PlanInfoItem(cashBoxOrderResultActivity2, dVar5, dVar6));
                }
                LinearLayout linearLayout5 = (LinearLayout) tVar.getValue();
                if (linearLayout5 != null) {
                    TextView textView = new TextView(cashBoxOrderResultActivity2);
                    textView.setText(G.i("View Details").appendImage(com.transsnet.palmpay.custom_view.r.cv_purple_arrow_right_bold).create());
                    textView.setGravity(17);
                    textView.setTextColor(cashBoxOrderResultActivity2.getColor(L6.b.ppColorPrimary));
                    textView.setTextSize(12.0f);
                    textView.setLayoutParams(new LinearLayout.LayoutParams(-1, ScreenUtils.dip2px(42.0f)));
                    textView.setOnClickListener(new ViewOnClickListenerC1567m(cashBoxOrderResultActivity2, getCashBoxOrderDetailResp));
                    linearLayout5.addView(textView);
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                cashBoxOrderResultActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                cashBoxOrderResultActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
            G.u(407, org.greenrobot.eventbus.c.b());
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj) {
        Long completionTime;
        Long completionTime2;
        Long amount;
        Long earlyWithdrawalFee;
        Long earlyWithdrawalFee2;
        Long principal;
        Long amount2;
        Integer payStatus;
        Integer payStatus2;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = (FixedSavingOrderForBreakResultActivity) this.f9060b;
        if (z3) {
            fixedSavingOrderForBreakResultActivity.showLoadingDialog(true, true);
        } else {
            int iIntValue = 0;
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                fixedSavingOrderForBreakResultActivity.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                WithdrawOrderDetailResp withdrawOrderDetailResp = (WithdrawOrderDetailResp) commonBeanResult.data;
                if (withdrawOrderDetailResp != null && (payStatus2 = withdrawOrderDetailResp.getPayStatus()) != null) {
                    payStatus2.intValue();
                }
                PayStatus.Companion companion = PayStatus.INSTANCE;
                WithdrawOrderDetailResp withdrawOrderDetailResp2 = (WithdrawOrderDetailResp) commonBeanResult.data;
                if (withdrawOrderDetailResp2 != null && (payStatus = withdrawOrderDetailResp2.getPayStatus()) != null) {
                    iIntValue = payStatus.intValue();
                }
                PayStatus payStatusNewInstance = companion.newInstance(iIntValue);
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity2 = (FixedSavingOrderForBreakResultActivity) this.f9061c;
                FixedSavingOrderForBreakResultActivity.n(fixedSavingOrderForBreakResultActivity2).d(payStatusNewInstance.getStatusText());
                FixedSavingOrderForBreakResultActivity.n(fixedSavingOrderForBreakResultActivity2).h("");
                FixedSavingOrderForBreakResultActivity.n(fixedSavingOrderForBreakResultActivity2).f(payStatusNewInstance.getStatsDrawableRes());
                TransactionResultHeaderModel transactionResultHeaderModelN = FixedSavingOrderForBreakResultActivity.n(fixedSavingOrderForBreakResultActivity2);
                WithdrawOrderDetailResp withdrawOrderDetailResp3 = (WithdrawOrderDetailResp) commonBeanResult.data;
                long jLongValue = 0;
                transactionResultHeaderModelN.c(r0.B((withdrawOrderDetailResp3 == null || (amount2 = withdrawOrderDetailResp3.getAmount()) == null) ? 0L : amount2.longValue(), true));
                FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2).removeAllViews();
                LinearLayout linearLayoutM = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                com.transsnet.palmpay.managemoney.ui.view.d dVar = new com.transsnet.palmpay.managemoney.ui.view.d(fixedSavingOrderForBreakResultActivity2.getResources().getString(Jc.f.mm_principal_amount), 14.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                WithdrawOrderDetailResp withdrawOrderDetailResp4 = (WithdrawOrderDetailResp) commonBeanResult.data;
                com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B((withdrawOrderDetailResp4 == null || (principal = withdrawOrderDetailResp4.getPrincipal()) == null) ? 0L : principal.longValue(), true), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                DensityUtil.dp2px(40.0f);
                linearLayoutM.addView(new PlanInfoItem(fixedSavingOrderForBreakResultActivity2, dVar, dVar2));
                WithdrawOrderDetailResp withdrawOrderDetailResp5 = (WithdrawOrderDetailResp) commonBeanResult.data;
                if (((withdrawOrderDetailResp5 == null || (earlyWithdrawalFee2 = withdrawOrderDetailResp5.getEarlyWithdrawalFee()) == null) ? 0L : earlyWithdrawalFee2.longValue()) > 0) {
                    LinearLayout linearLayoutM2 = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(fixedSavingOrderForBreakResultActivity2.getResources().getString(Jc.f.mm_earyly_withdrawal_fee), 14.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                    WithdrawOrderDetailResp withdrawOrderDetailResp6 = (WithdrawOrderDetailResp) commonBeanResult.data;
                    com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B((withdrawOrderDetailResp6 == null || (earlyWithdrawalFee = withdrawOrderDetailResp6.getEarlyWithdrawalFee()) == null) ? 0L : earlyWithdrawalFee.longValue(), true), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                    DensityUtil.dp2px(40.0f);
                    linearLayoutM2.addView(new PlanInfoItem(fixedSavingOrderForBreakResultActivity2, dVar3, dVar4));
                }
                WithdrawOrderDetailResp withdrawOrderDetailResp7 = (WithdrawOrderDetailResp) commonBeanResult.data;
                if ((withdrawOrderDetailResp7 != null ? withdrawOrderDetailResp7.getAdvanceRepayAmount() : 0L) > 0) {
                    LinearLayout linearLayoutM3 = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(fixedSavingOrderForBreakResultActivity2.getResources().getString(Jc.f.mm_advance_repayment), 14.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                    WithdrawOrderDetailResp withdrawOrderDetailResp8 = (WithdrawOrderDetailResp) commonBeanResult.data;
                    com.transsnet.palmpay.managemoney.ui.view.d dVar6 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(withdrawOrderDetailResp8 != null ? withdrawOrderDetailResp8.getAdvanceRepayAmount() : 0L, true), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                    DensityUtil.dp2px(40.0f);
                    linearLayoutM3.addView(new PlanInfoItem(fixedSavingOrderForBreakResultActivity2, dVar5, dVar6));
                }
                LinearLayout linearLayoutM4 = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                com.transsnet.palmpay.managemoney.ui.view.d dVar7 = new com.transsnet.palmpay.managemoney.ui.view.d(fixedSavingOrderForBreakResultActivity2.getResources().getString(Jc.f.mm_payout_amount), 14.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                WithdrawOrderDetailResp withdrawOrderDetailResp9 = (WithdrawOrderDetailResp) commonBeanResult.data;
                com.transsnet.palmpay.managemoney.ui.view.d dVar8 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B((withdrawOrderDetailResp9 == null || (amount = withdrawOrderDetailResp9.getAmount()) == null) ? 0L : amount.longValue(), true), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                DensityUtil.dp2px(40.0f);
                linearLayoutM4.addView(new PlanInfoItem(fixedSavingOrderForBreakResultActivity2, dVar7, dVar8));
                LinearLayout linearLayoutM5 = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                com.transsnet.palmpay.managemoney.ui.view.d dVar9 = new com.transsnet.palmpay.managemoney.ui.view.d(fixedSavingOrderForBreakResultActivity2.getResources().getString(p025ba.k.core_payment_type), 14.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                com.transsnet.palmpay.managemoney.ui.view.d dVar10 = new com.transsnet.palmpay.managemoney.ui.view.d(fixedSavingOrderForBreakResultActivity2.getString(Jc.f.mm_fixed_savings_payout), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                DensityUtil.dp2px(40.0f);
                linearLayoutM5.addView(new PlanInfoItem(fixedSavingOrderForBreakResultActivity2, dVar9, dVar10));
                WithdrawOrderDetailResp withdrawOrderDetailResp10 = (WithdrawOrderDetailResp) commonBeanResult.data;
                if (((withdrawOrderDetailResp10 == null || (completionTime2 = withdrawOrderDetailResp10.getCompletionTime()) == null) ? 0L : completionTime2.longValue()) > 0) {
                    LinearLayout linearLayoutM6 = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar11 = new com.transsnet.palmpay.managemoney.ui.view.d(fixedSavingOrderForBreakResultActivity2.getResources().getString(Jc.f.mm_completion_time), 14.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                    WithdrawOrderDetailResp withdrawOrderDetailResp11 = (WithdrawOrderDetailResp) commonBeanResult.data;
                    if (withdrawOrderDetailResp11 != null && (completionTime = withdrawOrderDetailResp11.getCompletionTime()) != null) {
                        jLongValue = completionTime.longValue();
                    }
                    com.transsnet.palmpay.managemoney.ui.view.d dVar12 = new com.transsnet.palmpay.managemoney.ui.view.d(TimeUtils.millis2String(jLongValue, new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH)), 14.0f, Jc.a.mm_color_202046, null, null, false, null, 504);
                    DensityUtil.dp2px(40.0f);
                    linearLayoutM6.addView(new PlanInfoItem(fixedSavingOrderForBreakResultActivity2, dVar11, dVar12));
                }
                LinearLayout linearLayoutM7 = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                com.transsnet.palmpay.managemoney.ui.view.d dVar13 = new com.transsnet.palmpay.managemoney.ui.view.d("", 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                com.transsnet.palmpay.managemoney.ui.view.d dVar14 = new com.transsnet.palmpay.managemoney.ui.view.d("", 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                DensityUtil.dp2px(8.0f);
                linearLayoutM7.addView(new PlanInfoItem(fixedSavingOrderForBreakResultActivity2, dVar13, dVar14));
                LinearLayout linearLayoutM8 = FixedSavingOrderForBreakResultActivity.m(fixedSavingOrderForBreakResultActivity2);
                TextView textView = new TextView(fixedSavingOrderForBreakResultActivity2);
                textView.setText(G.i("View Details").appendImage(com.transsnet.palmpay.custom_view.r.cv_purple_arrow_right_bold).create());
                textView.setGravity(17);
                textView.setTextColor(fixedSavingOrderForBreakResultActivity2.getColor(L6.b.ppColorPrimary));
                textView.setTextSize(12.0f);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, ScreenUtils.dip2px(48.0f)));
                textView.setOnClickListener(new ViewOnClickListenerC0146m(commonBeanResult, 23));
                linearLayoutM8.addView(textView);
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                fixedSavingOrderForBreakResultActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                fixedSavingOrderForBreakResultActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
            G.u(MessageEvent.EVENT_CREATE_SAVINGS_BREAK, org.greenrobot.eventbus.c.b());
        }
        return Unit.f38893a;
    }

    private final Object f(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        PaybackDetailActivity paybackDetailActivity = (PaybackDetailActivity) this.f9060b;
        if (z3) {
            paybackDetailActivity.showLoadingDialog(true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            paybackDetailActivity.showLoadingDialog(false);
            com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it;
            Object obj2 = pVar.f27360a;
            boolean z8 = obj2 instanceof CommonResult;
            PaybackDetailActivity paybackDetailActivity2 = (PaybackDetailActivity) this.f9061c;
            t tVar = paybackDetailActivity2.f32142c;
            t tVar2 = paybackDetailActivity2.f32147i;
            t tVar3 = paybackDetailActivity2.f32148j;
            t tVar4 = paybackDetailActivity2.f32146g;
            if (z8) {
                boolean zIsSuccess = ((CommonResult) obj2).isSuccess();
                Object obj3 = pVar.f27360a;
                if (zIsSuccess) {
                    GetOrderDetailResp.OrderDetailInfo data = ((GetOrderDetailResp) obj3).getData();
                    if (data != null) {
                        Object value = tVar4.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ((TextView) value).setText("Matured Successful");
                        Object value2 = tVar3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((TextView) value2).setText(data.getProductName());
                        Object value3 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        ((TextView) value3).setText(r0.B(data.getTotalPayback(), true));
                        LinearLayout linearLayoutM = PaybackDetailActivity.m(paybackDetailActivity2);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(v.cv_transaction_type), 0.0f, 0, null, null, false, null, 510);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_payment_mature), 0.0f, 0, null, null, false, null, 510);
                        DensityUtil.dp2px(40.0f);
                        linearLayoutM.addView(new PlanInfoItem(paybackDetailActivity2, dVar, dVar2));
                        LinearLayout linearLayoutM2 = PaybackDetailActivity.m(paybackDetailActivity2);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_receive_account), 0.0f, 0, null, null, false, null, 510);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_plan_palmpay_balance), 0.0f, Jc.a.mm_color_6306b2, null, null, false, null, 506);
                        DensityUtil.dp2px(40.0f);
                        linearLayoutM2.addView(new PlanInfoItem(paybackDetailActivity2, dVar3, dVar4));
                        LinearLayout linearLayoutM3 = PaybackDetailActivity.m(paybackDetailActivity2);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(p025ba.k.core_reference_no_2), 0.0f, 0, null, null, false, null, 510);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar6 = new com.transsnet.palmpay.managemoney.ui.view.d(data.getTransactionId(), 0.0f, 0, paybackDetailActivity2.getDrawable(Jc.b.mm_icon_copy), new C(data), false, null, 470);
                        DensityUtil.dp2px(40.0f);
                        linearLayoutM3.addView(new PlanInfoItem(paybackDetailActivity2, dVar5, dVar6));
                        if (data.getTransactionTime() > 0) {
                            LinearLayout linearLayoutM4 = PaybackDetailActivity.m(paybackDetailActivity2);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar7 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_completion_time), 0.0f, 0, null, null, false, null, 510);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar8 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.Q(data.getTransactionTime()), 0.0f, 0, null, null, false, null, 510);
                            DensityUtil.dp2px(40.0f);
                            linearLayoutM4.addView(new PlanInfoItem(paybackDetailActivity2, dVar7, dVar8));
                        }
                        Object value4 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((View) value4).setVisibility(8);
                    }
                } else {
                    GetOrderDetailResp.OrderDetailInfo data2 = ((GetOrderDetailResp) obj3).getData();
                    if (data2 != null) {
                        Object value5 = tVar4.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        ((TextView) value5).setText("Matured Successful");
                        Object value6 = tVar3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        ((TextView) value6).setText(data2.getProductName());
                        Object value7 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        ((TextView) value7).setText(r0.B(data2.getTotalPayback(), true));
                        LinearLayout linearLayoutM5 = PaybackDetailActivity.m(paybackDetailActivity2);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar9 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(v.cv_transaction_type), 0.0f, 0, null, null, false, null, 510);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar10 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_payment_mature), 0.0f, 0, null, null, false, null, 510);
                        DensityUtil.dp2px(40.0f);
                        linearLayoutM5.addView(new PlanInfoItem(paybackDetailActivity2, dVar9, dVar10));
                        LinearLayout linearLayoutM6 = PaybackDetailActivity.m(paybackDetailActivity2);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar11 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_receive_account), 0.0f, 0, null, null, false, null, 510);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar12 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_plan_palmpay_balance), 0.0f, Jc.a.mm_color_6306b2, null, null, false, null, 506);
                        DensityUtil.dp2px(40.0f);
                        linearLayoutM6.addView(new PlanInfoItem(paybackDetailActivity2, dVar11, dVar12));
                        LinearLayout linearLayoutM7 = PaybackDetailActivity.m(paybackDetailActivity2);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar13 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(p025ba.k.core_reference_no_2), 0.0f, 0, null, null, false, null, 510);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar14 = new com.transsnet.palmpay.managemoney.ui.view.d(data2.getTransactionId(), 0.0f, 0, paybackDetailActivity2.getDrawable(Jc.b.mm_icon_copy), new C(data2), false, null, 470);
                        DensityUtil.dp2px(40.0f);
                        linearLayoutM7.addView(new PlanInfoItem(paybackDetailActivity2, dVar13, dVar14));
                        if (data2.getTransactionTime() > 0) {
                            LinearLayout linearLayoutM8 = PaybackDetailActivity.m(paybackDetailActivity2);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar15 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_completion_time), 0.0f, 0, null, null, false, null, 510);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar16 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.Q(data2.getTransactionTime()), 0.0f, 0, null, null, false, null, 510);
                            DensityUtil.dp2px(40.0f);
                            linearLayoutM8.addView(new PlanInfoItem(paybackDetailActivity2, dVar15, dVar16));
                        }
                        Object value8 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ((View) value8).setVisibility(8);
                    }
                }
            } else {
                GetOrderDetailResp.OrderDetailInfo data3 = ((GetOrderDetailResp) obj2).getData();
                if (data3 != null) {
                    Object value9 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                    ((TextView) value9).setText("Matured Successful");
                    Object value10 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    ((TextView) value10).setText(data3.getProductName());
                    Object value11 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                    ((TextView) value11).setText(r0.B(data3.getTotalPayback(), true));
                    LinearLayout linearLayoutM9 = PaybackDetailActivity.m(paybackDetailActivity2);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar17 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(v.cv_transaction_type), 0.0f, 0, null, null, false, null, 510);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar18 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_payment_mature), 0.0f, 0, null, null, false, null, 510);
                    DensityUtil.dp2px(40.0f);
                    linearLayoutM9.addView(new PlanInfoItem(paybackDetailActivity2, dVar17, dVar18));
                    LinearLayout linearLayoutM10 = PaybackDetailActivity.m(paybackDetailActivity2);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar19 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_receive_account), 0.0f, 0, null, null, false, null, 510);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar20 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_plan_palmpay_balance), 0.0f, Jc.a.mm_color_6306b2, null, null, false, null, 506);
                    DensityUtil.dp2px(40.0f);
                    linearLayoutM10.addView(new PlanInfoItem(paybackDetailActivity2, dVar19, dVar20));
                    LinearLayout linearLayoutM11 = PaybackDetailActivity.m(paybackDetailActivity2);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar21 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(p025ba.k.core_reference_no_2), 0.0f, 0, null, null, false, null, 510);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar22 = new com.transsnet.palmpay.managemoney.ui.view.d(data3.getTransactionId(), 0.0f, 0, paybackDetailActivity2.getDrawable(Jc.b.mm_icon_copy), new C(data3), false, null, 470);
                    DensityUtil.dp2px(40.0f);
                    linearLayoutM11.addView(new PlanInfoItem(paybackDetailActivity2, dVar21, dVar22));
                    if (data3.getTransactionTime() > 0) {
                        LinearLayout linearLayoutM12 = PaybackDetailActivity.m(paybackDetailActivity2);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar23 = new com.transsnet.palmpay.managemoney.ui.view.d(paybackDetailActivity2.getResources().getString(Jc.f.mm_completion_time), 0.0f, 0, null, null, false, null, 510);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar24 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.Q(data3.getTransactionTime()), 0.0f, 0, null, null, false, null, 510);
                        DensityUtil.dp2px(40.0f);
                        linearLayoutM12.addView(new PlanInfoItem(paybackDetailActivity2, dVar23, dVar24));
                    }
                    Object value12 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                    ((View) value12).setVisibility(8);
                }
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            paybackDetailActivity.showLoadingDialog(false);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            paybackDetailActivity.showLoadingDialog(false);
            ((com.transsnet.palmpay.core.base.n) it).getClass();
        }
        return Unit.f38893a;
    }

    private final Object g(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        UserFixedSavingActivity userFixedSavingActivity = (UserFixedSavingActivity) this.f9060b;
        if (z3) {
            userFixedSavingActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            UserFixedSavingActivity userFixedSavingActivity2 = (UserFixedSavingActivity) this.f9061c;
            if (z8) {
                userFixedSavingActivity.showLoadingDialog(false, true);
                GetIdentityResp.IdentityBean data = ((GetIdentityResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                UserFixedSavingActivity.m(userFixedSavingActivity2, data != null ? data.getIdentityType() : 1);
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                userFixedSavingActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                userFixedSavingActivity.showLoadingDialog(false, true);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
                UserFixedSavingActivity.m(userFixedSavingActivity2, 1);
            }
        }
        return Unit.f38893a;
    }

    private final Object h(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        CashBoxAutoSaveFragment cashBoxAutoSaveFragment = (CashBoxAutoSaveFragment) this.f9060b;
        if (z3) {
            cashBoxAutoSaveFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            cashBoxAutoSaveFragment.showLoadingDialog(false, true);
            CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonResult.isSuccess();
            CashBoxAutoSaveFragment cashBoxAutoSaveFragment2 = (CashBoxAutoSaveFragment) this.f9061c;
            if (zIsSuccess) {
                G.u(MessageEvent.EVENT_OPEN_CASHBOX_AUTO_TRANSFER, org.greenrobot.eventbus.c.b());
                GetAutoTransferConfigResp getAutoTransferConfigResp = cashBoxAutoSaveFragment2.f32350Q;
                if (getAutoTransferConfigResp == null || getAutoTransferConfigResp.isAutoTransfer != 1) {
                    if (getAutoTransferConfigResp != null) {
                        getAutoTransferConfigResp.isAutoTransfer = 1;
                    }
                    cashBoxAutoSaveFragment2.t();
                    TurnOnAutoSaveSuccessDialogFragment turnOnAutoSaveSuccessDialogFragmentNewInstance = TurnOnAutoSaveSuccessDialogFragment.f32326C.newInstance();
                    m0 dialogClosedClick = new m0(turnOnAutoSaveSuccessDialogFragmentNewInstance, 4);
                    turnOnAutoSaveSuccessDialogFragmentNewInstance.getClass();
                    Intrinsics.checkNotNullParameter(dialogClosedClick, "dialogClosedClick");
                    Z childFragmentManager = cashBoxAutoSaveFragment2.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    turnOnAutoSaveSuccessDialogFragmentNewInstance.show(childFragmentManager, "showTurnOnAutoSaveSuccessDialog");
                } else {
                    getAutoTransferConfigResp.isAutoTransfer = 0;
                    cashBoxAutoSaveFragment2.t();
                }
            } else if (Intrinsics.c(commonResult.getRespCode(), "fb_open_error_code")) {
                String respMsg = commonResult.getRespMsg();
                if (respMsg != null) {
                    CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxAutoSaveFragment2.getResources().getString(Jc.f.mm_fb_open_code_title), respMsg, cashBoxAutoSaveFragment2.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                    Z childFragmentManager2 = cashBoxAutoSaveFragment2.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                    commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showErrorDialog");
                }
            } else {
                String respMsg2 = commonResult.getRespMsg();
                if (respMsg2 != null) {
                    CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxAutoSaveFragment2.getResources().getString(p025ba.k.core_oops), respMsg2, cashBoxAutoSaveFragment2.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                    Z childFragmentManager3 = cashBoxAutoSaveFragment2.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                    commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showErrorDialog");
                }
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            cashBoxAutoSaveFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            cashBoxAutoSaveFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object i(Object obj) {
        Long totalMoneyOut;
        Long totalMoneyIn;
        Long totalMoneyOut2;
        String strB;
        Long totalMoneyIn2;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                Object obj2 = ((com.transsnet.palmpay.core.base.l) this.f9060b).f27356m;
                QueryCashBoxStatResp queryCashBoxStatResp = (QueryCashBoxStatResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                Long l5 = (Long) obj2;
                if (queryCashBoxStatResp.isSuccess()) {
                    CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = (CashBoxTransactionHistoryFragment) this.f9061c;
                    TextView textView = cashBoxTransactionHistoryFragment.f32433L;
                    String strB2 = "₦ --";
                    long jLongValue = 0;
                    if (textView != null) {
                        SpanUtils foregroundColor = G.i("In  ").setForegroundColor(cashBoxTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f));
                        QueryCashBoxStatResp.CashBoxStat data = queryCashBoxStatResp.getData();
                        if ((data != null ? data.getTotalMoneyIn() : null) != null) {
                            QueryCashBoxStatResp.CashBoxStat data2 = queryCashBoxStatResp.getData();
                            strB = r0.B((data2 == null || (totalMoneyIn2 = data2.getTotalMoneyIn()) == null) ? 0L : totalMoneyIn2.longValue(), false);
                        } else {
                            strB = "₦ --";
                        }
                        textView.setText(foregroundColor.append(strB).create());
                    }
                    TextView textView2 = cashBoxTransactionHistoryFragment.f32434M;
                    if (textView2 != null) {
                        SpanUtils foregroundColor2 = G.i("Out  ").setForegroundColor(cashBoxTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f));
                        QueryCashBoxStatResp.CashBoxStat data3 = queryCashBoxStatResp.getData();
                        if ((data3 != null ? data3.getTotalMoneyOut() : null) != null) {
                            QueryCashBoxStatResp.CashBoxStat data4 = queryCashBoxStatResp.getData();
                            if (data4 != null && (totalMoneyOut2 = data4.getTotalMoneyOut()) != null) {
                                jLongValue = totalMoneyOut2.longValue();
                            }
                            strB2 = r0.B(Math.abs(jLongValue), false);
                        }
                        textView2.setText(foregroundColor2.append(strB2).create());
                    }
                    TextView textView3 = cashBoxTransactionHistoryFragment.f32433L;
                    String strValueOf = String.valueOf(textView3 != null ? textView3.getText() : null);
                    TextView textView4 = cashBoxTransactionHistoryFragment.f32433L;
                    Integer numValueOf = textView4 != null ? Integer.valueOf(textView4.getVisibility()) : null;
                    LinearLayout linearLayout = cashBoxTransactionHistoryFragment.f32430B;
                    F6.d.h("CashBoxTransaction", 3, strValueOf + ":" + numValueOf + ":" + (linearLayout != null ? Integer.valueOf(linearLayout.getVisibility()) : null));
                    long jLongValue2 = -1;
                    long jLongValue3 = l5 != null ? l5.longValue() : -1L;
                    QueryCashBoxStatResp.CashBoxStat data5 = queryCashBoxStatResp.getData();
                    long jLongValue4 = (data5 == null || (totalMoneyIn = data5.getTotalMoneyIn()) == null) ? -1L : totalMoneyIn.longValue();
                    QueryCashBoxStatResp.CashBoxStat data6 = queryCashBoxStatResp.getData();
                    if (data6 != null && (totalMoneyOut = data6.getTotalMoneyOut()) != null) {
                        jLongValue2 = totalMoneyOut.longValue();
                    }
                    cashBoxTransactionHistoryFragment.f32440v.b(jLongValue3, jLongValue4, jLongValue2);
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    private final Object j(Object obj) {
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransactionA;
        Long totalMoneyOut;
        Long totalMoneyIn;
        Long totalMoneyOut2;
        Long totalMoneyIn2;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                Object obj2 = ((com.transsnet.palmpay.core.base.l) this.f9060b).f27356m;
                QueryCashBoxStatResp queryCashBoxStatResp = (QueryCashBoxStatResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                Long l5 = (Long) obj2;
                if (queryCashBoxStatResp.isSuccess()) {
                    FundTransactionHistoryFragment fundTransactionHistoryFragment = (FundTransactionHistoryFragment) this.f9061c;
                    TextView textView = fundTransactionHistoryFragment.f32463L;
                    int i7 = 0;
                    long jLongValue = 0;
                    if (textView != null) {
                        SpanUtils foregroundColor = G.i("In  ").setForegroundColor(fundTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f));
                        QueryCashBoxStatResp.CashBoxStat data = queryCashBoxStatResp.getData();
                        textView.setText(foregroundColor.append(r0.B((data == null || (totalMoneyIn2 = data.getTotalMoneyIn()) == null) ? 0L : totalMoneyIn2.longValue(), false)).create());
                    }
                    TextView textView2 = fundTransactionHistoryFragment.f32464M;
                    if (textView2 != null) {
                        SpanUtils foregroundColor2 = G.i("Out  ").setForegroundColor(fundTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f));
                        QueryCashBoxStatResp.CashBoxStat data2 = queryCashBoxStatResp.getData();
                        textView2.setText(foregroundColor2.append(r0.B(Math.abs((data2 == null || (totalMoneyOut2 = data2.getTotalMoneyOut()) == null) ? 0L : totalMoneyOut2.longValue()), false)).create());
                    }
                    TextView textView3 = fundTransactionHistoryFragment.f32463L;
                    String strValueOf = String.valueOf(textView3 != null ? textView3.getText() : null);
                    TextView textView4 = fundTransactionHistoryFragment.f32463L;
                    Integer numValueOf = textView4 != null ? Integer.valueOf(textView4.getVisibility()) : null;
                    LinearLayout linearLayout = fundTransactionHistoryFragment.f32460B;
                    F6.d.h("TargetSavingTransaction", 3, strValueOf + ":" + numValueOf + ":" + (linearLayout != null ? Integer.valueOf(linearLayout.getVisibility()) : null));
                    long jLongValue2 = l5 != null ? l5.longValue() : -1L;
                    QueryCashBoxStatResp.CashBoxStat data3 = queryCashBoxStatResp.getData();
                    long jLongValue3 = (data3 == null || (totalMoneyIn = data3.getTotalMoneyIn()) == null) ? 0L : totalMoneyIn.longValue();
                    QueryCashBoxStatResp.CashBoxStat data4 = queryCashBoxStatResp.getData();
                    if (data4 != null && (totalMoneyOut = data4.getTotalMoneyOut()) != null) {
                        jLongValue = totalMoneyOut.longValue();
                    }
                    Nc.k kVar = fundTransactionHistoryFragment.f32471v;
                    List list = kVar.f6331b;
                    if (list == null) {
                        i7 = -1;
                        break;
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        Object next = it2.next();
                        int i10 = i7 + 1;
                        if (i7 < 0) {
                            C1850q.k();
                            throw null;
                        }
                        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) next;
                        if (cashBoxTransaction.getItemType() == 1 && cashBoxTransaction.getStartTime() == jLongValue2) {
                            break;
                        }
                        i7 = i10;
                    }
                    if (i7 != -1 && (cashBoxTransactionA = kVar.a(i7)) != null) {
                        cashBoxTransactionA.setInComeAmount(jLongValue3);
                        cashBoxTransactionA.setPayOutAmount(jLongValue);
                        kVar.notifyItemChanged(i7, new Bundle());
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    private final Object k(Object obj) {
        GetOrderDetailResp.OrderDetailInfo data;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        OrderDetailFragment orderDetailFragment = (OrderDetailFragment) this.f9060b;
        if (z3) {
            orderDetailFragment.showLoadingDialog(true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            orderDetailFragment.showLoadingDialog(false);
            com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it;
            Object obj2 = pVar.f27360a;
            boolean z8 = obj2 instanceof CommonResult;
            OrderDetailFragment orderDetailFragment2 = (OrderDetailFragment) this.f9061c;
            if (z8) {
                boolean zIsSuccess = ((CommonResult) obj2).isSuccess();
                Object obj3 = pVar.f27360a;
                data = (zIsSuccess ? (GetOrderDetailResp) obj3 : (GetOrderDetailResp) obj3).getData();
            } else {
                data = ((GetOrderDetailResp) obj2).getData();
            }
            orderDetailFragment2.x(data);
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            orderDetailFragment.showLoadingDialog(false);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            orderDetailFragment.showLoadingDialog(false);
            ((com.transsnet.palmpay.core.base.n) it).getClass();
        }
        return Unit.f38893a;
    }

    private final Object l(Object obj) {
        Long totalMoneyOut;
        Long totalMoneyIn;
        Long totalMoneyOut2;
        Long totalMoneyIn2;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                Object obj2 = ((com.transsnet.palmpay.core.base.l) this.f9060b).f27356m;
                QueryCashBoxStatResp queryCashBoxStatResp = (QueryCashBoxStatResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                Long l5 = (Long) obj2;
                if (queryCashBoxStatResp.isSuccess()) {
                    TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = (TargetSavingsTransactionHistoryFragment) this.f9061c;
                    TextView textView = targetSavingsTransactionHistoryFragment.f32554L;
                    long jLongValue = 0;
                    if (textView != null) {
                        SpanUtils foregroundColor = G.i("In  ").setForegroundColor(targetSavingsTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f));
                        QueryCashBoxStatResp.CashBoxStat data = queryCashBoxStatResp.getData();
                        textView.setText(foregroundColor.append(r0.B((data == null || (totalMoneyIn2 = data.getTotalMoneyIn()) == null) ? 0L : totalMoneyIn2.longValue(), false)).create());
                    }
                    TextView textView2 = targetSavingsTransactionHistoryFragment.f32555M;
                    if (textView2 != null) {
                        SpanUtils foregroundColor2 = G.i("Out  ").setForegroundColor(targetSavingsTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f));
                        QueryCashBoxStatResp.CashBoxStat data2 = queryCashBoxStatResp.getData();
                        textView2.setText(foregroundColor2.append(r0.B(Math.abs((data2 == null || (totalMoneyOut2 = data2.getTotalMoneyOut()) == null) ? 0L : totalMoneyOut2.longValue()), false)).create());
                    }
                    TextView textView3 = targetSavingsTransactionHistoryFragment.f32554L;
                    String strValueOf = String.valueOf(textView3 != null ? textView3.getText() : null);
                    TextView textView4 = targetSavingsTransactionHistoryFragment.f32554L;
                    Integer numValueOf = textView4 != null ? Integer.valueOf(textView4.getVisibility()) : null;
                    LinearLayout linearLayout = targetSavingsTransactionHistoryFragment.f32551B;
                    F6.d.h("TargetSavingTransaction", 3, strValueOf + ":" + numValueOf + ":" + (linearLayout != null ? Integer.valueOf(linearLayout.getVisibility()) : null));
                    long jLongValue2 = l5 != null ? l5.longValue() : -1L;
                    QueryCashBoxStatResp.CashBoxStat data3 = queryCashBoxStatResp.getData();
                    long jLongValue3 = (data3 == null || (totalMoneyIn = data3.getTotalMoneyIn()) == null) ? 0L : totalMoneyIn.longValue();
                    QueryCashBoxStatResp.CashBoxStat data4 = queryCashBoxStatResp.getData();
                    if (data4 != null && (totalMoneyOut = data4.getTotalMoneyOut()) != null) {
                        jLongValue = totalMoneyOut.longValue();
                    }
                    targetSavingsTransactionHistoryFragment.f32560v.b(jLongValue2, jLongValue3, jLongValue);
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    private final Object m(Object obj) {
        GetOrderDetailResp.OrderDetailInfo data;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        TransactionDetailFragment transactionDetailFragment = (TransactionDetailFragment) this.f9060b;
        if (z3) {
            transactionDetailFragment.showLoadingDialog(true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            transactionDetailFragment.showLoadingDialog(false);
            com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it;
            Object obj2 = pVar.f27360a;
            boolean z8 = obj2 instanceof CommonResult;
            TransactionDetailFragment transactionDetailFragment2 = (TransactionDetailFragment) this.f9061c;
            if (z8) {
                boolean zIsSuccess = ((CommonResult) obj2).isSuccess();
                Object obj3 = pVar.f27360a;
                data = (zIsSuccess ? (GetOrderDetailResp) obj3 : (GetOrderDetailResp) obj3).getData();
            } else {
                data = ((GetOrderDetailResp) obj2).getData();
            }
            TransactionDetailFragment.t(data, transactionDetailFragment2);
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            transactionDetailFragment.showLoadingDialog(false);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            transactionDetailFragment.showLoadingDialog(false);
            ((com.transsnet.palmpay.core.base.n) it).getClass();
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj) {
        ImageView orderStatusArrow;
        N n10;
        LinearLayout orderStatusLayout;
        ImageView orderStatusArrow2;
        List<BillProcessData2> list;
        N n11;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        Recharge2CashDetailActivity recharge2CashDetailActivity = (Recharge2CashDetailActivity) this.f9060b;
        if (z3) {
            recharge2CashDetailActivity.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            recharge2CashDetailActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            if (commonBeanResult.isSuccess()) {
                T data = commonBeanResult.data;
                R2COrderDetailResp r2COrderDetailResp = (R2COrderDetailResp) data;
                Recharge2CashDetailActivity recharge2CashDetailActivity2 = (Recharge2CashDetailActivity) this.f9061c;
                recharge2CashDetailActivity2.f33116e = r2COrderDetailResp;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                N n12 = (N) recharge2CashDetailActivity2.f27334c;
                if (n12 != null) {
                    n12.f8118e.f(r2COrderDetailResp.icon);
                }
                N n13 = (N) recharge2CashDetailActivity2.f27334c;
                if (n13 != null) {
                    n13.f8118e.o(r2COrderDetailResp.biller);
                }
                N n14 = (N) recharge2CashDetailActivity2.f27334c;
                if (n14 != null) {
                    n14.f8118e.k(recharge2CashDetailActivity2.n(r2COrderDetailResp.orderStatus));
                }
                N n15 = (N) recharge2CashDetailActivity2.f27334c;
                if (n15 != null) {
                    n15.f8118e.c(r0.B(r2COrderDetailResp.receivedAmount, false));
                }
                int i7 = r2COrderDetailResp.orderStatus;
                if (i7 == 1) {
                    N n16 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n16 != null) {
                        n16.f8118e.l(OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, recharge2CashDetailActivity2, 0.0f, 2, null));
                    }
                    N n17 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n17 != null) {
                        p220oa.h.s(n17.f8119f, true);
                    }
                    N n18 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n18 != null) {
                        n18.f8119f.setOnClickListener(new p010a9.b(29, recharge2CashDetailActivity2, r2COrderDetailResp));
                    }
                } else if (i7 != 2) {
                    N n19 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n19 != null) {
                        n19.f8118e.l(OrderResultHeaderModel.a.processingIcon$default(OrderResultHeaderModel.f31610A, recharge2CashDetailActivity2, 0.0f, 2, null));
                    }
                } else {
                    N n20 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n20 != null) {
                        n20.f8118e.l(OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, recharge2CashDetailActivity2, 0.0f, 2, null));
                    }
                    if (!TextUtils.isEmpty(r2COrderDetailResp.errorMsg) && (n11 = (N) recharge2CashDetailActivity2.f27334c) != null) {
                        n11.f8118e.m(r2COrderDetailResp.errorMsg);
                    }
                }
                BillProcessDetail billProcessDetail = r2COrderDetailResp.orderStatusInfo;
                boolean z8 = ((billProcessDetail == null || (list = billProcessDetail.fullTips) == null) ? 0 : list.size()) > 0;
                if (z8) {
                    N n21 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n21 != null && (orderStatusArrow = n21.f8118e.getOrderStatusArrow()) != null) {
                        p220oa.h.s(orderStatusArrow, true);
                    }
                } else {
                    N n22 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n22 != null && (orderStatusArrow2 = n22.f8118e.getOrderStatusArrow()) != null) {
                        p220oa.h.s(orderStatusArrow2, false);
                    }
                }
                N n23 = (N) recharge2CashDetailActivity2.f27334c;
                if (n23 != null && (orderStatusLayout = n23.f8118e.getOrderStatusLayout()) != null) {
                    orderStatusLayout.setOnClickListener(new Fb.k(recharge2CashDetailActivity2, 3, r2COrderDetailResp, z8));
                }
                T data2 = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                R2COrderDetailResp r2COrderDetailResp2 = (R2COrderDetailResp) data2;
                N n24 = (N) recharge2CashDetailActivity2.f27334c;
                if (n24 != null) {
                    n24.f8115b.addView(new OrderResultAmountStyle1(recharge2CashDetailActivity2, "Amount Sold", r0.B(r2COrderDetailResp2.sharedAmount, false)));
                }
                long j6 = r2COrderDetailResp2.convenienceFee + r2COrderDetailResp2.payeeVat;
                Long lValueOf = j6 > 0 ? Long.valueOf(j6) : null;
                if (lValueOf != null) {
                    OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(recharge2CashDetailActivity2, "Convenience Fee", r0.B(lValueOf.longValue(), false));
                    N n25 = (N) recharge2CashDetailActivity2.f27334c;
                    if (n25 != null) {
                        n25.f8115b.addView(orderResultAmountStyle1);
                    }
                }
                N n26 = (N) recharge2CashDetailActivity2.f27334c;
                if (n26 != null) {
                    n26.f8115b.addView(new OrderResultAmountStyle2(recharge2CashDetailActivity2, "Amount Received", r0.B(r2COrderDetailResp2.receivedAmount, false)));
                }
                T data3 = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data3, "data");
                List<OrderDetailItemBean> list2 = ((R2COrderDetailResp) data3).extendFields;
                if (list2 != null && (n10 = (N) recharge2CashDetailActivity2.f27334c) != null) {
                    n10.f8116c.a(list2, new com.transsnet.palmpay.core.ui.activity.Z(recharge2CashDetailActivity2, 21));
                }
            } else {
                ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            recharge2CashDetailActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            recharge2CashDetailActivity.showLoadingDialog(false, true);
            ((com.transsnet.palmpay.core.base.n) it).getClass();
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    private final Object o(Object obj) {
        InputFlashSaleNumberDialog inputFlashSaleNumberDialog;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                String str = ((QueryMobileWalletTypeByPhoneRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a).operatorName;
                if (str != null) {
                    BuyFlashSaleActivity buyFlashSaleActivity = (BuyFlashSaleActivity) this.f9060b;
                    RecommendedItem recommendedItem = buyFlashSaleActivity.f31764d;
                    if (str.equals(recommendedItem != null ? recommendedItem.billerName : null)) {
                        inputFlashSaleNumberDialog = buyFlashSaleActivity.f31765e;
                        if (inputFlashSaleNumberDialog != null) {
                            inputFlashSaleNumberDialog.updateMobile((String) this.f9061c);
                        }
                    } else {
                        RecommendedItem recommendedItem2 = buyFlashSaleActivity.f31764d;
                        if (str.equals(recommendedItem2 != null ? recommendedItem2.billerId : null)) {
                            inputFlashSaleNumberDialog = buyFlashSaleActivity.f31765e;
                            if (inputFlashSaleNumberDialog != null) {
                                inputFlashSaleNumberDialog.updateMobile((String) this.f9061c);
                            }
                        }
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                nVar.getClass();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(Object obj) {
        T data;
        C0588d c0588d;
        C0588d c0588d2;
        String strW0;
        C0588d c0588d3;
        C0588d c0588d4;
        C0588d c0588d5;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        DataBundleAutoRenewTaskStatusActivity dataBundleAutoRenewTaskStatusActivity = (DataBundleAutoRenewTaskStatusActivity) this.f9060b;
        if (z3) {
            dataBundleAutoRenewTaskStatusActivity.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            dataBundleAutoRenewTaskStatusActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            if (commonBeanResult.isSuccess() && (data = commonBeanResult.data) != 0) {
                Intrinsics.checkNotNullExpressionValue(data, "data");
                AutoRenewTaskBean autoRenewTaskBean = (AutoRenewTaskBean) data;
                int i7 = DataBundleAutoRenewTaskStatusActivity.f31766e;
                DataBundleAutoRenewTaskStatusActivity dataBundleAutoRenewTaskStatusActivity2 = (DataBundleAutoRenewTaskStatusActivity) this.f9061c;
                if (TextUtils.isEmpty(autoRenewTaskBean.getFrequencyRemark()) || !Intrinsics.c(autoRenewTaskBean.getReplace(), Boolean.TRUE)) {
                    C0588d c0588d6 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d6 != null) {
                        p220oa.h.s(c0588d6.f8249p, false);
                    }
                } else {
                    C0588d c0588d7 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d7 != null) {
                        p220oa.h.s(c0588d7.f8249p, true);
                    }
                    C0588d c0588d8 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d8 != null) {
                        TextView textView = c0588d8.f8249p;
                        String frequencyRemark = autoRenewTaskBean.getFrequencyRemark();
                        textView.setText(frequencyRemark != null ? CommonExtKt.formatHtmlText(frequencyRemark) : null);
                    }
                }
                T data2 = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                AutoRenewTaskBean autoRenewTaskBean2 = (AutoRenewTaskBean) data2;
                Long renewPrice = autoRenewTaskBean2.getRenewPrice();
                if (renewPrice != null) {
                    long jLongValue = renewPrice.longValue();
                    C0588d c0588d9 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d9 != null) {
                        LinearLayout linearLayout = c0588d9.f8242d;
                        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(dataBundleAutoRenewTaskStatusActivity2, Pd.f.qt_renew_price, r0.B(jLongValue, false));
                        orderResultItemModel.getItemKeyTv().setTextSize(14.0f);
                        orderResultItemModel.getItemValueTv().setTextSize(14.0f);
                        linearLayout.addView(orderResultItemModel);
                    }
                }
                Long originalPrice = autoRenewTaskBean2.getOriginalPrice();
                if (originalPrice != null) {
                    long jLongValue2 = originalPrice.longValue();
                    C0588d c0588d10 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d10 != null) {
                        LinearLayout linearLayout2 = c0588d10.f8242d;
                        OrderResultItemModel orderResultItemModel2 = new OrderResultItemModel(dataBundleAutoRenewTaskStatusActivity2, Pd.f.qt_original_price, r0.B(jLongValue2, false));
                        orderResultItemModel2.getItemKeyTv().setTextSize(14.0f);
                        orderResultItemModel2.getItemValueTv().setTextSize(14.0f);
                        linearLayout2.addView(orderResultItemModel2);
                    }
                }
                String text = autoRenewTaskBean2.getText();
                if (text != null && (c0588d5 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c) != null) {
                    LinearLayout linearLayout3 = c0588d5.f8242d;
                    TextView textView2 = new TextView(dataBundleAutoRenewTaskStatusActivity2);
                    textView2.setTextSize(14.0f);
                    textView2.setText(text);
                    textView2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, dataBundleAutoRenewTaskStatusActivity2));
                    textView2.setPadding(CommonViewExtKt.getDp(12), 0, CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12));
                    linearLayout3.addView(textView2);
                }
                T data3 = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data3, "data");
                AutoRenewTaskBean autoRenewTaskBean3 = (AutoRenewTaskBean) data3;
                String billerName = autoRenewTaskBean3.getBillerName();
                if (billerName != null) {
                    if (billerName.length() <= 0) {
                        billerName = null;
                    }
                    if (billerName != null && (c0588d4 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c) != null) {
                        LinearLayout linearLayout4 = c0588d4.f8243e;
                        OrderResultItemModel orderResultItemModel3 = new OrderResultItemModel(dataBundleAutoRenewTaskStatusActivity2, Vd.a.qt_bill_provider, billerName);
                        orderResultItemModel3.getItemKeyTv().setTextSize(14.0f);
                        orderResultItemModel3.getItemValueTv().setTextSize(14.0f);
                        linearLayout4.addView(orderResultItemModel3);
                    }
                }
                String phone = autoRenewTaskBean3.getPhone();
                if (phone != null) {
                    if (phone.length() <= 0) {
                        phone = null;
                    }
                    if (phone != null && (strW0 = r0.w0(phone)) != null && (c0588d3 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c) != null) {
                        LinearLayout linearLayout5 = c0588d3.f8243e;
                        OrderResultItemModel orderResultItemModel4 = new OrderResultItemModel(dataBundleAutoRenewTaskStatusActivity2, p025ba.k.core_recipient_mobile, CommonExtKt.formatWithPhone(strW0));
                        orderResultItemModel4.getItemKeyTv().setTextSize(14.0f);
                        orderResultItemModel4.getItemValueTv().setTextSize(14.0f);
                        linearLayout5.addView(orderResultItemModel4);
                    }
                }
                String renewItem = autoRenewTaskBean3.getRenewItem();
                if (renewItem != null) {
                    if (renewItem.length() <= 0) {
                        renewItem = null;
                    }
                    if (renewItem != null && (c0588d2 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c) != null) {
                        LinearLayout linearLayout6 = c0588d2.f8243e;
                        OrderResultItemModel orderResultItemModel5 = new OrderResultItemModel(dataBundleAutoRenewTaskStatusActivity2, Pd.f.qt_renew_item, renewItem);
                        orderResultItemModel5.getItemKeyTv().setTextSize(14.0f);
                        orderResultItemModel5.getItemValueTv().setTextSize(14.0f);
                        linearLayout6.addView(orderResultItemModel5);
                    }
                }
                String renewPeriod = autoRenewTaskBean3.getRenewPeriod();
                if (renewPeriod != null) {
                    if (renewPeriod.length() <= 0) {
                        renewPeriod = null;
                    }
                    if (renewPeriod != null && (c0588d = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c) != null) {
                        LinearLayout linearLayout7 = c0588d.f8243e;
                        OrderResultItemModel orderResultItemModel6 = new OrderResultItemModel(dataBundleAutoRenewTaskStatusActivity2, Pd.f.qt_frequency, renewPeriod);
                        orderResultItemModel6.getItemKeyTv().setTextSize(14.0f);
                        orderResultItemModel6.getItemValueTv().setTextSize(14.0f);
                        linearLayout7.addView(orderResultItemModel6);
                    }
                }
                T data4 = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data4, "data");
                AutoRenewTaskBean autoRenewTaskBean4 = (AutoRenewTaskBean) data4;
                String darkBenefitsImg = dataBundleAutoRenewTaskStatusActivity2.isDarkMode() ? autoRenewTaskBean4.getDarkBenefitsImg() : autoRenewTaskBean4.getBenefitsImg();
                if (!TextUtils.isEmpty(darkBenefitsImg)) {
                    C0588d c0588d11 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d11 != null) {
                        p220oa.h.s(c0588d11.f8244f, true);
                    }
                    C0588d c0588d12 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    r0.l1(darkBenefitsImg, c0588d12 != null ? c0588d12.f8240b : null);
                }
                Boolean cashInGuidance = ((AutoRenewTaskBean) commonBeanResult.data).getCashInGuidance();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.c(cashInGuidance, bool)) {
                    Long renewPrice2 = ((AutoRenewTaskBean) commonBeanResult.data).getRenewPrice();
                    if ((renewPrice2 != null ? renewPrice2.longValue() : 0L) > 0) {
                        Long renewPrice3 = ((AutoRenewTaskBean) commonBeanResult.data).getRenewPrice();
                        new NotEnoughAssetsDialog(dataBundleAutoRenewTaskStatusActivity2, renewPrice3 != null ? renewPrice3.longValue() : 0L).transType(TransType.TRANS_TYPE_BUNDLE).show();
                    }
                }
                if (Intrinsics.c(((AutoRenewTaskBean) commonBeanResult.data).getPushGuidance(), bool)) {
                    C0588d c0588d13 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d13 != null) {
                        p220oa.h.s(c0588d13.f8248o, true);
                    }
                    C0588d c0588d14 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d14 != null) {
                        p220oa.h.s(c0588d14.f8246i, false);
                    }
                } else {
                    C0588d c0588d15 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d15 != null) {
                        p220oa.h.s(c0588d15.f8248o, false);
                    }
                    C0588d c0588d16 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d16 != null) {
                        p220oa.h.s(c0588d16.f8246i, true);
                    }
                }
                C0588d c0588d17 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                if (c0588d17 != null) {
                    p220oa.h.s(c0588d17.f8245g, Intrinsics.c(((AutoRenewTaskBean) commonBeanResult.data).getReplace(), bool));
                }
                if (Intrinsics.c(((AutoRenewTaskBean) commonBeanResult.data).getReplace(), bool)) {
                    C0588d c0588d18 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d18 != null) {
                        p220oa.h.c(c0588d18.f8247j);
                    }
                    C0588d c0588d19 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d19 != null) {
                        c0588d19.t.setText(dataBundleAutoRenewTaskStatusActivity2.getString(Pd.f.qt_data_bundle_opened_updated));
                    }
                    C0588d c0588d20 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d20 != null) {
                        c0588d20.f8241c.setImageResource(Pd.b.qt_icon_exchange_outline);
                    }
                } else {
                    C0588d c0588d21 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d21 != null) {
                        c0588d21.t.setText(dataBundleAutoRenewTaskStatusActivity2.getString(Pd.f.qt_data_bundle_opened_successfully));
                    }
                    C0588d c0588d22 = (C0588d) dataBundleAutoRenewTaskStatusActivity2.f27334c;
                    if (c0588d22 != null) {
                        c0588d22.f8241c.setImageDrawable(OrderResultHeaderModel.f31610A.successIcon(dataBundleAutoRenewTaskStatusActivity2, 40.0f));
                    }
                }
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            dataBundleAutoRenewTaskStatusActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            dataBundleAutoRenewTaskStatusActivity.showLoadingDialog(false, true);
            ((com.transsnet.palmpay.core.base.n) it).getClass();
        }
        return Unit.f38893a;
    }

    private final Object q(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity = (DataBundleAutoTopupOverlayActivity) this.f9060b;
        if (z3) {
            dataBundleAutoTopupOverlayActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity2 = (DataBundleAutoTopupOverlayActivity) this.f9061c;
            if (z8) {
                dataBundleAutoTopupOverlayActivity.showLoadingDialog(false, true);
                int i7 = DataBundleAutoTopupOverlayActivity.f31768f;
                dataBundleAutoTopupOverlayActivity2.n();
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                dataBundleAutoTopupOverlayActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                dataBundleAutoTopupOverlayActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
                int i10 = DataBundleAutoTopupOverlayActivity.f31768f;
                dataBundleAutoTopupOverlayActivity2.n();
            }
        }
        return Unit.f38893a;
    }

    private final Object r(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        BillPaymentEditActivity billPaymentEditActivity = (BillPaymentEditActivity) this.f9060b;
        if (z3) {
            billPaymentEditActivity.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            billPaymentEditActivity.showLoadingDialog(false, true);
            GetMenuBillPaymentRsp getMenuBillPaymentRsp = (GetMenuBillPaymentRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            if (getMenuBillPaymentRsp.isSuccess()) {
                ArrayList<GetMenuBillPaymentGroup> arrayList = getMenuBillPaymentRsp.data;
                BillPaymentEditActivity billPaymentEditActivity2 = (BillPaymentEditActivity) this.f9061c;
                if (arrayList == null || arrayList.isEmpty()) {
                    billPaymentEditActivity2.setResult(-1);
                    billPaymentEditActivity2.finish();
                } else {
                    ArrayList<GetMenuBillPaymentGroup> arrayList2 = getMenuBillPaymentRsp.data;
                    if (arrayList2 != null) {
                        ToastUtils.showLong(billPaymentEditActivity2.getString(p025ba.k.core_success), new Object[0]);
                        Intent intent = new Intent();
                        intent.putExtra("key_json_menu_item_list", ((Gson) C0525w.f().f7166b).toJson(arrayList2));
                        Unit unit = Unit.f38893a;
                        billPaymentEditActivity2.setResult(-1, intent);
                        billPaymentEditActivity2.finish();
                    }
                }
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            billPaymentEditActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            billPaymentEditActivity.showLoadingDialog(false, true);
            ((com.transsnet.palmpay.core.base.n) it).getClass();
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:110:0x0210  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object s(Object obj) {
        AirtimeGroupPurchaseDetailData airtimeGroupPurchaseDetailData;
        Rd.G g7;
        Rd.G g10;
        Rd.G g11;
        TextView orderStatusTv;
        Long payAmount;
        Rd.G g12;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AirtimeGroupPurchaseResultActivity airtimeGroupPurchaseResultActivity = (AirtimeGroupPurchaseResultActivity) this.f9060b;
        if (z3) {
            airtimeGroupPurchaseResultActivity.showLoadingDialog(true, true);
        } else {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                airtimeGroupPurchaseResultActivity.showLoadingDialog(false, true);
                AirtimeGroupPurchaseDetailData airtimeGroupPurchaseDetailData2 = (AirtimeGroupPurchaseDetailData) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a).data;
                if (airtimeGroupPurchaseDetailData2 != null) {
                    int i7 = AirtimeGroupPurchaseResultActivity.f26459g;
                    AirtimeGroupPurchaseResultActivity airtimeGroupPurchaseResultActivity2 = (AirtimeGroupPurchaseResultActivity) this.f9061c;
                    Rd.G g13 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                    if (g13 != null) {
                        p220oa.h.s(g13.f8053f, true);
                    }
                    airtimeGroupPurchaseResultActivity2.f26461e = airtimeGroupPurchaseDetailData2;
                    if (i0.W(airtimeGroupPurchaseResultActivity2) && (airtimeGroupPurchaseDetailData = airtimeGroupPurchaseResultActivity2.f26461e) != null) {
                        Rd.G g14 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                        if (g14 != null) {
                            g14.f8052e.removeAllViews();
                        }
                        Long itemPrice = airtimeGroupPurchaseDetailData.getItemPrice();
                        long jLongValue = 0;
                        if ((itemPrice != null ? itemPrice.longValue() : 0L) > 0) {
                            Long itemPrice2 = airtimeGroupPurchaseDetailData.getItemPrice();
                            String strB = r0.B(itemPrice2 != null ? itemPrice2.longValue() : 0L, false);
                            Rd.G g15 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                            if (g15 != null) {
                                LinearLayout linearLayout = g15.f8052e;
                                OrderResultItemModel orderResultItemModel = new OrderResultItemModel(airtimeGroupPurchaseResultActivity2, 1002, airtimeGroupPurchaseResultActivity2.getString(Pd.f.qt_top_up_amount), strB);
                                orderResultItemModel.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel.getItemValueTv().setTextSize(14.0f);
                                linearLayout.addView(orderResultItemModel);
                            }
                        }
                        Long payAmount2 = airtimeGroupPurchaseDetailData.getPayAmount();
                        if ((payAmount2 != null ? payAmount2.longValue() : 0L) > 0) {
                            Long payAmount3 = airtimeGroupPurchaseDetailData.getPayAmount();
                            String strB2 = r0.B(payAmount3 != null ? payAmount3.longValue() : 0L, false);
                            Rd.G g16 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                            if (g16 != null) {
                                LinearLayout linearLayout2 = g16.f8052e;
                                OrderResultItemModel orderResultItemModel2 = new OrderResultItemModel(airtimeGroupPurchaseResultActivity2, 1002, airtimeGroupPurchaseResultActivity2.getString(Pd.f.qt_group_price), strB2);
                                orderResultItemModel2.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel2.getItemValueTv().setTextSize(14.0f);
                                linearLayout2.addView(orderResultItemModel2);
                            }
                        }
                        String strD = i0.D(airtimeGroupPurchaseDetailData.getPhone());
                        Rd.G g17 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                        if (g17 != null) {
                            LinearLayout linearLayout3 = g17.f8052e;
                            OrderResultItemModel orderResultItemModel3 = new OrderResultItemModel(airtimeGroupPurchaseResultActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, airtimeGroupPurchaseResultActivity2.getString(p025ba.k.core_recipient), PhoneBaseNumberUtils.INSTANCE.formatMobileNumber(strD, false));
                            orderResultItemModel3.getItemKeyTv().setTextSize(14.0f);
                            orderResultItemModel3.getItemValueTv().setTextSize(14.0f);
                            linearLayout3.addView(orderResultItemModel3);
                        }
                        if (!TextUtils.isEmpty(airtimeGroupPurchaseDetailData.getPaymentMethod()) && (g12 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c) != null) {
                            g12.f8052e.addView(new OrderResultItemModel(airtimeGroupPurchaseResultActivity2, 1002, airtimeGroupPurchaseResultActivity2.getString(p025ba.k.core_payment_method), airtimeGroupPurchaseDetailData.getPaymentMethod()));
                        }
                        Integer orderStatus = airtimeGroupPurchaseDetailData.getOrderStatus();
                        if ((orderStatus != null ? orderStatus.intValue() : 0) == 1) {
                            Rd.G g18 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                            if (g18 != null) {
                                g18.f8049b.j();
                            }
                            F6.d.h("resultSuccessUpdateUI", 3, new Object[0]);
                            Rd.G g19 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                            if (g19 != null) {
                                g19.f8049b.e(airtimeGroupPurchaseResultActivity2.getString(p025ba.k.core_successful));
                            }
                            Rd.G g20 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                            if (g20 != null) {
                                g20.f8049b.g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, airtimeGroupPurchaseResultActivity2, 0.0f, 2, null));
                            }
                        } else {
                            Integer orderStatus2 = airtimeGroupPurchaseDetailData.getOrderStatus();
                            int iIntValue = orderStatus2 != null ? orderStatus2.intValue() : 0;
                            if (iIntValue == 8 || iIntValue == 9) {
                                g7 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                if (g7 != null) {
                                    g7.f8049b.j();
                                }
                                g10 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                if (g10 != null) {
                                    g10.f8049b.e(airtimeGroupPurchaseResultActivity2.getString(p025ba.k.core_transaction_failed));
                                }
                                g11 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                if (g11 != null) {
                                    g11.f8049b.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, airtimeGroupPurchaseResultActivity2, 0.0f, 2, null));
                                }
                            } else {
                                Integer orderStatus3 = airtimeGroupPurchaseDetailData.getOrderStatus();
                                int iIntValue2 = orderStatus3 != null ? orderStatus3.intValue() : 0;
                                if (iIntValue2 == 2 || iIntValue2 == 7) {
                                    g7 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                    if (g7 != null) {
                                        g7.f8049b.j();
                                    }
                                    g10 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                    if (g10 != null) {
                                        g10.f8049b.e(airtimeGroupPurchaseResultActivity2.getString(p025ba.k.core_transaction_failed));
                                    }
                                    g11 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                    if (g11 != null) {
                                        g11.f8049b.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, airtimeGroupPurchaseResultActivity2, 0.0f, 2, null));
                                    }
                                } else {
                                    Integer orderStatus4 = airtimeGroupPurchaseDetailData.getOrderStatus();
                                    if ((orderStatus4 != null ? orderStatus4.intValue() : 0) == 6) {
                                        g7 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                        if (g7 != null) {
                                            g7.f8049b.j();
                                        }
                                        g10 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                        if (g10 != null) {
                                            g10.f8049b.e(airtimeGroupPurchaseResultActivity2.getString(p025ba.k.core_transaction_failed));
                                        }
                                        g11 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                        if (g11 != null) {
                                            g11.f8049b.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, airtimeGroupPurchaseResultActivity2, 0.0f, 2, null));
                                        }
                                    } else {
                                        Rd.G g21 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                        if (g21 != null) {
                                            g21.f8049b.g(TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, airtimeGroupPurchaseResultActivity2, 0.0f, 2, null));
                                        }
                                        Rd.G g22 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                                        if (g22 != null && (orderStatusTv = g22.f8049b.getOrderStatusTv()) != null) {
                                            orderStatusTv.setText(airtimeGroupPurchaseResultActivity2.getString(v.cv_processing));
                                        }
                                        AbstractC0780y.m(V.f(airtimeGroupPurchaseResultActivity2), null, null, new C1799g(airtimeGroupPurchaseResultActivity2, null), 3);
                                    }
                                }
                            }
                        }
                        Rd.G g23 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                        if (g23 != null) {
                            TransactionResultHeaderModel transactionResultHeaderModel = g23.f8049b;
                            String orderStatusDesc = airtimeGroupPurchaseDetailData.getOrderStatusDesc();
                            if (orderStatusDesc == null) {
                                orderStatusDesc = "";
                            }
                            transactionResultHeaderModel.h(orderStatusDesc);
                        }
                        Rd.G g24 = (Rd.G) airtimeGroupPurchaseResultActivity2.f27334c;
                        if (g24 != null) {
                            TransactionResultHeaderModel transactionResultHeaderModel2 = g24.f8049b;
                            AirtimeGroupPurchaseDetailData airtimeGroupPurchaseDetailData3 = airtimeGroupPurchaseResultActivity2.f26461e;
                            if (airtimeGroupPurchaseDetailData3 != null && (payAmount = airtimeGroupPurchaseDetailData3.getPayAmount()) != null) {
                                jLongValue = payAmount.longValue();
                            }
                            transactionResultHeaderModel2.c(r0.B(jLongValue, true));
                        }
                    }
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                airtimeGroupPurchaseResultActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                airtimeGroupPurchaseResultActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    private final Object t(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AutoTopupOverlayActivity autoTopupOverlayActivity = (AutoTopupOverlayActivity) this.f9060b;
        if (z3) {
            autoTopupOverlayActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            AutoTopupOverlayActivity autoTopupOverlayActivity2 = (AutoTopupOverlayActivity) this.f9061c;
            if (z8) {
                autoTopupOverlayActivity.showLoadingDialog(false, true);
                int i7 = AutoTopupOverlayActivity.f26463f;
                autoTopupOverlayActivity2.n();
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                autoTopupOverlayActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                autoTopupOverlayActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
                int i10 = AutoTopupOverlayActivity.f26463f;
                autoTopupOverlayActivity2.n();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:554:0x09cc A[PHI: r1
      0x09cc: PHI (r1v28 Bc.B) = (r1v26 Bc.B), (r1v27 Bc.B), (r1v35 Bc.B) binds: [B:563:0x09f9, B:558:0x09dd, B:553:0x09ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:606:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:609:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:614:0x0b53 A[PHI: r1
      0x0b53: PHI (r1v8 Bc.e) = (r1v6 Bc.e), (r1v7 Bc.e), (r1v18 Bc.e) binds: [B:623:0x0b82, B:618:0x0b64, B:613:0x0b51] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v21 int, still in use, count: 7, list:
      (r8v21 int) from 0x02b7: IF  (r8v21 int) != (3272 int)  -> B:164:0x02b9 A[HIDDEN] (LINE:696)
      (r8v21 int) from 0x02bb: IF  (r8v21 int) != (3273 int)  -> B:166:0x02bd A[HIDDEN] (LINE:700)
      (r8v21 int) from 0x02bf: IF  (r8v21 int) != (3739 int)  -> B:168:0x02c1 A[HIDDEN] (LINE:704)
      (r8v21 int) from 0x02c3: IF  (r8v21 int) != (3740 int)  -> B:170:0x02c5 A[HIDDEN] (LINE:708)
      (r8v21 int) from 0x02c8: SWITCH (r8v21 int)
     case 1607: goto B:263:0x04a1
     case 1633: goto B:259:0x048c
     case 1664: goto B:255:0x0477
     case 1821: goto B:251:0x0462
     case 3088: goto B:247:0x044d
     case 3250: goto B:243:0x0438
     case 3367: goto B:239:0x0423
     case 3466: goto B:235:0x040e
     case 3522: goto B:231:0x03f9
     case 3551: goto B:227:0x03e4
     case 3676: goto B:223:0x03cf
     default: goto B:172:0x02cb A[RegionRef:SW:171] (LINE:713)
      (r8v21 int) from 0x02cb: SWITCH (r8v21 int)
     case 3305: goto B:219:0x03ba
     case 3306: goto B:215:0x03a5
     case 3307: goto B:211:0x0390
     case 3308: goto B:207:0x037b
     case 3309: goto B:203:0x0366
     case 3310: goto B:199:0x0351
     case 3311: goto B:195:0x033c
     default: goto B:173:0x02ce A[RegionRef:SW:172] (LINE:716)
      (r8v21 int) from 0x02ce: SWITCH (r8v21 int)
     case 3525: goto B:191:0x0327
     case 3526: goto B:187:0x0312
     case 3527: goto B:183:0x02fd
     case 3528: goto B:179:0x02e8
     case 3529: goto B:175:0x02d3
     default: goto B:295:0x053d A[RegionRef:SW:173] (LINE:719)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0108e c0108e;
        E activity;
        B b7;
        E activity2;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        NameCheckRsp nameCheckRsp;
        String str;
        I8.o oVar;
        String str2;
        I8.o oVar2;
        String str3;
        I8.o oVar3;
        Bc.l lVar;
        AddUserExtraInfoReq addUserExtraInfoReqL2;
        RelationShipLogListResp.PageDTO pageDTO;
        RelationShipLogListResp.PageDTO pageDTO2;
        W9.k kVar;
        AgentOrderDetailRsp.DataBean dataBean;
        ImageView orderStatusArrow;
        C0585a c0585a;
        K kE;
        P p3;
        K kE2;
        P p10;
        int i7 = 26;
        Object obj2 = this.f9061c;
        Object obj3 = this.f9060b;
        switch (this.f9059a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                GuardianApproveAuthorizationConfirmFragment guardianApproveAuthorizationConfirmFragment = (GuardianApproveAuthorizationConfirmFragment) obj3;
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    guardianApproveAuthorizationConfirmFragment.showLoadingDialog(true, true);
                } else {
                    GuardianApproveAuthorizationConfirmFragment guardianApproveAuthorizationConfirmFragment2 = (GuardianApproveAuthorizationConfirmFragment) obj2;
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        guardianApproveAuthorizationConfirmFragment.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            AbstractC0130w abstractC0130w = guardianApproveAuthorizationConfirmFragment2.f26142o;
                            if (abstractC0130w != null) {
                                int i10 = F8.d.fragment_guardian_approve_activation_success;
                                Bundle bundle = new Bundle();
                                bundle.putString("extra_data", ((Gson) C0525w.f().f7166b).toJson(commonBeanResult.data));
                                Unit unit = Unit.f38893a;
                                abstractC0130w.h(i10, bundle, BaseAddGuardianFragment.u(null, false));
                            }
                        } else {
                            String respCode = commonBeanResult.getRespCode();
                            if (respCode != null) {
                                int iHashCode = respCode.hashCode();
                                if (iHashCode != 1599549338) {
                                    if (iHashCode != 1599549341) {
                                        if (iHashCode == 1599549347 && respCode.equals("11501009")) {
                                            AbstractC0130w abstractC0130w2 = guardianApproveAuthorizationConfirmFragment2.f26142o;
                                            if (abstractC0130w2 != null) {
                                                abstractC0130w2.h(F8.d.fragment_guardian_approve_birth_certificate, null, BaseAddGuardianFragment.u(null, false));
                                            }
                                        } else if (commonBeanResult.getRichTextErrorDialog(guardianApproveAuthorizationConfirmFragment2.getActivity(), new h0(i7), null) == null) {
                                            io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, new K8.a(27), null, null, null, null, false, 0, 8387197);
                                        }
                                    } else if (respCode.equals("11501003")) {
                                        E activity3 = guardianApproveAuthorizationConfirmFragment2.getActivity();
                                        if (activity3 != null) {
                                            io.fastkv.n.O(activity3, 0, null, guardianApproveAuthorizationConfirmFragment2.getString(F8.h.ac_authorization_limit), null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, new K8.a(i7), null, null, null, null, false, 0, 8387195);
                                        }
                                    } else if (commonBeanResult.getRichTextErrorDialog(guardianApproveAuthorizationConfirmFragment2.getActivity(), new h0(i7), null) == null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, new K8.a(27), null, null, null, null, false, 0, 8387197);
                                    }
                                } else if (respCode.equals("11501000")) {
                                    E activity4 = guardianApproveAuthorizationConfirmFragment2.getActivity();
                                    if (activity4 != null) {
                                        io.fastkv.n.O(activity4, 0, null, "Check Your Age", null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, new K8.a(25), null, null, null, null, false, 0, 8387195);
                                    }
                                } else if (commonBeanResult.getRichTextErrorDialog(guardianApproveAuthorizationConfirmFragment2.getActivity(), new h0(i7), null) == null) {
                                    io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, new K8.a(27), null, null, null, null, false, 0, 8387197);
                                }
                            } else if (commonBeanResult.getRichTextErrorDialog(guardianApproveAuthorizationConfirmFragment2.getActivity(), new h0(i7), null) == null && (activity = guardianApproveAuthorizationConfirmFragment2.getActivity()) != null) {
                                io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, new K8.a(27), null, null, null, null, false, 0, 8387197);
                            }
                        }
                        c0108e = guardianApproveAuthorizationConfirmFragment2.f26146p;
                        if (c0108e != null) {
                            ((PpButton) c0108e.f689f).b(false);
                        }
                    } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                        guardianApproveAuthorizationConfirmFragment.showLoadingDialog(false, true);
                        c0108e = guardianApproveAuthorizationConfirmFragment2.f26146p;
                        if (c0108e != null) {
                            ((PpButton) c0108e.f689f).b(false);
                        }
                    } else {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        guardianApproveAuthorizationConfirmFragment.showLoadingDialog(false, true);
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        com.luck.picture.lib.utils.ToastUtils.showToast(guardianApproveAuthorizationConfirmFragment2.getActivity(), nVar.f27358a);
                        c0108e = guardianApproveAuthorizationConfirmFragment2.f26146p;
                        if (c0108e != null) {
                            ((PpButton) c0108e.f689f).b(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment = (GuardianApproveBirthCertificateFragment) obj3;
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    guardianApproveBirthCertificateFragment.showLoadingDialog(true, true);
                } else {
                    GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment2 = (GuardianApproveBirthCertificateFragment) obj2;
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        guardianApproveBirthCertificateFragment.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            AbstractC0130w abstractC0130w3 = guardianApproveBirthCertificateFragment2.f26142o;
                            if (abstractC0130w3 != null) {
                                int i11 = F8.d.fragment_guardian_approve_review_pending;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("extra_data", ((Gson) C0525w.f().f7166b).toJson(commonBeanResult2.data));
                                Unit unit2 = Unit.f38893a;
                                abstractC0130w3.h(i11, bundle2, BaseAddGuardianFragment.u(null, false));
                            }
                        } else if (commonBeanResult2.getRichTextErrorDialog(guardianApproveBirthCertificateFragment2.getActivity()) == null && (activity2 = guardianApproveBirthCertificateFragment2.getActivity()) != null) {
                            io.fastkv.n.O(activity2, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult2.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                        }
                        b7 = guardianApproveBirthCertificateFragment2.f26147p;
                        if (b7 != null) {
                            ((PpButton) b7.f597i).b(false);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        guardianApproveBirthCertificateFragment.showLoadingDialog(false, true);
                        b7 = guardianApproveBirthCertificateFragment2.f26147p;
                        if (b7 != null) {
                            ((PpButton) b7.f597i).b(false);
                        }
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        guardianApproveBirthCertificateFragment.showLoadingDialog(false, true);
                        com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it2;
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        b7 = guardianApproveBirthCertificateFragment2.f26147p;
                        if (b7 != null) {
                            ((PpButton) b7.f597i).b(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment = (IdentityVerificationConfirmBvnFragment) obj3;
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationConfirmBvnFragment.showLoadingDialog(true, true);
                } else {
                    IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment2 = (IdentityVerificationConfirmBvnFragment) obj2;
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        identityVerificationConfirmBvnFragment.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        I8.q qVar = (I8.q) identityVerificationConfirmBvnFragment2.f27335j;
                        if (qVar != null) {
                            qVar.f4190d.b(false);
                        }
                        if (commonBeanResult3.isSuccess()) {
                            IdentityVerificationActivity identityVerificationActivityV = identityVerificationConfirmBvnFragment2.v();
                            if (identityVerificationActivityV != null && (addUserExtraInfoReqL = identityVerificationActivityV.l()) != null) {
                                addUserExtraInfoReqL.birthday = null;
                            }
                            IdentityVerificationActivity identityVerificationActivityV2 = identityVerificationConfirmBvnFragment2.v();
                            if (identityVerificationActivityV2 != null) {
                                AbstractC0130w abstractC0130w4 = identityVerificationConfirmBvnFragment2.f26168p;
                                T data = commonBeanResult3.data;
                                Intrinsics.checkNotNullExpressionValue(data, "data");
                                identityVerificationActivityV2.p(abstractC0130w4, (AddUserExtraActionRsp) data, Integer.valueOf(F8.d.fragment_identity_verification_step_id));
                            }
                        } else {
                            E activity5 = identityVerificationConfirmBvnFragment2.getActivity();
                            if (activity5 != null) {
                                io.fastkv.n.O(activity5, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult3.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                            }
                        }
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        identityVerificationConfirmBvnFragment.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        identityVerificationConfirmBvnFragment.showLoadingDialog(false, true);
                        com.transsnet.palmpay.core.base.n nVar3 = (com.transsnet.palmpay.core.base.n) it3;
                        ToastUtils.showLong(nVar3.f27358a, new Object[0]);
                        String str4 = nVar3.f27358a;
                        I8.q qVar2 = (I8.q) identityVerificationConfirmBvnFragment2.f27335j;
                        if (qVar2 != null) {
                            qVar2.f4190d.b(false);
                        }
                        p220oa.h.y(identityVerificationConfirmBvnFragment2, str4);
                    }
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                IdentityVerificationStep2Fragment identityVerificationStep2Fragment = (IdentityVerificationStep2Fragment) obj3;
                if (it4 instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationStep2Fragment.showLoadingDialog(true, true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    identityVerificationStep2Fragment.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                    IdentityVerificationStep2Fragment identityVerificationStep2Fragment2 = (IdentityVerificationStep2Fragment) obj2;
                    if (commonBeanResult4 != null && (nameCheckRsp = (NameCheckRsp) commonBeanResult4.data) != null) {
                        if (nameCheckRsp.middleNameStatus && nameCheckRsp.firstnameStatus && nameCheckRsp.lastnameStatus) {
                            identityVerificationStep2Fragment2.B();
                        } else {
                            if (!nameCheckRsp.firstnameStatus && (str3 = nameCheckRsp.firstnameMsg) != null && (oVar3 = (I8.o) identityVerificationStep2Fragment2.f27335j) != null) {
                                oVar3.f4169d.h(str3);
                            }
                            if (!nameCheckRsp.middleNameStatus && (str2 = nameCheckRsp.middleNameMsg) != null && (oVar2 = (I8.o) identityVerificationStep2Fragment2.f27335j) != null) {
                                oVar2.f4171f.h(str2);
                            }
                            if (!nameCheckRsp.lastnameStatus && (str = nameCheckRsp.lastnameMsg) != null && (oVar = (I8.o) identityVerificationStep2Fragment2.f27335j) != null) {
                                oVar.f4170e.h(str);
                            }
                        }
                    }
                } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                    identityVerificationStep2Fragment.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    identityVerificationStep2Fragment.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 4:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    IdentityVerificationStep2Fragment identityVerificationStep2Fragment3 = (IdentityVerificationStep2Fragment) obj2;
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj4 = ((com.transsnet.palmpay.core.base.l) obj3).f27356m;
                        RegularRuleRsp regularRuleRsp = (RegularRuleRsp) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        Boolean bool = (Boolean) obj4;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        identityVerificationStep2Fragment3.getClass();
                        if (regularRuleRsp != null) {
                            if (regularRuleRsp.isSuccess()) {
                                identityVerificationStep2Fragment3.f26178p = regularRuleRsp.data;
                                if (zBooleanValue && identityVerificationStep2Fragment3.v()) {
                                    identityVerificationStep2Fragment3.B();
                                }
                            } else {
                                ToastUtils.showLong(regularRuleRsp.getRespMsg(), new Object[0]);
                            }
                        }
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        p220oa.h.y(identityVerificationStep2Fragment3, ((com.transsnet.palmpay.core.base.n) it5).f27358a);
                    }
                }
                return Unit.f38893a;
            case 5:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment = (IdentityVerificationStepFace2Fragment) obj3;
                if (it6 instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationStepFace2Fragment.showLoadingDialog(true, true);
                } else {
                    IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment2 = (IdentityVerificationStepFace2Fragment) obj2;
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        identityVerificationStepFace2Fragment.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult5 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it6).f27360a;
                        if (commonBeanResult5.isSuccess()) {
                            IdentityVerificationActivity identityVerificationActivityU = identityVerificationStepFace2Fragment2.u();
                            if (identityVerificationActivityU != null && (addUserExtraInfoReqL2 = identityVerificationActivityU.l()) != null) {
                                addUserExtraInfoReqL2.faceToken = null;
                            }
                            IdentityVerificationActivity identityVerificationActivityU2 = identityVerificationStepFace2Fragment2.u();
                            if (identityVerificationActivityU2 != null) {
                                AbstractC0130w abstractC0130w5 = identityVerificationStepFace2Fragment2.t;
                                T data2 = commonBeanResult5.data;
                                Intrinsics.checkNotNullExpressionValue(data2, "data");
                                identityVerificationActivityU2.p(abstractC0130w5, (AddUserExtraActionRsp) data2, Integer.valueOf(F8.d.fragment_identity_verification_step_face_2));
                            }
                        } else {
                            Context context = identityVerificationStepFace2Fragment2.getContext();
                            if (context != null) {
                                String respMsg = commonBeanResult5.getRespMsg();
                                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                                p220oa.h.t(context, respMsg);
                            }
                        }
                        I8.r rVar = (I8.r) identityVerificationStepFace2Fragment2.f27335j;
                        if (rVar != null) {
                            ((PpButton) rVar.f4201b.f755c).b(false);
                        }
                        IdentityVerificationActivity identityVerificationActivityU3 = identityVerificationStepFace2Fragment2.u();
                        if (identityVerificationActivityU3 != null) {
                            identityVerificationActivityU3.f25865d = false;
                        }
                        I8.r rVar2 = (I8.r) identityVerificationStepFace2Fragment2.f27335j;
                        if (rVar2 != null) {
                            lVar = rVar2.f4201b;
                            ((PpButton) lVar.f755c).setEnabled(true);
                        }
                    } else if (it6 instanceof com.transsnet.palmpay.core.base.m) {
                        identityVerificationStepFace2Fragment.showLoadingDialog(false, true);
                        I8.r rVar3 = (I8.r) identityVerificationStepFace2Fragment2.f27335j;
                        if (rVar3 != null) {
                            ((PpButton) rVar3.f4201b.f755c).b(false);
                        }
                        IdentityVerificationActivity identityVerificationActivityU4 = identityVerificationStepFace2Fragment2.u();
                        if (identityVerificationActivityU4 != null) {
                            identityVerificationActivityU4.f25865d = false;
                        }
                        I8.r rVar4 = (I8.r) identityVerificationStepFace2Fragment2.f27335j;
                        if (rVar4 != null) {
                            lVar = rVar4.f4201b;
                            ((PpButton) lVar.f755c).setEnabled(true);
                        }
                    } else {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        identityVerificationStepFace2Fragment.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it6).f27358a, new Object[0]);
                        I8.r rVar5 = (I8.r) identityVerificationStepFace2Fragment2.f27335j;
                        if (rVar5 != null) {
                            ((PpButton) rVar5.f4201b.f755c).b(false);
                        }
                        IdentityVerificationActivity identityVerificationActivityU5 = identityVerificationStepFace2Fragment2.u();
                        if (identityVerificationActivityU5 != null) {
                            identityVerificationActivityU5.f25865d = false;
                        }
                        I8.r rVar6 = (I8.r) identityVerificationStepFace2Fragment2.f27335j;
                        if (rVar6 != null) {
                            lVar = rVar6.f4201b;
                            ((PpButton) lVar.f755c).setEnabled(true);
                        }
                    }
                }
                return Unit.f38893a;
            case 6:
                com.transsnet.palmpay.core.base.q it7 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                LinkFaveNoticeListActivity linkFaveNoticeListActivity = (LinkFaveNoticeListActivity) obj3;
                if (it7 instanceof com.transsnet.palmpay.core.base.o) {
                    linkFaveNoticeListActivity.showLoadingDialog(true, true);
                } else if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                    linkFaveNoticeListActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult6 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a;
                    LinkFaveNoticeListActivity linkFaveNoticeListActivity2 = (LinkFaveNoticeListActivity) obj2;
                    if (commonBeanResult6.isSuccess()) {
                        RelationShipLogListResp relationShipLogListResp = (RelationShipLogListResp) commonBeanResult6.data;
                        if (relationShipLogListResp != null && (pageDTO2 = relationShipLogListResp.pageDTO) != null && pageDTO2.curPage == 1 && (kVar = linkFaveNoticeListActivity2.f27220d) != null) {
                            kVar.b();
                        }
                        W9.k kVar2 = linkFaveNoticeListActivity2.f27220d;
                        if (kVar2 != null) {
                            RelationShipLogListResp relationShipLogListResp2 = (RelationShipLogListResp) commonBeanResult6.data;
                            kVar2.a((relationShipLogListResp2 == null || (pageDTO = relationShipLogListResp2.pageDTO) == null) ? null : pageDTO.list);
                        }
                        Bc.i iVar = linkFaveNoticeListActivity2.f27219c;
                        ImageView imageView = iVar != null ? (ImageView) iVar.f727e : null;
                        RelationShipLogListResp relationShipLogListResp3 = (RelationShipLogListResp) commonBeanResult6.data;
                        r0.u1(imageView, relationShipLogListResp3 != null ? relationShipLogListResp3.headPortrait : null, com.transsnet.palmpay.custom_view.r.cv_avatar_default);
                        Bc.i iVar2 = linkFaveNoticeListActivity2.f27219c;
                        if (iVar2 != null) {
                            TextView textView = (TextView) iVar2.f729g;
                            RelationShipLogListResp relationShipLogListResp4 = (RelationShipLogListResp) commonBeanResult6.data;
                            textView.setText(relationShipLogListResp4 != null ? relationShipLogListResp4.nickName : null);
                        }
                    } else {
                        p220oa.h.x(linkFaveNoticeListActivity2, commonBeanResult6.getRespMsg());
                    }
                } else if (it7 instanceof com.transsnet.palmpay.core.base.m) {
                    linkFaveNoticeListActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it7 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    linkFaveNoticeListActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it7).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 7:
                com.transsnet.palmpay.core.base.q it8 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                AgentOrderDetailActivity agentOrderDetailActivity = (AgentOrderDetailActivity) obj3;
                if (it8 instanceof com.transsnet.palmpay.core.base.o) {
                    agentOrderDetailActivity.showLoadingDialog(true, true);
                } else if (it8 instanceof com.transsnet.palmpay.core.base.p) {
                    agentOrderDetailActivity.showLoadingDialog(false, true);
                    AgentOrderDetailRsp agentOrderDetailRsp = (AgentOrderDetailRsp) ((com.transsnet.palmpay.core.base.p) it8).f27360a;
                    AgentOrderDetailActivity context2 = (AgentOrderDetailActivity) obj2;
                    String string = "";
                    if (agentOrderDetailRsp.isSuccess()) {
                        int i12 = AgentOrderDetailActivity.f34139i;
                        if (i0.W(context2) && (dataBean = agentOrderDetailRsp.data) != null) {
                            context2.f34142f = dataBean;
                            String businessTransType = dataBean.businessTransType;
                            Intrinsics.checkNotNullExpressionValue(businessTransType, "businessTransType");
                            Uri uriC = Ea.a.c(businessTransType, (14 & 2) != 0 ? null : -1, null, null);
                            if (TextUtils.isEmpty(dataBean.icon)) {
                                C0585a c0585a2 = (C0585a) context2.f27334c;
                                if (c0585a2 != null) {
                                    c0585a2.f8203e.e(uriC);
                                }
                            } else {
                                C0585a c0585a3 = (C0585a) context2.f27334c;
                                if (c0585a3 != null) {
                                    c0585a3.f8203e.h(dataBean.icon);
                                }
                            }
                            C0585a c0585a4 = (C0585a) context2.f27334c;
                            if (c0585a4 != null) {
                                c0585a4.f8203e.o(dataBean.businessTransTypeName);
                            }
                            C0585a c0585a5 = (C0585a) context2.f27334c;
                            if (c0585a5 != null) {
                                c0585a5.f8203e.k(dataBean.orderStatusDesc);
                            }
                            C0585a c0585a6 = (C0585a) context2.f27334c;
                            if (c0585a6 != null) {
                                c0585a6.f8203e.c(r0.B(dataBean.businessAmount, false));
                            }
                            C0585a c0585a7 = (C0585a) context2.f27334c;
                            if (c0585a7 != null) {
                                c0585a7.f8203e.l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, context2, dataBean.orderStatusDesc, 0.0f, 4, null));
                            }
                            if (dataBean.orderStatus == 2 && !TextUtils.isEmpty(dataBean.errorMessage) && (c0585a = (C0585a) context2.f27334c) != null) {
                                c0585a.f8203e.m(dataBean.errorMessage);
                            }
                            C0585a c0585a8 = (C0585a) context2.f27334c;
                            if (c0585a8 != null && (orderStatusArrow = c0585a8.f8203e.getOrderStatusArrow()) != null) {
                                orderStatusArrow.setVisibility(8);
                            }
                            C0585a c0585a9 = (C0585a) context2.f27334c;
                            if (c0585a9 != null) {
                                c0585a9.f8200b.addView(new OrderResultAmountStyle1(context2, v.cv_total_commission_amount, r0.B(dataBean.totalAmount, false)));
                            }
                            long j6 = dataBean.withholdingTax;
                            Long lValueOf = j6 > 0 ? Long.valueOf(j6) : null;
                            if (lValueOf != null) {
                                String strO = G.o("- ", r0.B(lValueOf.longValue(), true));
                                C0585a c0585a10 = (C0585a) context2.f27334c;
                                if (c0585a10 != null) {
                                    c0585a10.f8200b.addView(new OrderResultAmountStyle1(context2, p025ba.k.core_wht, strO));
                                }
                            }
                            C0585a c0585a11 = (C0585a) context2.f27334c;
                            if (c0585a11 != null) {
                                c0585a11.f8200b.addView(new OrderResultAmountStyle2(context2, p025ba.k.core_actual_commission_amount, r0.B(dataBean.businessAmount, false)));
                            }
                            C0585a c0585a12 = (C0585a) context2.f27334c;
                            if (c0585a12 != null) {
                                LinearLayout linearLayout = c0585a12.f8201c;
                                int i13 = p025ba.k.core_receipt_transaction_type;
                                String str5 = p070ee.c.f36289a;
                                String str6 = dataBean.transType;
                                Intrinsics.checkNotNullParameter(context2, "context");
                                if (!TextUtils.isEmpty(str6) && str6 != null) {
                                    if (iHashCode != 3272) {
                                        if (iHashCode != 3273) {
                                            if (iHashCode != 3739) {
                                                if (iHashCode != 3740) {
                                                    switch (str6) {
                                                        case "15":
                                                            string = context2.getString(Vd.a.qt_water);
                                                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                            break;
                                                        case "16":
                                                            string = context2.getString(Vd.a.qt_electricity);
                                                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                            break;
                                                        case "17":
                                                            string = context2.getString(Vd.a.qt_cable_tv);
                                                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                            break;
                                                        default:
                                                            switch (str6) {
                                                                case 1607:
                                                                    if (str6.equals("29")) {
                                                                        string = context2.getString(Vd.a.qt_internet);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 1633:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BUNDLE)) {
                                                                        string = context2.getString(Vd.a.qt_bundle_bills);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 1664:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_INSURANCE)) {
                                                                        string = context2.getString(Vd.a.qt_insurance);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 1821:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_BETTING)) {
                                                                        string = context2.getString(Vd.a.qt_betting_deposit);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 3088:
                                                                    if (str6.equals(TransType.TRANS_TYPE_PREPAID_CARD)) {
                                                                        string = context2.getString(Vd.a.qt_prepaid_card);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 3250:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_TRANSPORT)) {
                                                                        string = context2.getString(Vd.a.qt_transport);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 3367:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS)) {
                                                                        string = context2.getString(p025ba.k.core_biller_waec_payments);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 3466:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS)) {
                                                                        string = context2.getString(Vd.a.qt_jamb);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 3522:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW)) {
                                                                        string = context2.getString(Vd.a.qt_betting_withdraw);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 3551:
                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES)) {
                                                                        string = context2.getString(Vd.a.qt_associations_and_societies_home_page_banner);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                case 3676:
                                                                    if (str6.equals(TransType.TRANS_TYPE_AGENT_COMMISSION)) {
                                                                        string = context2.getString(p025ba.k.core_commission);
                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                    }
                                                                    break;
                                                                default:
                                                                    switch (str6) {
                                                                        case 3305:
                                                                            if (str6.equals(TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS)) {
                                                                                string = context2.getString(p025ba.k.core_biller_government_payments);
                                                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                            }
                                                                            break;
                                                                        case 3306:
                                                                            if (str6.equals(TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS)) {
                                                                                string = context2.getString(p025ba.k.core_biller_invoice_payments);
                                                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                            }
                                                                            break;
                                                                        case 3307:
                                                                            if (str6.equals(TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS)) {
                                                                                string = context2.getString(p025ba.k.core_biller_travel_hotel_payments);
                                                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                            }
                                                                            break;
                                                                        case 3308:
                                                                            if (str6.equals(TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS)) {
                                                                                string = context2.getString(p025ba.k.core_biller_financial_services_payments);
                                                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                            }
                                                                            break;
                                                                        case 3309:
                                                                            if (str6.equals(TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS)) {
                                                                                string = context2.getString(p025ba.k.core_biller_bankone_mfbs_payments);
                                                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                            }
                                                                            break;
                                                                        case 3310:
                                                                            if (str6.equals(TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS)) {
                                                                                string = context2.getString(p025ba.k.core_biller_products_services_payments);
                                                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                            }
                                                                            break;
                                                                        case 3311:
                                                                            if (str6.equals(TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS)) {
                                                                                string = context2.getString(p025ba.k.core_biller_cowry_card_payments);
                                                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                            }
                                                                            break;
                                                                        default:
                                                                            switch (iHashCode) {
                                                                                case 3525:
                                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING)) {
                                                                                        string = context2.getString(Vd.a.qt_online_shopping_home_page_banner);
                                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                                    }
                                                                                    break;
                                                                                case 3526:
                                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_EVENT_TICKET)) {
                                                                                        string = context2.getString(Vd.a.qt_event_ticket_home_page_banner);
                                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                                    }
                                                                                    break;
                                                                                case 3527:
                                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE)) {
                                                                                        string = context2.getString(Vd.a.qt_dues_and_service_charge_home_page_banner);
                                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                                    }
                                                                                    break;
                                                                                case 3528:
                                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS)) {
                                                                                        string = context2.getString(Vd.a.qt_credit_and_loans_home_page_banner);
                                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                                    }
                                                                                    break;
                                                                                case 3529:
                                                                                    if (str6.equals(TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE)) {
                                                                                        string = context2.getString(Vd.a.qt_commerce_retail_trade_home_page_banner);
                                                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                    }
                                                } else if (str6.equals(TransType.TRANS_TYPE_GENIEX_RECHARGE_BALANCE)) {
                                                    string = context2.getString(p025ba.k.core_geniex_recharge);
                                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                }
                                            } else if (str6.equals(TransType.TRANS_TYPE_GENIEX_DATA_BUNDLE)) {
                                                string = context2.getString(p025ba.k.core_geniex_data);
                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                            }
                                        } else if (str6.equals(TransType.TRANS_TYPE_BILLER_EDUCATION)) {
                                            string = context2.getString(Vd.a.qt_education);
                                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        }
                                    } else if (str6.equals(TransType.TRANS_TYPE_BILLER_RELIGIOUS)) {
                                        string = context2.getString(Vd.a.qt_religious);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    }
                                }
                                linearLayout.addView(new OrderResultItemModel(context2, i13, string));
                            }
                            String strQ0 = r0.q0(dataBean.payeeAccountType, dataBean.bankName, dataBean.payerCardNo);
                            Intrinsics.checkNotNullExpressionValue(strQ0, "getPaymentMethodDesc(...)");
                            context2.f34143g = strQ0;
                            String string2 = context2.getString(p025ba.k.core_payment_into_your);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            C0585a c0585a13 = (C0585a) context2.f27334c;
                            if (c0585a13 != null) {
                                c0585a13.f8201c.addView(new OrderResultItemModel(context2, string2, context2.f34143g));
                            }
                            C0585a c0585a14 = (C0585a) context2.f27334c;
                            if (c0585a14 != null) {
                                c0585a14.f8201c.addView(new OrderResultItemModel(context2, ErrorCodes.MALFORMED_URL_EXCEPTION, p025ba.k.core_reference_no_2, context2.f34140d));
                            }
                            C0585a c0585a15 = (C0585a) context2.f27334c;
                            if (c0585a15 != null) {
                                c0585a15.f8201c.addView(new OrderResultItemModel(context2, p025ba.k.core_commission_time, r0.P(dataBean.settlementDate)));
                            }
                            C0585a c0585a16 = (C0585a) context2.f27334c;
                            if (c0585a16 != null) {
                                c0585a16.f8201c.addView(new OrderResultItemModel(context2, p025ba.k.core_paid_time, r0.R(dataBean.completeTime)));
                            }
                        }
                    } else {
                        String respMsg2 = agentOrderDetailRsp.getRespMsg();
                        string = respMsg2 != null ? respMsg2 : "";
                        int i14 = AgentOrderDetailActivity.f34139i;
                        O6.c cVar = new O6.c(context2);
                        cVar.e(p025ba.k.core_title_error_info);
                        cVar.f6598d = string;
                        cVar.d(p025ba.k.core_try_again, new I0(context2, 16));
                        cVar.g();
                    }
                } else if (it8 instanceof com.transsnet.palmpay.core.base.m) {
                    agentOrderDetailActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it8 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    agentOrderDetailActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it8).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 8:
                return a(obj);
            case 9:
                return b(obj);
            case 10:
                com.transsnet.palmpay.core.base.q it9 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                CashBoxAutoSaveOperationActivity cashBoxAutoSaveOperationActivity = (CashBoxAutoSaveOperationActivity) obj3;
                if (it9 instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxAutoSaveOperationActivity.showLoadingDialog(true, true);
                } else {
                    CashBoxAutoSaveOperationActivity cashBoxAutoSaveOperationActivity2 = (CashBoxAutoSaveOperationActivity) obj2;
                    if (it9 instanceof com.transsnet.palmpay.core.base.p) {
                        cashBoxAutoSaveOperationActivity.showLoadingDialog(false, true);
                    } else if (it9 instanceof com.transsnet.palmpay.core.base.m) {
                        cashBoxAutoSaveOperationActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it9 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        cashBoxAutoSaveOperationActivity.showLoadingDialog(false, true);
                        ((com.transsnet.palmpay.core.base.n) it9).getClass();
                    }
                    cashBoxAutoSaveOperationActivity2.finish();
                }
                return Unit.f38893a;
            case 11:
                return c(obj);
            case 12:
                return d(obj);
            case 13:
                return e(obj);
            case 14:
                return f(obj);
            case 15:
                return g(obj);
            case 16:
                return h(obj);
            case 17:
                return i(obj);
            case 18:
                return j(obj);
            case 19:
                return k(obj);
            case 20:
                return l(obj);
            case 21:
                return m(obj);
            case 22:
                return n(obj);
            case 23:
                return o(obj);
            case 24:
                return p(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return q(obj);
            case 26:
                return r(obj);
            case 27:
                return s(obj);
            case 28:
                return t(obj);
            default:
                com.transsnet.palmpay.core.base.q it10 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                ScheduleTopUpHomeActivity scheduleTopUpHomeActivity = (ScheduleTopUpHomeActivity) obj3;
                if (it10 instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTopUpHomeActivity.showLoadingDialog(true, true);
                } else {
                    ScheduleTopUpHomeActivity scheduleTopUpHomeActivity2 = (ScheduleTopUpHomeActivity) obj2;
                    if (it10 instanceof com.transsnet.palmpay.core.base.p) {
                        scheduleTopUpHomeActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult7 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it10).f27360a;
                        if (commonBeanResult7.isSuccess()) {
                            int i15 = ScheduleTopUpHomeActivity.f26471i;
                            L l5 = (L) scheduleTopUpHomeActivity2.f26474f.getValue();
                            List<ScheduleTopUpTaskBean> item = ((ScheduleTopUpTaskRsp) commonBeanResult7.data).getPaymentPhones();
                            if (item == null) {
                                item = z.f38935a;
                            }
                            l5.getClass();
                            Intrinsics.checkNotNullParameter(item, "item");
                            l5.f40122d.k(item);
                        } else {
                            P p11 = scheduleTopUpHomeActivity2.f26475g;
                            if (p11 != null && (kE2 = p11.e()) != null && kE2.f961i == Pd.c.emptyViewPlaceholder && (p10 = scheduleTopUpHomeActivity2.f26475g) != null) {
                                p10.h(Pd.c.fragmentGuide, null, null);
                            }
                        }
                    } else if (it10 instanceof com.transsnet.palmpay.core.base.m) {
                        scheduleTopUpHomeActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it10 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        scheduleTopUpHomeActivity.showLoadingDialog(false, true);
                        ToastUtils.showShort(((com.transsnet.palmpay.core.base.n) it10).f27358a, new Object[0]);
                        P p12 = scheduleTopUpHomeActivity2.f26475g;
                        if (p12 != null && (kE = p12.e()) != null && kE.f961i == Pd.c.emptyViewPlaceholder && (p3 = scheduleTopUpHomeActivity2.f26475g) != null) {
                            p3.h(Pd.c.fragmentGuide, null, null);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}
