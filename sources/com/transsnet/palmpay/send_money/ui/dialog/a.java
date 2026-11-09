package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.V;
import Ad.W;
import Kb.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SelectDayDialog f33647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SelectDayDialog selectDayDialog, Context context) {
        super(context);
        this.f33647e = selectDayDialog;
    }

    @Override // Kb.c
    public final Object getItem(int i7) {
        return Integer.valueOf(i7 + 1);
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 31;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        W w3 = (W) viewHolder;
        int i10 = i7 + 1;
        w3.b(e.day_name, Jd.c.b(i10));
        w3.itemView.setOnClickListener(new V(this, i7, 0));
        ((ImageView) w3.getView(e.check_iv)).setVisibility(this.f33647e.selectDay == i10 ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new W(this, LayoutInflater.from(this.f4984a).inflate(f.sm_select_day_item_layout, viewGroup, false));
    }
}
