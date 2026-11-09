package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.AbstractC1360z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface NetworkFetcher<FETCH_STATE extends AbstractC1360z> {

    public interface Callback {
        void onCancellation();

        void onFailure(Throwable th);

        void onResponse(InputStream inputStream, int i7) throws IOException;
    }

    FETCH_STATE createFetchState(Consumer<p109h3.e> consumer, ProducerContext producerContext);

    void fetch(FETCH_STATE fetch_state, Callback callback);

    @Nullable
    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i7);

    void onFetchCompletion(FETCH_STATE fetch_state, int i7);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
