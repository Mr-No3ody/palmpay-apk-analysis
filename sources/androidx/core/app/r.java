package androidx.core.app;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f15997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15999c;

    public r(ComponentName componentName) {
        this.f15997a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i7) {
        if (!this.f15998b) {
            this.f15998b = true;
            this.f15999c = i7;
        } else {
            if (this.f15999c == i7) {
                return;
            }
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Given job ID ", " is different than previous ");
            sbE.append(this.f15999c);
            throw new IllegalArgumentException(sbE.toString());
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
