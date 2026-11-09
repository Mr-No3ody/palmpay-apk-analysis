package com.transsnet.adsdk.widgets.banner.bannerview.provider;

import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
public class ViewStyleSetter {
    @RequiresApi(api = 21)
    public static void applyRoundCorner(View target, float radius) {
        if (target == null) {
            return;
        }
        target.setClipToOutline(true);
        target.setOutlineProvider(new RoundViewOutlineProvider(radius));
    }
}
