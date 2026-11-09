package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ProducerListener2 f21508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ProducerContext f21509g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.facebook.imagepipeline.request.d f21510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f21511j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W f21512o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w3, Consumer consumer, ProducerListener2 producerListener2, ProducerContext producerContext, ProducerListener2 producerListener3, ProducerContext producerContext2, com.facebook.imagepipeline.request.d dVar, CancellationSignal cancellationSignal) {
        super(consumer, producerListener2, producerContext, "LocalThumbnailBitmapSdk29Producer");
        this.f21512o = w3;
        this.f21508f = producerListener3;
        this.f21509g = producerContext2;
        this.f21510i = dVar;
        this.f21511j = cancellationSignal;
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final void b(Object obj) {
        CloseableReference.d((CloseableReference) obj);
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final Map c(Object obj) {
        return p213o2.d.a("createdThumbnail", String.valueOf(((CloseableReference) obj) != null));
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final Object d() throws IOException {
        String strA;
        Bitmap bitmapLoadThumbnail;
        ContentResolver contentResolver = (ContentResolver) this.f21512o.f21515c;
        com.facebook.imagepipeline.request.d dVar = this.f21510i;
        Size size = new Size(dVar.getPreferredWidth(), dVar.getPreferredHeight());
        try {
            strA = p333w2.a.a(contentResolver, dVar.getSourceUri());
        } catch (IllegalArgumentException unused) {
            strA = null;
        }
        CancellationSignal cancellationSignal = this.f21511j;
        if (strA != null) {
            String strA2 = p244q2.a.a(strA);
            bitmapLoadThumbnail = strA2 != null ? kotlin.text.y.m(strA2, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strA), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strA), size, cancellationSignal);
        } else {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = contentResolver.loadThumbnail(dVar.getSourceUri(), size, cancellationSignal);
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(bitmapLoadThumbnail, p121i2.e.a(), p109h3.g.f37290d, 0);
        HasExtraData hasExtraData = this.f21509g;
        hasExtraData.putExtra("image_format", "thumbnail");
        closeableStaticBitmapOf.putExtras(hasExtraData.getExtras());
        return CloseableReference.i(closeableStaticBitmapOf);
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final void e() {
        super.e();
        this.f21511j.cancel();
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final void f(Exception exc) {
        super.f(exc);
        ProducerContext producerContext = this.f21509g;
        this.f21508f.onUltimateProducerReached(producerContext, "LocalThumbnailBitmapSdk29Producer", false);
        producerContext.putOriginExtra(ImagesContract.LOCAL, "thumbnail_bitmap");
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final void g(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        super.g(closeableReference);
        boolean z3 = closeableReference != null;
        ProducerListener2 producerListener2 = this.f21508f;
        ProducerContext producerContext = this.f21509g;
        producerListener2.onUltimateProducerReached(producerContext, "LocalThumbnailBitmapSdk29Producer", z3);
        producerContext.putOriginExtra(ImagesContract.LOCAL, "thumbnail_bitmap");
    }
}
