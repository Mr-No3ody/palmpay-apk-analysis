package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.QualityInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1350o extends r {
    @Override // com.facebook.imagepipeline.producers.r
    public final int j(p109h3.e encodedImage) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        return encodedImage.f();
    }

    @Override // com.facebook.imagepipeline.producers.r
    public final QualityInfo k() {
        p109h3.g gVar = new p109h3.g();
        gVar.f37291a = 0;
        gVar.f37292b = false;
        gVar.f37293c = false;
        Intrinsics.checkNotNullExpressionValue(gVar, "of(...)");
        return gVar;
    }

    @Override // com.facebook.imagepipeline.producers.r
    public final synchronized boolean q(p109h3.e eVar, int i7) {
        return AbstractC1338c.b(i7) ? false : this.f21617h.e(eVar, i7);
    }
}
