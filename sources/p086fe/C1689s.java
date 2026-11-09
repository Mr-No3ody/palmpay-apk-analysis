package p086fe;

import Ff.h;
import com.transsnet.palmpay.core.base.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: fe.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1689s extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f36741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f36743g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f36744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689s(l lVar, String str, Continuation continuation, String str2, String str3, String str4, String str5, String str6) {
        super(2, continuation);
        this.f36738b = lVar;
        this.f36739c = str;
        this.f36740d = str2;
        this.f36741e = str3;
        this.f36742f = str4;
        this.f36743g = str5;
        this.f36744i = str6;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1689s(this.f36738b, this.f36739c, continuation, this.f36740d, this.f36741e, this.f36742f, this.f36743g, this.f36744i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1689s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (kotlinx.coroutines.flow.X.g(r5, r13, r12) == r0) goto L19;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r12.f36737a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r13)
            goto L7c
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r13)
            goto L35
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r13)
            com.palmpay.lib.apm.network.NQEManager r13 = com.palmpay.lib.apm.network.NQEManager.INSTANCE
            boolean r13 = r13.isNetworkOffline()
            if (r13 == 0) goto L2a
            kotlin.Unit r13 = kotlin.Unit.f38893a
            return r13
        L2a:
            r12.f36737a = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r13 = Wf.D.b(r3, r12)
            if (r13 != r0) goto L35
            goto L7b
        L35:
            kotlin.jvm.internal.F r5 = new kotlin.jvm.internal.F
            r5.<init>()
            java.lang.String r13 = ""
            r5.f38951a = r13
            com.transsnet.palmpay.core.base.o r13 = com.transsnet.palmpay.core.base.o.f27359a
            com.transsnet.palmpay.core.base.l r1 = r12.f36738b
            r1.k(r13)
            fe.q r3 = new fe.q
            java.lang.String r9 = r12.f36742f
            java.lang.String r4 = r12.f36739c
            r6 = 0
            java.lang.String r7 = r12.f36740d
            java.lang.String r8 = r12.f36741e
            java.lang.String r10 = r12.f36743g
            java.lang.String r11 = r12.f36744i
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.T r13 = new kotlinx.coroutines.flow.T
            r13.<init>(r3)
            Wf.s r3 = Pa.I.f7021a
            kotlinx.coroutines.flow.Flow r13 = kotlinx.coroutines.flow.X.n(r13, r3)
            fe.n r3 = new fe.n
            r4 = 0
            r5 = 1
            r3.<init>(r1, r4, r5)
            kotlinx.coroutines.flow.u r5 = new kotlinx.coroutines.flow.u
            r5.<init>(r13, r3)
            fe.r r13 = new fe.r
            r13.<init>(r1, r4)
            r12.f36737a = r2
            java.lang.Object r13 = kotlinx.coroutines.flow.X.g(r5, r13, r12)
            if (r13 != r0) goto L7c
        L7b:
            return r0
        L7c:
            kotlin.Unit r13 = kotlin.Unit.f38893a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.C1689s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
