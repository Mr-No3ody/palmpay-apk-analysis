package C9;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.cash_in.bean.OrderList;
import com.transsnet.palmpay.cash_in.ui.activity.RecordDetailActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RecordListActivity;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecordListActivity f1253a;

    public E(RecordListActivity recordListActivity) {
        this.f1253a = recordListActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        RecordListActivity recordListActivity = this.f1253a;
        Intent intent = new Intent(recordListActivity, (Class<?>) RecordDetailActivity.class);
        intent.putExtra("extra_type", recordListActivity.f26902d);
        intent.putExtra("orderNo", ((OrderList.OrderData) obj).orderNo);
        recordListActivity.startActivity(intent);
    }
}
