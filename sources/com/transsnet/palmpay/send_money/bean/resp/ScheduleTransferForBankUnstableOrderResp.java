package com.transsnet.palmpay.send_money.bean.resp;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR\u001c\u0010/\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR\u001c\u00102\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\tR\u001e\u00105\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001e\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010?\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R\u001e\u0010B\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\bC\u0010;\"\u0004\bD\u0010=R\u001e\u0010E\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\bF\u0010;\"\u0004\bG\u0010=¨\u0006I"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "Ljava/io/Serializable;", "<init>", "()V", "bookNo", "", "getBookNo", "()Ljava/lang/String;", "setBookNo", "(Ljava/lang/String;)V", "orderNo", "getOrderNo", "setOrderNo", "payeeFullName", "getPayeeFullName", "setPayeeFullName", "payeeBankCardNo", "getPayeeBankCardNo", "setPayeeBankCardNo", "payeeBankCode", "getPayeeBankCode", "setPayeeBankCode", "payeeBankName", "getPayeeBankName", "setPayeeBankName", "payeeBankUrl", "getPayeeBankUrl", "setPayeeBankUrl", "bookStatus", "", "getBookStatus", "()Ljava/lang/Integer;", "setBookStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bookStatusDesc", "getBookStatusDesc", "setBookStatusDesc", "processTime", "getProcessTime", "setProcessTime", "paymentTypeDesc", "getPaymentTypeDesc", "setPaymentTypeDesc", "paymentMethodDesc", "getPaymentMethodDesc", "setPaymentMethodDesc", "payStatusDesc", "getPayStatusDesc", "setPayStatusDesc", "payStatusUrl", "getPayStatusUrl", "setPayStatusUrl", "payStatus", "getPayStatus", "setPayStatus", "createTime", "", "getCreateTime", "()Ljava/lang/Long;", "setCreateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "updateTime", "getUpdateTime", "setUpdateTime", "canceledTime", "getCanceledTime", "setCanceledTime", "amount", "getAmount", "setAmount", "Companion", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferForBankUnstableOrderResp implements Serializable {
    public static final int BOOK_STATUS_BOOKING = 1;
    public static final int BOOK_STATUS_CANCEL = 5;
    public static final int BOOK_STATUS_PROCESSING = 2;
    public static final int BOOK_STATUS_PROCESS_FAIL = 3;
    public static final int BOOK_STATUS_PROCESS_SUCCESS = 4;

    @Nullable
    private Long amount;

    @Nullable
    private String bookNo;

    @Nullable
    private Integer bookStatus;

    @Nullable
    private String bookStatusDesc;

    @Nullable
    private Long canceledTime;

    @Nullable
    private Long createTime;

    @Nullable
    private String orderNo;

    @Nullable
    private Integer payStatus;

    @Nullable
    private String payStatusDesc;

    @Nullable
    private String payStatusUrl;

    @Nullable
    private String payeeBankCardNo;

    @Nullable
    private String payeeBankCode;

    @Nullable
    private String payeeBankName;

    @Nullable
    private String payeeBankUrl;

    @Nullable
    private String payeeFullName;

    @Nullable
    private String paymentMethodDesc;

    @Nullable
    private String paymentTypeDesc;

    @Nullable
    private String processTime;

    @Nullable
    private Long updateTime;

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBookNo() {
        return this.bookNo;
    }

    @Nullable
    public final Integer getBookStatus() {
        return this.bookStatus;
    }

    @Nullable
    public final String getBookStatusDesc() {
        return this.bookStatusDesc;
    }

    @Nullable
    public final Long getCanceledTime() {
        return this.canceledTime;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Integer getPayStatus() {
        return this.payStatus;
    }

    @Nullable
    public final String getPayStatusDesc() {
        return this.payStatusDesc;
    }

    @Nullable
    public final String getPayStatusUrl() {
        return this.payStatusUrl;
    }

    @Nullable
    public final String getPayeeBankCardNo() {
        return this.payeeBankCardNo;
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
    public final String getPayeeBankUrl() {
        return this.payeeBankUrl;
    }

    @Nullable
    public final String getPayeeFullName() {
        return this.payeeFullName;
    }

    @Nullable
    public final String getPaymentMethodDesc() {
        return this.paymentMethodDesc;
    }

    @Nullable
    public final String getPaymentTypeDesc() {
        return this.paymentTypeDesc;
    }

    @Nullable
    public final String getProcessTime() {
        return this.processTime;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setBookNo(@Nullable String str) {
        this.bookNo = str;
    }

    public final void setBookStatus(@Nullable Integer num) {
        this.bookStatus = num;
    }

    public final void setBookStatusDesc(@Nullable String str) {
        this.bookStatusDesc = str;
    }

    public final void setCanceledTime(@Nullable Long l5) {
        this.canceledTime = l5;
    }

    public final void setCreateTime(@Nullable Long l5) {
        this.createTime = l5;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setPayStatus(@Nullable Integer num) {
        this.payStatus = num;
    }

    public final void setPayStatusDesc(@Nullable String str) {
        this.payStatusDesc = str;
    }

    public final void setPayStatusUrl(@Nullable String str) {
        this.payStatusUrl = str;
    }

    public final void setPayeeBankCardNo(@Nullable String str) {
        this.payeeBankCardNo = str;
    }

    public final void setPayeeBankCode(@Nullable String str) {
        this.payeeBankCode = str;
    }

    public final void setPayeeBankName(@Nullable String str) {
        this.payeeBankName = str;
    }

    public final void setPayeeBankUrl(@Nullable String str) {
        this.payeeBankUrl = str;
    }

    public final void setPayeeFullName(@Nullable String str) {
        this.payeeFullName = str;
    }

    public final void setPaymentMethodDesc(@Nullable String str) {
        this.paymentMethodDesc = str;
    }

    public final void setPaymentTypeDesc(@Nullable String str) {
        this.paymentTypeDesc = str;
    }

    public final void setProcessTime(@Nullable String str) {
        this.processTime = str;
    }

    public final void setUpdateTime(@Nullable Long l5) {
        this.updateTime = l5;
    }
}
