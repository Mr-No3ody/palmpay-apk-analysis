package com.transsnet.palmpay.account.ui.activity;

import C9.C0138e;
import C9.C0139f;
import F8.d;
import F8.e;
import F8.g;
import L6.b;
import N8.C0463g;
import Pa.C0525w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.u;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.account.bean.rsp.QueryGuardianInfoRsp;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097g9.C1706d;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/guardianApprove")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/GuardianApproveActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/AddGuardianViewModel;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuardianApproveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuardianApproveActivity.kt\ncom/transsnet/palmpay/account/ui/activity/GuardianApproveActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,197:1\n152#2:198\n169#2:199\n*S KotlinDebug\n*F\n+ 1 GuardianApproveActivity.kt\ncom/transsnet/palmpay/account/ui/activity/GuardianApproveActivity\n*L\n64#1:198\n64#1:199\n*E\n"})
public final class GuardianApproveActivity extends BaseMvvmActivity<AddGuardianViewModel> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25858e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NavHostFragment f25859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public QueryGuardianInfoRsp f25860d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@Nullable Context context, @Nullable String str) {
            Intent intent = new Intent(context, (Class<?>) GuardianApproveActivity.class);
            intent.putExtra("_token", str);
            return intent;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_common_fragment_container;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((AddGuardianViewModel) l()).f26413p;
        if (lVar != null) {
            lVar.e(this, new C0138e(new C0139f(this, 15), 0));
        }
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        if (this.f25859c != null) {
            return;
        }
        try {
            NavHostFragment navHostFragmentCreate$default = NavHostFragment.a.create$default(NavHostFragment.f17502e, g.ac_guardian_approve_nav_graph, null, 2, null);
            this.f25859c = navHostFragmentCreate$default;
            if (navHostFragmentCreate$default != null) {
                Z supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1161a c1161a = new C1161a(supportFragmentManager);
                c1161a.e(d.fragmentContainer, navHostFragmentCreate$default, null);
                c1161a.o(navHostFragmentCreate$default);
                c1161a.i();
            }
        } catch (Exception e10) {
            F6.d.c("GuardianApproveActivity", "installNavHostIfNeeded", e10);
        }
    }

    public final void n() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), true);
    }

    @Override // androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        QueryGuardianInfoRsp queryGuardianInfoRsp = this.f25860d;
        if (queryGuardianInfoRsp != null) {
            outState.putString("key_query_guardian_info_json", ((Gson) C0525w.f().f7166b).toJson(queryGuardianInfoRsp));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Fragment fragmentD = getSupportFragmentManager().D(d.fragmentContainer);
        this.f25859c = fragmentD instanceof NavHostFragment ? (NavHostFragment) fragmentD : null;
        if (bundle == null) {
            AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) l();
            addGuardianViewModel.getClass();
            f.s(addGuardianViewModel, new C1706d(1, null), addGuardianViewModel.f26413p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        } else {
            String string = bundle.getString("key_query_guardian_info_json");
            if (string != null) {
                this.f25860d = (QueryGuardianInfoRsp) d0.l(QueryGuardianInfoRsp.class, string);
            }
            if (this.f25859c == null) {
                m();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
    }
}
