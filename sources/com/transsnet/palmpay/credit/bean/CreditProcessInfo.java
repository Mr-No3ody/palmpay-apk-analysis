package com.transsnet.palmpay.credit.bean;

import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/CreditProcessInfo;", "", "applyId", "", "loanProduct", "operateType", "currentIndex", "", "routeInfoList", "", "Lcom/transsnet/palmpay/credit/bean/req/OcRouterDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreditProcessInfo {

    @JvmField
    @Nullable
    public String applyId;

    @JvmField
    public int currentIndex;

    @JvmField
    @Nullable
    public final String loanProduct;

    @JvmField
    @Nullable
    public final String operateType;

    @JvmField
    @Nullable
    public final List<OcRouterDetail> routeInfoList;

    public CreditProcessInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable List<OcRouterDetail> list) {
        this.applyId = str;
        this.loanProduct = str2;
        this.operateType = str3;
        this.currentIndex = i7;
        this.routeInfoList = list;
    }
}
