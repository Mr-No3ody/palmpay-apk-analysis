package A8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.mtn.sdk.ui.bank._common.SelectBankActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f89a;

    public e(SelectBankActivity selectBankActivity) {
        this.f89a = selectBankActivity;
        selectBankActivity.f25694b.setAdapter(this);
        selectBankActivity.f25694b.setLayoutManager(new LinearLayoutManager(selectBankActivity, 1, false));
        selectBankActivity.f25694b.addItemDecoration(nh.a.f39975f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return p073f.b.f36331a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        d dVar = (d) viewHolder;
        p073f.a aVar = (p073f.a) p073f.b.f36331a.get(i7);
        int i10 = d.f85d;
        dVar.getClass();
        dVar.f86a.setImageResource(aVar.f36328b);
        dVar.f87b.setText(aVar.f36327a);
        dVar.itemView.setOnClickListener(new c(0, dVar, aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new d(this, LayoutInflater.from(this.f89a).inflate(p349x8.b.mtn_bank_list_item_layout, viewGroup, false));
    }
}
