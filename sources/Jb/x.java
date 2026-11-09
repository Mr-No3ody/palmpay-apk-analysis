package Jb;

import com.transsnet.palmpay.credit.bean.req.UploadDeviceLocationReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f4765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, Long l5, Continuation continuation) {
        super(1, continuation);
        this.f4764b = str;
        this.f4765c = l5;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new x(this.f4764b, this.f4765c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((x) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4763a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        UploadDeviceLocationReq uploadDeviceLocationReq = new UploadDeviceLocationReq();
        uploadDeviceLocationReq.setSource(this.f4764b);
        uploadDeviceLocationReq.setLocateTime(this.f4765c);
        this.f4763a = 1;
        Object objUploadDeviceLocation = iApiCreditServiceH.uploadDeviceLocation(uploadDeviceLocationReq, this);
        return objUploadDeviceLocation == aVar ? aVar : objUploadDeviceLocation;
    }
}
