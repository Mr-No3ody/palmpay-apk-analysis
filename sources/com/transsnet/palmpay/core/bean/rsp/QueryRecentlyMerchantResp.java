package com.transsnet.palmpay.core.bean.rsp;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryRecentlyMerchantResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/transsnet/palmpay/core/bean/rsp/QueryRecentlyMerchantResp$Data;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "Data", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryRecentlyMerchantResp extends CommonResult {

    @Nullable
    private final List<Data> data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003Jg\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryRecentlyMerchantResp$Data;", "", "merchantMemberId", "", "merchantName", "merchantNo", "phone", "snNo", "transType", "headPortrait", "businessType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getMerchantMemberId", "()Ljava/lang/String;", "getMerchantName", "getMerchantNo", "getPhone", "getSnNo", "getTransType", "getHeadPortrait", "getBusinessType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {
        private final int businessType;

        @Nullable
        private final String headPortrait;

        @Nullable
        private final String merchantMemberId;

        @Nullable
        private final String merchantName;

        @Nullable
        private final String merchantNo;

        @Nullable
        private final String phone;

        @Nullable
        private final String snNo;

        @Nullable
        private final String transType;

        public Data(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i7) {
            this.merchantMemberId = str;
            this.merchantName = str2;
            this.merchantNo = str3;
            this.phone = str4;
            this.snNo = str5;
            this.transType = str6;
            this.headPortrait = str7;
            this.businessType = i7;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = data.merchantMemberId;
            }
            if ((i10 & 2) != 0) {
                str2 = data.merchantName;
            }
            if ((i10 & 4) != 0) {
                str3 = data.merchantNo;
            }
            if ((i10 & 8) != 0) {
                str4 = data.phone;
            }
            if ((i10 & 16) != 0) {
                str5 = data.snNo;
            }
            if ((i10 & 32) != 0) {
                str6 = data.transType;
            }
            if ((i10 & 64) != 0) {
                str7 = data.headPortrait;
            }
            if ((i10 & 128) != 0) {
                i7 = data.businessType;
            }
            String str8 = str7;
            int i11 = i7;
            String str9 = str5;
            String str10 = str6;
            return data.copy(str, str2, str3, str4, str9, str10, str8, i11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMerchantMemberId() {
            return this.merchantMemberId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMerchantNo() {
            return this.merchantNo;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSnNo() {
            return this.snNo;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTransType() {
            return this.transType;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getHeadPortrait() {
            return this.headPortrait;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getBusinessType() {
            return this.businessType;
        }

        @NotNull
        public final Data copy(@Nullable String merchantMemberId, @Nullable String merchantName, @Nullable String merchantNo, @Nullable String phone, @Nullable String snNo, @Nullable String transType, @Nullable String headPortrait, int businessType) {
            return new Data(merchantMemberId, merchantName, merchantNo, phone, snNo, transType, headPortrait, businessType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.c(this.merchantMemberId, data.merchantMemberId) && Intrinsics.c(this.merchantName, data.merchantName) && Intrinsics.c(this.merchantNo, data.merchantNo) && Intrinsics.c(this.phone, data.phone) && Intrinsics.c(this.snNo, data.snNo) && Intrinsics.c(this.transType, data.transType) && Intrinsics.c(this.headPortrait, data.headPortrait) && this.businessType == data.businessType;
        }

        public final int getBusinessType() {
            return this.businessType;
        }

        @Nullable
        public final String getHeadPortrait() {
            return this.headPortrait;
        }

        @Nullable
        public final String getMerchantMemberId() {
            return this.merchantMemberId;
        }

        @Nullable
        public final String getMerchantName() {
            return this.merchantName;
        }

        @Nullable
        public final String getMerchantNo() {
            return this.merchantNo;
        }

        @Nullable
        public final String getPhone() {
            return this.phone;
        }

        @Nullable
        public final String getSnNo() {
            return this.snNo;
        }

        @Nullable
        public final String getTransType() {
            return this.transType;
        }

        public int hashCode() {
            String str = this.merchantMemberId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.merchantName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.merchantNo;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.phone;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.snNo;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.transType;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.headPortrait;
            return Integer.hashCode(this.businessType) + ((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.merchantMemberId;
            String str2 = this.merchantName;
            String str3 = this.merchantNo;
            String str4 = this.phone;
            String str5 = this.snNo;
            String str6 = this.transType;
            String str7 = this.headPortrait;
            int i7 = this.businessType;
            StringBuilder sbF = F.f("Data(merchantMemberId=", str, ", merchantName=", str2, ", merchantNo=");
            u.x(sbF, str3, ", phone=", str4, ", snNo=");
            u.x(sbF, str5, ", transType=", str6, ", headPortrait=");
            sbF.append(str7);
            sbF.append(", businessType=");
            sbF.append(i7);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public QueryRecentlyMerchantResp(@Nullable List<Data> list) {
        this.data = list;
    }

    @Nullable
    public final List<Data> getData() {
        return this.data;
    }
}
