package com.transsnet.palmpay.betting.ui.activity;

import Pd.c;
import Pd.d;
import Rd.C0594j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.lifecycle.F;
import androidx.lifecycle.b0;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.betting.ui.fragment.BettingWithdrawHomeFragment;
import com.transsnet.palmpay.betting.viewmodel.BettingWithDrawViewModel;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p086fe.B0;
import p173ld.o;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p282s9.p;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/quick_teller/betting_withdraw_home")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/activity/BettingWithdrawHomeActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/betting/viewmodel/BettingWithDrawViewModel;", "LRd/j;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBettingWithdrawHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BettingWithdrawHomeActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingWithdrawHomeActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n75#2,13:95\n1#3:108\n*S KotlinDebug\n*F\n+ 1 BettingWithdrawHomeActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingWithdrawHomeActivity\n*L\n45#1:95,13\n*E\n"})
public final class BettingWithdrawHomeActivity extends BaseBillerActivity<BettingWithDrawViewModel, C0594j> implements CancelAdapt {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f26722v = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ChannelDataItemBean f26725o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26726p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26723i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26724j = "";
    public final b0 t = new b0(G.a(B0.class), new p(this, 1), new p(this, 0), new p(this, 2));

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_betting_withdraw_home, (ViewGroup) null, false);
        int i7 = c.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = c.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                C0594j c0594j = new C0594j((LinearLayout) viewInflate, frameLayout, ppTitleBar);
                Intrinsics.checkNotNullExpressionValue(c0594j, "inflate(...)");
                return c0594j;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        p(intent);
    }

    public final void p(Intent intent) {
        String stringExtra;
        String stringExtra2;
        String str = "";
        if (intent == null || (stringExtra = intent.getStringExtra("billerId")) == null) {
            stringExtra = "";
        }
        this.f26723i = stringExtra;
        this.f26725o = intent != null ? (ChannelDataItemBean) intent.getParcelableExtra("billpayment_data") : null;
        if (intent != null && (stringExtra2 = intent.getStringExtra("customerId")) != null) {
            str = stringExtra2;
        }
        this.f26724j = str;
        ChannelDataItemBean channelDataItemBean = this.f26725o;
        b0 b0Var = this.t;
        if (channelDataItemBean != null) {
            B0 b0 = (B0) b0Var.getValue();
            ChannelDataItemBean item = this.f26725o;
            Intrinsics.e(item);
            b0.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            b0.f36482d.k(item);
            return;
        }
        if (TextUtils.isEmpty(this.f26723i)) {
            return;
        }
        B0 b7 = (B0) b0Var.getValue();
        ChannelDataItemBean item2 = new ChannelDataItemBean();
        item2.setBillerId(this.f26723i);
        item2.setCustomerId(this.f26724j);
        b7.getClass();
        Intrinsics.checkNotNullParameter(item2, "item");
        b7.f36482d.k(item2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ImageView backImageView;
        p(getIntent());
        B0 b0 = (B0) this.t.getValue();
        String str = this.f26726p;
        F f10 = b0.f36483e;
        if (str == null) {
            str = "";
        }
        f10.k(str);
        if (bundle == null) {
            BettingWithdrawHomeFragment bettingWithdrawHomeFragment = new BettingWithdrawHomeFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("billerId", this.f26723i);
            bundle2.putString("customerId", this.f26724j);
            bundle2.putParcelable("billpayment_data", this.f26725o);
            String str2 = this.f26726p;
            if (str2 != null) {
                bundle2.putString(AppsFlyerProperties.CHANNEL, str2);
            }
            bettingWithdrawHomeFragment.setArguments(bundle2);
            Z supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.e(c.fragmentContainer, bettingWithdrawHomeFragment, null);
            c1161a.h(false);
        }
        C0594j c0594j = (C0594j) this.f27334c;
        if (c0594j == null || (backImageView = c0594j.f8357c.getBackImageView()) == null) {
            return;
        }
        backImageView.setOnClickListener(new o(this, 22));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
    }
}
