package com.transsnet.mtn.sdk.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.transsnet.mtn.sdk.ui.view.avloading.AVLoadingIndicatorView;
import p349x8.b;
import p349x8.f;

/* JADX INFO: loaded from: classes3.dex */
public class MTNButton extends p274s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CardView f25717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f25718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AVLoadingIndicatorView f25719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f25720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25723g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25725j;

    public interface a {
        void a();
    }

    public MTNButton(@NonNull Context context) {
        super(context);
    }

    @Override // p274s.a
    public final void a() {
        View.inflate(getContext(), b.mtn_button_layout, this);
        this.f25717a = (CardView) findViewById(p349x8.a.mtn_btn);
        this.f25718b = (TextView) findViewById(p349x8.a.mtn_txt);
        this.f25719c = (AVLoadingIndicatorView) findViewById(p349x8.a.mtn_avi);
        this.f25718b.setText(this.f25723g);
        this.f25717a.setOnClickListener(new A8.b(this, 14));
        int i7 = this.f25722f;
        if (i7 == 1) {
            f();
        } else if (i7 == 2) {
            c();
        } else if (i7 == 3) {
            e();
        }
        if (this.f25725j == 2) {
            this.f25717a.getLayoutParams().height = p118hf.a.a(46.0f);
            requestLayout();
        }
    }

    @Override // p274s.a
    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.MTNButton);
        this.f25722f = typedArrayObtainStyledAttributes.getInt(f.MTNButton_mtn_button_status, 1);
        this.f25723g = typedArrayObtainStyledAttributes.getString(f.MTNButton_mtn_button_text);
        this.f25724i = typedArrayObtainStyledAttributes.getColor(f.MTNButton_mtn_button_enable_color, Color.parseColor("#6306B2"));
        this.f25725j = typedArrayObtainStyledAttributes.getInt(f.MTNButton_mtn_button_size, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c() {
        this.f25722f = 2;
        this.f25721e = false;
        this.f25717a.setCardBackgroundColor(Color.parseColor("#C0C3C8"));
        this.f25718b.setVisibility(0);
        this.f25719c.a();
    }

    public final boolean d() {
        return this.f25722f == 3;
    }

    public final void e() {
        this.f25722f = 3;
        this.f25721e = false;
        this.f25717a.setCardBackgroundColor(this.f25724i);
        this.f25718b.setVisibility(8);
        AVLoadingIndicatorView aVLoadingIndicatorView = this.f25719c;
        aVLoadingIndicatorView.f25743a = -1L;
        aVLoadingIndicatorView.f25746d = false;
        aVLoadingIndicatorView.removeCallbacks(aVLoadingIndicatorView.f25747e);
        if (aVLoadingIndicatorView.f25745c) {
            return;
        }
        aVLoadingIndicatorView.postDelayed(aVLoadingIndicatorView.f25748f, 100L);
        aVLoadingIndicatorView.f25745c = true;
    }

    public final void f() {
        this.f25722f = 1;
        this.f25721e = true;
        this.f25717a.setCardBackgroundColor(this.f25724i);
        this.f25718b.setVisibility(0);
        this.f25719c.a();
    }

    public void setEnableColor(int i7) {
        this.f25724i = i7;
        int i10 = this.f25722f;
        if (i10 == 1) {
            f();
        } else if (i10 == 2) {
            c();
        } else {
            if (i10 != 3) {
                return;
            }
            e();
        }
    }

    public void setOnFDSClickListener(a aVar) {
        this.f25720d = aVar;
    }

    public void setText(String str) {
        this.f25723g = str;
        this.f25718b.setText(str);
    }

    public MTNButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setEnableColor(String str) {
        this.f25724i = Color.parseColor(str);
        int i7 = this.f25722f;
        if (i7 == 1) {
            f();
        } else if (i7 == 2) {
            c();
        } else {
            if (i7 != 3) {
                return;
            }
            e();
        }
    }

    public MTNButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
