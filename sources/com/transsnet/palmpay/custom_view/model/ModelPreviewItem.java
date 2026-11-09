package com.transsnet.palmpay.custom_view.model;

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
public class ModelPreviewItem extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f31569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f31570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f31571g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31573j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31575p;
    public boolean t;

    public ModelPreviewItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvTitleEditView, i7, 0);
        this.f31570f = typedArrayObtainStyledAttributes.getText(x.CvTitleEditView_cv_te_title);
        this.f31571g = typedArrayObtainStyledAttributes.getText(x.CvTitleEditView_cv_te_default_text);
        this.f31572i = typedArrayObtainStyledAttributes.getInt(x.CvTitleEditView_cv_te_text_color, context.getColor(b.ppColorTextPrimary));
        this.f31573j = typedArrayObtainStyledAttributes.getInt(x.CvTitleEditView_cv_te_title_color, context.getColor(b.ppColorTextNormal));
        this.f31574o = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CvTitleEditView_cv_te_title_text_size, SizeUtils.dp2px(14.0f));
        this.f31575p = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CvTitleEditView_cv_te_text_size, SizeUtils.dp2px(14.0f));
        this.t = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_show_divider, true);
        a(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_preview_item, this);
        this.f31567c = (TextView) findViewById(s.title_tv);
        this.f31568d = (TextView) findViewById(s.content_tv);
        this.f31569e = findViewById(s.dividerView);
        if (!TextUtils.isEmpty(this.f31571g)) {
            this.f31568d.setText(this.f31571g);
        }
        if (!TextUtils.isEmpty(this.f31570f)) {
            this.f31567c.setText(this.f31570f);
        }
        this.f31568d.setTextColor(this.f31572i);
        this.f31567c.setTextColor(this.f31573j);
        this.f31568d.setTextSize(0, this.f31575p);
        this.f31567c.setTextSize(0, this.f31574o);
        this.f31569e.setVisibility(this.t ? 0 : 8);
        return this;
    }

    public void setContent(CharSequence charSequence) {
        this.f31568d.setText(charSequence);
    }

    public ModelPreviewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModelPreviewItem(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
