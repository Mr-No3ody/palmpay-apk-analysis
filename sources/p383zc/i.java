package p383zc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f44646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, int i7, int i10, Continuation continuation) {
        super(1, continuation);
        this.f44644b = str;
        this.f44645c = i7;
        this.f44646d = i10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f44644b, this.f44645c, this.f44646d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44643a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        JaraPacketApiService jaraPacketApiService = (JaraPacketApiService) p254qc.a.f41475a.f35518b;
        this.f44643a = 1;
        Object objQueryReferEarnRecords = jaraPacketApiService.queryReferEarnRecords(this.f44644b, this.f44645c, this.f44646d, this);
        return objQueryReferEarnRecords == aVar ? aVar : objQueryReferEarnRecords;
    }
}
