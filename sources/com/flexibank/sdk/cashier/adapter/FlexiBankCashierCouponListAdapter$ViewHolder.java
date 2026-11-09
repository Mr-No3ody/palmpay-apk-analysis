package com.flexibank.sdk.cashier.adapter;

import M3.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/flexibank/sdk/cashier/adapter/FlexiBankCashierCouponListAdapter$ViewHolder", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(LM3/a;Landroid/view/View;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCashierCouponListAdapter$ViewHolder extends BaseViewHolder {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ a f21947A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f21948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f21954g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f21955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f21956j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RelativeLayout f21957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f21958p;
    public final LinearLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f21959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f21960w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankCashierCouponListAdapter$ViewHolder(@NotNull a aVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f21947A = aVar;
        this.f21948a = (ImageView) itemView.findViewById(p.fb_icii_coupon_icon);
        this.f21949b = (TextView) itemView.findViewById(p.fb_icil_amount_tv);
        this.f21950c = (TextView) itemView.findViewById(p.fb_icil_title_tv);
        this.f21951d = (TextView) itemView.findViewById(p.fb_icil_text_tv);
        this.f21952e = (TextView) itemView.findViewById(p.fb_icil_text_tv1);
        this.f21953f = (TextView) itemView.findViewById(p.fb_icil_text_tv2);
        this.f21954g = (ImageView) itemView.findViewById(p.fb_icii_iv_expand);
        this.f21955i = (ImageView) itemView.findViewById(p.fb_imageViewCheck);
        this.f21956j = (TextView) itemView.findViewById(p.fb_icil_coupon_amount);
        this.f21957o = (RelativeLayout) itemView.findViewById(p.fb_rl_left);
        this.f21958p = (LinearLayout) itemView.findViewById(p.fb_ll_right);
        this.t = (LinearLayout) itemView.findViewById(p.fb_llDetailArrow);
        this.f21960w = (TextView) itemView.findViewById(p.fb_tvUnavailableReason);
        this.f21959v = (LinearLayout) itemView.findViewById(p.fb_ll_expand);
    }
}
