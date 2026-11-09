package com.transsnet.palmpay.account.ui.fragment.login;

import Bc.C0105b;
import Bc.C0107d;
import C0.AbstractC0130w;
import C0.U;
import F6.d;
import F8.e;
import F8.h;
import Ja.t;
import L6.b;
import Pa.r0;
import V9.q;
import W8.o;
import W8.p;
import android.content.Context;
import android.os.Bundle;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import io.fastkv.n;
import java.security.InvalidKeyException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p051d9.C1623u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInWithTouchIdFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/u;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogInWithTouchIdFragment extends BaseMVPFragment<C1623u> implements LoginContract.View {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f26230C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC0130w f26231A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0105b f26232B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f26233j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f26234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26235p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26237w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LogInWithTouchIdFragment newInstance() {
            LogInWithTouchIdFragment logInWithTouchIdFragment = new LogInWithTouchIdFragment();
            logInWithTouchIdFragment.setArguments(new Bundle());
            return logInWithTouchIdFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static final void u(LogInWithTouchIdFragment logInWithTouchIdFragment, CharSequence charSequence) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        C0105b c0105b = logInWithTouchIdFragment.f26232B;
        if (c0105b != null && (textView3 = (TextView) c0105b.f663c) != null) {
            textView3.setTextColor(logInWithTouchIdFragment.requireContext().getColor(b.ppColorError));
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0105b c0105b2 = logInWithTouchIdFragment.f26232B;
            if (c0105b2 == null || (textView2 = (TextView) c0105b2.f663c) == null) {
                return;
            }
            textView2.setText(h.ac_login_touch_id_authenticate_fail);
            return;
        }
        C0105b c0105b3 = logInWithTouchIdFragment.f26232B;
        if (c0105b3 == null || (textView = (TextView) c0105b3.f663c) == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void A(boolean z3) {
        Context context;
        Context context2;
        this.f26237w = 0;
        boolean z8 = this.f26235p;
        String str = this.f27317a;
        if (z8 && !z3) {
            d.h(str, 3, d0.q("startAuthentication: has started, force=", z3));
            return;
        }
        v vVar = this.f26233j;
        if (vVar != null) {
            try {
                new p145jd.a(getContext());
                try {
                    p145jd.a.d("check_auth_alias", true);
                    LogInActivity logInActivityV = v();
                    u uVar = new u(p145jd.a.c("login_keystore_alias", Base64.decode(n.p(logInActivityV != null ? logInActivityV.f25879B : null), 2)));
                    w wVar = this.f26234o;
                    if (wVar != null) {
                        wVar.a(vVar, uVar);
                    }
                    this.f26235p = true;
                    d.h(str, 3, "startAuthentication: ");
                } catch (Exception e10) {
                    if ((e10 instanceof KeyPermanentlyInvalidatedException) && (context2 = getContext()) != null) {
                        n.O(context2, 0, Integer.valueOf(h.ac_fingerprint_verifying_unavailable), null, null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to reactive", Integer.valueOf(k.core_confirm), null, new p(this, 3), null, null, null, null, true, 0, 8305277);
                    }
                    d.c(str, "startAuthentication: ", e10);
                }
            } catch (Exception e11) {
                this.f26235p = false;
                if ((e11 instanceof InvalidKeyException) && (context = getContext()) != null) {
                    n.O(context, 0, Integer.valueOf(h.ac_fingerprint_verifying_unavailable), null, null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to unlock", Integer.valueOf(k.core_confirm), null, new p(this, 4), null, null, null, null, false, 0, 8387197);
                }
                d.h(str, 3, "initData: " + e11);
            }
        }
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
    public final void handleCheckPinResult(CommonBeanResult commonBeanResult, int i7) {
        CheckPinRsp checkPinRsp;
        CheckPinRsp checkPinRsp2;
        if (commonBeanResult != null && commonBeanResult.isSuccess() && (checkPinRsp2 = (CheckPinRsp) commonBeanResult.data) != null && checkPinRsp2.isValidate()) {
            D3.a.O(new Qa.a("login", "fingerprint", "login_page", "success", "server_verify", null, null, null, this.f26237w, 1760));
            if (i7 == Integer.MAX_VALUE) {
                LogInActivity logInActivityV = v();
                if (logInActivityV != null) {
                    logInActivityV.p(new q(this, 9));
                    return;
                }
                return;
            }
            U u6 = new U(false, false, F8.d.fragment_login_input_mobile, false, false, -1, -1, -1, -1);
            AbstractC0130w abstractC0130w = this.f26231A;
            if (abstractC0130w != null) {
                abstractC0130w.h(i7, getArguments(), u6);
                return;
            }
            return;
        }
        String respCode = commonBeanResult != null ? commonBeanResult.getRespCode() : null;
        if (commonBeanResult != null) {
            commonBeanResult.getRespMsg();
        }
        Pair pairU = D3.a.u(respCode);
        D3.a.O(new Qa.a("login", "fingerprint", "login_page", "fail", "server_verify", (String) pairU.f38891a, (String) pairU.f38892b, D3.a.D(commonBeanResult != null ? commonBeanResult.getRespMsg() : null, commonBeanResult != null ? commonBeanResult.getRespCode() : null, (commonBeanResult == null || (checkPinRsp = (CheckPinRsp) commonBeanResult.data) == null) ? null : checkPinRsp.getError(), commonBeanResult != null && commonBeanResult.isSuccess()), this.f26237w, 1536));
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            LogInActivity logInActivityV2 = v();
            if (logInActivityV2 != null) {
                logInActivityV2.m(new CommonResult(commonBeanResult != null ? commonBeanResult.getRespCode() : null, commonBeanResult != null ? commonBeanResult.getRespMsg() : null), false);
                return;
            }
            return;
        }
        LogInActivity logInActivityV3 = v();
        if (logInActivityV3 != null) {
            Integer numValueOf = Integer.valueOf(k.core_failed_all_cap);
            CheckPinRsp checkPinRsp3 = (CheckPinRsp) commonBeanResult.data;
            n.O(logInActivityV3, 0, numValueOf, null, null, null, null, checkPinRsp3 != null ? checkPinRsp3.getError() : null, Integer.valueOf(k.core_confirm), null, null, null, null, null, null, true, 0, 8306301);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        w();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_with_touch_id, viewGroup, false);
        int i7 = F8.d.enableTouchId;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = F8.d.imageViewAvatar;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
            if (appCompatImageView != null) {
                i7 = F8.d.ivIcon;
                if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = F8.d.layoutHeader), viewInflate)) != null) {
                    C0107d.c(viewM);
                    i7 = F8.d.tvMsg;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = F8.d.tvPhone;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = F8.d.tvVerify;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                C0105b c0105b = new C0105b((ViewGroup) viewInflate, (View) ppButton, (View) appCompatImageView, textView, textView2, textView3, 8);
                                this.f26232B = c0105b;
                                return c0105b;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        boolean z3;
        LogInReq logInReq;
        String str;
        C0105b c0105b;
        View viewFindViewById;
        View viewFindViewById2;
        PreCheckPhoneRsp preCheckPhoneRsp;
        this.f26231A = NavHostFragment.f17502e.findNavController(this);
        LogInActivity logInActivityV = v();
        if (logInActivityV != null && (preCheckPhoneRsp = logInActivityV.t) != null) {
            z3 = preCheckPhoneRsp.checkVerifyWithPsw();
        }
        C0105b c0105b2 = this.f26232B;
        if (c0105b2 != null) {
            TextView textView = (TextView) c0105b2.f665e;
            if (z3) {
                textView.setText(h.ac_verify_by_psw);
            }
            textView.setOnClickListener(new p(this, 1));
        }
        C0105b c0105b3 = this.f26232B;
        AppCompatImageView appCompatImageView = c0105b3 != null ? (AppCompatImageView) c0105b3.f667g : null;
        LogInActivity logInActivityV2 = v();
        r0.m1(logInActivityV2 != null ? logInActivityV2.f25898p : null, appCompatImageView);
        View view = this.f27318b;
        if (view != null && (viewFindViewById2 = view.findViewById(F8.d.ivBack)) != null) {
            viewFindViewById2.setOnClickListener(new p(this, 2));
        }
        View view2 = this.f27318b;
        if (view2 != null && (viewFindViewById = view2.findViewById(F8.d.ivContactUs)) != null) {
            viewFindViewById.setOnClickListener(new W8.d(8));
        }
        LogInActivity logInActivityV3 = v();
        if (logInActivityV3 != null && (logInReq = logInActivityV3.f25888b) != null && (str = logInReq.mobileNo) != null && (c0105b = this.f26232B) != null) {
            ((TextView) c0105b.f664d).setText(r0.E0(str));
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str = this.f27317a;
        d.h(str, 3, "onPause: ");
        super.onPause();
        this.f26235p = false;
        try {
            w wVar = this.f26234o;
            if (wVar != null) {
                wVar.c();
            }
        } catch (Exception e10) {
            d.h(str, 3, "stopAuthentication: " + e10);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.post(new o(this, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("biometric_started", this.f26235p);
        outState.putBoolean("has_auto_started", this.t);
        outState.putBoolean("require_manual_start", this.f26236v);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f26236v = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f26235p = bundle.getBoolean("biometric_started", false);
            this.t = bundle.getBoolean("has_auto_started", false);
            this.f26236v = bundle.getBoolean("require_manual_start", false);
            w();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1623u();
    }

    public final LogInActivity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof LogInActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
        return (LogInActivity) e10;
    }

    public final void w() {
        PreCheckPhoneRsp preCheckPhoneRsp;
        this.f26234o = new w(this, androidx.core.content.d.d(requireContext()), new t(this, 3));
        v vVar = new v();
        vVar.f13097a = "Verifying Fingerprint";
        vVar.f13098b = "Please use fingerprint to enable login";
        LogInActivity logInActivityV = v();
        vVar.f13099c = (logInActivityV == null || (preCheckPhoneRsp = logInActivityV.t) == null || !preCheckPhoneRsp.checkVerifyWithPsw()) ? "Use App PIN" : "Use Password";
        this.f26233j = vVar.a();
        C0105b c0105b = this.f26232B;
        if (c0105b != null) {
            ((PpButton) c0105b.f666f).setOnClickListener(new p(this, 0));
        }
    }

    public final void x() {
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        LogInActivity logInActivityV = v();
        D3.a.K((logInActivityV == null || (preCheckPhoneRsp2 = logInActivityV.t) == null || !preCheckPhoneRsp2.checkVerifyWithPsw()) ? "pin" : "password", "login");
        AbstractC0130w abstractC0130w = this.f26231A;
        if (abstractC0130w != null) {
            abstractC0130w.j();
        }
        LogInActivity logInActivityV2 = v();
        if (logInActivityV2 == null || (preCheckPhoneRsp = logInActivityV2.t) == null || !preCheckPhoneRsp.checkVerifyWithPsw()) {
            AbstractC0130w abstractC0130w2 = this.f26231A;
            if (abstractC0130w2 != null) {
                abstractC0130w2.h(F8.d.fragment_login_verify_pin, getArguments(), null);
                return;
            }
            return;
        }
        AbstractC0130w abstractC0130w3 = this.f26231A;
        if (abstractC0130w3 != null) {
            abstractC0130w3.h(F8.d.fragment_login_verify_psw, getArguments(), null);
        }
    }

    public final void y() {
        TextView textView;
        PpButton ppButton;
        C0105b c0105b = this.f26232B;
        if (c0105b != null && (ppButton = (PpButton) c0105b.f666f) != null) {
            p220oa.h.s(ppButton, true);
        }
        C0105b c0105b2 = this.f26232B;
        if (c0105b2 == null || (textView = (TextView) c0105b2.f663c) == null) {
            return;
        }
        p220oa.h.s(textView, true);
    }

    public final void z() {
        TextView textView;
        TextView textView2;
        C0105b c0105b = this.f26232B;
        if (c0105b != null && (textView2 = (TextView) c0105b.f663c) != null) {
            textView2.setTextColor(requireContext().getColor(b.ppColorTextNormal));
        }
        C0105b c0105b2 = this.f26232B;
        if (c0105b2 == null || (textView = (TextView) c0105b2.f663c) == null) {
            return;
        }
        textView.setText(h.ac_unlock_pattern_hint_text_by_touch_id);
    }
}
