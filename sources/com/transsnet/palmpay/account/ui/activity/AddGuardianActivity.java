package com.transsnet.palmpay.account.ui.activity;

import Ab.C;
import C0.P;
import C0.U;
import F8.d;
import F8.e;
import F8.g;
import L6.b;
import M3.f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.u;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.bean.rsp.GuardianConfig;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/addGuardian")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/AddGuardianActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddGuardianActivity extends BaseActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f25811i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NavHostFragment f25812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GuardianConfig f25817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f25818g = C2131j.b(new f(this, 3));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@Nullable Context context, @NotNull SignUpRsp rsp) {
            Intrinsics.checkNotNullParameter(rsp, "rsp");
            Intent intent = new Intent(context, (Class<?>) AddGuardianActivity.class);
            intent.putExtra("_token", rsp.teenagerToken);
            intent.putExtra("extra_type", rsp.teenagerNeedAuth);
            intent.putExtra("extra_title", rsp.teenagerTitle);
            intent.putExtra("extra_message", rsp.teenagerContent);
            if (context != null) {
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_common_fragment_container;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        u.a(getOnBackPressedDispatcher(), this, new C(this, 28));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final SubmitGuardianReq l() {
        return (SubmitGuardianReq) this.f25818g.getValue();
    }

    @Override // androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        GuardianConfig guardianConfig = this.f25817f;
        if (guardianConfig != null) {
            outState.putParcelable("guardian_config", guardianConfig);
        }
        String str = this.f25813b;
        if (str != null) {
            outState.putString("auth_token", str);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        int i7;
        if (bundle != null) {
            try {
                this.f25817f = (GuardianConfig) bundle.getParcelable("guardian_config");
                String string = bundle.getString("auth_token");
                if (string != null) {
                    this.f25813b = string;
                    l().authToken = string;
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            int i10 = this.f25814c;
            if (i10 != -1) {
                i7 = (i10 == 1 || i10 == 2) ? d.fragment_add_guardian_step_result : d.fragment_add_guardian_step_resubmit;
            } else {
                i7 = d.fragment_add_guardian_step_info;
            }
            NavHostFragment navHostFragmentCreate$default = NavHostFragment.a.create$default(NavHostFragment.f17502e, g.ac_add_guardian_nav_graph, null, 2, null);
            this.f25812a = navHostFragmentCreate$default;
            if (navHostFragmentCreate$default != null) {
                Z supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1161a c1161a = new C1161a(supportFragmentManager);
                c1161a.e(d.fragmentContainer, navHostFragmentCreate$default, null);
                c1161a.o(navHostFragmentCreate$default);
                c1161a.i();
                int i11 = d.fragment_add_guardian_step_info;
                if (i7 != i11) {
                    U u6 = new U(false, false, i11, true, false, -1, -1, -1, -1);
                    P pF = navHostFragmentCreate$default.f();
                    if (pF != null) {
                        pF.h(i7, null, u6);
                    }
                }
                Unit unit = Unit.f38893a;
            }
        } catch (Exception unused2) {
            Unit unit2 = Unit.f38893a;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
