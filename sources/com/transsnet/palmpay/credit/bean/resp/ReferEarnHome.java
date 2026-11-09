package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b!\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u001b\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\u001c\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u00106¨\u0006:"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/ReferEarnHome;", "", "actualAmt", "", "createTime", "endTime", "extraRewardAmt", "headPortrait", "", "id", "memberId", "memberName", "nextAmt", "nextUserCount", "phone", "remark", "ruleId", "ruleVersion", "startTime", "status", "targetAmt1", "targetAmt2", "targetAmt3", "updateTime", "upgradeFlag", "", "withdrawAmt", "withdrawEnable", "shareEnable", "<init>", "(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;JJJJJJJJZJZZ)V", "getActualAmt", "()J", "getCreateTime", "getEndTime", "getExtraRewardAmt", "getHeadPortrait", "()Ljava/lang/String;", "getId", "getMemberId", "getMemberName", "getNextAmt", "getNextUserCount", "getPhone", "getRemark", "getRuleId", "getRuleVersion", "getStartTime", "getStatus", "getTargetAmt1", "getTargetAmt2", "getTargetAmt3", "getUpdateTime", "getUpgradeFlag", "()Z", "getWithdrawAmt", "getWithdrawEnable", "getShareEnable", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnHome {
    private final long actualAmt;
    private final long createTime;
    private final long endTime;
    private final long extraRewardAmt;

    @NotNull
    private final String headPortrait;

    @NotNull
    private final String id;

    @NotNull
    private final String memberId;

    @NotNull
    private final String memberName;
    private final long nextAmt;
    private final long nextUserCount;

    @NotNull
    private final String phone;

    @NotNull
    private final String remark;
    private final long ruleId;
    private final long ruleVersion;
    private final boolean shareEnable;
    private final long startTime;
    private final long status;
    private final long targetAmt1;
    private final long targetAmt2;
    private final long targetAmt3;
    private final long updateTime;
    private final boolean upgradeFlag;
    private final long withdrawAmt;
    private final boolean withdrawEnable;

    public ReferEarnHome(long j6, long j10, long j11, long j12, @NotNull String headPortrait, @NotNull String id2, @NotNull String memberId, @NotNull String memberName, long j13, long j14, @NotNull String phone, @NotNull String remark, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, boolean z3, long j23, boolean z8, boolean z10) {
        Intrinsics.checkNotNullParameter(headPortrait, "headPortrait");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.actualAmt = j6;
        this.createTime = j10;
        this.endTime = j11;
        this.extraRewardAmt = j12;
        this.headPortrait = headPortrait;
        this.id = id2;
        this.memberId = memberId;
        this.memberName = memberName;
        this.nextAmt = j13;
        this.nextUserCount = j14;
        this.phone = phone;
        this.remark = remark;
        this.ruleId = j15;
        this.ruleVersion = j16;
        this.startTime = j17;
        this.status = j18;
        this.targetAmt1 = j19;
        this.targetAmt2 = j20;
        this.targetAmt3 = j21;
        this.updateTime = j22;
        this.upgradeFlag = z3;
        this.withdrawAmt = j23;
        this.withdrawEnable = z8;
        this.shareEnable = z10;
    }

    public final long getActualAmt() {
        return this.actualAmt;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getExtraRewardAmt() {
        return this.extraRewardAmt;
    }

    @NotNull
    public final String getHeadPortrait() {
        return this.headPortrait;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMemberId() {
        return this.memberId;
    }

    @NotNull
    public final String getMemberName() {
        return this.memberName;
    }

    public final long getNextAmt() {
        return this.nextAmt;
    }

    public final long getNextUserCount() {
        return this.nextUserCount;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    public final long getRuleId() {
        return this.ruleId;
    }

    public final long getRuleVersion() {
        return this.ruleVersion;
    }

    public final boolean getShareEnable() {
        return this.shareEnable;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getStatus() {
        return this.status;
    }

    public final long getTargetAmt1() {
        return this.targetAmt1;
    }

    public final long getTargetAmt2() {
        return this.targetAmt2;
    }

    public final long getTargetAmt3() {
        return this.targetAmt3;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final boolean getUpgradeFlag() {
        return this.upgradeFlag;
    }

    public final long getWithdrawAmt() {
        return this.withdrawAmt;
    }

    public final boolean getWithdrawEnable() {
        return this.withdrawEnable;
    }
}
