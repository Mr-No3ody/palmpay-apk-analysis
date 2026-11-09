package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewMonthView extends DefaultMonthView {
    public PreviewMonthView(Context context) {
        super(context);
    }

    public PreviewMonthView(Context context, AttributeSet attributeSet) {
        super(context);
        if (isInEditMode()) {
            setup(new p(context, attributeSet));
            C1435e c1435e = new C1435e();
            Date date = new Date();
            c1435e.f24201a = s.h("yyyy", date);
            c1435e.f24202b = s.h("MM", date);
            c1435e.f24203c = s.h("dd", date);
            c1435e.f24205e = true;
            r.c(c1435e);
            g(c1435e.f24201a, c1435e.f24202b);
        }
    }
}
