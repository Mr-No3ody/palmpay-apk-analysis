package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeekViewPager f24141c;

    public H(WeekViewPager weekViewPager) {
        this.f24141c = weekViewPager;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager viewPager, int i7, Object obj) {
        BaseWeekView baseWeekView = (BaseWeekView) obj;
        baseWeekView.getClass();
        viewPager.removeView(baseWeekView);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f24141c.f24167b;
    }

    @Override // androidx.viewpager.widget.a
    public final int d() {
        return this.f24141c.f24166a ? -2 : -1;
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager viewPager, int i7) {
        WeekViewPager weekViewPager = this.f24141c;
        p pVar = weekViewPager.f24168c;
        C1435e c1435eI = s.i(pVar.f24257Y, pVar.f24260a0, pVar.c0, i7 + 1, pVar.f24261b);
        try {
            BaseWeekView baseWeekView = (BaseWeekView) weekViewPager.f24168c.f24252T.getConstructor(Context.class).newInstance(weekViewPager.getContext());
            baseWeekView.f24091w = weekViewPager.f24169d;
            baseWeekView.setup(weekViewPager.f24168c);
            baseWeekView.setup(c1435eI);
            baseWeekView.setTag(Integer.valueOf(i7));
            baseWeekView.setSelectedCalendar(weekViewPager.f24168c.f24226D0);
            viewPager.addView(baseWeekView);
            p pVar2 = weekViewPager.f24168c;
            CalendarView.OnClassInitializeListener onClassInitializeListener = pVar2.f24222B0;
            if (onClassInitializeListener != null) {
                onClassInitializeListener.onClassInitialize(pVar2.f24252T, baseWeekView);
            }
            return baseWeekView;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new DefaultWeekView(weekViewPager.getContext());
        }
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object obj) {
        return view.equals(obj);
    }
}
