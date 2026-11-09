package p364y6;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.cache.ICacheService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ICacheService f44085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f44086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ICacheService iCacheService, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f44085a = iCacheService;
        this.f44086b = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f44085a, this.f44086b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        this.f44085a.saveDataBoolean("key_voice_enable", this.f44086b);
        return Unit.f38893a;
    }
}
