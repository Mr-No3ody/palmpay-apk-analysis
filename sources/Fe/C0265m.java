package Fe;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Fe.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0265m extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0265m(long j6, Continuation continuation) {
        super(1, continuation);
        this.f2793b = j6;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0265m(this.f2793b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0265m) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2792a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        String versionName = BaseApplication.get().getVersionName();
        Long l5 = new Long(this.f2793b);
        this.f2792a = 1;
        Object objCheckAppVersionAndUploadVersion = iApiMainService.checkAppVersionAndUploadVersion(versionName, l5, this);
        return objCheckAppVersionAndUploadVersion == aVar ? aVar : objCheckAppVersionAndUploadVersion;
    }
}
