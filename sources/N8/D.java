package N8;

import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f6137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinSafeWithPatternActivity f6139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(PinSafeWithPatternActivity pinSafeWithPatternActivity, Continuation continuation) {
        super(2, continuation);
        this.f6139c = pinSafeWithPatternActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new D(this.f6139c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (Wf.AbstractC0780y.s(r11, r1, r10) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (Wf.AbstractC0780y.s(r11, r1, r10) == r0) goto L30;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r10.f6138b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.String r7 = "SAFE_PIN_LOCK_ERROR_COUNT"
            r8 = 0
            com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity r9 = r10.f6139c
            if (r1 == 0) goto L30
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L26
            if (r1 == r2) goto L20
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            java.lang.Throwable r0 = r10.f6137a
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L79
        L26:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L94
        L2a:
            androidx.camera.core.impl.utils.executor.g.M(r11)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L7a
            goto L42
        L2e:
            r11 = move-exception
            goto L5c
        L30:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            androidx.camera.video.internal.c r11 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L7a
            java.lang.Object r11 = r11.f14622c     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L7a
            com.transsnet.palmpay.core.network.api.MemberApiService r11 = (com.transsnet.palmpay.core.network.api.MemberApiService) r11     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L7a
            r10.f6138b = r5     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L7a
            java.lang.Object r11 = r11.logout(r10)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L7a
            if (r11 != r0) goto L42
            goto L93
        L42:
            r9.f25951e = r8
            p059e1.a.U(r8, r7)
            Pa.A.a()
            cg.f r11 = Wf.I.f10809a
            Wf.p0 r11 = p015ag.o.f11960a
            N8.C r1 = new N8.C
            r1.<init>(r9, r6)
            r10.f6138b = r4
            java.lang.Object r11 = Wf.AbstractC0780y.s(r11, r1, r10)
            if (r11 != r0) goto L94
            goto L93
        L5c:
            r9.f25951e = r8
            p059e1.a.U(r8, r7)
            Pa.A.a()
            cg.f r1 = Wf.I.f10809a
            Wf.p0 r1 = p015ag.o.f11960a
            N8.C r3 = new N8.C
            r3.<init>(r9, r6)
            r10.f6137a = r11
            r10.f6138b = r2
            java.lang.Object r1 = Wf.AbstractC0780y.s(r1, r3, r10)
            if (r1 != r0) goto L78
            goto L93
        L78:
            r0 = r11
        L79:
            throw r0
        L7a:
            r9.f25951e = r8
            p059e1.a.U(r8, r7)
            Pa.A.a()
            cg.f r11 = Wf.I.f10809a
            Wf.p0 r11 = p015ag.o.f11960a
            N8.C r1 = new N8.C
            r1.<init>(r9, r6)
            r10.f6138b = r3
            java.lang.Object r11 = Wf.AbstractC0780y.s(r11, r1, r10)
            if (r11 != r0) goto L94
        L93:
            return r0
        L94:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: N8.D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
