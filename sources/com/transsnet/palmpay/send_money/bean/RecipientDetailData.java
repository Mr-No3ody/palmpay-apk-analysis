package com.transsnet.palmpay.send_money.bean;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0012HÆ\u0003J\u0099\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00105\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0010HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00069"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/RecipientDetailData;", "", "bankUrl", "", "recipientId", "recipientAccountId", "recipientAccountNumber", "recipientBankCode", "recipientBankName", "recipientChannel", "recipientFirstName", "recipientHeadImage", "recipientLastName", "recipientNickname", "recipientPhone", "recipientType", "", "request", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getBankUrl", "()Ljava/lang/String;", "getRecipientId", "getRecipientAccountId", "getRecipientAccountNumber", "getRecipientBankCode", "getRecipientBankName", "getRecipientChannel", "getRecipientFirstName", "getRecipientHeadImage", "getRecipientLastName", "getRecipientNickname", "getRecipientPhone", "getRecipientType", "()I", "getRequest", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RecipientDetailData {

    @NotNull
    private final String bankUrl;

    @NotNull
    private final String recipientAccountId;

    @NotNull
    private final String recipientAccountNumber;

    @NotNull
    private final String recipientBankCode;

    @NotNull
    private final String recipientBankName;

    @NotNull
    private final String recipientChannel;

    @NotNull
    private final String recipientFirstName;

    @NotNull
    private final String recipientHeadImage;

    @NotNull
    private final String recipientId;

    @NotNull
    private final String recipientLastName;

    @Nullable
    private final String recipientNickname;

    @Nullable
    private final String recipientPhone;
    private final int recipientType;
    private final boolean request;

    public RecipientDetailData(@NotNull String bankUrl, @NotNull String recipientId, @NotNull String recipientAccountId, @NotNull String recipientAccountNumber, @NotNull String recipientBankCode, @NotNull String recipientBankName, @NotNull String recipientChannel, @NotNull String recipientFirstName, @NotNull String recipientHeadImage, @NotNull String recipientLastName, @Nullable String str, @Nullable String str2, int i7, boolean z3) {
        Intrinsics.checkNotNullParameter(bankUrl, "bankUrl");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(recipientAccountId, "recipientAccountId");
        Intrinsics.checkNotNullParameter(recipientAccountNumber, "recipientAccountNumber");
        Intrinsics.checkNotNullParameter(recipientBankCode, "recipientBankCode");
        Intrinsics.checkNotNullParameter(recipientBankName, "recipientBankName");
        Intrinsics.checkNotNullParameter(recipientChannel, "recipientChannel");
        Intrinsics.checkNotNullParameter(recipientFirstName, "recipientFirstName");
        Intrinsics.checkNotNullParameter(recipientHeadImage, "recipientHeadImage");
        Intrinsics.checkNotNullParameter(recipientLastName, "recipientLastName");
        this.bankUrl = bankUrl;
        this.recipientId = recipientId;
        this.recipientAccountId = recipientAccountId;
        this.recipientAccountNumber = recipientAccountNumber;
        this.recipientBankCode = recipientBankCode;
        this.recipientBankName = recipientBankName;
        this.recipientChannel = recipientChannel;
        this.recipientFirstName = recipientFirstName;
        this.recipientHeadImage = recipientHeadImage;
        this.recipientLastName = recipientLastName;
        this.recipientNickname = str;
        this.recipientPhone = str2;
        this.recipientType = i7;
        this.request = z3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankUrl() {
        return this.bankUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRecipientLastName() {
        return this.recipientLastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRecipientNickname() {
        return this.recipientNickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRecipientPhone() {
        return this.recipientPhone;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getRecipientType() {
        return this.recipientType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getRequest() {
        return this.request;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecipientId() {
        return this.recipientId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecipientAccountId() {
        return this.recipientAccountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecipientAccountNumber() {
        return this.recipientAccountNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRecipientBankCode() {
        return this.recipientBankCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRecipientBankName() {
        return this.recipientBankName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRecipientChannel() {
        return this.recipientChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRecipientFirstName() {
        return this.recipientFirstName;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRecipientHeadImage() {
        return this.recipientHeadImage;
    }

    @NotNull
    public final RecipientDetailData copy(@NotNull String bankUrl, @NotNull String recipientId, @NotNull String recipientAccountId, @NotNull String recipientAccountNumber, @NotNull String recipientBankCode, @NotNull String recipientBankName, @NotNull String recipientChannel, @NotNull String recipientFirstName, @NotNull String recipientHeadImage, @NotNull String recipientLastName, @Nullable String recipientNickname, @Nullable String recipientPhone, int recipientType, boolean request) {
        Intrinsics.checkNotNullParameter(bankUrl, "bankUrl");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(recipientAccountId, "recipientAccountId");
        Intrinsics.checkNotNullParameter(recipientAccountNumber, "recipientAccountNumber");
        Intrinsics.checkNotNullParameter(recipientBankCode, "recipientBankCode");
        Intrinsics.checkNotNullParameter(recipientBankName, "recipientBankName");
        Intrinsics.checkNotNullParameter(recipientChannel, "recipientChannel");
        Intrinsics.checkNotNullParameter(recipientFirstName, "recipientFirstName");
        Intrinsics.checkNotNullParameter(recipientHeadImage, "recipientHeadImage");
        Intrinsics.checkNotNullParameter(recipientLastName, "recipientLastName");
        return new RecipientDetailData(bankUrl, recipientId, recipientAccountId, recipientAccountNumber, recipientBankCode, recipientBankName, recipientChannel, recipientFirstName, recipientHeadImage, recipientLastName, recipientNickname, recipientPhone, recipientType, request);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipientDetailData)) {
            return false;
        }
        RecipientDetailData recipientDetailData = (RecipientDetailData) other;
        return Intrinsics.c(this.bankUrl, recipientDetailData.bankUrl) && Intrinsics.c(this.recipientId, recipientDetailData.recipientId) && Intrinsics.c(this.recipientAccountId, recipientDetailData.recipientAccountId) && Intrinsics.c(this.recipientAccountNumber, recipientDetailData.recipientAccountNumber) && Intrinsics.c(this.recipientBankCode, recipientDetailData.recipientBankCode) && Intrinsics.c(this.recipientBankName, recipientDetailData.recipientBankName) && Intrinsics.c(this.recipientChannel, recipientDetailData.recipientChannel) && Intrinsics.c(this.recipientFirstName, recipientDetailData.recipientFirstName) && Intrinsics.c(this.recipientHeadImage, recipientDetailData.recipientHeadImage) && Intrinsics.c(this.recipientLastName, recipientDetailData.recipientLastName) && Intrinsics.c(this.recipientNickname, recipientDetailData.recipientNickname) && Intrinsics.c(this.recipientPhone, recipientDetailData.recipientPhone) && this.recipientType == recipientDetailData.recipientType && this.request == recipientDetailData.request;
    }

    @NotNull
    public final String getBankUrl() {
        return this.bankUrl;
    }

    @NotNull
    public final String getRecipientAccountId() {
        return this.recipientAccountId;
    }

    @NotNull
    public final String getRecipientAccountNumber() {
        return this.recipientAccountNumber;
    }

    @NotNull
    public final String getRecipientBankCode() {
        return this.recipientBankCode;
    }

    @NotNull
    public final String getRecipientBankName() {
        return this.recipientBankName;
    }

    @NotNull
    public final String getRecipientChannel() {
        return this.recipientChannel;
    }

    @NotNull
    public final String getRecipientFirstName() {
        return this.recipientFirstName;
    }

    @NotNull
    public final String getRecipientHeadImage() {
        return this.recipientHeadImage;
    }

    @NotNull
    public final String getRecipientId() {
        return this.recipientId;
    }

    @NotNull
    public final String getRecipientLastName() {
        return this.recipientLastName;
    }

    @Nullable
    public final String getRecipientNickname() {
        return this.recipientNickname;
    }

    @Nullable
    public final String getRecipientPhone() {
        return this.recipientPhone;
    }

    public final int getRecipientType() {
        return this.recipientType;
    }

    public final boolean getRequest() {
        return this.request;
    }

    public int hashCode() {
        int iC = G.c(G.c(G.c(G.c(G.c(G.c(G.c(G.c(G.c(this.bankUrl.hashCode() * 31, 31, this.recipientId), 31, this.recipientAccountId), 31, this.recipientAccountNumber), 31, this.recipientBankCode), 31, this.recipientBankName), 31, this.recipientChannel), 31, this.recipientFirstName), 31, this.recipientHeadImage), 31, this.recipientLastName);
        String str = this.recipientNickname;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recipientPhone;
        return Boolean.hashCode(this.request) + u.b(this.recipientType, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.bankUrl;
        String str2 = this.recipientId;
        String str3 = this.recipientAccountId;
        String str4 = this.recipientAccountNumber;
        String str5 = this.recipientBankCode;
        String str6 = this.recipientBankName;
        String str7 = this.recipientChannel;
        String str8 = this.recipientFirstName;
        String str9 = this.recipientHeadImage;
        String str10 = this.recipientLastName;
        String str11 = this.recipientNickname;
        String str12 = this.recipientPhone;
        int i7 = this.recipientType;
        boolean z3 = this.request;
        StringBuilder sbF = F.f("RecipientDetailData(bankUrl=", str, ", recipientId=", str2, ", recipientAccountId=");
        u.x(sbF, str3, ", recipientAccountNumber=", str4, ", recipientBankCode=");
        u.x(sbF, str5, ", recipientBankName=", str6, ", recipientChannel=");
        u.x(sbF, str7, ", recipientFirstName=", str8, ", recipientHeadImage=");
        u.x(sbF, str9, ", recipientLastName=", str10, ", recipientNickname=");
        u.x(sbF, str11, ", recipientPhone=", str12, ", recipientType=");
        sbF.append(i7);
        sbF.append(", request=");
        sbF.append(z3);
        sbF.append(")");
        return sbF.toString();
    }
}
