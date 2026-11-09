package com.transsnet.palmpay.send_money.bean.resp.kkcar;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003 !\"B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp;", "", "qrCodeDTO", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeDTO;", "qrCodeOrderDTO", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "payOrderResultDTO", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp$DataBean;", "checkPayOtherDTO", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$CheckPayOtherDTO;", "<init>", "(Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeDTO;Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp$DataBean;Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$CheckPayOtherDTO;)V", "getQrCodeDTO", "()Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeDTO;", "getQrCodeOrderDTO", "()Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "getPayOrderResultDTO", "()Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp$DataBean;", "getCheckPayOtherDTO", "()Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$CheckPayOtherDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QrCodeDTO", "QrCodeOrderDTO", "CheckPayOtherDTO", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KkCarQrCodeRsp {

    @Nullable
    private final CheckPayOtherDTO checkPayOtherDTO;

    @Nullable
    private final PayByOrderResp.DataBean payOrderResultDTO;

    @Nullable
    private final QrCodeDTO qrCodeDTO;

    @Nullable
    private final QrCodeOrderDTO qrCodeOrderDTO;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$CheckPayOtherDTO;", "", "orderNo", "", "payId", "transType", "orderAmount", "orderType", "payAmount", "feeAmount", "verifyMethod", "subPayId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderNo", "()Ljava/lang/String;", "getPayId", "getTransType", "getOrderAmount", "getOrderType", "getPayAmount", "getFeeAmount", "getVerifyMethod", "getSubPayId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckPayOtherDTO {

        @Nullable
        private final String feeAmount;

        @Nullable
        private final String orderAmount;

        @Nullable
        private final String orderNo;

        @Nullable
        private final String orderType;

        @Nullable
        private final String payAmount;

        @Nullable
        private final String payId;

        @Nullable
        private final String subPayId;

        @Nullable
        private final String transType;

        @Nullable
        private final String verifyMethod;

        public CheckPayOtherDTO() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public static /* synthetic */ CheckPayOtherDTO copy$default(CheckPayOtherDTO checkPayOtherDTO, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = checkPayOtherDTO.orderNo;
            }
            if ((i7 & 2) != 0) {
                str2 = checkPayOtherDTO.payId;
            }
            if ((i7 & 4) != 0) {
                str3 = checkPayOtherDTO.transType;
            }
            if ((i7 & 8) != 0) {
                str4 = checkPayOtherDTO.orderAmount;
            }
            if ((i7 & 16) != 0) {
                str5 = checkPayOtherDTO.orderType;
            }
            if ((i7 & 32) != 0) {
                str6 = checkPayOtherDTO.payAmount;
            }
            if ((i7 & 64) != 0) {
                str7 = checkPayOtherDTO.feeAmount;
            }
            if ((i7 & 128) != 0) {
                str8 = checkPayOtherDTO.verifyMethod;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                str9 = checkPayOtherDTO.subPayId;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str5;
            String str15 = str3;
            return checkPayOtherDTO.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderNo() {
            return this.orderNo;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPayId() {
            return this.payId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTransType() {
            return this.transType;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getOrderAmount() {
            return this.orderAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPayAmount() {
            return this.payAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getFeeAmount() {
            return this.feeAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getVerifyMethod() {
            return this.verifyMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getSubPayId() {
            return this.subPayId;
        }

        @NotNull
        public final CheckPayOtherDTO copy(@Nullable String orderNo, @Nullable String payId, @Nullable String transType, @Nullable String orderAmount, @Nullable String orderType, @Nullable String payAmount, @Nullable String feeAmount, @Nullable String verifyMethod, @Nullable String subPayId) {
            return new CheckPayOtherDTO(orderNo, payId, transType, orderAmount, orderType, payAmount, feeAmount, verifyMethod, subPayId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckPayOtherDTO)) {
                return false;
            }
            CheckPayOtherDTO checkPayOtherDTO = (CheckPayOtherDTO) other;
            return Intrinsics.c(this.orderNo, checkPayOtherDTO.orderNo) && Intrinsics.c(this.payId, checkPayOtherDTO.payId) && Intrinsics.c(this.transType, checkPayOtherDTO.transType) && Intrinsics.c(this.orderAmount, checkPayOtherDTO.orderAmount) && Intrinsics.c(this.orderType, checkPayOtherDTO.orderType) && Intrinsics.c(this.payAmount, checkPayOtherDTO.payAmount) && Intrinsics.c(this.feeAmount, checkPayOtherDTO.feeAmount) && Intrinsics.c(this.verifyMethod, checkPayOtherDTO.verifyMethod) && Intrinsics.c(this.subPayId, checkPayOtherDTO.subPayId);
        }

        @Nullable
        public final String getFeeAmount() {
            return this.feeAmount;
        }

        @Nullable
        public final String getOrderAmount() {
            return this.orderAmount;
        }

        @Nullable
        public final String getOrderNo() {
            return this.orderNo;
        }

        @Nullable
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getPayAmount() {
            return this.payAmount;
        }

        @Nullable
        public final String getPayId() {
            return this.payId;
        }

        @Nullable
        public final String getSubPayId() {
            return this.subPayId;
        }

        @Nullable
        public final String getTransType() {
            return this.transType;
        }

        @Nullable
        public final String getVerifyMethod() {
            return this.verifyMethod;
        }

        public int hashCode() {
            String str = this.orderNo;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.payId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.transType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.orderAmount;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.orderType;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.payAmount;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.feeAmount;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.verifyMethod;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.subPayId;
            return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.orderNo;
            String str2 = this.payId;
            String str3 = this.transType;
            String str4 = this.orderAmount;
            String str5 = this.orderType;
            String str6 = this.payAmount;
            String str7 = this.feeAmount;
            String str8 = this.verifyMethod;
            String str9 = this.subPayId;
            StringBuilder sbF = F.f("CheckPayOtherDTO(orderNo=", str, ", payId=", str2, ", transType=");
            u.x(sbF, str3, ", orderAmount=", str4, ", orderType=");
            u.x(sbF, str5, ", payAmount=", str6, ", feeAmount=");
            u.x(sbF, str7, ", verifyMethod=", str8, ", subPayId=");
            return G.r(sbF, str9, ")");
        }

        public CheckPayOtherDTO(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
            this.orderNo = str;
            this.payId = str2;
            this.transType = str3;
            this.orderAmount = str4;
            this.orderType = str5;
            this.payAmount = str6;
            this.feeAmount = str7;
            this.verifyMethod = str8;
            this.subPayId = str9;
        }

        public /* synthetic */ CheckPayOtherDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : str7, (i7 & 128) != 0 ? null : str8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str9);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeDTO;", "", "authStatus", "", "qrCode", "", "qrCodeStatus", "qrCodeExpireTime", "", "needPoll", "", "pollInterval", "error", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/AuthErrorDTO;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/AuthErrorDTO;)V", "getAuthStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQrCode", "()Ljava/lang/String;", "getQrCodeStatus", "getQrCodeExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNeedPoll", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPollInterval", "getError", "()Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/AuthErrorDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/AuthErrorDTO;)Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeDTO;", "equals", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QrCodeDTO {

        @Nullable
        private final Integer authStatus;

        @Nullable
        private final AuthErrorDTO error;

        @Nullable
        private final Boolean needPoll;

        @Nullable
        private final Long pollInterval;

        @Nullable
        private final String qrCode;

        @Nullable
        private final Long qrCodeExpireTime;

        @Nullable
        private final Integer qrCodeStatus;

        public QrCodeDTO() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ QrCodeDTO copy$default(QrCodeDTO qrCodeDTO, Integer num, String str, Integer num2, Long l5, Boolean bool, Long l6, AuthErrorDTO authErrorDTO, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = qrCodeDTO.authStatus;
            }
            if ((i7 & 2) != 0) {
                str = qrCodeDTO.qrCode;
            }
            if ((i7 & 4) != 0) {
                num2 = qrCodeDTO.qrCodeStatus;
            }
            if ((i7 & 8) != 0) {
                l5 = qrCodeDTO.qrCodeExpireTime;
            }
            if ((i7 & 16) != 0) {
                bool = qrCodeDTO.needPoll;
            }
            if ((i7 & 32) != 0) {
                l6 = qrCodeDTO.pollInterval;
            }
            if ((i7 & 64) != 0) {
                authErrorDTO = qrCodeDTO.error;
            }
            Long l8 = l6;
            AuthErrorDTO authErrorDTO2 = authErrorDTO;
            Boolean bool2 = bool;
            Integer num3 = num2;
            return qrCodeDTO.copy(num, str, num3, l5, bool2, l8, authErrorDTO2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getAuthStatus() {
            return this.authStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getQrCode() {
            return this.qrCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getQrCodeStatus() {
            return this.qrCodeStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getQrCodeExpireTime() {
            return this.qrCodeExpireTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getNeedPoll() {
            return this.needPoll;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getPollInterval() {
            return this.pollInterval;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final AuthErrorDTO getError() {
            return this.error;
        }

        @NotNull
        public final QrCodeDTO copy(@Nullable Integer authStatus, @Nullable String qrCode, @Nullable Integer qrCodeStatus, @Nullable Long qrCodeExpireTime, @Nullable Boolean needPoll, @Nullable Long pollInterval, @Nullable AuthErrorDTO error) {
            return new QrCodeDTO(authStatus, qrCode, qrCodeStatus, qrCodeExpireTime, needPoll, pollInterval, error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QrCodeDTO)) {
                return false;
            }
            QrCodeDTO qrCodeDTO = (QrCodeDTO) other;
            return Intrinsics.c(this.authStatus, qrCodeDTO.authStatus) && Intrinsics.c(this.qrCode, qrCodeDTO.qrCode) && Intrinsics.c(this.qrCodeStatus, qrCodeDTO.qrCodeStatus) && Intrinsics.c(this.qrCodeExpireTime, qrCodeDTO.qrCodeExpireTime) && Intrinsics.c(this.needPoll, qrCodeDTO.needPoll) && Intrinsics.c(this.pollInterval, qrCodeDTO.pollInterval) && Intrinsics.c(this.error, qrCodeDTO.error);
        }

        @Nullable
        public final Integer getAuthStatus() {
            return this.authStatus;
        }

        @Nullable
        public final AuthErrorDTO getError() {
            return this.error;
        }

        @Nullable
        public final Boolean getNeedPoll() {
            return this.needPoll;
        }

        @Nullable
        public final Long getPollInterval() {
            return this.pollInterval;
        }

        @Nullable
        public final String getQrCode() {
            return this.qrCode;
        }

        @Nullable
        public final Long getQrCodeExpireTime() {
            return this.qrCodeExpireTime;
        }

        @Nullable
        public final Integer getQrCodeStatus() {
            return this.qrCodeStatus;
        }

        public int hashCode() {
            Integer num = this.authStatus;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.qrCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.qrCodeStatus;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Long l5 = this.qrCodeExpireTime;
            int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Boolean bool = this.needPoll;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l6 = this.pollInterval;
            int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
            AuthErrorDTO authErrorDTO = this.error;
            return iHashCode6 + (authErrorDTO != null ? authErrorDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "QrCodeDTO(authStatus=" + this.authStatus + ", qrCode=" + this.qrCode + ", qrCodeStatus=" + this.qrCodeStatus + ", qrCodeExpireTime=" + this.qrCodeExpireTime + ", needPoll=" + this.needPoll + ", pollInterval=" + this.pollInterval + ", error=" + this.error + ")";
        }

        public QrCodeDTO(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Long l5, @Nullable Boolean bool, @Nullable Long l6, @Nullable AuthErrorDTO authErrorDTO) {
            this.authStatus = num;
            this.qrCode = str;
            this.qrCodeStatus = num2;
            this.qrCodeExpireTime = l5;
            this.needPoll = bool;
            this.pollInterval = l6;
            this.error = authErrorDTO;
        }

        public /* synthetic */ QrCodeDTO(Integer num, String str, Integer num2, Long l5, Boolean bool, Long l6, AuthErrorDTO authErrorDTO, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : num2, (i7 & 8) != 0 ? null : l5, (i7 & 16) != 0 ? null : bool, (i7 & 32) != 0 ? null : l6, (i7 & 64) != 0 ? null : authErrorDTO);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "", "orderId", "", "orderStatus", "", "orderFailType", "amount", "", "payAmount", "discountAmount", "tips", "driverName", "driverAvatar", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getOrderStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderFailType", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPayAmount", "getDiscountAmount", "getTips", "getDriverName", "getDriverAvatar", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "equals", "", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QrCodeOrderDTO {

        @Nullable
        private final Long amount;

        @Nullable
        private final Long discountAmount;

        @Nullable
        private final String driverAvatar;

        @Nullable
        private final String driverName;

        @Nullable
        private final Integer orderFailType;

        @Nullable
        private final String orderId;

        @Nullable
        private final Integer orderStatus;

        @Nullable
        private final Long payAmount;

        @Nullable
        private final String tips;

        public QrCodeOrderDTO() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public static /* synthetic */ QrCodeOrderDTO copy$default(QrCodeOrderDTO qrCodeOrderDTO, String str, Integer num, Integer num2, Long l5, Long l6, Long l8, String str2, String str3, String str4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = qrCodeOrderDTO.orderId;
            }
            if ((i7 & 2) != 0) {
                num = qrCodeOrderDTO.orderStatus;
            }
            if ((i7 & 4) != 0) {
                num2 = qrCodeOrderDTO.orderFailType;
            }
            if ((i7 & 8) != 0) {
                l5 = qrCodeOrderDTO.amount;
            }
            if ((i7 & 16) != 0) {
                l6 = qrCodeOrderDTO.payAmount;
            }
            if ((i7 & 32) != 0) {
                l8 = qrCodeOrderDTO.discountAmount;
            }
            if ((i7 & 64) != 0) {
                str2 = qrCodeOrderDTO.tips;
            }
            if ((i7 & 128) != 0) {
                str3 = qrCodeOrderDTO.driverName;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                str4 = qrCodeOrderDTO.driverAvatar;
            }
            String str5 = str3;
            String str6 = str4;
            Long l10 = l8;
            String str7 = str2;
            Long l11 = l6;
            Integer num3 = num2;
            return qrCodeOrderDTO.copy(str, num, num3, l5, l11, l10, str7, str5, str6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getOrderStatus() {
            return this.orderStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getOrderFailType() {
            return this.orderFailType;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getPayAmount() {
            return this.payAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getDiscountAmount() {
            return this.discountAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTips() {
            return this.tips;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getDriverName() {
            return this.driverName;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getDriverAvatar() {
            return this.driverAvatar;
        }

        @NotNull
        public final QrCodeOrderDTO copy(@Nullable String orderId, @Nullable Integer orderStatus, @Nullable Integer orderFailType, @Nullable Long amount, @Nullable Long payAmount, @Nullable Long discountAmount, @Nullable String tips, @Nullable String driverName, @Nullable String driverAvatar) {
            return new QrCodeOrderDTO(orderId, orderStatus, orderFailType, amount, payAmount, discountAmount, tips, driverName, driverAvatar);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QrCodeOrderDTO)) {
                return false;
            }
            QrCodeOrderDTO qrCodeOrderDTO = (QrCodeOrderDTO) other;
            return Intrinsics.c(this.orderId, qrCodeOrderDTO.orderId) && Intrinsics.c(this.orderStatus, qrCodeOrderDTO.orderStatus) && Intrinsics.c(this.orderFailType, qrCodeOrderDTO.orderFailType) && Intrinsics.c(this.amount, qrCodeOrderDTO.amount) && Intrinsics.c(this.payAmount, qrCodeOrderDTO.payAmount) && Intrinsics.c(this.discountAmount, qrCodeOrderDTO.discountAmount) && Intrinsics.c(this.tips, qrCodeOrderDTO.tips) && Intrinsics.c(this.driverName, qrCodeOrderDTO.driverName) && Intrinsics.c(this.driverAvatar, qrCodeOrderDTO.driverAvatar);
        }

        @Nullable
        public final Long getAmount() {
            return this.amount;
        }

        @Nullable
        public final Long getDiscountAmount() {
            return this.discountAmount;
        }

        @Nullable
        public final String getDriverAvatar() {
            return this.driverAvatar;
        }

        @Nullable
        public final String getDriverName() {
            return this.driverName;
        }

        @Nullable
        public final Integer getOrderFailType() {
            return this.orderFailType;
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final Integer getOrderStatus() {
            return this.orderStatus;
        }

        @Nullable
        public final Long getPayAmount() {
            return this.payAmount;
        }

        @Nullable
        public final String getTips() {
            return this.tips;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.orderStatus;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.orderFailType;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Long l5 = this.amount;
            int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.payAmount;
            int iHashCode5 = (iHashCode4 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l8 = this.discountAmount;
            int iHashCode6 = (iHashCode5 + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str2 = this.tips;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.driverName;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.driverAvatar;
            return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.orderId;
            Integer num = this.orderStatus;
            Integer num2 = this.orderFailType;
            Long l5 = this.amount;
            Long l6 = this.payAmount;
            Long l8 = this.discountAmount;
            String str2 = this.tips;
            String str3 = this.driverName;
            String str4 = this.driverAvatar;
            StringBuilder sb2 = new StringBuilder("QrCodeOrderDTO(orderId=");
            sb2.append(str);
            sb2.append(", orderStatus=");
            sb2.append(num);
            sb2.append(", orderFailType=");
            sb2.append(num2);
            sb2.append(", amount=");
            sb2.append(l5);
            sb2.append(", payAmount=");
            q0.w(sb2, l6, ", discountAmount=", l8, ", tips=");
            u.x(sb2, str2, ", driverName=", str3, ", driverAvatar=");
            return G.r(sb2, str4, ")");
        }

        public QrCodeOrderDTO(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.orderId = str;
            this.orderStatus = num;
            this.orderFailType = num2;
            this.amount = l5;
            this.payAmount = l6;
            this.discountAmount = l8;
            this.tips = str2;
            this.driverName = str3;
            this.driverAvatar = str4;
        }

        public /* synthetic */ QrCodeOrderDTO(String str, Integer num, Integer num2, Long l5, Long l6, Long l8, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : num2, (i7 & 8) != 0 ? null : l5, (i7 & 16) != 0 ? null : l6, (i7 & 32) != 0 ? null : l8, (i7 & 64) != 0 ? null : str2, (i7 & 128) != 0 ? null : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4);
        }
    }

    public KkCarQrCodeRsp() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ KkCarQrCodeRsp copy$default(KkCarQrCodeRsp kkCarQrCodeRsp, QrCodeDTO qrCodeDTO, QrCodeOrderDTO qrCodeOrderDTO, PayByOrderResp.DataBean dataBean, CheckPayOtherDTO checkPayOtherDTO, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            qrCodeDTO = kkCarQrCodeRsp.qrCodeDTO;
        }
        if ((i7 & 2) != 0) {
            qrCodeOrderDTO = kkCarQrCodeRsp.qrCodeOrderDTO;
        }
        if ((i7 & 4) != 0) {
            dataBean = kkCarQrCodeRsp.payOrderResultDTO;
        }
        if ((i7 & 8) != 0) {
            checkPayOtherDTO = kkCarQrCodeRsp.checkPayOtherDTO;
        }
        return kkCarQrCodeRsp.copy(qrCodeDTO, qrCodeOrderDTO, dataBean, checkPayOtherDTO);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final QrCodeDTO getQrCodeDTO() {
        return this.qrCodeDTO;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final QrCodeOrderDTO getQrCodeOrderDTO() {
        return this.qrCodeOrderDTO;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PayByOrderResp.DataBean getPayOrderResultDTO() {
        return this.payOrderResultDTO;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CheckPayOtherDTO getCheckPayOtherDTO() {
        return this.checkPayOtherDTO;
    }

    @NotNull
    public final KkCarQrCodeRsp copy(@Nullable QrCodeDTO qrCodeDTO, @Nullable QrCodeOrderDTO qrCodeOrderDTO, @Nullable PayByOrderResp.DataBean payOrderResultDTO, @Nullable CheckPayOtherDTO checkPayOtherDTO) {
        return new KkCarQrCodeRsp(qrCodeDTO, qrCodeOrderDTO, payOrderResultDTO, checkPayOtherDTO);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KkCarQrCodeRsp)) {
            return false;
        }
        KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) other;
        return Intrinsics.c(this.qrCodeDTO, kkCarQrCodeRsp.qrCodeDTO) && Intrinsics.c(this.qrCodeOrderDTO, kkCarQrCodeRsp.qrCodeOrderDTO) && Intrinsics.c(this.payOrderResultDTO, kkCarQrCodeRsp.payOrderResultDTO) && Intrinsics.c(this.checkPayOtherDTO, kkCarQrCodeRsp.checkPayOtherDTO);
    }

    @Nullable
    public final CheckPayOtherDTO getCheckPayOtherDTO() {
        return this.checkPayOtherDTO;
    }

    @Nullable
    public final PayByOrderResp.DataBean getPayOrderResultDTO() {
        return this.payOrderResultDTO;
    }

    @Nullable
    public final QrCodeDTO getQrCodeDTO() {
        return this.qrCodeDTO;
    }

    @Nullable
    public final QrCodeOrderDTO getQrCodeOrderDTO() {
        return this.qrCodeOrderDTO;
    }

    public int hashCode() {
        QrCodeDTO qrCodeDTO = this.qrCodeDTO;
        int iHashCode = (qrCodeDTO == null ? 0 : qrCodeDTO.hashCode()) * 31;
        QrCodeOrderDTO qrCodeOrderDTO = this.qrCodeOrderDTO;
        int iHashCode2 = (iHashCode + (qrCodeOrderDTO == null ? 0 : qrCodeOrderDTO.hashCode())) * 31;
        PayByOrderResp.DataBean dataBean = this.payOrderResultDTO;
        int iHashCode3 = (iHashCode2 + (dataBean == null ? 0 : dataBean.hashCode())) * 31;
        CheckPayOtherDTO checkPayOtherDTO = this.checkPayOtherDTO;
        return iHashCode3 + (checkPayOtherDTO != null ? checkPayOtherDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KkCarQrCodeRsp(qrCodeDTO=" + this.qrCodeDTO + ", qrCodeOrderDTO=" + this.qrCodeOrderDTO + ", payOrderResultDTO=" + this.payOrderResultDTO + ", checkPayOtherDTO=" + this.checkPayOtherDTO + ")";
    }

    public KkCarQrCodeRsp(@Nullable QrCodeDTO qrCodeDTO, @Nullable QrCodeOrderDTO qrCodeOrderDTO, @Nullable PayByOrderResp.DataBean dataBean, @Nullable CheckPayOtherDTO checkPayOtherDTO) {
        this.qrCodeDTO = qrCodeDTO;
        this.qrCodeOrderDTO = qrCodeOrderDTO;
        this.payOrderResultDTO = dataBean;
        this.checkPayOtherDTO = checkPayOtherDTO;
    }

    public /* synthetic */ KkCarQrCodeRsp(QrCodeDTO qrCodeDTO, QrCodeOrderDTO qrCodeOrderDTO, PayByOrderResp.DataBean dataBean, CheckPayOtherDTO checkPayOtherDTO, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : qrCodeDTO, (i7 & 2) != 0 ? null : qrCodeOrderDTO, (i7 & 4) != 0 ? null : dataBean, (i7 & 8) != 0 ? null : checkPayOtherDTO);
    }
}
