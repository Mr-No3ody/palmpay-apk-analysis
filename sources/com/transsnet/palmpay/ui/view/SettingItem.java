package com.transsnet.palmpay.ui.view;

import Ac.e;
import Ac.f;
import Ac.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class SettingItem extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f35329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f35330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f35331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f35332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f35333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SwitchCompat f35334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f35335g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f35336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f35337j;

    public SettingItem(Context context) {
        this(context, null);
    }

    public final void c(boolean z3) {
        this.f35332d.setVisibility(z3 ? 0 : 8);
    }

    public void setChecked(boolean z3) {
        SwitchCompat switchCompat = this.f35334f;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(null);
            this.f35334f.setChecked(z3);
            this.f35334f.setOnCheckedChangeListener(this.f35337j);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f35337j = onCheckedChangeListener;
        SwitchCompat switchCompat = this.f35334f;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public void setOnPreferenceClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setSummary(CharSequence charSequence) {
        this.f35336i = charSequence;
        TextView textView = this.f35330b;
        if (textView != null) {
            textView.setVisibility(0);
            this.f35330b.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f35335g = charSequence;
        TextView textView = this.f35329a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public SettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingItem(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.MainSettingItem);
        this.f35335g = typedArrayObtainStyledAttributes.getText(j.MainSettingItem_android_title);
        this.f35336i = typedArrayObtainStyledAttributes.getText(j.MainSettingItem_android_summary);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(j.MainSettingItem_st_showDot, false);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(j.MainSettingItem_st_showDivider, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(j.MainSettingItem_st_checkStyle, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(j.MainSettingItem_android_defaultValue, false);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, f.main_layout_setting_item, this);
        this.f35329a = (TextView) findViewById(e.tvTitle);
        this.f35330b = (TextView) findViewById(e.tvSummery);
        this.f35332d = (AppCompatImageView) findViewById(e.ivDot);
        this.f35333e = findViewById(e.viewDivider);
        this.f35331c = (ImageView) findViewById(e.ivArrow);
        this.f35334f = (SwitchCompat) findViewById(e.itemSwitch);
        this.f35329a.setText(this.f35335g);
        if (TextUtils.isEmpty(this.f35336i)) {
            this.f35330b.setVisibility(8);
        } else {
            this.f35330b.setVisibility(0);
            this.f35330b.setText(this.f35336i);
        }
        this.f35332d.setVisibility(z3 ? 0 : 8);
        this.f35333e.setVisibility(z8 ? 0 : 8);
        this.f35334f.setVisibility(z10 ? 0 : 8);
        if (z10) {
            this.f35334f.setChecked(z11);
            this.f35334f.setOnCheckedChangeListener(this.f35337j);
            this.f35331c.setVisibility(8);
        }
    }
}
