package com.horcrux.svg;

import androidx.annotation.Nullable;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public class SvgPackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {

    @Nullable
    private Map<String, ModuleSpec> mViewManagers;

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap mapNewHashMap = MapBuilder.newHashMap();
            mapNewHashMap.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new B()));
            mapNewHashMap.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new M()));
            mapNewHashMap.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new O()));
            mapNewHashMap.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new P()));
            mapNewHashMap.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Q()));
            mapNewHashMap.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new S()));
            mapNewHashMap.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new T()));
            mapNewHashMap.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new U()));
            mapNewHashMap.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new V()));
            mapNewHashMap.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1421r()));
            mapNewHashMap.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1422s()));
            mapNewHashMap.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1423t()));
            mapNewHashMap.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1424u()));
            mapNewHashMap.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1425v()));
            mapNewHashMap.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1426w()));
            mapNewHashMap.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1427x()));
            mapNewHashMap.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1428y()));
            mapNewHashMap.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1429z()));
            mapNewHashMap.put(RenderableViewManager.FilterManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new A()));
            mapNewHashMap.put(RenderableViewManager.FeBlendManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C()));
            mapNewHashMap.put(RenderableViewManager.FeColorMatrixManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new D()));
            mapNewHashMap.put(RenderableViewManager.FeCompositeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new E()));
            mapNewHashMap.put(RenderableViewManager.FeFloodManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new F()));
            mapNewHashMap.put(RenderableViewManager.FeGaussianBlurManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new G()));
            mapNewHashMap.put(RenderableViewManager.FeMergeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new H()));
            mapNewHashMap.put(RenderableViewManager.FeOffsetManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new I()));
            mapNewHashMap.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new J()));
            mapNewHashMap.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new K()));
            mapNewHashMap.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new L()));
            this.mViewManagers = mapNewHashMap;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @Nullable
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, @Nonnull ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals("RNSVGRenderableModule")) {
            return new RNSVGRenderableManager(reactApplicationContext);
        }
        if (str.equals("RNSVGSvgViewModule")) {
            return new SvgViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        try {
            return (ReactModuleInfoProvider) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new N();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }
}
