package com.facebook.react.views.imagehelper;

import android.net.Uri;
import com.facebook.common.internal.Predicate;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.request.b;
import com.facebook.react.modules.fresco.ImageCacheControl;
import com.transsnet.palmpay.core.ui.activity.Z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p061e3.k;
import p061e3.s;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/imagehelper/MultiSourceHelper;", "", "<init>", "()V", "getBestSourceForSize", "Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;", "width", "", "height", "sources", "", "Lcom/facebook/react/views/imagehelper/ImageSource;", "multiplier", "", "MultiSourceResult", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiSourceHelper {

    @NotNull
    public static final MultiSourceHelper INSTANCE = new MultiSourceHelper();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;", "", "bestResult", "Lcom/facebook/react/views/imagehelper/ImageSource;", "bestResultInCache", "<init>", "(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultiSourceResult {

        @JvmField
        @Nullable
        public final ImageSource bestResult;

        @JvmField
        @Nullable
        public final ImageSource bestResultInCache;

        public MultiSourceResult(@Nullable ImageSource imageSource, @Nullable ImageSource imageSource2) {
            this.bestResult = imageSource;
            this.bestResultInCache = imageSource2;
        }
    }

    private MultiSourceHelper() {
    }

    @JvmStatic
    @NotNull
    public static final MultiSourceResult getBestSourceForSize(int width, int height, @NotNull List<? extends ImageSource> sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        return getBestSourceForSize(width, height, sources, 1.0d);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    @JvmStatic
    @NotNull
    public static final MultiSourceResult getBestSourceForSize(int width, int height, @NotNull List<? extends ImageSource> sources, double multiplier) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        if (sources.isEmpty()) {
            return new MultiSourceResult(null, null);
        }
        if (sources.size() == 1) {
            return new MultiSourceResult(sources.get(0), null);
        }
        if (width <= 0 || height <= 0) {
            return new MultiSourceResult(null, null);
        }
        s sVar = s.f36098p;
        e.e(sVar, "ImagePipelineFactory was not initialized!");
        k kVarE = sVar.e();
        Intrinsics.checkNotNullExpressionValue(kVarE, "getImagePipeline(...)");
        double d2 = ((double) (width * height)) * multiplier;
        double d10 = Double.MAX_VALUE;
        ImageSource imageSource = null;
        ImageSource imageSource2 = null;
        double d11 = Double.MAX_VALUE;
        for (ImageSource imageSource3 : sources) {
            double dAbs = Math.abs(1.0d - (imageSource3.getSize() / d2));
            if (dAbs < d10) {
                imageSource2 = imageSource3;
                d10 = dAbs;
            }
            if (dAbs < d11 && imageSource3.getCacheControl() != ImageCacheControl.RELOAD) {
                Uri uri = imageSource3.getUri();
                kVarE.getClass();
                if (uri == null ? false : ((MemoryCache) kVarE.f36037f.f18580b).contains((Predicate) new Z(uri, 25))) {
                    imageSource = imageSource3;
                    d11 = dAbs;
                } else {
                    Uri uri2 = imageSource3.getUri();
                    if (kVarE.d(uri2, b.f21655a) || kVarE.d(uri2, b.f21656b) || kVarE.d(uri2, b.f21657c)) {
                        imageSource = imageSource3;
                        d11 = dAbs;
                    }
                }
            }
        }
        return new MultiSourceResult(imageSource2, (imageSource == null || imageSource2 == null || !Intrinsics.c(imageSource.getSource(), imageSource2.getSource())) ? imageSource : null);
    }
}
