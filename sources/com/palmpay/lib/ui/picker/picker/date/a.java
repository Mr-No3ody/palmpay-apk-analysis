package com.palmpay.lib.ui.picker.picker.date;

import X6.c;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.f;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f24542A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Ba.a f24543B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f24544C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Function3 f24545H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Boolean f24546L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ArrayList f24547M;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String[] f24548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f24549p;
    public final Long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Long f24550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24551w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(E fragmentActivity, String[] tabTexts, int i7, Long l5, Long l6, int i10, boolean z3, Ba.a aVar, c cVar, Function3 function3, Boolean bool) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(tabTexts, "tabTexts");
        this.f24548o = tabTexts;
        this.f24549p = i7;
        this.t = l5;
        this.f24550v = l6;
        this.f24551w = i10;
        this.f24542A = z3;
        this.f24543B = aVar;
        this.f24544C = cVar;
        this.f24545H = function3;
        this.f24546L = bool;
        this.f24547M = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.f
    public final Fragment c(int i7) {
        Fragment aVar;
        int i10 = this.f24549p;
        Function3<? super Long, ? super Long, ? super Integer, Unit> function3 = this.f24545H;
        if (i10 == 2) {
            aVar = RangeDatePickerFragment.f24528C.getInstance(i10, null, null, this.t, null, this.f24550v, this.f24551w, this.f24542A, this.f24543B, this.f24544C, function3, this.f24546L);
        } else if (i10 != 4) {
            if (i10 != 5) {
                aVar = DatePickerFragment.f24520o.getInstance(i10, this.t, null, this.f24550v, this.f24542A, this.f24543B, this.f24544C);
            } else {
                aVar = TimePickerFragment.a.getInstance$default(TimePickerFragment.f24534i, i10, null, null, this.t, null, false, null, 96, null);
            }
        } else if (i7 == 0) {
            aVar = XDatePickerFragment.a.getInstance$default(XDatePickerFragment.f24540p, 3, this.t, null, null, this.f24542A, this.f24543B, 8, null);
        } else {
            aVar = RangeDatePickerFragment.f24528C.getInstance(2, null, null, this.t, null, this.f24550v, this.f24551w, this.f24542A, this.f24543B, this.f24544C, function3, this.f24546L);
        }
        this.f24547M.add(aVar);
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f24548o.length;
    }
}
