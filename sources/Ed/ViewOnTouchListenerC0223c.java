package Ed;

import Rd.C0599o;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Ed.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnTouchListenerC0223c implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2362b;

    public /* synthetic */ ViewOnTouchListenerC0223c(Object obj, int i7) {
        this.f2361a = i7;
        this.f2362b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        Runnable runnable;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout2;
        DigitalKeyboardView digitalKeyboardView;
        DigitalKeyboardView digitalKeyboardView2;
        DigitalKeyboardView digitalKeyboardView3;
        DigitalKeyboardView digitalKeyboardView4;
        Object obj = this.f2362b;
        switch (this.f2361a) {
            case 0:
                if (event.getAction() == 0) {
                    ((BankAccountBeneficiaryFragment) obj).t("Search box");
                }
                return false;
            case 1:
                if (event.getAction() == 0) {
                    ((WithdrawV2Fragment) obj).f27063r0 = true;
                }
                return false;
            case 2:
                WhyTurnOffSaveDialogFragment.a aVar = WhyTurnOffSaveDialogFragment.f32329Z;
                if (event.getAction() == 0) {
                    try {
                        Rect rect = new Rect();
                        EditText editText = (EditText) obj;
                        if (editText != null) {
                            editText.getGlobalVisibleRect(rect);
                        }
                        view.getLocationOnScreen(new int[2]);
                        if (!rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                            KeyboardUtils.hideSoftInput(editText);
                            if (editText != null) {
                                editText.clearFocus();
                            }
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 3:
                int i7 = ModelUsePointsWithSwitch.t;
                if (event.getAction() == 1 && (runnable = (Runnable) obj) != null) {
                    runnable.run();
                }
                return true;
            case 4:
                ModelCopyableText modelCopyableText = (ModelCopyableText) obj;
                Drawable drawable = modelCopyableText.f31492d.getCompoundDrawables()[2];
                if (drawable != null && event.getAction() == 0 && event.getX() > (modelCopyableText.f31492d.getWidth() - modelCopyableText.f31492d.getPaddingRight()) - (drawable.getIntrinsicWidth() * 2)) {
                    ToastUtils.showLong(com.transsnet.palmpay.custom_view.v.cv_copy_successful);
                    ClipboardUtils.copyText(modelCopyableText.f31492d.getText());
                }
                return false;
            case 5:
                TitleEditView titleEditView = (TitleEditView) obj;
                Drawable drawable2 = titleEditView.f31165g.getCompoundDrawables()[2];
                if (drawable2 != null && event.getAction() == 0 && event.getX() > (titleEditView.f31165g.getWidth() - titleEditView.f31165g.getPaddingRight()) - drawable2.getIntrinsicWidth()) {
                    View.OnClickListener onClickListener = titleEditView.f31178v0;
                    if (onClickListener != null) {
                        onClickListener.onClick(titleEditView.f31165g);
                    }
                    if (titleEditView.f31172q0) {
                        titleEditView.f31165g.getEditableText().clear();
                    }
                }
                return false;
            case 6:
                return CustomAutoCompleteTextView.showDropDown$lambda$3((CustomAutoCompleteTextView) obj, view, event);
            case 7:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                C0599o c0599o = (C0599o) ((BuyBundleHomePageActivity) obj).f27334c;
                if (c0599o != null && (modelMobileWithIconInputLayout = c0599o.f8429d) != null) {
                    modelMobileWithIconInputLayout.showContactIv(true, true);
                }
                return false;
            case 8:
                int i10 = TopupAirtimeActivity.f26495x0;
                Rd.H h7 = (Rd.H) ((TopupAirtimeActivity) obj).f27334c;
                if (h7 != null && (modelMobileWithIconInputLayout2 = h7.f8066g) != null) {
                    modelMobileWithIconInputLayout2.showContactIv(true, true);
                }
                return false;
            case 9:
                FlexiBankTitleEditView flexiBankTitleEditView = (FlexiBankTitleEditView) obj;
                AppCompatEditText appCompatEditText = flexiBankTitleEditView.mEditTextInput;
                Intrinsics.e(appCompatEditText);
                Drawable drawable3 = appCompatEditText.getCompoundDrawables()[2];
                if (drawable3 != null) {
                    Intrinsics.e(event);
                    if (event.getAction() == 0) {
                        float x3 = event.getX();
                        AppCompatEditText appCompatEditText2 = flexiBankTitleEditView.mEditTextInput;
                        Intrinsics.e(appCompatEditText2);
                        int width = appCompatEditText2.getWidth();
                        AppCompatEditText appCompatEditText3 = flexiBankTitleEditView.mEditTextInput;
                        Intrinsics.e(appCompatEditText3);
                        if (x3 > (width - appCompatEditText3.getPaddingRight()) - drawable3.getIntrinsicWidth()) {
                            View.OnClickListener onClickListener2 = flexiBankTitleEditView.f22220u0;
                            if (onClickListener2 != null) {
                                onClickListener2.onClick(flexiBankTitleEditView.mEditTextInput);
                            }
                            if (flexiBankTitleEditView.f22215p0) {
                                AppCompatEditText appCompatEditText4 = flexiBankTitleEditView.mEditTextInput;
                                Intrinsics.e(appCompatEditText4);
                                appCompatEditText4.getEditableText().clear();
                            }
                        }
                    }
                }
                return false;
            case 10:
                int i11 = PayShopInputAmountActivity.f33176p;
                if (event.getAction() == 0) {
                    PayShopInputAmountActivity payShopInputAmountActivity = (PayShopInputAmountActivity) obj;
                    payShopInputAmountActivity.getClass();
                    p223od.a aVar2 = (p223od.a) payShopInputAmountActivity.f27334c;
                    if (aVar2 != null && (digitalKeyboardView = aVar2.f40295p) != null) {
                        p220oa.h.s(digitalKeyboardView, false);
                    }
                    p223od.a aVar3 = (p223od.a) payShopInputAmountActivity.f27334c;
                    KeyboardUtils.showSoftInput(aVar3 != null ? aVar3.f40289e : null);
                }
                return false;
            case 11:
                int i12 = WithdrawInputAmountActivity.f33293p;
                if (event.getAction() == 0) {
                    WithdrawInputAmountActivity withdrawInputAmountActivity = (WithdrawInputAmountActivity) obj;
                    withdrawInputAmountActivity.getClass();
                    p223od.a aVar4 = (p223od.a) withdrawInputAmountActivity.f27334c;
                    if (aVar4 != null && (digitalKeyboardView2 = aVar4.f40295p) != null) {
                        p220oa.h.s(digitalKeyboardView2, false);
                    }
                    p223od.a aVar5 = (p223od.a) withdrawInputAmountActivity.f27334c;
                    KeyboardUtils.showSoftInput(aVar5 != null ? aVar5.f40289e : null);
                }
                return false;
            case 12:
                TransferToBankInputAmountActivity.a aVar6 = TransferToBankInputAmountActivity.f33522C;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    TransferToBankInputAmountActivity transferToBankInputAmountActivity = (TransferToBankInputAmountActivity) obj;
                    transferToBankInputAmountActivity.getClass();
                    p223od.i iVar = (p223od.i) transferToBankInputAmountActivity.f27334c;
                    if (iVar != null && (digitalKeyboardView3 = iVar.f40380j) != null) {
                        p220oa.h.s(digitalKeyboardView3, false);
                    }
                    p223od.i iVar2 = (p223od.i) transferToBankInputAmountActivity.f27334c;
                    KeyboardUtils.showSoftInput(iVar2 != null ? iVar2.f40373b : null);
                }
                return false;
            default:
                int i13 = TransferToPalmPayInputAmountActivity.f33602Y;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) obj;
                    transferToPalmPayInputAmountActivity.getClass();
                    KeyboardUtils.showSoftInput(transferToPalmPayInputAmountActivity.f33606H);
                    p223od.j jVar = (p223od.j) transferToPalmPayInputAmountActivity.f27334c;
                    if (jVar != null && (digitalKeyboardView4 = jVar.f40403p) != null) {
                        p220oa.h.s(digitalKeyboardView4, false);
                    }
                }
                return false;
        }
    }
}
