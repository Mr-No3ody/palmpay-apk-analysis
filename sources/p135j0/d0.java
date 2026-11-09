package p135j0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public /* synthetic */ d0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r2 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        r14.f38022a = r13;
        r14.f38023b = r4;
        r14.f38026e = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (Wf.D.b(r4, r14) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r13, kotlin.coroutines.Continuation<? super java.nio.channels.FileLock> r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r14 instanceof p135j0.c0
            if (r0 == 0) goto L13
            r0 = r14
            j0.c0 r0 = (p135j0.c0) r0
            int r1 = r0.f38026e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38026e = r1
            goto L18
        L13:
            j0.c0 r0 = new j0.c0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f38024c
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f38026e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r4 = r0.f38023b
            java.io.FileOutputStream r13 = r0.f38022a
            androidx.camera.core.impl.utils.executor.g.M(r14)
            r14 = r0
            goto L73
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            androidx.camera.core.impl.utils.executor.g.M(r14)
            long r4 = p135j0.j0.f38065l
            r14 = r0
        L3a:
            long r6 = p135j0.j0.f38066m
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
        */
        //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto L78
            java.nio.channels.FileChannel r6 = r13.getChannel()     // Catch: java.io.IOException -> L56
            r11 = 0
            r7 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L56
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.io.IOException -> L56
            return r0
        L56:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L77
            java.lang.String r6 = p135j0.j0.f38064k
            r7 = 0
            boolean r2 = kotlin.text.StringsKt.A(r2, r6, r7)
            if (r2 != r3) goto L77
            r14.f38022a = r13
            r14.f38023b = r4
            r14.f38026e = r3
            java.lang.Object r0 = Wf.D.b(r4, r14)
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = 2
            long r6 = (long) r0
            long r4 = r4 * r6
            goto L3a
        L77:
            throw r0
        L78:
            java.nio.channels.FileChannel r6 = r13.getChannel()
            r11 = 0
            r7 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.nio.channels.FileLock r13 = r6.lock(r7, r9, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.d0.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private d0() {
    }
}
