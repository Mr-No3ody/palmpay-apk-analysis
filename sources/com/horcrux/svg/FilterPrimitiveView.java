package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
abstract class FilterPrimitiveView extends DefinitionView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilterRegion f23294b;

    public FilterPrimitiveView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f23294b = new FilterRegion();
    }

    public static Bitmap c(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap b(HashMap map, Bitmap bitmap);

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
    }
}
