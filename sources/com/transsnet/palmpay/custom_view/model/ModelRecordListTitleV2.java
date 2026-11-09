package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;

/* JADX INFO: loaded from: classes4.dex */
public class ModelRecordListTitleV2 extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31579d;

    public ModelRecordListTitleV2(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_record_list_title_area_v2, this);
        this.f31578c = (TextView) findViewById(s.cmrlta_title_tv);
        this.f31579d = (TextView) findViewById(s.cmrlta_content_tv);
        return this;
    }

    public void setTitle(String str) {
        this.f31578c.setText(str);
    }

    public ModelRecordListTitleV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setTitle(int i7) {
        this.f31578c.setText(i7);
    }

    public ModelRecordListTitleV2(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
