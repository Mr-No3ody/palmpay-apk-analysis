package com.facebook.imagepipeline.instrumentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"com/facebook/imagepipeline/instrumentation/FrescoInstrumenter$Instrumenter", "", "", "tag", "onBeforeSubmitWork", "(Ljava/lang/String;)Ljava/lang/Object;", "token", "onBeginWork", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "", "onEndWork", "(Ljava/lang/Object;)V", "", "th", "markFailure", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Ljava/lang/Runnable;", "runnable", "decorateRunnable", "(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;", "", "isTracing", "()Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FrescoInstrumenter$Instrumenter {
    @Nullable
    Runnable decorateRunnable(@NotNull Runnable runnable, @NotNull String tag);

    boolean isTracing();

    void markFailure(@NotNull Object token, @NotNull Throwable th);

    @Nullable
    Object onBeforeSubmitWork(@NotNull String tag);

    @Nullable
    Object onBeginWork(@NotNull Object token, @Nullable String tag);

    void onEndWork(@NotNull Object token);
}
