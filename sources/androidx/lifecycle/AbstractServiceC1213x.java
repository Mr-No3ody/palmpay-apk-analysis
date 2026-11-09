package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1213x extends Service implements LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.video.internal.c f17484a = new androidx.camera.video.internal.c(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final AbstractC1205o getLifecycle() {
        return (C1212w) this.f17484a.f14621b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        androidx.camera.video.internal.c cVar = this.f17484a;
        cVar.getClass();
        cVar.q(EnumC1203m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        androidx.camera.video.internal.c cVar = this.f17484a;
        cVar.getClass();
        cVar.q(EnumC1203m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        androidx.camera.video.internal.c cVar = this.f17484a;
        cVar.getClass();
        cVar.q(EnumC1203m.ON_STOP);
        cVar.q(EnumC1203m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i7) {
        androidx.camera.video.internal.c cVar = this.f17484a;
        cVar.getClass();
        cVar.q(EnumC1203m.ON_START);
        super.onStart(intent, i7);
    }
}
