package com.palmpay.lib.ui.calendar;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC1432b implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
        int adapterPosition = viewHolder.getAdapterPosition();
        long itemId = viewHolder.getItemId();
        I i7 = ((C1431a) this).f24196a.f24198b;
        if (i7 != null) {
            i7.onItemClick(adapterPosition, itemId);
        }
    }
}
