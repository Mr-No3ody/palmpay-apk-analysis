package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f17725b;

    public /* synthetic */ M(N n10, int i7) {
        this.f17724a = i7;
        this.f17725b = n10;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0079 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f17724a
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            androidx.room.N r0 = r8.f17725b
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r0.f17330c
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f17735q
            boolean r2 = r4.compareAndSet(r2, r3)
            if (r2 == 0) goto L34
            if (r1 == 0) goto L34
            boolean r1 = r0.f17732n
            androidx.room.G r2 = r0.f17730l
            if (r1 == 0) goto L2b
            java.util.concurrent.Executor r1 = r2.getTransactionExecutor()
            goto L2f
        L2b:
            java.util.concurrent.Executor r1 = r2.getQueryExecutor()
        L2f:
            androidx.room.M r0 = r0.t
            r1.execute(r0)
        L34:
            return
        L35:
            androidx.room.N r0 = r8.f17725b
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f17737s
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L5f
            androidx.room.G r1 = r0.f17730l
            androidx.room.z r1 = r1.getInvalidationTracker()
            r1.getClass()
            java.lang.String r4 = "observer"
            androidx.room.f r5 = r0.f17734p
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            androidx.room.y r4 = new androidx.room.y
            r4.<init>(r1, r5)
            r1.a(r4)
        L5f:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f17736r
            boolean r4 = r1.compareAndSet(r2, r3)
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f17735q
            if (r4 == 0) goto L91
            r4 = 0
            r6 = r2
        L6b:
            boolean r7 = r5.compareAndSet(r3, r2)     // Catch: java.lang.Throwable -> L79
            if (r7 == 0) goto L84
            java.util.concurrent.Callable r4 = r0.f17733o     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7b
            java.lang.Object r4 = r4.call()     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7b
            r6 = r3
            goto L6b
        L79:
            r0 = move-exception
            goto L8d
        L7b:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "Exception while computing database live data."
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L79
            throw r3     // Catch: java.lang.Throwable -> L79
        L84:
            if (r6 == 0) goto L89
            r0.i(r4)     // Catch: java.lang.Throwable -> L79
        L89:
            r1.set(r2)
            goto L92
        L8d:
            r1.set(r2)
            throw r0
        L91:
            r6 = r2
        L92:
            if (r6 == 0) goto L9a
            boolean r1 = r5.get()
            if (r1 != 0) goto L5f
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.M.run():void");
    }
}
