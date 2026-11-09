package com.facebook.imagepipeline.producers;

import android.os.CancellationSignal;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21515c;

    public /* synthetic */ W(int i7, Object obj, Object obj2) {
        this.f21513a = i7;
        this.f21514b = obj;
        this.f21515c = obj2;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        switch (this.f21513a) {
            case 0:
                ProducerListener2 producerListener = producerContext.getProducerListener();
                com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
                producerContext.putOriginExtra(ImagesContract.LOCAL, "thumbnail_bitmap");
                V v3 = new V(this, consumer, producerListener, producerContext, producerListener, producerContext, imageRequest, new CancellationSignal());
                producerContext.addCallbacks(new C1356v(v3, 3));
                ((Executor) this.f21514b).execute(v3);
                break;
            case 1:
                ProducerListener2 producerListener2 = producerContext.getProducerListener();
                com.facebook.imagepipeline.request.d imageRequest2 = producerContext.getImageRequest();
                producerContext.putOriginExtra(ImagesContract.LOCAL, "video");
                O o10 = new O(this, consumer, producerListener2, producerContext, producerListener2, producerContext, imageRequest2);
                producerContext.addCallbacks(new C1356v(o10, 4));
                ((Executor) this.f21514b).execute(o10);
                break;
            default:
                ((h0) this.f21514b).produceResults(new C1347l(this, consumer, producerContext), producerContext);
                break;
        }
    }
}
