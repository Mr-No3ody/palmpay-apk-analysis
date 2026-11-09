package Jb;

import com.transsnet.palmpay.credit.bean.req.PermissionReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionReq f4767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PermissionReq permissionReq, Continuation continuation) {
        super(1, continuation);
        this.f4767b = permissionReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new y(this.f4767b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4766a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        this.f4766a = 1;
        Object objUploadPermissionResultMvvm = iApiCreditServiceH.uploadPermissionResultMvvm(this.f4767b, this);
        return objUploadPermissionResultMvvm == aVar ? aVar : objUploadPermissionResultMvvm;
    }
}
