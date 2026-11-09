package com.google.common.base;

import N8.q0;
import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Suppliers {

    @VisibleForTesting
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;

        @CheckForNull
        volatile transient T value;

        public ExpiringMemoizingSupplier(Supplier<T> supplier, long j6, TimeUnit timeUnit) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
            this.durationNanos = timeUnit.toNanos(j6);
            Preconditions.checkArgument(j6 > 0, "duration (%s %s) must be > 0", j6, timeUnit);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            long j6 = this.expirationNanos;
            long jSystemNanoTime = Platform.systemNanoTime();
            if (j6 == 0 || jSystemNanoTime - j6 >= 0) {
                synchronized (this) {
                    try {
                        if (j6 == this.expirationNanos) {
                            T t = this.delegate.get();
                            this.value = t;
                            long j10 = jSystemNanoTime + this.durationNanos;
                            if (j10 == 0) {
                                j10 = 1;
                            }
                            this.expirationNanos = j10;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.delegate);
            long j6 = this.durationNanos;
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 62);
            sb2.append("Suppliers.memoizeWithExpiration(");
            sb2.append(strValueOf);
            sb2.append(", ");
            return q0.n(sb2, ", NANOS)", j6);
        }
    }

    @VisibleForTesting
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        volatile transient boolean initialized;

        @CheckForNull
        transient T value;

        public MemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    try {
                        if (!this.initialized) {
                            T t = this.delegate.get();
                            this.value = t;
                            this.initialized = true;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object objI;
            if (this.initialized) {
                String strValueOf = String.valueOf(this.value);
                objI = d.i(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
            } else {
                objI = this.delegate;
            }
            String strValueOf2 = String.valueOf(objI);
            return d.i(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
        }
    }

    @VisibleForTesting
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        @CheckForNull
        volatile Supplier<T> delegate;
        volatile boolean initialized;

        @CheckForNull
        T value;

        public NonSerializableMemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    try {
                        if (!this.initialized) {
                            Supplier<T> supplier = this.delegate;
                            java.util.Objects.requireNonNull(supplier);
                            T t = supplier.get();
                            this.value = t;
                            this.initialized = true;
                            this.delegate = null;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object objI = this.delegate;
            if (objI == null) {
                String strValueOf = String.valueOf(this.value);
                objI = d.i(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
            }
            String strValueOf2 = String.valueOf(objI);
            return d.i(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
        }
    }

    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        public SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
            this.function = (Function) Preconditions.checkNotNull(function);
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.function, this.supplier);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.function);
            String strValueOf2 = String.valueOf(this.supplier);
            StringBuilder sbP = d.p("Suppliers.compose(", strValueOf2.length() + strValueOf.length() + 21, strValueOf, ", ", strValueOf2);
            sbP.append(")");
            return sbP.toString();
        }
    }

    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    public enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // com.google.common.base.Function
        @CheckForNull
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }
    }

    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final T instance;

        public SupplierOfInstance(@ParametricNullness T t) {
            this.instance = t;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.instance);
            return d.i(strValueOf.length() + 22, "Suppliers.ofInstance(", strValueOf, ")");
        }
    }

    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;

        public ThreadSafeSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.delegate);
            return d.i(strValueOf.length() + 32, "Suppliers.synchronizedSupplier(", strValueOf, ")");
        }
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        if ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) {
            return supplier;
        }
        return supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j6, TimeUnit timeUnit) {
        return new ExpiringMemoizingSupplier(supplier, j6, timeUnit);
    }

    public static <T> Supplier<T> ofInstance(@ParametricNullness T t) {
        return new SupplierOfInstance(t);
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return SupplierFunctionImpl.INSTANCE;
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new ThreadSafeSupplier(supplier);
    }
}
