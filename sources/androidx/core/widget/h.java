package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        NestedScrollView.SavedState savedState = new NestedScrollView.SavedState(parcel);
        savedState.f16338a = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new NestedScrollView.SavedState[i7];
    }
}
