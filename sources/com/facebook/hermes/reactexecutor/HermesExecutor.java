package com.facebook.hermes.reactexecutor;

import C0.G;
import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/hermes/reactexecutor/HermesExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesExecutor extends JavaScriptExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f21402b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @DoNotStrip
        private final HybridData initHybrid(boolean z3, String str, long j6) {
            return HermesExecutor.initHybrid(z3, str, j6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        @DoNotStrip
        public final HybridData initHybridDefaultConfig(boolean z3, String str) {
            return HermesExecutor.b(str, z3);
        }

        @JvmStatic
        public final void loadLibrary() throws UnsatisfiedLinkError {
            if (HermesExecutor.f21402b == null) {
                SoLoader.j("hermes");
                SoLoader.j("hermes_executor");
                HermesExecutor.f21402b = ReactBuildConfig.DEBUG ? "Debug" : "Release";
            }
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f21401a = aVar;
        aVar.loadLibrary();
    }

    public static final /* synthetic */ HybridData b(String str, boolean z3) {
        return initHybridDefaultConfig(z3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    @DoNotStrip
    public static final native HybridData initHybrid(boolean z3, String str, long j6);

    @JvmStatic
    @DoNotStrip
    private static final native HybridData initHybridDefaultConfig(boolean z3, String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public final String getName() {
        return G.o("HermesExecutor", f21402b);
    }
}
