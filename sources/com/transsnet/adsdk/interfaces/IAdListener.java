package com.transsnet.adsdk.interfaces;

import com.transsnet.adsdk.data.local.entity.AdEntity;

/* JADX INFO: loaded from: classes3.dex */
public interface IAdListener {
    void onClick(AdEntity adData);

    void onClosed();

    void onLoadFailed();

    void onLoadSuccess();
}
