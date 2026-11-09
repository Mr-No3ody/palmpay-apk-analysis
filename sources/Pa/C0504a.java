package Pa;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Pa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0504a extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C0504a f7065d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f7066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f7067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7068c;

    public C0504a() {
        super(null, null, "Monitor", 524288L);
        this.f7068c = new Object();
        start();
    }

    public static C0504a a() {
        if (f7065d == null) {
            synchronized (C0504a.class) {
                try {
                    if (f7065d == null) {
                        f7065d = new C0504a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7065d;
    }

    public final void b(String str) {
        synchronized (this.f7068c) {
            this.f7067b = str;
            this.f7068c.notify();
        }
    }

    public final void c(androidx.fragment.app.E e10, Fragment fragment) {
        if (e10 == null || fragment == null || TextUtils.isEmpty(this.f7066a) || !this.f7066a.equalsIgnoreCase(e10.getClass().getSimpleName())) {
            return;
        }
        String simpleName = fragment.getClass().getSimpleName();
        if (TextUtils.isEmpty(simpleName)) {
            return;
        }
        b(C0.G.s(new StringBuilder("Monitor["), this.f7066a != null ? this.f7066a.replace("Activity", "") : "", ":", simpleName.replace("Fragment", ""), "]"));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0019 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3.f7068c
            monitor-enter(r0)
            java.lang.Object r1 = r3.f7068c     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            r1.wait()     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            java.lang.String r1 = r3.f7067b     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            if (r1 == 0) goto L22
            java.lang.String r1 = r3.f7067b     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            r2 = 0
            r3.f7067b = r2     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            r2.setName(r1)     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            goto L22
        L19:
            r1 = move-exception
            goto L24
        L1b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L19
            r1.interrupt()     // Catch: java.lang.Throwable -> L19
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            goto L0
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Pa.C0504a.run():void");
    }
}
