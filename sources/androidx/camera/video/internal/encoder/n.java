package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f14696b;

    public /* synthetic */ n(r rVar, int i7) {
        this.f14695a = i7;
        this.f14696b = rVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object attachCompleter(final androidx.concurrent.futures.k kVar) {
        switch (this.f14695a) {
            case 0:
                final r rVar = this.f14696b;
                final int i7 = 1;
                rVar.f14709d.f14741h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                final r rVar2 = rVar;
                                androidx.camera.video.internal.b bVar = rVar2.f14707b;
                                androidx.camera.video.internal.b bVar2 = androidx.camera.video.internal.b.f14617a;
                                androidx.concurrent.futures.k kVar2 = kVar;
                                if (bVar == bVar2) {
                                    v vVar = rVar2.f14709d;
                                    final ListenableFuture listenableFutureA = vVar.a();
                                    androidx.camera.core.impl.utils.futures.j.f(listenableFutureA, kVar2);
                                    final int i10 = 0;
                                    kVar2.a(new Runnable() { // from class: androidx.camera.video.internal.encoder.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    r rVar3 = rVar2;
                                                    rVar3.getClass();
                                                    ListenableFuture listenableFuture = listenableFutureA;
                                                    if (!listenableFuture.cancel(true)) {
                                                        p118hf.a.k(listenableFuture.isDone(), null);
                                                        try {
                                                            ((InputBuffer) listenableFuture.get()).cancel();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            String str = rVar3.f14709d.f14734a;
                                                            e10.toString();
                                                            p140j8.f.G(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    rVar2.f14708c.remove(listenableFutureA);
                                                    break;
                                            }
                                        }
                                    }, org.chromium.support_lib_boundary.util.b.u());
                                    rVar2.f14708c.add(listenableFutureA);
                                    final int i11 = 1;
                                    listenableFutureA.addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    r rVar3 = rVar2;
                                                    rVar3.getClass();
                                                    ListenableFuture listenableFuture = listenableFutureA;
                                                    if (!listenableFuture.cancel(true)) {
                                                        p118hf.a.k(listenableFuture.isDone(), null);
                                                        try {
                                                            ((InputBuffer) listenableFuture.get()).cancel();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            String str = rVar3.f14709d.f14734a;
                                                            e10.toString();
                                                            p140j8.f.G(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    rVar2.f14708c.remove(listenableFutureA);
                                                    break;
                                            }
                                        }
                                    }, vVar.f14741h);
                                } else if (bVar != androidx.camera.video.internal.b.f14618b) {
                                    kVar2.d(new IllegalStateException("Unknown state: " + rVar2.f14707b));
                                } else {
                                    kVar2.d(new IllegalStateException("BufferProvider is not active."));
                                }
                                break;
                            default:
                                kVar.b(rVar.f14707b);
                                break;
                        }
                    }
                });
                return "fetchData";
            default:
                final r rVar2 = this.f14696b;
                final int i10 = 0;
                rVar2.f14709d.f14741h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                final r rVar3 = rVar2;
                                androidx.camera.video.internal.b bVar = rVar3.f14707b;
                                androidx.camera.video.internal.b bVar2 = androidx.camera.video.internal.b.f14617a;
                                androidx.concurrent.futures.k kVar2 = kVar;
                                if (bVar == bVar2) {
                                    v vVar = rVar3.f14709d;
                                    final ListenableFuture listenableFutureA = vVar.a();
                                    androidx.camera.core.impl.utils.futures.j.f(listenableFutureA, kVar2);
                                    final int i11 = 0;
                                    kVar2.a(new Runnable() { // from class: androidx.camera.video.internal.encoder.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    r rVar4 = rVar3;
                                                    rVar4.getClass();
                                                    ListenableFuture listenableFuture = listenableFutureA;
                                                    if (!listenableFuture.cancel(true)) {
                                                        p118hf.a.k(listenableFuture.isDone(), null);
                                                        try {
                                                            ((InputBuffer) listenableFuture.get()).cancel();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            String str = rVar4.f14709d.f14734a;
                                                            e10.toString();
                                                            p140j8.f.G(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    rVar3.f14708c.remove(listenableFutureA);
                                                    break;
                                            }
                                        }
                                    }, org.chromium.support_lib_boundary.util.b.u());
                                    rVar3.f14708c.add(listenableFutureA);
                                    final int i12 = 1;
                                    listenableFutureA.addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    r rVar4 = rVar3;
                                                    rVar4.getClass();
                                                    ListenableFuture listenableFuture = listenableFutureA;
                                                    if (!listenableFuture.cancel(true)) {
                                                        p118hf.a.k(listenableFuture.isDone(), null);
                                                        try {
                                                            ((InputBuffer) listenableFuture.get()).cancel();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            String str = rVar4.f14709d.f14734a;
                                                            e10.toString();
                                                            p140j8.f.G(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    rVar3.f14708c.remove(listenableFutureA);
                                                    break;
                                            }
                                        }
                                    }, vVar.f14741h);
                                } else if (bVar != androidx.camera.video.internal.b.f14618b) {
                                    kVar2.d(new IllegalStateException("Unknown state: " + rVar3.f14707b));
                                } else {
                                    kVar2.d(new IllegalStateException("BufferProvider is not active."));
                                }
                                break;
                            default:
                                kVar.b(rVar2.f14707b);
                                break;
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
