package N8;

import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: N8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0470n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInActivity f6243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0470n(LogInActivity logInActivity, Continuation continuation) {
        super(2, continuation);
        this.f6243b = logInActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0470n(this.f6243b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0470n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (Wf.AbstractC0780y.s(r6, r1, r5) == r0) goto L15;
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
            int r1 = r5.f6242a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L3f
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L2a
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            r5.f6242a = r3
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = Wf.D.b(r3, r5)
            if (r6 != r0) goto L2a
            goto L3e
        L2a:
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            com.transsnet.palmpay.account.ui.activity.a r1 = new com.transsnet.palmpay.account.ui.activity.a
            com.transsnet.palmpay.account.ui.activity.LogInActivity r3 = r5.f6243b
            r4 = 0
            r1.<init>(r3, r4)
            r5.f6242a = r2
            java.lang.Object r6 = Wf.AbstractC0780y.s(r6, r1, r5)
            if (r6 != r0) goto L3f
        L3e:
            return r0
        L3f:
            kotlin.Unit r6 = kotlin.Unit.f38893a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N8.C0470n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
