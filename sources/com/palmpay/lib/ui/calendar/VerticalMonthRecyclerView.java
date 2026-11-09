package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalMonthRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f24161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24163c;

    public VerticalMonthRecyclerView(@NonNull Context context) {
        super(context);
        this.f24163c = L6.g.lib_ui_layout_calendar_vertical_month_view;
        a(context);
    }

    public final void a(Context context) {
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        if (isInEditMode()) {
            setup(new p(context, null));
        }
    }

    public final void b(int i7, boolean z3) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (z3) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i7);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                smoothScrollToPosition(i7);
                postDelayed(new C(this, i7), 240L);
            } else {
                smoothScrollBy(0, layoutManager.getDecoratedTop(viewHolderFindViewHolderForAdapterPosition.itemView) - getPaddingTop());
            }
        } else if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i7, 0);
        } else {
            scrollToPosition(i7);
        }
        c();
    }

    public final void c() {
        ArrayList<E> arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            RecyclerView.ViewHolder childViewHolder = getChildViewHolder(getChildAt(i7));
            if (childViewHolder instanceof E) {
                arrayList.add((E) childViewHolder);
            }
        }
        for (E e10 : arrayList) {
            e10.f24134a.setSelectedCalendar(this.f24161a.f24226D0);
            e10.f24134a.invalidate();
        }
    }

    public void setCurrentItem(int i7) {
        b(i7, true);
    }

    public void setup(p pVar) {
        this.f24161a = pVar;
        this.f24162b = (((pVar.f24258Z - pVar.f24257Y) * 12) - pVar.f24260a0) + 1 + pVar.b0;
        setAdapter(new D(this));
    }

    public VerticalMonthRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24163c = L6.g.lib_ui_layout_calendar_vertical_month_view;
        a(context);
    }

    public VerticalMonthRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f24163c = L6.g.lib_ui_layout_calendar_vertical_month_view;
        a(context);
    }
}
