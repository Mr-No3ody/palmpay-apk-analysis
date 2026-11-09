package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.chuanyi.ad.AdBannerManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & LottieAnimationViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public LottieAnimationViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "resume":
                ((LottieAnimationViewManagerInterface) this.mViewManager).resume(t);
                break;
            case "play":
                ((LottieAnimationViewManagerInterface) this.mViewManager).play(t, readableArray.getInt(0), readableArray.getInt(1));
                break;
            case "pause":
                ((LottieAnimationViewManagerInterface) this.mViewManager).pause(t);
                break;
            case "reset":
                ((LottieAnimationViewManagerInterface) this.mViewManager).reset(t);
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, @Nullable Object obj) {
        str.getClass();
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1931191604:
                if (str.equals("imageAssetsFolder")) {
                    b7 = 0;
                }
                break;
            case -1698420908:
                if (str.equals("sourceURL")) {
                    b7 = 1;
                }
                break;
            case -1620771041:
                if (str.equals("textFiltersIOS")) {
                    b7 = 2;
                }
                break;
            case -1111735389:
                if (str.equals("sourceJson")) {
                    b7 = 3;
                }
                break;
            case -1111633594:
                if (str.equals("sourceName")) {
                    b7 = 4;
                }
                break;
            case -1073046328:
                if (str.equals("cacheComposition")) {
                    b7 = 5;
                }
                break;
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    b7 = 6;
                }
                break;
            case -413415295:
                if (str.equals("textFiltersAndroid")) {
                    b7 = 7;
                }
                break;
            case -204076609:
                if (str.equals("sourceDotLottieURI")) {
                    b7 = 8;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b7 = 9;
                }
                break;
            case 95945896:
                if (str.equals("dummy")) {
                    b7 = 10;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b7 = Ascii.VT;
                }
                break;
            case 399078087:
                if (str.equals("hardwareAccelerationAndroid")) {
                    b7 = Ascii.FF;
                }
                break;
            case 1192042876:
                if (str.equals("enableSafeModeAndroid")) {
                    b7 = Ascii.CR;
                }
                break;
            case 1193882713:
                if (str.equals("renderMode")) {
                    b7 = Ascii.SO;
                }
                break;
            case 1410565912:
                if (str.equals("colorFilters")) {
                    b7 = Ascii.SI;
                }
                break;
            case 1438608771:
                if (str.equals(AdBannerManager.PROP_AUTO_PLAY)) {
                    b7 = Ascii.DLE;
                }
                break;
            case 2049757303:
                if (str.equals(ViewProps.RESIZE_MODE)) {
                    b7 = 17;
                }
                break;
            case 2111299681:
                if (str.equals("enableMergePathsAndroidForKitKatAndAbove")) {
                    b7 = Ascii.DC2;
                }
                break;
        }
        switch (b7) {
            case 0:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setImageAssetsFolder(t, obj != null ? (String) obj : null);
                break;
            case 1:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceURL(t, obj != null ? (String) obj : null);
                break;
            case 2:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersIOS(t, (ReadableArray) obj);
                break;
            case 3:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceJson(t, obj != null ? (String) obj : null);
                break;
            case 4:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceName(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setCacheComposition(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setProgress(t, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case 7:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersAndroid(t, (ReadableArray) obj);
                break;
            case 8:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceDotLottieURI(t, obj != null ? (String) obj : null);
                break;
            case 9:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setLoop(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setDummy(t, (ReadableMap) obj);
                break;
            case 11:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSpeed(t, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case 12:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setHardwareAccelerationAndroid(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 13:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setEnableSafeModeAndroid(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 14:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setRenderMode(t, obj != null ? (String) obj : null);
                break;
            case 15:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setColorFilters(t, (ReadableArray) obj);
                break;
            case 16:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setAutoPlay(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setResizeMode(t, obj != null ? (String) obj : null);
                break;
            case 18:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setEnableMergePathsAndroidForKitKatAndAbove(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
