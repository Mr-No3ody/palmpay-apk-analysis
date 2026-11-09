package com.transsnet.palmpay.p2pcash.ui.atm.view;

import L6.b;
import Sc.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.transsnet.palmpay.custom_view.p;

/* JADX INFO: loaded from: classes4.dex */
public class AgentLabelView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f32941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardView f32942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32943d;

    public AgentLabelView(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        CardView cardView = this.f32941b;
        int i7 = b.ppColorAssisBackground;
        Context context = this.f32940a;
        cardView.setCardBackgroundColor(context.getColor(i7));
        this.f32942c.setCardBackgroundColor(context.getColor(p.transparent));
        this.f32943d.setTextColor(context.getColor(b.ppColorWarning));
    }

    public final void b() {
        CardView cardView = this.f32941b;
        int i7 = b.ppColorSecondary;
        Context context = this.f32940a;
        cardView.setCardBackgroundColor(context.getColor(i7));
        this.f32942c.setCardBackgroundColor(context.getColor(p.transparent));
        this.f32943d.setTextColor(context.getColor(Sc.a.p2p_theme_color));
    }

    public final void c() {
        CardView cardView = this.f32941b;
        int i7 = b.ppColorDividerLine;
        Context context = this.f32940a;
        cardView.setCardBackgroundColor(context.getColor(i7));
        this.f32942c.setCardBackgroundColor(context.getColor(b.ppColorBackgroundLight));
        this.f32943d.setTextColor(context.getColor(b.ppColorTextPrimary));
    }

    public void setText(String str) {
        this.f32943d.setText(str);
    }

    public AgentLabelView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AgentLabelView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32940a = context;
        View.inflate(context, c.p2p_agent_label_view_layout, this);
        this.f32941b = (CardView) findViewById(Sc.b.p2p_bg1);
        this.f32942c = (CardView) findViewById(Sc.b.p2p_bg2);
        this.f32943d = (TextView) findViewById(Sc.b.p2p_txt);
    }
}
