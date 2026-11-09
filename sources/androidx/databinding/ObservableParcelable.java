package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableParcelable<T extends Parcelable> extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new g(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Parcelable f16420b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f16420b, 0);
    }
}
