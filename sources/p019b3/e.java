package p019b3;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.common.a;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.producers.AbstractC1339d;
import com.facebook.imagepipeline.producers.AbstractC1360z;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1943k;
import okhttp3.Call;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractC1339d {

    @NotNull
    private static final a Companion = new a(null);

    @NotNull
    private static final String FETCH_TIME = "fetch_time";

    @NotNull
    private static final String IMAGE_SIZE = "image_size";

    @NotNull
    private static final String QUEUE_TIME = "queue_time";

    @NotNull
    private static final String TOTAL_TIME = "total_time";

    @Nullable
    private final C1943k cacheControl;

    @NotNull
    private final Call.Factory callFactory;

    @NotNull
    private final Executor cancellationExecutor;

    public e(U callFactory) {
        Intrinsics.checkNotNullParameter(callFactory, "okHttpClient");
        ExecutorService cancellationExecutor = callFactory.f40653a.b();
        Intrinsics.checkNotNullExpressionValue(cancellationExecutor, "executorService(...)");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
        this.callFactory = callFactory;
        this.cancellationExecutor = cancellationExecutor;
        this.cacheControl = new C1943k(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    }

    public static final void access$handleException(e eVar, Call call, Exception exc, NetworkFetcher.Callback callback) {
        eVar.getClass();
        if (call.isCanceled()) {
            callback.onCancellation();
        } else {
            callback.onFailure(exc);
        }
    }

    public static final IOException access$makeExceptionFromResponse(e eVar, String str, e0 e0Var) {
        eVar.getClass();
        return new IOException(str, g.f18769a.fromResponse(e0Var));
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ AbstractC1360z createFetchState(Consumer consumer, ProducerContext producerContext) {
        return createFetchState((Consumer<p109h3.e>) consumer, producerContext);
    }

    public void fetchWithRequest(@NotNull b fetchState, @NotNull NetworkFetcher.Callback callback, @NotNull Y request) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(request, "request");
        Call callNewCall = this.callFactory.newCall(request);
        fetchState.f21651b.addCallbacks(new c(callNewCall, this));
        FirebasePerfOkHttpClient.enqueue(callNewCall, new d(fetchState, this, callback));
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    @NotNull
    public b createFetchState(@NotNull Consumer<p109h3.e> consumer, @NotNull ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "context");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return new b(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(b fetchState, NetworkFetcher.Callback callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f18761f = SystemClock.elapsedRealtime();
        ProducerContext producerContext = fetchState.f21651b;
        Uri sourceUri = producerContext.getImageRequest().getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getUri(...)");
        try {
            X x3 = new X();
            x3.k(sourceUri.toString());
            x3.d();
            C1943k c1943k = this.cacheControl;
            if (c1943k != null) {
                x3.c(c1943k);
            }
            b bytesRange = producerContext.getImageRequest().getBytesRange();
            if (bytesRange != null) {
                int i7 = bytesRange.f21422a;
                a aVar = b.f21420c;
                String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{aVar.valueOrEmpty(i7), aVar.valueOrEmpty(bytesRange.f21423b)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                x3.a(HttpHeaders.RANGE, str);
            }
            Y yB = x3.b();
            Intrinsics.checkNotNullExpressionValue(yB, "build(...)");
            fetchWithRequest(fetchState, callback, yB);
        } catch (Exception e10) {
            callback.onFailure(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    @Nullable
    public Map<String, String> getExtraMap(@NotNull b fetchState, int i7) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        return G.g(new Pair(QUEUE_TIME, String.valueOf(fetchState.f18762g - fetchState.f18761f)), new Pair(FETCH_TIME, String.valueOf(fetchState.f18763h - fetchState.f18762g)), new Pair(TOTAL_TIME, String.valueOf(fetchState.f18763h - fetchState.f18761f)), new Pair(IMAGE_SIZE, String.valueOf(i7)));
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(@NotNull b fetchState, int i7) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        fetchState.f18763h = SystemClock.elapsedRealtime();
    }
}
