package p255qd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, Continuation continuation) {
        super(1, continuation);
        this.f41505b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new m(this.f41505b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41504a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        PayApiService payApiService = (PayApiService) c.f43141a.f14621b;
        this.f41504a = 1;
        Object objAnalysisCouponQrCode = payApiService.analysisCouponQrCode(this.f41505b, this);
        return objAnalysisCouponQrCode == aVar ? aVar : objAnalysisCouponQrCode;
    }
}
