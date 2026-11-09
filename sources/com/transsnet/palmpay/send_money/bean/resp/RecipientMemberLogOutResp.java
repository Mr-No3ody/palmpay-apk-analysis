package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/RecipientMemberLogOutResp;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", FirebaseAnalytics.Param.CONTENT, "getContent", "accountStatus", "", "getAccountStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecipientMemberLogOutResp {

    @Nullable
    private final Integer accountStatus;

    @Nullable
    private final String content;

    @Nullable
    private final String title;

    @Nullable
    public final Integer getAccountStatus() {
        return this.accountStatus;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }
}
