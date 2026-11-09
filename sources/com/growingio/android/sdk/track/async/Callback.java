package com.growingio.android.sdk.track.async;

/* JADX INFO: loaded from: classes3.dex */
public interface Callback<T> {
    void onFailed();

    void onSuccess(T result);
}
