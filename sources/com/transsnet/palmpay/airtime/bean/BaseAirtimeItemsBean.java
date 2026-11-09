package com.transsnet.palmpay.airtime.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/BaseAirtimeItemsBean;", "", "<init>", "()V", "itemType", "", "getItemType", "()Ljava/lang/Integer;", "setItemType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseAirtimeItemsBean {

    @Nullable
    private Integer itemType = 0;

    @Nullable
    public final Integer getItemType() {
        return this.itemType;
    }

    public final void setItemType(@Nullable Integer num) {
        this.itemType = num;
    }
}
