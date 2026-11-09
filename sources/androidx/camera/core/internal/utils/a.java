package androidx.camera.core.internal.utils;

import androidx.camera.camera2.internal.W;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class a implements RingBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f14358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14359c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f14360d;

    public a(int i7, W w3) {
        this.f14357a = i7;
        this.f14358b = new ArrayDeque(i7);
        this.f14360d = w3;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public final Object dequeue() {
        Object objRemoveLast;
        synchronized (this.f14359c) {
            objRemoveLast = this.f14358b.removeLast();
        }
        return objRemoveLast;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(Object obj) {
        Object objDequeue;
        synchronized (this.f14359c) {
            try {
                objDequeue = this.f14358b.size() >= this.f14357a ? dequeue() : null;
                this.f14358b.addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        W w3 = this.f14360d;
        if (w3 == null || objDequeue == null) {
            return;
        }
        w3.onRemove(objDequeue);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public final int getMaxCapacity() {
        return this.f14357a;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f14359c) {
            zIsEmpty = this.f14358b.isEmpty();
        }
        return zIsEmpty;
    }
}
