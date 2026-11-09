package com.transsnet.palmpay.p2pcash.ui.atm.view;

import L6.b;
import Sc.c;
import Uc.I0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class DateItemView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f32973i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f32975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Calendar f32978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Listener f32979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32980g;

    public interface Listener {
        void onSelect(Calendar calendar);
    }

    public DateItemView(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        CardView cardView = this.f32975b;
        int i7 = b.ppColorBackgroundDark;
        Context context = this.f32974a;
        cardView.setCardBackgroundColor(context.getColor(i7));
        this.f32976c.setTextColor(context.getColor(b.ppColorTextDisable));
        this.f32977d.setTextColor(context.getColor(b.ppColorTextPrimary));
    }

    public void setEnable(boolean z3) {
        this.f32980g = z3;
        CardView cardView = this.f32975b;
        int i7 = b.ppColorBackgroundDark;
        Context context = this.f32974a;
        cardView.setCardBackgroundColor(context.getColor(i7));
        if (z3) {
            this.f32976c.setTextColor(context.getColor(b.ppColorTextDisable));
            this.f32977d.setTextColor(context.getColor(b.ppColorTextPrimary));
        } else {
            this.f32976c.setTextColor(context.getColor(b.ppColorTextDisable));
            this.f32977d.setTextColor(context.getColor(b.ppColorTextPrimary));
        }
    }

    public void setListener(Listener listener) {
        this.f32979f = listener;
    }

    public DateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32980g = true;
        this.f32974a = context;
        View.inflate(context, c.p2p_date_item_view_layout, this);
        this.f32975b = (CardView) findViewById(Sc.b.p2p_root);
        this.f32976c = (TextView) findViewById(Sc.b.p2p_week);
        this.f32977d = (TextView) findViewById(Sc.b.p2p_date);
        a();
        setOnClickListener(new I0(this, 20));
    }
}
