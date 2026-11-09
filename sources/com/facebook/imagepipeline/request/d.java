package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Fn;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.listener.RequestListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.HashMap;
import javax.annotation.Nullable;
import kotlin.text.y;
import p061e3.i;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final Fn<d, Uri> REQUEST_TO_URI_FN = new p262r2.c(4);
    private static boolean sCacheHashcode;
    private static boolean sUseCachedHashcodeInEquals;

    @Nullable
    private final com.facebook.imagepipeline.common.b mBytesRange;
    private final b mCacheChoice;
    protected int mCachesDisabled;

    @Nullable
    private final Boolean mDecodePrefetches;
    private final int mDelayMs;

    @Nullable
    private final String mDiskCacheId;

    @Nullable
    private final i mDownsampleOverride;
    private int mHashcode;
    private final com.facebook.imagepipeline.common.c mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLoadThumbnailOnly;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final c mLowestPermittedRequestLevel;

    @Nullable
    private final Postprocessor mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;

    @Nullable
    private final RequestListener mRequestListener;
    private final com.facebook.imagepipeline.common.e mRequestPriority;

    @Nullable
    private final g mResizeOptions;

    @Nullable
    private final Boolean mResizingAllowedOverride;
    private final com.facebook.imagepipeline.common.i mRotationOptions;

    @Nullable
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType;

    public d(e eVar) {
        this.mCacheChoice = eVar.f21670g;
        Uri uri = eVar.f21664a;
        this.mSourceUri = uri;
        int i7 = -1;
        if (uri != null) {
            if (p333w2.a.c(uri)) {
                i7 = 0;
            } else if (uri.getPath() != null && "file".equals(p333w2.a.b(uri))) {
                String strA = p244q2.a.a(uri.getPath());
                i7 = strA != null ? y.m(strA, "video/", false) : false ? 2 : 3;
            } else if (FirebaseAnalytics.Param.CONTENT.equals(p333w2.a.b(uri))) {
                i7 = 4;
            } else if ("asset".equals(p333w2.a.b(uri))) {
                i7 = 5;
            } else if ("res".equals(p333w2.a.b(uri))) {
                i7 = 6;
            } else if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(uri.getScheme())) {
                i7 = 7;
            } else if ("android.resource".equals(p333w2.a.b(uri))) {
                i7 = 8;
            }
        }
        this.mSourceUriType = i7;
        this.mProgressiveRenderingEnabled = eVar.f21671h;
        this.mLocalThumbnailPreviewsEnabled = eVar.f21672i;
        this.mLoadThumbnailOnly = eVar.f21673j;
        this.mImageDecodeOptions = eVar.f21669f;
        this.mResizeOptions = eVar.f21667d;
        com.facebook.imagepipeline.common.i iVar = eVar.f21668e;
        this.mRotationOptions = iVar == null ? com.facebook.imagepipeline.common.i.f21434c.autoRotate() : iVar;
        this.mBytesRange = eVar.f21678o;
        this.mRequestPriority = eVar.f21674k;
        this.mLowestPermittedRequestLevel = eVar.f21665b;
        boolean z3 = (eVar.f21666c & 48) == 0 && (p333w2.a.c(eVar.f21664a) || e.c(eVar.f21664a));
        this.mIsDiskCacheEnabled = z3;
        int i10 = eVar.f21666c;
        this.mCachesDisabled = !z3 ? i10 | 48 : i10;
        this.mIsMemoryCacheEnabled = (i10 & 15) == 0;
        this.mDecodePrefetches = eVar.f21676m;
        this.mPostprocessor = eVar.f21675l;
        this.mRequestListener = eVar.f21677n;
        this.mResizingAllowedOverride = eVar.f21679p;
        this.mDownsampleOverride = eVar.f21680q;
        this.mDelayMs = eVar.f21681r;
        this.mDiskCacheId = eVar.f21682s;
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Nullable
    public static d fromFile(@Nullable File file) {
        if (file == null) {
            return null;
        }
        Uri uri = p333w2.a.f43254a;
        return fromUri(Uri.fromFile(file));
    }

    @Nullable
    public static d fromUri(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return e.d(uri).a();
    }

    public static void setCacheHashcode(boolean z3) {
        sCacheHashcode = z3;
    }

    public static void setUseCachedHashcodeInEquals(boolean z3) {
        sUseCachedHashcodeInEquals = z3;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (sUseCachedHashcodeInEquals) {
            int i7 = this.mHashcode;
            int i10 = dVar.mHashcode;
            if (i7 != 0 && i10 != 0 && i7 != i10) {
                return false;
            }
        }
        if (this.mLocalThumbnailPreviewsEnabled != dVar.mLocalThumbnailPreviewsEnabled || this.mIsDiskCacheEnabled != dVar.mIsDiskCacheEnabled || this.mIsMemoryCacheEnabled != dVar.mIsMemoryCacheEnabled || !p213o2.e.h(this.mSourceUri, dVar.mSourceUri) || !p213o2.e.h(this.mCacheChoice, dVar.mCacheChoice) || !p213o2.e.h(this.mDiskCacheId, dVar.mDiskCacheId) || !p213o2.e.h(this.mSourceFile, dVar.mSourceFile) || !p213o2.e.h(this.mBytesRange, dVar.mBytesRange) || !p213o2.e.h(this.mImageDecodeOptions, dVar.mImageDecodeOptions) || !p213o2.e.h(this.mResizeOptions, dVar.mResizeOptions) || !p213o2.e.h(this.mRequestPriority, dVar.mRequestPriority) || !p213o2.e.h(this.mLowestPermittedRequestLevel, dVar.mLowestPermittedRequestLevel) || !p213o2.e.h(Integer.valueOf(this.mCachesDisabled), Integer.valueOf(dVar.mCachesDisabled)) || !p213o2.e.h(this.mDecodePrefetches, dVar.mDecodePrefetches) || !p213o2.e.h(this.mResizingAllowedOverride, dVar.mResizingAllowedOverride) || !p213o2.e.h(this.mDownsampleOverride, dVar.mDownsampleOverride) || !p213o2.e.h(this.mRotationOptions, dVar.mRotationOptions) || this.mLoadThumbnailOnly != dVar.mLoadThumbnailOnly) {
            return false;
        }
        Postprocessor postprocessor = this.mPostprocessor;
        CacheKey postprocessorCacheKey = postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null;
        Postprocessor postprocessor2 = dVar.mPostprocessor;
        return p213o2.e.h(postprocessorCacheKey, postprocessor2 != null ? postprocessor2.getPostprocessorCacheKey() : null) && this.mDelayMs == dVar.mDelayMs;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.a();
    }

    @Nullable
    public com.facebook.imagepipeline.common.b getBytesRange() {
        return this.mBytesRange;
    }

    public b getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getCachesDisabled() {
        return this.mCachesDisabled;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    @Nullable
    public String getDiskCacheId() {
        return this.mDiskCacheId;
    }

    @Nullable
    public i getDownsampleOverride() {
        return this.mDownsampleOverride;
    }

    public com.facebook.imagepipeline.common.c getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLoadThumbnailOnlyForAndroidSdkAboveQ() {
        return Build.VERSION.SDK_INT >= 29 && this.mLoadThumbnailOnly;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public c getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    @Nullable
    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        g gVar = this.mResizeOptions;
        if (gVar != null) {
            return gVar.f21433b;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        g gVar = this.mResizeOptions;
        if (gVar != null) {
            return gVar.f21432a;
        }
        return 2048;
    }

    public com.facebook.imagepipeline.common.e getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    @Nullable
    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    @Nullable
    public g getResizeOptions() {
        return this.mResizeOptions;
    }

    @Nullable
    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    public com.facebook.imagepipeline.common.i getRotationOptions() {
        return this.mRotationOptions;
    }

    public synchronized File getSourceFile() {
        try {
            if (this.mSourceFile == null) {
                this.mSourceUri.getPath().getClass();
                this.mSourceFile = new File(this.mSourceUri.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mSourceFile;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public int hashCode() {
        boolean z3 = sCacheHashcode;
        int i7 = z3 ? this.mHashcode : 0;
        if (i7 != 0) {
            return i7;
        }
        Postprocessor postprocessor = this.mPostprocessor;
        int i10 = f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(f.i(0, this.mCacheChoice), this.mSourceUri), Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled)), this.mBytesRange), this.mRequestPriority), this.mLowestPermittedRequestLevel), Integer.valueOf(this.mCachesDisabled)), Boolean.valueOf(this.mIsDiskCacheEnabled)), Boolean.valueOf(this.mIsMemoryCacheEnabled)), this.mImageDecodeOptions), this.mDecodePrefetches), this.mResizeOptions), this.mRotationOptions), postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null), this.mResizingAllowedOverride), this.mDownsampleOverride), Integer.valueOf(this.mDelayMs)), Boolean.valueOf(this.mLoadThumbnailOnly));
        if (z3) {
            this.mHashcode = i10;
        }
        return i10;
    }

    public boolean isCacheEnabled(int i7) {
        return (i7 & getCachesDisabled()) == 0;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    public void recordHashCode(HashMap<String, Integer> map) {
        Postprocessor postprocessor = this.mPostprocessor;
        CacheKey postprocessorCacheKey = postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null;
        map.put("ImageRequest", Integer.valueOf(hashCode()));
        map.put("ImageRequest.mSourceUri", Integer.valueOf(a(this.mSourceUri)));
        map.put("ImageRequest.mLocalThumbnailPreviewsEnabled", Integer.valueOf(Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled).hashCode()));
        map.put("ImageRequest.mBytesRange", Integer.valueOf(a(this.mBytesRange)));
        map.put("ImageRequest.mRequestPriority", Integer.valueOf(a(this.mRequestPriority)));
        map.put("ImageRequest.mLowestPermittedRequestLevel", Integer.valueOf(a(this.mLowestPermittedRequestLevel)));
        map.put("ImageRequest.mCachesDisabled", Integer.valueOf(Integer.valueOf(this.mCachesDisabled).hashCode()));
        map.put("ImageRequest.mIsDiskCacheEnabled", Integer.valueOf(Boolean.valueOf(this.mIsDiskCacheEnabled).hashCode()));
        map.put("ImageRequest.mIsMemoryCacheEnabled", Integer.valueOf(Boolean.valueOf(this.mIsMemoryCacheEnabled).hashCode()));
        map.put("ImageRequest.mImageDecodeOptions", Integer.valueOf(a(this.mImageDecodeOptions)));
        map.put("ImageRequest.mDecodePrefetches", Integer.valueOf(a(this.mDecodePrefetches)));
        map.put("ImageRequest.mSoumResizeOptionsrceUri", Integer.valueOf(a(this.mResizeOptions)));
        map.put("ImageRequest.mRotationOptions", Integer.valueOf(a(this.mRotationOptions)));
        map.put("ImageRequest.postprocessorCacheKey", Integer.valueOf(a(postprocessorCacheKey)));
        map.put("ImageRequest.mResizingAllowedOverride", Integer.valueOf(a(this.mResizingAllowedOverride)));
        map.put("ImageRequest.mDownsampleOverride", Integer.valueOf(a(this.mDownsampleOverride)));
        map.put("ImageRequest.mDelayMs", Integer.valueOf(Integer.valueOf(this.mDelayMs).hashCode()));
        map.put("ImageRequest.mLoadThumbnailOnly", Integer.valueOf(Boolean.valueOf(this.mLoadThumbnailOnly).hashCode()));
    }

    @Nullable
    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public String toString() {
        androidx.camera.video.internal.c cVarM = p213o2.e.m(this);
        cVarM.c(this.mSourceUri, "uri");
        cVarM.c(this.mCacheChoice, "cacheChoice");
        cVarM.c(this.mImageDecodeOptions, "decodeOptions");
        cVarM.c(this.mPostprocessor, "postprocessor");
        cVarM.c(this.mRequestPriority, "priority");
        cVarM.c(this.mResizeOptions, "resizeOptions");
        cVarM.c(this.mRotationOptions, "rotationOptions");
        cVarM.c(this.mBytesRange, "bytesRange");
        cVarM.c(this.mResizingAllowedOverride, "resizingAllowedOverride");
        cVarM.c(this.mDownsampleOverride, "downsampleOverride");
        cVarM.b("progressiveRenderingEnabled", this.mProgressiveRenderingEnabled);
        cVarM.b("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled);
        cVarM.b("loadThumbnailOnly", this.mLoadThumbnailOnly);
        cVarM.c(this.mLowestPermittedRequestLevel, "lowestPermittedRequestLevel");
        cVarM.a(this.mCachesDisabled, "cachesDisabled");
        cVarM.b("isDiskCacheEnabled", this.mIsDiskCacheEnabled);
        cVarM.b("isMemoryCacheEnabled", this.mIsMemoryCacheEnabled);
        cVarM.c(this.mDecodePrefetches, "decodePrefetches");
        cVarM.a(this.mDelayMs, "delayMs");
        return cVarM.toString();
    }

    @Nullable
    public static d fromUri(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }
}
