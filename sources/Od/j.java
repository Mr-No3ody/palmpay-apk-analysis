package Od;

import com.transsnet.palmpay.task.WelcomeNewUserConfigTask;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WelcomeNewUserConfigTask f6822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WelcomeNewUserConfigTask welcomeNewUserConfigTask, Continuation continuation) {
        super(2, continuation);
        this.f6822b = welcomeNewUserConfigTask;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f6822b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r4.f6822b.queryConfig(r4) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r4.f6821a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r5)     // Catch: java.lang.Exception -> L60
            goto L3f
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L62
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            boolean r5 = com.transsnet.palmpay.core.base.BaseApplication.hasLogin()
            if (r5 != 0) goto L30
            r4.f6821a = r3
            com.transsnet.palmpay.task.WelcomeNewUserConfigTask r5 = r4.f6822b
            java.lang.Object r5 = com.transsnet.palmpay.task.WelcomeNewUserConfigTask.access$queryConfig(r5, r4)
            if (r5 != r0) goto L62
            goto L3e
        L30:
            androidx.camera.video.internal.c r5 = p324va.c.f43141a     // Catch: java.lang.Exception -> L60
            java.lang.Object r5 = r5.f14622c     // Catch: java.lang.Exception -> L60
            com.transsnet.palmpay.core.network.api.MemberApiService r5 = (com.transsnet.palmpay.core.network.api.MemberApiService) r5     // Catch: java.lang.Exception -> L60
            r4.f6821a = r2     // Catch: java.lang.Exception -> L60
            java.lang.Object r5 = r5.queryCurMemberInfoMvvm(r3, r4)     // Catch: java.lang.Exception -> L60
            if (r5 != r0) goto L3f
        L3e:
            return r0
        L3f:
            com.transsnet.palmpay.core.bean.CommonBeanResult r5 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r5     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L62
            boolean r0 = r5.isSuccess()     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L4a
            goto L4b
        L4a:
            r5 = 0
        L4b:
            if (r5 == 0) goto L62
            com.transsnet.palmpay.core.base.BaseApplication r0 = com.transsnet.palmpay.core.base.BaseApplication.get()     // Catch: java.lang.Exception -> L60
            ka.a r0 = r0.getUserDataSource()     // Catch: java.lang.Exception -> L60
            T r5 = r5.data     // Catch: java.lang.Exception -> L60
            com.transsnet.palmpay.core.bean.MemberInfo r5 = (com.transsnet.palmpay.core.bean.MemberInfo) r5     // Catch: java.lang.Exception -> L60
            r1 = 0
            r0.d(r5, r1)     // Catch: java.lang.Exception -> L60
            kotlin.Unit r5 = kotlin.Unit.f38893a     // Catch: java.lang.Exception -> L60
            goto L62
        L60:
            kotlin.Unit r5 = kotlin.Unit.f38893a
        L62:
            kotlin.Unit r5 = kotlin.Unit.f38893a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Od.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
