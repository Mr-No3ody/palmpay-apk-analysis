package B6;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(File file, String str, b0 b0Var, String str2, Continuation continuation) {
        super(2, continuation);
        this.f438d = file;
        this.f439e = str;
        this.f440f = b0Var;
        this.f441g = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Z z3 = new Z(this.f438d, this.f439e, this.f440f, this.f441g, continuation);
        z3.f437c = obj;
        return z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[Catch: Exception -> 0x002b, all -> 0x00e6, PHI: r2 r4 r17
      0x0118: PHI (r2v12 com.palmpay.lib.liveness.model.CheckRequest) = (r2v10 com.palmpay.lib.liveness.model.CheckRequest), (r2v15 com.palmpay.lib.liveness.model.CheckRequest) binds: [B:45:0x0114, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r4v13 java.lang.Object) = (r4v10 java.lang.Object), (r4v20 java.lang.Object) binds: [B:45:0x0114, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r17v4 java.io.File) = (r10v0 java.io.File), (r17v5 java.io.File) binds: [B:45:0x0114, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:13:0x0030, B:53:0x0149, B:55:0x016a, B:58:0x0184, B:62:0x018d, B:65:0x0195, B:16:0x003d, B:47:0x0118, B:49:0x0120, B:50:0x0124, B:19:0x004c, B:26:0x007c, B:28:0x0099, B:30:0x009d, B:32:0x00b0, B:34:0x00b6, B:37:0x00c7, B:40:0x00d3, B:44:0x00eb, B:22:0x0057), top: B:82:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0120 A[Catch: Exception -> 0x002b, all -> 0x00e6, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:13:0x0030, B:53:0x0149, B:55:0x016a, B:58:0x0184, B:62:0x018d, B:65:0x0195, B:16:0x003d, B:47:0x0118, B:49:0x0120, B:50:0x0124, B:19:0x004c, B:26:0x007c, B:28:0x0099, B:30:0x009d, B:32:0x00b0, B:34:0x00b6, B:37:0x00c7, B:40:0x00d3, B:44:0x00eb, B:22:0x0057), top: B:82:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:53:0x0149 A[Catch: Exception -> 0x002b, all -> 0x00e6, PHI: r2 r4 r17
      0x0149: PHI (r2v16 java.lang.Object) = (r2v13 java.lang.Object), (r2v20 java.lang.Object) binds: [B:51:0x0145, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r4v21 long) = (r4v18 long), (r4v25 long) binds: [B:51:0x0145, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r17v6 java.io.File) = (r17v4 java.io.File), (r17v7 java.io.File) binds: [B:51:0x0145, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:13:0x0030, B:53:0x0149, B:55:0x016a, B:58:0x0184, B:62:0x018d, B:65:0x0195, B:16:0x003d, B:47:0x0118, B:49:0x0120, B:50:0x0124, B:19:0x004c, B:26:0x007c, B:28:0x0099, B:30:0x009d, B:32:0x00b0, B:34:0x00b6, B:37:0x00c7, B:40:0x00d3, B:44:0x00eb, B:22:0x0057), top: B:82:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x016a A[Catch: Exception -> 0x002b, all -> 0x00e6, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:13:0x0030, B:53:0x0149, B:55:0x016a, B:58:0x0184, B:62:0x018d, B:65:0x0195, B:16:0x003d, B:47:0x0118, B:49:0x0120, B:50:0x0124, B:19:0x004c, B:26:0x007c, B:28:0x0099, B:30:0x009d, B:32:0x00b0, B:34:0x00b6, B:37:0x00c7, B:40:0x00d3, B:44:0x00eb, B:22:0x0057), top: B:82:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184 A[Catch: Exception -> 0x002b, all -> 0x00e6, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:13:0x0030, B:53:0x0149, B:55:0x016a, B:58:0x0184, B:62:0x018d, B:65:0x0195, B:16:0x003d, B:47:0x0118, B:49:0x0120, B:50:0x0124, B:19:0x004c, B:26:0x007c, B:28:0x0099, B:30:0x009d, B:32:0x00b0, B:34:0x00b6, B:37:0x00c7, B:40:0x00d3, B:44:0x00eb, B:22:0x0057), top: B:82:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x018a  */
    /* JADX WARN: Code duplicated, block: B:61:0x018c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0193  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c9, code lost:
    
        if (r13.send(r2, r25) == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r13.send(r2, r25) == r3) goto L73;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x0149, please report this as an issue */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
