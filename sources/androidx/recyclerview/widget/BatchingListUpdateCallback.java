package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {
    private static final int TYPE_ADD = 1;
    private static final int TYPE_CHANGE = 3;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_REMOVE = 2;
    final ListUpdateCallback mWrapped;
    int mLastEventType = 0;
    int mLastEventPosition = -1;
    int mLastEventCount = -1;
    Object mLastEventPayload = null;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback) {
        this.mWrapped = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i7 = this.mLastEventType;
        if (i7 == 0) {
            return;
        }
        if (i7 == 1) {
            this.mWrapped.onInserted(this.mLastEventPosition, this.mLastEventCount);
        } else if (i7 == 2) {
            this.mWrapped.onRemoved(this.mLastEventPosition, this.mLastEventCount);
        } else if (i7 == 3) {
            this.mWrapped.onChanged(this.mLastEventPosition, this.mLastEventCount, this.mLastEventPayload);
        }
        this.mLastEventPayload = null;
        this.mLastEventType = 0;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i7, int i10, Object obj) {
        int i11;
        if (this.mLastEventType == 3) {
            int i12 = this.mLastEventPosition;
            int i13 = this.mLastEventCount;
            if (i7 <= i12 + i13 && (i11 = i7 + i10) >= i12 && this.mLastEventPayload == obj) {
                this.mLastEventPosition = Math.min(i7, i12);
                this.mLastEventCount = Math.max(i13 + i12, i11) - this.mLastEventPosition;
                return;
            }
        }
        dispatchLastEvent();
        this.mLastEventPosition = i7;
        this.mLastEventCount = i10;
        this.mLastEventPayload = obj;
        this.mLastEventType = 3;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i7, int i10) {
        int i11;
        if (this.mLastEventType == 1 && i7 >= (i11 = this.mLastEventPosition)) {
            int i12 = this.mLastEventCount;
            if (i7 <= i11 + i12) {
                this.mLastEventCount = i12 + i10;
                this.mLastEventPosition = Math.min(i7, i11);
                return;
            }
        }
        dispatchLastEvent();
        this.mLastEventPosition = i7;
        this.mLastEventCount = i10;
        this.mLastEventType = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i7, int i10) {
        dispatchLastEvent();
        this.mWrapped.onMoved(i7, i10);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i7, int i10) {
        int i11;
        if (this.mLastEventType == 2 && (i11 = this.mLastEventPosition) >= i7 && i11 <= i7 + i10) {
            this.mLastEventCount += i10;
            this.mLastEventPosition = i7;
        } else {
            dispatchLastEvent();
            this.mLastEventPosition = i7;
            this.mLastEventCount = i10;
            this.mLastEventType = 2;
        }
    }
}
