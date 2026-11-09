package p155k9;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f38707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, long j6, Continuation continuation) {
        super(2, continuation);
        this.f38707b = fVar;
        this.f38708c = j6;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f38707b, this.f38708c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (Wf.D.b(500, r8) == r0) goto L15;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r8.f38706a
            k9.f r2 = r8.f38707b
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L20
            if (r1 == r6) goto L1c
            if (r1 != r5) goto L14
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L3c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L2c
        L20:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            r8.f38706a = r6
            java.lang.Object r9 = Wf.D.b(r3, r8)
            if (r9 != r0) goto L2c
            goto L3b
        L2c:
            long r6 = r8.f38708c
            r2.f38711d = r6
            r2.d()
            r8.f38706a = r5
            java.lang.Object r9 = Wf.D.b(r3, r8)
            if (r9 != r0) goto L3c
        L3b:
            return r0
        L3c:
            r0 = -99
            r2.f38711d = r0
            r2.d()
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p155k9.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
