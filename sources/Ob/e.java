package Ob;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f6722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f6723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f6725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function2 function2, long j6, Function2 function3, Continuation continuation) {
        super(2, continuation);
        this.f6723c = function2;
        this.f6724d = j6;
        this.f6725e = (h) function3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f6723c, this.f6724d, this.f6725e, continuation);
        eVar.f6722b = ((Number) obj).longValue();
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r3.invoke(r2, r16) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r3.invoke(r2, r16) == r1) goto L32;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f6721a
            Ff.h r3 = r0.f6725e
            kotlin.jvm.functions.Function2 r4 = r0.f6723c
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L2f
            if (r2 == r8) goto L29
            if (r2 == r7) goto L25
            if (r2 == r6) goto L21
            if (r2 != r5) goto L19
            goto L21
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            androidx.camera.core.impl.utils.executor.g.M(r17)
            goto L7b
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r17)
            goto L61
        L29:
            long r8 = r0.f6722b
            androidx.camera.core.impl.utils.executor.g.M(r17)
            goto L45
        L2f:
            androidx.camera.core.impl.utils.executor.g.M(r17)
            long r9 = r0.f6722b
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r0.f6722b = r9
            r0.f6721a = r8
            java.lang.Object r2 = r4.invoke(r2, r0)
            if (r2 != r1) goto L44
            goto L7a
        L44:
            r8 = r9
        L45:
            long r10 = r0.f6724d
            long r12 = r8 - r10
            r14 = 0
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 <= 0) goto L6c
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 >= 0) goto L6c
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r14)
            r0.f6721a = r7
            java.lang.Object r2 = r4.invoke(r2, r0)
            if (r2 != r1) goto L61
            goto L7a
        L61:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f6721a = r6
            java.lang.Object r2 = r3.invoke(r2, r0)
            if (r2 != r1) goto L7b
            goto L7a
        L6c:
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 != 0) goto L7b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f6721a = r5
            java.lang.Object r2 = r3.invoke(r2, r0)
            if (r2 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r1 = kotlin.Unit.f38893a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ob.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
