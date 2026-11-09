package com.transsnet.palmpay.teller.bean.resp;

import N8.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BillCommonConfigBean;", "", "serviceStatement", "", "<init>", "(Ljava/lang/String;)V", "getServiceStatement", "()Ljava/lang/String;", "setServiceStatement", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BillCommonConfigBean {

    @Nullable
    private String serviceStatement;

    /* JADX WARN: Multi-variable type inference failed */
    public BillCommonConfigBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BillCommonConfigBean copy$default(BillCommonConfigBean billCommonConfigBean, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = billCommonConfigBean.serviceStatement;
        }
        return billCommonConfigBean.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceStatement() {
        return this.serviceStatement;
    }

    @NotNull
    public final BillCommonConfigBean copy(@Nullable String serviceStatement) {
        return new BillCommonConfigBean(serviceStatement);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BillCommonConfigBean) && Intrinsics.c(this.serviceStatement, ((BillCommonConfigBean) other).serviceStatement);
    }

    @Nullable
    public final String getServiceStatement() {
        return this.serviceStatement;
    }

    public int hashCode() {
        String str = this.serviceStatement;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setServiceStatement(@Nullable String str) {
        this.serviceStatement = str;
    }

    @NotNull
    public String toString() {
        return q0.k("BillCommonConfigBean(serviceStatement=", this.serviceStatement, ")");
    }

    public BillCommonConfigBean(@Nullable String str) {
        this.serviceStatement = str;
    }

    public /* synthetic */ BillCommonConfigBean(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }
}
