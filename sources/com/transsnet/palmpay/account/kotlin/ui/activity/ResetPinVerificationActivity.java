package com.transsnet.palmpay.account.kotlin.ui.activity;

import F8.e;
import F8.h;
import Ha.d;
import L6.b;
import N8.q0;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.ResetPinVerificationReq;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification1Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification2Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification3Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification4Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification5Fragment;
import com.transsnet.palmpay.account.ui.mvp.contract.ResetPinVerificationContract;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p051d9.G;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/reset_pin_verify")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/kotlin/ui/activity/ResetPinVerificationActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Ld9/G;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/ResetPinVerificationContract$View;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPinVerificationActivity extends i implements ResetPinVerificationContract.View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25784i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GetSecurityFlowRsp f25789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PpTitleBar f25790g;

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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_reset_pin_verification;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinVerificationContract.View
    public final void handleResetPinVerifyResult(CommonStringResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (!rsp.isSuccess()) {
            showErrorMessageDialog(rsp.getRespMsg());
            return;
        }
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25789f;
        if (getSecurityFlowRsp != null) {
            getSecurityFlowRsp.securityVerifyToken = rsp.data;
        }
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinVerificationContract.View
    public final void handleResetPinVerifyTypeRsp(CommonBeanResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (!rsp.isSuccess()) {
            showErrorMessageDialog(rsp.getRespMsg(), getString(h.ac_confirm), new d(this, 19));
            return;
        }
        T t = rsp.data;
        if (t == 0) {
            m();
            return;
        }
        ResetPinVerifyTypeRsp resetPinVerifyTypeRsp = (ResetPinVerifyTypeRsp) t;
        this.f25785b = resetPinVerifyTypeRsp.token;
        String verification = resetPinVerifyTypeRsp.verification;
        Intrinsics.checkNotNullExpressionValue(verification, "verification");
        n(verification);
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
        return new G();
    }

    public final void m() {
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25789f;
        if (getSecurityFlowRsp == null) {
            ARouter.getInstance().build("/account/setnewpin").withString("_token", this.f25786c).withString("extra_data_2", this.f25787d).withInt("mode", 2).navigation(this);
            finish();
        } else if (getSecurityFlowRsp != null) {
            getSecurityFlowRsp.nextStep(this, GetSecurityFlowRsp.VERIFY_TYPE_USER_INFO);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n(String str) {
        switch (str.hashCode()) {
            case -1794974836:
                if (str.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_BANKCARD)) {
                    o(str);
                    break;
                }
                break;
            case 2331:
                if (str.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_ID) && !(getSupportFragmentManager().D(F8.d.fragmentContainer) instanceof ResetPinVerification5Fragment)) {
                    Z supportFragmentManager = getSupportFragmentManager();
                    C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
                    c1161aE.e(F8.d.fragmentContainer, ResetPinVerification5Fragment.f25805p.newInstance(this.f25787d), null);
                    c1161aE.h(true);
                }
                break;
            case 66170:
                if (str.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_BVN) && !(getSupportFragmentManager().D(F8.d.fragmentContainer) instanceof ResetPinVerification4Fragment)) {
                    Z supportFragmentManager2 = getSupportFragmentManager();
                    C1161a c1161aE2 = q0.e(supportFragmentManager2, supportFragmentManager2);
                    c1161aE2.e(F8.d.fragmentContainer, new ResetPinVerification4Fragment(), null);
                    c1161aE2.h(true);
                }
                break;
            case 67066748:
                if (str.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_EMAIL) && !(getSupportFragmentManager().D(F8.d.fragmentContainer) instanceof ResetPinVerification2Fragment)) {
                    Z supportFragmentManager3 = getSupportFragmentManager();
                    C1161a c1161aE3 = q0.e(supportFragmentManager3, supportFragmentManager3);
                    c1161aE3.e(F8.d.fragmentContainer, new ResetPinVerification2Fragment(), null);
                    c1161aE3.h(true);
                }
                break;
            case 811305009:
                if (str.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_BANK_ACCOUNT)) {
                    o(str);
                    break;
                }
                break;
            case 1395496410:
                if (str.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_FULL_NAME) && !(getSupportFragmentManager().D(F8.d.fragmentContainer) instanceof ResetPinVerification1Fragment)) {
                    Z supportFragmentManager4 = getSupportFragmentManager();
                    C1161a c1161aE4 = q0.e(supportFragmentManager4, supportFragmentManager4);
                    c1161aE4.e(F8.d.fragmentContainer, new ResetPinVerification1Fragment(), null);
                    c1161aE4.h(true);
                }
                break;
        }
    }

    public final void o(String str) {
        if (getSupportFragmentManager().D(F8.d.fragmentContainer) instanceof ResetPinVerification3Fragment) {
            return;
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(F8.d.fragmentContainer, ResetPinVerification3Fragment.f25800p.newInstance(str, this.f25787d), null);
        c1161aE.h(true);
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 529) {
            if (i10 == -1) {
                m();
            } else {
                finish();
            }
        }
    }

    public final void p(ResetPinVerificationReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        req.token = this.f25785b;
        req.smsToken = this.f25786c;
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25789f;
        if (getSecurityFlowRsp != null) {
            req.flowId = getSecurityFlowRsp.flowId;
        }
        ((G) this.f27350a).resetPinVerify(req, getSecurityFlowRsp != null);
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        String str = this.f25788e;
        if (str != null) {
            n(str);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        PpTitleBar ppTitleBar = this.f25790g;
        if (ppTitleBar != null) {
            ppTitleBar.setTitle(charSequence);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7;
        ARouter.getInstance().inject(this);
        this.f25790g = (PpTitleBar) findViewById(F8.d.titleBar);
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25789f;
        if (getSecurityFlowRsp == null) {
            setTitle(h.ac_reset_pin);
            return;
        }
        if (getSecurityFlowRsp == null || getSecurityFlowRsp.action != 14) {
            i7 = (getSecurityFlowRsp == null || getSecurityFlowRsp.action == 12) ? h.ac_reset_pin : h.ac_reset_pin;
        } else {
            i7 = h.ac_change_mobile_number;
        }
        setTitle(CommonViewExtKt.string(i7, this));
    }
}
