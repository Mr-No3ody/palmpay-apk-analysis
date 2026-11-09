package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MonthViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f24151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CalendarLayout f24155g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeekViewPager f24156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeekBar f24157j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24159p;

    public MonthViewPager(Context context) {
        this(context, null);
    }

    public final void a(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        float width = getWidth();
        float height = getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
    }

    public final void b(int i7, int i10) {
        p pVar = this.f24151c;
        if (pVar == null) {
            return;
        }
        if (pVar.f24262c == 0) {
            this.f24154f = pVar.f24270g0 * 6;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f24154f;
                return;
            }
            return;
        }
        if (this.f24155g != null) {
            if (getVisibility() != 0) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                p pVar2 = this.f24151c;
                layoutParams2.height = s.m(i7, i10, pVar2.f24270g0, pVar2);
                setLayoutParams(layoutParams2);
            }
            this.f24155g.g();
        }
        p pVar3 = this.f24151c;
        this.f24154f = s.m(i7, i10, pVar3.f24270g0, pVar3);
        if (i10 == 1) {
            p pVar4 = this.f24151c;
            this.f24153e = s.m(i7 - 1, 12, pVar4.f24270g0, pVar4);
            p pVar5 = this.f24151c;
            this.f24152d = s.m(i7, 2, pVar5.f24270g0, pVar5);
            return;
        }
        p pVar6 = this.f24151c;
        this.f24153e = s.m(i7, i10 - 1, pVar6.f24270g0, pVar6);
        if (i10 == 12) {
            p pVar7 = this.f24151c;
            this.f24152d = s.m(i7 + 1, 1, pVar7.f24270g0, pVar7);
        } else {
            p pVar8 = this.f24151c;
            this.f24152d = s.m(i7, i10 + 1, pVar8.f24270g0, pVar8);
        }
    }

    public final void c() {
        if (this.f24151c == null) {
            return;
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i7);
            baseMonthView.setSelectedCalendar(this.f24151c.f24226D0);
            baseMonthView.invalidate();
        }
    }

    public List<C1435e> getCurrentMonthCalendars() {
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView == null) {
            return null;
        }
        return baseMonthView.f24071A;
    }

    public int getCurrentMonthLines() {
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView == null) {
            return -1;
        }
        return baseMonthView.f24068s0;
    }

    public BaseMonthView getCurrentMonthView() {
        return (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
    }

    public int getOrientation() {
        return this.f24159p;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        p pVar = this.f24151c;
        if (pVar == null || !pVar.f24277k0) {
            return false;
        }
        if (this.f24159p != 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p pVar = this.f24151c;
        if (pVar == null || !pVar.f24277k0) {
            return false;
        }
        if (this.f24159p != 1) {
            return super.onTouchEvent(motionEvent);
        }
        a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i7) {
        setCurrentItem(i7, true);
    }

    public void setOrientation(int i7) {
        q qVar = new q();
        this.f24159p = i7;
        if (i7 == 1) {
            setPageTransformer(true, qVar);
        }
    }

    public void setup(p pVar) {
        this.f24151c = pVar;
        C1435e c1435e = pVar.f24275j0;
        b(c1435e.f24201a, c1435e.f24202b);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f24154f;
            setLayoutParams(layoutParams);
        }
        p pVar2 = this.f24151c;
        if (pVar2 == null) {
            return;
        }
        this.f24150b = (((pVar2.f24258Z - pVar2.f24257Y) * 12) - pVar2.f24260a0) + 1 + pVar2.b0;
        setAdapter(new w(this));
        addOnPageChangeListener(new v(this));
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24158o = false;
        this.f24159p = 0;
        if (isInEditMode()) {
            setup(new p(context, attributeSet));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i7, boolean z3) {
        if (Math.abs(getCurrentItem() - i7) > 1) {
            super.setCurrentItem(i7, false);
        } else {
            super.setCurrentItem(i7, z3);
        }
    }
}
