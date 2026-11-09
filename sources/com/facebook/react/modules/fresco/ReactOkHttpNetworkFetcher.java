package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.request.d;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.C1943k;
import okhttp3.E;
import okhttp3.F;
import okhttp3.U;
import okhttp3.X;
import org.jetbrains.annotations.NotNull;
import p019b3.b;
import p019b3.e;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher;", "Lb3/e;", "Lokhttp3/U;", "okHttpClient", "<init>", "(Lokhttp3/U;)V", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "", "", "getHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "Lb3/b;", "fetchState", "Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;", "callback", "", RemoteConfigComponent.FETCH_FILE_NAME, "(Lb3/b;Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactOkHttpNetworkFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactOkHttpNetworkFetcher.kt\ncom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class ReactOkHttpNetworkFetcher extends e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCacheControl.FORCE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCacheControl.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactOkHttpNetworkFetcher(@NotNull U okHttpClient) {
        super(okHttpClient);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
    }

    private final Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = readableMap.getString(strNextKey);
            if (string != null) {
                map.put(strNextKey, string);
            }
        }
        return map;
    }

    @Override // p019b3.e, com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(@NotNull b fetchState, @NotNull NetworkFetcher.Callback callback) {
        Map<String, String> mapC;
        boolean z3;
        int i7;
        boolean z8;
        boolean z10;
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f18761f = SystemClock.elapsedRealtime();
        ProducerContext producerContext = fetchState.f21651b;
        Uri sourceUri = producerContext.getImageRequest().getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getUri(...)");
        boolean z11 = false;
        int i10 = -1;
        boolean z12 = true;
        if (producerContext.getImageRequest() instanceof ReactNetworkImageRequest) {
            d imageRequest = producerContext.getImageRequest();
            Intrinsics.f(imageRequest, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            ReactNetworkImageRequest reactNetworkImageRequest = (ReactNetworkImageRequest) imageRequest;
            mapC = getHeaders(reactNetworkImageRequest.getHeaders());
            int i11 = WhenMappings.$EnumSwitchMapping$0[reactNetworkImageRequest.getCacheControl().ordinal()];
            if (i11 == 1) {
                z10 = false;
                z11 = true;
            } else if (i11 == 2) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(timeUnit2, "timeUnit");
                long seconds = timeUnit2.toSeconds(Integer.MAX_VALUE);
                i10 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                z10 = false;
                z12 = false;
            } else if (i11 == 3) {
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(timeUnit4, "timeUnit");
                long seconds2 = timeUnit4.toSeconds(Integer.MAX_VALUE);
                i10 = seconds2 > 2147483647L ? Integer.MAX_VALUE : (int) seconds2;
                z10 = true;
                z12 = false;
            } else {
                if (i11 != 4) {
                    throw new l();
                }
                z10 = false;
            }
            z3 = z10;
            i7 = i10;
            z8 = z11;
        } else {
            mapC = null;
            z3 = false;
            i7 = -1;
            z8 = false;
        }
        E e10 = F.f40566b;
        if (mapC == null) {
            mapC = G.c();
        }
        F fM128deprecated_of = e10.m128deprecated_of(mapC);
        X x3 = new X();
        x3.f(fM128deprecated_of);
        x3.c(new C1943k(z8, z12, -1, -1, false, false, false, i7, -1, z3, false, false, null));
        String string = sourceUri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        x3.k(string);
        x3.d();
        fetchWithRequest(fetchState, callback, x3.b());
    }
}
