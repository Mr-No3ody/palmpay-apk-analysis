package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableDouble extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new g(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f16416b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeDouble(this.f16416b);
    }
}
