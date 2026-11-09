package com.transsnet.palmpay.core.bean.req;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/DeleteHistoryOrderReq;", "", "ids", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeleteHistoryOrderReq {

    @JvmField
    @NotNull
    public ArrayList<Long> ids;

    public DeleteHistoryOrderReq(@NotNull ArrayList<Long> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.ids = ids;
    }
}
