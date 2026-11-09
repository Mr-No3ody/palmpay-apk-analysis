package p383zc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, Continuation continuation) {
        super(1, continuation);
        this.f44668b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new x(this.f44668b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((x) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44667a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        JaraPacketApiService jaraPacketApiService = (JaraPacketApiService) p254qc.a.f41475a.f35518b;
        this.f44667a = 1;
        Object objReferEarnWithDrawCreate = jaraPacketApiService.referEarnWithDrawCreate(this.f44668b, this);
        return objReferEarnWithDrawCreate == aVar ? aVar : objReferEarnWithDrawCreate;
    }
}
