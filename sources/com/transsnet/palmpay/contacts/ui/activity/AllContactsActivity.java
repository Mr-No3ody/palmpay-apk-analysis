package com.transsnet.palmpay.contacts.ui.activity;

import L6.b;
import Pa.AbstractC0512i;
import Pa.n0;
import R9.d;
import R9.e;
import V9.C0719h;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.g0;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/all")
public class AllContactsActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TabLayout f27146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f27147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f27148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f27149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27152g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27153i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f27154j = "";

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_all_contacts_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100 && i10 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AbstractC0512i.f7094b.clear();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        if (event.getEventType() == 400) {
            String[] strArr = (String[]) event.getEventObj();
            String str = strArr[0];
            n0.g().k(new ClickEvent(this.f27154j).add("module_name", str).add("element_name", strArr[1]));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f27147b = (ViewPager) findViewById(d.viewpager);
        this.f27146a = (TabLayout) findViewById(d.tabLayout);
        ((PpTitleBar) findViewById(d.titleBar)).getRightImageView1().setImageDrawable(a.h(this, S6.a.pay_AddOutline, null, getColor(b.ppColorTextPrimary), 24.0f));
        initStatusBar(getColor(b.ppColorBackgroundLight), !isDarkMode());
        ARouter.getInstance().inject(this);
        c.b().j(this);
        this.f27149d = new SparseArray();
        if ("0".equals(this.f27150e)) {
            this.f27148c = new C0719h(this, getSupportFragmentManager(), 0);
        } else {
            this.f27148c = new C0719h(this, getSupportFragmentManager(), 1);
        }
        this.f27147b.setAdapter(this.f27148c);
        this.f27147b.setOffscreenPageLimit(3);
        this.f27146a.setupWithViewPager(this.f27147b);
    }
}
