package com.transsnet.palmpay.send_money.bean.event;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "", "<init>", "()V", "isSendAgain", "", "()Z", "setSendAgain", "(Z)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionEvent {
    private boolean isSendAgain;

    /* JADX INFO: renamed from: isSendAgain, reason: from getter */
    public final boolean getIsSendAgain() {
        return this.isSendAgain;
    }

    public final void setSendAgain(boolean z3) {
        this.isSendAgain = z3;
    }
}
