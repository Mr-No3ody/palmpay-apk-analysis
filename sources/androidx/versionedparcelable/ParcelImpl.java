package androidx.versionedparcelable;

import S0.b;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.databinding.g;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({c.f39800a})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new g(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VersionedParcelable f18221a;

    public ParcelImpl(Parcel parcel) {
        this.f18221a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new b(parcel).i(this.f18221a);
    }
}
