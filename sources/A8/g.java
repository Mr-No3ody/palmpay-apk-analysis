package A8;

import Bc.C0108e;
import I8.o;
import Jb.G;
import Pa.C0521s;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.E;
import androidx.lifecycle.F;
import com.google.android.material.chip.Chip;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.mtn.sdk.ui.bank._common.TermsAndPrivacyActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveAuthorizationConfirmFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyLiteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLVerifyPalmPayAccountDialog;
import com.transsnet.palmpay.credit.ui.dialog.TransferByLoanSheet;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideDoubleOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolLockFragment;
import com.transsnet.palmpay.credit.view.FeeCalculateView;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxDepositFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxIntroductionFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderPreFragment;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantPreviewActivity;
import com.transsnet.palmpay.ui.fragment.settings.PaymentSettingsFragment;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f92a = i7;
        this.f93b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        TextView textView;
        AppCompatImageView appCompatImageView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Context context;
        TextView textViewU;
        int i7 = 2;
        boolean z8 = false;
        z = false;
        boolean z10 = false;
        int i10 = 1;
        Object obj = this.f93b;
        switch (this.f92a) {
            case 0:
                C0525w c0525w = ((h) obj).f94a.f25700g;
                if (((TermsAndPrivacyActivity) c0525w.f7166b).f25698e.d()) {
                    return;
                }
                TermsAndPrivacyActivity termsAndPrivacyActivity = (TermsAndPrivacyActivity) c0525w.f7166b;
                if (z3) {
                    termsAndPrivacyActivity.f25698e.f();
                    return;
                } else {
                    termsAndPrivacyActivity.f25698e.c();
                    return;
                }
            case 1:
                int i11 = PaymentSettingsFragment.f35271C;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) obj;
                if (z3 && !new p131id.a(paymentSettingsFragment.getContext()).W()) {
                    C0521s c0521s = C0521s.f7158a;
                    C0521s.i(paymentSettingsFragment.getContext());
                    return;
                }
                if (!z3) {
                    O6.c cVar = new O6.c(paymentSettingsFragment.getActivity());
                    cVar.f6596b = O6.d.f("Disable Touch ID for pay?");
                    cVar.f6605k = true;
                    cVar.f6598d = "Are you sure you want to disable fingerprint payment?";
                    De.c cVar2 = new De.c(paymentSettingsFragment, 4);
                    cVar.f6601g = "Disable";
                    cVar.f6603i = cVar2;
                    cVar.d(k.core_later, new De.c(paymentSettingsFragment, z8 ? 1 : 0));
                    O6.d dVarG = cVar.g();
                    dVarG.setCancelable(false);
                    dVarG.setCanceledOnTouchOutside(false);
                    return;
                }
                Intent intentQ = i0.q(paymentSettingsFragment.getActivity());
                intentQ.putExtra("_encrypt", z3);
                intentQ.putExtra("extra_use_night_mode", true);
                intentQ.putExtra("extra_mode", z3 ? 1 : 0);
                E activity = paymentSettingsFragment.getActivity();
                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                p038ca.e f28604i = ((BaseActivity) activity).getF28604i();
                if (f28604i != null) {
                    if (z3) {
                        f28604i.f(intentQ, new De.e(paymentSettingsFragment, i10));
                        return;
                    } else {
                        f28604i.f(intentQ, new De.e(paymentSettingsFragment, i7));
                        return;
                    }
                }
                return;
            case 2:
                D4.f fVar = (D4.f) obj;
                fVar.getClass();
                int i12 = FeeCalculateView.f30739p;
                ((FeeCalculateView) fVar.f1592b).getClass();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                C0108e c0108e = ((GuardianApproveAuthorizationConfirmFragment) obj).f26146p;
                if (c0108e != null) {
                    ((PpButton) c0108e.f689f).setEnabled(((IconicsCheckBox) c0108e.f690g).isChecked());
                    return;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                int i13 = BookingNotesPage.f32830A;
                BookingNotesPage bookingNotesPage = (BookingNotesPage) obj;
                bookingNotesPage.n().f9746d = z3;
                t tVar = bookingNotesPage.f32833c;
                if (z3) {
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    p220oa.h.C((TextView) value);
                    return;
                } else {
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    p220oa.h.c((TextView) value2);
                    return;
                }
            case 5:
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                IdentityVerificationStep2Fragment identityVerificationStep2Fragment = (IdentityVerificationStep2Fragment) obj;
                KeyboardUtils.hideSoftInput(identityVerificationStep2Fragment.getActivity());
                o oVar = (o) identityVerificationStep2Fragment.f27335j;
                if (oVar == null || (textView = oVar.f4173i) == null) {
                    return;
                }
                p220oa.h.s(textView, false);
                return;
            case 6:
                ((Chip) obj).lambda$new$0(compoundButton, z3);
                return;
            case 7:
                CLVerifyPalmPayAccountDialog.a aVar = CLVerifyPalmPayAccountDialog.f29949L;
                Intrinsics.checkNotNullParameter(compoundButton, "compoundButton");
                PpButton ppButton = (PpButton) obj;
                if (ppButton != null) {
                    ppButton.setEnabled(z3);
                    return;
                }
                return;
            case 8:
                int i14 = TransferByLoanSheet.f30032q0;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                TransferByLoanSheet transferByLoanSheet = (TransferByLoanSheet) obj;
                if (transferByLoanSheet.f30048p0) {
                    return;
                }
                F f10 = transferByLoanSheet.z().f30932f;
                Object objD = f10.d();
                G g7 = objD instanceof G ? (G) objD : null;
                if (g7 != null && g7.f4704e != z3) {
                    f10.k(G.a(g7, 0, z3, 15));
                }
                TransferByLoanOpenParams transferByLoanOpenParams = transferByLoanSheet.f30044j;
                if (transferByLoanOpenParams == null) {
                    Intrinsics.n("params");
                    throw null;
                }
                long loanAmount = transferByLoanOpenParams.getLoanAmount();
                n0 n0VarG = n0.g();
                Pair[] pairArr = {new Pair("status", z3 ? "1" : "0"), new Pair("transfer_amount", String.valueOf(loanAmount))};
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = J3.a.f4490b;
                if (str != null) {
                    linkedHashMap.put("trace_id", str);
                }
                String str2 = J3.a.f4491c;
                if (str2 != null) {
                    linkedHashMap.put("order_id", str2);
                }
                for (int i15 = 0; i15 < 2; i15++) {
                    Pair pair = pairArr[i15];
                    linkedHashMap.put((String) pair.f38891a, (String) pair.f38892b);
                }
                n0VarG.n("loan_transfer_agreement_toggle", linkedHashMap);
                return;
            case 9:
                CashBoxDepositFragment.a aVar2 = CashBoxDepositFragment.f32357p0;
                Intrinsics.checkNotNullParameter(compoundButton, "buttonView");
                CashBoxDepositFragment cashBoxDepositFragment = (CashBoxDepositFragment) obj;
                RoundedTextView roundedTextView = (RoundedTextView) cashBoxDepositFragment.f32370o.getValue();
                if (roundedTextView != null) {
                    CheckBox checkBox = (CheckBox) cashBoxDepositFragment.t.getValue();
                    Intrinsics.e(checkBox);
                    if (checkBox.isChecked()) {
                        AmountEditText amountEditTextT = cashBoxDepositFragment.t();
                        if (!TextUtils.isEmpty(String.valueOf(amountEditTextT != null ? amountEditTextT.getText() : null))) {
                            z10 = true;
                        }
                    }
                    roundedTextView.setEnabled(z10);
                    return;
                }
                return;
            case 10:
                CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                Intrinsics.checkNotNullParameter(compoundButton, "buttonView");
                CashBoxIntroductionFragment cashBoxIntroductionFragment = (CashBoxIntroductionFragment) obj;
                CheckBox checkBox2 = (CheckBox) cashBoxIntroductionFragment.f32376B.getValue();
                Intrinsics.e(checkBox2);
                if (!checkBox2.isChecked() || (appCompatImageView = (AppCompatImageView) cashBoxIntroductionFragment.f32377C.getValue()) == null) {
                    return;
                }
                appCompatImageView.setVisibility(8);
                return;
            case 11:
                OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                Intrinsics.checkNotNullParameter(compoundButton, "buttonView");
                RoundedTextView roundedTextView2 = (RoundedTextView) ((OrderPreFragment) obj).f32533j.getValue();
                if (roundedTextView2 != null) {
                    roundedTextView2.setEnabled(z3);
                    return;
                }
                return;
            case 12:
                Intrinsics.checkNotNullParameter(compoundButton, "buttonView");
                p158kc.d dVar = (p158kc.d) obj;
                if (z3) {
                    Oe.a aVar5 = dVar.f38746g;
                    if (aVar5 != null) {
                        aVar5.onActive(compoundButton.getTag());
                        return;
                    }
                    return;
                }
                Oe.a aVar6 = dVar.f38746g;
                if (aVar6 != null) {
                    aVar6.onDeActive(compoundButton.getTag());
                    return;
                }
                return;
            case 13:
                int i16 = ThirdPartyMerchantPreviewActivity.f35020w0;
                ThirdPartyMerchantPreviewActivity thirdPartyMerchantPreviewActivity = (ThirdPartyMerchantPreviewActivity) obj;
                thirdPartyMerchantPreviewActivity.showLoadingDialog(true);
                thirdPartyMerchantPreviewActivity.Q();
                return;
            case 14:
                int i17 = OcApplyLiteActivity.f29262C;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                OcApplyLiteActivity ocApplyLiteActivity = (OcApplyLiteActivity) obj;
                Object value3 = ocApplyLiteActivity.f29267e.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                Object value4 = ocApplyLiteActivity.f29269g.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((TextView) value3).setEnabled(((AppCompatCheckBox) value4).isChecked());
                return;
            case 15:
                int i18 = OcGetInstallmentCreditActivity.f29458v0;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                Object value5 = ((OcGetInstallmentCreditActivity) obj).f29459Y.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((TextView) value5).setEnabled(z3);
                return;
            case 16:
                int i19 = OcInstallmentRepayActivity.f29525t0;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                OcInstallmentRepayActivity ocInstallmentRepayActivity = (OcInstallmentRepayActivity) obj;
                if (z3) {
                    ocInstallmentRepayActivity.o().setEnabled(true);
                    return;
                } else {
                    ocInstallmentRepayActivity.o().setEnabled(false);
                    return;
                }
            case 17:
                int i20 = OcRepayActivity.f29705v1;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                OcRepayActivity ocRepayActivity = (OcRepayActivity) obj;
                Object value6 = ocRepayActivity.f29739Z.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                if (((CheckedTextView) value6).isChecked()) {
                    if (z3) {
                        ocRepayActivity.p();
                        return;
                    } else {
                        ocRepayActivity.o();
                        return;
                    }
                }
                return;
            case 18:
                int i21 = OcGuideDoubleOpenFragment.f30417r0;
                Intrinsics.checkNotNullParameter(compoundButton, "buttonView");
                OcGuideDoubleOpenFragment ocGuideDoubleOpenFragment = (OcGuideDoubleOpenFragment) obj;
                if (!z3) {
                    p099gb.b bVar = ocGuideDoubleOpenFragment.f30418Z;
                    if (bVar != null && (textView3 = bVar.openFlexiTv) != null) {
                        textView3.setEnabled(false);
                    }
                    p099gb.b bVar2 = ocGuideDoubleOpenFragment.f30418Z;
                    if (bVar2 == null || (textView2 = bVar2.openFlexiTv) == null) {
                        return;
                    }
                    textView2.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, ocGuideDoubleOpenFragment.getActivity())));
                    return;
                }
                p099gb.b bVar3 = ocGuideDoubleOpenFragment.f30418Z;
                if (bVar3 != null && (textView6 = bVar3.openFlexiTv) != null) {
                    textView6.setEnabled(true);
                }
                p099gb.b bVar4 = ocGuideDoubleOpenFragment.f30418Z;
                if (bVar4 != null && (textView5 = bVar4.openFlexiTv) != null) {
                    textView5.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, ocGuideDoubleOpenFragment.getActivity())));
                }
                p099gb.b bVar5 = ocGuideDoubleOpenFragment.f30418Z;
                if (bVar5 == null || (textView4 = bVar5.openFlexiTv) == null) {
                    return;
                }
                textView4.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextBase, ocGuideDoubleOpenFragment.getContext()));
                return;
            default:
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                OcProtocolLockFragment ocProtocolLockFragment = (OcProtocolLockFragment) obj;
                if (z3 && (context = ocProtocolLockFragment.getContext()) != null && (textViewU = ocProtocolLockFragment.u()) != null) {
                    textViewU.setTextColor(context.getColor(Ya.b.cs_agree_txt_color));
                }
                n0.g().m(ocProtocolLockFragment.getClass().getSimpleName().concat("_element_click"), "oc_proto_cb", "");
                return;
        }
    }

    public /* synthetic */ g(p158kc.c cVar, p158kc.d dVar) {
        this.f92a = 12;
        this.f93b = dVar;
    }
}
