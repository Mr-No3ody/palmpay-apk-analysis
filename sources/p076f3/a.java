package p076f3;

import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.AbstractC1338c;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.request.HasImageRequest;
import com.facebook.imagepipeline.request.d;
import kotlin.jvm.internal.Intrinsics;
import p360y2.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b implements HasImageRequest {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f36378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RequestListener2 f36379i;

    public a(Producer producer, i0 settableProducerContext, RequestListener2 requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f36378h = settableProducerContext;
        this.f36379i = requestListener;
        p181m3.a.a();
        this.f44035a = settableProducerContext.f21557g;
        p181m3.a.a();
        requestListener.onRequestStart(settableProducerContext);
        p181m3.a.a();
        producer.produceResults(new Y(this, 1), settableProducerContext);
    }

    @Override // p360y2.b, com.facebook.datasource.DataSource
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (isFinished()) {
            return true;
        }
        RequestListener2 requestListener2 = this.f36379i;
        i0 i0Var = this.f36378h;
        requestListener2.onRequestCancellation(i0Var);
        i0Var.d();
        return true;
    }

    public void g(Object obj, int i7, ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean zA = AbstractC1338c.a(i7);
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        if (e(obj, zA, producerContext.getExtras()) && zA) {
            this.f36379i.onRequestSuccess(this.f36378h);
        }
    }

    @Override // com.facebook.imagepipeline.request.HasImageRequest
    public final d getImageRequest() {
        return this.f36378h.f21551a;
    }
}
