package com.transsnet.palmpay.account.ui.activity;

import C0.G;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import N8.C0463g;
import N8.N;
import N8.O;
import N8.q0;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.u;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.req.ResetPasswordReq;
import com.transsnet.palmpay.account.ui.fragment.setpin.SetNewPswFragment;
import com.transsnet.palmpay.account.ui.mvp.contract.SetNewPswContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.callback.SafeLockCheck;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.ActivityUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p051d9.P;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/set_new_psw")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/SetNewPswActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Ld9/P;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/SetNewPswContract$View;", "Lcom/transsnet/palmpay/core/callback/SafeLockCheck;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetNewPswActivity extends i implements SetNewPswContract.View, SafeLockCheck {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25987e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25989c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25990d;

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_set_new_psw;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPswContract.View
    public final void handleResetPasswordResult(CommonResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (!rsp.isSuccess()) {
            n.O(this, 0, Integer.valueOf(k.core_opps), null, null, null, null, TextUtils.isEmpty(rsp.getRespMsg()) ? CommonViewExtKt.string(h.ac_operation_fail, this) : rsp.getRespMsg(), Integer.valueOf(h.ac_confirm), null, null, Integer.valueOf(h.ac_cancel), null, new O(this, 1), null, false, 0, 8377981);
            return;
        }
        n.M(false);
        String string = getString(h.ac_setting_success);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        p220oa.h.z(this, string, S6.a.pay_SelectedOutline, new N(this, 1), 21);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPswContract.View
    public final void handleResetTempPasswordResult(CommonBeanResult commonBeanResult) {
        if (commonBeanResult != null && commonBeanResult.isSuccess()) {
            n.M(false);
            String string = getString(h.ac_setting_success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            p220oa.h.z(this, string, S6.a.pay_SelectedOutline, new N(this, 0), 21);
            return;
        }
        Integer numValueOf = Integer.valueOf(k.core_opps);
        String respMsg = null;
        if (TextUtils.isEmpty(commonBeanResult != null ? commonBeanResult.getRespMsg() : null)) {
            respMsg = CommonViewExtKt.string(h.ac_operation_fail, this);
        } else if (commonBeanResult != null) {
            respMsg = commonBeanResult.getRespMsg();
        }
        n.O(this, 0, numValueOf, null, null, null, null, respMsg, Integer.valueOf(h.ac_confirm), null, null, Integer.valueOf(h.ac_cancel), null, new O(this, 0), null, false, 0, 8377981);
    }

    @Override // com.transsnet.palmpay.core.callback.SafeLockCheck
    public final boolean ignoreLock() {
        return ActivityUtils.isActivityExistsInStack((Class<?>) PinSafeWithPatternActivity.class);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new P();
    }

    public final void m(String str) {
        ResetPasswordReq resetPasswordReq = new ResetPasswordReq();
        resetPasswordReq.securityVerifyToken = this.f25988b;
        resetPasswordReq.newPassword = SecurityUtils.a(str);
        if (BaseApplication.hasLogin()) {
            resetPasswordReq.phone = G.A();
        } else {
            resetPasswordReq.phone = this.f25990d;
        }
        P p3 = (P) this.f27350a;
        if (p3 != null) {
            p3.resetPassword(resetPasswordReq);
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        if (getSupportFragmentManager().D(d.fragmentContainer) instanceof SetNewPswFragment) {
            return;
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(d.fragmentContainer, SetNewPswFragment.f26249j.newInstance(), null);
        c1161aE.c(null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 5));
    }
}
