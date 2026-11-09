package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharingStarted f39089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f39090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f39091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(SharingStarted sharingStarted, Flow flow, g0 g0Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f39089b = sharingStarted;
        this.f39090c = flow;
        this.f39091d = g0Var;
        this.f39092e = obj;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new N(this.f39089b, this.f39090c, this.f39091d, this.f39092e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r6.collect(r2, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r6.collect(r2, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (kotlinx.coroutines.flow.X.g(r10, r4, r9) == r0) goto L28;
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
            int r1 = r9.f39088a
            kotlinx.coroutines.flow.g0 r2 = r9.f39091d
            r3 = 4
            r4 = 3
            r5 = 1
            kotlinx.coroutines.flow.Flow r6 = r9.f39090c
            r7 = 2
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r7) goto L1f
            if (r1 == r4) goto L23
            if (r1 != r3) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L56
        L23:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L7b
        L27:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            kotlinx.coroutines.flow.SharingStarted$a r10 = kotlinx.coroutines.flow.SharingStarted.f39103n0
            kotlinx.coroutines.flow.SharingStarted r1 = r10.getEagerly()
            kotlinx.coroutines.flow.SharingStarted r8 = r9.f39089b
            if (r8 != r1) goto L3d
            r9.f39088a = r5
            java.lang.Object r10 = r6.collect(r2, r9)
            if (r10 != r0) goto L7b
            goto L7a
        L3d:
            kotlinx.coroutines.flow.SharingStarted r10 = r10.getLazily()
            r1 = 0
            if (r8 != r10) goto L5f
            kotlinx.coroutines.flow.StateFlow r10 = r2.getSubscriptionCount()
            kotlinx.coroutines.flow.L r3 = new kotlinx.coroutines.flow.L
            r3.<init>(r7, r1)
            r9.f39088a = r7
            java.lang.Object r10 = kotlinx.coroutines.flow.X.l(r10, r3, r9)
            if (r10 != r0) goto L56
            goto L7a
        L56:
            r9.f39088a = r4
            java.lang.Object r10 = r6.collect(r2, r9)
            if (r10 != r0) goto L7b
            goto L7a
        L5f:
            kotlinx.coroutines.flow.StateFlow r10 = r2.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r10 = r8.command(r10)
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.X.i(r10)
            kotlinx.coroutines.flow.M r4 = new kotlinx.coroutines.flow.M
            java.lang.Object r5 = r9.f39092e
            r4.<init>(r6, r2, r5, r1)
            r9.f39088a = r3
            java.lang.Object r10 = kotlinx.coroutines.flow.X.g(r10, r4, r9)
            if (r10 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
