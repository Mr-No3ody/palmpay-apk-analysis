package Kd;

import android.app.Application;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.api.kkcar.IApiKkCarService;
import com.transsnet.palmpay.send_money.bean.req.kkcar.PassengerAuthReq;
import com.transsnet.palmpay.send_money.viewmodel.KkCarOnboardingViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Kd.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0382i extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KkCarOnboardingViewModel f5275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0382i(String str, KkCarOnboardingViewModel kkCarOnboardingViewModel, Continuation continuation) {
        super(1, continuation);
        this.f5274b = str;
        this.f5275c = kkCarOnboardingViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0382i(this.f5274b, this.f5275c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0382i) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5273a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        String string = StringsKt.V(this.f5274b).toString();
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                IApiKkCarService iApiKkCarService = (IApiKkCarService) p188md.a.f39647a.f139b;
                PassengerAuthReq passengerAuthReq = new PassengerAuthReq(string);
                this.f5273a = 1;
                Object objPassengerAuth = iApiKkCarService.passengerAuth(passengerAuthReq, this);
                return objPassengerAuth == aVar ? aVar : objPassengerAuth;
            }
        }
        CommonBeanResult commonBeanResult = new CommonBeanResult();
        commonBeanResult.setRespCode(CommonResult.CODE_FAIL);
        Application application = this.f5275c.f17439d;
        Intrinsics.f(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        commonBeanResult.setRespMsg(application.getString(p159kd.h.sm_kk_verify_token_missing));
        return commonBeanResult;
    }
}
