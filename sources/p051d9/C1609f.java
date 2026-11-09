package p051d9;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1609f extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609f(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f35612b = str;
        this.f35613c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1609f(this.f35612b, this.f35613c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1609f) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
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
            int r1 = r4.f35611a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L4e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L38
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            boolean r5 = com.transsnet.palmpay.core.base.BaseApplication.hasLogin()
            java.lang.String r1 = r4.f35612b
            if (r5 == 0) goto L3b
            com.transsnet.palmpay.account.business.IApiAccountService r5 = G8.a.t()
            java.lang.String r1 = com.transsnet.palmpay.security.utils.SecurityUtils.a(r1)
            r4.f35611a = r3
            java.lang.Object r5 = r5.checkPinMvvm(r1, r4)
            if (r5 != r0) goto L38
            goto L4d
        L38:
            com.transsnet.palmpay.core.bean.CommonBeanResult r5 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r5
            return r5
        L3b:
            com.transsnet.palmpay.account.business.IApiAccountService r5 = G8.a.t()
            java.lang.String r1 = com.transsnet.palmpay.security.utils.SecurityUtils.a(r1)
            r4.f35611a = r2
            java.lang.String r2 = r4.f35613c
            java.lang.Object r5 = r5.checkPinNoToken(r1, r2, r4)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            com.transsnet.palmpay.core.bean.CommonBeanResult r5 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d9.C1609f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
