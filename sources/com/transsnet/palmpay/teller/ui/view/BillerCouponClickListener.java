package com.transsnet.palmpay.teller.ui.view;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/BillerCouponClickListener;", "", "onCouponUseClick", "", "list", "", "", "amount", "", "onCouponClaimComplete", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BillerCouponClickListener {
    void onCouponClaimComplete();

    void onCouponUseClick(@Nullable List<String> list, long amount);
}
