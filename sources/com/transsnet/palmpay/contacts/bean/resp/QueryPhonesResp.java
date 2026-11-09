package com.transsnet.palmpay.contacts.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/contacts/bean/resp/QueryPhonesResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/transsnet/palmpay/contacts/bean/resp/QueryPhonesData;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryPhonesResp extends CommonResult {

    @Nullable
    private List<QueryPhonesData> data;

    public QueryPhonesResp(@Nullable List<QueryPhonesData> list) {
        this.data = list;
    }

    @Nullable
    public final List<QueryPhonesData> getData() {
        return this.data;
    }

    public final void setData(@Nullable List<QueryPhonesData> list) {
        this.data = list;
    }
}
