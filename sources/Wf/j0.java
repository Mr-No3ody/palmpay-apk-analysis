package Wf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends Ff.g implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f10872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p015ag.j f10873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f10876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, Continuation continuation) {
        super(2, continuation);
        this.f10876f = n0Var;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        j0 j0Var = new j0(this.f10876f, continuation);
        j0Var.f10875e = obj;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((Sf.j) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r5.f10874d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            ag.j r1 = r5.f10873c
            Wf.q0 r3 = r5.f10872b
            java.lang.Object r4 = r5.f10875e
            Sf.j r4 = (Sf.j) r4
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L7b
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L80
        L24:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            java.lang.Object r6 = r5.f10875e
            Sf.j r6 = (Sf.j) r6
            Wf.n0 r1 = r5.f10876f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Wf.n0.f10888a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof Wf.C0768l
            if (r4 == 0) goto L41
            Wf.l r1 = (Wf.C0768l) r1
            kotlinx.coroutines.ChildJob r1 = r1.f10880e
            r5.f10874d = r3
            r6.a(r1, r5)
            return r0
        L41:
            boolean r3 = r1 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L80
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            Wf.q0 r1 = r1.getList()
            if (r1 == 0) goto L80
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p015ag.j.f11947a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.f(r3, r4)
            ag.j r3 = (p015ag.j) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5e:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L80
            boolean r6 = r1 instanceof Wf.C0768l
            if (r6 == 0) goto L7b
            r6 = r1
            Wf.l r6 = (Wf.C0768l) r6
            r5.f10875e = r4
            r5.f10872b = r3
            r5.f10873c = r1
            r5.f10874d = r2
            kotlinx.coroutines.ChildJob r6 = r6.f10880e
            r4.a(r6, r5)
            Ef.a r6 = Ef.a.f2423a
            return r0
        L7b:
            ag.j r1 = r1.d()
            goto L5e
        L80:
            kotlin.Unit r6 = kotlin.Unit.f38893a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Wf.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
