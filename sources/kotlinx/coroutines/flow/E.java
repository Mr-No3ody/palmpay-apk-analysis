package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends Ff.h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ FlowCollector f39059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ff.h f39061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.f39061d = (Ff.h) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        E e10 = new E(this.f39061d, (Continuation) obj3);
        e10.f39059b = (FlowCollector) obj;
        e10.f39060c = obj2;
        return e10.invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r4.f39058a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlinx.coroutines.flow.FlowCollector r1 = r4.f39059b
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L32
        L1e:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            kotlinx.coroutines.flow.FlowCollector r1 = r4.f39059b
            java.lang.Object r5 = r4.f39060c
            r4.f39059b = r1
            r4.f39058a = r3
            Ff.h r3 = r4.f39061d
            java.lang.Object r5 = r3.invoke(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.f39059b = r3
            r4.f39058a = r2
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.Unit r5 = kotlin.Unit.f38893a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
