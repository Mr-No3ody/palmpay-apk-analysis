package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.i0;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_main_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxMainActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxMainActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxMainActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,164:1\n260#2,10:165\n296#2:175\n*S KotlinDebug\n*F\n+ 1 CashBoxMainActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxMainActivity\n*L\n59#1:165,10\n59#1:175\n*E\n"})
public final class CashBoxMainActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32040e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterstitialAdView f32042d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_cash_box_main_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) l()).f32740X;
        if (lVar != null) {
            lVar.e(this, new T8.f(new T8.o(11, this, this), (byte) 0, false));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        if (i0.W(this)) {
            try {
                String string = getString(p025ba.k.cashbox_newuser_activity_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                this.f32042d = new InterstitialAdView(string, 0, new Ab.k(14), new org.sufficientlysecure.htmltextview.h(9));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        getSupportFragmentManager();
        if (!this.f32041c) {
            super.onBackPressed();
            return;
        }
        this.f32041c = false;
        m();
        InterstitialAdView interstitialAdView = this.f32042d;
        if (interstitialAdView != null) {
            interstitialAdView.show(this, true, new C1559e(this, 0));
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        processLogic(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((CashBoxViewModel) l()).h();
        ((CashBoxViewModel) l()).g();
    }
}
