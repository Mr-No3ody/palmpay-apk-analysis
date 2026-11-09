package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f24114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MonthViewPager f24115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeekViewPager f24116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f24117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public YearViewPager f24118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeekBar f24119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CalendarLayout f24120g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24121i;

    public interface OnCalendarInterceptListener {
        boolean onCalendarIntercept(C1435e c1435e);

        void onCalendarInterceptClick(C1435e c1435e, boolean z3);
    }

    public interface OnCalendarLongClickListener {
        void onCalendarLongClick(C1435e c1435e);

        void onCalendarLongClickOutOfRange(C1435e c1435e);
    }

    public interface OnCalendarMultiSelectListener {
        void onCalendarMultiSelect(C1435e c1435e, int i7, int i10);

        void onCalendarMultiSelectOutOfRange(C1435e c1435e);

        void onMultiSelectOutOfSize(C1435e c1435e, int i7);
    }

    public interface OnCalendarRangeSelectListener {
        void onCalendarRangeSelect(C1435e c1435e, boolean z3);

        void onCalendarSelectOutOfRange(C1435e c1435e);

        void onSelectOutOfRange(C1435e c1435e, boolean z3);
    }

    public interface OnCalendarSelectListener {
        void onCalendarOutOfRange(C1435e c1435e);

        void onCalendarSelect(C1435e c1435e, boolean z3);
    }

    public interface OnClassInitializeListener {
        void onClassInitialize(Class<?> cls, View view);
    }

    public interface OnClickCalendarPaddingListener {
        void onClickCalendarPadding(float f10, float f11, boolean z3, C1435e c1435e, Object obj);
    }

    public interface OnInnerDateSelectedListener {
        void onMonthDateSelected(C1435e c1435e, boolean z3);

        void onWeekDateSelected(C1435e c1435e, boolean z3);
    }

    public interface OnMonthChangeListener {
        void onMonthChange(int i7, int i10);
    }

    public interface OnVerticalItemInitializeListener {
        void onVerticalItemInitialize(E e10, int i7, int i10, int i11);
    }

    public interface OnViewChangeListener {
        void onViewChange(boolean z3);
    }

    public interface OnWeekChangeListener {
        void onWeekChange(List<C1435e> list);
    }

    public interface OnYearChangeListener {
        void onYearChange(int i7);
    }

    public interface OnYearViewChangeListener {
        void onYearViewChange(boolean z3);
    }

    public CalendarView(@NonNull Context context) {
        this(context, null);
    }

    private void setShowMode(int i7) {
        if (i7 == 0 || i7 == 1 || i7 == 2) {
            p pVar = this.f24114a;
            if (pVar.f24262c == i7) {
                return;
            }
            pVar.f24262c = i7;
            WeekViewPager weekViewPager = this.f24116c;
            int i10 = 0;
            for (int i11 = 0; i11 < weekViewPager.getChildCount(); i11++) {
                ((BaseWeekView) weekViewPager.getChildAt(i11)).invalidate();
            }
            MonthViewPager monthViewPager = this.f24115b;
            if (monthViewPager.f24151c != null) {
                while (true) {
                    int iK = 6;
                    if (i10 >= monthViewPager.getChildCount()) {
                        break;
                    }
                    BaseMonthView baseMonthView = (BaseMonthView) monthViewPager.getChildAt(i10);
                    int i12 = baseMonthView.f24066q0;
                    int i13 = baseMonthView.f24067r0;
                    p pVar2 = baseMonthView.f24078a;
                    int i14 = pVar2.f24261b;
                    if (pVar2.f24262c != 0) {
                        iK = ((s.k(i12, i13) + s.n(i12, i13, 1, i14)) + s.l(null, i12, i13, s.k(i12, i13), i14)) / 7;
                    }
                    baseMonthView.f24068s0 = iK;
                    int i15 = baseMonthView.f24066q0;
                    int i16 = baseMonthView.f24067r0;
                    int i17 = baseMonthView.f24072B;
                    p pVar3 = baseMonthView.f24078a;
                    int i18 = pVar3.f24261b;
                    baseMonthView.f24069t0 = s.m(i15, i16, i17, pVar3);
                    baseMonthView.invalidate();
                    baseMonthView.requestLayout();
                    i10++;
                }
                p pVar4 = monthViewPager.f24151c;
                if (pVar4.f24262c == 0) {
                    int i19 = pVar4.f24270g0 * 6;
                    monthViewPager.f24154f = i19;
                    monthViewPager.f24152d = i19;
                    monthViewPager.f24153e = i19;
                } else {
                    C1435e c1435e = pVar4.f24226D0;
                    monthViewPager.b(c1435e.f24201a, c1435e.f24202b);
                }
                ViewGroup.LayoutParams layoutParams = monthViewPager.getLayoutParams();
                layoutParams.height = monthViewPager.f24154f;
                monthViewPager.setLayoutParams(layoutParams);
                CalendarLayout calendarLayout = monthViewPager.f24155g;
                if (calendarLayout != null) {
                    calendarLayout.g();
                }
            }
            WeekViewPager weekViewPager2 = this.f24116c;
            p pVar5 = weekViewPager2.f24168c;
            weekViewPager2.f24167b = s.q(pVar5.f24257Y, pVar5.f24260a0, pVar5.c0, pVar5.f24258Z, pVar5.b0, pVar5.f24264d0, pVar5.f24261b);
            if (weekViewPager2.getAdapter() == null) {
                return;
            }
            weekViewPager2.getAdapter().i();
        }
    }

    private void setWeekStart(int i7) {
        if (i7 == 1 || i7 == 2 || i7 == 7) {
            p pVar = this.f24114a;
            if (i7 == pVar.f24261b) {
                return;
            }
            pVar.f24261b = i7;
            this.f24119f.a(i7);
            this.f24119f.getClass();
            WeekViewPager weekViewPager = this.f24116c;
            if (weekViewPager.getAdapter() != null) {
                int iC = weekViewPager.getAdapter().c();
                p pVar2 = weekViewPager.f24168c;
                int iQ = s.q(pVar2.f24257Y, pVar2.f24260a0, pVar2.c0, pVar2.f24258Z, pVar2.b0, pVar2.f24264d0, pVar2.f24261b);
                weekViewPager.f24167b = iQ;
                if (iC != iQ) {
                    weekViewPager.f24166a = true;
                    weekViewPager.getAdapter().i();
                }
                for (int i10 = 0; i10 < weekViewPager.getChildCount(); i10++) {
                    BaseWeekView baseWeekView = (BaseWeekView) weekViewPager.getChildAt(i10);
                    int iIntValue = ((Integer) baseWeekView.getTag()).intValue();
                    p pVar3 = baseWeekView.f24078a;
                    C1435e c1435eI = s.i(pVar3.f24257Y, pVar3.f24260a0, pVar3.c0, iIntValue + 1, pVar3.f24261b);
                    baseWeekView.setSelectedCalendar(baseWeekView.f24078a.f24226D0);
                    baseWeekView.setup(c1435eI);
                }
                weekViewPager.f24166a = false;
                weekViewPager.a(weekViewPager.f24168c.f24226D0);
            }
            MonthViewPager monthViewPager = this.f24115b;
            if (monthViewPager.f24151c != null) {
                for (int i11 = 0; i11 < monthViewPager.getChildCount(); i11++) {
                    BaseMonthView baseMonthView = (BaseMonthView) monthViewPager.getChildAt(i11);
                    baseMonthView.f();
                    int i12 = baseMonthView.f24066q0;
                    int i13 = baseMonthView.f24067r0;
                    int i14 = baseMonthView.f24072B;
                    p pVar4 = baseMonthView.f24078a;
                    int i15 = pVar4.f24261b;
                    baseMonthView.f24069t0 = s.m(i12, i13, i14, pVar4);
                    baseMonthView.requestLayout();
                }
                C1435e c1435e = monthViewPager.f24151c.f24226D0;
                monthViewPager.b(c1435e.f24201a, c1435e.f24202b);
                ViewGroup.LayoutParams layoutParams = monthViewPager.getLayoutParams();
                layoutParams.height = monthViewPager.f24154f;
                monthViewPager.setLayoutParams(layoutParams);
                if (monthViewPager.f24155g != null) {
                    p pVar5 = monthViewPager.f24151c;
                    monthViewPager.f24155g.i(s.r(pVar5.f24226D0, pVar5.f24261b));
                }
                monthViewPager.c();
            }
            YearViewPager yearViewPager = this.f24118e;
            for (int i16 = 0; i16 < yearViewPager.getChildCount(); i16++) {
                YearRecyclerView yearRecyclerView = (YearRecyclerView) yearViewPager.getChildAt(i16);
                for (t tVar : yearRecyclerView.f24172b.f24197a) {
                    s.n(tVar.f24337b, tVar.f24336a, 1, yearRecyclerView.f24171a.f24261b);
                }
                if (yearRecyclerView.getAdapter() != null) {
                    yearRecyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public void a(int i7) {
        this.f24118e.setVisibility(8);
        this.f24119f.setVisibility(0);
        if (i7 == this.f24115b.getCurrentItem()) {
            p pVar = this.f24114a;
            OnCalendarSelectListener onCalendarSelectListener = pVar.f24291r0;
            if (onCalendarSelectListener != null && pVar.f24265e != 1) {
                onCalendarSelectListener.onCalendarSelect(pVar.f24226D0, false);
            }
        } else {
            this.f24115b.setCurrentItem(i7, false);
        }
        this.f24119f.animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280L).setListener(new G7.j(this, 8));
        this.f24115b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new o(this));
    }

    public void b(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(this.f24121i, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(L6.f.frameContent);
        WeekViewPager weekViewPager = (WeekViewPager) findViewById(L6.f.vp_week);
        this.f24116c = weekViewPager;
        p pVar = this.f24114a;
        weekViewPager.setup(pVar);
        try {
            this.f24119f = (WeekBar) pVar.f24255W.getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        frameLayout.addView(this.f24119f, 2);
        this.f24119f.setup(pVar);
        this.f24119f.a(pVar.f24261b);
        OnClassInitializeListener onClassInitializeListener = pVar.f24222B0;
        if (onClassInitializeListener != null) {
            onClassInitializeListener.onClassInitialize(pVar.f24255W, this.f24119f);
        }
        View viewFindViewById = findViewById(L6.f.line);
        this.f24117d = viewFindViewById;
        viewFindViewById.setVisibility(pVar.f24245N ? 0 : 8);
        this.f24117d.setBackgroundColor(pVar.f24239K);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24117d.getLayoutParams();
        int i7 = pVar.f24247O;
        layoutParams.setMargins(i7, pVar.i0, i7, 0);
        this.f24117d.setLayoutParams(layoutParams);
        MonthViewPager monthViewPager = (MonthViewPager) findViewById(L6.f.vp_month);
        this.f24115b = monthViewPager;
        monthViewPager.f24156i = this.f24116c;
        monthViewPager.f24157j = this.f24119f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) monthViewPager.getLayoutParams();
        layoutParams2.setMargins(0, s.e(context, 1.0f) + pVar.i0, 0, 0);
        this.f24116c.setLayoutParams(layoutParams2);
        YearViewPager yearViewPager = (YearViewPager) findViewById(L6.f.selectLayout);
        this.f24118e = yearViewPager;
        yearViewPager.setPadding(pVar.f24288q, 0, pVar.f24290r, 0);
        this.f24118e.setBackgroundColor(pVar.f24241L);
        this.f24118e.addOnPageChangeListener(new C1442l(this));
        pVar.f24298v0 = new m(this);
        if (pVar.f24265e != 0) {
            pVar.f24226D0 = new C1435e();
        } else if (c(pVar.f24275j0)) {
            pVar.f24226D0 = pVar.b();
        } else {
            pVar.f24226D0 = pVar.d();
        }
        pVar.f24228E0 = pVar.f24226D0;
        this.f24119f.getClass();
        this.f24115b.setup(pVar);
        this.f24115b.setCurrentItem(pVar.f24283n0);
        this.f24118e.setOnMonthSelectedListener(new n(this));
        this.f24118e.setup(pVar);
        this.f24116c.a(pVar.b());
    }

    public final boolean c(C1435e c1435e) {
        p pVar = this.f24114a;
        return pVar != null && s.v(c1435e, pVar);
    }

    public void d(int i7, int i10, int i11) {
        C1435e c1435e = new C1435e();
        c1435e.f24201a = i7;
        c1435e.f24202b = i10;
        c1435e.f24203c = i11;
        if (c1435e.b() && c(c1435e)) {
            p pVar = this.f24114a;
            OnCalendarInterceptListener onCalendarInterceptListener = pVar.f24289q0;
            if (onCalendarInterceptListener != null && onCalendarInterceptListener.onCalendarIntercept(c1435e)) {
                pVar.f24289q0.onCalendarInterceptClick(c1435e, false);
                return;
            }
            if (this.f24116c.getVisibility() == 0) {
                WeekViewPager weekViewPager = this.f24116c;
                weekViewPager.f24170e = true;
                C1435e c1435e2 = new C1435e();
                c1435e2.f24201a = i7;
                c1435e2.f24202b = i10;
                c1435e2.f24203c = i11;
                c1435e2.f24205e = c1435e2.equals(weekViewPager.f24168c.f24275j0);
                r.c(c1435e2);
                p pVar2 = weekViewPager.f24168c;
                pVar2.f24228E0 = c1435e2;
                pVar2.f24226D0 = c1435e2;
                pVar2.e();
                weekViewPager.a(c1435e2);
                OnInnerDateSelectedListener onInnerDateSelectedListener = weekViewPager.f24168c.f24298v0;
                if (onInnerDateSelectedListener != null) {
                    onInnerDateSelectedListener.onWeekDateSelected(c1435e2, false);
                }
                OnCalendarSelectListener onCalendarSelectListener = weekViewPager.f24168c.f24291r0;
                if (onCalendarSelectListener != null) {
                    onCalendarSelectListener.onCalendarSelect(c1435e2, false);
                }
                weekViewPager.f24169d.i(s.r(c1435e2, weekViewPager.f24168c.f24261b));
                return;
            }
            MonthViewPager monthViewPager = this.f24115b;
            p pVar3 = monthViewPager.f24151c;
            if (pVar3 == null) {
                return;
            }
            monthViewPager.f24158o = true;
            C1435e c1435e3 = new C1435e();
            c1435e3.f24201a = i7;
            c1435e3.f24202b = i10;
            c1435e3.f24203c = i11;
            c1435e3.f24205e = c1435e3.equals(pVar3.f24275j0);
            r.c(c1435e3);
            p pVar4 = monthViewPager.f24151c;
            pVar4.f24228E0 = c1435e3;
            pVar4.f24226D0 = c1435e3;
            pVar4.e();
            int i12 = c1435e3.f24201a;
            p pVar5 = monthViewPager.f24151c;
            int i13 = (((i12 - pVar5.f24257Y) * 12) + c1435e3.f24202b) - pVar5.f24260a0;
            if (monthViewPager.getCurrentItem() == i13) {
                monthViewPager.f24158o = false;
            }
            monthViewPager.setCurrentItem(i13, false);
            BaseMonthView baseMonthView = (BaseMonthView) monthViewPager.findViewWithTag(Integer.valueOf(i13));
            if (baseMonthView != null) {
                baseMonthView.setSelectedCalendar(monthViewPager.f24151c.f24228E0);
                baseMonthView.invalidate();
                CalendarLayout calendarLayout = monthViewPager.f24155g;
                if (calendarLayout != null) {
                    calendarLayout.h(baseMonthView.f24071A.indexOf(monthViewPager.f24151c.f24228E0));
                }
            }
            if (monthViewPager.f24155g != null) {
                monthViewPager.f24155g.i(s.r(c1435e3, monthViewPager.f24151c.f24261b));
            }
            OnCalendarSelectListener onCalendarSelectListener2 = monthViewPager.f24151c.f24291r0;
            if (onCalendarSelectListener2 != null) {
                onCalendarSelectListener2.onCalendarSelect(c1435e3, false);
            }
            OnInnerDateSelectedListener onInnerDateSelectedListener2 = monthViewPager.f24151c.f24298v0;
            if (onInnerDateSelectedListener2 != null) {
                onInnerDateSelectedListener2.onMonthDateSelected(c1435e3, false);
            }
            monthViewPager.c();
        }
    }

    public final void e() {
        this.f24119f.a(this.f24114a.f24261b);
        YearViewPager yearViewPager = this.f24118e;
        for (int i7 = 0; i7 < yearViewPager.getChildCount(); i7++) {
            YearRecyclerView yearRecyclerView = (YearRecyclerView) yearViewPager.getChildAt(i7);
            if (yearRecyclerView.getAdapter() != null) {
                yearRecyclerView.getAdapter().notifyDataSetChanged();
            }
        }
        MonthViewPager monthViewPager = this.f24115b;
        for (int i10 = 0; i10 < monthViewPager.getChildCount(); i10++) {
            ((BaseMonthView) monthViewPager.getChildAt(i10)).d();
        }
        WeekViewPager weekViewPager = this.f24116c;
        for (int i11 = 0; i11 < weekViewPager.getChildCount(); i11++) {
            ((BaseWeekView) weekViewPager.getChildAt(i11)).d();
        }
    }

    public int getCurDay() {
        return this.f24114a.f24275j0.f24203c;
    }

    public int getCurMonth() {
        return this.f24114a.f24275j0.f24202b;
    }

    public int getCurYear() {
        return this.f24114a.f24275j0.f24201a;
    }

    public List<C1435e> getCurrentMonthCalendars() {
        return this.f24115b.getCurrentMonthCalendars();
    }

    public int getCurrentMonthLines() {
        return this.f24115b.getCurrentMonthLines();
    }

    public List<C1435e> getCurrentMonthSchemeCalendars() {
        BaseMonthView currentMonthView;
        MonthViewPager monthViewPager = this.f24115b;
        if (monthViewPager == null || (currentMonthView = monthViewPager.getCurrentMonthView()) == null) {
            return null;
        }
        return currentMonthView.getCurrentSchemeCalendars();
    }

    public List<C1435e> getCurrentWeekCalendars() {
        return this.f24116c.getCurrentWeekCalendars();
    }

    public p getDelegate() {
        return this.f24114a;
    }

    public final int getMaxMultiSelectSize() {
        return this.f24114a.f24232G0;
    }

    public C1435e getMaxRangeCalendar() {
        return this.f24114a.c();
    }

    public final int getMaxSelectRange() {
        return this.f24114a.f24240K0;
    }

    public C1435e getMinRangeCalendar() {
        return this.f24114a.d();
    }

    public final int getMinSelectRange() {
        return this.f24114a.f24238J0;
    }

    public MonthViewPager getMonthViewPager() {
        return this.f24115b;
    }

    public final List<C1435e> getMultiSelectCalendars() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f24114a;
        if (pVar.f24230F0.size() == 0) {
            return arrayList;
        }
        arrayList.addAll(pVar.f24230F0.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public final List<C1435e> getSelectCalendarRange() {
        p pVar = this.f24114a;
        if (pVar.f24265e != 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (pVar.f24234H0 != null && pVar.f24236I0 != null) {
            Calendar calendar = Calendar.getInstance();
            C1435e c1435e = pVar.f24234H0;
            calendar.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c);
            C1435e c1435e2 = pVar.f24236I0;
            calendar.set(c1435e2.f24201a, c1435e2.f24202b - 1, c1435e2.f24203c);
            long timeInMillis = calendar.getTimeInMillis();
            for (long timeInMillis2 = calendar.getTimeInMillis(); timeInMillis2 <= timeInMillis; timeInMillis2 += 86400000) {
                calendar.setTimeInMillis(timeInMillis2);
                C1435e c1435e3 = new C1435e();
                c1435e3.f24201a = calendar.get(1);
                c1435e3.f24202b = calendar.get(2) + 1;
                c1435e3.f24203c = calendar.get(5);
                r.c(c1435e3);
                Map map = pVar.f24285o0;
                if (map != null && map.size() != 0) {
                    String string = c1435e3.toString();
                    if (pVar.f24285o0.containsKey(string)) {
                        C1435e c1435e4 = (C1435e) pVar.f24285o0.get(string);
                        String str = pVar.f24256X;
                        if (c1435e4 != null) {
                            if (!TextUtils.isEmpty(c1435e4.f24207g)) {
                                str = c1435e4.f24207g;
                            }
                            c1435e3.f24207g = str;
                        }
                    }
                }
                OnCalendarInterceptListener onCalendarInterceptListener = pVar.f24289q0;
                if (onCalendarInterceptListener == null || !onCalendarInterceptListener.onCalendarIntercept(c1435e3)) {
                    arrayList.add(c1435e3);
                }
            }
            pVar.a(arrayList);
        }
        return arrayList;
    }

    public C1435e getSelectedCalendar() {
        return this.f24114a.f24226D0;
    }

    public WeekViewPager getWeekViewPager() {
        return this.f24116c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() == null || !(getParent() instanceof CalendarLayout)) {
            return;
        }
        CalendarLayout calendarLayout = (CalendarLayout) getParent();
        this.f24120g = calendarLayout;
        this.f24115b.f24155g = calendarLayout;
        this.f24116c.f24169d = calendarLayout;
        calendarLayout.getClass();
        this.f24120g.setup(this.f24114a);
        CalendarLayout calendarLayout2 = this.f24120g;
        int i7 = calendarLayout2.f24110o;
        if ((calendarLayout2.f24102b != 1 && i7 != 1) || i7 == 2) {
            if (calendarLayout2.f24100Q.f24306z0 == null) {
                return;
            }
            calendarLayout2.post(new RunnableC1441k(calendarLayout2));
        } else if (calendarLayout2.f24108i != null) {
            calendarLayout2.post(new RunnableC1437g(calendarLayout2, 2));
        } else {
            calendarLayout2.f24106f.setVisibility(0);
            calendarLayout2.f24104d.setVisibility(8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        p pVar = this.f24114a;
        if (pVar == null || !pVar.f24272h0) {
            super.onMeasure(i7, i10);
        } else {
            setCalendarItemHeight((size - pVar.i0) / 6);
            super.onMeasure(i7, i10);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        p pVar = this.f24114a;
        pVar.f24226D0 = (C1435e) bundle.getSerializable("selected_calendar");
        pVar.f24228E0 = (C1435e) bundle.getSerializable("index_calendar");
        OnCalendarSelectListener onCalendarSelectListener = pVar.f24291r0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(pVar.f24226D0, false);
        }
        C1435e c1435e = pVar.f24228E0;
        if (c1435e != null) {
            d(c1435e.f24201a, c1435e.f24202b, c1435e.f24203c);
        }
        e();
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = this.f24114a;
        if (pVar == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", pVar.f24226D0);
        bundle.putSerializable("index_calendar", pVar.f24228E0);
        return bundle;
    }

    public final void setCalendarItemHeight(int i7) {
        p pVar = this.f24114a;
        if (pVar.f24270g0 == i7) {
            return;
        }
        pVar.f24270g0 = i7;
        MonthViewPager monthViewPager = this.f24115b;
        if (monthViewPager.f24151c != null) {
            for (int i10 = 0; i10 < monthViewPager.getChildCount(); i10++) {
                BaseMonthView baseMonthView = (BaseMonthView) monthViewPager.getChildAt(i10);
                baseMonthView.e();
                baseMonthView.requestLayout();
            }
            p pVar2 = monthViewPager.f24151c;
            C1435e c1435e = pVar2.f24228E0;
            int i11 = c1435e.f24201a;
            int i12 = c1435e.f24202b;
            monthViewPager.f24154f = s.m(i11, i12, pVar2.f24270g0, pVar2);
            if (i12 == 1) {
                p pVar3 = monthViewPager.f24151c;
                monthViewPager.f24153e = s.m(i11 - 1, 12, pVar3.f24270g0, pVar3);
                p pVar4 = monthViewPager.f24151c;
                monthViewPager.f24152d = s.m(i11, 2, pVar4.f24270g0, pVar4);
            } else {
                p pVar5 = monthViewPager.f24151c;
                monthViewPager.f24153e = s.m(i11, i12 - 1, pVar5.f24270g0, pVar5);
                if (i12 == 12) {
                    p pVar6 = monthViewPager.f24151c;
                    monthViewPager.f24152d = s.m(i11 + 1, 1, pVar6.f24270g0, pVar6);
                } else {
                    p pVar7 = monthViewPager.f24151c;
                    monthViewPager.f24152d = s.m(i11, i12 + 1, pVar7.f24270g0, pVar7);
                }
            }
            ViewGroup.LayoutParams layoutParams = monthViewPager.getLayoutParams();
            layoutParams.height = monthViewPager.f24154f;
            monthViewPager.setLayoutParams(layoutParams);
        }
        WeekViewPager weekViewPager = this.f24116c;
        for (int i13 = 0; i13 < weekViewPager.getChildCount(); i13++) {
            BaseWeekView baseWeekView = (BaseWeekView) weekViewPager.getChildAt(i13);
            baseWeekView.e();
            baseWeekView.requestLayout();
        }
        CalendarLayout calendarLayout = this.f24120g;
        if (calendarLayout == null) {
            return;
        }
        p pVar8 = calendarLayout.f24100Q;
        calendarLayout.f24099M = pVar8.f24270g0;
        if (calendarLayout.f24108i == null) {
            return;
        }
        C1435e c1435e2 = pVar8.f24228E0;
        calendarLayout.i(s.r(c1435e2, pVar8.f24261b));
        p pVar9 = calendarLayout.f24100Q;
        if (pVar9.f24262c == 0) {
            calendarLayout.f24111p = calendarLayout.f24099M * 5;
        } else {
            calendarLayout.f24111p = s.d(c1435e2.f24201a, c1435e2.f24202b, calendarLayout.f24099M, pVar9) - calendarLayout.f24099M;
        }
        calendarLayout.f();
        if (calendarLayout.f24106f.getVisibility() == 0) {
            calendarLayout.f24108i.setTranslationY(-calendarLayout.f24111p);
        }
    }

    public void setCalendarPadding(int i7) {
        p pVar = this.f24114a;
        if (pVar == null) {
            return;
        }
        pVar.f24299w = i7;
        pVar.f24301x = i7;
        pVar.f24303y = i7;
        e();
    }

    public void setCalendarPaddingLeft(int i7) {
        p pVar = this.f24114a;
        if (pVar == null) {
            return;
        }
        pVar.f24301x = i7;
        e();
    }

    public void setCalendarPaddingRight(int i7) {
        p pVar = this.f24114a;
        if (pVar == null) {
            return;
        }
        pVar.f24303y = i7;
        e();
    }

    public final void setMaxMultiSelectSize(int i7) {
        this.f24114a.f24232G0 = i7;
    }

    public void setMonthView(Class<?> cls) {
        if (cls == null) {
            return;
        }
        p pVar = this.f24114a;
        if (pVar.f24251S.equals(cls)) {
            return;
        }
        pVar.f24251S = cls;
        MonthViewPager monthViewPager = this.f24115b;
        if (monthViewPager.f24151c == null) {
            return;
        }
        monthViewPager.f24149a = true;
        if (monthViewPager.getAdapter() != null) {
            monthViewPager.getAdapter().i();
        }
        monthViewPager.f24149a = false;
    }

    public final void setMonthViewScrollable(boolean z3) {
        this.f24114a.f24277k0 = z3;
    }

    public final void setOnCalendarInterceptListener(OnCalendarInterceptListener onCalendarInterceptListener) {
        p pVar = this.f24114a;
        if (onCalendarInterceptListener == null) {
            pVar.f24289q0 = null;
        }
        if (onCalendarInterceptListener == null || pVar.f24265e == 0) {
            return;
        }
        pVar.f24289q0 = onCalendarInterceptListener;
        if (onCalendarInterceptListener.onCalendarIntercept(pVar.f24226D0)) {
            pVar.f24226D0 = new C1435e();
        }
    }

    public void setOnCalendarLongClickListener(OnCalendarLongClickListener onCalendarLongClickListener) {
        this.f24114a.f24296u0 = onCalendarLongClickListener;
    }

    public final void setOnCalendarMultiSelectListener(OnCalendarMultiSelectListener onCalendarMultiSelectListener) {
        this.f24114a.f24294t0 = onCalendarMultiSelectListener;
    }

    public final void setOnCalendarRangeSelectListener(OnCalendarRangeSelectListener onCalendarRangeSelectListener) {
        this.f24114a.f24293s0 = onCalendarRangeSelectListener;
    }

    public void setOnCalendarSelectListener(OnCalendarSelectListener onCalendarSelectListener) {
        p pVar = this.f24114a;
        pVar.f24291r0 = onCalendarSelectListener;
        if (onCalendarSelectListener != null && pVar.f24265e == 0 && c(pVar.f24226D0)) {
            pVar.e();
        }
    }

    public void setOnClassInitialize(OnClassInitializeListener onClassInitializeListener) {
        this.f24114a.f24222B0 = onClassInitializeListener;
    }

    public final void setOnClickCalendarPaddingListener(OnClickCalendarPaddingListener onClickCalendarPaddingListener) {
        p pVar = this.f24114a;
        if (onClickCalendarPaddingListener == null) {
            pVar.f24287p0 = null;
        }
        if (onClickCalendarPaddingListener == null) {
            return;
        }
        pVar.f24287p0 = onClickCalendarPaddingListener;
    }

    public void setOnMonthChangeListener(OnMonthChangeListener onMonthChangeListener) {
        this.f24114a.f24302x0 = onMonthChangeListener;
    }

    public void setOnVerticalItemInitialize(OnVerticalItemInitializeListener onVerticalItemInitializeListener) {
        this.f24114a.f24224C0 = onVerticalItemInitializeListener;
    }

    public void setOnViewChangeListener(OnViewChangeListener onViewChangeListener) {
        this.f24114a.f24306z0 = onViewChangeListener;
    }

    public void setOnWeekChangeListener(OnWeekChangeListener onWeekChangeListener) {
        this.f24114a.f24304y0 = onWeekChangeListener;
    }

    public void setOnYearChangeListener(OnYearChangeListener onYearChangeListener) {
        this.f24114a.f24300w0 = onYearChangeListener;
    }

    public void setOnYearViewChangeListener(OnYearViewChangeListener onYearViewChangeListener) {
        this.f24114a.f24220A0 = onYearViewChangeListener;
    }

    public void setSchemeDate(Map<String, C1435e> map) {
        p pVar = this.f24114a;
        pVar.f24285o0 = map;
        pVar.e();
        YearViewPager yearViewPager = this.f24118e;
        for (int i7 = 0; i7 < yearViewPager.getChildCount(); i7++) {
            YearRecyclerView yearRecyclerView = (YearRecyclerView) yearViewPager.getChildAt(i7);
            if (yearRecyclerView.getAdapter() != null) {
                yearRecyclerView.getAdapter().notifyDataSetChanged();
            }
        }
        MonthViewPager monthViewPager = this.f24115b;
        for (int i10 = 0; i10 < monthViewPager.getChildCount(); i10++) {
            ((BaseMonthView) monthViewPager.getChildAt(i10)).d();
        }
        WeekViewPager weekViewPager = this.f24116c;
        for (int i11 = 0; i11 < weekViewPager.getChildCount(); i11++) {
            ((BaseWeekView) weekViewPager.getChildAt(i11)).d();
        }
    }

    public final void setSelectEndCalendar(C1435e c1435e) {
        C1435e c1435e2;
        p pVar = this.f24114a;
        int i7 = pVar.f24265e;
        if (i7 == 2 && (c1435e2 = pVar.f24234H0) != null && i7 == 2 && c1435e != null) {
            OnCalendarInterceptListener onCalendarInterceptListener = pVar.f24289q0;
            if (onCalendarInterceptListener != null && onCalendarInterceptListener.onCalendarIntercept(c1435e2)) {
                OnCalendarInterceptListener onCalendarInterceptListener2 = pVar.f24289q0;
                if (onCalendarInterceptListener2 != null) {
                    onCalendarInterceptListener2.onCalendarInterceptClick(c1435e2, false);
                    return;
                }
                return;
            }
            OnCalendarInterceptListener onCalendarInterceptListener3 = this.f24114a.f24289q0;
            if (onCalendarInterceptListener3 != null && onCalendarInterceptListener3.onCalendarIntercept(c1435e)) {
                OnCalendarInterceptListener onCalendarInterceptListener4 = pVar.f24289q0;
                if (onCalendarInterceptListener4 != null) {
                    onCalendarInterceptListener4.onCalendarInterceptClick(c1435e, false);
                    return;
                }
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c, 12, 0, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(c1435e2.f24201a, c1435e2.f24202b - 1, c1435e2.f24203c, 12, 0, 0);
            int timeInMillis2 = (int) ((timeInMillis - calendar.getTimeInMillis()) / 86400000);
            if (timeInMillis2 >= 0 && c(c1435e2) && c(c1435e)) {
                int i10 = pVar.f24238J0;
                if (i10 != -1 && i10 > timeInMillis2 + 1) {
                    OnCalendarRangeSelectListener onCalendarRangeSelectListener = pVar.f24293s0;
                    if (onCalendarRangeSelectListener != null) {
                        onCalendarRangeSelectListener.onSelectOutOfRange(c1435e, true);
                        return;
                    }
                    return;
                }
                int i11 = pVar.f24240K0;
                if (i11 != -1 && i11 < timeInMillis2 + 1) {
                    OnCalendarRangeSelectListener onCalendarRangeSelectListener2 = pVar.f24293s0;
                    if (onCalendarRangeSelectListener2 != null) {
                        onCalendarRangeSelectListener2.onSelectOutOfRange(c1435e, false);
                        return;
                    }
                    return;
                }
                if (i10 == -1 && timeInMillis2 == 0) {
                    pVar.f24234H0 = c1435e2;
                    pVar.f24236I0 = null;
                    OnCalendarRangeSelectListener onCalendarRangeSelectListener3 = pVar.f24293s0;
                    if (onCalendarRangeSelectListener3 != null) {
                        onCalendarRangeSelectListener3.onCalendarRangeSelect(c1435e2, false);
                    }
                    d(c1435e2.f24201a, c1435e2.f24202b, c1435e2.f24203c);
                    return;
                }
                pVar.f24234H0 = c1435e2;
                pVar.f24236I0 = c1435e;
                OnCalendarRangeSelectListener onCalendarRangeSelectListener4 = pVar.f24293s0;
                if (onCalendarRangeSelectListener4 != null) {
                    onCalendarRangeSelectListener4.onCalendarRangeSelect(c1435e2, false);
                    pVar.f24293s0.onCalendarRangeSelect(c1435e, true);
                }
                d(c1435e2.f24201a, c1435e2.f24202b, c1435e2.f24203c);
            }
        }
    }

    public final void setSelectStartCalendar(C1435e c1435e) {
        p pVar = this.f24114a;
        if (pVar.f24265e == 2 && c1435e != null) {
            if (!c(c1435e)) {
                OnCalendarRangeSelectListener onCalendarRangeSelectListener = pVar.f24293s0;
                if (onCalendarRangeSelectListener != null) {
                    onCalendarRangeSelectListener.onSelectOutOfRange(c1435e, true);
                    return;
                }
                return;
            }
            OnCalendarInterceptListener onCalendarInterceptListener = this.f24114a.f24289q0;
            if (onCalendarInterceptListener == null || !onCalendarInterceptListener.onCalendarIntercept(c1435e)) {
                pVar.f24236I0 = null;
                pVar.f24234H0 = c1435e;
                d(c1435e.f24201a, c1435e.f24202b, c1435e.f24203c);
            } else {
                OnCalendarInterceptListener onCalendarInterceptListener2 = pVar.f24289q0;
                if (onCalendarInterceptListener2 != null) {
                    onCalendarInterceptListener2.onCalendarInterceptClick(c1435e, false);
                }
            }
        }
    }

    public final void setWeekBar(Class<?> cls) {
        if (cls == null) {
            return;
        }
        p pVar = this.f24114a;
        if (pVar.f24255W.equals(cls)) {
            return;
        }
        pVar.f24255W = cls;
        FrameLayout frameLayout = (FrameLayout) findViewById(L6.f.frameContent);
        frameLayout.removeView(this.f24119f);
        try {
            this.f24119f = (WeekBar) cls.getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        frameLayout.addView(this.f24119f, 2);
        this.f24119f.setup(pVar);
        this.f24119f.a(pVar.f24261b);
        MonthViewPager monthViewPager = this.f24115b;
        WeekBar weekBar = this.f24119f;
        monthViewPager.f24157j = weekBar;
        C1435e c1435e = pVar.f24226D0;
        int i7 = pVar.f24261b;
        weekBar.getClass();
        OnClassInitializeListener onClassInitializeListener = pVar.f24222B0;
        if (onClassInitializeListener != null) {
            onClassInitializeListener.onClassInitialize(pVar.f24255W, this.f24119f);
        }
    }

    public final void setWeekView(Class<?> cls) {
        if (cls == null) {
            return;
        }
        p pVar = this.f24114a;
        if (pVar.f24255W.equals(cls)) {
            return;
        }
        pVar.f24252T = cls;
        WeekViewPager weekViewPager = this.f24116c;
        weekViewPager.f24166a = true;
        if (weekViewPager.getAdapter() != null) {
            weekViewPager.getAdapter().i();
        }
        weekViewPager.f24166a = false;
    }

    public final void setWeekViewScrollable(boolean z3) {
        this.f24114a.f24279l0 = z3;
    }

    public final void setYearViewScrollable(boolean z3) {
        this.f24114a.f24281m0 = z3;
    }

    public CalendarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        YearViewPager yearViewPager;
        super(context, attributeSet);
        this.f24121i = L6.g.lib_ui_layout_calendar_view;
        p pVar = new p(context, attributeSet);
        this.f24114a = pVar;
        b(context, attributeSet);
        if (isInEditMode() && (yearViewPager = this.f24118e) != null && pVar.f24242L0) {
            yearViewPager.setVisibility(0);
        }
    }
}
