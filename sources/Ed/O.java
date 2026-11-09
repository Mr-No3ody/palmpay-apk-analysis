package Ed;

import Bc.C0105b;
import android.view.View;
import android.view.ViewStub;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.send_money.bean.resp.RecentlyScheduleTransferBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class O implements ViewStub.OnInflateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecentlyScheduleTransferBean f2335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmVBFragment f2336c;

    public /* synthetic */ O(BaseMvvmVBFragment baseMvvmVBFragment, RecentlyScheduleTransferBean recentlyScheduleTransferBean, int i7) {
        this.f2334a = i7;
        this.f2336c = baseMvvmVBFragment;
        this.f2335b = recentlyScheduleTransferBean;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        switch (this.f2334a) {
            case 0:
                C0105b c0105bB = C0105b.b(view);
                TransferToBankHomeFragment transferToBankHomeFragment = (TransferToBankHomeFragment) this.f2336c;
                transferToBankHomeFragment.f33775B = c0105bB;
                RecentlyScheduleTransferBean recentlyScheduleTransferBean = this.f2335b;
                ((IconicsImageView) c0105bB.f665e).setOnClickListener(new P(transferToBankHomeFragment, recentlyScheduleTransferBean, 1));
                transferToBankHomeFragment.v(recentlyScheduleTransferBean);
                break;
            default:
                C0105b c0105bB2 = C0105b.b(view);
                TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = (TransferToPalmPayHomeFragment) this.f2336c;
                transferToPalmPayHomeFragment.f33817H = c0105bB2;
                RecentlyScheduleTransferBean recentlyScheduleTransferBean2 = this.f2335b;
                ((IconicsImageView) c0105bB2.f665e).setOnClickListener(new Fd.w(transferToPalmPayHomeFragment, recentlyScheduleTransferBean2, 1));
                transferToPalmPayHomeFragment.x(recentlyScheduleTransferBean2);
                break;
        }
    }
}
