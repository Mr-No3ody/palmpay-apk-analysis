package com.transsnet.palmpay.account.ui.fragment.auth;

import C9.C0138e;
import C9.C0139f;
import F8.d;
import F8.e;
import Fe.h0;
import L6.b;
import L8.c;
import M7.s;
import N8.C0457a;
import Pa.F;
import Pa.i0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPswFragment;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/auth/AuthPswFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/SafeVerifyViewModel;", "Lcom/transsnet/palmpay/core/viewmodel/KeyboardGridLayout$NumKeyboardClickListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthPswFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthPswFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/AuthPswFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,365:1\n115#2,8:366\n145#2:374\n*S KotlinDebug\n*F\n+ 1 AuthPswFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/AuthPswFragment\n*L\n187#1:366,8\n187#1:374\n*E\n"})
public final class AuthPswFragment extends BaseMvvmFragment<SafeVerifyViewModel> implements KeyboardGridLayout.NumKeyboardClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f26101w = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PinEntryView f26102j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f26103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f26104p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26105v = 1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AuthPswFragment newInstance(int i7, int i10) {
            AuthPswFragment authPswFragment = new AuthPswFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_mode", i7);
            bundle.putInt("extra_type", i10);
            authPswFragment.setArguments(bundle);
            return authPswFragment;
        }

        private a() {
        }
    }

    public static final void t(AuthPswFragment authPswFragment, String str) {
        TextView textView = authPswFragment.f26104p;
        if (textView != null) {
            textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorError, authPswFragment.getContext()));
        }
        TextView textView2 = authPswFragment.f26104p;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = authPswFragment.f26104p;
        if (textView3 != null) {
            h.C(textView3);
        }
        TextView textView4 = authPswFragment.f26104p;
        if (textView4 != null) {
            textView4.postDelayed(new s(authPswFragment, 12), 1000L);
        }
        TextView textView5 = authPswFragment.f26103o;
        if (textView5 != null) {
            h.c(textView5);
        }
    }

    public static void v(String str, String str2, String str3, String str4, String str5, String str6) {
        D3.a.O(new Qa.a(str, "password", str2, str3, "server_verify", str4, str5, str6, 0, 1792));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        Window window;
        Bundle arguments = getArguments();
        int i7 = arguments != null ? arguments.getInt("extra_type", 1) : 1;
        this.f26105v = i7;
        if (i7 != 2) {
            return e.ac_fragment_auth_psw;
        }
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            BarUtils.setStatusBarLightMode(window, true);
        }
        return e.ac_fragment_auth_psw_v2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        SafeVerifyViewModel safeVerifyViewModel = (SafeVerifyViewModel) this.f27333i;
        l lVar = safeVerifyViewModel != null ? safeVerifyViewModel.f26439e : null;
        if (lVar != null) {
            lVar.e(this, new C0138e(new C0139f(this, 23), (byte) 0, false));
        }
        PinEntryView pinEntryView = this.f26102j;
        if (pinEntryView != null) {
            pinEntryView.setOnPinEnteredListener(new C0457a(this, 15));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        this.f26102j = (PinEntryView) this.f27318b.findViewById(d.pinView);
        this.f26103o = (TextView) this.f27318b.findViewById(d.textViewMessage);
        this.f26104p = (TextView) this.f27318b.findViewById(d.textViewFailMessage);
        final int i7 = 0;
        ((TextView) this.f27318b.findViewById(d.tv_forget_pin)).setOnClickListener(new View.OnClickListener(this) { // from class: R8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthPswFragment f7938b;

            {
                this.f7938b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p038ca.e f28604i;
                AuthPswFragment authPswFragment = this.f7938b;
                switch (i7) {
                    case 0:
                        AuthPswFragment.a aVar = AuthPswFragment.f26101w;
                        h0 h0Var = new h0(21);
                        Intent intentA = F.a(authPswFragment.getActivity(), "/main/palm_safe_scan_face");
                        if (intentA != null) {
                            intentA.putExtra("extra_type", 35);
                            intentA.putExtra("extra_data", true);
                            AuthenticationActivity authenticationActivity = (AuthenticationActivity) authPswFragment.getActivity();
                            if (authenticationActivity != null && (f28604i = authenticationActivity.getF28604i()) != null) {
                                f28604i.f(intentA, new C0457a(h0Var, 16));
                                break;
                            }
                        }
                        break;
                    case 1:
                        AuthPswFragment.a aVar2 = AuthPswFragment.f26101w;
                        E activity = authPswFragment.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    default:
                        AuthPswFragment.a aVar3 = AuthPswFragment.f26101w;
                        authPswFragment.getClass();
                        break;
                }
            }
        });
        Bundle arguments = getArguments();
        this.t = arguments != null ? arguments.getInt("extra_mode") : 0;
        PinEntryView pinEntryView = this.f26102j;
        if (pinEntryView != null) {
            pinEntryView.setEnabled(false);
        }
        u();
        final int i10 = 1;
        this.f27318b.findViewById(d.imageViewClose).setOnClickListener(new View.OnClickListener(this) { // from class: R8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthPswFragment f7938b;

            {
                this.f7938b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p038ca.e f28604i;
                AuthPswFragment authPswFragment = this.f7938b;
                switch (i10) {
                    case 0:
                        AuthPswFragment.a aVar = AuthPswFragment.f26101w;
                        h0 h0Var = new h0(21);
                        Intent intentA = F.a(authPswFragment.getActivity(), "/main/palm_safe_scan_face");
                        if (intentA != null) {
                            intentA.putExtra("extra_type", 35);
                            intentA.putExtra("extra_data", true);
                            AuthenticationActivity authenticationActivity = (AuthenticationActivity) authPswFragment.getActivity();
                            if (authenticationActivity != null && (f28604i = authenticationActivity.getF28604i()) != null) {
                                f28604i.f(intentA, new C0457a(h0Var, 16));
                                break;
                            }
                        }
                        break;
                    case 1:
                        AuthPswFragment.a aVar2 = AuthPswFragment.f26101w;
                        E activity = authPswFragment.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    default:
                        AuthPswFragment.a aVar3 = AuthPswFragment.f26101w;
                        authPswFragment.getClass();
                        break;
                }
            }
        });
        final int i11 = 2;
        this.f27318b.findViewById(d.textViewMessage).setOnClickListener(new View.OnClickListener(this) { // from class: R8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthPswFragment f7938b;

            {
                this.f7938b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p038ca.e f28604i;
                AuthPswFragment authPswFragment = this.f7938b;
                switch (i11) {
                    case 0:
                        AuthPswFragment.a aVar = AuthPswFragment.f26101w;
                        h0 h0Var = new h0(21);
                        Intent intentA = F.a(authPswFragment.getActivity(), "/main/palm_safe_scan_face");
                        if (intentA != null) {
                            intentA.putExtra("extra_type", 35);
                            intentA.putExtra("extra_data", true);
                            AuthenticationActivity authenticationActivity = (AuthenticationActivity) authPswFragment.getActivity();
                            if (authenticationActivity != null && (f28604i = authenticationActivity.getF28604i()) != null) {
                                f28604i.f(intentA, new C0457a(h0Var, 16));
                                break;
                            }
                        }
                        break;
                    case 1:
                        AuthPswFragment.a aVar2 = AuthPswFragment.f26101w;
                        E activity = authPswFragment.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    default:
                        AuthPswFragment.a aVar3 = AuthPswFragment.f26101w;
                        authPswFragment.getClass();
                        break;
                }
            }
        });
        View viewFindViewById = this.f27318b.findViewById(p025ba.e.number_keyboard_content);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout");
        ((KeyboardGridLayout) viewFindViewById).setNumKeyboardClickListener(this);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2 = this.f26102j;
        String strValueOf = String.valueOf(pinEntryView2 != null ? pinEntryView2.getText() : null);
        if (TextUtils.isEmpty(strValueOf) || (pinEntryView = this.f26102j) == null) {
            return;
        }
        String strSubstring = strValueOf.substring(0, strValueOf.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        pinEntryView.setText(strSubstring);
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String num) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(num, "num");
        PinEntryView pinEntryView2 = this.f26102j;
        String strValueOf = String.valueOf(pinEntryView2 != null ? pinEntryView2.getText() : null);
        if (strValueOf.length() <= c.f5561b && (pinEntryView = this.f26102j) != null) {
            pinEntryView.setText(strValueOf + num);
        }
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

    public final void u() {
        if (i0.W(getActivity())) {
            TextView textView = this.f26103o;
            if (textView != null) {
                h.C(textView);
            }
            TextView textView2 = this.f26104p;
            if (textView2 != null) {
                h.c(textView2);
            }
            if (this.f26105v == 2) {
                TextView textView3 = this.f26103o;
                if (textView3 != null) {
                    textView3.setText(F8.h.ac_msg_input_psw);
                    return;
                }
                return;
            }
            TextView textView4 = this.f26103o;
            if (textView4 != null) {
                textView4.setText(F8.h.ac_input_psw);
            }
        }
    }
}
