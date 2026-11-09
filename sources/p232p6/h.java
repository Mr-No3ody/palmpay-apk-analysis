package p232p6;

import Ef.a;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.cache.ICacheService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ICacheService f41216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ICacheService iCacheService, Continuation continuation) {
        super(2, continuation);
        this.f41216a = iCacheService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f41216a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        this.f41216a.saveDataBoolean("key_voice_enable", true);
        return Unit.f38893a;
    }
}
