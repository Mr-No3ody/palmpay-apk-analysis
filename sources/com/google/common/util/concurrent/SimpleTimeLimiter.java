package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class SimpleTimeLimiter implements TimeLimiter {
    private final ExecutorService executor;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1, reason: invalid class name */
    public class AnonymousClass1 implements InvocationHandler {
        final /* synthetic */ Set val$interruptibleMethods;
        final /* synthetic */ Object val$target;
        final /* synthetic */ long val$timeoutDuration;
        final /* synthetic */ TimeUnit val$timeoutUnit;

        public AnonymousClass1(Object obj, long j6, TimeUnit timeUnit, Set set) {
            this.val$target = obj;
            this.val$timeoutDuration = j6;
            this.val$timeoutUnit = timeUnit;
            this.val$interruptibleMethods = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$invoke$0(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                throw SimpleTimeLimiter.throwCause(e10, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object obj, final Method method, @CheckForNull final Object[] objArr) throws Throwable {
            final Object obj2 = this.val$target;
            return SimpleTimeLimiter.this.callWithTimeout(new Callable() { // from class: com.google.common.util.concurrent.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimpleTimeLimiter.AnonymousClass1.lambda$invoke$0(method, obj2, objArr);
                }
            }, this.val$timeoutDuration, this.val$timeoutUnit, this.val$interruptibleMethods.contains(method));
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
        this.executor = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T callWithTimeout(Callable<T> callable, long j6, TimeUnit timeUnit, boolean z3) throws Exception {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j6);
        Future<T> futureSubmit = this.executor.submit(callable);
        try {
            if (!z3) {
                return (T) Uninterruptibles.getUninterruptibly(futureSubmit, j6, timeUnit);
            }
            try {
                return futureSubmit.get(j6, timeUnit);
            } catch (InterruptedException e10) {
                futureSubmit.cancel(true);
                throw e10;
            }
        } catch (ExecutionException e11) {
            throw throwCause(e11, true);
        } catch (TimeoutException e12) {
            futureSubmit.cancel(true);
            throw new UncheckedTimeoutException(e12);
        }
    }

    private static void checkPositiveTimeout(long j6) {
        Preconditions.checkArgument(j6 > 0, "timeout must be positive: %s", j6);
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        return new SimpleTimeLimiter(executorService);
    }

    private static boolean declaresInterruptedEx(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> findInterruptibleMethods(Class<?> cls) {
        HashSet hashSetNewHashSet = Sets.newHashSet();
        for (Method method : cls.getMethods()) {
            if (declaresInterruptedEx(method)) {
                hashSetNewHashSet.add(method);
            }
        }
        return hashSetNewHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception throwCause(Exception exc, boolean z3) throws Exception {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z3) {
            cause.setStackTrace((StackTraceElement[]) ObjectArrays.concat(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable th) throws ExecutionException {
        if (th instanceof Error) {
            throw new ExecutionError((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw new ExecutionException(th);
        }
        throw new UncheckedExecutionException(th);
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable th) {
        if (!(th instanceof Error)) {
            throw new UncheckedExecutionException(th);
        }
        throw new ExecutionError((Error) th);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j6, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j6);
        Future<T> futureSubmit = this.executor.submit(callable);
        try {
            return (T) Uninterruptibles.getUninterruptibly(futureSubmit, j6, timeUnit);
        } catch (ExecutionException e10) {
            wrapAndThrowExecutionExceptionOrError(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j6, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j6);
        Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) newProxy(cls, new AnonymousClass1(t, j6, timeUnit, findInterruptibleMethods(cls)));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j6, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j6);
        Future<?> futureSubmit = this.executor.submit(runnable);
        try {
            Uninterruptibles.getUninterruptibly(futureSubmit, j6, timeUnit);
        } catch (ExecutionException e10) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j6, TimeUnit timeUnit) throws Throwable {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j6);
        Future<?> futureSubmit = this.executor.submit(runnable);
        try {
            futureSubmit.get(j6, timeUnit);
        } catch (InterruptedException e10) {
            e = e10;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e11) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            e = e12;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    private static <T> T newProxy(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callWithTimeout(Callable<T> callable, long j6, TimeUnit timeUnit) throws Throwable {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j6);
        Future<T> futureSubmit = this.executor.submit(callable);
        try {
            return futureSubmit.get(j6, timeUnit);
        } catch (InterruptedException e10) {
            e = e10;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e11) {
            wrapAndThrowExecutionExceptionOrError(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            e = e12;
            futureSubmit.cancel(true);
            throw e;
        }
    }
}
