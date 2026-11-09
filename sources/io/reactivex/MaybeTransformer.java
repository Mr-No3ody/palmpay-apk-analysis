package io.reactivex;

import df.c;
import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface MaybeTransformer<Upstream, Downstream> {
    @NonNull
    MaybeSource<Downstream> apply(@NonNull c cVar);
}
