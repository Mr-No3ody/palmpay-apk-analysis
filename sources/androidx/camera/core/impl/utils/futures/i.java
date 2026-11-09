package androidx.camera.core.impl.utils.futures;

import B6.ViewOnClickListenerC0087i;
import Bc.C0108e;
import Bc.D;
import Bc.j;
import C0.G;
import Ed.ViewOnFocusChangeListenerC0235o;
import Ed.Y;
import I8.t;
import Kd.e2;
import L6.b;
import N8.m0;
import Pa.AbstractC0520q;
import Pa.i0;
import Pa.r0;
import Rd.f0;
import Rd.g0;
import Ua.l0;
import V0.C;
import Wf.AbstractC0776u;
import Wf.AbstractC0780y;
import Wf.U;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.N;
import androidx.lifecycle.F;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.google.api.Service;
import com.google.common.util.concurrent.ListenableFuture;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpPhoneEditText;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep0Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStepFace2Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInConfirmPinFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.account.ui.viewmodel.SignUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import com.transsnet.palmpay.core.viewmodel.ModelBillQuickAccessItem;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.teller.viewmodel.BillQuickAccessDataViewModel;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.coroutines.CancellableContinuation;
import p025ba.a;
import p086fe.F0;
import p220oa.h;
import p223od.q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14211c;

    public /* synthetic */ i(int i7, Object obj, Object obj2) {
        this.f14209a = i7;
        this.f14210b = obj;
        this.f14211c = obj2;
    }

    private final void a() {
        View viewFindViewById;
        final SignUpStep1Fragment signUpStep1Fragment = (SignUpStep1Fragment) this.f14211c;
        SignUpStep1Fragment signUpStep1Fragment2 = (SignUpStep1Fragment) this.f14210b;
        if (!signUpStep1Fragment2.isAdded() || signUpStep1Fragment2.isDetached()) {
            return;
        }
        Trace.beginSection("delayInit");
        try {
            Bc.j jVar = signUpStep1Fragment.f26262j;
            if (jVar != null) {
                ((ViewStub) jVar.f744p).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: a9.d
                    @Override // android.view.ViewStub.OnInflateListener
                    public final void onInflate(ViewStub viewStub, View view) {
                        AppCompatEditText appCompatEditText;
                        boolean zBooleanValue;
                        SignUpViewModel signUpViewModel;
                        F f10;
                        SignUpViewModel signUpViewModel2;
                        F f11;
                        Boolean bool;
                        FrameLayout frameLayout;
                        AppCompatEditText editText;
                        AppCompatEditText editText2;
                        TextView hintTextView;
                        TextView countryCodeTextView;
                        int i7 = 2;
                        int i10 = 1;
                        SignUpStep1Fragment.a aVar = SignUpStep1Fragment.f26251u0;
                        SignUpStep1Fragment signUpStep1Fragment3 = signUpStep1Fragment;
                        PpPhoneEditText ppPhoneEditText = (PpPhoneEditText) signUpStep1Fragment3.f27318b.findViewById(F8.d.inputMobile);
                        signUpStep1Fragment3.f26259X = ppPhoneEditText;
                        if (ppPhoneEditText != null) {
                            ppPhoneEditText.setEditTextWatcher(new i(signUpStep1Fragment3, 1));
                        }
                        if (AbstractC0520q.f7144j) {
                            PpPhoneEditText ppPhoneEditText2 = signUpStep1Fragment3.f26259X;
                            r0.R1(ppPhoneEditText2 != null ? ppPhoneEditText2.getEditText() : null, "fonts/PalmPayNum-Regular.ttf");
                            PpPhoneEditText ppPhoneEditText3 = signUpStep1Fragment3.f26259X;
                            r0.R1(ppPhoneEditText3 != null ? ppPhoneEditText3.getCountryCodeTextView() : null, "fonts/PalmPayNum-Regular.ttf");
                        }
                        PpPhoneEditText ppPhoneEditText4 = signUpStep1Fragment3.f26259X;
                        if (ppPhoneEditText4 != null && (countryCodeTextView = ppPhoneEditText4.getCountryCodeTextView()) != null) {
                            h.m(countryCodeTextView, Integer.valueOf(CommonViewExtKt.getDp(1.0f)));
                        }
                        PpPhoneEditText ppPhoneEditText5 = signUpStep1Fragment3.f26259X;
                        if (ppPhoneEditText5 != null && (hintTextView = ppPhoneEditText5.getHintTextView()) != null) {
                            h.m(hintTextView, Integer.valueOf(CommonViewExtKt.getDp(1.0f)));
                        }
                        PpPhoneEditText ppPhoneEditText6 = signUpStep1Fragment3.f26259X;
                        if (ppPhoneEditText6 != null) {
                            ppPhoneEditText6.setHintText("Please enter Phone Number");
                        }
                        PpPhoneEditText ppPhoneEditText7 = signUpStep1Fragment3.f26259X;
                        if (ppPhoneEditText7 != null && (editText2 = ppPhoneEditText7.getEditText()) != null) {
                            editText2.setImeOptions(6);
                        }
                        SignUpActivity signUpActivityX = signUpStep1Fragment3.x();
                        SignUpReq signUpReqM = signUpActivityX != null ? signUpActivityX.m() : null;
                        if (signUpReqM == null || TextUtils.isEmpty(signUpReqM.mobileNo)) {
                            PpPhoneEditText ppPhoneEditText8 = signUpStep1Fragment3.f26259X;
                            if (ppPhoneEditText8 != null) {
                                SignUpActivity signUpActivityX2 = signUpStep1Fragment3.x();
                                ppPhoneEditText8.setEditContent(r0.w0(signUpActivityX2 != null ? signUpActivityX2.f26036e : null));
                            }
                        } else {
                            PpPhoneEditText ppPhoneEditText9 = signUpStep1Fragment3.f26259X;
                            if (ppPhoneEditText9 != null) {
                                ppPhoneEditText9.setEditContent(r0.w0(signUpReqM.mobileNo));
                            }
                        }
                        j jVar2 = signUpStep1Fragment3.f26262j;
                        if (jVar2 != null) {
                            View view2 = jVar2.f735b;
                            c cVar = signUpStep1Fragment3.f26254C;
                            if (cVar != null) {
                                cVar.e();
                            }
                            c cVar2 = new c(view2);
                            PpPhoneEditText ppPhoneEditText10 = signUpStep1Fragment3.f26259X;
                            AppCompatEditText editText3 = ppPhoneEditText10 != null ? ppPhoneEditText10.getEditText() : null;
                            l0 inputMode = l0.f9428b;
                            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                            cVar2.a(C1849p.c(editText3), 13, inputMode);
                            PpPhoneEditText ppPhoneEditText11 = signUpStep1Fragment3.f26259X;
                            if (ppPhoneEditText11 != null && (editText = ppPhoneEditText11.getEditText()) != null) {
                                editText.requestFocus();
                            }
                            signUpStep1Fragment3.f26254C = cVar2;
                        }
                        signUpStep1Fragment3.E();
                        j jVar3 = signUpStep1Fragment3.f26262j;
                        if (jVar3 != null) {
                            h.A((FrameLayout) jVar3.f739f, true, a.core_anim_fade_in);
                        }
                        j jVar4 = signUpStep1Fragment3.f26262j;
                        if (jVar4 != null) {
                            ((ImageView) jVar4.f741i).setImageResource(r.cv_palmpay_text_and_logo_purple);
                        }
                        j jVar5 = signUpStep1Fragment3.f26262j;
                        if (jVar5 != null) {
                            h.A((ImageView) jVar5.f741i, true, a.core_anim_fade_in);
                        }
                        j jVar6 = signUpStep1Fragment3.f26262j;
                        if (jVar6 != null) {
                            h.A((AppCompatImageView) jVar6.f742j, true, a.core_anim_fade_in);
                        }
                        if (signUpStep1Fragment3.f26268r0 > 0) {
                            j jVar7 = signUpStep1Fragment3.f26262j;
                            if (jVar7 != null) {
                                h.C((ViewStub) jVar7.f732B);
                            }
                            j jVar8 = signUpStep1Fragment3.f26262j;
                            if (jVar8 != null && (frameLayout = (FrameLayout) jVar8.t) != null) {
                                frameLayout.requestLayout();
                            }
                            signUpStep1Fragment3.f26255H = (TextView) signUpStep1Fragment3.f27318b.findViewById(F8.d.textViewAllAgreement);
                            signUpStep1Fragment3.f26256L = (IconicsCheckBox) signUpStep1Fragment3.f27318b.findViewById(F8.d.checkAllAgreement);
                            signUpStep1Fragment3.f26263k0 = signUpStep1Fragment3.f27318b.findViewById(F8.d.viewAllAgreement);
                            int iColorInt = CommonViewExtKt.colorInt(b.ppColorTextNormal, signUpStep1Fragment3.getContext());
                            int iColorInt2 = CommonViewExtKt.colorInt(b.ppColorTextPrimary, signUpStep1Fragment3.getContext());
                            TextView textView = signUpStep1Fragment3.f26255H;
                            if (textView != null) {
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                            }
                            TextView textView2 = signUpStep1Fragment3.f26255H;
                            if (textView2 != null) {
                                textView2.setText(new SpanUtils().append("I have read, understood, and agreed to ").setForegroundColor(iColorInt).append("Terms & Conditions").setForegroundColor(iColorInt2).setClickSpan((j) signUpStep1Fragment3.f26269s0.getValue()).appendSpace(SizeUtils.dp2px(2.0f)).append("and").setForegroundColor(iColorInt).appendSpace(SizeUtils.dp2px(2.0f)).append("Privacy Policy").setForegroundColor(iColorInt2).setClickSpan((k) signUpStep1Fragment3.f26270t0.getValue()).create());
                            }
                            SignUpActivity signUpActivityX3 = signUpStep1Fragment3.x();
                            if (signUpActivityX3 == null || (signUpViewModel2 = (SignUpViewModel) signUpActivityX3.f26041o.getValue()) == null || (f11 = signUpViewModel2.f26442e) == null || (bool = (Boolean) f11.d()) == null) {
                                zBooleanValue = signUpStep1Fragment3.f26268r0 == 2;
                            } else {
                                zBooleanValue = bool.booleanValue();
                            }
                            SignUpActivity signUpActivityX4 = signUpStep1Fragment3.x();
                            if (signUpActivityX4 != null && (signUpViewModel = (SignUpViewModel) signUpActivityX4.f26041o.getValue()) != null && (f10 = signUpViewModel.f26442e) != null) {
                                f10.k(Boolean.valueOf(zBooleanValue));
                            }
                            signUpStep1Fragment3.D(zBooleanValue);
                            TextView textView3 = signUpStep1Fragment3.f26255H;
                            if (textView3 != null) {
                                textView3.setHighlightColor(0);
                            }
                            IconicsCheckBox iconicsCheckBox = signUpStep1Fragment3.f26256L;
                            if (iconicsCheckBox != null) {
                                iconicsCheckBox.setOnCheckedChangeListener(new c(signUpStep1Fragment3, 0));
                            }
                        } else {
                            j jVar9 = signUpStep1Fragment3.f26262j;
                            if (jVar9 != null) {
                                h.C((ViewStub) jVar9.f731A);
                            }
                            j jVar10 = signUpStep1Fragment3.f26262j;
                            if (jVar10 != null) {
                                h.C((ViewStub) jVar10.f733C);
                            }
                            signUpStep1Fragment3.f26257M = (IconicsCheckBox) signUpStep1Fragment3.f27318b.findViewById(F8.d.checkAgreement);
                            signUpStep1Fragment3.f26258Q = (IconicsCheckBox) signUpStep1Fragment3.f27318b.findViewById(F8.d.checkAgreement2);
                            signUpStep1Fragment3.f26266p0 = signUpStep1Fragment3.f27318b.findViewById(F8.d.viewAgreement);
                            signUpStep1Fragment3.f26267q0 = signUpStep1Fragment3.f27318b.findViewById(F8.d.viewPrivacy);
                            IconicsCheckBox iconicsCheckBox2 = signUpStep1Fragment3.f26257M;
                            if (iconicsCheckBox2 != null) {
                                iconicsCheckBox2.setOnCheckedChangeListener(new c(signUpStep1Fragment3, 1));
                            }
                            IconicsCheckBox iconicsCheckBox3 = signUpStep1Fragment3.f26258Q;
                            if (iconicsCheckBox3 != null) {
                                iconicsCheckBox3.setOnCheckedChangeListener(new c(signUpStep1Fragment3, 2));
                            }
                            View viewFindViewById2 = signUpStep1Fragment3.f27318b.findViewById(F8.d.tvTerms);
                            if (viewFindViewById2 != null) {
                                viewFindViewById2.setOnClickListener(new a(signUpStep1Fragment3, i10));
                            }
                            View viewFindViewById3 = signUpStep1Fragment3.f27318b.findViewById(F8.d.tvPolicy);
                            if (viewFindViewById3 != null) {
                                viewFindViewById3.setOnClickListener(new a(signUpStep1Fragment3, i7));
                            }
                        }
                        j jVar11 = signUpStep1Fragment3.f26262j;
                        if (jVar11 != null) {
                            h.s((ViewStub) jVar11.f740g, true);
                        }
                        signUpStep1Fragment3.f26260Y = (TextView) signUpStep1Fragment3.f27318b.findViewById(F8.d.tvInvitationError);
                        View view3 = signUpStep1Fragment3.f27318b;
                        if (view3 != null && (appCompatEditText = (AppCompatEditText) view3.findViewById(F8.d.inputInvitationCode)) != null) {
                            signUpStep1Fragment3.f26261Z = appCompatEditText;
                            String string = signUpStep1Fragment3.getString(F8.h.ac_enter_an_invitation_code_optional);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            appCompatEditText.setHint(h.B(string, signUpStep1Fragment3.getActivity(), null, Integer.valueOf(b.ppColorTextDisable), null, null, null, 1018));
                            h.r(appCompatEditText, new i(signUpStep1Fragment3, 0), null);
                            appCompatEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(signUpStep1Fragment3, 11));
                        }
                        IconicsImageView iconicsImageView = (IconicsImageView) signUpStep1Fragment3.f27318b.findViewById(F8.d.iv_arrow);
                        TextView textView4 = (TextView) signUpStep1Fragment3.f27318b.findViewById(F8.d.tvInvitationName);
                        h.q(new ViewOnClickListenerC0087i(signUpStep1Fragment3, 25, textView4, iconicsImageView), textView4, iconicsImageView);
                        j jVar12 = signUpStep1Fragment3.f26262j;
                        if (jVar12 != null) {
                            h.s((ViewStub) jVar12.f738e, true);
                        }
                    }
                });
            }
            Bc.j jVar2 = signUpStep1Fragment.f26262j;
            if (jVar2 != null) {
                ((ViewStub) jVar2.f744p).inflate();
            }
            Bc.j jVar3 = signUpStep1Fragment.f26262j;
            if (jVar3 != null) {
                p220oa.h.s((ViewStub) jVar3.f743o, true);
            }
            View view = signUpStep1Fragment.f27318b;
            if (view != null && (viewFindViewById = view.findViewById(F8.d.tvLogin)) != null) {
                viewFindViewById.setOnClickListener(new p010a9.a(signUpStep1Fragment, 0));
            }
            Bc.j jVar4 = signUpStep1Fragment.f26262j;
            if (jVar4 != null) {
                p220oa.h.s((ViewStub) jVar4.f737d, true);
            }
            View view2 = signUpStep1Fragment.f27318b;
            SingleAdView singleAdView = view2 != null ? (SingleAdView) view2.findViewById(F8.d.adView) : null;
            signUpStep1Fragment.f26253B = singleAdView;
            if (singleAdView != null) {
                singleAdView.setUseCoroutine(true);
            }
            SingleAdView singleAdView2 = signUpStep1Fragment.f26253B;
            if (singleAdView2 != null) {
                singleAdView2.setSlotId(CommonViewExtKt.string(F8.h.ac_ad_sign_up_corner_1, signUpStep1Fragment.getContext()));
            }
        } finally {
            Trace.endSection();
        }
    }

    private final void b() {
        try {
            try {
                a aVar = (a) this.f14211c;
                Object objC = j.c((ListenableFuture) this.f14210b);
                androidx.concurrent.futures.k kVar = aVar.f14194b;
                if (kVar != null) {
                    kVar.b(objC);
                }
            } catch (CancellationException unused) {
                ((a) this.f14211c).cancel(false);
            } catch (ExecutionException e10) {
                a aVar2 = (a) this.f14211c;
                Throwable cause = e10.getCause();
                androidx.concurrent.futures.k kVar2 = aVar2.f14194b;
                if (kVar2 != null) {
                    kVar2.d(cause);
                }
            }
        } finally {
            ((a) this.f14211c).f14192g = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5.a aVar;
        I8.m mVar;
        I8.r rVar;
        PreCheckPhoneRsp preCheckPhoneRsp;
        View viewInflate;
        ModelAvailableCouponItem modelAvailableCouponItem;
        int i7 = 2;
        int i10 = 16;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.f14211c;
        switch (this.f14209a) {
            case 0:
                FutureCallback futureCallback = (FutureCallback) obj;
                try {
                    futureCallback.onSuccess(j.b((ListenableFuture) this.f14210b));
                    return;
                } catch (Error e10) {
                    e = e10;
                    futureCallback.onFailure(e);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    futureCallback.onFailure(e);
                    return;
                } catch (ExecutionException e12) {
                    Throwable cause = e12.getCause();
                    if (cause == null) {
                        futureCallback.onFailure(e12);
                        return;
                    } else {
                        futureCallback.onFailure(cause);
                        return;
                    }
                }
            case 1:
                HomeFragmentHomeTab homeFragmentHomeTab = (HomeFragmentHomeTab) this.f14210b;
                if (!homeFragmentHomeTab.isAdded() || homeFragmentHomeTab.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    HomeFragmentHomeTab.u((HomeFragmentHomeTab) obj);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 2:
                HomeMeFragment homeMeFragment = (HomeMeFragment) this.f14210b;
                if (!homeMeFragment.isAdded() || homeMeFragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    HomeMeFragment.u((HomeMeFragment) obj);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                HomePalmZoneTabV2 homePalmZoneTabV2 = (HomePalmZoneTabV2) this.f14210b;
                if (!homePalmZoneTabV2.isAdded() || homePalmZoneTabV2.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    HomePalmZoneTabV2.u((HomePalmZoneTabV2) obj);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
                TransferToBankHomeFragment transferToBankHomeFragment = (TransferToBankHomeFragment) obj;
                TransferToBankHomeFragment transferToBankHomeFragment2 = (TransferToBankHomeFragment) this.f14210b;
                if (!transferToBankHomeFragment2.isAdded() || transferToBankHomeFragment2.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    q qVar = (q) transferToBankHomeFragment.f27335j;
                    if (qVar != null) {
                        p220oa.h.C(qVar.f40468p);
                    }
                    q qVar2 = (q) transferToBankHomeFragment.f27335j;
                    if (qVar2 != null) {
                        p220oa.h.C(qVar2.f40463f);
                    }
                    q qVar3 = (q) transferToBankHomeFragment.f27335j;
                    if (qVar3 != null) {
                        p220oa.h.C(qVar3.f40456X);
                    }
                    q qVar4 = (q) transferToBankHomeFragment.f27335j;
                    if (qVar4 != null) {
                        qVar4.f40460c.setAdListener(new Y(transferToBankHomeFragment, i11));
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 5:
                TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = (TransferToPalmPayHomeFragment) obj;
                TransferToPalmPayHomeFragment transferToPalmPayHomeFragment2 = (TransferToPalmPayHomeFragment) this.f14210b;
                if (!transferToPalmPayHomeFragment2.isAdded() || transferToPalmPayHomeFragment2.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    TransferToPalmPayHomeFragment.u(transferToPalmPayHomeFragment);
                    p223od.r rVar2 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                    if (rVar2 != null) {
                        p220oa.h.C(rVar2.f40483e);
                    }
                    p223od.r rVar3 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                    if (rVar3 != null) {
                        p220oa.h.C(rVar3.f40487j);
                    }
                    p223od.r rVar4 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                    if (rVar4 != null) {
                        p220oa.h.C(rVar4.f40488o);
                    }
                    p223od.r rVar5 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                    if (rVar5 != null) {
                        p220oa.h.C(rVar5.f40477Q);
                    }
                    TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToPalmPayHomeFragment.f27333i;
                    if (transferToPalmPayHomeViewModel != null) {
                        p140j8.f.s(transferToPalmPayHomeViewModel, new e2(1, null), transferToPalmPayHomeViewModel.f34081i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 6:
                Eg.g gVar = (Eg.g) this.f14210b;
                if (gVar.f2441b) {
                    WeakReference weakReference = (WeakReference) gVar.f2442c;
                    if ((weakReference != null ? (View) weakReference.get() : null) == null || (aVar = (I5.a) gVar.f2443d) == null) {
                        return;
                    }
                    View view = (View) obj;
                    view.invalidateDrawable(aVar);
                    WeakHashMap weakHashMap = N.f16168a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                TextView textView = (TextView) this.f14210b;
                Me.c cVar = (Me.c) obj;
                if (!textView.isAttachedToWindow()) {
                    cVar.b();
                    return;
                }
                Long l5 = cVar.f5960j;
                if (l5 != null) {
                    long jLongValue = l5.longValue();
                    String str = cVar.f5961o;
                    if (str == null) {
                        return;
                    }
                    long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
                    if (jCurrentTimeMillis <= 0) {
                        p220oa.h.s(textView, false);
                        cVar.b();
                        return;
                    }
                    Context context = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    long jCurrentTimeMillis2 = jLongValue - System.currentTimeMillis();
                    long j6 = jCurrentTimeMillis2 >= 0 ? jCurrentTimeMillis2 : 0L;
                    Me.b bVar = Me.c.f5951p;
                    textView.setText(y.k(str, "{{earliestValidUntil}}", bVar.formatCountdown(context, j6)));
                    cVar.f5958g.postDelayed(this, bVar.nextExpireRefreshDelay(jCurrentTimeMillis));
                    return;
                }
                return;
            case 8:
                ((Handler) this.f14210b).post(new B5.c((LogInActivity) obj, 12));
                return;
            case 9:
                ((Handler) this.f14210b).post(new B5.c((PinSafeWithPatternActivity) obj, 13));
                return;
            case 10:
                Runnable runnable = (Runnable) ((WeakReference) this.f14210b).get();
                Nb.b bVar2 = (Nb.b) ((WeakReference) obj).get();
                if (bVar2 != null) {
                    ReentrantLock reentrantLock = bVar2.f6301d;
                    reentrantLock.lock();
                    try {
                        Nb.b bVar3 = bVar2.f6299b;
                        if (bVar3 != null) {
                            bVar3.f6298a = bVar2.f6298a;
                        }
                        Nb.b bVar4 = bVar2.f6298a;
                        if (bVar4 != null) {
                            bVar4.f6299b = bVar3;
                        }
                        bVar2.f6299b = null;
                        bVar2.f6298a = null;
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                ((Handler) this.f14210b).post(new B5.c((com.flexibank.sdk.cashier.ui.activity.a) obj, i10));
                return;
            case 12:
                Pa.N n10 = (Pa.N) obj;
                n10.d(this.f14210b);
                n10.c();
                return;
            case 13:
                VerifySafePinFragment verifySafePinFragment = (VerifySafePinFragment) obj;
                VerifySafePinFragment verifySafePinFragment2 = (VerifySafePinFragment) this.f14210b;
                if (!verifySafePinFragment2.isAdded() || verifySafePinFragment2.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    if (verifySafePinFragment.f26122o == 1) {
                        Bc.f fVar = verifySafePinFragment.f26121j;
                        if (fVar != null) {
                            ((TextView) fVar.f700f).setText(F8.h.ac_forget_pin);
                        }
                    } else {
                        Bc.f fVar2 = verifySafePinFragment.f26121j;
                        if (fVar2 != null) {
                            ((TextView) fVar2.f700f).setText(F8.h.ac_forget_psw);
                        }
                    }
                    Bc.f fVar3 = verifySafePinFragment.f26121j;
                    if (fVar3 != null) {
                        ((TextView) fVar3.f700f).setOnClickListener(verifySafePinFragment);
                    }
                    VerifySafePinFragment.B(verifySafePinFragment);
                    Bc.f fVar4 = verifySafePinFragment.f26121j;
                    if (fVar4 != null) {
                        p220oa.h.s((ViewStub) fVar4.f696b, true);
                        View viewFindViewById = verifySafePinFragment.f27318b.findViewById(p025ba.e.number_keyboard_content);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout");
                        ((KeyboardGridLayout) viewFindViewById).setNumKeyboardClickListener(verifySafePinFragment);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 14:
                BaseAddGuardianFragment baseAddGuardianFragment = (BaseAddGuardianFragment) this.f14210b;
                if (!baseAddGuardianFragment.isAdded() || baseAddGuardianFragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    ViewStub viewStubT = ((BaseAddGuardianFragment) obj).t();
                    if (viewStubT != null) {
                        viewStubT.inflate();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 15:
                IdentityVerificationStep0Fragment identityVerificationStep0Fragment = (IdentityVerificationStep0Fragment) this.f14210b;
                if (!identityVerificationStep0Fragment.isAdded() || identityVerificationStep0Fragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    long jP = com.transsnet.palmpay.core.config.d.p();
                    if (jP > 0 && (mVar = (I8.m) ((IdentityVerificationStep0Fragment) obj).f27335j) != null) {
                        ((PpButton) mVar.f4151b.f755c).c(jP);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 16:
                IdentityVerificationStep1Fragment identityVerificationStep1Fragment = (IdentityVerificationStep1Fragment) this.f14210b;
                if (!identityVerificationStep1Fragment.isAdded() || identityVerificationStep1Fragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    int i13 = IdentityVerificationStep1Fragment.f26173w;
                    ((IdentityVerificationStep1Fragment) obj).x();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 17:
                IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment = (IdentityVerificationStepFace2Fragment) this.f14210b;
                if (!identityVerificationStepFace2Fragment.isAdded() || identityVerificationStepFace2Fragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    long jP2 = com.transsnet.palmpay.core.config.d.p();
                    if (jP2 > 0 && (rVar = (I8.r) ((IdentityVerificationStepFace2Fragment) obj).f27335j) != null) {
                        ((PpButton) rVar.f4201b.f755c).c(jP2);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 18:
                IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = (IdentityVerificationUserProfileFragment) this.f14210b;
                if (!identityVerificationUserProfileFragment.isAdded() || identityVerificationUserProfileFragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    int i14 = IdentityVerificationUserProfileFragment.f26181L;
                    t tVar = (t) ((IdentityVerificationUserProfileFragment) obj).f27335j;
                    if (tVar != null) {
                        p220oa.h.s(tVar.f4213b, true);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 19:
                C c6 = C.c();
                int i15 = W0.a.f10347e;
                androidx.work.impl.model.k kVar = (androidx.work.impl.model.k) this.f14210b;
                c6.getClass();
                ((W0.a) obj).f10348a.schedule(kVar);
                return;
            case 20:
                LogInConfirmPinFragment logInConfirmPinFragment = (LogInConfirmPinFragment) this.f14210b;
                if (!logInConfirmPinFragment.isAdded() || logInConfirmPinFragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    C0108e c0108e = ((LogInConfirmPinFragment) obj).t;
                    if (c0108e != null) {
                        ((PinEntryView) c0108e.f691i).c();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 21:
                LogInInputMobileFragment logInInputMobileFragment = (LogInInputMobileFragment) obj;
                LogInInputMobileFragment logInInputMobileFragment2 = (LogInInputMobileFragment) this.f14210b;
                if (!logInInputMobileFragment2.isAdded() || logInInputMobileFragment2.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    Bc.q qVar5 = logInInputMobileFragment.f26201w;
                    if (qVar5 != null) {
                        ((AppCompatImageView) qVar5.f815b).setImageResource(r.cv_palmpay_text_and_logo_purple);
                    }
                    Bc.q qVar6 = logInInputMobileFragment.f26201w;
                    if (qVar6 != null) {
                        p220oa.h.A((AppCompatImageView) qVar6.f815b, true, p025ba.a.core_anim_fade_in);
                    }
                    Bc.q qVar7 = logInInputMobileFragment.f26201w;
                    if (qVar7 != null) {
                        p220oa.h.A((AppCompatImageView) qVar7.f819f, true, p025ba.a.core_anim_fade_in);
                    }
                    LogInInputMobileFragment.u(logInInputMobileFragment);
                    Bc.q qVar8 = logInInputMobileFragment.f26201w;
                    if (qVar8 != null) {
                        ((ViewStub) qVar8.f817d).inflate();
                    }
                    if (logInInputMobileFragment.f26195A) {
                        logInInputMobileFragment.f26195A = false;
                        LogInActivity logInActivityW = logInInputMobileFragment.w();
                        if (logInActivityW != null && (preCheckPhoneRsp = logInActivityW.t) != null) {
                            logInInputMobileFragment.y(preCheckPhoneRsp);
                        }
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 22:
                ((CancellableContinuation) obj).resumeUndispatched((U) this.f14210b, Unit.f38893a);
                return;
            case 23:
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = (BillPaymentElectricityHomeFragment) obj;
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment2 = (BillPaymentElectricityHomeFragment) this.f14210b;
                if (!billPaymentElectricityHomeFragment2.isAdded() || billPaymentElectricityHomeFragment2.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    if (i0.W(billPaymentElectricityHomeFragment.getActivity())) {
                        f0 f0Var = (f0) billPaymentElectricityHomeFragment.f27335j;
                        if (f0Var != null) {
                            f0Var.f8281A.a("16", new m0(billPaymentElectricityHomeFragment, i12));
                        }
                        ModelBillQuickAccessItem modelBillQuickAccessItem = (ModelBillQuickAccessItem) billPaymentElectricityHomeFragment.f27318b.findViewById(Pd.c.model_quick_access_item_native);
                        if (modelBillQuickAccessItem != null) {
                            p220oa.h.s(modelBillQuickAccessItem, true);
                        }
                        if (modelBillQuickAccessItem != null) {
                            modelBillQuickAccessItem.b("16", billPaymentElectricityHomeFragment.m());
                        }
                        f0 f0Var2 = (f0) billPaymentElectricityHomeFragment.f27335j;
                        if (f0Var2 != null) {
                            ModelAvailablePointItem modelAvailablePointItem = f0Var2.f8302v;
                            boolean zM = billPaymentElectricityHomeFragment.m();
                            modelAvailablePointItem.f28261g = "16";
                            modelAvailablePointItem.f28259e = zM;
                            modelAvailablePointItem.b();
                        }
                        ViewBinding viewBinding = billPaymentElectricityHomeFragment.f27335j;
                        f0 f0Var3 = (f0) viewBinding;
                        if ((f0Var3 != null ? f0Var3.f8290Z : null) != null) {
                            f0 f0Var4 = (f0) viewBinding;
                            viewInflate = f0Var4 != null ? f0Var4.f8290Z.inflate() : null;
                            Intrinsics.f(viewInflate, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem");
                            billPaymentElectricityHomeFragment.f34276w0 = (ModelAvailableCouponItem) viewInflate;
                            Object obj2 = p070ee.b.f36288a;
                            String strB = p070ee.b.b(billPaymentElectricityHomeFragment.f34258C);
                            if (Intrinsics.c(billPaymentElectricityHomeFragment.f34258C, "1") && (modelAvailableCouponItem = billPaymentElectricityHomeFragment.f34276w0) != null) {
                                modelAvailableCouponItem.setTransType(strB);
                            }
                        }
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 24:
                BillPaymentTvHomeFragment billPaymentTvHomeFragment = (BillPaymentTvHomeFragment) obj;
                BillPaymentTvHomeFragment billPaymentTvHomeFragment2 = (BillPaymentTvHomeFragment) this.f14210b;
                if (!billPaymentTvHomeFragment2.isAdded() || billPaymentTvHomeFragment2.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    if (i0.W(billPaymentTvHomeFragment.getActivity())) {
                        if (BaseApplication.hasLogin()) {
                            BillQuickAccessDataViewModel billQuickAccessDataViewModel = (BillQuickAccessDataViewModel) billPaymentTvHomeFragment.f34299H.getValue();
                            billQuickAccessDataViewModel.getClass();
                            Intrinsics.checkNotNullParameter("17", "transType");
                            AbstractC0780y.m(V.h(billQuickAccessDataViewModel), null, null, new F0(billQuickAccessDataViewModel.f34417e, G.o("Pref_payBillsQuickAccessList_17_", BaseApplication.getCountryLocale()), null), 3);
                        }
                        g0 g0Var = (g0) billPaymentTvHomeFragment.f27335j;
                        if (g0Var != null) {
                            g0Var.f8307A.a("17", new m0(billPaymentTvHomeFragment, i7));
                        }
                        g0 g0Var2 = (g0) billPaymentTvHomeFragment.f27335j;
                        if (g0Var2 != null) {
                            ModelAvailablePointItem modelAvailablePointItem2 = g0Var2.t;
                            boolean zM2 = billPaymentTvHomeFragment.m();
                            modelAvailablePointItem2.f28261g = "17";
                            modelAvailablePointItem2.f28259e = zM2;
                            modelAvailablePointItem2.b();
                        }
                        HashMap map = new HashMap();
                        Object obj3 = p070ee.b.f36288a;
                        map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, p070ee.b.b(billPaymentTvHomeFragment.f34300L));
                        AutoTrackUtil.trackActivityProperties(billPaymentTvHomeFragment.requireActivity(), map);
                        InterstitialAdView interstitialAdViewJ = org.chromium.support_lib_boundary.util.b.j(billPaymentTvHomeFragment.getString(p025ba.k.tv_home_page_pop_slot_id));
                        if (interstitialAdViewJ != null) {
                            InterstitialAdView.show$default(interstitialAdViewJ, billPaymentTvHomeFragment.requireActivity(), null, 2, null);
                        }
                        g0 g0Var3 = (g0) billPaymentTvHomeFragment.f27335j;
                        if (g0Var3 != null) {
                            g0Var3.f8309C.setSlotId(billPaymentTvHomeFragment.getString(Vd.a.qt_ad_tv_pocker_banner_slot_id));
                        }
                        g0 g0Var4 = (g0) billPaymentTvHomeFragment.f27335j;
                        org.chromium.support_lib_boundary.util.b.d(g0Var4 != null ? g0Var4.f8309C : null, Boolean.TRUE);
                        ViewBinding viewBinding2 = billPaymentTvHomeFragment.f27335j;
                        g0 g0Var5 = (g0) viewBinding2;
                        if ((g0Var5 != null ? g0Var5.f8308B : null) != null) {
                            g0 g0Var6 = (g0) viewBinding2;
                            viewInflate = g0Var6 != null ? g0Var6.f8308B.inflate() : null;
                            Intrinsics.f(viewInflate, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem");
                            ModelAvailableCouponItem modelAvailableCouponItem2 = (ModelAvailableCouponItem) viewInflate;
                            billPaymentTvHomeFragment.f34305Z = modelAvailableCouponItem2;
                            modelAvailableCouponItem2.setTransType("17");
                        }
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                a();
                return;
            case 26:
                SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment = (SignUpStepInputPinV2Fragment) this.f14210b;
                if (!signUpStepInputPinV2Fragment.isAdded() || signUpStepInputPinV2Fragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    D d2 = ((SignUpStepInputPinV2Fragment) obj).f26274j;
                    if (d2 != null) {
                        ((PinEntryView) d2.f627w).c();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 27:
                break;
            case 28:
                b();
                return;
            default:
                Y.h hVar = (Y.h) ((p1.c) this.f14210b).f41176b;
                if (hVar != null) {
                    hVar.onFontRetrieved((Typeface) obj);
                    return;
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f14210b).run();
            } catch (Throwable th2) {
                AbstractC0776u.a(kotlin.coroutines.f.f38943a, th2);
            }
            p015ag.g gVar2 = (p015ag.g) obj;
            Runnable runnableE = gVar2.e();
            if (runnableE == null) {
                return;
            }
            this.f14210b = runnableE;
            i11++;
            if (i11 >= 16 && p015ag.a.i(gVar2.f11942d, gVar2)) {
                p015ag.a.h(gVar2.f11942d, gVar2, this);
                return;
            }
        }
    }

    public String toString() {
        switch (this.f14209a) {
            case 0:
                return i.class.getSimpleName() + "," + ((FutureCallback) this.f14211c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(Object obj, int i7, Object obj2, boolean z3) {
        this.f14209a = i7;
        this.f14211c = obj;
        this.f14210b = obj2;
    }
}
