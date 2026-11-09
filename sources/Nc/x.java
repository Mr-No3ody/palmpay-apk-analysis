package Nc;

import Pa.g0;
import Pa.i0;
import Pa.n0;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.E;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankBaseVerifyFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankAccountOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankPinFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBirthdayFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckMobileFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayPinFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckVoucherCodeFragment;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import com.flexibank.sdk.customview.model.FlexiBankModelSendSms;
import com.google.android.material.snackbar.Snackbar;
import com.google.api.Service;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaApplyResultActivity;
import com.transsnet.palmpay.account.ui.dialog.ConfirmDobDialog;
import com.transsnet.palmpay.account.ui.dialog.SignUpInviteSuccDialog;
import com.transsnet.palmpay.account.ui.dialog.SignUpRewardOnBackDialog;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.ui.widget.BillDetailProcessDataWedgit;
import com.transsnet.palmpay.core.ui.widget.BrowseCountdownView;
import com.transsnet.palmpay.core.util.PayStringUtils$OperatorType;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxLoseLotteryDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserOpenDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserUseCouponDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.NewerTipDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.SelectPayoutOptionsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6369b;

    public /* synthetic */ x(Object obj, int i7) {
        this.f6368a = i7;
        this.f6369b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Sd.b bVar;
        EditText mEditText;
        AppCompatEditText appCompatEditText;
        Editable editableText;
        AppCompatEditText appCompatEditText2;
        int i7 = 0;
        int i10 = 4;
        Editable text = null;
        editableText = null;
        Editable editableText2 = null;
        string = null;
        string = null;
        String string = null;
        text = null;
        Object obj = this.f6369b;
        switch (this.f6368a) {
            case 0:
                if (((ProductBean) obj).getInterestSwitchStatus() == 1) {
                    i0.b0("/cashbox/interest-setting");
                }
                break;
            case 1:
                Tier3QuotaApplyResultActivity.a aVar = Tier3QuotaApplyResultActivity.f26089b;
                ((Tier3QuotaApplyResultActivity) obj).finish();
                break;
            case 2:
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = (BillDetailProcessDataWedgit) obj;
                billDetailProcessDataWedgit.e(!billDetailProcessDataWedgit.f28100f);
                break;
            case 3:
                E activityFromView = ((BrowseCountdownView) obj).getActivityFromView();
                if (activityFromView != null) {
                    activityFromView.finish();
                }
                break;
            case 4:
                CashBoxAutoSaveDialogFragment.a aVar2 = CashBoxAutoSaveDialogFragment.f32279M;
                ((CashBoxAutoSaveDialogFragment) obj).dismiss();
                break;
            case 5:
                CashBoxLoseLotteryDialogFragment.a aVar3 = CashBoxLoseLotteryDialogFragment.f32281C;
                ((CashBoxLoseLotteryDialogFragment) obj).dismiss();
                break;
            case 6:
                CashBoxNewUserOpenDialogFragment.a aVar4 = CashBoxNewUserOpenDialogFragment.f32282L;
                ((CashBoxNewUserOpenDialogFragment) obj).dismiss();
                break;
            case 7:
                int i11 = CashBoxNewUserUseCouponDialogFragment.f32283L;
                ((CashBoxNewUserUseCouponDialogFragment) obj).dismiss();
                break;
            case 8:
                NewerTipDialogFragment.a aVar5 = NewerTipDialogFragment.f32298C;
                ((NewerTipDialogFragment) obj).dismiss();
                break;
            case 9:
                SelectPayoutOptionsDialogFragment.a aVar6 = SelectPayoutOptionsDialogFragment.f32319X;
                ((SelectPayoutOptionsDialogFragment) obj).dismiss();
                break;
            case 10:
                WhyTurnOffSaveDialogFragment.a aVar7 = WhyTurnOffSaveDialogFragment.f32329Z;
                ((WhyTurnOffSaveDialogFragment) obj).dismiss();
                break;
            case 11:
                n0.g().n("PopUp_Close_Click", (HashMap) obj);
                break;
            case 12:
                ((Snackbar) obj).dismiss();
                break;
            case 13:
                g0 g0Var = (g0) obj;
                ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack = g0Var.f7083b;
                if (scanFaceLogicUtil$IScanFaceResultCallBack != null) {
                    scanFaceLogicUtil$IScanFaceResultCallBack.onFailed(null, "User denied camera permission.", null);
                }
                g0Var.c(scanFaceLogicUtil$IScanFaceResultCallBack);
                break;
            case 14:
                int id2 = view.getId();
                Q3.k kVar = (Q3.k) obj;
                if (id2 == com.flexibank.sdk.p.fb_cdpr_cancel_tv) {
                    Sd.b bVar2 = kVar.f7624p;
                    if (bVar2 != null) {
                        bVar2.onCancelClick();
                    }
                    break;
                } else if (id2 == com.flexibank.sdk.p.fb_cdpr_confirm_tv && (bVar = kVar.f7624p) != null) {
                    bVar.onConfirmClick();
                    break;
                }
                break;
            case 15:
                ((PpAmountEditText) obj).f24366c.setText("");
                break;
            case 16:
                ConfirmDobDialog.initViews$lambda$1$lambda$0((ConfirmDobDialog) obj, view);
                break;
            case 17:
                int id3 = view.getId();
                Q8.d dVar = (Q8.d) obj;
                if (id3 != F8.d.tvCancel) {
                    int i12 = F8.d.tv1;
                    PinSafeWithPatternActivity pinSafeWithPatternActivity = dVar.f7639a;
                    if (id3 == i12) {
                        if (pinSafeWithPatternActivity != null) {
                            int i13 = PinSafeWithPatternActivity.f25946g;
                            pinSafeWithPatternActivity.n(false);
                        }
                        dVar.dismiss();
                    } else if (id3 == F8.d.tv2) {
                        if (pinSafeWithPatternActivity != null) {
                            pinSafeWithPatternActivity.m();
                        }
                        dVar.dismiss();
                    } else if (id3 == F8.d.tv3) {
                        if (pinSafeWithPatternActivity != null) {
                            pinSafeWithPatternActivity.l();
                        }
                        dVar.dismiss();
                    }
                } else {
                    dVar.dismiss();
                }
                break;
            case 18:
                SignUpInviteSuccDialog.initViews$lambda$0((SignUpInviteSuccDialog) obj, view);
                break;
            case 19:
                SignUpRewardOnBackDialog.initViews$lambda$1((SignUpRewardOnBackDialog) obj, view);
                break;
            case 20:
                int i14 = FlexiBankBaseVerifyFragment.f22001o;
                FlexiBankBaseVerifyFragment flexiBankBaseVerifyFragment = (FlexiBankBaseVerifyFragment) obj;
                if (!(flexiBankBaseVerifyFragment.getActivity() instanceof FlexiBankPayVerificationActivity)) {
                    E activity = flexiBankBaseVerifyFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    E activity2 = flexiBankBaseVerifyFragment.getActivity();
                    Intrinsics.f(activity2, "null cannot be cast to non-null type com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity");
                    ((FlexiBankPayVerificationActivity) activity2).g();
                }
                break;
            case 21:
                FlexiBankCheckBankAccountOtpFragment.a aVar8 = FlexiBankCheckBankAccountOtpFragment.f22002C;
                FlexiBankCheckBankAccountOtpFragment flexiBankCheckBankAccountOtpFragment = (FlexiBankCheckBankAccountOtpFragment) obj;
                E activity3 = flexiBankCheckBankAccountOtpFragment.getActivity();
                Intrinsics.f(activity3, "null cannot be cast to non-null type com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback");
                FlexiBankPayVerificationCallback flexiBankPayVerificationCallback = (FlexiBankPayVerificationCallback) activity3;
                FlexiBankModelSendSms flexiBankModelSendSms = flexiBankCheckBankAccountOtpFragment.f22005p;
                if (flexiBankModelSendSms != null && (mEditText = flexiBankModelSendSms.getMEditText()) != null) {
                    text = mEditText.getText();
                }
                flexiBankPayVerificationCallback.verifyPayMethod(String.valueOf(text), 10);
                break;
            case 22:
                FlexiBankCheckBankOtpFragment.a aVar9 = FlexiBankCheckBankOtpFragment.t;
                FlexiBankCheckBankOtpFragment flexiBankCheckBankOtpFragment = (FlexiBankCheckBankOtpFragment) obj;
                FlexiBankPayVerificationCallback flexiBankPayVerificationCallbackO = flexiBankCheckBankOtpFragment.o();
                if (flexiBankPayVerificationCallbackO != null) {
                    x4.g gVar = (x4.g) flexiBankCheckBankOtpFragment.f21944f;
                    if (gVar != null && (appCompatEditText = gVar.f43602c) != null && (editableText = appCompatEditText.getEditableText()) != null) {
                        string = editableText.toString();
                    }
                    flexiBankPayVerificationCallbackO.verifyPayMethod(string, 2);
                }
                break;
            case 23:
                FlexiBankCheckBankPinFragment.a aVar10 = FlexiBankCheckBankPinFragment.t;
                FlexiBankCheckBankPinFragment flexiBankCheckBankPinFragment = (FlexiBankCheckBankPinFragment) obj;
                FlexiBankPayVerificationCallback flexiBankPayVerificationCallbackO2 = flexiBankCheckBankPinFragment.o();
                if (flexiBankPayVerificationCallbackO2 != null) {
                    x4.b bVar3 = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                    if (bVar3 != null && (appCompatEditText2 = bVar3.f43577c) != null) {
                        editableText2 = appCompatEditText2.getEditableText();
                    }
                    flexiBankPayVerificationCallbackO2.verifyPayMethod(String.valueOf(editableText2), 1);
                }
                break;
            case 24:
                FlexiBankCheckBirthdayFragment flexiBankCheckBirthdayFragment = (FlexiBankCheckBirthdayFragment) obj;
                if (!TextUtils.isEmpty(flexiBankCheckBirthdayFragment.f22011A)) {
                    E activity4 = flexiBankCheckBirthdayFragment.getActivity();
                    Intrinsics.f(activity4, "null cannot be cast to non-null type com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback");
                    ((FlexiBankPayVerificationCallback) activity4).verifyPayMethodWithReference(flexiBankCheckBirthdayFragment.f22011A, flexiBankCheckBirthdayFragment.f22013C, null);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((R3.c) obj).dismiss();
                break;
            case 26:
                FlexiBankCheckMobileFragment.a aVar11 = FlexiBankCheckMobileFragment.f22018B;
                if (view.getId() == com.flexibank.sdk.p.fb_cmf_next_btn) {
                    FlexiBankCheckMobileFragment flexiBankCheckMobileFragment = (FlexiBankCheckMobileFragment) obj;
                    E activity5 = flexiBankCheckMobileFragment.getActivity();
                    Intrinsics.f(activity5, "null cannot be cast to non-null type com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback");
                    FlexiBankPayVerificationCallback flexiBankPayVerificationCallback2 = (FlexiBankPayVerificationCallback) activity5;
                    FlexiBankTitleEditView flexiBankTitleEditView = flexiBankCheckMobileFragment.t;
                    flexiBankPayVerificationCallback2.verifyPayMethod(flexiBankTitleEditView != null ? flexiBankTitleEditView.getEditText() : null, 4);
                }
                break;
            case 27:
                FlexiBankCheckPalmPayOtpFragment.a aVar12 = FlexiBankCheckPalmPayOtpFragment.f22023p;
                FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragment = (FlexiBankCheckPalmPayOtpFragment) obj;
                E activity6 = flexiBankCheckPalmPayOtpFragment.getActivity();
                if (!(activity6 instanceof FlexiBankPayVerificationActivity)) {
                    E activity7 = flexiBankCheckPalmPayOtpFragment.getActivity();
                    if (activity7 != null) {
                        activity7.finish();
                    }
                } else {
                    ((FlexiBankPayVerificationActivity) activity6).g();
                }
                break;
            case 28:
                FlexiBankCheckPalmPayPinFragment.a aVar13 = FlexiBankCheckPalmPayPinFragment.f22024C;
                FlexiBankCheckPalmPayPinFragment flexiBankCheckPalmPayPinFragment = (FlexiBankCheckPalmPayPinFragment) obj;
                if (!(flexiBankCheckPalmPayPinFragment.getActivity() instanceof FlexiBankPayVerificationActivity)) {
                    E activity8 = flexiBankCheckPalmPayPinFragment.getActivity();
                    if (activity8 != null) {
                        activity8.finish();
                    }
                } else if (!TextUtils.equals(flexiBankCheckPalmPayPinFragment.f22025A, TransType.TRANS_TYPE_CASH_BOX_WITHDRAW)) {
                    E activity9 = flexiBankCheckPalmPayPinFragment.getActivity();
                    Intrinsics.f(activity9, "null cannot be cast to non-null type com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity");
                    ((FlexiBankPayVerificationActivity) activity9).g();
                } else {
                    E activity10 = flexiBankCheckPalmPayPinFragment.getActivity();
                    if (activity10 != null) {
                        activity10.finish();
                    }
                }
                break;
            default:
                FlexiBankCheckVoucherCodeFragment.a aVar14 = FlexiBankCheckVoucherCodeFragment.f22033A;
                int id4 = view.getId();
                FlexiBankCheckVoucherCodeFragment flexiBankCheckVoucherCodeFragment = (FlexiBankCheckVoucherCodeFragment) obj;
                if (id4 == com.flexibank.sdk.p.fb_cmf_next_btn) {
                    E activity11 = flexiBankCheckVoucherCodeFragment.getActivity();
                    Intrinsics.f(activity11, "null cannot be cast to non-null type com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback");
                    FlexiBankPayVerificationCallback flexiBankPayVerificationCallback3 = (FlexiBankPayVerificationCallback) activity11;
                    FlexiBankTitleEditView flexiBankTitleEditView2 = flexiBankCheckVoucherCodeFragment.f22034p;
                    flexiBankPayVerificationCallback3.verifyPayMethod(flexiBankTitleEditView2 != null ? flexiBankTitleEditView2.getEditText() : null, 6);
                } else if (id4 == com.flexibank.sdk.p.fb_voucher_guide_tv) {
                    E context = flexiBankCheckVoucherCodeFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
                    Intrinsics.checkNotNullParameter(context, "mContext");
                    Intrinsics.checkNotNullParameter(PayStringUtils$OperatorType.VODAFONE, "operatorCode");
                    int i15 = com.flexibank.sdk.q.fb_mobile_wallet_guide_dialog;
                    Intrinsics.checkNotNullParameter(context, "context");
                    p033c4.c cVar = new p033c4.c(context, i15, i10, i7);
                    String string2 = context.getString(com.flexibank.sdk.r.fb_create_voucher_guide_title);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    cVar.f18858e = string2;
                    Intrinsics.checkNotNullParameter(PayStringUtils$OperatorType.VODAFONE, "operatorCode");
                    String string3 = context.getString(com.flexibank.sdk.r.fb_mobile_wallet_name_vodafone);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    cVar.f18859f = string3;
                    Intrinsics.checkNotNullParameter(PayStringUtils$OperatorType.VODAFONE, "operatorCode");
                    String string4 = context.getString(com.flexibank.sdk.r.fb_vodafone_guide_msg);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    cVar.f18860g = string4;
                    cVar.show();
                }
                break;
        }
    }
}
