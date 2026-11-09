package Nd;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.share.ShareChooseActivity;
import com.transsnet.palmpay.share.ShareItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ShareChooseActivity f6389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShareChooseActivity f6391c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f6390b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        e eVar = (e) viewHolder;
        eVar.f6387b.setImageResource(((ShareItem) this.f6390b.get(i7)).f34109a);
        eVar.f6388c.setText(((ShareItem) this.f6390b.get(i7)).f34110b);
        eVar.f6386a.setOnClickListener(new d(this, i7, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        e eVar = new e(LayoutInflater.from(this.f6389a).inflate(b.share_choose_item, viewGroup, false));
        eVar.f6386a = (ViewGroup) eVar.itemView.findViewById(a.share_item_content);
        eVar.f6387b = (ImageView) eVar.itemView.findViewById(a.share_item_icon);
        eVar.f6388c = (TextView) eVar.itemView.findViewById(a.share_item_name);
        return eVar;
    }
}
