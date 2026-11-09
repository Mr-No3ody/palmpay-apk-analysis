package W9;

import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CloseContactBeanV2;
import com.transsnet.palmpay.core.bean.RemindListBean;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: renamed from: W9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0721b extends Kb.c {
    public static String c(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 2) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        CloseContactBeanV2 closeContactBeanV2 = (CloseContactBeanV2) this.f4985b.get(i7);
        C0720a c0720a = (C0720a) viewHolder;
        c0720a.f10615d.setVisibility(TextUtils.isEmpty(closeContactBeanV2.relationshipPic) ? 8 : 0);
        int i10 = TextUtils.isEmpty(closeContactBeanV2.relationshipPic) ? 0 : 8;
        TextView textView = c0720a.f10616e;
        textView.setVisibility(i10);
        textView.setText(closeContactBeanV2.tag);
        r0.l1(closeContactBeanV2.relationshipPic, c0720a.f10615d);
        c0720a.f10617f.setText(closeContactBeanV2.phone);
        boolean z3 = closeContactBeanV2.notEditable;
        ImageView imageView = c0720a.f10618g;
        if (z3) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        int size = closeContactBeanV2.remindList.size();
        RelativeLayout relativeLayout = c0720a.f10619i;
        if (size == 0) {
            relativeLayout.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = SizeUtils.dp2px(25.0f);
            return;
        }
        int size2 = closeContactBeanV2.remindList.size();
        Context context = this.f4984a;
        if (size2 > 0) {
            relativeLayout.setVisibility(0);
            RemindListBean remindListBean = closeContactBeanV2.remindList.get(0);
            boolean zEquals = TextUtils.equals("Airtime", remindListBean.paymentType);
            ImageView imageView2 = c0720a.f10622p;
            ImageView imageView3 = c0720a.f10621o;
            if (zEquals) {
                imageView3.setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_clock_reminder2);
                imageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_clock_reminder1);
            } else {
                imageView3.setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_clock_reminder1);
                imageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_clock_reminder2);
            }
            if (remindListBean.reminder == 0) {
                relativeLayout.setVisibility(8);
            } else {
                relativeLayout.setVisibility(0);
                boolean zEquals2 = "week".equals(remindListBean.remindPeriod);
                TextView textView2 = c0720a.t;
                if (zEquals2) {
                    textView2.setText(context.getString(p025ba.k.core_week_remind_x, c(remindListBean.remindTime)));
                } else if ("day".equals(remindListBean.remindPeriod)) {
                    textView2.setText(context.getString(p025ba.k.core_day_remind_x, c(remindListBean.remindTime)));
                } else {
                    textView2.setText(context.getString(p025ba.k.core_month_remind_x, i0.z(remindListBean.remindTime)));
                }
            }
        } else {
            relativeLayout.setVisibility(8);
        }
        int size3 = closeContactBeanV2.remindList.size();
        RelativeLayout relativeLayout2 = c0720a.f10620j;
        if (size3 > 1) {
            RemindListBean remindListBean2 = closeContactBeanV2.remindList.get(1);
            if (remindListBean2.reminder == 0) {
                relativeLayout2.setVisibility(8);
            } else {
                relativeLayout2.setVisibility(0);
                boolean zEquals3 = "week".equals(remindListBean2.remindPeriod);
                TextView textView3 = c0720a.f10623v;
                if (zEquals3) {
                    textView3.setText(context.getString(p025ba.k.core_week_remind_x, c(remindListBean2.remindTime)));
                } else if ("day".equals(remindListBean2.remindPeriod)) {
                    textView3.setText(context.getString(p025ba.k.core_day_remind_x, c(remindListBean2.remindTime)));
                } else {
                    textView3.setText(context.getString(p025ba.k.core_month_remind_x, i0.z(remindListBean2.remindTime)));
                }
            }
        } else {
            relativeLayout2.setVisibility(8);
        }
        if (relativeLayout.getVisibility() == 0 && relativeLayout2.getVisibility() == 0) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = SizeUtils.dp2px(40.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = SizeUtils.dp2px(25.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(R9.e.ct_close_contact_item, viewGroup, false);
        C0720a c0720a = new C0720a(this, viewInflate);
        c0720a.f10615d = (ImageView) viewInflate.findViewById(R9.d.ccci_tag_iv);
        c0720a.f10616e = (TextView) viewInflate.findViewById(R9.d.ccci_tag_tv);
        c0720a.f10617f = (TextView) viewInflate.findViewById(R9.d.ccci_phone_num_tv);
        ImageView imageView = (ImageView) viewInflate.findViewById(R9.d.ccci_edit_iv);
        c0720a.f10618g = imageView;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(R9.d.ccci_root);
        c0720a.f10619i = (RelativeLayout) viewInflate.findViewById(R9.d.ccci_remind_time_item);
        c0720a.f10620j = (RelativeLayout) viewInflate.findViewById(R9.d.ccci_remind_time_item2);
        c0720a.t = (TextView) viewInflate.findViewById(R9.d.ccci_time_tv);
        c0720a.f10623v = (TextView) viewInflate.findViewById(R9.d.ccci_time_tv2);
        c0720a.f10621o = (ImageView) viewInflate.findViewById(R9.d.ccci_clock_iv);
        c0720a.f10622p = (ImageView) viewInflate.findViewById(R9.d.ccci_clock_iv2);
        c0720a.a(imageView);
        c0720a.a(constraintLayout);
        return c0720a;
    }
}
