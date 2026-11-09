package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.palmpay.lib.ui.util.CustomViewSavedState;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16382a;

    public static CustomViewSavedState a() {
        return a();
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f16382a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.EMPTY_STATE;
                }
                throw new IllegalStateException("superState must be null");
            default:
                CustomViewSavedState customViewSavedState = new CustomViewSavedState(parcel);
                customViewSavedState.f24633a = parcel.readSparseArray(classLoader);
                return customViewSavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f16382a) {
            case 0:
                return new AbsSavedState[i7];
            default:
                return new CustomViewSavedState[i7];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f16382a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.EMPTY_STATE;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return a();
        }
    }
}
