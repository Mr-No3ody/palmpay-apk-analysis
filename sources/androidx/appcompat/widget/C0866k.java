package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0866k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f12572a = parcel.readInt();
        return actionMenuPresenter$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new ActionMenuPresenter$SavedState[i7];
    }
}
