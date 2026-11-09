package Jb;

import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanViewModel f4715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanOpenParams f4716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(TransferByLoanViewModel transferByLoanViewModel, TransferByLoanOpenParams transferByLoanOpenParams, Continuation continuation) {
        super(2, continuation);
        this.f4715c = transferByLoanViewModel;
        this.f4716d = transferByLoanOpenParams;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        M m7 = new M(this.f4715c, this.f4716d, continuation);
        m7.f4714b = obj;
        return m7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r7 == r0) goto L24;
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
            int r1 = r6.f4713a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L62
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            java.lang.Object r1 = r6.f4714b
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L57
        L21:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            java.lang.Object r7 = r6.f4714b
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            Jb.L r1 = new Jb.L
            com.transsnet.palmpay.core.bean.TransferByLoanOpenParams r5 = r6.f4716d
            r1.<init>(r5, r2)
            r5 = 3
            Wf.B r1 = Wf.AbstractC0780y.d(r7, r2, r1, r5)
            r6.f4714b = r1
            r6.f4713a = r4
            com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel r7 = r6.f4715c
            java.lang.Boolean r4 = r7.f30939w
            if (r4 == 0) goto L41
            kotlin.Unit r7 = kotlin.Unit.f38893a
            goto L54
        L41:
            r7.e()
            Wf.B r7 = r7.f30928A
            if (r7 == 0) goto L52
            java.lang.Object r7 = r7.c(r6)
            if (r7 != r0) goto L4f
            goto L54
        L4f:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            goto L54
        L52:
            kotlin.Unit r7 = kotlin.Unit.f38893a
        L54:
            if (r7 != r0) goto L57
            goto L61
        L57:
            r6.f4714b = r2
            r6.f4713a = r3
            java.lang.Object r7 = r1.await(r6)
            if (r7 != r0) goto L62
        L61:
            return r0
        L62:
            Eb.k r7 = (Eb.k) r7
            boolean r0 = r7 instanceof Eb.j
            if (r0 == 0) goto L6d
            Eb.j r7 = (Eb.j) r7
            Eb.l r7 = r7.f2282a
            return r7
        L6d:
            boolean r0 = r7 instanceof Eb.i
            if (r0 == 0) goto L92
            Eb.i r7 = (Eb.i) r7
            Eb.h r0 = r7.f2281a
            java.lang.String r1 = r0.f2279a
            java.lang.String r0 = r0.f2280b
            J3.a.T(r1, r0)
            Eb.h r7 = r7.f2281a
            java.lang.String r0 = r7.f2280b
            boolean r1 = kotlin.text.StringsKt.F(r0)
            if (r1 == 0) goto L88
            java.lang.String r0 = r7.f2279a
        L88:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L92:
            xf.l r7 = new xf.l
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Jb.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
