package com.transsnet.palmpay.account.ui.activity;

import F6.d;
import F8.e;
import La.i;
import M3.f;
import M7.s;
import N8.C0463g;
import N8.q0;
import Pa.AbstractC0526x;
import Pa.C0525w;
import Pa.T;
import Pa.r0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.u;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepOtcFragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.m;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "注册/SignUp", path = "/account/signup")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/SignUpActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSignUpActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpActivity.kt\ncom/transsnet/palmpay/account/ui/activity/SignUpActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,502:1\n1869#2,2:503\n1#3:505\n*S KotlinDebug\n*F\n+ 1 SignUpActivity.kt\ncom/transsnet/palmpay/account/ui/activity/SignUpActivity\n*L\n447#1:503,2\n*E\n"})
public final class SignUpActivity extends BaseActivity implements EasyPermissions$PermissionCallbacks, CancelAdapt {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f26029C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f26030A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f26031B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SignUpReq f26032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26038g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26040j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26042p;
    public Long t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PreCheckPhoneRsp f26044w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26041o = C2131j.b(new f(this, 4));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f26043v = C2131j.b(new i(16));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@Nullable Context context, @Nullable String str) {
            if (context != null) {
                try {
                    Intent intent = new Intent(context, (Class<?>) SignUpActivity.class);
                    if (!TextUtils.isEmpty(str)) {
                        intent.putExtra("_number", str);
                    }
                    context.startActivity(intent);
                } catch (Exception e10) {
                    d.c("SingUp", "start activity", e10);
                }
            }
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_sign_up;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getNetworkCheckAvailable() {
        return 3;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        c.b().j(this);
        T.b(-4).execute(new s(this, 5));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final Fragment l() {
        return getSupportFragmentManager().D(F8.d.fragmentContainer);
    }

    public final SignUpReq m() {
        if (this.f26032a == null) {
            this.f26032a = new SignUpReq();
        }
        return this.f26032a;
    }

    public final void n() {
        try {
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
            Intent intent = new Intent();
            intent.setClassName(AppUtils.getAppPackageName(), "com.transsnet.palmpay.ui.activity.HomeActivity");
            if (activityIsActivityExistsInStack != null) {
                intent.setFlags(67239936);
                activityIsActivityExistsInStack.startActivity(intent);
                return;
            }
            if (!TextUtils.isEmpty("FROM_REGISITER_PAGE")) {
                intent.putExtra("extra_type", "FROM_REGISITER_PAGE");
            }
            intent.addFlags(32768);
            startActivity(intent);
            if (Build.VERSION.SDK_INT > 34) {
                overrideActivityTransition(1, 0, m.cv_anim_keep_activity_2s);
            } else {
                overridePendingTransition(0, m.cv_anim_keep_activity_2s);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final boolean o() {
        String str;
        Long l5 = this.t;
        if ((l5 != null ? l5.longValue() : 0L) < System.currentTimeMillis() || TextUtils.isEmpty(this.f26042p)) {
            return false;
        }
        String str2 = this.f26042p;
        Intrinsics.e(str2);
        SignUpReq signUpReqM = m();
        if (signUpReqM == null || (str = signUpReqM.mobileNo) == null) {
            str = "";
        }
        return y.m(str2, str, false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        c.b().l(this);
        ((Handler) this.f26043v.getValue()).removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 576) {
            if (l() instanceof SignUpStep1Fragment) {
                Fragment fragmentL = l();
                Intrinsics.f(fragmentL, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment");
                SingleAdView singleAdView = ((SignUpStep1Fragment) fragmentL).f26253B;
                if (singleAdView != null) {
                    singleAdView.refreshData();
                }
            }
            Object eventObj = event.getEventObj();
            if (eventObj != null) {
                if (!(eventObj instanceof List) || ((Collection) eventObj).isEmpty()) {
                    eventObj = null;
                }
                if (eventObj != null) {
                    q(K.b(eventObj));
                }
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        this.f26040j = intent.getStringExtra("business_path");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        showLoadingDialog(false);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ActivityResultCaller activityResultCallerL = l();
        if (activityResultCallerL instanceof EasyPermissions$PermissionCallbacks) {
            ((EasyPermissions$PermissionCallbacks) activityResultCallerL).onPermissionsDenied(i7, list);
        }
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ActivityResultCaller activityResultCallerL = l();
        if (activityResultCallerL instanceof EasyPermissions$PermissionCallbacks) {
            ((EasyPermissions$PermissionCallbacks) activityResultCallerL).onPermissionsGranted(i7, list);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (p367ya.c.a()) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/update");
        }
    }

    public final void p(String str, boolean z3, PreCheckPhoneRsp preCheckPhoneRsp) {
        try {
            Intent intent = new Intent(this, (Class<?>) LogInActivity.class);
            if (!TextUtils.isEmpty(this.f26035d)) {
                intent.putExtra("source", this.f26035d);
            }
            if (!TextUtils.isEmpty(this.f26040j)) {
                intent.putExtra("business_path", this.f26040j);
            }
            intent.putExtra("_input_number", str);
            if (preCheckPhoneRsp != null) {
                intent.putExtra("extra_data_1", ((Gson) C0525w.f().f7166b).toJson(preCheckPhoneRsp));
            }
            intent.putExtra("extra_data", this.f26037f);
            intent.putExtra("extra_flag", z3);
            AbstractC0526x.a(this, intent);
            h.a(this, p025ba.a.core_anim_fade_in, p025ba.a.core_anim_fade_out);
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        SignUpReq signUpReq = this.f26032a;
        if (signUpReq != null) {
            signUpReq.mobileNo = this.f26033b;
        }
        if (bundle == null) {
            Z supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1161a c1161a = new C1161a(supportFragmentManager);
            Intrinsics.checkNotNullExpressionValue(c1161a, "beginTransaction(...)");
            if (l() instanceof SignUpStep1Fragment) {
                return;
            }
            c1161a.e(F8.d.fragmentContainer, SignUpStep1Fragment.f26251u0.newInstance(), null);
            c1161a.c("SignUpStep1Fragment");
            c1161a.h(true);
        }
    }

    public final void q(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.f26030A == null) {
            this.f26030A = new ArrayList();
        }
        ArrayList arrayList = this.f26030A;
        if (arrayList != null) {
            arrayList.addAll(list2);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0.D1(this, ((SignUpRetainDialogConfig) it.next()).imageUrl);
        }
    }

    public final void r(int i7, String str) {
        SignUpReq signUpReqM = m();
        if (signUpReqM != null) {
            signUpReqM.smsToken = str;
            if (TextUtils.isEmpty(str)) {
                this.t = 0L;
                this.f26042p = null;
            } else {
                this.f26042p = q0.y(signUpReqM.mobileNo, "_", str);
                this.t = Long.valueOf((((long) i7) * 1000) + System.currentTimeMillis());
            }
        }
    }

    public final void s() {
        if (l() instanceof SignUpStepInputPinV2Fragment) {
            return;
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(F8.d.fragmentContainer, SignUpStepInputPinV2Fragment.f26273A.newInstance(), null);
        c1161aE.c("SignUpStepInputPinV2Fragment");
        Intrinsics.checkNotNullExpressionValue(c1161aE, "addToBackStack(...)");
        c1161aE.f(m.cv_anim_slide_alpha_in_right, m.cv_anim_slide_alpha_out_left, m.cv_anim_slide_alpha_in_left, m.cv_anim_slide_alpha_out_right);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        SignUpReq signUpReq;
        ARouter.getInstance().inject(this);
        fillDisplayCutOutEdge();
        this.f26032a = new SignUpReq();
        if (PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(this.f26033b, BaseApplication.getCountryLocale(), false) && (signUpReq = this.f26032a) != null) {
            signUpReq.mobileNo = this.f26033b;
        }
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 6));
    }

    public final void t() {
        if (l() instanceof SignUpStepOtcFragment) {
            return;
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(F8.d.fragmentContainer, SignUpStepOtcFragment.f26279v.newInstance(), null);
        c1161aE.c(null);
        Intrinsics.checkNotNullExpressionValue(c1161aE, "addToBackStack(...)");
        c1161aE.f(m.cv_anim_slide_alpha_in_right, m.cv_anim_slide_alpha_out_left, m.cv_anim_slide_alpha_in_left, m.cv_anim_slide_alpha_out_right);
        c1161aE.h(true);
    }
}
