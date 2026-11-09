package p097g9;

import Ff.h;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SecurityVerifyMethodReq f36951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SecurityVerifyMethodReq securityVerifyMethodReq, Continuation continuation) {
        super(1, continuation);
        this.f36951b = securityVerifyMethodReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.f36951b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r5 == r0) goto L19;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r4.f36950a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L44
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L34
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            boolean r5 = com.transsnet.palmpay.core.base.BaseApplication.hasLogin()
            com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq r1 = r4.f36951b
            if (r5 == 0) goto L37
            com.transsnet.palmpay.account.business.IApiAccountService r5 = G8.a.t()
            r4.f36950a = r3
            java.lang.Object r5 = r5.getSecurityVerifyMethod(r1, r4)
            if (r5 != r0) goto L34
            goto L43
        L34:
            com.transsnet.palmpay.core.bean.CommonBeanResult r5 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r5
            return r5
        L37:
            com.transsnet.palmpay.account.business.IApiAccountService r5 = G8.a.t()
            r4.f36950a = r2
            java.lang.Object r5 = r5.getSecurityVerifyMethodNotLogin(r1, r4)
            if (r5 != r0) goto L44
        L43:
            return r0
        L44:
            com.transsnet.palmpay.core.bean.CommonBeanResult r5 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p097g9.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
