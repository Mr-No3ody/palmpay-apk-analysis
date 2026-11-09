package Ob;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Throwable f6727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f6730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(long j6, long j10, Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.f6728c = j6;
        this.f6729d = j10;
        this.f6730e = (h) function2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r10 = this.f6730e;
        f fVar = new f(this.f6728c, this.f6729d, r10, (Continuation) obj3);
        fVar.f6727b = (Throwable) obj2;
        return fVar.invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r4.invoke(r9, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4.invoke(r9, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r8.f6726a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L15:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L42
        L19:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Throwable r9 = r8.f6727b
            long r4 = r8.f6728c
            long r6 = r8.f6729d
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            Ff.h r4 = r8.f6730e
            if (r1 >= 0) goto L33
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.f6726a = r3
            java.lang.Object r9 = r4.invoke(r9, r8)
            if (r9 != r0) goto L42
            goto L41
        L33:
            boolean r9 = r9 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L42
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.f6726a = r2
            java.lang.Object r9 = r4.invoke(r9, r8)
            if (r9 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ob.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
