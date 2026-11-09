package com.transsnet.adsdk.data.network;

/* JADX INFO: loaded from: classes3.dex */
public interface INetResult<T> {
    void onFailed(String errCode, String errMsg);

    void onSuccess(T data);
}
