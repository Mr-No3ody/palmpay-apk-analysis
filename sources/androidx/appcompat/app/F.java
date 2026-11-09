package androidx.appcompat.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return AppCompatDelegateImpl$PanelFeatureState$SavedState.c(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new AppCompatDelegateImpl$PanelFeatureState$SavedState[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return AppCompatDelegateImpl$PanelFeatureState$SavedState.c(parcel, null);
    }
}
