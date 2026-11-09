package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1337b implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21533b;

    public /* synthetic */ C1337b(Producer producer, int i7) {
        this.f21532a = i7;
        this.f21533b = producer;
    }

    public boolean a(int i7, Consumer consumer, ProducerContext producerContext) {
        ThumbnailProducer[] thumbnailProducerArr;
        com.facebook.imagepipeline.common.g resizeOptions = producerContext.getImageRequest().getResizeOptions();
        while (true) {
            thumbnailProducerArr = (ThumbnailProducer[]) this.f21533b;
            if (i7 >= thumbnailProducerArr.length) {
                i7 = -1;
                break;
            }
            if (thumbnailProducerArr[i7].canProvideImageForSize(resizeOptions)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            return false;
        }
        thumbnailProducerArr[i7].produceResults(new o0(this, consumer, producerContext, i7), producerContext);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext context) {
        switch (this.f21532a) {
            case 0:
                ((Producer) this.f21533b).produceResults(new C1336a(consumer, 0), context);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                ((Producer) this.f21533b).produceResults(new C1336a(consumer, 2), context);
                break;
            case 2:
                ((Producer) this.f21533b).produceResults(new C1336a(consumer, 3), context);
                break;
            default:
                if (context.getImageRequest().getResizeOptions() == null) {
                    consumer.onNewResult(null, 1);
                } else if (!a(0, consumer, context)) {
                    consumer.onNewResult(null, 1);
                }
                break;
        }
    }

    public C1337b(Producer inputProducer) {
        this.f21532a = 1;
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f21533b = inputProducer;
    }

    public C1337b(ThumbnailProducer[] thumbnailProducerArr) {
        this.f21532a = 3;
        ThumbnailProducer[] thumbnailProducerArr2 = thumbnailProducerArr;
        this.f21533b = thumbnailProducerArr2;
        p213o2.e.d(0, thumbnailProducerArr2.length);
    }
}
