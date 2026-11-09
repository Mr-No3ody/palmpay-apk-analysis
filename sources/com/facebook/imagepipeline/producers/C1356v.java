package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1356v extends AbstractC1341f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21637b;

    public /* synthetic */ C1356v(Object obj, int i7) {
        this.f21636a = i7;
        this.f21637b = obj;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public final void onCancellationRequested() {
        switch (this.f21636a) {
            case 0:
                ((AtomicBoolean) this.f21637b).set(true);
                break;
            case 1:
                ((M) this.f21637b).a();
                break;
            case 2:
                ((O) this.f21637b).a();
                break;
            case 3:
                ((V) this.f21637b).a();
                break;
            case 4:
                ((O) this.f21637b).a();
                break;
            case 5:
                c0 c0Var = (c0) this.f21637b;
                if (c0Var.j()) {
                    c0Var.f21631b.onCancellation();
                }
                break;
            default:
                d0 d0Var = (d0) this.f21637b;
                if (d0Var.i()) {
                    d0Var.f21631b.onCancellation();
                }
                break;
        }
    }
}
