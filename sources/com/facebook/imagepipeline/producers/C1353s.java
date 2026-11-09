package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.ByteArrayPool;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1353s implements Producer {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1349n f21620k = new C1349n(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayPool f21621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f21622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageDecoder f21623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressiveJpegConfig f21624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p061e3.i f21625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Producer f21628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p061e3.b f21630j;

    public C1353s(ByteArrayPool byteArrayPool, Executor executor, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, p061e3.i downsampleMode, boolean z3, boolean z8, Producer inputProducer, int i7, p061e3.b closeableReferenceFactory) {
        Q2.a recoverFromDecoderOOM = p213o2.e.f40019b;
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        Intrinsics.checkNotNullParameter(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.f21621a = byteArrayPool;
        this.f21622b = executor;
        this.f21623c = imageDecoder;
        this.f21624d = progressiveJpegConfig;
        this.f21625e = downsampleMode;
        this.f21626f = z3;
        this.f21627g = z8;
        this.f21628h = inputProducer;
        this.f21629i = i7;
        this.f21630j = closeableReferenceFactory;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        C1353s c1353s;
        ProducerContext producerContext2;
        Consumer c1351p;
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "context");
        p181m3.a.a();
        com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
        if (p333w2.a.c(imageRequest.getSourceUri()) || com.facebook.imagepipeline.request.e.c(imageRequest.getSourceUri())) {
            c1353s = this;
            producerContext2 = producerContext;
            c1351p = new C1351p(c1353s, consumer, producerContext, new g3.c(this.f21621a), c1353s.f21624d, c1353s.f21627g, c1353s.f21629i);
        } else {
            boolean z3 = this.f21627g;
            int i7 = this.f21629i;
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            producerContext2 = producerContext;
            c1351p = new C1350o(this, consumer, producerContext2, z3, i7);
            c1353s = this;
        }
        c1353s.f21628h.produceResults(c1351p, producerContext2);
    }
}
