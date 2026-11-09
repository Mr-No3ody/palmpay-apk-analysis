package com.transsnet.palmpay.custom_view.wheelview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.t;

/* JADX INFO: loaded from: classes4.dex */
public class TitleEditViewV2 extends TitleEditView {
    public TitleEditViewV2(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.TitleEditView
    public final void a(Context context) {
        View.inflate(context, t.cv_layout_title_input_v2, this);
    }

    public TitleEditViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TitleEditViewV2(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
