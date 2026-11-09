package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcRewardListData;", "", "activeStatus", "", "activeTime", "", "amount", "createTime", "friendMemberId", "", "friendPhone", "id", "inviteTime", "memberId", "updateTime", "withdrawStatus", "<init>", "(IJJJLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;JI)V", "getActiveStatus", "()I", "getActiveTime", "()J", "getAmount", "getCreateTime", "getFriendMemberId", "()Ljava/lang/String;", "getFriendPhone", "getId", "getInviteTime", "getMemberId", "getUpdateTime", "getWithdrawStatus", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRewardListData {
    private final int activeStatus;
    private final long activeTime;
    private final long amount;
    private final long createTime;

    @NotNull
    private final String friendMemberId;

    @NotNull
    private final String friendPhone;
    private final long id;
    private final long inviteTime;

    @NotNull
    private final String memberId;
    private final long updateTime;
    private final int withdrawStatus;

    public OcRewardListData(int i7, long j6, long j10, long j11, @NotNull String friendMemberId, @NotNull String friendPhone, long j12, long j13, @NotNull String memberId, long j14, int i10) {
        Intrinsics.checkNotNullParameter(friendMemberId, "friendMemberId");
        Intrinsics.checkNotNullParameter(friendPhone, "friendPhone");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        this.activeStatus = i7;
        this.activeTime = j6;
        this.amount = j10;
        this.createTime = j11;
        this.friendMemberId = friendMemberId;
        this.friendPhone = friendPhone;
        this.id = j12;
        this.inviteTime = j13;
        this.memberId = memberId;
        this.updateTime = j14;
        this.withdrawStatus = i10;
    }

    public final int getActiveStatus() {
        return this.activeStatus;
    }

    public final long getActiveTime() {
        return this.activeTime;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getFriendMemberId() {
        return this.friendMemberId;
    }

    @NotNull
    public final String getFriendPhone() {
        return this.friendPhone;
    }

    public final long getId() {
        return this.id;
    }

    public final long getInviteTime() {
        return this.inviteTime;
    }

    @NotNull
    public final String getMemberId() {
        return this.memberId;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getWithdrawStatus() {
        return this.withdrawStatus;
    }
}
