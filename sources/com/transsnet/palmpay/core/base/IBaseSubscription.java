package com.transsnet.palmpay.core.base;

import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public interface IBaseSubscription {
    void addSubscription(Disposable disposable);

    boolean isIntervalTimeLiness(String key, long intervalTime);

    void removeTimeLiness(String key);

    void setIntervalTimeLiness(String key);

    void unSubscribe();
}
