package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f21604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.facebook.imagepipeline.common.g f21606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1337b f21607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(C1337b c1337b, Consumer consumer, ProducerContext producerContext, int i7) {
        super(consumer);
        this.f21607f = c1337b;
        this.f21604c = producerContext;
        this.f21605d = i7;
        this.f21606e = producerContext.getImageRequest().getResizeOptions();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void d(Throwable th) {
        int i7 = this.f21605d + 1;
        C1337b c1337b = this.f21607f;
        Consumer consumer = this.f21631b;
        if (c1337b.a(i7, consumer, this.f21604c)) {
            return;
        }
        consumer.onFailure(th);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        p109h3.e eVar = (p109h3.e) obj;
        Consumer consumer = this.f21631b;
        if (eVar != null && (AbstractC1338c.b(i7) || io.fastkv.n.t(eVar, this.f21606e))) {
            consumer.onNewResult(eVar, i7);
            return;
        }
        if (AbstractC1338c.a(i7)) {
            p109h3.e.b(eVar);
            if (this.f21607f.a(this.f21605d + 1, consumer, this.f21604c)) {
                return;
            }
            consumer.onNewResult(null, 1);
        }
    }
}
