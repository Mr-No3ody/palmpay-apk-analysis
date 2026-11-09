package B6;

import Pa.C0525w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: B6.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0091m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0525w f500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091m(C0525w c0525w, Continuation continuation) {
        super(2, continuation);
        this.f500a = c0525w;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0091m(this.f500a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0091m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        return Boolean.valueOf(this.f500a.getDataBoolean("key_voice_enable", false));
    }
}
