package com.google.common.base;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Predicates {

    public static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            for (int i7 = 0; i7 < this.components.size(); i7++) {
                if (!this.components.get(i7).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.components);
        }

        private AndPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }
    }

    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Function<A, ? extends B> f22782f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final Predicate<B> f22783p;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness A a3) {
            return this.f22783p.apply(this.f22782f.apply(a3));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f22782f.equals(compositionPredicate.f22782f) && this.f22783p.equals(compositionPredicate.f22783p)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f22782f.hashCode() ^ this.f22783p.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f22783p);
            String strValueOf2 = String.valueOf(this.f22782f);
            return d.k(strValueOf, strValueOf2.length() + strValueOf.length() + 2, "(", strValueOf2, ")");
        }

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f22783p = (Predicate) Preconditions.checkNotNull(predicate);
            this.f22782f = (Function) Preconditions.checkNotNull(function);
        }
    }

    @GwtIncompatible
    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        public ContainsPatternFromStringPredicate(String str) {
            super(Platform.compilePattern(str));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
            String strPattern = this.pattern.pattern();
            return d.i(d.c(28, strPattern), "Predicates.containsPattern(", strPattern, ")");
        }
    }

    @GwtIncompatible
    public static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final CommonPattern pattern;

        public ContainsPatternPredicate(CommonPattern commonPattern) {
            this.pattern = (CommonPattern) Preconditions.checkNotNull(commonPattern);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
                if (Objects.equal(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) && this.pattern.flags() == containsPatternPredicate.pattern.flags()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.pattern.pattern(), Integer.valueOf(this.pattern.flags()));
        }

        public String toString() {
            String string = MoreObjects.toStringHelper(this.pattern).add("pattern", this.pattern.pattern()).add("pattern.flags", this.pattern.flags()).toString();
            return d.i(d.c(21, string), "Predicates.contains(", string, ")");
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(CharSequence charSequence) {
            return this.pattern.matcher(charSequence).find();
        }
    }

    public static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.target);
            return d.i(strValueOf.length() + 15, "Predicates.in(", strValueOf, ")");
        }

        private InPredicate(Collection<?> collection) {
            this.target = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    @GwtIncompatible
    public static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            return this.clazz.isInstance(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.clazz == ((InstanceOfPredicate) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            String name = this.clazz.getName();
            return d.i(name.length() + 23, "Predicates.instanceOf(", name, ")");
        }

        private InstanceOfPredicate(Class<?> cls) {
            this.clazz = (Class) Preconditions.checkNotNull(cls);
        }
    }

    public static class IsEqualToPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Object target;

        @Override // com.google.common.base.Predicate
        public boolean apply(@CheckForNull Object obj) {
            return this.target.equals(obj);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.target);
            return d.i(strValueOf.length() + 20, "Predicates.equalTo(", strValueOf, ")");
        }

        public <T> Predicate<T> withNarrowedType() {
            return this;
        }

        private IsEqualToPredicate(Object obj) {
            this.target = obj;
        }
    }

    public static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Predicate<T> predicate;

        public NotPredicate(Predicate<T> predicate) {
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            return !this.predicate.apply(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.predicate);
            return d.i(strValueOf.length() + 16, "Predicates.not(", strValueOf, ")");
        }
    }

    public enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public boolean apply(@CheckForNull Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public boolean apply(@CheckForNull Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public boolean apply(@CheckForNull Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public boolean apply(@CheckForNull Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        public <T> Predicate<T> withNarrowedType() {
            return this;
        }
    }

    public static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            for (int i7 = 0; i7 < this.components.size(); i7++) {
                if (this.components.get(i7).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof OrPredicate) {
                return this.components.equals(((OrPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.components);
        }

        private OrPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }
    }

    @GwtIncompatible
    public static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        @Override // com.google.common.base.Predicate
        public boolean equals(@CheckForNull Object obj) {
            return (obj instanceof SubtypeOfPredicate) && this.clazz == ((SubtypeOfPredicate) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            String name = this.clazz.getName();
            return d.i(name.length() + 22, "Predicates.subtypeOf(", name, ")");
        }

        private SubtypeOfPredicate(Class<?> cls) {
            this.clazz = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysFalse() {
        return ObjectPredicate.ALWAYS_FALSE.withNarrowedType();
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysTrue() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new AndPredicate(defensiveCopy(iterable));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function);
    }

    @GwtIncompatible("java.util.regex.Pattern")
    public static Predicate<CharSequence> contains(Pattern pattern) {
        return new ContainsPatternPredicate(new JdkPattern(pattern));
    }

    @GwtIncompatible
    public static Predicate<CharSequence> containsPattern(String str) {
        return new ContainsPatternFromStringPredicate(str);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@ParametricNullness T t) {
        return t == null ? isNull() : new IsEqualToPredicate(t).withNarrowedType();
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    @GwtIncompatible
    public static <T> Predicate<T> instanceOf(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> isNull() {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> notNull() {
        return ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new OrPredicate(defensiveCopy(iterable));
    }

    @Beta
    @GwtIncompatible
    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new SubtypeOfPredicate(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z3 = true;
        for (Object obj : iterable) {
            if (!z3) {
                sb2.append(',');
            }
            sb2.append(obj);
            z3 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new AndPredicate(defensiveCopy(predicateArr));
    }

    public static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new OrPredicate(defensiveCopy(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new AndPredicate(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new OrPredicate(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }
}
