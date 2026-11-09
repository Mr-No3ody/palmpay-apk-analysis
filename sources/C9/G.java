package C9;

import com.transsnet.palmpay.cash_in.bean.OrderList;
import com.transsnet.palmpay.cash_in.ui.activity.RecordListActivity;
import retrofit2.Call;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecordListActivity f1255f;

    public G(RecordListActivity recordListActivity) {
        this.f1255f = recordListActivity;
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call call, Throwable th) {
        this.f1255f.f26907j.f31512c.setText("Load Fail");
    }

    @Override // Z4.e
    public final void x(retrofit2.K k2) {
        OrderList.OrderListData orderListData;
        OrderList orderList = (OrderList) k2.f41874b;
        RecordListActivity recordListActivity = this.f1255f;
        if (orderList != null && (orderListData = orderList.data) != null && orderListData.list != null) {
            int i7 = orderListData.total;
            recordListActivity.getClass();
            int i10 = recordListActivity.f26906i;
            recordListActivity.f26905g = ((i7 + i10) - 1) / i10;
            if (recordListActivity.f26904f == 1) {
                recordListActivity.f26903e.clear();
            }
            recordListActivity.f26903e.addAll(orderList.data.list);
            if (recordListActivity.f26904f >= recordListActivity.f26905g) {
                recordListActivity.f26900b.b(recordListActivity.getString(p366y9.d.no_more));
            }
        }
        recordListActivity.f26900b.c();
        E9.e eVar = recordListActivity.f26901c;
        eVar.f4985b = recordListActivity.f26903e;
        eVar.notifyDataSetChanged();
    }
}
