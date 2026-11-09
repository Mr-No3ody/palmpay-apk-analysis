package com.facebook.react.uimanager;

import H3.k;
import com.facebook.react.common.ClearableSynchronizedPool;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import p041ce.o;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/YogaNodePool;", "", "<init>", "()V", "Lcom/facebook/react/common/ClearableSynchronizedPool;", "LH3/k;", "get", "()Lcom/facebook/react/common/ClearableSynchronizedPool;", "pool$delegate", "Lkotlin/Lazy;", "getPool", "pool", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class YogaNodePool {

    @NotNull
    public static final YogaNodePool INSTANCE = new YogaNodePool();

    /* JADX INFO: renamed from: pool$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy pool;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("YogaNodePool", LegacyArchitectureLogLevel.ERROR);
        pool = C2131j.a(EnumC2132k.f43969a, new o(6));
    }

    private YogaNodePool() {
    }

    @JvmStatic
    @NotNull
    public static final ClearableSynchronizedPool<k> get() {
        return INSTANCE.getPool();
    }

    private final ClearableSynchronizedPool<k> getPool() {
        return (ClearableSynchronizedPool) pool.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearableSynchronizedPool pool_delegate$lambda$0() {
        return new ClearableSynchronizedPool(1024);
    }
}
