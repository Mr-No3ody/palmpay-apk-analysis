package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.databinding.g;
import p119i.b;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({c.f39802c})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new g(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IResultReceiver f11981a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f11981a == null) {
                    this.f11981a = new b(this);
                }
                parcel.writeStrongBinder(this.f11981a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
