package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.preference.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1220e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ListPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new ListPreference.SavedState[i7];
    }
}
