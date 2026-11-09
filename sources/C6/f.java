package C6;

import B6.C0094p;
import android.util.Size;
import android.widget.TextView;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.liveness.video.VideoActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.S;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoActivity f1170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f1171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlgorithmScheduleProgressBar f1172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VideoActivity videoActivity, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, Continuation continuation) {
        super(2, continuation);
        this.f1170b = videoActivity;
        this.f1171c = textView;
        this.f1172d = algorithmScheduleProgressBar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f1170b, this.f1171c, this.f1172d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return Ef.a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1169a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Size size = VideoActivity.f23949B;
            VideoActivity videoActivity = this.f1170b;
            S s3 = videoActivity.f().f1236p;
            C0094p c0094p = new C0094p(videoActivity, this.f1171c, this.f1172d, 1);
            this.f1169a = 1;
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
