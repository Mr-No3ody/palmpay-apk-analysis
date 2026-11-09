package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class FilterView extends DefinitionView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC1410g f23296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC1410g f23297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FilterRegion f23298d;

    public FilterView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f23295a = new HashMap();
        this.f23298d = new FilterRegion();
    }

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }
}
