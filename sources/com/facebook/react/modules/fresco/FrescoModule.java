package com.facebook.react.modules.fresco;

import C2.c;
import Sd.b;
import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.DiskCachesStore;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CookieJar;
import okhttp3.U;
import org.greenrobot.eventbus.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019b3.e;
import p045d3.d;
import p045d3.g;
import p061e3.i;
import p061e3.k;
import p061e3.l;
import p061e3.o;
import p061e3.p;
import p061e3.s;
import p118hf.a;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = FrescoModule.NAME, needsEagerInit = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0017\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001#B)\b\u0007\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/modules/common/ModuleDataCleaner$Cleanable;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "clearOnDestroy", "Le3/o;", "imagePipelineConfig", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLe3/o;)V", "Le3/k;", "imagePipeline", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;Le3/k;ZZ)V", "", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "Z", "config", "Le3/o;", "pipeline", "Le3/k;", "getImagePipeline", "()Le3/k;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FrescoModule extends ReactContextBaseJavaModule implements ModuleDataCleaner.Cleanable, LifecycleEventListener, TurboModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;

    @Nullable
    private o config;

    @Nullable
    private k pipeline;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule$Companion;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "context", "Le3/o;", "getDefaultConfig", "(Lcom/facebook/react/bridge/ReactContext;)Le3/o;", "", "hasBeenInitialized", "()Z", "Le3/l;", "getDefaultConfigBuilder", "(Lcom/facebook/react/bridge/ReactContext;)Le3/l;", "", "NAME", "Ljava/lang/String;", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o getDefaultConfig(ReactContext context) {
            l defaultConfigBuilder = getDefaultConfigBuilder(context);
            defaultConfigBuilder.getClass();
            return new o(defaultConfigBuilder);
        }

        @JvmStatic
        @NotNull
        public final l getDefaultConfigBuilder(@NotNull ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new SystraceRequestListener());
            U okHttpClient = OkHttpClientProvider.createClient();
            CookieJar cookieJar = okHttpClient.f40663o;
            Intrinsics.f(cookieJar, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
            ((CookieJarContainer) cookieJar).setCookieJar(new f(new ForwardingCookieHandler()));
            Context context2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            l lVarNewBuilder = o.f36052D.newBuilder(context2);
            lVarNewBuilder.f36045c = new e(okHttpClient);
            lVarNewBuilder.f36045c = new ReactOkHttpNetworkFetcher(okHttpClient);
            i downsampleMode = i.f36027b;
            Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
            lVarNewBuilder.f36044b = downsampleMode;
            lVarNewBuilder.f36046d = hashSet;
            p this$0 = lVarNewBuilder.f36049g;
            this$0.getClass();
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f36088g = true;
            Unit unit = Unit.f38893a;
            return lVarNewBuilder;
        }

        @JvmStatic
        public final boolean hasBeenInitialized() {
            return FrescoModule.hasBeenInitialized;
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }

    @JvmStatic
    @NotNull
    public static final l getDefaultConfigBuilder(@NotNull ReactContext reactContext) {
        return INSTANCE.getDefaultConfigBuilder(reactContext);
    }

    private final k getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = a.w();
        }
        return this.pipeline;
    }

    @JvmStatic
    public static final boolean hasBeenInitialized() {
        return INSTANCE.hasBeenInitialized();
    }

    @Override // com.facebook.react.modules.common.ModuleDataCleaner.Cleanable
    public void clearSensitiveData() {
        k imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            com.palmpay.lib.bridgewrapper.photo.upload.a aVar = new com.palmpay.lib.bridgewrapper.photo.upload.a(28);
            imagePipeline.f36037f.removeAll(aVar);
            imagePipeline.f36038g.removeAll(aVar);
            Object obj = imagePipeline.f36034c.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            DiskCachesStore diskCachesStore = (DiskCachesStore) obj;
            diskCachesStore.getMainBufferedDiskCache().b();
            diskCachesStore.getSmallImageBufferedDiskCache().b();
            Iterator it = diskCachesStore.getDynamicBufferedDiskCaches().entrySet().iterator();
            while (it.hasNext()) {
                ((d) ((Map.Entry) it.next()).getValue()).b();
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        boolean z3;
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactApplicationContext.addLifecycleEventListener(this);
        Companion companion = INSTANCE;
        if (!companion.hasBeenInitialized()) {
            o defaultConfig = this.config;
            if (defaultConfig == null) {
                defaultConfig = companion.getDefaultConfig(reactApplicationContext);
            }
            Z4.a aVar = new Z4.a(1);
            Intrinsics.checkNotNullExpressionValue(aVar, "newBuilder(...)");
            Context applicationContext = reactApplicationContext.getApplicationContext();
            b bVar = new b(aVar);
            p181m3.a.a();
            if (a.f37381d) {
                p229p2.a.s(a.class, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            } else {
                a.f37381d = true;
            }
            synchronized (D3.a.class) {
                z3 = D3.a.f1585a != null;
            }
            if (!z3) {
                p181m3.a.a();
                try {
                    try {
                        try {
                            try {
                                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, applicationContext);
                            } catch (InvocationTargetException unused) {
                                D3.a.l(new g(1));
                            }
                        } catch (NoSuchMethodException unused2) {
                            D3.a.l(new g(1));
                        }
                    } catch (ClassNotFoundException unused3) {
                        D3.a.l(new g(1));
                    } catch (IllegalAccessException unused4) {
                        D3.a.l(new g(1));
                    }
                    p181m3.a.a();
                } catch (Throwable th) {
                    p181m3.a.a();
                    throw th;
                }
            }
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (defaultConfig == null) {
                synchronized (s.class) {
                    p181m3.a.a();
                    l lVarNewBuilder = o.f36052D.newBuilder(applicationContext2);
                    lVarNewBuilder.getClass();
                    s.h(new o(lVarNewBuilder));
                    p181m3.a.a();
                }
            } else {
                s.h(defaultConfig);
            }
            p181m3.a.a();
            c cVar = new c(applicationContext2, bVar);
            a.f37380c = cVar;
            SimpleDraweeView.f21339b = cVar;
            p181m3.a.a();
            p181m3.a.a();
            hasBeenInitialized = true;
        } else if (this.config != null) {
            p229p2.a.v("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        k imagePipeline;
        if (INSTANCE.hasBeenInitialized() && this.clearOnDestroy && (imagePipeline = getImagePipeline()) != null) {
            com.palmpay.lib.bridgewrapper.photo.upload.a aVar = new com.palmpay.lib.bridgewrapper.photo.upload.a(28);
            imagePipeline.f36037f.removeAll(aVar);
            imagePipeline.f36038g.removeAll(aVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, @Nullable k kVar) {
        this(reactApplicationContext, kVar, false, false, 12, null);
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, @Nullable k kVar, boolean z3) {
        this(reactApplicationContext, kVar, z3, false, 8, null);
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, boolean z3) {
        this(reactApplicationContext, z3, null, 4, null);
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z3, o oVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i7 & 2) != 0 ? true : z3, (i7 & 4) != 0 ? null : oVar);
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, boolean z3, @Nullable o oVar) {
        super(reactApplicationContext);
        this.clearOnDestroy = z3;
        this.config = oVar;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, k kVar, boolean z3, boolean z8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, kVar, (i7 & 4) != 0 ? true : z3, (i7 & 8) != 0 ? false : z8);
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, @Nullable k kVar, boolean z3, boolean z8) {
        this(reactApplicationContext, z3, null, 4, null);
        this.pipeline = kVar;
        if (z8) {
            hasBeenInitialized = true;
        }
    }
}
