package Fd;

import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFavoriteFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeFavoriteFragment f2711b;

    public /* synthetic */ v(TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment, int i7) {
        this.f2710a = i7;
        this.f2711b = transferToPalmPayHomeFavoriteFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2710a) {
            case 0:
                d0.g(1, "/sm/add_beneficiary", "beneficiary_type").navigation(this.f2711b.requireContext());
                break;
            default:
                ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").withString("core_order_source_type", this.f2711b.t).navigation();
                break;
        }
    }
}
