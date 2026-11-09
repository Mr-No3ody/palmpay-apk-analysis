package p364y6;

import B6.C0094p;
import Ef.a;
import Ff.h;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.S;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f44099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlgorithmScheduleProgressBar f44100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LivenessActivity livenessActivity, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, Continuation continuation) {
        super(2, continuation);
        this.f44098b = livenessActivity;
        this.f44099c = textView;
        this.f44100d = algorithmScheduleProgressBar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f44098b, this.f44099c, this.f44100d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44097a;
        if (i7 == 0) {
            g.M(obj);
            int i10 = LivenessActivity.f23837Y;
            LivenessActivity livenessActivity = this.f44098b;
            S s3 = livenessActivity.g().f1618j;
            C0094p c0094p = new C0094p(livenessActivity, this.f44099c, this.f44100d, 5);
            this.f44097a = 1;
            if (s3.f39102a.collect(c0094p, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        throw new C2127f();
    }
}
