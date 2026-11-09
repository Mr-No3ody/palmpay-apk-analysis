package com.transsnet.adsdk.widgets.banner.bannerview.provider;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public class RoundViewOutlineProvider extends ViewOutlineProvider {
    private final float mRadius;

    public RoundViewOutlineProvider(float radius) {
        this.mRadius = radius;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.mRadius);
    }
}
