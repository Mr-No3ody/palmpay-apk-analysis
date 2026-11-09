package V0;

import E.C0216v;
import E.m0;
import android.util.Range;
import android.util.Size;
import androidx.appcompat.widget.m1;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.P0;
import androidx.camera.video.C1016e;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.work.Tracer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements CallbackToFutureAdapter$Resolver, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9879f;

    public /* synthetic */ J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f9874a = i7;
        this.f9875b = obj;
        this.f9876c = obj2;
        this.f9877d = obj3;
        this.f9878e = obj4;
        this.f9879f = obj5;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k completer) {
        switch (this.f9874a) {
            case 0:
                Intrinsics.checkNotNullParameter(completer, "completer");
                ((SerialExecutor) this.f9875b).execute(new Da.a((Tracer) this.f9876c, (String) this.f9877d, (Function0) this.f9878e, (androidx.lifecycle.F) this.f9879f, completer, 1));
                return Unit.f38893a;
            default:
                androidx.camera.video.E e10 = (androidx.camera.video.E) this.f9875b;
                m0 m0Var = (m0) this.f9876c;
                C0216v c0216v = m0Var.f2057c;
                androidx.camera.video.internal.d dVar = (androidx.camera.video.internal.d) this.f9878e;
                C1016e c1016e = (C1016e) this.f9879f;
                androidx.camera.video.internal.config.a aVarB = androidx.camera.video.internal.config.b.b(c1016e, c0216v, dVar);
                String str = aVarB.f14631a;
                androidx.camera.video.j jVar = c1016e.f14590a;
                Size size = m0Var.f2056b;
                P0 p3 = (P0) this.f9877d;
                Range range = m0Var.f2058d;
                C0977f c0977f = aVarB.f14633c;
                androidx.camera.video.internal.encoder.d dVar2 = (androidx.camera.video.internal.encoder.d) (c0977f != null ? new m1(str, p3, jVar, size, c0977f, c0216v, range) : new androidx.camera.video.internal.config.c(str, p3, jVar, size, c0216v, range)).get();
                try {
                    B8.d dVar3 = e10.f14559c;
                    Executor executor = e10.f14557a;
                    dVar3.getClass();
                    androidx.camera.video.internal.encoder.v vVar = new androidx.camera.video.internal.encoder.v(executor, dVar2);
                    e10.f14560d = vVar;
                    Encoder.EncoderInput encoderInput = vVar.f14739f;
                    if (encoderInput instanceof Encoder.SurfaceInput) {
                        ((Encoder.SurfaceInput) encoderInput).setOnSurfaceUpdateListener(e10.f14558b, new defpackage.a(e10, 9, completer, m0Var));
                    } else {
                        completer.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                    }
                } catch (androidx.camera.video.internal.encoder.x e11) {
                    p140j8.f.h("VideoEncoderSession", "Unable to initialize video encoder.", e11);
                    completer.d(e11);
                }
                return "ConfigureVideoEncoderFuture " + e10;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ConfigFetchHandler) this.f9875b).lambda$fetchIfCacheExpiredAndNotThrottled$2((Task) this.f9876c, (Task) this.f9877d, (Date) this.f9878e, (Map) this.f9879f, task);
    }
}
