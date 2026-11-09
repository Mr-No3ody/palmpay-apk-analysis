package com.facebook.imagepipeline.systrace;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\fJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000fH&¢\u0006\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"com/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder", "", "", "flush", "()V", "", "key", "value", "Lcom/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder;", "arg", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder;", "", "(Ljava/lang/String;I)Lcom/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder;", "", "(Ljava/lang/String;J)Lcom/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder;", "", "(Ljava/lang/String;D)Lcom/facebook/imagepipeline/systrace/FrescoSystrace$ArgsBuilder;", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FrescoSystrace$ArgsBuilder {
    @NotNull
    FrescoSystrace$ArgsBuilder arg(@NotNull String key, double value);

    @NotNull
    FrescoSystrace$ArgsBuilder arg(@NotNull String key, int value);

    @NotNull
    FrescoSystrace$ArgsBuilder arg(@NotNull String key, long value);

    @NotNull
    FrescoSystrace$ArgsBuilder arg(@NotNull String key, @NotNull Object value);

    void flush();
}
