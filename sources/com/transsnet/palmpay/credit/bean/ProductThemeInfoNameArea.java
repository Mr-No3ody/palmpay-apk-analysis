package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoNameArea;", "", "remark", "", "productIconSize", "Lcom/transsnet/palmpay/credit/bean/IconSize;", "productTitleColor", "productTitleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "topArea", "Lcom/transsnet/palmpay/credit/bean/TopArea;", "productSubTitleColor", "productSubTitleFont", "extraInfo", "Lcom/transsnet/palmpay/credit/bean/ExtraThemeInfo;", "overdueArea", "Lcom/transsnet/palmpay/credit/bean/OverdueArea;", "tag", "Lcom/transsnet/palmpay/credit/bean/ExtraTagArea;", "<init>", "(Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/IconSize;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Lcom/transsnet/palmpay/credit/bean/TopArea;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Lcom/transsnet/palmpay/credit/bean/ExtraThemeInfo;Lcom/transsnet/palmpay/credit/bean/OverdueArea;Lcom/transsnet/palmpay/credit/bean/ExtraTagArea;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductThemeInfoNameArea {

    @JvmField
    @Nullable
    public final ExtraThemeInfo extraInfo;

    @JvmField
    @Nullable
    public final OverdueArea overdueArea;

    @JvmField
    @Nullable
    public final IconSize productIconSize;

    @JvmField
    @Nullable
    public final String productSubTitleColor;

    @JvmField
    @Nullable
    public final TitleFont productSubTitleFont;

    @JvmField
    @Nullable
    public final String productTitleColor;

    @JvmField
    @Nullable
    public final TitleFont productTitleFont;

    @JvmField
    @Nullable
    public final String remark;

    @JvmField
    @Nullable
    public final ExtraTagArea tag;

    @JvmField
    @Nullable
    public final TopArea topArea;

    public ProductThemeInfoNameArea(@Nullable String str, @Nullable IconSize iconSize, @Nullable String str2, @Nullable TitleFont titleFont, @Nullable TopArea topArea, @Nullable String str3, @Nullable TitleFont titleFont2, @Nullable ExtraThemeInfo extraThemeInfo, @Nullable OverdueArea overdueArea, @Nullable ExtraTagArea extraTagArea) {
        this.remark = str;
        this.productIconSize = iconSize;
        this.productTitleColor = str2;
        this.productTitleFont = titleFont;
        this.topArea = topArea;
        this.productSubTitleColor = str3;
        this.productSubTitleFont = titleFont2;
        this.extraInfo = extraThemeInfo;
        this.overdueArea = overdueArea;
        this.tag = extraTagArea;
    }
}
