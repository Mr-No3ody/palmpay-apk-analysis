package B6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class W implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f431c;

    public /* synthetic */ W(int i7, Object obj, Object obj2) {
        this.f429a = i7;
        this.f430b = obj;
        this.f431c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i7, Continuation continuation) {
        kotlinx.coroutines.flow.a0 a0Var;
        if (continuation instanceof kotlinx.coroutines.flow.a0) {
            a0Var = (kotlinx.coroutines.flow.a0) continuation;
            int i10 = a0Var.f39138c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f39138c = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new kotlinx.coroutines.flow.a0(this, continuation);
            }
        } else {
            a0Var = new kotlinx.coroutines.flow.a0(this, continuation);
        }
        Object obj = a0Var.f39136a;
        Ef.a aVar = Ef.a.f2423a;
        int i11 = a0Var.f39138c;
        if (i11 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (i7 > 0) {
                kotlin.jvm.internal.B b7 = (kotlin.jvm.internal.B) this.f430b;
                if (!b7.f38947a) {
                    b7.f38947a = true;
                    kotlinx.coroutines.flow.Z z3 = kotlinx.coroutines.flow.Z.f39128a;
                    a0Var.f39138c = 1;
                    if (((FlowCollector) this.f431c).emit(z3, a0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f38893a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:193:0x0411  */
    /* JADX WARN: Code duplicated, block: B:194:0x042f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0438  */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x018f  */
    /* JADX WARN: Type inference failed for: r2v16, types: [Ff.h, kotlin.jvm.functions.Function2] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v38 java.lang.Object, still in use, count: 2, list:
          (r15v38 java.lang.Object) from 0x01f5: PHI (r15 I:??) = (r15v36 java.lang.Object), (r15v38 java.lang.Object) binds: [B:123:0x01f4, B:199:0x01f5] A[DONT_GENERATE, DONT_INLINE]
          (r15v38 java.lang.Object) from 0x01ed: CHECK_CAST (androidx.window.layout.DisplayFeature) (r15v38 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.W.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W(FlowCollector flowCollector, Function2 function2) {
        this.f429a = 6;
        this.f430b = flowCollector;
        this.f431c = (Ff.h) function2;
    }
}
