package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f12044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f12045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12047d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private a() {
        }
    }

    static {
        new a(null);
        CREATOR = new androidx.databinding.g(7);
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i7, int i10) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f12044a = intentSender;
        this.f12045b = intent;
        this.f12046c = i7;
        this.f12047d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f12044a, i7);
        dest.writeParcelable(this.f12045b, i7);
        dest.writeInt(this.f12046c);
        dest.writeInt(this.f12047d);
    }
}
