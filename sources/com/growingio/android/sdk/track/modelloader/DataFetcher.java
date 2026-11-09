package com.growingio.android.sdk.track.modelloader;

/* JADX INFO: loaded from: classes3.dex */
public interface DataFetcher<T> {
    T executeData();

    Class<T> getDataClass();
}
