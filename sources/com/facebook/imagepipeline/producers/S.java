package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class S extends P {
    static {
        new Q(null);
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final p109h3.e b(com.facebook.imagepipeline.request.d imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return a((int) imageRequest.getSourceFile().length(), new FileInputStream(imageRequest.getSourceFile().toString()));
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final String c() {
        return "LocalFileFetchProducer";
    }
}
