package p294tb;

import Ya.d;
import Z4.e;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListData;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentListActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentListActivity f42473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f42474g;

    public h0(CLRepaymentListActivity cLRepaymentListActivity, boolean z3) {
        this.f42473f = cLRepaymentListActivity;
        this.f42474g = z3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42473f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        CLRepaymentListActivity cLRepaymentListActivity = this.f42473f;
        cLRepaymentListActivity.showLoadingDialog(false);
        cLRepaymentListActivity.f29107g--;
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Long total;
        OcRepaidListResp ocRepaidListResp = (OcRepaidListResp) obj;
        CLRepaymentListActivity cLRepaymentListActivity = this.f42473f;
        cLRepaymentListActivity.showLoadingDialog(false);
        if (ocRepaidListResp == null || !ocRepaidListResp.isSuccess()) {
            cLRepaymentListActivity.f29107g--;
            ToastUtils.showShort(ocRepaidListResp != null ? ocRepaidListResp.getRespMsg() : null, new Object[0]);
            return;
        }
        OcRepaidListData data = ocRepaidListResp.getData();
        cLRepaymentListActivity.f29108i = (data == null || (total = data.getTotal()) == null) ? -1L : total.longValue();
        if (this.f42474g) {
            ArrayList arrayList = cLRepaymentListActivity.f29105e;
            if (arrayList == null) {
                Intrinsics.n("mData");
                throw null;
            }
            arrayList.clear();
        }
        OcRepaidListData data2 = ocRepaidListResp.getData();
        List<OcRepaidListDetail> list = data2 != null ? data2.getList() : null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = cLRepaymentListActivity.f29105e;
            if (arrayList2 == null) {
                Intrinsics.n("mData");
                throw null;
            }
            OcRepaidListData data3 = ocRepaidListResp.getData();
            List<OcRepaidListDetail> list2 = data3 != null ? data3.getList() : null;
            Intrinsics.e(list2);
            arrayList2.addAll(list2);
        }
        ArrayList arrayList3 = cLRepaymentListActivity.f29105e;
        if (arrayList3 == null) {
            Intrinsics.n("mData");
            throw null;
        }
        if (arrayList3.isEmpty()) {
            cLRepaymentListActivity.n().setBackground(null);
        } else {
            cLRepaymentListActivity.n().setBackgroundResource(d.cs_cl_bill_repayment_list_bg);
        }
        if (cLRepaymentListActivity.n().getAdapter() != null) {
            p351xb.d dVar = cLRepaymentListActivity.f29106f;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
                return;
            } else {
                Intrinsics.n("mAdapter");
                throw null;
            }
        }
        RecyclerView recyclerViewN = cLRepaymentListActivity.n();
        p351xb.d dVar2 = cLRepaymentListActivity.f29106f;
        if (dVar2 != null) {
            recyclerViewN.setAdapter(dVar2);
        } else {
            Intrinsics.n("mAdapter");
            throw null;
        }
    }
}
