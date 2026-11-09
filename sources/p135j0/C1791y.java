package p135j0;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: j0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1791y extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f38171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1791y(O o10, Continuation continuation) {
        super(2, continuation);
        this.f38171b = o10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1791y(this.f38171b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1791y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r6.collect(r2, r5) == r1) goto L18;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 2
            Ef.a r1 = Ef.a.f2423a
            int r2 = r5.f38170a
            j0.O r3 = r5.f38171b
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L1a
            if (r2 != r0) goto L12
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L52
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L35
        L1e:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            r5.f38170a = r4
            O2.a r6 = r3.f37969i
            java.lang.Object r6 = r6.f6554b
            Wf.m r6 = (Wf.C0769m) r6
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r1) goto L30
            goto L32
        L30:
            kotlin.Unit r6 = kotlin.Unit.f38893a
        L32:
            if (r6 != r1) goto L35
            goto L51
        L35:
            int r6 = p135j0.O.f37960m
            androidx.datastore.core.InterProcessCoordinator r6 = r3.f()
            kotlinx.coroutines.flow.Flow r6 = r6.getUpdateNotifications()
            r2 = -1
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.X.e(r6, r2)
            B6.T r2 = new B6.T
            r2.<init>(r3, r0)
            r5.f38170a = r0
            java.lang.Object r6 = r6.collect(r2, r5)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.f38893a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.C1791y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
