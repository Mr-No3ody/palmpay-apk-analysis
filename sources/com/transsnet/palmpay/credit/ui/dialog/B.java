package com.transsnet.palmpay.credit.ui.dialog;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentCheckPlanDialog f29934a;

    public B(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        this.f29934a = cLInstallmentCheckPlanDialog;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        this.f29934a.updatePageUi(i7);
    }
}
