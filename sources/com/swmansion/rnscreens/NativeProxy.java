package com.swmansion.rnscreens;

import M7.RunnableC0447g;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.fabric.FabricUIManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/swmansion/rnscreens/NativeProxy;", "", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "", "nativeAddMutationsListener", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "cleanupExpiredMountingCoordinators", "()V", "invalidateNative", "", "screenTag", "notifyScreenRemoved", "(I)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25273a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f25274b = new ConcurrentHashMap();

    @DoNotStrip
    @NotNull
    private final HybridData mHybridData = initHybrid();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addScreenToMap(int i7, @NotNull Screen view) {
            Intrinsics.checkNotNullParameter(view, "view");
            NativeProxy.f25274b.put(Integer.valueOf(i7), new WeakReference(view));
        }

        public final void clearMapOnInvalidate() {
            NativeProxy.f25274b.clear();
        }

        public final void removeScreenFromMap(int i7) {
            NativeProxy.f25274b.remove(Integer.valueOf(i7));
        }

        private a() {
        }
    }

    private final native HybridData initHybrid();

    public final native void cleanupExpiredMountingCoordinators();

    public final native void invalidateNative();

    public final native void nativeAddMutationsListener(@NotNull FabricUIManager fabricUIManager);

    @DoNotStrip
    public final void notifyScreenRemoved(int screenTag) {
        Screen screen;
        WeakReference weakReference = (WeakReference) f25274b.get(Integer.valueOf(screenTag));
        if (weakReference == null || (screen = (Screen) weakReference.get()) == null) {
            return;
        }
        screen.post(new RunnableC0447g(screen, 0));
    }
}
