package p383zc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f44652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Long l5, Continuation continuation) {
        super(1, continuation);
        this.f44652b = l5;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new l(this.f44652b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44651a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        JaraPacketApiService jaraPacketApiService = (JaraPacketApiService) p254qc.a.f41475a.f35518b;
        this.f44651a = 1;
        Object objUpdateReInviteIsInvite = jaraPacketApiService.updateReInviteIsInvite(this.f44652b, this);
        return objUpdateReInviteIsInvite == aVar ? aVar : objUpdateReInviteIsInvite;
    }
}
