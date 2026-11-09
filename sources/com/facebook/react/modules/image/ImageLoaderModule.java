package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.common.internal.Predicate;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.b;
import com.facebook.imagepipeline.request.d;
import com.facebook.imagepipeline.request.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
import com.palmpay.lib.webview.container.fast.WebViewCache;
import com.transsnet.palmpay.core.ui.activity.Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p061e3.k;
import p118hf.a;
import p360y2.c;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "Le3/k;", "imagePipeline", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;Le3/k;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "", "requestId", "Lcom/facebook/datasource/DataSource;", "Ljava/lang/Void;", "request", "", "registerRequest", "(ILcom/facebook/datasource/DataSource;)V", "removeRequest", "(I)Lcom/facebook/datasource/DataSource;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "Le3/k;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()Le3/k;", "setImagePipeline", "(Le3/k;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageLoaderModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoaderModule.kt\ncom/facebook/react/modules/image/ImageLoaderModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {

    @NotNull
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";

    @NotNull
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";

    @NotNull
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";

    @NotNull
    public static final String NAME = "ImageLoader";

    @Nullable
    private k _imagePipeline;

    @Nullable
    private final Object callerContext;

    @Nullable
    private ReactCallerContextFactory callerContextFactory;

    @NotNull
    private final Object enqueuedRequestMonitor;

    @NotNull
    private final SparseArray<DataSource<Void>> enqueuedRequests;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        Object orCreateCallerContext;
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        return (reactCallerContextFactory == null || (orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext("", "")) == null) ? this.callerContext : orCreateCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getImagePipeline() {
        k kVar = this._imagePipeline;
        if (kVar != null) {
            return kVar;
        }
        k kVarW = a.w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "getImagePipeline(...)");
        return kVarW;
    }

    private final void registerRequest(int requestId, DataSource<Void> request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            Unit unit = Unit.f38893a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataSource<Void> removeRequest(int requestId) {
        DataSource<Void> dataSource;
        synchronized (this.enqueuedRequestMonitor) {
            dataSource = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return dataSource;
    }

    private final void setImagePipeline(k kVar) {
        this._imagePipeline = kVar;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        DataSource<Void> dataSourceRemoveRequest = removeRequest((int) requestId);
        if (dataSourceRemoveRequest != null) {
            dataSourceRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(@Nullable String uriString, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        d dVarA = e.d(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri()).a();
        Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
        getImagePipeline().a(dVarA, getCallerContext()).subscribe(new c() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSize$dataSubscriber$1
            @Override // p360y2.c
            public void onFailureImpl(DataSource<CloseableReference> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                promise.reject("E_GET_SIZE_FAILURE", dataSource.getFailureCause());
            }

            @Override // p360y2.c
            public void onNewResultImpl(DataSource<CloseableReference> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    CloseableReference result = dataSource.getResult();
                    if (result == null) {
                        promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        return;
                    }
                    try {
                        Object objF = result.f();
                        Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
                        CloseableImage closeableImage = (CloseableImage) objF;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("width", closeableImage.getWidth());
                        readableMapBuilder.put("height", closeableImage.getHeight());
                        promise.resolve(writableMapCreateMap);
                    } catch (Exception e10) {
                        promise.reject("E_GET_SIZE_FAILURE", e10);
                    } finally {
                        result.close();
                    }
                }
            }
        }, p180m2.a.f39461a);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(@Nullable String uriString, @Nullable ReadableMap headers, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        e eVarD = e.d(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri());
        Intrinsics.checkNotNullExpressionValue(eVarD, "newBuilderWithSource(...)");
        getImagePipeline().a(ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(ReactNetworkImageRequest.INSTANCE, eVarD, headers, null, 4, null), getCallerContext()).subscribe(new c() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSizeWithHeaders$dataSubscriber$1
            @Override // p360y2.c
            public void onFailureImpl(DataSource<CloseableReference> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                promise.reject("E_GET_SIZE_FAILURE", dataSource.getFailureCause());
            }

            @Override // p360y2.c
            public void onNewResultImpl(DataSource<CloseableReference> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    CloseableReference result = dataSource.getResult();
                    if (result == null) {
                        promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        return;
                    }
                    try {
                        Object objF = result.f();
                        Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
                        CloseableImage closeableImage = (CloseableImage) objF;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("width", closeableImage.getWidth());
                        readableMapBuilder.put("height", closeableImage.getHeight());
                        promise.resolve(writableMapCreateMap);
                    } catch (Exception e10) {
                        promise.reject("E_GET_SIZE_FAILURE", e10);
                    } finally {
                        result.close();
                    }
                }
            }
        }, p180m2.a.f39461a);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i7 = 0; i7 < size; i7++) {
                    DataSource<Void> dataSourceValueAt = this.enqueuedRequests.valueAt(i7);
                    Intrinsics.checkNotNullExpressionValue(dataSourceValueAt, "valueAt(...)");
                    dataSourceValueAt.close();
                }
                this.enqueuedRequests.clear();
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(@Nullable String uriString, double requestIdAsDouble, @NotNull final Promise promise) {
        DataSource dataSourceZ;
        Intrinsics.checkNotNullParameter(promise, "promise");
        final int i7 = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        d dVarA = e.d(Uri.parse(uriString)).a();
        Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
        k imagePipeline = getImagePipeline();
        Object callerContext = getCallerContext();
        imagePipeline.getClass();
        com.facebook.imagepipeline.common.e priority = com.facebook.imagepipeline.common.e.f21429c;
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (((Boolean) imagePipeline.f36033b.get()).booleanValue()) {
            try {
                dataSourceZ = imagePipeline.g(imagePipeline.f36032a.d(dVarA), dVarA, callerContext);
            } catch (Exception e10) {
                dataSourceZ = com.palmpay.lib.apm.launchcounter.util.d.z(e10);
            }
        } else {
            dataSourceZ = com.palmpay.lib.apm.launchcounter.util.d.z(k.f36030l);
            Intrinsics.checkNotNullExpressionValue(dataSourceZ, "immediateFailedDataSource(...)");
        }
        c cVar = new c() { // from class: com.facebook.react.modules.image.ImageLoaderModule$prefetchImage$prefetchSubscriber$1
            @Override // p360y2.c
            public void onFailureImpl(DataSource<Void> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                try {
                    this.this$0.removeRequest(i7);
                    promise.reject("E_PREFETCH_FAILURE", dataSource.getFailureCause());
                } finally {
                    dataSource.close();
                }
            }

            @Override // p360y2.c
            public void onNewResultImpl(DataSource<Void> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    try {
                        this.this$0.removeRequest(i7);
                        promise.resolve(Boolean.TRUE);
                    } catch (Exception e11) {
                        promise.reject("E_PREFETCH_FAILURE", e11);
                    } finally {
                        dataSource.close();
                    }
                }
            }
        };
        registerRequest(i7, dataSourceZ);
        dataSourceZ.subscribe(cVar, p180m2.a.f39461a);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(@NotNull ReadableArray uris, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        new GuardedAsyncTask<Void, Void>(this, uris, getReactApplicationContext()) { // from class: com.facebook.react.modules.image.ImageLoaderModule.queryCache.1
            final /* synthetic */ ReadableArray $uris;
            final /* synthetic */ ImageLoaderModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(reactApplicationContext);
                Intrinsics.e(reactApplicationContext);
            }

            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                ImageLoaderModule imageLoaderModule = this.this$0;
                ReadableArray readableArray = this.$uris;
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                k imagePipeline = imageLoaderModule.getImagePipeline();
                int size = readableArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String string = readableArray.getString(i7);
                    if (string != null && string.length() != 0) {
                        Uri uri = Uri.parse(string);
                        imagePipeline.getClass();
                        if (uri == null ? false : ((MemoryCache) imagePipeline.f36037f.f18580b).contains((Predicate) new Z(uri, 25))) {
                            readableMapBuilder.put(string, WebViewCache.SOURCE_MEMORY_CACHE);
                        } else if (imagePipeline.d(uri, b.f21655a) || imagePipeline.d(uri, b.f21656b) || imagePipeline.d(uri, b.f21657c)) {
                            readableMapBuilder.put(string, "disk");
                        }
                    }
                }
                this.$promise.resolve(writableMapCreateMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, @Nullable Object obj) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, @NotNull k imagePipeline, @NotNull ReactCallerContextFactory callerContextFactory) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(imagePipeline, "imagePipeline");
        Intrinsics.checkNotNullParameter(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContextFactory = callerContextFactory;
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }
}
