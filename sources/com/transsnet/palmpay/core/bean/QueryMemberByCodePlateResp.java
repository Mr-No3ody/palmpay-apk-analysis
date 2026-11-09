package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/core/bean/QueryMemberByCodePlateResp;", "", "memberId", "", "businessType", "", "phone", "transType", "accountType", "businessName", "businessPortrait", "cashBackPictureUrl", "pictureUrl", "shopName", "accountNo", "snNo", "jumpUrl", "accountMark", "soNoType", "type", "labelType", "darkAccountMark", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryMemberByCodePlateResp {

    @JvmField
    @Nullable
    public final String accountMark;

    @JvmField
    @Nullable
    public final String accountNo;

    @JvmField
    public final int accountType;

    @JvmField
    @Nullable
    public final String businessName;

    @JvmField
    @Nullable
    public final String businessPortrait;

    @JvmField
    public final int businessType;

    @JvmField
    @NotNull
    public final String cashBackPictureUrl;

    @JvmField
    @Nullable
    public final String darkAccountMark;

    @JvmField
    @Nullable
    public final String jumpUrl;

    @JvmField
    public final int labelType;

    @JvmField
    @Nullable
    public final String memberId;

    @JvmField
    @Nullable
    public final String phone;

    @JvmField
    @Nullable
    public final String pictureUrl;

    @JvmField
    @Nullable
    public final String shopName;

    @JvmField
    @Nullable
    public final String snNo;

    @JvmField
    public final int soNoType;

    @JvmField
    @Nullable
    public final String transType;

    @JvmField
    public final int type;

    public QueryMemberByCodePlateResp(@Nullable String str, int i7, @Nullable String str2, @Nullable String str3, int i10, @Nullable String str4, @Nullable String str5, @NotNull String cashBackPictureUrl, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, int i11, int i12, int i13, @Nullable String str12) {
        Intrinsics.checkNotNullParameter(cashBackPictureUrl, "cashBackPictureUrl");
        this.memberId = str;
        this.businessType = i7;
        this.phone = str2;
        this.transType = str3;
        this.accountType = i10;
        this.businessName = str4;
        this.businessPortrait = str5;
        this.cashBackPictureUrl = cashBackPictureUrl;
        this.pictureUrl = str6;
        this.shopName = str7;
        this.accountNo = str8;
        this.snNo = str9;
        this.jumpUrl = str10;
        this.accountMark = str11;
        this.soNoType = i11;
        this.type = i12;
        this.labelType = i13;
        this.darkAccountMark = str12;
    }

    public /* synthetic */ QueryMemberByCodePlateResp(String str, int i7, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, int i12, int i13, String str13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i7, str2, str3, i10, str4, str5, str6, str7, str8, str9, str10, str11, str12, i11, i12, i13, (i14 & 131072) != 0 ? null : str13);
    }
}
