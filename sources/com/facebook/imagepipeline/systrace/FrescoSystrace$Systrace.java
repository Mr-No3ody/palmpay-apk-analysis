package com.facebook.imagepipeline.systrace;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/facebook/imagepipeline/systrace/FrescoSystrace$Systrace", "", "", "name", "", "beginSection", "(Ljava/lang/String;)V", "Lcom/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder;", "beginSectionWithArgs", "(Ljava/lang/String;)Lcom/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder;", "endSection", "()V", "", "isTracing", "()Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FrescoSystrace$Systrace {
    void beginSection(@NotNull String name);

    @NotNull
    FrescoSystrace$ArgsBuilder beginSectionWithArgs(@NotNull String name);

    void endSection();

    boolean isTracing();
}
