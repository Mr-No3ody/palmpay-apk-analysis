package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    public abstract class Itr<T> implements Iterator<T> {
        int index = 0;
        int toRemove = -1;

        public Itr() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.index < EnumMultiset.this.enumConstants.length) {
                int[] iArr = EnumMultiset.this.counts;
                int i7 = this.index;
                if (iArr[i7] > 0) {
                    return true;
                }
                this.index = i7 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tOutput = output(this.index);
            int i7 = this.index;
            this.toRemove = i7;
            this.index = i7 + 1;
            return tOutput;
        }

        public abstract T output(int i7);

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.toRemove >= 0);
            if (EnumMultiset.this.counts[this.toRemove] > 0) {
                EnumMultiset.access$210(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.access$322(enumMultiset, enumMultiset.counts[this.toRemove]);
                EnumMultiset.this.counts[this.toRemove] = 0;
            }
            this.toRemove = -1;
        }
    }

    private EnumMultiset(Class<E> cls) {
        this.type = cls;
        Preconditions.checkArgument(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int i7 = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i7 - 1;
        return i7;
    }

    public static /* synthetic */ long access$322(EnumMultiset enumMultiset, long j6) {
        long j10 = enumMultiset.size - j6;
        enumMultiset.size = j10;
        return j10;
    }

    private void checkIsE(Object obj) {
        Preconditions.checkNotNull(obj);
        if (isActuallyE(obj)) {
            return;
        }
        String strValueOf = String.valueOf(this.type);
        String strValueOf2 = String.valueOf(obj);
        throw new ClassCastException(com.airbnb.lottie.model.layer.d.k("Expected an ", strValueOf2.length() + strValueOf.length() + 21, strValueOf, " but got ", strValueOf2));
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    private boolean isActuallyE(@CheckForNull Object obj) {
        if (obj instanceof Enum) {
            Enum r10 = (Enum) obj;
            int iOrdinal = r10.ordinal();
            E[] eArr = this.enumConstants;
            if (iOrdinal < eArr.length && eArr[iOrdinal] == r10) {
                return true;
            }
        }
        return false;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        Serialization.populateMultiset(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        Serialization.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return this.distinctElements;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        return new EnumMultiset<E>.Itr<E>() { // from class: com.google.common.collect.EnumMultiset.1
            @Override // com.google.common.collect.EnumMultiset.Itr
            public E output(int i7) {
                return (E) EnumMultiset.this.enumConstants[i7];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.EnumMultiset.2
            @Override // com.google.common.collect.EnumMultiset.Itr
            public Multiset.Entry<E> output(final int i7) {
                return new Multisets.AbstractEntry<E>() { // from class: com.google.common.collect.EnumMultiset.2.1
                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return EnumMultiset.this.counts[i7];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public E getElement() {
                        return (E) EnumMultiset.this.enumConstants[i7];
                    }
                };
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@CheckForNull Object obj, int i7) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        Enum r3 = (Enum) obj;
        CollectPreconditions.checkNonnegative(i7, "occurrences");
        if (i7 == 0) {
            return count(obj);
        }
        int iOrdinal = r3.ordinal();
        int[] iArr = this.counts;
        int i10 = iArr[iOrdinal];
        if (i10 == 0) {
            return 0;
        }
        if (i10 > i7) {
            iArr[iOrdinal] = i10 - i7;
            this.size -= (long) i7;
            return i10;
        }
        iArr[iOrdinal] = 0;
        this.distinctElements--;
        this.size -= (long) i10;
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(this.size);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        Iterables.addAll(enumMultiset, iterable);
        return enumMultiset;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e10, int i7) {
        checkIsE(e10);
        CollectPreconditions.checkNonnegative(i7, "occurrences");
        if (i7 == 0) {
            return count(e10);
        }
        int iOrdinal = e10.ordinal();
        int i10 = this.counts[iOrdinal];
        long j6 = i7;
        long j10 = ((long) i10) + j6;
        Preconditions.checkArgument(j10 <= 2147483647L, "too many occurrences: %s", j10);
        this.counts[iOrdinal] = (int) j10;
        if (i10 == 0) {
            this.distinctElements++;
        }
        this.size += j6;
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean setCount(@ParametricNullness Object obj, int i7, int i10) {
        return super.setCount(obj, i7, i10);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e10, int i7) {
        checkIsE(e10);
        CollectPreconditions.checkNonnegative(i7, CodePushConstants.LATEST_ROLLBACK_COUNT_KEY);
        int iOrdinal = e10.ordinal();
        int[] iArr = this.counts;
        int i10 = iArr[iOrdinal];
        iArr[iOrdinal] = i7;
        this.size += (long) (i7 - i10);
        if (i10 == 0 && i7 > 0) {
            this.distinctElements++;
            return i10;
        }
        if (i10 > 0 && i7 == 0) {
            this.distinctElements--;
        }
        return i10;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetCreate = create(cls);
        Iterables.addAll(enumMultisetCreate, iterable);
        return enumMultisetCreate;
    }
}
