package Ob;

import Ff.h;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf.d f6731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f6732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Rf.d f6735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Rf.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f6735e = dVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f6735e, continuation);
        gVar.f6734d = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (Wf.D.b(r6, r8) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0074 -> B:7:0x0017). Please report as a decompilation issue!!! */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r8.f6733c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.util.Iterator r1 = r8.f6732b
            Rf.d r4 = r8.f6731a
            java.lang.Object r5 = r8.f6734d
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            androidx.camera.core.impl.utils.executor.g.M(r9)
        L17:
            r9 = r4
            r4 = r1
            r1 = r9
            r9 = r5
            goto L3d
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.util.Iterator r1 = r8.f6732b
            Rf.d r4 = r8.f6731a
            java.lang.Object r5 = r8.f6734d
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L62
        L30:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f6734d
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            Rf.d r1 = r8.f6735e
            java.util.Iterator r4 = r1.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L77
            r5 = r4
            kotlin.collections.D r5 = (kotlin.collections.D) r5
            long r5 = r5.a()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r8.f6734d = r9
            r8.f6731a = r1
            r8.f6732b = r4
            r8.f6733c = r3
            java.lang.Object r5 = r9.emit(r7, r8)
            if (r5 != r0) goto L5e
            goto L76
        L5e:
            r5 = r4
            r4 = r1
            r1 = r5
            r5 = r9
        L62:
            long r6 = r4.f8618c
            long r6 = java.lang.Math.abs(r6)
            r8.f6734d = r5
            r8.f6731a = r4
            r8.f6732b = r1
            r8.f6733c = r2
            java.lang.Object r9 = Wf.D.b(r6, r8)
            if (r9 != r0) goto L17
        L76:
            return r0
        L77:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ob.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
