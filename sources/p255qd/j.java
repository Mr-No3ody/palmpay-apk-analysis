package p255qd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.AnalysisPartnerInCodeReq;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p188md.b;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalysisPartnerInCodeReq f41499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AnalysisPartnerInCodeReq analysisPartnerInCodeReq, Continuation continuation) {
        super(1, continuation);
        this.f41499b = analysisPartnerInCodeReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f41499b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((j) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41498a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) b.f39648a.f6830b;
        this.f41498a = 1;
        Object objAnalysisPartnerInCode = sendMoneyApiService.analysisPartnerInCode(this.f41499b, this);
        return objAnalysisPartnerInCode == aVar ? aVar : objAnalysisPartnerInCode;
    }
}
