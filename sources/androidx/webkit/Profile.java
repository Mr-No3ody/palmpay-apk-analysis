package androidx.webkit;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.UiThread;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface Profile {

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn(level = p192n.b.f39798b)
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalAddQuicHints {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn(level = p192n.b.f39798b)
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalOriginMatchedHeader {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn(level = p192n.b.f39798b)
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalPreconnect {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn(level = p192n.b.f39798b)
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrefetch {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn(level = p192n.b.f39798b)
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalWarmUpRendererProcess {
    }

    @UiThread
    default void addCustomHeader(a aVar) {
    }

    @ExperimentalAddQuicHints
    @UiThread
    default void addQuicHints(Set<String> set) {
        throw new UnsupportedOperationException("Profile#addQuicHints is not implemented.");
    }

    @UiThread
    default void clearAllCustomHeaders() {
    }

    @ExperimentalOriginMatchedHeader
    @UiThread
    void clearAllOriginMatchedHeaders();

    @UiThread
    default void clearCustomHeader(String str) {
    }

    @ExperimentalOriginMatchedHeader
    @UiThread
    void clearOriginMatchedHeader(String str);

    @ExperimentalUrlPrefetch
    @UiThread
    void clearPrefetchAsync(String str, Executor executor, OutcomeReceiverCompat<Void, c> outcomeReceiverCompat);

    @AnyThread
    CookieManager getCookieManager();

    @RequiresApi(api = 24)
    @UiThread
    default Set<a> getCustomHeaders() {
        return Collections.EMPTY_SET;
    }

    @AnyThread
    GeolocationPermissions getGeolocationPermissions();

    @AnyThread
    String getName();

    @AnyThread
    ServiceWorkerController getServiceWorkerController();

    @AnyThread
    WebStorage getWebStorage();

    @UiThread
    default boolean hasCustomHeader(String str) {
        return false;
    }

    @ExperimentalOriginMatchedHeader
    @UiThread
    boolean hasOriginMatchedHeader(String str);

    @ExperimentalPreconnect
    @UiThread
    default void preconnect(String str) {
        throw new UnsupportedOperationException("Profile#preconnect is not implemented.");
    }

    @ExperimentalUrlPrefetch
    @AnyThread
    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, OutcomeReceiverCompat<Void, c> outcomeReceiverCompat);

    @ExperimentalUrlPrefetch
    @AnyThread
    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, g gVar, OutcomeReceiverCompat<Void, c> outcomeReceiverCompat);

    @ExperimentalOriginMatchedHeader
    @UiThread
    void setOriginMatchedHeader(String str, String str2, Set<String> set);

    @ExperimentalUrlPrefetch
    @UiThread
    void setSpeculativeLoadingConfig(f fVar);

    @ExperimentalWarmUpRendererProcess
    @UiThread
    void warmUpRendererProcess();

    @UiThread
    default void clearCustomHeader(String str, String str2) {
    }

    @RequiresApi(api = 24)
    @UiThread
    default Set<a> getCustomHeaders(String str) {
        return Collections.EMPTY_SET;
    }

    @RequiresApi(api = 24)
    @UiThread
    default Set<a> getCustomHeaders(String str, String str2) {
        return Collections.EMPTY_SET;
    }
}
