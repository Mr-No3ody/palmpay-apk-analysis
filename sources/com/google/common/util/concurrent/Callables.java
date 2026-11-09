package com.google.common.util.concurrent;

import com.didiglobal.booster.instrument.ShadowThread;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Callables {
    private Callables() {
    }

    @Beta
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable() { // from class: com.google.common.util.concurrent.e
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                return listeningExecutorService.submit(callable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$returning$0(Object obj) throws Exception {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$threadRenaming$2(Supplier supplier, Callable callable) throws Exception {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) supplier.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$threadRenaming$3(Supplier supplier, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) supplier.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    public static <T> Callable<T> returning(@ParametricNullness final T t) {
        return new Callable() { // from class: com.google.common.util.concurrent.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.lambda$returning$0(t);
            }
        };
    }

    @GwtIncompatible
    public static <T> Callable<T> threadRenaming(final Callable<T> callable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: com.google.common.util.concurrent.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.lambda$threadRenaming$2(supplier, callable);
            }
        };
    }

    @GwtIncompatible
    private static boolean trySetName(String str, Thread thread) {
        try {
            thread.setName(ShadowThread.makeThreadName(str, "\u200bcom.google.common.util.concurrent.Callables"));
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @GwtIncompatible
    public static Runnable threadRenaming(Runnable runnable, Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new c(1, supplier, runnable);
    }
}
