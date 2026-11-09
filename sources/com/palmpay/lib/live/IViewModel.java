package com.palmpay.lib.live;

import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes3.dex */
public interface IViewModel extends LifecycleObserver {
    @OnLifecycleEvent(EnumC1203m.ON_ANY)
    void onAny(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m);

    @OnLifecycleEvent(EnumC1203m.ON_CREATE)
    void onCreate(LifecycleOwner lifecycleOwner);

    @OnLifecycleEvent(EnumC1203m.ON_DESTROY)
    void onDestroy();

    @OnLifecycleEvent(EnumC1203m.ON_PAUSE)
    void onPause();

    @OnLifecycleEvent(EnumC1203m.ON_RESUME)
    void onResume();

    @OnLifecycleEvent(EnumC1203m.ON_START)
    void onStart();

    @OnLifecycleEvent(EnumC1203m.ON_STOP)
    void onStop();
}
