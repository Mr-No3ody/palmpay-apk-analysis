package com.transsnet.palmpay.main.export.bean.rsp;

import C0.G;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.custom_view.marqueeview.IMarqueeItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J+\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/NotifyMsg;", "Landroid/os/Parcelable;", "Lcom/transsnet/palmpay/custom_view/marqueeview/IMarqueeItem;", "notifyContent", "", "orderId", "notifyType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getNotifyContent", "()Ljava/lang/String;", "getOrderId", "getNotifyType", "()I", "writeToParcel", "", "flags", "describeContents", "marqueeMessage", "", "getTextColor", "equals", "", "other", "", "hashCode", "component1", "component2", "component3", "copy", "toString", "CREATOR", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NotifyMsg implements Parcelable, IMarqueeItem {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String notifyContent;
    private final int notifyType;

    @Nullable
    private final String orderId;

    /* JADX INFO: renamed from: com.transsnet.palmpay.main.export.bean.rsp.NotifyMsg$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/NotifyMsg$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/main/export/bean/rsp/NotifyMsg;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/main/export/bean/rsp/NotifyMsg;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<NotifyMsg> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public NotifyMsg createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotifyMsg(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public NotifyMsg[] newArray(int size) {
            return new NotifyMsg[size];
        }
    }

    public NotifyMsg(@Nullable String str, @Nullable String str2, int i7) {
        this.notifyContent = str;
        this.orderId = str2;
        this.notifyType = i7;
    }

    public static /* synthetic */ NotifyMsg copy$default(NotifyMsg notifyMsg, String str, String str2, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notifyMsg.notifyContent;
        }
        if ((i10 & 2) != 0) {
            str2 = notifyMsg.orderId;
        }
        if ((i10 & 4) != 0) {
            i7 = notifyMsg.notifyType;
        }
        return notifyMsg.copy(str, str2, i7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNotifyContent() {
        return this.notifyContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNotifyType() {
        return this.notifyType;
    }

    @NotNull
    public final NotifyMsg copy(@Nullable String notifyContent, @Nullable String orderId, int notifyType) {
        return new NotifyMsg(notifyContent, orderId, notifyType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!NotifyMsg.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.NotifyMsg");
        return Intrinsics.c(this.orderId, ((NotifyMsg) other).orderId);
    }

    @Nullable
    public final String getNotifyContent() {
        return this.notifyContent;
    }

    public final int getNotifyType() {
        return this.notifyType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Override // com.transsnet.palmpay.custom_view.marqueeview.IMarqueeItem
    public int getTextColor() {
        return this.notifyType == 2 ? Color.parseColor("#fe5455") : Color.parseColor("#202426");
    }

    public int hashCode() {
        String str = this.orderId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.custom_view.marqueeview.IMarqueeItem
    @NotNull
    public CharSequence marqueeMessage() {
        String str = this.notifyContent;
        return str != null ? str : "";
    }

    @NotNull
    public String toString() {
        return G.n(this.notifyType, ")", F.f("NotifyMsg(notifyContent=", this.notifyContent, ", orderId=", this.orderId, ", notifyType="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.notifyContent);
        parcel.writeString(this.orderId);
        parcel.writeInt(this.notifyType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotifyMsg(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
