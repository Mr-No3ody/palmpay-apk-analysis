package com.transsnet.palmpay.account.ui.fragment.signup;

import Bc.C0107d;
import Bc.D;
import C0.G;
import Ce.H;
import Ce.p0;
import F8.d;
import L6.b;
import Pa.C0521s;
import Pa.C0525w;
import Pa.n0;
import Ua.l0;
import Wf.AbstractC0780y;
import Wf.I;
import Yd.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.Gson;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.PreSignUpRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p010a9.m;
import p010a9.n;
import p010a9.p;
import p025ba.k;
import p042cg.e;
import p042cg.f;
import p051d9.d0;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/signup/SignUpStepInputPinV2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/d0;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/SignUpContract$View;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinEnteredListener;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinHideStateChangeListener;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSignUpStepInputPinV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpStepInputPinV2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/signup/SignUpStepInputPinV2Fragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,530:1\n629#2,11:531\n694#2,50:542\n694#2,50:592\n641#2,12:642\n*S KotlinDebug\n*F\n+ 1 SignUpStepInputPinV2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/signup/SignUpStepInputPinV2Fragment\n*L\n220#1:531,11\n449#1:542,50\n466#1:592,50\n471#1:642,12\n*E\n"})
public final class SignUpStepInputPinV2Fragment extends BaseMVPFragment<d0> implements SignUpContract.View, CustomActionCallback, PinEntryView.OnPinEnteredListener, PinEntryView.OnPinHideStateChangeListener, IAutoTrack {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f26273A = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D f26274j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26276p = true;
    public c t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MemberInfo f26277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PreSignUpRsp f26278w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SignUpStepInputPinV2Fragment newInstance() {
            SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment = new SignUpStepInputPinV2Fragment();
            signUpStepInputPinV2Fragment.setArguments(new Bundle());
            return signUpStepInputPinV2Fragment;
        }

