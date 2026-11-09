package com.transsnet.palmpay.jara_packet.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRewardsResp;", "", "amount", "", "createTime", "id", "memberId", "", "remark", "status", "type", "typeName", "updateTime", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;J)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnRewardsResp {

    @JvmField
    public final long amount;

    @JvmField
    public final long createTime;

    @JvmField
    public final long id;

    @JvmField
    @NotNull
    public final String memberId;

    @JvmField
    @NotNull
    public final String remark;

    @JvmField
    public final long status;

    @JvmField
    public final long type;

    @JvmField
    @NotNull
    public final String typeName;

    @JvmField
    public final long updateTime;

    public ReferEarnRewardsResp(long j6, long j10, long j11, @NotNull String memberId, @NotNull String remark, long j12, long j13, @NotNull String typeName, long j14) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        this.amount = j6;
        this.createTime = j10;
        this.id = j11;
        this.memberId = memberId;
        this.remark = remark;
        this.status = j12;
        this.type = j13;
        this.typeName = typeName;
        this.updateTime = j14;
    }
}
