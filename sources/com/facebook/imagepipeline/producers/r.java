package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.HasBitmap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.QualityInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f21612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProducerListener2 f21614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.facebook.imagepipeline.common.c f21615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G f21617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1353s f21619j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1353s c1353s, Consumer consumer, ProducerContext producerContext, boolean z3, int i7) {
        super(consumer);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        this.f21619j = c1353s;
        this.f21612c = producerContext;
        this.f21613d = "ProgressiveDecoder";
        this.f21614e = producerContext.getProducerListener();
        com.facebook.imagepipeline.common.c imageDecodeOptions = producerContext.getImageRequest().getImageDecodeOptions();
        Intrinsics.checkNotNullExpressionValue(imageDecodeOptions, "getImageDecodeOptions(...)");
        this.f21615f = imageDecodeOptions;
        androidx.camera.camera2.internal.V v3 = new androidx.camera.camera2.internal.V(i7, this, c1353s);
        imageDecodeOptions.getClass();
        this.f21617h = new G(c1353s.f21622b, v3);
        producerContext.addCallbacks(new C1352q(this, z3));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void c() {
        l();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void d(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        m(t);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        p109h3.e eVar = (p109h3.e) obj;
        p181m3.a.a();
        boolean zA = AbstractC1338c.a(i7);
        ProducerContext producerContext = this.f21612c;
        if (zA) {
            if (eVar == null) {
                Intrinsics.c(producerContext.getExtra("cached_value_found"), Boolean.TRUE);
                producerContext.getImagePipelineConfig().getExperiments().getClass();
                m(new U2.B("Encoded image is null.", 12));
                return;
            } else if (!eVar.i()) {
                m(new U2.B("Encoded image is not valid.", 12));
                return;
            }
        }
        if (q(eVar, i7)) {
            boolean zH = AbstractC1338c.h(i7, 4);
            if (zA || zH || producerContext.isIntermediateResultExpected()) {
                this.f21617h.c();
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void f(float f10) {
        super.f(f10 * 0.99f);
    }

    public final p213o2.d i(CloseableImage closeableImage, long j6, QualityInfo qualityInfo, boolean z3, String str, String str2, String str3, String str4) {
        Map<String, Object> extras;
        Object obj;
        String string = null;
        if (!this.f21614e.requiresExtraMap(this.f21612c, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j6);
        String strValueOf2 = String.valueOf(qualityInfo.isOfGoodEnoughQuality());
        String strValueOf3 = String.valueOf(z3);
        if (closeableImage != null && (extras = closeableImage.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
            string = obj.toString();
        }
        if (!(closeableImage instanceof CloseableStaticBitmap)) {
            String str5 = string;
            HashMap map = new HashMap(7);
            map.put("queueTime", strValueOf);
            map.put("hasGoodQuality", strValueOf2);
            map.put("isFinal", strValueOf3);
            map.put("encodedImageSize", str2);
            map.put("imageFormat", str);
            map.put("requestedImageSize", str3);
            map.put("sampleSize", str4);
            if (str5 != null) {
                map.put("non_fatal_decode_error", str5);
            }
            return new p213o2.d(map);
        }
        String str6 = string;
        Bitmap underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap();
        Intrinsics.checkNotNullExpressionValue(underlyingBitmap, "getUnderlyingBitmap(...)");
        String str7 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
        HashMap map2 = new HashMap(8);
        map2.put("bitmapSize", str7);
        map2.put("queueTime", strValueOf);
        map2.put("hasGoodQuality", strValueOf2);
        map2.put("isFinal", strValueOf3);
        map2.put("encodedImageSize", str2);
        map2.put("imageFormat", str);
        map2.put("requestedImageSize", str3);
        map2.put("sampleSize", str4);
        int byteCount = underlyingBitmap.getByteCount();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(byteCount);
        map2.put("byteCount", sb2.toString());
        if (str6 != null) {
            map2.put("non_fatal_decode_error", str6);
        }
        return new p213o2.d(map2);
    }

    public abstract int j(p109h3.e eVar);

    public abstract QualityInfo k();

    public final void l() {
        o(true);
        this.f21631b.onCancellation();
    }

    public final void m(Throwable th) {
        o(true);
        this.f21631b.onFailure(th);
    }

    public final void n(CloseableImage closeableImage, int i7) {
        CloseableImage closeableImage2 = closeableImage;
        p061e3.a aVar = this.f21619j.f21630j.f36000a;
        com.facebook.common.references.b bVar = null;
        if (closeableImage2 != null) {
            org.sufficientlysecure.htmltextview.l lVar = CloseableReference.f21216e;
            Throwable th = aVar.f35999a.isSet() ? new Throwable() : null;
            if (!(closeableImage2 instanceof Bitmap)) {
                boolean z3 = closeableImage2 instanceof HasBitmap;
            }
            bVar = new com.facebook.common.references.b(closeableImage2, lVar, aVar, th, true);
        }
        try {
            o(AbstractC1338c.a(i7));
            this.f21631b.onNewResult(bVar, i7);
        } finally {
            CloseableReference.d(bVar);
        }
    }

    public final void o(boolean z3) {
        p109h3.e eVar;
        synchronized (this) {
            if (z3) {
                if (!this.f21616g) {
                    this.f21631b.onProgressUpdate(1.0f);
                    this.f21616g = true;
                    Unit unit = Unit.f38893a;
                    G g7 = this.f21617h;
                    synchronized (g7) {
                        eVar = g7.f21481e;
                        g7.f21481e = null;
                        g7.f21482f = 0;
                    }
                    p109h3.e.b(eVar);
                }
            }
        }
    }

    public final void p(p109h3.e eVar, CloseableImage closeableImage, int i7) {
        eVar.k();
        Integer numValueOf = Integer.valueOf(eVar.f37278e);
        HasExtraData hasExtraData = this.f21612c;
        hasExtraData.putExtra("encoded_width", numValueOf);
        eVar.k();
        hasExtraData.putExtra("encoded_height", Integer.valueOf(eVar.f37279f));
        hasExtraData.putExtra("encoded_size", Integer.valueOf(eVar.f()));
        eVar.k();
        hasExtraData.putExtra("image_color_space", eVar.f37283o);
        if (closeableImage instanceof CloseableBitmap) {
            hasExtraData.putExtra("bitmap_config", String.valueOf(((CloseableBitmap) closeableImage).getUnderlyingBitmap().getConfig()));
        }
        if (closeableImage != null) {
            closeableImage.putExtras(hasExtraData.getExtras());
        }
        hasExtraData.putExtra("last_scan_num", Integer.valueOf(i7));
    }

    public abstract boolean q(p109h3.e eVar, int i7);
}
