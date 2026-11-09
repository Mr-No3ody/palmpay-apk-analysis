package com.transsnet.palmpay.send_money.impl;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/send_money/impl/MatchRecipientsImpl;", "", "getIcon", "", "getName", "getAccount", "getBankName", "getAccountMask", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MatchRecipientsImpl {
    @Nullable
    String getAccount();

    @Nullable
    String getAccountMask();

    @Nullable
    String getBankName();

    @Nullable
    String getIcon();

    @Nullable
    String getName();
}
