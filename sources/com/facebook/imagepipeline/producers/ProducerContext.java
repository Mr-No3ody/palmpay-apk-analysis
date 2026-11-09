package com.facebook.imagepipeline.producers;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.core.ImagePipelineConfigInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010$R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/facebook/imagepipeline/producers/ProducerContext;", "Lcom/facebook/fresco/middleware/HasExtraData;", "Lcom/facebook/imagepipeline/producers/ProducerContextCallbacks;", "callbacks", "", "addCallbacks", "(Lcom/facebook/imagepipeline/producers/ProducerContextCallbacks;)V", "", "origin", "subcategory", "putOriginExtra", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "Lcom/facebook/imagepipeline/request/d;", "getImageRequest", "()Lcom/facebook/imagepipeline/request/d;", "imageRequest", "getId", "()Ljava/lang/String;", "id", "getUiComponentId", "uiComponentId", "Lcom/facebook/imagepipeline/producers/ProducerListener2;", "getProducerListener", "()Lcom/facebook/imagepipeline/producers/ProducerListener2;", "producerListener", "", "getCallerContext", "()Ljava/lang/Object;", "callerContext", "Lcom/facebook/imagepipeline/request/c;", "getLowestPermittedRequestLevel", "()Lcom/facebook/imagepipeline/request/c;", "lowestPermittedRequestLevel", "", "isPrefetch", "()Z", "Lcom/facebook/imagepipeline/common/e;", "getPriority", "()Lcom/facebook/imagepipeline/common/e;", "priority", "isIntermediateResultExpected", "Lcom/facebook/imagepipeline/core/ImagePipelineConfigInterface;", "getImagePipelineConfig", "()Lcom/facebook/imagepipeline/core/ImagePipelineConfigInterface;", "imagePipelineConfig", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProducerContext extends HasExtraData {
    void addCallbacks(@NotNull ProducerContextCallbacks callbacks);

    @NotNull
    Object getCallerContext();

    @NotNull
    String getId();

    @NotNull
    ImagePipelineConfigInterface getImagePipelineConfig();

    @NotNull
    com.facebook.imagepipeline.request.d getImageRequest();

    @NotNull
    com.facebook.imagepipeline.request.c getLowestPermittedRequestLevel();

    @NotNull
    com.facebook.imagepipeline.common.e getPriority();

    @NotNull
    ProducerListener2 getProducerListener();

    @Nullable
    String getUiComponentId();

    boolean isIntermediateResultExpected();

    boolean isPrefetch();

    void putOriginExtra(@Nullable String origin);

    void putOriginExtra(@Nullable String origin, @Nullable String subcategory);
}
