package Ce;

import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.SplashFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplashFragment f1499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(SplashFragment splashFragment, Continuation continuation) {
        super(2, continuation);
        this.f1499a = splashFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l0(this.f1499a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SplashFragment splashFragment = this.f1499a;
        if (splashFragment.isAdded() && (splashFragment.getActivity() instanceof HomeActivity)) {
            androidx.fragment.app.E activity = splashFragment.getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.ui.activity.HomeActivity");
            ((HomeActivity) activity).r();
        }
        return Unit.f38893a;
    }
}
