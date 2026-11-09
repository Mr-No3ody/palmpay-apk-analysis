package com.transsnet.palmpay.core.viewmodel;

import C9.ViewOnClickListenerC0146m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.transsnet.palmpay.custom_view.model.ModelPageTitleArea;

/* JADX INFO: loaded from: classes3.dex */
public class ModelPageTitleAreaInPayVerifyPage extends ModelPageTitleArea {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f28393p = 0;

    public ModelPageTitleAreaInPayVerifyPage(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.ModelPageTitleArea, com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        super.c(context);
        this.f31521d.setOnClickListener(new ViewOnClickListenerC0146m(this, 9));
        return this;
    }

    public ModelPageTitleAreaInPayVerifyPage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelPageTitleAreaInPayVerifyPage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
