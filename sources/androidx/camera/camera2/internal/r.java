package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements MeteringRepeatingSession$SurfaceResetCallback, CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f13642b;

    public /* synthetic */ r(J j6, int i7) {
        this.f13641a = i7;
        this.f13642b = j6;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(final androidx.concurrent.futures.k kVar) {
        switch (this.f13641a) {
            case 1:
                J j6 = this.f13642b;
                j6.getClass();
                try {
                    ArrayList arrayList = new ArrayList(j6.f13175a.f().b().f13882c);
                    arrayList.add((C0947p0) j6.f13188q0.f13251f);
                    arrayList.add(new C0963y(j6, kVar));
                    j6.f13176b.f13482a.openCamera(j6.f13183j.f13228a, j6.f13177c, p264r5.a.i(arrayList));
                    return "configAndCloseTask";
                } catch (androidx.camera.camera2.internal.compat.a | SecurityException e10) {
                    j6.f("Unable to open camera for configAndClose: " + e10.getMessage());
                    kVar.d(e10);
                    return "configAndCloseTask";
                }
            case 2:
                final J j10 = this.f13642b;
                j10.getClass();
                try {
                    final int i7 = 1;
                    j10.f13177c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            E e11;
                            switch (i7) {
                                case 0:
                                    J j11 = j10;
                                    androidx.concurrent.futures.k kVar2 = kVar;
                                    boolean z3 = true;
                                    if (j11.f13195w == null) {
                                        if (j11.f13166B0 != 1) {
                                            j11.f13195w = AbstractC0198c.y(new r(j11, 3));
                                        } else {
                                            j11.f13195w = androidx.camera.core.impl.utils.futures.l.f14212c;
                                        }
                                    }
                                    ListenableFuture listenableFuture = j11.f13195w;
                                    switch (F.i(j11.f13166B0)) {
                                        case 1:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            if (!j11.f13182i.a() && ((e11 = (E) j11.f13164A0.f13512a) == null || e11.f13132b.get())) {
                                                z3 = false;
                                            }
                                            j11.f13164A0.a();
                                            j11.s(2);
                                            if (z3) {
                                                p118hf.a.k(j11.f13165B.isEmpty(), null);
                                                j11.d();
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                            p118hf.a.k(j11.f13185o == null, null);
                                            j11.s(2);
                                            p118hf.a.k(j11.f13165B.isEmpty(), null);
                                            j11.d();
                                            break;
                                        case 8:
                                        case 9:
                                            j11.s(2);
                                            j11.b();
                                            break;
                                        default:
                                            j11.f("release() ignored due to being in state: ".concat(F.j(j11.f13166B0)));
                                            break;
                                    }
                                    androidx.camera.core.impl.utils.futures.j.f(listenableFuture, kVar2);
                                    break;
                                default:
                                    J j12 = j10;
                                    P0 p3 = j12.f13187p0;
                                    androidx.concurrent.futures.k kVar3 = kVar;
                                    if (p3 != null) {
                                        kVar3.b(Boolean.valueOf(j12.f13175a.i(J.i(p3))));
                                    } else {
                                        kVar3.b(Boolean.FALSE);
                                    }
                                    break;
                            }
                        }
                    });
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    kVar.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            case 3:
                J j11 = this.f13642b;
                p118hf.a.k(j11.f13163A == null, "Camera can only be released once, so release completer should be null on creation.");
                j11.f13163A = kVar;
                return "Release[camera=" + j11 + "]";
            default:
                final J j12 = this.f13642b;
                final int i10 = 0;
                j12.f13177c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        E e11;
                        switch (i10) {
                            case 0:
                                J j13 = j12;
                                androidx.concurrent.futures.k kVar2 = kVar;
                                boolean z3 = true;
                                if (j13.f13195w == null) {
                                    if (j13.f13166B0 != 1) {
                                        j13.f13195w = AbstractC0198c.y(new r(j13, 3));
                                    } else {
                                        j13.f13195w = androidx.camera.core.impl.utils.futures.l.f14212c;
                                    }
                                }
                                ListenableFuture listenableFuture = j13.f13195w;
                                switch (F.i(j13.f13166B0)) {
                                    case 1:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (!j13.f13182i.a() && ((e11 = (E) j13.f13164A0.f13512a) == null || e11.f13132b.get())) {
                                            z3 = false;
                                        }
                                        j13.f13164A0.a();
                                        j13.s(2);
                                        if (z3) {
                                            p118hf.a.k(j13.f13165B.isEmpty(), null);
                                            j13.d();
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        p118hf.a.k(j13.f13185o == null, null);
                                        j13.s(2);
                                        p118hf.a.k(j13.f13165B.isEmpty(), null);
                                        j13.d();
                                        break;
                                    case 8:
                                    case 9:
                                        j13.s(2);
                                        j13.b();
                                        break;
                                    default:
                                        j13.f("release() ignored due to being in state: ".concat(F.j(j13.f13166B0)));
                                        break;
                                }
                                androidx.camera.core.impl.utils.futures.j.f(listenableFuture, kVar2);
                                break;
                            default:
                                J j14 = j12;
                                P0 p3 = j14.f13187p0;
                                androidx.concurrent.futures.k kVar3 = kVar;
                                if (p3 != null) {
                                    kVar3.b(Boolean.valueOf(j14.f13175a.i(J.i(p3))));
                                } else {
                                    kVar3.b(Boolean.FALSE);
                                }
                                break;
                        }
                    }
                });
                return "Release[request=" + j12.f13193v.getAndIncrement() + "]";
        }
    }

    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession$SurfaceResetCallback
    public void onSurfaceReset() {
        J j6 = this.f13642b;
        j6.getClass();
        try {
            if (((Boolean) AbstractC0198c.y(new r(j6, 2)).f15066b.get()).booleanValue()) {
                P0 p3 = j6.f13187p0;
                androidx.camera.core.impl.H0 h7 = (androidx.camera.core.impl.H0) p3.f13247b;
                j6.f13177c.execute(new G.g(j6, J.i(p3), h7, (O0) p3.f13248c, null, Collections.singletonList(androidx.camera.core.impl.T0.f13979f), 1));
            }
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }
}
