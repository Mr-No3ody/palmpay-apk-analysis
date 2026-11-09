package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class Joiner {
    private final String separator;

    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a3, Map<?, ?> map) throws IOException {
            return (A) appendTo(a3, map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }

        private MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Map<?, ?> map) {
            return appendTo(sb2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @Beta
        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a3, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo(a3, iterable.iterator());
        }

        @Beta
        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a3, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.checkNotNull(a3);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a3.append(this.joiner.toString(next.getKey()));
                a3.append(this.keyValueSeparator);
                a3.append(this.joiner.toString(next.getValue()));
                while (it.hasNext()) {
                    a3.append(this.joiner.separator);
                    Map.Entry<?, ?> next2 = it.next();
                    a3.append(this.joiner.toString(next2.getKey()));
                    a3.append(this.keyValueSeparator);
                    a3.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a3;
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb2, iterable.iterator());
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo(sb2, it);
                return sb2;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    private static Iterable<Object> iterable(@CheckForNull final Object obj, @CheckForNull final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            @CheckForNull
            public Object get(int i7) {
                if (i7 != 0) {
                    return i7 != 1 ? objArr[i7 - 2] : obj2;
                }
                return obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        };
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a3, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo(a3, iterable.iterator());
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a3, Iterator<? extends Object> it) throws IOException {
                Preconditions.checkNotNull(a3, "appendable");
                Preconditions.checkNotNull(it, "parts");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        a3.append(Joiner.this.toString(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a3.append(Joiner.this.separator);
                        a3.append(Joiner.this.toString(next2));
                    }
                }
                return a3;
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public CharSequence toString(@CheckForNull Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public CharSequence toString(@CheckForNull Object obj) {
                return obj == null ? str : Joiner.this.toString(obj);
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(char c6) {
        return withKeyValueSeparator(String.valueOf(c6));
    }

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    public static Joiner on(char c6) {
        return new Joiner(String.valueOf(c6));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a3, Iterator<? extends Object> it) throws IOException {
        Preconditions.checkNotNull(a3);
        if (it.hasNext()) {
            a3.append(toString(it.next()));
            while (it.hasNext()) {
                a3.append(this.separator);
                a3.append(toString(it.next()));
            }
        }
        return a3;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public final String join(@CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a3, Object[] objArr) throws IOException {
        return (A) appendTo(a3, Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a3, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) throws IOException {
        return (A) appendTo(a3, iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return appendTo(sb2, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            appendTo(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Object[] objArr) {
        return appendTo(sb2, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return appendTo(sb2, iterable(obj, obj2, objArr));
    }
}
