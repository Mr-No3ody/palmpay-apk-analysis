package p232p6;

import Ef.a;
import Ff.h;
import Pa.C0525w;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0525w f41223a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0525w c0525w, Continuation continuation) {
        super(2, continuation);
        this.f41223a = c0525w;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f41223a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        return Boolean.valueOf(this.f41223a.getDataBoolean("key_voice_prompt_dialog_shown", false));
    }
}
