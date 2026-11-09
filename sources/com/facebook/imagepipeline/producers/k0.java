package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public /* synthetic */ k0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInstrumentationTag(ProducerContext producerContext) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRunImmediately(ProducerContext producerContext) {
        producerContext.getImagePipelineConfig().getExperiments().getClass();
        return false;
    }

    private k0() {
    }
}
