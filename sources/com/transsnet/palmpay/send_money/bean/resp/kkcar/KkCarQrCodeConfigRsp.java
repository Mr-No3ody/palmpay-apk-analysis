package com.transsnet.palmpay.send_money.bean.resp.kkcar;

import androidx.camera.camera2.internal.F;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JP\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeConfigRsp;", "", "promotionBannerText", "", "promotionActivateText", "paymentRecipientTitle", "badgeList", "", "driver", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getPromotionBannerText", "()Ljava/lang/String;", "getPromotionActivateText", "getPaymentRecipientTitle", "getBadgeList", "()Ljava/util/List;", "getDriver", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeConfigRsp;", "equals", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KkCarQrCodeConfigRsp {

    @Nullable
    private final List<String> badgeList;

    @Nullable
    private final Boolean driver;

    @Nullable
    private final String paymentRecipientTitle;

    @Nullable
    private final String promotionActivateText;

    @Nullable
    private final String promotionBannerText;

    public KkCarQrCodeConfigRsp() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KkCarQrCodeConfigRsp copy$default(KkCarQrCodeConfigRsp kkCarQrCodeConfigRsp, String str, String str2, String str3, List list, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = kkCarQrCodeConfigRsp.promotionBannerText;
        }
        if ((i7 & 2) != 0) {
            str2 = kkCarQrCodeConfigRsp.promotionActivateText;
        }
        if ((i7 & 4) != 0) {
            str3 = kkCarQrCodeConfigRsp.paymentRecipientTitle;
        }
        if ((i7 & 8) != 0) {
            list = kkCarQrCodeConfigRsp.badgeList;
        }
        if ((i7 & 16) != 0) {
            bool = kkCarQrCodeConfigRsp.driver;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        return kkCarQrCodeConfigRsp.copy(str, str2, str4, list, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPromotionBannerText() {
        return this.promotionBannerText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPromotionActivateText() {
        return this.promotionActivateText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentRecipientTitle() {
        return this.paymentRecipientTitle;
    }

    @Nullable
    public final List<String> component4() {
        return this.badgeList;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getDriver() {
        return this.driver;
    }

    @NotNull
    public final KkCarQrCodeConfigRsp copy(@Nullable String promotionBannerText, @Nullable String promotionActivateText, @Nullable String paymentRecipientTitle, @Nullable List<String> badgeList, @Nullable Boolean driver) {
        return new KkCarQrCodeConfigRsp(promotionBannerText, promotionActivateText, paymentRecipientTitle, badgeList, driver);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KkCarQrCodeConfigRsp)) {
            return false;
        }
        KkCarQrCodeConfigRsp kkCarQrCodeConfigRsp = (KkCarQrCodeConfigRsp) other;
        return Intrinsics.c(this.promotionBannerText, kkCarQrCodeConfigRsp.promotionBannerText) && Intrinsics.c(this.promotionActivateText, kkCarQrCodeConfigRsp.promotionActivateText) && Intrinsics.c(this.paymentRecipientTitle, kkCarQrCodeConfigRsp.paymentRecipientTitle) && Intrinsics.c(this.badgeList, kkCarQrCodeConfigRsp.badgeList) && Intrinsics.c(this.driver, kkCarQrCodeConfigRsp.driver);
    }

    @Nullable
    public final List<String> getBadgeList() {
        return this.badgeList;
    }

    @Nullable
    public final Boolean getDriver() {
        return this.driver;
    }

    @Nullable
    public final String getPaymentRecipientTitle() {
        return this.paymentRecipientTitle;
    }

    @Nullable
    public final String getPromotionActivateText() {
        return this.promotionActivateText;
    }

    @Nullable
    public final String getPromotionBannerText() {
        return this.promotionBannerText;
    }

    public int hashCode() {
        String str = this.promotionBannerText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promotionActivateText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentRecipientTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.badgeList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.driver;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.promotionBannerText;
        String str2 = this.promotionActivateText;
        String str3 = this.paymentRecipientTitle;
        List<String> list = this.badgeList;
        Boolean bool = this.driver;
        StringBuilder sbF = F.f("KkCarQrCodeConfigRsp(promotionBannerText=", str, ", promotionActivateText=", str2, ", paymentRecipientTitle=");
        sbF.append(str3);
        sbF.append(", badgeList=");
        sbF.append(list);
        sbF.append(", driver=");
        sbF.append(bool);
        sbF.append(")");
        return sbF.toString();
    }

    public KkCarQrCodeConfigRsp(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Boolean bool) {
        this.promotionBannerText = str;
        this.promotionActivateText = str2;
        this.paymentRecipientTitle = str3;
        this.badgeList = list;
        this.driver = bool;
    }

    public /* synthetic */ KkCarQrCodeConfigRsp(String str, String str2, String str3, List list, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : list, (i7 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
