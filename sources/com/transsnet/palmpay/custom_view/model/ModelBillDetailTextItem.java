package com.transsnet.palmpay.custom_view.model;

import L6.b;
import Uc.I0;
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
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class ModelBillDetailTextItem extends BaseModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f31441A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f31442B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f31445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f31447g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f31448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f31449j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31451p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31453w;

    public ModelBillDetailTextItem(Context context) {
        super(context);
        this.f31442B = 0;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvTitleTextView, i7, 0);
        this.f31449j = typedArrayObtainStyledAttributes.getText(x.CvTitleTextView_cv_tt_title);
        this.f31450o = typedArrayObtainStyledAttributes.getColor(x.CvTitleTextView_cv_tt_content_color, context.getColor(b.ppColorTextPrimary));
        this.f31451p = typedArrayObtainStyledAttributes.getColor(x.CvTitleTextView_cv_tt_title_color, context.getColor(b.ppColorTextPrimary));
        this.f31452v = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CvTitleTextView_cv_tt_text_size, SizeUtils.dp2px(14.0f));
        this.f31453w = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleTextView_cv_tt_show_copy, false);
        this.f31441A = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleTextView_cv_tt_show_bottom_line, true);
        this.f31442B = typedArrayObtainStyledAttributes.getInteger(x.CvTitleTextView_cv_tt_short_height, 0);
        this.t = typedArrayObtainStyledAttributes.getColor(x.CvTitleTextView_cv_tt_bg_color, context.getColor(b.ppColorBackgroundLight));
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        int i7 = this.f31442B;
        if (1 == i7) {
            View.inflate(context, t.cv_model_bill_detail_text_item_short12, this);
        } else if (2 == i7) {
            View.inflate(context, t.cv_model_bill_detail_text_item_short5, this);
        } else {
            View.inflate(context, t.cv_model_bill_detail_text_item, this);
        }
        this.f31443c = (TextView) findViewById(s.mbdti_title_tv);
        this.f31444d = (TextView) findViewById(s.mbdti_content_tv);
        this.f31446f = (TextView) findViewById(s.mbdti_content_desc_tv);
        this.f31445e = (ImageView) findViewById(s.mbdti_copy_iv);
        this.f31447g = findViewById(s.mbdti_root);
        this.f31448i = findViewById(s.content_divider);
        this.f31444d.setTextColor(this.f31450o);
        this.f31443c.setTextColor(this.f31451p);
        this.f31447g.setBackgroundColor(this.t);
        this.f31443c.setTextSize(0, this.f31452v);
        this.f31444d.setTextSize(0, this.f31452v);
        if (!TextUtils.isEmpty(this.f31449j)) {
            this.f31443c.setText(this.f31449j);
        }
        this.f31448i.setVisibility(this.f31441A ? 0 : 4);
        this.f31445e.setVisibility(this.f31453w ? 0 : 8);
        this.f31445e.setOnClickListener(new I0(this, 4));
        return this;
    }

    public void setContent(int i7) {
        this.f31444d.setText(i7);
        setVisibility(0);
    }

    public void setContentDesc(String str) {
        this.f31446f.setText(str);
        this.f31446f.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setTitle(String str) {
        this.f31443c.setText(str);
    }

    public void setTitle(int i7) {
        this.f31443c.setText(i7);
    }

    public ModelBillDetailTextItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31442B = 0;
    }

    public void setContent(String str) {
        this.f31444d.setText(str);
        setVisibility(0);
    }

    public ModelBillDetailTextItem(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31442B = 0;
    }
}
