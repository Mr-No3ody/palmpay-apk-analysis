package com.growingio.android.sdk.track.middleware.http;

import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;

/* JADX INFO: loaded from: classes3.dex */
public interface HttpDataFetcher<T> extends LoadDataFetcher<T> {
    void cancel();

    void cleanup();
}
