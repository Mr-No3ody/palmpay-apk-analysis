package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerticalMonthRecyclerView f24122a;

    public D(VerticalMonthRecyclerView verticalMonthRecyclerView) {
        this.f24122a = verticalMonthRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f24122a.f24162b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        E e10 = (E) viewHolder;
        VerticalMonthRecyclerView verticalMonthRecyclerView = this.f24122a;
        p pVar = verticalMonthRecyclerView.f24161a;
        int i10 = (pVar.f24260a0 + i7) - 1;
        int i11 = (i10 / 12) + pVar.f24257Y;
        int i12 = i10 % 12;
        int i13 = i12 + 1;
        if (e10.f24134a == null) {
            try {
                e10.f24134a = (BaseMonthView) pVar.f24251S.getConstructor(Context.class).newInstance(verticalMonthRecyclerView.getContext());
                ((ViewGroup) e10.itemView.findViewById(L6.f.month_container)).addView(e10.f24134a);
            } catch (Exception e11) {
                e11.printStackTrace();
                e10.f24134a = new DefaultMonthView(verticalMonthRecyclerView.getContext());
            }
            p pVar2 = verticalMonthRecyclerView.f24161a;
            CalendarView.OnClassInitializeListener onClassInitializeListener = pVar2.f24222B0;
            if (onClassInitializeListener != null) {
                onClassInitializeListener.onClassInitialize(pVar2.f24251S, e10.f24134a);
            }
        }
        BaseMonthView baseMonthView = e10.f24134a;
        baseMonthView.f24091w = null;
        baseMonthView.setup(verticalMonthRecyclerView.f24161a);
        e10.f24134a.setTag(Integer.valueOf(i7));
        e10.f24134a.g(i11, i13);
        e10.f24134a.setSelectedCalendar(verticalMonthRecyclerView.f24161a.f24226D0);
        TextView textView = (TextView) e10.itemView.findViewById(L6.f.current_month_view);
        if (textView != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, i11);
            calendar.set(2, i12);
            calendar.set(5, 0);
            textView.setText(new SimpleDateFormat("MMMM yyyy", Locale.ENGLISH).format(calendar.getTime()));
        }
        CalendarView.OnVerticalItemInitializeListener onVerticalItemInitializeListener = verticalMonthRecyclerView.f24161a.f24224C0;
        if (onVerticalItemInitializeListener != null) {
            onVerticalItemInitializeListener.onVerticalItemInitialize(e10, i7, i11, i13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new E(LayoutInflater.from(viewGroup.getContext()).inflate(this.f24122a.f24163c, viewGroup, false));
    }
}
