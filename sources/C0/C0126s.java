package C0;

import Wf.t0;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import p135j0.r0;

/* JADX INFO: renamed from: C0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0126s extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0126s(int i7, Object obj, Object obj2) {
        super(1);
        this.f1086a = i7;
        this.f1087b = obj;
        this.f1088c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        K next;
        K kE;
        Unit unit;
        switch (this.f1086a) {
            case 0:
                V navOptions = (V) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                C0111c animBuilder = C0111c.f1010g;
                navOptions.getClass();
                Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
                C0112d c0112d = new C0112d();
                c0112d.f1018a = -1;
                c0112d.f1019b = -1;
                animBuilder.invoke(c0112d);
                int i7 = c0112d.f1018a;
                T t = navOptions.f992a;
                t.f979f = i7;
                t.f980g = c0112d.f1019b;
                t.f981h = -1;
                t.f982i = -1;
                K k2 = (K) this.f1087b;
                if (k2 instanceof N) {
                    Iterator<K> it = K.f952o.getHierarchy(k2).iterator();
                    do {
                        boolean zHasNext = it.hasNext();
                        AbstractC0130w abstractC0130w = (AbstractC0130w) this.f1088c;
                        if (zHasNext) {
                            next = it.next();
                            kE = abstractC0130w.e();
                        } else if (AbstractC0130w.f1097D) {
                            L l5 = N.f966A;
                            N n10 = abstractC0130w.f1103c;
                            if (n10 == null) {
                                throw new IllegalStateException("You must call setGraph() before calling getGraph()");
                            }
                            int i10 = l5.findStartDestination(n10).f961i;
                            C0111c popUpToBuilder = C0111c.f1011i;
                            Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
                            navOptions.f995d = i10;
                            h0 h0Var = new h0();
                            popUpToBuilder.invoke(h0Var);
                            navOptions.f996e = h0Var.f1045a;
                        }
                    } while (!Intrinsics.c(next, kE != null ? kE.f955b : null));
                }
                return Unit.f38893a;
            case 1:
                C0119k backStackEntry = (C0119k) obj;
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                K k8 = backStackEntry.f1051b;
                if (k8 == null) {
                    k8 = null;
                }
                if (k8 == null) {
                    return null;
                }
                Bundle bundleA = backStackEntry.a();
                U u6 = (U) this.f1088c;
                e0 e0Var = (e0) this.f1087b;
                K destination = e0Var.c(k8, bundleA, u6);
                if (destination == null) {
                    return null;
                }
                if (destination.equals(k8)) {
                    return backStackEntry;
                }
                C0123o c0123oB = e0Var.b();
                Bundle bundleB = destination.b(backStackEntry.a());
                Intrinsics.checkNotNullParameter(destination, "destination");
                C0115g c0115g = C0119k.f1049v;
                AbstractC0130w abstractC0130w2 = c0123oB.f1073h;
                return C0115g.create$default(c0115g, abstractC0130w2.f1101a, destination, bundleB, abstractC0130w2.f(), abstractC0130w2.f1115o, null, null, 96, null);
            case 2:
                Intrinsics.checkNotNullParameter((IOException) obj, "it");
                Eg.l lVar = (Eg.l) this.f1087b;
                Eg.g gVar = (Eg.g) this.f1088c;
                synchronized (lVar) {
                    gVar.c();
                }
                return Unit.f38893a;
            case 3:
                Throwable th = (Throwable) obj;
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f1087b;
                if (th == null) {
                    kVar.b(((Wf.B) this.f1088c).l());
                } else if (th instanceof CancellationException) {
                    kVar.c();
                } else {
                    kVar.d(th);
                }
                return Unit.f38893a;
            case 4:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1087b;
                if (cancellationSignal != null) {
                    Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
                    cancellationSignal.cancel();
                }
                ((t0) this.f1088c).cancel((CancellationException) null);
                return Unit.f38893a;
            case 5:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof androidx.work.impl.v) {
                    ((V0.B) this.f1087b).f9858c.compareAndSet(-256, ((androidx.work.impl.v) th2).f18735a);
                }
                ((ListenableFuture) this.f1088c).cancel(false);
                return Unit.f38893a;
            case 6:
                androidx.work.impl.constraints.c it2 = (androidx.work.impl.constraints.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ((t0) this.f1087b).cancel((CancellationException) null);
                ((ProducerScope) this.f1088c).mo64trySendJP2dKIU(it2);
                return Unit.f38893a;
            case 7:
                if (Intrinsics.c((String) obj, ((File) this.f1087b).getName())) {
                    io.fastkv.n.Q((ProducerScope) this.f1088c, Unit.f38893a);
                }
                return Unit.f38893a;
            default:
                Throwable th3 = (Throwable) obj;
                ((J) this.f1087b).invoke(th3);
                r0 r0Var = (r0) this.f1088c;
                r0Var.f38128c.f(th3, false);
                do {
                    Object objMo66tryReceivePtdJZtk = r0Var.f38128c.mo66tryReceivePtdJZtk();
                    Yf.t tVar = Yf.v.f11447b;
                    if (objMo66tryReceivePtdJZtk instanceof Yf.u) {
                        objMo66tryReceivePtdJZtk = null;
                    }
                    if (objMo66tryReceivePtdJZtk != null) {
                        p135j0.b0 msg = (p135j0.b0) objMo66tryReceivePtdJZtk;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        msg.f38016b.completeExceptionally(th3 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th3);
                        Unit unit2 = Unit.f38893a;
                        unit = Unit.f38893a;
                    } else {
                        unit = null;
                    }
                } while (unit != null);
                return Unit.f38893a;
        }
    }
}
