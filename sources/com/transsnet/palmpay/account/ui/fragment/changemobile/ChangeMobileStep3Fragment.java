package com.transsnet.palmpay.account.ui.fragment.changemobile;

import Bc.p;
import C0.G;
import Dd.b;
import F8.e;
import O6.c;
import Pa.i0;
import Pa.r0;
import R8.d;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.ui.activity.ChangeMobileActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV4View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p051d9.C1612i;
import p220oa.h;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/changemobile/ChangeMobileStep3Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/i;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/ChangeMobileContract$View;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/core/util/UssdUtils$UssdResponseCallback;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChangeMobileStep3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeMobileStep3Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/changemobile/ChangeMobileStep3Fragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,314:1\n694#2,50:315\n*S KotlinDebug\n*F\n+ 1 ChangeMobileStep3Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/changemobile/ChangeMobileStep3Fragment\n*L\n211#1:315,50\n*E\n"})
public final class ChangeMobileStep3Fragment extends BaseMVPFragment<C1612i> implements ChangeMobileContract.View, EasyPermissions$PermissionCallbacks, UssdUtils$UssdResponseCallback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f26126w = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26127j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26129p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f26130v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ChangeMobileStep3Fragment newInstance(@Nullable String str) {
            ChangeMobileStep3Fragment changeMobileStep3Fragment = new ChangeMobileStep3Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("mNewNumber", str);
            changeMobileStep3Fragment.setArguments(bundle);
            return changeMobileStep3Fragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void handChangeNumberResult(CommonResult rsp) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (rsp.isSuccess()) {
            if (BaseApplication.hasLogin()) {
                User userB = BaseApplication.get().getUserDataSource().b();
                userB.setPhoneNumber(this.f26127j);
                BaseApplication.get().getUserDataSource().getClass();
                p156ka.a.c(userB);
            }
            p367ya.a.d().f44149a.i("last_phone_number", this.f26127j);
            E activity = getActivity();
            if (activity != null) {
                h.z(activity, "Changed Successfully", null, new b(this, 10), 29);
                return;
            }
            return;
        }
        p pVar = this.f26130v;
        if (pVar != null && (pinEntryView = ((OneTimeCodeV4View) pVar.f813d).f28483b) != null) {
            pinEntryView.setText("");
        }
        E activity2 = getActivity();
        if (activity2 != null) {
            String respMsg = rsp.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            int i7 = k.core_confirm;
            d dVar = new d(this, 6);
            int i10 = k.core_retry;
            int i11 = k.core_opps;
            c cVar = new c(activity2);
            cVar.f6614u = 1;
            cVar.e(i11);
            cVar.f6598d = respMsg;
            cVar.d(i7, dVar);
            cVar.c(i10, null);
            cVar.f6605k = true;
            cVar.f6606l = 1;
            G.v(cVar, false, false);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void handCheckSmsResult(boolean z3, String message) {
        PinEntryView pinEntryView;
        Intrinsics.checkNotNullParameter(message, "message");
        if (z3) {
            return;
        }
        p pVar = this.f26130v;
        if (pVar != null && (pinEntryView = ((OneTimeCodeV4View) pVar.f813d).f28483b) != null) {
            pinEntryView.setText("");
        }
        E activity = getActivity();
        if (activity != null) {
            h.t(activity, message);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void handSendMessageResult(CommonResult commonResult) {
        p pVar;
        if ((commonResult == null || !commonResult.isSuccess()) && (pVar = this.f26130v) != null) {
            ((OneTimeCodeV4View) pVar.f813d).setSendOtcButtonState(true);
        }
        if (commonResult == null || commonResult.isSuccess()) {
            return;
        }
        if (CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(commonResult.getRespCode())) {
            p pVar2 = this.f26130v;
            if (pVar2 != null) {
                ((OneTimeCodeV4View) pVar2.f813d).d();
            }
            p(commonResult.getRespMsg());
            return;
        }
        E activity = getActivity();
        if (activity != null) {
            String respMsg = commonResult.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            h.t(activity, respMsg);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void handSendSmsMessageResult(SendSmsNewV2Rsp sendSmsNewV2Rsp) {
        p pVar;
        if ((sendSmsNewV2Rsp == null || !sendSmsNewV2Rsp.isSuccess()) && (pVar = this.f26130v) != null) {
            ((OneTimeCodeV4View) pVar.f813d).setSendOtcButtonState(true);
        }
        if (sendSmsNewV2Rsp != null) {
            if (sendSmsNewV2Rsp.isSuccess()) {
                SendSmsNewV2Rsp.DataBean dataBean = sendSmsNewV2Rsp.data;
                if (dataBean != null) {
                    p pVar2 = this.f26130v;
                    if (pVar2 != null) {
                        ((OneTimeCodeV4View) pVar2.f813d).i(dataBean.countdownSeconds * 1000);
                        return;
                    }
                    return;
                }
                p pVar3 = this.f26130v;
                if (pVar3 != null) {
                    ((OneTimeCodeV4View) pVar3.f813d).i(60000);
                    return;
                }
                return;
            }
            if (CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(sendSmsNewV2Rsp.getRespCode())) {
                p pVar4 = this.f26130v;
                if (pVar4 != null) {
                    ((OneTimeCodeV4View) pVar4.f813d).d();
                }
                p(sendSmsNewV2Rsp.getRespMsg());
                return;
            }
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String respMsg = sendSmsNewV2Rsp.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            h.t(contextRequireContext, respMsg);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_change_mobile_step3, viewGroup, false);
        int i7 = F8.d.titleBar;
        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = F8.d.tvMessage;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = F8.d.viewOTC;
                OneTimeCodeV4View oneTimeCodeV4View = (OneTimeCodeV4View) p059e1.a.m(i7, viewInflate);
                if (oneTimeCodeV4View != null) {
                    p pVar = new p((LinearLayout) viewInflate, textView, oneTimeCodeV4View, 8);
                    this.f26130v = pVar;
                    return pVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        x(0);
        p pVar = this.f26130v;
        if (pVar != null) {
            ((OneTimeCodeV4View) pVar.f813d).setSendOtcButtonState(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("mNewNumber", "") : null;
        this.f26127j = string;
        p pVar = this.f26130v;
        if (pVar != null) {
            ((OneTimeCodeV4View) pVar.f813d).setMobileNumber(string);
        }
        p pVar2 = this.f26130v;
        if (pVar2 != null) {
            ((OneTimeCodeV4View) pVar2.f813d).setCodeEnteredListener(new S8.a(this));
        }
        p pVar3 = this.f26130v;
        if (pVar3 != null) {
            ((OneTimeCodeV4View) pVar3.f813d).setSendCodeListener(new S8.a(this));
        }
        y();
        return 0;
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        v(this.f26129p);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (i7 == 740) {
            u(this.f26129p);
        }
    }

    @Override // com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback
    public final void onReceiveUssdResponse(boolean z3, String str, CharSequence charSequence, int i7) {
        OneTimeCodeV4View oneTimeCodeV4View;
        showLoadingDialog(false);
        if (!z3) {
            v(str);
            return;
        }
        String strZ1 = r0.z1(4, charSequence);
        if (TextUtils.isEmpty(strZ1)) {
            v(str);
            return;
        }
        p pVar = this.f26130v;
        if (pVar == null || (oneTimeCodeV4View = (OneTimeCodeV4View) pVar.f813d) == null) {
            return;
        }
        oneTimeCodeV4View.setCode(strZ1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ChangeMobileActivity changeMobileActivity;
        super.onResume();
        if (!(getActivity() instanceof ChangeMobileActivity) || (changeMobileActivity = (ChangeMobileActivity) getActivity()) == null) {
            return;
        }
        changeMobileActivity.initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, getContext()));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1612i();
    }

    public final void u(String str) {
        this.f26129p = str;
        if (r0.j(getActivity(), this.t, this.f26129p, 740, this)) {
            showLoadingDialog(true);
        }
    }

    public final void v(String str) {
        try {
            PhoneUtils.dial(Uri.encode(str));
        } catch (Exception unused) {
            ToastUtils.showLong(getString(F8.h.ac_no_dial_application), new Object[0]);
        }
    }

    public final void w() {
        if (BaseApplication.hasLogin()) {
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.SettingsActivity");
            if (activityIsActivityExistsInStack != null) {
                ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                return;
            } else {
                i0.H(null);
                return;
            }
        }
        ActivityUtils.finishAllActivitiesExceptNewest();
        com.palmpay.lib.apm.launchcounter.util.d.H("/account/login", "_number", this.f26127j);
        E activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void x(int i7) {
        OneTimeCodeV4View oneTimeCodeV4View;
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = 3;
        smsActionReq.phoneNo = this.f26127j;
        smsActionReq.voiceSms = i7;
        smsActionReq.codeCount = 4;
        p pVar = this.f26130v;
        smsActionReq.email = (pVar == null || (oneTimeCodeV4View = (OneTimeCodeV4View) pVar.f813d) == null) ? null : oneTimeCodeV4View.getEmail();
        C1612i c1612i = (C1612i) this.f27328i;
        if (c1612i != null) {
            c1612i.sendSms(smsActionReq);
        }
    }

    public final void y() {
        TextView textView;
        OneTimeCodeV4View oneTimeCodeV4View;
        String strN = i0.n(r0.w0(this.f26127j), false);
        if (this.f26128o == 3) {
            p pVar = this.f26130v;
            strN = i0.R((pVar == null || (oneTimeCodeV4View = (OneTimeCodeV4View) pVar.f813d) == null) ? null : oneTimeCodeV4View.getEmail());
        }
        String string = getString(F8.h.ac_msg_sms_will_sent_2, strN);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        p pVar2 = this.f26130v;
        if (pVar2 == null || (textView = (TextView) pVar2.f812c) == null) {
            return;
        }
        textView.setText(Html.fromHtml(string, 0));
    }
}
