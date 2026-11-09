package B6;

import com.palmpay.lib.liveness.cache.ICacheService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: B6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0088j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ICacheService f492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088j(ICacheService iCacheService, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f492a = iCacheService;
        this.f493b = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0088j(this.f492a, this.f493b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0088j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f492a.saveDataBoolean("key_voice_enable", this.f493b);
        return Unit.f38893a;
    }
}
