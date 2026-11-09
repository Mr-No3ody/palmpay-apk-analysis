package p364y6;

import Ef.a;
import Ff.h;
import Pa.C0525w;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0525w f44093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C0525w c0525w, Continuation continuation) {
        super(2, continuation);
        this.f44093a = c0525w;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f44093a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        return Boolean.valueOf(this.f44093a.getDataBoolean("key_voice_enable", false));
    }
}
