package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC1204n;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C1163b(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17007g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17009j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f17011p;
    public final String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17012v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f17013w;

    public FragmentState(Fragment fragment) {
        this.f17001a = fragment.getClass().getName();
        this.f17002b = fragment.mWho;
        this.f17003c = fragment.mFromLayout;
        this.f17004d = fragment.mFragmentId;
        this.f17005e = fragment.mContainerId;
        this.f17006f = fragment.mTag;
        this.f17007g = fragment.mRetainInstance;
        this.f17008i = fragment.mRemoving;
        this.f17009j = fragment.mDetached;
        this.f17010o = fragment.mHidden;
        this.f17011p = fragment.mMaxState.ordinal();
        this.t = fragment.mTargetWho;
        this.f17012v = fragment.mTargetRequestCode;
        this.f17013w = fragment.mUserVisibleHint;
    }

    public final Fragment c(J j6, ClassLoader classLoader) {
        Fragment fragmentA = j6.a(classLoader, this.f17001a);
        fragmentA.mWho = this.f17002b;
        fragmentA.mFromLayout = this.f17003c;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f17004d;
        fragmentA.mContainerId = this.f17005e;
        fragmentA.mTag = this.f17006f;
        fragmentA.mRetainInstance = this.f17007g;
        fragmentA.mRemoving = this.f17008i;
        fragmentA.mDetached = this.f17009j;
        fragmentA.mHidden = this.f17010o;
        fragmentA.mMaxState = EnumC1204n.values()[this.f17011p];
        fragmentA.mTargetWho = this.t;
        fragmentA.mTargetRequestCode = this.f17012v;
        fragmentA.mUserVisibleHint = this.f17013w;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f17001a);
        sb2.append(" (");
        sb2.append(this.f17002b);
        sb2.append(")}:");
        if (this.f17003c) {
            sb2.append(" fromLayout");
        }
        int i7 = this.f17005e;
        if (i7 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i7));
        }
        String str = this.f17006f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f17007g) {
            sb2.append(" retainInstance");
        }
        if (this.f17008i) {
            sb2.append(" removing");
        }
        if (this.f17009j) {
            sb2.append(" detached");
        }
        if (this.f17010o) {
            sb2.append(" hidden");
        }
        String str2 = this.t;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f17012v);
        }
        if (this.f17013w) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f17001a);
        parcel.writeString(this.f17002b);
        parcel.writeInt(this.f17003c ? 1 : 0);
        parcel.writeInt(this.f17004d);
        parcel.writeInt(this.f17005e);
        parcel.writeString(this.f17006f);
        parcel.writeInt(this.f17007g ? 1 : 0);
        parcel.writeInt(this.f17008i ? 1 : 0);
        parcel.writeInt(this.f17009j ? 1 : 0);
        parcel.writeInt(this.f17010o ? 1 : 0);
        parcel.writeInt(this.f17011p);
        parcel.writeString(this.t);
        parcel.writeInt(this.f17012v);
        parcel.writeInt(this.f17013w ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f17001a = parcel.readString();
        this.f17002b = parcel.readString();
        this.f17003c = parcel.readInt() != 0;
        this.f17004d = parcel.readInt();
        this.f17005e = parcel.readInt();
        this.f17006f = parcel.readString();
        this.f17007g = parcel.readInt() != 0;
        this.f17008i = parcel.readInt() != 0;
        this.f17009j = parcel.readInt() != 0;
        this.f17010o = parcel.readInt() != 0;
        this.f17011p = parcel.readInt();
        this.t = parcel.readString();
        this.f17012v = parcel.readInt();
        this.f17013w = parcel.readInt() != 0;
    }
}
