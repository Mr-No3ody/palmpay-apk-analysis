package com.facebook.imagepipeline.producers;

import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1349n {
    public /* synthetic */ C1349n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTooBig(p109h3.e eVar, com.facebook.imagepipeline.common.c cVar) {
        eVar.k();
        long j6 = eVar.f37278e;
        eVar.k();
        return (j6 * ((long) eVar.f37279f)) * ((long) BitmapUtil.getPixelSizeForBitmapConfig(cVar.f21425a)) > 104857600;
    }

    private C1349n() {
    }
}
