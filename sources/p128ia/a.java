package p128ia;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37438a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012c A[Catch: all -> 0x001c, Exception -> 0x001f, OutOfMemoryError -> 0x0022, Merged into TryCatch #0 {all -> 0x0151, Exception -> 0x001f, all -> 0x001c, OutOfMemoryError -> 0x0022, blocks: (B:58:0x0146, B:61:0x0153, B:62:0x015e, B:6:0x0017, B:52:0x0119, B:55:0x012c, B:56:0x0137, B:16:0x002d, B:22:0x004a, B:24:0x004e, B:27:0x005f, B:29:0x008e, B:32:0x009f, B:34:0x00b7, B:36:0x00be, B:38:0x00e8, B:41:0x00f9, B:43:0x00ff, B:46:0x0106, B:49:0x0110, B:53:0x0120, B:19:0x0034), top: B:68:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0137 A[Catch: all -> 0x001c, Exception -> 0x001f, OutOfMemoryError -> 0x0022, Merged into TryCatch #0 {all -> 0x0151, Exception -> 0x001f, all -> 0x001c, OutOfMemoryError -> 0x0022, blocks: (B:58:0x0146, B:61:0x0153, B:62:0x015e, B:6:0x0017, B:52:0x0119, B:55:0x012c, B:56:0x0137, B:16:0x002d, B:22:0x004a, B:24:0x004e, B:27:0x005f, B:29:0x008e, B:32:0x009f, B:34:0x00b7, B:36:0x00be, B:38:0x00e8, B:41:0x00f9, B:43:0x00ff, B:46:0x0106, B:49:0x0110, B:53:0x0120, B:19:0x0034), top: B:68:0x0011 }, TRY_LEAVE] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        if (r12 == r2) goto L51;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p128ia.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
