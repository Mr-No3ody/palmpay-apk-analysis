package com.transsnet.palmpay.custom_view.model;

import C9.ViewOnClickListenerC0146m;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.x;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
public class ModelPageTitleArea extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f31521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f31522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f31524g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f31525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31526j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IconicsDrawable f31527o;

    public ModelPageTitleArea(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.cv_title_area, i7, 0);
        this.f31524g = typedArrayObtainStyledAttributes.getText(x.cv_title_area_cta_title);
        this.f31525i = typedArrayObtainStyledAttributes.getText(x.cv_title_area_cta_content_text);
        if (typedArrayObtainStyledAttributes.hasValue(x.cv_title_area_cta_back_iv)) {
            this.f31526j = typedArrayObtainStyledAttributes.getResourceId(x.cv_title_area_cta_back_iv, 0);
        } else if (typedArrayObtainStyledAttributes.hasValue(x.cv_title_area_cta_back_iv_iconfont)) {
            this.f31527o = a.h(context, null, typedArrayObtainStyledAttributes.getText(x.cv_title_area_cta_back_iv_iconfont).toString(), -1, 24.0f);
        }
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public View c(Context context) {
        View.inflate(context, t.cv_model_page_title_area, this);
        this.f31520c = (TextView) findViewById(s.cmpta_title);
        this.f31521d = (ImageView) findViewById(s.cmpta_back_iv);
        this.f31522e = (TextView) findViewById(s.cmpta_content);
        this.f31523f = (TextView) findViewById(s.cmpta_right_top_text);
        if (!TextUtils.isEmpty(this.f31524g)) {
            this.f31520c.setText(this.f31524g);
        }
        if (!TextUtils.isEmpty(this.f31525i)) {
            this.f31522e.setText(this.f31525i);
        }
        int i7 = this.f31526j;
        if (i7 != 0) {
            this.f31521d.setImageResource(i7);
        } else {
            IconicsDrawable iconicsDrawable = this.f31527o;
            if (iconicsDrawable != null) {
                this.f31521d.setImageDrawable(iconicsDrawable);
            }
        }
        this.f31521d.setOnClickListener(new ViewOnClickListenerC0146m(this, 13));
        return this;
    }

    public ModelPageTitleArea(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModelPageTitleArea(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
