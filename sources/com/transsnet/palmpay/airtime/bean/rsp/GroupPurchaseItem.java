package com.transsnet.palmpay.airtime.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/GroupPurchaseItem;", "", "<init>", "()V", "avatar", "", "", "getAvatar", "()Ljava/util/List;", "setAvatar", "(Ljava/util/List;)V", "activityId", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "amount", "", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "groupAmount", "getGroupAmount", "setGroupAmount", "groupNumber", "getGroupNumber", "setGroupNumber", "currentGroupNumber", "getCurrentGroupNumber", "setCurrentGroupNumber", "initiatorMemberName", "getInitiatorMemberName", "setInitiatorMemberName", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroupPurchaseItem {

    @Nullable
    private String activityId;

    @Nullable
    private Long amount;

    @Nullable
    private List<String> avatar;

    @Nullable
    private Long currentGroupNumber;

    @Nullable
    private Long groupAmount;

    @Nullable
    private Long groupNumber;

    @Nullable
    private String initiatorMemberName;

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final List<String> getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final Long getCurrentGroupNumber() {
        return this.currentGroupNumber;
    }

    @Nullable
    public final Long getGroupAmount() {
        return this.groupAmount;
    }

    @Nullable
    public final Long getGroupNumber() {
        return this.groupNumber;
    }

    @Nullable
    public final String getInitiatorMemberName() {
        return this.initiatorMemberName;
    }

    public final void setActivityId(@Nullable String str) {
        this.activityId = str;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setAvatar(@Nullable List<String> list) {
        this.avatar = list;
    }

    public final void setCurrentGroupNumber(@Nullable Long l5) {
        this.currentGroupNumber = l5;
    }

    public final void setGroupAmount(@Nullable Long l5) {
        this.groupAmount = l5;
    }

    public final void setGroupNumber(@Nullable Long l5) {
        this.groupNumber = l5;
    }

    public final void setInitiatorMemberName(@Nullable String str) {
        this.initiatorMemberName = str;
    }
}
