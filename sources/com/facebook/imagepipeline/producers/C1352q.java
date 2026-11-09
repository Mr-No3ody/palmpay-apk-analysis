package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1352q extends AbstractC1341f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f21610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21611b;

    public C1352q(r rVar, boolean z3) {
        this.f21610a = rVar;
        this.f21611b = z3;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public final void onCancellationRequested() {
        if (this.f21611b) {
            this.f21610a.l();
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1341f, com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public final void onIsIntermediateResultExpectedChanged() {
        r rVar = this.f21610a;
        if (rVar.f21612c.isIntermediateResultExpected()) {
            rVar.f21617h.c();
        }
    }
}
