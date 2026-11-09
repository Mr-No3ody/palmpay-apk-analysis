package p270rd;

import M1.j;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rd.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1975s implements OnItemClickListener, BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f41772a;

    public /* synthetic */ C1975s(SelectBankActivity selectBankActivity) {
        this.f41772a = selectBankActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        int i7 = SelectBankActivity.f33187A;
        Intent intent = new Intent();
        intent.putExtra("BANK_CARD_INFO", (BankInfo) obj);
        SelectBankActivity selectBankActivity = this.f41772a;
        selectBankActivity.setResult(-1, intent);
        selectBankActivity.finish();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        int i10 = SelectBankActivity.f33187A;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        SelectBankActivity selectBankActivity = this.f41772a;
        BankInfo bankInfo = (BankInfo) selectBankActivity.o().getItem(i7);
        if (bankInfo.isHeader) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("BANK_CARD_INFO", bankInfo);
        selectBankActivity.setResult(-1, intent);
        selectBankActivity.finish();
    }
}
