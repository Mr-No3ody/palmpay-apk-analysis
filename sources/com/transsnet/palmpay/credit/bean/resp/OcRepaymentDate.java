package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcRepaymentDate;", "", "day", "", "nextBillDateStamp", "", "select", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextBillDateStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSelect", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepaymentDate {

    @Nullable
    private final Integer day;

    @Nullable
    private final Long nextBillDateStamp;

    @Nullable
    private final Boolean select;

    public OcRepaymentDate(@Nullable Integer num, @Nullable Long l5, @Nullable Boolean bool) {
        this.day = num;
        this.nextBillDateStamp = l5;
        this.select = bool;
    }

    @Nullable
    public final Integer getDay() {
        return this.day;
    }

    @Nullable
    public final Long getNextBillDateStamp() {
        return this.nextBillDateStamp;
    }

    @Nullable
    public final Boolean getSelect() {
        return this.select;
    }
}
