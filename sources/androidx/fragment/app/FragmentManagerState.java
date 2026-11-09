package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C1163b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f16993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f16994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f16995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f16998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f16999g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f17000i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f16993a);
        parcel.writeStringList(this.f16994b);
        parcel.writeTypedArray(this.f16995c, i7);
        parcel.writeInt(this.f16996d);
        parcel.writeString(this.f16997e);
        parcel.writeStringList(this.f16998f);
        parcel.writeTypedList(this.f16999g);
        parcel.writeTypedList(this.f17000i);
    }
}
