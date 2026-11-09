package C6;

import Wf.AbstractC0780y;
import Wf.I;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.H;
import com.palmpay.lib.liveness.video.VideoActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoActivity f1182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(VideoActivity videoActivity, Continuation continuation) {
        super(2, continuation);
        this.f1182b = videoActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f1182b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1181a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            VideoActivity videoActivity = this.f1182b;
            i iVar = new i(videoActivity, null);
            this.f1181a = 1;
            AbstractC1205o lifecycle = videoActivity.getLifecycle();
            p042cg.f fVar = I.f10809a;
            if (AbstractC0780y.s(((Xf.d) p015ag.o.f11960a).f11224e, new H(lifecycle, iVar, null), this) == aVar) {
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
