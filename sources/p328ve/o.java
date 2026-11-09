package p328ve;

import Ac.e;
import Ac.f;
import G1.d;
import Y1.c;
import Z1.a;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.bumptech.glide.load.resource.bitmap.i;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantListRsp;
import com.transsnet.palmpay.ui.activity.MerchantPaymentListActivity;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f43195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MerchantPaymentListActivity f43196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f43197d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f43197d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeAdapterInterface
    public final int getSwipeLayoutResourceId(int i7) {
        return e.swipe;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        n nVar = (n) viewHolder;
        MerchantListRsp merchantListRsp = (MerchantListRsp) this.f43197d.get(i7);
        nVar.f43191c.setTag(Integer.valueOf(i7));
        nVar.f43193e.setTag(merchantListRsp);
        boolean zIsEmpty = TextUtils.isEmpty(merchantListRsp.businessLogoUrl);
        ImageView imageView = nVar.f43189a;
        if (zIsEmpty) {
            imageView.setImageResource(r.cv_default_merchat);
        } else {
            b.f(imageView).load(Uri.parse(merchantListRsp.businessLogoUrl)).a(((d) ((d) new d().I(new i(), true)).j(r.cv_default_merchat)).x(r.cv_default_merchat)).S(imageView);
        }
        nVar.f43190b.setText(merchantListRsp.merchantName);
        nVar.f43192d.setShowMode(c.f11278b);
        this.f11489a.a(i7, nVar.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new n(this, View.inflate(this.f43195b, f.main_layout_merchant_item, null));
    }
}
