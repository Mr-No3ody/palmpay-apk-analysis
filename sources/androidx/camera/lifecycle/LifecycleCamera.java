package androidx.camera.lifecycle;

import E.n0;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
@RestrictTo({p192n.c.f39801b})
@VisibleForTesting(otherwise = 3)
public final class LifecycleCamera implements LifecycleObserver, Camera {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f14511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.internal.f f14512c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14510a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14513d = false;

    public LifecycleCamera(LifecycleOwner lifecycleOwner, androidx.camera.core.internal.f fVar) {
        this.f14511b = lifecycleOwner;
        this.f14512c = fVar;
        if (((C1212w) lifecycleOwner.getLifecycle()).f17478d.a(EnumC1204n.f17463d)) {
            fVar.b();
        } else {
            fVar.h();
        }
        lifecycleOwner.getLifecycle().a(this);
    }

    public final LifecycleOwner a() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f14510a) {
            lifecycleOwner = this.f14511b;
        }
        return lifecycleOwner;
    }

    public final List b() {
        List listUnmodifiableList;
        synchronized (this.f14510a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f14512c.m());
        }
        return listUnmodifiableList;
    }

    public final boolean c(n0 n0Var) {
        boolean zContains;
        synchronized (this.f14510a) {
            zContains = ((ArrayList) this.f14512c.m()).contains(n0Var);
        }
        return zContains;
    }

    public final void d() {
        synchronized (this.f14510a) {
            try {
                if (this.f14513d) {
                    return;
                }
                onStop(this.f14511b);
                this.f14513d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f14510a) {
            try {
                if (this.f14513d) {
                    this.f14513d = false;
                    if (((C1212w) this.f14511b.getLifecycle()).f17478d.a(EnumC1204n.f17463d)) {
                        onStart(this.f14511b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final CameraControl getCameraControl() {
        return this.f14512c.f14329C;
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo getCameraInfo() {
        return this.f14512c.f14330H;
    }

    @Override // androidx.camera.core.Camera
    public final CameraConfig getExtendedConfig() {
        return this.f14512c.getExtendedConfig();
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupported(boolean z3, n0... n0VarArr) {
        return this.f14512c.isUseCasesCombinationSupported(z3, n0VarArr);
    }

    @OnLifecycleEvent(EnumC1203m.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.f14510a) {
            androidx.camera.core.internal.f fVar = this.f14512c;
            fVar.r((ArrayList) fVar.m());
        }
    }

    @OnLifecycleEvent(EnumC1203m.ON_PAUSE)
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        this.f14512c.f14334a.setActiveResumingMode(false);
    }

    @OnLifecycleEvent(EnumC1203m.ON_RESUME)
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        this.f14512c.f14334a.setActiveResumingMode(true);
    }

    @OnLifecycleEvent(EnumC1203m.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.f14510a) {
            try {
                if (!this.f14513d) {
                    this.f14512c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @OnLifecycleEvent(EnumC1203m.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.f14510a) {
            try {
                if (!this.f14513d) {
                    this.f14512c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
