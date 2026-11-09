package com.transsnet.palmpay.teller.bean;

import androidx.camera.camera2.internal.F;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingDiscountAdResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/BettingDiscountAdResp$BettingDiscountAdData;", "<init>", "(Lcom/transsnet/palmpay/teller/bean/BettingDiscountAdResp$BettingDiscountAdData;)V", "getData", "()Lcom/transsnet/palmpay/teller/bean/BettingDiscountAdResp$BettingDiscountAdData;", "setData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BettingDiscountAdData", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingDiscountAdResp extends CommonResult {

    @Nullable
    private BettingDiscountAdData data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingDiscountAdResp$BettingDiscountAdData;", "", FirebaseAnalytics.Param.CONTENT, "", "popupTitle", "status", "", ReactTextInputShadowNode.PROP_TEXT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getPopupTitle", "setPopupTitle", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getText", "setText", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/transsnet/palmpay/teller/bean/BettingDiscountAdResp$BettingDiscountAdData;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BettingDiscountAdData {

        @Nullable
        private String content;

        @Nullable
        private String popupTitle;

        @Nullable
        private Integer status;

        @Nullable
        private String text;

        public BettingDiscountAdData(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
            this.content = str;
            this.popupTitle = str2;
            this.status = num;
            this.text = str3;
        }

        public static /* synthetic */ BettingDiscountAdData copy$default(BettingDiscountAdData bettingDiscountAdData, String str, String str2, Integer num, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = bettingDiscountAdData.content;
            }
            if ((i7 & 2) != 0) {
                str2 = bettingDiscountAdData.popupTitle;
            }
            if ((i7 & 4) != 0) {
                num = bettingDiscountAdData.status;
            }
            if ((i7 & 8) != 0) {
                str3 = bettingDiscountAdData.text;
            }
            return bettingDiscountAdData.copy(str, str2, num, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPopupTitle() {
            return this.popupTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final BettingDiscountAdData copy(@Nullable String content, @Nullable String popupTitle, @Nullable Integer status, @Nullable String text) {
            return new BettingDiscountAdData(content, popupTitle, status, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BettingDiscountAdData)) {
                return false;
            }
            BettingDiscountAdData bettingDiscountAdData = (BettingDiscountAdData) other;
            return Intrinsics.c(this.content, bettingDiscountAdData.content) && Intrinsics.c(this.popupTitle, bettingDiscountAdData.popupTitle) && Intrinsics.c(this.status, bettingDiscountAdData.status) && Intrinsics.c(this.text, bettingDiscountAdData.text);
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getPopupTitle() {
            return this.popupTitle;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.content;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.popupTitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.status;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.text;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setPopupTitle(@Nullable String str) {
            this.popupTitle = str;
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }

        @NotNull
        public String toString() {
            String str = this.content;
            String str2 = this.popupTitle;
            Integer num = this.status;
            String str3 = this.text;
            StringBuilder sbF = F.f("BettingDiscountAdData(content=", str, ", popupTitle=", str2, ", status=");
            sbF.append(num);
            sbF.append(", text=");
            sbF.append(str3);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public BettingDiscountAdResp(@Nullable BettingDiscountAdData bettingDiscountAdData) {
        this.data = bettingDiscountAdData;
    }

    public static /* synthetic */ BettingDiscountAdResp copy$default(BettingDiscountAdResp bettingDiscountAdResp, BettingDiscountAdData bettingDiscountAdData, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bettingDiscountAdData = bettingDiscountAdResp.data;
        }
        return bettingDiscountAdResp.copy(bettingDiscountAdData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BettingDiscountAdData getData() {
        return this.data;
    }

    @NotNull
    public final BettingDiscountAdResp copy(@Nullable BettingDiscountAdData data) {
        return new BettingDiscountAdResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BettingDiscountAdResp) && Intrinsics.c(this.data, ((BettingDiscountAdResp) other).data);
    }

    @Nullable
    public final BettingDiscountAdData getData() {
        return this.data;
    }

    public int hashCode() {
        BettingDiscountAdData bettingDiscountAdData = this.data;
        if (bettingDiscountAdData == null) {
            return 0;
        }
        return bettingDiscountAdData.hashCode();
    }

    public final void setData(@Nullable BettingDiscountAdData bettingDiscountAdData) {
        this.data = bettingDiscountAdData;
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "BettingDiscountAdResp(data=" + this.data + ")";
    }
}
