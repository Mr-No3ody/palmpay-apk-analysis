package com.transsnet.palmpay.jara_packet.bean.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecordsResp;", "", "curPage", "", "list", "", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecord;", "total", "totalPage", "<init>", "(JLjava/util/List;JJ)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnRecordsResp {

    @JvmField
    public final long curPage;

    @JvmField
    @NotNull
    public final List<ReferEarnRecord> list;

    @JvmField
    public final long total;

    @JvmField
    public final long totalPage;

    public ReferEarnRecordsResp(long j6, @NotNull List<ReferEarnRecord> list, long j10, long j11) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.curPage = j6;
        this.list = list;
        this.total = j10;
        this.totalPage = j11;
    }
}
