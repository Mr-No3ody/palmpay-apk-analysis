package com.transsnet.palmpay.account.ui.fragment.signup;

import Bc.C0107d;
import Bc.j;
import C0.G;
import C9.C0142i;
import Ce.H;
import Dd.b;
import F8.d;
import Pa.D;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.F;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpPhoneEditText;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.dialog.SignUpPermissionDialog;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import com.transsnet.palmpay.account.ui.viewmodel.SignUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p042cg.e;
import p042cg.f;
import p051d9.d0;
import p183m6.n;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\u000fB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/signup/SignUpStep1Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/d0;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/SignUpContract$View;", "Lcom/transsnet/palmpay/custom_view/utils/KeyBoardListenerHelper$OnKeyBoardChangeListener;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSignUpStep1Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpStep1Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/signup/SignUpStep1Fragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,946:1\n629#2,11:947\n694#2,50:958\n694#2,50:1008\n694#2,50:1058\n694#2,50:1108\n*S KotlinDebug\n*F\n+ 1 SignUpStep1Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/signup/SignUpStep1Fragment\n*L\n170#1:947,11\n599#1:958,50\n622#1:1008,50\n710#1:1058,50\n748#1:1108,50\n*E\n"})
public final class SignUpStep1Fragment extends BaseMVPFragment<d0> implements SignUpContract.View, KeyBoardListenerHelper.OnKeyBoardChangeListener, CustomActionCallback, IAutoTrack, View.OnClickListener {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f26251u0 = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f26252A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SingleAdView f26253B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public c f26254C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f26255H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public IconicsCheckBox f26256L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public IconicsCheckBox f26257M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public IconicsCheckBox f26258Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public PpPhoneEditText f26259X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f26260Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public AppCompatEditText f26261Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f26262j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f26263k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SignUpPermissionDialog f26264o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View f26266p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f26267q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f26269s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f26270t0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public KeyBoardListenerHelper f26272w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26265p = true;
    public final boolean t = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26271v = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f26268r0 = 2;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SignUpStep1Fragment newInstance() {
            SignUpStep1Fragment signUpStep1Fragment = new SignUpStep1Fragment();
            signUpStep1Fragment.setArguments(new Bundle());
            return signUpStep1Fragment;
        }

