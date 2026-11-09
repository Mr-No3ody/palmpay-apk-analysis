package Ce;

import Pa.AbstractC0508e;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ce.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0179v extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179v(Context context, Continuation continuation) {
        super(2, continuation);
        this.f1538a = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0179v(this.f1538a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0179v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Regex regex = AbstractC0508e.f7078a;
        return AbstractC0508e.c(this.f1538a);
    }
}
