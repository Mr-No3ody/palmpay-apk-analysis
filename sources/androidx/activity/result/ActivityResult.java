package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f12043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12041c = new a(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new androidx.databinding.g(6);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        @JvmStatic
        @NotNull
        public final String resultCodeToString(int i7) {
            if (i7 != -1) {
                return i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        private a() {
        }
    }

    public ActivityResult(int i7, Intent intent) {
        this.f12042a = i7;
        this.f12043b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + f12041c.resultCodeToString(this.f12042a) + ", data=" + this.f12043b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f12042a);
        Intent intent = this.f12043b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i7);
        }
    }
}
