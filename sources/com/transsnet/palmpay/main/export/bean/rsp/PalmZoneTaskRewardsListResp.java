package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneTaskRewardsListResp;", "", "list", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneTaskRewardsRecord;", "total", "", "totalPage", "curPage", "pageSize", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmZoneTaskRewardsListResp {

    @JvmField
    @Nullable
    public final Integer curPage;

    @JvmField
    @Nullable
    public final List<PalmZoneTaskRewardsRecord> list;

    @JvmField
    @Nullable
    public final Integer pageSize;

    @JvmField
    @Nullable
    public final Integer total;

    @JvmField
    @Nullable
    public final Integer totalPage;

    public PalmZoneTaskRewardsListResp(@Nullable List<PalmZoneTaskRewardsRecord> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.list = list;
        this.total = num;
        this.totalPage = num2;
        this.curPage = num3;
        this.pageSize = num4;
    }
}
