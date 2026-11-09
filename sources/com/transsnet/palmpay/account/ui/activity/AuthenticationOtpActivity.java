package com.transsnet.palmpay.account.ui.activity;

import Ad.c0;
import Bc.p;
import C0.G;
import C9.C0138e;
import C9.Q;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import N8.C0457a;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.viewmodel.VerifyRegisterInfoViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeSimpleView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p097g9.d0;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/AuthenticationOtp")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/AuthenticationOtpActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/VerifyRegisterInfoViewModel;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthenticationOtpActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationOtpActivity.kt\ncom/transsnet/palmpay/account/ui/activity/AuthenticationOtpActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,112:1\n171#2,12:113\n215#2:125\n*S KotlinDebug\n*F\n+ 1 AuthenticationOtpActivity.kt\ncom/transsnet/palmpay/account/ui/activity/AuthenticationOtpActivity\n*L\n57#1:113,12\n57#1:125\n*E\n"})
public final class AuthenticationOtpActivity extends BaseMvvmActivity<VerifyRegisterInfoViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f25835f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25837d = 24;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f25838e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        TextView textView;
        p pVar = this.f25838e;
        if (pVar == null || (textView = (TextView) pVar.f812c) == null) {
            return;
        }
        textView.setText(getString(h.ac_use_xx_to_get_code, r0.Y(BaseApplication.get().getUser().getPhoneNumber())));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_authentication_otp, (ViewGroup) null, false);
        int i7 = d.title_bar;
        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = d.tvMessage;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.viewOTC;
                OneTimeCodeSimpleView oneTimeCodeSimpleView = (OneTimeCodeSimpleView) p059e1.a.m(i7, viewInflate);
                if (oneTimeCodeSimpleView != null) {
                    p pVar = new p((LinearLayout) viewInflate, textView, oneTimeCodeSimpleView, 7);
                    this.f25838e = pVar;
                    return pVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        LinearLayout linearLayout;
        F f10 = new F();
        SmsActionReq smsActionReq = new SmsActionReq();
        f10.f38951a = smsActionReq;
        smsActionReq.businessType = this.f25837d;
        smsActionReq.phoneNo = G.A();
        ((SmsActionReq) f10.f38951a).codeCount = 4;
        p pVar = this.f25838e;
        if (pVar != null && (linearLayout = ((OneTimeCodeSimpleView) pVar.f813d).f28444d) != null) {
            linearLayout.setVisibility(8);
        }
        p pVar2 = this.f25838e;
        if (pVar2 != null) {
            ((OneTimeCodeSimpleView) pVar2.f813d).setSendCodeListener(new c0(23, this, f10));
        }
        p pVar3 = this.f25838e;
        if (pVar3 != null) {
            ((OneTimeCodeSimpleView) pVar3.f813d).setCodeEnteredListener(new C0457a(this, 1));
        }
        p pVar4 = this.f25838e;
        if (pVar4 != null) {
            ((OneTimeCodeSimpleView) pVar4.f813d).b();
        }
        VerifyRegisterInfoViewModel verifyRegisterInfoViewModel = (VerifyRegisterInfoViewModel) l();
        SmsActionReq req = (SmsActionReq) f10.f38951a;
        verifyRegisterInfoViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        d0 d0Var = new d0(req, null);
        l lVar = verifyRegisterInfoViewModel.f26448f;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        f.v(verifyRegisterInfoViewModel, d0Var, lVar, 0L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        l lVar = ((VerifyRegisterInfoViewModel) l()).f26447e;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(21, this, this), (byte) 0, (char) 0));
        }
    }
}
