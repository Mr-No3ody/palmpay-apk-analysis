package p135j0;

import Ff.h;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;

/* JADX INFO: loaded from: classes.dex */
public final class F extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f37926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f37928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f37929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f37930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(kotlin.jvm.internal.F f10, O o10, D d2, Continuation continuation) {
        super(1, continuation);
        this.f37928c = f10;
        this.f37929d = o10;
        this.f37930e = d2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new F(this.f37928c, this.f37929d, this.f37930e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r9 == r0) goto L29;
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
            int r1 = r8.f37927b
            kotlin.jvm.internal.D r2 = r8.f37930e
            kotlin.jvm.internal.F r3 = r8.f37928c
            r4 = 3
            r5 = 2
            j0.O r6 = r8.f37929d
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 == r7) goto L2e
            if (r1 == r5) goto L26
            if (r1 != r4) goto L1e
            java.io.Serializable r0 = r8.f37926a
            r2 = r0
            kotlin.jvm.internal.D r2 = (kotlin.jvm.internal.D) r2
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L71
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            java.io.Serializable r1 = r8.f37926a
            kotlin.jvm.internal.D r1 = (kotlin.jvm.internal.D) r1
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: p135j0.C1767a -> L64
            goto L5b
        L2e:
            java.io.Serializable r1 = r8.f37926a
            kotlin.jvm.internal.F r1 = (kotlin.jvm.internal.F) r1
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: p135j0.C1767a -> L64
            goto L47
        L36:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            r8.f37926a = r3     // Catch: p135j0.C1767a -> L64
            r8.f37927b = r7     // Catch: p135j0.C1767a -> L64
            int r9 = p135j0.O.f37960m     // Catch: p135j0.C1767a -> L64
            java.lang.Object r9 = r6.h(r8)     // Catch: p135j0.C1767a -> L64
            if (r9 != r0) goto L46
            goto L70
        L46:
            r1 = r3
        L47:
            r1.f38951a = r9     // Catch: p135j0.C1767a -> L64
            int r9 = p135j0.O.f37960m     // Catch: p135j0.C1767a -> L64
            androidx.datastore.core.InterProcessCoordinator r9 = r6.f()     // Catch: p135j0.C1767a -> L64
            r8.f37926a = r2     // Catch: p135j0.C1767a -> L64
            r8.f37927b = r5     // Catch: p135j0.C1767a -> L64
            java.lang.Object r9 = r9.getVersion(r8)     // Catch: p135j0.C1767a -> L64
            if (r9 != r0) goto L5a
            goto L70
        L5a:
            r1 = r2
        L5b:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: p135j0.C1767a -> L64
            int r9 = r9.intValue()     // Catch: p135j0.C1767a -> L64
            r1.f38949a = r9     // Catch: p135j0.C1767a -> L64
            goto L79
        L64:
            java.lang.Object r9 = r3.f38951a
            r8.f37926a = r2
            r8.f37927b = r4
            java.lang.Object r9 = r6.i(r9, r7, r8)
            if (r9 != r0) goto L71
        L70:
            return r0
        L71:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.f38949a = r9
        L79:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
