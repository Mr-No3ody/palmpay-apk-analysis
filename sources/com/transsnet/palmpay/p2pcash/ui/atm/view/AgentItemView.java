package com.transsnet.palmpay.p2pcash.ui.atm.view;

import C9.ViewOnClickListenerC0150q;
import Sc.b;
import Sc.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class AgentItemView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32934f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f32938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32939e;

    public AgentItemView(@NonNull Context context) {
        this(context, null);
    }

    public void setAddress(String str) {
        this.f32937c.setText(str);
    }

    public void setName(String str) {
        this.f32936b.setText(str);
    }

    public void setPhone(String str) {
        this.f32938d.setOnClickListener(new ViewOnClickListenerC0150q(str, 3));
    }

    public AgentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AgentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32935a = context;
        View.inflate(context, c.p2p_nearby_item_layout, this);
        this.f32936b = (TextView) findViewById(b.p2p_name);
        this.f32937c = (TextView) findViewById(b.p2p_address);
        this.f32938d = (ImageView) findViewById(b.p2p_phone);
        this.f32939e = (ImageView) findViewById(b.p2p_navigation);
    }
}
