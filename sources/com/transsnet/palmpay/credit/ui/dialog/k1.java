package com.transsnet.palmpay.credit.ui.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f30141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f30142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f30143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f30144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f30145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f30146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f30147g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f30148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1 f30149j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, View view) {
        super(view);
        this.f30149j = l1Var;
        this.f30141a = (TextView) view.findViewById(Ya.e.cs_amount);
        this.f30142b = (TextView) view.findViewById(Ya.e.cs_ticket_name);
        this.f30143c = (TextView) view.findViewById(Ya.e.cs_ticket_condition);
        this.f30144d = (ImageView) view.findViewById(Ya.e.cs_selector);
        this.f30145e = (TextView) view.findViewById(Ya.e.cs_valid);
        this.f30146f = (TextView) view.findViewById(Ya.e.cs_info);
        this.f30147g = (ImageView) view.findViewById(Ya.e.cs_arrow);
        this.f30148i = (ImageView) view.findViewById(Ya.e.cs_ticket_tag);
    }
}
