package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryPopUpsBean;", "", "popUp", "", "businessInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryPopUpsBean$BusinessInfo;", "<init>", "(ZLcom/transsnet/palmpay/credit/bean/resp/QueryPopUpsBean$BusinessInfo;)V", "getPopUp", "()Z", "setPopUp", "(Z)V", "getBusinessInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryPopUpsBean$BusinessInfo;", "setBusinessInfo", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryPopUpsBean$BusinessInfo;)V", "BusinessInfo", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryPopUpsBean {

    @NotNull
    private BusinessInfo businessInfo;
    private boolean popUp;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryPopUpsBean$BusinessInfo;", "", "creditQuota", "", "<init>", "(J)V", "getCreditQuota", "()J", "setCreditQuota", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BusinessInfo {
        private long creditQuota;

        public BusinessInfo(long j6) {
            this.creditQuota = j6;
        }

        public final long getCreditQuota() {
            return this.creditQuota;
        }

        public final void setCreditQuota(long j6) {
            this.creditQuota = j6;
        }
    }

    public QueryPopUpsBean(boolean z3, @NotNull BusinessInfo businessInfo) {
        Intrinsics.checkNotNullParameter(businessInfo, "businessInfo");
        this.popUp = z3;
        this.businessInfo = businessInfo;
    }

    @NotNull
    public final BusinessInfo getBusinessInfo() {
        return this.businessInfo;
    }

    public final boolean getPopUp() {
        return this.popUp;
    }

    public final void setBusinessInfo(@NotNull BusinessInfo businessInfo) {
        Intrinsics.checkNotNullParameter(businessInfo, "<set-?>");
        this.businessInfo = businessInfo;
    }

    public final void setPopUp(boolean z3) {
        this.popUp = z3;
    }
}
