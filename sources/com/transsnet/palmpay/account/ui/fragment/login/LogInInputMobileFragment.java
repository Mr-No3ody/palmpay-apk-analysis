package com.transsnet.palmpay.account.ui.fragment.login;

import Bc.C0107d;
import Bc.q;
import C0.AbstractC0130w;
import C0.G;
import C9.C0142i;
import Ce.H;
import F8.e;
import L6.b;
import N8.C0463g;
import Oc.j;
import Pa.D;
import Pa.b0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import W8.c;
import W8.f;
import Wf.AbstractC0780y;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.dialog.SignUpPermissionDialog;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.RegexUtils;
import io.fastkv.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p051d9.C1623u;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInInputMobileFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/u;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogInInputMobileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogInInputMobileFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/login/LogInInputMobileFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 CharSequence.kt\nandroidx/core/text/CharSequenceKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n587#2,6:624\n629#2,11:630\n694#2,50:643\n694#2,50:693\n694#2,50:743\n694#2,50:793\n28#3:641\n1#4:642\n*S KotlinDebug\n*F\n+ 1 LogInInputMobileFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/login/LogInInputMobileFragment\n*L\n103#1:624,6\n167#1:630,11\n435#1:643,50\n445#1:693,50\n461#1:743,50\n567#1:793,50\n256#1:641\n*E\n"})
public final class LogInInputMobileFragment extends BaseMVPFragment<C1623u> implements LoginContract.View, IAutoTrack {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f26194C = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SignUpPermissionDialog f26197j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26198o;
    public AbstractC0130w t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PpFormVertical f26200v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f26201w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26199p = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f26195A = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f26196B = C2131j.b(new b0(24));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LogInInputMobileFragment newInstance() {
            LogInInputMobileFragment logInInputMobileFragment = new LogInInputMobileFragment();
            logInInputMobileFragment.setArguments(new Bundle());
            return logInInputMobileFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static final void u(LogInInputMobileFragment logInInputMobileFragment) {
        View viewFindViewById;
        q qVar;
        if (d.t() && ActivityManager.isUserAMonkey() && (qVar = logInInputMobileFragment.f26201w) != null) {
            h.s((IconicsImageView) ((C0107d) qVar.f823o).f682d, false);
        }
        q qVar2 = logInInputMobileFragment.f26201w;
        if (qVar2 != null) {
            ((PpButton) qVar2.f821i).setOnClickListener(new c(logInInputMobileFragment, 3));
        }
        View view = logInInputMobileFragment.f27318b;
        if (view != null && (viewFindViewById = view.findViewById(F8.d.tvSignUp)) != null) {
            viewFindViewById.setOnClickListener(new c(logInInputMobileFragment, 4));
        }
        q qVar3 = logInInputMobileFragment.f26201w;
        if (qVar3 != null) {
            ((IconicsImageView) ((C0107d) qVar3.f823o).f681c).setOnClickListener(new c(logInInputMobileFragment, 5));
        }
        q qVar4 = logInInputMobileFragment.f26201w;
        if (qVar4 != null) {
            ((IconicsImageView) ((C0107d) qVar4.f823o).f682d).setOnClickListener(new W8.d(1));
        }
    }

    public final boolean A() {
        PpButton ppButton;
        PpFormVertical ppFormVertical = this.f26200v;
        String editContent = ppFormVertical != null ? ppFormVertical.getEditContent() : null;
        boolean z3 = false;
        if (!TextUtils.isEmpty(editContent)) {
            int length = editContent != null ? editContent.length() : 0;
            if (!TextUtils.isDigitsOnly(editContent) ? length >= 5 : length > 0) {
                z3 = true;
            }
        }
        q qVar = this.f26201w;
        if (qVar != null && (ppButton = (PpButton) qVar.f821i) != null) {
            ppButton.setEnabled(z3);
        }
        return z3;
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "LoginHome";
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void handleConfig(QueryUiResourceRsp1 queryUiResourceRsp1) {
        Map<String, String> map;
        if (queryUiResourceRsp1 == null || (map = queryUiResourceRsp1.data) == null) {
            return;
        }
        try {
            if ("false".equalsIgnoreCase(map.get("switchLogInPermissionDialog"))) {
                this.f26198o = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Window window;
        Handler handler = (Handler) this.f26196B.getValue();
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        decorView.post(new H(handler, 12, this, this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_input_mobile, viewGroup, false);
        int i7 = F8.d.bottomViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = F8.d.ivLogo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
            if (appCompatImageView != null) {
                i7 = F8.d.ivTitle1;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                if (appCompatImageView2 != null) {
                    i7 = F8.d.mobileEditViewStub;
                    AsyncViewStub asyncViewStub = (AsyncViewStub) p059e1.a.m(i7, viewInflate);
                    if (asyncViewStub != null) {
                        i7 = F8.d.textViewNext;
                        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                        if (ppButton != null) {
                            i7 = F8.d.tv1;
                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView != null) {
                                i7 = F8.d.tvSignUp;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null && (viewM = p059e1.a.m((i7 = F8.d.viewHeader), viewInflate)) != null) {
                                    q qVar = new q((LinearLayout) viewInflate, viewStub, appCompatImageView, appCompatImageView2, asyncViewStub, ppButton, textView, textView2, C0107d.c(viewM));
                                    this.f26201w = qVar;
                                    return qVar;
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
        super.n();
        C1623u c1623u = (C1623u) this.f27328i;
        if (c1623u != null) {
            c1623u.queryConfig();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.t = NavHostFragment.f17502e.findNavController(this);
        AbstractC0780y.m(V.f(this), null, null, new f(null, this), 3);
        q qVar = this.f26201w;
        if (qVar != null) {
            ((AsyncViewStub) qVar.f820g).b(d.r(), new C0463g(this, 19));
        }
        q qVar2 = this.f26201w;
        if (qVar2 != null) {
            ((PpButton) qVar2.f821i).setEnabled(false);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void onCheckMobileNumberResult(CommonBeanResult commonBeanResult) {
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            if ("CFRONT_800522".equals(commonBeanResult != null ? commonBeanResult.getRespCode() : null)) {
                Context context = getContext();
                if (context != null) {
                    n.O(context, 0, null, "Awaiting Authorization", null, null, null, commonBeanResult != null ? commonBeanResult.getRespMsg() : null, Integer.valueOf(k.core_confirm), null, null, null, null, null, null, false, 0, 8388219);
                    return;
                }
                return;
            }
            Context context2 = getContext();
            if (context2 != null) {
                n.O(context2, 0, Integer.valueOf(k.core_oops), null, null, null, null, commonBeanResult != null ? commonBeanResult.getRespMsg() : null, Integer.valueOf(k.core_confirm), null, null, null, null, null, null, false, 0, 8388221);
                return;
            }
            return;
        }
        PreCheckPhoneRsp preCheckPhoneRsp = (PreCheckPhoneRsp) commonBeanResult.data;
        if (preCheckPhoneRsp != null) {
            if (!preCheckPhoneRsp.memberUser) {
                n0.g().v("LoginNeedRegister");
                Context context3 = getContext();
                if (context3 != null) {
                    String string = getString(F8.h.ac_msg_sign_up_first);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    int i7 = F8.h.ac_sign_up_now;
                    c cVar = new c(this, 2);
                    int i10 = k.core_opps;
                    O6.c cVar2 = new O6.c(context3);
                    cVar2.f6614u = 1;
                    cVar2.e(i10);
                    cVar2.f("");
                    cVar2.f6598d = string;
                    cVar2.d(i7, cVar);
                    cVar2.f6605k = false;
                    cVar2.f6606l = 1;
                    G.v(cVar2, false, false);
                    return;
                }
                return;
            }
            if (!"0".equals(preCheckPhoneRsp.memberStatus)) {
                T data = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                y((PreCheckPhoneRsp) data);
                return;
            }
            if (TextUtils.isEmpty(preCheckPhoneRsp.selfUnfreezeMsg)) {
                Context context4 = getContext();
                if (context4 != null) {
                    String string2 = getString(F8.h.ac_account_abnormal);
                    String string3 = getString(F8.h.ac_msg_account_abnormal);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String string4 = getString(F8.h.ac_contact_us);
                    W8.d dVar = new W8.d(0);
                    int i11 = k.core_cancel;
                    int i12 = k.core_opps;
                    O6.c cVar3 = new O6.c(context4);
                    cVar3.f6614u = 1;
                    cVar3.e(i12);
                    if (string2 != null) {
                        cVar3.f(string2);
                    }
                    cVar3.f6598d = string3;
                    if (string4 != null) {
                        cVar3.f6600f = string4;
                        cVar3.f6602h = dVar;
                    }
                    cVar3.c(i11, null);
                    cVar3.f6605k = true;
                    cVar3.f6606l = 1;
                    G.v(cVar3, false, false);
                    return;
                }
                return;
            }
            Context context5 = getContext();
            if (context5 != null) {
                String string5 = getString(F8.h.ac_secure_login_reminder);
                int i13 = F8.c.ac_icon_secure_login;
                String selfUnfreezeMsg = preCheckPhoneRsp.selfUnfreezeMsg;
                Intrinsics.checkNotNullExpressionValue(selfUnfreezeMsg, "selfUnfreezeMsg");
                String string6 = getString(F8.h.ac_continue);
                j jVar = new j(19, this, commonBeanResult);
                int i14 = k.core_opps;
                O6.c cVar4 = new O6.c(context5);
                cVar4.f6614u = 1;
                cVar4.e(i14);
                if (string5 != null) {
                    cVar4.f(string5);
                }
                cVar4.f6607m = i13;
                cVar4.f6598d = selfUnfreezeMsg;
                if (string6 != null) {
                    cVar4.f6600f = string6;
                    cVar4.f6602h = jVar;
                }
                cVar4.f6605k = true;
                cVar4.f6606l = 1;
                G.v(cVar4, false, false);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PpButton ppButton;
        super.onDestroyView();
        q qVar = this.f26201w;
        if (qVar == null || (ppButton = (PpButton) qVar.f821i) == null) {
            return;
        }
        ppButton.setOnClickListener(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        A();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("bIgnoreMe", this.f26195A);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f26195A = bundle.getBoolean("bIgnoreMe");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3) {
        PpButton ppButton;
        q qVar = this.f26201w;
        if (qVar != null && (ppButton = (PpButton) qVar.f821i) != null) {
            ppButton.b(z3);
        }
        PpFormVertical ppFormVertical = this.f26200v;
        if (ppFormVertical != null) {
            ppFormVertical.setEnabled(!z3);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void showLoadingView(boolean z3) {
        PpButton ppButton;
        q qVar = this.f26201w;
        if (qVar == null || (ppButton = (PpButton) qVar.f821i) == null) {
            return;
        }
        ppButton.b(z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1623u();
    }

    public final void v() {
        this.f26198o = true;
        z();
    }

    public final LogInActivity w() {
        E e10 = this.f27319c;
        if (!(e10 instanceof LogInActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
        return (LogInActivity) e10;
    }

    public final String x() {
        PpFormVertical ppFormVertical = this.f26200v;
        String editContent = ppFormVertical != null ? ppFormVertical.getEditContent() : null;
        if (TextUtils.isEmpty(editContent) || !TextUtils.isDigitsOnly(editContent) || (editContent != null && editContent.length() == 10 && y.m(editContent, "29", false))) {
            return null;
        }
        return PhoneBaseNumberUtils.INSTANCE.getFullMobileNumber(editContent, BaseApplication.getCountryLocale());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    public final void y(PreCheckPhoneRsp preCheckPhoneRsp) {
        String strW0;
        LogInReq logInReq;
        LogInReq logInReq2;
        LogInActivity logInActivityW;
        LogInReq logInReq3;
        LogInReq logInReq4;
        LogInReq logInReq5;
        LogInActivity logInActivityW2;
        LogInReq logInReq6;
        LogInActivity logInActivityW3;
        LogInReq logInReq7;
        LogInReq logInReq8;
        if (!i0.W(getActivity()) || w() == null) {
            return;
        }
        PpFormVertical ppFormVertical = this.f26200v;
        if (ppFormVertical == null || (strW0 = ppFormVertical.getEditContent()) == null) {
            strW0 = r0.w0(preCheckPhoneRsp.phone);
        } else {
            if (TextUtils.isEmpty(strW0)) {
                strW0 = null;
            }
            if (strW0 == null) {
                strW0 = r0.w0(preCheckPhoneRsp.phone);
            }
        }
        if (TextUtils.isEmpty(strW0)) {
            return;
        }
        LogInActivity logInActivityW4 = w();
        if (logInActivityW4 != null) {
            logInActivityW4.t = preCheckPhoneRsp;
        }
        if (w() != null) {
            boolean z3 = preCheckPhoneRsp.canSkipFace;
        }
        if (w() != null) {
            boolean z8 = preCheckPhoneRsp.needFace;
        }
        LogInActivity logInActivityW5 = w();
        if (logInActivityW5 != null) {
            logInActivityW5.f25897o = preCheckPhoneRsp.email;
        }
        String str = preCheckPhoneRsp.phone;
        if (!TextUtils.isEmpty(str)) {
            LogInActivity logInActivityW6 = w();
            if (logInActivityW6 != null) {
                String countryLocale = BaseApplication.getCountryLocale();
                String strW1 = r0.w0(str);
                LogInReq logInReq9 = logInActivityW6.f25888b;
                if (logInReq9 != null) {
                    String str2 = logInReq9.mobileNo;
                    if ((str2 == null || !str2.equals(strW1)) && (logInReq8 = logInActivityW6.f25888b) != null) {
                        logInReq8.faceToken = null;
                    }
                    LogInReq logInReq10 = logInActivityW6.f25888b;
                    if (logInReq10 != null) {
                        logInReq10.mobileNo = strW1;
                    }
                    logInActivityW6.f25890d = strW1;
                    logInActivityW6.f25889c = countryLocale;
                }
            }
            LogInActivity logInActivityW7 = w();
            if (logInActivityW7 != null) {
                logInActivityW7.f25879B = str;
            }
            LogInActivity logInActivityW8 = w();
            if (logInActivityW8 != null && (logInReq7 = logInActivityW8.f25888b) != null) {
                logInReq7.mobileNo = str;
            }
        }
        LogInActivity logInActivityW9 = w();
        if (logInActivityW9 != null) {
            logInActivityW9.f25893g = preCheckPhoneRsp.hasPin;
        }
        LogInActivity logInActivityW10 = w();
        if (logInActivityW10 != null) {
            logInActivityW10.f25898p = preCheckPhoneRsp.headPortrait;
        }
        boolean z10 = preCheckPhoneRsp.isNeedNameVerify() ? false : preCheckPhoneRsp.supplement;
        boolean z11 = (!preCheckPhoneRsp.needOtp || (logInActivityW3 = w()) == null || logInActivityW3.u()) ? false : true;
        boolean z12 = (!preCheckPhoneRsp.isNeedNameVerify() || (logInActivityW2 = w()) == null || (logInReq6 = logInActivityW2.f25888b) == null || logInReq6.isVerifyTokenValid(false)) ? false : true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("_has_pin", preCheckPhoneRsp.hasPin);
        bundle.putBoolean("_identify_verify", z12);
        bundle.putBoolean("_extra_info", preCheckPhoneRsp.isNeedExtraInfo());
        bundle.putBoolean("_need_otp", z11);
        LogInActivity logInActivityW11 = w();
        if (logInActivityW11 != null && (logInReq5 = logInActivityW11.f25888b) != null) {
            logInReq5.loginName = null;
        }
        PpFormVertical ppFormVertical2 = this.f26200v;
        String editContent = ppFormVertical2 != null ? ppFormVertical2.getEditContent() : null;
        if (!RegexUtils.isEmail(editContent)) {
            editContent = null;
        }
        if (!TextUtils.isEmpty(editContent)) {
            bundle.putString("_email", editContent);
            LogInActivity logInActivityW12 = w();
            if (logInActivityW12 != null && (logInReq4 = logInActivityW12.f25888b) != null) {
                logInReq4.loginName = editContent;
            }
        } else if (strW0 != null) {
            if (TextUtils.isEmpty(strW0) || !TextUtils.isDigitsOnly(strW0)) {
                strW0 = null;
            }
            if (strW0 != null) {
                String str3 = preCheckPhoneRsp.phone;
                if (str3 == null || y.g(str3, strW0, false)) {
                    LogInActivity logInActivityW13 = w();
                    if (logInActivityW13 != null && (logInReq = logInActivityW13.f25888b) != null) {
                        logInReq.loginName = preCheckPhoneRsp.phone;
                    }
                } else {
                    LogInActivity logInActivityW14 = w();
                    if (logInActivityW14 != null && (logInReq2 = logInActivityW14.f25888b) != null) {
                        logInReq2.loginName = strW0;
                    }
                }
            }
        }
        if (z10 && (logInActivityW = w()) != null && (logInReq3 = logInActivityW.f25888b) != null) {
            logInReq3.firstName = preCheckPhoneRsp.firstName;
            logInReq3.middleName = preCheckPhoneRsp.middleName;
            logInReq3.lastName = preCheckPhoneRsp.lastName;
            logInReq3.gender = preCheckPhoneRsp.gender;
            logInReq3.birthday = preCheckPhoneRsp.birthday;
        }
        if (preCheckPhoneRsp.hasPin) {
            LogInActivity logInActivityW15 = w();
            AbstractC0130w abstractC0130w = this.t;
            LogInActivity logInActivityW16 = w();
            L8.a.a(logInActivityW15, abstractC0130w, null, logInActivityW16 != null ? logInActivityW16.f25879B : null, bundle);
            return;
        }
        AbstractC0130w abstractC0130w2 = this.t;
        if (abstractC0130w2 != null) {
            abstractC0130w2.h(F8.d.fragment_login_set_pin, bundle, null);
        }
    }

    public final void z() {
        KeyboardUtils.hideSoftInput(getActivity());
        PpFormVertical ppFormVertical = this.f26200v;
        String editContent = ppFormVertical != null ? ppFormVertical.getEditContent() : null;
        if (this.f26200v == null || TextUtils.isEmpty(editContent)) {
            return;
        }
        D.f7012b = 0L;
        if (editContent == null || !TextUtils.isDigitsOnly(editContent)) {
            if (!RegexUtils.isEmail(editContent)) {
                PpFormVertical ppFormVertical2 = this.f26200v;
                if (ppFormVertical2 != null) {
                    String string = getString(F8.h.ac_invalid_email);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ppFormVertical2.setBottomText(h.B(string, getContext(), null, Integer.valueOf(b.ppColorError), null, null, null, 1018));
                    return;
                }
                return;
            }
        } else if (editContent.length() != 10 && editContent.length() != 11) {
            PpFormVertical ppFormVertical3 = this.f26200v;
            if (ppFormVertical3 != null) {
                ppFormVertical3.setBottomText(h.B("Incorrect mobile No. or account No.", getContext(), null, Integer.valueOf(b.ppColorError), null, null, null, 1018));
                return;
            }
            return;
        }
        if (this.f26198o) {
            LogInActivity logInActivityW = w();
            if (logInActivityW != null) {
                logInActivityW.f25882L = this.f26198o;
            }
            C1623u c1623u = (C1623u) this.f27328i;
            if (c1623u != null) {
                c1623u.checkMobileNumber(null, editContent);
                return;
            }
            return;
        }
        if (!p267r9.a.f41645a.a()) {
            v();
            return;
        }
        SignUpPermissionDialog signUpPermissionDialog = new SignUpPermissionDialog(requireActivity(), this.f26199p, new C0142i(this, 10));
        this.f26197j = signUpPermissionDialog;
        signUpPermissionDialog.show();
        SignUpPermissionDialog signUpPermissionDialog2 = this.f26197j;
        if (signUpPermissionDialog2 != null) {
            signUpPermissionDialog2.setOnDismissListener(new Dd.b(this, 13));
        }
    }
}
