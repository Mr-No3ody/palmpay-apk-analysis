package com.transsnet.palmpay.credit.bean;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010$R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010!R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010!R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010!R\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;", "", "style", "", "title", "amount", "", "icon", "iconDark", "subTitle", "subTitle2", "dialogTitle", "dialogMessage", "dialogSubTitle", "button", "enable", "", "androidLink", "outstandingMaxCount", "billId", "cardNo", "loanNo", "loanProduct", "billOutstandingAmount", "repaymentDateStamp", "repaymentDate", "outstandingAccounts", "", "Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "waiverInfo", "Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;)V", "Ljava/lang/Long;", "Ljava/lang/Integer;", "getRepaymentTime", "()Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutstandingContentInfoV2 {

    @JvmField
    @Nullable
    public final Long amount;

    @JvmField
    @Nullable
    public final String androidLink;

    @JvmField
    @Nullable
    public final Long billId;

    @JvmField
    @Nullable
    public final Long billOutstandingAmount;

    @JvmField
    @Nullable
    public final String button;

    @JvmField
    @Nullable
    public final String cardNo;

    @JvmField
    @Nullable
    public final String dialogMessage;

    @JvmField
    @Nullable
    public final String dialogSubTitle;

    @JvmField
    @Nullable
    public final String dialogTitle;

    @JvmField
    @Nullable
    public final Integer enable;

    @JvmField
    @Nullable
    public final String icon;

    @JvmField
    @Nullable
    public final String iconDark;

    @JvmField
    @Nullable
    public final String loanNo;

    @JvmField
    @Nullable
    public final String loanProduct;

    @JvmField
    @Nullable
    public final List<OutstandingAccount> outstandingAccounts;

    @JvmField
    @Nullable
    public final Integer outstandingMaxCount;

    @JvmField
    @Nullable
    public final Long repaymentDate;

    @JvmField
    @Nullable
    public final Long repaymentDateStamp;

    @JvmField
    @Nullable
    public final String style;

    @JvmField
    @Nullable
    public final String subTitle;

    @JvmField
    @Nullable
    public final String subTitle2;

    @JvmField
    @Nullable
    public final String title;

    @JvmField
    @Nullable
    public final WaiverInfo waiverInfo;

    public OutstandingContentInfoV2(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num, @Nullable String str11, @Nullable Integer num2, @Nullable Long l6, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable List<OutstandingAccount> list, @Nullable WaiverInfo waiverInfo) {
        this.style = str;
        this.title = str2;
        this.amount = l5;
        this.icon = str3;
        this.iconDark = str4;
        this.subTitle = str5;
        this.subTitle2 = str6;
        this.dialogTitle = str7;
        this.dialogMessage = str8;
        this.dialogSubTitle = str9;
        this.button = str10;
        this.enable = num;
        this.androidLink = str11;
        this.outstandingMaxCount = num2;
        this.billId = l6;
        this.cardNo = str12;
        this.loanNo = str13;
        this.loanProduct = str14;
        this.billOutstandingAmount = l8;
        this.repaymentDateStamp = l10;
        this.repaymentDate = l11;
        this.outstandingAccounts = list;
        this.waiverInfo = waiverInfo;
    }

    @Nullable
    public final Long getRepaymentTime() {
        Long l5 = this.repaymentDate;
        return l5 == null ? this.repaymentDateStamp : l5;
    }

    public /* synthetic */ OutstandingContentInfoV2(String str, String str2, Long l5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, Integer num2, Long l6, String str12, String str13, String str14, Long l8, Long l10, Long l11, List list, WaiverInfo waiverInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l5, str3, str4, str5, str6, str7, str8, str9, str10, num, (i7 & 4096) != 0 ? null : str11, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : num2, (i7 & 16384) != 0 ? null : l6, (32768 & i7) != 0 ? null : str12, (65536 & i7) != 0 ? null : str13, (131072 & i7) != 0 ? null : str14, (262144 & i7) != 0 ? null : l8, (524288 & i7) != 0 ? null : l10, (1048576 & i7) != 0 ? null : l11, (2097152 & i7) != 0 ? null : list, (i7 & 4194304) != 0 ? null : waiverInfo);
    }
}
