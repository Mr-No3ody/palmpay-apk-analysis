package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.send_money.bean.Compensation;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferToBankAccountInfoResp;", "", "<init>", "()V", "relationshipPic", "", "getRelationshipPic", "()Ljava/lang/String;", "setRelationshipPic", "(Ljava/lang/String;)V", "relationshipDarkPic", "getRelationshipDarkPic", "setRelationshipDarkPic", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "compensation", "Lcom/transsnet/palmpay/send_money/bean/Compensation;", "getCompensation", "()Lcom/transsnet/palmpay/send_money/bean/Compensation;", "setCompensation", "(Lcom/transsnet/palmpay/send_money/bean/Compensation;)V", "recipientTradeStatus", "", "getRecipientTradeStatus", "()Ljava/lang/Integer;", "setRecipientTradeStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferToBankAccountInfoResp {

    @Nullable
    private Compensation compensation;

    @Nullable
    private String label;

    @Nullable
    private Integer recipientTradeStatus;

    @Nullable
    private String relationshipDarkPic;

    @Nullable
    private String relationshipPic;

    @Nullable
    public final Compensation getCompensation() {
        return this.compensation;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final Integer getRecipientTradeStatus() {
        return this.recipientTradeStatus;
    }

    @Nullable
    public final String getRelationshipDarkPic() {
        return this.relationshipDarkPic;
    }

    @Nullable
    public final String getRelationshipPic() {
        return this.relationshipPic;
    }

    public final void setCompensation(@Nullable Compensation compensation) {
        this.compensation = compensation;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setRecipientTradeStatus(@Nullable Integer num) {
        this.recipientTradeStatus = num;
    }

    public final void setRelationshipDarkPic(@Nullable String str) {
        this.relationshipDarkPic = str;
    }

    public final void setRelationshipPic(@Nullable String str) {
        this.relationshipPic = str;
    }
}
