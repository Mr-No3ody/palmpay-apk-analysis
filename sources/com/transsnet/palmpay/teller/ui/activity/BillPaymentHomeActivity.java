package com.transsnet.palmpay.teller.ui.activity;

import C0.P;
import C0.U;
import L6.b;
import Pa.n0;
import Pd.c;
import Pd.d;
import Rd.C0595k;
import Wd.C0733g;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p086fe.B0;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "场景/Home", path = "/quick_teller/bill_payment_home")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BillPaymentHomeActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeNGViewModel;", "LRd/k;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentHomeActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillPaymentHomeActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n75#2,13:126\n1#3:139\n*S KotlinDebug\n*F\n+ 1 BillPaymentHomeActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillPaymentHomeActivity\n*L\n44#1:126,13\n*E\n"})
public class BillPaymentHomeActivity extends BaseBillerActivity<BillPaymentHomeNGViewModel, C0595k> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f34159j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f34160o;
    public P t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34158i = "0";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f34161p = new b0(G.a(B0.class), new C0733g(this, 1), new C0733g(this, 0), new C0733g(this, 2));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_bill_payment_home, (ViewGroup) null, false);
        int i7 = c.nav_host_fragment_biller;
        if (((FragmentContainerView) a.m(i7, viewInflate)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        C0595k c0595k = new C0595k((LinearLayout) viewInflate);
        Intrinsics.checkNotNullExpressionValue(c0595k, "inflate(...)");
        return c0595k;
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("billerId");
        if (stringExtra != null) {
            if (stringExtra.length() <= 0) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                B0 b0 = (B0) this.f34161p.getValue();
                ChannelDataItemBean item = new ChannelDataItemBean();
                item.setBillerId(stringExtra);
                b0.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                b0.f36482d.k(item);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle == null) {
            Bundle bundleE = p002a.a.e(new Pair("extra_type", this.f34158i));
            String str = this.f34159j;
            if (str != null) {
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                if (str != null) {
                    bundleE.putString("billerId", str);
                }
            }
            String str2 = this.f34160o;
            if (str2 != null) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    bundleE.putString(AppsFlyerProperties.CHANNEL, str2);
                }
            }
            U u6 = new U(false, false, c.emptyViewPlaceholder, true, false, -1, -1, -1, -1);
            if (!BaseApplication.isNG()) {
                P p3 = this.t;
                if (p3 != null) {
                    p3.h(c.emptyViewPlaceholder, null, null);
                    return;
                } else {
                    Intrinsics.n("navController");
                    throw null;
                }
            }
            if ("2".equals(this.f34158i)) {
                P p10 = this.t;
                if (p10 != null) {
                    p10.h(c.fragment_bill_home_tv, bundleE, u6);
                    return;
                } else {
                    Intrinsics.n("navController");
                    throw null;
                }
            }
            if ("1".equals(this.f34158i)) {
                P p11 = this.t;
                if (p11 != null) {
                    p11.h(c.fragment_bill_home_grid_electricity, bundleE, u6);
                    return;
                } else {
                    Intrinsics.n("navController");
                    throw null;
                }
            }
            P p12 = this.t;
            if (p12 != null) {
                p12.h(c.fragment_bill_home_ng, bundleE, u6);
            } else {
                Intrinsics.n("navController");
                throw null;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundDark));
        Fragment fragmentD = getSupportFragmentManager().D(c.nav_host_fragment_biller);
        Intrinsics.f(fragmentD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.t = ((NavHostFragment) fragmentD).f();
        if (android.text.TextUtils.isEmpty(this.f34160o)) {
            return;
        }
        if ("2".equals(this.f34158i)) {
            n0.g().w("PPay_Tv_Channel", F.b(new Pair("biller_channel", this.f34160o)));
        } else if ("1".equals(this.f34158i)) {
            n0.g().w("PPay_Electricity_Channel", F.b(new Pair("biller_channel", this.f34160o)));
        }
    }
}
