package Ed;

import Pa.n0;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import com.google.android.material.datepicker.DateSelector;
import com.google.api.Service;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormHorizontal;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.form.PpPhoneEditText;
import com.swmansion.rnscreens.SearchBarView;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMediaActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;
import p310ub.C2106v0;

/* JADX INFO: renamed from: Ed.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0235o implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2389b;

    public /* synthetic */ ViewOnFocusChangeListenerC0235o(Object obj, int i7) {
        this.f2388a = i7;
        this.f2389b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        IconicsImageView iconicsImageView;
        ModelErrorDivider modelErrorDivider;
        int i7;
        int i10;
        IconicsImageView iconicsImageView2;
        IconicsImageView iconicsImageView3;
        Editable text;
        IconicsImageView iconicsImageView4;
        IconicsImageView iconicsImageView5;
        Editable text2;
        int i11 = 3;
        String string = null;
        Object obj = this.f2389b;
        switch (this.f2388a) {
            case 0:
                p355xf.t tVar = ((BankAccountPalmPayContactFragment) obj).f33756v;
                if (((IconicsImageView) tVar.getValue()) != null && (iconicsImageView = (IconicsImageView) tVar.getValue()) != null) {
                    iconicsImageView.setVisibility(z3 ? 8 : 0);
                    break;
                }
                break;
            case 1:
                Bc.E e10 = ((TransferToBankAccountView) obj).f33900c;
                if (e10 != null && (modelErrorDivider = (ModelErrorDivider) e10.f633M) != null) {
                    modelErrorDivider.setFocus(z3);
                    break;
                }
                break;
            case 2:
                SearchBarView searchBarView = (SearchBarView) obj;
                int i12 = searchBarView.f25391v;
                searchBarView.j(z3 ? new O7.G(i12, searchBarView.getId()) : new O7.A(i12, searchBarView.getId()));
                break;
            case 3:
                int i13 = PpAmountEditText.f24355q0;
                PpAmountEditText ppAmountEditText = (PpAmountEditText) obj;
                ppAmountEditText.f(z3);
                View.OnFocusChangeListener onFocusChangeListener = ppAmountEditText.f24376p0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z3);
                }
                break;
            case 4:
                PpFormHorizontal.d((PpFormHorizontal) obj, view, z3);
                break;
            case 5:
                PpFormVertical.c((PpFormVertical) obj, view, z3);
                break;
            case 6:
                PpPhoneEditText.c((PpPhoneEditText) obj, view, z3);
                break;
            case 7:
                int i14 = ModelEnterPhoneNumber1.f28342v;
                ModelEnterPhoneNumber1 modelEnterPhoneNumber1 = (ModelEnterPhoneNumber1) obj;
                F6.d.h("ModelEnterPhoneNumber", 3, d0.q("hasFocus:", z3));
                modelEnterPhoneNumber1.post(new D.b(modelEnterPhoneNumber1, z3, i11));
                break;
            case 8:
                P2PInputAmountView p2PInputAmountView = (P2PInputAmountView) obj;
                Context context = p2PInputAmountView.f33005a;
                if (!z3) {
                    p2PInputAmountView.f33008d.setBackgroundColor(context.getColor(L6.b.ppColorDividerLine));
                    p2PInputAmountView.f33010f.setVisibility(8);
                } else {
                    p2PInputAmountView.f33008d.setBackgroundColor(context.getColor(L6.b.ppColorTextPrimary));
                    if (!TextUtils.isEmpty(p2PInputAmountView.f33007c.getText())) {
                        p2PInputAmountView.f33010f.setVisibility(0);
                    } else {
                        p2PInputAmountView.f33010f.setVisibility(8);
                    }
                }
                break;
            case 9:
                int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                if (!z3) {
                    ((BillPaymentElectricityHomeFragment) obj).y();
                }
                break;
            case 10:
                int i16 = BillPaymentTvHomeFragment.f34295v0;
                if (!z3) {
                    ((BillPaymentTvHomeFragment) obj).y();
                }
                break;
            case 11:
                SignUpStep1Fragment signUpStep1Fragment = (SignUpStep1Fragment) obj;
                if (!z3) {
                    Bc.j jVar = signUpStep1Fragment.f26262j;
                    if (jVar != null) {
                        p220oa.h.k((ImageView) jVar.f741i, Integer.valueOf(CommonViewExtKt.getDp(40.0f)), null, null, null, 14);
                    }
                } else {
                    com.transsnet.palmpay.core.viewmodel.c cVar = signUpStep1Fragment.f26254C;
                    if (cVar != null) {
                        cVar.d();
                    }
                    Bc.j jVar2 = signUpStep1Fragment.f26262j;
                    if (jVar2 != null) {
                        p220oa.h.k((ImageView) jVar2.f741i, Integer.valueOf(CommonViewExtKt.getDp(16.0f)), null, null, null, 14);
                    }
                }
                break;
            case 12:
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$0((EditText[]) obj, view, z3);
                break;
            case 13:
                TitleEditView titleEditView = ((com.transsnet.palmpay.custom_view.K) obj).f31029b;
                TitleEditView.CallBack callBack = titleEditView.f31180w0;
                if (callBack != null) {
                    callBack.onFocusChange(view, z3);
                }
                if (!TextUtils.isEmpty(titleEditView.f31165g.getText()) && !z3 && (i7 = titleEditView.f31164f) != 0) {
                    titleEditView.f31166i.setTextColor(i7);
                }
                titleEditView.onFocusChange(view, z3);
                if (titleEditView.f31172q0) {
                    if (!z3) {
                        titleEditView.f31165g.setCompoundDrawables(titleEditView.f31174s0, null, null, null);
                    } else {
                        titleEditView.c(titleEditView.f31165g);
                    }
                    break;
                }
                break;
            case 14:
                ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$18((ModelMobileWithIconInputLayout) obj, view, z3);
                break;
            case 15:
                ModelNumberInputLayout.build$lambda$7((ModelNumberInputLayout) obj, view, z3);
                break;
            case 16:
                AppCompatEditText appCompatEditText = (AppCompatEditText) obj;
                if (!z3) {
                    appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    Editable editableText = appCompatEditText.getEditableText();
                    Intrinsics.checkNotNullExpressionValue(editableText, "getEditableText(...)");
                    appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, editableText.length() > 0 ? com.flexibank.sdk.o.fb_circle_gray_cross : 0, 0);
                }
                break;
            case 17:
                int i17 = TopupAirtimeActivity.f26495x0;
                if (z3) {
                    ((TopupAirtimeActivity) obj).C();
                }
                break;
            case 18:
                String str = FlexiBankTitleEditView.f22193w0;
                FlexiBankTitleEditView flexiBankTitleEditView = (FlexiBankTitleEditView) obj;
                flexiBankTitleEditView.getClass();
                AppCompatEditText mEditTextInput = flexiBankTitleEditView.getMEditTextInput();
                Intrinsics.e(mEditTextInput);
                if (!TextUtils.isEmpty(mEditTextInput.getText()) && !z3 && (i10 = flexiBankTitleEditView.f22208f) != 0) {
                    TextView titleView = flexiBankTitleEditView.getTitleView();
                    Intrinsics.e(titleView);
                    titleView.setTextColor(i10);
                }
                flexiBankTitleEditView.onFocusChange(view, z3);
                if (flexiBankTitleEditView.f22215p0) {
                    if (!z3) {
                        AppCompatEditText mEditTextInput2 = flexiBankTitleEditView.getMEditTextInput();
                        Intrinsics.e(mEditTextInput2);
                        mEditTextInput2.setCompoundDrawables(flexiBankTitleEditView.f22217r0, null, null, null);
                    } else {
                        flexiBankTitleEditView.b(flexiBankTitleEditView.getMEditTextInput());
                    }
                    break;
                }
                break;
            case 19:
                int i18 = PayShopInputAmountActivity.f33176p;
                PayShopInputAmountActivity payShopInputAmountActivity = (PayShopInputAmountActivity) obj;
                if (!z3) {
                    p223od.a aVar = (p223od.a) payShopInputAmountActivity.f27334c;
                    if (aVar != null && (iconicsImageView2 = aVar.f40290f) != null) {
                        p220oa.h.c(iconicsImageView2);
                        break;
                    }
                } else {
                    p223od.a aVar2 = (p223od.a) payShopInputAmountActivity.f27334c;
                    if (aVar2 != null && (iconicsImageView3 = aVar2.f40290f) != null) {
                        EditText editText = aVar2.f40289e;
                        if (editText != null && (text = editText.getText()) != null) {
                            string = text.toString();
                        }
                        p220oa.h.s(iconicsImageView3, !TextUtils.isEmpty(string));
                        break;
                    }
                }
                break;
            case 20:
                int i19 = SelectBankActivity.f33187A;
                p355xf.t tVar2 = ((SelectBankActivity) obj).f33191f;
                Object value = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                if (((ImageView) value) != null) {
                    Object value2 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((ImageView) value2).setVisibility(z3 ? 8 : 0);
                }
                break;
            case 21:
                int i20 = WithdrawInputAmountActivity.f33293p;
                WithdrawInputAmountActivity withdrawInputAmountActivity = (WithdrawInputAmountActivity) obj;
                if (!z3) {
                    p223od.a aVar3 = (p223od.a) withdrawInputAmountActivity.f27334c;
                    if (aVar3 != null && (iconicsImageView4 = aVar3.f40290f) != null) {
                        p220oa.h.c(iconicsImageView4);
                        break;
                    }
                } else {
                    p223od.a aVar4 = (p223od.a) withdrawInputAmountActivity.f27334c;
                    if (aVar4 != null && (iconicsImageView5 = aVar4.f40290f) != null) {
                        EditText editText2 = aVar4.f40289e;
                        if (editText2 != null && (text2 = editText2.getText()) != null) {
                            string = text2.toString();
                        }
                        p220oa.h.s(iconicsImageView5, !TextUtils.isEmpty(string));
                        break;
                    }
                }
                break;
            case 22:
                int i21 = CLRepaymentActivity.f29036w0;
                CLRepaymentActivity cLRepaymentActivity = (CLRepaymentActivity) obj;
                cLRepaymentActivity.w(z3);
                cLRepaymentActivity.t().setBackgroundColor(cLRepaymentActivity.getColor(z3 ? Ya.b.cs_cl_input_divider_focus_color : Ya.b.cs_cl_input_divider_normal_color));
                break;
            case 23:
                C2085k0 c2085k0 = (C2085k0) obj;
                c2085k0.getClass();
                n0.g().m(((OcMTNLoginActivity) c2085k0.f42878b).getClass().getSimpleName().concat("_element_click"), "cs_verification_code_input", String.valueOf(z3));
                break;
            case 24:
                int i22 = OcMediaActivity.f29577y0;
                n0.g().m(((OcMediaActivity) obj).getClass().getSimpleName().concat("_element_click"), "account_num_et", String.valueOf(z3));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                C2106v0 c2106v0 = (C2106v0) obj;
                c2106v0.getClass();
                n0.g().m(c2106v0.f42934a.getClass().getSimpleName().concat("_element_click"), "cs_verification_code_input", String.valueOf(z3));
                break;
            case 26:
                OcRepayActivity ocRepayActivity = (OcRepayActivity) obj;
                Object value3 = ocRepayActivity.f29709B0.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((View) value3).setBackgroundColor(ocRepayActivity.getColor(z3 ? Ya.b.cs_cl_input_divider_focus_color : Ya.b.cs_cl_input_divider_normal_color));
                break;
            case 27:
                int i23 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                p355xf.t tVar3 = ((ScheduleTransferForBankUnstableBeneficiariesListActivity) obj).f33429f;
                Object value4 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                if (((IconicsImageView) value4) != null) {
                    Object value5 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    ((IconicsImageView) value5).setVisibility(z3 ? 8 : 0);
                }
                break;
            case 28:
                int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                p220oa.h.s(((ScheduleTransferForBankUnstableHomeActivity) obj).u(), !z3);
                break;
            default:
                int i25 = SelectBankForToBankActivity.f33506B;
                p355xf.t tVar4 = ((SelectBankForToBankActivity) obj).f33511f;
                Object value6 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                if (((ImageView) value6) != null) {
                    Object value7 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    ((ImageView) value7).setVisibility(z3 ? 8 : 0);
                }
                break;
        }
    }
}
