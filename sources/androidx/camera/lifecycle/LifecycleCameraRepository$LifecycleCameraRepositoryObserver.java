package androidx.camera.lifecycle;

import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes.dex */
class LifecycleCameraRepository$LifecycleCameraRepositoryObserver implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f14515b;

    public LifecycleCameraRepository$LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, b bVar) {
        this.f14515b = lifecycleOwner;
        this.f14514a = bVar;
    }

    @OnLifecycleEvent(EnumC1203m.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f14514a.l(lifecycleOwner);
    }

    @OnLifecycleEvent(EnumC1203m.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.f14514a.g(lifecycleOwner);
    }

    @OnLifecycleEvent(EnumC1203m.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        this.f14514a.h(lifecycleOwner);
    }
}
