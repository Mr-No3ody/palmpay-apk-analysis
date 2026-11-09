package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableBoolean extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new g(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16413b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16413b ? 1 : 0);
    }
}
