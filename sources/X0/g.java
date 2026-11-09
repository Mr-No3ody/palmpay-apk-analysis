package X0;

import V0.B;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f10951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f10952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F1.b f10953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.k f10954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ConstraintTrackingWorker constraintTrackingWorker, B b7, F1.b bVar, androidx.work.impl.model.k kVar, Continuation continuation) {
        super(2, continuation);
        this.f10951b = constraintTrackingWorker;
        this.f10952c = b7;
        this.f10953d = bVar;
        this.f10954e = kVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f10951b, this.f10952c, this.f10953d, this.f10954e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10950a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f10950a = 1;
        Object objD = ConstraintTrackingWorker.d(this.f10951b, this.f10952c, this.f10953d, this.f10954e, this);
        return objD == aVar ? aVar : objD;
    }
}
