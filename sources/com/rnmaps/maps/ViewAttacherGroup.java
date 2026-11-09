package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class ViewAttacherGroup extends ReactViewGroup {
    public ViewAttacherGroup(Context context) {
        super(context);
        setWillNotDraw(true);
        setVisibility(0);
        setAlpha(0.0f);
        setRemoveClippedSubviews(false);
        setClipBounds(new Rect(0, 0, 0, 0));
        setOverflow(ViewProps.HIDDEN);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    /* JADX INFO: renamed from: hasOverlappingRendering */
    public final boolean getNeedsOffscreenAlphaCompositing() {
        return false;
    }
}
