package B6;

import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1872d;

/* JADX INFO: renamed from: B6.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0097t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097t(LivenessActivityV2 livenessActivityV2, Continuation continuation) {
        super(2, continuation);
        this.f519b = livenessActivityV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0097t(this.f519b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0097t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f518a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            int i10 = LivenessActivityV2.f23926Z;
            LivenessActivityV2 livenessActivityV2 = this.f519b;
            C1872d c1872d = livenessActivityV2.g().t;
            C0096s c0096s = new C0096s(livenessActivityV2);
            this.f518a = 1;
            if (c1872d.collect(c0096s, this) == aVar) {
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
