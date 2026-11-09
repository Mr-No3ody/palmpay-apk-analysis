package androidx.camera.camera2.internal;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f13131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f13132b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0926f f13133c;

    public E(C0926f c0926f) {
        this.f13133c = c0926f;
        this.f13131a = ((J) c0926f.f13513b).f13178d.schedule(new D(this, 0), 2000L, TimeUnit.MILLISECONDS);
    }
}
