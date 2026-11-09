package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    public /* synthetic */ H(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAssetName(com.facebook.imagepipeline.request.d dVar) {
        String path = dVar.getSourceUri().getPath();
        Intrinsics.e(path);
        String strSubstring = path.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private H() {
    }
}
