package B6;

import android.widget.TextView;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p355xf.C2127f;

/* JADX INFO: renamed from: B6.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0095q extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlgorithmScheduleProgressBar f512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0095q(LivenessActivityV2 livenessActivityV2, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, Continuation continuation) {
        super(2, continuation);
        this.f510b = livenessActivityV2;
        this.f511c = textView;
        this.f512d = algorithmScheduleProgressBar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0095q(this.f510b, this.f511c, this.f512d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((C0095q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return Ef.a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f509a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            int i10 = LivenessActivityV2.f23926Z;
            LivenessActivityV2 livenessActivityV2 = this.f510b;
            kotlinx.coroutines.flow.S s3 = livenessActivityV2.g().f460o;
            C0094p c0094p = new C0094p(livenessActivityV2, this.f511c, this.f512d, 0);
            this.f509a = 1;
            if (s3.f39102a.collect(c0094p, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        throw new C2127f();
    }
}
