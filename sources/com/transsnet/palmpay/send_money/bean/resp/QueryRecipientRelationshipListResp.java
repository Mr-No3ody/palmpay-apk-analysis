package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientRelationshipListResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientRelationshipListResp$Data;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "Data", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryRecipientRelationshipListResp extends CommonResult {

    @Nullable
    private final List<Data> data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientRelationshipListResp$Data;", "", "relationship", "", "relationshipName", "", "<init>", "(ILjava/lang/String;)V", "getRelationship", "()I", "getRelationshipName", "()Ljava/lang/String;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        private final int relationship;

        @Nullable
        private final String relationshipName;

        public Data(int i7, @Nullable String str) {
            this.relationship = i7;
            this.relationshipName = str;
        }

        public final int getRelationship() {
            return this.relationship;
        }

        @Nullable
        public final String getRelationshipName() {
            return this.relationshipName;
        }
    }

    public QueryRecipientRelationshipListResp(@Nullable List<Data> list) {
        this.data = list;
    }

    @Nullable
    public final List<Data> getData() {
        return this.data;
    }
}
