package p019b3;

import W8.o;
import android.os.Looper;
import com.facebook.imagepipeline.producers.AbstractC1341f;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1341f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f18764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18765b;

    public c(Call call, e eVar) {
        this.f18764a = call;
        this.f18765b = eVar;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public final void onCancellationRequested() {
        boolean zC = Intrinsics.c(Looper.myLooper(), Looper.getMainLooper());
        Call call = this.f18764a;
        if (zC) {
            this.f18765b.cancellationExecutor.execute(new o(call, 29));
        } else {
            call.cancel();
        }
    }
}
