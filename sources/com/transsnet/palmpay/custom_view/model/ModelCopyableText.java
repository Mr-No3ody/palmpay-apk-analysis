package com.transsnet.palmpay.custom_view.model;

import Ed.ViewOnTouchListenerC0223c;
import L6.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.x;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class ModelCopyableText extends BaseModel {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f31490p = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f31493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31495g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f31496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31497j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31498o;

    public ModelCopyableText(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.ModelCopyableText, i7, 0);
        this.f31493e = typedArrayObtainStyledAttributes.getText(x.ModelCopyableText_mctTitle);
        this.f31496i = typedArrayObtainStyledAttributes.getText(x.ModelCopyableText_mctMessage);
        this.f31494f = typedArrayObtainStyledAttributes.getColor(x.ModelCopyableText_mctTitleColor, getResources().getColor(b.ppColorTextDisable));
        this.f31497j = typedArrayObtainStyledAttributes.getColor(x.ModelCopyableText_mctMessageColor, getResources().getColor(b.ppColorTextDisable));
        this.f31495g = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.ModelCopyableText_mctTitleTextSize, SizeUtils.dp2px(11.0f));
        this.f31498o = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.ModelCopyableText_mctMessageTextSize, SizeUtils.dp2px(11.0f));
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_layout_model_copyable_text, this);
        setOrientation(0);
        this.f31491c = (TextView) findViewById(s.tvTitle);
        this.f31492d = (TextView) findViewById(s.tvMessage);
        this.f31491c.setTextSize(0, this.f31495g);
        this.f31491c.setTextColor(this.f31494f);
        this.f31492d.setTextSize(0, this.f31498o);
        this.f31492d.setTextColor(this.f31497j);
        this.f31492d.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 4));
        d();
        return this;
    }

    public final void d() {
        if (TextUtils.isEmpty(this.f31496i)) {
            this.f31491c.setVisibility(8);
            this.f31492d.setVisibility(8);
            return;
        }
        this.f31492d.setVisibility(0);
        this.f31492d.setText(this.f31496i);
        if (TextUtils.isEmpty(this.f31493e)) {
            this.f31491c.setVisibility(8);
            return;
        }
        this.f31491c.setVisibility(0);
        if (this.f31493e.toString().endsWith(":")) {
            this.f31491c.setText(this.f31493e);
            return;
        }
        this.f31491c.setText(((Object) this.f31493e) + ":");
    }

    public CharSequence getMessage() {
        return this.f31496i;
    }

    public CharSequence getTitle() {
        return this.f31493e;
    }

    public void setMessage(CharSequence charSequence) {
        this.f31496i = charSequence;
        post(new M7.s(this, 28));
    }

    public void setTitle(CharSequence charSequence) {
        this.f31493e = charSequence;
        post(new M7.s(this, 28));
    }

    public ModelCopyableText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModelCopyableText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
