package com.palmpay.lib.ui.calendar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MonthView extends BaseMonthView {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public u f24148v0;

    public MonthView(Context context) {
        super(context);
    }

    public final void h(Canvas canvas, C1435e c1435e, int i7, int i10, boolean z3) {
        boolean zA = c1435e.a();
        if (zA) {
            if (z3) {
                k(canvas, i7, i10);
            } else if (!z3) {
            }
            this.f24085i.setColor(this.f24078a.f24249Q);
            j(canvas, c1435e, i7, i10);
        } else if (z3) {
            k(canvas, i7, i10);
        }
        l(canvas, c1435e, i7, i10, zA, z3);
    }

    public final void i(int i7, int i10) {
        u uVar = this.f24148v0;
        if (uVar != null) {
            ValueAnimator valueAnimator = uVar.f24343f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                uVar.f24343f.removeUpdateListener(uVar);
                uVar.f24343f.removeListener(uVar);
            }
            uVar.f24343f = null;
        }
        u uVar2 = new u();
        uVar2.f24338a = 0;
        uVar2.f24339b = 0;
        uVar2.f24340c = 0;
        uVar2.f24341d = 0;
        this.f24148v0 = uVar2;
        uVar2.f24344g = this;
        uVar2.f24342e = (C1435e) this.f24071A.get(i10);
        int[] iArrA = u.a(this, (C1435e) this.f24071A.get(i7));
        int[] iArrA2 = u.a(this, uVar2.f24342e);
        int i11 = iArrA[1];
        int i12 = this.f24073C;
        int i13 = this.f24078a.f24301x;
        uVar2.f24338a = (i11 * i12) + i13;
        int i14 = iArrA[0];
        int i15 = this.f24072B;
        uVar2.f24340c = i14 * i15;
        uVar2.f24339b = (iArrA2[1] * i12) + i13;
        uVar2.f24341d = iArrA2[0] * i15;
        ValueAnimator valueAnimator2 = uVar2.f24343f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            uVar2.f24343f.removeUpdateListener(uVar2);
            uVar2.f24343f.removeListener(uVar2);
        }
        uVar2.f24343f = null;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        uVar2.f24343f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(uVar2);
        uVar2.f24343f.addListener(uVar2);
        uVar2.f24343f.setInterpolator(new OvershootInterpolator());
        uVar2.f24343f.setDuration(0L);
        uVar2.f24343f.start();
    }

    public abstract void j(Canvas canvas, C1435e c1435e, int i7, int i10);

    public abstract void k(Canvas canvas, int i7, int i10);

    public abstract void l(Canvas canvas, C1435e c1435e, int i7, int i10, boolean z3, boolean z8);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MonthViewPager monthViewPager;
        if (!this.f24077Q) {
            this.f24077Q = true;
            return;
        }
        C1435e index = getIndex();
        if (index == null) {
            return;
        }
        if (this.f24078a.f24262c != 1 || index.f24204d) {
            if (c(index)) {
                this.f24078a.f24289q0.onCalendarInterceptClick(index, true);
                return;
            }
            if (!b(index)) {
                CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.f24078a.f24291r0;
                if (onCalendarSelectListener != null) {
                    onCalendarSelectListener.onCalendarOutOfRange(index);
                    return;
                }
                return;
            }
            int iIndexOf = this.f24071A.indexOf(index);
            int i7 = this.f24087k0;
            this.f24087k0 = iIndexOf;
            if (!this.f24078a.f24277k0 && iIndexOf != -1) {
                i(i7, iIndexOf);
            } else if (index.f24204d && i7 != -1 && i7 != iIndexOf) {
                i(i7, iIndexOf);
            }
            if (!index.f24204d && (monthViewPager = this.f24065p0) != null && this.f24078a.f24277k0) {
                this.f24065p0.setCurrentItem(monthViewPager.getCurrentItem() - (this.f24067r0 - index.f24202b));
            }
            CalendarView.OnInnerDateSelectedListener onInnerDateSelectedListener = this.f24078a.f24298v0;
            if (onInnerDateSelectedListener != null) {
                onInnerDateSelectedListener.onMonthDateSelected(index, true);
            }
            CalendarLayout calendarLayout = this.f24091w;
            if (calendarLayout != null) {
                if (index.f24204d) {
                    calendarLayout.h(iIndexOf);
                } else {
                    calendarLayout.i(s.r(index, this.f24078a.f24261b));
                }
            }
            CalendarView.OnCalendarSelectListener onCalendarSelectListener2 = this.f24078a.f24291r0;
            if (onCalendarSelectListener2 != null) {
                onCalendarSelectListener2.onCalendarSelect(index, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        boolean z3;
        u uVar;
        boolean z8;
        ValueAnimator valueAnimator2;
        if (this.f24068s0 == 0) {
            return;
        }
        int width = getWidth();
        p pVar = this.f24078a;
        this.f24073C = ((width - pVar.f24301x) - pVar.f24303y) / 7;
        int i7 = this.f24068s0 * 7;
        int i10 = 0;
        int i11 = 0;
        loop0: while (i11 < this.f24068s0) {
            int i12 = i10;
            for (int i13 = 0; i13 < 7; i13++) {
                C1435e c1435e = (C1435e) this.f24071A.get(i12);
                if (isInEditMode()) {
                    if (c1435e.f24204d) {
                        if (this.f24087k0 < 0) {
                            this.f24087k0 = i12;
                        } else if (!c1435e.a() && i11 == 1 && i13 == 0) {
                            c1435e.f24207g = this.f24078a.f24256X;
                        }
                    } else if (!c1435e.a() && i11 == 0 && i13 == 0) {
                        c1435e.f24207g = this.f24078a.f24256X;
                    }
                }
                int i14 = this.f24078a.f24262c;
                if (i14 != 1) {
                    if (i14 == 2 && i12 >= i7) {
                        break loop0;
                    }
                    c1435e.getClass();
                    int i15 = (this.f24073C * i13) + this.f24078a.f24301x;
                    int i16 = this.f24072B * i11;
                    if (i12 == this.f24087k0) {
                    }
                    uVar = this.f24148v0;
                    if (uVar == null) {
                        z8 = z3;
                    } else {
                        z8 = z3;
                    }
                    h(canvas, c1435e, i15, i16, z8);
                } else {
                    if (i12 > this.f24071A.size() - this.f24070u0) {
                        break loop0;
                    }
                    if (c1435e.f24204d) {
                        c1435e.getClass();
                        int i17 = (this.f24073C * i13) + this.f24078a.f24301x;
                        int i18 = this.f24072B * i11;
                        z3 = i12 == this.f24087k0;
                        uVar = this.f24148v0;
                        if (uVar == null && (valueAnimator2 = uVar.f24343f) != null && valueAnimator2.isStarted() && this.f24148v0.f24342e == this.f24071A.get(this.f24087k0)) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        h(canvas, c1435e, i17, i18, z8);
                    }
                }
                i12++;
            }
            i11++;
            i10 = i12;
        }
        u uVar2 = this.f24148v0;
        if (uVar2 == null || (valueAnimator = uVar2.f24343f) == null || !valueAnimator.isStarted()) {
            return;
        }
        float fFloatValue = ((Float) uVar2.f24343f.getAnimatedValue()).floatValue();
        int i19 = uVar2.f24338a;
        int i20 = (int) (((uVar2.f24339b - i19) * fFloatValue) + i19);
        int i21 = uVar2.f24340c;
        h(canvas, uVar2.f24342e, i20, (int) (((uVar2.f24341d - i21) * fFloatValue) + i21), true);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1435e index;
        MonthViewPager monthViewPager;
        if (this.f24078a.f24296u0 == null || !this.f24077Q || (index = getIndex()) == null || (this.f24078a.f24262c == 1 && !index.f24204d)) {
            return false;
        }
        if (c(index)) {
            this.f24078a.f24289q0.onCalendarInterceptClick(index, true);
            return false;
        }
        if (!b(index)) {
            CalendarView.OnCalendarLongClickListener onCalendarLongClickListener = this.f24078a.f24296u0;
            if (onCalendarLongClickListener != null) {
                onCalendarLongClickListener.onCalendarLongClickOutOfRange(index);
            }
            return true;
        }
        this.f24078a.getClass();
        this.f24087k0 = this.f24071A.indexOf(index);
        if (!index.f24204d && (monthViewPager = this.f24065p0) != null) {
            int currentItem = monthViewPager.getCurrentItem();
            this.f24065p0.setCurrentItem(this.f24087k0 < 7 ? currentItem - 1 : currentItem + 1);
        }
        CalendarView.OnInnerDateSelectedListener onInnerDateSelectedListener = this.f24078a.f24298v0;
        if (onInnerDateSelectedListener != null) {
            onInnerDateSelectedListener.onMonthDateSelected(index, true);
        }
        CalendarLayout calendarLayout = this.f24091w;
        if (calendarLayout != null) {
            if (index.f24204d) {
                calendarLayout.h(this.f24071A.indexOf(index));
            } else {
                calendarLayout.i(s.r(index, this.f24078a.f24261b));
            }
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.f24078a.f24291r0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(index, true);
        }
        CalendarView.OnCalendarLongClickListener onCalendarLongClickListener2 = this.f24078a.f24296u0;
        if (onCalendarLongClickListener2 != null) {
            onCalendarLongClickListener2.onCalendarLongClick(index);
        }
        invalidate();
        return true;
    }
}
