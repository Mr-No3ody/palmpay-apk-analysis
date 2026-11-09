package p141j9;

import Bc.C0105b;
import Bc.C0106c;
import Bc.C0107d;
import C0.AbstractC0130w;
import C0.G;
import C0.K;
import C0.P;
import C0.U;
import E.AbstractC0198c;
import Fb.f;
import Fb.i;
import G1.a;
import G1.d;
import Jb.H;
import L6.b;
import N8.q0;
import O6.c;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Rd.A;
import Ya.g;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.adjust.sdk.network.ErrorCodes;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.bean.rsp.FlashSalesProductsDataBean;
import com.transsnet.palmpay.airtime.bean.rsp.FlashSalesProductsItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskStatusActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.airtime.ui.dialog.NotEnoughAssetsDialog;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.bean.QueryOrderNoParamReq;
import com.transsnet.palmpay.betting.ui.activity.BettingAutoRenewOverlayActivity;
import com.transsnet.palmpay.common.export.bean.resp.DialogConfigSettingsResp;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.OrderContentDTO;
import com.transsnet.palmpay.core.bean.RewardOrderDetail;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.core.bean.bill.SubTransType;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.BuyEarlyRefundOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.CashInOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.CashOrderExtendBean;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderNoRsp;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.DataBundleRecordHistoryViewModel;
import com.transsnet.palmpay.credit.bean.BindStatusEnum;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLQueryApplyAuditResultResp;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.Data;
import com.transsnet.palmpay.credit.bean.resp.OcGoldCardLevelData;
import com.transsnet.palmpay.credit.bean.resp.OcGoldCardLevelResp;
import com.transsnet.palmpay.credit.bean.resp.OcRepaymentDate;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.bean.resp.OcTotalOverpaymentData;
import com.transsnet.palmpay.credit.bean.resp.OcTotalOverpaymentResp;
import com.transsnet.palmpay.credit.bean.resp.Reason;
import com.transsnet.palmpay.credit.ui.activity.PastShopListActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopTradeRecordDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopTransReceiptActivity;
import com.transsnet.palmpay.credit.ui.activity.RewardOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLCreditManagementActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcALiFaceGuideActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyLiteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGoldCardUpgradeActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOverpaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.transferbyloan.TransferByLoanActivity;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle2;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.main.export.bean.rsp.MinorGuardianManagerResp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmSafeDetail;
import com.transsnet.palmpay.main.export.bean.rsp.PayCodeOrderDetailBean;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import com.transsnet.palmpay.send_money.bean.AllBankListResp;
import com.transsnet.palmpay.send_money.bean.resp.CompensationDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarAuthInfoRsp;
import com.transsnet.palmpay.send_money.ui.activity.CompensationDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.kkcar.KkCarHostActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.PersonalHomePageActivity;
import com.transsnet.palmpay.send_money.util.kkcar.KkCarPassengerAuthStore;
import com.transsnet.palmpay.ui.activity.detail.BuyEarlyRefundDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.InterBankCashInOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.me.MeBalanceAccountActivity;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountHistoryListActivity;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountListActivity;
import com.transsnet.palmpay.ui.activity.minor.MinorGuardianManagerActivity;
import com.transsnet.palmpay.ui.activity.palmsafe.PalmSafeDetailActivity;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeOrderDetailActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;
import p159kd.e;
import p220oa.h;
import p284sb.ViewOnClickListenerC2018p;
import p310ub.Y;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f38431c;

    public /* synthetic */ t(Object obj, BaseActivity baseActivity, int i7) {
        this.f38429a = i7;
        this.f38430b = obj;
        this.f38431c = baseActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj) {
        List<OrderContentDTO> list;
        ImageView orderStatusArrow;
        final int i7 = 0;
        final int i10 = 1;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        InterBankCashInOrderDetailActivity interBankCashInOrderDetailActivity = (InterBankCashInOrderDetailActivity) this.f38430b;
        if (z3) {
            interBankCashInOrderDetailActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            interBankCashInOrderDetailActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
            boolean zIsSuccess = commonBeanResult.isSuccess();
            final InterBankCashInOrderDetailActivity interBankCashInOrderDetailActivity2 = (InterBankCashInOrderDetailActivity) this.f38431c;
            if (zIsSuccess) {
                CashInOrderDetailRsp cashInOrderDetailRsp = (CashInOrderDetailRsp) commonBeanResult.data;
                if (cashInOrderDetailRsp != null) {
                    C0105b c0105b = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b != null) {
                        ((LinearLayout) c0105b.f664d).removeAllViews();
                    }
                    C0105b c0105b2 = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b2 != null) {
                        ((LinearLayout) c0105b2.f665e).removeAllViews();
                    }
                    CashOrderExtendBean cashOrderExtendBean = cashInOrderDetailRsp.cashOrderExtendDTO;
                    if (cashOrderExtendBean != null) {
                        C0105b c0105b3 = interBankCashInOrderDetailActivity2.f34702e;
                        if (c0105b3 != null) {
                            FixedSavingsLayout.c((FixedSavingsLayout) c0105b3.f663c, cashOrderExtendBean, TransType.TRANS_TYPE_INTERBANK_CASH_IN, 4);
                        }
                        C0105b c0105b4 = interBankCashInOrderDetailActivity2.f34702e;
                        if (c0105b4 != null) {
                            h.C((FixedSavingsLayout) c0105b4.f663c);
                        }
                    }
                    C0105b c0105b5 = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b5 != null) {
                        OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) c0105b5.f667g;
                        Long l5 = cashInOrderDetailRsp.payeeAmount;
                        orderResultHeaderModel.c(r0.z(l5 != null ? l5.longValue() : 0L));
                    }
                    Integer num = cashInOrderDetailRsp.orderStatus;
                    Drawable drawableSuccessIcon$default = (num != null && num.intValue() == 1) ? OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, interBankCashInOrderDetailActivity2, 0.0f, 2, null) : (num != null && num.intValue() == 2) ? OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, interBankCashInOrderDetailActivity2, 0.0f, 2, null) : OrderResultHeaderModel.a.processingIcon$default(OrderResultHeaderModel.f31610A, interBankCashInOrderDetailActivity2, 0.0f, 2, null);
                    C0105b c0105b6 = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b6 != null && (orderStatusArrow = ((OrderResultHeaderModel) c0105b6.f667g).getOrderStatusArrow()) != null) {
                        h.s(orderStatusArrow, false);
                    }
                    C0105b c0105b7 = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b7 != null) {
                        ((OrderResultHeaderModel) c0105b7.f667g).k(cashInOrderDetailRsp.orderStatusDesc);
                    }
                    C0105b c0105b8 = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b8 != null) {
                        ((OrderResultHeaderModel) c0105b8.f667g).l(drawableSuccessIcon$default);
                    }
                    C0105b c0105b9 = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b9 != null) {
                        ((OrderResultHeaderModel) c0105b9.f667g).o(interBankCashInOrderDetailActivity2.getString(Ac.h.main_received_merchant, cashInOrderDetailRsp.payerName));
                    }
                    a aVarX = ((d) new d().I(new Sa.d(interBankCashInOrderDetailActivity2, SizeUtils.dp2px(40.0f), interBankCashInOrderDetailActivity2.getColor(b.ppColorDividerLine), SizeUtils.dp2px(0.5f)), true)).x(r.cv_default_bank_logo);
                    Intrinsics.checkNotNullExpressionValue(aVarX, "placeholder(...)");
                    d dVar = (d) aVarX;
                    C0105b c0105b10 = interBankCashInOrderDetailActivity2.f34702e;
                    if (c0105b10 != null) {
                        ((OrderResultHeaderModel) c0105b10.f667g).g(cashInOrderDetailRsp.orderIcon, dVar);
                    }
                    List<OrderContentDTO> list2 = cashInOrderDetailRsp.firstContentDTOList;
                    if (list2 != null && (!list2.isEmpty()) && (list = cashInOrderDetailRsp.firstContentDTOList) != null) {
                        for (final OrderContentDTO orderContentDTO : list) {
                            if (orderContentDTO != null) {
                                SpanUtils spanUtils = new SpanUtils();
                                String str = orderContentDTO.contentValue;
                                if (str == null) {
                                    str = "";
                                }
                                SpanUtils foregroundColor = spanUtils.append(str).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, interBankCashInOrderDetailActivity2));
                                String str2 = orderContentDTO.contentSubValue;
                                if (str2 != null) {
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        Integer num2 = orderContentDTO.functionType;
                                        if (num2 != null && num2.intValue() == 3) {
                                            foregroundColor.append(" ").append(str2).setStrikethrough().setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, interBankCashInOrderDetailActivity2));
                                        } else {
                                            foregroundColor.appendLine().append(str2).setFontSize(12, true).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, interBankCashInOrderDetailActivity2));
                                        }
                                    }
                                }
                                OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(interBankCashInOrderDetailActivity2, orderContentDTO.contentKey, foregroundColor.create());
                                if (TextUtils.isEmpty(orderContentDTO.descValue)) {
                                    orderResultAmountStyle1.b(8);
                                } else {
                                    orderResultAmountStyle1.b(0);
                                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ke.c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            InterBankCashInOrderDetailActivity interBankCashInOrderDetailActivity3 = interBankCashInOrderDetailActivity2;
                                            OrderContentDTO orderContentDTO2 = orderContentDTO;
                                            switch (i7) {
                                                case 0:
                                                    int i11 = InterBankCashInOrderDetailActivity.f34699f;
                                                    O6.c cVar = new O6.c(interBankCashInOrderDetailActivity3);
                                                    cVar.f6598d = orderContentDTO2.descValue;
                                                    cVar.f6600f = r0.H0(k.core_confirm);
                                                    cVar.f6602h = null;
                                                    cVar.g();
                                                    break;
                                                default:
                                                    int i12 = InterBankCashInOrderDetailActivity.f34699f;
                                                    ActivityUtils.startActivity(F.a(interBankCashInOrderDetailActivity3, orderContentDTO2.contentUrl));
                                                    break;
                                            }
                                        }
                                    };
                                    orderResultAmountStyle1.getAmountItemKeyTv().setOnClickListener(onClickListener);
                                    orderResultAmountStyle1.getAmountItemTipsIv().setOnClickListener(onClickListener);
                                }
                                C0105b c0105b11 = interBankCashInOrderDetailActivity2.f34702e;
                                if (c0105b11 != null) {
                                    ((LinearLayout) c0105b11.f664d).addView(orderResultAmountStyle1);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(cashInOrderDetailRsp.orderDesc)) {
                        TextView textView = new TextView(interBankCashInOrderDetailActivity2);
                        textView.setText(cashInOrderDetailRsp.orderDesc);
                        textView.setGravity(17);
                        textView.setPadding(CommonViewExtKt.getDp(20), 0, CommonViewExtKt.getDp(20), 0);
                        textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, interBankCashInOrderDetailActivity2));
                        C0105b c0105b12 = interBankCashInOrderDetailActivity2.f34702e;
                        if (c0105b12 != null) {
                            ((LinearLayout) c0105b12.f664d).addView(textView);
                        }
                    }
                    List<OrderContentDTO> list3 = cashInOrderDetailRsp.secondContentDTOList;
                    if (list3 != null) {
                        if (list3.isEmpty()) {
                            list3 = null;
                        }
                        if (list3 != null) {
                            for (final OrderContentDTO orderContentDTO2 : list3) {
                                C0105b c0105b13 = interBankCashInOrderDetailActivity2.f34702e;
                                LinearLayout linearLayout = c0105b13 != null ? (LinearLayout) c0105b13.f665e : null;
                                if (orderContentDTO2 != null) {
                                    SpanUtils spanUtils2 = new SpanUtils();
                                    String str3 = orderContentDTO2.contentValue;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    SpanUtils foregroundColor2 = spanUtils2.append(str3).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, interBankCashInOrderDetailActivity2));
                                    String str4 = orderContentDTO2.contentSubValue;
                                    if (str4 != null) {
                                        if (TextUtils.isEmpty(str4)) {
                                            str4 = null;
                                        }
                                        if (str4 != null) {
                                            Integer num3 = orderContentDTO2.functionType;
                                            if (num3 != null && num3.intValue() == 3) {
                                                foregroundColor2.append(" ").append(str4).setStrikethrough().setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, interBankCashInOrderDetailActivity2));
                                            } else {
                                                foregroundColor2.appendLine().append(str4).setFontSize(12, true).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, interBankCashInOrderDetailActivity2));
                                            }
                                        }
                                    }
                                    Integer num4 = orderContentDTO2.functionType;
                                    OrderResultItemModel orderResultItemModel = new OrderResultItemModel(interBankCashInOrderDetailActivity2, (num4 != null && num4.intValue() == 1) ? 1004 : (num4 != null && num4.intValue() == 2) ? ErrorCodes.MALFORMED_URL_EXCEPTION : 1002, orderContentDTO2.contentKey, foregroundColor2.create());
                                    Integer num5 = orderContentDTO2.functionType;
                                    if (num5 != null && num5.intValue() == 1) {
                                        orderResultItemModel.setOnClickListener(new View.OnClickListener() { // from class: ke.c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                InterBankCashInOrderDetailActivity interBankCashInOrderDetailActivity3 = interBankCashInOrderDetailActivity2;
                                                OrderContentDTO orderContentDTO3 = orderContentDTO2;
                                                switch (i10) {
                                                    case 0:
                                                        int i11 = InterBankCashInOrderDetailActivity.f34699f;
                                                        O6.c cVar = new O6.c(interBankCashInOrderDetailActivity3);
                                                        cVar.f6598d = orderContentDTO3.descValue;
                                                        cVar.f6600f = r0.H0(k.core_confirm);
                                                        cVar.f6602h = null;
                                                        cVar.g();
                                                        break;
                                                    default:
                                                        int i12 = InterBankCashInOrderDetailActivity.f34699f;
                                                        ActivityUtils.startActivity(F.a(interBankCashInOrderDetailActivity3, orderContentDTO3.contentUrl));
                                                        break;
                                                }
                                            }
                                        });
                                    } else if (num5 != null && num5.intValue() == 2) {
                                        orderResultItemModel.setOnCopyListener(new com.transsnet.adsdk.b(10, interBankCashInOrderDetailActivity2, orderContentDTO2));
                                    }
                                    if (linearLayout != null) {
                                        linearLayout.addView(orderResultItemModel);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                String respMsg = commonBeanResult.getRespMsg();
                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                int i11 = InterBankCashInOrderDetailActivity.f34699f;
                c cVar = new c(interBankCashInOrderDetailActivity2);
                cVar.e(k.core_title_error_info);
                cVar.f6598d = respMsg;
                cVar.d(k.core_try_again, new ViewOnClickListenerC1649v(interBankCashInOrderDetailActivity2, 25));
                cVar.g();
            }
        } else if (it instanceof m) {
            interBankCashInOrderDetailActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            interBankCashInOrderDetailActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj) {
        MinorGuardianManagerResp minorGuardianManagerResp;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        MinorGuardianManagerActivity minorGuardianManagerActivity = (MinorGuardianManagerActivity) this.f38430b;
        if (z3) {
            minorGuardianManagerActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof p;
            MinorGuardianManagerActivity minorGuardianManagerActivity2 = (MinorGuardianManagerActivity) this.f38431c;
            if (z8) {
                minorGuardianManagerActivity.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                if (commonBeanResult.isSuccess() && (minorGuardianManagerResp = (MinorGuardianManagerResp) commonBeanResult.data) != null) {
                    Bc.l lVar = minorGuardianManagerActivity2.f34775c;
                    if (lVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((IconicsTextView) ((C0106c) lVar.f755c).t).setVisibility(8);
                    Bc.l lVar2 = minorGuardianManagerActivity2.f34775c;
                    if (lVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((TextView) ((C0106c) lVar2.f755c).f674g).setText(minorGuardianManagerResp.firstName + " " + minorGuardianManagerResp.lastName);
                    Bc.l lVar3 = minorGuardianManagerActivity2.f34775c;
                    if (lVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((C0106c) lVar3.f755c).f669b.setText(minorGuardianManagerResp.phone);
                    Bc.l lVar4 = minorGuardianManagerActivity2.f34775c;
                    if (lVar4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((Group) ((C0106c) lVar4.f755c).f671d).setVisibility(0);
                    Bc.l lVar5 = minorGuardianManagerActivity2.f34775c;
                    if (lVar5 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((TextView) ((C0106c) lVar5.f755c).f673f).setText("Valid Until");
                    Bc.l lVar6 = minorGuardianManagerActivity2.f34775c;
                    if (lVar6 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((TextView) ((C0106c) lVar6.f755c).f672e).setText(TimeUtils.millis2String(minorGuardianManagerResp.validDate, new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)));
                }
            } else if (it instanceof m) {
                minorGuardianManagerActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                minorGuardianManagerActivity.showLoadingDialog(false, true);
                String str = ((n) it).f27358a;
                if (!TextUtils.isEmpty(str)) {
                    h.x(minorGuardianManagerActivity2, str);
                }
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj) {
        T t;
        C0107d c0107d;
        C0107d c0107d2;
        C0107d c0107d3;
        C0107d c0107d4;
        ImageView orderStatusArrow;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        PalmSafeDetailActivity palmSafeDetailActivity = (PalmSafeDetailActivity) this.f38430b;
        if (z3) {
            palmSafeDetailActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof p;
            PalmSafeDetailActivity palmSafeDetailActivity2 = (PalmSafeDetailActivity) this.f38431c;
            if (z8) {
                palmSafeDetailActivity.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                if (commonBeanResult.isSuccess() && commonBeanResult.data != 0) {
                    int i7 = PalmSafeDetailActivity.f34776f;
                    if (i0.W(palmSafeDetailActivity2) && (t = commonBeanResult.data) != 0) {
                        palmSafeDetailActivity2.f34778d = commonBeanResult;
                        PalmSafeDetail palmSafeDetail = (PalmSafeDetail) t;
                        if (TextUtils.isEmpty(palmSafeDetail.compensationIconUrl)) {
                            C0107d c0107d5 = palmSafeDetailActivity2.f34779e;
                            if (c0107d5 != null) {
                                ((OrderResultHeaderModel) c0107d5.f683e).d(r.cv_bill_default_icon);
                            }
                        } else {
                            C0107d c0107d6 = palmSafeDetailActivity2.f34779e;
                            if (c0107d6 != null) {
                                ((OrderResultHeaderModel) c0107d6.f683e).f(palmSafeDetail.compensationIconUrl);
                            }
                        }
                        C0107d c0107d7 = palmSafeDetailActivity2.f34779e;
                        if (c0107d7 != null) {
                            ((OrderResultHeaderModel) c0107d7.f683e).o(palmSafeDetail.title);
                        }
                        C0107d c0107d8 = palmSafeDetailActivity2.f34779e;
                        if (c0107d8 != null) {
                            ((OrderResultHeaderModel) c0107d8.f683e).k(palmSafeDetail.orderStatusDesc);
                        }
                        C0107d c0107d9 = palmSafeDetailActivity2.f34779e;
                        if (c0107d9 != null) {
                            ((OrderResultHeaderModel) c0107d9.f683e).c(r0.B(palmSafeDetail.amount, false));
                        }
                        C0107d c0107d10 = palmSafeDetailActivity2.f34779e;
                        if (c0107d10 != null && (orderStatusArrow = ((OrderResultHeaderModel) c0107d10.f683e).getOrderStatusArrow()) != null) {
                            orderStatusArrow.setVisibility(8);
                        }
                        int i10 = palmSafeDetail.orderStatus;
                        if (i10 == 0) {
                            c0107d = palmSafeDetailActivity2.f34779e;
                            if (c0107d != null) {
                                ((OrderResultHeaderModel) c0107d.f683e).l(OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                            }
                            if (!TextUtils.isEmpty(palmSafeDetail.errorMessage) && (c0107d2 = palmSafeDetailActivity2.f34779e) != null) {
                                ((OrderResultHeaderModel) c0107d2.f683e).m(palmSafeDetail.errorMessage);
                            }
                        } else if (i10 == 1) {
                            c0107d3 = palmSafeDetailActivity2.f34779e;
                            if (c0107d3 != null) {
                                ((OrderResultHeaderModel) c0107d3.f683e).l(OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                            }
                        } else if (i10 == 3) {
                            c0107d4 = palmSafeDetailActivity2.f34779e;
                            if (c0107d4 != null) {
                                ((OrderResultHeaderModel) c0107d4.f683e).l(OrderResultHeaderModel.a.processingIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                            }
                        } else if (i10 == 21) {
                            C0107d c0107d11 = palmSafeDetailActivity2.f34779e;
                            if (c0107d11 != null) {
                                ((OrderResultHeaderModel) c0107d11.f683e).l(OrderResultHeaderModel.a.bookSuccessIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                            }
                        } else if (i10 != 22) {
                            switch (i10) {
                                case 5:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                    c0107d = palmSafeDetailActivity2.f34779e;
                                    if (c0107d != null) {
                                        ((OrderResultHeaderModel) c0107d.f683e).l(OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                                    }
                                    if (!TextUtils.isEmpty(palmSafeDetail.errorMessage)) {
                                        ((OrderResultHeaderModel) c0107d2.f683e).m(palmSafeDetail.errorMessage);
                                    }
                                    break;
                                case 6:
                                    c0107d4 = palmSafeDetailActivity2.f34779e;
                                    if (c0107d4 != null) {
                                        ((OrderResultHeaderModel) c0107d4.f683e).l(OrderResultHeaderModel.a.processingIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                                    }
                                    break;
                                case 7:
                                    c0107d3 = palmSafeDetailActivity2.f34779e;
                                    if (c0107d3 != null) {
                                        ((OrderResultHeaderModel) c0107d3.f683e).l(OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                                    }
                                    break;
                                default:
                                    C0107d c0107d12 = palmSafeDetailActivity2.f34779e;
                                    if (c0107d12 != null) {
                                        ((OrderResultHeaderModel) c0107d12.f683e).l(OrderResultHeaderModel.a.closeIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                                    }
                                    break;
                            }
                        } else {
                            c0107d = palmSafeDetailActivity2.f34779e;
                            if (c0107d != null) {
                                ((OrderResultHeaderModel) c0107d.f683e).l(OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, palmSafeDetailActivity2, 0.0f, 2, null));
                            }
                            if (!TextUtils.isEmpty(palmSafeDetail.errorMessage)) {
                                ((OrderResultHeaderModel) c0107d2.f683e).m(palmSafeDetail.errorMessage);
                            }
                        }
                        C0107d c0107d13 = palmSafeDetailActivity2.f34779e;
                        if (c0107d13 != null) {
                            ((LinearLayout) c0107d13.f681c).addView(new OrderResultItemModel(palmSafeDetailActivity2, palmSafeDetailActivity2.getResources().getString(Ac.h.main_transaction_type), palmSafeDetail.transType));
                        }
                        C0107d c0107d14 = palmSafeDetailActivity2.f34779e;
                        if (c0107d14 != null) {
                            ((LinearLayout) c0107d14.f681c).addView(new OrderResultItemModel(palmSafeDetailActivity2, palmSafeDetailActivity2.getResources().getString(k.core_receive_account), palmSafeDetail.payeeAccountType));
                        }
                        C0107d c0107d15 = palmSafeDetailActivity2.f34779e;
                        if (c0107d15 != null) {
                            ((LinearLayout) c0107d15.f681c).addView(new OrderResultItemModel(palmSafeDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, k.core_reference_no_2, palmSafeDetail.orderNo));
                        }
                        C0107d c0107d16 = palmSafeDetailActivity2.f34779e;
                        if (c0107d16 != null) {
                            ((LinearLayout) c0107d16.f681c).addView(new OrderResultItemModel(palmSafeDetailActivity2, k.core_application_order, palmSafeDetail.workNo));
                        }
                        C0107d c0107d17 = palmSafeDetailActivity2.f34779e;
                        if (c0107d17 != null) {
                            ((LinearLayout) c0107d17.f681c).addView(new OrderResultItemModel(palmSafeDetailActivity2, k.core_compensation_time, r0.Q(palmSafeDetail.gmtCreated)));
                        }
                        C0107d c0107d18 = palmSafeDetailActivity2.f34779e;
                        if (c0107d18 != null) {
                            LinearLayout linearLayout = (LinearLayout) c0107d18.f681c;
                            OrderResultItemModel orderResultItemModel = new OrderResultItemModel(palmSafeDetailActivity2, 1004, k.core_application_form, palmSafeDetailActivity2.getResources().getString(Ac.h.main_view));
                            orderResultItemModel.setOnClickListener(new p173ld.o(palmSafeDetailActivity2, 12));
                            linearLayout.addView(orderResultItemModel);
                        }
                    }
                }
            } else if (it instanceof m) {
                palmSafeDetailActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                palmSafeDetailActivity.showLoadingDialog(false, true);
                h.x(palmSafeDetailActivity2, ((n) it).f27358a);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj) {
        T t;
        C0105b c0105b;
        C0105b c0105b2;
        ImageView orderStatusArrow;
        C0105b c0105b3;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        PayCodeOrderDetailActivity payCodeOrderDetailActivity = (PayCodeOrderDetailActivity) this.f38430b;
        if (z3) {
            payCodeOrderDetailActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            payCodeOrderDetailActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
            boolean zIsSuccess = commonBeanResult.isSuccess();
            PayCodeOrderDetailActivity payCodeOrderDetailActivity2 = (PayCodeOrderDetailActivity) this.f38431c;
            if (zIsSuccess) {
                int i7 = PayCodeOrderDetailActivity.f34787g;
                if (i0.W(payCodeOrderDetailActivity2) && (t = commonBeanResult.data) != 0) {
                    PayCodeOrderDetailBean payCodeOrderDetailBean = (PayCodeOrderDetailBean) t;
                    payCodeOrderDetailActivity2.f34790e = payCodeOrderDetailBean;
                    if (TextUtils.isEmpty(payCodeOrderDetailBean.merchantIcon)) {
                        C0105b c0105b4 = payCodeOrderDetailActivity2.f34791f;
                        if (c0105b4 != null) {
                            ((OrderResultHeaderModel) c0105b4.f666f).e(Ea.a.c(TransType.TRANS_TYPE_MERCHANT_PAYMENT, (14 & 2) != 0 ? null : -1, null, null));
                        }
                    } else {
                        C0105b c0105b5 = payCodeOrderDetailActivity2.f34791f;
                        if (c0105b5 != null) {
                            ((OrderResultHeaderModel) c0105b5.f666f).h(payCodeOrderDetailBean.merchantIcon);
                        }
                    }
                    C0105b c0105b6 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b6 != null) {
                        OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) c0105b6.f666f;
                        String str = payCodeOrderDetailBean.payeeMerchantName;
                        if (str == null) {
                            str = "";
                        }
                        orderResultHeaderModel.o(str);
                    }
                    C0105b c0105b7 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b7 != null) {
                        ((OrderResultHeaderModel) c0105b7.f666f).k(payCodeOrderDetailBean.orderStatusDesc);
                    }
                    C0105b c0105b8 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b8 != null) {
                        OrderResultHeaderModel orderResultHeaderModel2 = (OrderResultHeaderModel) c0105b8.f666f;
                        Long l5 = payCodeOrderDetailBean.payAmount;
                        orderResultHeaderModel2.c(r0.B(l5 != null ? l5.longValue() : 0L, false));
                    }
                    C0105b c0105b9 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b9 != null) {
                        ((OrderResultHeaderModel) c0105b9.f666f).l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, payCodeOrderDetailActivity2, payCodeOrderDetailBean.orderStatusDesc, 0.0f, 4, null));
                    }
                    if (Intrinsics.c(payCodeOrderDetailBean.payStatus, 2) && !TextUtils.isEmpty(payCodeOrderDetailBean.errorMessage) && (c0105b3 = payCodeOrderDetailActivity2.f34791f) != null) {
                        ((OrderResultHeaderModel) c0105b3.f666f).m(payCodeOrderDetailBean.errorMessage + (TextUtils.isEmpty(payCodeOrderDetailBean.errorCode) ? "" : q0.k("(", payCodeOrderDetailBean.errorCode, ")")) + " ");
                    }
                    C0105b c0105b10 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b10 != null && (orderStatusArrow = ((OrderResultHeaderModel) c0105b10.f666f).getOrderStatusArrow()) != null) {
                        orderStatusArrow.setVisibility(8);
                    }
                    C0105b c0105b11 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b11 != null) {
                        LinearLayout linearLayout = (LinearLayout) c0105b11.f663c;
                        int i10 = v.cv_order_amount;
                        Long l6 = payCodeOrderDetailBean.amount;
                        linearLayout.addView(new OrderResultAmountStyle1(payCodeOrderDetailActivity2, i10, r0.B(l6 != null ? l6.longValue() : 0L, false)));
                    }
                    Long l8 = payCodeOrderDetailBean.payFee;
                    long jLongValue = l8 != null ? l8.longValue() : 0L;
                    Long lValueOf = Long.valueOf(jLongValue);
                    if (jLongValue <= 0) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(payCodeOrderDetailActivity2, v.cv_fee, r0.B(lValueOf.longValue(), false));
                        C0105b c0105b12 = payCodeOrderDetailActivity2.f34791f;
                        if (c0105b12 != null) {
                            ((LinearLayout) c0105b12.f663c).addView(orderResultAmountStyle1);
                        }
                    }
                    Long l10 = payCodeOrderDetailBean.loyaltyPoint;
                    if (l10 != null) {
                        if (l10.longValue() <= 0) {
                            l10 = null;
                        }
                        if (l10 != null) {
                            String strI = u.i(l10.longValue(), "- ");
                            C0105b c0105b13 = payCodeOrderDetailActivity2.f34791f;
                            if (c0105b13 != null) {
                                ((LinearLayout) c0105b13.f663c).addView(new OrderResultAmountStyle1(payCodeOrderDetailActivity2, v.cv_palm_points_used, strI));
                            }
                        }
                    }
                    Long l11 = payCodeOrderDetailBean.discountAmount;
                    if (l11 != null) {
                        if (l11.longValue() <= 0) {
                            l11 = null;
                        }
                        if (l11 != null) {
                            String strO = G.o("- ", r0.B(l11.longValue(), true));
                            C0105b c0105b14 = payCodeOrderDetailActivity2.f34791f;
                            if (c0105b14 != null) {
                                ((LinearLayout) c0105b14.f663c).addView(new OrderResultAmountStyle1(payCodeOrderDetailActivity2, v.cv_discount, strO));
                            }
                        }
                    }
                    Long l12 = payCodeOrderDetailBean.paymentMethodDiscount;
                    if (l12 != null) {
                        if (l12.longValue() <= 0) {
                            l12 = null;
                        }
                        if (l12 != null) {
                            String strO2 = G.o("- ", r0.B(l12.longValue(), true));
                            C0105b c0105b15 = payCodeOrderDetailActivity2.f34791f;
                            if (c0105b15 != null) {
                                ((LinearLayout) c0105b15.f663c).addView(new OrderResultAmountStyle1(payCodeOrderDetailActivity2, k.core_flexi_discount, strO2));
                            }
                        }
                    }
                    Long l13 = payCodeOrderDetailBean.couponAmount;
                    if (l13 != null) {
                        if (l13.longValue() <= 0) {
                            l13 = null;
                        }
                        if (l13 != null) {
                            String strO3 = G.o("- ", r0.B(l13.longValue(), true));
                            C0105b c0105b16 = payCodeOrderDetailActivity2.f34791f;
                            if (c0105b16 != null) {
                                ((LinearLayout) c0105b16.f663c).addView(new OrderResultAmountStyle1(payCodeOrderDetailActivity2, v.cv_coupon, strO3));
                            }
                        }
                    }
                    C0105b c0105b17 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b17 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) c0105b17.f663c;
                        int i11 = v.cv_payment_amount;
                        Long l14 = payCodeOrderDetailBean.payAmount;
                        linearLayout2.addView(new OrderResultAmountStyle2(payCodeOrderDetailActivity2, i11, r0.B(l14 != null ? l14.longValue() : 0L, false)));
                    }
                    Long l15 = payCodeOrderDetailBean.returnPoint;
                    if (l15 != null) {
                        if ((l15.longValue() > 0 ? l15 : null) != null) {
                            Long l16 = payCodeOrderDetailBean.returnPoint;
                            String strI2 = u.i(l16 != null ? l16.longValue() : 0L, "+ ");
                            C0105b c0105b18 = payCodeOrderDetailActivity2.f34791f;
                            if (c0105b18 != null) {
                                ((LinearLayout) c0105b18.f663c).addView(new OrderResultAmountStyle2(payCodeOrderDetailActivity2, v.cv_all_point_earned, strI2));
                            }
                        }
                    }
                    C0105b c0105b19 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b19 != null) {
                        ((LinearLayout) c0105b19.f664d).addView(new OrderResultItemModel(payCodeOrderDetailActivity2, k.core_recipient_name, payCodeOrderDetailBean.payeeMerchantName));
                    }
                    if (!TextUtils.isEmpty(payCodeOrderDetailBean.goodsName) && (c0105b2 = payCodeOrderDetailActivity2.f34791f) != null) {
                        ((LinearLayout) c0105b2.f664d).addView(new OrderResultItemModel(payCodeOrderDetailActivity2, payCodeOrderDetailActivity2.getString(Ac.h.main_goods_name), payCodeOrderDetailBean.goodsName));
                    }
                    String string = payCodeOrderDetailActivity2.getString(k.core_merchant_payment);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String str2 = payCodeOrderDetailBean.subTransType;
                    SubTransType subTransType = SubTransType.INSTANCE;
                    if (Intrinsics.c(str2, subTransType.getSUB_TRANS_TYPE_PAY_CODE())) {
                        string = payCodeOrderDetailActivity2.getString(k.core_palmpay_code);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else if (Intrinsics.c(payCodeOrderDetailBean.subTransType, subTransType.getSUB_TRANS_TYPE_MERCHANT_PAY_CODE())) {
                        string = payCodeOrderDetailActivity2.getString(k.core_pay_by_wallet);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    }
                    C0105b c0105b20 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b20 != null) {
                        ((LinearLayout) c0105b20.f664d).addView(new OrderResultItemModel(payCodeOrderDetailActivity2, k.core_receipt_transaction_type, string));
                    }
                    C0105b c0105b21 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b21 != null) {
                        ((LinearLayout) c0105b21.f664d).addView(new OrderResultItemModel(payCodeOrderDetailActivity2, payCodeOrderDetailActivity2.getString(k.core_receipt_method), payCodeOrderDetailBean.payTypeDesc));
                    }
                    C0105b c0105b22 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b22 != null) {
                        ((LinearLayout) c0105b22.f664d).addView(new OrderResultItemModel(payCodeOrderDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, k.core_reference_no_2, payCodeOrderDetailActivity2.f34788c));
                    }
                    if (Intrinsics.c(payCodeOrderDetailBean.payStatus, 1)) {
                        Long l17 = payCodeOrderDetailBean.createTime;
                        String strQ = r0.Q(l17 != null ? l17.longValue() : 0L);
                        Long l18 = payCodeOrderDetailBean.updateTime;
                        if (!Intrinsics.c(strQ, r0.Q(l18 != null ? l18.longValue() : 0L)) && (c0105b = payCodeOrderDetailActivity2.f34791f) != null) {
                            LinearLayout linearLayout3 = (LinearLayout) c0105b.f664d;
                            int i12 = k.core_create_time;
                            Long l19 = payCodeOrderDetailBean.createTime;
                            linearLayout3.addView(new OrderResultItemModel(payCodeOrderDetailActivity2, i12, r0.Q(l19 != null ? l19.longValue() : 0L)));
                        }
                        C0105b c0105b23 = payCodeOrderDetailActivity2.f34791f;
                        if (c0105b23 != null) {
                            LinearLayout linearLayout4 = (LinearLayout) c0105b23.f664d;
                            int i13 = k.core_completion_time;
                            Long l20 = payCodeOrderDetailBean.updateTime;
                            linearLayout4.addView(new OrderResultItemModel(payCodeOrderDetailActivity2, i13, r0.Q(l20 != null ? l20.longValue() : 0L)));
                        }
                    } else {
                        C0105b c0105b24 = payCodeOrderDetailActivity2.f34791f;
                        if (c0105b24 != null) {
                            LinearLayout linearLayout5 = (LinearLayout) c0105b24.f664d;
                            int i14 = k.core_create_time;
                            Long l21 = payCodeOrderDetailBean.createTime;
                            linearLayout5.addView(new OrderResultItemModel(payCodeOrderDetailActivity2, i14, r0.Q(l21 != null ? l21.longValue() : 0L)));
                        }
                    }
                    C0105b c0105b25 = payCodeOrderDetailActivity2.f34791f;
                    if (c0105b25 != null) {
                        ((OrderResultViewReceiptModel) c0105b25.f667g).setVisibility(8);
                    }
                }
            } else {
                String respMsg = commonBeanResult.getRespMsg();
                String str3 = respMsg != null ? respMsg : "";
                int i15 = PayCodeOrderDetailActivity.f34787g;
                c cVar = new c(payCodeOrderDetailActivity2);
                cVar.e(k.core_title_error_info);
                cVar.f6598d = str3;
                cVar.d(k.core_try_again, new p173ld.o(payCodeOrderDetailActivity2, 13));
                cVar.g();
            }
        } else if (it instanceof m) {
            payCodeOrderDetailActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            payCodeOrderDetailActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj) {
        T t;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        CompensationDetailActivity compensationDetailActivity = (CompensationDetailActivity) this.f38430b;
        if (z3) {
            compensationDetailActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            compensationDetailActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
            if (!commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
                ToastUtils.showShort(commonBeanResult.getRespMsg(), new Object[0]);
            } else {
                CompensationDetailResp compensationDetailResp = (CompensationDetailResp) t;
                compensationDetailResp.getOrderStatusInfo();
                int i7 = CompensationDetailActivity.f33164o;
                CompensationDetailActivity compensationDetailActivity2 = (CompensationDetailActivity) this.f38431c;
                compensationDetailActivity2.f33171j = compensationDetailResp;
                p355xf.t tVar = compensationDetailActivity2.f33166d;
                Object value = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((LinearLayout) value).removeAllViews();
                p355xf.t tVar2 = compensationDetailActivity2.f33167e;
                Object value2 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((LinearLayout) value2).removeAllViews();
                compensationDetailActivity2.n().l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, compensationDetailActivity2, compensationDetailResp.getOrderStatusDesc(), 0.0f, 4, null));
                compensationDetailActivity2.n().k(compensationDetailResp.getOrderStatusDesc());
                Object value3 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                h.s((LinearLayout) value3, true);
                CompensationDetailResp compensationDetailResp2 = compensationDetailActivity2.f33171j;
                if (compensationDetailResp2 != null) {
                    compensationDetailActivity2.n().o(compensationDetailActivity2.getString(p159kd.h.sm_bill_detail_transfer_from_s_short, "PalmPay"));
                    compensationDetailActivity2.n().e(Ea.a.c(TransType.TRANS_TYPE_COMPENSATION, (14 & 2) != 0 ? null : -1, null, null));
                    OrderResultHeaderModel orderResultHeaderModelN = compensationDetailActivity2.n();
                    Long payAmount = compensationDetailResp2.getPayAmount();
                    orderResultHeaderModelN.c(r0.B(payAmount != null ? payAmount.longValue() : 0L, false));
                    if (!TextUtils.isEmpty(compensationDetailResp2.getPayeeMerchantName())) {
                        CompensationDetailActivity.m(compensationDetailActivity2, compensationDetailActivity2.getString(p159kd.h.sm_receive_shop_name), compensationDetailResp2.getPayeeMerchantName());
                    }
                    Long gmtCreated = compensationDetailResp2.getGmtCreated();
                    if ((gmtCreated != null ? gmtCreated.longValue() : 0L) > 0) {
                        String string = compensationDetailActivity2.getString(k.core_completion_time);
                        Long gmtCreated2 = compensationDetailResp2.getGmtCreated();
                        CompensationDetailActivity.m(compensationDetailActivity2, string, r0.Q(gmtCreated2 != null ? gmtCreated2.longValue() : 0L));
                    }
                    if (!TextUtils.isEmpty(compensationDetailResp2.getOrderNo())) {
                        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(compensationDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, compensationDetailActivity2.getString(p159kd.h.sm_dispute_id), compensationDetailResp2.getOrderNo());
                        Object value4 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((LinearLayout) value4).addView(orderResultItemModel);
                    }
                    if (!TextUtils.isEmpty(compensationDetailResp2.getPaymentTypeDesc())) {
                        CompensationDetailActivity.m(compensationDetailActivity2, compensationDetailActivity2.getString(k.core_payment_type), compensationDetailResp2.getPaymentTypeDesc());
                    }
                    if (!TextUtils.isEmpty(compensationDetailResp2.getReceiveMethod())) {
                        CompensationDetailActivity.m(compensationDetailActivity2, compensationDetailActivity2.getString(p159kd.h.sm_receive_method), compensationDetailResp2.getReceiveMethod());
                    }
                    if (!TextUtils.isEmpty(compensationDetailResp2.getPayerName())) {
                        CompensationDetailActivity.m(compensationDetailActivity2, compensationDetailActivity2.getString(p159kd.h.sm_payer_name), compensationDetailResp2.getPayerName());
                    }
                    if (!TextUtils.isEmpty(compensationDetailResp2.getPayerCardNo())) {
                        OrderResultItemModel orderResultItemModelM = CompensationDetailActivity.m(compensationDetailActivity2, compensationDetailActivity2.getString(p159kd.h.sm_payer_account_no), r0.G(compensationDetailResp2.getPayerCardNo()));
                        if (!TextUtils.isEmpty(compensationDetailResp2.getPayerBankUrl())) {
                            orderResultItemModelM.l(compensationDetailResp2.getPayerBankUrl());
                        }
                    }
                }
            }
        } else if (it instanceof m) {
            compensationDetailActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            compensationDetailActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object f(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        PastShopListActivity pastShopListActivity = (PastShopListActivity) this.f38430b;
        if (z3) {
            pastShopListActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            pastShopListActivity.showLoadingDialog(false, true);
            ParseInstalmentsQrcodeRsp parseInstalmentsQrcodeRsp = (ParseInstalmentsQrcodeRsp) ((p) it).f27360a;
            boolean zIsSuccess = parseInstalmentsQrcodeRsp.isSuccess();
            PastShopListActivity pastShopListActivity2 = (PastShopListActivity) this.f38431c;
            if (zIsSuccess) {
                ParseInstalmentsQrcodeRsp.DataBean dataBean = parseInstalmentsQrcodeRsp.data;
                if (dataBean != null) {
                    if (dataBean.isMine) {
                        h.x(pastShopListActivity2, pastShopListActivity2.getString(g.cs_you_cant_pay_to));
                    } else {
                        String str = "/credit_score/input_amount";
                        if (dataBean.type == 1) {
                            ARouter.getInstance().build("/credit_score/input_amount").withString("sn_no", dataBean.snNo).navigation();
                        } else {
                            int i7 = dataBean.soNoType;
                            if (i7 == BindStatusEnum.CAN_PARTICIPATE.getStatusCode() || i7 == BindStatusEnum.CAN_NOT_PARTICIPATE.getStatusCode()) {
                                ARouter aRouter = ARouter.getInstance();
                                String str2 = dataBean.transType;
                                int i10 = PastShopListActivity.f28701j;
                                if (Intrinsics.c(str2, TransType.TRANS_TYPE_PAY_SHOP)) {
                                    str = "/sm/pay_shop_input_amount";
                                } else if (Intrinsics.c(str2, TransType.TRANS_TYPE_WITHDRAW_TO_AGENT)) {
                                    str = "/sm/withdraw_input_amount";
                                }
                                aRouter.build(str).withString("sn_no", dataBean.snNo).withString("core_order_source_type", "PAYSHOP").navigation();
                            } else if (i7 == BindStatusEnum.UNBOUND.getStatusCode()) {
                                c cVar = new c(pastShopListActivity2);
                                cVar.f6598d = pastShopListActivity2.getString(g.cs_merchant_no_activated, dataBean.snNo);
                                cVar.f6601g = pastShopListActivity2.getString(g.cs_no_type_it_wrong);
                                cVar.f6603i = null;
                                String string = pastShopListActivity2.getString(g.cs_yes_activate);
                                ViewOnClickListenerC2018p viewOnClickListenerC2018p = new ViewOnClickListenerC2018p(dataBean);
                                cVar.f6600f = string;
                                cVar.f6602h = viewOnClickListenerC2018p;
                                cVar.g();
                            }
                        }
                    }
                }
            } else {
                h.x(pastShopListActivity2, parseInstalmentsQrcodeRsp.getRespMsg());
            }
        } else if (it instanceof m) {
            pastShopListActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            pastShopListActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
            ((n) it).getClass();
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj) {
        T t;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = (PayShopTradeRecordDetailActivity) this.f38430b;
        if (z3) {
            payShopTradeRecordDetailActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            payShopTradeRecordDetailActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
            if (!commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
                ToastUtils.showShort(commonBeanResult.getRespMsg(), new Object[0]);
            } else {
                QueryOrderDetailRsp queryOrderDetailRsp = (QueryOrderDetailRsp) t;
                int i7 = PayShopTradeRecordDetailActivity.f28752w;
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity2 = (PayShopTradeRecordDetailActivity) this.f38431c;
                payShopTradeRecordDetailActivity2.f28759v = queryOrderDetailRsp;
                p355xf.t tVar = payShopTradeRecordDetailActivity2.f28755i;
                Object value = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((LinearLayout) value).removeAllViews();
                payShopTradeRecordDetailActivity2.p().removeAllViews();
                payShopTradeRecordDetailActivity2.q().l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, payShopTradeRecordDetailActivity2, queryOrderDetailRsp.orderStatusDesc, 0.0f, 4, null));
                payShopTradeRecordDetailActivity2.q().k(queryOrderDetailRsp.orderStatusDesc);
                h.s(payShopTradeRecordDetailActivity2.q().getOrderStatusArrow(), false);
                if (TextUtils.equals(BaseApplication.get().getUser().getMemberId(), queryOrderDetailRsp.payerMemberId)) {
                    h.s(payShopTradeRecordDetailActivity2.p(), true);
                    QueryOrderDetailRsp queryOrderDetailRsp2 = payShopTradeRecordDetailActivity2.f28759v;
                    if (queryOrderDetailRsp2 != null) {
                        if (TextUtils.isEmpty(queryOrderDetailRsp2.payeeName)) {
                            payShopTradeRecordDetailActivity2.q().o(payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_transfer_to_s_short, r0.w0(queryOrderDetailRsp2.payeeMobileNo)));
                        } else {
                            payShopTradeRecordDetailActivity2.q().o(payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_transfer_to_s_short, queryOrderDetailRsp2.payeeName));
                        }
                        payShopTradeRecordDetailActivity2.q().d(r.cv_bill_payshop);
                        OrderResultHeaderModel orderResultHeaderModelQ = payShopTradeRecordDetailActivity2.q();
                        Long l5 = queryOrderDetailRsp2.amount;
                        orderResultHeaderModelQ.c(r0.B(l5 != null ? l5.longValue() : 0L, false));
                        String string = payShopTradeRecordDetailActivity2.getString(g.cs_transfer_amount);
                        Long l6 = queryOrderDetailRsp2.payAmount;
                        PayShopTradeRecordDetailActivity.n(payShopTradeRecordDetailActivity2, string, r0.B(l6 != null ? l6.longValue() : 0L, true), 12);
                        String string2 = payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_fee);
                        Long l8 = queryOrderDetailRsp2.payFee;
                        PayShopTradeRecordDetailActivity.n(payShopTradeRecordDetailActivity2, string2, r0.B(l8 != null ? l8.longValue() : 0L, true), 8);
                        Long l10 = queryOrderDetailRsp2.deductionPointAmount;
                        if ((l10 != null ? l10.longValue() : 0L) > 0) {
                            String string3 = payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_used_points);
                            Long l11 = queryOrderDetailRsp2.deductionPointAmount;
                            PayShopTradeRecordDetailActivity.n(payShopTradeRecordDetailActivity2, string3, u.i(l11 != null ? l11.longValue() : 0L, "-"), 12);
                        }
                        Long l12 = queryOrderDetailRsp2.returnPoint;
                        if ((l12 != null ? l12.longValue() : 0L) > 0) {
                            String string4 = payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_earned_points);
                            Long l13 = queryOrderDetailRsp2.returnPoint;
                            PayShopTradeRecordDetailActivity.n(payShopTradeRecordDetailActivity2, string4, u.i(l13 != null ? l13.longValue() : 0L, "+"), 12);
                        }
                        Long l14 = queryOrderDetailRsp2.cashEarned;
                        if ((l14 != null ? l14.longValue() : 0L) > 0) {
                            String string5 = payShopTradeRecordDetailActivity2.getString(k.core_cash_earned);
                            Long l15 = queryOrderDetailRsp2.cashEarned;
                            PayShopTradeRecordDetailActivity.n(payShopTradeRecordDetailActivity2, string5, r0.B(l15 != null ? l15.longValue() : 0L, false), 12);
                        }
                        Long l16 = queryOrderDetailRsp2.couponAmount;
                        if ((l16 != null ? l16.longValue() : 0L) > 0) {
                            String string6 = payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_coupon);
                            Long l17 = queryOrderDetailRsp2.couponAmount;
                            PayShopTradeRecordDetailActivity.n(payShopTradeRecordDetailActivity2, string6, r0.I0(l17 != null ? l17.longValue() : 0L), 12);
                        }
                        Long l18 = queryOrderDetailRsp2.discountAmount;
                        if ((l18 != null ? l18.longValue() : 0L) > 0) {
                            String string7 = payShopTradeRecordDetailActivity2.getString(k.core_discount);
                            Long l19 = queryOrderDetailRsp2.discountAmount;
                            PayShopTradeRecordDetailActivity.n(payShopTradeRecordDetailActivity2, string7, r0.I0(l19 != null ? l19.longValue() : 0L), 12);
                        }
                        String string8 = payShopTradeRecordDetailActivity2.getString(g.cs_payment_amount);
                        Long l20 = queryOrderDetailRsp2.payAmount;
                        payShopTradeRecordDetailActivity2.p().addView(new OrderResultAmountStyle2(payShopTradeRecordDetailActivity2, string8, r0.B(l20 != null ? l20.longValue() : 0L, true)));
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.payeeName)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(k.core_recipient_name), queryOrderDetailRsp2.payeeName);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.payeeShopName)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(k.core_shop_name), queryOrderDetailRsp2.payeeShopName);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.payeeMappingCode)) {
                            String string9 = payShopTradeRecordDetailActivity2.getString(k.core_account_number);
                            String str = queryOrderDetailRsp2.payeeMappingCode;
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, string9, str != null ? r0.w(str) : null);
                        }
                        Long l21 = queryOrderDetailRsp2.orderSuccessTime;
                        if ((l21 != null ? l21.longValue() : 0L) > 0) {
                            String string10 = payShopTradeRecordDetailActivity2.getString(k.core_completion_time);
                            Long l22 = queryOrderDetailRsp2.orderSuccessTime;
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, string10, r0.P(l22 != null ? l22.longValue() : 0L));
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.orderNo)) {
                            OrderResultItemModel orderResultItemModel = new OrderResultItemModel(payShopTradeRecordDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, payShopTradeRecordDetailActivity2.getString(k.core_receipt_transaction_id), queryOrderDetailRsp2.orderNo);
                            Object value2 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((LinearLayout) value2).addView(orderResultItemModel);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.paymentTypeDesc)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(k.core_payment_type), queryOrderDetailRsp2.paymentTypeDesc);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.payTypeDesc)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(k.core_payment_method), queryOrderDetailRsp2.payTypeDesc);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.payerName)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(g.cs_payer_name), queryOrderDetailRsp2.payerName);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp2.payerBankCard)) {
                            OrderResultItemModel orderResultItemModelO = PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(g.cs_payer_account_no), r0.G(queryOrderDetailRsp2.payerBankCard));
                            if (!TextUtils.isEmpty(queryOrderDetailRsp2.payerBankUrl)) {
                                orderResultItemModelO.l(queryOrderDetailRsp2.payerBankUrl);
                            }
                        }
                    }
                } else {
                    QueryOrderDetailRsp queryOrderDetailRsp3 = payShopTradeRecordDetailActivity2.f28759v;
                    if (queryOrderDetailRsp3 != null) {
                        Object value3 = payShopTradeRecordDetailActivity2.f28753f.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        h.c((OrderResultViewReceiptModel) value3);
                        if (TextUtils.isEmpty(queryOrderDetailRsp3.payerName)) {
                            payShopTradeRecordDetailActivity2.q().o(payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_request_to_s, r0.w0(queryOrderDetailRsp3.payerMobileNo)));
                        } else {
                            payShopTradeRecordDetailActivity2.q().o(payShopTradeRecordDetailActivity2.getString(g.cs_bill_detail_transfer_from_s_short, queryOrderDetailRsp3.payerName));
                        }
                        String str2 = queryOrderDetailRsp3.payerHeadImage;
                        if (str2 != null) {
                            payShopTradeRecordDetailActivity2.q().h(str2);
                        } else {
                            payShopTradeRecordDetailActivity2.q().d(r.cv_avatar_default);
                        }
                        OrderResultHeaderModel orderResultHeaderModelQ2 = payShopTradeRecordDetailActivity2.q();
                        Long l23 = queryOrderDetailRsp3.amount;
                        orderResultHeaderModelQ2.c(r0.z(l23 != null ? l23.longValue() : 0L));
                        if (!TextUtils.isEmpty(queryOrderDetailRsp3.payerName)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(k.core_sender_name), queryOrderDetailRsp3.payerName);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp3.payerMobileNo)) {
                            String string11 = payShopTradeRecordDetailActivity2.getString(k.core_sender_account_no);
                            String str3 = queryOrderDetailRsp3.payerMobileNo;
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, string11, str3 != null ? r0.u(str3) : null);
                        }
                        String string12 = payShopTradeRecordDetailActivity2.getString(k.core_completion_time);
                        Long l24 = queryOrderDetailRsp3.orderSuccessTime;
                        PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, string12, r0.N(l24 != null ? l24.longValue() : 0L));
                        if (!TextUtils.isEmpty(queryOrderDetailRsp3.orderNo)) {
                            OrderResultItemModel orderResultItemModel2 = new OrderResultItemModel(payShopTradeRecordDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, payShopTradeRecordDetailActivity2.getString(k.core_receipt_transaction_id), queryOrderDetailRsp3.orderNo);
                            Object value4 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((LinearLayout) value4).addView(orderResultItemModel2);
                        }
                        PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(k.core_bill_detail_bill_type), queryOrderDetailRsp3.paymentTypeDesc);
                        if (!TextUtils.isEmpty(queryOrderDetailRsp3.payTypeDesc)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, payShopTradeRecordDetailActivity2.getString(k.core_receive_method), queryOrderDetailRsp3.payTypeDesc);
                        }
                        if (!TextUtils.isEmpty(queryOrderDetailRsp3.payeeShopName)) {
                            PayShopTradeRecordDetailActivity.o(payShopTradeRecordDetailActivity2, "Receive Shop Name", queryOrderDetailRsp3.payeeShopName);
                        }
                    }
                }
            }
        } else if (it instanceof m) {
            payShopTradeRecordDetailActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            payShopTradeRecordDetailActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj) {
        QueryOrderDetailRsp queryOrderDetailRsp;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        PayShopTransReceiptActivity payShopTransReceiptActivity = (PayShopTransReceiptActivity) this.f38430b;
        if (z3) {
            payShopTransReceiptActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            payShopTransReceiptActivity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
            if (commonBeanResult.isSuccess() && (queryOrderDetailRsp = (QueryOrderDetailRsp) commonBeanResult.data) != null) {
                boolean zIsEmpty = TextUtils.isEmpty(queryOrderDetailRsp.payeeName);
                PayShopTransReceiptActivity payShopTransReceiptActivity2 = (PayShopTransReceiptActivity) this.f38431c;
                if (!zIsEmpty) {
                    Object value = payShopTransReceiptActivity2.f28764H.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((TextView) value).setText(queryOrderDetailRsp.payeeName);
                }
                StringBuilder sbS = u.s("PalmPay | ");
                if (!TextUtils.isEmpty(queryOrderDetailRsp.payeeMappingCode)) {
                    String str = queryOrderDetailRsp.payeeMappingCode;
                    sbS.append(str != null ? r0.w(str) : null);
                }
                Object value2 = payShopTransReceiptActivity2.f28763C.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((TextView) value2).setText(sbS);
                Object value3 = payShopTransReceiptActivity2.f28767Q.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                TextView textView = (TextView) value3;
                Long l5 = queryOrderDetailRsp.amount;
                textView.setText(r0.B(l5 != null ? l5.longValue() : 0L, false));
                if (!TextUtils.isEmpty(queryOrderDetailRsp.payerName)) {
                    Object value4 = payShopTransReceiptActivity2.f28762B.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((TextView) value4).setText(queryOrderDetailRsp.payerName);
                }
                if (!TextUtils.isEmpty(queryOrderDetailRsp.payerMobileNo)) {
                    Object value5 = payShopTransReceiptActivity2.f28761A.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    G.x("PalmPay | ", r0.E0(queryOrderDetailRsp.payerMobileNo), (TextView) value5);
                }
                Object value6 = payShopTransReceiptActivity2.f28777w.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((TextView) value6).setText(queryOrderDetailRsp.paymentTypeDesc);
                boolean zIsEmpty2 = TextUtils.isEmpty(queryOrderDetailRsp.receiptDesc);
                p355xf.t tVar = payShopTransReceiptActivity2.f28766M;
                if (zIsEmpty2) {
                    Object value7 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    h.c((TextView) value7);
                } else {
                    Object value8 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                    h.C((TextView) value8);
                    Object value9 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                    ((TextView) value9).setText(queryOrderDetailRsp.receiptDesc);
                }
                if (!TextUtils.isEmpty(queryOrderDetailRsp.remark)) {
                    p355xf.t tVar2 = payShopTransReceiptActivity2.t;
                    Object value10 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    ((TextView) value10).setText(queryOrderDetailRsp.remark);
                    Object value11 = payShopTransReceiptActivity2.f28776v.getValue();
                    Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                    ((TextView) value11).setVisibility(0);
                    Object value12 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                    ((TextView) value12).setVisibility(0);
                }
                if (!TextUtils.isEmpty(payShopTransReceiptActivity2.f28769Y)) {
                    p355xf.t tVar3 = payShopTransReceiptActivity2.f28774o;
                    Object value13 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                    ((TextView) value13).setText(payShopTransReceiptActivity2.f28769Y);
                    Object value14 = payShopTransReceiptActivity2.f28775p.getValue();
                    Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                    ((TextView) value14).setVisibility(0);
                    Object value15 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                    ((TextView) value15).setVisibility(0);
                }
                if (!TextUtils.isEmpty(queryOrderDetailRsp.payId)) {
                    p355xf.t tVar4 = payShopTransReceiptActivity2.f28772i;
                    Object value16 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                    ((TextView) value16).setText(queryOrderDetailRsp.payId);
                    Object value17 = payShopTransReceiptActivity2.f28773j.getValue();
                    Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                    ((TextView) value17).setVisibility(0);
                    Object value18 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                    ((TextView) value18).setVisibility(0);
                }
                Long l6 = queryOrderDetailRsp.orderSuccessTime;
                if ((l6 != null ? l6.longValue() : 0L) > 0) {
                    Object value19 = payShopTransReceiptActivity2.f28765L.getValue();
                    Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                    TextView textView2 = (TextView) value19;
                    Long l8 = queryOrderDetailRsp.orderSuccessTime;
                    textView2.setText(r0.Q(l8 != null ? l8.longValue() : 0L));
                }
            }
        } else if (it instanceof m) {
            payShopTransReceiptActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            payShopTransReceiptActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        RewardOrderDetailActivity rewardOrderDetailActivity = (RewardOrderDetailActivity) this.f38430b;
        if (z3) {
            rewardOrderDetailActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            rewardOrderDetailActivity.showLoadingDialog(false, true);
            RewardOrderDetail rewardOrderDetail = (RewardOrderDetail) ((CommonBeanResult) ((p) it).f27360a).data;
            if (rewardOrderDetail != null) {
                RewardOrderDetailActivity rewardOrderDetailActivity2 = (RewardOrderDetailActivity) this.f38431c;
                OrderResultHeaderModel orderResultHeaderModelN = RewardOrderDetailActivity.n(rewardOrderDetailActivity2);
                if (orderResultHeaderModelN != null) {
                    orderResultHeaderModelN.h(rewardOrderDetail.icon);
                }
                OrderResultHeaderModel orderResultHeaderModelN2 = RewardOrderDetailActivity.n(rewardOrderDetailActivity2);
                if (orderResultHeaderModelN2 != null) {
                    orderResultHeaderModelN2.n(g.cs_from_palmpay);
                }
                OrderResultHeaderModel orderResultHeaderModelN3 = RewardOrderDetailActivity.n(rewardOrderDetailActivity2);
                Long l5 = rewardOrderDetail.amount;
                orderResultHeaderModelN3.c(r0.B(l5 != null ? l5.longValue() : 0L, true));
                RewardOrderDetailActivity.n(rewardOrderDetailActivity2).l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, rewardOrderDetailActivity2, rewardOrderDetail.prizeStatusDesc, 0.0f, 4, null));
                RewardOrderDetailActivity.n(rewardOrderDetailActivity2).k(rewardOrderDetail.prizeStatusDesc);
                h.s(RewardOrderDetailActivity.n(rewardOrderDetailActivity2).getOrderStatusArrow(), false);
                Long l6 = rewardOrderDetail.transTime;
                long jLongValue = l6 != null ? l6.longValue() : 0L;
                p355xf.t tVar = rewardOrderDetailActivity2.f28780g;
                if (jLongValue > 0) {
                    String string = rewardOrderDetailActivity2.getString(k.core_completion_time);
                    Long l8 = rewardOrderDetail.transTime;
                    OrderResultItemModel orderResultItemModel = new OrderResultItemModel(rewardOrderDetailActivity2, 1002, string, r0.Q(l8 != null ? l8.longValue() : 0L));
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((LinearLayout) value).addView(orderResultItemModel);
                }
                if (!TextUtils.isEmpty(rewardOrderDetail.lotteryOrderNo)) {
                    OrderResultItemModel orderResultItemModel2 = new OrderResultItemModel(rewardOrderDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, rewardOrderDetailActivity2.getString(k.core_receipt_transaction_id), rewardOrderDetail.lotteryOrderNo);
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((LinearLayout) value2).addView(orderResultItemModel2);
                }
                if (!TextUtils.isEmpty(rewardOrderDetail.paymentType)) {
                    OrderResultItemModel orderResultItemModel3 = new OrderResultItemModel(rewardOrderDetailActivity2, 1002, rewardOrderDetailActivity2.getString(k.core_payment_type), rewardOrderDetail.paymentType);
                    Object value3 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    ((LinearLayout) value3).addView(orderResultItemModel3);
                }
                if (!TextUtils.isEmpty(rewardOrderDetail.typeName)) {
                    OrderResultItemModel orderResultItemModel4 = new OrderResultItemModel(rewardOrderDetailActivity2, 1002, rewardOrderDetailActivity2.getString(k.core_receive_account), rewardOrderDetail.typeName);
                    Object value4 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((LinearLayout) value4).addView(orderResultItemModel4);
                }
            }
        } else if (it instanceof m) {
            rewardOrderDetailActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            rewardOrderDetailActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj) {
        K kE;
        Integer authStatus;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        KkCarHostActivity kkCarHostActivity = (KkCarHostActivity) this.f38430b;
        if (z3) {
            kkCarHostActivity.showLoadingDialog(true, true);
        } else {
            int iIntValue = 0;
            if (it instanceof p) {
                kkCarHostActivity.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    KkCarAuthInfoRsp kkCarAuthInfoRsp = (KkCarAuthInfoRsp) commonBeanResult.data;
                    if (kkCarAuthInfoRsp != null && (authStatus = kkCarAuthInfoRsp.getAuthStatus()) != null) {
                        iIntValue = authStatus.intValue();
                    }
                    KkCarPassengerAuthStore kkCarPassengerAuthStore = KkCarPassengerAuthStore.INSTANCE;
                    kkCarPassengerAuthStore.saveAuthStatus(Integer.valueOf(iIntValue));
                    if (iIntValue != 0) {
                        kkCarPassengerAuthStore.clearQrSnapshotCache();
                        P p3 = ((KkCarHostActivity) this.f38431c).f33302d;
                        if (p3 != null && ((kE = p3.e()) == null || kE.f961i != e.kkCarPassengerFragment)) {
                            p3.h(e.kkCarPassengerFragment, null, new U(false, false, e.kkCarOnboardingFragment, true, false, -1, -1, -1, -1));
                        }
                    }
                } else {
                    ToastUtils.showShort(commonBeanResult.getRespMsg(), new Object[0]);
                }
            } else if (it instanceof m) {
                kkCarHostActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                kkCarHostActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((n) it).f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    private final Object k(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        CLCreditManagementActivity cLCreditManagementActivity = (CLCreditManagementActivity) this.f38430b;
        if (z3) {
            cLCreditManagementActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof p;
            CLCreditManagementActivity cLCreditManagementActivity2 = (CLCreditManagementActivity) this.f38431c;
            if (z8) {
                cLCreditManagementActivity.showLoadingDialog(false, true);
                CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((p) it).f27360a;
                if (commonListResultV2.isSuccess()) {
                    CLCreditManagementActivity.n(cLCreditManagementActivity2, commonListResultV2.data);
                } else {
                    CLCreditManagementActivity.n(cLCreditManagementActivity2, null);
                }
            } else if (it instanceof m) {
                cLCreditManagementActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                cLCreditManagementActivity.showLoadingDialog(false, true);
                ((n) it).getClass();
                CLCreditManagementActivity.n(cLCreditManagementActivity2, null);
            }
        }
        return Unit.f38893a;
    }

    private final Object l(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        OcALiFaceGuideActivity ocALiFaceGuideActivity = (OcALiFaceGuideActivity) this.f38430b;
        if (z3) {
            ocALiFaceGuideActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            ocALiFaceGuideActivity.showLoadingDialog(false, true);
            CLQueryApplyAuditResultResp cLQueryApplyAuditResultResp = (CLQueryApplyAuditResultResp) ((p) it).f27360a;
            boolean zIsSuccess = cLQueryApplyAuditResultResp.isSuccess();
            OcALiFaceGuideActivity ocALiFaceGuideActivity2 = (OcALiFaceGuideActivity) this.f38431c;
            p355xf.t tVar = ocALiFaceGuideActivity2.f29224r0;
            if (zIsSuccess) {
                Data data = cLQueryApplyAuditResultResp.getData();
                List<Reason> ngReturnResultDetailList = data != null ? data.getNgReturnResultDetailList() : null;
                int i7 = OcALiFaceGuideActivity.f29218t0;
                String strC = i.c(ngReturnResultDetailList, Fb.g.f2641a);
                if (strC != null) {
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((TextView) value).setText(strC);
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    h.s((TextView) value2, !TextUtils.isEmpty(strC));
                }
            } else {
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                h.s((TextView) value3, false);
                if (!TextUtils.isEmpty(cLQueryApplyAuditResultResp.getRespMsg())) {
                    h.x(ocALiFaceGuideActivity2, cLQueryApplyAuditResultResp.getRespMsg());
                }
            }
        } else if (it instanceof m) {
            ocALiFaceGuideActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            ocALiFaceGuideActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object m(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        OcApplyLiteActivity ocApplyLiteActivity = (OcApplyLiteActivity) this.f38430b;
        if (z3) {
            ocApplyLiteActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            ocApplyLiteActivity.showLoadingDialog(false, true);
            CommonResult commonResult = (CommonResult) ((p) it).f27360a;
            if (commonResult.isSuccess()) {
                OcApplyLiteActivity ocApplyLiteActivity2 = (OcApplyLiteActivity) this.f38431c;
                ocApplyLiteActivity2.setResult(-1);
                ocApplyLiteActivity2.finish();
            } else {
                ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
            }
        } else if (it instanceof m) {
            ocApplyLiteActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            ocApplyLiteActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
            ((n) it).getClass();
        }
        return Unit.f38893a;
    }

    private final Object n(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        OcContactActivity ocContactActivity = (OcContactActivity) this.f38430b;
        if (z3) {
            ocContactActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            ocContactActivity.showLoadingDialog(false, true);
            CLQueryApplyAuditResultResp cLQueryApplyAuditResultResp = (CLQueryApplyAuditResultResp) ((p) it).f27360a;
            boolean zIsSuccess = cLQueryApplyAuditResultResp.isSuccess();
            OcContactActivity ocContactActivity2 = (OcContactActivity) this.f38431c;
            p355xf.t tVar = ocContactActivity2.f29406b1;
            if (zIsSuccess) {
                Data data = cLQueryApplyAuditResultResp.getData();
                List<Reason> ngReturnResultDetailList = data != null ? data.getNgReturnResultDetailList() : null;
                int i7 = OcContactActivity.f29378l1;
                String strC = i.c(ngReturnResultDetailList, f.f2640a);
                if (strC != null) {
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((TextView) value).setText(strC);
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    h.s((TextView) value2, !TextUtils.isEmpty(strC));
                }
            } else {
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                h.s((TextView) value3, false);
                if (!TextUtils.isEmpty(cLQueryApplyAuditResultResp.getRespMsg())) {
                    h.x(ocContactActivity2, cLQueryApplyAuditResultResp.getRespMsg());
                }
            }
        } else if (it instanceof m) {
            ocContactActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            ocContactActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object o(Object obj) {
        List<OcRouterDetail> routeInfoList;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity = (OcGetInstallmentCreditActivity) this.f38430b;
        if (z3) {
            ocGetInstallmentCreditActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof p;
            OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity2 = (OcGetInstallmentCreditActivity) this.f38431c;
            if (z8) {
                ocGetInstallmentCreditActivity.showLoadingDialog(false, true);
                OcRouterResp ocRouterResp = (OcRouterResp) ((p) it).f27360a;
                if (ocRouterResp.isSuccess()) {
                    OcRouterData data = ocRouterResp.getData();
                    ocGetInstallmentCreditActivity2.f29465s0 = data != null ? data.getCustomerTag() : null;
                    OcRouterData data2 = ocRouterResp.getData();
                    if (data2 != null && (routeInfoList = data2.getRouteInfoList()) != null) {
                        ArrayList arrayList = ocGetInstallmentCreditActivity2.f29258o;
                        arrayList.addAll(routeInfoList);
                        OcRouterDetail ocRouterDetail = (OcRouterDetail) arrayList.get(0);
                        if (Intrinsics.c(ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null, "oc_permission_router")) {
                            ocGetInstallmentCreditActivity2.f29464r0 = 1;
                            OcGetInstallmentCreditActivity.y(ocGetInstallmentCreditActivity2);
                        } else {
                            ocGetInstallmentCreditActivity2.f29464r0 = 0;
                            ocGetInstallmentCreditActivity2.z();
                        }
                    }
                } else {
                    h.w(ocGetInstallmentCreditActivity2, ocRouterResp);
                }
            } else if (it instanceof m) {
                ocGetInstallmentCreditActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                ocGetInstallmentCreditActivity.showLoadingDialog(false, true);
                h.x(ocGetInstallmentCreditActivity2, ((n) it).f27358a);
            }
        }
        return Unit.f38893a;
    }

    private final Object p(Object obj) {
        Integer cardLevel;
        TextView textViewS;
        Integer day;
        OcGoldCardLevelData ocGoldCardLevelData;
        List<OcRepaymentDate> billDayItemList;
        List<OcRepaymentDate> billDayItemList2;
        List<OcRepaymentDate> billDayItemList3;
        List<OcRepaymentDate> billDayItemList4;
        List<OcRepaymentDate> billDayItemList5;
        List<OcRepaymentDate> billDayItemList6;
        List<OcRepaymentDate> billDayItemList7;
        OcRepaymentDate ocRepaymentDate;
        List<OcRepaymentDate> currentBillDayList;
        Integer day2;
        Integer day3;
        Long nextAdjustBillDayDateStamp;
        Integer day4;
        List<OcRepaymentDate> currentBillDayList2;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = (OcGoldCardUpgradeActivity) this.f38430b;
        int iIntValue = 1;
        if (z3) {
            ocGoldCardUpgradeActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof p;
            OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity2 = (OcGoldCardUpgradeActivity) this.f38431c;
            int size = 0;
            if (z8) {
                ocGoldCardUpgradeActivity.showLoadingDialog(false, true);
                OcGoldCardLevelResp ocGoldCardLevelResp = (OcGoldCardLevelResp) ((p) it).f27360a;
                if (!ocGoldCardLevelResp.isSuccess() || ocGoldCardLevelResp.getData() == null) {
                    h.x(ocGoldCardUpgradeActivity2, ocGoldCardLevelResp.getRespMsg());
                } else {
                    OcGoldCardLevelData data = ocGoldCardLevelResp.getData();
                    ocGoldCardUpgradeActivity2.f29483k0 = data;
                    OcRepaymentDate ocRepaymentDate2 = null;
                    F6.d.h(ocGoldCardUpgradeActivity2.TAG, 3, "updateView >>> cardLevel=" + (data != null ? data.getCardLevel() : null));
                    OcGoldCardLevelData ocGoldCardLevelData2 = ocGoldCardUpgradeActivity2.f29483k0;
                    p355xf.t tVar = ocGoldCardUpgradeActivity2.f29478Z;
                    if (ocGoldCardLevelData2 == null || (cardLevel = ocGoldCardLevelData2.getCardLevel()) == null || 1 != cardLevel.intValue()) {
                        r0.l1(r0.y0("cs_oc_gold_card_upgrade.webp"), (ImageView) tVar.getValue());
                        ImageView imageView = (ImageView) tVar.getValue();
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        ViewStub viewStub = (ViewStub) ocGoldCardUpgradeActivity2.f29476X.getValue();
                        if (viewStub != null) {
                            viewStub.setVisibility(0);
                        }
                        Object value = ocGoldCardUpgradeActivity2.f29473L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        Button button = (Button) value;
                        if (button != null) {
                            h.l(new Y(ocGoldCardUpgradeActivity2, 3), button);
                        }
                    } else {
                        OcGoldCardLevelData ocGoldCardLevelData3 = ocGoldCardUpgradeActivity2.f29483k0;
                        boolean zC = ocGoldCardLevelData3 != null ? Intrinsics.c(ocGoldCardLevelData3.getAlreadyAdjustedBillDay(), Boolean.TRUE) : false;
                        p355xf.t tVar2 = ocGoldCardUpgradeActivity2.f29474M;
                        if (zC) {
                            ImageView imageView2 = (ImageView) tVar.getValue();
                            if (imageView2 != null) {
                                imageView2.setVisibility(8);
                            }
                            ImageView imageView3 = (ImageView) ocGoldCardUpgradeActivity2.f29477Y.getValue();
                            if (imageView3 != null) {
                                imageView3.setVisibility(0);
                            }
                            ViewStub viewStub2 = (ViewStub) ocGoldCardUpgradeActivity2.f29475Q.getValue();
                            if (viewStub2 != null) {
                                viewStub2.setVisibility(0);
                            }
                            ViewStub viewStub3 = (ViewStub) tVar2.getValue();
                            if (viewStub3 != null) {
                                viewStub3.setVisibility(8);
                            }
                            OcGoldCardLevelData ocGoldCardLevelData4 = ocGoldCardUpgradeActivity2.f29483k0;
                            if (ocGoldCardLevelData4 != null && (currentBillDayList = ocGoldCardLevelData4.getCurrentBillDayList()) != null && !currentBillDayList.isEmpty()) {
                                OcGoldCardLevelData ocGoldCardLevelData5 = ocGoldCardUpgradeActivity2.f29483k0;
                                if (ocGoldCardLevelData5 != null && (currentBillDayList2 = ocGoldCardLevelData5.getCurrentBillDayList()) != null) {
                                    ocRepaymentDate2 = currentBillDayList2.get(0);
                                }
                                Object value2 = ocGoldCardUpgradeActivity2.f29472H.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                                TextView textView = (TextView) value2;
                                if (textView != null) {
                                    textView.setText(AbstractC0198c.C((ocRepaymentDate2 == null || (day4 = ocRepaymentDate2.getDay()) == null) ? 1 : day4.intValue()));
                                }
                                Object value3 = ocGoldCardUpgradeActivity2.f29471C.getValue();
                                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                                TextView textView2 = (TextView) value3;
                                if (textView2 != null) {
                                    int i7 = g.cs_oc_next_adjustable_date;
                                    OcGoldCardLevelData ocGoldCardLevelData6 = ocGoldCardUpgradeActivity2.f29483k0;
                                    textView2.setText(ocGoldCardUpgradeActivity2.getString(i7, r0.X1(Long.valueOf((ocGoldCardLevelData6 == null || (nextAdjustBillDayDateStamp = ocGoldCardLevelData6.getNextAdjustBillDayDateStamp()) == null) ? 0L : nextAdjustBillDayDateStamp.longValue()), "MMM dd, yyyy")));
                                }
                                Object value4 = ocGoldCardUpgradeActivity2.f29470B.getValue();
                                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                                TextView textView3 = (TextView) value4;
                                if (textView3 != null) {
                                    int i10 = g.cs_oc_bill_period_content;
                                    String strC = AbstractC0198c.C((ocRepaymentDate2 == null || (day3 = ocRepaymentDate2.getDay()) == null) ? 1 : day3.intValue());
                                    if (ocRepaymentDate2 != null && (day2 = ocRepaymentDate2.getDay()) != null) {
                                        iIntValue = day2.intValue();
                                    }
                                    textView3.setText(ocGoldCardUpgradeActivity2.getString(i10, strC, AbstractC0198c.C(iIntValue)));
                                }
                            }
                        } else {
                            ImageView imageView4 = (ImageView) tVar.getValue();
                            if (imageView4 != null) {
                                imageView4.setVisibility(0);
                            }
                            r0.l1(r0.y0("cs_oc_gold_card_upgrade.webp"), (ImageView) tVar.getValue());
                            ViewStub viewStub4 = (ViewStub) tVar2.getValue();
                            if (viewStub4 != null) {
                                viewStub4.setVisibility(0);
                            }
                            Object value5 = ocGoldCardUpgradeActivity2.f29480g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            TextView textView4 = (TextView) value5;
                            if (textView4 != null) {
                                OcGoldCardLevelData ocGoldCardLevelData7 = ocGoldCardUpgradeActivity2.f29483k0;
                                textView4.setText(ocGoldCardLevelData7 != null ? ocGoldCardLevelData7.getModifyBillDayPrompt() : null);
                            }
                            OcGoldCardLevelData ocGoldCardLevelData8 = ocGoldCardUpgradeActivity2.f29483k0;
                            if (ocGoldCardLevelData8 != null && ocGoldCardLevelData8.getBillDayItemList() != null) {
                                OcGoldCardLevelData ocGoldCardLevelData9 = ocGoldCardUpgradeActivity2.f29483k0;
                                List<OcRepaymentDate> billDayItemList8 = ocGoldCardLevelData9 != null ? ocGoldCardLevelData9.getBillDayItemList() : null;
                                Intrinsics.e(billDayItemList8);
                                if (billDayItemList8.size() > 0) {
                                    OcGoldCardLevelData ocGoldCardLevelData10 = ocGoldCardUpgradeActivity2.f29483k0;
                                    if ((ocGoldCardLevelData10 == null || (billDayItemList7 = ocGoldCardLevelData10.getBillDayItemList()) == null || (ocRepaymentDate = billDayItemList7.get(0)) == null) ? false : Intrinsics.c(ocRepaymentDate.getSelect(), Boolean.TRUE)) {
                                        OcGoldCardLevelData ocGoldCardLevelData11 = ocGoldCardUpgradeActivity2.f29483k0;
                                        ocGoldCardUpgradeActivity2.f29488r0 = (ocGoldCardLevelData11 == null || (billDayItemList6 = ocGoldCardLevelData11.getBillDayItemList()) == null) ? null : billDayItemList6.get(0);
                                        LinearLayout linearLayoutN = ocGoldCardUpgradeActivity2.n();
                                        if (linearLayoutN != null) {
                                            linearLayoutN.setBackgroundResource(Ya.d.cs_oc_repayment_date_bg);
                                        }
                                        TextView textViewP = ocGoldCardUpgradeActivity2.p();
                                        if (textViewP != null) {
                                            textViewP.setTextColor(ocGoldCardUpgradeActivity2.getColor(Ya.b.cs_oc_main_color));
                                        }
                                        TextView textViewO = ocGoldCardUpgradeActivity2.o();
                                        if (textViewO != null) {
                                            textViewO.setTextColor(ocGoldCardUpgradeActivity2.getColor(Ya.b.cs_oc_main_color));
                                        }
                                        Object value6 = ocGoldCardUpgradeActivity2.t.getValue();
                                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                                        ((TextView) value6).setVisibility(0);
                                        LinearLayout linearLayoutQ = ocGoldCardUpgradeActivity2.q();
                                        if (linearLayoutQ != null) {
                                            linearLayoutQ.setBackgroundResource(Ya.d.cs_oc_repayment_date_unselect_bg);
                                        }
                                        TextView textViewS2 = ocGoldCardUpgradeActivity2.s();
                                        if (textViewS2 != null) {
                                            textViewS2.setTextColor(ocGoldCardUpgradeActivity2.getColor(b.ppColorTextPrimary));
                                        }
                                        TextView textViewR = ocGoldCardUpgradeActivity2.r();
                                        if (textViewR != null) {
                                            textViewR.setTextColor(ocGoldCardUpgradeActivity2.getColor(b.ppColorTextPrimary));
                                        }
                                        ocGoldCardUpgradeActivity2.f29487q0 = ocGoldCardUpgradeActivity2.n();
                                    } else {
                                        OcGoldCardLevelData ocGoldCardLevelData12 = ocGoldCardUpgradeActivity2.f29483k0;
                                        ocGoldCardUpgradeActivity2.f29488r0 = (ocGoldCardLevelData12 == null || (billDayItemList5 = ocGoldCardLevelData12.getBillDayItemList()) == null) ? null : billDayItemList5.get(0);
                                        LinearLayout linearLayoutN2 = ocGoldCardUpgradeActivity2.n();
                                        if (linearLayoutN2 != null) {
                                            linearLayoutN2.setBackgroundResource(Ya.d.cs_oc_repayment_date_unselect_bg);
                                        }
                                        TextView textViewP2 = ocGoldCardUpgradeActivity2.p();
                                        if (textViewP2 != null) {
                                            textViewP2.setTextColor(ocGoldCardUpgradeActivity2.getColor(b.ppColorTextPrimary));
                                        }
                                        TextView textViewO2 = ocGoldCardUpgradeActivity2.o();
                                        if (textViewO2 != null) {
                                            textViewO2.setTextColor(ocGoldCardUpgradeActivity2.getColor(b.ppColorTextPrimary));
                                        }
                                        LinearLayout linearLayoutQ2 = ocGoldCardUpgradeActivity2.q();
                                        if (linearLayoutQ2 != null) {
                                            linearLayoutQ2.setBackgroundResource(Ya.d.cs_oc_repayment_date_bg);
                                        }
                                        TextView textViewS3 = ocGoldCardUpgradeActivity2.s();
                                        if (textViewS3 != null) {
                                            textViewS3.setTextColor(ocGoldCardUpgradeActivity2.getColor(Ya.b.cs_oc_main_color));
                                        }
                                        TextView textViewR2 = ocGoldCardUpgradeActivity2.r();
                                        if (textViewR2 != null) {
                                            textViewR2.setTextColor(ocGoldCardUpgradeActivity2.getColor(Ya.b.cs_oc_main_color));
                                        }
                                        Object value7 = ocGoldCardUpgradeActivity2.f29481i.getValue();
                                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                                        ((TextView) value7).setVisibility(0);
                                        ocGoldCardUpgradeActivity2.f29487q0 = ocGoldCardUpgradeActivity2.q();
                                    }
                                }
                            }
                            OcGoldCardLevelData ocGoldCardLevelData13 = ocGoldCardUpgradeActivity2.f29483k0;
                            if ((ocGoldCardLevelData13 == null || (billDayItemList4 = ocGoldCardLevelData13.getBillDayItemList()) == null || billDayItemList4.isEmpty()) ? false : true) {
                                OcGoldCardLevelData ocGoldCardLevelData14 = ocGoldCardUpgradeActivity2.f29483k0;
                                OcRepaymentDate ocRepaymentDate3 = (ocGoldCardLevelData14 == null || (billDayItemList3 = ocGoldCardLevelData14.getBillDayItemList()) == null) ? null : billDayItemList3.get(0);
                                OcGoldCardLevelData ocGoldCardLevelData15 = ocGoldCardUpgradeActivity2.f29483k0;
                                if (ocGoldCardLevelData15 != null && (billDayItemList2 = ocGoldCardLevelData15.getBillDayItemList()) != null) {
                                    size = billDayItemList2.size();
                                }
                                if (size > 1 && (ocGoldCardLevelData = ocGoldCardUpgradeActivity2.f29483k0) != null && (billDayItemList = ocGoldCardLevelData.getBillDayItemList()) != null) {
                                    ocRepaymentDate2 = billDayItemList.get(1);
                                }
                                TextView textViewP3 = ocGoldCardUpgradeActivity2.p();
                                if (textViewP3 != null) {
                                    textViewP3.setText(AbstractC0198c.C((ocRepaymentDate3 == null || (day = ocRepaymentDate3.getDay()) == null) ? 1 : day.intValue()));
                                }
                                if (ocRepaymentDate2 != null && (textViewS = ocGoldCardUpgradeActivity2.s()) != null) {
                                    Integer day5 = ocRepaymentDate2.getDay();
                                    textViewS.setText(AbstractC0198c.C(day5 != null ? day5.intValue() : 1));
                                }
                            }
                            LinearLayout linearLayoutN3 = ocGoldCardUpgradeActivity2.n();
                            if (linearLayoutN3 != null) {
                                h.l(new Y(ocGoldCardUpgradeActivity2, 0), linearLayoutN3);
                            }
                            LinearLayout linearLayoutQ3 = ocGoldCardUpgradeActivity2.q();
                            if (linearLayoutQ3 != null) {
                                h.l(new Y(ocGoldCardUpgradeActivity2, 1), linearLayoutQ3);
                            }
                            Object value8 = ocGoldCardUpgradeActivity2.f29479f.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            Button button2 = (Button) value8;
                            if (button2 != null) {
                                h.l(new Y(ocGoldCardUpgradeActivity2, 2), button2);
                            }
                        }
                    }
                }
            } else if (it instanceof m) {
                ocGoldCardUpgradeActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                ocGoldCardUpgradeActivity.showLoadingDialog(false, true);
                h.x(ocGoldCardUpgradeActivity2, ((n) it).f27358a);
            }
        }
        return Unit.f38893a;
    }

    private final Object q(Object obj) {
        Long totalOverpaymentBalance;
        Long totalOverpaymentBalance2;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        OcOverpaymentActivity ocOverpaymentActivity = (OcOverpaymentActivity) this.f38430b;
        if (z3) {
            ocOverpaymentActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof p;
            OcOverpaymentActivity ocOverpaymentActivity2 = (OcOverpaymentActivity) this.f38431c;
            if (z8) {
                ocOverpaymentActivity.showLoadingDialog(false, true);
                OcTotalOverpaymentResp ocTotalOverpaymentResp = (OcTotalOverpaymentResp) ((p) it).f27360a;
                ocOverpaymentActivity2.showLoadingDialog(false);
                ocOverpaymentActivity2.t = ocTotalOverpaymentResp.getData();
                Object value = ocOverpaymentActivity2.f29640p.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                TextView textView = (TextView) value;
                OcTotalOverpaymentData ocTotalOverpaymentData = ocOverpaymentActivity2.t;
                textView.setText(r0.B((ocTotalOverpaymentData == null || (totalOverpaymentBalance2 = ocTotalOverpaymentData.getTotalOverpaymentBalance()) == null) ? 0L : totalOverpaymentBalance2.longValue(), true));
                OcTotalOverpaymentData ocTotalOverpaymentData2 = ocOverpaymentActivity2.t;
                long jLongValue = (ocTotalOverpaymentData2 == null || (totalOverpaymentBalance = ocTotalOverpaymentData2.getTotalOverpaymentBalance()) == null) ? 0L : totalOverpaymentBalance.longValue();
                p355xf.t tVar = ocOverpaymentActivity2.f29635f;
                p355xf.t tVar2 = ocOverpaymentActivity2.f29637i;
                p355xf.t tVar3 = ocOverpaymentActivity2.f29638j;
                p355xf.t tVar4 = ocOverpaymentActivity2.f29639o;
                if (jLongValue == 0) {
                    Object value2 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((TextView) value2).setText(ocOverpaymentActivity2.getString(g.cs_oc_overpayment_nothing));
                    Object value3 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    ((View) value3).setVisibility(8);
                    Object value4 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((LinearLayout) value4).setVisibility(8);
                    Object value5 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    ((LinearLayout) value5).setVisibility(8);
                } else {
                    Object value6 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    ((TextView) value6).setText(ocOverpaymentActivity2.getString(g.cs_refund_automatically_tomorrow));
                    Object value7 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    ((View) value7).setVisibility(0);
                    Object value8 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                    ((LinearLayout) value8).setVisibility(0);
                    Object value9 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                    ((LinearLayout) value9).setVisibility(0);
                }
            } else if (it instanceof m) {
                ocOverpaymentActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                ocOverpaymentActivity.showLoadingDialog(false, true);
                String str = ((n) it).f27358a;
                ocOverpaymentActivity2.showLoadingDialog(false);
                ToastUtils.showLong(str, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df A[PHI: r17
      0x00df: PHI (r17v5 java.lang.Integer) = (r17v0 java.lang.Integer), (r17v3 java.lang.Integer) binds: [B:39:0x00dd, B:45:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    private final Object r(Object obj) {
        Object objF;
        K kE;
        int iIntValue;
        int iIntValue2;
        boolean z3 = true;
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z8 = it instanceof o;
        TransferByLoanActivity transferByLoanActivity = (TransferByLoanActivity) this.f38430b;
        if (z8) {
            transferByLoanActivity.showLoadingDialog(true, true);
        } else {
            boolean z10 = it instanceof p;
            TransferByLoanActivity transferByLoanActivity2 = (TransferByLoanActivity) this.f38431c;
            int i7 = 0;
            if (z10) {
                transferByLoanActivity.showLoadingDialog(false, true);
                Eb.l lVar = (Eb.l) ((p) it).f27360a;
                TransferByLoanActivity.a aVar = TransferByLoanActivity.f29927e;
                Serializable serializableExtra = transferByLoanActivity2.getIntent().getSerializableExtra("extra_open_params");
                TransferByLoanOpenParams params = serializableExtra instanceof TransferByLoanOpenParams ? (TransferByLoanOpenParams) serializableExtra : null;
                if (params == null) {
                    transferByLoanActivity2.m();
                } else {
                    TransferByLoanViewModel transferByLoanViewModel = (TransferByLoanViewModel) transferByLoanActivity2.f29929d.getValue();
                    String cardNo = lVar.f2283a;
                    transferByLoanViewModel.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(cardNo, "cardNo");
                    ?? plans = lVar.f2284b;
                    Intrinsics.checkNotNullParameter(plans, "plans");
                    int length = cardNo.length();
                    androidx.lifecycle.F f10 = transferByLoanViewModel.f30932f;
                    if (length == 0 || plans.isEmpty()) {
                        J3.a.T("EMPTY_PLANS", "no trial result to render");
                        f10.k(H.f4705a);
                    } else {
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        if (!plans.isEmpty()) {
                            CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) plans.get(0);
                            Integer loanTerm = cLRepaymentPlanData.getLoanTerm();
                            if (loanTerm != null) {
                                iIntValue = loanTerm.intValue();
                            } else {
                                String term = cLRepaymentPlanData.getTerm();
                                Integer intOrNull = term != null ? StringsKt.toIntOrNull(term) : null;
                                iIntValue = intOrNull != null ? intOrNull.intValue() : Integer.MAX_VALUE;
                            }
                            Integer loanDays = ((CLRepaymentPlanData) plans.get(0)).getLoanDays();
                            int iIntValue3 = loanDays != null ? loanDays.intValue() : Integer.MAX_VALUE;
                            int size = plans.size();
                            int i10 = 1;
                            while (i10 < size) {
                                CLRepaymentPlanData cLRepaymentPlanData2 = (CLRepaymentPlanData) plans.get(i10);
                                Integer loanTerm2 = cLRepaymentPlanData2.getLoanTerm();
                                if (loanTerm2 == null) {
                                    String term2 = cLRepaymentPlanData2.getTerm();
                                    loanTerm2 = term2 != null ? StringsKt.toIntOrNull(term2) : null;
                                    if (loanTerm2 != null) {
                                        iIntValue2 = loanTerm2.intValue();
                                    } else {
                                        iIntValue2 = Integer.MAX_VALUE;
                                    }
                                } else {
                                    iIntValue2 = loanTerm2.intValue();
                                }
                                Integer loanDays2 = cLRepaymentPlanData2.getLoanDays();
                                int iIntValue4 = loanDays2 != null ? loanDays2.intValue() : Integer.MAX_VALUE;
                                if (iIntValue2 < iIntValue || (iIntValue2 == iIntValue && iIntValue4 < iIntValue3)) {
                                    iIntValue3 = iIntValue4;
                                    iIntValue = iIntValue2;
                                    i7 = i10;
                                }
                                i10++;
                                z3 = z3;
                            }
                        }
                        f10.k(new Jb.G(params, cardNo, plans, i7, Intrinsics.c(transferByLoanViewModel.f30939w, Boolean.TRUE)));
                    }
                    try {
                        p355xf.o oVar = p355xf.q.f43977a;
                        Fragment fragmentD = transferByLoanActivity2.getSupportFragmentManager().D(Ya.e.navHostFragment);
                        Intrinsics.f(fragmentD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                        objF = ((NavHostFragment) fragmentD).f();
                    } catch (Throwable th) {
                        p355xf.o oVar2 = p355xf.q.f43977a;
                        objF = androidx.camera.core.impl.utils.executor.g.f(th);
                    }
                    if (objF instanceof p355xf.p) {
                        objF = null;
                    }
                    AbstractC0130w abstractC0130w = (AbstractC0130w) objF;
                    if (abstractC0130w != null && (kE = abstractC0130w.e()) != null && kE.f961i == Ya.e.emptyViewPlaceholder) {
                        abstractC0130w.h(Ya.e.fragmentSheet, null, null);
                    }
                }
            } else if (it instanceof m) {
                transferByLoanActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof n)) {
                    throw new l();
                }
                transferByLoanActivity.showLoadingDialog(false, true);
                ((n) it).getClass();
                TransferByLoanActivity.a aVar2 = TransferByLoanActivity.f29927e;
                transferByLoanActivity2.m();
            }
        }
        return Unit.f38893a;
    }

    private final Object s(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        SelectBankForToBankActivity selectBankForToBankActivity = (SelectBankForToBankActivity) this.f38430b;
        if (z3) {
            selectBankForToBankActivity.showLoadingDialog(true, true);
        } else if (it instanceof p) {
            selectBankForToBankActivity.showLoadingDialog(false, true);
            AllBankListResp allBankListResp = (AllBankListResp) ((p) it).f27360a;
            if (allBankListResp.isSuccess()) {
                SelectBankForToBankActivity selectBankForToBankActivity2 = (SelectBankForToBankActivity) this.f38431c;
                p355xf.t tVar = selectBankForToBankActivity2.f33517v;
                ((CopyOnWriteArrayList) tVar.getValue()).clear();
                AllBankListResp.DataBean data = allBankListResp.getData();
                if (data != null) {
                    ((CopyOnWriteArrayList) tVar.getValue()).clear();
                    if (data.getAllBankList() != null) {
                        ((CopyOnWriteArrayList) tVar.getValue()).addAll(data.getAllBankList());
                    }
                    selectBankForToBankActivity2.q().setList(Jd.c.g((CopyOnWriteArrayList) tVar.getValue()));
                    p355xf.t tVar2 = selectBankForToBankActivity2.t;
                    ((CopyOnWriteArrayList) tVar2.getValue()).clear();
                    Group group = (Group) selectBankForToBankActivity2.s().findViewById(e.g_match_bank);
                    if (data.getHistoryBankList() != null) {
                        ((CopyOnWriteArrayList) tVar2.getValue()).addAll(data.getHistoryBankList());
                        selectBankForToBankActivity2.t().setList((CopyOnWriteArrayList) tVar2.getValue());
                        Intrinsics.e(group);
                        h.s(group, data.getHistoryBankList().size() > 0);
                    } else {
                        Intrinsics.e(group);
                        h.c(group);
                    }
                    p355xf.t tVar3 = selectBankForToBankActivity2.f33516p;
                    ((CopyOnWriteArrayList) tVar3.getValue()).clear();
                    Group group2 = (Group) selectBankForToBankActivity2.s().findViewById(e.g_frequently_used_bank);
                    if (data.getCommonBankList() != null) {
                        ((CopyOnWriteArrayList) tVar3.getValue()).addAll(data.getCommonBankList());
                        selectBankForToBankActivity2.r().setList((CopyOnWriteArrayList) tVar3.getValue());
                        Intrinsics.e(group2);
                        h.s(group2, data.getCommonBankList().size() > 0);
                    } else {
                        Intrinsics.e(group2);
                        h.c(group2);
                    }
                }
            } else {
                ToastUtils.showLong(allBankListResp.getRespMsg(), new Object[0]);
            }
        } else if (it instanceof m) {
            selectBankForToBankActivity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof n)) {
                throw new l();
            }
            selectBankForToBankActivity.showLoadingDialog(false, true);
            ToastUtils.showLong(((n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:235:0x045b  */
    /* JADX WARN: Code duplicated, block: B:236:0x045d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0483  */
    /* JADX WARN: Code duplicated, block: B:381:0x0780  */
    /* JADX WARN: Code duplicated, block: B:387:0x078f  */
    /* JADX WARN: Code duplicated, block: B:390:0x0794  */
    /* JADX WARN: Code duplicated, block: B:392:0x079a  */
    /* JADX WARN: Code duplicated, block: B:395:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:398:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:400:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:403:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:406:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:408:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:411:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:412:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:414:0x0800  */
    /* JADX WARN: Code duplicated, block: B:415:0x0808  */
    /* JADX WARN: Code duplicated, block: B:417:0x080e  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v85 java.lang.String, still in use, count: 1, list:
      (r2v85 java.lang.String) from 0x0487: INVOKE (r0v0 'unused' boolean A[SYNTHETIC]) = (r1v132 java.lang.String), (r2v85 java.lang.String), ("") STATIC call: Ea.a.e(java.lang.String, java.lang.String, java.lang.String):boolean A[MD:(java.lang.String, java.lang.String, java.lang.String):boolean (m), REMOVE] (LINE:3)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T data;
        String strO;
        Boolean replace;
        A a3;
        A a10;
        String strW0;
        A a11;
        A a12;
        A a13;
        FlashSalesProductsItemBean flashSalesProductsItemBean;
        Rd.H h7;
        ArrayList<FlashSalesProductsDataBean> products;
        Object[] objArr;
        Rd.H h10;
        Rd.H h11;
        String desc;
        String title;
        Rd.H h12;
        DailyFlashSalesView dailyFlashSalesView;
        Boolean boolValueOf;
        C0107d c0107d;
        C0107d c0107d2;
        C0107d c0107d3;
        boolean zEquals;
        String str;
        Intent intentA;
        MemberDetailResp memberDetailResp;
        int i7 = 2;
        String desc2 = "";
        strW = null;
        strW = null;
        String strW = null;
        Object obj2 = null;
        int i10 = 1;
        BaseActivity baseActivity = this.f38431c;
        Object obj3 = this.f38430b;
        switch (this.f38429a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ScheduleTopUpTaskStatusActivity scheduleTopUpTaskStatusActivity = (ScheduleTopUpTaskStatusActivity) obj3;
                if (it instanceof o) {
                    scheduleTopUpTaskStatusActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    scheduleTopUpTaskStatusActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (commonBeanResult.isSuccess() && (data = commonBeanResult.data) != 0) {
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        ScheduleTopUpTaskBean scheduleTopUpTaskBean = (ScheduleTopUpTaskBean) data;
                        int i11 = ScheduleTopUpTaskStatusActivity.f26483f;
                        ScheduleTopUpTaskStatusActivity scheduleTopUpTaskStatusActivity2 = (ScheduleTopUpTaskStatusActivity) baseActivity;
                        Long rechargeAmount = scheduleTopUpTaskBean.getRechargeAmount();
                        if (rechargeAmount != null) {
                            long jLongValue = rechargeAmount.longValue();
                            A a14 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a14 != null) {
                                LinearLayout linearLayout = a14.f7970d;
                                OrderResultItemModel orderResultItemModel = new OrderResultItemModel(scheduleTopUpTaskStatusActivity2, Pd.f.qt_schedule_top_up_amount, r0.B(jLongValue, false));
                                orderResultItemModel.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel.getItemValueTv().setTextSize(14.0f);
                                linearLayout.addView(orderResultItemModel);
                            }
                        }
                        Long paymentAmount = scheduleTopUpTaskBean.getPaymentAmount();
                        if (paymentAmount != null) {
                            long jLongValue2 = paymentAmount.longValue();
                            A a15 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a15 != null) {
                                LinearLayout linearLayout2 = a15.f7970d;
                                OrderResultItemModel orderResultItemModel2 = new OrderResultItemModel(scheduleTopUpTaskStatusActivity2, v.cv_payment_amount, r0.B(jLongValue2, false));
                                orderResultItemModel2.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel2.getItemValueTv().setTextSize(14.0f);
                                linearLayout2.addView(orderResultItemModel2);
                            }
                        }
                        Long discountAmount = scheduleTopUpTaskBean.getDiscountAmount();
                        if (discountAmount != null) {
                            long jLongValue3 = discountAmount.longValue();
                            if (jLongValue3 > 0 && (a13 = (A) scheduleTopUpTaskStatusActivity2.f27334c) != null) {
                                LinearLayout linearLayout3 = a13.f7970d;
                                OrderResultItemModel orderResultItemModel3 = new OrderResultItemModel(scheduleTopUpTaskStatusActivity2, k.core_discount, r0.B(jLongValue3, false));
                                orderResultItemModel3.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel3.getItemValueTv().setTextSize(14.0f);
                                linearLayout3.addView(orderResultItemModel3);
                            }
                        }
                        A a16 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                        if (a16 != null) {
                            LinearLayout linearLayout4 = a16.f7970d;
                            TextView textView = new TextView(scheduleTopUpTaskStatusActivity2);
                            textView.setText(scheduleTopUpTaskBean.getDesc());
                            textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, scheduleTopUpTaskStatusActivity2));
                            textView.setTextSize(12.0f);
                            textView.setPadding(CommonViewExtKt.getDp(12), 0, CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12));
                            linearLayout4.addView(textView);
                        }
                        String billerName = scheduleTopUpTaskBean.getBillerName();
                        if (billerName != null) {
                            if (billerName.length() <= 0) {
                                billerName = null;
                            }
                            if (billerName != null && (a12 = (A) scheduleTopUpTaskStatusActivity2.f27334c) != null) {
                                LinearLayout linearLayout5 = a12.f7971e;
                                OrderResultItemModel orderResultItemModel4 = new OrderResultItemModel(scheduleTopUpTaskStatusActivity2, Vd.a.qt_bill_provider, billerName);
                                orderResultItemModel4.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel4.getItemValueTv().setTextSize(14.0f);
                                linearLayout5.addView(orderResultItemModel4);
                            }
                        }
                        String phone = scheduleTopUpTaskBean.getPhone();
                        if (phone != null) {
                            if (phone.length() <= 0) {
                                phone = null;
                            }
                            if (phone != null && (strW0 = r0.w0(phone)) != null && (a11 = (A) scheduleTopUpTaskStatusActivity2.f27334c) != null) {
                                LinearLayout linearLayout6 = a11.f7971e;
                                OrderResultItemModel orderResultItemModel5 = new OrderResultItemModel(scheduleTopUpTaskStatusActivity2, k.core_recipient_mobile, CommonExtKt.formatWithPhone(strW0));
                                orderResultItemModel5.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel5.getItemValueTv().setTextSize(14.0f);
                                linearLayout6.addView(orderResultItemModel5);
                            }
                        }
                        if (TextUtils.isEmpty(scheduleTopUpTaskBean.getTimeText())) {
                            Integer timeType = scheduleTopUpTaskBean.getTimeType();
                            if (timeType != null && timeType.intValue() == 1) {
                                Integer timeValue = scheduleTopUpTaskBean.getTimeValue();
                                strO = G.o("Every ", timeValue != null ? CommonViewExtKt.toDayOfWeekByIndex(timeValue.intValue()) : null);
                            } else {
                                Integer timeType2 = scheduleTopUpTaskBean.getTimeType();
                                if (timeType2 != null && timeType2.intValue() == 3) {
                                    Integer timeValue2 = scheduleTopUpTaskBean.getTimeValue();
                                    String str2 = (timeValue2 != null && timeValue2.intValue() == 1) ? "day" : "days";
                                    strO = "Every " + scheduleTopUpTaskBean.getTimeValue() + " " + str2;
                                } else {
                                    Integer timeValue3 = scheduleTopUpTaskBean.getTimeValue();
                                    strO = G.o("Every ", timeValue3 != null ? CommonViewExtKt.toDayOfMonthByIndex(timeValue3.intValue()) : null);
                                }
                            }
                        } else {
                            strO = scheduleTopUpTaskBean.getTimeText();
                        }
                        if (strO != null) {
                            if (strO.length() <= 0) {
                                strO = null;
                            }
                            if (strO != null && (a10 = (A) scheduleTopUpTaskStatusActivity2.f27334c) != null) {
                                LinearLayout linearLayout7 = a10.f7971e;
                                OrderResultItemModel orderResultItemModel6 = new OrderResultItemModel(scheduleTopUpTaskStatusActivity2, Pd.f.qt_frequency, strO);
                                orderResultItemModel6.getItemKeyTv().setTextSize(14.0f);
                                orderResultItemModel6.getItemValueTv().setTextSize(14.0f);
                                orderResultItemModel6.getItemValueTv().setTextColor(CommonViewExtKt.colorInt(b.ppColorPrimary, scheduleTopUpTaskStatusActivity2));
                                linearLayout7.addView(orderResultItemModel6);
                            }
                        }
                        Boolean replace2 = scheduleTopUpTaskBean.getReplace();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.c(replace2, bool) && !TextUtils.isEmpty(scheduleTopUpTaskBean.getFrequencyRemark()) && (a3 = (A) scheduleTopUpTaskStatusActivity2.f27334c) != null) {
                            LinearLayout linearLayout8 = a3.f7971e;
                            HtmlTextView htmlTextView = new HtmlTextView(scheduleTopUpTaskStatusActivity2);
                            String frequencyRemark = scheduleTopUpTaskBean.getFrequencyRemark();
                            Intrinsics.e(frequencyRemark);
                            htmlTextView.setHtml(frequencyRemark);
                            htmlTextView.setTextSize(12.0f);
                            htmlTextView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, scheduleTopUpTaskStatusActivity2));
                            htmlTextView.setPadding(CommonViewExtKt.getDp(12.0f), CommonViewExtKt.getDp(6.0f), CommonViewExtKt.getDp(12.0f), CommonViewExtKt.getDp(8.0f));
                            linearLayout8.addView(htmlTextView);
                        }
                        T data2 = commonBeanResult.data;
                        Intrinsics.checkNotNullExpressionValue(data2, "data");
                        ScheduleTopUpTaskBean scheduleTopUpTaskBean2 = (ScheduleTopUpTaskBean) data2;
                        String darkBenefitsImg = scheduleTopUpTaskStatusActivity2.isDarkMode() ? scheduleTopUpTaskBean2.getDarkBenefitsImg() : scheduleTopUpTaskBean2.getBenefitsImg();
                        if (!TextUtils.isEmpty(darkBenefitsImg)) {
                            A a17 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a17 != null) {
                                h.s(a17.f7972f, true);
                            }
                            A a18 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            r0.l1(darkBenefitsImg, a18 != null ? a18.f7968b : null);
                        }
                        if (Intrinsics.c(((ScheduleTopUpTaskBean) commonBeanResult.data).getCashInGuidance(), bool)) {
                            Long rechargeAmount2 = ((ScheduleTopUpTaskBean) commonBeanResult.data).getRechargeAmount();
                            if ((rechargeAmount2 != null ? rechargeAmount2.longValue() : 0L) > 0) {
                                Long rechargeAmount3 = ((ScheduleTopUpTaskBean) commonBeanResult.data).getRechargeAmount();
                                new NotEnoughAssetsDialog(scheduleTopUpTaskStatusActivity2, rechargeAmount3 != null ? rechargeAmount3.longValue() : 0L).transType("04").show();
                            }
                        }
                        if (Intrinsics.c(((ScheduleTopUpTaskBean) commonBeanResult.data).getPushGuidance(), bool)) {
                            A a19 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a19 != null) {
                                h.s(a19.f7976o, true);
                            }
                            A a20 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a20 != null) {
                                h.s(a20.f7974i, false);
                            }
                        } else {
                            A a21 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a21 != null) {
                                h.s(a21.f7976o, false);
                            }
                            A a22 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a22 != null) {
                                h.s(a22.f7974i, true);
                            }
                        }
                        A a23 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                        if (a23 != null) {
                            TextView textView2 = a23.f7973g;
                            ScheduleTopUpTaskBean scheduleTopUpTaskBean3 = (ScheduleTopUpTaskBean) commonBeanResult.data;
                            h.s(textView2, (scheduleTopUpTaskBean3 == null || (replace = scheduleTopUpTaskBean3.getReplace()) == null) ? false : replace.booleanValue());
                        }
                        ScheduleTopUpTaskBean scheduleTopUpTaskBean4 = (ScheduleTopUpTaskBean) commonBeanResult.data;
                        if (scheduleTopUpTaskBean4 != null ? Intrinsics.c(scheduleTopUpTaskBean4.getReplace(), bool) : false) {
                            A a24 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a24 != null) {
                                a24.f7969c.setImageResource(Pd.b.qt_icon_exchange_outline);
                            }
                            A a25 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a25 != null) {
                                a25.f7977p.setText("Top-up frequency updated");
                            }
                            A a26 = (A) scheduleTopUpTaskStatusActivity2.f27334c;
                            if (a26 != null) {
                                h.c(a26.f7975j);
                            }
                        }
                    }
                } else if (it instanceof m) {
                    scheduleTopUpTaskStatusActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    scheduleTopUpTaskStatusActivity.showLoadingDialog(false, true);
                    ToastUtils.showShort(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) obj3;
                if (it2 instanceof o) {
                    topupAirtimeActivity.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    topupAirtimeActivity.showLoadingDialog(false, true);
                    CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((p) it2).f27360a;
                    if (commonListResultV2.isSuccess()) {
                        Collection collection = commonListResultV2.data;
                        TopupAirtimeActivity topupAirtimeActivity2 = (TopupAirtimeActivity) baseActivity;
                        if (collection == null || collection.isEmpty()) {
                            int i12 = TopupAirtimeActivity.f26495x0;
                            Rd.H h13 = (Rd.H) topupAirtimeActivity2.f27334c;
                            if (h13 != null) {
                                h.c(h13.f8057B);
                            }
                        } else {
                            List<T> list = commonListResultV2.data;
                            if (list != 0) {
                                topupAirtimeActivity2.f26516u0 = list;
                            }
                            if (topupAirtimeActivity2.f26505Z != null) {
                                for (Object obj4 : topupAirtimeActivity2.f26516u0) {
                                    String billerName2 = ((FlashSalesProductsItemBean) obj4).getBillerName();
                                    if (billerName2 != null) {
                                        QueryAirtimeV2Rsp.DataBean dataBean = topupAirtimeActivity2.f26505Z;
                                        zEquals = billerName2.equals(dataBean != null ? dataBean.getName() : null);
                                    } else {
                                        zEquals = false;
                                    }
                                    if (zEquals) {
                                        obj2 = obj4;
                                        flashSalesProductsItemBean = (FlashSalesProductsItemBean) obj2;
                                        if (flashSalesProductsItemBean == null) {
                                            h7 = (Rd.H) topupAirtimeActivity2.f27334c;
                                            if (h7 != null) {
                                                h.c(h7.f8057B);
                                            }
                                        } else {
                                            products = flashSalesProductsItemBean.getProducts();
                                            if (products != null || products.isEmpty()) {
                                                objArr = true;
                                            } else {
                                                objArr = false;
                                            }
                                            if (objArr == true) {
                                                h7 = (Rd.H) topupAirtimeActivity2.f27334c;
                                                if (h7 != null) {
                                                    h.c(h7.f8057B);
                                                }
                                            } else {
                                                h10 = (Rd.H) topupAirtimeActivity2.f27334c;
                                                if (h10 != null) {
                                                    h10.f8057B.setList(flashSalesProductsItemBean.getProducts());
                                                }
                                                h11 = (Rd.H) topupAirtimeActivity2.f27334c;
                                                if (h11 != null) {
                                                    h.C(h11.f8057B);
                                                }
                                                desc = flashSalesProductsItemBean.getDesc();
                                                title = flashSalesProductsItemBean.getTitle();
                                                h12 = (Rd.H) topupAirtimeActivity2.f27334c;
                                                if (h12 != null) {
                                                    dailyFlashSalesView = h12.f8057B;
                                                    boolValueOf = Boolean.valueOf(!TextUtils.isEmpty(title));
                                                    if (title == null) {
                                                        title = "";
                                                    }
                                                    desc2 = desc != null ? desc : "";
                                                    Intrinsics.checkNotNullParameter(title, "title");
                                                    Intrinsics.checkNotNullParameter(desc2, "desc");
                                                    if (boolValueOf.equals(Boolean.TRUE)) {
                                                        c0107d2 = dailyFlashSalesView.f26583a;
                                                        if (c0107d2 != null) {
                                                            ((IconicsImageView) c0107d2.f682d).setVisibility(0);
                                                        }
                                                        c0107d3 = dailyFlashSalesView.f26583a;
                                                        if (c0107d3 != null) {
                                                            ((IconicsImageView) c0107d3.f682d).setOnClickListener(new J(dailyFlashSalesView, i10, title, desc2));
                                                        }
                                                    } else {
                                                        c0107d = dailyFlashSalesView.f26583a;
                                                        if (c0107d != null) {
                                                            ((IconicsImageView) c0107d.f682d).setVisibility(8);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                flashSalesProductsItemBean = (FlashSalesProductsItemBean) obj2;
                                if (flashSalesProductsItemBean == null) {
                                    h7 = (Rd.H) topupAirtimeActivity2.f27334c;
                                    if (h7 != null) {
                                        h.c(h7.f8057B);
                                    }
                                } else {
                                    products = flashSalesProductsItemBean.getProducts();
                                    if (products != null) {
                                        objArr = true;
                                    } else {
                                        objArr = true;
                                    }
                                    if (objArr == true) {
                                        h7 = (Rd.H) topupAirtimeActivity2.f27334c;
                                        if (h7 != null) {
                                            h.c(h7.f8057B);
                                        }
                                    } else {
                                        h10 = (Rd.H) topupAirtimeActivity2.f27334c;
                                        if (h10 != null) {
                                            h10.f8057B.setList(flashSalesProductsItemBean.getProducts());
                                        }
                                        h11 = (Rd.H) topupAirtimeActivity2.f27334c;
                                        if (h11 != null) {
                                            h.C(h11.f8057B);
                                        }
                                        desc = flashSalesProductsItemBean.getDesc();
                                        title = flashSalesProductsItemBean.getTitle();
                                        h12 = (Rd.H) topupAirtimeActivity2.f27334c;
                                        if (h12 != null) {
                                            dailyFlashSalesView = h12.f8057B;
                                            boolValueOf = Boolean.valueOf(!TextUtils.isEmpty(title));
                                            if (title == null) {
                                                title = "";
                                            }
                                            if (desc != null) {
                                            }
                                            Intrinsics.checkNotNullParameter(title, "title");
                                            Intrinsics.checkNotNullParameter(desc2, "desc");
                                            if (boolValueOf.equals(Boolean.TRUE)) {
                                                c0107d2 = dailyFlashSalesView.f26583a;
                                                if (c0107d2 != null) {
                                                    ((IconicsImageView) c0107d2.f682d).setVisibility(0);
                                                }
                                                c0107d3 = dailyFlashSalesView.f26583a;
                                                if (c0107d3 != null) {
                                                    ((IconicsImageView) c0107d3.f682d).setOnClickListener(new J(dailyFlashSalesView, i10, title, desc2));
                                                }
                                            } else {
                                                c0107d = dailyFlashSalesView.f26583a;
                                                if (c0107d != null) {
                                                    ((IconicsImageView) c0107d.f682d).setVisibility(8);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (it2 instanceof m) {
                    topupAirtimeActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    topupAirtimeActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    ((n) it2).getClass();
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        Function0 function0 = (Function0) ((com.transsnet.palmpay.core.base.l) obj3).f27356m;
                        if (((CommonResult) ((p) it3).f27360a).isSuccess()) {
                            int i13 = TopupAirtimeActivity.f26495x0;
                            ((DataBundleRecordHistoryViewModel) ((TopupAirtimeActivity) baseActivity).f26504Y.getValue()).d();
                            if (function0 != null) {
                                function0.invoke();
                            }
                            ToastUtils.showLong(k.core_delete_successfully);
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ((n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                TopupResultActivityV2 topupResultActivityV2 = (TopupResultActivityV2) obj3;
                if (it4 instanceof o) {
                    topupResultActivityV2.showLoadingDialog(true, true);
                } else {
                    TopupResultActivityV2 topupResultActivityV3 = (TopupResultActivityV2) baseActivity;
                    if (it4 instanceof p) {
                        topupResultActivityV2.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it4).f27360a;
                        int i14 = TopupResultActivityV2.f26521k0;
                        if (i0.W(topupResultActivityV3)) {
                            if (commonBeanResult2.isSuccess() && Intrinsics.c(commonBeanResult2.data, Boolean.TRUE)) {
                                topupResultActivityV3.p();
                                ToastUtils.showLong(topupResultActivityV3.getString(Pd.f.qt_low_balance_setup_complete), new Object[0]);
                                n0.g().w("PaySuccess_Lowbalance_SetSuccessToast_show", kotlin.collections.F.b(new Pair("transType", "04")));
                            } else if (Intrinsics.c(commonBeanResult2.getRespCode(), "11100115")) {
                                String respMsg = commonBeanResult2.getRespMsg();
                                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                                if (i0.W(topupResultActivityV3)) {
                                    c cVar = new c(topupResultActivityV3);
                                    cVar.f6598d = respMsg;
                                    cVar.f6606l = 17;
                                    cVar.d(Pd.f.qt_low_balance_enable_push, new H(topupResultActivityV3, i7));
                                    cVar.g();
                                }
                                n0.g().w("PaySuccess_Lowbalance_SetSuccessPopup_show", kotlin.collections.F.b(new Pair("transType", "04")));
                            } else {
                                topupResultActivityV3.q();
                                n0.g().w("PaySuccess_Lowbalance_SetFailedToast_show", kotlin.collections.F.b(new Pair("transType", "04")));
                            }
                        }
                    } else if (it4 instanceof m) {
                        topupResultActivityV2.showLoadingDialog(false, true);
                    } else {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        topupResultActivityV2.showLoadingDialog(false, true);
                        ((n) it4).getClass();
                        if (i0.W(topupResultActivityV3)) {
                            int i15 = TopupResultActivityV2.f26521k0;
                            topupResultActivityV3.q();
                            n0.g().w("PaySuccess_Lowbalance_SetFailedToast_show", kotlin.collections.F.b(new Pair("transType", "04")));
                        }
                    }
                }
                return Unit.f38893a;
            case 4:
                q it5 = (q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                BuyEarlyRefundDetailActivity buyEarlyRefundDetailActivity = (BuyEarlyRefundDetailActivity) obj3;
                if (it5 instanceof o) {
                    buyEarlyRefundDetailActivity.showLoadingDialog(true, true);
                } else if (it5 instanceof p) {
                    buyEarlyRefundDetailActivity.showLoadingDialog(false, true);
                    BuyEarlyRefundOrderDetailRsp buyEarlyRefundOrderDetailRsp = (BuyEarlyRefundOrderDetailRsp) ((p) it5).f27360a;
                    BuyEarlyRefundDetailActivity buyEarlyRefundDetailActivity2 = (BuyEarlyRefundDetailActivity) baseActivity;
                    if (buyEarlyRefundOrderDetailRsp.isSuccess()) {
                        BuyEarlyRefundOrderDetailRsp.DataBean dataBean2 = buyEarlyRefundOrderDetailRsp.data;
                        buyEarlyRefundDetailActivity2.f34673d = dataBean2;
                        if (dataBean2 != null) {
                            C0107d c0107d4 = buyEarlyRefundDetailActivity2.f34674e;
                            if (c0107d4 != null) {
                                ((OrderResultHeaderModel) c0107d4.f683e).c(r0.B(dataBean2.amount, true));
                            }
                            C0107d c0107d5 = buyEarlyRefundDetailActivity2.f34674e;
                            if (c0107d5 != null) {
                                ((OrderResultHeaderModel) c0107d5.f683e).k("Successfully");
                            }
                            C0107d c0107d6 = buyEarlyRefundDetailActivity2.f34674e;
                            if (c0107d6 != null) {
                                ((OrderResultHeaderModel) c0107d6.f683e).l(OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, buyEarlyRefundDetailActivity2, 0.0f, 2, null));
                            }
                            OrderResultItemModel orderResultItemModel7 = new OrderResultItemModel(buyEarlyRefundDetailActivity2, 1002, buyEarlyRefundDetailActivity2.getString(k.core_receipt_transaction_type), buyEarlyRefundDetailActivity2.getString(k.core_early_refund));
                            C0107d c0107d7 = buyEarlyRefundDetailActivity2.f34674e;
                            if (c0107d7 != null) {
                                ((LinearLayout) c0107d7.f680b).addView(orderResultItemModel7);
                            }
                            OrderResultItemModel orderResultItemModel8 = new OrderResultItemModel(buyEarlyRefundDetailActivity2, 1002, buyEarlyRefundDetailActivity2.getString(k.core_pay_method), r0.q0(dataBean2.payerAccountType, dataBean2.bankName, dataBean2.payerCardNo));
                            C0107d c0107d8 = buyEarlyRefundDetailActivity2.f34674e;
                            if (c0107d8 != null) {
                                ((LinearLayout) c0107d8.f680b).addView(orderResultItemModel8);
                            }
                            OrderResultItemModel orderResultItemModel9 = new OrderResultItemModel(buyEarlyRefundDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, buyEarlyRefundDetailActivity2.getString(k.core_receipt_transaction_id), dataBean2.orderNo);
                            C0107d c0107d9 = buyEarlyRefundDetailActivity2.f34674e;
                            if (c0107d9 != null) {
                                ((LinearLayout) c0107d9.f680b).addView(orderResultItemModel9);
                            }
                            OrderResultItemModel orderResultItemModel10 = new OrderResultItemModel(buyEarlyRefundDetailActivity2, 1002, buyEarlyRefundDetailActivity2.getString(k.core_completion_time), r0.Q(dataBean2.createTime));
                            C0107d c0107d10 = buyEarlyRefundDetailActivity2.f34674e;
                            if (c0107d10 != null) {
                                ((LinearLayout) c0107d10.f680b).addView(orderResultItemModel10);
                            }
                        }
                    } else {
                        String respMsg2 = buyEarlyRefundOrderDetailRsp.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                        int i16 = BuyEarlyRefundDetailActivity.f34671f;
                        c cVar2 = new c(buyEarlyRefundDetailActivity2);
                        cVar2.e(k.core_title_error_info);
                        cVar2.f6598d = respMsg2;
                        cVar2.d(k.core_try_again, new ViewOnClickListenerC1649v(buyEarlyRefundDetailActivity2, 22));
                        cVar2.g();
                    }
                } else if (it5 instanceof m) {
                    buyEarlyRefundDetailActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it5 instanceof n)) {
                        throw new l();
                    }
                    buyEarlyRefundDetailActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it5).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 5:
                return a(obj);
            case 6:
                q it6 = (q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof o)) {
                    if (it6 instanceof p) {
                        Object obj5 = ((com.transsnet.palmpay.core.base.l) obj3).f27356m;
                        QueryOrderNoRsp queryOrderNoRsp = (QueryOrderNoRsp) ((p) it6).f27360a;
                        QueryOrderNoParamReq queryOrderNoParamReq = (QueryOrderNoParamReq) obj5;
                        if (!queryOrderNoRsp.isSuccess()) {
                            ToastUtils.showShort(queryOrderNoRsp.getRespMsg(), new Object[0]);
                        } else if (!TextUtils.isEmpty(queryOrderNoParamReq != null ? queryOrderNoParamReq.payId : null) && queryOrderNoRsp.getData() != null) {
                            QueryOrderNoRsp.DataBean data3 = queryOrderNoRsp.getData();
                            if (!TextUtils.isEmpty(data3 != null ? data3.getOrderNo() : null)) {
                                String str3 = ((MeBalanceAccountActivity) baseActivity).f34742g;
                                if (str3 != null) {
                                    switch (str3) {
                                        case "1":
                                            TransHistoryRsp.DataBean.ListBean listBean = new TransHistoryRsp.DataBean.ListBean();
                                            listBean.orderNo = queryOrderNoRsp.getData().getOrderNo();
                                            listBean.transType = queryOrderNoRsp.getData().getOrderType();
                                            listBean.updateTime = queryOrderNoParamReq != null ? queryOrderNoParamReq.create : 0L;
                                            listBean.amount = queryOrderNoParamReq != null ? queryOrderNoParamReq.amount : 0L;
                                            ARouter.getInstance().build("/main/redirect_order_detail").withSerializable("extra_data", listBean).navigation();
                                            break;
                                        case "2":
                                            i0.b0("/h5/transaction-router/home?transType=" + queryOrderNoRsp.getData().getOrderType() + "&orderId=" + queryOrderNoRsp.getData().getOrderNo());
                                            break;
                                        case "3":
                                            com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("orderNo", queryOrderNoRsp.getData().getOrderNo()), new Pair("transType", queryOrderNoRsp.getData().getOrderType())), "CommonDetail");
                                            break;
                                        default:
                                            if (queryOrderNoParamReq != null && (str = queryOrderNoParamReq.payId) != null) {
                                                desc2 = str;
                                            }
                                    }
                                } else {
                                    if (queryOrderNoParamReq != null) {
                                        desc2 = str;
                                    }
                                    if (TextUtils.isEmpty(orderType)) {
                                        orderType = i0.F(desc2);
                                    }
                                    Ea.a.e(orderType, orderNo, "");
                                }
                            }
                        }
                    } else if (!(it6 instanceof m)) {
                        if (!(it6 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it6).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 7:
                q it7 = (q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                MinorAccountHistoryListActivity minorAccountHistoryListActivity = (MinorAccountHistoryListActivity) obj3;
                if (it7 instanceof o) {
                    minorAccountHistoryListActivity.showLoadingDialog(true, true);
                } else if (it7 instanceof p) {
                    minorAccountHistoryListActivity.showLoadingDialog(false, true);
                    CommonListResultV2 commonListResultV3 = (CommonListResultV2) ((p) it7).f27360a;
                    if (commonListResultV3.isSuccess()) {
                        Collection collection2 = commonListResultV3.data;
                        MinorAccountHistoryListActivity minorAccountHistoryListActivity2 = (MinorAccountHistoryListActivity) baseActivity;
                        if (collection2 == null || collection2.isEmpty()) {
                            Bc.k kVar = minorAccountHistoryListActivity2.f34765c;
                            if (kVar == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            ((ConstraintLayout) kVar.f751e).setVisibility(0);
                            Bc.k kVar2 = minorAccountHistoryListActivity2.f34765c;
                            if (kVar2 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            ((SwipeRecyclerView) kVar2.f752f).setVisibility(8);
                        } else {
                            p328ve.q qVar = minorAccountHistoryListActivity2.f34766d;
                            if (qVar == null) {
                                Intrinsics.n("mAccountHistoryAdapter");
                                throw null;
                            }
                            qVar.setList(commonListResultV3.data);
                        }
                    }
                } else if (it7 instanceof m) {
                    minorAccountHistoryListActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it7 instanceof n)) {
                        throw new l();
                    }
                    minorAccountHistoryListActivity.showLoadingDialog(false, true);
                    ((n) it7).getClass();
                }
                return Unit.f38893a;
            case 8:
                q it8 = (q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                MinorAccountListActivity minorAccountListActivity = (MinorAccountListActivity) obj3;
                if (it8 instanceof o) {
                    minorAccountListActivity.showLoadingDialog(true, true);
                } else if (it8 instanceof p) {
                    minorAccountListActivity.showLoadingDialog(false, true);
                    CommonListResultV2 commonListResultV4 = (CommonListResultV2) ((p) it8).f27360a;
                    if (commonListResultV4.isSuccess()) {
                        Collection collection3 = commonListResultV4.data;
                        MinorAccountListActivity minorAccountListActivity2 = (MinorAccountListActivity) baseActivity;
                        if (collection3 == null || collection3.isEmpty()) {
                            Bc.k kVar3 = minorAccountListActivity2.f34768c;
                            if (kVar3 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            ((ConstraintLayout) kVar3.f751e).setVisibility(0);
                            Bc.k kVar4 = minorAccountListActivity2.f34768c;
                            if (kVar4 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            ((SwipeRecyclerView) kVar4.f752f).setVisibility(8);
                        } else {
                            p328ve.q qVar2 = minorAccountListActivity2.f34769d;
                            if (qVar2 == null) {
                                Intrinsics.n("mAccountHistoryAdapter");
                                throw null;
                            }
                            qVar2.setList(commonListResultV4.data);
                        }
                    }
                } else if (it8 instanceof m) {
                    minorAccountListActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it8 instanceof n)) {
                        throw new l();
                    }
                    minorAccountListActivity.showLoadingDialog(false, true);
                    ((n) it8).getClass();
                }
                return Unit.f38893a;
            case 9:
                return b(obj);
            case 10:
                return c(obj);
            case 11:
                return d(obj);
            case 12:
                return e(obj);
            case 13:
                String str4 = (String) obj;
                DialogConfigSettingsResp dialogConfigSettingsResp = (DialogConfigSettingsResp) ((CommonBeanResult) obj3).data;
                if (dialogConfigSettingsResp != null && 11 == dialogConfigSettingsResp.getStyle()) {
                    n0.g().k(new ClickEvent("t3_upgrade_electricity_popup_click").add("Level", BaseApplication.get().getUser().getMobileMoneyAccountTier()));
                }
                if (!TextUtils.isEmpty(str4) && (intentA = F.a((TransferResultActivity) baseActivity, str4)) != null) {
                    ActivityUtils.startActivity(intentA);
                }
                return Unit.f38893a;
            case 14:
                q it9 = (q) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity = (BettingAutoRenewOverlayActivity) obj3;
                if (it9 instanceof o) {
                    bettingAutoRenewOverlayActivity.showLoadingDialog(true, true);
                } else {
                    BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity2 = (BettingAutoRenewOverlayActivity) baseActivity;
                    if (it9 instanceof p) {
                        bettingAutoRenewOverlayActivity.showLoadingDialog(false, true);
                        int i17 = BettingAutoRenewOverlayActivity.f26654g;
                        bettingAutoRenewOverlayActivity2.n();
                    } else if (it9 instanceof m) {
                        bettingAutoRenewOverlayActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it9 instanceof n)) {
                            throw new l();
                        }
                        bettingAutoRenewOverlayActivity.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it9).f27358a, new Object[0]);
                        ((n) it9).getClass();
                        int i18 = BettingAutoRenewOverlayActivity.f26654g;
                        bettingAutoRenewOverlayActivity2.n();
                    }
                }
                return Unit.f38893a;
            case 15:
                return f(obj);
            case 16:
                return g(obj);
            case 17:
                return h(obj);
            case 18:
                return i(obj);
            case 19:
                return j(obj);
            case 20:
                return k(obj);
            case 21:
                return l(obj);
            case 22:
                return m(obj);
            case 23:
                return n(obj);
            case 24:
                return o(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return p(obj);
            case 26:
                return q(obj);
            case 27:
                return r(obj);
            case 28:
                return s(obj);
            default:
                q it10 = (q) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                PersonalHomePageActivity personalHomePageActivity = (PersonalHomePageActivity) obj3;
                if (it10 instanceof o) {
                    personalHomePageActivity.showLoadingDialog(true, true);
                } else if (it10 instanceof p) {
                    personalHomePageActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((p) it10).f27360a;
                    if (commonBeanResult3.isSuccess() && (memberDetailResp = (MemberDetailResp) commonBeanResult3.data) != null) {
                        PersonalHomePageActivity personalHomePageActivity2 = (PersonalHomePageActivity) baseActivity;
                        personalHomePageActivity2.t = memberDetailResp;
                        Object value = personalHomePageActivity2.f33570p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        r0.m1(memberDetailResp.getHeadPortrait(), (ImageView) value);
                        Object value2 = personalHomePageActivity2.f33569o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        TextView textView3 = (TextView) value2;
                        String fullName = memberDetailResp.getFullName();
                        desc2 = fullName != null ? fullName : "";
                        textView3.setText(desc2);
                        String palmPayTag = memberDetailResp.getPalmPayTag();
                        if (palmPayTag != null && !StringsKt.F(palmPayTag)) {
                            p355xf.t tVar = personalHomePageActivity2.f33567i;
                            Object value3 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            h.s((LinearLayout) value3, true);
                            Object value4 = personalHomePageActivity2.f33566g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((TextView) value4).setText("PalmPay Tag: " + memberDetailResp.getPalmPayTag());
                            Object value5 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            ((LinearLayout) value5).setOnClickListener(personalHomePageActivity2.f33561H);
                        }
                        Object value6 = personalHomePageActivity2.f33562c.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        TextView textView4 = (TextView) value6;
                        if (textView4 != null) {
                            h.s(textView4, Intrinsics.c(memberDetailResp.getHasFavorite(), Boolean.TRUE));
                        }
                        if (!TextUtils.isEmpty(memberDetailResp.getPhone())) {
                            Object value7 = personalHomePageActivity2.f33565f.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            TextView textView5 = (TextView) value7;
                            if (!TextUtils.isEmpty(memberDetailResp.getPpAccountNo())) {
                                String ppAccountNo = memberDetailResp.getPpAccountNo();
                                if (ppAccountNo != null) {
                                    strW = r0.w(ppAccountNo);
                                }
                            } else if (personalHomePageActivity2.f33558A) {
                                String phone2 = memberDetailResp.getPhone();
                                if (phone2 != null) {
                                    strW = r0.u(phone2);
                                }
                            } else {
                                String phone3 = memberDetailResp.getPhone();
                                if (phone3 != null) {
                                    strW = r0.w(phone3);
                                }
                            }
                            G.x("Account Number: ", strW, textView5);
                        }
                        Object value8 = personalHomePageActivity2.f33568j.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ((View) value8).setVisibility(Intrinsics.c(memberDetailResp.getAuthen(), Boolean.TRUE) ? 0 : 8);
                    }
                } else if (it10 instanceof m) {
                    personalHomePageActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it10 instanceof n)) {
                        throw new l();
                    }
                    personalHomePageActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it10).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