        private a() {
        }
    }

    public SignUpStep1Fragment() {
        final int i7 = 0;
        this.f26269s0 = C2131j.b(new Function0(this) { // from class: a9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpStep1Fragment f11839b;

            {
                this.f11839b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SignUpStep1Fragment signUpStep1Fragment = this.f11839b;
                switch (i7) {
                    case 0:
                        SignUpStep1Fragment.a aVar = SignUpStep1Fragment.f26251u0;
                        return new j(d.ac_view_tag1, signUpStep1Fragment);
                    default:
                        SignUpStep1Fragment.a aVar2 = SignUpStep1Fragment.f26251u0;
                        return new k(d.ac_view_tag2, signUpStep1Fragment);
                }
            }
        });
        final int i10 = 1;
        this.f26270t0 = C2131j.b(new Function0(this) { // from class: a9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpStep1Fragment f11839b;

            {
                this.f11839b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SignUpStep1Fragment signUpStep1Fragment = this.f11839b;
                switch (i10) {
                    case 0:
                        SignUpStep1Fragment.a aVar = SignUpStep1Fragment.f26251u0;
                        return new j(d.ac_view_tag1, signUpStep1Fragment);
                    default:
                        SignUpStep1Fragment.a aVar2 = SignUpStep1Fragment.f26251u0;
                        return new k(d.ac_view_tag2, signUpStep1Fragment);
                }
            }
        });
    }

    public static void B(String str, String str2, String str3) {
        if (com.transsnet.palmpay.core.config.d.t() && ActivityManager.isUserAMonkey()) {
            ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(str, true));
            return;
        }
        if (BaseApplication.get().isOldAndroidDevice()) {
            ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(str, true));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str2);
        bundle.putString("extra_Btn1Text", str3);
        com.palmpay.lib.apm.launchcounter.util.d.P(bundle, str);
    }

    public static void C(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(800L);
        animatorSet.setInterpolator(new AnticipateOvershootInterpolator());
        animatorSet.play(ObjectAnimator.ofFloat(view, "translationX", 0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f));
        animatorSet.start();
    }

    public final void A() {
        SignUpReq signUpReqM;
        if (E()) {
            KeyboardUtils.hideSoftInput(getActivity());
            c cVar = this.f26254C;
            if (cVar != null) {
                cVar.d();
            }
            D.f7012b = 0L;
            PpPhoneEditText ppPhoneEditText = this.f26259X;
            String mobileNumber = ppPhoneEditText != null ? ppPhoneEditText.getMobileNumber() : null;
            PpPhoneEditText ppPhoneEditText2 = this.f26259X;
            if (!r0.b1(ppPhoneEditText2 != null ? ppPhoneEditText2.getMobileNumber() : null)) {
                PpPhoneEditText ppPhoneEditText3 = this.f26259X;
                if (ppPhoneEditText3 != null) {
                    ppPhoneEditText3.f("Please enter a 10 or 11-digit phone number.");
                    return;
                }
                return;
            }
            if ((mobileNumber != null ? mobileNumber.length() : 0) == 11 && mobileNumber != null && !y.m(mobileNumber, "0", false)) {
                PpPhoneEditText ppPhoneEditText4 = this.f26259X;
                if (ppPhoneEditText4 != null) {
                    ppPhoneEditText4.f("Invalid phone number.");
                    return;
                }
                return;
            }
            if (this.f26268r0 > 0) {
                IconicsCheckBox iconicsCheckBox = this.f26256L;
                if (iconicsCheckBox != null && !iconicsCheckBox.isChecked()) {
                    C(this.f26263k0);
                    Context context = getContext();
                    if (context != null) {
                        h.z(context, "Please read and agree to the Terms & Conditions and Privacy Policy.", null, null, 61);
                        return;
                    }
                    return;
                }
            } else {
                IconicsCheckBox iconicsCheckBox2 = this.f26257M;
                if (iconicsCheckBox2 != null && !iconicsCheckBox2.isChecked()) {
                    C(this.f26266p0);
                    Context context2 = getContext();
                    if (context2 != null) {
                        h.z(context2, "Please read and agree to Terms & Conditions.", null, null, 61);
                        return;
                    }
                    return;
                }
                IconicsCheckBox iconicsCheckBox3 = this.f26258Q;
                if (iconicsCheckBox3 != null && !iconicsCheckBox3.isChecked()) {
                    C(this.f26267q0);
                    Context context3 = getContext();
                    if (context3 != null) {
                        h.z(context3, "Please read and agree to Privacy Policy.", null, null, 61);
                        return;
                    }
                    return;
                }
            }
            if (!this.f26265p) {
                if (!p267r9.a.f41645a.a()) {
                    u();
                    return;
                }
                SignUpPermissionDialog signUpPermissionDialog = new SignUpPermissionDialog(getActivity(), this.f26271v, new C0142i(this, 13));
                this.f26264o = signUpPermissionDialog;
                signUpPermissionDialog.show();
                SignUpPermissionDialog signUpPermissionDialog2 = this.f26264o;
                if (signUpPermissionDialog2 != null) {
                    signUpPermissionDialog2.setOnDismissListener(new b(this, 15));
                    return;
                }
                return;
            }
            if (!this.t) {
                String strG = com.transsnet.palmpay.core.config.d.g("/h5/policy/ng/palmpay?showTitle=true");
                Intrinsics.checkNotNullExpressionValue(strG, "getPrivacyUrl(...)");
                z(strG);
                return;
            }
            E activity = getActivity();
            if (activity != null) {
                h.g(activity, "SignUpHomeButton");
            }
            if (!TextUtils.isEmpty(w())) {
                d0 d0Var = (d0) this.f27328i;
                if (d0Var != null) {
                    d0Var.checkInvitationCode(w());
                    return;
                }
                return;
            }
            SignUpActivity signUpActivityX = x();
            if (signUpActivityX != null && (signUpReqM = signUpActivityX.m()) != null) {
                signUpReqM.invitQrCode = null;
            }
            d0 d0Var2 = (d0) this.f27328i;
            if (d0Var2 != null) {
                String strV = v();
                SignUpActivity signUpActivityX2 = x();
                d0Var2.checkMobileNumber(strV, signUpActivityX2 != null ? signUpActivityX2.f26031B : null);
            }
        }
    }

    public final void D(boolean z3) {
        SignUpViewModel signUpViewModel;
        F f10;
        IconicsCheckBox iconicsCheckBox = this.f26256L;
        if (iconicsCheckBox != null) {
            iconicsCheckBox.setOnCheckedChangeListener(null);
            iconicsCheckBox.setChecked(z3);
            iconicsCheckBox.setOnCheckedChangeListener(new p010a9.c(this, 3));
        }
        SignUpActivity signUpActivityX = x();
        if (signUpActivityX == null || (signUpViewModel = (SignUpViewModel) signUpActivityX.f26041o.getValue()) == null || (f10 = signUpViewModel.f26442e) == null) {
            return;
        }
        f10.k(Boolean.valueOf(z3));
    }

    public final boolean E() {
        PpButton ppButton;
        String mobileNumber;
        PpPhoneEditText ppPhoneEditText = this.f26259X;
        boolean z3 = ((ppPhoneEditText == null || (mobileNumber = ppPhoneEditText.getMobileNumber()) == null) ? 0 : mobileNumber.length()) >= 10;
        j jVar = this.f26262j;
        if (jVar != null && (ppButton = (PpButton) jVar.f745v) != null) {
            ppButton.setEnabled(z3);
        }
        return z3;
    }

    @Override // com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper.OnKeyBoardChangeListener
    public final void OnKeyBoardChange(boolean z3, int i7) {
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "RegistrationHome";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26252A) {
            n0.g().l("SignUpBackButton");
            return false;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new p010a9.h(this, null), 2);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void handleAppConfigResult(QueryUiResourceRsp1 rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        Map<String, String> map = rsp.data;
        if (map != null) {
            try {
                String str = map.get("switchSignUpPermissionDialog");
                if ("false".equalsIgnoreCase(str)) {
                    this.f26265p = true;
                } else if ("true".equalsIgnoreCase(str)) {
                    this.f26265p = false;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void handleCheckInvitationCode(CommonResult commonResult) {
        SignUpReq signUpReqM;
        super.handleCheckInvitationCode(commonResult);
        if (commonResult == null || !commonResult.isSuccess()) {
            TextView textView = this.f26260Y;
            if (textView != null) {
                h.C(textView);
            }
            TextView textView2 = this.f26260Y;
            if (textView2 != null) {
                textView2.setText(commonResult != null ? commonResult.getRespMsg() : null);
                return;
            }
            return;
        }
        SignUpActivity signUpActivityX = x();
        if (signUpActivityX != null && (signUpReqM = signUpActivityX.m()) != null) {
            signUpReqM.invitQrCode = w();
        }
        d0 d0Var = (d0) this.f27328i;
        if (d0Var != null) {
            String strV = v();
            SignUpActivity signUpActivityX2 = x();
            d0Var.checkMobileNumber(strV, signUpActivityX2 != null ? signUpActivityX2.f26031B : null);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void handleVerifyMtnNumber(boolean z3, String str) {
        F6.d.h(this.f27317a, 3, "handleVerifyMtnNumber: get mtn auth code ok");
        SignUpActivity signUpActivityX = x();
        if (signUpActivityX != null) {
            signUpActivityX.f26031B = str;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_signup_step1, viewGroup, false);
        int i7 = d.adViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = d.bottomStub;
            ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
            if (viewStub2 != null) {
                i7 = d.buttonContainer;
                FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                if (frameLayout != null) {
                    i7 = d.invitationStub;
                    ViewStub viewStub3 = (ViewStub) p059e1.a.m(i7, viewInflate);
                    if (viewStub3 != null) {
                        i7 = d.ivLogo;
                        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView != null) {
                            i7 = d.ivTitle1;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                            if (appCompatImageView != null) {
                                i7 = d.loginStub;
                                ViewStub viewStub4 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                if (viewStub4 != null) {
                                    i7 = d.mobileEditViewStub;
                                    ViewStub viewStub5 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                    if (viewStub5 != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                        i7 = d.securityKeyBoard;
                                        View viewM2 = p059e1.a.m(i7, viewInflate);
                                        if (viewM2 != null) {
                                            i7 = d.textViewSignUp;
                                            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                            if (ppButton != null && (viewM = p059e1.a.m((i7 = d.titleBar), viewInflate)) != null) {
                                                C0107d c0107dC = C0107d.c(viewM);
                                                i7 = d.viewAgreementStub;
                                                ViewStub viewStub6 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                if (viewStub6 != null) {
                                                    i7 = d.viewAllAgreementStub;
                                                    ViewStub viewStub7 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                    if (viewStub7 != null) {
                                                        i7 = d.viewPrivacyStub;
                                                        ViewStub viewStub8 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                        if (viewStub8 != null) {
                                                            j jVar = new j(frameLayout2, viewStub, viewStub2, frameLayout, viewStub3, imageView, appCompatImageView, viewStub4, viewStub5, frameLayout2, viewM2, ppButton, c0107dC, viewStub6, viewStub7, viewStub8);
                                                            this.f26262j = jVar;
                                                            return jVar;
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
        String strD;
        super.n();
        org.greenrobot.eventbus.c.b().j(this);
        d0 d0Var = (d0) this.f27328i;
        if (d0Var != null) {
            d0Var.queryAppConfig();
        }
        View decorView = null;
        if (getContext() != null) {
            boolean zB = false;
            try {
                zB = n.f39523a.instance().b("featureMtnNumberVerify", false);
            } catch (Exception unused) {
            }
            String str = this.f27317a;
            if (zB) {
                H8.f fVar = H8.f.f3757a;
                Context context = getContext();
                Intrinsics.e(context);
                if (H8.f.b(context)) {
                    try {
                        strD = n.f39523a.instance().d("mtnClientId", "");
                    } catch (Exception e10) {
                        F6.d.c(str, "getMtnAuthCode mtnClientId not found " + e10);
                        strD = null;
                    }
                    if (strD != null) {
                        if (TextUtils.isEmpty(strD)) {
                            n.f39523a.instance().a(new p010a9.f(this), "mtnClientId");
                        } else {
                            d0 d0Var2 = (d0) this.f27328i;
                            if (d0Var2 != null) {
                                d0Var2.verifyMtnNumber(getContext(), strD, "https://palmpay.com/al/home");
                            }
                        }
                    }
                } else {
                    F6.d.h(str, 3, "getMtnAuthCode not on mtn network");
                }
            } else {
                F6.d.h(str, 3, "getMtnAuthCode disabled");
            }
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            decorView.post(new H(handlerJ, 16, this, this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        j jVar;
        this.f26268r0 = com.transsnet.palmpay.core.config.d.q();
        SignUpActivity signUpActivityX = x();
        if (signUpActivityX != null && signUpActivityX.f26038g) {
            this.f26265p = true;
        }
        j jVar2 = this.f26262j;
        if (jVar2 != null) {
            ((PpButton) jVar2.f745v).setOnClickListener(new p010a9.a(this, 5));
        }
        j jVar3 = this.f26262j;
        if (jVar3 != null) {
            ((IconicsImageView) ((C0107d) jVar3.f746w).f682d).setOnClickListener(new W8.d(15));
        }
        j jVar4 = this.f26262j;
        if (jVar4 != null) {
            ((IconicsImageView) ((C0107d) jVar4.f746w).f681c).setOnClickListener(new p010a9.a(this, 6));
        }
        if (com.transsnet.palmpay.core.config.d.t() && ActivityManager.isUserAMonkey() && (jVar = this.f26262j) != null) {
            h.s((IconicsImageView) ((C0107d) jVar.f746w).f682d, false);
        }
        this.f26272w = new KeyBoardListenerHelper(getActivity());
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void onCheckMobileNumberResult(CommonBeanResult commonBeanResult) {
        if (commonBeanResult != null) {
            if (!commonBeanResult.isSuccess()) {
                p(commonBeanResult.getRespMsg());
                return;
            }
            PreCheckPhoneRsp preCheckPhoneRsp = (PreCheckPhoneRsp) commonBeanResult.data;
            if (preCheckPhoneRsp.blacklist) {
                PpPhoneEditText ppPhoneEditText = this.f26259X;
                if (ppPhoneEditText != null) {
                    ppPhoneEditText.f("Invalid phone number.");
                    return;
                }
                return;
            }
            if (preCheckPhoneRsp.memberUser) {
                if (!Intrinsics.c(preCheckPhoneRsp.memberStatus, "0")) {
                    String strV = v();
                    PreCheckPhoneRsp preCheckPhoneRsp2 = (PreCheckPhoneRsp) commonBeanResult.data;
                    n0.g().u(new ViewEvent("SignUpNeedLogin").add("phone", strV));
                    E activity = getActivity();
                    if (activity != null) {
                        String string = getString(F8.h.ac_msg_go_login);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        int i7 = F8.h.ac_log_in_now;
                        p010a9.b bVar = new p010a9.b(0, this, preCheckPhoneRsp2);
                        int i10 = k.core_opps;
                        O6.c cVar = new O6.c(activity);
                        cVar.f6614u = 1;
                        cVar.e(i10);
                        cVar.f("");
                        cVar.f6598d = string;
                        cVar.d(i7, bVar);
                        cVar.f6605k = false;
                        cVar.f6606l = 1;
                        G.v(cVar, false, false);
                        return;
                    }
                    return;
                }
                Context context = getContext();
                if (context != null) {
                    String string2 = getString(F8.h.ac_account_abnormal);
                    String string3 = getString(F8.h.ac_msg_account_abnormal);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String string4 = getString(F8.h.ac_contact_us);
                    W8.d dVar = new W8.d(16);
                    int i11 = k.core_cancel;
                    int i12 = k.core_opps;
                    O6.c cVar2 = new O6.c(context);
                    cVar2.f6614u = 1;
                    cVar2.e(i12);
                    if (string2 != null) {
                        cVar2.f(string2);
                    }
                    cVar2.f6598d = string3;
                    if (string4 != null) {
                        cVar2.f6600f = string4;
                        cVar2.f6602h = dVar;
                    }
                    cVar2.c(i11, null);
                    cVar2.f6605k = true;
                    cVar2.f6606l = 1;
                    G.v(cVar2, false, false);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(preCheckPhoneRsp.mtnToken)) {
                F6.d.h(this.f27317a, 3, "handleVerifyMtnNumber: get mtn token ok");
                SignUpActivity signUpActivityX = x();
                if (signUpActivityX != null) {
                    SignUpReq signUpReqM = signUpActivityX.m();
                    if (signUpReqM != null) {
                        signUpReqM.mtnAuthCode = signUpActivityX.f26031B;
                    }
                    signUpActivityX.f26031B = null;
                    SignUpReq signUpReqM2 = signUpActivityX.m();
                    if (signUpReqM2 != null) {
                        signUpReqM2.mobileNo = v();
                    }
                    signUpActivityX.r(300, ((PreCheckPhoneRsp) commonBeanResult.data).mtnToken);
                }
                T data = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                y((PreCheckPhoneRsp) data);
                return;
            }
            if (TextUtils.isEmpty(((PreCheckPhoneRsp) commonBeanResult.data).phoneVerifyTip)) {
                T data2 = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                y((PreCheckPhoneRsp) data2);
                return;
            }
            E activity2 = getActivity();
            if (activity2 != null) {
                String string5 = getString(F8.h.ac_unusual_phone_number_alert);
                int i13 = F8.c.ac_quit_icon_7;
                String phoneVerifyTip = ((PreCheckPhoneRsp) commonBeanResult.data).phoneVerifyTip;
                Intrinsics.checkNotNullExpressionValue(phoneVerifyTip, "phoneVerifyTip");
                int i14 = F8.h.ac_continue;
                p010a9.b bVar2 = new p010a9.b(1, this, commonBeanResult);
                int i15 = k.core_opps;
                O6.c cVar3 = new O6.c(activity2);
                cVar3.f6614u = 1;
                cVar3.e(i15);
                if (string5 != null) {
                    cVar3.f(string5);
                }
                cVar3.f6607m = i13;
                cVar3.f6598d = phoneVerifyTip;
                cVar3.f6600f = "Re-enter";
                cVar3.f6602h = null;
                cVar3.c(i14, bVar2);
                cVar3.f6605k = false;
                cVar3.f6606l = 1;
                G.v(cVar3, false, false);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null || view.getId() != d.ac_view_tag1) {
            if (view == null || view.getId() != d.ac_view_tag2) {
                return;
            }
            String strG = com.transsnet.palmpay.core.config.d.g("/h5/policy/ng/palmpay?showTitle=true");
            Intrinsics.checkNotNullExpressionValue(strG, "getPrivacyUrl(...)");
            z(strG);
            return;
        }
        String strG2 = com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/palmpay?showTitle=true");
        Intrinsics.checkNotNullExpressionValue(strG2, "getTermsUrl(...)");
        String string = getString(F8.h.ac_terms_and_conditions);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(F8.h.ac_confirm);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        B(strG2, string, string2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        KeyBoardListenerHelper keyBoardListenerHelper = this.f26272w;
        if (keyBoardListenerHelper != null) {
            keyBoardListenerHelper.destroy();
        }
        Handler handlerJ = j();
        if (handlerJ != null) {
            handlerJ.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        c cVar = this.f26254C;
        if (cVar != null) {
            cVar.e();
        }
        this.f26254C = null;
        if (org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().l(this);
        }
        super.onDestroyView();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 593) {
            long jQ = com.transsnet.palmpay.core.config.d.q();
            if (this.f26268r0 != jQ) {
                this.f26268r0 = jQ;
                if (jQ == 1) {
                    D(false);
                } else if (jQ == 2) {
                    D(true);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        KeyBoardListenerHelper keyBoardListenerHelper = this.f26272w;
        if (keyBoardListenerHelper != null) {
            keyBoardListenerHelper.setOnKeyBoardChangeListener(this);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void showLoadingView(boolean z3) {
        AppCompatEditText editText;
        PpButton ppButton;
        j jVar = this.f26262j;
        if (jVar != null && (ppButton = (PpButton) jVar.f745v) != null) {
            ppButton.b(z3);
        }
        PpPhoneEditText ppPhoneEditText = this.f26259X;
        if (ppPhoneEditText != null && (editText = ppPhoneEditText.getEditText()) != null) {
            editText.setEnabled(!z3);
        }
        AppCompatEditText appCompatEditText = this.f26261Z;
        if (appCompatEditText != null) {
            appCompatEditText.setEnabled(!z3);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new d0();
    }

    public final void u() {
        this.f26265p = true;
        if (this.t) {
            A();
            return;
        }
        String strG = com.transsnet.palmpay.core.config.d.g("/h5/policy/ng/palmpay?showTitle=true");
        Intrinsics.checkNotNullExpressionValue(strG, "getPrivacyUrl(...)");
        z(strG);
    }

    public final String v() {
        PpPhoneEditText ppPhoneEditText = this.f26259X;
        String mobileNumber = ppPhoneEditText != null ? ppPhoneEditText.getMobileNumber() : null;
        if (TextUtils.isEmpty(mobileNumber)) {
            return null;
        }
        return PhoneBaseNumberUtils.INSTANCE.getFullMobileNumber(mobileNumber, BaseApplication.getCountryLocale());
    }

    public final String w() {
        Editable editableText;
        AppCompatEditText appCompatEditText = this.f26261Z;
        if (appCompatEditText == null || (editableText = appCompatEditText.getEditableText()) == null) {
            return null;
        }
        return editableText.toString();
    }

    public final SignUpActivity x() {
        E e10 = this.f27319c;
        if (!(e10 instanceof SignUpActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SignUpActivity");
        return (SignUpActivity) e10;
    }

    public final void y(PreCheckPhoneRsp preCheckPhoneRsp) {
        SignUpActivity signUpActivityX;
        SignUpActivity signUpActivityX2 = x();
        if (signUpActivityX2 != null) {
            signUpActivityX2.f26044w = preCheckPhoneRsp;
            if (preCheckPhoneRsp != null) {
                preCheckPhoneRsp.isNeedNameVerify();
            }
        }
        r0.D1(getActivity(), preCheckPhoneRsp.detainmentPhoto);
        String strV = v();
        if (TextUtils.isEmpty(strV) || (signUpActivityX = x()) == null) {
            return;
        }
        SignUpReq signUpReqM = signUpActivityX.m();
        if (signUpReqM != null) {
            signUpReqM.mobileNo = strV;
        }
        if (signUpActivityX.o()) {
            signUpActivityX.s();
        } else {
            signUpActivityX.t();
        }
    }

    public final void z(String str) {
        String string = getString(F8.h.ac_msg_terms_line23);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(F8.h.ac_confirm);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        B(str, string, string2);
    }
}
