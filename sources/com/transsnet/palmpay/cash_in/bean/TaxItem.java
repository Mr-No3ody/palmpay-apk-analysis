package com.transsnet.palmpay.cash_in.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/TaxItem;", "", "totalFee", "", "underlineTotalFee", "totalFeeName", "", "subTotalFee", "subTotalFeeName", "subTotalFeeTitle", "subFeeList", "", "Lcom/transsnet/palmpay/cash_in/bean/SubTaxItem;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTotalFee", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUnderlineTotalFee", "getTotalFeeName", "()Ljava/lang/String;", "getSubTotalFee", "getSubTotalFeeName", "getSubTotalFeeTitle", "getSubFeeList", "()Ljava/util/List;", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaxItem {

    @Nullable
    private final List<SubTaxItem> subFeeList;

    @Nullable
    private final Long subTotalFee;

    @Nullable
    private final String subTotalFeeName;

    @Nullable
    private final String subTotalFeeTitle;

    @Nullable
    private final Long totalFee;

    @Nullable
    private final String totalFeeName;

    @Nullable
    private final Long underlineTotalFee;

    public TaxItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Nullable
    public final List<SubTaxItem> getSubFeeList() {
        return this.subFeeList;
    }

    @Nullable
    public final Long getSubTotalFee() {
        return this.subTotalFee;
    }

    @Nullable
    public final String getSubTotalFeeName() {
        return this.subTotalFeeName;
    }

    @Nullable
    public final String getSubTotalFeeTitle() {
        return this.subTotalFeeTitle;
    }

    @Nullable
    public final Long getTotalFee() {
        return this.totalFee;
    }

    @Nullable
    public final String getTotalFeeName() {
        return this.totalFeeName;
    }

    @Nullable
    public final Long getUnderlineTotalFee() {
        return this.underlineTotalFee;
    }

    public TaxItem(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable Long l8, @Nullable String str2, @Nullable String str3, @Nullable List<SubTaxItem> list) {
        this.totalFee = l5;
        this.underlineTotalFee = l6;
        this.totalFeeName = str;
        this.subTotalFee = l8;
        this.subTotalFeeName = str2;
        this.subTotalFeeTitle = str3;
        this.subFeeList = list;
    }

    public /* synthetic */ TaxItem(Long l5, Long l6, String str, Long l8, String str2, String str3, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : l6, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : l8, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? null : list);
    }
}