        private a() {
        }
    }

    public static String w(PinEntryView pinEntryView) {
        EditText editText;
        Editable editableText;
        if (pinEntryView == null || (editText = pinEntryView.getEditText()) == null || (editableText = editText.getEditableText()) == null) {
            return null;
        }
        return editableText.toString();
    }

    public final void A(boolean z3) {
        D d2 = this.f26274j;
        if (d2 != null) {
            IconicsImageView iconicsImageView = (IconicsImageView) d2.t;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, z3 ? S6.a.pay_Hide : S6.a.pay_Show);
            iconicsDrawable.a(new m(this, 0));
            iconicsImageView.setImageDrawable(iconicsDrawable);
        }
    }

    public final void B(MemberInfo memberInfo, boolean z3) {
        if (memberInfo == null) {
            d0 d0Var = (d0) this.f27328i;
            if (d0Var != null) {
                d0Var.updateUser(z3);
                return;
            }
            return;
        }
        p156ka.a userDataSource = BaseApplication.get().getUserDataSource();
        if (userDataSource != null) {
            userDataSource.d(memberInfo, false);
        }
        if (z3) {
            x(this.f26278w);
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "SetPIN";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26275o) {
            return false;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new p(this, null), 2);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void handleCheckInvitationCode(CommonResult result) {
        PpFormVertical ppFormVertical;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.isSuccess()) {
            y(false);
            return;
        }
        D d2 = this.f26274j;
        if (d2 == null || (ppFormVertical = (PpFormVertical) d2.f617c) == null) {
            return;
        }
        ppFormVertical.h(result.getRespMsg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void handlePreSignUpResult(CommonBeanResult response) {
        SignUpReq signUpReqM;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            n0.g().u((ViewEvent) G.g("Signup_Result_Failed", true));
            String respCode = response.getRespCode();
            String respMsg = response.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            z(respCode, respMsg);
            return;
        }
        C0521s c0521s = C0521s.f7158a;
        C0521s.b();
        p367ya.a aVarD = p367ya.a.d();
        SignUpActivity signUpActivityV = v();
        aVarD.f44149a.i("last_phone_number", (signUpActivityV == null || (signUpReqM = signUpActivityV.m()) == null) ? null : signUpReqM.mobileNo);
        p059e1.a.X("keyConfirmPermissionDialog", true);
        p059e1.a.X("key_need_agree_privacy", ((PreSignUpRsp) response.data).needSignAgreement);
        PreSignUpRsp preSignUpRsp = (PreSignUpRsp) response.data;
        this.f26278w = preSignUpRsp;
        if (TextUtils.isEmpty(preSignUpRsp.token)) {
            t tVar = new t(getActivity());
            tVar.f31303b = "Your profile has been created";
            Context context = getContext();
            tVar.f31308g = context != null ? G8.a.x(context, S6.a.pay_SelectedOutline, null, Integer.valueOf(b.ppColorSuccess), 48.0f, 114) : null;
            tVar.f31304c = "Please complete identity verification to start your PalmPay journey";
            tVar.f31311j = new p0(6, this, response);
            tVar.f31310i = 4000L;
            tVar.d(0);
        } else {
            BaseApplication.get().setToken(((PreSignUpRsp) response.data).token);
            p367ya.a.d().f44149a.i("member_id", ((PreSignUpRsp) response.data).memberId);
            PreSignUpRsp preSignUpRsp2 = this.f26278w;
            B(preSignUpRsp2 != null ? preSignUpRsp2.memberInfo : null, false);
            t tVar2 = new t(getActivity());
            Context context2 = getContext();
            tVar2.f31308g = context2 != null ? G8.a.x(context2, S6.a.pay_SelectedOutline, null, Integer.valueOf(b.ppColorSuccess), 48.0f, 114) : null;
            tVar2.f31303b = "Your profile has been created";
            tVar2.f31304c = "Please complete identity verification to start your PalmPay journey";
            tVar2.f31311j = new Dd.b(this, 17);
            tVar2.f31310i = 4000L;
            tVar2.d(0);
        }
        n0.g().u(((ViewEvent) G.g("PreSignup_Result_Success", true)).add("memberId", ((PreSignUpRsp) response.data).memberId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void handleUserInfo(CommonBeanResult commonBeanResult, boolean z3) {
        String respMsg;
        if (commonBeanResult != null && commonBeanResult.isSuccess()) {
            T t = commonBeanResult.data;
            this.f26277v = (MemberInfo) t;
            B((MemberInfo) t, z3);
        } else {
            String respCode = commonBeanResult != null ? commonBeanResult.getRespCode() : null;
            if (commonBeanResult == null || (respMsg = commonBeanResult.getRespMsg()) == null) {
                respMsg = "";
            }
            z(respCode, respMsg);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        View viewM2;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_signup_input_pin_v2, viewGroup, false);
        int i7 = d.barrier;
        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = d.btnNext;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = d.inputInvitationCode;
                PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                if (ppFormVertical != null) {
                    i7 = d.ivAnswer;
                    if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = d.ivEyes;
                        IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                        if (iconicsImageView != null) {
                            i7 = d.ivShowInputInvitationCode;
                            IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                            if (iconicsImageView2 != null && (viewM = p059e1.a.m((i7 = d.layoutHeader), viewInflate)) != null) {
                                C0107d c0107dC = C0107d.c(viewM);
                                i7 = d.pinView1;
                                PinEntryView pinEntryView = (PinEntryView) p059e1.a.m(i7, viewInflate);
                                if (pinEntryView != null) {
                                    i7 = d.pinView2;
                                    PinEntryView pinEntryView2 = (PinEntryView) p059e1.a.m(i7, viewInflate);
                                    if (pinEntryView2 != null && (viewM2 = p059e1.a.m((i7 = d.securityKeyBoard), viewInflate)) != null) {
                                        i7 = d.tv2;
                                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView != null) {
                                            i7 = d.tvAnswer;
                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView2 != null) {
                                                i7 = d.tvError1;
                                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView3 != null) {
                                                    i7 = d.tvError2;
                                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView4 != null) {
                                                        i7 = d.tvName;
                                                        if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                            i7 = d.tvQuestion;
                                                            TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                            if (textView5 != null) {
                                                                D d2 = new D((FrameLayout) viewInflate, ppButton, ppFormVertical, iconicsImageView, iconicsImageView2, c0107dC, pinEntryView, pinEntryView2, viewM2, textView, textView2, textView3, textView4, textView5);
                                                                this.f26274j = d2;
                                                                return d2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        Window window;
        super.n();
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.post(new H(handlerJ, 17, this, this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        D d2 = this.f26274j;
        if (d2 != null) {
            h.s((TextView) ((C0107d) d2.f626v).f683e, false);
        }
        D d10 = this.f26274j;
        if (d10 != null) {
            ((PpButton) d10.f616b).setOnClickListener(new n(this, 0));
        }
        D d11 = this.f26274j;
        if (d11 != null) {
            ((IconicsImageView) ((C0107d) d11.f626v).f681c).setOnClickListener(new n(this, 1));
        }
        D d12 = this.f26274j;
        if (d12 != null) {
            ((IconicsImageView) ((C0107d) d12.f626v).f682d).setOnClickListener(new W8.d(18));
        }
        D d13 = this.f26274j;
        if (d13 != null) {
            ((PinEntryView) d13.f627w).setOnPinEnteredListener(this);
        }
        D d14 = this.f26274j;
        if (d14 != null) {
            ((PinEntryView) d14.f627w).f31083t0 = this;
        }
        if (d14 != null) {
            ((PinEntryView) d14.f614A).setOnPinEnteredListener(this);
        }
        D d15 = this.f26274j;
        if (d15 != null) {
            ((PinEntryView) d15.f614A).f31083t0 = this;
        }
        A(this.f26276p);
        D d16 = this.f26274j;
        if (d16 != null) {
            ((IconicsImageView) d16.t).setOnClickListener(new n(this, 2));
        }
        D d17 = this.f26274j;
        if (d17 != null) {
            View view = d17.f624o;
            PinEntryView pinEntryView = (PinEntryView) d17.f627w;
            pinEntryView.setUseCustomKeyboard(true);
            PinEntryView pinEntryView2 = (PinEntryView) d17.f614A;
            pinEntryView2.setUseCustomKeyboard(true);
            c cVar = this.t;
            if (cVar != null) {
                cVar.e();
            }
            c cVar2 = new c(view);
            cVar2.a(C1850q.h(pinEntryView.getEditText(), pinEntryView2.getEditText()), Integer.valueOf(pinEntryView.getDigits()), l0.f9427a);
            this.t = cVar2;
            final int i7 = 1;
            pinEntryView.setOnShowCustomKeyboardListener(new Runnable(this) { // from class: a9.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SignUpStepInputPinV2Fragment f11849b;

                {
                    this.f11849b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            c cVar3 = this.f11849b.t;
                            if (cVar3 != null) {
                                cVar3.g();
                            }
                            break;
                        default:
                            c cVar4 = this.f11849b.t;
                            if (cVar4 != null) {
                                cVar4.g();
                            }
                            break;
                    }
                }
            });
            final int i10 = 0;
            pinEntryView2.setOnShowCustomKeyboardListener(new Runnable(this) { // from class: a9.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SignUpStepInputPinV2Fragment f11849b;

                {
                    this.f11849b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            c cVar3 = this.f11849b.t;
                            if (cVar3 != null) {
                                cVar3.g();
                            }
                            break;
                        default:
                            c cVar4 = this.f11849b.t;
                            if (cVar4 != null) {
                                cVar4.g();
                            }
                            break;
                    }
                }
            });
        }
        D d18 = this.f26274j;
        if (d18 != null) {
            ((IconicsImageView) d18.f618d).setOnClickListener(new n(this, 3));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        D d2 = this.f26274j;
        if (d2 != null && (pinEntryView2 = (PinEntryView) d2.f627w) != null) {
            pinEntryView2.setOnShowCustomKeyboardListener(null);
        }
        D d10 = this.f26274j;
        if (d10 != null && (pinEntryView = (PinEntryView) d10.f614A) != null) {
            pinEntryView.setOnShowCustomKeyboardListener(null);
        }
        c cVar = this.t;
        if (cVar != null) {
            cVar.e();
        }
        this.t = null;
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinHideStateChangeListener
    public final void onHideStateChanged(PinEntryView pinEntryView, boolean z3) {
        D d2;
        PinEntryView pinEntryView2;
        D d10;
        PinEntryView pinEntryView3;
        D d11 = this.f26274j;
        if (!Intrinsics.c(pinEntryView, d11 != null ? (PinEntryView) d11.f627w : null) && (d10 = this.f26274j) != null && (pinEntryView3 = (PinEntryView) d10.f627w) != null) {
            pinEntryView3.d(z3);
        }
        D d12 = this.f26274j;
        if (Intrinsics.c(pinEntryView, d12 != null ? (PinEntryView) d12.f614A : null) || (d2 = this.f26274j) == null || (pinEntryView2 = (PinEntryView) d2.f614A) == null) {
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
        D d2;
        D d10 = this.f26274j;
        boolean z3 = false;
        if (d10 != null) {
            h.s(d10.f621g, false);
        }
        D d11 = this.f26274j;
        if (d11 != null) {
            h.s(d11.f622i, false);
        }
        D d12 = this.f26274j;
        String strW = w(d12 != null ? (PinEntryView) d12.f627w : null);
        if (strW != null) {
            int length = strW.length();
            int i7 = L8.c.f5560a;
            if (length == i7) {
                D d13 = this.f26274j;
                String strW2 = w(d13 != null ? (PinEntryView) d13.f614A : null);
                if (strW2 != null && strW2.length() == i7) {
                    z3 = true;
                }
            }
        }
        D d14 = this.f26274j;
        if (d14 != null) {
            ((PpButton) d14.f616b).setEnabled(z3);
        }
        D d15 = this.f26274j;
        String strW3 = w(d15 != null ? (PinEntryView) d15.f627w : null);
        D d16 = this.f26274j;
        if (d16 == null || !((PpButton) d16.f616b).isEnabled()) {
            if (strW3 == null || strW3.length() != L8.c.f5560a || (d2 = this.f26274j) == null) {
                return;
            }
            ((PinEntryView) d2.f614A).c();
            return;
        }
        KeyboardUtils.hideSoftInput(getActivity());
        c cVar = this.t;
        if (cVar != null) {
            cVar.d();
        }
        u(strW3);
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
        return new d0();
    }

    public final boolean u(String str) {
        try {
            D d2 = this.f26274j;
            String strW = w(d2 != null ? (PinEntryView) d2.f627w : null);
            D d10 = this.f26274j;
            if (!TextUtils.equals(strW, w(d10 != null ? (PinEntryView) d10.f614A : null))) {
                D d11 = this.f26274j;
                if (d11 != null) {
                    d11.f622i.setText(getString(F8.h.ac_msg_password_not_same));
                }
                D d12 = this.f26274j;
                if (d12 != null) {
                    h.C(d12.f622i);
                }
            } else {
                if (!L8.c.e(str) && !L8.c.d(str) && L8.c.c(str) > 0) {
                    return true;
                }
                D d13 = this.f26274j;
                if (d13 != null) {
                    d13.f621g.setText(getString(F8.h.ac_msg_invalid_psw));
                }
                D d14 = this.f26274j;
                if (d14 != null) {
                    h.C(d14.f621g);
                    return false;
                }
            }
        } catch (Exception e10) {
            F6.d.c(this.f27317a, "isEqual: ", e10);
        }
        return false;
    }

    public final SignUpActivity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof SignUpActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SignUpActivity");
        return (SignUpActivity) e10;
    }

    public final void x(PreSignUpRsp preSignUpRsp) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        SignUpReq signUpReqM;
        Intent intent = new Intent(getActivity(), (Class<?>) IdentityVerificationActivity.class);
        intent.putExtra("source", "FROM_REGISITER_PAGE");
        SignUpActivity signUpActivityV = v();
        intent.putExtra("_number", (signUpActivityV == null || (signUpReqM = signUpActivityV.m()) == null) ? null : signUpReqM.mobileNo);
        SignUpActivity signUpActivityV2 = v();
        if (signUpActivityV2 != null && (preCheckPhoneRsp = signUpActivityV2.f26044w) != null) {
            intent.putExtra("extra_data", ((Gson) C0525w.f().f7166b).toJson(preCheckPhoneRsp));
        }
        intent.putExtra("_token", preSignUpRsp != null ? preSignUpRsp.temporaryToken : null);
        startActivity(intent);
        E activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void y(boolean z3) {
        String editContent;
        String editContent2;
        KeyboardUtils.hideSoftInput(getActivity());
        c cVar = this.t;
        if (cVar != null) {
            cVar.d();
        }
        D d2 = this.f26274j;
        String strW = w(d2 != null ? (PinEntryView) d2.f627w : null);
        n0.g().l("SignUpSetPINButton");
        if (u(strW)) {
            String str = "";
            if (z3) {
                D d10 = this.f26274j;
                if (d10 == null || (editContent = ((PpFormVertical) d10.f617c).getEditContent()) == null) {
                    editContent = "";
                }
                if (!TextUtils.isEmpty(editContent)) {
                    d0 d0Var = (d0) this.f27328i;
                    if (d0Var != null) {
                        D d11 = this.f26274j;
                        if (d11 != null && (editContent2 = ((PpFormVertical) d11.f617c).getEditContent()) != null) {
                            str = editContent2;
                        }
                        d0Var.checkInvitationCode(str);
                        return;
                    }
                    return;
                }
            }
            SignUpActivity signUpActivityV = v();
            if (signUpActivityV != null) {
                SignUpReq signUpReqM = signUpActivityV.m();
                if (signUpReqM != null) {
                    signUpReqM.pin = SecurityUtils.a(strW);
                }
                SignUpReq signUpReqM2 = signUpActivityV.m();
                if (signUpReqM2 != null) {
                    p367ya.a.d().getClass();
                    signUpReqM2.fcmToken = p059e1.a.I("fcm_sp_fcm_token", "");
                    signUpReqM2.countryCode = BaseApplication.getCountryLocale();
                    signUpReqM2.currency = BaseApplication.getCurrency();
                    signUpReqM2.gaid = p367ya.a.d().c();
                    signUpReqM2.registerCode = signUpReqM2.invitQrCode;
                }
                d0 d0Var2 = (d0) this.f27328i;
                if (d0Var2 != null) {
                    d0Var2.preSignUp(signUpReqM2);
                }
            }
        }
    }

    public final void z(String str, String str2) {
        showLoadingDialog(false);
        SignUpActivity signUpActivityV = v();
        if (signUpActivityV != null) {
            if (CommonResult.CODE_SMS_CODE_ERROR.equals(str) || "VL000107".equals(str) || CommonResult.CODE_SMS_TOKEN_EXPIRED.equals(str)) {
                int i7 = k.core_title_attention;
                int i10 = F8.h.ac_confirm;
                i iVar = new i(signUpActivityV, 8);
                O6.c cVar = new O6.c(signUpActivityV);
                cVar.f6614u = 1;
                cVar.e(i7);
                cVar.f6598d = str2;
                cVar.d(i10, iVar);
                cVar.f6605k = true;
                cVar.f6606l = 1;
                G.v(cVar, false, false);
                return;
            }
            if (!CommonResult.ERROR_MSG_CONNECT_TIMEOUT.equals(str2)) {
                Dd.b bVar = new Dd.b(signUpActivityV, 16);
                t tVar = new t(signUpActivityV);
                tVar.a();
                tVar.f31304c = str2;
                tVar.f31311j = bVar;
                tVar.e(true).setCancelable(false);
                Unit unit = Unit.f38893a;
                return;
            }
            int i11 = k.core_title_attention;
            int i12 = F8.h.ac_confirm;
            O6.c cVar2 = new O6.c(signUpActivityV);
            cVar2.f6614u = 1;
            cVar2.e(i11);
            cVar2.f6598d = str2;
            cVar2.d(i12, null);
            cVar2.f6605k = true;
            cVar2.f6606l = 1;
            G.v(cVar2, false, false);
        }
    }
}
