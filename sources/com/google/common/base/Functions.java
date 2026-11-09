package com.google.common.base;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Functions {

    public static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        private final E value;

        public ConstantFunction(@ParametricNullness E e10) {
            this.value = e10;
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public E apply(@CheckForNull Object obj) {
            return this.value;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof ConstantFunction) {
                return Objects.equal(this.value, ((ConstantFunction) obj).value);
            }
            return false;
        }

        public int hashCode() {
            E e10 = this.value;
            if (e10 == null) {
                return 0;
            }
            return e10.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.value);
            return d.i(strValueOf.length() + 20, "Functions.constant(", strValueOf, ")");
        }
    }

    public static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final V defaultValue;
        final Map<K, ? extends V> map;

        public ForMapWithDefault(Map<K, ? extends V> map, @ParametricNullness V v3) {
            this.map = (Map) Preconditions.checkNotNull(map);
            this.defaultValue = v3;
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k2) {
            V v3 = this.map.get(k2);
            return (v3 != null || this.map.containsKey(k2)) ? (V) NullnessCasts.uncheckedCastNullableTToT(v3) : this.defaultValue;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof ForMapWithDefault) {
                ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
                if (this.map.equals(forMapWithDefault.map) && Objects.equal(this.defaultValue, forMapWithDefault.defaultValue)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.map, this.defaultValue);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.map);
            String strValueOf2 = String.valueOf(this.defaultValue);
            StringBuilder sbP = d.p("Functions.forMap(", strValueOf2.length() + strValueOf.length() + 33, strValueOf, ", defaultValue=", strValueOf2);
            sbP.append(")");
            return sbP.toString();
        }
    }

    public static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Function<A, ? extends B> f22780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Function<B, C> f22781g;

        public FunctionComposition(Function<B, C> function, Function<A, ? extends B> function2) {
            this.f22781g = (Function) Preconditions.checkNotNull(function);
            this.f22780f = (Function) Preconditions.checkNotNull(function2);
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public C apply(@ParametricNullness A a3) {
            return (C) this.f22781g.apply(this.f22780f.apply(a3));
        }

        @Override // com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof FunctionComposition) {
                FunctionComposition functionComposition = (FunctionComposition) obj;
                if (this.f22780f.equals(functionComposition.f22780f) && this.f22781g.equals(functionComposition.f22781g)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f22780f.hashCode() ^ this.f22781g.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f22781g);
            String strValueOf2 = String.valueOf(this.f22780f);
            return d.k(strValueOf, strValueOf2.length() + strValueOf.length() + 2, "(", strValueOf2, ")");
        }
    }

    public static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final Map<K, V> map;

        public FunctionForMapNoDefault(Map<K, V> map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k2) {
            V v3 = this.map.get(k2);
            Preconditions.checkArgument(v3 != null || this.map.containsKey(k2), "Key '%s' not present in map", k2);
            return (V) NullnessCasts.uncheckedCastNullableTToT(v3);
        }

        @Override // com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.map.equals(((FunctionForMapNoDefault) obj).map);
            }
            return false;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.map);
            return d.i(strValueOf.length() + 18, "Functions.forMap(", strValueOf, ")");
        }
    }

    public enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        @CheckForNull
        public Object apply(@CheckForNull Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    public static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final Predicate<T> predicate;

        @Override // com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.predicate.equals(((PredicateFunction) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.predicate);
            return d.i(strValueOf.length() + 24, "Functions.forPredicate(", strValueOf, ")");
        }

        private PredicateFunction(Predicate<T> predicate) {
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public Boolean apply(@ParametricNullness T t) {
            return Boolean.valueOf(this.predicate.apply(t));
        }
    }

    public static class SupplierFunction<F, T> implements Function<F, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<T> supplier;

        @Override // com.google.common.base.Function
        @ParametricNullness
        public T apply(@ParametricNullness F f10) {
            return this.supplier.get();
        }

        @Override // com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.supplier.equals(((SupplierFunction) obj).supplier);
            }
            return false;
        }

        public int hashCode() {
            return this.supplier.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.supplier);
            return d.i(strValueOf.length() + 23, "Functions.forSupplier(", strValueOf, ")");
        }

        private SupplierFunction(Supplier<T> supplier) {
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier);
        }
    }

    public enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // com.google.common.base.Function
        public String apply(Object obj) {
            Preconditions.checkNotNull(obj);
            return obj.toString();
        }
    }

    private Functions() {
    }

    public static <A, B, C> Function<A, C> compose(Function<B, C> function, Function<A, ? extends B> function2) {
        return new FunctionComposition(function, function2);
    }

    public static <E> Function<Object, E> constant(@ParametricNullness E e10) {
        return new ConstantFunction(e10);
    }

    public static <K, V> Function<K, V> forMap(Map<K, V> map) {
        return new FunctionForMapNoDefault(map);
    }

    public static <T> Function<T, Boolean> forPredicate(Predicate<T> predicate) {
        return new PredicateFunction(predicate);
    }

    public static <F, T> Function<F, T> forSupplier(Supplier<T> supplier) {
        return new SupplierFunction(supplier);
    }

    public static <E> Function<E, E> identity() {
        return IdentityFunction.INSTANCE;
    }

    public static Function<Object, String> toStringFunction() {
        return ToStringFunction.INSTANCE;
    }

    public static <K, V> Function<K, V> forMap(Map<K, ? extends V> map, @ParametricNullness V v3) {
        return new ForMapWithDefault(map, v3);
    }
}
