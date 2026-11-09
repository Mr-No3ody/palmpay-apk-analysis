package com.facebook.react.modules.fresco;

import com.facebook.imagepipeline.request.d;
import com.facebook.imagepipeline.request.e;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;", "Lcom/facebook/imagepipeline/request/d;", "Lcom/facebook/imagepipeline/request/e;", "builder", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "cacheControl", "<init>", "(Lcom/facebook/imagepipeline/request/e;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)V", "Lcom/facebook/react/bridge/ReadableMap;", "getHeaders$ReactAndroid_release", "()Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "getCacheControl$ReactAndroid_release", "()Lcom/facebook/react/modules/fresco/ImageCacheControl;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNetworkImageRequest extends d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ImageCacheControl cacheControl;

    @Nullable
    private final ReadableMap headers;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/e;", "builder", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "cacheControl", "Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;", "fromBuilderWithHeaders", "(Lcom/facebook/imagepipeline/request/e;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ReactNetworkImageRequest fromBuilderWithHeaders$default(Companion companion, e eVar, ReadableMap readableMap, ImageCacheControl imageCacheControl, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                imageCacheControl = ImageCacheControl.DEFAULT;
            }
            return companion.fromBuilderWithHeaders(eVar, readableMap, imageCacheControl);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final ReactNetworkImageRequest fromBuilderWithHeaders(@NotNull e builder, @Nullable ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return fromBuilderWithHeaders$default(this, builder, readableMap, null, 4, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final ReactNetworkImageRequest fromBuilderWithHeaders(@NotNull e builder, @Nullable ReadableMap headers, @NotNull ImageCacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            return new ReactNetworkImageRequest(builder, headers, cacheControl, null);
        }
    }

    public /* synthetic */ ReactNetworkImageRequest(e eVar, ReadableMap readableMap, ImageCacheControl imageCacheControl, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, readableMap, imageCacheControl);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final ReactNetworkImageRequest fromBuilderWithHeaders(@NotNull e eVar, @Nullable ReadableMap readableMap) {
        return INSTANCE.fromBuilderWithHeaders(eVar, readableMap);
    }

    @NotNull
    /* JADX INFO: renamed from: getCacheControl$ReactAndroid_release, reason: from getter */
    public final ImageCacheControl getCacheControl() {
        return this.cacheControl;
    }

    @Nullable
    /* JADX INFO: renamed from: getHeaders$ReactAndroid_release, reason: from getter */
    public final ReadableMap getHeaders() {
        return this.headers;
    }

    private ReactNetworkImageRequest(e eVar, ReadableMap readableMap, ImageCacheControl imageCacheControl) {
        super(eVar);
        this.headers = readableMap;
        this.cacheControl = imageCacheControl;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final ReactNetworkImageRequest fromBuilderWithHeaders(@NotNull e eVar, @Nullable ReadableMap readableMap, @NotNull ImageCacheControl imageCacheControl) {
        return INSTANCE.fromBuilderWithHeaders(eVar, readableMap, imageCacheControl);
    }
}
