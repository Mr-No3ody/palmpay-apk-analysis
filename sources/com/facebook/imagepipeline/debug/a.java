package com.facebook.imagepipeline.debug;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CloseableReferenceLeakTracker {
    @Override // com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker
    public final boolean isSet() {
        return false;
    }

    @Override // com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker
    public final void setListener(CloseableReferenceLeakTracker.Listener listener) {
    }

    @Override // com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker
    public final void trackCloseableReferenceLeak(p277s2.a reference, Throwable th) {
        Intrinsics.checkNotNullParameter(reference, "reference");
    }
}
