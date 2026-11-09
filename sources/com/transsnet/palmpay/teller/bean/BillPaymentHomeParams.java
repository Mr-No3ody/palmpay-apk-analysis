package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u000bR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0011\"\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BillPaymentHomeParams;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "categoryId", "", "showDialog", "", "<init>", "(Ljava/lang/String;Z)V", "isSelectPaymentItemForOtherPager", "(Ljava/lang/String;ZZ)V", "quotaResult", "(Z)V", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "getShowDialog", "()Z", "setShowDialog", "getQuotaResult", "setQuotaResult", "setSelectPaymentItemForOtherPager", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillPaymentHomeParams implements SingleLiveData$Params {

    @Nullable
    private String categoryId;
    private boolean isSelectPaymentItemForOtherPager;
    private boolean quotaResult;
    private boolean showDialog;

    public BillPaymentHomeParams(@Nullable String str, boolean z3) {
        this.categoryId = str;
        this.showDialog = z3;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    public final boolean getQuotaResult() {
        return this.quotaResult;
    }

    public final boolean getShowDialog() {
        return this.showDialog;
    }

    /* JADX INFO: renamed from: isSelectPaymentItemForOtherPager, reason: from getter */
    public final boolean getIsSelectPaymentItemForOtherPager() {
        return this.isSelectPaymentItemForOtherPager;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setQuotaResult(boolean z3) {
        this.quotaResult = z3;
    }

    public final void setSelectPaymentItemForOtherPager(boolean z3) {
        this.isSelectPaymentItemForOtherPager = z3;
    }

    public final void setShowDialog(boolean z3) {
        this.showDialog = z3;
    }

    public BillPaymentHomeParams(@Nullable String str, boolean z3, boolean z8) {
        this.categoryId = str;
        this.showDialog = z3;
        this.isSelectPaymentItemForOtherPager = z8;
    }

    public BillPaymentHomeParams(boolean z3) {
        this.quotaResult = z3;
    }
}
