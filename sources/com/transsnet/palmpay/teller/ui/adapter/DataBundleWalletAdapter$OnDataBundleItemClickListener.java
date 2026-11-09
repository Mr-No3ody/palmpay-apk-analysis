package com.transsnet.palmpay.teller.ui.adapter;

import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/transsnet/palmpay/teller/ui/adapter/DataBundleWalletAdapter$OnDataBundleItemClickListener", "", "", ViewProps.POSITION, "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "item", "", "onNormalItemClick", "(ILcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DataBundleWalletAdapter$OnDataBundleItemClickListener {
    void onNormalItemClick(int position, @NotNull DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean item);
}
