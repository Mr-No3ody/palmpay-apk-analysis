package B6;

import androidx.lifecycle.EnumC1204n;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: B6.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0098u extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098u(LivenessActivityV2 livenessActivityV2, Continuation continuation) {
        super(2, continuation);
        this.f521b = livenessActivityV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0098u(this.f521b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0098u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f520a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            EnumC1204n enumC1204n = EnumC1204n.f17463d;
            LivenessActivityV2 livenessActivityV2 = this.f521b;
            C0097t c0097t = new C0097t(livenessActivityV2, null);
            this.f520a = 1;
            if (androidx.lifecycle.V.j(livenessActivityV2, enumC1204n, c0097t, this) == aVar) {
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
