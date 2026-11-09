package com.transsnet.palmpay.account.ui.fragment.verify;

import Bc.C0107d;
import C0.G;
import C9.C0142i;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.req.CheckSecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV4View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p037c9.c;
import p051d9.n0;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountOtpFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/verify/BaseVerifyAccountFragment;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/core/util/UssdUtils$UssdResponseCallback;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyAccountOtpFragment extends BaseVerifyAccountFragment implements EasyPermissions$PermissionCallbacks, UssdUtils$UssdResponseCallback {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f26314H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f26315A = 99;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f26316B = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f26317C = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0107d f26318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26319p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f26320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f26321w;

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

    public final void A(String str) {
        try {
            PhoneUtils.dial(Uri.encode(str));
        } catch (Exception unused) {
            ToastUtils.showLong(getString(h.ac_no_dial_application), new Object[0]);
        }
    }

    public final void B(int i7) {
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = this.f26316B;
        smsActionReq.phoneNo = this.f26321w;
        smsActionReq.voiceSms = i7;
        smsActionReq.codeCount = 4;
        smsActionReq.email = this.f26320v;
        n0 n0Var = (n0) this.f27328i;
        if (n0Var != null) {
            n0Var.getSmsCode(smsActionReq);
        }
    }

    public final void C(String str, String str2) {
        C0107d c0107d;
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str) || (c0107d = this.f26318o) == null) {
                return;
            }
            ((TextView) c0107d.f681c).setText(G.i("A verification code has been sent to your phone number ").append(r0.Y(str)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext())).append(Consts.DOT).create());
            return;
        }
        C0107d c0107d2 = this.f26318o;
        TextView textView = c0107d2 != null ? (TextView) c0107d2.f681c : null;
        if (str2 == null || !StringsKt.A(str2, "*", false)) {
            str2 = i0.R(str2);
        }
        L8.a.e(textView, str2);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract.View
    public final void handleSendSmsRsp(SmsActionReq req, SendSmsNewV2Rsp response) {
        E activity;
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(response, "response");
        if (i0.W(getActivity()) && !isDetached() && isAdded()) {
            if (!response.isSuccess()) {
                updateSendSmsButton(true);
                if (CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(response.getRespCode())) {
                    C0107d c0107d = this.f26318o;
                    if (c0107d != null) {
                        ((OneTimeCodeV4View) c0107d.f682d).d();
                    }
                    p(response.getRespMsg());
                    return;
                }
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                String respMsg = response.getRespMsg();
                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                p220oa.h.t(contextRequireContext, respMsg);
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
                C0107d c0107d2 = this.f26318o;
                if (c0107d2 != null) {
                    ((OneTimeCodeV4View) c0107d2.f682d).i(dataBean.countdownSeconds * 1000);
                }
            } else {
                C0107d c0107d3 = this.f26318o;
                if (c0107d3 != null) {
                    ((OneTimeCodeV4View) c0107d3.f682d).i(60000);
                }
            }
            SendSmsNewV2Rsp.DataBean dataBean2 = response.data;
            if (dataBean2 != null && !dataBean2.realSend) {
                if (req.voiceSms == 3) {
                    C0107d c0107d4 = this.f26318o;
                    L8.a.e(c0107d4 != null ? (TextView) c0107d4.f681c : null, i0.R(req.email));
                    return;
                }
                return;
            }
            int i7 = req.voiceSms;
            if (i7 == 3) {
                E activity2 = getActivity();
                if (activity2 != null) {
                    String strC = i0.C(req.voiceSms, req.phoneNo, req.getSecurityEmail());
                    Intrinsics.checkNotNullExpressionValue(strC, "getOtcSentMessage(...)");
                    p220oa.h.z(activity2, strC, null, null, 61);
                }
                C0107d c0107d5 = this.f26318o;
                L8.a.e(c0107d5 != null ? (TextView) c0107d5.f681c : null, i0.R(req.email));
                return;
            }
            if (i7 != 2) {
                if (i7 == 4 || (activity = getActivity()) == null) {
                    return;
                }
                String strC2 = i0.C(req.voiceSms, req.phoneNo, null);
                Intrinsics.checkNotNullExpressionValue(strC2, "getOtcSentMessage(...)");
                p220oa.h.z(activity, strC2, null, null, 61);
                return;
            }
            E activity3 = getActivity();
            if (activity3 != null) {
                String strC3 = i0.C(req.voiceSms, req.phoneNo, null);
                Intrinsics.checkNotNullExpressionValue(strC3, "getOtcSentMessage(...)");
                p220oa.h.z(activity3, strC3, null, null, 61);
            }
            C0107d c0107d6 = this.f26318o;
            if (c0107d6 != null) {
                TextView textView = (TextView) c0107d6.f681c;
                String str = String.format("Please check your WhatsApp(%s) to get the code.", Arrays.copyOf(new Object[]{r0.Y(req.phoneNo)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        C0107d c0107d = this.f26318o;
        if (c0107d != null) {
            OneTimeCodeV4View oneTimeCodeV4View = (OneTimeCodeV4View) c0107d.f682d;
            String str = this.f26321w;
            int i7 = this.f26315A;
            oneTimeCodeV4View.f28491o = str;
            oneTimeCodeV4View.f28492p = i7;
            oneTimeCodeV4View.g(i7, str, false);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_verify_account_otp, viewGroup, false);
        int i7 = d.titleBar;
        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
        if (ppTitleBar != null) {
            i7 = d.tvMessage;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.viewOTC;
                OneTimeCodeV4View oneTimeCodeV4View = (OneTimeCodeV4View) p059e1.a.m(i7, viewInflate);
                if (oneTimeCodeV4View != null) {
                    C0107d c0107d = new C0107d((ViewGroup) viewInflate, ppTitleBar, (View) textView, (View) oneTimeCodeV4View, 13);
                    this.f26318o = c0107d;
                    return c0107d;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        C0107d c0107d = this.f26318o;
        if (c0107d != null) {
            ((OneTimeCodeV4View) c0107d.f682d).setLoadingCallback(new C0142i(this, 15));
        }
        C0107d c0107d2 = this.f26318o;
        if (c0107d2 != null) {
            ((OneTimeCodeV4View) c0107d2.f682d).setSendCodeListener(new c(this));
        }
        C0107d c0107d3 = this.f26318o;
        if (c0107d3 != null) {
            ((OneTimeCodeV4View) c0107d3.f682d).setCodeEnteredListener(new c(this));
        }
        if (this.f26317C != 9 || TextUtils.isEmpty(this.f26320v)) {
            B(0);
            C(this.f26321w, null);
        } else {
            B(3);
            C(this.f26321w, this.f26320v);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String str;
        String string;
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26317C = arguments.getInt("extra_type");
        }
        VerifyAccountActivity verifyAccountActivityW = w();
        if (verifyAccountActivityW != null) {
            str = verifyAccountActivityW.f26065e;
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        this.f26320v = str;
        VerifyAccountActivity verifyAccountActivityW2 = w();
        this.f26321w = verifyAccountActivityW2 != null ? verifyAccountActivityW2.q() : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("extra_data")) != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                Integer numH = C0525w.h(string, "scene");
                Intrinsics.checkNotNullExpressionValue(numH, "getJsonInt(...)");
                this.f26315A = numH.intValue();
                Integer numH2 = C0525w.h(string, "businessType");
                Intrinsics.checkNotNullExpressionValue(numH2, "getJsonInt(...)");
                this.f26316B = numH2.intValue();
                if (TextUtils.isEmpty(this.f26320v) && this.f26317C == 9) {
                    this.f26320v = C0525w.j(string, "suffix");
                }
                if (TextUtils.isEmpty(this.f26320v) && this.f26317C == 2) {
                    this.f26321w = C0525w.j(string, "suffix");
                }
            }
        }
        C0107d c0107d = this.f26318o;
        z(c0107d != null ? (PpTitleBar) c0107d.f683e : null);
        C0107d c0107d2 = this.f26318o;
        BaseVerifyAccountFragment.u(c0107d2 != null ? (PpTitleBar) c0107d2.f683e : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract.View
    public final void onGetSmsTokenFail(String reason) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(reason, "reason");
        E activity = getActivity();
        if (activity != null) {
            n.O(activity, 0, null, "OTP Authentication Failed", Integer.valueOf(F8.c.ac_quit_icon_3), null, null, reason, Integer.valueOf(k.core_confirm), null, null, null, null, null, null, false, 0, 8388211);
        }
        C0107d c0107d = this.f26318o;
        if (c0107d == null || (pinEntryView = ((OneTimeCodeV4View) c0107d.f682d).f28483b) == null) {
            return;
        }
        pinEntryView.setText("");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        OneTimeCodeV4View oneTimeCodeV4View;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 515) {
            String strZ1 = r0.z1(4, event.getEventContent());
            if (TextUtils.isDigitsOnly(strZ1)) {
                Pa.n0.g().s("PalmPay_SignUpOTP_autofill");
                C0107d c0107d = this.f26318o;
                if (c0107d == null || (oneTimeCodeV4View = (OneTimeCodeV4View) c0107d.f682d) == null) {
                    return;
                }
                oneTimeCodeV4View.setCode(strZ1);
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
        A(this.f26319p);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (i7 == 740) {
            this.f26319p = this.f26319p;
            if (r0.j(getActivity(), this.t, this.f26319p, 740, this)) {
                showLoadingDialog(true);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback
    public final void onReceiveUssdResponse(boolean z3, String str, CharSequence charSequence, int i7) {
        OneTimeCodeV4View oneTimeCodeV4View;
        showLoadingDialog(false);
        if (!z3) {
            A(str);
            return;
        }
        String strZ1 = r0.z1(4, charSequence);
        if (TextUtils.isEmpty(strZ1)) {
            A(str);
            return;
        }
        C0107d c0107d = this.f26318o;
        if (c0107d == null || (oneTimeCodeV4View = (OneTimeCodeV4View) c0107d.f682d) == null) {
            return;
        }
        oneTimeCodeV4View.setCode(strZ1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract.View
    public final void onSmsTokenReceived(SmsActionRsp.DataBean dataBean) {
        if (dataBean == null || TextUtils.isEmpty(dataBean.getSmsToken())) {
            return;
        }
        CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq = new CheckSecurityVerifyMethodReq();
        checkSecurityVerifyMethodReq.flowId = this.f26306j;
        checkSecurityVerifyMethodReq.verifyMethod = this.f26317C;
        HashMap<String, Object> verifyParams = new HashMap<>();
        checkSecurityVerifyMethodReq.verifyParams = verifyParams;
        Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
        verifyParams.put("otpToken", dataBean.getSmsToken());
        VerifyAccountActivity verifyAccountActivityW = w();
        if (verifyAccountActivityW != null) {
            verifyAccountActivityW.p(checkSecurityVerifyMethodReq);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void showLoadingView(boolean z3) {
        showLoadingDialog(z3);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new n0();
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract.View
    public final void updateSendSmsButton(boolean z3) {
        OneTimeCodeV4View oneTimeCodeV4View;
        C0107d c0107d = this.f26318o;
        if (c0107d == null || (oneTimeCodeV4View = (OneTimeCodeV4View) c0107d.f682d) == null) {
            return;
        }
        oneTimeCodeV4View.setSendOtcButtonState(z3);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment
    /* JADX INFO: renamed from: v */
    public final n0 t() {
        return new n0();
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment
    public final void x(CommonBeanResult it) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(it, "it");
        C0107d c0107d = this.f26318o;
        if (c0107d != null && (pinEntryView = ((OneTimeCodeV4View) c0107d.f682d).f28483b) != null) {
            pinEntryView.setText("");
        }
        super.x(it);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment
    public final void y(CommonBeanResult it) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(it, "it");
        C0107d c0107d = this.f26318o;
        if (c0107d != null && (pinEntryView = ((OneTimeCodeV4View) c0107d.f682d).f28483b) != null) {
            pinEntryView.setText("");
        }
        super.y(it);
    }
}
