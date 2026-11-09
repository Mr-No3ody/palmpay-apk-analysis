package com.pp.faceguard.traffic;

/* JADX INFO: loaded from: classes3.dex */
public interface BindingCallback {
    void onFailure(int i7, String str);

    default void onFailure(int i7, String str, String str2) {
        onFailure(i7, str2);
    }

    void onSuccess(DeviceTokenBinding deviceTokenBinding);
}
