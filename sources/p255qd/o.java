package p255qd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.AnalysisCodeSendMoneyReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p188md.b;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalysisCodeSendMoneyReq f41509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AnalysisCodeSendMoneyReq analysisCodeSendMoneyReq, Continuation continuation) {
        super(1, continuation);
        this.f41509b = analysisCodeSendMoneyReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new o(this.f41509b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41508a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) b.f39648a.f6830b;
        this.f41508a = 1;
        Object qrcodeData = sendMoneyApiService.parseQrcodeData(this.f41509b, this);
        return qrcodeData == aVar ? aVar : qrcodeData;
    }
}
