package androidx.camera.camera2.internal;

import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13150d;

    public H(C1212w registry, EnumC1203m event) {
        this.f13147a = 1;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13149c = registry;
        this.f13150d = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13147a) {
            case 0:
                ((androidx.camera.core.impl.utils.executor.i) this.f13149c).execute(new RunnableC0961x(this, 1));
                break;
            default:
                if (!this.f13148b) {
                    ((C1212w) this.f13149c).e((EnumC1203m) this.f13150d);
                    this.f13148b = true;
                }
                break;
        }
    }

    public H(I i7, androidx.camera.core.impl.utils.executor.i iVar) {
        this.f13147a = 0;
        this.f13150d = i7;
        this.f13148b = false;
        this.f13149c = iVar;
    }
}
