package V9;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.flexibank.sdk.customview.FlexiBankPinEntryView;
import com.flexibank.sdk.customview.model.FlexiBankModelSendSms;
import com.transsnet.palmpay.contacts.ui.activity.AddContactActivity;
import com.transsnet.palmpay.contacts.ui.activity.SetContactRemarkActivity;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.model.ModelSendSms;
import com.transsnet.palmpay.send_money.ui.activity.SetAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.SetAmountActivity1;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnFocusChangeListenerC0713b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f10190b;

    public /* synthetic */ ViewOnFocusChangeListenerC0713b(KeyEvent.Callback callback, int i7) {
        this.f10189a = i7;
        this.f10190b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        boolean z8;
        KeyEvent.Callback callback = this.f10190b;
        switch (this.f10189a) {
            case 0:
                ((AddContactActivity) callback).f27133d.setVisibility(z3 ? 8 : 0);
                break;
            case 1:
                ((SetContactRemarkActivity) callback).f27260b.setVisibility(z3 ? 0 : 8);
                break;
            case 2:
                ModelSendSms modelSendSms = (ModelSendSms) callback;
                if (!z3) {
                    modelSendSms.f31580c.setTextColor(modelSendSms.getResources().getColor(L6.b.ppColorTextPrimary));
                    if (TextUtils.isEmpty(modelSendSms.f31581d.getText().toString()) && modelSendSms.f31584g) {
                        float translationY = modelSendSms.f31580c.getTranslationY();
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(modelSendSms.f31580c, "translationY", translationY, SizeUtils.dp2px(20.0f) + translationY);
                        ObjectAnimator.ofFloat(modelSendSms.f31580c, ViewProps.SCALE_Y, 0.8f, 1.0f);
                        ObjectAnimator.ofFloat(modelSendSms.f31580c, ViewProps.SCALE_X, 0.8f, 1.0f);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(objectAnimatorOfFloat);
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        modelSendSms.f31580c.setTextColor(modelSendSms.getResources().getColor(L6.b.ppColorTextPrimary));
                        modelSendSms.f31584g = false;
                    }
                } else if (!modelSendSms.f31584g) {
                    float translationY2 = modelSendSms.f31580c.getTranslationY();
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(modelSendSms.f31580c, "translationY", translationY2, translationY2 - SizeUtils.dp2px(20.0f));
                    ObjectAnimator.ofFloat(modelSendSms.f31580c, ViewProps.SCALE_Y, 1.0f, 0.8f);
                    ObjectAnimator.ofFloat(modelSendSms.f31580c, ViewProps.SCALE_X, 1.0f, 0.8f);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(objectAnimatorOfFloat2);
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    modelSendSms.f31580c.setTextColor(modelSendSms.getResources().getColor(L6.b.ppColorPrimary));
                    modelSendSms.f31584g = true;
                }
                break;
            case 3:
                PinEntryView pinEntryView = (PinEntryView) callback;
                int length = pinEntryView.f31064L.getText().length();
                for (int i7 = 0; i7 < pinEntryView.f31067a; i7++) {
                    View childAt = pinEntryView.getChildAt(i7);
                    if (z3) {
                        int i10 = pinEntryView.f31060A;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (i7 > length) {
                                    int i11 = pinEntryView.f31067a;
                                    if (i7 != i11 - 1 || length != i11) {
                                    }
                                }
                            }
                            z8 = false;
                        }
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    childAt.setSelected(z8);
                }
                pinEntryView.f31064L.setSelection(length);
                View.OnFocusChangeListener onFocusChangeListener = pinEntryView.f31065M;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(pinEntryView, z3);
                }
                break;
            case 4:
                FlexiBankPinEntryView flexiBankPinEntryView = (FlexiBankPinEntryView) callback;
                EditText editText = flexiBankPinEntryView.getEditText();
                Intrinsics.e(editText);
                int length2 = editText.getText().length();
                int digits = flexiBankPinEntryView.getDigits();
                int i12 = 0;
                while (i12 < digits) {
                    flexiBankPinEntryView.getChildAt(i12).setSelected(z3 && (flexiBankPinEntryView.getAccentType() == 1 || (flexiBankPinEntryView.getAccentType() == 2 && (i12 <= length2 || (i12 == flexiBankPinEntryView.getDigits() - 1 && length2 == flexiBankPinEntryView.getDigits())))));
                    i12++;
                }
                EditText editText2 = flexiBankPinEntryView.getEditText();
                Intrinsics.e(editText2);
                editText2.setSelection(length2);
                View.OnFocusChangeListener onFocusChangeListener2 = flexiBankPinEntryView.f22153M;
                if (onFocusChangeListener2 != null) {
                    Intrinsics.e(onFocusChangeListener2);
                    onFocusChangeListener2.onFocusChange(flexiBankPinEntryView, z3);
                }
                break;
            case 5:
                FlexiBankModelSendSms flexiBankModelSendSms = (FlexiBankModelSendSms) callback;
                if (!z3) {
                    TextView mTitleTv = flexiBankModelSendSms.getMTitleTv();
                    Intrinsics.e(mTitleTv);
                    mTitleTv.setTextColor(flexiBankModelSendSms.getResources().getColor(com.flexibank.sdk.m.fb_text_color_black1));
                    EditText mEditText = flexiBankModelSendSms.getMEditText();
                    Intrinsics.e(mEditText);
                    if (TextUtils.isEmpty(mEditText.getText().toString()) && flexiBankModelSendSms.getMZoomOuted()) {
                        TextView textView = flexiBankModelSendSms.mTitleTv;
                        Intrinsics.e(textView);
                        float translationY3 = textView.getTranslationY();
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(flexiBankModelSendSms.mTitleTv, "translationY", translationY3, SizeUtils.dp2px(20.0f) + translationY3);
                        ObjectAnimator.ofFloat(flexiBankModelSendSms.mTitleTv, ViewProps.SCALE_Y, 0.8f, 1.0f);
                        ObjectAnimator.ofFloat(flexiBankModelSendSms.mTitleTv, ViewProps.SCALE_X, 0.8f, 1.0f);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.play(objectAnimatorOfFloat3);
                        animatorSet3.setDuration(200L);
                        animatorSet3.start();
                        TextView textView2 = flexiBankModelSendSms.mTitleTv;
                        Intrinsics.e(textView2);
                        textView2.setTextColor(flexiBankModelSendSms.getResources().getColor(com.flexibank.sdk.m.fb_text_color_black1));
                        flexiBankModelSendSms.mZoomOuted = false;
                    }
                } else if (!flexiBankModelSendSms.getMZoomOuted()) {
                    TextView textView3 = flexiBankModelSendSms.mTitleTv;
                    Intrinsics.e(textView3);
                    float translationY4 = textView3.getTranslationY();
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(flexiBankModelSendSms.mTitleTv, "translationY", translationY4, translationY4 - SizeUtils.dp2px(20.0f));
                    ObjectAnimator.ofFloat(flexiBankModelSendSms.mTitleTv, ViewProps.SCALE_Y, 1.0f, 0.8f);
                    ObjectAnimator.ofFloat(flexiBankModelSendSms.mTitleTv, ViewProps.SCALE_X, 1.0f, 0.8f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.play(objectAnimatorOfFloat4);
                    animatorSet4.setDuration(200L);
                    animatorSet4.start();
                    TextView textView4 = flexiBankModelSendSms.mTitleTv;
                    Intrinsics.e(textView4);
                    textView4.setTextColor(flexiBankModelSendSms.getResources().getColor(com.flexibank.sdk.m.fb_text_color_purple));
                    flexiBankModelSendSms.mZoomOuted = true;
                }
                break;
            case 6:
                SetAmountActivity setAmountActivity = (SetAmountActivity) callback;
                if (z3) {
                    setAmountActivity.f33201b.setCompoundDrawablesWithIntrinsicBounds(com.transsnet.palmpay.custom_view.r.cv_ngn_currency_black_icon, 0, 0, 0);
                } else if (TextUtils.isEmpty(setAmountActivity.f33201b.getString())) {
                    setAmountActivity.f33201b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                break;
            case 7:
                SetAmountActivity1 setAmountActivity1 = (SetAmountActivity1) callback;
                if (z3) {
                    setAmountActivity1.f33207a.setCompoundDrawablesWithIntrinsicBounds(com.transsnet.palmpay.custom_view.r.cv_ngn_currency_black_icon, 0, 0, 0);
                } else if (TextUtils.isEmpty(setAmountActivity1.f33207a.getString())) {
                    setAmountActivity1.f33207a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                break;
            default:
                int i13 = TransferViaUssdActivity.f33628A;
                ((TransferViaUssdActivity) callback).n().setFocus(z3);
                break;
        }
    }
}
