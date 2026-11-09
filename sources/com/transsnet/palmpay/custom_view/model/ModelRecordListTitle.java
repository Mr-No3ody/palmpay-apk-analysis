package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;

/* JADX INFO: loaded from: classes4.dex */
public class ModelRecordListTitle extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31577d;

    public ModelRecordListTitle(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_record_list_title_area, this);
        this.f31576c = (TextView) findViewById(s.cmrlta_title_tv);
        this.f31577d = (TextView) findViewById(s.cmrlta_content_tv);
        return this;
    }

    public void setTitle(String str) {
        this.f31576c.setText(str);
    }

    public ModelRecordListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setTitle(int i7) {
        this.f31576c.setText(i7);
    }

    public ModelRecordListTitle(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
