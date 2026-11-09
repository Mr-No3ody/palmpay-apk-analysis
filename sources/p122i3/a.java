package p122i3;

import com.facebook.imagepipeline.listener.RequestListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements RequestListener {
    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onUltimateProducerReached(@NotNull String requestId, @NotNull String producerName, boolean z3) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }
}
