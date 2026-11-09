package Fe;

import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSettings f2803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(NotificationSettings notificationSettings, Continuation continuation) {
        super(1, continuation);
        this.f2803b = notificationSettings;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new p0(this.f2803b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2802a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f2802a = 1;
        Object objUpdateNotificationSetting = iApiAccountServiceT.updateNotificationSetting(this.f2803b, this);
        return objUpdateNotificationSetting == aVar ? aVar : objUpdateNotificationSetting;
    }
}
