package R3;

import Bc.C0107d;
import I8.s;
import Pa.r0;
import Rd.C0605v;
import Ua.E0;
import Uc.A0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.V;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckVoucherCodeFragment;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import com.flexibank.sdk.customview.model.FlexiBankModelSendSms;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormHorizontal;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.form.PpPhoneEditText;
import com.transsnet.palmpay.account.ui.fragment.changemobile.ChangeMobileStep2Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationGetBvnFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.ui.activity.CoreCommentActivity;
import com.transsnet.palmpay.core.ui.activity.InputCardPinActivity;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.core.viewmodel.MobileNumberInputV4View;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMediaActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.credit.ui.fragment.BeneficiariesListFragment;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.model.ModelSendSms;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashLoginActivity;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadActivity;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.SpanUtils;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p173ld.n;
import p173ld.r;
import p220oa.h;
import p223od.i;
import p270rd.C1982z;
import p310ub.C2085k0;
import p310ub.C2106v0;
import p353xd.j;
import p353xd.m;
import p353xd.p;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class e implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7921b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f7920a = i7;
        this.f7921b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0259  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        String mobileNumber;
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        Editable editableText;
        C0605v c0605v;
        PpButton ppButton;
        boolean z3;
        AppCompatEditText appCompatEditText;
        TextView textView;
        PpButton ppButton2;
        PpButton ppButton3;
        IconicsImageView iconicsImageView;
        IconicsImageView iconicsImageView2;
        IconicsImageView iconicsImageView3;
        boolean z8;
        IconicsImageView iconicsImageView4;
        String str = "";
        String string = null;
        text = null;
        Editable text = null;
        string = null;
        z = false;
        z = false;
        boolean z10 = false;
        Object obj = this.f7921b;
        switch (this.f7920a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 1:
                ChangeMobileStep2Fragment.a aVar = ChangeMobileStep2Fragment.f26124o;
                ChangeMobileStep2Fragment changeMobileStep2Fragment = (ChangeMobileStep2Fragment) obj;
                C0107d c0107d = changeMobileStep2Fragment.f26125j;
                if (c0107d != null && (mobileNumber = ((PpFormVertical) c0107d.f681c).getMobileNumber()) != null) {
                    str = mobileNumber;
                }
                String strL0 = r0.L0(str);
                if (!TextUtils.isEmpty(strL0) && strL0.length() >= PhoneBaseNumberUtils.INSTANCE.getMobileNumberValidLength(BaseApplication.getCountryLocale())) {
                    C0107d c0107d2 = changeMobileStep2Fragment.f26125j;
                    if (c0107d2 != null) {
                        ((PpButton) c0107d2.f683e).setEnabled(true);
                    }
                } else {
                    C0107d c0107d3 = changeMobileStep2Fragment.f26125j;
                    if (c0107d3 != null) {
                        ((PpButton) c0107d3.f683e).setEnabled(false);
                    }
                }
                break;
            case 2:
                PpFormHorizontal ppFormHorizontal = (PpFormHorizontal) obj;
                ppFormHorizontal.f24384M = s3.toString();
                if (s3.toString().length() == 0) {
                    ppFormHorizontal.f24396o.setVisibility(8);
                    ppFormHorizontal.setRightIcon(ppFormHorizontal.f24398v);
                } else if (ppFormHorizontal.f24395k0) {
                    ppFormHorizontal.f24396o.setVisibility(0);
                    ppFormHorizontal.f24394j.setVisibility(8);
                }
                TextWatcher textWatcher = ppFormHorizontal.f24382H;
                if (textWatcher != null) {
                    textWatcher.afterTextChanged(s3);
                }
                break;
            case 3:
                PpFormVertical ppFormVertical4 = (PpFormVertical) obj;
                ppFormVertical4.f24423t0 = s3.toString();
                if (s3.toString().length() == 0) {
                    ppFormVertical4.f24400A.setVisibility(8);
                    ppFormVertical4.f24402C.setVisibility(0);
                    ppFormVertical4.setRightIcon(ppFormVertical4.f24405M);
                } else {
                    if (ppFormVertical4.f24426v0) {
                        ppFormVertical4.f24400A.setVisibility(0);
                        if (ppFormVertical4.f24416k0 != 5) {
                            ppFormVertical4.f24427w.setVisibility(8);
                        }
                    }
                    ppFormVertical4.f24402C.setVisibility(8);
                }
                TextWatcher textWatcher2 = ppFormVertical4.f24421r0;
                if (textWatcher2 != null) {
                    textWatcher2.afterTextChanged(s3);
                }
                break;
            case 4:
                PpPhoneEditText ppPhoneEditText = (PpPhoneEditText) obj;
                ppPhoneEditText.f24453s0 = s3.toString();
                if (s3.toString().length() == 0) {
                    ppPhoneEditText.f24458w.setVisibility(8);
                    ppPhoneEditText.f24432B.setVisibility(0);
                } else {
                    if (ppPhoneEditText.f24455u0) {
                        ppPhoneEditText.f24458w.setVisibility(0);
                    }
                    ppPhoneEditText.f24432B.setVisibility(4);
                }
                TextWatcher textWatcher3 = ppPhoneEditText.f24451q0;
                if (textWatcher3 != null) {
                    textWatcher3.afterTextChanged(s3);
                }
                break;
            case 5:
                MobileNumberInputV4View mobileNumberInputV4View = (MobileNumberInputV4View) obj;
                Intrinsics.checkNotNullParameter(s3, "s");
                s3.length();
                try {
                    String str2 = MobileNumberInputV4View.f28222C;
                    mobileNumberInputV4View.b();
                    if (mobileNumberInputV4View.f28230f != null) {
                        String mobileNumber2 = mobileNumberInputV4View.getMobileNumber();
                        TextView textView2 = mobileNumberInputV4View.f28230f;
                        if (textView2 != null) {
                            textView2.setVisibility(TextUtils.isEmpty(mobileNumber2) ? 0 : 8);
                        }
                    }
                    MobileNumberInputV4View.OnPhoneNumberEnteredListener onPhoneNumberEnteredListener = mobileNumberInputV4View.f28223A;
                    if (onPhoneNumberEnteredListener != null) {
                        onPhoneNumberEnteredListener.onNumberEntered(mobileNumberInputV4View.countryCode, mobileNumberInputV4View.getMobileNumber());
                    }
                } catch (Exception e10) {
                    F6.d.c(MobileNumberInputV4View.f28222C, "afterTextChanged: ", e10);
                    return;
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(s3, "s");
                int i7 = ReasonForCancellationPage.f32913j;
                ReasonForCancellationPage reasonForCancellationPage = (ReasonForCancellationPage) obj;
                A0 a0M = reasonForCancellationPage.m();
                String string2 = s3.toString();
                a0M.getClass();
                Intrinsics.checkNotNullParameter(string2, "<set-?>");
                a0M.f9528c.setValue(a0M, A0.f9525e[2], string2);
                Object value = reasonForCancellationPage.f32915b.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(s3.length() + "/200");
                break;
            case 8:
                int i10 = IdentityVerificationGetBvnFragment.t;
                IdentityVerificationGetBvnFragment identityVerificationGetBvnFragment = (IdentityVerificationGetBvnFragment) obj;
                s sVar = (s) identityVerificationGetBvnFragment.f27335j;
                String editContent = (sVar == null || (ppFormVertical3 = sVar.f4203b) == null) ? null : ppFormVertical3.getEditContent();
                if ((editContent != null ? editContent.length() : 0) == 10) {
                    KeyboardUtils.hideSoftInput(identityVerificationGetBvnFragment.getActivity());
                }
                identityVerificationGetBvnFragment.w();
                s sVar2 = (s) identityVerificationGetBvnFragment.f27335j;
                if (sVar2 != null && (ppFormVertical2 = sVar2.f4203b) != null) {
                    ppFormVertical2.setBottomText(null);
                }
                s sVar3 = (s) identityVerificationGetBvnFragment.f27335j;
                if (sVar3 != null && (ppFormVertical = sVar3.f4204c) != null) {
                    ppFormVertical.setBottomText(null);
                    break;
                }
                break;
            case 9:
                String string3 = s3.toString();
                ModelSendSms modelSendSms = (ModelSendSms) obj;
                if (modelSendSms.f31586j) {
                    if (string3.length() != 11) {
                        modelSendSms.f31582e.setEnabled(false);
                    } else {
                        modelSendSms.f31582e.setEnabled(true);
                    }
                }
                break;
            case 10:
                int i11 = LogInInputMobileFragment.f26194C;
                LogInInputMobileFragment logInInputMobileFragment = (LogInInputMobileFragment) obj;
                logInInputMobileFragment.A();
                PpFormVertical ppFormVertical5 = logInInputMobileFragment.f26200v;
                if (ppFormVertical5 != null) {
                    ppFormVertical5.setBottomText(null);
                }
                break;
            case 11:
                int i12 = CoreCommentActivity.f27529j;
                CoreCommentActivity coreCommentActivity = (CoreCommentActivity) obj;
                EditText editText = (EditText) coreCommentActivity.f27534e.getValue();
                if (editText != null && (editableText = editText.getEditableText()) != null) {
                    string = editableText.toString();
                }
                boolean zIsEmpty = TextUtils.isEmpty(string);
                t tVar = coreCommentActivity.f27531b;
                t tVar2 = coreCommentActivity.f27533d;
                if (!zIsEmpty) {
                    ((TextView) tVar2.getValue()).setVisibility(0);
                    ((PpButton) tVar.getValue()).setEnabled(true);
                    ((TextView) tVar2.getValue()).setText(new SpanUtils().append(String.valueOf(string != null ? string.length() : 0)).setForegroundColor(-16777216).append("/300").setForegroundColor(Color.parseColor("#999999")).create());
                } else {
                    ((TextView) tVar2.getValue()).setVisibility(8);
                    ((PpButton) tVar.getValue()).setEnabled(false);
                }
                break;
            case 12:
                int i13 = InputCardPinActivity.f27654c;
                InputCardPinActivity inputCardPinActivity = (InputCardPinActivity) obj;
                ((Button) inputCardPinActivity.f27655a.getValue()).setEnabled(!TextUtils.isEmpty(((EditText) inputCardPinActivity.f27656b.getValue()).getText()));
                break;
            case 14:
                Intrinsics.checkNotNullParameter(s3, "editable");
                int i14 = Recharge2CashLoginActivity.f33122i;
                Recharge2CashLoginActivity recharge2CashLoginActivity = (Recharge2CashLoginActivity) obj;
                C0605v c0605v2 = (C0605v) recharge2CashLoginActivity.f27334c;
                if ((c0605v2 == null || (ppButton2 = c0605v2.f8526b) == null || !ppButton2.a()) && (c0605v = (C0605v) recharge2CashLoginActivity.f27334c) != null && (ppButton = c0605v.f8526b) != null) {
                    if (!TextUtils.isEmpty(recharge2CashLoginActivity.f33124e)) {
                        C0605v c0605v3 = (C0605v) recharge2CashLoginActivity.f27334c;
                        if (c0605v3 != null && (appCompatEditText = c0605v3.f8529e) != null) {
                            text = appCompatEditText.getText();
                        }
                        z3 = TextUtils.isEmpty(text) ? false : true;
                    }
                    ppButton.setEnabled(z3);
                }
                C0605v c0605v4 = (C0605v) recharge2CashLoginActivity.f27334c;
                if (c0605v4 != null && (textView = c0605v4.f8531g) != null) {
                    h.s(textView, false);
                    break;
                }
                break;
            case 15:
                Intrinsics.checkNotNullParameter(s3, "editable");
                TransactionHistoryDownloadActivity transactionHistoryDownloadActivity = (TransactionHistoryDownloadActivity) obj;
                C0107d c0107d4 = transactionHistoryDownloadActivity.f34580f;
                if (c0107d4 != null && (iconicsImageView = (IconicsImageView) c0107d4.f682d) != null) {
                    iconicsImageView.setVisibility(s3.length() != 0 ? 0 : 8);
                }
                C0107d c0107d5 = transactionHistoryDownloadActivity.f34580f;
                if (c0107d5 != null && (ppButton3 = (PpButton) c0107d5.f683e) != null) {
                    ppButton3.setEnabled(s3.length() > 0);
                    break;
                }
                break;
            case 16:
                Intrinsics.checkNotNullParameter(s3, "s");
                String string4 = s3.toString();
                FlexiBankModelSendSms flexiBankModelSendSms = (FlexiBankModelSendSms) obj;
                if (flexiBankModelSendSms.f22267f) {
                    if (string4.length() != 11) {
                        TextView mSendSmsTv = flexiBankModelSendSms.getMSendSmsTv();
                        Intrinsics.e(mSendSmsTv);
                        mSendSmsTv.setEnabled(false);
                    } else {
                        TextView mSendSmsTv2 = flexiBankModelSendSms.getMSendSmsTv();
                        Intrinsics.e(mSendSmsTv2);
                        mSendSmsTv2.setEnabled(true);
                    }
                }
                break;
            case 17:
                int i15 = PayShopInputAmountActivity.f33176p;
                p223od.a aVar2 = (p223od.a) ((PayShopInputAmountActivity) obj).f27334c;
                if (aVar2 != null && (iconicsImageView2 = aVar2.f40290f) != null) {
                    h.s(iconicsImageView2, !TextUtils.isEmpty(String.valueOf(s3)));
                    break;
                }
                break;
            case 18:
                Intrinsics.checkNotNullParameter(s3, "editable");
                break;
            case 19:
                int i16 = WithdrawInputAmountActivity.f33293p;
                p223od.a aVar3 = (p223od.a) ((WithdrawInputAmountActivity) obj).f27334c;
                if (aVar3 != null && (iconicsImageView3 = aVar3.f40290f) != null) {
                    h.s(iconicsImageView3, !TextUtils.isEmpty(String.valueOf(s3)));
                    break;
                }
                break;
            case 20:
                KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                InputAmountActivity inputAmountActivity = (InputAmountActivity) obj;
                StateAmountEditText stateAmountEditTextP = inputAmountActivity.p();
                double d2 = stateAmountEditTextP != null ? stateAmountEditTextP.getDouble() : 0.0d;
                Object value2 = inputAmountActivity.f28685o.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                TextView textView3 = (TextView) value2;
                if (textView3 != null) {
                    BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = inputAmountActivity.f28676L;
                    if (balanceAndLimitData == null || !balanceAndLimitData.stampDutySwitch) {
                        z8 = false;
                    } else {
                        long j6 = ((int) d2) * 100;
                        Long l5 = balanceAndLimitData.stampDutyMinAmount;
                        if (j6 >= (l5 != null ? l5.longValue() : 0L)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    }
                    h.s(textView3, z8);
                }
                DigitalKeyboardView digitalKeyboardViewO = inputAmountActivity.o();
                if (!TextUtils.isEmpty(inputAmountActivity.p().getString()) && inputAmountActivity.p().c() && (!BaseApplication.isNG() || !TextUtils.isEmpty(inputAmountActivity.f28674C))) {
                    z10 = true;
                }
                digitalKeyboardViewO.setActionButtonEnable(z10);
                break;
            case 21:
                s3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) ((C2085k0) obj).f42878b;
                if (ocMTNLoginActivity.f29565q0.getText().length() >= 6) {
                    ocMTNLoginActivity.f29569u0.setEnabled(true);
                } else {
                    ocMTNLoginActivity.f29569u0.setEnabled(false);
                }
                break;
            case 22:
                int i17 = OcMediaActivity.f29577y0;
                ((OcMediaActivity) obj).A();
                break;
            case 23:
                s3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                OcOneLoopActivity ocOneLoopActivity = ((C2106v0) obj).f42934a;
                if (ocOneLoopActivity.f29613p0.getText().length() >= 4) {
                    ocOneLoopActivity.f29617t0.setEnabled(true);
                } else {
                    ocOneLoopActivity.f29617t0.setEnabled(false);
                }
                break;
            case 24:
                Intrinsics.checkNotNullParameter(s3, "editable");
                int i18 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = (ScheduleTransferForBankUnstableBeneficiariesListActivity) obj;
                if (!TextUtils.isEmpty(scheduleTransferForBankUnstableBeneficiariesListActivity.n().getText())) {
                    AbstractC0780y.m(V.h(scheduleTransferForBankUnstableBeneficiariesListActivity.l()), null, null, new p341wd.f(scheduleTransferForBankUnstableBeneficiariesListActivity, String.valueOf(scheduleTransferForBankUnstableBeneficiariesListActivity.n().getText()), null), 3);
                } else {
                    scheduleTransferForBankUnstableBeneficiariesListActivity.m().setList((CopyOnWriteArrayList) scheduleTransferForBankUnstableBeneficiariesListActivity.f33432j.getValue());
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = (ScheduleTransferForBankUnstableHomeActivity) obj;
                h.s(scheduleTransferForBankUnstableHomeActivity.u(), (s3 != null ? s3.length() : 0) <= 0);
                if (scheduleTransferForBankUnstableHomeActivity.r().length() < 10) {
                    scheduleTransferForBankUnstableHomeActivity.y();
                } else {
                    scheduleTransferForBankUnstableHomeActivity.w().setErrorMessage("");
                    ScheduleTransferForBankUnstableHomeActivity.m(scheduleTransferForBankUnstableHomeActivity);
                }
                break;
            case 26:
                Intrinsics.checkNotNullParameter(s3, "editable");
                break;
            case 27:
                TransferToBankInputAmountActivity.a aVar4 = TransferToBankInputAmountActivity.f33522C;
                i iVar = (i) ((TransferToBankInputAmountActivity) obj).f27334c;
                if (iVar != null && (iconicsImageView4 = iVar.f40376e) != null) {
                    h.s(iconicsImageView4, !TextUtils.isEmpty(String.valueOf(s3)));
                    break;
                }
                break;
            case 28:
                IconicsImageView iconicsImageView5 = ((TransferToPalmPayInputAmountActivity) obj).f33607L;
                if (iconicsImageView5 != null) {
                    h.s(iconicsImageView5, !TextUtils.isEmpty(String.valueOf(s3)));
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        switch (this.f7920a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 2:
                TextWatcher textWatcher = ((PpFormHorizontal) this.f7921b).f24382H;
                if (textWatcher != null) {
                    textWatcher.beforeTextChanged(s3, i7, i10, i11);
                }
                break;
            case 3:
                TextWatcher textWatcher2 = ((PpFormVertical) this.f7921b).f24421r0;
                if (textWatcher2 != null) {
                    textWatcher2.beforeTextChanged(s3, i7, i10, i11);
                }
                break;
            case 4:
                TextWatcher textWatcher3 = ((PpPhoneEditText) this.f7921b).f24451q0;
                if (textWatcher3 != null) {
                    textWatcher3.beforeTextChanged(s3, i7, i10, i11);
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Context context;
        int i12 = 0;
        Object obj = this.f7921b;
        switch (this.f7920a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                FlexiBankCheckVoucherCodeFragment flexiBankCheckVoucherCodeFragment = (FlexiBankCheckVoucherCodeFragment) obj;
                PpButton ppButton = flexiBankCheckVoucherCodeFragment.t;
                if (ppButton != null) {
                    FlexiBankTitleEditView flexiBankTitleEditView = flexiBankCheckVoucherCodeFragment.f22034p;
                    ppButton.setEnabled(!TextUtils.isEmpty(flexiBankTitleEditView != null ? flexiBankTitleEditView.getEditText() : null));
                }
                break;
            case 1:
                break;
            case 2:
                if (s3 != null && s3.length() != 0) {
                    PpFormHorizontal ppFormHorizontal = (PpFormHorizontal) obj;
                    if (ppFormHorizontal.f24379A == 3) {
                        ppFormHorizontal.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        while (i12 < s3.length()) {
                            if (i12 == 3 || i12 == 8 || s3.charAt(i12) != ' ') {
                                sb2.append(s3.charAt(i12));
                                if ((sb2.length() == 4 || sb2.length() == 9) && sb2.charAt(sb2.length() - 1) != ' ') {
                                    sb2.insert(sb2.length() - 1, ' ');
                                }
                            }
                            i12++;
                        }
                        if (!sb2.toString().equals(s3.toString())) {
                            ppFormHorizontal.f24397p.setText(sb2.toString());
                            if (ppFormHorizontal.f24397p.getText() != null) {
                                ppFormHorizontal.f24397p.setSelection(ppFormHorizontal.f24397p.getText().length());
                            }
                        }
                    }
                    TextWatcher textWatcher = ppFormHorizontal.f24382H;
                    if (textWatcher != null) {
                        textWatcher.onTextChanged(s3, i7, i10, i11);
                    }
                    break;
                }
                break;
            case 3:
                if (s3 != null && s3.length() != 0) {
                    PpFormVertical ppFormVertical = (PpFormVertical) obj;
                    if (ppFormVertical.f24416k0 == 3) {
                        ppFormVertical.getClass();
                        StringBuilder sb3 = new StringBuilder();
                        while (i12 < s3.length()) {
                            if (i12 == 3 || i12 == 8 || s3.charAt(i12) != ' ') {
                                sb3.append(s3.charAt(i12));
                                if ((sb3.length() == 4 || sb3.length() == 9) && sb3.charAt(sb3.length() - 1) != ' ') {
                                    sb3.insert(sb3.length() - 1, ' ');
                                }
                            }
                            i12++;
                        }
                        if (!sb3.toString().equals(s3.toString())) {
                            ppFormVertical.f24401B.setText(sb3.toString());
                            if (ppFormVertical.f24401B.getText() != null) {
                                ppFormVertical.f24401B.setSelection(ppFormVertical.f24401B.getText().length());
                            }
                        }
                    }
                    TextWatcher textWatcher2 = ppFormVertical.f24421r0;
                    if (textWatcher2 != null) {
                        textWatcher2.onTextChanged(s3, i7, i10, i11);
                    }
                    break;
                }
                break;
            case 4:
                if (s3 != null && s3.length() != 0) {
                    PpPhoneEditText ppPhoneEditText = (PpPhoneEditText) obj;
                    if (ppPhoneEditText.f24437Q == 3 && ((context = ppPhoneEditText.getContext()) == null || context.getResources().getConfiguration().getLayoutDirection() != 1)) {
                        StringBuilder sb4 = new StringBuilder();
                        while (i12 < s3.length()) {
                            if (i12 == 3 || i12 == 8 || s3.charAt(i12) != ' ') {
                                sb4.append(s3.charAt(i12));
                                if ((sb4.length() == 4 || sb4.length() == 9) && sb4.charAt(sb4.length() - 1) != ' ') {
                                    sb4.insert(sb4.length() - 1, ' ');
                                }
                            }
                            i12++;
                        }
                        if (!sb4.toString().equals(s3.toString())) {
                            ppPhoneEditText.f24431A.setText(sb4.toString());
                            if (ppPhoneEditText.f24431A.getText() != null) {
                                ppPhoneEditText.f24431A.setSelection(ppPhoneEditText.f24431A.getText().length());
                            }
                        }
                    }
                    TextWatcher textWatcher3 = ppPhoneEditText.f24451q0;
                    if (textWatcher3 != null) {
                        textWatcher3.onTextChanged(s3, i7, i10, i11);
                    }
                    break;
                }
                break;
            case 5:
                int i13 = i7;
                Intrinsics.checkNotNullParameter(s3, "s");
                if (s3.length() != 0) {
                    StringBuilder sb5 = new StringBuilder();
                    MobileNumberInputV4View mobileNumberInputV4View = (MobileNumberInputV4View) obj;
                    int maxNumberLength = mobileNumberInputV4View.getMaxNumberLength();
                    int length = s3.length();
                    while (i12 < length) {
                        switch (maxNumberLength) {
                            case 9:
                            case 10:
                                if (i12 == 3 || i12 == 7 || s3.charAt(i12) != ' ') {
                                    sb5.append(s3.charAt(i12));
                                    if ((sb5.length() == 4 || sb5.length() == 8) && sb5.charAt(sb5.length() - 1) != ' ') {
                                        sb5.insert(sb5.length() - 1, ' ');
                                    }
                                }
                                break;
                            case 11:
                                if (i12 == 3 || i12 == 8 || s3.charAt(i12) != ' ') {
                                    sb5.append(s3.charAt(i12));
                                    if ((sb5.length() == 4 || sb5.length() == 9) && sb5.charAt(sb5.length() - 1) != ' ') {
                                        sb5.insert(sb5.length() - 1, ' ');
                                    }
                                }
                                break;
                        }
                        i12++;
                    }
                    if (!Intrinsics.c(sb5.toString(), s3.toString())) {
                        int i14 = i13 + 1;
                        try {
                            if (sb5.charAt(i13) == ' ') {
                                if (i10 == 0) {
                                    i13 += 2;
                                }
                            } else if (i10 != 1) {
                                i13 = i14;
                            }
                            AppCompatEditText appCompatEditText = mobileNumberInputV4View.f28226b;
                            if (appCompatEditText != null) {
                                appCompatEditText.setText(sb5.toString());
                            }
                            AppCompatEditText appCompatEditText2 = mobileNumberInputV4View.f28226b;
                            if (appCompatEditText2 != null) {
                                appCompatEditText2.setSelection(i13);
                            }
                        } catch (Exception e10) {
                            F6.d.c(MobileNumberInputV4View.f28222C, "onTextChanged: ", e10);
                            return;
                        }
                    }
                    break;
                }
                break;
            case 6:
                ((E0) obj).c();
                break;
            case 7:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            case 13:
                int[] iArr = CompatStateEditText.f30973i;
                ((CompatStateEditText) obj).a();
                break;
            case 14:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 16:
            case 17:
                break;
            case 18:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                int i15 = SelectBankActivity.f33187A;
                SelectBankActivity selectBankActivity = (SelectBankActivity) obj;
                n nVarO = selectBankActivity.o();
                String keyword = s3.toString();
                nVarO.getClass();
                Intrinsics.checkNotNullParameter(keyword, "keyword");
                nVarO.f39332b = keyword;
                if (!TextUtils.isEmpty(selectBankActivity.r().getText())) {
                    AbstractC0780y.m(V.h(selectBankActivity.l()), null, null, new C1982z(selectBankActivity, String.valueOf(selectBankActivity.r().getText()), null), 3);
                } else {
                    selectBankActivity.o().setList(Jd.c.g((CopyOnWriteArrayList) selectBankActivity.t.getValue()));
                    selectBankActivity.o().notifyDataSetChanged();
                    selectBankActivity.p().f4985b = (CopyOnWriteArrayList) selectBankActivity.f33196p.getValue();
                    selectBankActivity.p().notifyDataSetChanged();
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            case 24:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                if (BaseApplication.isNG() && s3 != null && s3.length() > 0) {
                    int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                    CommonViewExtKt.dealInputAccountWithSpace$default(((ScheduleTransferForBankUnstableHomeActivity) obj).t(), s3, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
                    break;
                }
                break;
            case 26:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                int i17 = SelectBankForToBankActivity.f33506B;
                SelectBankForToBankActivity selectBankForToBankActivity = (SelectBankForToBankActivity) obj;
                r rVarR = selectBankForToBankActivity.r();
                String keyword2 = s3.toString();
                rVarR.getClass();
                Intrinsics.checkNotNullParameter(keyword2, "keyword");
                rVarR.f39337b = keyword2;
                r rVarT = selectBankForToBankActivity.t();
                String keyword3 = s3.toString();
                rVarT.getClass();
                Intrinsics.checkNotNullParameter(keyword3, "keyword");
                rVarT.f39337b = keyword3;
                n nVarQ = selectBankForToBankActivity.q();
                String keyword4 = s3.toString();
                nVarQ.getClass();
                Intrinsics.checkNotNullParameter(keyword4, "keyword");
                nVarQ.f39332b = keyword4;
                if (!TextUtils.isEmpty(selectBankForToBankActivity.u().getText())) {
                    String strValueOf = String.valueOf(selectBankForToBankActivity.u().getText());
                    AbstractC0780y.m(V.h(selectBankForToBankActivity.l()), null, null, new j(selectBankForToBankActivity, strValueOf, null), 3);
                    AbstractC0780y.m(V.h(selectBankForToBankActivity.l()), null, null, new m(selectBankForToBankActivity, strValueOf, null), 3);
                    AbstractC0780y.m(V.h(selectBankForToBankActivity.l()), null, null, new p(selectBankForToBankActivity, strValueOf, null), 3);
                } else {
                    selectBankForToBankActivity.q().setList(Jd.c.g((CopyOnWriteArrayList) selectBankForToBankActivity.f33517v.getValue()));
                    selectBankForToBankActivity.t().setList((CopyOnWriteArrayList) selectBankForToBankActivity.t.getValue());
                    selectBankForToBankActivity.r().setList((CopyOnWriteArrayList) selectBankForToBankActivity.f33516p.getValue());
                }
                break;
            case 27:
            case 28:
                break;
            default:
                BeneficiariesListFragment beneficiariesListFragment = (BeneficiariesListFragment) obj;
                String string = beneficiariesListFragment.f30229j.getText().toString();
                ArrayList arrayList = beneficiariesListFragment.f30232v;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!TextUtils.isEmpty(beneficiariesListFragment.f30229j.getText().toString())) {
                        p161kf.e eVar = beneficiariesListFragment.t;
                        if (eVar != null && !eVar.isDisposed()) {
                            p161kf.e eVar2 = beneficiariesListFragment.t;
                            eVar2.getClass();
                            p001if.a.a(eVar2);
                        }
                        C1765q c1765qI = new C1755g(new com.transsnet.adsdk.b(20, beneficiariesListFragment, string), i12).k(p298tf.f.f42629b).i(p071ef.b.a());
                        p161kf.e eVar3 = new p161kf.e(new p287se.d(beneficiariesListFragment, 25), p147jf.a.f38601e, p147jf.a.f38599c);
                        c1765qI.subscribe(eVar3);
                        beneficiariesListFragment.t = eVar3;
                        beneficiariesListFragment.f(eVar3);
                    } else {
                        p339wb.d dVar = beneficiariesListFragment.f30231p;
                        dVar.f43364b = arrayList;
                        dVar.notifyDataSetChanged();
                    }
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void A(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void B(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void C(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void D(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void E(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void F(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void G(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void H(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void I(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void J(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void K(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void d(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void e(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void f(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void g(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void h(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void i(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void j(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void k(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void l(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void m(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void n(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void o(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void p(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void q(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void r(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void s(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void t(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void u(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void v(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void w(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void x(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void y(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void z(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
