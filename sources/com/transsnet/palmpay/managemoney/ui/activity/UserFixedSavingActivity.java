package com.transsnet.palmpay.managemoney.ui.activity;

import N8.q0;
import Pa.i0;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.managemoney.bean.resp.GetIdentityResp;
import com.transsnet.palmpay.managemoney.ui.fragment.NewUserIntroductionFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OldUserFixedSavingViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/loading_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/UserFixedSavingActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/OldUserFixedSavingViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserFixedSavingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserFixedSavingActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/UserFixedSavingActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,160:1\n260#2,10:161\n296#2:171\n115#2,8:172\n145#2:180\n*S KotlinDebug\n*F\n+ 1 UserFixedSavingActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/UserFixedSavingActivity\n*L\n78#1:161,10\n78#1:171\n84#1:172,8\n84#1:180\n*E\n"})
public final class UserFixedSavingActivity extends BaseMvvmActivity<OldUserFixedSavingViewModel> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f32209g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32210c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f32211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32213f;

    public UserFixedSavingActivity() {
        final int i7 = 0;
        this.f32212e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserFixedSavingActivity f32220b;

            {
                this.f32220b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Integer intOrNull;
                int iIntValue = 0;
                UserFixedSavingActivity userFixedSavingActivity = this.f32220b;
                switch (i7) {
                    case 0:
                        int i10 = UserFixedSavingActivity.f32209g;
                        return Boolean.valueOf(userFixedSavingActivity.getIntent().getBooleanExtra("savingNewer", false));
                    default:
                        int i11 = UserFixedSavingActivity.f32209g;
                        String stringExtra = userFixedSavingActivity.getIntent().getStringExtra("savingTab");
                        if (stringExtra != null && (intOrNull = StringsKt.toIntOrNull(stringExtra)) != null) {
                            iIntValue = intOrNull.intValue();
                        }
                        return Integer.valueOf(iIntValue);
                }
            }
        });
        final int i10 = 1;
        this.f32213f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserFixedSavingActivity f32220b;

            {
                this.f32220b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Integer intOrNull;
                int iIntValue = 0;
                UserFixedSavingActivity userFixedSavingActivity = this.f32220b;
                switch (i10) {
                    case 0:
                        int i11 = UserFixedSavingActivity.f32209g;
                        return Boolean.valueOf(userFixedSavingActivity.getIntent().getBooleanExtra("savingNewer", false));
                    default:
                        int i12 = UserFixedSavingActivity.f32209g;
                        String stringExtra = userFixedSavingActivity.getIntent().getStringExtra("savingTab");
                        if (stringExtra != null && (intOrNull = StringsKt.toIntOrNull(stringExtra)) != null) {
                            iIntValue = intOrNull.intValue();
                        }
                        return Integer.valueOf(iIntValue);
                }
            }
        });
    }

    public static final void m(UserFixedSavingActivity userFixedSavingActivity, int i7) {
        if (i7 == 2) {
            int intExtra = userFixedSavingActivity.getIntent().getIntExtra("identity_type", 2);
            userFixedSavingActivity.getIntent().getIntExtra("fixed_saving_type", 1);
            userFixedSavingActivity.n(intExtra);
        } else if (!p059e1.a.C("new_user_introduction", true)) {
            int intExtra2 = userFixedSavingActivity.getIntent().getIntExtra("identity_type", 1);
            userFixedSavingActivity.getIntent().getIntExtra("fixed_saving_type", 1);
            userFixedSavingActivity.n(intExtra2);
        } else {
            Z supportFragmentManager = userFixedSavingActivity.getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.e(Jc.c.container, NewUserIntroductionFragment.f32487L.newInstance(1), null);
            c1161aE.h(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_user_fixed_saving_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((OldUserFixedSavingViewModel) l()).f32776e;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new T8.o(15, this, this), 15));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((OldUserFixedSavingViewModel) l()).f32778g;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new V8.w(this, 7), 15));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), !i0.T());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n(int i7) {
        this.f32210c = i7;
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.d(Jc.c.container, UserFixedSavingTabFragment.f32214w.newInstance(), String.valueOf(i7), 1);
        c1161aE.h(true);
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        int intExtra = intent.getIntExtra("identity_type", 1);
        intent.getIntExtra("fixed_saving_type", 1);
        if (this.f32210c == intExtra) {
            C0.G.u(MessageEvent.EVENT_FIXED_SAVING_TAB_CHANGE, org.greenrobot.eventbus.c.b());
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (((Boolean) this.f32212e.getValue()).booleanValue()) {
            int intExtra = getIntent().getIntExtra("identity_type", 1);
            getIntent().getIntExtra("fixed_saving_type", 1);
            n(intExtra);
        } else {
            OldUserFixedSavingViewModel oldUserFixedSavingViewModel = (OldUserFixedSavingViewModel) l();
            oldUserFixedSavingViewModel.getClass();
            if (BaseApplication.hasLogin() && NetworkUtils.isConnected()) {
                p140j8.f.s(oldUserFixedSavingViewModel, new Qc.Y(1, null), oldUserFixedSavingViewModel.f32776e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            } else {
                oldUserFixedSavingViewModel.f32776e.k(new com.transsnet.palmpay.core.base.p(new GetIdentityResp(new GetIdentityResp.IdentityBean(0, 1, null))));
            }
        }
        OldUserFixedSavingViewModel oldUserFixedSavingViewModel2 = (OldUserFixedSavingViewModel) l();
        oldUserFixedSavingViewModel2.getClass();
        p140j8.f.s(oldUserFixedSavingViewModel2, new Qc.Z(1, null), oldUserFixedSavingViewModel2.f32778g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
