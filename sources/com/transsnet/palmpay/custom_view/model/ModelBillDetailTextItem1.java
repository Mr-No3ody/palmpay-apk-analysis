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

/* JADX INFO: loaded from: classes4.dex */
public class ModelBillDetailTextItem1 extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f31456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f31458g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31460j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f31462p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OnTipsClickCallback f31464w;

    public interface OnTipsClickCallback {
        void onTipsClick();
    }

    public ModelBillDetailTextItem1(Context context) {
        super(context);
        this.f31463v = 17;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvTitleTextView, i7, 0);
        this.f31456e = typedArrayObtainStyledAttributes.getText(x.CvTitleTextView_cv_tt_title);
        this.f31457f = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleTextView_cv_tt_show_bottom_line, true);
        this.f31459i = typedArrayObtainStyledAttributes.getColor(x.CvTitleTextView_cv_tt_title_color, context.getColor(b.ppColorTextNormal));
        this.f31460j = typedArrayObtainStyledAttributes.getColor(x.CvTitleTextView_cv_tt_content_color, context.getColor(b.ppColorTextNormal));
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_bill_detail_text_item1, this);
        TextView textView = (TextView) findViewById(s.mbdti_title_tv);
        this.f31454c = textView;
        textView.setTextColor(this.f31459i);
        this.f31461o = (TextView) findViewById(s.mbdti_remark_tv);
        this.f31455d = (TextView) findViewById(s.mbdti_content_tv);
        this.f31455d.setTextColor(this.f31460j);
        this.f31458g = findViewById(s.content_divider);
        ImageView imageView = (ImageView) findViewById(s.mbdti_tips_iv);
        this.f31462p = imageView;
        imageView.setOnClickListener(new I0(this, 5));
        if (!TextUtils.isEmpty(this.f31456e)) {
            this.f31454c.setText(this.f31456e);
        }
        this.f31458g.setVisibility(this.f31457f ? 0 : 8);
        return this;
    }

    public final void d() {
        this.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
    }

    public void setContent(int i7) {
        this.f31455d.setText(i7);
        setVisibility(0);
    }

    public void setMessageGravity(int i7) {
        this.f31463v = i7;
    }

    public void setOnTipsClickCallback(OnTipsClickCallback onTipsClickCallback) {
        this.f31464w = onTipsClickCallback;
    }

    public void setRemark(String str) {
        this.f31461o.setText(str);
    }

    public void setTips(String str) {
        if (this.f31462p == null) {
            return;
        }
        this.t = str;
        if (TextUtils.isEmpty(str)) {
            this.f31462p.setVisibility(8);
        } else {
            this.f31462p.setVisibility(0);
        }
    }

    public void setTitle(String str) {
        this.f31454c.setText(str);
    }

    public void setTitle(int i7) {
        this.f31454c.setText(i7);
    }

    public ModelBillDetailTextItem1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31463v = 17;
    }

    public void setContent(String str) {
        this.f31455d.setText(str);
        setVisibility(0);
    }

    public ModelBillDetailTextItem1(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31463v = 17;
    }
}
