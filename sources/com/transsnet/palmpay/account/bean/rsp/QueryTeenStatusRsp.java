package com.transsnet.palmpay.account.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/bean/rsp/QueryTeenStatusRsp;", "", "<init>", "()V", "teenStatus", "", "lastApplyOrderRecord", "Lcom/transsnet/palmpay/account/bean/rsp/TeenAuthRecord;", "module_account_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryTeenStatusRsp {

    @JvmField
    @Nullable
    public TeenAuthRecord lastApplyOrderRecord;

    @JvmField
    public int teenStatus;
}
