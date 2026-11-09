package com.transsnet.palmpay.account.ui.fragment.signup;

import Bc.C0105b;
import Bc.C0107d;
import C0.G;
import C9.C0142i;
import F8.c;
import F8.d;
import L6.b;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
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
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p010a9.q;
import p010a9.r;
import p010a9.t;
import p025ba.k;
import p042cg.e;
import p042cg.f;
import p051d9.i0;
import p220oa.h;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\u000fB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/signup/SignUpStepOtcFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/i0;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/SignUpStepOtcContract$View;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/core/util/UssdUtils$UssdResponseCallback;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSignUpStepOtcFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpStepOtcFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/signup/SignUpStepOtcFragment\n+ 2 CharSequence.kt\nandroidx/core/text/CharSequenceKt\n*L\n1#1,550:1\n28#2:551\n*S KotlinDebug\n*F\n+ 1 SignUpStepOtcFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/signup/SignUpStepOtcFragment\n*L\n223#1:551\n*E\n"})
public final class SignUpStepOtcFragment extends BaseMVPFragment<i0> implements SignUpStepOtcContract.View, EasyPermissions$PermissionCallbacks, UssdUtils$UssdResponseCallback, CustomActionCallback, IAutoTrack {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f26279v = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0105b f26280j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26282p;
    public boolean t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SignUpStepOtcFragment newInstance() {
            SignUpStepOtcFragment signUpStepOtcFragment = new SignUpStepOtcFragment();
            signUpStepOtcFragment.setArguments(new Bundle());
            return signUpStepOtcFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final void fillAutoTrackMap(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        map.put("afEvt", Boolean.TRUE);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.View
    public final String getEmail() {
        OneTimeCodeV5View oneTimeCodeV5View;
        String securityEmail;
        C0105b c0105b = this.f26280j;
        return (c0105b == null || (oneTimeCodeV5View = (OneTimeCodeV5View) c0105b.f667g) == null || (securityEmail = oneTimeCodeV5View.getSecurityEmail()) == null) ? "" : securityEmail;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.View
    public final String getFullMobileNumber() {
        SignUpReq signUpReqM;
        String str;
        SignUpActivity signUpActivityV = v();
        return (signUpActivityV == null || (signUpReqM = signUpActivityV.m()) == null || (str = signUpReqM.mobileNo) == null) ? "" : str;
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "OtpVerification";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.t) {
            return false;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new t(this, null), 2);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.View
    public final void handleSendSmsRsp(SmsActionReq req, SendSmsNewV2Rsp response) {
        E activity;
        C0105b c0105b;
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(response, "response");
        if (Pa.i0.W(getActivity()) && !isDetached() && isAdded()) {
            if (!response.isSuccess()) {
                updateSendSmsButton(true);
                C0105b c0105b2 = this.f26280j;
                if (c0105b2 != null) {
                    ((OneTimeCodeV5View) c0105b2.f667g).h();
                }
                KeyboardUtils.hideSoftInput(getActivity());
                if (CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(response.getRespCode())) {
                    C0105b c0105b3 = this.f26280j;
                    if (c0105b3 != null) {
                        ((OneTimeCodeV5View) c0105b3.f667g).e();
                    }
                    p(response.getRespMsg());
                    return;
                }
                E activity2 = getActivity();
                if (activity2 != null) {
                    String respMsg = response.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                    h.t(activity2, respMsg);
                    return;
                }
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
                C0105b c0105b4 = this.f26280j;
                if (c0105b4 != null) {
                    ((OneTimeCodeV5View) c0105b4.f667g).l(dataBean.countdownSeconds * 1000);
                }
            } else {
                C0105b c0105b5 = this.f26280j;
                if (c0105b5 != null) {
                    ((OneTimeCodeV5View) c0105b5.f667g).l(60000);
                }
            }
            SendSmsNewV2Rsp.DataBean dataBean2 = response.data;
            if (dataBean2 != null && !dataBean2.realSend) {
                if (req.voiceSms != 3 || (c0105b = this.f26280j) == null) {
                    return;
                }
                ((TextView) c0105b.f663c).setText(new SpanUtils().append(getString(F8.h.ac_msg_verification_code_sent_to_email)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).append(" " + Pa.i0.R(req.email) + Consts.DOT).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
                return;
            }
            int i7 = req.voiceSms;
            if (i7 == 3) {
                E activity3 = getActivity();
                if (activity3 != null) {
                    S6.a aVar = S6.a.pay_SelectedOutline;
                    String strC = Pa.i0.C(req.voiceSms, req.phoneNo, req.getSecurityEmail());
                    Intrinsics.checkNotNullExpressionValue(strC, "getOtcSentMessage(...)");
                    h.z(activity3, strC, aVar, null, 53);
                }
                C0105b c0105b6 = this.f26280j;
                if (c0105b6 != null) {
                    ((TextView) c0105b6.f663c).setText(new SpanUtils().append(getString(F8.h.ac_msg_verification_code_sent_to_email)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).append(" " + Pa.i0.R(req.email) + Consts.DOT).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
                    return;
                }
                return;
            }
            if (i7 != 2) {
                if (i7 == 4 || (activity = getActivity()) == null) {
                    return;
                }
                S6.a aVar2 = S6.a.pay_SelectedOutline;
                String strC2 = Pa.i0.C(req.voiceSms, req.phoneNo, null);
                Intrinsics.checkNotNullExpressionValue(strC2, "getOtcSentMessage(...)");
                h.z(activity, strC2, aVar2, null, 53);
                return;
            }
            E activity4 = getActivity();
            if (activity4 != null) {
                S6.a aVar3 = S6.a.pay_SelectedOutline;
                String strC3 = Pa.i0.C(req.voiceSms, req.phoneNo, null);
                Intrinsics.checkNotNullExpressionValue(strC3, "getOtcSentMessage(...)");
                h.z(activity4, strC3, aVar3, null, 53);
            }
            C0105b c0105b7 = this.f26280j;
            if (c0105b7 != null) {
                ((TextView) c0105b7.f663c).setText(G.i("A verification code has been sent to your WhatsApp ").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).append(r0.Y(req.phoneNo)).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        SignUpReq signUpReqM;
        C0105b c0105b = this.f26280j;
        if (c0105b != null) {
            ((TextView) c0105b.f663c).setText(new SpanUtils().append(getString(F8.h.ac_msg_verification_code_sent_to)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).append(G.q(" +", r0.J(getFullMobileNumber()), " ", r0.Y(getFullMobileNumber()), Consts.DOT)).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext())).appendLine().append(getString(F8.h.ac_msg_please_take_alook)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext())).create());
        }
        C0105b c0105b2 = this.f26280j;
        if (c0105b2 != null) {
            OneTimeCodeV5View oneTimeCodeV5View = (OneTimeCodeV5View) c0105b2.f667g;
            SignUpActivity signUpActivityV = v();
            String str = (signUpActivityV == null || (signUpReqM = signUpActivityV.m()) == null) ? null : signUpReqM.mobileNo;
            oneTimeCodeV5View.f28501i = str;
            oneTimeCodeV5View.f28502j = 15;
            oneTimeCodeV5View.i(15, str, false);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_signup_step_otc, viewGroup, false);
        int i7 = d.ivMsgIcon;
        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = d.layoutHeader), viewInflate)) != null) {
            C0107d c0107dC = C0107d.c(viewM);
            i7 = d.securityKeyBoard;
            View viewM2 = p059e1.a.m(i7, viewInflate);
            if (viewM2 != null) {
                i7 = d.tvMessage;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.tvMessageTitle;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = d.viewOTC;
                        OneTimeCodeV5View oneTimeCodeV5View = (OneTimeCodeV5View) p059e1.a.m(i7, viewInflate);
                        if (oneTimeCodeV5View != null) {
                            C0105b c0105b = new C0105b((FrameLayout) viewInflate, c0107dC, viewM2, textView, textView2, oneTimeCodeV5View, 11);
                            this.f26280j = c0105b;
                            return c0105b;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        i0 i0Var;
        PreCheckPhoneRsp preCheckPhoneRsp;
        super.n();
        C0105b c0105b = this.f26280j;
        if (c0105b != null) {
            ((OneTimeCodeV5View) c0105b.f667g).setLoadingCallback(new C0142i(this, 14));
        }
        C0105b c0105b2 = this.f26280j;
        if (c0105b2 != null) {
            ((OneTimeCodeV5View) c0105b2.f667g).setSendCodeListener(new q(this));
        }
        C0105b c0105b3 = this.f26280j;
        if (c0105b3 != null) {
            ((OneTimeCodeV5View) c0105b3.f667g).setCodeEnteredListener(new q(this));
        }
        SignUpActivity signUpActivityV = v();
        boolean z3 = (signUpActivityV == null || (preCheckPhoneRsp = signUpActivityV.f26044w) == null) ? false : preCheckPhoneRsp.sendOtpResult;
        SignUpActivity signUpActivityV2 = v();
        if (signUpActivityV2 != null && !signUpActivityV2.o() && !z3 && (i0Var = (i0) this.f27328i) != null) {
            i0Var.getSmsCode(0);
        }
        if (z3) {
            try {
                Intrinsics.e(SmsRetriever.getClient(requireContext()).startSmsRetriever());
            } catch (Exception unused) {
            }
            C0105b c0105b4 = this.f26280j;
            if (c0105b4 != null) {
                ((OneTimeCodeV5View) c0105b4.f667g).l(60000);
            }
            E activity = getActivity();
            if (activity != null) {
                S6.a aVar = S6.a.pay_SelectedOutline;
                String strC = Pa.i0.C(0, getFullMobileNumber(), null);
                Intrinsics.checkNotNullExpressionValue(strC, "getOtcSentMessage(...)");
                h.z(activity, strC, aVar, null, 53);
            }
        }
        C0105b c0105b5 = this.f26280j;
        if (c0105b5 != null) {
            h.s((TextView) ((C0107d) c0105b5.f665e).f683e, false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        C0105b c0105b = this.f26280j;
        if (c0105b != null) {
            ((IconicsImageView) ((C0107d) c0105b.f665e).f681c).setOnClickListener(new r(this, 0));
        }
        C0105b c0105b2 = this.f26280j;
        if (c0105b2 != null) {
            ((IconicsImageView) ((C0107d) c0105b2.f665e).f682d).setOnClickListener(new W8.d(20));
        }
        C0105b c0105b3 = this.f26280j;
        if (c0105b3 == null) {
            return 0;
        }
        OneTimeCodeV5View.d((OneTimeCodeV5View) c0105b3.f667g, c0105b3.f666f);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        OneTimeCodeV5View oneTimeCodeV5View;
        C0105b c0105b = this.f26280j;
        if (c0105b != null && (oneTimeCodeV5View = (OneTimeCodeV5View) c0105b.f667g) != null) {
            oneTimeCodeV5View.j();
        }
        Handler handlerJ = j();
        if (handlerJ != null) {
            handlerJ.removeCallbacksAndMessages(null);
        }
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.View
    public final void onGetSmsTokenFail(String reason) {
        p142ja.f fVar;
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(reason, "reason");
        E activity = getActivity();
        if (activity != null) {
            n.O(activity, 0, null, "Code Authentication Failed", Integer.valueOf(c.ac_quit_icon_3), null, null, reason, Integer.valueOf(k.core_confirm), null, null, null, null, null, null, false, 0, 8388211);
        }
        C0105b c0105b = this.f26280j;
        if (c0105b != null && (fVar = ((OneTimeCodeV5View) c0105b.f667g).f28496c) != null && (pinEntryView = fVar.smsCodeView) != null) {
            pinEntryView.setText("");
        }
        C0105b c0105b2 = this.f26280j;
        if (c0105b2 != null) {
            ((OneTimeCodeV5View) c0105b2.f667g).h();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        OneTimeCodeV5View oneTimeCodeV5View;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 515) {
            String strZ1 = r0.z1(4, event.getEventContent());
            Intrinsics.e(strZ1);
            if (TextUtils.isDigitsOnly(strZ1)) {
                n0.g().s("PalmPay_SignUpOTP_autofill");
                C0105b c0105b = this.f26280j;
                if (c0105b == null || (oneTimeCodeV5View = (OneTimeCodeV5View) c0105b.f667g) == null) {
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
        u(this.f26281o);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (i7 == 740) {
            this.f26281o = this.f26281o;
            if (r0.j(getActivity(), this.f26282p, this.f26281o, 740, this)) {
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
        C0105b c0105b = this.f26280j;
        if (c0105b == null || (oneTimeCodeV5View = (OneTimeCodeV5View) c0105b.f667g) == null) {
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

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.View
    public final void onSmsTokenReceived(SmsActionRsp.DataBean dataBean) {
        if (dataBean == null || TextUtils.isEmpty(dataBean.getSmsToken())) {
            return;
        }
        try {
            SignUpActivity signUpActivityV = v();
            if (signUpActivityV != null) {
                signUpActivityV.r(dataBean.getEffectiveSeconds(), dataBean.getSmsToken());
                signUpActivityV.getSupportFragmentManager().T(0, "SignUpStep1Fragment");
                signUpActivityV.s();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new i0();
    }

    public final void u(String str) {
        try {
            PhoneUtils.dial(Uri.encode(str));
        } catch (Exception unused) {
            ToastUtils.showLong(getString(F8.h.ac_no_dial_application), new Object[0]);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.View
    public final void updateSendSmsButton(boolean z3) {
        OneTimeCodeV5View oneTimeCodeV5View;
        C0105b c0105b = this.f26280j;
        if (c0105b == null || (oneTimeCodeV5View = (OneTimeCodeV5View) c0105b.f667g) == null) {
            return;
        }
        oneTimeCodeV5View.setSendOtcButtonState(z3);
    }

    public final SignUpActivity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof SignUpActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SignUpActivity");
        return (SignUpActivity) e10;
    }
}
