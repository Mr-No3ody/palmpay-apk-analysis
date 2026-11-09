package com.transsnet.palmpay.account.ui.activity;

import C0.AbstractC0130w;
import C0.P;
import C0.U;
import C9.C0138e;
import Ce.S;
import F8.d;
import F8.e;
import F8.h;
import N8.C0463g;
import N8.C0464h;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.activity.u;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.util.ActivityUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/identity_verification")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/IdentityVerificationActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationActivity.kt\ncom/transsnet/palmpay/account/ui/activity/IdentityVerificationActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,601:1\n1#2:602\n171#3,12:603\n215#3:615\n595#4,6:616\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationActivity.kt\ncom/transsnet/palmpay/account/ui/activity/IdentityVerificationActivity\n*L\n305#1:603,12\n305#1:615\n532#1:616,6\n*E\n"})
public final class IdentityVerificationActivity extends BaseActivity {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f25861A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SignUpRsp f25863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25865d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckIdentifyReq f25867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AddUserExtraInfoReq f25868g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PreCheckPhoneRsp f25869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25870j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public NavHostFragment f25871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public P f25872p;
    public ApplyBalanceV2Req t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PpTitleBar f25873v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f25874w;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_identity_verification;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final AddUserExtraInfoReq l() {
        if (!q()) {
            return null;
        }
        if (this.f25868g == null) {
            AddUserExtraInfoReq addUserExtraInfoReq = new AddUserExtraInfoReq();
            this.f25868g = addUserExtraInfoReq;
            Intent intent = getIntent();
            addUserExtraInfoReq.scene = intent != null ? intent.getStringExtra("scene") : null;
        }
        return this.f25868g;
    }

    public final ApplyBalanceV2Req m() {
        if (this.t == null) {
            ApplyBalanceV2Req applyBalanceV2Req = new ApplyBalanceV2Req(this.f25864c);
            this.t = applyBalanceV2Req;
            applyBalanceV2Req.temporaryToken = this.f25862a;
        }
        ApplyBalanceV2Req applyBalanceV2Req2 = this.t;
        Intrinsics.e(applyBalanceV2Req2);
        return applyBalanceV2Req2;
    }

    public final CheckIdentifyReq n() {
        if (this.f25867f == null) {
            CheckIdentifyReq checkIdentifyReq = new CheckIdentifyReq(this.f25864c);
            this.f25867f = checkIdentifyReq;
            checkIdentifyReq.temporaryToken = this.f25862a;
        }
        return this.f25867f;
    }

