package com.transsnet.palmpay.account.ui.activity;

import C0.P;
import C0.U;
import C9.C0139f;
import C9.Q;
import F8.d;
import F8.e;
import Fd.G;
import L6.b;
import N8.C0463g;
import Pa.C0525w;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.activity.u;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.transsnet.palmpay.account.bean.req.CheckSecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethod;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment;
import com.transsnet.palmpay.account.ui.viewmodel.VerifyAccountViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097g9.a0;
import p097g9.b0;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/verifyAccount")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/VerifyAccountActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/VerifyAccountViewModel;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVerifyAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyAccountActivity.kt\ncom/transsnet/palmpay/account/ui/activity/VerifyAccountActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,543:1\n171#2,12:544\n215#2:556\n171#2,12:557\n215#2:569\n1761#3,3:570\n774#3:573\n865#3,2:574\n*S KotlinDebug\n*F\n+ 1 VerifyAccountActivity.kt\ncom/transsnet/palmpay/account/ui/activity/VerifyAccountActivity\n*L\n112#1:544,12\n112#1:556\n168#1:557,12\n168#1:569\n337#1:570,3\n352#1:573\n352#1:574,2\n*E\n"})
public final class VerifyAccountActivity extends BaseMvvmActivity<VerifyAccountViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f26062o = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SecurityVerifyMethodRsp f26066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NavHostFragment f26067g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P f26068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f26069j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent getIntent$default(a aVar, Activity activity, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                str2 = null;
            }
            if ((i7 & 8) != 0) {
                str3 = null;
            }
            return aVar.getIntent(activity, str, str2, str3);
        }

        public static /* synthetic */ void start$default(a aVar, Activity activity, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                str2 = null;
            }
            if ((i7 & 8) != 0) {
                str3 = null;
            }
            aVar.start(activity, str, str2, str3);
        }

        @NotNull
        public final Intent getIntent(@Nullable Activity activity, @NotNull String flowCode, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(flowCode, "flowCode");
            Intent intent = new Intent(activity, (Class<?>) VerifyAccountActivity.class);
            intent.putExtra("extra_type", flowCode);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("_number", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("_email", str2);
            }
            return intent;
        }

        public final void start(@Nullable Activity activity, @NotNull String flowCode, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(flowCode, "flowCode");
            ActivityUtils.startActivity(activity, getIntent(activity, flowCode, str, str2));
        }

        private a() {
        }
    }

    public static final BaseVerifyAccountFragment m(VerifyAccountActivity verifyAccountActivity) {
        Z childFragmentManager;
        List listF;
        NavHostFragment navHostFragment = verifyAccountActivity.f26067g;
        Fragment fragment = (navHostFragment == null || (childFragmentManager = navHostFragment.getChildFragmentManager()) == null || (listF = childFragmentManager.f17069c.f()) == null) ? null : (Fragment) listF.get(0);
        if (fragment instanceof BaseVerifyAccountFragment) {
            return (BaseVerifyAccountFragment) fragment;
        }
        return null;
    }

    public static final void n(VerifyAccountActivity verifyAccountActivity, SecurityVerifyMethodRsp securityVerifyMethodRsp) {
        SecurityVerifyMethod securityVerifyMethod;
        List<SecurityVerifyMethod> list = securityVerifyMethodRsp != null ? securityVerifyMethodRsp.verifyMethodList : null;
        List<SecurityVerifyMethod> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            SecurityVerifyMethodRsp securityVerifyMethodRsp2 = verifyAccountActivity.f26066f;
            List<SecurityVerifyMethod> list3 = securityVerifyMethodRsp2 != null ? securityVerifyMethodRsp2.verifyMethodList : null;
            if (list3 == null || list3.isEmpty()) {
                verifyAccountActivity.finish();
                return;
            }
        }
        if ((list != null ? list.size() : 0) <= 1) {
            if (list == null || (securityVerifyMethod = list.get(0)) == null) {
                return;
            }
            verifyAccountActivity.r(securityVerifyMethod, securityVerifyMethodRsp.flowId, true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_data", ((Gson) C0525w.f().f7166b).toJson(securityVerifyMethodRsp));
        bundle.putString("extra_id", securityVerifyMethodRsp != null ? securityVerifyMethodRsp.flowId : null);
        P p3 = verifyAccountActivity.f26068i;
        if (p3 != null) {
            p3.h(d.fragment_verify_account_id_type, bundle, new U(false, false, d.fragment_empty, true, false, -1, -1, -1, -1));
        }
    }

    public static final boolean o(VerifyAccountActivity verifyAccountActivity, Function0 function0) {
        if (verifyAccountActivity.isFinishing() || verifyAccountActivity.isDestroyed()) {
            return false;
        }
        try {
            function0.invoke();
            return true;
        } catch (WindowManager.BadTokenException e10) {
            F6.d.c(verifyAccountActivity.TAG, "showAlertDialog BadTokenException", e10);
            return false;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_verify_account;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        if (getIntent() != null) {
            return !getIntent().getBooleanExtra("extra_use_night_mode", false);
        }
        return super.isForceNoNightMode();
    }

    public final void p(CheckSecurityVerifyMethodReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        VerifyAccountViewModel verifyAccountViewModel = (VerifyAccountViewModel) l();
        verifyAccountViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(verifyAccountViewModel, new a0(req, null), verifyAccountViewModel.f26446f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((VerifyAccountViewModel) l()).f26445e;
        if (lVar != null) {
            lVar.e(this, new G(new Q(23, this, this), 9));
        }
        l lVar2 = ((VerifyAccountViewModel) l()).f26446f;
        if (lVar2 != null) {
            lVar2.e(this, new G(new C0139f(17, this, this), 9));
        }
        SecurityVerifyMethodReq req = new SecurityVerifyMethodReq();
        req.flowCode = this.f26063c;
        req.phone = this.f26064d;
        VerifyAccountViewModel verifyAccountViewModel = (VerifyAccountViewModel) l();
        verifyAccountViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(verifyAccountViewModel, new b0(req, null), verifyAccountViewModel.f26445e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final String q() {
        if (!TextUtils.isEmpty(this.f26064d) || !BaseApplication.hasLogin()) {
            String str = this.f26064d;
            return str == null ? "" : str;
        }
        String phoneNumber = BaseApplication.get().getUser().getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber(...)");
        return phoneNumber;
    }

    public final void r(SecurityVerifyMethod securityVerifyMethod, String str, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_type", securityVerifyMethod.verifyMethod);
        bundle.putString("extra_data", securityVerifyMethod.extendInfo);
        bundle.putString("extra_id", str);
        int i7 = securityVerifyMethod.verifyMethod;
        if (i7 == 1) {
            P p3 = this.f26068i;
            if (p3 != null) {
                p3.h(d.fragment_verify_account_pin, bundle, z3 ? new U(false, false, d.fragment_empty, true, false, -1, -1, -1, -1) : null);
                return;
            }
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 == 5) {
                    P p10 = this.f26068i;
                    if (p10 != null) {
                        p10.h(d.fragment_verify_account_face, bundle, new U(false, false, d.fragment_empty, true, false, -1, -1, -1, -1));
                        return;
                    }
                    return;
                }
                if (i7 == 6) {
                    P p11 = this.f26068i;
                    if (p11 != null) {
                        p11.h(d.fragment_verify_account_psw, bundle, z3 ? new U(false, false, d.fragment_empty, true, false, -1, -1, -1, -1) : null);
                        return;
                    }
                    return;
                }
                if (i7 != 7) {
                    if (i7 != 9) {
                        return;
                    }
                }
            }
            P p12 = this.f26068i;
            if (p12 != null) {
                p12.h(d.fragment_verify_account_id, bundle, z3 ? new U(false, false, d.fragment_empty, true, false, -1, -1, -1, -1) : null);
                return;
            }
            return;
        }
        P p13 = this.f26068i;
        if (p13 != null) {
            p13.h(d.fragment_verify_account_otp, bundle, z3 ? new U(false, false, d.fragment_empty, true, false, -1, -1, -1, -1) : null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        this.f26069j = findViewById(d.rootView);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().D(d.nav_host_fragment);
        this.f26067g = navHostFragment;
        this.f26068i = navHostFragment != null ? navHostFragment.f() : null;
        this.f26064d = getQueryParameter("_number");
        this.f26065e = getQueryParameter("_email");
        this.f26063c = getQueryParameter("extra_type");
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 7));
    }
}
