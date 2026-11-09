package com.transsnet.palmpay.jara_packet.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnOrderLatestResp;", "", "amount", "", "createTime", "headPortrait", "", "id", "memberId", "memberName", "phone", "remark", "status", "updateTime", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnOrderLatestResp {

    @JvmField
    public final long amount;

    @JvmField
    public final long createTime;

    @JvmField
    @NotNull
    public final String headPortrait;

    @JvmField
    @NotNull
    public final String id;

    @JvmField
    @NotNull
    public final String memberId;

    @JvmField
    @NotNull
    public final String memberName;

    @JvmField
    @NotNull
    public final String phone;

    @JvmField
    @NotNull
    public final String remark;

    @JvmField
    @NotNull
    public final String status;

    @JvmField
    @NotNull
    public final String updateTime;

    public ReferEarnOrderLatestResp(long j6, long j10, @NotNull String headPortrait, @NotNull String id2, @NotNull String memberId, @NotNull String memberName, @NotNull String phone, @NotNull String remark, @NotNull String status, @NotNull String updateTime) {
        Intrinsics.checkNotNullParameter(headPortrait, "headPortrait");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        this.amount = j6;
        this.createTime = j10;
        this.headPortrait = headPortrait;
        this.id = id2;
        this.memberId = memberId;
        this.memberName = memberName;
        this.phone = phone;
        this.remark = remark;
        this.status = status;
        this.updateTime = updateTime;
    }
}
