package com.transsnet.palmpay.credit.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfo;", "", "style", "", "title", FirebaseAnalytics.Param.COUPON, "amount", "", "icon", "iconDark", "subTitle", "subTitle2", "button", "enable", "", "jumpPath", "jumpParams", "jumpType", "outstandingMaxCount", "outstandingAccounts", "", "Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "waiverInfo", "Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;)V", "Ljava/lang/Long;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutstandingContentInfo {

    @JvmField
    @Nullable
    public final Long amount;

    @JvmField
    @Nullable
    public final String button;

    @JvmField
    @Nullable
    public final String coupon;

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
    public final String jumpParams;

    @JvmField
    @Nullable
    public final String jumpPath;

    @JvmField
    @Nullable
    public final String jumpType;

    @JvmField
    @Nullable
    public final List<OutstandingAccount> outstandingAccounts;

    @JvmField
    @Nullable
    public final Integer outstandingMaxCount;

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

    public OutstandingContentInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l5, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num2, @Nullable List<OutstandingAccount> list, @Nullable WaiverInfo waiverInfo) {
        this.style = str;
        this.title = str2;
        this.coupon = str3;
        this.amount = l5;
        this.icon = str4;
        this.iconDark = str5;
        this.subTitle = str6;
        this.subTitle2 = str7;
        this.button = str8;
        this.enable = num;
        this.jumpPath = str9;
        this.jumpParams = str10;
        this.jumpType = str11;
        this.outstandingMaxCount = num2;
        this.outstandingAccounts = list;
        this.waiverInfo = waiverInfo;
    }

    public /* synthetic */ OutstandingContentInfo(String str, String str2, String str3, Long l5, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Integer num2, List list, WaiverInfo waiverInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, l5, str4, str5, str6, str7, str8, num, str9, str10, str11, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 3 : num2, list, (i7 & 32768) != 0 ? null : waiverInfo);
    }
}
