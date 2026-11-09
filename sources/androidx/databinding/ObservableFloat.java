package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new g(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16417b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f16417b);
    }
}
