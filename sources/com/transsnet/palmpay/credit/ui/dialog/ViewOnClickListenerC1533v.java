package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.DialogInterfaceC0834l;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener;
import com.transsnet.palmpay.credit.bean.CLPromoteData;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;
import com.transsnet.palmpay.custom_view.dialog.TipsDialog;
import com.transsnet.palmpay.custom_view.input.ModelMobileInputAdapter;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import com.transsnet.palmpay.managemoney.ui.activity.PaybackDetailActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawSureDialogFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxWithdrawFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderDetailFragment;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import p052da.C1646s;

/* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1533v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30210b;

    public /* synthetic */ ViewOnClickListenerC1533v(Object obj, int i7) {
        this.f30209a = i7;
        this.f30210b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.transsnet.palmpay.custom_view.PinEntryView$OnPinHideStateChangeListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        CashierPaymentMethodAdapter$OnPaymentMethodClickListener cashierPaymentMethodAdapter$OnPaymentMethodClickListener;
        switch (this.f30209a) {
            case 0:
                ((CLFirstBorrowDialog) this.f30210b).dismiss();
                break;
            case 1:
                CLIncreaseAmountDialogFragment cLIncreaseAmountDialogFragment = (CLIncreaseAmountDialogFragment) this.f30210b;
                CLIncreaseAmountDialogFragment.a aVar = CLIncreaseAmountDialogFragment.f29944C;
                Bundle bundle = new Bundle();
                bundle.putInt("accountType", 9);
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                String str = Eb.a.f2267a;
                bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
                bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanBorrowFlexiLoan");
                cLIncreaseAmountDialogFragment.dismiss();
                break;
            case 2:
                CLIncreaseAmountDialogFragment.a aVar2 = CLIncreaseAmountDialogFragment.f29944C;
                CLPromoteData cLPromoteData = (CLPromoteData) this.f30210b;
                if (cLPromoteData != null) {
                    Bundle bundle2 = new Bundle();
                    Long l5 = cLPromoteData.loanAmount;
                    bundle2.putLong("amount", l5 != null ? l5.longValue() : 0L);
                    Integer num = cLPromoteData.term;
                    if (num == null) {
                        num = 0;
                    }
                    bundle2.putInt(FirebaseAnalytics.Param.TERM, num.intValue());
                    Integer num2 = cLPromoteData.termSpan;
                    if (num2 == null) {
                        num2 = 0;
                    }
                    bundle2.putInt("termSpan", num2.intValue());
                    String str2 = TextUtils.isEmpty(cLPromoteData.termSpanUnit) ? "" : cLPromoteData.termSpanUnit;
                    if (str2 != null) {
                        bundle2.putString("termSpanUnit", str2);
                    }
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "AboutInstallmentLoan");
                }
                break;
            case 3:
                ((CLReceiveAccountDialog) this.f30210b).dismiss();
                break;
            case 4:
                CLTemporaryAmountDialog.initViews$lambda$2((CLTemporaryAmountDialog) this.f30210b, view);
                break;
            case 5:
                CLUpgradeInstallmentAccountDialog.initViews$lambda$0((CLUpgradeInstallmentAccountDialog) this.f30210b, view);
                break;
            case 6:
                ((CalcReturnSendCouponDialog) this.f30210b).dismiss();
                break;
            case 7:
                CreditApplicationDialogFragment.a aVar3 = CreditApplicationDialogFragment.f29952L;
                ((CreditApplicationDialogFragment) this.f30210b).dismiss();
                break;
            case 8:
                DownloadCashPageDialogFragment.a aVar4 = DownloadCashPageDialogFragment.f29959L;
                ((DownloadCashPageDialogFragment) this.f30210b).dismiss();
                Pa.i0.b0("https://h5.fleximfb.com/cash/download-guide");
                break;
            case 9:
                ((OcFeedbackSubmitResultDialog) this.f30210b).dismiss();
                break;
            case 10:
                OcInviteDiscoverDialog.initViews$lambda$2((OcInviteDiscoverDialog) this.f30210b, view);
                break;
            case 11:
                ((OcREUnFreezeDialog) this.f30210b).dismiss();
                break;
            case 12:
                ((OcRepaymentPlanDialog) this.f30210b).dismiss();
                break;
            case 13:
                OpenFlexiRetainDialog.initViews$lambda$4((OpenFlexiRetainDialog) this.f30210b, view);
                break;
            case 14:
                RepayRemindDialog.initViews$lambda$0((RepayRemindDialog) this.f30210b, view);
                break;
            case 15:
                ((n1) this.f30210b).dismiss();
                break;
            case 16:
                UnFrozenCashDialog.initViews$lambda$1((UnFrozenCashDialog) this.f30210b, view);
                break;
            case 17:
                UnFrozenFlexiDialog.initViews$lambda$0((UnFrozenFlexiDialog) this.f30210b, view);
                break;
            case 18:
                PinEntryView pinEntryView = (PinEntryView) this.f30210b;
                boolean z3 = true ^ pinEntryView.f31081r0;
                pinEntryView.f31081r0 = z3;
                ?? r3 = pinEntryView.f31083t0;
                if (r3 != 0) {
                    r3.onHideStateChanged(pinEntryView, z3);
                }
                ImageView imageView = pinEntryView.f31082s0;
                if (imageView != null) {
                    imageView.setImageResource(pinEntryView.f31081r0 ? com.transsnet.palmpay.custom_view.r.cv_hide_psw : com.transsnet.palmpay.custom_view.r.cv_show_psw);
                }
                EditText editText = pinEntryView.f31064L;
                if (editText != null) {
                    pinEntryView.e(editText.getEditableText());
                }
                break;
            case 19:
                CommonTipsDialogFragment.a aVar5 = CommonTipsDialogFragment.f31249X;
                ((CommonTipsDialogFragment) this.f30210b).dismissAllowingStateLoss();
                break;
            case 20:
                com.transsnet.palmpay.custom_view.dialog.l lVar = (com.transsnet.palmpay.custom_view.dialog.l) this.f30210b;
                if (lVar.f31282b && lVar.f31283c) {
                    DialogInterface.OnCancelListener onCancelListener = lVar.f31284d;
                    Context context = view.getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                        } else if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity != null) {
                        com.transsnet.palmpay.custom_view.dialog.l lVar2 = (com.transsnet.palmpay.custom_view.dialog.l) com.transsnet.palmpay.custom_view.dialog.m.f31286a.get(activity);
                        if (lVar2 != null) {
                            View view2 = lVar2.f31281a;
                            view2.setVisibility(8);
                            view2.removeCallbacks(lVar2.f31285e);
                            lVar2.f31283c = false;
                        }
                    } else {
                        View view3 = lVar.f31281a;
                        view3.setVisibility(8);
                        view3.removeCallbacks(lVar.f31285e);
                        lVar.f31283c = false;
                    }
                    if (onCancelListener != null) {
                        onCancelListener.onCancel(null);
                    }
                    break;
                }
                break;
            case 21:
                DialogInterfaceC0834l dialogInterfaceC0834l = (DialogInterfaceC0834l) this.f30210b;
                if (dialogInterfaceC0834l != null && dialogInterfaceC0834l.isShowing()) {
                    dialogInterfaceC0834l.dismiss();
                    break;
                }
                break;
            case 22:
                PickStateDialogFragment.a aVar6 = PickStateDialogFragment.f31255Q;
                ((PickStateDialogFragment) this.f30210b).dismissAllowingStateLoss();
                break;
            case 23:
                ((TipsDialog) this.f30210b).lambda$initViews$0(view);
                break;
            case 24:
                ModelMobileInputAdapter.getView$lambda$8$lambda$7((ModelMobileInputAdapter) this.f30210b, view);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ModelNumberInputLayout.build$lambda$8((ModelNumberInputLayout) this.f30210b, view);
                break;
            case 26:
                int i7 = PaybackDetailActivity.t;
                Postcard postcardWithInt = ARouter.getInstance().build("/manage_money/detail_activity").withInt("detail_type", 2).withInt("order_detail_type", 2);
                PaybackDetailActivity paybackDetailActivity = (PaybackDetailActivity) this.f30210b;
                postcardWithInt.withString("orderNo", (String) paybackDetailActivity.f32149o.getValue()).withString("transType", (String) paybackDetailActivity.f32150p.getValue()).navigation();
                break;
            case 27:
                CashBoxWithdrawFragment.a aVar7 = CashBoxWithdrawFragment.f32442H;
                Pa.n0.g().v("CashBox_WithdrawPop_View");
                int iD = p059e1.a.D(0, "invest_interest_disable");
                CashBoxWithdrawFragment cashBoxWithdrawFragment = (CashBoxWithdrawFragment) this.f30210b;
                if (iD != 1) {
                    WithdrawSureDialogFragment withdrawSureDialogFragmentNewInstance = WithdrawSureDialogFragment.f32336X.newInstance(cashBoxWithdrawFragment.f32445C);
                    com.transsnet.palmpay.managemoney.ui.fragment.D withdrwaButtonClick = new com.transsnet.palmpay.managemoney.ui.fragment.D(cashBoxWithdrawFragment, 5);
                    withdrawSureDialogFragmentNewInstance.getClass();
                    Intrinsics.checkNotNullParameter(withdrwaButtonClick, "withdrwaButtonClick");
                    withdrawSureDialogFragmentNewInstance.f32337L = withdrwaButtonClick;
                    com.transsnet.palmpay.core.ui.activity.T mDialogClosedClick = new com.transsnet.palmpay.core.ui.activity.T(23);
                    Intrinsics.checkNotNullParameter(mDialogClosedClick, "mDialogClosedClick");
                    withdrawSureDialogFragmentNewInstance.f32338M = mDialogClosedClick;
                    androidx.fragment.app.Z childFragmentManager = cashBoxWithdrawFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    withdrawSureDialogFragmentNewInstance.show(childFragmentManager, "withdrawSureDialog");
                } else {
                    cashBoxWithdrawFragment.w();
                }
                break;
            case 28:
                OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                Postcard postcardBuild = ARouter.getInstance().build("/manage_money/create_plan_activity");
                GetOrderDetailResp.OrderDetailInfo orderDetailInfo = (GetOrderDetailResp.OrderDetailInfo) this.f30210b;
                Long productId = orderDetailInfo.getProductId();
                Postcard postcardWithString = postcardBuild.withLong(FirebaseAnalytics.Param.PRODUCT_ID, productId != null ? productId.longValue() : 0L).withInt("duration_day", orderDetailInfo.getDurationDay()).withString("plan_goal", orderDetailInfo.getGoal());
                double amount = orderDetailInfo.getAmount();
                double d2 = 100L;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0.0d);
                try {
                    bigDecimalValueOf = Pa.r0.W1(Double.toString(amount)).divide(Pa.r0.W1(Double.toString(d2)), 8, 3);
                } catch (Exception e10) {
                    F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
                }
                postcardWithString.withString("plan_amount", String.valueOf(bigDecimalValueOf.longValue())).withParcelable("state_info", orderDetailInfo.getStateInfo()).navigation();
                break;
            default:
                int i10 = CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.f27310g;
                int id2 = view.getId();
                int i11 = p025ba.e.model_payment_add_bank_card;
                C1646s c1646s = (C1646s) this.f30210b;
                if (id2 == i11) {
                    CashierPaymentMethodAdapter$OnPaymentMethodClickListener cashierPaymentMethodAdapter$OnPaymentMethodClickListener2 = c1646s.f35810f;
                    if (cashierPaymentMethodAdapter$OnPaymentMethodClickListener2 != null) {
                        cashierPaymentMethodAdapter$OnPaymentMethodClickListener2.onAddNewBankCardClick();
                    }
                    break;
                } else if (id2 == p025ba.e.model_payment_add_bank_account) {
                    CashierPaymentMethodAdapter$OnPaymentMethodClickListener cashierPaymentMethodAdapter$OnPaymentMethodClickListener3 = c1646s.f35810f;
                    if (cashierPaymentMethodAdapter$OnPaymentMethodClickListener3 != null) {
                        cashierPaymentMethodAdapter$OnPaymentMethodClickListener3.onAddNewBankAccountClick();
                    }
                    break;
                } else if (id2 == p025ba.e.model_payment_add_bank_card_and_bank_account) {
                    CashierPaymentMethodAdapter$OnPaymentMethodClickListener cashierPaymentMethodAdapter$OnPaymentMethodClickListener4 = c1646s.f35810f;
                    if (cashierPaymentMethodAdapter$OnPaymentMethodClickListener4 != null) {
                        cashierPaymentMethodAdapter$OnPaymentMethodClickListener4.onAddNewBankCardOrBankAccountClick();
                    }
                    break;
                } else if (id2 == p025ba.e.model_payment_add_ussd && (cashierPaymentMethodAdapter$OnPaymentMethodClickListener = c1646s.f35810f) != null) {
                    cashierPaymentMethodAdapter$OnPaymentMethodClickListener.onUseUSSDClick();
                    break;
                }
                break;
        }
    }
}
