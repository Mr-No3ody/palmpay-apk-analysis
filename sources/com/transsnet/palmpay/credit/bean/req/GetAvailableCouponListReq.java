package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/GetAvailableCouponListReq;", "", "type", "", "orderDto", "Lcom/transsnet/palmpay/credit/bean/req/GetAvailableCouponListReq$OrderDto;", "deductionExpenses", "<init>", "(ILcom/transsnet/palmpay/credit/bean/req/GetAvailableCouponListReq$OrderDto;I)V", "getType", "()I", "getOrderDto", "()Lcom/transsnet/palmpay/credit/bean/req/GetAvailableCouponListReq$OrderDto;", "getDeductionExpenses", "OrderDto", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetAvailableCouponListReq {
    private final int deductionExpenses;

    @Nullable
    private final OrderDto orderDto;
    private final int type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/GetAvailableCouponListReq$OrderDto;", "", "transTypes", "", "", "<init>", "([Ljava/lang/String;)V", "getTransTypes", "()[Ljava/lang/String;", "[Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderDto {

        @Nullable
        private final String[] transTypes;

        public OrderDto(@Nullable String[] strArr) {
            this.transTypes = strArr;
        }

        @Nullable
        public final String[] getTransTypes() {
            return this.transTypes;
        }
    }

    public GetAvailableCouponListReq(int i7, @Nullable OrderDto orderDto, int i10) {
        this.type = i7;
        this.orderDto = orderDto;
        this.deductionExpenses = i10;
    }

    public final int getDeductionExpenses() {
        return this.deductionExpenses;
    }

    @Nullable
    public final OrderDto getOrderDto() {
        return this.orderDto;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ GetAvailableCouponListReq(int i7, OrderDto orderDto, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, orderDto, (i11 & 4) != 0 ? 2 : i10);
    }
}
