package Xd;

import N8.q0;
import Pa.i0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CloseContactBean;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: renamed from: Xd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0783b extends Kb.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11142e;

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 2) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (i7 < this.f4985b.size()) {
            CloseContactBean closeContactBean = (CloseContactBean) this.f4985b.get(i7);
            C0782a c0782a = (C0782a) viewHolder;
            boolean z3 = i7 == getItemCount() - 1;
            if (getItemCount() == 1) {
                c0782a.itemView.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_white);
            } else if (i7 == 0) {
                c0782a.itemView.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_rect_corner_tl_tr_12_bg_white);
            } else if (z3) {
                c0782a.itemView.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_rect_corner_bl_br_12_bg_white);
            } else {
                c0782a.itemView.setBackgroundResource(L6.b.ppColorBackgroundLight);
            }
            c0782a.f11141o.setVisibility(z3 ? 4 : 0);
            String strY = closeContactBean.billerName;
            String str = closeContactBean.paymentItemName;
            String str2 = p070ee.c.f36289a;
            if (!TextUtils.isEmpty(str)) {
                if (strY == null) {
                    strY = "";
                }
                if (str == null) {
                    str = "";
                }
                strY = q0.y(strY, "-", str);
            } else if (strY == null) {
                strY = "";
            }
            c0782a.f11136e.setText(strY);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(closeContactBean.customerId);
            sb2.append("(");
            c0782a.f11135d.setText(C0.G.r(sb2, closeContactBean.fullName, ")"));
            String str3 = closeContactBean.icon;
            int i10 = closeContactBean.reminder;
            Group group = c0782a.f11139i;
            if (i10 == 0) {
                group.setVisibility(8);
            } else {
                group.setVisibility(0);
                boolean zEquals = "week".equals(closeContactBean.remindPeriod);
                Context context = this.f4984a;
                TextView textView = c0782a.f11140j;
                if (zEquals) {
                    textView.setText(context.getString(p025ba.k.core_week_remind_x, c(closeContactBean.remindTime)));
                } else if ("day".equals(closeContactBean.remindPeriod)) {
                    textView.setText(context.getString(p025ba.k.core_day_remind_x, c(closeContactBean.remindTime)));
                } else {
                    textView.setText(context.getString(p025ba.k.core_month_remind_x, i0.z(closeContactBean.remindTime)));
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(str3);
            ImageView imageView = c0782a.f11137f;
            if (zIsEmpty) {
                com.bumptech.glide.b.f(imageView).load(p070ee.c.f(this.f11142e)).a(new G1.d().I(new com.bumptech.glide.load.resource.bitmap.z(SizeUtils.dp2px(4.0f)), true)).S(imageView);
            } else {
                com.bumptech.glide.b.f(imageView).load(str3).a(new G1.d().I(new com.bumptech.glide.load.resource.bitmap.z(SizeUtils.dp2px(4.0f)), true)).S(imageView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(Pd.d.qt_betting_beneficiaries_item, viewGroup, false);
        C0782a c0782a = new C0782a(this, viewInflate);
        c0782a.f11135d = (TextView) viewInflate.findViewById(Pd.c.mbri_title_tv);
        c0782a.f11136e = (TextView) viewInflate.findViewById(Pd.c.mbri_time_tv);
        c0782a.f11137f = (ImageView) viewInflate.findViewById(Pd.c.mbri_iv);
        c0782a.f11139i = (Group) viewInflate.findViewById(Pd.c.qbbi_remind_time_item);
        c0782a.f11140j = (TextView) viewInflate.findViewById(Pd.c.qbbi_time_tv);
        View viewFindViewById = viewInflate.findViewById(Pd.c.mbri_more_iv);
        c0782a.f11138g = viewFindViewById;
        c0782a.f11141o = viewInflate.findViewById(Pd.c.mbri_divide_view);
        c0782a.a(viewInflate.findViewById(Pd.c.mbri_root));
        c0782a.a(viewFindViewById);
        return c0782a;
    }
}
