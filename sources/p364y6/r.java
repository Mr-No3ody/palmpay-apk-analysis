package p364y6;

import Ef.a;
import Ff.h;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.V;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f44103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlgorithmScheduleProgressBar f44104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LivenessActivity livenessActivity, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, Continuation continuation) {
        super(2, continuation);
        this.f44102b = livenessActivity;
        this.f44103c = textView;
        this.f44104d = algorithmScheduleProgressBar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f44102b, this.f44103c, this.f44104d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44101a;
        if (i7 == 0) {
            g.M(obj);
            EnumC1204n enumC1204n = EnumC1204n.f17463d;
            LivenessActivity livenessActivity = this.f44102b;
            q qVar = new q(livenessActivity, this.f44103c, this.f44104d, null);
            this.f44101a = 1;
            if (V.j(livenessActivity, enumC1204n, qVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
