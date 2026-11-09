package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new PreferenceGroup.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new PreferenceGroup.SavedState[i7];
    }
}
