package io.reactivex;

import df.b;
import io.reactivex.annotations.NonNull;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    Publisher<Downstream> apply(@NonNull b bVar);
}
