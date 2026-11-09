package p328ve;

import Ac.e;
import Ac.f;
import G1.d;
import Kb.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantListResp;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        u uVar = (u) viewHolder;
        ThirdPartyMerchantListResp.ThirdPartyMerchant thirdPartyMerchant = (ThirdPartyMerchantListResp.ThirdPartyMerchant) getItem(i7);
        b.e(this.f4984a).load(thirdPartyMerchant.getLogoUrl()).a(((d) new d().x(r.cv_third_party_merchant_default_icon)).d()).S((ImageView) uVar.getView(e.merchant_photo));
        uVar.b(e.merchant_name, thirdPartyMerchant.getMerchantName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.main_third_party_merchant_item_layout, viewGroup, false);
        u uVar = new u(this, viewInflate);
        uVar.a(viewInflate);
        return uVar;
    }
}
