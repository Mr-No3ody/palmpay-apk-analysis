package B6;

import com.palmpay.lib.liveness.cache.ICacheService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: B6.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0089k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ICacheService f494a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089k(ICacheService iCacheService, Continuation continuation) {
        super(2, continuation);
        this.f494a = iCacheService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0089k(this.f494a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0089k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        return Boolean.valueOf(this.f494a.getDataBoolean("key_voice_enable", false));
    }
}
