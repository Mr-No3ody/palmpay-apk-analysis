package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMonthView extends BaseView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MonthViewPager f24065p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f24066q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f24067r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f24068s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f24069t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f24070u0;

    public BaseMonthView(Context context) {
        super(context);
    }

    @Override // com.palmpay.lib.ui.calendar.BaseView
    public final void e() {
        super.e();
        int i7 = this.f24066q0;
        int i10 = this.f24067r0;
        int i11 = this.f24072B;
        p pVar = this.f24078a;
        int i12 = pVar.f24261b;
        int iM = s.m(i7, i10, i11, pVar);
        if (this.f24069t0 != iM) {
            requestLayout();
        }
        this.f24069t0 = iM;
    }

    public final void f() {
        int iN;
        int iK;
        p pVar;
        CalendarView.OnCalendarInterceptListener onCalendarInterceptListener;
        p pVar2 = this.f24078a;
        int i7 = this.f24066q0;
        int i10 = this.f24067r0;
        C1435e c1435e = pVar2.f24275j0;
        boolean z3 = pVar2.f24263d && (i7 == c1435e.f24201a && i10 == c1435e.f24202b);
        if (z3) {
            int i11 = pVar2.f24261b;
            int i12 = c1435e.f24203c;
            int iK2 = s.k(i7, i10);
            int iL = s.l(pVar2, i7, i10, i12, i11);
            this.f24070u0 = i12 + iL > iK2 ? iL : 0;
            p pVar3 = this.f24078a;
            iN = s.j(pVar3, pVar3.f24261b);
            iK = this.f24078a.f24275j0.f24203c;
        } else {
            this.f24070u0 = s.l(pVar2, i7, i10, s.k(i7, i10), pVar2.f24261b);
            iN = s.n(this.f24066q0, this.f24067r0, 1, this.f24078a.f24261b);
            iK = s.k(this.f24066q0, this.f24067r0);
        }
        p pVar4 = this.f24078a;
        ArrayList arrayListT = s.t(pVar4, this.f24066q0, this.f24067r0, pVar4.f24275j0, pVar4.f24261b, z3);
        this.f24071A = arrayListT;
        if (arrayListT.contains(this.f24078a.f24275j0)) {
            this.f24087k0 = this.f24071A.indexOf(this.f24078a.f24275j0);
        } else {
            this.f24087k0 = this.f24071A.indexOf(this.f24078a.f24226D0);
        }
        if (this.f24087k0 > 0 && (onCalendarInterceptListener = (pVar = this.f24078a).f24289q0) != null && onCalendarInterceptListener.onCalendarIntercept(pVar.f24226D0)) {
            this.f24087k0 = -1;
        }
        if (this.f24078a.f24262c == 0) {
            this.f24068s0 = 6;
        } else if (z3) {
            this.f24068s0 = (int) Math.ceil(((iN + iK) + this.f24070u0) / 7.0f);
        } else {
            this.f24068s0 = ((iN + iK) + this.f24070u0) / 7;
        }
        a();
        invalidate();
    }

    public final void g(int i7, int i10) {
        this.f24066q0 = i7;
        this.f24067r0 = i10;
        f();
        int i11 = this.f24072B;
        p pVar = this.f24078a;
        int i12 = pVar.f24261b;
        int iM = s.m(i7, i10, i11, pVar);
        if (this.f24069t0 != iM) {
            requestLayout();
        }
        this.f24069t0 = iM;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    public C1435e getIndex() {
        p pVar;
        int iY;
        C1435e c1435e;
        if (this.f24073C != 0 && this.f24072B != 0) {
            float f10 = this.f24075L;
            if (f10 > this.f24078a.f24301x) {
                int width = getWidth();
                p pVar2 = this.f24078a;
                if (f10 >= width - pVar2.f24303y) {
                    pVar = this.f24078a;
                    if (pVar.f24287p0 != null) {
                        int i7 = ((int) (this.f24075L - pVar.f24301x)) / this.f24073C;
                        iY = androidx.camera.video.u.y((int) this.f24076M, this.f24072B, 7, i7 < 7 ? i7 : 6);
                        if (iY >= 0 || iY >= this.f24071A.size()) {
                            c1435e = null;
                        } else {
                            c1435e = (C1435e) this.f24071A.get(iY);
                        }
                        if (c1435e != null) {
                            this.f24078a.f24287p0.onClickCalendarPadding(this.f24075L, this.f24076M, true, c1435e, null);
                        }
                    }
                } else {
                    int i10 = ((int) (this.f24075L - pVar2.f24301x)) / this.f24073C;
                    int iY2 = androidx.camera.video.u.y((int) this.f24076M, this.f24072B, 7, i10 < 7 ? i10 : 6);
                    if (iY2 >= 0 && iY2 < this.f24071A.size()) {
                        return (C1435e) this.f24071A.get(iY2);
                    }
                }
            } else {
                pVar = this.f24078a;
                if (pVar.f24287p0 != null) {
                    int i11 = ((int) (this.f24075L - pVar.f24301x)) / this.f24073C;
                    iY = androidx.camera.video.u.y((int) this.f24076M, this.f24072B, 7, i11 < 7 ? i11 : 6);
                    if (iY >= 0) {
                        c1435e = null;
                    } else {
                        c1435e = null;
                    }
                    if (c1435e != null) {
                        this.f24078a.f24287p0.onClickCalendarPadding(this.f24075L, this.f24076M, true, c1435e, null);
                    }
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f24068s0 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f24069t0, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public final void setSelectedCalendar(C1435e c1435e) {
        this.f24087k0 = this.f24071A.indexOf(c1435e);
        if (c(c1435e)) {
            this.f24087k0 = -1;
        }
    }
}
