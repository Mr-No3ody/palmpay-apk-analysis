package C6;

import android.widget.TextView;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.V;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.liveness.video.VideoActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoActivity f1174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f1175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlgorithmScheduleProgressBar f1176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(VideoActivity videoActivity, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, Continuation continuation) {
        super(2, continuation);
        this.f1174b = videoActivity;
        this.f1175c = textView;
        this.f1176d = algorithmScheduleProgressBar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f1174b, this.f1175c, this.f1176d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1173a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            EnumC1204n enumC1204n = EnumC1204n.f17463d;
            VideoActivity videoActivity = this.f1174b;
            f fVar = new f(videoActivity, this.f1175c, this.f1176d, null);
            this.f1173a = 1;
            if (V.j(videoActivity, enumC1204n, fVar, this) == aVar) {
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
