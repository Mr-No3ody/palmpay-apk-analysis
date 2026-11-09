package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* JADX INFO: renamed from: androidx.core.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1044m extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f15980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f15981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f15982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15984h;

    public C1044m(Context context, ComponentName componentName) {
        super(componentName);
        this.f15980d = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f15981e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f15982f = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // androidx.core.app.r
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f15997a);
        if (this.f15980d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f15983g) {
                        this.f15983g = true;
                        if (!this.f15984h) {
                            this.f15981e.acquire(60000L);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.core.app.r
    public final void c() {
        synchronized (this) {
            try {
                if (this.f15984h) {
                    if (this.f15983g) {
                        this.f15981e.acquire(60000L);
                    }
                    this.f15984h = false;
                    this.f15982f.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.app.r
    public final void d() {
        synchronized (this) {
            try {
                if (!this.f15984h) {
                    this.f15984h = true;
                    this.f15982f.acquire(600000L);
                    this.f15981e.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.app.r
    public final void e() {
        synchronized (this) {
            this.f15983g = false;
        }
    }
}
