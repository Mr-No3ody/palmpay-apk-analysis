package B6;

import android.widget.TextView;
import androidx.lifecycle.EnumC1204n;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlgorithmScheduleProgressBar f516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LivenessActivityV2 livenessActivityV2, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, Continuation continuation) {
        super(2, continuation);
        this.f514b = livenessActivityV2;
        this.f515c = textView;
        this.f516d = algorithmScheduleProgressBar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f514b, this.f515c, this.f516d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f513a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            EnumC1204n enumC1204n = EnumC1204n.f17463d;
            LivenessActivityV2 livenessActivityV2 = this.f514b;
            C0095q c0095q = new C0095q(livenessActivityV2, this.f515c, this.f516d, null);
            this.f513a = 1;
            if (androidx.lifecycle.V.j(livenessActivityV2, enumC1204n, c0095q, this) == aVar) {
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
