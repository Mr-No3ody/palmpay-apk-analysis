package com.transsnet.palmpay.account.ui.activity;

import Bc.k;
import C0.G;
import F8.d;
import F8.e;
import Je.l;
import L6.b;
import N8.C0457a;
import Pa.i0;
import Pa.r0;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.ResetPinVerifyListRsp;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.kotlin.ui.activity.SelectResetPinVerifyTypeActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV3View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p051d9.D;
import p1.c;
import p220oa.h;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "重置PIN", path = "/account/resetpin")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/ResetPinActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Ld9/D;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/ResetPinContract$View;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/core/util/UssdUtils$UssdResponseCallback;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPinActivity extends i implements ResetPinContract.View, EasyPermissions$PermissionCallbacks, UssdUtils$UssdResponseCallback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f25967o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GetSecurityFlowRsp f25973g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f25975j;

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

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.View
    public final void handleCheckSmsResult(SmsActionRsp rsp) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (!rsp.isSuccess()) {
            String respMsg = rsp.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            h.t(this, respMsg);
            k kVar = this.f25975j;
            if (kVar == null || (pinEntryView = ((OneTimeCodeV3View) kVar.f752f).f28468b) == null) {
                return;
            }
            pinEntryView.setText("");
            return;
        }
        SmsActionRsp.DataBean dataBean = rsp.data;
        String smsToken = dataBean != null ? dataBean.getSmsToken() : null;
        this.f25968b = smsToken;
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25973g;
        if (getSecurityFlowRsp != null) {
            getSecurityFlowRsp.smsToken = smsToken;
            getSecurityFlowRsp.nextStep(this, GetSecurityFlowRsp.VERIFY_TYPE_OTP);
        } else {
            D d2 = (D) this.f27350a;
            if (d2 != null) {
                d2.getResetPinVerifyList(p());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.View
    public final void handleResetPinVerifyListRsp(CommonBeanResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (!rsp.isSuccess()) {
            showErrorMessageDialog(rsp.getRespMsg());
            return;
        }
        T t = rsp.data;
        if (((ResetPinVerifyListRsp) t).verification == null || ((ResetPinVerifyListRsp) t).verification.size() <= 0 || !ResetPinVerifyTypeRsp.VERIFY_TYPE_NO.equalsIgnoreCase(((ResetPinVerifyListRsp) rsp.data).verification.get(0))) {
            SelectResetPinVerifyTypeActivity.f25791g.launch(this, this.f25968b, p());
        } else {
            GetSecurityFlowRsp getSecurityFlowRsp = this.f25973g;
            if (getSecurityFlowRsp == null) {
                ARouter.getInstance().build("/account/setnewpin").withString("_token", this.f25968b).withString("extra_data_2", p()).withInt("mode", 2).navigation();
            } else if (getSecurityFlowRsp != null) {
                getSecurityFlowRsp.nextStep(this, GetSecurityFlowRsp.VERIFY_TYPE_USER_INFO);
            }
        }
        finish();
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.View
    public final void handleSecurityFlow(GetSecurityFlowRsp rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        rsp.action = 14;
        rsp.mobile = p();
        rsp.nextStep(null, null);
        finish();
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.View
    public final void handleSendSmsResult(SmsActionReq req, SendSmsNewV2Rsp result) {
        k kVar;
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.isSuccess()) {
            String respMsg = result.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            h.t(this, respMsg);
            k kVar2 = this.f25975j;
            if (kVar2 != null) {
                ((OneTimeCodeV3View) kVar2.f752f).setSendOtcButtonState(true);
            }
            if (!CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(result.getRespCode()) || (kVar = this.f25975j) == null) {
                return;
            }
            OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) kVar.f752f;
            oneTimeCodeV3View.f28471e.setVisibility(8);
            oneTimeCodeV3View.f28470d.setVisibility(4);
            oneTimeCodeV3View.f28469c.setVisibility(4);
            OnSendCodeListener onSendCodeListener = oneTimeCodeV3View.f28475j;
            if (onSendCodeListener != null) {
                onSendCodeListener.onButtonVisibilityChange(oneTimeCodeV3View.f28469c, 4);
                return;
            }
            return;
        }
        if (req.voiceSms == 0) {
            try {
                Intrinsics.e(SmsRetriever.getClient((Activity) this).startSmsRetriever());
            } catch (Exception unused) {
            }
        }
        SendSmsNewV2Rsp.DataBean dataBean = result.data;
        if (dataBean != null) {
            k kVar3 = this.f25975j;
            if (kVar3 != null) {
                ((OneTimeCodeV3View) kVar3.f752f).f(dataBean.countdownSeconds * 1000);
            }
        } else {
            k kVar4 = this.f25975j;
            if (kVar4 != null) {
                ((OneTimeCodeV3View) kVar4.f752f).f(60000);
            }
        }
        SendSmsNewV2Rsp.DataBean dataBean2 = result.data;
        if (dataBean2 == null || dataBean2.realSend) {
            if (this.f25974i == 3) {
                String strC = i0.C(this.f25974i, p(), o());
                Intrinsics.checkNotNullExpressionValue(strC, "getOtcSentMessage(...)");
                h.z(this, strC, null, null, 61);
            } else {
                String strC2 = i0.C(this.f25974i, p(), null);
                Intrinsics.checkNotNullExpressionValue(strC2, "getOtcSentMessage(...)");
                h.z(this, strC2, null, null, 61);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String string;
        k kVar;
        k kVar2;
        GetSecurityFlowRsp getSecurityFlowRsp;
        String str;
        k kVar3 = this.f25975j;
        if (kVar3 != null) {
            ((PpTitleBar) kVar3.f750d).setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        k kVar4 = this.f25975j;
        if (kVar4 != null) {
            ((PpTitleBar) kVar4.f750d).setRightImageView1ClickListener(new K8.a(11));
        }
        if (TextUtils.isEmpty(this.f25972f)) {
            k kVar5 = this.f25975j;
            if (kVar5 != null) {
                ((PpTitleBar) kVar5.f750d).setTitle(getString(F8.h.ac_reset_pin));
            }
        } else {
            k kVar6 = this.f25975j;
            if (kVar6 != null) {
                ((PpTitleBar) kVar6.f750d).setTitle(this.f25972f);
            }
        }
        GetSecurityFlowRsp getSecurityFlowRsp2 = this.f25973g;
        if (getSecurityFlowRsp2 == null || getSecurityFlowRsp2.action != 14) {
            if (TextUtils.isEmpty(getSecurityFlowRsp2 != null ? getSecurityFlowRsp2.email : null)) {
                string = getString(F8.h.ac_msg_sms_will_sent, r0.D0(p()));
            } else {
                int i7 = F8.h.ac_msg_sms_will_sent;
                getSecurityFlowRsp = this.f25973g;
                if (getSecurityFlowRsp != null) {
                    str = getSecurityFlowRsp.email;
                } else {
                    str = null;
                }
                string = getString(i7, r0.C0(str));
            }
        } else {
            int i10 = F8.h.ac_msg_sms_will_sent;
            getSecurityFlowRsp = this.f25973g;
            if (getSecurityFlowRsp != null) {
                str = getSecurityFlowRsp.email;
            } else {
                str = null;
            }
            string = getString(i10, r0.C0(str));
        }
        Intrinsics.e(string);
        GetSecurityFlowRsp getSecurityFlowRsp3 = this.f25973g;
        if (getSecurityFlowRsp3 == null || getSecurityFlowRsp3.action != 14) {
            if (!TextUtils.isEmpty(getSecurityFlowRsp3 != null ? getSecurityFlowRsp3.email : null)) {
                kVar = this.f25975j;
                if (kVar != null) {
                    ((PpTitleBar) kVar.f750d).setTitle("");
                }
                kVar2 = this.f25975j;
                if (kVar2 != null) {
                    ((OneTimeCodeV3View) kVar2.f752f).setDefaultOtpType(3);
                }
            }
        } else {
            kVar = this.f25975j;
            if (kVar != null) {
                ((PpTitleBar) kVar.f750d).setTitle("");
            }
            kVar2 = this.f25975j;
            if (kVar2 != null) {
                ((OneTimeCodeV3View) kVar2.f752f).setDefaultOtpType(3);
            }
        }
        k kVar7 = this.f25975j;
        if (kVar7 != null) {
            ((TextView) kVar7.f749c).setText(string);
        }
        k kVar8 = this.f25975j;
        if (kVar8 != null) {
            ((OneTimeCodeV3View) kVar8.f752f).setSendCodeListener(new c(this, 5));
        }
        k kVar9 = this.f25975j;
        if (kVar9 != null) {
            ((OneTimeCodeV3View) kVar9.f752f).setCodeEnteredListener(new C0457a(this, 3));
        }
        k kVar10 = this.f25975j;
        if (kVar10 != null) {
            ((TextView) kVar10.f751e).setOnClickListener(new l(this, 22));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_reset_pin, (ViewGroup) null, false);
        int i7 = d.textViewMessage;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null) {
            i7 = d.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                i7 = d.tvChangeMobile;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = d.viewOTC;
                    OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) p059e1.a.m(i7, viewInflate);
                    if (oneTimeCodeV3View != null) {
                        k kVar = new k((LinearLayout) viewInflate, textView, ppTitleBar, textView2, oneTimeCodeV3View);
                        this.f25975j = kVar;
                        return kVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new D();
    }

    public final void m(String str) {
        this.f25969c = str;
        if (r0.j(this, this.f25970d, str, MessageEvent.EVENT_CREATE_SAVINGS_BREAK, this)) {
            showLoadingDialog(true);
        }
    }

    public final void n(String str) {
        try {
            PhoneUtils.dial(Uri.encode(str));
        } catch (Exception unused) {
            ToastUtils.showLong(getString(F8.h.ac_no_dial_application), new Object[0]);
        }
    }

    public final String o() {
        OneTimeCodeV3View oneTimeCodeV3View;
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25973g;
        if (getSecurityFlowRsp != null) {
            if (getSecurityFlowRsp != null) {
                return getSecurityFlowRsp.email;
            }
            return null;
        }
        k kVar = this.f25975j;
        if (kVar == null || (oneTimeCodeV3View = (OneTimeCodeV3View) kVar.f752f) == null) {
            return null;
        }
        return oneTimeCodeV3View.getEmail();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 529 && i10 == -1) {
            ARouter.getInstance().build("/account/setnewpin").withString("_token", this.f25968b).withString("extra_data_2", p()).withInt("mode", 1).navigation(this);
            finish();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        k kVar;
        OneTimeCodeV3View oneTimeCodeV3View;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 515) {
            String strZ1 = r0.z1(4, event.getEventContent());
            if (!TextUtils.isDigitsOnly(strZ1) || (kVar = this.f25975j) == null || (oneTimeCodeV3View = (OneTimeCodeV3View) kVar.f752f) == null) {
                return;
            }
            oneTimeCodeV3View.setCode(strZ1);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        n(this.f25969c);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (i7 == 530) {
            m(this.f25969c);
        }
    }

    @Override // com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback
    public final void onReceiveUssdResponse(boolean z3, String str, CharSequence charSequence, int i7) {
        OneTimeCodeV3View oneTimeCodeV3View;
        showLoadingDialog(false);
        if (!z3) {
            n(str);
            return;
        }
        String strZ1 = r0.z1(4, charSequence);
        if (TextUtils.isEmpty(strZ1)) {
            n(str);
            return;
        }
        k kVar = this.f25975j;
        if (kVar == null || (oneTimeCodeV3View = (OneTimeCodeV3View) kVar.f752f) == null) {
            return;
        }
        oneTimeCodeV3View.setCode(strZ1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        org.greenrobot.eventbus.c.b().j(this);
    }

    public final String p() {
        String strA = BaseApplication.hasLogin() ? G.A() : null;
        return TextUtils.isEmpty(strA) ? this.f25971e : strA;
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        OneTimeCodeV3View oneTimeCodeV3View;
        LinearLayout linearLayout;
        super.processLogic(bundle);
        k kVar = this.f25975j;
        if (kVar == null || (oneTimeCodeV3View = (OneTimeCodeV3View) kVar.f752f) == null || (linearLayout = oneTimeCodeV3View.f28470d) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        OneTimeCodeV3View oneTimeCodeV3View;
        ARouter.getInstance().inject(this);
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25973g;
        String str = getSecurityFlowRsp != null ? getSecurityFlowRsp.mobile : null;
        this.f25971e = str;
        k kVar = this.f25975j;
        if (kVar == null || (oneTimeCodeV3View = (OneTimeCodeV3View) kVar.f752f) == null) {
            return;
        }
        oneTimeCodeV3View.setMobileNumber(str);
    }
}
