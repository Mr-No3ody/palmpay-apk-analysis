package com.facebook.react.internal.turbomodule.core;

import N8.q0;
import androidx.annotation.GuardedBy;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 >2\u00020\u0001:\u0003<=>B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u000eH\u0003J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\u000eH\u0003J\u0012\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\u000eH\u0003J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010 \u001a\u00020\u000eH\u0003J\u0012\u0010*\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u000eH\u0016J\"\u0010+\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0017H\u0002J\u0010\u00102\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0016J+\u00103\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0005H\u0082 J\u0011\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0017H\u0082 J\b\u0010;\u001a\u000209H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u001eR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020$0/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006?"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "delegate", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "nativeMethodCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "<init>", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;)V", "eagerInitModuleNames", "", "", "getEagerInitModuleNames", "()Ljava/util/List;", "turboModuleProvider", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "legacyModuleProvider", "moduleCleanupLock", "Ljava/lang/Object;", "moduleCleanupStarted", "", "moduleHolders", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "()V", "isTurboModule", "moduleName", "isLegacyModule", "shouldEnableLegacyModuleInterop", "getLegacyJavaModule", "Lcom/facebook/react/bridge/NativeModule;", "getLegacyCxxModule", "Lcom/facebook/react/bridge/CxxModuleWrapper;", "getTurboLegacyCxxModule", "getTurboJavaModule", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "getModule", "getOrCreateModule", "moduleHolder", "shouldPerfLog", "modules", "", "getModules", "()Ljava/util/Collection;", "hasModule", "initHybrid", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "nativeMethodCallInvoker", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "tmmDelegate", "installJSIBindings", "", "shouldCreateLegacyModules", "invalidate", "ModuleHolder", "ModuleProvider", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTurboModuleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TurboModuleManager.kt\ncom/facebook/react/internal/turbomodule/core/TurboModuleManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n1#2:407\n1#2:418\n1617#3,9:408\n1869#3:417\n1870#3:419\n1626#3:420\n*S KotlinDebug\n*F\n+ 1 TurboModuleManager.kt\ncom/facebook/react/internal/turbomodule/core/TurboModuleManager\n*L\n304#1:418\n304#1:408,9\n304#1:417\n304#1:419\n304#1:420\n*E\n"})
public final class TurboModuleManager implements TurboModuleRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "TurboModuleManager";

    @Nullable
    private final TurboModuleManagerDelegate delegate;

    @NotNull
    private final List<String> eagerInitModuleNames;

    @NotNull
    private final ModuleProvider legacyModuleProvider;

    @DoNotStrip
    @NotNull
    private final HybridData mHybridData;

    @NotNull
    private final Object moduleCleanupLock;

    @GuardedBy("moduleCleanupLock")
    private boolean moduleCleanupStarted;

    @GuardedBy("moduleCleanupLock")
    @NotNull
    private final Map<String, ModuleHolder> moduleHolders;

    @NotNull
    private final ModuleProvider turboModuleProvider;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$Companion;", "", "<init>", "()V", "TAG", "", "getMethodDescriptorsFromModule", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        @DoNotStrip
        public final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule module) {
            return TurboModuleInteropUtils.getMethodDescriptorsFromModule(module);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", "", "<init>", "()V", "module", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "()Lcom/facebook/react/bridge/NativeModule;", "setModule", "(Lcom/facebook/react/bridge/NativeModule;)V", "value", "", "isCreatingModule", "()Z", "isDoneCreatingModule", "", "moduleId", "getModuleId", "()I", "startCreatingModule", "", "endCreatingModule", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModuleHolder {
        private static volatile int holderCount;
        private volatile boolean isCreatingModule;
        private volatile boolean isDoneCreatingModule;

        @Nullable
        private volatile NativeModule module;
        private volatile int moduleId = holderCount;

        public ModuleHolder() {
            holderCount++;
        }

        public final void endCreatingModule() {
            this.isCreatingModule = false;
            this.isDoneCreatingModule = true;
        }

        @Nullable
        public final NativeModule getModule() {
            return this.module;
        }

        public final int getModuleId() {
            return this.moduleId;
        }

        /* JADX INFO: renamed from: isCreatingModule, reason: from getter */
        public final boolean getIsCreatingModule() {
            return this.isCreatingModule;
        }

        /* JADX INFO: renamed from: isDoneCreatingModule, reason: from getter */
        public final boolean getIsDoneCreatingModule() {
            return this.isDoneCreatingModule;
        }

        public final void setModule(@Nullable NativeModule nativeModule) {
            this.module = nativeModule;
        }

        public final void startCreatingModule() {
            this.isCreatingModule = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ModuleProvider {
        @Nullable
        NativeModule getModule(@NotNull String name);
    }

    static {
        SoLoader.j("turbomodulejsijni");
    }

    public TurboModuleManager(@NotNull RuntimeExecutor runtimeExecutor, @Nullable TurboModuleManagerDelegate turboModuleManagerDelegate, @NotNull CallInvokerHolder jsCallInvokerHolder, @NotNull NativeMethodCallInvokerHolder nativeMethodCallInvokerHolder) {
        ModuleProvider moduleProvider;
        List<String> eagerInitModuleNames;
        Intrinsics.checkNotNullParameter(runtimeExecutor, "runtimeExecutor");
        Intrinsics.checkNotNullParameter(jsCallInvokerHolder, "jsCallInvokerHolder");
        Intrinsics.checkNotNullParameter(nativeMethodCallInvokerHolder, "nativeMethodCallInvokerHolder");
        this.delegate = turboModuleManagerDelegate;
        this.moduleCleanupLock = new Object();
        this.moduleHolders = new LinkedHashMap();
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) jsCallInvokerHolder, (NativeMethodCallInvokerHolderImpl) nativeMethodCallInvokerHolder, turboModuleManagerDelegate);
        installJSIBindings(shouldEnableLegacyModuleInterop());
        this.eagerInitModuleNames = (turboModuleManagerDelegate == null || (eagerInitModuleNames = turboModuleManagerDelegate.getEagerInitModuleNames()) == null) ? z.f38935a : eagerInitModuleNames;
        ModuleProvider aVar = new a();
        if (turboModuleManagerDelegate == null) {
            moduleProvider = aVar;
        } else {
            final int i7 = 0;
            moduleProvider = new ModuleProvider(this) { // from class: com.facebook.react.internal.turbomodule.core.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TurboModuleManager f21748b;

                {
                    this.f21748b = this;
                }

                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    switch (i7) {
                        case 0:
                            return TurboModuleManager._init_$lambda$1(this.f21748b, str);
                        default:
                            return TurboModuleManager._init_$lambda$3(this.f21748b, str);
                    }
                }
            };
        }
        this.turboModuleProvider = moduleProvider;
        if (turboModuleManagerDelegate != null && shouldEnableLegacyModuleInterop()) {
            final int i10 = 1;
            aVar = new ModuleProvider(this) { // from class: com.facebook.react.internal.turbomodule.core.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TurboModuleManager f21748b;

                {
                    this.f21748b = this;
                }

                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    switch (i10) {
                        case 0:
                            return TurboModuleManager._init_$lambda$1(this.f21748b, str);
                        default:
                            return TurboModuleManager._init_$lambda$3(this.f21748b, str);
                    }
                }
            };
        }
        this.legacyModuleProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$0(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$1(TurboModuleManager turboModuleManager, String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return (NativeModule) turboModuleManager.delegate.getModule(moduleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$3(TurboModuleManager turboModuleManager, String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        NativeModule legacyModule = turboModuleManager.delegate.getLegacyModule(moduleName);
        if (legacyModule == null) {
            return null;
        }
        if (legacyModule instanceof TurboModule) {
            throw new IllegalArgumentException(q0.k("NativeModule \"", moduleName, "\" is a TurboModule").toString());
        }
        return legacyModule;
    }

    @DoNotStrip
    private final CxxModuleWrapper getLegacyCxxModule(String moduleName) {
        if (!isLegacyModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if (!(module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }

    @DoNotStrip
    private final NativeModule getLegacyJavaModule(String moduleName) {
        if (!isLegacyModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return module;
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    @JvmStatic
    @DoNotStrip
    private static final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule nativeModule) {
        return INSTANCE.getMethodDescriptorsFromModule(nativeModule);
    }

    private final NativeModule getOrCreateModule(String moduleName, ModuleHolder moduleHolder, boolean shouldPerfLog) {
        boolean z3;
        NativeModule module;
        synchronized (moduleHolder) {
            try {
                if (moduleHolder.getIsDoneCreatingModule()) {
                    if (shouldPerfLog) {
                        TurboModulePerfLogger.moduleCreateCacheHit(moduleName, moduleHolder.getModuleId());
                    }
                    return moduleHolder.getModule();
                }
                boolean z8 = false;
                if (moduleHolder.getIsCreatingModule()) {
                    z3 = false;
                } else {
                    moduleHolder.startCreatingModule();
                    z3 = true;
                }
                Unit unit = Unit.f38893a;
                if (!z3) {
                    synchronized (moduleHolder) {
                        while (moduleHolder.getIsCreatingModule()) {
                            try {
                                moduleHolder.wait();
                            } catch (InterruptedException unused) {
                                z8 = true;
                            }
                        }
                        if (z8) {
                            Thread.currentThread().interrupt();
                        }
                        module = moduleHolder.getModule();
                    }
                    return module;
                }
                TurboModulePerfLogger.moduleCreateConstructStart(moduleName, moduleHolder.getModuleId());
                NativeModule module2 = this.turboModuleProvider.getModule(moduleName);
                if (module2 == null) {
                    module2 = this.legacyModuleProvider.getModule(moduleName);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(moduleName, moduleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(moduleName, moduleHolder.getModuleId());
                if (module2 != null) {
                    synchronized (moduleHolder) {
                        moduleHolder.setModule(module2);
                    }
                    module2.initialize();
                } else {
                    p229p2.a.j(TAG, "getOrCreateModule(): Unable to create module \"%s\" (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(moduleName, moduleHolder.getModuleId());
                synchronized (moduleHolder) {
                    moduleHolder.endCreatingModule();
                    moduleHolder.notifyAll();
                }
                return module2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @DoNotStrip
    private final TurboModule getTurboJavaModule(String moduleName) {
        if (!isTurboModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) || !(module instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) module;
    }

    @DoNotStrip
    private final CxxModuleWrapper getTurboLegacyCxxModule(String moduleName) {
        if (!isTurboModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) && (module instanceof TurboModule)) {
            return (CxxModuleWrapper) module;
        }
        return null;
    }

    private final native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl jsCallInvokerHolder, NativeMethodCallInvokerHolderImpl nativeMethodCallInvoker, TurboModuleManagerDelegate tmmDelegate);

    private final native void installJSIBindings(boolean shouldCreateLegacyModules);

    private final boolean isLegacyModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isLegacyModuleRegistered(moduleName);
    }

    private final boolean isTurboModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isModuleRegistered(moduleName);
    }

    private final boolean shouldEnableLegacyModuleInterop() {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    @NotNull
    public List<String> getEagerInitModuleNames() {
        return this.eagerInitModuleNames;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    @Nullable
    public NativeModule getModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        synchronized (this.moduleCleanupLock) {
            if (this.moduleCleanupStarted) {
                p229p2.a.j(TAG, "getModule(): Tried to get module \"%s\", but TurboModuleManager was tearing down (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                return null;
            }
            if (!this.moduleHolders.containsKey(moduleName)) {
                this.moduleHolders.put(moduleName, new ModuleHolder());
            }
            ModuleHolder moduleHolder = this.moduleHolders.get(moduleName);
            Unit unit = Unit.f38893a;
            if (moduleHolder == null) {
                p229p2.a.j(TAG, "getModule(): Tried to get module \"%s\", but moduleHolder was null", moduleName);
                return null;
            }
            ModuleHolder moduleHolder2 = moduleHolder;
            TurboModulePerfLogger.moduleCreateStart(moduleName, moduleHolder2.getModuleId());
            NativeModule orCreateModule = getOrCreateModule(moduleName, moduleHolder2, true);
            if (orCreateModule != null) {
                TurboModulePerfLogger.moduleCreateEnd(moduleName, moduleHolder2.getModuleId());
                return orCreateModule;
            }
            TurboModulePerfLogger.moduleCreateFail(moduleName, moduleHolder2.getModuleId());
            return orCreateModule;
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    @NotNull
    public Collection<NativeModule> getModules() {
        List<ModuleHolder> listY;
        NativeModule module;
        synchronized (this.moduleCleanupLock) {
            listY = CollectionsKt.Y(this.moduleHolders.values());
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : listY) {
            synchronized (listY) {
                module = moduleHolder.getModule();
            }
            if (module != null) {
                arrayList.add(module);
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(@NotNull String moduleName) {
        ModuleHolder moduleHolder;
        boolean z3;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        synchronized (this.moduleCleanupLock) {
            moduleHolder = this.moduleHolders.get(moduleName);
        }
        if (moduleHolder == null) {
            return false;
        }
        synchronized (moduleHolder) {
            z3 = moduleHolder.getModule() != null;
        }
        return z3;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public void invalidate() {
        synchronized (this.moduleCleanupLock) {
            this.moduleCleanupStarted = true;
            Unit unit = Unit.f38893a;
        }
        for (Map.Entry<String, ModuleHolder> entry : this.moduleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule(entry.getKey(), entry.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.moduleHolders.clear();
        this.mHybridData.resetNative();
    }
}
