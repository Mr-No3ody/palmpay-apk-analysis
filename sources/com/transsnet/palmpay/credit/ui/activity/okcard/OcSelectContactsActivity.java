package com.transsnet.palmpay.credit.ui.activity.okcard;

import Pa.AbstractC0512i;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Window;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC选择联系人页", path = "/credit_score/oc_select_contact_activity")
public class OcSelectContactsActivity extends com.transsnet.palmpay.core.base.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29859a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29860b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29861c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TabLayout f29862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f29863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f29864f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_select_contact_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == this.f29861c && i10 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AbstractC0512i.f7094b.clear();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar();
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getColor(L6.b.ppColorBackgroundLight));
        this.f29861c = getIntent().getIntExtra("oc_contact_type", 1000);
        this.f29863e = (ViewPager) findViewById(Ya.e.viewpager);
        this.f29862d = (TabLayout) findViewById(Ya.e.tabLayout);
        this.f29864f = new SparseArray();
        this.f29863e.setAdapter(new Cd.d(this, getSupportFragmentManager(), 3));
        this.f29863e.setOffscreenPageLimit(2);
        this.f29862d.setupWithViewPager(this.f29863e);
    }
}
