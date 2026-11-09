package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1163b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17095a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f17095a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f16991a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f16992b = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f16997e = null;
                fragmentManagerState.f16998f = new ArrayList();
                fragmentManagerState.f16999g = new ArrayList();
                fragmentManagerState.f16993a = parcel.createStringArrayList();
                fragmentManagerState.f16994b = parcel.createStringArrayList();
                fragmentManagerState.f16995c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f16996d = parcel.readInt();
                fragmentManagerState.f16997e = parcel.readString();
                fragmentManagerState.f16998f = parcel.createStringArrayList();
                fragmentManagerState.f16999g = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f17000i = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f17095a) {
            case 0:
                return new BackStackRecordState[i7];
            case 1:
                return new BackStackState[i7];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i7];
            case 3:
                return new FragmentManagerState[i7];
            default:
                return new FragmentState[i7];
        }
    }
}
