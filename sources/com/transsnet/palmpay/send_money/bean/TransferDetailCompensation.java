package com.transsnet.palmpay.send_money.bean;

import C0.G;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.bean.TransferToBankProcessItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J¼\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00032\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\bHÖ\u0001J\t\u0010E\u001a\u00020\fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010-R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010$\"\u0004\b1\u0010-¨\u0006F"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/TransferDetailCompensation;", "", "showProcessBar", "", "tips", "", "Lcom/transsnet/palmpay/core/bean/TransferToBankProcessItem;", "compensationStatus", "", "bottomButtonCountdown", "", "bottomButtonDesc", "", "topLeftPic", "topLeftDarkPic", "topRightDesc", "middleDesc", "middleTime", "introduceJumpUrl", "detailJumpUrl", "successCompensationPic", "successDarkCompensationPic", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShowProcessBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTips", "()Ljava/util/List;", "getCompensationStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottomButtonCountdown", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBottomButtonDesc", "()Ljava/lang/String;", "getTopLeftPic", "getTopLeftDarkPic", "getTopRightDesc", "getMiddleDesc", "getMiddleTime", "getIntroduceJumpUrl", "getDetailJumpUrl", "setDetailJumpUrl", "(Ljava/lang/String;)V", "getSuccessCompensationPic", "setSuccessCompensationPic", "getSuccessDarkCompensationPic", "setSuccessDarkCompensationPic", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/TransferDetailCompensation;", "equals", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferDetailCompensation {

    @Nullable
    private final Long bottomButtonCountdown;

    @Nullable
    private final String bottomButtonDesc;

    @Nullable
    private final Integer compensationStatus;

    @Nullable
    private String detailJumpUrl;

    @Nullable
    private final String introduceJumpUrl;

    @Nullable
    private final String middleDesc;

    @Nullable
    private final Long middleTime;

    @Nullable
    private final Boolean showProcessBar;

    @Nullable
    private String successCompensationPic;

    @Nullable
    private String successDarkCompensationPic;

    @Nullable
    private final List<TransferToBankProcessItem> tips;

    @Nullable
    private final String topLeftDarkPic;

    @Nullable
    private final String topLeftPic;

    @Nullable
    private final String topRightDesc;

    /* JADX WARN: Multi-variable type inference failed */
    public TransferDetailCompensation(@Nullable Boolean bool, @Nullable List<? extends TransferToBankProcessItem> list, @Nullable Integer num, @Nullable Long l5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l6, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.showProcessBar = bool;
        this.tips = list;
        this.compensationStatus = num;
        this.bottomButtonCountdown = l5;
        this.bottomButtonDesc = str;
        this.topLeftPic = str2;
        this.topLeftDarkPic = str3;
        this.topRightDesc = str4;
        this.middleDesc = str5;
        this.middleTime = l6;
        this.introduceJumpUrl = str6;
        this.detailJumpUrl = str7;
        this.successCompensationPic = str8;
        this.successDarkCompensationPic = str9;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getShowProcessBar() {
        return this.showProcessBar;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getMiddleTime() {
        return this.middleTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIntroduceJumpUrl() {
        return this.introduceJumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDetailJumpUrl() {
        return this.detailJumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSuccessCompensationPic() {
        return this.successCompensationPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSuccessDarkCompensationPic() {
        return this.successDarkCompensationPic;
    }

    @Nullable
    public final List<TransferToBankProcessItem> component2() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCompensationStatus() {
        return this.compensationStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getBottomButtonCountdown() {
        return this.bottomButtonCountdown;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBottomButtonDesc() {
        return this.bottomButtonDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTopLeftPic() {
        return this.topLeftPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTopLeftDarkPic() {
        return this.topLeftDarkPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTopRightDesc() {
        return this.topRightDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMiddleDesc() {
        return this.middleDesc;
    }

    @NotNull
    public final TransferDetailCompensation copy(@Nullable Boolean showProcessBar, @Nullable List<? extends TransferToBankProcessItem> tips, @Nullable Integer compensationStatus, @Nullable Long bottomButtonCountdown, @Nullable String bottomButtonDesc, @Nullable String topLeftPic, @Nullable String topLeftDarkPic, @Nullable String topRightDesc, @Nullable String middleDesc, @Nullable Long middleTime, @Nullable String introduceJumpUrl, @Nullable String detailJumpUrl, @Nullable String successCompensationPic, @Nullable String successDarkCompensationPic) {
        return new TransferDetailCompensation(showProcessBar, tips, compensationStatus, bottomButtonCountdown, bottomButtonDesc, topLeftPic, topLeftDarkPic, topRightDesc, middleDesc, middleTime, introduceJumpUrl, detailJumpUrl, successCompensationPic, successDarkCompensationPic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferDetailCompensation)) {
            return false;
        }
        TransferDetailCompensation transferDetailCompensation = (TransferDetailCompensation) other;
        return Intrinsics.c(this.showProcessBar, transferDetailCompensation.showProcessBar) && Intrinsics.c(this.tips, transferDetailCompensation.tips) && Intrinsics.c(this.compensationStatus, transferDetailCompensation.compensationStatus) && Intrinsics.c(this.bottomButtonCountdown, transferDetailCompensation.bottomButtonCountdown) && Intrinsics.c(this.bottomButtonDesc, transferDetailCompensation.bottomButtonDesc) && Intrinsics.c(this.topLeftPic, transferDetailCompensation.topLeftPic) && Intrinsics.c(this.topLeftDarkPic, transferDetailCompensation.topLeftDarkPic) && Intrinsics.c(this.topRightDesc, transferDetailCompensation.topRightDesc) && Intrinsics.c(this.middleDesc, transferDetailCompensation.middleDesc) && Intrinsics.c(this.middleTime, transferDetailCompensation.middleTime) && Intrinsics.c(this.introduceJumpUrl, transferDetailCompensation.introduceJumpUrl) && Intrinsics.c(this.detailJumpUrl, transferDetailCompensation.detailJumpUrl) && Intrinsics.c(this.successCompensationPic, transferDetailCompensation.successCompensationPic) && Intrinsics.c(this.successDarkCompensationPic, transferDetailCompensation.successDarkCompensationPic);
    }

    @Nullable
    public final Long getBottomButtonCountdown() {
        return this.bottomButtonCountdown;
    }

    @Nullable
    public final String getBottomButtonDesc() {
        return this.bottomButtonDesc;
    }

    @Nullable
    public final Integer getCompensationStatus() {
        return this.compensationStatus;
    }

    @Nullable
    public final String getDetailJumpUrl() {
        return this.detailJumpUrl;
    }

    @Nullable
    public final String getIntroduceJumpUrl() {
        return this.introduceJumpUrl;
    }

    @Nullable
    public final String getMiddleDesc() {
        return this.middleDesc;
    }

    @Nullable
    public final Long getMiddleTime() {
        return this.middleTime;
    }

    @Nullable
    public final Boolean getShowProcessBar() {
        return this.showProcessBar;
    }

    @Nullable
    public final String getSuccessCompensationPic() {
        return this.successCompensationPic;
    }

    @Nullable
    public final String getSuccessDarkCompensationPic() {
        return this.successDarkCompensationPic;
    }

    @Nullable
    public final List<TransferToBankProcessItem> getTips() {
        return this.tips;
    }

    @Nullable
    public final String getTopLeftDarkPic() {
        return this.topLeftDarkPic;
    }

    @Nullable
    public final String getTopLeftPic() {
        return this.topLeftPic;
    }

    @Nullable
    public final String getTopRightDesc() {
        return this.topRightDesc;
    }

    public int hashCode() {
        Boolean bool = this.showProcessBar;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<TransferToBankProcessItem> list = this.tips;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.compensationStatus;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l5 = this.bottomButtonCountdown;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.bottomButtonDesc;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.topLeftPic;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topLeftDarkPic;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.topRightDesc;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.middleDesc;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l6 = this.middleTime;
        int iHashCode10 = (iHashCode9 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str6 = this.introduceJumpUrl;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.detailJumpUrl;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.successCompensationPic;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.successDarkCompensationPic;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setDetailJumpUrl(@Nullable String str) {
        this.detailJumpUrl = str;
    }

    public final void setSuccessCompensationPic(@Nullable String str) {
        this.successCompensationPic = str;
    }

    public final void setSuccessDarkCompensationPic(@Nullable String str) {
        this.successDarkCompensationPic = str;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.showProcessBar;
        List<TransferToBankProcessItem> list = this.tips;
        Integer num = this.compensationStatus;
        Long l5 = this.bottomButtonCountdown;
        String str = this.bottomButtonDesc;
        String str2 = this.topLeftPic;
        String str3 = this.topLeftDarkPic;
        String str4 = this.topRightDesc;
        String str5 = this.middleDesc;
        Long l6 = this.middleTime;
        String str6 = this.introduceJumpUrl;
        String str7 = this.detailJumpUrl;
        String str8 = this.successCompensationPic;
        String str9 = this.successDarkCompensationPic;
        StringBuilder sb2 = new StringBuilder("TransferDetailCompensation(showProcessBar=");
        sb2.append(bool);
        sb2.append(", tips=");
        sb2.append(list);
        sb2.append(", compensationStatus=");
        sb2.append(num);
        sb2.append(", bottomButtonCountdown=");
        sb2.append(l5);
        sb2.append(", bottomButtonDesc=");
        u.x(sb2, str, ", topLeftPic=", str2, ", topLeftDarkPic=");
        u.x(sb2, str3, ", topRightDesc=", str4, ", middleDesc=");
        sb2.append(str5);
        sb2.append(", middleTime=");
        sb2.append(l6);
        sb2.append(", introduceJumpUrl=");
        u.x(sb2, str6, ", detailJumpUrl=", str7, ", successCompensationPic=");
        return G.s(sb2, str8, ", successDarkCompensationPic=", str9, ")");
    }
}
