package com.transsnet.palmpay.account.ui.activity;

import Ce.DialogInterfaceOnDismissListenerC0168j;
import Ce.p0;
import F8.d;
import F8.e;
import F8.h;
import Je.l;
import L6.b;
import L8.c;
import N8.C0457a;
import N8.C0463g;
import Pa.r0;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.req.ResetPinNoTokenReq;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.dialog.SuccessFailDialog;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p051d9.M;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/setnewpin")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/SetNewPinV2Activity;", "Lcom/transsnet/palmpay/core/base/i;", "Ld9/M;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/SetNewPinContract$View;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinEnteredListener;", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinHideStateChangeListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetNewPinV2Activity extends i implements SetNewPinContract.View, PinEntryView.OnPinEnteredListener, PinEntryView.OnPinHideStateChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f25976v = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25982g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GetSecurityFlowRsp f25983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SignUpRsp f25984j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bc.i f25986p;
    public SuccessFailDialog t;

    public static String n(PinEntryView pinEntryView) {
        EditText editText;
        Editable editableText;
        if (pinEntryView == null || (editText = pinEntryView.getEditText()) == null || (editableText = editText.getEditableText()) == null) {
            return null;
        }
        return editableText.toString();
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void AutoLoginFail() {
        ARouter.getInstance().build("/account/login").navigation();
        ActivityUtils.finishAllActivities();
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void handleChangePinResult(CommonResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (rsp.isSuccess()) {
            q(null, true);
        } else if ("CFRONT_700006".equalsIgnoreCase(rsp.getRespCode())) {
            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
        } else {
            q(rsp.getRespMsg(), false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Bc.i iVar = this.f25986p;
        if (iVar != null) {
            ((PinEntryView) iVar.f727e).setOnPinEnteredListener(this);
        }
        Bc.i iVar2 = this.f25986p;
        if (iVar2 != null) {
            ((PinEntryView) iVar2.f727e).f31083t0 = this;
        }
        if (iVar2 != null) {
            ((PinEntryView) iVar2.f725c).setOnPinEnteredListener(this);
        }
        Bc.i iVar3 = this.f25986p;
        if (iVar3 != null) {
            ((PinEntryView) iVar3.f725c).f31083t0 = this;
        }
        if (iVar3 != null) {
            ((PpButton) iVar3.f726d).setOnClickListener(new l(this, 23));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_set_new_pin_v2, (ViewGroup) null, false);
        int i7 = d.btnNext;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.pinView1;
            PinEntryView pinEntryView = (PinEntryView) p059e1.a.m(i7, viewInflate);
            if (pinEntryView != null) {
                i7 = d.pinView2;
                PinEntryView pinEntryView2 = (PinEntryView) p059e1.a.m(i7, viewInflate);
                if (pinEntryView2 != null) {
                    i7 = d.titleBar;
                    if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = d.tv2;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = d.tvError1;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = d.tvError2;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    Bc.i iVar = new Bc.i((ViewGroup) viewInflate, (View) ppButton, (View) pinEntryView, (ViewGroup) pinEntryView2, (View) textView, textView2, (View) textView3, 9);
                                    this.f25986p = iVar;
                                    return iVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new M();
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void loginFailShowDialog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (TextUtils.isEmpty(message)) {
            message = getString(h.ac_login_failed);
        }
        t tVar = new t(this);
        tVar.a();
        tVar.f31304c = message;
        String string = getString(h.ac_confirm);
        tVar.f31312k = null;
        tVar.f31305d = string;
        tVar.f31311j = new DialogInterfaceOnDismissListenerC0168j(2);
        tVar.d(0);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void loginSuccess(SignUpRsp response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f25984j = response;
    }

    public final boolean m(String str) {
        try {
            Bc.i iVar = this.f25986p;
            String strN = n(iVar != null ? (PinEntryView) iVar.f727e : null);
            Bc.i iVar2 = this.f25986p;
            if (!TextUtils.equals(strN, n(iVar2 != null ? (PinEntryView) iVar2.f725c : null))) {
                Bc.i iVar3 = this.f25986p;
                if (iVar3 != null) {
                    ((PinEntryView) iVar3.f725c).b();
                }
                Bc.i iVar4 = this.f25986p;
                if (iVar4 != null) {
                    ((TextView) iVar4.f730i).setText(getString(h.ac_msg_password_not_same));
                }
                Bc.i iVar5 = this.f25986p;
                if (iVar5 != null) {
                    p220oa.h.C((TextView) iVar5.f730i);
                }
            } else {
                if (!c.e(str) && !c.d(str) && c.c(str) > 0) {
                    return true;
                }
                Bc.i iVar6 = this.f25986p;
                if (iVar6 != null) {
                    ((TextView) iVar6.f729g).setText(getString(h.ac_msg_invalid_psw));
                }
                Bc.i iVar7 = this.f25986p;
                if (iVar7 != null) {
                    p220oa.h.C((TextView) iVar7.f729g);
                }
                Bc.i iVar8 = this.f25986p;
                if (iVar8 != null) {
                    ((PinEntryView) iVar8.f727e).requestFocus();
                    return false;
                }
            }
        } catch (Exception e10) {
            F6.d.c(this.TAG, "isEqual: ", e10);
        }
        return false;
    }

    public final void o(String str) {
        if (m(str)) {
            this.f25985o = str;
            if (this.f25981f == 2) {
                M m7 = (M) this.f27350a;
                if (m7 != null) {
                    m7.changeTempPin(str, this.f25979d, this.f25977b);
                    return;
                }
                return;
            }
            ResetPinNoTokenReq resetPinNoTokenReq = new ResetPinNoTokenReq();
            resetPinNoTokenReq.newPin = SecurityUtils.a(str);
            resetPinNoTokenReq.securityVerifyToken = this.f25978c;
            resetPinNoTokenReq.phone = this.f25982g;
            M m10 = (M) this.f27350a;
            if (m10 != null) {
                m10.resetPin(resetPinNoTokenReq);
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinHideStateChangeListener
    public final void onHideStateChanged(PinEntryView pinEntryView, boolean z3) {
        Bc.i iVar;
        PinEntryView pinEntryView2;
        Bc.i iVar2;
        PinEntryView pinEntryView3;
        Bc.i iVar3 = this.f25986p;
        if (!Intrinsics.c(pinEntryView, iVar3 != null ? (PinEntryView) iVar3.f727e : null) && (iVar2 = this.f25986p) != null && (pinEntryView3 = (PinEntryView) iVar2.f727e) != null) {
            pinEntryView3.d(z3);
        }
        Bc.i iVar4 = this.f25986p;
        if (Intrinsics.c(pinEntryView, iVar4 != null ? (PinEntryView) iVar4.f725c : null) || (iVar = this.f25986p) == null || (pinEntryView2 = (PinEntryView) iVar.f725c) == null) {
            return;
        }
        pinEntryView2.d(z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public final void onPinEntered(String str) {
        Bc.i iVar;
        EditText editText;
        Bc.i iVar2 = this.f25986p;
        boolean z3 = false;
        if (iVar2 != null) {
            p220oa.h.s((TextView) iVar2.f729g, false);
        }
        Bc.i iVar3 = this.f25986p;
        if (iVar3 != null) {
            p220oa.h.s((TextView) iVar3.f730i, false);
        }
        Bc.i iVar4 = this.f25986p;
        String strN = n(iVar4 != null ? (PinEntryView) iVar4.f727e : null);
        if (strN != null) {
            int length = strN.length();
            int i7 = c.f5560a;
            if (length == i7) {
                Bc.i iVar5 = this.f25986p;
                String strN2 = n(iVar5 != null ? (PinEntryView) iVar5.f725c : null);
                if (strN2 != null && strN2.length() == i7) {
                    z3 = true;
                }
            }
        }
        Bc.i iVar6 = this.f25986p;
        if (iVar6 != null) {
            ((PpButton) iVar6.f726d).setEnabled(z3);
        }
        Bc.i iVar7 = this.f25986p;
        String strN3 = n(iVar7 != null ? (PinEntryView) iVar7.f727e : null);
        Bc.i iVar8 = this.f25986p;
        if (iVar8 != null && ((PpButton) iVar8.f726d).isEnabled()) {
            KeyboardUtils.hideSoftInput(this);
            if (m(strN3)) {
                o(strN3);
                return;
            }
            return;
        }
        if (strN3 == null || strN3.length() != c.f5560a || (iVar = this.f25986p) == null || (editText = ((PinEntryView) iVar.f725c).getEditText()) == null) {
            return;
        }
        editText.requestFocus();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        Window window = getWindow();
        if (window != null) {
            window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
    }

    public final void p() {
        Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.account.ui.activity.LogInActivity");
        if (activityIsActivityExistsInStack != null) {
            activityIsActivityExistsInStack.finish();
        }
        com.palmpay.lib.apm.launchcounter.util.d.H("/account/login", "_number", this.f25982g);
        finish();
    }

    public final void q(String str, boolean z3) {
        if (z3) {
            p220oa.h.z(this, CommonViewExtKt.string(h.ac_set_new_pin_success, this), S6.a.pay_SelectedOutline, new N8.M(this, 0), 21);
            return;
        }
        t tVar = new t(this);
        tVar.a();
        if (TextUtils.isEmpty(str)) {
            tVar.c(h.ac_operation_fail);
        } else {
            tVar.f31304c = str;
        }
        tVar.f31311j = new N8.M(this, 1);
        tVar.e(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25983i;
        if (getSecurityFlowRsp != null) {
            this.f25977b = getSecurityFlowRsp != null ? getSecurityFlowRsp.smsToken : null;
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void showChangeTempPinResult(CommonBeanResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (rsp.isSuccess()) {
            p220oa.h.z(this, CommonViewExtKt.string(h.ac_msg_change_temp_pin_success, this), null, new p0(4, rsp, this), 29);
            return;
        }
        O6.c cVar = new O6.c(this);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = rsp.getRespMsg();
        cVar.d(k.core_try_again, null);
        O6.d dVarA = cVar.a();
        dVarA.setOnDismissListener(new N8.M(this, 2));
        dVarA.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void showLoadingView(boolean z3) {
        PpButton ppButton;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        Bc.i iVar = this.f25986p;
        if (iVar != null && (pinEntryView2 = (PinEntryView) iVar.f727e) != null) {
            pinEntryView2.setEnabled(!z3);
        }
        Bc.i iVar2 = this.f25986p;
        if (iVar2 != null && (pinEntryView = (PinEntryView) iVar2.f725c) != null) {
            pinEntryView.setEnabled(!z3);
        }
        Bc.i iVar3 = this.f25986p;
        if (iVar3 == null || (ppButton = (PpButton) iVar3.f726d) == null) {
            return;
        }
        ppButton.b(z3);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void showSuccessDialog() {
        if (ActivityUtils.isValidActivityContext(this)) {
            if (BaseApplication.hasLogin()) {
                ActivityUtils.finishAllActivitiesExceptNewest();
                ARouter.getInstance().build("/main/home").withFlags(32768).navigation(this);
                return;
            }
            t tVar = new t(this);
            tVar.b();
            tVar.c(h.ac_login_succeed);
            SuccessFailDialog successFailDialogE = tVar.e(false);
            this.t = successFailDialogE;
            successFailDialogE.setCanceledOnTouchOutside(false);
            SuccessFailDialog successFailDialog = this.t;
            if (successFailDialog != null) {
                successFailDialog.setCancelable(false);
            }
            r0.o();
            C1765q c1765qI = df.d.h(Boolean.TRUE).e(2L, TimeUnit.SECONDS, f.f42630c).i(p071ef.b.a());
            p161kf.e eVar = new p161kf.e(new C0457a(new C0463g(this, 4), 4), p147jf.a.f38601e, p147jf.a.f38599c);
            c1765qI.subscribe(eVar);
            addSubscription(eVar);
        }
    }
}
