package p135j0;

import Ff.h;
import androidx.datastore.core.WriteScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;

/* JADX INFO: loaded from: classes.dex */
public final class N extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D f37953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f37956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f37957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f37959g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(D d2, O o10, Object obj, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f37956d = d2;
        this.f37957e = o10;
        this.f37958f = obj;
        this.f37959g = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        N n10 = new N(this.f37956d, this.f37957e, this.f37958f, this.f37959g, continuation);
        n10.f37955c = obj;
        return n10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((WriteScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r6.writeData(r3, r7) == r0) goto L16;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.f37954b
            kotlin.jvm.internal.D r2 = r7.f37956d
            java.lang.Object r3 = r7.f37958f
            j0.O r4 = r7.f37957e
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L5b
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.jvm.internal.D r1 = r7.f37953a
            java.lang.Object r6 = r7.f37955c
            androidx.datastore.core.WriteScope r6 = (androidx.datastore.core.WriteScope) r6
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L45
        L28:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            java.lang.Object r8 = r7.f37955c
            androidx.datastore.core.WriteScope r8 = (androidx.datastore.core.WriteScope) r8
            int r1 = p135j0.O.f37960m
            androidx.datastore.core.InterProcessCoordinator r1 = r4.f()
            r7.f37955c = r8
            r7.f37953a = r2
            r7.f37954b = r6
            java.lang.Object r1 = r1.incrementAndGetVersion(r7)
            if (r1 != r0) goto L42
            goto L5a
        L42:
            r6 = r8
            r8 = r1
            r1 = r2
        L45:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.f38949a = r8
            r8 = 0
            r7.f37955c = r8
            r7.f37953a = r8
            r7.f37954b = r5
            java.lang.Object r8 = r6.writeData(r3, r7)
            if (r8 != r0) goto L5b
        L5a:
            return r0
        L5b:
            boolean r8 = r7.f37959g
            if (r8 == 0) goto L73
            Sd.b r8 = r4.f37968h
            j0.b r0 = new j0.b
            if (r3 == 0) goto L6a
            int r1 = r3.hashCode()
            goto L6b
        L6a:
            r1 = 0
        L6b:
            int r2 = r2.f38949a
            r0.<init>(r3, r1, r2)
            r8.e(r0)
        L73:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
