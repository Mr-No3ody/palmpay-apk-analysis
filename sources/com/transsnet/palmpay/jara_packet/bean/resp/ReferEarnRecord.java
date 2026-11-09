package com.transsnet.palmpay.jara_packet.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecord;", "", "activeStatus", "", "verifyStatus", "createTime", "", "inviteeType", "friendName", "", "id", "memberId", "phone", "regRewardAmt", "activeRewardAmt", "regStatus", "remark", "status", "updateTime", "regTaskName", "activeTaskName", "<init>", "(IIJILjava/lang/String;JLjava/lang/String;Ljava/lang/String;JJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnRecord {

    @JvmField
    public final long activeRewardAmt;

    @JvmField
    public final int activeStatus;

    @JvmField
    @Nullable
    public String activeTaskName;

    @JvmField
    public final long createTime;

    @JvmField
    @NotNull
    public final String friendName;

    @JvmField
    public final long id;

    @JvmField
    public final int inviteeType;

    @JvmField
    @NotNull
    public final String memberId;

    @JvmField
    @NotNull
    public final String phone;

    @JvmField
    public final long regRewardAmt;

    @JvmField
    public final int regStatus;

    @JvmField
    @Nullable
    public String regTaskName;

    @JvmField
    @NotNull
    public final String remark;

    @JvmField
    public final int status;

    @JvmField
    public final long updateTime;

    @JvmField
    public final int verifyStatus;

    public ReferEarnRecord(int i7, int i10, long j6, int i11, @NotNull String friendName, long j10, @NotNull String memberId, @NotNull String phone, long j11, long j12, int i12, @NotNull String remark, int i13, long j13, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(friendName, "friendName");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.activeStatus = i7;
        this.verifyStatus = i10;
        this.createTime = j6;
        this.inviteeType = i11;
        this.friendName = friendName;
        this.id = j10;
        this.memberId = memberId;
        this.phone = phone;
        this.regRewardAmt = j11;
        this.activeRewardAmt = j12;
        this.regStatus = i12;
        this.remark = remark;
        this.status = i13;
        this.updateTime = j13;
        this.regTaskName = str;
        this.activeTaskName = str2;
    }
}
