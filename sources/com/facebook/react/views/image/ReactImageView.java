package com.facebook.react.views.image;

import F2.f;
import I2.b;
import I2.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.h;
import com.facebook.imagepipeline.common.i;
import com.facebook.imagepipeline.core.DiskCachesStore;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.c;
import com.facebook.imagepipeline.request.e;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.fresco.ImageCacheControl;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.ui.activity.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p061e3.k;
import p167l3.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0093\u0001\u0092\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b \u0010\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010\u0016J\u001d\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010$J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0013¢\u0006\u0004\b2\u0010\u0016J\u0017\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b;\u0010:J\u0015\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\b=\u0010\u0012J\u0015\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u0017¢\u0006\u0004\b?\u0010\u001aJ\u0017\u0010B\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\f2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\f¢\u0006\u0004\bJ\u0010KJ\u001f\u0010O\u001a\u00020\f2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LH\u0007¢\u0006\u0004\bO\u0010PJ/\u0010U\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0014¢\u0006\u0004\bU\u0010VJ\u0019\u0010Y\u001a\u00020X2\b\u0010W\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010W\u001a\u00020XH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\f2\u0006\u0010^\u001a\u00020\u000fH\u0002¢\u0006\u0004\b_\u0010\u0012J\u000f\u0010`\u001a\u00020\u000fH\u0002¢\u0006\u0004\b`\u0010EJ\u000f\u0010a\u001a\u00020\fH\u0002¢\u0006\u0004\ba\u0010KJ\u0017\u0010d\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0019\u0010g\u001a\u00020\f2\b\u0010f\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\bg\u0010:R$\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010jR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020b0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010lR$\u0010c\u001a\u0004\u0018\u00010b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010mR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010wR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010xR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010yR\u0016\u0010z\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001c\u0010}\u001a\b\u0018\u00010|R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\"\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020M\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010wR\u0018\u0010\u0088\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010{R\u0019\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u008c\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010ER\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView;", "Lcom/facebook/drawee/view/GenericDraweeView;", "Landroid/content/Context;", "context", "LF2/f;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "globalImageLoadListener", "", "callerContext", "<init>", "(Landroid/content/Context;LF2/f;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V", "", "updateCallerContext", "(Ljava/lang/Object;)V", "", "shouldNotify", "setShouldNotifyLoadEvents", "(Z)V", "", "blurRadius", "setBlurRadius", "(F)V", "", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "(I)V", ViewProps.BORDER_COLOR, "setBorderColor", "overlayColor", "setOverlayColor", ViewProps.BORDER_WIDTH, "setBorderWidth", ViewProps.BORDER_RADIUS, "setBorderRadius", ViewProps.POSITION, "(FI)V", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "scaleType", "setScaleType", "(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)V", "Landroid/graphics/Shader$TileMode;", "tileMode", "setTileMode", "(Landroid/graphics/Shader$TileMode;)V", "Lcom/facebook/react/views/image/ImageResizeMethod;", ViewProps.RESIZE_METHOD, "setResizeMethod", "(Lcom/facebook/react/views/image/ImageResizeMethod;)V", "multiplier", "setResizeMultiplier", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSource", "(Lcom/facebook/react/bridge/ReadableArray;)V", "", "name", "setDefaultSource", "(Ljava/lang/String;)V", "setLoadingIndicatorSource", ViewProps.ENABLED, "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "maybeUpdateView", "()V", "Lcom/facebook/drawee/controller/ControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "controllerListener", "setControllerListener", "(Lcom/facebook/drawee/controller/ControllerListener;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "cacheControl", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "computeCacheControl", "(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;", "Lcom/facebook/imagepipeline/request/c;", "computeRequestLevel", "(Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/imagepipeline/request/c;", "doResize", "maybeUpdateViewFromRequest", "hasMultipleSources", "setSourceImage", "Lcom/facebook/react/views/imagehelper/ImageSource;", "imageSource", "shouldResize", "(Lcom/facebook/react/views/imagehelper/ImageSource;)Z", "uri", "warnImageSource", "LF2/f;", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "Ljava/lang/Object;", "", "Ljava/util/List;", "Lcom/facebook/react/views/imagehelper/ImageSource;", "getImageSource$ReactAndroid_release", "()Lcom/facebook/react/views/imagehelper/ImageSource;", "setImageSource$ReactAndroid_release", "(Lcom/facebook/react/views/imagehelper/ImageSource;)V", "cachedImageSource", "Landroid/graphics/drawable/Drawable;", "defaultImageDrawable", "Landroid/graphics/drawable/Drawable;", "loadingImageDrawable", "I", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "Landroid/graphics/Shader$TileMode;", "isDirty", "Z", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "tilePostprocessor", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "Ll3/a;", "iterativeBoxBlurPostProcessor", "Ll3/a;", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "downloadListener", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "controllerForTesting", "Lcom/facebook/drawee/controller/ControllerListener;", "fadeDurationMs", "progressiveRenderingEnabled", "Lcom/facebook/react/bridge/ReadableMap;", "resizeMultiplier", "F", "Lcom/facebook/react/views/image/ImageResizeMethod;", "isTiled", "Lcom/facebook/imagepipeline/common/g;", "getResizeOptions", "()Lcom/facebook/imagepipeline/common/g;", "resizeOptions", "Companion", "TilePostprocessor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,630:1\n1#2:631\n*E\n"})
public final class ReactImageView extends GenericDraweeView {
    public static final int REMOTE_IMAGE_FADE_DURATION_MS = 300;

    @Nullable
    private ImageSource cachedImageSource;

    @Nullable
    private Object callerContext;

    @Nullable
    private ControllerListener<ImageInfo> controllerForTesting;

    @Nullable
    private Drawable defaultImageDrawable;

    @Nullable
    private ReactImageDownloadListener<ImageInfo> downloadListener;

    @NotNull
    private final f draweeControllerBuilder;
    private int fadeDurationMs;

    @Nullable
    private final GlobalImageLoadListener globalImageLoadListener;

    @Nullable
    private ReadableMap headers;

    @Nullable
    private ImageSource imageSource;
    private boolean isDirty;

    @Nullable
    private a iterativeBoxBlurPostProcessor;

    @Nullable
    private Drawable loadingImageDrawable;
    private int overlayColor;
    private boolean progressiveRenderingEnabled;

    @NotNull
    private ImageResizeMethod resizeMethod;
    private float resizeMultiplier;

    @NotNull
    private ScalingUtils$ScaleType scaleType;

    @NotNull
    private final List<ImageSource> sources;

    @NotNull
    private Shader.TileMode tileMode;

    @Nullable
    private TilePostprocessor tilePostprocessor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Matrix tileMatrix = new Matrix();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LI2/a;", "buildHierarchy", "(Landroid/content/Context;)LI2/a;", "", "REMOTE_IMAGE_FADE_DURATION_MS", "I", "Landroid/graphics/Matrix;", "tileMatrix", "Landroid/graphics/Matrix;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,630:1\n1#2:631\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final I2.a buildHierarchy(Context context) {
            b bVar = new b(context.getResources());
            d dVar = new d();
            dVar.f3993c = new float[8];
            Arrays.fill(dVar.f3993c, 0.0f);
            dVar.f3998h = true;
            bVar.f3988p = dVar;
            I2.a aVarA = bVar.a();
            Intrinsics.checkNotNullExpressionValue(aVarA, "build(...)");
            return aVarA;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "Lcom/facebook/imagepipeline/request/a;", "<init>", "(Lcom/facebook/react/views/image/ReactImageView;)V", "Landroid/graphics/Bitmap;", "source", "Lc3/b;", "bitmapFactory", "Lcom/facebook/common/references/CloseableReference;", "process", "(Landroid/graphics/Bitmap;Lc3/b;)Lcom/facebook/common/references/CloseableReference;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TilePostprocessor extends com.facebook.imagepipeline.request.a {
        public TilePostprocessor() {
        }

        @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.Postprocessor
        @NotNull
        public CloseableReference process(@NotNull Bitmap source, @NotNull p032c3.b bitmapFactory) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.scaleType.getTransform(ReactImageView.tileMatrix, rect, source.getWidth(), source.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, ReactImageView.this.tileMode, ReactImageView.this.tileMode);
            bitmapShader.setLocalMatrix(ReactImageView.tileMatrix);
            paint.setShader(bitmapShader);
            int width = ReactImageView.this.getWidth();
            int height = ReactImageView.this.getHeight();
            bitmapFactory.getClass();
            CloseableReference closeableReferenceA = bitmapFactory.a(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(closeableReferenceA, "createBitmap(...)");
            try {
                new Canvas((Bitmap) closeableReferenceA.f()).drawRect(rect, paint);
                CloseableReference closeableReferenceClone = closeableReferenceA.clone();
                Intrinsics.checkNotNullExpressionValue(closeableReferenceClone, "clone(...)");
                closeableReferenceA.close();
                return closeableReferenceClone;
            } catch (Throwable th) {
                CloseableReference.d(closeableReferenceA);
                throw th;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageResizeMethod.values().length];
            try {
                iArr2[ImageResizeMethod.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ImageResizeMethod.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactImageView(@NotNull Context context, @NotNull f draweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable Object obj) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        I2.a aVarBuildHierarchy = INSTANCE.buildHierarchy(context);
        setHierarchy(aVarBuildHierarchy);
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContext = obj;
        this.sources = new ArrayList();
        this.scaleType = ImageResizeMode.defaultValue();
        this.tileMode = ImageResizeMode.defaultTileMode();
        this.fadeDurationMs = -1;
        this.resizeMultiplier = 1.0f;
        this.resizeMethod = ImageResizeMethod.AUTO;
        setLegacyVisibilityHandlingEnabled(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals(com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT) == false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.react.modules.fresco.ImageCacheControl computeCacheControl(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L39
            int r0 = r2.hashCode()
            switch(r0) {
                case -1564134880: goto L2b;
                case -934641255: goto L1f;
                case 706834161: goto L13;
                case 1544803905: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L33
        L13:
            java.lang.String r0 = "only-if-cached"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L1c:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.ONLY_IF_CACHED
            return r2
        L1f:
            java.lang.String r0 = "reload"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L28
            goto L33
        L28:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.RELOAD
            return r2
        L2b:
            java.lang.String r0 = "force-cache"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
        L33:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.DEFAULT
            return r2
        L36:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.FORCE_CACHE
            return r2
        L39:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.DEFAULT
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageView.computeCacheControl(java.lang.String):com.facebook.react.modules.fresco.ImageCacheControl");
    }

    private final c computeRequestLevel(ImageCacheControl cacheControl) {
        return WhenMappings.$EnumSwitchMapping$0[cacheControl.ordinal()] == 1 ? c.DISK_CACHE : c.FULL_FETCH;
    }

    private final g getResizeOptions() {
        int iRound = Math.round(getWidth() * this.resizeMultiplier);
        int iRound2 = Math.round(getHeight() * this.resizeMultiplier);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new g(iRound, iRound2);
    }

    private final boolean hasMultipleSources() {
        return this.sources.size() > 1;
    }

    private final boolean isTiled() {
        return this.tileMode != Shader.TileMode.CLAMP;
    }

    private final void maybeUpdateViewFromRequest(boolean doResize) {
        ImageSource imageSource = this.imageSource;
        if (imageSource == null) {
            return;
        }
        Uri uri = imageSource.getUri();
        ImageCacheControl cacheControl = imageSource.getCacheControl();
        c cVarComputeRequestLevel = computeRequestLevel(cacheControl);
        ArrayList arrayList = new ArrayList();
        a aVar = this.iterativeBoxBlurPostProcessor;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        TilePostprocessor tilePostprocessor = this.tilePostprocessor;
        if (tilePostprocessor != null) {
            arrayList.add(tilePostprocessor);
        }
        Postprocessor postprocessorFrom = MultiPostprocessor.INSTANCE.from(arrayList);
        g resizeOptions = doResize ? getResizeOptions() : null;
        if (cacheControl == ImageCacheControl.RELOAD) {
            k kVarW = p118hf.a.w();
            kVarW.getClass();
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Z z3 = new Z(uri, 25);
            kVarW.f36037f.removeAll(z3);
            kVarW.f36038g.removeAll(z3);
            com.facebook.imagepipeline.request.d dVarFromUri = com.facebook.imagepipeline.request.d.fromUri(uri);
            if (dVarFromUri == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CacheKey encodedCacheKey = kVarW.f36039h.getEncodedCacheKey(dVarFromUri, null);
            Object obj = kVarW.f36034c.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            DiskCachesStore diskCachesStore = (DiskCachesStore) obj;
            p045d3.d mainBufferedDiskCache = diskCachesStore.getMainBufferedDiskCache();
            Intrinsics.e(encodedCacheKey);
            mainBufferedDiskCache.e(encodedCacheKey);
            diskCachesStore.getSmallImageBufferedDiskCache().e(encodedCacheKey);
            Iterator it = diskCachesStore.getDynamicBufferedDiskCaches().entrySet().iterator();
            while (it.hasNext()) {
                ((p045d3.d) ((Map.Entry) it.next()).getValue()).e(encodedCacheKey);
            }
        }
        e eVarD = e.d(uri);
        eVarD.f21675l = postprocessorFrom;
        eVarD.f21667d = resizeOptions;
        h hVar = i.f21434c;
        eVarD.f21668e = hVar.autoRotate();
        eVarD.f21671h = this.progressiveRenderingEnabled;
        eVarD.f21665b = cVarComputeRequestLevel;
        ImageResizeMethod imageResizeMethod = this.resizeMethod;
        ImageResizeMethod imageResizeMethod2 = ImageResizeMethod.NONE;
        if (imageResizeMethod == imageResizeMethod2) {
            eVarD.f21680q = p061e3.i.f36028c;
        }
        ReactNetworkImageRequest reactNetworkImageRequestFromBuilderWithHeaders = ReactNetworkImageRequest.INSTANCE.fromBuilderWithHeaders(eVarD, this.headers, cacheControl);
        GlobalImageLoadListener globalImageLoadListener = this.globalImageLoadListener;
        if (globalImageLoadListener != null) {
            globalImageLoadListener.onLoadAttempt(uri);
        }
        f fVar = this.draweeControllerBuilder;
        Intrinsics.f(fVar, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        fVar.b();
        fVar.f2561b = reactNetworkImageRequestFromBuilderWithHeaders;
        fVar.f2564e = true;
        fVar.f2565f = getController();
        Object obj2 = this.callerContext;
        if (obj2 != null) {
            fVar.f2560a = obj2;
            Intrinsics.checkNotNullExpressionValue(fVar, "setCallerContext(...)");
        }
        ImageSource imageSource2 = this.cachedImageSource;
        if (imageSource2 != null) {
            e eVarD2 = e.d(imageSource2.getUri());
            eVarD2.f21675l = postprocessorFrom;
            eVarD2.f21667d = resizeOptions;
            eVarD2.f21668e = hVar.autoRotate();
            eVarD2.f21671h = this.progressiveRenderingEnabled;
            if (this.resizeMethod == imageResizeMethod2) {
                eVarD2.f21680q = p061e3.i.f36028c;
            }
            fVar.f2562c = eVarD2.a();
            Intrinsics.checkNotNullExpressionValue(fVar, "setLowResImageRequest(...)");
        }
        ReactImageDownloadListener<ImageInfo> reactImageDownloadListener = this.downloadListener;
        if (reactImageDownloadListener == null || this.controllerForTesting == null) {
            ControllerListener<ImageInfo> controllerListener = this.controllerForTesting;
            if (controllerListener != null) {
                fVar.f2563d = controllerListener;
            } else if (reactImageDownloadListener != null) {
                fVar.f2563d = reactImageDownloadListener;
            }
        } else {
            F2.h hVar2 = new F2.h();
            hVar2.a(this.downloadListener);
            hVar2.a(this.controllerForTesting);
            fVar.f2563d = hVar2;
        }
        if (this.downloadListener != null) {
            I2.a hierarchy = getHierarchy();
            ReactImageDownloadListener<ImageInfo> reactImageDownloadListener2 = this.downloadListener;
            if (reactImageDownloadListener2 == null) {
                hierarchy.f3969e.d(3, null);
            } else {
                hierarchy.e(3).setDrawable(I2.e.c(reactImageDownloadListener2, hierarchy.f3967c, hierarchy.f3966b));
            }
        }
        setController(fVar.build());
        fVar.b();
    }

    private final void setSourceImage() {
        this.imageSource = null;
        if (this.sources.isEmpty()) {
            List<ImageSource> list = this.sources;
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            list.add(companion.getTransparentBitmapImageSource(context));
        } else if (hasMultipleSources()) {
            MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.sources);
            this.imageSource = bestSourceForSize.bestResult;
            this.cachedImageSource = bestSourceForSize.bestResultInCache;
            return;
        }
        this.imageSource = this.sources.get(0);
    }

    private final boolean shouldResize(ImageSource imageSource) {
        int i7 = WhenMappings.$EnumSwitchMapping$1[this.resizeMethod.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
        } else if (!FirebaseAnalytics.Param.CONTENT.equals(p333w2.a.b(imageSource.getUri())) && !"file".equals(p333w2.a.b(imageSource.getUri()))) {
            return false;
        }
        return true;
    }

    private final void warnImageSource(String uri) {
        if (!ReactBuildConfig.DEBUG || ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            return;
        }
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RNLog.w((ReactContext) context, "ReactImageView: Image source \"" + uri + "\" doesn't exist");
    }

    @Nullable
    /* JADX INFO: renamed from: getImageSource$ReactAndroid_release, reason: from getter */
    public final ImageSource getImageSource() {
        return this.imageSource;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void maybeUpdateView() {
        if (this.isDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                ImageSource imageSource = this.imageSource;
                if (imageSource == null) {
                    return;
                }
                boolean zShouldResize = shouldResize(imageSource);
                if (!zShouldResize || (getWidth() > 0 && getHeight() > 0)) {
                    if (!isTiled() || (getWidth() > 0 && getHeight() > 0)) {
                        I2.a hierarchy = getHierarchy();
                        ScalingUtils$ScaleType scaleType = this.scaleType;
                        hierarchy.getClass();
                        scaleType.getClass();
                        m mVarF = hierarchy.f(2);
                        mVarF.getClass();
                        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
                        if (!p213o2.e.h(mVarF.f21323a, scaleType)) {
                            mVarF.f21323a = scaleType;
                            mVarF.f21324b = null;
                            mVarF.a();
                            mVarF.invalidateSelf();
                        }
                        Drawable drawable = this.defaultImageDrawable;
                        Resources resources = hierarchy.f3966b;
                        if (drawable != null) {
                            ScalingUtils$ScaleType scaleType2 = this.scaleType;
                            hierarchy.e(1).setDrawable(I2.e.c(drawable, hierarchy.f3967c, resources));
                            m mVarF2 = hierarchy.f(1);
                            mVarF2.getClass();
                            Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
                            if (!p213o2.e.h(mVarF2.f21323a, scaleType2)) {
                                mVarF2.f21323a = scaleType2;
                                mVarF2.f21324b = null;
                                mVarF2.a();
                                mVarF2.invalidateSelf();
                            }
                        }
                        Drawable drawable2 = this.loadingImageDrawable;
                        if (drawable2 != null) {
                            o scaleType3 = o.f21329b;
                            hierarchy.e(1).setDrawable(I2.e.c(drawable2, hierarchy.f3967c, resources));
                            m mVarF3 = hierarchy.f(1);
                            mVarF3.getClass();
                            Intrinsics.checkNotNullParameter(scaleType3, "scaleType");
                            if (!p213o2.e.h(mVarF3.f21323a, scaleType3)) {
                                mVarF3.f21323a = scaleType3;
                                mVarF3.f21324b = null;
                                mVarF3.a();
                                mVarF3.invalidateSelf();
                            }
                        }
                        d dVar = hierarchy.f3967c;
                        com.facebook.drawee.drawable.e eVar = hierarchy.f3969e;
                        if (dVar != null) {
                            int i7 = this.overlayColor;
                            if (i7 != 0) {
                                dVar.f3994d = i7;
                                dVar.f3991a = 1;
                            } else {
                                dVar.f3991a = 2;
                            }
                            hierarchy.f3967c = dVar;
                            ColorDrawable colorDrawable = I2.e.f3999a;
                            I2.c cVar = hierarchy.f3968d;
                            Drawable drawable3 = cVar.getDrawable();
                            ColorDrawable colorDrawable2 = I2.e.f3999a;
                            if (dVar.f3991a == 1) {
                                if (drawable3 instanceof j) {
                                    j jVar = (j) drawable3;
                                    I2.e.b(jVar, dVar);
                                    jVar.f21292p = dVar.f3994d;
                                    jVar.invalidateSelf();
                                } else {
                                    cVar.setDrawable(I2.e.d(cVar.setDrawable(colorDrawable2), dVar));
                                }
                            } else if (drawable3 instanceof j) {
                                cVar.setDrawable(((j) drawable3).setCurrent(colorDrawable2));
                                colorDrawable2.setCallback(null);
                            }
                            for (int i10 = 0; i10 < eVar.f21242c.length; i10++) {
                                DrawableParent drawableParentE = hierarchy.e(i10);
                                d dVar2 = hierarchy.f3967c;
                                while (true) {
                                    Object drawable4 = drawableParentE.getDrawable();
                                    if (drawable4 == drawableParentE || !(drawable4 instanceof DrawableParent)) {
                                        break;
                                    } else {
                                        drawableParentE = (DrawableParent) drawable4;
                                    }
                                }
                                Drawable drawable5 = drawableParentE.getDrawable();
                                if (dVar2 == null || dVar2.f3991a != 2) {
                                    if (drawable5 instanceof Rounded) {
                                        Rounded rounded = (Rounded) drawable5;
                                        rounded.setCircle(false);
                                        rounded.setRadius(0.0f);
                                        rounded.setBorder(0, 0.0f);
                                        rounded.setPadding(0.0f);
                                        rounded.setScaleDownInsideBorders(false);
                                        rounded.setPaintFilterBitmap(false);
                                        int i11 = com.facebook.drawee.drawable.h.f21258z0;
                                        rounded.setRepeatEdgePixels(false);
                                    }
                                } else if (drawable5 instanceof Rounded) {
                                    I2.e.b((Rounded) drawable5, dVar2);
                                } else if (drawable5 != 0) {
                                    drawableParentE.setDrawable(I2.e.f3999a);
                                    drawableParentE.setDrawable(I2.e.a(drawable5, dVar2, resources));
                                }
                            }
                        }
                        int i12 = this.fadeDurationMs;
                        if (i12 < 0) {
                            i12 = imageSource.get_isResource() ? 0 : 300;
                        }
                        eVar.t = i12;
                        if (eVar.f21250p == 1) {
                            eVar.f21250p = 0;
                        }
                        maybeUpdateViewFromRequest(zShouldResize);
                        this.isDirty = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            if (this.downloadListener != null) {
                Context context = getContext();
                Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(this), getId(), e10));
                }
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w3, int h7, int oldw, int oldh) {
        super.onSizeChanged(w3, h7, oldw, oldh);
        if (w3 <= 0 || h7 <= 0) {
            return;
        }
        this.isDirty = this.isDirty || hasMultipleSources() || isTiled();
        maybeUpdateView();
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(backgroundColor));
    }

    public final void setBlurRadius(float blurRadius) {
        int iDpToPx = ((int) PixelUtil.INSTANCE.dpToPx(blurRadius)) / 2;
        this.iterativeBoxBlurPostProcessor = iDpToPx == 0 ? null : new a(iDpToPx);
        this.isDirty = true;
    }

    public final void setBorderColor(int borderColor) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.ALL, Integer.valueOf(borderColor));
    }

    public final void setBorderRadius(float borderRadius) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.BORDER_RADIUS, Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }

    public final void setBorderWidth(float borderWidth) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @VisibleForTesting
    public final void setControllerListener(@Nullable ControllerListener<ImageInfo> controllerListener) {
        this.controllerForTesting = controllerListener;
        this.isDirty = true;
        maybeUpdateView();
    }

    public final void setDefaultSource(@Nullable String name) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(context, name);
        if (Intrinsics.c(this.defaultImageDrawable, resourceDrawable)) {
            return;
        }
        this.defaultImageDrawable = resourceDrawable;
        this.isDirty = true;
    }

    public final void setFadeDuration(int durationMs) {
        this.fadeDurationMs = durationMs;
    }

    public final void setHeaders(@Nullable ReadableMap headers) {
        this.headers = headers;
    }

    public final void setImageSource$ReactAndroid_release(@Nullable ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    public final void setLoadingIndicatorSource(@Nullable String name) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(context, name);
        com.facebook.drawee.drawable.b bVar = resourceDrawable != null ? new com.facebook.drawee.drawable.b(resourceDrawable, 1000, true) : null;
        if (Intrinsics.c(this.loadingImageDrawable, bVar)) {
            return;
        }
        this.loadingImageDrawable = bVar;
        this.isDirty = true;
    }

    public final void setOverlayColor(int overlayColor) {
        if (this.overlayColor != overlayColor) {
            this.overlayColor = overlayColor;
            this.isDirty = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean enabled) {
        this.progressiveRenderingEnabled = enabled;
    }

    public final void setResizeMethod(@NotNull ImageResizeMethod resizeMethod) {
        Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
        if (this.resizeMethod != resizeMethod) {
            this.resizeMethod = resizeMethod;
            this.isDirty = true;
        }
    }

    public final void setResizeMultiplier(float multiplier) {
        if (Math.abs(this.resizeMultiplier - multiplier) > 9.999999747378752E-5d) {
            this.resizeMultiplier = multiplier;
            this.isDirty = true;
        }
    }

    public final void setScaleType(@NotNull ScalingUtils$ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (this.scaleType != scaleType) {
            this.scaleType = scaleType;
            this.isDirty = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean shouldNotify) {
        if (shouldNotify == (this.downloadListener != null)) {
            return;
        }
        if (shouldNotify) {
            Context context = getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
            this.downloadListener = new ReactImageDownloadListener<ImageInfo>() { // from class: com.facebook.react.views.image.ReactImageView.setShouldNotifyLoadEvents.1
                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFailure(String id2, Throwable throwable) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(this), this.getId(), throwable));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener
                public void onProgressChange(int loaded, int total) {
                    if (eventDispatcherForReactTag == null || this.getImageSource() == null) {
                        return;
                    }
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id2 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher.dispatchEvent(companion.createProgressEvent(surfaceId, id2, imageSource != null ? imageSource.getSource() : null, loaded, total));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onSubmit(String id2, Object callerContext) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.INSTANCE.createLoadStartEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFinalImageSet(String id2, ImageInfo imageInfo, Animatable animatable) {
                    EventDispatcher eventDispatcher;
                    Intrinsics.checkNotNullParameter(id2, "id");
                    if (imageInfo == null || this.getImageSource() == null || (eventDispatcher = eventDispatcherForReactTag) == null) {
                        return;
                    }
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id3 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher.dispatchEvent(companion.createLoadEvent(surfaceId, id3, imageSource != null ? imageSource.getSource() : null, imageInfo.getWidth(), imageInfo.getHeight()));
                    eventDispatcherForReactTag.dispatchEvent(companion.createLoadEndEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }
            };
        } else {
            this.downloadListener = null;
        }
        this.isDirty = true;
    }

    public final void setSource(@Nullable ReadableArray sources) {
        ArrayList arrayList = new ArrayList();
        if (sources == null || sources.size() == 0) {
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(companion.getTransparentBitmapImageSource(context));
        } else {
            if (sources.size() == 1) {
                ReadableMap map = sources.getMap(0);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ImageCacheControl imageCacheControlComputeCacheControl = computeCacheControl(map.getString("cache"));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ImageSource imageSource = new ImageSource(context2, map.getString("uri"), 0.0d, 0.0d, imageCacheControlComputeCacheControl, 12, null);
                if (Intrinsics.c(Uri.EMPTY, imageSource.getUri())) {
                    warnImageSource(map.getString("uri"));
                    ImageSource.Companion companion2 = ImageSource.INSTANCE;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    imageSource = companion2.getTransparentBitmapImageSource(context3);
                }
                arrayList.add(imageSource);
            } else {
                int size = sources.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ReadableMap map2 = sources.getMap(i7);
                    if (map2 != null) {
                        ImageCacheControl imageCacheControlComputeCacheControl2 = computeCacheControl(map2.getString("cache"));
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        ImageSource imageSource2 = new ImageSource(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"), imageCacheControlComputeCacheControl2);
                        if (Intrinsics.c(Uri.EMPTY, imageSource2.getUri())) {
                            warnImageSource(map2.getString("uri"));
                            ImageSource.Companion companion3 = ImageSource.INSTANCE;
                            Context context5 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            imageSource2 = companion3.getTransparentBitmapImageSource(context5);
                        }
                        arrayList.add(imageSource2);
                    }
                }
            }
        }
        if (Intrinsics.c(this.sources, arrayList)) {
            return;
        }
        this.sources.clear();
        this.sources.addAll(arrayList);
        this.isDirty = true;
    }

    public final void setTileMode(@NotNull Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        if (this.tileMode != tileMode) {
            this.tileMode = tileMode;
            this.tilePostprocessor = isTiled() ? new TilePostprocessor() : null;
            this.isDirty = true;
        }
    }

    public final void updateCallerContext(@Nullable Object callerContext) {
        if (Intrinsics.c(this.callerContext, callerContext)) {
            return;
        }
        this.callerContext = callerContext;
        this.isDirty = true;
    }

    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[position], Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }
}
