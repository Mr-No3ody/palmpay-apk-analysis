package Xd;

import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11170d;

    public /* synthetic */ r(Object obj, int i7, Object obj2, int i10) {
        this.f11167a = i10;
        this.f11169c = obj;
        this.f11168b = i7;
        this.f11170d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11167a) {
            case 0:
                DataBundleWalletAdapter$OnDataBundleItemClickListener dataBundleWalletAdapter$OnDataBundleItemClickListener = ((v) this.f11169c).f11178e;
                if (dataBundleWalletAdapter$OnDataBundleItemClickListener != null) {
                    dataBundleWalletAdapter$OnDataBundleItemClickListener.onNormalItemClick(this.f11168b, (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) this.f11170d);
                }
                break;
            default:
                ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment = (ScheduleTopUpTaskListFragment) this.f11169c;
                List<Object> data = scheduleTopUpTaskListFragment.v().getData();
                int i7 = this.f11168b;
                ((ScheduleTopUpTaskBean) data.get(i7)).setTagName((String) this.f11170d);
                scheduleTopUpTaskListFragment.v().notifyItemChanged(i7);
                break;
        }
        return Unit.f38893a;
    }
}
