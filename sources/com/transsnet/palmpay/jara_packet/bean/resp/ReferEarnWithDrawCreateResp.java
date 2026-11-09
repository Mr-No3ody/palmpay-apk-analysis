package com.transsnet.palmpay.jara_packet.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnWithDrawCreateResp;", "", "amount", "", "createTime", "headPortrait", "", "id", "memberId", "memberName", "orderNo", "phone", "referId", "remark", "status", "", "commentTips", "bindTips", "updateTime", "bindCardEnable", "", "commentEnable", "<init>", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JZZ)V", "Ljava/lang/Integer;", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnWithDrawCreateResp {

    @JvmField
    public final long amount;

    @JvmField
    public final boolean bindCardEnable;

    @JvmField
    @NotNull
    public final String bindTips;

    @JvmField
    public final boolean commentEnable;

    @JvmField
    @NotNull
    public final String commentTips;

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
    @Nullable
    public final String remark;

    @JvmField
    @Nullable
    public final Integer status;

    @JvmField
    public final long updateTime;

    public ReferEarnWithDrawCreateResp(long j6, long j10, @NotNull String headPortrait, long j11, @NotNull String memberId, @NotNull String memberName, @NotNull String orderNo, @NotNull String phone, @NotNull String referId, @Nullable String str, @Nullable Integer num, @NotNull String commentTips, @NotNull String bindTips, long j12, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(headPortrait, "headPortrait");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(referId, "referId");
        Intrinsics.checkNotNullParameter(commentTips, "commentTips");
        Intrinsics.checkNotNullParameter(bindTips, "bindTips");
        this.amount = j6;
        this.createTime = j10;
        this.headPortrait = headPortrait;
        this.id = j11;
        this.memberId = memberId;
        this.memberName = memberName;
        this.orderNo = orderNo;
        this.phone = phone;
        this.referId = referId;
        this.remark = str;
        this.status = num;
        this.commentTips = commentTips;
        this.bindTips = bindTips;
        this.updateTime = j12;
        this.bindCardEnable = z3;
        this.commentEnable = z8;
    }
}
