package com.transsnet.palmpay.account.ui.fragment.login;

import Ab.r;
import Bc.C0107d;
import Bc.i;
import C0.AbstractC0130w;
import C0.G;
import C0.U;
import F8.c;
import F8.d;
import F8.e;
import L6.b;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import V9.q;
import W8.n;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p051d9.C1623u;
import p142ja.f;
import p220oa.h;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInWithSmsFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/u;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/core/util/UssdUtils$UssdResponseCallback;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogInWithSmsFragment extends BaseMVPFragment<C1623u> implements LoginContract.View, EasyPermissions$PermissionCallbacks, UssdUtils$UssdResponseCallback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f26222C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i f26223A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f26224B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26225j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26227p;
    public AbstractC0130w t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f26228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26229w;

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

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void handleSecurityFlowResult(GetSecurityFlowRsp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        result.action = 14;
        result.mobile = v();
        result.nextStep(null, null);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void handleSendSmsResult(SmsActionReq req, SendSmsNewV2Rsp response) {
        i iVar;
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            updateSendSmsButton(true);
            if (CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(response.getRespCode())) {
                i iVar2 = this.f26223A;
                if (iVar2 != null) {
                    ((OneTimeCodeV5View) iVar2.f725c).e();
                }
                p(response.getRespMsg());
            } else {
                E activity = getActivity();
                if (activity != null) {
                    String respMsg = response.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                    h.t(activity, respMsg);
                }
            }
            i iVar3 = this.f26223A;
            if (iVar3 != null) {
                ((OneTimeCodeV5View) iVar3.f725c).h();
            }
            KeyboardUtils.hideSoftInput(getActivity());
            return;
        }
        if (req.voiceSms == 0) {
            try {
                Intrinsics.e(SmsRetriever.getClient(requireContext()).startSmsRetriever());
            } catch (Exception unused) {
            }
        }
        SendSmsNewV2Rsp.DataBean dataBean = response.data;
        if (dataBean != null) {
            i iVar4 = this.f26223A;
            if (iVar4 != null) {
                ((OneTimeCodeV5View) iVar4.f725c).l(dataBean.countdownSeconds * 1000);
            }
        } else {
            i iVar5 = this.f26223A;
            if (iVar5 != null) {
                ((OneTimeCodeV5View) iVar5.f725c).l(60000);
            }
        }
        SendSmsNewV2Rsp.DataBean dataBean2 = response.data;
        if (dataBean2 != null && !dataBean2.realSend) {
            if (req.voiceSms != 3 || (iVar = this.f26223A) == null) {
                return;
            }
            ((TextView) iVar.f729g).setText(new SpanUtils().append(getString(F8.h.ac_msg_verification_code_sent_to_email)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, getActivity())).append(" " + req.getSecurityEmail() + Consts.DOT).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
            return;
        }
        int i7 = req.voiceSms;
        if (i7 == 3) {
            String securityEmail = req.getSecurityEmail();
            E activity2 = getActivity();
            if (activity2 != null) {
                String strC = i0.C(req.voiceSms, req.phoneNo, securityEmail);
                Intrinsics.checkNotNullExpressionValue(strC, "getOtcSentMessage(...)");
                h.z(activity2, strC, null, null, 61);
            }
            i iVar6 = this.f26223A;
            if (iVar6 != null) {
                ((TextView) iVar6.f729g).setText(new SpanUtils().append(getString(F8.h.ac_msg_verification_code_sent_to_email)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).append(" " + securityEmail + Consts.DOT).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
                return;
            }
            return;
        }
        if (i7 == 2) {
            E activity3 = getActivity();
            if (activity3 != null) {
                String strC2 = i0.C(req.voiceSms, req.phoneNo, null);
                Intrinsics.checkNotNullExpressionValue(strC2, "getOtcSentMessage(...)");
                h.z(activity3, strC2, null, null, 61);
            }
            i iVar7 = this.f26223A;
            if (iVar7 != null) {
                ((TextView) iVar7.f729g).setText(G.i("A verification code has been sent to your WhatsApp ").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).append(r0.Y(req.phoneNo)).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
                return;
            }
            return;
        }
        if (i7 == 4) {
            return;
        }
        if (i7 == 0) {
            y();
        }
        E activity4 = getActivity();
        if (activity4 != null) {
            String strC3 = i0.C(req.voiceSms, req.phoneNo, null);
            Intrinsics.checkNotNullExpressionValue(strC3, "getOtcSentMessage(...)");
            h.z(activity4, strC3, null, null, 61);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        y();
        i iVar = this.f26223A;
        if (iVar != null) {
            OneTimeCodeV5View oneTimeCodeV5View = (OneTimeCodeV5View) iVar.f725c;
            LogInActivity logInActivityW = w();
            String str = logInActivityW != null ? logInActivityW.f25879B : null;
            oneTimeCodeV5View.f28501i = str;
            oneTimeCodeV5View.f28502j = 13;
            oneTimeCodeV5View.i(13, str, false);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        View viewM2;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_with_sms, viewGroup, false);
        int i7 = d.ivMsgIcon;
        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = d.securityKeyBoard), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = d.titleBar), viewInflate)) != null) {
            C0107d c0107dC = C0107d.c(viewM2);
            i7 = d.tvChangeMobile;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.tvMessage;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = d.tvMessageTitle;
                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView3 != null) {
                        i7 = d.viewOTC;
                        OneTimeCodeV5View oneTimeCodeV5View = (OneTimeCodeV5View) p059e1.a.m(i7, viewInflate);
                        if (oneTimeCodeV5View != null) {
                            i iVar = new i((FrameLayout) viewInflate, viewM, c0107dC, textView, textView2, textView3, oneTimeCodeV5View);
                            this.f26223A = iVar;
                            return iVar;
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
        i iVar = this.f26223A;
        if (iVar != null) {
            ((OneTimeCodeV5View) iVar.f725c).setSendCodeListener(new r(this, 8));
        }
        i iVar2 = this.f26223A;
        if (iVar2 != null) {
            ((OneTimeCodeV5View) iVar2.f725c).setCodeEnteredListener(new q(this, 8));
        }
        updateSendSmsButton(false);
        C1623u c1623u = (C1623u) this.f27328i;
        if (c1623u != null) {
            c1623u.getSmsCode(v(), TextUtils.isEmpty(this.f26224B) ? null : this.f26224B, TextUtils.isEmpty(this.f26224B) ? 0 : 3, 2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        this.f26226o = arguments != null ? arguments.getBoolean("_identify_verify") : false;
        Bundle arguments2 = getArguments();
        this.f26227p = arguments2 != null ? arguments2.getBoolean("_extra_info") : false;
        Bundle arguments3 = getArguments();
        this.f26224B = arguments3 != null ? arguments3.getString("_email") : null;
        this.t = NavHostFragment.f17502e.findNavController(this);
        i iVar = this.f26223A;
        if (iVar != null) {
            ((IconicsImageView) ((C0107d) iVar.f726d).f681c).setOnClickListener(new n(this, 0));
        }
        i iVar2 = this.f26223A;
        if (iVar2 != null) {
            ((TextView) iVar2.f728f).setOnClickListener(new n(this, 1));
        }
        i iVar3 = this.f26223A;
        if (iVar3 != null) {
            ((IconicsImageView) ((C0107d) iVar3.f726d).f682d).setOnClickListener(new W8.d(7));
        }
        i iVar4 = this.f26223A;
        if (iVar4 != null) {
            OneTimeCodeV5View.d((OneTimeCodeV5View) iVar4.f725c, (View) iVar4.f730i);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        OneTimeCodeV5View oneTimeCodeV5View;
        i iVar = this.f26223A;
        if (iVar != null && (oneTimeCodeV5View = (OneTimeCodeV5View) iVar.f725c) != null) {
            oneTimeCodeV5View.j();
        }
        Handler handlerJ = j();
        if (handlerJ != null) {
            handlerJ.removeCallbacksAndMessages(null);
        }
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void onGetSmsTokenFail(String reason) {
        f fVar;
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(reason, "reason");
        F6.d.h(this.f27317a, 3, "onGetSmsTokenFail: " + reason);
        E activity = getActivity();
        if (activity != null) {
            io.fastkv.n.O(activity, 2, null, "OTP Authentication Failed", Integer.valueOf(c.ac_quit_icon_3), null, null, reason, Integer.valueOf(k.core_retry), null, null, null, "Other Methods Verification", new n(this, 2), null, false, 0, 8375922);
        }
        i iVar = this.f26223A;
        if (iVar != null && (fVar = ((OneTimeCodeV5View) iVar.f725c).f28496c) != null && (pinEntryView = fVar.smsCodeView) != null) {
            pinEntryView.setText("");
        }
        i iVar2 = this.f26223A;
        if (iVar2 != null) {
            ((OneTimeCodeV5View) iVar2.f725c).h();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        OneTimeCodeV5View oneTimeCodeV5View;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 515) {
            String strZ1 = r0.z1(4, event.getEventContent());
            if (TextUtils.isDigitsOnly(strZ1)) {
                n0.g().s("PalmPay_LoginOTP_autofill");
                i iVar = this.f26223A;
                if (iVar == null || (oneTimeCodeV5View = (OneTimeCodeV5View) iVar.f725c) == null) {
                    return;
                }
                oneTimeCodeV5View.setCode(strZ1);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        u(this.f26228v);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (i7 == 740) {
            this.f26228v = this.f26228v;
            if (r0.j(w(), this.f26229w, this.f26228v, 740, this)) {
                showLoadingDialog(true);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback
    public final void onReceiveUssdResponse(boolean z3, String str, CharSequence charSequence, int i7) {
        OneTimeCodeV5View oneTimeCodeV5View;
        showLoadingDialog(false);
        if (!z3) {
            u(str);
            return;
        }
        String strZ1 = r0.z1(4, charSequence);
        if (TextUtils.isEmpty(strZ1)) {
            u(str);
            return;
        }
        i iVar = this.f26223A;
        if (iVar == null || (oneTimeCodeV5View = (OneTimeCodeV5View) iVar.f725c) == null) {
            return;
        }
        oneTimeCodeV5View.setCode(strZ1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void onSmsTokenReceived(SmsActionRsp.DataBean dataBean) {
        f fVar;
        PinEntryView pinEntryView;
        if (dataBean == null || TextUtils.isEmpty(dataBean.getSmsToken())) {
            return;
        }
        LogInActivity logInActivityW = w();
        if (logInActivityW != null) {
            logInActivityW.A(dataBean.getEffectiveSeconds(), dataBean.getSmsToken());
        }
        i iVar = this.f26223A;
        if (iVar != null && (fVar = ((OneTimeCodeV5View) iVar.f725c).f28496c) != null && (pinEntryView = fVar.smsCodeView) != null) {
            pinEntryView.setText("");
        }
        i iVar2 = this.f26223A;
        if (iVar2 != null) {
            ((OneTimeCodeV5View) iVar2.f725c).h();
        }
        try {
            U u6 = new U(false, false, d.fragment_login_input_mobile, false, false, -1, -1, -1, -1);
            if (!this.f26226o && !this.f26227p) {
                x(u6);
                return;
            }
            LogInActivity logInActivityW2 = w();
            if (logInActivityW2 != null) {
                logInActivityW2.p(new U8.a(7, this, u6));
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1623u();
    }

    public final void u(String str) {
        try {
            PhoneUtils.dial(Uri.encode(str));
        } catch (Exception unused) {
            ToastUtils.showLong(getString(F8.h.ac_no_dial_application), new Object[0]);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void updateSendSmsButton(boolean z3) {
        OneTimeCodeV5View oneTimeCodeV5View;
        i iVar = this.f26223A;
        if (iVar == null || (oneTimeCodeV5View = (OneTimeCodeV5View) iVar.f725c) == null) {
            return;
        }
        oneTimeCodeV5View.setSendOtcButtonState(z3);
    }

    public final String v() {
        String str;
        LogInActivity logInActivityW = w();
        return (logInActivityW == null || (str = logInActivityW.f25879B) == null) ? "" : str;
    }

    public final LogInActivity w() {
        E e10 = this.f27319c;
        if (!(e10 instanceof LogInActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
        return (LogInActivity) e10;
    }

    public final void x(U u6) {
        LogInReq logInReq;
        LogInActivity logInActivityW = w();
        if (logInActivityW != null && !logInActivityW.f25893g) {
            LogInActivity logInActivityW2 = w();
            if (TextUtils.isEmpty((logInActivityW2 == null || (logInReq = logInActivityW2.f25888b) == null) ? null : logInReq.pin)) {
                AbstractC0130w abstractC0130w = this.t;
                if (abstractC0130w != null) {
                    abstractC0130w.h(d.fragment_login_set_pin, null, u6);
                    return;
                }
                return;
            }
        }
        LogInActivity logInActivityW3 = w();
        if (logInActivityW3 != null) {
            logInActivityW3.v();
        }
    }

    public final void y() {
        TextView textView;
        i iVar = this.f26223A;
        if (iVar == null || (textView = (TextView) iVar.f729g) == null) {
            return;
        }
        textView.setText(new SpanUtils().append(getString(F8.h.ac_msg_verification_code_sent_to)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).append(" +" + r0.J(v()) + " " + r0.Y(v())).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
    }
}