    public final void o() {
        Integer num;
        r0.o();
        Activity activityS = i0.S("/main/merchant_payment");
        boolean z3 = false;
        if (activityS != null) {
            ActivityUtils.finishToActivity(activityS, false);
            return;
        }
        i0.l();
        ActivityUtils.finishAllActivitiesExceptNewest();
        SignUpRsp signUpRsp = this.f25863b;
        if (TextUtils.isEmpty(signUpRsp != null ? signUpRsp.jumpPath : null)) {
            Postcard postcardWithBoolean = ARouter.getInstance().build("/main/home").withFlags(32768).withBoolean("FROM_REGISITER_PAGE", true);
            SignUpRsp signUpRsp2 = this.f25863b;
            if (signUpRsp2 != null && (num = signUpRsp2.rewardAbLinkTo) != null && num.intValue() == 1) {
                z3 = true;
            }
            postcardWithBoolean.withBoolean("JUMP_TO_SIGNUP_SUCCESS_PAGE", z3).navigation(this);
            return;
        }
        SignUpRsp signUpRsp3 = this.f25863b;
        if (!"/account/enableAutoSave".equals(signUpRsp3 != null ? signUpRsp3.jumpPath : null)) {
            SignUpRsp signUpRsp4 = this.f25863b;
            F.f(signUpRsp4 != null ? signUpRsp4.jumpPath : null, signUpRsp4 != null ? signUpRsp4.jumpType : null, signUpRsp4 != null ? signUpRsp4.jumpParams : null);
        } else {
            EnableCashBoxAutoSaveActivity.a aVar = EnableCashBoxAutoSaveActivity.f25851j;
            SignUpRsp signUpRsp5 = this.f25863b;
            aVar.launch(this, signUpRsp5 != null ? signUpRsp5.urlStep2 : null, this.f25864c);
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.f25864c = savedInstanceState.getString("mobileNo");
        this.f25866e = savedInstanceState.getString("fromPage");
        this.f25862a = savedInstanceState.getString("signUpToken");
        C0525w c0525wF = C0525w.f();
        String string = savedInstanceState.getString("mPreCheckPhoneRsp");
        c0525wF.getClass();
        this.f25869i = (PreCheckPhoneRsp) C0525w.d(string, PreCheckPhoneRsp.class);
        C0525w c0525wF2 = C0525w.f();
        String string2 = savedInstanceState.getString("checkReq");
        c0525wF2.getClass();
        this.f25867f = (CheckIdentifyReq) C0525w.d(string2, CheckIdentifyReq.class);
        C0525w c0525wF3 = C0525w.f();
        String string3 = savedInstanceState.getString("ApplyBalanceV2Req");
        c0525wF3.getClass();
        this.t = (ApplyBalanceV2Req) C0525w.d(string3, ApplyBalanceV2Req.class);
        String string4 = savedInstanceState.getString("AddUserExtraInfoReq");
        if (string4 != null) {
            if (TextUtils.isEmpty(string4)) {
                string4 = null;
            }
            if (string4 != null) {
                this.f25868g = (AddUserExtraInfoReq) d0.l(AddUserExtraInfoReq.class, string4);
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putString("mobileNo", this.f25864c);
        outState.putString("fromPage", this.f25866e);
        outState.putString("signUpToken", this.f25862a);
        C0525w c0525wF = C0525w.f();
        outState.putString("mPreCheckPhoneRsp", ((Gson) c0525wF.f7166b).toJson(this.f25869i));
        C0525w c0525wF2 = C0525w.f();
        outState.putString("checkReq", ((Gson) c0525wF2.f7166b).toJson(n()));
        C0525w c0525wF3 = C0525w.f();
        outState.putString("ApplyBalanceV2Req", ((Gson) c0525wF3.f7166b).toJson(this.t));
        if (l() != null) {
            C0525w c0525wF4 = C0525w.f();
            outState.putString("AddUserExtraInfoReq", ((Gson) c0525wF4.f7166b).toJson(l()));
        }
        super.onSaveInstanceState(outState);
    }

    public final void p(AbstractC0130w abstractC0130w, AddUserExtraActionRsp result, Integer num) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.needIndustry) {
            if (num == null) {
                if (abstractC0130w != null) {
                    abstractC0130w.h(d.fragment_identity_verification_step_profile, null, null);
                    return;
                }
                return;
            } else {
                U u6 = new U(false, false, num.intValue(), true, false, -1, -1, -1, -1);
                if (abstractC0130w != null) {
                    abstractC0130w.h(d.fragment_identity_verification_step_profile, null, u6);
                    return;
                }
                return;
            }
        }
        if (!result.needAddress) {
            AddUserExtraInfoResultActivity.f25822d.start(this, result);
            finish();
        } else if (num == null) {
            if (abstractC0130w != null) {
                abstractC0130w.h(d.fragment_identity_verification_step_address, null, null);
            }
        } else {
            U u10 = new U(false, false, num.intValue(), true, false, -1, -1, -1, -1);
            if (abstractC0130w != null) {
                abstractC0130w.h(d.fragment_identity_verification_step_address, null, u10);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        boolean z3;
        P p3;
        List list = this.f25874w;
        if (list == null || !(!list.isEmpty())) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new C0464h(this, null), 2);
        }
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("_dialog_title");
                String stringExtra2 = intent.getStringExtra("_dialog_message");
                if (!TextUtils.isEmpty(stringExtra2)) {
                    n.O(this, 0, null, stringExtra, null, null, null, stringExtra2, Integer.valueOf(h.ac_confirm), null, null, null, null, null, null, false, 0, 8388219);
                }
            }
            PreCheckPhoneRsp preCheckPhoneRsp = this.f25869i;
            if (preCheckPhoneRsp == null || preCheckPhoneRsp.needFace) {
                return;
            }
            U u6 = new U(false, false, d.fragment_identity_verification_step_face, true, false, -1, -1, -1, -1);
            PreCheckPhoneRsp preCheckPhoneRsp2 = this.f25869i;
            if (preCheckPhoneRsp2 != null) {
                z3 = true;
                if (preCheckPhoneRsp2.isNeedNameVerify()) {
                    P p10 = this.f25872p;
                    if (p10 != null) {
                        p10.h(d.fragment_identity_verification_step_id, null, u6);
                        return;
                    }
                    return;
                }
            } else {
                z3 = true;
            }
            PreCheckPhoneRsp preCheckPhoneRsp3 = this.f25869i;
            if (preCheckPhoneRsp3 != null && preCheckPhoneRsp3.needIndustry == z3) {
                P p11 = this.f25872p;
                if (p11 != null) {
                    p11.h(d.fragment_identity_verification_step_profile, null, u6);
                    return;
                }
                return;
            }
            if (preCheckPhoneRsp3 == null || preCheckPhoneRsp3.needAddress != z3 || (p3 = this.f25872p) == null) {
                return;
            }
            p3.h(d.fragment_identity_verification_step_address, null, u6);
        }
    }

    public final boolean q() {
        return Intrinsics.c(this.f25866e, "FROM_EXTRA_INFO_PAGE");
    }

    public final boolean r() {
        return Intrinsics.c(this.f25866e, "FROM_LOGIN_PAGE");
    }

    public final void s(IdentityVerificationViewModel identityVerificationViewModel, Function1 onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        l lVar = identityVerificationViewModel != null ? identityVerificationViewModel.f26425j : null;
        if (lVar != null) {
            lVar.e(this, new C0138e(new S(this, this, onError, onError)));
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        PpTitleBar ppTitleBar = this.f25873v;
        if (ppTitleBar != null) {
            ppTitleBar.setTitle(charSequence);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView rightImageView1;
        ARouter.getInstance().inject(this);
        Intent intent = getIntent();
        if (intent != null) {
            this.f25864c = intent.getStringExtra("_number");
            this.f25866e = intent.getStringExtra("source");
            this.f25862a = intent.getStringExtra("_token");
            String stringExtra = intent.getStringExtra("extra_data");
            if (stringExtra != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    this.f25869i = (PreCheckPhoneRsp) d0.l(PreCheckPhoneRsp.class, stringExtra);
                }
            }
            String stringExtra2 = intent.getStringExtra("extra_data_1");
            if (stringExtra2 != null) {
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = null;
                }
                if (stringExtra2 != null) {
                    this.f25874w = (List) ((Gson) C0525w.f().f7166b).fromJson(stringExtra2, new TypeToken<ArrayList<SignUpRetainDialogConfig>>() { // from class: com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity$setupView$1$4$1
                    }.getType());
                }
            }
            String stringExtra3 = intent.getStringExtra("kycPreCheckResults");
            if (stringExtra3 != null) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    stringExtra3 = null;
                }
                if (stringExtra3 != null) {
                    this.f25869i = (PreCheckPhoneRsp) d0.l(PreCheckPhoneRsp.class, stringExtra3);
                }
            }
        }
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().D(d.nav_host_fragment);
        this.f25871o = navHostFragment;
        this.f25872p = navHostFragment != null ? navHostFragment.f() : null;
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(d.titleBar);
        this.f25873v = ppTitleBar;
        if (ppTitleBar != null && (rightImageView1 = ppTitleBar.getRightImageView1()) != null) {
            rightImageView1.setOnClickListener(new K8.a(9));
        }
        PpTitleBar ppTitleBar2 = this.f25873v;
        if (ppTitleBar2 != null) {
            ppTitleBar2.setBackButtonClickListener(new Je.l(this, 18));
        }
        String str = this.f25866e;
        if (str != null) {
            HashMap map = new HashMap();
            map.put(LogConstants.Autotrack.ELEMENT_EXTRA_TYPE, str);
            AutoTrackUtil.trackActivityProperties(this, map);
        }
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 1));
    }

    public final void t(String str) {
        Intent intent = new Intent();
        intent.putExtra("_token", str);
        setResult(-1, intent);
        finish();
    }
}
