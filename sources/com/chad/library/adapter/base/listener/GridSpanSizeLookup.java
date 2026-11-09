package com.chad.library.adapter.base.listener;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public interface GridSpanSizeLookup {
    int getSpanSize(@NonNull GridLayoutManager gridLayoutManager, int viewType, int position);
}
