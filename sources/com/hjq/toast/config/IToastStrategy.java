package com.hjq.toast.config;

import android.app.Application;
import p377z5.j;

/* JADX INFO: loaded from: classes3.dex */
public interface IToastStrategy {
    void cancelToast();

    IToast createToast(j jVar);

    void registerStrategy(Application application);

    void showToast(j jVar);
}
