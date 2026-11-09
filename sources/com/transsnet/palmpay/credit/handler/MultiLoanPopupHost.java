package com.transsnet.palmpay.credit.handler;

import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/handler/MultiLoanPopupHost;", "", "findInstallmentProductForMultiLoanPopup", "Lcom/transsnet/palmpay/credit/bean/ProductContentInfo;", "onMultiLoanPopupCta", "", "product", "isNewLoanHomeForMultiLoanPopup", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MultiLoanPopupHost {
    @Nullable
    ProductContentInfo findInstallmentProductForMultiLoanPopup();

    boolean isNewLoanHomeForMultiLoanPopup();

    void onMultiLoanPopupCta(@NotNull ProductContentInfo product);
}
