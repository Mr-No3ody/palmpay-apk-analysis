package p173ld;

import Ac.e;
import C0.G;
import Fe.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ya.f;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.M;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetWebActivity;
import com.transsnet.palmpay.betting.ui.activity.BettingWithdrawConfirmPaymentOrderActivity;
import com.transsnet.palmpay.betting.ui.activity.BettingWithdrawHomeActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.DefaultPayMethodReq;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.dialog.CommonQRCodeDialog;
import com.transsnet.palmpay.core.dialog.PaymentRewardsDialog;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.dialog.ShareImgDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.resp.UnfreezePopupDataResp;
import com.transsnet.palmpay.credit.ui.activity.AliFaceActivity;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.MonoConnectActivity;
import com.transsnet.palmpay.credit.ui.activity.OcHomeMobileInstalmentStandaloneActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHistoryActivity;
import com.transsnet.palmpay.main.export.bean.rsp.PalmSafeDetail;
import com.transsnet.palmpay.send_money.bean.SendMobileReq;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.CompensationDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.SetAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.SetAmountActivity1;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToMobileActivity;
import com.transsnet.palmpay.ui.activity.me.MeBalanceAccountActivity;
import com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity;
import com.transsnet.palmpay.ui.activity.palmsafe.PalmSafeDetailActivity;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeOrderDetailActivity;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mh.i;
import org.chromium.support_lib_boundary.util.b;
import p059e1.a;
import p159kd.h;
import p185ma.t;
import p215o4.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39334b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f39333a = i7;
        this.f39334b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        Function1 function1;
        PalmSafeDetail palmSafeDetail;
        boolean z3 = true;
        String string = null;
        final int i7 = 0;
        Object obj = this.f39334b;
        switch (this.f39333a) {
            case 0:
                p pVar = (p) obj;
                int adapterPosition = pVar.getAdapterPosition();
                q qVar = pVar.f39335d;
                BaseRecyclerViewAdapter$ItemViewOnClickListener baseRecyclerViewAdapter$ItemViewOnClickListener = qVar.f4986c;
                if (baseRecyclerViewAdapter$ItemViewOnClickListener != null && qVar.f4985b != null) {
                    baseRecyclerViewAdapter$ItemViewOnClickListener.OnItemViewOnClick(view, qVar.getItem(adapterPosition), pVar);
                    break;
                }
                break;
            case 1:
                int i10 = MeBalanceAccountActivity.f34737j;
                int id2 = view.getId();
                MeBalanceAccountActivity meBalanceAccountActivity = (MeBalanceAccountActivity) obj;
                if (id2 != e.tvAll && id2 != e.mapbaViewAll2) {
                    if (id2 == e.mapbaEye) {
                        meBalanceAccountActivity.getClass();
                        a.X("main_sp_show_balance", !a.C("main_sp_show_balance", false));
                        meBalanceAccountActivity.n();
                        r0.P1(MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE);
                        break;
                    } else if (id2 == e.mapbaWithdraw) {
                        d.F("/cashout/withdraw_home");
                        break;
                    } else if (id2 == e.mapbaFund) {
                        ARouter.getInstance().build("/cashin_out/add_money").withFlags(536870912).navigation(meBalanceAccountActivity);
                        break;
                    } else if (id2 == e.mapbaUpgradeKYC) {
                        if (!BaseApplication.get().getUser().isTier2User()) {
                            d.F("/account/palmpayLevel");
                        } else {
                            d.F("/account/upgrade_tier3_export");
                        }
                        break;
                    } else if (id2 != e.tvCashBoxAutoSave) {
                        if (id2 == e.layoutSecurityGuaranteed) {
                            d.Q(com.transsnet.palmpay.core.config.d.g("/h5/security-guarantee"));
                        }
                        break;
                    } else {
                        Pair pair = meBalanceAccountActivity.f34741f;
                        if (pair != null) {
                            if (!Intrinsics.c(pair.f38891a, Boolean.TRUE)) {
                                d.F("/manage_money/cash_box_auto_save_activity");
                            } else {
                                d.F("/manage_money/cash_box_main_activity");
                            }
                            break;
                        }
                    }
                } else {
                    ARouter.getInstance().build("/main/balance_statement").withFlags(536870912).navigation(meBalanceAccountActivity);
                    break;
                }
                break;
            case 2:
                if (!r0.U0()) {
                    String phoneNumber = BaseApplication.getInstance().getUser().getPhoneNumber();
                    List<Object> data = ((ScheduleTopUpTaskListFragment) obj).v().getData();
                    if ((data instanceof Collection) && data.isEmpty()) {
                        z3 = false;
                    } else {
                        Iterator<T> it = data.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.c(((ScheduleTopUpTaskBean) it.next()).getPhone(), phoneNumber)) {
                            }
                        }
                        z3 = false;
                    }
                    ARouter.getInstance().build("/airtime/airtime_schedule_topup_task_manager").withBoolean("extra_type", z3).navigation();
                    n0.g().l("Schedule_Top_Up_Airtime_Homepage_Add_Number");
                    break;
                }
                break;
            case 3:
                CommonQRCodeDialog.onClickListener$lambda$0((CommonQRCodeDialog) obj, view);
                break;
            case 4:
                PaymentRewardsDialog.initViews$lambda$6((PaymentRewardsDialog) obj, view);
                break;
            case 5:
                ((ShareImgDialog) obj).lambda$initViews$0(view);
                break;
            case 6:
                int i11 = NotificationListV2Activity.f34749i;
                NotificationListV2Activity notificationListV2Activity = (NotificationListV2Activity) obj;
                if (!new M(notificationListV2Activity).f15943b.areNotificationsEnabled()) {
                    notificationListV2Activity.f34753e = true;
                    AppUtils.gotoNotificationSettingPage(notificationListV2Activity);
                } else {
                    q0 q0Var = (q0) notificationListV2Activity.f27350a;
                    if (q0Var != null) {
                        NotificationSettings notificationSettings = new NotificationSettings();
                        notificationSettings.message_alert = 1;
                        notificationSettings.payments_alert = 1;
                        notificationSettings.sceneCode = 5;
                        q0Var.updateNotificationSetting(notificationSettings);
                    }
                }
                break;
            case 7:
                O2.a aVar = (O2.a) obj;
                TextView textView = (TextView) aVar.f6555c;
                if (textView != null && (text = textView.getText()) != null) {
                    string = text.toString();
                }
                n0.g().k((ClickEvent) G.f("notifications_page_element_click", "module_name", string));
                ARouter.getInstance().build("/main/notifications").withString("extra_title", string).withString("extra_data", (String) aVar.f6556d).navigation();
                break;
            case 8:
                ((mh.e) obj).dismiss();
                break;
            case 9:
                ((i) obj).dismiss();
                break;
            case 10:
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = (ModelAirtimeDataPlanQuickBuyItem) obj;
                HighlyRecommendDataBundleItemBean highlyRecommendDataBundleItemBean = modelAirtimeDataPlanQuickBuyItem.f26590A;
                if (highlyRecommendDataBundleItemBean != null && (function1 = modelAirtimeDataPlanQuickBuyItem.f26599p) != null) {
                    function1.invoke(highlyRecommendDataBundleItemBean);
                    break;
                }
                break;
            case 11:
                ((c) obj).dismiss();
                break;
            case 12:
                int i12 = PalmSafeDetailActivity.f34776f;
                Bundle bundle = new Bundle();
                CommonBeanResult commonBeanResult = ((PalmSafeDetailActivity) obj).f34778d;
                if (commonBeanResult != null && (palmSafeDetail = (PalmSafeDetail) commonBeanResult.data) != null) {
                    string = palmSafeDetail.workNo;
                }
                bundle.putString("id", string);
                d.x(bundle, "PalmSafeFeedback");
                break;
            case 13:
                int i13 = PayCodeOrderDetailActivity.f34787g;
                ((PayCodeOrderDetailActivity) obj).n();
                break;
            case 14:
                int i14 = CompensationDetailActivity.f33164o;
                ((CompensationDetailActivity) obj).onBackPressed();
                break;
            case 15:
                int i15 = SetAmountActivity.f33199g;
                SetAmountActivity setAmountActivity = (SetAmountActivity) obj;
                setAmountActivity.getClass();
                if (view.getId() == p159kd.e.set_money_confirm_bt) {
                    String string2 = setAmountActivity.f33201b.getString();
                    Intent intent = new Intent();
                    String editText = setAmountActivity.f33202c.getEditText();
                    if (!TextUtils.isEmpty(editText)) {
                        intent.putExtra("receive_remark", editText);
                    }
                    intent.putExtra("extra_amount", string2);
                    setAmountActivity.setResult(-1, intent);
                    setAmountActivity.finish();
                }
                break;
            case 16:
                int i16 = SetAmountActivity1.f33206g;
                SetAmountActivity1 setAmountActivity1 = (SetAmountActivity1) obj;
                setAmountActivity1.getClass();
                if (view.getId() == p159kd.e.set_money_confirm_bt) {
                    String string3 = setAmountActivity1.f33207a.getString();
                    Intent intent2 = new Intent();
                    intent2.putExtra("extra_amount", string3);
                    setAmountActivity1.setResult(-1, intent2);
                    setAmountActivity1.finish();
                }
                break;
            case 17:
                TradeRecordDetailActivity tradeRecordDetailActivity = (TradeRecordDetailActivity) obj;
                if (tradeRecordDetailActivity.f33218g != null) {
                    OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                    TradeRecordDetailResp.RecordDetail recordDetail = tradeRecordDetailActivity.f33218g;
                    if (recordDetail != null) {
                        orderInfoForCustomerService.paymentType = tradeRecordDetailActivity.getString(h.sm_money_transfer_label);
                        Long updateTime = recordDetail.getUpdateTime();
                        orderInfoForCustomerService.time = updateTime != null ? updateTime.longValue() : 0L;
                        Long payAmount = recordDetail.getPayAmount();
                        orderInfoForCustomerService.amount = payAmount != null ? payAmount.longValue() : 0L;
                        Long payFee = recordDetail.getPayFee();
                        orderInfoForCustomerService.fee = payFee != null ? payFee.longValue() : 0L;
                        orderInfoForCustomerService.vat = recordDetail.getTaxFee();
                        orderInfoForCustomerService.pointsUsed = recordDetail.getDeductPoint();
                        orderInfoForCustomerService.pointsEarned = recordDetail.getRedeemPoint();
                        orderInfoForCustomerService.orderNumber = recordDetail.getOrderNo();
                        orderInfoForCustomerService.orderStatus = recordDetail.getOrderStatusDesc();
                        BillProcessDetail orderStatusInfo = recordDetail.getOrderStatusInfo();
                        if (orderStatusInfo != null) {
                            orderInfoForCustomerService.faqUrl = orderStatusInfo.faqLink;
                        }
                        orderInfoForCustomerService.transType = "03";
                    }
                    i0.M(tradeRecordDetailActivity, orderInfoForCustomerService);
                }
                break;
            case 18:
                int i17 = TransferToBaseActivity.f33258Q;
                if (view.getId() == p159kd.e.tv_note_hint) {
                    TransferToBaseActivity transferToBaseActivity = (TransferToBaseActivity) obj;
                    Object value = transferToBaseActivity.f33269g.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((Group) value).setVisibility(0);
                    transferToBaseActivity.v().setVisibility(8);
                    transferToBaseActivity.f33263L = false;
                    transferToBaseActivity.q().setVisibility(8);
                    KeyboardUtils.showSoftInput(transferToBaseActivity.p());
                }
                break;
            case 19:
                int i18 = TransferToMobileActivity.f33282v0;
                TransferToMobileActivity transferToMobileActivity = (TransferToMobileActivity) obj;
                transferToMobileActivity.getClass();
                Postcard postcardWithBoolean = ARouter.getInstance().build("/send/personnal_home_page").withBoolean("isHideInfo", transferToMobileActivity.f33289r0);
                if (transferToMobileActivity.f33292u0) {
                    postcardWithBoolean.withString("MEMBER_ID", transferToMobileActivity.f33285Z).withInt("extra_type", transferToMobileActivity.f33288q0);
                    SendMobileReq sendMobileReq = transferToMobileActivity.f33283X;
                    if (!TextUtils.isEmpty(sendMobileReq != null ? sendMobileReq.getPayeeQRAccountNo() : null)) {
                        SendMobileReq sendMobileReq2 = transferToMobileActivity.f33283X;
                        postcardWithBoolean.withString("extra_data", sendMobileReq2 != null ? sendMobileReq2.getPayeeQRAccountNo() : null);
                    }
                } else {
                    postcardWithBoolean.withString("phone_number", transferToMobileActivity.f33286k0);
                }
                postcardWithBoolean.navigation();
                break;
            case 20:
                String str = BettingQuickBetWebActivity.f26693j;
                ((BettingQuickBetWebActivity) obj).getOnBackPressedDispatcher().d();
                break;
            case 21:
                BettingWithdrawConfirmPaymentOrderActivity bettingWithdrawConfirmPaymentOrderActivity = (BettingWithdrawConfirmPaymentOrderActivity) obj;
                if (bettingWithdrawConfirmPaymentOrderActivity.f26708Y != null && !r0.U0()) {
                    if (!bettingWithdrawConfirmPaymentOrderActivity.f26716u0) {
                        DefaultPayMethodReq defaultPayMethodReq = new DefaultPayMethodReq();
                        defaultPayMethodReq.transType = TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW;
                        defaultPayMethodReq.orderAmount = bettingWithdrawConfirmPaymentOrderActivity.f26709Z;
                        ((p028be.c) bettingWithdrawConfirmPaymentOrderActivity.f27350a).queryBettingDefaultPayMethod(defaultPayMethodReq);
                    } else {
                        ARouter.getInstance().build("/account/authentication").withInt("extra_mode", 3).navigation(bettingWithdrawConfirmPaymentOrderActivity, 101);
                    }
                    break;
                }
                break;
            case 22:
                int i19 = BettingWithdrawHomeActivity.f26722v;
                ((BettingWithdrawHomeActivity) obj).finish();
                break;
            case 23:
                int i20 = AliFaceActivity.f28651i;
                ((AliFaceActivity) obj).finish();
                break;
            case 24:
                int i21 = HowToUnfreezeActivity.f28656H;
                UnfreezePopupDataResp.Data data2 = (UnfreezePopupDataResp.Data) obj;
                if (data2 != null) {
                    b.Q(data2.getJumpType(), data2.getJumpPath(), data2.getJumpParams(), null);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                if (view.getId() == Ya.e.tv_note_hint) {
                    InputAmountActivity inputAmountActivity = (InputAmountActivity) obj;
                    inputAmountActivity.n().setVisibility(0);
                    inputAmountActivity.q().setVisibility(8);
                    inputAmountActivity.f28678Q = false;
                    inputAmountActivity.o().setVisibility(8);
                    KeyboardUtils.showSoftInput(inputAmountActivity.n());
                }
                break;
            case 26:
                int i22 = MonoConnectActivity.f28694q0;
                ((MonoConnectActivity) obj).finish();
                break;
            case 27:
                int i23 = OcHomeMobileInstalmentStandaloneActivity.f28699e;
                if (!r0.U0()) {
                    ((OcHomeMobileInstalmentStandaloneActivity) obj).o();
                    break;
                }
                break;
            case 28:
                int i24 = PayShopHomeActivity.f28705p0;
                Intrinsics.e(view);
                View viewInflate = LayoutInflater.from((PayShopHomeActivity) obj).inflate(f.cs_popup_pay_shop_home, (ViewGroup) null);
                final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                popupWindow.setTouchable(true);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                View viewFindViewById = viewInflate.findViewById(Ya.e.tv_help);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                p220oa.h.l(new View.OnClickListener() { // from class: sb.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PopupWindow popupWindow2 = popupWindow;
                        switch (i7) {
                            case 0:
                                int i25 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_PAY_SHOP));
                                break;
                            case 1:
                                int i26 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.b0("/instalment/nearby-merchant/home");
                                break;
                            default:
                                int i27 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.b0("/h5/activity/pay-shop-guide");
                                break;
                        }
                    }
                }, viewFindViewById);
                View viewFindViewById2 = viewInflate.findViewById(Ya.e.tv_nearby);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                final char c6 = 1 == true ? 1 : 0;
                p220oa.h.l(new View.OnClickListener() { // from class: sb.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PopupWindow popupWindow2 = popupWindow;
                        switch (c6) {
                            case 0:
                                int i25 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_PAY_SHOP));
                                break;
                            case 1:
                                int i26 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.b0("/instalment/nearby-merchant/home");
                                break;
                            default:
                                int i27 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.b0("/h5/activity/pay-shop-guide");
                                break;
                        }
                    }
                }, viewFindViewById2);
                View viewFindViewById3 = viewInflate.findViewById(Ya.e.tv_merchant);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                final int i25 = 2;
                p220oa.h.l(new View.OnClickListener() { // from class: sb.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PopupWindow popupWindow2 = popupWindow;
                        switch (i25) {
                            case 0:
                                int i26 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_PAY_SHOP));
                                break;
                            case 1:
                                int i27 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.b0("/instalment/nearby-merchant/home");
                                break;
                            default:
                                int i28 = PayShopHomeActivity.f28705p0;
                                popupWindow2.dismiss();
                                i0.b0("/h5/activity/pay-shop-guide");
                                break;
                        }
                    }
                }, viewFindViewById3);
                popupWindow.getContentView().measure(0, 0);
                popupWindow.showAsDropDown(view, 0, SizeUtils.dp2px(-6.0f));
                break;
            default:
                int i26 = ReferEarnHistoryActivity.f31864j;
                if (view.getId() == p236pc.d.jp_rl_invite) {
                    ReferEarnHistoryActivity referEarnHistoryActivity = (ReferEarnHistoryActivity) obj;
                    if (!com.transsnet.palmpay.core.config.d.t()) {
                        ShareDialog shareDialog = new ShareDialog(referEarnHistoryActivity);
                        shareDialog.setShareBusinessType(16);
                        shareDialog.setReferEarnId(referEarnHistoryActivity.f31869f);
                        shareDialog.show();
                    } else {
                        t tVar = new t(referEarnHistoryActivity);
                        tVar.f39628d = referEarnHistoryActivity.f31869f;
                        tVar.s(16);
                    }
                }
                break;
        }
    }
}
