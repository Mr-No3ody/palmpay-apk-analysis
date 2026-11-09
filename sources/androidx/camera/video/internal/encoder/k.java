package androidx.camera.video.internal.encoder;

import androidx.camera.camera2.internal.F;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14686b;

    public /* synthetic */ k(v vVar, int i7) {
        this.f14685a = i7;
        this.f14686b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14685a) {
            case 0:
                v vVar = this.f14686b;
                if (vVar.f14754v) {
                    p140j8.f.G(vVar.f14734a);
                    vVar.f14755w = null;
                    vVar.i();
                    vVar.f14754v = false;
                    return;
                }
                return;
            case 1:
                v vVar2 = this.f14686b;
                ListenableFuture listenableFutureA = vVar2.a();
                listenableFutureA.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureA, new org.greenrobot.eventbus.f(vVar2, 9)), vVar2.f14741h);
                return;
            case 2:
                v vVar3 = this.f14686b;
                switch (F.i(vVar3.f14733D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        vVar3.e();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        vVar3.h(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(vVar3.f14733D)));
                }
            case 3:
                v vVar4 = this.f14686b;
                int i7 = F.i(vVar4.f14733D);
                if (i7 == 1) {
                    vVar4.f();
                    return;
                } else {
                    if (i7 == 6 || i7 == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 4:
                v vVar5 = this.f14686b;
                vVar5.f14730A = true;
                if (vVar5.f14758z) {
                    vVar5.f14738e.stop();
                    vVar5.g();
                    return;
                }
                return;
            default:
                v vVar6 = this.f14686b;
                vVar6.f14741h.execute(new k(vVar6, 0));
                return;
        }
    }
}
