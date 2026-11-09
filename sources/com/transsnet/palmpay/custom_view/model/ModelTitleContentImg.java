package com.transsnet.palmpay.custom_view.model;

import L6.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
public class ModelTitleContentImg extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f31589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f31591g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f31592i;

    public ModelTitleContentImg(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvTitleContentImg, i7, 0);
        this.f31590f = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleContentImg_ctai_show_img, true);
        this.f31591g = typedArrayObtainStyledAttributes.getText(x.CvTitleContentImg_ctai_title);
        this.f31592i = typedArrayObtainStyledAttributes.getText(x.CvTitleContentImg_ctai_content);
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_title_content_img, this);
        this.f31587c = (TextView) findViewById(s.cmtci_title_tv);
        this.f31588d = (TextView) findViewById(s.cmtci_text_tv);
        this.f31589e = (ImageView) findViewById(s.cmtci_iv);
        if (!TextUtils.isEmpty(this.f31591g)) {
            this.f31587c.setText(this.f31591g);
        }
        if (!TextUtils.isEmpty(this.f31592i)) {
            this.f31588d.setText(this.f31592i);
        }
        this.f31589e.setVisibility(this.f31590f ? 0 : 8);
        return this;
    }

    public final void d() {
        this.f31587c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31588d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31589e.setAlpha(0.6f);
    }

    public void setContent(int i7) {
        this.f31588d.setText(i7);
        setVisibility(0);
    }

    public ModelTitleContentImg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModelTitleContentImg(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public void setContent(String str) {
        this.f31588d.setText(str);
        setVisibility(0);
    }
}
