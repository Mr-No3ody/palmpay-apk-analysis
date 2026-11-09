package p135j0;

import Ff.h;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DisposableHandle f38084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f38087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(File file, Continuation continuation) {
        super(2, continuation);
        this.f38087d = file;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        k0 k0Var = new k0(this.f38087d, continuation);
        k0Var.f38086c = obj;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (Yf.C.a(r3, r7, r6) == r0) goto L16;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r6.f38085b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L63
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlinx.coroutines.DisposableHandle r1 = r6.f38084a
            java.lang.Object r3 = r6.f38086c
            kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L4e
        L22:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            java.lang.Object r7 = r6.f38086c
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            C0.s r1 = new C0.s
            java.io.File r4 = r6.f38087d
            r5 = 7
            r1.<init>(r5, r4, r7)
            j0.l0 r5 = p135j0.m0.f38101b
            java.io.File r4 = r4.getParentFile()
            kotlin.jvm.internal.Intrinsics.e(r4)
            kotlinx.coroutines.DisposableHandle r1 = p135j0.l0.access$observe(r5, r4, r1)
            kotlin.Unit r4 = kotlin.Unit.f38893a
            r6.f38086c = r7
            r6.f38084a = r1
            r6.f38085b = r3
            java.lang.Object r3 = r7.send(r4, r6)
            if (r3 != r0) goto L4d
            goto L62
        L4d:
            r3 = r7
        L4e:
            C0.t r7 = new C0.t
            r4 = 16
            r7.<init>(r1, r4)
            r1 = 0
            r6.f38086c = r1
            r6.f38084a = r1
            r6.f38085b = r2
            java.lang.Object r7 = Yf.C.a(r3, r7, r6)
            if (r7 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
