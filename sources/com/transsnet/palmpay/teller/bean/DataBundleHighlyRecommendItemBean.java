package com.transsnet.palmpay.teller.bean;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleHighlyRecommendItemBean;", "", "billerId", "", "billerName", "packageType", "", ViewProps.COLOR, "tagId", "badgeUrl", "cornerMark", "item", "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;)V", "Ljava/lang/Integer;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataBundleHighlyRecommendItemBean {

    @JvmField
    @Nullable
    public final String badgeUrl;

    @JvmField
    @Nullable
    public final String billerId;

    @JvmField
    @Nullable
    public final String billerName;

    @JvmField
    @Nullable
    public final String color;

    @JvmField
    @Nullable
    public final String cornerMark;

    @JvmField
    @Nullable
    public final DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean item;

    @JvmField
    @Nullable
    public final Integer packageType;

    @JvmField
    @Nullable
    public final String tagId;

    public DataBundleHighlyRecommendItemBean(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean) {
        this.billerId = str;
        this.billerName = str2;
        this.packageType = num;
        this.color = str3;
        this.tagId = str4;
        this.badgeUrl = str5;
        this.cornerMark = str6;
        this.item = dataBundleWalletItemChildBean;
    }
}
