package com.transsnet.palmpay.send_money.ui.activity.tobank;

import Kb.d;
import L6.b;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.Z;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.tobank.BankAccountBeneficiaryActivity;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p059e1.a;
import p159kd.e;
import p159kd.f;
import p220oa.h;
import p327vd.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/back_account_beneficiary")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/tobank/BankAccountBeneficiaryActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BankAccountBeneficiaryActivity extends BaseActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33494g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33495a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33499e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33496b = "COMMON";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33500f = "";

    public BankAccountBeneficiaryActivity() {
        final int i7 = 0;
        this.f33497c = C2131j.b(new Function0(this) { // from class: xd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryActivity f43856b;

            {
                this.f43856b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BankAccountBeneficiaryActivity bankAccountBeneficiaryActivity = this.f43856b;
                switch (i7) {
                    case 0:
                        int i10 = BankAccountBeneficiaryActivity.f33494g;
                        return (PpTitleBar) bankAccountBeneficiaryActivity.findViewById(e.titleBar);
                    case 1:
                        int i11 = BankAccountBeneficiaryActivity.f33494g;
                        return (TabLayout) bankAccountBeneficiaryActivity.findViewById(e.tabLayout);
                    default:
                        int i12 = BankAccountBeneficiaryActivity.f33494g;
                        return (ViewPager) bankAccountBeneficiaryActivity.findViewById(e.vp_beneficiary);
                }
            }
        });
        final int i10 = 1;
        this.f33498d = C2131j.b(new Function0(this) { // from class: xd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryActivity f43856b;

            {
                this.f43856b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BankAccountBeneficiaryActivity bankAccountBeneficiaryActivity = this.f43856b;
                switch (i10) {
                    case 0:
                        int i11 = BankAccountBeneficiaryActivity.f33494g;
                        return (PpTitleBar) bankAccountBeneficiaryActivity.findViewById(e.titleBar);
                    case 1:
                        int i12 = BankAccountBeneficiaryActivity.f33494g;
                        return (TabLayout) bankAccountBeneficiaryActivity.findViewById(e.tabLayout);
                    default:
                        int i13 = BankAccountBeneficiaryActivity.f33494g;
                        return (ViewPager) bankAccountBeneficiaryActivity.findViewById(e.vp_beneficiary);
                }
            }
        });
        final int i11 = 2;
        this.f33499e = C2131j.b(new Function0(this) { // from class: xd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryActivity f43856b;

            {
                this.f43856b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BankAccountBeneficiaryActivity bankAccountBeneficiaryActivity = this.f43856b;
                switch (i11) {
                    case 0:
                        int i12 = BankAccountBeneficiaryActivity.f33494g;
                        return (PpTitleBar) bankAccountBeneficiaryActivity.findViewById(e.titleBar);
                    case 1:
                        int i13 = BankAccountBeneficiaryActivity.f33494g;
                        return (TabLayout) bankAccountBeneficiaryActivity.findViewById(e.tabLayout);
                    default:
                        int i14 = BankAccountBeneficiaryActivity.f33494g;
                        return (ViewPager) bankAccountBeneficiaryActivity.findViewById(e.vp_beneficiary);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_bank_account_beneficiary_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        t tVar = this.f33497c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ImageView rightImageView1 = ((PpTitleBar) value).getRightImageView1();
        Intrinsics.checkNotNullExpressionValue(rightImageView1, "getRightImageView1(...)");
        h.s(rightImageView1, true);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).getRightImageView1().setImageDrawable(a.h(this, S6.a.pay_AddOutline, null, CommonViewExtKt.colorInt(b.ppColorTextPrimary, this), 24.0f));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((PpTitleBar) value3).getRightImageView1().setOnClickListener(new c(this, 8));
        t tVar2 = this.f33499e;
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((ViewPager) value4).setOffscreenPageLimit(2);
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        Z supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = new BankAccountBeneficiaryFragment();
        bankAccountBeneficiaryFragment.setArguments(p002a.a.e(new Pair("extra_data", Boolean.valueOf(this.f33495a)), new Pair("core_order_source_type", this.f33496b)));
        Unit unit = Unit.f38893a;
        BankAccountFavoriteFragment bankAccountFavoriteFragment = new BankAccountFavoriteFragment();
        bankAccountFavoriteFragment.setArguments(p002a.a.e(new Pair("extra_data", Boolean.valueOf(this.f33495a)), new Pair("core_order_source_type", this.f33496b)));
        BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = new BankAccountPalmPayContactFragment();
        bankAccountPalmPayContactFragment.setArguments(p002a.a.e(new Pair("extra_data", Boolean.valueOf(this.f33495a))));
        ((ViewPager) value5).setAdapter(new d(supportFragmentManager, C1850q.e(bankAccountBeneficiaryFragment, bankAccountFavoriteFragment, bankAccountPalmPayContactFragment), C1850q.e(getString(k.core_all), getString(k.core_favorites), getString(p159kd.h.sm_palmpay_contacts))));
        Object value6 = this.f33498d.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        Object value7 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TabLayout) value6).setupWithViewPager((ViewPager) value7);
    }
}
