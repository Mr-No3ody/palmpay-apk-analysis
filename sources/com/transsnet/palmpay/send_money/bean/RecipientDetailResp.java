package com.transsnet.palmpay.send_money.bean;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/RecipientDetailResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/send_money/bean/RecipientDetailData;", "<init>", "(Lcom/transsnet/palmpay/send_money/bean/RecipientDetailData;)V", "getData", "()Lcom/transsnet/palmpay/send_money/bean/RecipientDetailData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RecipientDetailResp extends CommonResult {

    @Nullable
    private final RecipientDetailData data;

    public RecipientDetailResp(@Nullable RecipientDetailData recipientDetailData) {
        this.data = recipientDetailData;
    }

    public static /* synthetic */ RecipientDetailResp copy$default(RecipientDetailResp recipientDetailResp, RecipientDetailData recipientDetailData, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            recipientDetailData = recipientDetailResp.data;
        }
        return recipientDetailResp.copy(recipientDetailData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecipientDetailData getData() {
        return this.data;
    }

    @NotNull
    public final RecipientDetailResp copy(@Nullable RecipientDetailData data) {
        return new RecipientDetailResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecipientDetailResp) && Intrinsics.c(this.data, ((RecipientDetailResp) other).data);
    }

    @Nullable
    public final RecipientDetailData getData() {
        return this.data;
    }

    public int hashCode() {
        RecipientDetailData recipientDetailData = this.data;
        if (recipientDetailData == null) {
            return 0;
        }
        return recipientDetailData.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "RecipientDetailResp(data=" + this.data + ")";
    }
}
