package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1341f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21518c;

    public /* synthetic */ X(int i7, Object obj, Object obj2) {
        this.f21516a = i7;
        this.f21518c = obj;
        this.f21517b = obj2;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public final void onCancellationRequested() {
        boolean zRemove;
        ArrayList arrayList;
        C1340e c1340e;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        p109h3.e eVar;
        switch (this.f21516a) {
            case 0:
                synchronized (((Z) this.f21518c)) {
                    try {
                        zRemove = ((Z) this.f21518c).f21522b.remove((Pair) this.f21517b);
                        arrayList = null;
                        if (!zRemove) {
                            c1340e = null;
                            arrayListL = null;
                        } else if (((Z) this.f21518c).f21522b.isEmpty()) {
                            c1340e = ((Z) this.f21518c).f21526f;
                            arrayListL = null;
                        } else {
                            ArrayList arrayListK = ((Z) this.f21518c).k();
                            arrayListL = ((Z) this.f21518c).l();
                            arrayListJ = ((Z) this.f21518c).j();
                            c1340e = null;
                            arrayList = arrayListK;
                        }
                        arrayListJ = arrayListL;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                C1340e.b(arrayList);
                C1340e.c(arrayListL);
                C1340e.a(arrayListJ);
                if (c1340e != null) {
                    if (!((Z) this.f21518c).f21528h.f21577c || c1340e.isPrefetch()) {
                        c1340e.d();
                    } else {
                        C1340e.c(c1340e.e(com.facebook.imagepipeline.common.e.f21428b));
                    }
                }
                if (zRemove) {
                    ((Consumer) ((Pair) this.f21517b).first).onCancellation();
                    return;
                }
                return;
            case 1:
                g0 g0Var = (g0) this.f21518c;
                G g7 = g0Var.f21568g;
                synchronized (g7) {
                    eVar = g7.f21481e;
                    g7.f21481e = null;
                    g7.f21482f = 0;
                    break;
                }
                p109h3.e.b(eVar);
                g0Var.f21567f = true;
                ((Consumer) this.f21517b).onCancellation();
                return;
            default:
                O o10 = (O) this.f21517b;
                o10.a();
                ((l0) this.f21518c).f21598b.remove(o10);
                return;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1341f, com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public void onIsIntermediateResultExpectedChanged() {
        switch (this.f21516a) {
            case 0:
                C1340e.a(((Z) this.f21518c).j());
                break;
            case 1:
                g0 g0Var = (g0) this.f21518c;
                if (g0Var.f21566e.isIntermediateResultExpected()) {
                    g0Var.f21568g.c();
                }
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1341f, com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public void onIsPrefetchChanged() {
        switch (this.f21516a) {
            case 0:
                C1340e.b(((Z) this.f21518c).k());
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1341f, com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public void onPriorityChanged() {
        switch (this.f21516a) {
            case 0:
                C1340e.c(((Z) this.f21518c).l());
                break;
        }
    }

    public X(O o10, l0 l0Var) {
        this.f21516a = 2;
        this.f21517b = o10;
        this.f21518c = l0Var;
    }
}
