package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1347l extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f21594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f21595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347l(W w3, Consumer consumer, ProducerContext producerContext) {
        super(consumer);
        this.f21595d = w3;
        this.f21594c = producerContext;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void d(Throwable th) {
        ((n0) this.f21595d.f21515c).produceResults(this.f21631b, this.f21594c);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        p109h3.e eVar = (p109h3.e) obj;
        ProducerContext producerContext = this.f21594c;
        com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
        boolean zA = AbstractC1338c.a(i7);
        boolean zT = io.fastkv.n.t(eVar, imageRequest.getResizeOptions());
        Consumer consumer = this.f21631b;
        if (eVar != null && (zT || imageRequest.getLocalThumbnailPreviewsEnabled())) {
            if (zA && zT) {
                consumer.onNewResult(eVar, i7);
            } else {
                consumer.onNewResult(eVar, i7 & (-2));
            }
        }
        if (!zA || zT || imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
            return;
        }
        p109h3.e.b(eVar);
        ((n0) this.f21595d.f21515c).produceResults(consumer, producerContext);
    }
}
