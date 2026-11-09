package com.growingio.android.sdk.track.modelloader;

/* JADX INFO: loaded from: classes3.dex */
public interface LoadDataFetcher<T> extends DataFetcher<T> {

    public interface DataCallback<T> {
        void onDataReady(T data);

        void onLoadFailed(Exception e10);
    }

    void loadData(DataCallback<? super T> callback);
}
