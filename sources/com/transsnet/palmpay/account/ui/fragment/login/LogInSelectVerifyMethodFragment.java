package com.transsnet.palmpay.account.ui.fragment.login;

import B6.ViewOnClickListenerC0087i;
import Bc.C0107d;
import C0.AbstractC0130w;
import F8.d;
import F8.e;
import L6.b;
import Oc.j;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Uc.I0;
import android.animation.LayoutTransition;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.common.Scopes;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethod;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p051d9.C1623u;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInSelectVerifyMethodFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/u;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogInSelectVerifyMethodFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogInSelectVerifyMethodFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/login/LogInSelectVerifyMethodFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,268:1\n1869#2,2:269\n*S KotlinDebug\n*F\n+ 1 LogInSelectVerifyMethodFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/login/LogInSelectVerifyMethodFragment\n*L\n77#1:269,2\n*E\n"})
public final class LogInSelectVerifyMethodFragment extends BaseMVPFragment<C1623u> implements LoginContract.View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0107d f26202j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0130w f26203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SecurityVerifyMethod f26204p;

    public static void w(String str) {
        n0.g().u(new ViewEvent("PalmPayLogin_VerifyMethod_click").add("VerifyMethod", str));
    }

    public static void x(String str) {
        n0.g().u(new ViewEvent("PalmPayLogin_VerifyMethod_view").add("VerifyMethod", str));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        LogInActivity logInActivity;
        PreCheckPhoneRsp preCheckPhoneRsp;
        List<SecurityVerifyMethod> list;
        E e10 = this.f27319c;
        if (e10 instanceof LogInActivity) {
            Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
            logInActivity = (LogInActivity) e10;
        } else {
            logInActivity = null;
        }
        if (logInActivity != null && (preCheckPhoneRsp = logInActivity.t) != null && (list = preCheckPhoneRsp.verifyMethodList) != null) {
            List<SecurityVerifyMethod> list2 = list.isEmpty() ? null : list;
            if (list2 != null) {
                for (SecurityVerifyMethod securityVerifyMethod : list2) {
                    if (securityVerifyMethod.verifyMethod == 2) {
                        Boolean boolG = C0525w.g(securityVerifyMethod.extendInfo, "hideItem");
                        this.f26204p = securityVerifyMethod;
                        if (boolG.booleanValue()) {
                            C0107d c0107d = this.f26202j;
                            if (c0107d != null) {
                                IconicsTextView iconicsTextView = (IconicsTextView) c0107d.f683e;
                                h.C(iconicsTextView);
                                n0.g().v("PalmPayLogin_OtherVerifyMethod_view");
                                iconicsTextView.setOnClickListener(new j(20, iconicsTextView, this));
                            }
                        } else {
                            u(securityVerifyMethod, false);
                        }
                    } else {
                        u(securityVerifyMethod, false);
                    }
                }
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_select_verify_method, viewGroup, false);
        int i7 = d.itemContainer;
        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
        if (linearLayout != null && (viewM = a.m((i7 = d.layoutHeader2), viewInflate)) != null) {
            C0107d c0107dC = C0107d.c(viewM);
            i7 = d.tvOtherMethod;
            IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewInflate);
            if (iconicsTextView != null) {
                C0107d c0107d = new C0107d((LinearLayout) viewInflate, linearLayout, c0107dC, iconicsTextView, 9);
                this.f26202j = c0107d;
                return c0107d;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f26203o = NavHostFragment.f17502e.findNavController(this);
        C0107d c0107d = this.f26202j;
        if (c0107d != null) {
            ((IconicsImageView) ((C0107d) c0107d.f682d).f682d).setOnClickListener(new W8.d(2));
        }
        C0107d c0107d2 = this.f26202j;
        if (c0107d2 != null) {
            ((IconicsImageView) ((C0107d) c0107d2.f682d).f681c).setOnClickListener(new I0(this, 8));
        }
        C0107d c0107d3 = this.f26202j;
        if (c0107d3 != null) {
            h.C((TextView) ((C0107d) c0107d3.f682d).f683e);
        }
        C0107d c0107d4 = this.f26202j;
        if (c0107d4 != null) {
            ((TextView) ((C0107d) c0107d4.f682d).f683e).setText("Verify Your Identify");
        }
        C0107d c0107d5 = this.f26202j;
        if (c0107d5 == null) {
            return 0;
        }
        LinearLayout linearLayout = (LinearLayout) c0107d5.f681c;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        linearLayout.setLayoutTransition(layoutTransition);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1623u();
    }

    public final void u(SecurityVerifyMethod securityVerifyMethod, boolean z3) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i7 = e.ac_layout_security_verify_method_item;
        C0107d c0107d = this.f26202j;
        View viewInflate = layoutInflaterFrom.inflate(i7, (ViewGroup) (c0107d != null ? (LinearLayout) c0107d.f681c : null), false);
        if (viewInflate != null) {
            ImageView imageView = (ImageView) viewInflate.findViewById(d.ivIcon1);
            TextView textView = (TextView) viewInflate.findViewById(d.tvName1);
            TextView textView2 = (TextView) viewInflate.findViewById(d.tvLine1);
            String strJ = C0525w.j(securityVerifyMethod.extendInfo, "name");
            String strJ2 = C0525w.j(securityVerifyMethod.extendInfo, "suffix");
            if (securityVerifyMethod.verifyMethod == 9 && !TextUtils.isEmpty(strJ2)) {
                imageView.setImageDrawable(v(S6.a.pay_EmailOutline));
                textView.setText(new SpanUtils().append(strJ).append(" (").append(String.valueOf(RegexUtils.isEmailMasked(strJ2) ? strJ2 : i0.R(strJ2))).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, viewInflate.getContext())).append(")").create());
                x(Scopes.EMAIL);
            } else if (securityVerifyMethod.verifyMethod == 2 && !TextUtils.isEmpty(strJ2)) {
                imageView.setImageDrawable(v(S6.a.pay_PhoneLine));
                textView.setText(new SpanUtils().append(strJ).append(" (").append(String.valueOf(r0.E0(strJ2))).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, viewInflate.getContext())).append(")").create());
                x("sms");
            } else if (securityVerifyMethod.verifyMethod == 5) {
                imageView.setImageDrawable(v(S6.a.pay_FaceRecognition));
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "Face Verification";
                }
                textView.setText(strJ);
                x("face");
            } else {
                textView.setText(strJ);
                x("name");
            }
            textView2.setText(C0525w.j(securityVerifyMethod.extendInfo, "msg"));
            viewInflate.setOnClickListener(new ViewOnClickListenerC0087i(this, 24, securityVerifyMethod, strJ2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = CommonViewExtKt.getDp(12.0f);
            layoutParams.leftMargin = CommonViewExtKt.getDp(16.0f);
            layoutParams.rightMargin = CommonViewExtKt.getDp(16.0f);
            C0107d c0107d2 = this.f26202j;
            if (c0107d2 != null) {
                ((LinearLayout) c0107d2.f681c).addView(viewInflate, layoutParams);
            }
            if (z3) {
                viewInflate.setAlpha(0.0f);
                viewInflate.setTranslationY(-CommonViewExtKt.getDp(30.0f));
                viewInflate.animate().alpha(1.0f).translationY(0.0f).setDuration(350L).setStartDelay(50L).start();
            }
        }
    }

    public final IconicsDrawable v(S6.a aVar) {
        return a.h(getActivity(), aVar, null, CommonViewExtKt.colorInt(b.ppColorPrimary, getActivity()), 24.0f);
    }
}
