package com.transsnet.palmpay.send_money.bean.resp;

import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransReceiptTypeResp;", "", "<init>", "()V", "detailConfigs", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/send_money/bean/resp/TransReceiptTypeBean;", "Lkotlin/collections/ArrayList;", "getDetailConfigs", "()Ljava/util/ArrayList;", "setDetailConfigs", "(Ljava/util/ArrayList;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransReceiptTypeResp {

    @Nullable
    private ArrayList<TransReceiptTypeBean> detailConfigs;

    @Nullable
    public final ArrayList<TransReceiptTypeBean> getDetailConfigs() {
        return this.detailConfigs;
    }

    public final void setDetailConfigs(@Nullable ArrayList<TransReceiptTypeBean> arrayList) {
        this.detailConfigs = arrayList;
    }
}
