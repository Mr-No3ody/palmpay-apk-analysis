package io.reactivex;

import df.d;
import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface ObservableTransformer<Upstream, Downstream> {
    @NonNull
    ObservableSource<Downstream> apply(@NonNull d<Upstream> dVar);
}
