package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class WeekViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f24168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CalendarLayout f24169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24170e;

    public WeekViewPager(Context context) {
        this(context, null);
    }

    public final void a(C1435e c1435e) {
        p pVar = this.f24168c;
        int i7 = pVar.f24257Y;
        int i10 = pVar.f24260a0;
        int i11 = pVar.c0;
        int i12 = pVar.f24261b;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i7, i10 - 1, i11);
        long timeInMillis = calendar.getTimeInMillis();
        int iS = s.s(i7, i10, i11, i12);
        calendar.set(c1435e.f24201a, c1435e.f24202b - 1, s.s(c1435e.f24201a, c1435e.f24202b, c1435e.f24203c, i12) == 0 ? c1435e.f24203c + 1 : c1435e.f24203c);
        int timeInMillis2 = (iS + ((int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000))) / 7;
        this.f24170e = getCurrentItem() != timeInMillis2;
        setCurrentItem(timeInMillis2, false);
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(timeInMillis2));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(c1435e);
            baseWeekView.invalidate();
        }
    }

    public final void b() {
        if (this.f24168c.f24265e == 0) {
            return;
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i7);
            if (!baseWeekView.f24071A.contains(baseWeekView.f24078a.f24226D0)) {
                baseWeekView.f24087k0 = -1;
                baseWeekView.invalidate();
            }
        }
    }

    public List<C1435e> getCurrentWeekCalendars() {
        p pVar = this.f24168c;
        C1435e c1435e = pVar.f24228E0;
        long timeInMillis = c1435e.d().getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c, 12, 0);
        int i7 = calendar.get(7);
        int i10 = pVar.f24261b;
        if (i10 == 1) {
            i7--;
        } else if (i10 == 2) {
            i7 = i7 == 1 ? 6 : i7 - i10;
        } else if (i7 == 7) {
            i7 = 0;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeInMillis - (((long) i7) * 86400000));
        C1435e c1435e2 = new C1435e();
        c1435e2.f24201a = calendar2.get(1);
        c1435e2.f24202b = calendar2.get(2) + 1;
        c1435e2.f24203c = calendar2.get(5);
        ArrayList arrayListU = s.u(c1435e2, pVar);
        this.f24168c.a(arrayListU);
        return arrayListU;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f24168c.f24279l0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f24168c.f24270g0, 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f24168c.f24279l0 && super.onTouchEvent(motionEvent);
    }

    public void setup(p pVar) {
        this.f24168c = pVar;
        this.f24167b = s.q(pVar.f24257Y, pVar.f24260a0, pVar.c0, pVar.f24258Z, pVar.b0, pVar.f24264d0, pVar.f24261b);
        setAdapter(new H(this));
        addOnPageChangeListener(new G(this));
    }

    public WeekViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24170e = false;
        if (isInEditMode()) {
            setup(new p(context, attributeSet));
        }
    }
}
