package com.palmpay.lib.webview.container;

import android.R;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class WebFullscreenHolder extends FrameLayout {
    public WebFullscreenHolder(Context context) {
        super(context);
        setBackgroundColor(context.getResources().getColor(R.color.black));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
