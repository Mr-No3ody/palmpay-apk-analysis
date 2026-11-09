package pub.devrel.easypermissions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.databinding.g;
import p192n.c;

/* JADX INFO: loaded from: classes4.dex */
public class AppSettingsDialog implements Parcelable {

    @RestrictTo({c.f39801b})
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new g(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41337g;

    public AppSettingsDialog(Parcel parcel) {
        this.f41331a = parcel.readInt();
        this.f41332b = parcel.readString();
        this.f41333c = parcel.readString();
        this.f41334d = parcel.readString();
        this.f41335e = parcel.readString();
        this.f41336f = parcel.readInt();
        this.f41337g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f41331a);
        parcel.writeString(this.f41332b);
        parcel.writeString(this.f41333c);
        parcel.writeString(this.f41334d);
        parcel.writeString(this.f41335e);
        parcel.writeInt(this.f41336f);
        parcel.writeInt(this.f41337g);
    }

    public AppSettingsDialog(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity, String str, String str2, String str3, String str4, int i7) {
        this.f41331a = -1;
        this.f41332b = str;
        this.f41333c = str2;
        this.f41334d = str3;
        this.f41335e = str4;
        this.f41336f = i7;
        this.f41337g = 0;
    }
}
