package N8;

import Ad.C0058e;
import C0.C0119k;
import Pa.AbstractC0514k;
import Pa.C0515l;
import Pa.r0;
import Ua.E0;
import W9.C0726g;
import Xd.C0787f;
import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankAccountOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckUbaBankAccountOTPFragment;
import com.flexibank.sdk.core.viewmodel.FlexiBankOneTimeCodeView;
import com.google.api.Service;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.picker.picker.HoursMinutesPickerView;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUp3Activity;
import com.transsnet.palmpay.account.ui.activity.SetNewPinV2Activity;
import com.transsnet.palmpay.account.ui.activity.SetNewPswActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianRelationShipFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveActivationSuccessFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveReviewPendingFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationConfirmBvnFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStepFace2Fragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInConfirmPinFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithFaceFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithRiskControlSmsFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithSmsFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.contacts.ui.activity.FindInviteFriendsActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CountryCode;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.ui.widget.BrowseCountdownView;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: N8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0463g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6214b;

    public /* synthetic */ C0463g(Object obj, int i7) {
        this.f6213a = i7;
        this.f6214b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0466  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0.P pF;
        androidx.fragment.app.Z childFragmentManager;
        List listF;
        androidx.fragment.app.Z childFragmentManager2;
        List listF2;
        C0.P pF2;
        androidx.fragment.app.Z supportFragmentManager;
        ActivityWebView activityWebView;
        ActivityWebView activityWebView2;
        ActivityWebView activityWebView3;
        C0119k c0119k;
        C0.K k2;
        androidx.fragment.app.Z childFragmentManager3;
        List listF3;
        FlexiBankOneTimeCodeView flexiBankOneTimeCodeView;
        PpButton ppButton;
        PpButton ppButton2;
        Bc.l lVar;
        PpButton ppButton3;
        CountryCode.CountriesBean countriesBeanA;
        PpFormVertical ppFormVertical;
        LogInReq logInReq;
        LogInReq logInReq2;
        AppCompatEditText editText;
        PpAmountEditText ppAmountEditText;
        ModelNumberInputLayout modelNumberInputLayout;
        AppCompatAutoCompleteTextView numberEdit;
        String url = null;
        Object obj2 = null;
        url = null;
        Object obj3 = this.f6214b;
        switch (this.f6213a) {
            case 0:
                androidx.activity.z addCallback = (androidx.activity.z) obj;
                int i7 = GuardianApproveActivity.f25858e;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                GuardianApproveActivity guardianApproveActivity = (GuardianApproveActivity) obj3;
                F6.d.h("GuardianApproveActivity", 3, com.horcrux.svg.d0.q("addOnBackPressedCallback: ", guardianApproveActivity.isTaskRoot()));
                NavHostFragment navHostFragment = guardianApproveActivity.f25859c;
                Object obj4 = (navHostFragment == null || (childFragmentManager = navHostFragment.getChildFragmentManager()) == null || (listF = childFragmentManager.f17069c.f()) == null) ? null : (Fragment) CollectionsKt.G(0, listF);
                if ((obj4 instanceof GuardianApproveActivationSuccessFragment) || (obj4 instanceof GuardianApproveReviewPendingFragment)) {
                    Pa.i0.H(null);
                    guardianApproveActivity.finish();
                    return Unit.f38893a;
                }
                if ((obj4 instanceof CustomActionCallback) && ((CustomActionCallback) obj4).goBack(null)) {
                    return Unit.f38893a;
                }
                NavHostFragment navHostFragment2 = guardianApproveActivity.f25859c;
                if (navHostFragment2 == null || (pF = navHostFragment2.f()) == null || !pF.j()) {
                    guardianApproveActivity.setResult(0);
                    Pa.i0.H(null);
                    guardianApproveActivity.finish();
                }
                return Unit.f38893a;
            case 1:
                androidx.activity.z addCallback2 = (androidx.activity.z) obj;
                int i10 = IdentityVerificationActivity.f25861A;
                Intrinsics.checkNotNullParameter(addCallback2, "$this$addCallback");
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) obj3;
                NavHostFragment navHostFragment3 = identityVerificationActivity.f25871o;
                Object obj5 = (navHostFragment3 == null || (childFragmentManager2 = navHostFragment3.getChildFragmentManager()) == null || (listF2 = childFragmentManager2.f17069c.f()) == null) ? null : (Fragment) listF2.get(0);
                if ((obj5 instanceof CustomActionCallback) && ((CustomActionCallback) obj5).goBack(null)) {
                    return Unit.f38893a;
                }
                if (Intrinsics.c(identityVerificationActivity.f25866e, "FROM_REGISITER_PAGE")) {
                    identityVerificationActivity.o();
                    return Unit.f38893a;
                }
                C0.P p3 = identityVerificationActivity.f25872p;
                if (p3 != null && !p3.j()) {
                    identityVerificationActivity.finish();
                }
                return Unit.f38893a;
            case 2:
                androidx.activity.z addCallback3 = (androidx.activity.z) obj;
                int i11 = LogInActivity.f25877p0;
                Intrinsics.checkNotNullParameter(addCallback3, "$this$addCallback");
                LogInActivity logInActivity = (LogInActivity) obj3;
                Fragment fragmentO = logInActivity.o();
                if (fragmentO == null) {
                    logInActivity.finish();
                    return Unit.f38893a;
                }
                if (fragmentO instanceof LogInWithSmsFragment) {
                    LogInWithSmsFragment logInWithSmsFragment = (LogInWithSmsFragment) fragmentO;
                    if (!logInWithSmsFragment.f26225j) {
                        logInWithSmsFragment.f26225j = true;
                        Pa.n0.g().v("LoginOtpRetentionPopup");
                        Bc.i iVar = logInWithSmsFragment.f26223A;
                        if (iVar != null) {
                            ((OneTimeCodeV5View) iVar.f725c).h();
                        }
                        KeyboardUtils.hideSoftInput(logInWithSmsFragment.getActivity());
                        Context context = logInWithSmsFragment.getContext();
                        if (context != null) {
                            io.fastkv.n.O(context, 2, Integer.valueOf(F8.h.ac_otp_may_be_delayed), null, Integer.valueOf(F8.c.ac_quit_icon_2), null, null, logInWithSmsFragment.getString(F8.h.ac_confirm_quit_otp), Integer.valueOf(F8.h.ac_wait_for_otp), null, new W8.n(logInWithSmsFragment, 3), Integer.valueOf(F8.h.ac_cancel), null, new W8.n(logInWithSmsFragment, 4), null, true, 0, 8311412);
                        }
                        return Unit.f38893a;
                    }
                }
                boolean z3 = fragmentO instanceof LogInWithFaceFragment;
                if (z3) {
                    LogInWithFaceFragment logInWithFaceFragment = (LogInWithFaceFragment) fragmentO;
                    if (!logInWithFaceFragment.f26211v) {
                        androidx.fragment.app.E activity = logInWithFaceFragment.getActivity();
                        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                            supportFragmentManager.S();
                        }
                        return Unit.f38893a;
                    }
                }
                if ((fragmentO instanceof LogInInputMobileFragment) || (fragmentO instanceof LogInWithRiskControlSmsFragment) || z3) {
                    NavHostFragment navHostFragment4 = logInActivity.f25886Y;
                    if (navHostFragment4 != null && (pF2 = navHostFragment4.f()) != null) {
                        pF2.j();
                    }
                    if ("preinstall_go".equalsIgnoreCase(BaseApplication.getChannel())) {
                        ActivityUtils.finishAllActivities(0, p025ba.a.core_anim_slide_bottom_out);
                    } else if (ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.account.ui.activity.WelcomeActivity") != null || "HttpClient".equals(logInActivity.f25885X)) {
                        Pa.i0.H(null);
                    } else if (ActivityUtils.getActivityList().size() == 1 || logInActivity.isTaskRoot()) {
                        Pa.i0.H("FROM_LOGIN_PAGE");
                    } else {
                        Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.SplashActivity");
                        if (activityIsActivityExistsInStack != null) {
                            activityIsActivityExistsInStack.finish();
                        }
                        logInActivity.finish();
                    }
                } else {
                    logInActivity.getSupportFragmentManager().S();
                }
                return Unit.f38893a;
            case 3:
                androidx.activity.z addCallback4 = (androidx.activity.z) obj;
                int i12 = PalmPayLevelUp3Activity.f25901v;
                Intrinsics.checkNotNullParameter(addCallback4, "$this$addCallback");
                PalmPayLevelUp3Activity palmPayLevelUp3Activity = (PalmPayLevelUp3Activity) obj3;
                if (!Pa.i0.W(palmPayLevelUp3Activity)) {
                    return Unit.f38893a;
                }
                Bc.l lVar2 = palmPayLevelUp3Activity.t;
                if ((lVar2 != null ? (ActivityWebView) lVar2.f755c : null) != null && lVar2 != null && (activityWebView = (ActivityWebView) lVar2.f755c) != null && activityWebView.canGoBack()) {
                    Bc.l lVar3 = palmPayLevelUp3Activity.t;
                    if (lVar3 != null && (activityWebView3 = (ActivityWebView) lVar3.f755c) != null) {
                        url = activityWebView3.getUrl();
                    }
                    if (!"file:///android_asset/network_error.html".equals(url)) {
                        Bc.l lVar4 = palmPayLevelUp3Activity.t;
                        if (lVar4 != null && (activityWebView2 = (ActivityWebView) lVar4.f755c) != null) {
                            activityWebView2.goBack();
                        }
                        return Unit.f38893a;
                    }
                }
                palmPayLevelUp3Activity.finish();
                if (!TextUtils.isEmpty(palmPayLevelUp3Activity.getIntent().getStringExtra("applyId"))) {
                    F6.d.h(palmPayLevelUp3Activity.TAG, 3, "bvn close >>>");
                    org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_ROUTER_EXIT, palmPayLevelUp3Activity.f25910j));
                }
                return Unit.f38893a;
            case 4:
                int i13 = SetNewPinV2Activity.f25976v;
                ActivityUtils.finishAllActivitiesExceptNewest();
                SetNewPinV2Activity setNewPinV2Activity = (SetNewPinV2Activity) obj3;
                SignUpRsp signUpRsp = setNewPinV2Activity.f25984j;
                if (signUpRsp == null || TextUtils.isEmpty(signUpRsp.jumpPath)) {
                    ARouter.getInstance().build("/main/home").withBoolean("FROM_LOGIN_PAGE", true).withFlags(32768).navigation(setNewPinV2Activity);
                } else {
                    SignUpRsp signUpRsp2 = setNewPinV2Activity.f25984j;
                    Pa.F.f(signUpRsp2 != null ? signUpRsp2.jumpPath : null, signUpRsp2 != null ? signUpRsp2.jumpType : null, signUpRsp2 != null ? signUpRsp2.jumpParams : null);
                }
                return Unit.f38893a;
            case 5:
                androidx.activity.z addCallback5 = (androidx.activity.z) obj;
                int i14 = SetNewPswActivity.f25987e;
                Intrinsics.checkNotNullParameter(addCallback5, "$this$addCallback");
                ((SetNewPswActivity) obj3).finish();
                return Unit.f38893a;
            case 6:
                androidx.activity.z addCallback6 = (androidx.activity.z) obj;
                SignUpActivity.a aVar = SignUpActivity.f26029C;
                Intrinsics.checkNotNullParameter(addCallback6, "$this$addCallback");
                SignUpActivity signUpActivity = (SignUpActivity) obj3;
                ActivityResultCaller activityResultCallerL = signUpActivity.l();
                if ((activityResultCallerL instanceof CustomActionCallback) && ((CustomActionCallback) activityResultCallerL).goBack(null)) {
                    return Unit.f38893a;
                }
                if (!(activityResultCallerL instanceof SignUpStep1Fragment)) {
                    signUpActivity.getSupportFragmentManager().S();
                    return Unit.f38893a;
                }
                signUpActivity.finish();
                if ("preinstall_go".equalsIgnoreCase(BaseApplication.getChannel())) {
                    ActivityUtils.finishAllActivities(0, p025ba.a.core_anim_slide_bottom_out);
                } else if (ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.account.ui.activity.WelcomeActivity") != null || "HttpClient".equals(signUpActivity.f26039i) || ActivityUtils.getActivityList().size() == 1 || signUpActivity.isTaskRoot()) {
                    signUpActivity.n();
                } else if (ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.SplashActivity") == null || ActivityUtils.getActivityList().size() != 2) {
                    Activity activityIsActivityExistsInStack2 = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.SplashActivity");
                    if (activityIsActivityExistsInStack2 != null) {
                        activityIsActivityExistsInStack2.finish();
                    }
                    signUpActivity.finish();
                } else {
                    signUpActivity.n();
                }
                return Unit.f38893a;
            case 7:
                androidx.activity.z addCallback7 = (androidx.activity.z) obj;
                VerifyAccountActivity.a aVar2 = VerifyAccountActivity.f26062o;
                Intrinsics.checkNotNullParameter(addCallback7, "$this$addCallback");
                VerifyAccountActivity verifyAccountActivity = (VerifyAccountActivity) obj3;
                NavHostFragment navHostFragment5 = verifyAccountActivity.f26067g;
                Object obj6 = (navHostFragment5 == null || (childFragmentManager3 = navHostFragment5.getChildFragmentManager()) == null || (listF3 = childFragmentManager3.f17069c.f()) == null) ? null : (Fragment) listF3.get(0);
                if ((obj6 instanceof CustomActionCallback) && ((CustomActionCallback) obj6).goBack(null)) {
                    return Unit.f38893a;
                }
                C0.P p10 = verifyAccountActivity.f26068i;
                if (p10 != null) {
                    Iterator it = CollectionsKt.R(p10.f1107g).iterator();
                    if (it.hasNext()) {
                        it.next();
                    }
                    for (Object obj7 : Sf.m.a(it)) {
                        if (!(((C0119k) obj7).f1051b instanceof C0.N)) {
                            obj2 = obj7;
                            c0119k = (C0119k) obj2;
                            if (c0119k == null && (k2 = c0119k.f1051b) != null && k2.f961i == F8.d.fragment_verify_account_id_type) {
                                C0.P p11 = verifyAccountActivity.f26068i;
                                if (p11 != null && !p11.j()) {
                                    verifyAccountActivity.finish();
                                }
                            } else {
                                verifyAccountActivity.finish();
                            }
                        }
                    }
                    c0119k = (C0119k) obj2;
                    if (c0119k == null) {
                        verifyAccountActivity.finish();
                    } else {
                        verifyAccountActivity.finish();
                    }
                } else {
                    verifyAccountActivity.finish();
                }
                return Unit.f38893a;
            case 8:
                IconicsDrawable iconicsDrawable = (IconicsDrawable) obj;
                p118hf.a.I(iconicsDrawable, 12);
                D3.a.F(iconicsDrawable, ((BrowseCountdownView) obj3).getContext().getColor(L6.b.ppColorPrimary));
                return Unit.f38893a;
            case 9:
                p006a4.f fVar = (p006a4.f) obj;
                FlexiBankCheckBankAccountOtpFragment.a aVar3 = FlexiBankCheckBankAccountOtpFragment.f22002C;
                a4.f.a data = fVar != null ? fVar.getData() : null;
                if (fVar == null || !fVar.c() || data == null) {
                    ToastUtils.showLong(fVar != null ? fVar.b() : null, new Object[0]);
                } else {
                    ((FlexiBankCheckBankAccountOtpFragment) obj3).f22003A = data.getReference();
                }
                return Unit.f38893a;
            case 10:
                String message = (String) obj;
                FlexiBankCheckPalmPayOtpFragment.a aVar4 = FlexiBankCheckPalmPayOtpFragment.f22023p;
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                x4.i iVar2 = (x4.i) ((FlexiBankCheckPalmPayOtpFragment) obj3).f21944f;
                if (iVar2 != null && (flexiBankOneTimeCodeView = iVar2.f43616c) != null) {
                    flexiBankOneTimeCodeView.setSendOtcButtonState(true);
                }
                return Unit.f38893a;
            case 11:
                W3.f fVar2 = (W3.f) obj;
                FlexiBankCheckUbaBankAccountOTPFragment.a aVar5 = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                if (fVar2 == null || !fVar2.c()) {
                    ToastUtils.showLong(fVar2 != null ? fVar2.b() : null, new Object[0]);
                } else {
                    FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragment = (FlexiBankCheckUbaBankAccountOTPFragment) obj3;
                    flexiBankCheckUbaBankAccountOTPFragment.getClass();
                    Gb.L l5 = new Gb.L(flexiBankCheckUbaBankAccountOTPFragment, 6);
                    flexiBankCheckUbaBankAccountOTPFragment.f22032v = l5;
                    l5.start();
                }
                return Unit.f38893a;
            case 12:
                String errorMsg = (String) obj;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                p220oa.h.y((AddGuardianRelationShipFragment) obj3, errorMsg);
                return Unit.f38893a;
            case 13:
                E0 e10 = (E0) obj3;
                String str = (String) e10.f9328r.get(((Integer) obj).intValue());
                if (!Intrinsics.c(str, e10.f9325o)) {
                    e10.f(str);
                    e10.g((String) CollectionsKt.F(e10.i(str)));
                }
                return Unit.f38893a;
            case 14:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                I8.q qVar = (I8.q) ((IdentityVerificationConfirmBvnFragment) obj3).f27335j;
                if (qVar != null && (ppButton = qVar.f4190d) != null) {
                    ppButton.b(false);
                }
                ToastUtils.showLong(it2, new Object[0]);
                return Unit.f38893a;
            case 15:
                String error = (String) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                I8.o oVar = (I8.o) ((IdentityVerificationStep2Fragment) obj3).f27335j;
                if (oVar != null && (ppButton2 = oVar.f4172g) != null) {
                    ppButton2.b(false);
                }
                ToastUtils.showLong(error, new Object[0]);
                return Unit.f38893a;
            case 16:
                String it3 = (String) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                I8.r rVar = (I8.r) ((IdentityVerificationStepFace2Fragment) obj3).f27335j;
                if (rVar != null && (lVar = rVar.f4201b) != null && (ppButton3 = (PpButton) lVar.f755c) != null) {
                    ppButton3.b(false);
                }
                ToastUtils.showLong(it3, new Object[0]);
                return Unit.f38893a;
            case 17:
                List list = (List) obj;
                FindInviteFriendsActivity findInviteFriendsActivity = (FindInviteFriendsActivity) obj3;
                C0726g c0726g = findInviteFriendsActivity.f27213c;
                if (c0726g != null) {
                    c0726g.b();
                }
                C0726g c0726g2 = findInviteFriendsActivity.f27213c;
                if (c0726g2 != null) {
                    c0726g2.a(list);
                }
                return Unit.f38893a;
            case 18:
                IconicsDrawable apply = (IconicsDrawable) obj;
                int i15 = LogInConfirmPinFragment.f26190v;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 20);
                D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, ((LogInConfirmPinFragment) obj3).requireContext()));
                return Unit.f38893a;
            case 19:
                View it4 = (View) obj;
                int i16 = LogInInputMobileFragment.f26194C;
                Intrinsics.checkNotNullParameter(it4, "it");
                PpFormVertical ppFormVertical2 = (PpFormVertical) it4.findViewById(F8.d.inputMobile);
                LogInInputMobileFragment logInInputMobileFragment = (LogInInputMobileFragment) obj3;
                logInInputMobileFragment.f26200v = ppFormVertical2;
                if (ppFormVertical2 != null) {
                    ppFormVertical2.setInputFilters(new InputFilter[]{new Tb.c(50, 0), new Tb.b(" ￥[]*{}【】\n")});
                }
                PpFormVertical ppFormVertical3 = logInInputMobileFragment.f26200v;
                if (ppFormVertical3 != null && (editText = ppFormVertical3.getEditText()) != null) {
                    editText.setTextSize(22.0f);
                }
                PpFormVertical ppFormVertical4 = logInInputMobileFragment.f26200v;
                if (ppFormVertical4 != null) {
                    ppFormVertical4.setHintText(p220oa.h.B("Please enter Phone Number/Email", logInInputMobileFragment.getContext(), null, null, 16, null, null, 1014));
                }
                PpFormVertical ppFormVertical5 = logInInputMobileFragment.f26200v;
                if (ppFormVertical5 != null) {
                    ppFormVertical5.setEditTextWatcher(new R3.e(logInInputMobileFragment, 10));
                }
                String strG = p367ya.a.d().g();
                if (TextUtils.isEmpty(strG)) {
                    Intrinsics.e(strG);
                } else {
                    C0515l c0515l = AbstractC0514k.f7097a;
                    c0515l.getClass();
                    String strG2 = p367ya.a.d().g();
                    String str2 = (TextUtils.isEmpty(strG2) || (countriesBeanA = c0515l.a(Integer.parseInt(r0.J(strG2)))) == null) ? null : countriesBeanA.locale;
                    String string = p367ya.a.d().f44149a.getString("key_default_language", null);
                    if (TextUtils.isEmpty(str2) || !kotlin.text.y.h(str2, string, true)) {
                        strG = "";
                    } else {
                        Intrinsics.e(strG);
                    }
                }
                LogInActivity logInActivityW = logInInputMobileFragment.w();
                String str3 = (logInActivityW == null || (logInReq2 = logInActivityW.f25888b) == null) ? null : logInReq2.loginName;
                LogInActivity logInActivityW2 = logInInputMobileFragment.w();
                String str4 = (logInActivityW2 == null || (logInReq = logInActivityW2.f25888b) == null) ? null : logInReq.mobileNo;
                String strH = p059e1.a.H("account_sp_last_login_accountno");
                if (!TextUtils.isEmpty(str3) && !kotlin.text.y.h(str3, str4, false)) {
                    PpFormVertical ppFormVertical6 = logInInputMobileFragment.f26200v;
                    if (ppFormVertical6 != null) {
                        ppFormVertical6.setEditContent(str3);
                    }
                } else if (TextUtils.isEmpty(str4)) {
                    LogInActivity logInActivityW3 = logInInputMobileFragment.w();
                    if (!TextUtils.isEmpty(logInActivityW3 != null ? logInActivityW3.f25880C : null)) {
                        PpFormVertical ppFormVertical7 = logInInputMobileFragment.f26200v;
                        if (ppFormVertical7 != null) {
                            LogInActivity logInActivityW4 = logInInputMobileFragment.w();
                            ppFormVertical7.setEditContent(r0.w0(logInActivityW4 != null ? logInActivityW4.f25880C : null));
                        }
                    } else if (!TextUtils.isEmpty(strH)) {
                        PpFormVertical ppFormVertical8 = logInInputMobileFragment.f26200v;
                        if (ppFormVertical8 != null) {
                            ppFormVertical8.setEditContent(strH);
                        }
                    } else if (!TextUtils.isEmpty(strG) && (ppFormVertical = logInInputMobileFragment.f26200v) != null) {
                        ppFormVertical.setEditContent(r0.w0(strG));
                    }
                } else {
                    PpFormVertical ppFormVertical9 = logInInputMobileFragment.f26200v;
                    if (ppFormVertical9 != null) {
                        ppFormVertical9.setEditContent(r0.w0(str4));
                    }
                }
                PpFormVertical ppFormVertical10 = logInInputMobileFragment.f26200v;
                if (ppFormVertical10 != null) {
                    Intrinsics.checkNotNullParameter(ppFormVertical10, "<this>");
                    Object systemService = ppFormVertical10.getContext().getSystemService("input_method");
                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ppFormVertical10.requestFocus();
                    ((InputMethodManager) systemService).showSoftInput(ppFormVertical10, 0);
                }
                return Unit.f38893a;
            case 20:
                androidx.activity.z addCallback8 = (androidx.activity.z) obj;
                int i17 = BillerTransactionResultActivity.f34181Y;
                Intrinsics.checkNotNullParameter(addCallback8, "$this$addCallback");
                BillerTransactionResultActivity billerTransactionResultActivity = (BillerTransactionResultActivity) obj3;
                billerTransactionResultActivity.o("BackServicePage");
                billerTransactionResultActivity.n();
                billerTransactionResultActivity.finish();
                return Unit.f38893a;
            case 21:
                androidx.activity.z addCallback9 = (androidx.activity.z) obj;
                int i18 = JambHomeActivity.f34222B;
                Intrinsics.checkNotNullParameter(addCallback9, "$this$addCallback");
                ((JambHomeActivity) obj3).goBackToHome();
                return Unit.f38893a;
            case 22:
                androidx.activity.z addCallback10 = (androidx.activity.z) obj;
                int i19 = WaecHomeActivity.f34237Q;
                Intrinsics.checkNotNullParameter(addCallback10, "$this$addCallback");
                ((WaecHomeActivity) obj3).goBackToHome();
                return Unit.f38893a;
            case 23:
                ((Integer) obj).getClass();
                return ((HoursMinutesPickerView) obj3).f24485w;
            case 24:
                ((Integer) obj).getClass();
                return TimePickerView.h((TimePickerView) obj3);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Integer num = (Integer) obj;
                num.getClass();
                X6.r rVar2 = (X6.r) obj3;
                C0058e c0058e = rVar2.f11048d;
                if (c0058e != null) {
                    c0058e.invoke(num);
                }
                rVar2.dismiss();
                return Unit.f38893a;
            case 26:
                IconicsDrawable apply2 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply2, "$this$apply");
                p118hf.a.I(apply2, 16);
                D3.a.F(apply2, CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, ((C0787f) obj3).getContext()));
                return Unit.f38893a;
            case 27:
                ((BaseBillerFragment) obj3).v();
                return Unit.f38893a;
            case 28:
                int i20 = BaseBillerHistoryFragment.f34252v;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                BaseBillerHistoryFragment baseBillerHistoryFragment = (BaseBillerHistoryFragment) obj3;
                baseBillerHistoryFragment.u().getLoadMoreModule().h();
                Rd.e0 e0Var = (Rd.e0) baseBillerHistoryFragment.f27335j;
                if (e0Var != null) {
                    e0Var.f8267d.setRefreshing(false);
                }
                return Unit.f38893a;
            default:
                ((Integer) obj).intValue();
                int i21 = BillPaymentElectricityHomeFragment.f34255z0;
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = (BillPaymentElectricityHomeFragment) obj3;
                Rd.f0 f0Var = (Rd.f0) billPaymentElectricityHomeFragment.f27335j;
                if (f0Var != null && (modelNumberInputLayout = f0Var.f8303w) != null && (numberEdit = modelNumberInputLayout.getNumberEdit()) != null) {
                    numberEdit.clearFocus();
                }
                Rd.f0 f0Var2 = (Rd.f0) billPaymentElectricityHomeFragment.f27335j;
                if (f0Var2 != null && (ppAmountEditText = f0Var2.f8297g) != null) {
                    ppAmountEditText.clearFocus();
                }
                return Unit.f38893a;
        }
    }
}
