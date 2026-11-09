package com.transsnet.palmpay.ui.activity.bankcard;

import Ac.e;
import Ac.f;
import Ac.h;
import C9.ViewOnClickListenerC0146m;
import F6.d;
import L6.b;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "银行卡、账户/Banks and cards", path = "/main/bankCardAndAccount")
public class BankCardAndAccountActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PpTitleBar f34636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TabLayout f34637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewPager f34638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f34639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f34640e = new SparseArray(2);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_bank_card_and_account_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    public final void l(int i7, boolean z3) {
        SparseArray sparseArray = this.f34640e;
        sparseArray.put(i7, Boolean.valueOf(z3));
        if (sparseArray.size() == 2) {
            this.f34636a.setTitle(getString((((Boolean) sparseArray.get(0)).booleanValue() || ((Boolean) sparseArray.get(1)).booleanValue()) ? h.main_bank_card_and_account : k.core_add_bank_card_account));
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if ((i7 == 100 || i7 == 101) && i10 == -1) {
            try {
                ((Fragment) this.f34639d.get(this.f34638c.getCurrentItem())).onActivityResult(i7, i10, intent);
            } catch (Exception e10) {
                d.c(this.TAG, "onActivityResult: ", e10);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        goBackToHome();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent messageEvent) {
        SparseArray sparseArray;
        if (messageEvent.getEventType() == 9 && (sparseArray = this.f34639d) != null) {
            Fragment fragment = (Fragment) sparseArray.get(0);
            if (fragment instanceof BankCardAndAccountFragment) {
                ((BankCardAndAccountFragment) fragment).x();
            }
            Fragment fragment2 = (Fragment) this.f34639d.get(1);
            if (fragment2 instanceof BankCardAndAccountFragment) {
                ((BankCardAndAccountFragment) fragment2).x();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34637b = (TabLayout) findViewById(e.tabLayout);
        this.f34638c = (ViewPager) findViewById(e.viewpager);
        this.f34639d = new SparseArray();
        this.f34638c.setAdapter(new Cd.d(this, getSupportFragmentManager(), 2));
        this.f34638c.setCurrentItem(0);
        this.f34638c.setOffscreenPageLimit(2);
        this.f34637b.setupWithViewPager(this.f34638c);
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(e.titleBar);
        this.f34636a = ppTitleBar;
        ppTitleBar.setBackButtonClickListener(new ViewOnClickListenerC0146m(this, 26));
        this.f34636a.setRightTextViewClickListener(new F5.b(6));
        this.f34637b.setOnTabSelectedListener((TabLayout.OnTabSelectedListener) new p132ie.c());
        int i7 = 0;
        while (i7 < this.f34637b.getChildCount()) {
            View childAt = this.f34637b.getTabAt(i7).view.getChildAt(1);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(Typeface.create(this.f34637b.getSelectedTabPosition() == i7 ? "sans-serif-medium" : "sans-serif", 0));
            }
            i7++;
        }
    }
}
