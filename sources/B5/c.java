package B5;

import Pa.N;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f376b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f375a = i7;
        this.f376b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        p140j8.f.h("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f376b     // Catch: java.lang.Throwable -> L4f
            androidx.camera.core.impl.utils.executor.i r2 = (androidx.camera.core.impl.utils.executor.i) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.f14177a     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f376b     // Catch: java.lang.Throwable -> L20
            androidx.camera.core.impl.utils.executor.i r0 = (androidx.camera.core.impl.utils.executor.i) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f14180d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L44
        L20:
            r0 = move-exception
            goto L69
        L22:
            long r6 = r0.f14181e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f14181e = r6     // Catch: java.lang.Throwable -> L20
            r0.f14180d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f376b     // Catch: java.lang.Throwable -> L20
            androidx.camera.core.impl.utils.executor.i r4 = (androidx.camera.core.impl.utils.executor.i) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f14177a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r0 = r10.f376b     // Catch: java.lang.Throwable -> L20
            androidx.camera.core.impl.utils.executor.i r0 = (androidx.camera.core.impl.utils.executor.i) r0     // Catch: java.lang.Throwable -> L20
            r0.f14180d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r0 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            p140j8.f.h(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.c.a():void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x04f8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.c.run():void");
    }

    public c(N n10, Throwable th) {
        this.f375a = 18;
        this.f376b = n10;
    }
}
