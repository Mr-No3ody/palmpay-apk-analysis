package t9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f42354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, long j6, Continuation continuation) {
        super(2, continuation);
        this.f42354b = bVar;
        this.f42355c = j6;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f42354b, this.f42355c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (Wf.D.b(500, r9) == r0) goto L15;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r9.f42353a
            r2 = 0
            t9.b r3 = r9.f42354b
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L21
            if (r1 == r7) goto L1d
            if (r1 != r6) goto L15
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L45
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L2d
        L21:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            r9.f42353a = r7
            java.lang.Object r10 = Wf.D.b(r4, r9)
            if (r10 != r0) goto L2d
            goto L44
        L2d:
            long r7 = r9.f42355c
            r3.f42357b = r7
            java.util.List r10 = r3.getData()
            int r10 = r10.size()
            r3.notifyItemRangeChanged(r2, r10)
            r9.f42353a = r6
            java.lang.Object r10 = Wf.D.b(r4, r9)
            if (r10 != r0) goto L45
        L44:
            return r0
        L45:
            r0 = -99
            r3.f42357b = r0
            java.util.List r10 = r3.getData()
            int r10 = r10.size()
            r3.notifyItemRangeChanged(r2, r10)
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
