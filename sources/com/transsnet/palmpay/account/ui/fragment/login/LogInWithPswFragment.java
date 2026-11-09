package com.transsnet.palmpay.account.ui.fragment.login;

import Bc.C0107d;
import C0.AbstractC0130w;
import C0.U;
import F8.d;
import F8.e;
import I8.u;
import L8.c;
import Pa.r0;
import W8.k;
import W8.l;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.rsp.CheckPasswordRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.custom_view.PinEntryView;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p051d9.C1623u;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInWithPswFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/u;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "Lcom/transsnet/palmpay/core/viewmodel/KeyboardGridLayout$NumKeyboardClickListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogInWithPswFragment extends BaseMVPFragment<C1623u> implements LoginContract.View, KeyboardGridLayout.NumKeyboardClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f26216p = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC0130w f26217j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f26218o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LogInWithPinFragment newInstance() {
            LogInWithPinFragment logInWithPinFragment = new LogInWithPinFragment();
            logInWithPinFragment.setArguments(new Bundle());
            return logInWithPinFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void handleCheckPasswordResult(CommonBeanResult commonBeanResult, int i7) {
        CheckPasswordRsp checkPasswordRsp;
        if (commonBeanResult != null && commonBeanResult.isSuccess() && (checkPasswordRsp = (CheckPasswordRsp) commonBeanResult.data) != null && checkPasswordRsp.passwordCheck) {
            D3.a.O(new Qa.a("login", "password", "login_page", "success", "server_verify", null, null, null, 0, 2016));
            if (i7 == Integer.MAX_VALUE) {
                LogInActivity logInActivityV = v();
                if (logInActivityV != null) {
                    logInActivityV.p(new k(this));
                    return;
                }
                return;
            }
            U u6 = new U(false, false, d.fragment_login_input_mobile, false, false, -1, -1, -1, -1);
            AbstractC0130w abstractC0130w = this.f26217j;
            if (abstractC0130w != null) {
                abstractC0130w.h(i7, getArguments(), u6);
                return;
            }
            return;
        }
        CheckPasswordRsp checkPasswordRsp2 = commonBeanResult != null ? (CheckPasswordRsp) commonBeanResult.data : null;
        String respCode = commonBeanResult != null ? commonBeanResult.getRespCode() : null;
        if (commonBeanResult != null) {
            commonBeanResult.getRespMsg();
        }
        boolean z3 = false;
        Pair pairT = D3.a.t(respCode, checkPasswordRsp2 != null && checkPasswordRsp2.lock, checkPasswordRsp2 != null && checkPasswordRsp2.passwordCheck);
        String str = (String) pairT.f38891a;
        String str2 = (String) pairT.f38892b;
        if (commonBeanResult != null && commonBeanResult.isSuccess()) {
            z3 = true;
        }
        D3.a.O(new Qa.a("login", "password", "login_page", "fail", "server_verify", str, str2, D3.a.D(commonBeanResult != null ? commonBeanResult.getRespMsg() : null, commonBeanResult != null ? commonBeanResult.getRespCode() : null, checkPasswordRsp2 != null ? checkPasswordRsp2.getError() : null, z3), 0, 1792));
        u uVar = this.f26218o;
        if (uVar != null) {
            uVar.f4229e.b();
        }
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            LogInActivity logInActivityV2 = v();
            if (logInActivityV2 != null) {
                logInActivityV2.m(new CommonResult(commonBeanResult != null ? commonBeanResult.getRespCode() : null, commonBeanResult != null ? commonBeanResult.getRespMsg() : null), true);
                return;
            }
            return;
        }
        LogInActivity logInActivityV3 = v();
        if (logInActivityV3 != null) {
            Integer numValueOf = Integer.valueOf(p025ba.k.core_failed_all_cap);
            CheckPasswordRsp checkPasswordRsp3 = (CheckPasswordRsp) commonBeanResult.data;
            n.O(logInActivityV3, 0, numValueOf, null, null, null, null, checkPasswordRsp3 != null ? checkPasswordRsp3.getError() : null, Integer.valueOf(p025ba.k.core_confirm), null, null, null, null, null, null, true, 0, 8306301);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void handleSecurityFlowResult(GetSecurityFlowRsp getSecurityFlowRsp) {
        if (getSecurityFlowRsp != null) {
            getSecurityFlowRsp.action = 36;
        }
        if (getSecurityFlowRsp != null) {
            LogInActivity logInActivity = (LogInActivity) getActivity();
            getSecurityFlowRsp.mobile = logInActivity != null ? logInActivity.f25879B : null;
        }
        if (getSecurityFlowRsp != null) {
            getSecurityFlowRsp.nextStep(null, null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        LogInActivity logInActivityV = v();
        if (n.w(logInActivityV != null ? logInActivityV.f25879B : null) && new p131id.a(getContext()).W()) {
            u uVar = this.f26218o;
            if (uVar != null) {
                h.s(uVar.f4236v, true);
            }
            u uVar2 = this.f26218o;
            if (uVar2 != null) {
                h.s(uVar2.t, true);
            }
            u uVar3 = this.f26218o;
            if (uVar3 != null) {
                uVar3.t.setOnClickListener(new l(this, 0));
                return 0;
            }
        } else {
            u uVar4 = this.f26218o;
            if (uVar4 != null) {
                h.s(uVar4.f4236v, false);
            }
            u uVar5 = this.f26218o;
            if (uVar5 != null) {
                h.s(uVar5.t, false);
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        View viewM2;
        View viewM3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_with_psw, viewGroup, false);
        int i7 = d.groupTop;
        if (((Group) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = d.imageViewAvatar;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
            if (appCompatImageView != null && (viewM = p059e1.a.m((i7 = d.layoutHeader), viewInflate)) != null) {
                C0107d c0107dC = C0107d.c(viewM);
                i7 = d.pinView;
                PinEntryView pinEntryView = (PinEntryView) p059e1.a.m(i7, viewInflate);
                if (pinEntryView != null && (viewM2 = p059e1.a.m((i7 = d.securityKeyBoard), viewInflate)) != null) {
                    i7 = d.tv1;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = d.tv2;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = d.tvError;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = d.tvForgotPin;
                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView4 != null) {
                                    i7 = d.tvPhone;
                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView5 != null) {
                                        i7 = d.tvVerify;
                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView6 != null && (viewM3 = p059e1.a.m((i7 = d.viewLine1), viewInflate)) != null) {
                                            u uVar = new u((ConstraintLayout) viewInflate, appCompatImageView, c0107dC, pinEntryView, viewM2, textView, textView2, textView3, textView4, textView5, textView6, viewM3, 1);
                                            this.f26218o = uVar;
                                            return uVar;
                                        }
                                    }
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
    public final int o() {
        LogInReq logInReq;
        String str;
        u uVar;
        this.f26217j = NavHostFragment.f17502e.findNavController(this);
        u uVar2 = this.f26218o;
        if (uVar2 != null) {
            uVar2.f4234o.setOnClickListener(new l(this, 1));
        }
        LogInActivity logInActivityV = v();
        if (logInActivityV != null && (logInReq = logInActivityV.f25888b) != null && (str = logInReq.mobileNo) != null && (uVar = this.f26218o) != null) {
            uVar.f4235p.setText(r0.E0(str));
        }
        u uVar3 = this.f26218o;
        AppCompatImageView appCompatImageView = uVar3 != null ? uVar3.f4227c : null;
        LogInActivity logInActivityV2 = v();
        r0.m1(logInActivityV2 != null ? logInActivityV2.f25898p : null, appCompatImageView);
        this.f27318b.findViewById(d.ivBack).setOnClickListener(new l(this, 2));
        u uVar4 = this.f26218o;
        if (uVar4 != null) {
            uVar4.f4229e.setEnabled(false);
        }
        u uVar5 = this.f26218o;
        if (uVar5 != null) {
            uVar5.f4229e.setOnPinEnteredListener(new k(this));
        }
        View view = this.f27318b;
        KeyboardGridLayout keyboardGridLayout = view != null ? (KeyboardGridLayout) view.findViewById(p025ba.e.number_keyboard_content) : null;
        if (keyboardGridLayout != null) {
            keyboardGridLayout.setNumKeyboardClickListener(this);
        }
        u uVar6 = this.f26218o;
        if (uVar6 != null) {
            ((IconicsImageView) uVar6.f4228d.f682d).setOnClickListener(new W8.d(5));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        PinEntryView pinEntryView;
        Editable text;
        u uVar;
        PinEntryView pinEntryView2;
        u uVar2 = this.f26218o;
        if (uVar2 == null || (pinEntryView = uVar2.f4229e) == null || (text = pinEntryView.getText()) == null || TextUtils.isEmpty(text) || (uVar = this.f26218o) == null || (pinEntryView2 = uVar.f4229e) == null) {
            return;
        }
        pinEntryView2.setText(text.subSequence(0, text.length() - 1).toString());
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String str) {
        u uVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        Editable text;
        u uVar2 = this.f26218o;
        String string = (uVar2 == null || (pinEntryView2 = uVar2.f4229e) == null || (text = pinEntryView2.getText()) == null) ? null : text.toString();
        if ((string != null ? string.length() : 0) > c.f5561b || (uVar = this.f26218o) == null || (pinEntryView = uVar.f4229e) == null) {
            return;
        }
        pinEntryView.setText(string + str);
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

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1623u();
    }

    public final void u() {
        PinEntryView pinEntryView;
        u uVar = this.f26218o;
        if (uVar != null && (pinEntryView = uVar.f4229e) != null) {
            pinEntryView.b();
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_type", SecurityVerifyMethodReq.UNLOGIN_RESET_PASSWORD);
        LogInActivity logInActivityV = v();
        bundle.putString("_number", logInActivityV != null ? logInActivityV.f25879B : null);
        com.palmpay.lib.apm.launchcounter.util.d.E(bundle, "/account/verifyAccount");
    }

    public final LogInActivity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof LogInActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
        return (LogInActivity) e10;
    }
}
