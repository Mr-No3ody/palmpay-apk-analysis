package com.transsnet.palmpay.custom_view.smarttablayout;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartTabLayout f31698a;

    public a(SmartTabLayout smartTabLayout) {
        this.f31698a = smartTabLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = 0;
        while (true) {
            SmartTabLayout smartTabLayout = this.f31698a;
            if (i7 >= smartTabLayout.f31662a.getChildCount()) {
                return;
            }
            if (view == smartTabLayout.f31662a.getChildAt(i7)) {
                SmartTabLayout.OnTabClickListener onTabClickListener = smartTabLayout.f31674w;
                if (onTabClickListener != null) {
                    onTabClickListener.onTabClicked(i7);
                }
                smartTabLayout.f31670j.setCurrentItem(i7);
                return;
            }
            i7++;
        }
    }
}
