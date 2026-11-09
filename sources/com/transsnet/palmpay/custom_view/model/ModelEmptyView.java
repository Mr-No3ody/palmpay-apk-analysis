package com.transsnet.palmpay.custom_view.model;

import L6.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
public class ModelEmptyView extends BaseModel2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f31511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f31513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f31514e;

    public ModelEmptyView(Context context) {
        this(context, null);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final View c(Context context) {
        View.inflate(context, t.cv_layout_list_empty_view_2, this);
        this.f31511b = (ImageView) findViewById(s.imageViewIcon);
        this.f31512c = (TextView) findViewById(s.textViewMessage);
        Drawable drawable = this.f31513d;
        if (drawable != null) {
            this.f31511b.setImageDrawable(drawable);
        }
        CharSequence charSequence = this.f31514e;
        if (!TextUtils.isEmpty(charSequence)) {
            this.f31512c.setText(charSequence);
        }
        setBackgroundColor(getResources().getColor(b.ppColorBackgroundDark));
        return this;
    }

    public ModelEmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ModelEmptyView(Context context, AttributeSet attributeSet, int i7) {
        TextView textView;
        ImageView imageView;
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvEmptyView, i7, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(x.CvEmptyView_cv_empty_icon);
        this.f31513d = drawable;
        CharSequence text = typedArrayObtainStyledAttributes.getText(x.CvEmptyView_cv_empty_text);
        this.f31514e = text;
        typedArrayObtainStyledAttributes.recycle();
        if (drawable != null && (imageView = this.f31511b) != null) {
            imageView.setImageDrawable(drawable);
        }
        if (TextUtils.isEmpty(text) || (textView = this.f31512c) == null) {
            return;
        }
        textView.setText(text);
    }
}
