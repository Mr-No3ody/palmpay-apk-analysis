package com.github.mikephil.charting.listener;

import B4.h;
import com.github.mikephil.charting.data.Entry;

/* JADX INFO: loaded from: classes.dex */
public interface OnDrawListener {
    void onDrawFinished(h hVar);

    void onEntryAdded(Entry entry);

    void onEntryMoved(Entry entry);
}
