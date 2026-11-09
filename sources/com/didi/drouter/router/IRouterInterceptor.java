package com.didi.drouter.router;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface IRouterInterceptor {

    public interface IInterceptor {
        void onContinue();

        void onInterrupt();

        void onInterrupt(int statusCode);
    }

    void handle(@NonNull d request);
}
