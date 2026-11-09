package p270rd;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.send_money.bean.QueryRecordResp;
import com.transsnet.palmpay.send_money.ui.activity.MoneyTransferRecordActivity;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;

/* JADX INFO: renamed from: rd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1964g implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MoneyTransferRecordActivity f41744a;

    public C1964g(MoneyTransferRecordActivity moneyTransferRecordActivity) {
        this.f41744a = moneyTransferRecordActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        TradeRecordDetailActivity.f33213B.startActivity(this.f41744a, ((QueryRecordResp.Record) obj).orderId);
    }
}
