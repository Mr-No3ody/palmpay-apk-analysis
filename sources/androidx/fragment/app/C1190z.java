package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1190z implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new Fragment.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new Fragment.SavedState[i7];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Fragment.SavedState(parcel, classLoader);
    }
}
