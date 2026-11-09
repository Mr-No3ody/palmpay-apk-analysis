package com.transsnet.palmpay.airtime.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/GroupPurchaseRsp;", "", "<init>", "()V", "link", "", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "list", "", "Lcom/transsnet/palmpay/airtime/bean/rsp/GroupPurchaseItem;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroupPurchaseRsp {

    @Nullable
    private String link;

    @Nullable
    private List<GroupPurchaseItem> list;

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final List<GroupPurchaseItem> getList() {
        return this.list;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setList(@Nullable List<GroupPurchaseItem> list) {
        this.list = list;
    }
}
