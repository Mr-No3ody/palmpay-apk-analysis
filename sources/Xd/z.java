package Xd;

import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.P0;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends Kb.c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof y) {
            y yVar = (y) viewHolder;
            List list = this.f4985b;
            if (list == null || i7 >= list.size()) {
                return;
            }
            HomePageMenuData homePageMenuData = (HomePageMenuData) this.f4985b.get(i7);
            P0 p3 = yVar.f11184d;
            ((View) p3.f13249d).setTag(homePageMenuData);
            ((TextView) p3.f13247b).setText(homePageMenuData.menuName);
            r0.l1(homePageMenuData.iconUrlBig, (ImageView) p3.f13250e);
            r0.l1(homePageMenuData.cornerImgUrl, (ImageView) p3.f13251f);
            boolean zIsEmpty = TextUtils.isEmpty(homePageMenuData.menuDesc);
            TextView textView = (TextView) p3.f13248c;
            if (zIsEmpty) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(homePageMenuData.menuDesc);
            }
            boolean zEquals = "/airtime/top_up_airtime".equals(homePageMenuData.jumpPath);
            P0 p10 = yVar.f11184d;
            if (zEquals) {
                p10.j(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_primary);
                int i10 = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                p10.l(i10, i10);
            } else if (!"/quick_teller/betting_home".equals(homePageMenuData.jumpPath)) {
                p10.j(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_dark);
                p10.l(L6.b.ppColorTextPrimary, com.transsnet.palmpay.custom_view.p.text_color_gray11_8c8a9a);
            } else {
                p10.j(com.transsnet.palmpay.custom_view.r.cv_rect_corner_12_bg_f558d0);
                int i11 = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                p10.l(i11, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(Pd.d.qt_layout_life_bills_item, viewGroup, false);
        y yVar = new y(this, viewInflate);
        P0 p3 = new P0(viewInflate, 9);
        yVar.f11184d = p3;
        p3.j(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_dark);
        p3.l(L6.b.ppColorTextPrimary, com.transsnet.palmpay.custom_view.p.text_color_gray11_8c8a9a);
        yVar.a((View) p3.f13249d);
        return yVar;
    }
}
