package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.b;
import Sc.c;
import Sc.f;
import Uc.I0;
import Xc.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public class P2PButton extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f32991o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f32993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32998g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnP2PButtonClickListener f33000j;

    public interface OnP2PButtonClickListener {
        void onClick();
    }

    public P2PButton(@NonNull Context context) {
        this(context, null);
    }

    public void setOnP2PButtonClickListener(OnP2PButtonClickListener onP2PButtonClickListener) {
        this.f33000j = onP2PButtonClickListener;
    }

    public void setStatus(int i7) {
        this.f32998g = i7;
        setStyle(this.f32997f);
    }

    public void setStyle(int i7) {
        this.f32997f = i7;
        Context context = this.f32992a;
        if (i7 != 1) {
            if (i7 != 2) {
                return;
            }
            this.f32993b.setCardBackgroundColor(context.getColor(Sc.a.p2p_theme_light_color));
            this.f32994c.setTextColor(context.getColor(Sc.a.p2p_theme_color));
            return;
        }
        int i10 = this.f32998g;
        if (i10 == 1) {
            this.f32993b.setCardBackgroundColor(context.getColor(Sc.a.p2p_theme_color));
            this.f32994c.setTextColor(-1);
        } else {
            if (i10 != 2) {
                return;
            }
            this.f32993b.setCardBackgroundColor(context.getColor(Sc.a.p2p_theme_disable_color));
            this.f32994c.setTextColor(Color.parseColor("#FBFBFD"));
        }
    }

    public void setText(String str) {
        this.f32994c.setText(str);
    }

    public P2PButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32996e = 48;
        this.f32997f = 1;
        this.f32998g = 1;
        this.f32999i = false;
        this.f32992a = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.P2PButton);
            this.f32995d = typedArrayObtainStyledAttributes.getString(f.P2PButton_p2p_btn_name);
            this.f32996e = typedArrayObtainStyledAttributes.getInt(f.P2PButton_p2p_btn_height, 48);
            this.f32997f = typedArrayObtainStyledAttributes.getInt(f.P2PButton_p2p_btn_style, 1);
            this.f32998g = typedArrayObtainStyledAttributes.getInt(f.P2PButton_p2p_btn_status, 1);
            typedArrayObtainStyledAttributes.recycle();
        }
        View.inflate(context, c.p2p_button_layout, this);
        this.f32993b = (CardView) findViewById(b.p2p_root);
        TextView textView = (TextView) findViewById(b.p2p_tx);
        this.f32994c = textView;
        textView.setText(this.f32995d);
        post(new e(this, 0));
        setStyle(this.f32997f);
        this.f32993b.setOnClickListener(new I0(this, 21));
    }
}
