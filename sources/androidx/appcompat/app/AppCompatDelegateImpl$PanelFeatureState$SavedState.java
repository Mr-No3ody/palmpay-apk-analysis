package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
    public static final Parcelable.Creator<AppCompatDelegateImpl$PanelFeatureState$SavedState> CREATOR = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f12081c;

    public static AppCompatDelegateImpl$PanelFeatureState$SavedState c(Parcel parcel, ClassLoader classLoader) {
        AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
        appCompatDelegateImpl$PanelFeatureState$SavedState.f12079a = parcel.readInt();
        boolean z3 = parcel.readInt() == 1;
        appCompatDelegateImpl$PanelFeatureState$SavedState.f12080b = z3;
        if (z3) {
            appCompatDelegateImpl$PanelFeatureState$SavedState.f12081c = parcel.readBundle(classLoader);
        }
        return appCompatDelegateImpl$PanelFeatureState$SavedState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f12079a);
        parcel.writeInt(this.f12080b ? 1 : 0);
        if (this.f12080b) {
            parcel.writeBundle(this.f12081c);
        }
    }
}
