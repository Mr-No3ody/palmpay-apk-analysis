package com.transsnet.palmpay.jara_packet.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnWithDraw;", "", "commentEnable", "", "amount", "", "createTime", "headPortrait", "", "id", "memberId", "memberName", "orderNo", "phone", "referId", "remark", "status", "", "updateTime", "<init>", "(ZJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnWithDraw {

    @JvmField
    public final long amount;

    @JvmField
    public boolean commentEnable;

    @JvmField
    public final long createTime;

    @JvmField
    @NotNull
    public final String headPortrait;

    @JvmField
    public final long id;

    @JvmField
    @NotNull
    public final String memberId;

    @JvmField
    @NotNull
    public final String memberName;

    @JvmField
    @NotNull
    public final String orderNo;

    @JvmField
    @NotNull
    public final String phone;

    @JvmField
    @NotNull
    public final String referId;

    @JvmField
    @NotNull
    public final String remark;

    @JvmField
    public final int status;

    @JvmField
    public final long updateTime;

    public ReferEarnWithDraw(boolean z3, long j6, long j10, @NotNull String headPortrait, long j11, @NotNull String memberId, @NotNull String memberName, @NotNull String orderNo, @NotNull String phone, @NotNull String referId, @NotNull String remark, int i7, long j12) {
        Intrinsics.checkNotNullParameter(headPortrait, "headPortrait");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(referId, "referId");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.commentEnable = z3;
        this.amount = j6;
        this.createTime = j10;
        this.headPortrait = headPortrait;
        this.id = j11;
        this.memberId = memberId;
        this.memberName = memberName;
        this.orderNo = orderNo;
        this.phone = phone;
        this.referId = referId;
        this.remark = remark;
        this.status = i7;
        this.updateTime = j12;
    }
}
