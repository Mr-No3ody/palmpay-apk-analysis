package C6;

import E.C0211p;
import E.C0216v;
import E.n0;
import androidx.camera.core.impl.A0;
import com.google.common.util.concurrent.ListenableFuture;
import com.palmpay.lib.liveness.video.VideoActivity;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoActivity f1180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(VideoActivity videoActivity, Continuation continuation) {
        super(2, continuation);
        this.f1180b = videoActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f1180b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1179a;
        VideoActivity videoActivity = this.f1180b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ListenableFuture<androidx.camera.lifecycle.h> fVar = androidx.camera.lifecycle.h.f14527i.getInstance(videoActivity);
            this.f1179a = 1;
            obj = G8.a.h(fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        androidx.camera.lifecycle.h hVar = (androidx.camera.lifecycle.h) obj;
        hVar.unbindAll();
        C0211p c0211p = new C0211p[]{C0211p.f2091b}[0];
        Intrinsics.e(c0211p);
        try {
            if (hVar.hasCamera(c0211p)) {
                A0 a3 = hVar.d(videoActivity, c0211p, new n0[0]).f14512c.f14330H;
                Set set = androidx.camera.video.s.f14825E;
                videoActivity.f23960o.add(new d(c0211p, (ArrayList) new androidx.camera.video.t(a3).getSupportedQualities(C0216v.f2122d)));
            }
        } catch (Exception unused) {
            int i10 = p292t6.a.f42345a;
            p292t6.a.b("Camera Face " + c0211p + " is not supported");
        }
        return Unit.f38893a;
    }
}
