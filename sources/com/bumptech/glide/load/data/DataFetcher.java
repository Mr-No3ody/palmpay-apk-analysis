package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface DataFetcher<T> {

    public interface DataCallback<T> {
        void onDataReady(@Nullable T t);

        void onLoadFailed(@NonNull Exception exc);
    }

    void cancel();

    void cleanup();

    @NonNull
    Class<T> getDataClass();

    @NonNull
    com.bumptech.glide.load.a getDataSource();

    void loadData(@NonNull com.bumptech.glide.g gVar, @NonNull DataCallback<? super T> dataCallback);
}
