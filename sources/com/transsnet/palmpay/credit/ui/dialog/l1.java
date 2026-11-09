package com.transsnet.palmpay.credit.ui.dialog;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.util.SizeUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30154b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SelectTicketsDialog f30156d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f30153a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30155c = -1;

    public l1(SelectTicketsDialog selectTicketsDialog) {
        this.f30156d = selectTicketsDialog;
        selectTicketsDialog.mTicketsList.setLayoutManager(new LinearLayoutManager(selectTicketsDialog.mContext, 1, false));
        selectTicketsDialog.mTicketsList.setAdapter(this);
    }

    public static void a(l1 l1Var, long j6) {
        l1Var.f30154b = j6;
        l1Var.notifyDataSetChanged();
        SelectTicketsDialog selectTicketsDialog = l1Var.f30156d;
        if (j6 != -1) {
            selectTicketsDialog.mConfirm.setEnabled(true);
        } else {
            selectTicketsDialog.mConfirm.setEnabled(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f30153a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        final k1 k1Var = (k1) viewHolder;
        l1 l1Var = k1Var.f30149j;
        final CouponItem couponItem = (CouponItem) l1Var.f30153a.get(i7);
        k1Var.f30142b.setText(couponItem.couponName);
        boolean zEquals = "DISCOUNT".equals(couponItem.couponType);
        TextView textView = k1Var.f30141a;
        if (zEquals) {
            textView.setText(couponItem.discountRate + "% Off");
        } else {
            SpannableString spannableString = new SpannableString(Pa.r0.B(couponItem.nominaValue, false));
            spannableString.setSpan(new AbsoluteSizeSpan(SizeUtils.sp2px(14.0f)), 0, BaseApplication.getCurrencySymbol().length(), 33);
            textView.setText(spannableString);
        }
        long j6 = couponItem.limitAmt;
        SelectTicketsDialog selectTicketsDialog = l1Var.f30156d;
        TextView textView2 = k1Var.f30143c;
        if (j6 > 0) {
            textView2.setText(selectTicketsDialog.mContext.getString(Ya.g.cs_str_purchase_over_, Pa.r0.B(couponItem.limitAmt, false)));
        } else {
            textView2.setText("");
        }
        boolean z3 = couponItem.isUsable;
        ImageView imageView = k1Var.f30144d;
        if (!z3 || selectTicketsDialog.isHideSelect) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        if (couponItem.couponId == l1Var.f30154b) {
            imageView.setImageResource(Ya.d.cs_ticket_select);
            l1Var.f30155c = i7;
        } else {
            imageView.setImageResource(Ya.d.cs_ticket_unselect);
        }
        k1Var.f30145e.setText(selectTicketsDialog.mContext.getString(Ya.g.cs_str_valid_duration_, new SimpleDateFormat("dd/MM/yyyy").format(Long.valueOf(couponItem.startTime)), new SimpleDateFormat("dd/MM/yyyy").format(Long.valueOf(couponItem.endTime))));
        boolean zIsEmpty = TextUtils.isEmpty(couponItem.limitStores);
        TextView textView3 = k1Var.f30146f;
        ImageView imageView2 = k1Var.f30147g;
        if (zIsEmpty) {
            imageView2.setVisibility(8);
            textView3.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            if (couponItem.layoutExpand) {
                textView3.setVisibility(0);
                imageView2.setImageResource(Ya.d.cs_cl_bw_coupon_up_arrow_icon);
            } else {
                textView3.setVisibility(8);
                imageView2.setImageResource(Ya.d.cs_cl_bw_coupon_down_arrow_icon);
            }
            textView3.setText(couponItem.limitStores);
        }
        final int i10 = 0;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.credit.ui.dialog.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k1 k1Var2 = k1Var;
                        k1Var2.getClass();
                        if (!Pa.r0.U0()) {
                            CouponItem couponItem2 = couponItem;
                            couponItem2.layoutExpand = !couponItem2.layoutExpand;
                            k1Var2.f30149j.notifyDataSetChanged();
                            break;
                        }
                        break;
                    default:
                        k1 k1Var3 = k1Var;
                        k1Var3.getClass();
                        if (!Pa.r0.U0()) {
                            CouponItem couponItem3 = couponItem;
                            if (couponItem3.isUsable) {
                                l1.a(k1Var3.f30149j, couponItem3.couponId);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        k1Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.credit.ui.dialog.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k1 k1Var2 = k1Var;
                        k1Var2.getClass();
                        if (!Pa.r0.U0()) {
                            CouponItem couponItem2 = couponItem;
                            couponItem2.layoutExpand = !couponItem2.layoutExpand;
                            k1Var2.f30149j.notifyDataSetChanged();
                            break;
                        }
                        break;
                    default:
                        k1 k1Var3 = k1Var;
                        k1Var3.getClass();
                        if (!Pa.r0.U0()) {
                            CouponItem couponItem3 = couponItem;
                            if (couponItem3.isUsable) {
                                l1.a(k1Var3.f30149j, couponItem3.couponId);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        boolean z8 = couponItem.isUsable;
        ImageView imageView3 = k1Var.f30148i;
        if (z8) {
            imageView3.setVisibility(8);
        } else {
            imageView3.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new k1(this, LayoutInflater.from(this.f30156d.mContext).inflate(Ya.f.cs_ticket_layout, viewGroup, false));
    }
}
