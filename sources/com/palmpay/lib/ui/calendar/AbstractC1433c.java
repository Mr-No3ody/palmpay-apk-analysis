package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1433c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f24197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I f24198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1431a f24199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f24200d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f24197a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        K k2 = (K) this;
        t tVar = (t) this.f24197a.get(i7);
        YearView yearView = ((J) viewHolder).f24143a;
        int i10 = tVar.f24337b;
        int i11 = tVar.f24336a;
        yearView.f24175B = i10;
        yearView.f24176C = i11;
        yearView.f24177H = s.l(null, i10, i11, s.k(i10, i11), yearView.f24179a.f24261b);
        s.n(yearView.f24175B, yearView.f24176C, 1, yearView.f24179a.f24261b);
        p pVar = yearView.f24179a;
        yearView.f24188o = s.t(pVar, yearView.f24175B, yearView.f24176C, pVar.f24275j0, pVar.f24261b, false);
        yearView.f24178L = 6;
        Map map = yearView.f24179a.f24285o0;
        if (map != null && map.size() != 0) {
            for (C1435e c1435e : yearView.f24188o) {
                if (yearView.f24179a.f24285o0.containsKey(c1435e.toString())) {
                    C1435e c1435e2 = (C1435e) yearView.f24179a.f24285o0.get(c1435e.toString());
                    if (c1435e2 != null) {
                        c1435e.f24207g = TextUtils.isEmpty(c1435e2.f24207g) ? yearView.f24179a.f24256X : c1435e2.f24207g;
                    }
                } else {
                    c1435e.f24207g = "";
                }
            }
        }
        yearView.a(k2.f24145f, k2.f24146g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        YearView defaultYearView;
        K k2 = (K) this;
        boolean zIsEmpty = TextUtils.isEmpty(k2.f24144e.f24253U);
        Context context = k2.f24200d;
        if (zIsEmpty) {
            defaultYearView = new DefaultYearView(context);
        } else {
            try {
                defaultYearView = (YearView) k2.f24144e.f24254V.getConstructor(Context.class).newInstance(context);
            } catch (Exception e10) {
                e10.printStackTrace();
                defaultYearView = new DefaultYearView(context);
            }
        }
        defaultYearView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        p pVar = k2.f24144e;
        CalendarView.OnClassInitializeListener onClassInitializeListener = pVar.f24222B0;
        if (onClassInitializeListener != null) {
            onClassInitializeListener.onClassInitialize(pVar.f24254V, defaultYearView);
        }
        p pVar2 = k2.f24144e;
        J j6 = new J(defaultYearView);
        j6.f24143a = defaultYearView;
        defaultYearView.setup(pVar2);
        j6.itemView.setTag(j6);
        j6.itemView.setOnClickListener(this.f24199c);
        return j6;
    }
}
