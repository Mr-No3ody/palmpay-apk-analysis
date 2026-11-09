package com.transsnet.palmpay.account.ui.fragment.verify;

import F8.d;
import F8.e;
import I8.w;
import L8.c;
import Yd.i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.camera.core.impl.L;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.custom_view.PinEntryView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountPinFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/verify/BaseVerifyAccountFragment;", "Lcom/transsnet/palmpay/core/viewmodel/KeyboardGridLayout$NumKeyboardClickListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyAccountPinFragment extends BaseVerifyAccountFragment implements KeyboardGridLayout.NumKeyboardClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f26322o;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_verify_account_pin, viewGroup, false);
        int i7 = d.bottomView;
        View viewM = a.m(i7, viewInflate);
        if (viewM != null) {
            i7 = d.pinView;
            PinEntryView pinEntryView = (PinEntryView) a.m(i7, viewInflate);
            if (pinEntryView != null) {
                i7 = d.textViewMessage;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = d.tv_forget_pin;
                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = d.tvTitle;
                            TextView textView3 = (TextView) a.m(i7, viewInflate);
                            if (textView3 != null) {
                                w wVar = new w((ConstraintLayout) viewInflate, viewM, pinEntryView, textView, ppTitleBar, textView2, textView3, 0);
                                this.f26322o = wVar;
                                return wVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        w wVar = this.f26322o;
        if (wVar != null) {
            wVar.f4246d.setOnPinEnteredListener(new L(this, 7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        w wVar;
        super.o();
        VerifyAccountActivity verifyAccountActivityW = w();
        if (Intrinsics.c(verifyAccountActivityW != null ? verifyAccountActivityW.f26063c : null, SecurityVerifyMethodReq.LOGIN_RESET_PIN)) {
            wVar = this.f26322o;
            if (wVar != null) {
                h.c(wVar.f4249g);
            }
        } else {
            VerifyAccountActivity verifyAccountActivityW2 = w();
            if (Intrinsics.c(verifyAccountActivityW2 != null ? verifyAccountActivityW2.f26063c : null, SecurityVerifyMethodReq.UNLOGIN_RESET_PIN)) {
                wVar = this.f26322o;
                if (wVar != null) {
                    h.c(wVar.f4249g);
                }
            } else {
                w wVar2 = this.f26322o;
                if (wVar2 != null) {
                    wVar2.f4249g.setOnClickListener(new i(this, 11));
                }
            }
        }
        w wVar3 = this.f26322o;
        if (wVar3 != null) {
            wVar3.f4246d.setEnabled(false);
        }
        View viewFindViewById = this.f27318b.findViewById(p025ba.e.number_keyboard_content);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout");
        ((KeyboardGridLayout) viewFindViewById).setNumKeyboardClickListener(this);
        w wVar4 = this.f26322o;
        z(wVar4 != null ? wVar4.f4248f : null);
        w wVar5 = this.f26322o;
        BaseVerifyAccountFragment.u(wVar5 != null ? wVar5.f4248f : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        w wVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        w wVar2 = this.f26322o;
        String strValueOf = String.valueOf((wVar2 == null || (pinEntryView2 = wVar2.f4246d) == null) ? null : pinEntryView2.getText());
        if (TextUtils.isEmpty(strValueOf) || (wVar = this.f26322o) == null || (pinEntryView = wVar.f4246d) == null) {
            return;
        }
        String strSubstring = strValueOf.substring(0, strValueOf.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        pinEntryView.setText(strSubstring);
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String num) {
        w wVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        Intrinsics.checkNotNullParameter(num, "num");
        w wVar2 = this.f26322o;
        String strValueOf = String.valueOf((wVar2 == null || (pinEntryView2 = wVar2.f4246d) == null) ? null : pinEntryView2.getText());
        if (strValueOf.length() > c.f5560a || (wVar = this.f26322o) == null || (pinEntryView = wVar.f4246d) == null) {
            return;
        }
        pinEntryView.setText(strValueOf + num);
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

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void showLoadingView(boolean z3) {
        showLoadingDialog(z3);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment
    public final void x(CommonBeanResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        w wVar = this.f26322o;
        if (wVar != null) {
            wVar.f4246d.b();
        }
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment
    public final void y(CommonBeanResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        w wVar = this.f26322o;
        if (wVar != null) {
            wVar.f4246d.b();
        }
    }
}
