package p232p6;

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
    public final /* synthetic */ ICacheService f41222a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ICacheService iCacheService, Continuation continuation) {
        super(2, continuation);
        this.f41222a = iCacheService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f41222a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        this.f41222a.saveDataBoolean("key_voice_prompt_dialog_shown", true);
        return Unit.f38893a;
    }
}
