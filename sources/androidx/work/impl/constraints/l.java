package androidx.work.impl.constraints;

import B6.W;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F1.b f18503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.k f18504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnConstraintsStateChangedListener f18505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(F1.b bVar, androidx.work.impl.model.k kVar, OnConstraintsStateChangedListener onConstraintsStateChangedListener, Continuation continuation) {
        super(2, continuation);
        this.f18503b = bVar;
        this.f18504c = kVar;
        this.f18505d = onConstraintsStateChangedListener;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f18503b, this.f18504c, this.f18505d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f18502a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            androidx.work.impl.model.k kVar = this.f18504c;
            Flow flowK = this.f18503b.k(kVar);
            W w3 = new W(2, this.f18505d, kVar);
            this.f18502a = 1;
            if (flowK.collect(w3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
