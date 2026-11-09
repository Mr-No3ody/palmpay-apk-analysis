package com.facebook.react.bridge;

import E.AbstractC0198c;
import android.os.Trace;
import androidx.annotation.GuardedBy;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.d;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\nJ\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010'\u001a\u00020\u0006H\u0002J\u0012\u0010(\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u00020\u000e8G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010!\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u0011\u0010$\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder;", "", "moduleInfo", "Lcom/facebook/react/module/model/ReactModuleInfo;", "provider", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", "<init>", "(Lcom/facebook/react/module/model/ReactModuleInfo;Ljavax/inject/Provider;)V", "nativeModule", "(Lcom/facebook/react/bridge/NativeModule;)V", "instanceKey", "", "name", "", "getName", "()Ljava/lang/String;", "reactModuleInfo", "internalModule", "initializable", "", "isCreating", "isInitializing", "markInitializable", "", "markInitializable$ReactAndroid_release", "hasInstance", "hasInstance$ReactAndroid_release", "destroy", "canOverrideExistingModule", "getCanOverrideExistingModule", "()Z", "isTurboModule", "isCxxModule", "className", "getClassName", "module", "getModule", "()Lcom/facebook/react/bridge/NativeModule;", "create", "doInitialize", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModuleHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleHolder.kt\ncom/facebook/react/bridge/ModuleHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
public final class ModuleHolder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger instanceKeyCounter = new AtomicInteger(1);

    @GuardedBy("this")
    private boolean initializable;
    private final int instanceKey;

    @GuardedBy("this")
    @Nullable
    private NativeModule internalModule;

    @GuardedBy("this")
    private boolean isCreating;

    @GuardedBy("this")
    private boolean isInitializing;

    @NotNull
    private final String name;

    @Nullable
    private Provider<? extends NativeModule> provider;

    @NotNull
    private final ReactModuleInfo reactModuleInfo;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder$Companion;", "", "<init>", "()V", "instanceKeyCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ModuleHolder(@NotNull ReactModuleInfo moduleInfo, @NotNull Provider<? extends NativeModule> provider) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        this.name = moduleInfo.getName();
        this.provider = provider;
        this.reactModuleInfo = moduleInfo;
        if (moduleInfo.getNeedsEagerInit()) {
            this.internalModule = create();
        }
    }

    private final NativeModule create() {
        boolean z3 = false;
        SoftAssertions.assertCondition(this.internalModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.name, this.instanceKey);
        d dVarD = AbstractC0198c.d("ModuleHolder.createModule");
        dVarD.c(this.name, "name");
        dVarD.e();
        p375z2.a tag = A2.a.f33c;
        Object[] args = {this.name};
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("NativeModule init: %s", "message");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Provider<? extends NativeModule> provider = this.provider;
            if (provider == null) {
                throw new IllegalStateException("Required value was null.");
            }
            NativeModule nativeModule = provider.get();
            Intrinsics.checkNotNullExpressionValue(nativeModule, "get(...)");
            NativeModule nativeModule2 = nativeModule;
            this.provider = null;
            synchronized (this) {
                try {
                    this.internalModule = nativeModule2;
                    if (this.initializable && !this.isInitializing) {
                        z3 = true;
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                doInitialize(nativeModule2);
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.name, this.instanceKey);
            Trace.endSection();
            return nativeModule2;
        } catch (Throwable th2) {
            try {
                String str = this.name;
                p229p2.b bVar = p229p2.a.f41180a;
                if (bVar.isLoggable(6)) {
                    bVar.e("ReactNative", "Failed to create NativeModule '" + str + "'", th2);
                }
                throw th2;
            } catch (Throwable th3) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.name, this.instanceKey);
                Trace.endSection();
                throw th3;
            }
        }
    }

    private final void doInitialize(NativeModule module) {
        boolean z3;
        d dVarD = AbstractC0198c.d("ModuleHolder.initialize");
        dVarD.c(this.name, "name");
        dVarD.e();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.name, this.instanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.initializable || this.isInitializing) {
                        z3 = false;
                    } else {
                        z3 = true;
                        this.isInitializing = true;
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                if (module != null) {
                    module.initialize();
                }
                synchronized (this) {
                    this.isInitializing = false;
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.name, this.instanceKey);
            Trace.endSection();
        } catch (Throwable th2) {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.name, this.instanceKey);
            Trace.endSection();
            throw th2;
        }
    }

    public final synchronized void destroy() {
        NativeModule nativeModule = this.internalModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public final boolean getCanOverrideExistingModule() {
        return this.reactModuleInfo.getCanOverrideExistingModule();
    }

    @NotNull
    public final String getClassName() {
        return this.reactModuleInfo.getClassName();
    }

    @DoNotStrip
    @NotNull
    public final NativeModule getModule() {
        boolean z3;
        NativeModule nativeModule;
        synchronized (this) {
            try {
                NativeModule nativeModule2 = this.internalModule;
                if (nativeModule2 != null) {
                    return nativeModule2;
                }
                if (this.isCreating) {
                    z3 = false;
                } else {
                    z3 = true;
                    this.isCreating = true;
                }
                Unit unit = Unit.f38893a;
                if (z3) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.isCreating = false;
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.internalModule;
                        if (nativeModule != null || !this.isCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (nativeModule == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return nativeModule;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @DoNotStrip
    @NotNull
    public final String getName() {
        return this.name;
    }

    public final synchronized boolean hasInstance$ReactAndroid_release() {
        return this.internalModule != null;
    }

    public final boolean isCxxModule() {
        return this.reactModuleInfo.getIsCxxModule();
    }

    public final boolean isTurboModule() {
        return this.reactModuleInfo.getIsTurboModule();
    }

    public final void markInitializable$ReactAndroid_release() {
        boolean z3;
        NativeModule nativeModule;
        synchronized (this) {
            z3 = true;
            try {
                this.initializable = true;
                nativeModule = this.internalModule;
                if (nativeModule == null) {
                    z3 = false;
                    nativeModule = null;
                } else if (this.isInitializing) {
                    throw new IllegalStateException("Check failed.");
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            if (nativeModule == null) {
                throw new IllegalStateException("Required value was null.");
            }
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(@NotNull NativeModule nativeModule) {
        Intrinsics.checkNotNullParameter(nativeModule, "nativeModule");
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        String name = nativeModule.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.name = name;
        String name2 = nativeModule.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        String simpleName = nativeModule.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.reactModuleInfo = new ReactModuleInfo(name2, simpleName, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.INSTANCE.classIsTurboModule(nativeModule.getClass()));
        this.internalModule = nativeModule;
        p375z2.a tag = A2.a.f33c;
        Object[] args = {name};
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("NativeModule init: %s", "message");
        Intrinsics.checkNotNullParameter(args, "args");
    }
}
