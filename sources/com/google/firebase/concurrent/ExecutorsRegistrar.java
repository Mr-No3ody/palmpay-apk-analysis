package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final Lazy<ScheduledExecutorService> BG_EXECUTOR = new Lazy<>((Provider) new g(0));
    static final Lazy<ScheduledExecutorService> LITE_EXECUTOR = new Lazy<>((Provider) new g(1));
    static final Lazy<ScheduledExecutorService> BLOCKING_EXECUTOR = new Lazy<>((Provider) new g(2));
    static final Lazy<ScheduledExecutorService> SCHEDULER = new Lazy<>((Provider) new g(3));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i7 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i7 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i7) {
        return new CustomThreadFactory(str, i7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(ComponentContainer componentContainer) {
        return BG_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(ComponentContainer componentContainer) {
        return BLOCKING_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(ComponentContainer componentContainer) {
        return LITE_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor lambda$getComponents$7(ComponentContainer componentContainer) {
        return UiExecutor.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$0() {
        return scheduled(ShadowExecutors.newOptimizedFixedThreadPool(4, factory("Firebase Background", 10, bgPolicy()), "\u200bcom.google.firebase.concurrent.ExecutorsRegistrar"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$1() {
        return scheduled(ShadowExecutors.newOptimizedFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), factory("Firebase Lite", 0, litePolicy()), "\u200bcom.google.firebase.concurrent.ExecutorsRegistrar"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$2() {
        return scheduled(ShadowExecutors.newOptimizedCachedThreadPool(factory("Firebase Blocking", 11), "\u200bcom.google.firebase.concurrent.ExecutorsRegistrar"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$3() {
        return ShadowExecutors.newOptimizedSingleThreadScheduledExecutor(factory("Firebase Scheduler", 0), "\u200bcom.google.firebase.concurrent.ExecutorsRegistrar");
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new DelegatingScheduledExecutorService(executorService, SCHEDULER.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new L4.a(5)).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new L4.a(6)).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new L4.a(7)).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new L4.a(8)).build());
    }

    private static ThreadFactory factory(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return new CustomThreadFactory(str, i7, threadPolicy);
    }
}
