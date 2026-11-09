package androidx.navigation;

import C0.C0119k;
import C0.C0131x;
import C0.K;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.g;
import androidx.lifecycle.EnumC1204n;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "a", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f17499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f17500d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        CREATOR = new g(2);
    }

    public NavBackStackEntryState(C0119k entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f17497a = entry.f1055f;
        this.f17498b = entry.f1051b.f961i;
        this.f17499c = entry.a();
        Bundle outBundle = new Bundle();
        this.f17500d = outBundle;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        entry.f1058j.c(outBundle);
    }

    public final C0119k c(Context context, K destination, EnumC1204n hostLifecycleState, C0131x c0131x) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f17499c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return C0119k.f1049v.create(context, destination, bundle, hostLifecycleState, c0131x, this.f17497a, this.f17500d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f17497a);
        parcel.writeInt(this.f17498b);
        parcel.writeBundle(this.f17499c);
        parcel.writeBundle(this.f17500d);
    }

    public NavBackStackEntryState(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String string = inParcel.readString();
        Intrinsics.e(string);
        this.f17497a = string;
        this.f17498b = inParcel.readInt();
        this.f17499c = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Intrinsics.e(bundle);
        this.f17500d = bundle;
    }
}
