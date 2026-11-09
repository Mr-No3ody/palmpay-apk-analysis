package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: loaded from: classes.dex */
interface DataFetcherGenerator {

    public interface FetcherReadyCallback {
        void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, com.bumptech.glide.load.a aVar);

        void onDataFetcherReady(Key key, @Nullable Object obj, DataFetcher<?> dataFetcher, com.bumptech.glide.load.a aVar, Key key2);

        void reschedule();
    }

    void cancel();

    boolean startNext();
}
