package com.transsnet.palmpay.account.ui.fragment.login;

import Bc.C0107d;
import F8.d;
import F8.e;
import Pa.i0;
import Pa.r0;
import Uc.I0;
import W8.m;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
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
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p051d9.C1623u;
import p220oa.h;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInWithRiskControlSmsFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/u;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/core/util/UssdUtils$UssdResponseCallback;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogInWithRiskControlSmsFragment extends BaseMVPFragment<C1623u> implements LoginContract.View, EasyPermissions$PermissionCallbacks, UssdUtils$UssdResponseCallback {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26219j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0107d f26221p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LogInWithRiskControlSmsFragment newInstance() {
            LogInWithRiskControlSmsFragment logInWithRiskControlSmsFragment = new LogInWithRiskControlSmsFragment();
            logInWithRiskControlSmsFragment.setArguments(new Bundle());
            return logInWithRiskControlSmsFragment;
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
    public final void handleSendSmsResult(SmsActionReq req, SendSmsNewV2Rsp response) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            updateSendSmsButton(true);
            if (!CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(response.getRespCode())) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                String respMsg = response.getRespMsg();
                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                h.t(contextRequireContext, respMsg);
                return;
            }
            C0107d c0107d = this.f26221p;
            if (c0107d != null) {
                OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) c0107d.f683e;
                oneTimeCodeV3View.f28471e.setVisibility(8);
                oneTimeCodeV3View.f28470d.setVisibility(4);
                oneTimeCodeV3View.f28469c.setVisibility(4);
                OnSendCodeListener onSendCodeListener = oneTimeCodeV3View.f28475j;
                if (onSendCodeListener != null) {
                    onSendCodeListener.onButtonVisibilityChange(oneTimeCodeV3View.f28469c, 4);
                }
            }
            p(response.getRespMsg());
            return;
        }
        SendSmsNewV2Rsp.DataBean dataBean = response.data;
        if (dataBean != null) {
            C0107d c0107d2 = this.f26221p;
            if (c0107d2 != null) {
                ((OneTimeCodeV3View) c0107d2.f683e).f(dataBean.countdownSeconds * 1000);
            }
        } else {
            C0107d c0107d3 = this.f26221p;
            if (c0107d3 != null) {
                ((OneTimeCodeV3View) c0107d3.f683e).f(60000);
            }
        }
        if (req.voiceSms == 0) {
            try {
                Intrinsics.e(SmsRetriever.getClient(requireContext()).startSmsRetriever());
            } catch (Exception unused) {
            }
        }
        SendSmsNewV2Rsp.DataBean dataBean2 = response.data;
        if (dataBean2 != null && !dataBean2.realSend) {
            if (req.voiceSms == 3) {
                C0107d c0107d4 = this.f26221p;
                L8.a.e(c0107d4 != null ? (TextView) c0107d4.f682d : null, i0.R(req.email));
                return;
            }
            return;
        }
        int i7 = req.voiceSms;
        if (i7 != 3) {
            if (i7 != 4) {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                String strC = i0.C(req.voiceSms, req.phoneNo, null);
                Intrinsics.checkNotNullExpressionValue(strC, "getOtcSentMessage(...)");
                h.z(contextRequireContext2, strC, null, null, 61);
                return;
            }
            return;
        }
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        String strC2 = i0.C(req.voiceSms, req.phoneNo, req.getSecurityEmail());
        Intrinsics.checkNotNullExpressionValue(strC2, "getOtcSentMessage(...)");
        h.z(contextRequireContext3, strC2, null, null, 61);
        C0107d c0107d5 = this.f26221p;
        L8.a.e(c0107d5 != null ? (TextView) c0107d5.f682d : null, i0.R(req.email));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        C0107d c0107d = this.f26221p;
        if (c0107d == null) {
            return 0;
        }
        ((TextView) c0107d.f682d).setText(F8.h.ac_msg_login_risk_control_check_sms);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_with_risk_control_sms, viewGroup, false);
        int i7 = d.layoutHeader;
        View viewM = p059e1.a.m(i7, viewInflate);
        if (viewM != null) {
            C0107d c0107dC = C0107d.c(viewM);
            i7 = d.tvMessage;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.viewOTC;
                OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) p059e1.a.m(i7, viewInflate);
                if (oneTimeCodeV3View != null) {
                    C0107d c0107d = new C0107d((LinearLayout) viewInflate, c0107dC, textView, oneTimeCodeV3View, 10);
                    this.f26221p = c0107d;
                    return c0107d;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        C0107d c0107d = this.f26221p;
        if (c0107d != null) {
            ((OneTimeCodeV3View) c0107d.f683e).setSendCodeListener(new m(this));
        }
        C0107d c0107d2 = this.f26221p;
        if (c0107d2 != null) {
            ((OneTimeCodeV3View) c0107d2.f683e).setCodeEnteredListener(new m(this));
        }
        updateSendSmsButton(false);
        C1623u c1623u = (C1623u) this.f27328i;
        if (c1623u != null) {
            LogInActivity logInActivityV = v();
            String str = logInActivityV != null ? logInActivityV.f25879B : "";
            C0107d c0107d3 = this.f26221p;
            c1623u.getSmsCode(str, c0107d3 != null ? ((OneTimeCodeV3View) c0107d3.f683e).getEmail() : null, 0, 13);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        LogInReq logInReq;
        C0107d c0107d = this.f26221p;
        if (c0107d != null) {
            OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) c0107d.f683e;
            LogInActivity logInActivityV = v();
            oneTimeCodeV3View.setMobileNumber(logInActivityV != null ? logInActivityV.f25879B : null);
        }
        NavHostFragment.f17502e.findNavController(this);
        C0107d c0107d2 = this.f26221p;
        if (c0107d2 != null) {
            ((IconicsImageView) ((C0107d) c0107d2.f681c).f681c).setOnClickListener(new I0(this, 9));
        }
        LogInActivity logInActivityV2 = v();
        if (logInActivityV2 != null && (logInReq = logInActivityV2.f25888b) != null) {
            logInReq.riskPassType = null;
        }
        C0107d c0107d3 = this.f26221p;
        if (c0107d3 == null) {
            return 0;
        }
        ((IconicsImageView) ((C0107d) c0107d3.f681c).f682d).setOnClickListener(new W8.d(6));
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void onGetSmsTokenFail(String reason) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(reason, "reason");
        F6.d.h(this.f27317a, 3, "onGetSmsTokenFail: " + reason);
        E activity = getActivity();
        if (activity != null) {
            h.t(activity, reason);
        }
        C0107d c0107d = this.f26221p;
        if (c0107d == null || (pinEntryView = ((OneTimeCodeV3View) c0107d.f683e).f28468b) == null) {
            return;
        }
        pinEntryView.setText("");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        C0107d c0107d;
        OneTimeCodeV3View oneTimeCodeV3View;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 515) {
            String strZ1 = r0.z1(4, event.getEventContent());
            if (!TextUtils.isDigitsOnly(strZ1) || (c0107d = this.f26221p) == null || (oneTimeCodeV3View = (OneTimeCodeV3View) c0107d.f683e) == null) {
                return;
            }
            oneTimeCodeV3View.setCode(strZ1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        c.b().l(this);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        u(this.f26219j);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (i7 == 740) {
            this.f26219j = this.f26219j;
            if (r0.j(v(), this.f26220o, this.f26219j, 740, this)) {
                showLoadingDialog(true);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback
    public final void onReceiveUssdResponse(boolean z3, String str, CharSequence charSequence, int i7) {
        OneTimeCodeV3View oneTimeCodeV3View;
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
        C0107d c0107d = this.f26221p;
        if (c0107d == null || (oneTimeCodeV3View = (OneTimeCodeV3View) c0107d.f683e) == null) {
            return;
        }
        oneTimeCodeV3View.setCode(strZ1);
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
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void onSmsTokenReceived(SmsActionRsp.DataBean dataBean) {
        PinEntryView pinEntryView;
        LogInReq logInReq;
        if (dataBean != null) {
            LogInActivity logInActivityV = v();
            if (logInActivityV != null && (logInReq = logInActivityV.f25888b) != null) {
                logInReq.riskPassType = "1";
            }
            LogInActivity logInActivityV2 = v();
            if (logInActivityV2 != null) {
                logInActivityV2.A(dataBean.getEffectiveSeconds(), dataBean.getSmsToken());
            }
            C0107d c0107d = this.f26221p;
            if (c0107d != null && (pinEntryView = ((OneTimeCodeV3View) c0107d.f683e).f28468b) != null) {
                pinEntryView.setText("");
            }
            LogInActivity logInActivityV3 = v();
            if (logInActivityV3 != null) {
                logInActivityV3.v();
            }
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
        OneTimeCodeV3View oneTimeCodeV3View;
        C0107d c0107d = this.f26221p;
        if (c0107d == null || (oneTimeCodeV3View = (OneTimeCodeV3View) c0107d.f683e) == null) {
            return;
        }
        oneTimeCodeV3View.setSendOtcButtonState(z3);
    }

    public final LogInActivity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof LogInActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
        return (LogInActivity) e10;
    }
}
