package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ListPreloader$PreloadModelProvider<U> {
    @NonNull
    List<U> getPreloadItems(int i7);

    @Nullable
    m getPreloadRequestBuilder(@NonNull U u6);
}
