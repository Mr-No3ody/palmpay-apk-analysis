package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new C1163b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16992b;

    public FragmentManager$LaunchedFragmentInfo(String str, int i7) {
        this.f16991a = str;
        this.f16992b = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16991a);
        parcel.writeInt(this.f16992b);
    }
}
