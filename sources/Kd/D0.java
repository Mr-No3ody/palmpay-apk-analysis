package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.req.SaveTransferLimitSettingReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(long j6, long j10, Continuation continuation) {
        super(1, continuation);
        this.f5021b = j6;
        this.f5022c = j10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new D0(this.f5021b, this.f5022c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((D0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5020a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        SaveTransferLimitSettingReq saveTransferLimitSettingReq = new SaveTransferLimitSettingReq(new Long(this.f5021b), new Long(this.f5022c));
        this.f5020a = 1;
        Object objSaveTransferLimitSetting = sendMoneyApiService.saveTransferLimitSetting(saveTransferLimitSettingReq, this);
        return objSaveTransferLimitSetting == aVar ? aVar : objSaveTransferLimitSetting;
    }
}
