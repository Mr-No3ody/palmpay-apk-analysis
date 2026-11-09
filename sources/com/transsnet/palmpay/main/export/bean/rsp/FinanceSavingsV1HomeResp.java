package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/FinanceSavingsV1HomeResp;", "", "totalAsserts", "", "totalYesterdayEarnings", "", "accountList", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/AccountData;", "productList", "Lcom/transsnet/palmpay/main/export/bean/rsp/ProductData;", "recommendList", "Lcom/transsnet/palmpay/main/export/bean/rsp/RecommendProduct;", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FinanceSavingsV1HomeResp {

    @JvmField
    @Nullable
    public List<AccountData> accountList;

    @JvmField
    @Nullable
    public final List<ProductData> productList;

    @JvmField
    @Nullable
    public final List<RecommendProduct> recommendList;

    @JvmField
    public final long totalAsserts;

    @JvmField
    @Nullable
    public final String totalYesterdayEarnings;

    public FinanceSavingsV1HomeResp(long j6, @Nullable String str, @Nullable List<AccountData> list, @Nullable List<ProductData> list2, @Nullable List<RecommendProduct> list3) {
        this.totalAsserts = j6;
        this.totalYesterdayEarnings = str;
        this.accountList = list;
        this.productList = list2;
        this.recommendList = list3;
    }

    public /* synthetic */ FinanceSavingsV1HomeResp(long j6, String str, List list, List list2, List list3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j6, str, list, list2, list3);
    }
}
