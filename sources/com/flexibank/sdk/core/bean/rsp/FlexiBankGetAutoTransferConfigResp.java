package com.flexibank.sdk.core.bean.rsp;

import W3.f;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/flexibank/sdk/core/bean/rsp/FlexiBankGetAutoTransferConfigResp;", "LW3/f;", "Lcom/flexibank/sdk/core/bean/rsp/FlexiBankGetAutoTransferConfigResp$AutoTransferConfig;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/flexibank/sdk/core/bean/rsp/FlexiBankGetAutoTransferConfigResp$AutoTransferConfig;", "getData", "()Lcom/flexibank/sdk/core/bean/rsp/FlexiBankGetAutoTransferConfigResp$AutoTransferConfig;", "AutoTransferConfig", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankGetAutoTransferConfigResp extends f {

    @Nullable
    private final AutoTransferConfig data;

    @Parcelize
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\r\u0010\u0005R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/flexibank/sdk/core/bean/rsp/FlexiBankGetAutoTransferConfigResp$AutoTransferConfig;", "Landroid/os/Parcelable;", "", "isAutoTransfer", "I", "()I", "setAutoTransfer", "(I)V", "", "agreementUrl", "Ljava/lang/String;", "getAgreementUrl", "()Ljava/lang/String;", "isWhitelistUser", "", "isOpen", "Z", "()Z", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoTransferConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AutoTransferConfig> CREATOR = new a();

        @Nullable
        private final String agreementUrl;
        private int isAutoTransfer;
        private final boolean isOpen;
        private final int isWhitelistUser;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoTransferConfig> {
            @Override // android.os.Parcelable.Creator
            public final AutoTransferConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoTransferConfig(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AutoTransferConfig[] newArray(int i7) {
                return new AutoTransferConfig[i7];
            }
        }

        public AutoTransferConfig(String str, int i7, int i10, boolean z3) {
            this.isAutoTransfer = i7;
            this.agreementUrl = str;
            this.isWhitelistUser = i10;
            this.isOpen = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoTransferConfig)) {
                return false;
            }
            AutoTransferConfig autoTransferConfig = (AutoTransferConfig) obj;
            return this.isAutoTransfer == autoTransferConfig.isAutoTransfer && Intrinsics.c(this.agreementUrl, autoTransferConfig.agreementUrl) && this.isWhitelistUser == autoTransferConfig.isWhitelistUser && this.isOpen == autoTransferConfig.isOpen;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.isAutoTransfer) * 31;
            String str = this.agreementUrl;
            return Boolean.hashCode(this.isOpen) + u.b(this.isWhitelistUser, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "AutoTransferConfig(isAutoTransfer=" + this.isAutoTransfer + ", agreementUrl=" + this.agreementUrl + ", isWhitelistUser=" + this.isWhitelistUser + ", isOpen=" + this.isOpen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isAutoTransfer);
            dest.writeString(this.agreementUrl);
            dest.writeInt(this.isWhitelistUser);
            dest.writeInt(this.isOpen ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlexiBankGetAutoTransferConfigResp) && Intrinsics.c(this.data, ((FlexiBankGetAutoTransferConfigResp) obj).data);
    }

    public final int hashCode() {
        AutoTransferConfig autoTransferConfig = this.data;
        if (autoTransferConfig == null) {
            return 0;
        }
        return autoTransferConfig.hashCode();
    }

    @Override // W3.f
    public final String toString() {
        return "FlexiBankGetAutoTransferConfigResp(data=" + this.data + ")";
    }
}
