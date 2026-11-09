package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableList<E> asList;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;

        @VisibleForTesting
        @CheckForNull
        Object[] hashTable;

        public Builder() {
            super(4);
        }

        private void addDeduping(E e10) {
            Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length - 1;
            int iHashCode = e10.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i7 = iSmear & length;
                Object[] objArr = this.hashTable;
                Object obj = objArr[i7];
                if (obj == null) {
                    objArr[i7] = e10;
                    this.hashCode += iHashCode;
                    super.add((Object) e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    iSmear = i7 + 1;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<E> combine(Builder<E> builder) {
            if (this.hashTable == null) {
                addAll(builder.contents, builder.size);
                return this;
            }
            for (int i7 = 0; i7 < builder.size; i7++) {
                Object obj = builder.contents[i7];
                Objects.requireNonNull(obj);
                add(obj);
            }
            return this;
        }

        public Builder(int i7) {
            super(i7);
            this.hashTable = new Object[ImmutableSet.chooseTableSize(i7)];
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetConstruct;
            int i7 = this.size;
            if (i7 == 0) {
                return ImmutableSet.of();
            }
            if (i7 == 1) {
                Object obj = this.contents[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.hashTable == null || ImmutableSet.chooseTableSize(i7) != this.hashTable.length) {
                immutableSetConstruct = ImmutableSet.construct(this.size, this.contents);
                this.size = immutableSetConstruct.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.shouldTrim(this.size, this.contents.length) ? Arrays.copyOf(this.contents, this.size) : this.contents;
                int i10 = this.hashCode;
                Object[] objArr = this.hashTable;
                immutableSetConstruct = new RegularImmutableSet<>(objArrCopyOf, i10, objArr, objArr.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return immutableSetConstruct;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.hashTable != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((Object) it.next());
                }
                return this;
            }
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e10) {
            Preconditions.checkNotNull(e10);
            if (this.hashTable != null && ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(e10);
                return this;
            }
            this.hashTable = null;
            super.add((Object) e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add((Object) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            if (this.hashTable != null) {
                for (E e10 : eArr) {
                    add((Object) e10);
                }
                return this;
            }
            super.add((Object[]) eArr);
            return this;
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    @Beta
    public static <E> Builder<E> builderWithExpectedSize(int i7) {
        CollectPreconditions.checkNonnegative(i7, "expectedSize");
        return new Builder<>(i7);
    }

    @VisibleForTesting
    public static int chooseTableSize(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= CUTOFF) {
            Preconditions.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i7, Object... objArr) {
        if (i7 == 0) {
            return of();
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iChooseTableSize = chooseTableSize(i7);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i10 = iChooseTableSize - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object objCheckElementNotNull = ObjectArrays.checkElementNotNull(objArr[i13], i13);
            int iHashCode = objCheckElementNotNull.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i14 = iSmear & i10;
                Object obj2 = objArr2[i14];
                if (obj2 == null) {
                    objArr[i12] = objCheckElementNotNull;
                    objArr2[i14] = objCheckElementNotNull;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj2.equals(objCheckElementNotNull)) {
                    break;
                }
                iSmear++;
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (chooseTableSize(i12) < iChooseTableSize / 2) {
            return construct(i12, objArr);
        }
        if (shouldTrim(i12, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new RegularImmutableSet(objArr, i11, objArr2, i10, i12);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i7, int i10) {
        return i7 < (i10 >> 1) + (i10 >> 2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListCreateAsList = createAsList();
        this.asList = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableSet<E> of(E e10) {
        return new SingletonImmutableSet(e10);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11) {
        return construct(2, e10, e11);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12) {
        return construct(3, e10, e11, e12);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13) {
        return construct(4, e10, e11, e12, e13);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13, E e14) {
        return construct(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
