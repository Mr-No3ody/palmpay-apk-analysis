package com.palmpay.lib.ui.calendar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WeekView extends BaseWeekView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public F f24165p0;

    public WeekView(Context context) {
        super(context);
    }

    public final void f(Canvas canvas, C1435e c1435e, int i7, boolean z3) {
        boolean zA = c1435e.a();
        if (zA) {
            if (z3) {
                i(i7, canvas);
            } else if (!z3) {
            }
            this.f24085i.setColor(this.f24078a.f24249Q);
            h(canvas, c1435e, i7);
        } else if (z3) {
            i(i7, canvas);
        }
        j(canvas, c1435e, i7, zA, z3);
    }

    public final void g(int i7, int i10) {
        F f10 = this.f24165p0;
        if (f10 != null) {
            ValueAnimator valueAnimator = f10.f24138d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                f10.f24138d.removeUpdateListener(f10);
                f10.f24138d.removeListener(f10);
            }
            f10.f24138d = null;
        }
        F f11 = new F();
        f11.f24135a = 0;
        f11.f24136b = 0;
        this.f24165p0 = f11;
        f11.f24139e = this;
        f11.f24137c = (C1435e) this.f24071A.get(i10);
        int i11 = this.f24073C;
        int i12 = this.f24078a.f24301x;
        f11.f24135a = (i7 * i11) + i12;
        f11.f24136b = (i10 * i11) + i12;
        ValueAnimator valueAnimator2 = f11.f24138d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            f11.f24138d.removeUpdateListener(f11);
            f11.f24138d.removeListener(f11);
        }
        f11.f24138d = null;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        f11.f24138d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(f11);
        f11.f24138d.addListener(f11);
        f11.f24138d.setInterpolator(new OvershootInterpolator());
        f11.f24138d.setDuration(240L);
        f11.f24138d.start();
    }

    public abstract void h(Canvas canvas, C1435e c1435e, int i7);

    public abstract void i(int i7, Canvas canvas);

    public abstract void j(Canvas canvas, C1435e c1435e, int i7, boolean z3, boolean z8);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1435e index;
        if (this.f24077Q && (index = getIndex()) != null) {
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
            if (i7 != -1 && i7 != iIndexOf) {
                g(i7, iIndexOf);
            }
            CalendarView.OnInnerDateSelectedListener onInnerDateSelectedListener = this.f24078a.f24298v0;
            if (onInnerDateSelectedListener != null) {
                onInnerDateSelectedListener.onWeekDateSelected(index, true);
            }
            if (this.f24091w != null) {
                this.f24091w.i(s.r(index, this.f24078a.f24261b));
            }
            CalendarView.OnCalendarSelectListener onCalendarSelectListener2 = this.f24078a.f24291r0;
            if (onCalendarSelectListener2 != null) {
                onCalendarSelectListener2.onCalendarSelect(index, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.f24071A.size() == 0) {
            return;
        }
        int width = getWidth();
        p pVar = this.f24078a;
        this.f24073C = ((width - pVar.f24301x) - pVar.f24303y) / 7;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f24071A.size()) {
                break;
            }
            int i10 = (this.f24073C * i7) + this.f24078a.f24301x;
            boolean z3 = i7 == this.f24087k0;
            F f10 = this.f24165p0;
            if (f10 != null && (valueAnimator2 = f10.f24138d) != null && valueAnimator2.isStarted() && this.f24165p0.f24137c == this.f24071A.get(this.f24087k0)) {
                z3 = false;
            }
            C1435e c1435e = (C1435e) this.f24071A.get(i7);
            c1435e.getClass();
            f(canvas, c1435e, i10, z3);
            i7++;
        }
        F f11 = this.f24165p0;
        if (f11 == null || (valueAnimator = f11.f24138d) == null || !valueAnimator.isStarted()) {
            return;
        }
        float fFloatValue = ((Float) f11.f24138d.getAnimatedValue()).floatValue();
        int i11 = f11.f24135a;
        f(canvas, f11.f24137c, (int) (((f11.f24136b - i11) * fFloatValue) + i11), true);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1435e index;
        if (this.f24078a.f24296u0 == null || !this.f24077Q || (index = getIndex()) == null) {
            return false;
        }
        if (c(index)) {
            this.f24078a.f24289q0.onCalendarInterceptClick(index, true);
            return true;
        }
        if (!b(index)) {
            CalendarView.OnCalendarLongClickListener onCalendarLongClickListener = this.f24078a.f24296u0;
            if (onCalendarLongClickListener != null) {
                onCalendarLongClickListener.onCalendarLongClickOutOfRange(index);
            }
            return true;
        }
        this.f24078a.getClass();
        int iIndexOf = this.f24071A.indexOf(index);
        int i7 = this.f24087k0;
        this.f24087k0 = iIndexOf;
        if (i7 != -1 && i7 != iIndexOf) {
            g(i7, iIndexOf);
        }
        p pVar = this.f24078a;
        pVar.f24228E0 = pVar.f24226D0;
        CalendarView.OnInnerDateSelectedListener onInnerDateSelectedListener = pVar.f24298v0;
        if (onInnerDateSelectedListener != null) {
            onInnerDateSelectedListener.onWeekDateSelected(index, true);
        }
        if (this.f24091w != null) {
            this.f24091w.i(s.r(index, this.f24078a.f24261b));
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
