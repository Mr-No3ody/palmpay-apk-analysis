package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class YearRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f24171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f24172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnMonthSelectedListener f24173c;

    public interface OnMonthSelectedListener {
        void onMonthSelected(int i7, int i10);
    }

    public YearRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7) / 3;
        K k2 = this.f24172b;
        k2.f24145f = size2;
        k2.f24146g = size / 4;
    }

    public final void setOnMonthSelectedListener(OnMonthSelectedListener onMonthSelectedListener) {
        this.f24173c = onMonthSelectedListener;
    }

    public final void setup(p pVar) {
        this.f24171a = pVar;
        this.f24172b.f24144e = pVar;
    }

    public YearRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        K k2 = new K();
        k2.f24200d = context;
        k2.f24197a = new ArrayList();
        LayoutInflater.from(context);
        k2.f24199c = new C1431a(k2);
        this.f24172b = k2;
        setLayoutManager(new GridLayoutManager(context, 3));
        setAdapter(k2);
        k2.f24198b = new I(this);
    }
}
