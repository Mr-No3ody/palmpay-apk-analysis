package com.palmpay.lib.ui.calendar;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ YearViewPager f24147c;

    public L(YearViewPager yearViewPager) {
        this.f24147c = yearViewPager;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager viewPager, int i7, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f24147c.f24193a;
    }

    @Override // androidx.viewpager.widget.a
    public final int d() {
        int i7 = YearViewPager.f24192d;
        return -1;
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager viewPager, int i7) {
        YearViewPager yearViewPager = this.f24147c;
        YearRecyclerView yearRecyclerView = new YearRecyclerView(yearViewPager.getContext());
        viewPager.addView(yearRecyclerView);
        yearRecyclerView.setup(yearViewPager.f24194b);
        yearRecyclerView.setOnMonthSelectedListener(yearViewPager.f24195c);
        int i10 = i7 + yearViewPager.f24194b.f24257Y;
        Calendar calendar = Calendar.getInstance();
        for (int i11 = 1; i11 <= 12; i11++) {
            calendar.set(i10, i11 - 1, 1);
            t tVar = new t();
            s.n(i10, i11, 1, yearRecyclerView.f24171a.f24261b);
            tVar.f24336a = i11;
            tVar.f24337b = i10;
            K k2 = yearRecyclerView.f24172b;
            ArrayList arrayList = k2.f24197a;
            arrayList.add(tVar);
            k2.notifyItemChanged(arrayList.size());
        }
        return yearRecyclerView;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object obj) {
        return view == obj;
    }
}
