package Ab;

import Ad.c0;
import C0.G;
import Ed.C0224d;
import Ed.C0244y;
import Kd.S1;
import Pa.r0;
import Rd.k0;
import Wf.AbstractC0780y;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankPinFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckCVVFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckMobileFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckUbaBankAccountOTPFragment;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.cash_in.bean.response.WithdrawHomeEntranceBean;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawQueryAccountListActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.req.QueryMemberByKeyReq;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckAirtimeSharePinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankPinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBettingWithdrawOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckCVVFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckMobileFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUbaBankAccountOTPFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUssdAirtimeSharePinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckVoucherCodeFragment;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.credit.view.FitFontSizePpButton;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.req.QueryRecipientMemberInfoReq;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.AddMobileContactFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayAddMobileAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.view.TransferSpecialReceipt;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.ui.dialog.EditNameDialogFragment;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f127b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f126a = i7;
        this.f127b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0314  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        BankInfo bankInfo;
        String phoneNumInput;
        String phoneNumInput2;
        String phoneNumInput3;
        ModelErrorDivider modelErrorDivider;
        IconicsImageView iconicsImageView;
        TextView textView;
        Long l5;
        boolean z3;
        StateAmountEditText stateAmountEditTextU;
        Editable editableText;
        Editable editableText2;
        Editable editableText3;
        Editable editableText4;
        PpButton ppButton;
        AppCompatEditText appCompatEditText;
        Editable editableText5;
        PpButton ppButton2;
        AppCompatEditText appCompatEditText2;
        PpButton ppButton3;
        AppCompatEditText appCompatEditText3;
        PpButton ppButton4;
        AppCompatEditText appCompatEditText4;
        Editable editableText6;
        String strReplace = null;
        editableText = null;
        Editable editableText7 = null;
        editableText = null;
        Editable editableText8 = null;
        strReplace = null;
        boolean z8 = true;
        int length = 0;
        Object obj = this.f127b;
        switch (this.f126a) {
            case 0:
                ((CLInstallmentBorrowFragment) obj).A().setActionButtonEnable(String.valueOf(s3).length() > 0);
                return;
            case 1:
                ((AddFromContactsDialog) obj).queryRecipients(String.valueOf(s3));
                return;
            case 2:
                EditNameDialogFragment editNameDialogFragment = (EditNameDialogFragment) obj;
                editNameDialogFragment.f35057o.setEnabled(!TextUtils.isEmpty(s3.toString()));
                editNameDialogFragment.g("", false);
                return;
            case 3:
                String strK = kotlin.text.y.k(String.valueOf(s3), " ", "");
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = (WithdrawQueryAccountListActivity) obj;
                if (strK.length() <= 0) {
                    int i7 = WithdrawQueryAccountListActivity.f26945C;
                    withdrawQueryAccountListActivity.n().setVisibility(8);
                    return;
                }
                if (strK.length() >= 10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("WITHDRAW");
                    new QueryMemberByKeyReq(strK, 0, arrayList);
                    int i10 = WithdrawQueryAccountListActivity.f26945C;
                    WithdrawViewModel withdrawViewModel = (WithdrawViewModel) withdrawQueryAccountListActivity.l();
                    withdrawViewModel.getClass();
                    p140j8.f.s(withdrawViewModel, new J9.E(strK, null), withdrawViewModel.f27118v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                int i11 = WithdrawQueryAccountListActivity.f26945C;
                withdrawQueryAccountListActivity.n().setVisibility(0);
                return;
            case 4:
                int i12 = AddBankAccountFragment.f33648M;
                AddBankAccountFragment addBankAccountFragment = (AddBankAccountFragment) obj;
                TextView textView2 = (TextView) addBankAccountFragment.f33654j.getValue();
                if (textView2 != null) {
                    if (TextUtils.isEmpty(addBankAccountFragment.u()) || (BaseApplication.isNG() && ((bankInfo = addBankAccountFragment.f33651C) == null || TextUtils.isEmpty(bankInfo.bankCode)))) {
                        z8 = false;
                    }
                    textView2.setEnabled(z8);
                    return;
                }
                return;
            case 5:
                Intrinsics.checkNotNullParameter(s3, "s");
                int i13 = AddMobileContactFragment.f33662C;
                AddMobileContactFragment addMobileContactFragment = (AddMobileContactFragment) obj;
                p223od.l lVar = (p223od.l) addMobileContactFragment.f27335j;
                if ((lVar != null ? lVar.f40413c : null) == null) {
                    return;
                }
                if (TextUtils.isEmpty(lVar != null ? lVar.f40413c.getPhoneNumInput() : null)) {
                    return;
                }
                p223od.l lVar2 = (p223od.l) addMobileContactFragment.f27335j;
                if (((lVar2 == null || (phoneNumInput3 = lVar2.f40413c.getPhoneNumInput()) == null) ? 0 : phoneNumInput3.length()) < PhoneBaseNumberUtils.INSTANCE.getMobileNumberAcceptedLength(BaseApplication.getCountryLocale())) {
                    return;
                }
                p223od.l lVar3 = (p223od.l) addMobileContactFragment.f27335j;
                if (lVar3 != null && (phoneNumInput2 = lVar3.f40413c.getPhoneNumInput()) != null) {
                    length = phoneNumInput2.length();
                }
                if (length >= 10) {
                    Cd.g gVar = new Cd.g(addMobileContactFragment);
                    SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
                    p223od.l lVar4 = (p223od.l) addMobileContactFragment.f27335j;
                    if (lVar4 != null && (phoneNumInput = lVar4.f40413c.getPhoneNumInput()) != null) {
                        strReplace = new Regex(" ").replace(phoneNumInput, "");
                    }
                    sendMoneyApiService.queryRecipientMemberInfo(new QueryRecipientMemberInfoReq(r0.v0(r0.L0(strReplace)), 10)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(gVar);
                    return;
                }
                return;
            case 6:
                String strValueOf = String.valueOf(s3);
                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = (BankAccountBeneficiaryFragment) obj;
                if (bankAccountBeneficiaryFragment.f33738H.isEmpty()) {
                    return;
                }
                CompatStateEditText compatStateEditText = (CompatStateEditText) bankAccountBeneficiaryFragment.t.getValue();
                if (TextUtils.isEmpty(String.valueOf(compatStateEditText != null ? compatStateEditText.getText() : null))) {
                    bankAccountBeneficiaryFragment.u().setList(Jd.c.h(bankAccountBeneficiaryFragment.f33738H));
                    return;
                }
                p161kf.e eVar = bankAccountBeneficiaryFragment.f33737C;
                if (eVar != null && !eVar.isDisposed()) {
                    p161kf.e eVar2 = bankAccountBeneficiaryFragment.f33737C;
                    Intrinsics.e(eVar2);
                    p001if.a.a(eVar2);
                }
                C1765q c1765qI = new C1755g(new c0(7, bankAccountBeneficiaryFragment, strValueOf), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
                p161kf.e eVar3 = new p161kf.e(new Dg.a(new C0224d(bankAccountBeneficiaryFragment, length), 6), p147jf.a.f38601e, p147jf.a.f38599c);
                c1765qI.subscribe(eVar3);
                bankAccountBeneficiaryFragment.f33737C = eVar3;
                bankAccountBeneficiaryFragment.f(eVar3);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(s3, "editable");
                BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = (BankAccountPalmPayContactFragment) obj;
                CompatStateEditText compatStateEditTextW = bankAccountPalmPayContactFragment.w();
                if (TextUtils.isEmpty(compatStateEditTextW != null ? compatStateEditTextW.getText() : null)) {
                    bankAccountPalmPayContactFragment.t().setList(androidx.camera.core.impl.utils.n.q(bankAccountPalmPayContactFragment.u(), new B(11)));
                    return;
                }
                CompatStateEditText compatStateEditTextW2 = bankAccountPalmPayContactFragment.w();
                String strValueOf2 = String.valueOf(compatStateEditTextW2 != null ? compatStateEditTextW2.getText() : null);
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) bankAccountPalmPayContactFragment.f27333i;
                if (transferToPalmPayContactViewModel != null) {
                    AbstractC0780y.m(V.h(transferToPalmPayContactViewModel), null, null, new C0244y(bankAccountPalmPayContactFragment, strValueOf2, null), 3);
                    return;
                }
                return;
            case 8:
                TransferToBankAddBankAccountFragment.a aVar = TransferToBankAddBankAccountFragment.f33758M;
                TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment = (TransferToBankAddBankAccountFragment) obj;
                transferToBankAddBankAccountFragment.x();
                Bc.j jVar = transferToBankAddBankAccountFragment.f33763L;
                if (jVar != null) {
                    p220oa.h.s((IconicsImageView) jVar.f738e, s3 != null && s3.length() <= 0);
                }
                String strY = transferToBankAddBankAccountFragment.y();
                if (strY.length() >= 10) {
                    Bc.j jVar2 = transferToBankAddBankAccountFragment.f33763L;
                    if (jVar2 != null) {
                        ((ModelErrorDivider) jVar2.f743o).setErrorMessage("");
                    }
                    transferToBankAddBankAccountFragment.w(false);
                    return;
                }
                if (strY.length() != 0) {
                    transferToBankAddBankAccountFragment.z();
                    return;
                }
                transferToBankAddBankAccountFragment.t = null;
                Bc.j jVar3 = transferToBankAddBankAccountFragment.f33763L;
                if (jVar3 != null) {
                    p220oa.h.C((TextView) jVar3.f732B);
                }
                Bc.j jVar4 = transferToBankAddBankAccountFragment.f33763L;
                if (jVar4 != null) {
                    p220oa.h.c((ImageView) jVar4.f737d);
                }
                Bc.j jVar5 = transferToBankAddBankAccountFragment.f33763L;
                if (jVar5 != null) {
                    p220oa.h.c((TextView) jVar5.f733C);
                }
                transferToBankAddBankAccountFragment.z();
                return;
            case 9:
                TransferToPalmPayAddMobileAccountFragment.a aVar2 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment = (TransferToPalmPayAddMobileAccountFragment) obj;
                transferToPalmPayAddMobileAccountFragment.w();
                k0 k0Var = transferToPalmPayAddMobileAccountFragment.f33791H;
                if (k0Var != null && (iconicsImageView = k0Var.f8371d) != null) {
                    p220oa.h.s(iconicsImageView, s3 != null && s3.length() <= 0);
                }
                String strX = transferToPalmPayAddMobileAccountFragment.x();
                if (strX.length() < 10) {
                    if (strX.length() == 0) {
                        transferToPalmPayAddMobileAccountFragment.y();
                        return;
                    } else {
                        transferToPalmPayAddMobileAccountFragment.y();
                        return;
                    }
                }
                k0 k0Var2 = transferToPalmPayAddMobileAccountFragment.f33791H;
                if (k0Var2 != null && (modelErrorDivider = (ModelErrorDivider) k0Var2.f8379v) != null) {
                    modelErrorDivider.setErrorMessage("");
                }
                transferToPalmPayAddMobileAccountFragment.v(false);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(s3, "editable");
                TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = (TransferToPalmPayContactAllFragment) obj;
                p355xf.t tVar = transferToPalmPayContactAllFragment.f33802p;
                CompatStateEditText compatStateEditText2 = (CompatStateEditText) tVar.getValue();
                if (TextUtils.isEmpty(compatStateEditText2 != null ? compatStateEditText2.getText() : null)) {
                    transferToPalmPayContactAllFragment.t().setList(androidx.camera.core.impl.utils.n.q(transferToPalmPayContactAllFragment.u(), new B(15)));
                    return;
                }
                CompatStateEditText compatStateEditText3 = (CompatStateEditText) tVar.getValue();
                String strValueOf3 = String.valueOf(compatStateEditText3 != null ? compatStateEditText3.getText() : null);
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) transferToPalmPayContactAllFragment.f27333i;
                if (transferToPalmPayContactViewModel2 != null) {
                    AbstractC0780y.m(V.h(transferToPalmPayContactViewModel2), null, null, new Fd.l(transferToPalmPayContactAllFragment, strValueOf3, null), 3);
                    return;
                }
                return;
            case 11:
                Intrinsics.checkNotNullParameter(s3, "editable");
                TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = (TransferToPalmPayContactFavoriteFragment) obj;
                p355xf.t tVar2 = transferToPalmPayContactFavoriteFragment.f33806o;
                CompatStateEditText compatStateEditText4 = (CompatStateEditText) tVar2.getValue();
                if (TextUtils.isEmpty(compatStateEditText4 != null ? compatStateEditText4.getText() : null)) {
                    transferToPalmPayContactFavoriteFragment.t().setList(transferToPalmPayContactFavoriteFragment.u());
                    return;
                }
                CompatStateEditText compatStateEditText5 = (CompatStateEditText) tVar2.getValue();
                String strValueOf4 = String.valueOf(compatStateEditText5 != null ? compatStateEditText5.getText() : null);
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel3 = (TransferToPalmPayContactViewModel) transferToPalmPayContactFavoriteFragment.f27333i;
                if (transferToPalmPayContactViewModel3 != null) {
                    AbstractC0780y.m(V.h(transferToPalmPayContactViewModel3), null, null, new Fd.s(transferToPalmPayContactFavoriteFragment, strValueOf4, null), 3);
                    return;
                }
                return;
            case 12:
                WithdrawV2Fragment withdrawV2Fragment = (WithdrawV2Fragment) obj;
                DigitalKeyboardView digitalKeyboardView = (DigitalKeyboardView) withdrawV2Fragment.f27057j.getValue();
                long jLongValue = 0;
                if (digitalKeyboardView != null) {
                    StateAmountEditText stateAmountEditTextU2 = withdrawV2Fragment.u();
                    if (stateAmountEditTextU2 == null || TextUtils.isEmpty(stateAmountEditTextU2.getString()) || (stateAmountEditTextU = withdrawV2Fragment.u()) == null || !stateAmountEditTextU.c()) {
                        z3 = false;
                    } else {
                        StateAmountEditText stateAmountEditTextU3 = withdrawV2Fragment.u();
                        long jF = r0.f(stateAmountEditTextU3 != null ? stateAmountEditTextU3.getDouble() : 0.0d);
                        withdrawV2Fragment.f27053Q = jF;
                        if (jF > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    digitalKeyboardView.setActionButtonEnable(z3);
                }
                WithdrawHomeEntranceBean withdrawHomeEntranceBean = withdrawV2Fragment.f27068v0;
                if (!(withdrawHomeEntranceBean != null ? Intrinsics.c(withdrawHomeEntranceBean.stampDutySwitch, Boolean.TRUE) : false) || (textView = (TextView) withdrawV2Fragment.f27067v.getValue()) == null) {
                    return;
                }
                StateAmountEditText stateAmountEditTextU4 = withdrawV2Fragment.u();
                long longAmount = stateAmountEditTextU4 != null ? stateAmountEditTextU4.getLongAmount() : 0L;
                WithdrawHomeEntranceBean withdrawHomeEntranceBean2 = withdrawV2Fragment.f27068v0;
                if (withdrawHomeEntranceBean2 != null && (l5 = withdrawHomeEntranceBean2.stampDutyMinAmount) != null) {
                    jLongValue = l5.longValue();
                }
                p220oa.h.s(textView, longAmount >= jLongValue);
                return;
            case 13:
                Intrinsics.checkNotNullParameter(s3, "s");
                return;
            case 14:
                TransferSpecialReceipt transferSpecialReceipt = (TransferSpecialReceipt) obj;
                if ((s3 != null ? s3.length() : 0) < 2) {
                    transferSpecialReceipt.getEt_note().setText("\u3000 ");
                    if (transferSpecialReceipt.getEt_note().getText().length() >= 2) {
                        transferSpecialReceipt.getEt_note().setSelection(2);
                        return;
                    }
                    return;
                }
                if (kotlin.text.y.m(String.valueOf(s3), "\u3000 ", false)) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("\u3000 ");
                sb2.append(String.valueOf(s3));
                transferSpecialReceipt.getEt_note().setText(sb2);
                if (transferSpecialReceipt.getEt_note().getText().length() >= sb2.length()) {
                    transferSpecialReceipt.getEt_note().setSelection(sb2.length());
                    return;
                }
                return;
            case 15:
                TransferToPalmPayAccountView transferToPalmPayAccountView = (TransferToPalmPayAccountView) obj;
                Bc.D d2 = transferToPalmPayAccountView.f33930c;
                if (d2 != null) {
                    d2.f620f.setEnabled(false);
                }
                transferToPalmPayAccountView.f33933f = null;
                String account = transferToPalmPayAccountView.getAccount();
                S1 s8 = transferToPalmPayAccountView.f33932e;
                if (s8 == null) {
                    Intrinsics.n("sharedViewModel");
                    throw null;
                }
                s8.f5135d = account;
                F6.d.h("PalmPayAccountView", 3, G.o("afterTextChanged: ", account));
                transferToPalmPayAccountView.k(account);
                if (account.length() >= 10) {
                    Bc.D d10 = transferToPalmPayAccountView.f33930c;
                    if (d10 != null) {
                        ((ModelErrorDivider) d10.f614A).setErrorMessage("");
                    }
                    TransferToPalmPayAccountView.c(transferToPalmPayAccountView);
                    return;
                }
                if (account.length() == 0) {
                    transferToPalmPayAccountView.f33933f = null;
                    S1 s10 = transferToPalmPayAccountView.f33932e;
                    if (s10 == null) {
                        Intrinsics.n("sharedViewModel");
                        throw null;
                    }
                    s10.f5135d = null;
                    transferToPalmPayAccountView.i();
                    return;
                }
                transferToPalmPayAccountView.i();
                if (transferToPalmPayAccountView.f33938p.isEmpty()) {
                    TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = transferToPalmPayAccountView.f33931d;
                    if (transferToPalmPayHomeViewModel != null) {
                        transferToPalmPayHomeViewModel.e();
                        return;
                    } else {
                        Intrinsics.n("requestViewModel");
                        throw null;
                    }
                }
                return;
            case 16:
                Intrinsics.checkNotNullParameter(s3, "s");
                CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = (CheckAirtimeSharePinFragment) obj;
                PpButton ppButton5 = (PpButton) checkAirtimeSharePinFragment.f27937j.getValue();
                if (ppButton5 != null) {
                    AppCompatEditText appCompatEditTextZ = checkAirtimeSharePinFragment.z();
                    ppButton5.setEnabled(((appCompatEditTextZ == null || (editableText = appCompatEditTextZ.getEditableText()) == null) ? 0 : editableText.length()) >= 4);
                    return;
                }
                return;
            case 17:
                Intrinsics.checkNotNullParameter(s3, "s");
                CheckBankOtpFragment.a aVar4 = CheckBankOtpFragment.f27947B;
                CheckBankOtpFragment checkBankOtpFragment = (CheckBankOtpFragment) obj;
                View view = (View) checkBankOtpFragment.f27949j.getValue();
                if (view != null) {
                    AppCompatEditText appCompatEditText5 = (AppCompatEditText) checkBankOtpFragment.f27950o.getValue();
                    view.setEnabled(((appCompatEditText5 == null || (editableText2 = appCompatEditText5.getEditableText()) == null) ? 0 : editableText2.length()) >= 4);
                    return;
                }
                return;
            case 18:
                Intrinsics.checkNotNullParameter(s3, "s");
                CheckBankPinFragment.a aVar5 = CheckBankPinFragment.f27954A;
                CheckBankPinFragment checkBankPinFragment = (CheckBankPinFragment) obj;
                AppCompatEditText appCompatEditTextZ2 = checkBankPinFragment.z();
                Editable editableText9 = appCompatEditTextZ2 != null ? appCompatEditTextZ2.getEditableText() : null;
                Button button = (Button) checkBankPinFragment.f27955j.getValue();
                if (button != null) {
                    button.setEnabled((editableText9 != null ? editableText9.length() : 0) >= 4);
                    return;
                }
                return;
            case 19:
                ((CheckBettingWithdrawOtpFragment) obj).f27960A.setEnabled(s3.length() > 3);
                return;
            case 20:
                Intrinsics.checkNotNullParameter(s3, "s");
                CheckCVVFragment.a aVar6 = CheckCVVFragment.f27973A;
                CheckCVVFragment checkCVVFragment = (CheckCVVFragment) obj;
                AppCompatEditText appCompatEditText6 = (AppCompatEditText) checkCVVFragment.f27975o.getValue();
                Editable editableText10 = appCompatEditText6 != null ? appCompatEditText6.getEditableText() : null;
                Button button2 = (Button) checkCVVFragment.f27974j.getValue();
                if (button2 != null) {
                    button2.setEnabled((editableText10 != null ? editableText10.length() : 0) > 2);
                    return;
                }
                return;
            case 21:
                return;
            case 22:
                Intrinsics.checkNotNullParameter(s3, "s");
                CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = (CheckUbaBankAccountOTPFragment) obj;
                View view2 = (View) checkUbaBankAccountOTPFragment.f28030j.getValue();
                if (view2 != null) {
                    AppCompatEditText appCompatEditText7 = (AppCompatEditText) checkUbaBankAccountOTPFragment.f28032p.getValue();
                    view2.setEnabled(((appCompatEditText7 == null || (editableText3 = appCompatEditText7.getEditableText()) == null) ? 0 : editableText3.length()) >= 4);
                    return;
                }
                return;
            case 23:
                Intrinsics.checkNotNullParameter(s3, "s");
                CheckUssdAirtimeSharePinFragment.a aVar8 = CheckUssdAirtimeSharePinFragment.f28035L;
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = (CheckUssdAirtimeSharePinFragment) obj;
                PpButton ppButton6 = (PpButton) checkUssdAirtimeSharePinFragment.f28040j.getValue();
                if (ppButton6 != null) {
                    AppCompatEditText appCompatEditTextA = checkUssdAirtimeSharePinFragment.A();
                    ppButton6.setEnabled(((appCompatEditTextA == null || (editableText4 = appCompatEditTextA.getEditableText()) == null) ? 0 : editableText4.length()) >= 4);
                    return;
                }
                return;
            case 24:
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Intrinsics.checkNotNullParameter(s3, "s");
                FlexiBankCheckBankOtpFragment.a aVar9 = FlexiBankCheckBankOtpFragment.t;
                ViewBinding viewBinding = ((FlexiBankCheckBankOtpFragment) obj).f21944f;
                x4.g gVar2 = (x4.g) viewBinding;
                if (gVar2 == null || (ppButton = gVar2.f43601b) == null) {
                    return;
                }
                x4.g gVar3 = (x4.g) viewBinding;
                ppButton.setEnabled(((gVar3 == null || (appCompatEditText = gVar3.f43602c) == null || (editableText5 = appCompatEditText.getEditableText()) == null) ? 0 : editableText5.length()) >= 4);
                return;
            case 26:
                Intrinsics.checkNotNullParameter(s3, "s");
                FlexiBankCheckBankPinFragment.a aVar10 = FlexiBankCheckBankPinFragment.t;
                FlexiBankCheckBankPinFragment flexiBankCheckBankPinFragment = (FlexiBankCheckBankPinFragment) obj;
                x4.b bVar = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                if (bVar != null && (appCompatEditText2 = bVar.f43577c) != null) {
                    editableText8 = appCompatEditText2.getEditableText();
                }
                x4.b bVar2 = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                if (bVar2 == null || (ppButton2 = bVar2.f43576b) == null) {
                    return;
                }
                ppButton2.setEnabled((editableText8 != null ? editableText8.length() : 0) >= 4);
                return;
            case 27:
                Intrinsics.checkNotNullParameter(s3, "s");
                FlexiBankCheckCVVFragment.a aVar11 = FlexiBankCheckCVVFragment.f22017p;
                FlexiBankCheckCVVFragment flexiBankCheckCVVFragment = (FlexiBankCheckCVVFragment) obj;
                x4.c cVar = (x4.c) flexiBankCheckCVVFragment.f21944f;
                if (cVar != null && (appCompatEditText3 = cVar.f43584c) != null) {
                    editableText7 = appCompatEditText3.getEditableText();
                }
                x4.c cVar2 = (x4.c) flexiBankCheckCVVFragment.f21944f;
                if (cVar2 == null || (ppButton3 = cVar2.f43583b) == null) {
                    return;
                }
                ppButton3.setEnabled((editableText7 != null ? editableText7.length() : 0) > 2);
                return;
            case 28:
                Intrinsics.checkNotNullParameter(s3, "s");
                return;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                FlexiBankCheckUbaBankAccountOTPFragment.a aVar12 = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                ViewBinding viewBinding2 = ((FlexiBankCheckUbaBankAccountOTPFragment) obj).f21944f;
                x4.g gVar4 = (x4.g) viewBinding2;
                if (gVar4 == null || (ppButton4 = gVar4.f43601b) == null) {
                    return;
                }
                x4.g gVar5 = (x4.g) viewBinding2;
                ppButton4.setEnabled(((gVar5 == null || (appCompatEditText4 = gVar5.f43602c) == null || (editableText6 = appCompatEditText4.getEditableText()) == null) ? 0 : editableText6.length()) >= 4);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        switch (this.f126a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 6:
                break;
            case 7:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 8:
            case 9:
                break;
            case 10:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 12:
                break;
            case 13:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 14:
            case 15:
                break;
            case 16:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 19:
                break;
            case 20:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 21:
                break;
            case 22:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 24:
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0211  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Disposable disposable;
        EditText editText;
        Bc.j jVar;
        EditText editText2;
        EditText editText3;
        CustomAutoCompleteTextView customAutoCompleteTextView;
        Object obj = this.f127b;
        switch (this.f126a) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = (WithdrawQueryAccountListActivity) obj;
                if (s3 != null) {
                    try {
                        if (s3.length() != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            int length = s3.length();
                            for (int i12 = 0; i12 < length; i12++) {
                                if (i12 == 3 || i12 == 7 || s3.charAt(i12) != ' ') {
                                    sb2.append(s3.charAt(i12));
                                    if ((sb2.length() == 4 || sb2.length() == 8) && sb2.charAt(sb2.length() - 1) != ' ') {
                                        sb2.insert(sb2.length() - 1, ' ');
                                    }
                                }
                            }
                            if (!Intrinsics.c(sb2.toString(), s3.toString())) {
                                int i13 = i7 + 1;
                                if (sb2.charAt(i7) == ' ') {
                                    if (i10 == 0) {
                                        i7 += 2;
                                    }
                                } else if (i10 != 1) {
                                    i7 = i13;
                                }
                                int i14 = WithdrawQueryAccountListActivity.f26945C;
                                withdrawQueryAccountListActivity.m().setText(sb2.toString());
                                withdrawQueryAccountListActivity.m().setSelection(i7);
                            }
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 4:
                if (BaseApplication.isNG()) {
                    int i15 = AddBankAccountFragment.f33648M;
                    EditText editTextV = ((AddBankAccountFragment) obj).v();
                    if (editTextV != null) {
                        CommonViewExtKt.dealInputAccountWithSpace$default(editTextV, s3, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
                    }
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(s3, "s");
                int i16 = AddMobileContactFragment.f33662C;
                AddMobileContactFragment addMobileContactFragment = (AddMobileContactFragment) obj;
                p223od.l lVar = (p223od.l) addMobileContactFragment.f27335j;
                if (lVar != null) {
                    lVar.t.setVisibility(8);
                }
                p223od.l lVar2 = (p223od.l) addMobileContactFragment.f27335j;
                if (lVar2 != null) {
                    lVar2.f40412b.setVisibility(8);
                }
                p223od.l lVar3 = (p223od.l) addMobileContactFragment.f27335j;
                if (lVar3 != null && (editText = lVar3.f40413c.f28343c) != null) {
                    String string = s3.toString();
                    int length2 = string.length() - 1;
                    int i17 = 0;
                    boolean z3 = false;
                    while (i17 <= length2) {
                        boolean z8 = Intrinsics.h(string.charAt(!z3 ? i17 : length2), 32) <= 0;
                        if (z3) {
                            if (z8) {
                                length2--;
                            } else {
                                editText.setTypeface(Typeface.create(TextUtils.isEmpty(string.subSequence(i17, length2 + 1).toString()) ? "sans-serif" : "sans-serif-medium", 0));
                            }
                        } else if (z8) {
                            i17++;
                        } else {
                            z3 = true;
                        }
                    }
                    editText.setTypeface(Typeface.create(TextUtils.isEmpty(string.subSequence(i17, length2 + 1).toString()) ? "sans-serif" : "sans-serif-medium", 0));
                }
                Disposable disposable2 = addMobileContactFragment.f33664B;
                if (disposable2 != null && !disposable2.isDisposed() && (disposable = addMobileContactFragment.f33664B) != null) {
                    disposable.dispose();
                    break;
                }
                break;
            case 6:
                break;
            case 7:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 8:
                if (BaseApplication.isNG() && (jVar = ((TransferToBankAddBankAccountFragment) obj).f33763L) != null && (editText2 = (EditText) jVar.f735b) != null) {
                    CommonViewExtKt.dealInputAccountWithSpace$default(editText2, s3, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
                    break;
                }
                break;
            case 9:
                k0 k0Var = ((TransferToPalmPayAddMobileAccountFragment) obj).f33791H;
                if (k0Var != null && (editText3 = (EditText) k0Var.f8375i) != null) {
                    CommonViewExtKt.dealInputAccountWithSpace(editText3, s3, i7, i10, C1850q.e(3, Integer.valueOf((s3 != null ? s3.length() : 0) > 12 ? 4 : 3), 4), false);
                    break;
                }
                break;
            case 10:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(s3, "charSequence");
                break;
            case 12:
                WithdrawV2Fragment withdrawV2Fragment = (WithdrawV2Fragment) obj;
                if (TextUtils.isEmpty(String.valueOf(s3))) {
                    StateAmountEditText stateAmountEditTextU = withdrawV2Fragment.u();
                    if (stateAmountEditTextU != null) {
                        stateAmountEditTextU.setTypeface(Typeface.create("sans-serif", 0));
                    }
                } else {
                    r0.R1(withdrawV2Fragment.u(), "fonts/PalmPayNum-Bold.ttf");
                }
                StateAmountEditText stateAmountEditTextU2 = withdrawV2Fragment.u();
                if (stateAmountEditTextU2 != null) {
                    stateAmountEditTextU2.setTextSize(TextUtils.isEmpty(String.valueOf(s3)) ? 16.0f : 18.0f);
                }
                break;
            case 13:
                Intrinsics.checkNotNullParameter(s3, "s");
                int i18 = FitFontSizePpButton.f30750v;
                ((FitFontSizePpButton) obj).e();
                break;
            case 14:
                String string2 = new StringBuilder(s3).delete(i7, i7 + i11).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                TransferSpecialReceipt transferSpecialReceipt = (TransferSpecialReceipt) obj;
                if (transferSpecialReceipt.getEt_note().getLineCount() > 3) {
                    int length3 = string2.length();
                    transferSpecialReceipt.getEt_note().setText(string2);
                    transferSpecialReceipt.getEt_note().setSelection(length3);
                }
                break;
            case 15:
                Bc.D d2 = ((TransferToPalmPayAccountView) obj).f33930c;
                if (d2 != null && (customAutoCompleteTextView = (CustomAutoCompleteTextView) d2.f616b) != null) {
                    CommonViewExtKt.dealInputAccountWithSpace(customAutoCompleteTextView, s3, i7, i10, C1850q.e(3, Integer.valueOf((s3 != null ? s3.length() : 0) > 12 ? 4 : 3), 4), false);
                    break;
                }
                break;
            case 16:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 19:
                break;
            case 20:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 21:
                CheckMobileFragment checkMobileFragment = (CheckMobileFragment) obj;
                if (TextUtils.isEmpty(checkMobileFragment.f27985j.getEditText())) {
                    checkMobileFragment.f27986o.setEnabled(false);
                } else {
                    checkMobileFragment.f27986o.setEnabled(true);
                }
                break;
            case 22:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 24:
                CheckVoucherCodeFragment checkVoucherCodeFragment = (CheckVoucherCodeFragment) obj;
                if (TextUtils.isEmpty(checkVoucherCodeFragment.f28045i.getEditText())) {
                    checkVoucherCodeFragment.f28046j.setEnabled(false);
                } else {
                    checkVoucherCodeFragment.f28046j.setEnabled(true);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(s3, "s");
                FlexiBankCheckMobileFragment flexiBankCheckMobileFragment = (FlexiBankCheckMobileFragment) obj;
                PpButton ppButton = flexiBankCheckMobileFragment.f22021v;
                if (ppButton != null) {
                    FlexiBankTitleEditView flexiBankTitleEditView = flexiBankCheckMobileFragment.t;
                    ppButton.setEnabled(!TextUtils.isEmpty(flexiBankTitleEditView != null ? flexiBankTitleEditView.getEditText() : null));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
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
}
