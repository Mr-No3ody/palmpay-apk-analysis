package p255qd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.AnalysisBlankQrCodeReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalysisBlankQrCodeReq f41497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AnalysisBlankQrCodeReq analysisBlankQrCodeReq, Continuation continuation) {
        super(1, continuation);
        this.f41497b = analysisBlankQrCodeReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f41497b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41496a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        PayApiService payApiService = (PayApiService) c.f43141a.f14621b;
        this.f41496a = 1;
        Object objAnalyzeBlankCode = payApiService.analyzeBlankCode(this.f41497b, this);
        return objAnalyzeBlankCode == aVar ? aVar : objAnalyzeBlankCode;
    }
}
