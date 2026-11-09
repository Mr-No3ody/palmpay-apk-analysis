package androidx.recyclerview.widget;

import C0.G;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.F;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        SparseArray<NestedAdapterWrapper> mGlobalTypeToWrapper = new SparseArray<>();
        int mNextViewType = 0;

        public class WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper mWrapper;
            private SparseIntArray mLocalToGlobalMapping = new SparseIntArray(1);
            private SparseIntArray mGlobalToLocalMapping = new SparseIntArray(1);

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                IsolatedViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i7) {
                int iIndexOfKey = this.mGlobalToLocalMapping.indexOfKey(i7);
                if (iIndexOfKey >= 0) {
                    return this.mGlobalToLocalMapping.valueAt(iIndexOfKey);
                }
                StringBuilder sbE = F.e(i7, "requested global type ", " does not belong to the adapter:");
                sbE.append(this.mWrapper.adapter);
                throw new IllegalStateException(sbE.toString());
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i7) {
                int iIndexOfKey = this.mLocalToGlobalMapping.indexOfKey(i7);
                if (iIndexOfKey > -1) {
                    return this.mLocalToGlobalMapping.valueAt(iIndexOfKey);
                }
                int iObtainViewType = IsolatedViewTypeStorage.this.obtainViewType(this.mWrapper);
                this.mLocalToGlobalMapping.put(i7, iObtainViewType);
                this.mGlobalToLocalMapping.put(iObtainViewType, i7);
                return iObtainViewType;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public NestedAdapterWrapper getWrapperForGlobalType(int i7) {
            NestedAdapterWrapper nestedAdapterWrapper = this.mGlobalTypeToWrapper.get(i7);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new IllegalArgumentException(G.m(i7, "Cannot find the wrapper for global view type "));
        }

        public int obtainViewType(NestedAdapterWrapper nestedAdapterWrapper) {
            int i7 = this.mNextViewType;
            this.mNextViewType = i7 + 1;
            this.mGlobalTypeToWrapper.put(i7, nestedAdapterWrapper);
            return i7;
        }

        public void removeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                if (this.mGlobalTypeToWrapper.valueAt(size) == nestedAdapterWrapper) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        SparseArray<List<NestedAdapterWrapper>> mGlobalTypeToWrapper = new SparseArray<>();

        public class WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper mWrapper;

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                SharedIdRangeViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i7) {
                return i7;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i7) {
                List<NestedAdapterWrapper> arrayList = SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.get(i7);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.put(i7, arrayList);
                }
                if (!arrayList.contains(this.mWrapper)) {
                    arrayList.add(this.mWrapper);
                }
                return i7;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public NestedAdapterWrapper getWrapperForGlobalType(int i7) {
            List<NestedAdapterWrapper> list = this.mGlobalTypeToWrapper.get(i7);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(G.m(i7, "Cannot find the wrapper for global view type "));
            }
            return list.get(0);
        }

        public void removeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                List<NestedAdapterWrapper> listValueAt = this.mGlobalTypeToWrapper.valueAt(size);
                if (listValueAt.remove(nestedAdapterWrapper) && listValueAt.isEmpty()) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i7);

        int localToGlobal(int i7);
    }

    @NonNull
    ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper);

    @NonNull
    NestedAdapterWrapper getWrapperForGlobalType(int i7);
}
