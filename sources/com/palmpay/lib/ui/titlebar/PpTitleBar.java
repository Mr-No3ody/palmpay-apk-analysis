package com.palmpay.lib.ui.titlebar;

import L6.b;
import L6.c;
import L6.f;
import L6.g;
import L6.j;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.view.IconicsTextView;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public class PpTitleBar extends ConstraintLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Drawable f24614A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Drawable f24615B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Context f24616C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Drawable f24617H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f24618L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f24619M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f24620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f24621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f24622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f24623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f24624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f24625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IconicsTextView f24626g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f24627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f24628j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f24629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24630p;
    public final boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f24631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24632w;

    public PpTitleBar(Context context) {
        this(context, null);
    }

    public final void c(IIcon iIcon, int i7) {
        ImageView imageView = this.f24622c;
        if (imageView != null) {
            imageView.setImageDrawable(a.h(getContext(), iIcon, null, i7, 24));
        }
    }

    public ImageView getBackImageView() {
        return this.f24622c;
    }

    public ImageView getLeftImageView() {
        return this.f24623d;
    }

    public ImageView getRightImageView1() {
        return this.f24624e;
    }

    public ImageView getRightImageView2() {
        return this.f24625f;
    }

    public TextView getRightTextView() {
        return this.f24626g;
    }

    public TextView getTvTitle() {
        return this.f24620a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == f.iv_back) {
            Context context = this.f24616C;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    public void setBackButton(IIcon iIcon) {
        c(iIcon, getContext().getColor(b.ppColorTextPrimary));
    }

    public void setBackButtonClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f24622c;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setRightImageView1ClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f24624e;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setRightImageView1Icon(IIcon iIcon) {
        int color = getContext().getColor(b.ppColorTextPrimary);
        ImageView imageView = this.f24624e;
        if (imageView != null) {
            imageView.setImageDrawable(a.h(getContext(), iIcon, null, color, 24));
        }
    }

    public void setRightImageView2ClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f24625f;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setRightImageView2Icon(IIcon iIcon) {
        int color = getContext().getColor(b.ppColorTextPrimary);
        ImageView imageView = this.f24625f;
        if (imageView != null) {
            imageView.setImageDrawable(a.h(getContext(), iIcon, null, color, 24));
        }
    }

    public void setRightText(CharSequence charSequence) {
        IconicsTextView iconicsTextView = this.f24626g;
        if (iconicsTextView != null) {
            iconicsTextView.setText(charSequence);
            this.f24626g.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        }
    }

    public void setRightTextViewClickListener(View.OnClickListener onClickListener) {
        IconicsTextView iconicsTextView = this.f24626g;
        if (iconicsTextView != null) {
            iconicsTextView.setOnClickListener(onClickListener);
        }
    }

    public void setSecondTitle(CharSequence charSequence) {
        TextView textView = this.f24621b;
        if (textView != null) {
            textView.setText(charSequence);
            this.f24621b.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f24620a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public PpTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PpTitleBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f24630p = false;
        this.t = false;
        this.f24619M = 1;
        this.f24616C = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ppTitleBarStyle, i7, 0);
        this.f24619M = typedArrayObtainStyledAttributes.getInt(j.ppTitleBarStyle_title_bar_style, 1);
        this.f24627i = typedArrayObtainStyledAttributes.getText(j.ppTitleBarStyle_title_bar_title);
        this.f24628j = typedArrayObtainStyledAttributes.getText(j.ppTitleBarStyle_title_bar_second_title);
        int color = context.getColor(this.f24619M == 1 ? b.ppColorTextPrimary : b.ppColorTextBase);
        this.f24618L = typedArrayObtainStyledAttributes.getColor(j.ppTitleBarStyle_title_bar_title_color, color);
        if (typedArrayObtainStyledAttributes.hasValue(j.ppTitleBarStyle_title_bar_back_icon)) {
            this.f24631v = typedArrayObtainStyledAttributes.getDrawable(j.ppTitleBarStyle_title_bar_back_icon);
        } else {
            Context context2 = getContext();
            this.f24631v = a.h(context, (context2 != null && context2.getResources().getConfiguration().getLayoutDirection() == 1) ? S6.a.pay_ArrowRight : S6.a.pay_ArrowLeft, null, color, 24.0f);
        }
        this.f24632w = typedArrayObtainStyledAttributes.getResourceId(j.ppTitleBarStyle_title_bar_left_icon, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(j.ppTitleBarStyle_title_bar_show_right_1_iv, false);
        this.t = z3;
        if (z3) {
            if (typedArrayObtainStyledAttributes.hasValue(j.ppTitleBarStyle_title_bar_right_icon_1)) {
                this.f24614A = typedArrayObtainStyledAttributes.getDrawable(j.ppTitleBarStyle_title_bar_right_icon_1);
            } else if (typedArrayObtainStyledAttributes.hasValue(j.ppTitleBarStyle_title_bar_right_iconfont_1)) {
                this.f24614A = a.h(context, null, typedArrayObtainStyledAttributes.getText(j.ppTitleBarStyle_title_bar_right_iconfont_1).toString(), typedArrayObtainStyledAttributes.getColor(j.ppTitleBarStyle_title_bar_right_iconfont_color_1, color), 24.0f);
            } else {
                this.f24614A = a.h(context, S6.a.pay_More, null, color, 24.0f);
            }
        } else {
            this.f24614A = null;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j.ppTitleBarStyle_title_bar_show_right_2_iv, false)) {
            if (typedArrayObtainStyledAttributes.hasValue(j.ppTitleBarStyle_title_bar_right_icon_2)) {
                this.f24615B = typedArrayObtainStyledAttributes.getDrawable(j.ppTitleBarStyle_title_bar_right_icon_2);
            } else if (typedArrayObtainStyledAttributes.hasValue(j.ppTitleBarStyle_title_bar_right_iconfont_2)) {
                this.f24615B = a.h(context, null, typedArrayObtainStyledAttributes.getText(j.ppTitleBarStyle_title_bar_right_iconfont_2).toString(), typedArrayObtainStyledAttributes.getColor(j.ppTitleBarStyle_title_bar_right_iconfont_color_2, color), 24.0f);
            } else {
                this.f24615B = a.h(context, S6.a.pay_More, null, color, 24.0f);
            }
        } else {
            this.f24615B = null;
        }
        this.f24617H = typedArrayObtainStyledAttributes.getDrawable(j.ppTitleBarStyle_title_bar_background);
        this.f24629o = typedArrayObtainStyledAttributes.getText(j.ppTitleBarStyle_title_bar_right_text);
        this.f24630p = typedArrayObtainStyledAttributes.getBoolean(j.ppTitleBarStyle_title_bar_show_right_text_arrow_down, false);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.lib_ui_layout_title_bar, this);
        setPadding(0, 0, context.getResources().getDimensionPixelSize(c.ppTitleBarHorizontalMargin_8), 0);
        this.f24620a = (TextView) findViewById(f.tv_title);
        this.f24621b = (TextView) findViewById(f.tv_second_title);
        this.f24622c = (ImageView) findViewById(f.iv_back);
        this.f24623d = (ImageView) findViewById(f.iv_left);
        this.f24624e = (ImageView) findViewById(f.iv_right_1);
        this.f24625f = (ImageView) findViewById(f.iv_right_2);
        this.f24626g = (IconicsTextView) findViewById(f.tv_right);
        if (!TextUtils.isEmpty(this.f24627i)) {
            this.f24620a.setText(this.f24627i);
            this.f24620a.setTextColor(this.f24618L);
        }
        if (!TextUtils.isEmpty(this.f24628j)) {
            this.f24621b.setVisibility(0);
            this.f24621b.setText(this.f24628j);
        } else {
            this.f24621b.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f24629o)) {
            this.f24626g.setVisibility(0);
            this.f24626g.setText(this.f24629o);
        } else {
            this.f24626g.setVisibility(8);
        }
        if (this.f24630p) {
            IconicsDrawable iconicsDrawableH = a.h(context, S6.a.pay_Arrowdown, null, getContext().getColor(b.ppColorTextPrimary), 16.0f);
            this.f24626g.setCompoundDrawablePadding(a.j(context, 4.0f));
            this.f24626g.setIconicsDrawableEnd(iconicsDrawableH);
        }
        if (this.f24631v != null) {
            this.f24622c.setVisibility(0);
            this.f24622c.setImageDrawable(this.f24631v);
        } else {
            this.f24622c.setVisibility(8);
        }
        if (this.f24632w != 0) {
            this.f24623d.setVisibility(0);
            this.f24623d.setImageResource(this.f24632w);
        } else {
            this.f24623d.setVisibility(8);
        }
        Drawable drawable = this.f24617H;
        if (drawable != null) {
            setBackground(drawable);
        }
        if (this.t && this.f24614A != null) {
            this.f24624e.setVisibility(0);
            this.f24624e.setImageDrawable(this.f24614A);
        } else {
            this.f24624e.setVisibility(8);
        }
        if (this.f24615B != null) {
            this.f24625f.setVisibility(0);
            this.f24625f.setImageDrawable(this.f24615B);
        } else {
            this.f24625f.setVisibility(8);
        }
        this.f24622c.setOnClickListener(this);
    }
}
