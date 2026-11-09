package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        final Callback<T2> mWrappedCallback;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t3, T2 t8) {
            return this.mWrappedCallback.areContentsTheSame(t3, t8);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t3, T2 t8) {
            return this.mWrappedCallback.areItemsTheSame(t3, t8);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t3, T2 t8) {
            return this.mWrappedCallback.compare(t3, t8);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t3, T2 t8) {
            return this.mWrappedCallback.getChangePayload(t3, t8);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i7, int i10) {
            this.mBatchingListUpdateCallback.onChanged(i7, i10, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i7, int i10) {
            this.mBatchingListUpdateCallback.onInserted(i7, i10);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i7, int i10) {
            this.mBatchingListUpdateCallback.onMoved(i7, i10);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i7, int i10) {
            this.mBatchingListUpdateCallback.onRemoved(i7, i10);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i7, int i10, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i7, i10, obj);
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t3, T2 t8);

        public abstract boolean areItemsTheSame(T2 t3, T2 t8);

        @Override // java.util.Comparator
        public abstract int compare(T2 t3, T2 t8);

        @Nullable
        public Object getChangePayload(T2 t3, T2 t8) {
            return null;
        }

        public abstract void onChanged(int i7, int i10);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i7, int i10, Object obj) {
            onChanged(i7, i10);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iSortAndDedup = sortAndDedup(tArr);
        if (this.mSize != 0) {
            merge(tArr, iSortAndDedup);
            return;
        }
        this.mData = tArr;
        this.mSize = iSortAndDedup;
        this.mCallback.onInserted(0, iSortAndDedup);
    }

    private void addToData(int i7, T t) {
        int i10 = this.mSize;
        if (i7 > i10) {
            StringBuilder sbE = F.e(i7, "cannot add item to ", " because size is ");
            sbE.append(this.mSize);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        T[] tArr = this.mData;
        if (i10 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
            System.arraycopy(this.mData, 0, tArr2, 0, i7);
            tArr2[i7] = t;
            System.arraycopy(this.mData, i7, tArr2, i7 + 1, this.mSize - i7);
            this.mData = tArr2;
        } else {
            System.arraycopy(tArr, i7, tArr, i7 + 1, i10 - i7);
            this.mData[i7] = t;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t, T[] tArr, int i7, int i10, int i11) {
        while (i7 < i10) {
            int i12 = (i7 + i10) / 2;
            T t3 = tArr[i12];
            int iCompare = this.mCallback.compare(t3, t);
            if (iCompare < 0) {
                i7 = i12 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.mCallback.areItemsTheSame(t3, t)) {
                        int iLinearEqualitySearch = linearEqualitySearch(t, i12, i7, i10);
                        if (i11 != 1 || iLinearEqualitySearch != -1) {
                            return iLinearEqualitySearch;
                        }
                    }
                    return i12;
                }
                i10 = i12;
            }
        }
        if (i11 == 1) {
            return i7;
        }
        return -1;
    }

    private int findSameItem(T t, T[] tArr, int i7, int i10) {
        while (i7 < i10) {
            if (this.mCallback.areItemsTheSame(tArr[i7], t)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t, int i7, int i10, int i11) {
        T t3;
        for (int i12 = i7 - 1; i12 >= i10; i12--) {
            T t8 = this.mData[i12];
            if (this.mCallback.compare(t8, t) != 0) {
                break;
            }
            if (this.mCallback.areItemsTheSame(t8, t)) {
                return i12;
            }
        }
        do {
            i7++;
            if (i7 >= i11) {
                return -1;
            }
            t3 = this.mData[i7];
            if (this.mCallback.compare(t3, t) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t3, t));
        return i7;
    }

    private void merge(T[] tArr, int i7) {
        boolean z3 = this.mCallback instanceof BatchedCallback;
        if (!z3) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i10 = 0;
        this.mOldDataStart = 0;
        int i11 = this.mSize;
        this.mOldDataSize = i11;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i11 + i7 + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i12 = this.mOldDataStart;
            int i13 = this.mOldDataSize;
            if (i12 >= i13 && i10 >= i7) {
                break;
            }
            if (i12 == i13) {
                int i14 = i7 - i10;
                System.arraycopy(tArr, i10, this.mData, this.mNewDataStart, i14);
                int i15 = this.mNewDataStart + i14;
                this.mNewDataStart = i15;
                this.mSize += i14;
                this.mCallback.onInserted(i15 - i14, i14);
                break;
            }
            if (i10 == i7) {
                int i16 = i13 - i12;
                System.arraycopy(this.mOldData, i12, this.mData, this.mNewDataStart, i16);
                this.mNewDataStart += i16;
                break;
            }
            T t = this.mOldData[i12];
            T t3 = tArr[i10];
            int iCompare = this.mCallback.compare(t, t3);
            if (iCompare > 0) {
                T[] tArr2 = this.mData;
                int i17 = this.mNewDataStart;
                this.mNewDataStart = i17 + 1;
                tArr2[i17] = t3;
                this.mSize++;
                i10++;
                this.mCallback.onInserted(i17, 1);
            } else if (iCompare == 0 && this.mCallback.areItemsTheSame(t, t3)) {
                T[] tArr3 = this.mData;
                int i18 = this.mNewDataStart;
                this.mNewDataStart = i18 + 1;
                tArr3[i18] = t3;
                i10++;
                this.mOldDataStart++;
                if (!this.mCallback.areContentsTheSame(t, t3)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t, t3));
                }
            } else {
                T[] tArr4 = this.mData;
                int i19 = this.mNewDataStart;
                this.mNewDataStart = i19 + 1;
                tArr4[i19] = t;
                this.mOldDataStart++;
            }
        }
        this.mOldData = null;
        if (z3) {
            return;
        }
        endBatchedUpdates();
    }

    private void removeItemAtIndex(int i7, boolean z3) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i7 + 1, tArr, i7, (this.mSize - i7) - 1);
        int i10 = this.mSize - 1;
        this.mSize = i10;
        this.mData[i10] = null;
        if (z3) {
            this.mCallback.onRemoved(i7, 1);
        }
    }

    private void replaceAllInsert(T t) {
        T[] tArr = this.mData;
        int i7 = this.mNewDataStart;
        tArr[i7] = t;
        this.mNewDataStart = i7 + 1;
        this.mSize++;
        this.mCallback.onInserted(i7, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z3 = this.mCallback instanceof BatchedCallback;
        if (!z3) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int iSortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, iSortAndDedup));
        while (true) {
            int i7 = this.mNewDataStart;
            if (i7 >= iSortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i10 = this.mOldDataStart;
            int i11 = this.mOldDataSize;
            if (i10 >= i11) {
                int i12 = iSortAndDedup - i7;
                System.arraycopy(tArr, i7, this.mData, i7, i12);
                this.mNewDataStart += i12;
                this.mSize += i12;
                this.mCallback.onInserted(i7, i12);
                break;
            }
            if (i7 >= iSortAndDedup) {
                int i13 = i11 - i10;
                this.mSize -= i13;
                this.mCallback.onRemoved(i7, i13);
                break;
            }
            T t = this.mOldData[i10];
            T t3 = tArr[i7];
            int iCompare = this.mCallback.compare(t, t3);
            if (iCompare < 0) {
                replaceAllRemove();
            } else if (iCompare > 0) {
                replaceAllInsert(t3);
            } else if (this.mCallback.areItemsTheSame(t, t3)) {
                T[] tArr2 = this.mData;
                int i14 = this.mNewDataStart;
                tArr2[i14] = t3;
                this.mOldDataStart++;
                this.mNewDataStart = i14 + 1;
                if (!this.mCallback.areContentsTheSame(t, t3)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t, t3));
                }
            } else {
                replaceAllRemove();
                replaceAllInsert(t3);
            }
        }
        this.mOldData = null;
        if (z3) {
            return;
        }
        endBatchedUpdates();
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i7 = 0;
        int i10 = 1;
        for (int i11 = 1; i11 < tArr.length; i11++) {
            T t = tArr[i11];
            if (this.mCallback.compare(tArr[i7], t) == 0) {
                int iFindSameItem = findSameItem(t, tArr, i7, i10);
                if (iFindSameItem != -1) {
                    tArr[iFindSameItem] = t;
                } else {
                    if (i10 != i11) {
                        tArr[i10] = t;
                    }
                    i10++;
                }
            } else {
                if (i10 != i11) {
                    tArr[i10] = t;
                }
                i7 = i10;
                i10++;
            }
        }
        return i10;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t) {
        throwIfInMutationOperation();
        return add(t, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z3) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z3) {
            addAllInternal(tArr);
        } else {
            addAllInternal(copyArray(tArr));
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void clear() {
        throwIfInMutationOperation();
        int i7 = this.mSize;
        if (i7 == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i7, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i7);
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    public T get(int i7) throws IndexOutOfBoundsException {
        int i10;
        if (i7 < this.mSize && i7 >= 0) {
            T[] tArr = this.mOldData;
            return (tArr == null || i7 < (i10 = this.mNewDataStart)) ? this.mData[i7] : tArr[(i7 - i10) + this.mOldDataStart];
        }
        StringBuilder sbE = F.e(i7, "Asked to get item at ", " but size is ");
        sbE.append(this.mSize);
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    public int indexOf(T t) {
        if (this.mOldData == null) {
            return findIndexOf(t, this.mData, 0, this.mSize, 4);
        }
        int iFindIndexOf = findIndexOf(t, this.mData, 0, this.mNewDataStart, 4);
        if (iFindIndexOf != -1) {
            return iFindIndexOf;
        }
        int iFindIndexOf2 = findIndexOf(t, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
        if (iFindIndexOf2 != -1) {
            return (iFindIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
        }
        return -1;
    }

    public void recalculatePositionOfItemAt(int i7) {
        throwIfInMutationOperation();
        T t = get(i7);
        removeItemAtIndex(i7, false);
        int iAdd = add(t, false);
        if (i7 != iAdd) {
            this.mCallback.onMoved(i7, iAdd);
        }
    }

    public boolean remove(T t) {
        throwIfInMutationOperation();
        return remove(t, true);
    }

    public T removeItemAt(int i7) {
        throwIfInMutationOperation();
        T t = get(i7);
        removeItemAtIndex(i7, true);
        return t;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z3) {
        throwIfInMutationOperation();
        if (z3) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i7, T t) {
        throwIfInMutationOperation();
        T t3 = get(i7);
        boolean z3 = t3 == t || !this.mCallback.areContentsTheSame(t3, t);
        if (t3 != t && this.mCallback.compare(t3, t) == 0) {
            this.mData[i7] = t;
            if (z3) {
                Callback callback = this.mCallback;
                callback.onChanged(i7, 1, callback.getChangePayload(t3, t));
                return;
            }
            return;
        }
        if (z3) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i7, 1, callback2.getChangePayload(t3, t));
        }
        removeItemAtIndex(i7, false);
        int iAdd = add(t, false);
        if (i7 != iAdd) {
            this.mCallback.onMoved(i7, iAdd);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i7) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i7));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t, boolean z3) {
        int iFindIndexOf = findIndexOf(t, this.mData, 0, this.mSize, 1);
        if (iFindIndexOf == -1) {
            iFindIndexOf = 0;
        } else if (iFindIndexOf < this.mSize) {
            T t3 = this.mData[iFindIndexOf];
            if (this.mCallback.areItemsTheSame(t3, t)) {
                if (this.mCallback.areContentsTheSame(t3, t)) {
                    this.mData[iFindIndexOf] = t;
                    return iFindIndexOf;
                }
                this.mData[iFindIndexOf] = t;
                Callback callback = this.mCallback;
                callback.onChanged(iFindIndexOf, 1, callback.getChangePayload(t3, t));
                return iFindIndexOf;
            }
        }
        addToData(iFindIndexOf, t);
        if (z3) {
            this.mCallback.onInserted(iFindIndexOf, 1);
        }
        return iFindIndexOf;
    }

    private boolean remove(T t, boolean z3) {
        int iFindIndexOf = findIndexOf(t, this.mData, 0, this.mSize, 2);
        if (iFindIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(iFindIndexOf, z3);
        return true;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }
}
