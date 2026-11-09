package E2;

import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f2207b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f2208c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f2209a = new ArrayBlockingQueue(20);

    public final void a(b bVar) {
        if (!f2208c) {
            return;
        }
        int i7 = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.f2209a;
            if (arrayBlockingQueue.offer(bVar) || i7 <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i7--;
        }
    }

    public final String toString() {
        return this.f2209a.toString();
    }
}
