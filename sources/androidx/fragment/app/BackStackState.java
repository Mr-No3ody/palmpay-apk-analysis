package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C1163b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16969b;

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f16968a = arrayList;
        this.f16969b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f16968a);
        parcel.writeTypedList(this.f16969b);
    }

    public BackStackState(Parcel parcel) {
        this.f16968a = parcel.createStringArrayList();
        this.f16969b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
