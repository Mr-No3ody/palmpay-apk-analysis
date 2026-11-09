package p135j0;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class G extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f37932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(O o10, Continuation continuation) {
        super(2, continuation);
        this.f37932b = o10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new G(this.f37932b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r0) goto L22;
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
            int r1 = r5.f37931a
            r2 = 2
            r3 = 1
            j0.O r4 = r5.f37932b
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            androidx.camera.core.impl.utils.executor.g.M(r6)     // Catch: java.lang.Throwable -> L1e
            goto L3d
        L1e:
            r6 = move-exception
            goto L4a
        L20:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            Sd.b r6 = r4.f37968h
            j0.w0 r6 = r6.b()
            boolean r6 = r6 instanceof p135j0.C1768a0
            if (r6 == 0) goto L34
            Sd.b r6 = r4.f37968h
            j0.w0 r6 = r6.b()
            return r6
        L34:
            r5.f37931a = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r4.g(r5)     // Catch: java.lang.Throwable -> L1e
            if (r6 != r0) goto L3d
            goto L46
        L3d:
            r5.f37931a = r2
            r6 = 0
            java.lang.Object r6 = p135j0.O.d(r4, r6, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            j0.w0 r6 = (p135j0.w0) r6
            return r6
        L4a:
            j0.n0 r0 = new j0.n0
            r1 = -1
            r0.<init>(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
