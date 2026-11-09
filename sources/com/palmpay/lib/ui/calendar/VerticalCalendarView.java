package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalCalendarView extends CalendarView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VerticalMonthRecyclerView f24160j;

    public VerticalCalendarView(@NonNull Context context) {
        super(context);
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView
    public final void a(int i7) {
        super.a(i7);
        this.f24160j.b(i7, false);
        this.f24160j.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new B(this));
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView
    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.j.PpVerticalCalendarView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(L6.j.PpVerticalCalendarView_vertical_month_item_layout_id, L6.g.lib_ui_layout_calendar_vertical_month_view);
        typedArrayObtainStyledAttributes.recycle();
        this.f24121i = L6.g.lib_ui_layout_calendar_vertical_view;
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
        CalendarView.OnClassInitializeListener onClassInitializeListener = pVar.f24222B0;
        if (onClassInitializeListener != null) {
            onClassInitializeListener.onClassInitialize(pVar.f24255W, this.f24119f);
        }
        View viewFindViewById = findViewById(L6.f.line);
        this.f24117d = viewFindViewById;
        viewFindViewById.setBackgroundColor(pVar.f24239K);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24117d.getLayoutParams();
        int i7 = pVar.f24247O;
        layoutParams.setMargins(i7, pVar.i0, i7, 0);
        this.f24117d.setLayoutParams(layoutParams);
        this.f24115b = new MonthViewPager(context);
        VerticalMonthRecyclerView verticalMonthRecyclerView = (VerticalMonthRecyclerView) findViewById(L6.f.rv_month);
        this.f24160j = verticalMonthRecyclerView;
        verticalMonthRecyclerView.f24163c = resourceId;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) verticalMonthRecyclerView.getLayoutParams();
        layoutParams2.setMargins(0, s.e(context, 1.0f) + pVar.i0, 0, 0);
        this.f24116c.setLayoutParams(layoutParams2);
        YearViewPager yearViewPager = (YearViewPager) findViewById(L6.f.selectLayout);
        this.f24118e = yearViewPager;
        yearViewPager.setPadding(pVar.f24288q, 0, pVar.f24290r, 0);
        this.f24118e.setBackgroundColor(pVar.f24241L);
        this.f24118e.addOnPageChangeListener(new y(this));
        pVar.f24298v0 = new z(this);
        if (pVar.f24265e != 0) {
            pVar.f24226D0 = new C1435e();
        } else if (c(pVar.f24275j0)) {
            pVar.f24226D0 = pVar.b();
        } else {
            pVar.f24226D0 = pVar.d();
        }
        pVar.f24228E0 = pVar.f24226D0;
        this.f24119f.getClass();
        this.f24160j.setup(pVar);
        this.f24160j.b(pVar.f24283n0, false);
        this.f24118e.setOnMonthSelectedListener(new A(this));
        this.f24118e.setup(pVar);
        this.f24116c.a(pVar.b());
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView
    public final void d(int i7, int i10, int i11) {
        super.d(i7, i10, i11);
        VerticalMonthRecyclerView verticalMonthRecyclerView = this.f24160j;
        verticalMonthRecyclerView.getClass();
        C1435e c1435e = new C1435e();
        c1435e.f24201a = i7;
        c1435e.f24202b = i10;
        c1435e.f24203c = i11;
        c1435e.f24205e = c1435e.equals(verticalMonthRecyclerView.f24161a.f24275j0);
        r.c(c1435e);
        p pVar = verticalMonthRecyclerView.f24161a;
        pVar.f24228E0 = c1435e;
        pVar.f24226D0 = c1435e;
        pVar.e();
        int i12 = c1435e.f24201a;
        p pVar2 = verticalMonthRecyclerView.f24161a;
        verticalMonthRecyclerView.b((((i12 - pVar2.f24257Y) * 12) + c1435e.f24202b) - pVar2.f24260a0, false);
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView
    public void setMonthView(Class<?> cls) {
        super.setMonthView(cls);
        VerticalMonthRecyclerView verticalMonthRecyclerView = this.f24160j;
        verticalMonthRecyclerView.setup(verticalMonthRecyclerView.f24161a);
        verticalMonthRecyclerView.b(verticalMonthRecyclerView.f24161a.f24283n0, false);
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView
    public void setSchemeDate(Map<String, C1435e> map) {
        super.setSchemeDate(map);
        RecyclerView.Adapter adapter = this.f24160j.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeChanged(0, adapter.getItemCount());
        }
    }

    public VerticalCalendarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
