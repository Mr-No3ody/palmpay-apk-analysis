package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.ForOverride;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {

    @CheckForNull
    F function;

    @CheckForNull
    ListenableFuture<? extends I> inputFuture;

    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        public AsyncTransformFuture(ListenableFuture<? extends I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction) {
            super(listenableFuture, asyncFunction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public ListenableFuture<? extends O> doTransform(AsyncFunction<? super I, ? extends O> asyncFunction, @ParametricNullness I i7) throws Exception {
            ListenableFuture<? extends O> listenableFutureApply = asyncFunction.apply(i7);
            Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return listenableFutureApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public void setResult(ListenableFuture<? extends O> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        public TransformFuture(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
            super(listenableFuture, function);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public void setResult(@ParametricNullness O o10) {
            set(o10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @ParametricNullness
        public O doTransform(Function<? super I, ? extends O> function, @ParametricNullness I i7) {
            return function.apply(i7);
        }
    }

    public AbstractTransformFuture(ListenableFuture<? extends I> listenableFuture, F f10) {
        this.inputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.function = (F) Preconditions.checkNotNull(f10);
    }

    public static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        Preconditions.checkNotNull(executor);
        AsyncTransformFuture asyncTransformFuture = new AsyncTransformFuture(listenableFuture, asyncFunction);
        listenableFuture.addListener(asyncTransformFuture, MoreExecutors.rejectionPropagatingExecutor(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.function = null;
    }

    @ParametricNullness
    @ForOverride
    public abstract T doTransform(F f10, @ParametricNullness I i7) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public String pendingToString() {
        String strI;
        ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f10 = this.function;
        String strPendingToString = super.pendingToString();
        if (listenableFuture != null) {
            String strValueOf = String.valueOf(listenableFuture);
            strI = com.airbnb.lottie.model.layer.d.i(strValueOf.length() + 16, "inputFuture=[", strValueOf, "], ");
        } else {
            strI = "";
        }
        if (f10 != null) {
            String strValueOf2 = String.valueOf(f10);
            return com.airbnb.lottie.model.layer.d.k(strI, strValueOf2.length() + com.airbnb.lottie.model.layer.d.c(11, strI), "function=[", strValueOf2, "]");
        }
        if (strPendingToString == null) {
            return null;
        }
        String strValueOf3 = String.valueOf(strI);
        return strPendingToString.length() != 0 ? strValueOf3.concat(strPendingToString) : new String(strValueOf3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f10 = this.function;
        if ((isCancelled() | (listenableFuture == null)) || (f10 == null)) {
            return;
        }
        this.inputFuture = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objDoTransform = doTransform(f10, Futures.getDone(listenableFuture));
                this.function = null;
                setResult(objDoTransform);
            } catch (Throwable th) {
                try {
                    setException(th);
                } finally {
                    this.function = null;
                }
            }
        } catch (Error e10) {
            setException(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            setException(e11);
        } catch (ExecutionException e12) {
            setException(e12.getCause());
        }
    }

    @ForOverride
    public abstract void setResult(@ParametricNullness T t);

    public static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        TransformFuture transformFuture = new TransformFuture(listenableFuture, function);
        listenableFuture.addListener(transformFuture, MoreExecutors.rejectionPropagatingExecutor(executor, transformFuture));
        return transformFuture;
    }
}
