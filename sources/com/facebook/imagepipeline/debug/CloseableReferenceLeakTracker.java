package com.facebook.imagepipeline.debug;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0010J)\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/facebook/imagepipeline/debug/CloseableReferenceLeakTracker;", "", "Ls2/a;", "reference", "", "stacktrace", "", "trackCloseableReferenceLeak", "(Ls2/a;Ljava/lang/Throwable;)V", "Lcom/facebook/imagepipeline/debug/CloseableReferenceLeakTracker$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/facebook/imagepipeline/debug/CloseableReferenceLeakTracker$Listener;)V", "", "isSet", "()Z", "Listener", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CloseableReferenceLeakTracker {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/imagepipeline/debug/CloseableReferenceLeakTracker$Listener;", "", "Ls2/a;", "reference", "", "stacktrace", "", "onCloseableReferenceLeak", "(Ls2/a;Ljava/lang/Throwable;)V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onCloseableReferenceLeak(@NotNull p277s2.a reference, @Nullable Throwable stacktrace);
    }

    boolean isSet();

    void setListener(@Nullable Listener listener);

    void trackCloseableReferenceLeak(@NotNull p277s2.a reference, @Nullable Throwable stacktrace);
}
