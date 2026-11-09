package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/IsBookTransferResp;", "", "<init>", "()V", "entranceContent", "", "getEntranceContent", "()Ljava/lang/String;", "setEntranceContent", "(Ljava/lang/String;)V", "hasPreBookTransfer", "", "getHasPreBookTransfer", "()Ljava/lang/Integer;", "setHasPreBookTransfer", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IsBookTransferResp {

    @Nullable
    private String entranceContent;

    @Nullable
    private Integer hasPreBookTransfer;

    @Nullable
    public final String getEntranceContent() {
        return this.entranceContent;
    }

    @Nullable
    public final Integer getHasPreBookTransfer() {
        return this.hasPreBookTransfer;
    }

    public final void setEntranceContent(@Nullable String str) {
        this.entranceContent = str;
    }

    public final void setHasPreBookTransfer(@Nullable Integer num) {
        this.hasPreBookTransfer = num;
    }
}
