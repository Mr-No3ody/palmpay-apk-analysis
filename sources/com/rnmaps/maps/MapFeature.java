package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MapFeature extends ReactViewGroup {
    public MapFeature(Context context) {
        super(context);
    }

    public abstract void b(Object obj);

    public abstract Object getFeature();
}
