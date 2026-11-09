package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public final class YearViewPager extends ViewPager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24192d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f24194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public YearRecyclerView.OnMonthSelectedListener f24195c;

    public YearViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f24194b.f24281m0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f24194b.f24281m0 && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i7) {
        setCurrentItem(i7, false);
    }

    public final void setOnMonthSelectedListener(YearRecyclerView.OnMonthSelectedListener onMonthSelectedListener) {
        this.f24195c = onMonthSelectedListener;
    }

    public void setup(p pVar) {
        this.f24194b = pVar;
        this.f24193a = (pVar.f24258Z - pVar.f24257Y) + 1;
        setAdapter(new L(this));
        p pVar2 = this.f24194b;
        setCurrentItem(pVar2.f24275j0.f24201a - pVar2.f24257Y);
    }

    public YearViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            setup(new p(context, attributeSet));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i7, boolean z3) {
        if (Math.abs(getCurrentItem() - i7) > 1) {
            super.setCurrentItem(i7, false);
        } else {
            super.setCurrentItem(i7, false);
        }
    }
}
