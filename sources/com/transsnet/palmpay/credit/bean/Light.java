package com.transsnet.palmpay.credit.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/Light;", "", "productThemeInfo", "", "Lcom/transsnet/palmpay/credit/bean/ProductThemeInfo;", "outstandingThemeInfo", "Lcom/transsnet/palmpay/credit/bean/OutstandingThemeInfo;", "kingkongThemeInfo", "Lcom/transsnet/palmpay/credit/bean/KingkongThemeInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Light {

    @JvmField
    @Nullable
    public final List<KingkongThemeInfo> kingkongThemeInfo;

    @JvmField
    @Nullable
    public final List<OutstandingThemeInfo> outstandingThemeInfo;

    @JvmField
    @Nullable
    public final List<ProductThemeInfo> productThemeInfo;

    public Light(@Nullable List<ProductThemeInfo> list, @Nullable List<OutstandingThemeInfo> list2, @Nullable List<KingkongThemeInfo> list3) {
        this.productThemeInfo = list;
        this.outstandingThemeInfo = list2;
        this.kingkongThemeInfo = list3;
    }
}
