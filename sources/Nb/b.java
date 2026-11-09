package Nb;

import androidx.camera.core.impl.utils.futures.i;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f6298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f6299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f6300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f6301d;

    public b(ReentrantLock reentrantLock, com.transsnet.adsdk.widgets.banner.bannerview.b bVar) {
        this.f6301d = reentrantLock;
        this.f6300c = new i(10, new WeakReference(bVar), new WeakReference(this));
    }
}
