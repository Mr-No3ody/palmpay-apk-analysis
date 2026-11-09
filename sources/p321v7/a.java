package p321v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.palmpay.lib.liveness.model.CheckResponse;
import com.palmpay.lib.liveness.result.LiveSelfieResult;
import com.rmondjone.camera.AspectRatio;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43091a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f43091a) {
            case 0:
                return AspectRatio.c(parcel.readInt(), parcel.readInt());
            default:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LiveSelfieResult(CheckResponse.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f43091a) {
            case 0:
                return new AspectRatio[i7];
            default:
                return new LiveSelfieResult[i7];
        }
    }
}
