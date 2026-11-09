package com.transsnet.adsdk.utils;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p219o8.b;
import p219o8.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007J*\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/transsnet/adsdk/utils/CoroutineUtil;", "", "<init>", "()V", "asyncRun", "", "block", "Ljava/lang/Runnable;", "exceptionHandler", "Ljava/util/function/Consumer;", "", "asyncRunWith", "executor", "Ljava/util/concurrent/Executor;", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoroutineUtil {

    @NotNull
    public static final CoroutineUtil INSTANCE = new CoroutineUtil();

    private CoroutineUtil() {
    }

    @JvmStatic
    public static final void asyncRun(@NotNull Runnable block, @Nullable Consumer<Throwable> exceptionHandler) {
        Intrinsics.checkNotNullParameter(block, "block");
        AbstractC0780y.m(V.f10828a, I.f10809a, null, new b(block, exceptionHandler, null), 2);
    }

    public static /* synthetic */ void asyncRun$default(Runnable runnable, Consumer consumer, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            consumer = null;
        }
        asyncRun(runnable, consumer);
    }

    @JvmStatic
    @RequiresApi(24)
    public static final void asyncRunWith(@NotNull Executor executor, @NotNull Runnable block, @Nullable Consumer<Throwable> exceptionHandler) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        AbstractC0780y.m(V.f10828a, AbstractC0780y.h(executor), null, new c(block, exceptionHandler, null), 2);
    }

    public static /* synthetic */ void asyncRunWith$default(Executor executor, Runnable runnable, Consumer consumer, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            consumer = null;
        }
        asyncRunWith(executor, runnable, consumer);
    }
}
