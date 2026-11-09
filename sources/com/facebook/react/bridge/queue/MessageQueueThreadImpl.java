package com.facebook.react.bridge.queue;

import C0.G;
import N8.q0;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.didiglobal.booster.instrument.ShadowThread;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.flexibank.sdk.g;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "name", "", "looper", "Landroid/os/Looper;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "stats", "Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "<init>", "(Ljava/lang/String;Landroid/os/Looper;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;)V", "getName", "()Ljava/lang/String;", "getLooper", "()Landroid/os/Looper;", "handler", "Lcom/facebook/react/bridge/queue/MessageQueueThreadHandler;", "assertionErrorMessage", "isFinished", "", "runOnQueue", "runnable", "Ljava/lang/Runnable;", "callOnQueue", "Ljava/util/concurrent/Future;", "T", "callable", "Ljava/util/concurrent/Callable;", "isOnThread", "assertIsOnThread", "", "message", "quitSynchronous", "getPerfStats", "resetPerfStats", "isIdle", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageQueueThreadImpl implements MessageQueueThread {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String assertionErrorMessage;

    @NotNull
    private final MessageQueueThreadHandler handler;
    private volatile boolean isFinished;

    @NotNull
    private final Looper looper;

    @NotNull
    private final String name;

    @Nullable
    private final MessageQueueThreadPerfStats stats;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$Companion;", "", "<init>", "()V", "assignToPerfStats", "", "stats", "Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "wall", "", "cpu", "create", "Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "spec", "Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "createForMainThread", "name", "", "startNewBackgroundThread", "stackSize", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageQueueThreadSpec.ThreadType.values().length];
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assignToPerfStats(MessageQueueThreadPerfStats stats, long wall, long cpu) {
            if (stats != null) {
                stats.wallTime = wall;
                stats.cpuTime = cpu;
            }
        }

        private final MessageQueueThreadImpl createForMainThread(String name, QueueThreadExceptionHandler exceptionHandler) {
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
            return new MessageQueueThreadImpl(name, mainLooper, exceptionHandler, null, 8, null);
        }

        private final MessageQueueThreadImpl startNewBackgroundThread(String name, long stackSize, QueueThreadExceptionHandler exceptionHandler) throws RuntimeException {
            Looper looper;
            SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
            ShadowThread.setThreadName(new ShadowThread(null, new b(simpleSettableFuture, 20), G.o("mqt_", name), stackSize, "\u200bcom.facebook.react.bridge.queue.MessageQueueThreadImpl$Companion"), "\u200bcom.facebook.react.bridge.queue.MessageQueueThreadImpl$Companion").start();
            Pair pair = (Pair) simpleSettableFuture.getOrThrow();
            if (pair == null || (looper = (Looper) pair.first) == null) {
                throw new RuntimeException("Looper not found for thread");
            }
            return new MessageQueueThreadImpl(name, looper, exceptionHandler, (MessageQueueThreadPerfStats) pair.second, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startNewBackgroundThread$lambda$1(SimpleSettableFuture simpleSettableFuture) {
            Process.setThreadPriority(-4);
            Looper.prepare();
            MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
            MessageQueueThreadImpl.INSTANCE.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
            simpleSettableFuture.set(new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
            Looper.loop();
        }

        @JvmStatic
        @NotNull
        public final MessageQueueThreadImpl create(@NotNull MessageQueueThreadSpec spec, @NotNull QueueThreadExceptionHandler exceptionHandler) throws RuntimeException {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            int i7 = WhenMappings.$EnumSwitchMapping$0[spec.getThreadType().ordinal()];
            if (i7 == 1) {
                return createForMainThread(spec.getName(), exceptionHandler);
            }
            if (i7 == 2) {
                return startNewBackgroundThread(spec.getName(), spec.getStackSize(), exceptionHandler);
            }
            throw new l();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler, messageQueueThreadPerfStats);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callOnQueue$lambda$0(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        try {
            simpleSettableFuture.set(callable.call());
        } catch (Exception e10) {
            simpleSettableFuture.setException(e10);
        }
    }

    @JvmStatic
    @NotNull
    public static final MessageQueueThreadImpl create(@NotNull MessageQueueThreadSpec messageQueueThreadSpec, @NotNull QueueThreadExceptionHandler queueThreadExceptionHandler) throws RuntimeException {
        return INSTANCE.create(messageQueueThreadSpec, queueThreadExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetPerfStats$lambda$1(MessageQueueThreadImpl messageQueueThreadImpl) {
        INSTANCE.assignToPerfStats(messageQueueThreadImpl.stats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() throws AssertionException {
        SoftAssertions.assertCondition(isOnThread(), this.assertionErrorMessage);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @NotNull
    public <T> Future<T> callOnQueue(@NotNull Callable<T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new g(28, simpleSettableFuture, callable));
        return simpleSettableFuture;
    }

    @NotNull
    public final Looper getLooper() {
        return this.looper;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @Nullable
    /* JADX INFO: renamed from: getPerfStats, reason: from getter */
    public MessageQueueThreadPerfStats getStats() {
        return this.stats;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.looper.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.looper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() throws RuntimeException {
        this.isFinished = true;
        this.looper.quit();
        if (this.looper.getThread() != Thread.currentThread()) {
            try {
                this.looper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException(G.o("Got interrupted waiting to join thread ", this.name));
            }
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        INSTANCE.assignToPerfStats(this.stats, -1L, -1L);
        runOnQueue(new b(this, 19));
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (!this.isFinished) {
            this.handler.post(runnable);
            return true;
        }
        a.v("ReactNative", "Tried to enqueue runnable on already finished thread: '" + this.name + "... dropping Runnable.");
        return false;
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.name = str;
        this.looper = looper;
        this.stats = messageQueueThreadPerfStats;
        this.handler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.assertionErrorMessage = q0.k("Expected to be called from the '", str, "' thread!");
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(@NotNull String message) throws AssertionException {
        Intrinsics.checkNotNullParameter(message, "message");
        boolean zIsOnThread = isOnThread();
        String str = this.assertionErrorMessage + " " + message;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        SoftAssertions.assertCondition(zIsOnThread, str);
    }

    public /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler, (i7 & 8) != 0 ? null : messageQueueThreadPerfStats);
    }
}
