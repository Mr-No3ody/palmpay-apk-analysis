package p232p6;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.cache.ICacheService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ICacheService f41218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ICacheService iCacheService, Continuation continuation) {
        super(2, continuation);
        this.f41218b = iCacheService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f41218b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41217a;
        if (i7 == 0) {
            g.M(obj);
            f fVar = I.f10809a;
            e eVar = e.f19009c;
            h hVar = new h(this.f41218b, null);
            this.f41217a = 1;
            if (AbstractC0780y.s(eVar, hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
