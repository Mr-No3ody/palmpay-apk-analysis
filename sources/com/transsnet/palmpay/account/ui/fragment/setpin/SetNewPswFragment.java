package com.transsnet.palmpay.account.ui.fragment.setpin;

import Bc.f;
import F8.d;
import F8.e;
import F8.h;
import L8.c;
import Yd.i;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.ChangeTempPinReq;
import com.transsnet.palmpay.account.ui.activity.SetNewPswActivity;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p051d9.P;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/setpin/SetNewPswFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinEnteredListener;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinHideStateChangeListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetNewPswFragment extends BaseFragment implements PinEntryView.OnPinEnteredListener, PinEntryView.OnPinHideStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f26249j = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f26250i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SetNewPswFragment newInstance() {
            SetNewPswFragment setNewPswFragment = new SetNewPswFragment();
            setNewPswFragment.setArguments(new Bundle());
            return setNewPswFragment;
        }

        private a() {
        }
    }

    public static String t(PinEntryView pinEntryView) {
        EditText editText;
        Editable editableText;
        if (pinEntryView == null || (editText = pinEntryView.getEditText()) == null || (editableText = editText.getEditableText()) == null) {
            return null;
        }
        return editableText.toString();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        SetNewPswActivity setNewPswActivity;
        E e10 = this.f27319c;
        if (e10 instanceof SetNewPswActivity) {
            Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SetNewPswActivity");
            setNewPswActivity = (SetNewPswActivity) e10;
        } else {
            setNewPswActivity = null;
        }
        if (setNewPswActivity == null) {
            return 0;
        }
        setNewPswActivity.setTitle(h.ac_new_pin);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_set_new_psw, viewGroup, false);
        int i7 = d.pinView1;
        PinEntryView pinEntryView = (PinEntryView) p059e1.a.m(i7, viewInflate);
        if (pinEntryView != null) {
            i7 = d.pinView2;
            PinEntryView pinEntryView2 = (PinEntryView) p059e1.a.m(i7, viewInflate);
            if (pinEntryView2 != null) {
                i7 = d.textViewNext;
                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = d.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = d.tvError1;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = d.tvError2;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = d.tvTitle;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    f fVar = new f((LinearLayout) viewInflate, pinEntryView, pinEntryView2, ppButton, ppTitleBar, textView, textView2, textView3);
                                    this.f26250i = fVar;
                                    return fVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        f fVar = this.f26250i;
        if (fVar != null) {
            ((PpButton) fVar.f700f).setOnClickListener(new i(this, 5));
        }
        f fVar2 = this.f26250i;
        if (fVar2 != null) {
            ((PpTitleBar) fVar2.f703j).setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        f fVar3 = this.f26250i;
        if (fVar3 != null) {
            ((PpTitleBar) fVar3.f703j).setRightImageView1ClickListener(new W8.d(13));
        }
        f fVar4 = this.f26250i;
        if (fVar4 != null) {
            ((PinEntryView) fVar4.f698d).setOnPinEnteredListener(this);
        }
        f fVar5 = this.f26250i;
        if (fVar5 != null) {
            ((PinEntryView) fVar5.f698d).f31083t0 = this;
        }
        if (fVar5 != null) {
            ((PinEntryView) fVar5.f699e).setOnPinEnteredListener(this);
        }
        f fVar6 = this.f26250i;
        if (fVar6 == null) {
            return 0;
        }
        ((PinEntryView) fVar6.f699e).f31083t0 = this;
        return 0;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinHideStateChangeListener
    public final void onHideStateChanged(PinEntryView pinEntryView, boolean z3) {
        f fVar;
        PinEntryView pinEntryView2;
        f fVar2;
        PinEntryView pinEntryView3;
        f fVar3 = this.f26250i;
        if (!Intrinsics.c(pinEntryView, fVar3 != null ? (PinEntryView) fVar3.f698d : null) && (fVar2 = this.f26250i) != null && (pinEntryView3 = (PinEntryView) fVar2.f698d) != null) {
            pinEntryView3.d(z3);
        }
        f fVar4 = this.f26250i;
        if (Intrinsics.c(pinEntryView, fVar4 != null ? (PinEntryView) fVar4.f699e : null) || (fVar = this.f26250i) == null || (pinEntryView2 = (PinEntryView) fVar.f699e) == null) {
            return;
        }
        pinEntryView2.d(z3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public final void onPinEntered(String str) {
        f fVar;
        EditText editText;
        f fVar2 = this.f26250i;
        boolean z3 = false;
        if (fVar2 != null) {
            p220oa.h.s((TextView) fVar2.f701g, false);
        }
        f fVar3 = this.f26250i;
        if (fVar3 != null) {
            p220oa.h.s((TextView) fVar3.f702i, false);
        }
        f fVar4 = this.f26250i;
        String strT = t(fVar4 != null ? (PinEntryView) fVar4.f698d : null);
        if (strT != null) {
            int length = strT.length();
            int i7 = c.f5561b;
            if (length == i7) {
                f fVar5 = this.f26250i;
                String strT2 = t(fVar5 != null ? (PinEntryView) fVar5.f699e : null);
                if (strT2 != null && strT2.length() == i7) {
                    z3 = true;
                }
            }
        }
        f fVar6 = this.f26250i;
        if (fVar6 != null) {
            ((PpButton) fVar6.f700f).setEnabled(z3);
        }
        f fVar7 = this.f26250i;
        String strT3 = t(fVar7 != null ? (PinEntryView) fVar7.f698d : null);
        f fVar8 = this.f26250i;
        if (fVar8 != null && ((PpButton) fVar8.f700f).isEnabled()) {
            KeyboardUtils.hideSoftInput(getActivity());
            u(strT3);
        } else {
            if (strT3 == null || strT3.length() != c.f5561b || (fVar = this.f26250i) == null || (editText = ((PinEntryView) fVar.f699e).getEditText()) == null) {
                return;
            }
            editText.requestFocus();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void s(boolean z3, boolean z8, String str) {
        f fVar = this.f26250i;
        if (fVar != null) {
            ((PpButton) fVar.f700f).b(z3);
        }
    }

    public final void u(String str) {
        EditText editText;
        Editable editableText;
        EditText editText2;
        Editable editableText2;
        try {
            f fVar = this.f26250i;
            SetNewPswActivity setNewPswActivity = null;
            String string = (fVar == null || (editText2 = ((PinEntryView) fVar.f698d).getEditText()) == null || (editableText2 = editText2.getEditableText()) == null) ? null : editableText2.toString();
            f fVar2 = this.f26250i;
            if (TextUtils.equals(string, (fVar2 == null || (editText = ((PinEntryView) fVar2.f699e).getEditText()) == null || (editableText = editText.getEditableText()) == null) ? null : editableText.toString())) {
                if (c.e(str) || c.d(str)) {
                    f fVar3 = this.f26250i;
                    if (fVar3 != null) {
                        ((TextView) fVar3.f701g).setText(getString(h.ac_msg_invalid_psw));
                    }
                    f fVar4 = this.f26250i;
                    if (fVar4 != null) {
                        p220oa.h.C((TextView) fVar4.f701g);
                        return;
                    }
                    return;
                }
                if (c.c(str) <= 0) {
                    f fVar5 = this.f26250i;
                    if (fVar5 != null) {
                        ((TextView) fVar5.f701g).setText(getString(h.ac_msg_invalid_psw));
                    }
                    f fVar6 = this.f26250i;
                    if (fVar6 != null) {
                        p220oa.h.C((TextView) fVar6.f701g);
                        return;
                    }
                    return;
                }
                E e10 = this.f27319c;
                if (e10 instanceof SetNewPswActivity) {
                    Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SetNewPswActivity");
                    setNewPswActivity = (SetNewPswActivity) e10;
                }
                if (setNewPswActivity != null) {
                    int i7 = setNewPswActivity.f25989c;
                    if (i7 == 4) {
                        setNewPswActivity.m(str);
                        return;
                    }
                    if (i7 == 5) {
                        setNewPswActivity.m(str);
                        return;
                    }
                    if (i7 == 6) {
                        setNewPswActivity.m(str);
                        return;
                    }
                    if (i7 != 7) {
                        return;
                    }
                    ChangeTempPinReq changeTempPinReq = new ChangeTempPinReq();
                    changeTempPinReq.temporaryToken = setNewPswActivity.f25988b;
                    changeTempPinReq.temporaryPassword = SecurityUtils.a(str);
                    changeTempPinReq.loginFlag = false;
                    P p3 = (P) setNewPswActivity.f27350a;
                    if (p3 != null) {
                        p3.resetTempPassword(changeTempPinReq);
                        return;
                    }
                    return;
                }
                return;
            }
        } catch (Exception e11) {
            F6.d.c(this.f27317a, "isEqual: ", e11);
        }
        f fVar7 = this.f26250i;
        if (fVar7 != null) {
            ((TextView) fVar7.f702i).setText(getString(h.ac_msg_password_not_same));
        }
        f fVar8 = this.f26250i;
        if (fVar8 != null) {
            p220oa.h.C((TextView) fVar8.f702i);
        }
    }
}
