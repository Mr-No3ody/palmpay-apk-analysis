package com.palmpay.lib.liveness.ui.widget;

import L6.b;
import L6.j;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.typeface.IIcon;
import p059e1.a;
import p232p6.t;
import p232p6.u;

/* JADX INFO: loaded from: classes3.dex */
public class LTitleBar extends ConstraintLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f23910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f23911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f23912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f23913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f23914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f23915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f23916g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23917i;

    public LTitleBar(Context context) {
        this(context, null);
    }

    public ImageView getBackImageView() {
        return this.f23911b;
    }

    public ImageView getRightImageView1() {
        return this.f23912c;
    }

    public TextView getTvTitle() {
        return this.f23910a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == t.iv_back) {
            Context context = this.f23915f;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    public void setBackButton(IIcon iIcon) {
        int color = getContext().getColor(b.ppColorTextPrimary);
        ImageView imageView = this.f23911b;
        if (imageView != null) {
            imageView.setImageDrawable(a.h(getContext(), iIcon, null, color, 24));
        }
    }

    public void setBackButtonClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f23911b;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setRightImageView1ClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f23912c;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setRightImageView1Icon(IIcon iIcon) {
        int color = getContext().getColor(b.ppColorTextPrimary);
        ImageView imageView = this.f23912c;
        if (imageView != null) {
            imageView.setImageDrawable(a.h(getContext(), iIcon, null, color, 24));
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f23910a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public LTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LTitleBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f23915f = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ppTitleBarStyle, i7, 0);
        this.f23913d = typedArrayObtainStyledAttributes.getText(j.ppTitleBarStyle_title_bar_title);
        int color = context.getColor(b.ppColorTextPrimary);
        this.f23917i = typedArrayObtainStyledAttributes.getColor(j.ppTitleBarStyle_title_bar_title_color, color);
        if (typedArrayObtainStyledAttributes.hasValue(j.ppTitleBarStyle_title_bar_back_icon)) {
            this.f23914e = typedArrayObtainStyledAttributes.getDrawable(j.ppTitleBarStyle_title_bar_back_icon);
        } else {
            this.f23914e = a.h(context, Resources.getSystem().getConfiguration().getLayoutDirection() == 1 ? S6.a.pay_ArrowRight : S6.a.pay_ArrowLeft, null, color, 20.0f);
        }
        this.f23916g = typedArrayObtainStyledAttributes.getDrawable(j.ppTitleBarStyle_title_bar_background);
        typedArrayObtainStyledAttributes.getText(j.ppTitleBarStyle_title_bar_right_text);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, u.lib_liveness_title_bar, this);
        setPadding(0, 0, 0, 0);
        this.f23910a = (TextView) findViewById(t.tv_title);
        this.f23911b = (ImageView) findViewById(t.iv_back);
        this.f23912c = (ImageView) findViewById(t.iv_right_1);
        if (!TextUtils.isEmpty(this.f23913d)) {
            this.f23910a.setText(this.f23913d);
            this.f23910a.setTextColor(this.f23917i);
        }
        if (this.f23914e != null) {
            this.f23911b.setVisibility(0);
            this.f23911b.setImageDrawable(this.f23914e);
        } else {
            this.f23911b.setVisibility(8);
        }
        Drawable drawable = this.f23916g;
        if (drawable != null) {
            setBackground(drawable);
        }
        this.f23911b.setOnClickListener(this);
    }
}
