package com.transsnet.palmpay.account.ui.activity.quota;

import C9.C0139f;
import F8.d;
import Fd.G;
import La.i;
import O8.a;
import O8.b;
import Pa.C0525w;
import Pa.i0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.u;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.transsnet.palmpay.account.bean.req.ApplyT3QuotaReq;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaManageFragment;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p038ca.e;
import p097g9.P;
import p140j8.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/tier3_quota")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/quota/Tier3QuotaManageActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/PalmPayLevelViewModel;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTier3QuotaManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tier3QuotaManageActivity.kt\ncom/transsnet/palmpay/account/ui/activity/quota/Tier3QuotaManageActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n171#2,12:177\n215#2:189\n171#2,12:190\n215#2:202\n574#3,4:203\n1#4:207\n*S KotlinDebug\n*F\n+ 1 Tier3QuotaManageActivity.kt\ncom/transsnet/palmpay/account/ui/activity/quota/Tier3QuotaManageActivity\n*L\n49#1:177,12\n49#1:189\n65#1:190,12\n65#1:202\n80#1:203,4\n*E\n"})
public final class Tier3QuotaManageActivity extends BaseMvvmActivity<PalmPayLevelViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26091f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f26092c = new e(this, null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ApplyT3QuotaReq f26093d = new ApplyT3QuotaReq();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26094e = C2131j.b(new i(17));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return F8.e.ac_activity_t3_quota_manage;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((PalmPayLevelViewModel) l()).f26432g;
        if (lVar != null) {
            lVar.e(this, new G(new b(this, this, 0), 10));
        }
        l lVar2 = ((PalmPayLevelViewModel) l()).f26433i;
        if (lVar2 != null) {
            lVar2.e(this, new G(new b(this, this, 1), 10));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this));
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m(long j6) {
        Intent intentQ = i0.q(this);
        intentQ.putExtra("need_pin", false);
        intentQ.putExtra("extra_type", 2);
        intentQ.putExtra("extra_use_night_mode", true);
        e f28604i = getF28604i();
        if (f28604i != null) {
            f28604i.f(intentQ, new a(j6, this));
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        String string = savedInstanceState.getString("KEY_DATA");
        if (string != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                C0525w.f().getClass();
                Object objD = C0525w.d(string, ApplyT3QuotaReq.class);
                Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                this.f26093d = (ApplyT3QuotaReq) objD;
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        C0525w c0525wF = C0525w.f();
        outState.putString("KEY_DATA", ((Gson) c0525wF.f7166b).toJson(this.f26093d));
        super.onSaveInstanceState(outState);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle == null) {
            h.i(this, d.fragmentContainer, (Tier3QuotaManageFragment) this.f26094e.getValue());
        }
        u.a(getOnBackPressedDispatcher(), this, new C0139f(this, 18));
        PalmPayLevelViewModel palmPayLevelViewModel = (PalmPayLevelViewModel) l();
        if (palmPayLevelViewModel != null) {
            f.s(palmPayLevelViewModel, new P(1, null), palmPayLevelViewModel.f26433i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
