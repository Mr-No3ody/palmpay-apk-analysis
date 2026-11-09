package com.transsnet.palmpay.account.ui.fragment.auth;

import Bc.C0105b;
import F8.e;
import F8.h;
import Fe.h0;
import L6.b;
import M7.s;
import Pa.i0;
import R8.i;
import R8.n;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.core.content.d;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p015ag.o;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/auth/VerifyFingerPrintFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/auth/BaseVerifyFragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVerifyFingerPrintFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyFingerPrintFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/VerifyFingerPrintFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,516:1\n694#2,50:517\n*S KotlinDebug\n*F\n+ 1 VerifyFingerPrintFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/VerifyFingerPrintFragment\n*L\n450#1:517,50\n*E\n"})
public final class VerifyFingerPrintFragment extends BaseVerifyFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f26112C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f26113A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0105b f26114B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f26115j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f26116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26117p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26119w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static final void B(VerifyFingerPrintFragment verifyFingerPrintFragment) {
        if (i0.W(verifyFingerPrintFragment.f27319c)) {
            verifyFingerPrintFragment.w();
            int iU = verifyFingerPrintFragment.u();
            if (iU < verifyFingerPrintFragment.v()) {
                String string = verifyFingerPrintFragment.getString(h.ac_msg_pin_retry_times_left_long, Integer.valueOf(verifyFingerPrintFragment.v() - iU));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                verifyFingerPrintFragment.E(string);
            } else {
                String string2 = verifyFingerPrintFragment.getResources().getString(h.ac_finger_full_show_tip);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                verifyFingerPrintFragment.E(string2);
                verifyFingerPrintFragment.y();
                verifyFingerPrintFragment.H();
            }
            C0105b c0105b = verifyFingerPrintFragment.f26114B;
            L8.a.c(c0105b != null ? (TextView) c0105b.f663c : null);
        }
    }

    public final void C() {
        TextView textView;
        TextView textView2;
        C0105b c0105b = this.f26114B;
        if (c0105b != null && (textView2 = (TextView) c0105b.f663c) != null) {
            textView2.setText(h.ac_unlock_pattern_hint_text_by_touch_id);
        }
        C0105b c0105b2 = this.f26114B;
        if (c0105b2 == null || (textView = (TextView) c0105b2.f663c) == null) {
            return;
        }
        textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext()));
    }

    public final void D() {
        Context context = getContext();
        if (context == null) {
            E activity = getActivity();
            context = activity != null ? activity.getApplicationContext() : null;
            if (context == null) {
                return;
            }
        }
        this.f26116o = new w(this, d.d(context), new i(this, context));
        v vVar = new v();
        vVar.f13097a = "Verifying Fingerprint";
        String string = getString(BaseApplication.get().getUser().isLoginPswEnabled() ? h.ac_verify_by_psw : h.ac_verify_by_pin);
        Intrinsics.e(string);
        vVar.f13099c = string;
        this.f26115j = vVar.a();
    }

    public final void E(CharSequence charSequence) {
        TextView textView;
        TextView textView2;
        C0105b c0105b = this.f26114B;
        if (c0105b != null && (textView2 = (TextView) c0105b.f663c) != null) {
            textView2.setTextColor(requireContext().getColor(b.ppColorError));
        }
        C0105b c0105b2 = this.f26114B;
        if (c0105b2 == null || (textView = (TextView) c0105b2.f663c) == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void F() {
        TextView textView;
        PpButton ppButton;
        View view;
        C0105b c0105b = this.f26114B;
        if (c0105b != null && (view = c0105b.f667g) != null) {
            p220oa.h.c(view);
        }
        C0105b c0105b2 = this.f26114B;
        if (c0105b2 != null && (ppButton = (PpButton) c0105b2.f665e) != null) {
            p220oa.h.s(ppButton, true);
        }
        C0105b c0105b3 = this.f26114B;
        if (c0105b3 == null || (textView = (TextView) c0105b3.f663c) == null) {
            return;
        }
        p220oa.h.C(textView);
    }

    public final void G(boolean z3) {
        String str = this.f27317a;
        F6.d.h(str, 3, "startAuthentication: ");
        this.f26113A = 0;
        if (this.f26117p && !z3) {
            F6.d.h(str, 3, d0.q("startAuthentication: has started or force:", z3));
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new n(this, null), 2);
    }

    public final void H() {
        F6.d.h(this.f27317a, 3, "stopAuthentication: ");
        this.f26117p = false;
        try {
            w wVar = this.f26116o;
            if (wVar != null) {
                wVar.c();
            }
        } catch (Exception unused) {
        }
    }

    public final void I(boolean z3) {
        D3.a.K("pin", "login");
        if (getActivity() instanceof PinSafeWithPatternActivity) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
            ((PinSafeWithPatternActivity) activity).n(z3);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        D();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        View viewM2;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_verify_finger_print, viewGroup, false);
        int i7 = F8.d.enableTouchId;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = F8.d.ivIcon;
            if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = F8.d.layoutHeader), viewInflate)) != null) {
                i7 = F8.d.tvMsg;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = F8.d.tvVerify;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null && (viewM2 = p059e1.a.m((i7 = F8.d.viewMask), viewInflate)) != null) {
                        C0105b c0105b = new C0105b((ViewGroup) viewInflate, (Object) ppButton, viewM, textView, textView2, viewM2, 13);
                        this.f26114B = c0105b;
                        return c0105b;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        SafeVerifyViewModel safeVerifyViewModel = (SafeVerifyViewModel) this.f27333i;
        io.fastkv.n.B(this, safeVerifyViewModel != null ? safeVerifyViewModel.f26440f : null, this, new Ba.a(this, 11), new h0(22), false, null, 240);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        x();
        C0105b c0105b = this.f26114B;
        A(c0105b != null ? (TextView) c0105b.f664d : null);
        C0105b c0105b2 = this.f26114B;
        p220oa.h.q(this, c0105b2 != null ? (TextView) c0105b2.f664d : null, c0105b2 != null ? (PpButton) c0105b2.f665e : null);
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null && view.getId() == F8.d.tvVerify) {
            H();
            t();
            return;
        }
        if (view == null || view.getId() != F8.d.enableTouchId) {
            return;
        }
        this.f26118v = false;
        G(true);
        C0105b c0105b = this.f26114B;
        if (c0105b != null) {
            p220oa.h.s((PpButton) c0105b.f665e, false);
        }
        C0105b c0105b2 = this.f26114B;
        if (c0105b2 != null) {
            p220oa.h.c((TextView) c0105b2.f663c);
        }
        C();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        H();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.post(new s(this, 13));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        H();
        this.f26118v = true;
        super.onSaveInstanceState(outState);
        outState.putBoolean("biometric_started", false);
        outState.putBoolean("has_auto_started", this.t);
        outState.putBoolean("require_manual_start", this.f26118v);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f26118v = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f26117p = bundle.getBoolean("biometric_started", false);
            this.t = bundle.getBoolean("has_auto_started", false);
            this.f26118v = bundle.getBoolean("require_manual_start", false);
            D();
        }
    }
}
