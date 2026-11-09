package com.palmpay.lib.ui.calendar;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements BaseRecyclerAdapter$OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YearRecyclerView f24142a;

    public I(YearRecyclerView yearRecyclerView) {
        this.f24142a = yearRecyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.palmpay.lib.ui.calendar.BaseRecyclerAdapter$OnItemClickListener
    public final void onItemClick(int i7, long j6) {
        Object obj;
        t tVar;
        int i10;
        int i11;
        YearRecyclerView yearRecyclerView = this.f24142a;
        if (yearRecyclerView.f24173c == null || yearRecyclerView.f24171a == null) {
            return;
        }
        K k2 = yearRecyclerView.f24172b;
        if (i7 >= 0) {
            ArrayList arrayList = k2.f24197a;
            if (i7 < arrayList.size()) {
                obj = arrayList.get(i7);
            }
            tVar = (t) obj;
            if (tVar == null) {
                return;
            }
            i10 = tVar.f24337b;
            int i12 = tVar.f24336a;
            p pVar = yearRecyclerView.f24171a;
            i11 = pVar.f24257Y;
            int i13 = pVar.f24260a0;
            int i14 = pVar.f24258Z;
            int i15 = pVar.b0;
            if (i10 >= i11 || i10 > i14) {
            }
            if (i10 != i11 || i12 >= i13) {
                if (i10 != i14 || i12 <= i15) {
                    yearRecyclerView.f24173c.onMonthSelected(i10, i12);
                    CalendarView.OnYearViewChangeListener onYearViewChangeListener = yearRecyclerView.f24171a.f24220A0;
                    if (onYearViewChangeListener != null) {
                        onYearViewChangeListener.onYearViewChange(true);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        k2.getClass();
        obj = null;
        tVar = (t) obj;
        if (tVar == null) {
            return;
        }
        i10 = tVar.f24337b;
        int i16 = tVar.f24336a;
        p pVar2 = yearRecyclerView.f24171a;
        i11 = pVar2.f24257Y;
        int i17 = pVar2.f24260a0;
        int i18 = pVar2.f24258Z;
        int i19 = pVar2.b0;
        if (i10 >= i11) {
        }
    }
}
