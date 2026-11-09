package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SlidingPaneLayout.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new SlidingPaneLayout.SavedState[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SlidingPaneLayout.SavedState(parcel);
    }
}
