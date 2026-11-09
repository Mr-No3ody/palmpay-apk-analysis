package com.transsnet.palmpay.send_money.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b3\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\u001e\u0010!\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR\u001e\u0010$\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u001e\u0010'\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR\u001e\u0010*\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001e\u0010-\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\u001c\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001c\u00109\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001c\u0010?\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\t¨\u0006H"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferCreateReq;", "", "<init>", "()V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "taskType", "", "getTaskType", "()Ljava/lang/Integer;", "setTaskType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "transferTime", "getTransferTime", "setTransferTime", "businessAmount", "", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "type", "getType", "setType", "transferNum", "getTransferNum", "setTransferNum", "payType", "getPayType", "setPayType", "taskStartDate", "getTaskStartDate", "setTaskStartDate", "taskStartTime", "getTaskStartTime", "setTaskStartTime", "taskEndDate", "getTaskEndDate", "setTaskEndDate", "taskEndTime", "getTaskEndTime", "setTaskEndTime", "scheduleTransferNotes", "getScheduleTransferNotes", "setScheduleTransferNotes", "payeePhone", "getPayeePhone", "setPayeePhone", "payeeMemberId", "getPayeeMemberId", "setPayeeMemberId", "payeeName", "getPayeeName", "setPayeeName", "payeeBankNo", "getPayeeBankNo", "setPayeeBankNo", "payeeBankCode", "getPayeeBankCode", "setPayeeBankCode", "payeeBankName", "getPayeeBankName", "setPayeeBankName", "payeeIcon", "getPayeeIcon", "setPayeeIcon", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferCreateReq {

    @Nullable
    private Long businessAmount;

    @Nullable
    private Integer payType;

    @Nullable
    private String payeeBankCode;

    @Nullable
    private String payeeBankName;

    @Nullable
    private String payeeBankNo;

    @Nullable
    private String payeeIcon;

    @Nullable
    private String payeeMemberId;

    @Nullable
    private String payeeName;

    @Nullable
    private String payeePhone;

    @Nullable
    private String scheduleTransferNotes;

    @Nullable
    private Long taskEndDate;

    @Nullable
    private Integer taskEndTime;

    @Nullable
    private Long taskStartDate;

    @Nullable
    private Integer taskStartTime;

    @Nullable
    private Integer taskType;

    @Nullable
    private String token;

    @Nullable
    private Integer transferNum;

    @Nullable
    private Integer transferTime;

    @Nullable
    private Integer type;

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final Integer getPayType() {
        return this.payType;
    }

    @Nullable
    public final String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    @Nullable
    public final String getPayeeBankName() {
        return this.payeeBankName;
    }

    @Nullable
    public final String getPayeeBankNo() {
        return this.payeeBankNo;
    }

    @Nullable
    public final String getPayeeIcon() {
        return this.payeeIcon;
    }

    @Nullable
    public final String getPayeeMemberId() {
        return this.payeeMemberId;
    }

    @Nullable
    public final String getPayeeName() {
        return this.payeeName;
    }

    @Nullable
    public final String getPayeePhone() {
        return this.payeePhone;
    }

    @Nullable
    public final String getScheduleTransferNotes() {
        return this.scheduleTransferNotes;
    }

    @Nullable
    public final Long getTaskEndDate() {
        return this.taskEndDate;
    }

    @Nullable
    public final Integer getTaskEndTime() {
        return this.taskEndTime;
    }

    @Nullable
    public final Long getTaskStartDate() {
        return this.taskStartDate;
    }

    @Nullable
    public final Integer getTaskStartTime() {
        return this.taskStartTime;
    }

    @Nullable
    public final Integer getTaskType() {
        return this.taskType;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Integer getTransferNum() {
        return this.transferNum;
    }

    @Nullable
    public final Integer getTransferTime() {
        return this.transferTime;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setPayType(@Nullable Integer num) {
        this.payType = num;
    }

    public final void setPayeeBankCode(@Nullable String str) {
        this.payeeBankCode = str;
    }

    public final void setPayeeBankName(@Nullable String str) {
        this.payeeBankName = str;
    }

    public final void setPayeeBankNo(@Nullable String str) {
        this.payeeBankNo = str;
    }

    public final void setPayeeIcon(@Nullable String str) {
        this.payeeIcon = str;
    }

    public final void setPayeeMemberId(@Nullable String str) {
        this.payeeMemberId = str;
    }

    public final void setPayeeName(@Nullable String str) {
        this.payeeName = str;
    }

    public final void setPayeePhone(@Nullable String str) {
        this.payeePhone = str;
    }

    public final void setScheduleTransferNotes(@Nullable String str) {
        this.scheduleTransferNotes = str;
    }

    public final void setTaskEndDate(@Nullable Long l5) {
        this.taskEndDate = l5;
    }

    public final void setTaskEndTime(@Nullable Integer num) {
        this.taskEndTime = num;
    }

    public final void setTaskStartDate(@Nullable Long l5) {
        this.taskStartDate = l5;
    }

    public final void setTaskStartTime(@Nullable Integer num) {
        this.taskStartTime = num;
    }

    public final void setTaskType(@Nullable Integer num) {
        this.taskType = num;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setTransferNum(@Nullable Integer num) {
        this.transferNum = num;
    }

    public final void setTransferTime(@Nullable Integer num) {
        this.transferTime = num;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
