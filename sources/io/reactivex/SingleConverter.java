package io.reactivex;

import df.j;
import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface SingleConverter<T, R> {
    @NonNull
    R apply(@NonNull j jVar);
}
