package com.transsnet.palmpay.account.ui.fragment.auth;

import Bc.f;
import C0.G;
import C9.C0138e;
import C9.Q;
import Ce.H;
import F8.e;
import Fe.h0;
import N8.C0457a;
import O6.c;
import Pa.r0;
import R8.o;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SPUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p059e1.a;
import p115ha.b;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/auth/VerifySafePinFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/auth/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/viewmodel/KeyboardGridLayout$NumKeyboardClickListener;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVerifySafePinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifySafePinFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/VerifySafePinFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,448:1\n629#2,11:449\n694#2,50:460\n71#3,8:510\n112#3:518\n*S KotlinDebug\n*F\n+ 1 VerifySafePinFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/VerifySafePinFragment\n*L\n104#1:449,11\n261#1:460,50\n282#1:510,8\n282#1:518\n*E\n"})
public final class VerifySafePinFragment extends BaseVerifyFragment implements KeyboardGridLayout.NumKeyboardClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f26121j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26122o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26123p;

    public static final void B(VerifySafePinFragment verifySafePinFragment) {
        boolean z3 = SPUtils.getInstance().getBoolean(d.l(), false);
        boolean zV = n.v();
        if (z3 || zV) {
            f fVar = verifySafePinFragment.f26121j;
            if (fVar != null) {
                h.s((TextView) fVar.f702i, true);
            }
            f fVar2 = verifySafePinFragment.f26121j;
            if (fVar2 != null) {
                h.s(fVar2.f703j, true);
            }
            f fVar3 = verifySafePinFragment.f26121j;
            verifySafePinFragment.A(fVar3 != null ? (TextView) fVar3.f702i : null);
        } else {
            f fVar4 = verifySafePinFragment.f26121j;
            if (fVar4 != null) {
                h.s((TextView) fVar4.f702i, false);
            }
            f fVar5 = verifySafePinFragment.f26121j;
            if (fVar5 != null) {
                h.s(fVar5.f703j, false);
            }
        }
        if (verifySafePinFragment.u() >= 5) {
            f fVar6 = verifySafePinFragment.f26121j;
            if (fVar6 != null) {
                h.s((TextView) fVar6.f702i, false);
            }
            f fVar7 = verifySafePinFragment.f26121j;
            if (fVar7 != null) {
                h.s(fVar7.f703j, false);
            }
        }
    }

    public final void C() {
        PinEntryView pinEntryView;
        f fVar = this.f26121j;
        KeyboardUtils.hideSoftInput((fVar == null || (pinEntryView = (PinEntryView) fVar.f698d) == null) ? null : pinEntryView.getEditText());
    }

    public final void D() {
        PinEntryView pinEntryView;
        f fVar = this.f26121j;
        if (fVar != null && (pinEntryView = (PinEntryView) fVar.f698d) != null) {
            pinEntryView.b();
        }
        b.f37362a.f37366d = true;
        if (this.f26122o == 1) {
            com.palmpay.lib.apm.launchcounter.util.d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PIN);
        } else {
            com.palmpay.lib.apm.launchcounter.util.d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD);
        }
    }

    public final void E(String str) {
        f fVar = this.f26121j;
        if (fVar != null) {
            ((PinEntryView) fVar.f698d).b();
        }
        E activity = getActivity();
        if (activity != null) {
            int i7 = k.core_failed_all_cap;
            int i10 = this.f26122o == 1 ? F8.h.ac_forget_pin_2 : F8.h.ac_forget_psw;
            final int i11 = 0;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: R8.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VerifySafePinFragment f7964b;

                {
                    this.f7964b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinEntryView pinEntryView;
                    switch (i11) {
                        case 0:
                            this.f7964b.D();
                            break;
                        default:
                            Bc.f fVar2 = this.f7964b.f26121j;
                            if (fVar2 != null && (pinEntryView = (PinEntryView) fVar2.f698d) != null) {
                                pinEntryView.b();
                                break;
                            }
                            break;
                    }
                }
            };
            int i12 = k.core_confirm;
            final int i13 = 1;
            View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: R8.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VerifySafePinFragment f7964b;

                {
                    this.f7964b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinEntryView pinEntryView;
                    switch (i13) {
                        case 0:
                            this.f7964b.D();
                            break;
                        default:
                            Bc.f fVar2 = this.f7964b.f26121j;
                            if (fVar2 != null && (pinEntryView = (PinEntryView) fVar2.f698d) != null) {
                                pinEntryView.b();
                                break;
                            }
                            break;
                    }
                }
            };
            c cVar = new c(activity);
            cVar.f6614u = 1;
            cVar.e(i7);
            cVar.f6598d = str;
            cVar.d(i12, onClickListener2);
            cVar.c(i10, onClickListener);
            cVar.f6605k = true;
            cVar.f6606l = 1;
            G.v(cVar, false, false);
        }
    }

    public final void F(String str) {
        TextView textView;
        TextView textView2;
        f fVar = this.f26121j;
        if (fVar != null && (textView2 = (TextView) fVar.f699e) != null) {
            textView2.setTextColor(requireContext().getColor(L6.b.ppColorError));
        }
        f fVar2 = this.f26121j;
        if (fVar2 == null || (textView = (TextView) fVar2.f699e) == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_safe_pin, viewGroup, false);
        int i7 = F8.d.bottomViewStub;
        ViewStub viewStub = (ViewStub) a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = F8.d.pinView;
            PinEntryView pinEntryView = (PinEntryView) a.m(i7, viewInflate);
            if (pinEntryView != null) {
                i7 = F8.d.tvError;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = F8.d.tvForgotPin;
                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = F8.d.tvTitle;
                        TextView textView3 = (TextView) a.m(i7, viewInflate);
                        if (textView3 != null) {
                            i7 = F8.d.tvVerify;
                            TextView textView4 = (TextView) a.m(i7, viewInflate);
                            if (textView4 != null) {
                                i7 = F8.d.viewBottom;
                                if (((LinearLayout) a.m(i7, viewInflate)) != null && (viewM = a.m((i7 = F8.d.viewLine1), viewInflate)) != null) {
                                    f fVar = new f((LinearLayout) viewInflate, viewStub, pinEntryView, textView, textView2, textView3, textView4, viewM);
                                    this.f26121j = fVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        SafeVerifyViewModel safeVerifyViewModel = (SafeVerifyViewModel) this.f27333i;
        l lVar = safeVerifyViewModel != null ? safeVerifyViewModel.f26439e : null;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(25, this, this), (char) 0, false));
        }
        SafeVerifyViewModel safeVerifyViewModel2 = (SafeVerifyViewModel) this.f27333i;
        n.B(this, safeVerifyViewModel2 != null ? safeVerifyViewModel2.f26440f : null, this, new Ba.a(this, 12), new h0(23), false, null, 240);
        f fVar = this.f26121j;
        if (fVar != null) {
            ((PinEntryView) fVar.f698d).setOnPinEnteredListener(new C0457a(this, 18));
        }
        j().postDelayed(new o(this, 0), 200L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Window window;
        super.o();
        this.f26122o = BaseApplication.get().getUser().isLoginPswEnabled() ? 2 : 1;
        x();
        if (this.f26122o == 2) {
            f fVar = this.f26121j;
            if (fVar != null) {
                ((PinEntryView) fVar.f698d).setDigitSpacing(getResources().getDimensionPixelSize(F8.b.ac_psw_digit_space));
            }
            f fVar2 = this.f26121j;
            if (fVar2 != null) {
                ((PinEntryView) fVar2.f698d).setDigitHeight(getResources().getDimensionPixelSize(F8.b.ac_psw_digit_height));
            }
            f fVar3 = this.f26121j;
            if (fVar3 != null) {
                ((PinEntryView) fVar3.f698d).setDigitWidth(getResources().getDimensionPixelSize(F8.b.ac_psw_digit_width));
            }
        }
        f fVar4 = this.f26121j;
        if (fVar4 != null) {
            ((PinEntryView) fVar4.f698d).setDigits(this.f26122o == 2 ? L8.c.f5561b : L8.c.f5560a);
        }
        f fVar5 = this.f26121j;
        if (fVar5 != null) {
            ((PinEntryView) fVar5.f698d).setEnabled(false);
        }
        if (this.f26122o == 1) {
            f fVar6 = this.f26121j;
            if (fVar6 != null) {
                ((TextView) fVar6.f701g).setText(F8.h.ac_enter_pin_to_unlock);
            }
        } else {
            f fVar7 = this.f26121j;
            if (fVar7 != null) {
                ((TextView) fVar7.f701g).setText(F8.h.ac_enter_password_to_unlock);
            }
        }
        f fVar8 = this.f26121j;
        if (fVar8 != null) {
            ((TextView) fVar8.f702i).setOnClickListener(this);
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.post(new H(handlerJ, 5, this, this));
        }
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = F8.d.tvVerify;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            if (r0.U0()) {
                return;
            }
            t();
        } else {
            int i10 = F8.d.tvForgotPin;
            if (numValueOf == null || numValueOf.intValue() != i10 || r0.U0()) {
                return;
            }
            D();
        }
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        f fVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        f fVar2 = this.f26121j;
        String strValueOf = String.valueOf((fVar2 == null || (pinEntryView2 = (PinEntryView) fVar2.f698d) == null) ? null : pinEntryView2.getText());
        if (TextUtils.isEmpty(strValueOf) || (fVar = this.f26121j) == null || (pinEntryView = (PinEntryView) fVar.f698d) == null) {
            return;
        }
        String strSubstring = strValueOf.substring(0, strValueOf.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        pinEntryView.setText(strSubstring);
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String str) {
        f fVar;
        f fVar2 = this.f26121j;
        String strValueOf = String.valueOf(fVar2 != null ? ((PinEntryView) fVar2.f698d).getText() : null);
        if (strValueOf.length() <= (this.f26122o == 2 ? L8.c.f5561b : L8.c.f5560a) && (fVar = this.f26121j) != null) {
            ((PinEntryView) fVar.f698d).setText(strValueOf + str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        Handler handlerJ = j();
        if (handlerJ != null) {
            handlerJ.post(new o(this, 1));
        }
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

    @Override // com.transsnet.palmpay.account.ui.fragment.auth.BaseVerifyFragment
    public final void z(String str) {
        super.z(str);
        if (this.f26123p) {
            n.G();
        }
    }
}
