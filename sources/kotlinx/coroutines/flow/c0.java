package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends Ff.h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ FlowCollector f39148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f39149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f39150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, Continuation continuation) {
        super(3, continuation);
        this.f39150d = e0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        c0 c0Var = new c0(this.f39150d, (Continuation) obj3);
        c0Var.f39148b = (FlowCollector) obj;
        c0Var.f39149c = iIntValue;
        return c0Var.invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[PHI: r1
      0x006c: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = (r1v2 kotlinx.coroutines.flow.FlowCollector), (r1v6 kotlinx.coroutines.flow.FlowCollector) binds: [B:27:0x0069, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[PHI: r1
      0x0077: PHI (r1v4 kotlinx.coroutines.flow.FlowCollector) = 
      (r1v2 kotlinx.coroutines.flow.FlowCollector)
      (r1v3 kotlinx.coroutines.flow.FlowCollector)
      (r1v7 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:25:0x005d, B:30:0x0074, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L34;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r10.f39147a
            kotlinx.coroutines.flow.e0 r2 = r10.f39150d
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            long r8 = r2.f39155b
            if (r1 == 0) goto L38
            if (r1 == r7) goto L34
            if (r1 == r6) goto L2e
            if (r1 == r5) goto L28
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            goto L34
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            kotlinx.coroutines.flow.FlowCollector r1 = r10.f39148b
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L77
        L28:
            kotlinx.coroutines.flow.FlowCollector r1 = r10.f39148b
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L6c
        L2e:
            kotlinx.coroutines.flow.FlowCollector r1 = r10.f39148b
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L59
        L34:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L85
        L38:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            kotlinx.coroutines.flow.FlowCollector r1 = r10.f39148b
            int r11 = r10.f39149c
            if (r11 <= 0) goto L4c
            kotlinx.coroutines.flow.Z r11 = kotlinx.coroutines.flow.Z.f39128a
            r10.f39147a = r7
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L85
            goto L84
        L4c:
            r10.f39148b = r1
            r10.f39147a = r6
            long r6 = r2.f39154a
            java.lang.Object r11 = Wf.D.b(r6, r10)
            if (r11 != r0) goto L59
            goto L84
        L59:
            r6 = 0
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 <= 0) goto L77
            kotlinx.coroutines.flow.Z r11 = kotlinx.coroutines.flow.Z.f39129b
            r10.f39148b = r1
            r10.f39147a = r5
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L6c
            goto L84
        L6c:
            r10.f39148b = r1
            r10.f39147a = r4
            java.lang.Object r11 = Wf.D.b(r8, r10)
            if (r11 != r0) goto L77
            goto L84
        L77:
            kotlinx.coroutines.flow.Z r11 = kotlinx.coroutines.flow.Z.f39130c
            r2 = 0
            r10.f39148b = r2
            r10.f39147a = r3
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L85
        L84:
            return r0
        L85:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
