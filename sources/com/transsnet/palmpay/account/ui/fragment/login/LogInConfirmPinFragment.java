package com.transsnet.palmpay.account.ui.fragment.login;

import Bc.C0107d;
import Bc.C0108e;
import C0.AbstractC0130w;
import C0.U;
import Ce.H;
import F8.d;
import F8.e;
import N8.C0463g;
import Pa.r0;
import Ua.l0;
import V9.q;
import android.content.Context;
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
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInConfirmPinFragment;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p051d9.C1623u;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInConfirmPinFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/u;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinEnteredListener;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinHideStateChangeListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogInConfirmPinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogInConfirmPinFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/login/LogInConfirmPinFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,280:1\n629#2,11:281\n*S KotlinDebug\n*F\n+ 1 LogInConfirmPinFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/login/LogInConfirmPinFragment\n*L\n123#1:281,11\n*E\n"})
public final class LogInConfirmPinFragment extends BaseMVPFragment<C1623u> implements LoginContract.View, PinEntryView.OnPinEnteredListener, PinEntryView.OnPinHideStateChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f26190v = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC0130w f26191j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26192o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f26193p;
    public C0108e t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LogInConfirmPinFragment newInstance() {
            LogInConfirmPinFragment logInConfirmPinFragment = new LogInConfirmPinFragment();
            logInConfirmPinFragment.setArguments(new Bundle());
            return logInConfirmPinFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static String v(PinEntryView pinEntryView) {
        EditText editText;
        Editable editableText;
        if (pinEntryView == null || (editText = pinEntryView.getEditText()) == null || (editableText = editText.getEditableText()) == null) {
            return null;
        }
        return editableText.toString();
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
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
        View viewM;
        View viewM2;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_confirm_pin, viewGroup, false);
        int i7 = d.btnNext;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.ivEyes;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
            if (iconicsImageView != null && (viewM = p059e1.a.m((i7 = d.layoutHeader), viewInflate)) != null) {
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
                            i7 = d.tvError1;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = d.tvError2;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    C0108e c0108e = new C0108e((FrameLayout) viewInflate, ppButton, iconicsImageView, c0107dC, pinEntryView, pinEntryView2, viewM2, textView, textView2, textView3, 2);
                                    this.t = c0108e;
                                    return c0108e;
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
            decorView.post(new H(handlerJ, 11, this, this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f26191j = NavHostFragment.f17502e.findNavController(this);
        C0108e c0108e = this.t;
        if (c0108e != null) {
            final int i7 = 0;
            ((IconicsImageView) ((C0107d) c0108e.f690g).f681c).setOnClickListener(new View.OnClickListener(this) { // from class: W8.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LogInConfirmPinFragment f10573b;

                {
                    this.f10573b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinEntryView pinEntryView;
                    PinEntryView pinEntryView2;
                    LogInConfirmPinFragment logInConfirmPinFragment = this.f10573b;
                    switch (i7) {
                        case 0:
                            int i10 = LogInConfirmPinFragment.f26190v;
                            LogInActivity logInActivityU = logInConfirmPinFragment.u();
                            if (logInActivityU != null) {
                                logInActivityU.onBackPressed();
                            }
                            break;
                        case 1:
                            C0108e c0108e2 = logInConfirmPinFragment.t;
                            String strV = LogInConfirmPinFragment.v(c0108e2 != null ? (PinEntryView) c0108e2.f691i : null);
                            LogInActivity logInActivityU2 = logInConfirmPinFragment.u();
                            if (logInActivityU2 != null) {
                                LogInReq logInReq = logInActivityU2.f25888b;
                                if (logInReq != null) {
                                    logInReq.pin = SecurityUtils.a(strV);
                                }
                                LogInReq logInReq2 = logInActivityU2.f25888b;
                                if (logInReq2 != null) {
                                    logInReq2.supplement = true;
                                }
                                Integer numB = L8.a.b(logInActivityU2, logInConfirmPinFragment.f26191j, new Bundle());
                                if (numB == null) {
                                    logInActivityU2.v();
                                } else if (numB.intValue() != Integer.MAX_VALUE) {
                                    U u6 = new U(false, false, F8.d.fragment_login_input_mobile, false, false, -1, -1, -1, -1);
                                    AbstractC0130w abstractC0130w = logInConfirmPinFragment.f26191j;
                                    if (abstractC0130w != null) {
                                        abstractC0130w.h(numB.intValue(), logInConfirmPinFragment.getArguments(), u6);
                                    }
                                } else {
                                    LogInActivity logInActivityU3 = logInConfirmPinFragment.u();
                                    if (logInActivityU3 != null) {
                                        logInActivityU3.p(new q(logInConfirmPinFragment, 6));
                                    }
                                }
                            }
                            break;
                        default:
                            int i11 = LogInConfirmPinFragment.f26190v;
                            if (!r0.U0()) {
                                boolean z3 = true ^ logInConfirmPinFragment.f26192o;
                                logInConfirmPinFragment.f26192o = z3;
                                C0108e c0108e3 = logInConfirmPinFragment.t;
                                if (c0108e3 != null && (pinEntryView2 = (PinEntryView) c0108e3.f691i) != null) {
                                    pinEntryView2.d(z3);
                                }
                                C0108e c0108e4 = logInConfirmPinFragment.t;
                                if (c0108e4 != null && (pinEntryView = (PinEntryView) c0108e4.f692j) != null) {
                                    pinEntryView.d(logInConfirmPinFragment.f26192o);
                                }
                                logInConfirmPinFragment.w(logInConfirmPinFragment.f26192o);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0108e c0108e2 = this.t;
        if (c0108e2 != null) {
            final int i10 = 1;
            ((PpButton) c0108e2.f688e).setOnClickListener(new View.OnClickListener(this) { // from class: W8.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LogInConfirmPinFragment f10573b;

                {
                    this.f10573b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinEntryView pinEntryView;
                    PinEntryView pinEntryView2;
                    LogInConfirmPinFragment logInConfirmPinFragment = this.f10573b;
                    switch (i10) {
                        case 0:
                            int i11 = LogInConfirmPinFragment.f26190v;
                            LogInActivity logInActivityU = logInConfirmPinFragment.u();
                            if (logInActivityU != null) {
                                logInActivityU.onBackPressed();
                            }
                            break;
                        case 1:
                            C0108e c0108e3 = logInConfirmPinFragment.t;
                            String strV = LogInConfirmPinFragment.v(c0108e3 != null ? (PinEntryView) c0108e3.f691i : null);
                            LogInActivity logInActivityU2 = logInConfirmPinFragment.u();
                            if (logInActivityU2 != null) {
                                LogInReq logInReq = logInActivityU2.f25888b;
                                if (logInReq != null) {
                                    logInReq.pin = SecurityUtils.a(strV);
                                }
                                LogInReq logInReq2 = logInActivityU2.f25888b;
                                if (logInReq2 != null) {
                                    logInReq2.supplement = true;
                                }
                                Integer numB = L8.a.b(logInActivityU2, logInConfirmPinFragment.f26191j, new Bundle());
                                if (numB == null) {
                                    logInActivityU2.v();
                                } else if (numB.intValue() != Integer.MAX_VALUE) {
                                    U u6 = new U(false, false, F8.d.fragment_login_input_mobile, false, false, -1, -1, -1, -1);
                                    AbstractC0130w abstractC0130w = logInConfirmPinFragment.f26191j;
                                    if (abstractC0130w != null) {
                                        abstractC0130w.h(numB.intValue(), logInConfirmPinFragment.getArguments(), u6);
                                    }
                                } else {
                                    LogInActivity logInActivityU3 = logInConfirmPinFragment.u();
                                    if (logInActivityU3 != null) {
                                        logInActivityU3.p(new q(logInConfirmPinFragment, 6));
                                    }
                                }
                            }
                            break;
                        default:
                            int i12 = LogInConfirmPinFragment.f26190v;
                            if (!r0.U0()) {
                                boolean z3 = true ^ logInConfirmPinFragment.f26192o;
                                logInConfirmPinFragment.f26192o = z3;
                                C0108e c0108e4 = logInConfirmPinFragment.t;
                                if (c0108e4 != null && (pinEntryView2 = (PinEntryView) c0108e4.f691i) != null) {
                                    pinEntryView2.d(z3);
                                }
                                C0108e c0108e5 = logInConfirmPinFragment.t;
                                if (c0108e5 != null && (pinEntryView = (PinEntryView) c0108e5.f692j) != null) {
                                    pinEntryView.d(logInConfirmPinFragment.f26192o);
                                }
                                logInConfirmPinFragment.w(logInConfirmPinFragment.f26192o);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0108e c0108e3 = this.t;
        if (c0108e3 != null) {
            ((PinEntryView) c0108e3.f691i).setOnPinEnteredListener(this);
        }
        C0108e c0108e4 = this.t;
        if (c0108e4 != null) {
            ((PinEntryView) c0108e4.f691i).f31083t0 = this;
        }
        if (c0108e4 != null) {
            ((PinEntryView) c0108e4.f692j).setOnPinEnteredListener(this);
        }
        C0108e c0108e5 = this.t;
        if (c0108e5 != null) {
            ((PinEntryView) c0108e5.f692j).f31083t0 = this;
        }
        w(this.f26192o);
        C0108e c0108e6 = this.t;
        if (c0108e6 != null) {
            final int i11 = 2;
            ((IconicsImageView) c0108e6.f689f).setOnClickListener(new View.OnClickListener(this) { // from class: W8.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LogInConfirmPinFragment f10573b;

                {
                    this.f10573b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinEntryView pinEntryView;
                    PinEntryView pinEntryView2;
                    LogInConfirmPinFragment logInConfirmPinFragment = this.f10573b;
                    switch (i11) {
                        case 0:
                            int i12 = LogInConfirmPinFragment.f26190v;
                            LogInActivity logInActivityU = logInConfirmPinFragment.u();
                            if (logInActivityU != null) {
                                logInActivityU.onBackPressed();
                            }
                            break;
                        case 1:
                            C0108e c0108e7 = logInConfirmPinFragment.t;
                            String strV = LogInConfirmPinFragment.v(c0108e7 != null ? (PinEntryView) c0108e7.f691i : null);
                            LogInActivity logInActivityU2 = logInConfirmPinFragment.u();
                            if (logInActivityU2 != null) {
                                LogInReq logInReq = logInActivityU2.f25888b;
                                if (logInReq != null) {
                                    logInReq.pin = SecurityUtils.a(strV);
                                }
                                LogInReq logInReq2 = logInActivityU2.f25888b;
                                if (logInReq2 != null) {
                                    logInReq2.supplement = true;
                                }
                                Integer numB = L8.a.b(logInActivityU2, logInConfirmPinFragment.f26191j, new Bundle());
                                if (numB == null) {
                                    logInActivityU2.v();
                                } else if (numB.intValue() != Integer.MAX_VALUE) {
                                    U u6 = new U(false, false, F8.d.fragment_login_input_mobile, false, false, -1, -1, -1, -1);
                                    AbstractC0130w abstractC0130w = logInConfirmPinFragment.f26191j;
                                    if (abstractC0130w != null) {
                                        abstractC0130w.h(numB.intValue(), logInConfirmPinFragment.getArguments(), u6);
                                    }
                                } else {
                                    LogInActivity logInActivityU3 = logInConfirmPinFragment.u();
                                    if (logInActivityU3 != null) {
                                        logInActivityU3.p(new q(logInConfirmPinFragment, 6));
                                    }
                                }
                            }
                            break;
                        default:
                            int i13 = LogInConfirmPinFragment.f26190v;
                            if (!r0.U0()) {
                                boolean z3 = true ^ logInConfirmPinFragment.f26192o;
                                logInConfirmPinFragment.f26192o = z3;
                                C0108e c0108e8 = logInConfirmPinFragment.t;
                                if (c0108e8 != null && (pinEntryView2 = (PinEntryView) c0108e8.f691i) != null) {
                                    pinEntryView2.d(z3);
                                }
                                C0108e c0108e9 = logInConfirmPinFragment.t;
                                if (c0108e9 != null && (pinEntryView = (PinEntryView) c0108e9.f692j) != null) {
                                    pinEntryView.d(logInConfirmPinFragment.f26192o);
                                }
                                logInConfirmPinFragment.w(logInConfirmPinFragment.f26192o);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0108e c0108e7 = this.t;
        if (c0108e7 == null) {
            return 0;
        }
        View view = c0108e7.f693o;
        PinEntryView pinEntryView = (PinEntryView) c0108e7.f691i;
        pinEntryView.setUseCustomKeyboard(true);
        PinEntryView pinEntryView2 = (PinEntryView) c0108e7.f692j;
        pinEntryView2.setUseCustomKeyboard(true);
        c cVar = this.f26193p;
        if (cVar != null) {
            cVar.e();
        }
        c cVar2 = new c(view);
        cVar2.a(C1850q.h(pinEntryView.getEditText(), pinEntryView2.getEditText()), Integer.valueOf(pinEntryView.getDigits()), l0.f9427a);
        this.f26193p = cVar2;
        final int i12 = 0;
        pinEntryView.setOnShowCustomKeyboardListener(new Runnable(this) { // from class: W8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogInConfirmPinFragment f10575b;

            {
                this.f10575b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        com.transsnet.palmpay.core.viewmodel.c cVar3 = this.f10575b.f26193p;
                        if (cVar3 != null) {
                            cVar3.g();
                        }
                        break;
                    default:
                        com.transsnet.palmpay.core.viewmodel.c cVar4 = this.f10575b.f26193p;
                        if (cVar4 != null) {
                            cVar4.g();
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        pinEntryView2.setOnShowCustomKeyboardListener(new Runnable(this) { // from class: W8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogInConfirmPinFragment f10575b;

            {
                this.f10575b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        com.transsnet.palmpay.core.viewmodel.c cVar3 = this.f10575b.f26193p;
                        if (cVar3 != null) {
                            cVar3.g();
                        }
                        break;
                    default:
                        com.transsnet.palmpay.core.viewmodel.c cVar4 = this.f10575b.f26193p;
                        if (cVar4 != null) {
                            cVar4.g();
                        }
                        break;
                }
            }
        });
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        C0108e c0108e = this.t;
        if (c0108e != null && (pinEntryView2 = (PinEntryView) c0108e.f691i) != null) {
            pinEntryView2.setOnShowCustomKeyboardListener(null);
        }
        C0108e c0108e2 = this.t;
        if (c0108e2 != null && (pinEntryView = (PinEntryView) c0108e2.f692j) != null) {
            pinEntryView.setOnShowCustomKeyboardListener(null);
        }
        c cVar = this.f26193p;
        if (cVar != null) {
            cVar.e();
        }
        this.f26193p = null;
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinHideStateChangeListener
    public final void onHideStateChanged(PinEntryView pinEntryView, boolean z3) {
        C0108e c0108e;
        PinEntryView pinEntryView2;
        C0108e c0108e2;
        PinEntryView pinEntryView3;
        C0108e c0108e3 = this.t;
        if (!Intrinsics.c(pinEntryView, c0108e3 != null ? (PinEntryView) c0108e3.f691i : null) && (c0108e2 = this.t) != null && (pinEntryView3 = (PinEntryView) c0108e2.f691i) != null) {
            pinEntryView3.d(z3);
        }
        C0108e c0108e4 = this.t;
        if (Intrinsics.c(pinEntryView, c0108e4 != null ? (PinEntryView) c0108e4.f692j : null) || (c0108e = this.t) == null || (pinEntryView2 = (PinEntryView) c0108e.f692j) == null) {
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
        C0108e c0108e;
        C0108e c0108e2 = this.t;
        boolean z3 = false;
        if (c0108e2 != null) {
            h.s(c0108e2.f686c, false);
        }
        C0108e c0108e3 = this.t;
        if (c0108e3 != null) {
            h.s((TextView) c0108e3.f694p, false);
        }
        C0108e c0108e4 = this.t;
        String strV = v(c0108e4 != null ? (PinEntryView) c0108e4.f691i : null);
        if (strV != null) {
            int length = strV.length();
            int i7 = L8.c.f5560a;
            if (length == i7) {
                C0108e c0108e5 = this.t;
                String strV2 = v(c0108e5 != null ? (PinEntryView) c0108e5.f692j : null);
                if (strV2 != null && strV2.length() == i7) {
                    z3 = true;
                }
            }
        }
        C0108e c0108e6 = this.t;
        if (c0108e6 != null) {
            ((PpButton) c0108e6.f688e).setEnabled(z3);
        }
        C0108e c0108e7 = this.t;
        String strV3 = v(c0108e7 != null ? (PinEntryView) c0108e7.f691i : null);
        C0108e c0108e8 = this.t;
        if (c0108e8 == null || !((PpButton) c0108e8.f688e).isEnabled()) {
            if (strV3 == null || strV3.length() != L8.c.f5560a || (c0108e = this.t) == null) {
                return;
            }
            ((PinEntryView) c0108e.f692j).c();
            return;
        }
        KeyboardUtils.hideSoftInput(getActivity());
        c cVar = this.f26193p;
        if (cVar != null) {
            cVar.d();
        }
        try {
            C0108e c0108e9 = this.t;
            String strV4 = v(c0108e9 != null ? (PinEntryView) c0108e9.f691i : null);
            C0108e c0108e10 = this.t;
            if (TextUtils.equals(strV4, v(c0108e10 != null ? (PinEntryView) c0108e10.f692j : null))) {
                if (L8.c.e(strV3) || L8.c.d(strV3) || L8.c.c(strV3) <= 0) {
                    C0108e c0108e11 = this.t;
                    if (c0108e11 != null) {
                        c0108e11.f686c.setText(getString(F8.h.ac_msg_invalid_psw));
                    }
                    C0108e c0108e12 = this.t;
                    if (c0108e12 != null) {
                        h.C(c0108e12.f686c);
                        return;
                    }
                    return;
                }
                return;
            }
        } catch (Exception e10) {
            F6.d.c(this.f27317a, "isEqual: ", e10);
        }
        C0108e c0108e13 = this.t;
        if (c0108e13 != null) {
            ((TextView) c0108e13.f694p).setText(getString(F8.h.ac_msg_password_not_same));
        }
        C0108e c0108e14 = this.t;
        if (c0108e14 != null) {
            h.C((TextView) c0108e14.f694p);
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

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1623u();
    }

    public final LogInActivity u() {
        E e10 = this.f27319c;
        if (!(e10 instanceof LogInActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
        return (LogInActivity) e10;
    }

    public final void w(boolean z3) {
        C0108e c0108e = this.t;
        if (c0108e != null) {
            IconicsImageView iconicsImageView = (IconicsImageView) c0108e.f689f;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, z3 ? S6.a.pay_Hide : S6.a.pay_Show);
            iconicsDrawable.a(new C0463g(this, 18));
            iconicsImageView.setImageDrawable(iconicsDrawable);
        }
    }
}
