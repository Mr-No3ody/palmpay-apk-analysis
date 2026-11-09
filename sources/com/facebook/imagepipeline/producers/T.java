package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class T {
    public /* synthetic */ T(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getResourceId(com.facebook.imagepipeline.request.d dVar) {
        String path = dVar.getSourceUri().getPath();
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strSubstring = path.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Integer.parseInt(strSubstring);
    }

    private T() {
    }
}
