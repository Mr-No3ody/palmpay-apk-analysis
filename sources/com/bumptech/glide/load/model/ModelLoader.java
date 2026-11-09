package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface ModelLoader<Model, Data> {
    @Nullable
    t buildLoadData(@NonNull Model model, int i7, int i10, @NonNull com.bumptech.glide.load.h hVar);

    boolean handles(@NonNull Model model);
}
