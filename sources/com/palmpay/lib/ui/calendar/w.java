package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MonthViewPager f24346c;

    public w(MonthViewPager monthViewPager) {
        this.f24346c = monthViewPager;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager viewPager, int i7, Object obj) {
        BaseView baseView = (BaseView) obj;
        baseView.getClass();
        viewPager.removeView(baseView);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f24346c.f24150b;
    }

    @Override // androidx.viewpager.widget.a
    public final int d() {
        return this.f24346c.f24149a ? -2 : -1;
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager viewPager, int i7) {
        MonthViewPager monthViewPager = this.f24346c;
        p pVar = monthViewPager.f24151c;
        int i10 = (pVar.f24260a0 + i7) - 1;
        int i11 = (i10 / 12) + pVar.f24257Y;
        int i12 = (i10 % 12) + 1;
        try {
            BaseMonthView baseMonthView = (BaseMonthView) pVar.f24251S.getConstructor(Context.class).newInstance(monthViewPager.getContext());
            baseMonthView.f24065p0 = monthViewPager;
            baseMonthView.f24091w = monthViewPager.f24155g;
            baseMonthView.setup(monthViewPager.f24151c);
            baseMonthView.setTag(Integer.valueOf(i7));
            baseMonthView.g(i11, i12);
            baseMonthView.setSelectedCalendar(monthViewPager.f24151c.f24226D0);
            viewPager.addView(baseMonthView);
            p pVar2 = monthViewPager.f24151c;
            CalendarView.OnClassInitializeListener onClassInitializeListener = pVar2.f24222B0;
            if (onClassInitializeListener != null) {
                onClassInitializeListener.onClassInitialize(pVar2.f24251S, baseMonthView);
            }
            return baseMonthView;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new DefaultMonthView(monthViewPager.getContext());
        }
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object obj) {
        return view.equals(obj);
    }
}
