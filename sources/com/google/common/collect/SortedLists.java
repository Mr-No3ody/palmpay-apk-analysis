package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SortedLists {

    public enum KeyAbsentBehavior {
        NEXT_LOWER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i7) {
                return i7 - 1;
            }
        },
        NEXT_HIGHER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i7) {
                return i7;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i7) {
                return ~i7;
            }
        };

        public abstract int resultIndex(int i7);
    }

    public enum KeyPresentBehavior {
        ANY_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i7) {
                return i7;
            }
        },
        LAST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i7) {
                int size = list.size() - 1;
                while (i7 < size) {
                    int i10 = ((i7 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i10), e10) > 0) {
                        size = i10 - 1;
                    } else {
                        i7 = i10;
                    }
                }
                return i7;
            }
        },
        FIRST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i7) {
                int i10 = 0;
                while (i10 < i7) {
                    int i11 = (i10 + i7) >>> 1;
                    if (comparator.compare(list.get(i11), e10) < 0) {
                        i10 = i11 + 1;
                    } else {
                        i7 = i11;
                    }
                }
                return i10;
            }
        },
        FIRST_AFTER { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i7) {
                return KeyPresentBehavior.LAST_PRESENT.resultIndex(comparator, e10, list, i7) + 1;
            }
        },
        LAST_BEFORE { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i7) {
                return KeyPresentBehavior.FIRST_PRESENT.resultIndex(comparator, e10, list, i7) - 1;
            }
        };

        public abstract <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i7);
    }

    private SortedLists() {
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e10, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(e10);
        return binarySearch(list, e10, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, Function<? super E, K> function, K k2, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(k2);
        return binarySearch(list, function, k2, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K> int binarySearch(List<E> list, Function<? super E, K> function, @ParametricNullness K k2, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return binarySearch((List<? extends K>) Lists.transform(list, function), k2, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E> int binarySearch(List<? extends E> list, @ParametricNullness E e10, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(keyPresentBehavior);
        Preconditions.checkNotNull(keyAbsentBehavior);
        if (!(list instanceof RandomAccess)) {
            list = Lists.newArrayList(list);
        }
        int size = list.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i10 = (i7 + size) >>> 1;
            int iCompare = comparator.compare(e10, list.get(i10));
            if (iCompare < 0) {
                size = i10 - 1;
            } else {
                if (iCompare <= 0) {
                    return i7 + keyPresentBehavior.resultIndex(comparator, e10, list.subList(i7, size + 1), i10 - i7);
                }
                i7 = i10 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i7);
    }
}
