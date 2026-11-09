package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapCallout extends ReactViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24725c;

    public MapCallout(Context context) {
        super(context);
        this.f24723a = false;
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topPress", MapBuilder.of("registrationName", "topPress"));
        return builder.build();
    }

    public boolean getTooltip() {
        return this.f24723a;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        this.f24724b = i11 - i7;
        this.f24725c = i12 - i10;
    }

    public void setTooltip(boolean z3) {
        this.f24723a = z3;
    }
}
