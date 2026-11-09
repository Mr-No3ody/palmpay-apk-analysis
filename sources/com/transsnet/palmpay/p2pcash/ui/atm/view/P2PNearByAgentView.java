package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.b;
import Sc.c;
import Uc.I0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class P2PNearByAgentView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33022g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f33025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f33026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Listener f33027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33028f;

    public interface Listener {
        void onSelect(String str);
    }

    public P2PNearByAgentView(@NonNull Context context) {
        this(context, null);
    }

    public void setAddress(String str) {
        this.f33025c.setText(str);
    }

    public void setAgentName(String str) {
        this.f33023a.setText(str);
    }

    public void setDistance(double d2) {
        if (d2 == 0.0d) {
            this.f33026d.setVisibility(8);
        } else {
            this.f33026d.setVisibility(0);
            this.f33026d.setText(d2 >= 1.0d ? String.format("%.2fkm", Double.valueOf(d2)) : String.format("%dm", Integer.valueOf((int) (d2 * 1000.0d))));
        }
    }

    public void setListener(Listener listener) {
        this.f33027e = listener;
    }

    public void setShopID(String str) {
        this.f33028f = str;
    }

    public P2PNearByAgentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PNearByAgentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        View.inflate(context, c.p2p_nearby_agent_item_view_layout, this);
        this.f33023a = (TextView) findViewById(b.p2p_time);
        this.f33024b = (ImageView) findViewById(b.p2p_selector);
        this.f33025c = (TextView) findViewById(b.p2p_address);
        this.f33026d = (TextView) findViewById(b.p2p_distance);
        setOnClickListener(new I0(this, 23));
    }
}
