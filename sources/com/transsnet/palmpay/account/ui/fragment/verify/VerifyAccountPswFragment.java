package com.transsnet.palmpay.account.ui.fragment.verify;

import D3.a;
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
import com.transsnet.palmpay.account.bean.rsp.CheckSecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.custom_view.PinEntryView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountPswFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/verify/BaseVerifyAccountFragment;", "Lcom/transsnet/palmpay/core/viewmodel/KeyboardGridLayout$NumKeyboardClickListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyAccountPswFragment extends BaseVerifyAccountFragment implements KeyboardGridLayout.NumKeyboardClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f26323o;

    public static void A(String str, String str2, String str3, String str4) {
        a.O(new Qa.a("setting", "password", "settings", str, "server_verify", str2, str3, str4, 0, 1792));
    }

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
        View viewInflate = inflater.inflate(e.ac_fragment_verify_account_psw, viewGroup, false);
        int i7 = d.bottomView;
        View viewM = p059e1.a.m(i7, viewInflate);
        if (viewM != null) {
            i7 = d.pinView;
            PinEntryView pinEntryView = (PinEntryView) p059e1.a.m(i7, viewInflate);
            if (pinEntryView != null) {
                i7 = d.textViewMessage;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = d.tvForgotPsw;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = d.tvTitle;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                w wVar = new w((ConstraintLayout) viewInflate, viewM, pinEntryView, textView, ppTitleBar, textView2, textView3, 1);
                                this.f26323o = wVar;
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
        w wVar = this.f26323o;
        if (wVar != null) {
            wVar.f4246d.setOnPinEnteredListener(new L(this, 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        w wVar;
        super.o();
        VerifyAccountActivity verifyAccountActivityW = w();
        if (Intrinsics.c(verifyAccountActivityW != null ? verifyAccountActivityW.f26063c : null, SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD)) {
            wVar = this.f26323o;
            if (wVar != null) {
                h.c(wVar.f4249g);
            }
        } else {
            VerifyAccountActivity verifyAccountActivityW2 = w();
            if (Intrinsics.c(verifyAccountActivityW2 != null ? verifyAccountActivityW2.f26063c : null, SecurityVerifyMethodReq.UNLOGIN_RESET_PASSWORD)) {
                wVar = this.f26323o;
                if (wVar != null) {
                    h.c(wVar.f4249g);
                }
            } else {
                w wVar2 = this.f26323o;
                if (wVar2 != null) {
                    wVar2.f4249g.setOnClickListener(new i(this, 12));
                }
            }
        }
        w wVar3 = this.f26323o;
        if (wVar3 != null) {
            wVar3.f4246d.setEnabled(false);
        }
        View viewFindViewById = this.f27318b.findViewById(p025ba.e.number_keyboard_content);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout");
        ((KeyboardGridLayout) viewFindViewById).setNumKeyboardClickListener(this);
        w wVar4 = this.f26323o;
        z(wVar4 != null ? wVar4.f4248f : null);
        w wVar5 = this.f26323o;
        BaseVerifyAccountFragment.u(wVar5 != null ? wVar5.f4248f : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        w wVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        w wVar2 = this.f26323o;
        String strValueOf = String.valueOf((wVar2 == null || (pinEntryView2 = wVar2.f4246d) == null) ? null : pinEntryView2.getText());
        if (TextUtils.isEmpty(strValueOf) || (wVar = this.f26323o) == null || (pinEntryView = wVar.f4246d) == null) {
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
        w wVar2 = this.f26323o;
        String strValueOf = String.valueOf((wVar2 == null || (pinEntryView2 = wVar2.f4246d) == null) ? null : pinEntryView2.getText());
        if (strValueOf.length() > c.f5561b || (wVar = this.f26323o) == null || (pinEntryView = wVar.f4246d) == null) {
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
        String respCode = it.getRespCode();
        it.getRespMsg();
        Pair pairT = a.t(respCode, false, false);
        A("fail", (String) pairT.f38891a, (String) pairT.f38892b, it.getRespMsg());
        w wVar = this.f26323o;
        if (wVar != null) {
            wVar.f4246d.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment
    public final void y(CommonBeanResult it) {
        String respMsg;
        Intrinsics.checkNotNullParameter(it, "it");
        String respCode = it.getRespCode();
        it.getRespMsg();
        Pair pairT = a.t(respCode, false, false);
        String str = (String) pairT.f38891a;
        String str2 = (String) pairT.f38892b;
        CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp = (CheckSecurityVerifyMethodRsp) it.data;
        if (checkSecurityVerifyMethodRsp == null || (respMsg = checkSecurityVerifyMethodRsp.errorMsg) == null) {
            respMsg = it.getRespMsg();
        }
        A("fail", str, str2, respMsg);
        w wVar = this.f26323o;
        if (wVar != null) {
            wVar.f4246d.b();
        }
    }
}
