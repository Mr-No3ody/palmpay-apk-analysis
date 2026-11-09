package androidx.webkit;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes.dex */
@Profile.ExperimentalUrlPrefetch
public interface OutcomeReceiverCompat<T, E extends Throwable> {
    default void onError(E e10) {
    }

    void onResult(T t);
}
