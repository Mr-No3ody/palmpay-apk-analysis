package R8;

import androidx.biometric.C0915t;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0915t f7946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C0915t c0915t, VerifyFingerPrintFragment verifyFingerPrintFragment, Continuation continuation) {
        super(2, continuation);
        this.f7946b = c0915t;
        this.f7947c = verifyFingerPrintFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f7946b, this.f7947c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (Wf.AbstractC0780y.s(r5, r6, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (Wf.AbstractC0780y.s(r8, r1, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        return r0;
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
            int r1 = r7.f7945a
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L19
            if (r1 != r4) goto L11
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L6e
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            androidx.camera.core.impl.utils.executor.g.M(r8)     // Catch: java.lang.Exception -> L5c
            goto L6e
        L1d:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            androidx.biometric.t r8 = r7.f7946b     // Catch: java.lang.Exception -> L5c
            androidx.biometric.u r8 = r8.f13090a     // Catch: java.lang.Exception -> L5c
            if (r8 == 0) goto L29
            javax.crypto.Cipher r8 = r8.f13093b     // Catch: java.lang.Exception -> L5c
            goto L2a
        L29:
            r8 = r3
        L2a:
            if (r8 == 0) goto L45
            com.transsnet.palmpay.core.base.BaseApplication r1 = com.transsnet.palmpay.core.base.BaseApplication.get()     // Catch: java.lang.Exception -> L5c
            com.transsnet.palmpay.core.db.entity.User r1 = r1.getUser()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = r1.getPhoneNumber()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = io.fastkv.n.o(r1)     // Catch: java.lang.Exception -> L5c
            byte[] r1 = android.util.Base64.decode(r1, r4)     // Catch: java.lang.Exception -> L5c
            byte[] r8 = r8.doFinal(r1)     // Catch: java.lang.Exception -> L5c
            goto L46
        L45:
            r8 = r3
        L46:
            if (r8 == 0) goto L6e
            com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment r1 = r7.f7947c     // Catch: java.lang.Exception -> L5c
            cg.f r5 = Wf.I.f10809a     // Catch: java.lang.Exception -> L5c
            Wf.p0 r5 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L5c
            R8.f r6 = new R8.f     // Catch: java.lang.Exception -> L5c
            r6.<init>(r1, r8, r3)     // Catch: java.lang.Exception -> L5c
            r7.f7945a = r2     // Catch: java.lang.Exception -> L5c
            java.lang.Object r8 = Wf.AbstractC0780y.s(r5, r6, r7)     // Catch: java.lang.Exception -> L5c
            if (r8 != r0) goto L6e
            goto L6d
        L5c:
            cg.f r8 = Wf.I.f10809a
            Wf.p0 r8 = p015ag.o.f11960a
            R8.g r1 = new R8.g
            r1.<init>(r4, r3)
            r7.f7945a = r4
            java.lang.Object r8 = Wf.AbstractC0780y.s(r8, r1, r7)
            if (r8 != r0) goto L6e
        L6d:
            return r0
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
