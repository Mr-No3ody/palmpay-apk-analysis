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
public final class k extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ICacheService f41221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ICacheService iCacheService, Continuation continuation) {
        super(2, continuation);
        this.f41221b = iCacheService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f41221b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41220a;
        if (i7 == 0) {
            g.M(obj);
            f fVar = I.f10809a;
            e eVar = e.f19009c;
            j jVar = new j(this.f41221b, null);
            this.f41220a = 1;
            if (AbstractC0780y.s(eVar, jVar, this) == aVar) {
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
