package com.transsnet.palmpay.managemoney.bean.resp;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxHomeResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxHomeResp$Data;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxHomeResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxHomeResp$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetCashBoxHomeResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u009e\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u000e\u0010\u001e¨\u00063"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxHomeResp$Data;", "", "headerCopyWriting", "", "headerImageUrl", "middleFirstCopyWriting", "middleFirstCopyWritingColor", "middleSecondCopyWriting", "middleSecondCopyWritingColor", "middleButtonCopyWriting", "middleButtonCopyWritingColor", "middleImageUrl", "middlePicUrl", "androidJumpUrl", "isWithdrawPop", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHeaderCopyWriting", "()Ljava/lang/String;", "getHeaderImageUrl", "getMiddleFirstCopyWriting", "getMiddleFirstCopyWritingColor", "getMiddleSecondCopyWriting", "getMiddleSecondCopyWritingColor", "getMiddleButtonCopyWriting", "getMiddleButtonCopyWritingColor", "getMiddleImageUrl", "getMiddlePicUrl", "getAndroidJumpUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxHomeResp$Data;", "equals", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {

        @Nullable
        private final String androidJumpUrl;

        @Nullable
        private final String headerCopyWriting;

        @Nullable
        private final String headerImageUrl;

        @Nullable
        private final Boolean isWithdrawPop;

        @Nullable
        private final String middleButtonCopyWriting;

        @Nullable
        private final String middleButtonCopyWritingColor;

        @Nullable
        private final String middleFirstCopyWriting;

        @Nullable
        private final String middleFirstCopyWritingColor;

        @Nullable
        private final String middleImageUrl;

        @Nullable
        private final String middlePicUrl;

        @Nullable
        private final String middleSecondCopyWriting;

        @Nullable
        private final String middleSecondCopyWritingColor;

        public Data(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool) {
            this.headerCopyWriting = str;
            this.headerImageUrl = str2;
            this.middleFirstCopyWriting = str3;
            this.middleFirstCopyWritingColor = str4;
            this.middleSecondCopyWriting = str5;
            this.middleSecondCopyWritingColor = str6;
            this.middleButtonCopyWriting = str7;
            this.middleButtonCopyWritingColor = str8;
            this.middleImageUrl = str9;
            this.middlePicUrl = str10;
            this.androidJumpUrl = str11;
            this.isWithdrawPop = bool;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = data.headerCopyWriting;
            }
            if ((i7 & 2) != 0) {
                str2 = data.headerImageUrl;
            }
            if ((i7 & 4) != 0) {
                str3 = data.middleFirstCopyWriting;
            }
            if ((i7 & 8) != 0) {
                str4 = data.middleFirstCopyWritingColor;
            }
            if ((i7 & 16) != 0) {
                str5 = data.middleSecondCopyWriting;
            }
            if ((i7 & 32) != 0) {
                str6 = data.middleSecondCopyWritingColor;
            }
            if ((i7 & 64) != 0) {
                str7 = data.middleButtonCopyWriting;
            }
            if ((i7 & 128) != 0) {
                str8 = data.middleButtonCopyWritingColor;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                str9 = data.middleImageUrl;
            }
            if ((i7 & 512) != 0) {
                str10 = data.middlePicUrl;
            }
            if ((i7 & 1024) != 0) {
                str11 = data.androidJumpUrl;
            }
            if ((i7 & 2048) != 0) {
                bool = data.isWithdrawPop;
            }
            String str12 = str11;
            Boolean bool2 = bool;
            String str13 = str9;
            String str14 = str10;
            String str15 = str7;
            String str16 = str8;
            String str17 = str5;
            String str18 = str6;
            return data.copy(str, str2, str3, str4, str17, str18, str15, str16, str13, str14, str12, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeaderCopyWriting() {
            return this.headerCopyWriting;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getMiddlePicUrl() {
            return this.middlePicUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getAndroidJumpUrl() {
            return this.androidJumpUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Boolean getIsWithdrawPop() {
            return this.isWithdrawPop;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getHeaderImageUrl() {
            return this.headerImageUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMiddleFirstCopyWriting() {
            return this.middleFirstCopyWriting;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMiddleFirstCopyWritingColor() {
            return this.middleFirstCopyWritingColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getMiddleSecondCopyWriting() {
            return this.middleSecondCopyWriting;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getMiddleSecondCopyWritingColor() {
            return this.middleSecondCopyWritingColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getMiddleButtonCopyWriting() {
            return this.middleButtonCopyWriting;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getMiddleButtonCopyWritingColor() {
            return this.middleButtonCopyWritingColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getMiddleImageUrl() {
            return this.middleImageUrl;
        }

        @NotNull
        public final Data copy(@Nullable String headerCopyWriting, @Nullable String headerImageUrl, @Nullable String middleFirstCopyWriting, @Nullable String middleFirstCopyWritingColor, @Nullable String middleSecondCopyWriting, @Nullable String middleSecondCopyWritingColor, @Nullable String middleButtonCopyWriting, @Nullable String middleButtonCopyWritingColor, @Nullable String middleImageUrl, @Nullable String middlePicUrl, @Nullable String androidJumpUrl, @Nullable Boolean isWithdrawPop) {
            return new Data(headerCopyWriting, headerImageUrl, middleFirstCopyWriting, middleFirstCopyWritingColor, middleSecondCopyWriting, middleSecondCopyWritingColor, middleButtonCopyWriting, middleButtonCopyWritingColor, middleImageUrl, middlePicUrl, androidJumpUrl, isWithdrawPop);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.c(this.headerCopyWriting, data.headerCopyWriting) && Intrinsics.c(this.headerImageUrl, data.headerImageUrl) && Intrinsics.c(this.middleFirstCopyWriting, data.middleFirstCopyWriting) && Intrinsics.c(this.middleFirstCopyWritingColor, data.middleFirstCopyWritingColor) && Intrinsics.c(this.middleSecondCopyWriting, data.middleSecondCopyWriting) && Intrinsics.c(this.middleSecondCopyWritingColor, data.middleSecondCopyWritingColor) && Intrinsics.c(this.middleButtonCopyWriting, data.middleButtonCopyWriting) && Intrinsics.c(this.middleButtonCopyWritingColor, data.middleButtonCopyWritingColor) && Intrinsics.c(this.middleImageUrl, data.middleImageUrl) && Intrinsics.c(this.middlePicUrl, data.middlePicUrl) && Intrinsics.c(this.androidJumpUrl, data.androidJumpUrl) && Intrinsics.c(this.isWithdrawPop, data.isWithdrawPop);
        }

        @Nullable
        public final String getAndroidJumpUrl() {
            return this.androidJumpUrl;
        }

        @Nullable
        public final String getHeaderCopyWriting() {
            return this.headerCopyWriting;
        }

        @Nullable
        public final String getHeaderImageUrl() {
            return this.headerImageUrl;
        }

        @Nullable
        public final String getMiddleButtonCopyWriting() {
            return this.middleButtonCopyWriting;
        }

        @Nullable
        public final String getMiddleButtonCopyWritingColor() {
            return this.middleButtonCopyWritingColor;
        }

        @Nullable
        public final String getMiddleFirstCopyWriting() {
            return this.middleFirstCopyWriting;
        }

        @Nullable
        public final String getMiddleFirstCopyWritingColor() {
            return this.middleFirstCopyWritingColor;
        }

        @Nullable
        public final String getMiddleImageUrl() {
            return this.middleImageUrl;
        }

        @Nullable
        public final String getMiddlePicUrl() {
            return this.middlePicUrl;
        }

        @Nullable
        public final String getMiddleSecondCopyWriting() {
            return this.middleSecondCopyWriting;
        }

        @Nullable
        public final String getMiddleSecondCopyWritingColor() {
            return this.middleSecondCopyWritingColor;
        }

        public int hashCode() {
            String str = this.headerCopyWriting;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.headerImageUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.middleFirstCopyWriting;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.middleFirstCopyWritingColor;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.middleSecondCopyWriting;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.middleSecondCopyWritingColor;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.middleButtonCopyWriting;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.middleButtonCopyWritingColor;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.middleImageUrl;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.middlePicUrl;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.androidJumpUrl;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Boolean bool = this.isWithdrawPop;
            return iHashCode11 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isWithdrawPop() {
            return this.isWithdrawPop;
        }

        @NotNull
        public String toString() {
            String str = this.headerCopyWriting;
            String str2 = this.headerImageUrl;
            String str3 = this.middleFirstCopyWriting;
            String str4 = this.middleFirstCopyWritingColor;
            String str5 = this.middleSecondCopyWriting;
            String str6 = this.middleSecondCopyWritingColor;
            String str7 = this.middleButtonCopyWriting;
            String str8 = this.middleButtonCopyWritingColor;
            String str9 = this.middleImageUrl;
            String str10 = this.middlePicUrl;
            String str11 = this.androidJumpUrl;
            Boolean bool = this.isWithdrawPop;
            StringBuilder sbF = F.f("Data(headerCopyWriting=", str, ", headerImageUrl=", str2, ", middleFirstCopyWriting=");
            u.x(sbF, str3, ", middleFirstCopyWritingColor=", str4, ", middleSecondCopyWriting=");
            u.x(sbF, str5, ", middleSecondCopyWritingColor=", str6, ", middleButtonCopyWriting=");
            u.x(sbF, str7, ", middleButtonCopyWritingColor=", str8, ", middleImageUrl=");
            u.x(sbF, str9, ", middlePicUrl=", str10, ", androidJumpUrl=");
            sbF.append(str11);
            sbF.append(", isWithdrawPop=");
            sbF.append(bool);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public GetCashBoxHomeResp(@Nullable Data data) {
        this.data = data;
    }

    public static /* synthetic */ GetCashBoxHomeResp copy$default(GetCashBoxHomeResp getCashBoxHomeResp, Data data, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            data = getCashBoxHomeResp.data;
        }
        return getCashBoxHomeResp.copy(data);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final GetCashBoxHomeResp copy(@Nullable Data data) {
        return new GetCashBoxHomeResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetCashBoxHomeResp) && Intrinsics.c(this.data, ((GetCashBoxHomeResp) other).data);
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "GetCashBoxHomeResp(data=" + this.data + ")";
    }
}
