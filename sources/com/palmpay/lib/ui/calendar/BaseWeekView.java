package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseWeekView extends BaseView {
    public BaseWeekView(Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    public C1435e getIndex() {
        p pVar;
        int iY;
        C1435e c1435e;
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
                        this.f24078a.f24287p0.onClickCalendarPadding(this.f24075L, this.f24076M, false, c1435e, null);
                        return null;
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
                    this.f24078a.f24287p0.onClickCalendarPadding(this.f24075L, this.f24076M, false, c1435e, null);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f24072B, 1073741824));
    }

    public final void setSelectedCalendar(C1435e c1435e) {
        p pVar = this.f24078a;
        if (pVar.f24265e != 1 || c1435e.equals(pVar.f24226D0)) {
            this.f24087k0 = this.f24071A.indexOf(c1435e);
        }
    }

    public final void setup(C1435e c1435e) {
        p pVar = this.f24078a;
        int i7 = pVar.f24261b;
        this.f24071A = s.u(c1435e, pVar);
        a();
        invalidate();
    }
}
