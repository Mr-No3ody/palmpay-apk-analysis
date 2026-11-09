package p383zc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i7, String str, Continuation continuation) {
        super(1, continuation);
        this.f44662b = str;
        this.f44663c = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new u(this.f44663c, this.f44662b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((u) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44661a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        JaraPacketApiService jaraPacketApiService = (JaraPacketApiService) p254qc.a.f41475a.f35518b;
        this.f44661a = 1;
        Object objQueryReferEarnRecords = jaraPacketApiService.queryReferEarnRecords(this.f44662b, this.f44663c, 20, this);
        return objQueryReferEarnRecords == aVar ? aVar : objQueryReferEarnRecords;
    }
}
