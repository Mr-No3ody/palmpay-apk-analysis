package Yd;

import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleWalletDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements DataBundleWalletAdapter$OnDataBundleItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataBundleWalletDialog f11340a;

    public j(DataBundleWalletDialog dataBundleWalletDialog) {
        this.f11340a = dataBundleWalletDialog;
    }

    @Override // com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener
    public final void onNormalItemClick(int i7, DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DataBundleWalletDialog dataBundleWalletDialog = this.f11340a;
        dataBundleWalletDialog.dismiss();
        DataBundleWalletAdapter$OnDataBundleItemClickListener dataBundleWalletAdapter$OnDataBundleItemClickListener = dataBundleWalletDialog.itemClickListener;
        if (dataBundleWalletAdapter$OnDataBundleItemClickListener != null) {
            dataBundleWalletAdapter$OnDataBundleItemClickListener.onNormalItemClick(i7, item);
        }
    }
}
