package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.QualityInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1351p extends r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g3.c f21608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProgressiveJpegConfig f21609l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351p(C1353s c1353s, Consumer consumer, ProducerContext producerContext, g3.c progressiveJpegParser, ProgressiveJpegConfig progressiveJpegConfig, boolean z3, int i7) {
        super(c1353s, consumer, producerContext, z3, i7);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(progressiveJpegParser, "progressiveJpegParser");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        this.f21608k = progressiveJpegParser;
        this.f21609l = progressiveJpegConfig;
        this.f21618i = 0;
    }

    @Override // com.facebook.imagepipeline.producers.r
    public final int j(p109h3.e encodedImage) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        return this.f21608k.f36847f;
    }

    @Override // com.facebook.imagepipeline.producers.r
    public final QualityInfo k() {
        QualityInfo qualityInfo = this.f21609l.getQualityInfo(this.f21608k.f36846e);
        Intrinsics.checkNotNullExpressionValue(qualityInfo, "getQualityInfo(...)");
        return qualityInfo;
    }

    @Override // com.facebook.imagepipeline.producers.r
    public final synchronized boolean q(p109h3.e eVar, int i7) {
        if (eVar == null) {
            return false;
        }
        try {
            boolean zE = this.f21617h.e(eVar, i7);
            if (AbstractC1338c.b(i7) || AbstractC1338c.h(i7, 8)) {
                if (!AbstractC1338c.h(i7, 4) && p109h3.e.j(eVar)) {
                    eVar.k();
                    if (eVar.f37275b == W2.c.f10530a) {
                        if (!this.f21608k.b(eVar)) {
                            return false;
                        }
                        int i10 = this.f21608k.f36846e;
                        int i11 = this.f21618i;
                        if (i10 <= i11) {
                            return false;
                        }
                        if (i10 < this.f21609l.getNextScanNumberToDecode(i11) && !this.f21608k.f36848g) {
                            return false;
                        }
                        this.f21618i = i10;
                    }
                }
            }
            return zE;
        } catch (Throwable th) {
            throw th;
        }
    }
}
