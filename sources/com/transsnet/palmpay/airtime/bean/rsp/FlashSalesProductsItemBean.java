package com.transsnet.palmpay.airtime.bean.rsp;

import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/FlashSalesProductsItemBean;", "", "<init>", "()V", "billerName", "", "getBillerName", "()Ljava/lang/String;", "setBillerName", "(Ljava/lang/String;)V", "desc", "getDesc", "setDesc", "descTitle", "getDescTitle", "setDescTitle", "title", "getTitle", "setTitle", "products", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/airtime/bean/rsp/FlashSalesProductsDataBean;", "Lkotlin/collections/ArrayList;", "getProducts", "()Ljava/util/ArrayList;", "setProducts", "(Ljava/util/ArrayList;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlashSalesProductsItemBean {

    @Nullable
    private String billerName;

    @Nullable
    private String desc;

    @Nullable
    private String descTitle;

    @Nullable
    private ArrayList<FlashSalesProductsDataBean> products;

    @Nullable
    private String title;

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDescTitle() {
        return this.descTitle;
    }

    @Nullable
    public final ArrayList<FlashSalesProductsDataBean> getProducts() {
        return this.products;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDescTitle(@Nullable String str) {
        this.descTitle = str;
    }

    public final void setProducts(@Nullable ArrayList<FlashSalesProductsDataBean> arrayList) {
        this.products = arrayList;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
