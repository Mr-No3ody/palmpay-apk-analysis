package Ga;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, Continuation continuation) {
        super(2, continuation);
        this.f3199b = kVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f3199b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r5.f3198a
            Ga.k r2 = r5.f3199b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            androidx.camera.core.impl.utils.executor.g.M(r6)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            goto L4b
        L12:
            r6 = move-exception
            goto L69
        L14:
            r6 = move-exception
            goto L5a
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            androidx.camera.core.impl.utils.executor.g.M(r6)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            goto L2e
        L22:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            r5.f3198a = r4     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.Object r6 = Ga.k.a(r2, r5)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            if (r6 != r0) goto L2e
            goto L4a
        L2e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            if (r6 == 0) goto L54
            r5.f3198a = r3     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            Ga.e r6 = Ga.k.f3214b     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            cg.f r6 = Wf.I.f10809a     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            cg.e r6 = p042cg.e.f19009c     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            Ga.g r1 = new Ga.g     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.Object r6 = Wf.AbstractC0780y.s(r6, r1, r5)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            if (r6 != r0) goto L4b
        L4a:
            return r0
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            r6.getClass()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
        L50:
            Ga.k.b(r2)
            goto L66
        L54:
            kotlin.Unit r6 = kotlin.Unit.f38893a     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            Ga.k.b(r2)
            return r6
        L5a:
            java.lang.String r0 = Ga.k.f3215c     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "Task execution failed"
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6}     // Catch: java.lang.Throwable -> L12
            F6.d.c(r0, r6)     // Catch: java.lang.Throwable -> L12
            goto L50
        L66:
            kotlin.Unit r6 = kotlin.Unit.f38893a
            return r6
        L69:
            Ga.k.b(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ga.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
