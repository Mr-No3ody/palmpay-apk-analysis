package p364y6;

import B6.C0094p;
import Ef.a;
import Ff.h;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.ui.FaceCaptureActivity;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.S;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FaceCaptureActivity f44066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f44067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlgorithmScheduleProgressBar f44068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FaceCaptureActivity faceCaptureActivity, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, Continuation continuation) {
        super(2, continuation);
        this.f44066b = faceCaptureActivity;
        this.f44067c = textView;
        this.f44068d = algorithmScheduleProgressBar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f44066b, this.f44067c, this.f44068d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44065a;
        if (i7 == 0) {
            g.M(obj);
            FaceCaptureActivity.a aVar2 = FaceCaptureActivity.f23821i;
            FaceCaptureActivity faceCaptureActivity = this.f44066b;
            S s3 = faceCaptureActivity.f().t;
            C0094p c0094p = new C0094p(faceCaptureActivity, this.f44067c, this.f44068d, 4);
            this.f44065a = 1;
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
