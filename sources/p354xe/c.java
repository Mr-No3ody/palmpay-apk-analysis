package p354xe;

import Ac.e;
import Ac.f;
import G1.d;
import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.main.export.bean.rsp.HomeSlideMenuBean;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Kb.c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            List list = this.f4985b;
            if (list == null || i7 >= list.size()) {
                return;
            }
            HomeSlideMenuBean homeSlideMenuBean = (HomeSlideMenuBean) this.f4985b.get(i7);
            bVar.getClass();
            if (TextUtils.isEmpty(homeSlideMenuBean.menuDesc)) {
                TextView textView = bVar.f43917e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                bVar.itemView.getLayoutParams().height = SizeUtils.dp2px(56.0f);
            } else {
                if (bVar.f43917e == null) {
                    bVar.f43917e = (TextView) bVar.itemView.findViewById(e.ihm_desc_tv);
                }
                TextView textView2 = bVar.f43917e;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    bVar.f43917e.setText(homeSlideMenuBean.menuDesc);
                }
                bVar.itemView.getLayoutParams().height = SizeUtils.dp2px(68.0f);
            }
            bVar.f43916d.setText(homeSlideMenuBean.menuName);
            if (TextUtils.isEmpty(homeSlideMenuBean.adSlotId)) {
                SingleAdView singleAdView = bVar.f43919g;
                if (singleAdView != null) {
                    singleAdView.setVisibility(8);
                    bVar.f43919g.setSlotId(null);
                }
            } else {
                if (bVar.f43919g == null) {
                    ((ViewStub) bVar.itemView.findViewById(e.adViewStub)).setVisibility(0);
                    SingleAdView singleAdView2 = (SingleAdView) bVar.itemView.findViewById(e.ihm_single_ad);
                    if (singleAdView2 != null) {
                        b.c(singleAdView2);
                    }
                    bVar.f43919g = singleAdView2;
                }
                SingleAdView singleAdView3 = bVar.f43919g;
                if (singleAdView3 != null) {
                    singleAdView3.setUseCoroutine(true);
                    bVar.f43919g.setVisibility(0);
                    bVar.f43919g.setSlotId(homeSlideMenuBean.adSlotId, true);
                }
            }
            String str = homeSlideMenuBean.iconUrlBig;
            ImageView imageView = bVar.f43918f;
            int color = imageView.getContext().getColor(L6.b.ppColorTextPrimary);
            Sa.c cVar = new Sa.c();
            cVar.f8828b = color;
            r0.j1(imageView, str, (d) new d().I(cVar, true));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.main_item_home_me_menu_2, viewGroup, false);
        b bVar = new b(this, viewInflate);
        bVar.f43918f = (ImageView) viewInflate.findViewById(e.ihm_menu_iv);
        bVar.f43916d = (TextView) viewInflate.findViewById(e.ihm_menu_tv);
        bVar.a(viewInflate);
        return bVar;
    }
}
