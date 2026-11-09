package p086fe;

import Ff.h;
import com.transsnet.palmpay.core.base.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: fe.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1683o0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f36708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f36710g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683o0(l lVar, String str, Continuation continuation, String str2, String str3, String str4, String str5) {
        super(2, continuation);
        this.f36705b = lVar;
        this.f36706c = str;
        this.f36707d = str2;
        this.f36708e = str3;
        this.f36709f = str4;
        this.f36710g = str5;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f36710g;
        return new C1683o0(this.f36705b, this.f36706c, continuation, this.f36707d, this.f36708e, this.f36709f, str);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1683o0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (kotlinx.coroutines.flow.X.g(r5, r12, r11) == r0) goto L19;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r11.f36704a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r12)
            goto L7b
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r12)
            goto L35
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r12)
            com.palmpay.lib.apm.network.NQEManager r12 = com.palmpay.lib.apm.network.NQEManager.INSTANCE
            boolean r12 = r12.isNetworkOffline()
            if (r12 == 0) goto L2a
            kotlin.Unit r12 = kotlin.Unit.f38893a
            return r12
        L2a:
            r11.f36704a = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = Wf.D.b(r3, r11)
            if (r12 != r0) goto L35
            goto L7a
        L35:
            kotlin.jvm.internal.F r5 = new kotlin.jvm.internal.F
            r5.<init>()
            java.lang.String r12 = ""
            r5.f38951a = r12
            com.transsnet.palmpay.core.base.o r12 = com.transsnet.palmpay.core.base.o.f27359a
            com.transsnet.palmpay.core.base.l r1 = r11.f36705b
            r1.k(r12)
            fe.m0 r3 = new fe.m0
            java.lang.String r10 = r11.f36710g
            java.lang.String r7 = r11.f36707d
            java.lang.String r8 = r11.f36708e
            java.lang.String r4 = r11.f36706c
            r6 = 0
            java.lang.String r9 = r11.f36709f
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.flow.T r12 = new kotlinx.coroutines.flow.T
            r12.<init>(r3)
            Wf.s r3 = Pa.I.f7021a
            kotlinx.coroutines.flow.Flow r12 = kotlinx.coroutines.flow.X.n(r12, r3)
            fe.n r3 = new fe.n
            r4 = 0
            r5 = 14
            r3.<init>(r1, r4, r5)
            kotlinx.coroutines.flow.u r5 = new kotlinx.coroutines.flow.u
            r5.<init>(r12, r3)
            fe.n0 r12 = new fe.n0
            r12.<init>(r1, r4)
            r11.f36704a = r2
            java.lang.Object r12 = kotlinx.coroutines.flow.X.g(r5, r12, r11)
            if (r12 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.Unit r12 = kotlin.Unit.f38893a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.C1683o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
