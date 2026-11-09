package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSModalScreenManagerInterface;
import com.google.api.Service;
import com.google.common.base.Ascii;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.transsnet.palmpay.core.config.BillBusinessType;

/* JADX INFO: loaded from: classes.dex */
public class RNSModalScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSModalScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSModalScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, @Nullable Object obj) {
        byte b7;
        str.getClass();
        switch (str.hashCode()) {
            case -2035671681:
                b7 = !str.equals("synchronousShadowStateUpdatesEnabled") ? (byte) -1 : (byte) 0;
                break;
            case -1937389126:
                b7 = !str.equals("homeIndicatorHidden") ? (byte) -1 : (byte) 1;
                break;
            case -1853558344:
                b7 = !str.equals("gestureEnabled") ? (byte) -1 : (byte) 2;
                break;
            case -1734097646:
                b7 = !str.equals("hideKeyboardOnSwipe") ? (byte) -1 : (byte) 3;
                break;
            case -1349152186:
                b7 = !str.equals("sheetCornerRadius") ? (byte) -1 : (byte) 4;
                break;
            case -1322084375:
                b7 = !str.equals(PPWebActivity.KEY_WEB_NAV_BAR) ? (byte) -1 : (byte) 5;
                break;
            case -1156137512:
                b7 = !str.equals("statusBarTranslucent") ? (byte) -1 : (byte) 6;
                break;
            case -1150711358:
                b7 = !str.equals("stackPresentation") ? (byte) -1 : (byte) 7;
                break;
            case -1047235902:
                b7 = !str.equals("activityState") ? (byte) -1 : (byte) 8;
                break;
            case -973702878:
                b7 = !str.equals("statusBarColor") ? (byte) -1 : (byte) 9;
                break;
            case -958765200:
                b7 = !str.equals("statusBarStyle") ? (byte) -1 : (byte) 10;
                break;
            case -952227806:
                b7 = !str.equals("fullScreenSwipeShadowEnabled") ? (byte) -1 : Ascii.VT;
                break;
            case -577711652:
                b7 = !str.equals("stackAnimation") ? (byte) -1 : Ascii.FF;
                break;
            case -462720700:
                b7 = !str.equals("navigationBarColor") ? (byte) -1 : Ascii.CR;
                break;
            case -411607385:
                b7 = !str.equals("screenId") ? (byte) -1 : Ascii.SO;
                break;
            case -381571779:
                b7 = !str.equals("sheetInitialDetent") ? (byte) -1 : Ascii.SI;
                break;
            case -274098190:
                b7 = !str.equals("sheetAllowedDetents") ? (byte) -1 : Ascii.DLE;
                break;
            case -257141968:
                b7 = !str.equals("replaceAnimation") ? (byte) -1 : (byte) 17;
                break;
            case -166356101:
                b7 = !str.equals("preventNativeDismiss") ? (byte) -1 : Ascii.DC2;
                break;
            case 17337291:
                b7 = !str.equals("statusBarHidden") ? (byte) -1 : (byte) 19;
                break;
            case 129956386:
                b7 = !str.equals("fullScreenSwipeEnabled") ? (byte) -1 : Ascii.DC4;
                break;
            case 187703999:
                b7 = !str.equals("gestureResponseDistance") ? (byte) -1 : Ascii.NAK;
                break;
            case 227582404:
                b7 = !str.equals("screenOrientation") ? (byte) -1 : Ascii.SYN;
                break;
            case 241896530:
                b7 = !str.equals("sheetLargestUndimmedDetent") ? (byte) -1 : Ascii.ETB;
                break;
            case 425064969:
                b7 = !str.equals("transitionDuration") ? (byte) -1 : (byte) 24;
                break;
            case 658632444:
                b7 = !str.equals("sheetShouldOverflowTopInset") ? (byte) -1 : Ascii.EM;
                break;
            case 1082157413:
                b7 = !str.equals("swipeDirection") ? (byte) -1 : Ascii.SUB;
                break;
            case 1110843912:
                b7 = !str.equals("customAnimationOnSwipe") ? (byte) -1 : Ascii.ESC;
                break;
            case 1116050554:
                b7 = !str.equals("navigationBarTranslucent") ? (byte) -1 : Ascii.FS;
                break;
            case 1269009342:
                b7 = !str.equals("sheetElevation") ? (byte) -1 : Ascii.GS;
                break;
            case 1287164531:
                b7 = !str.equals("sheetDefaultResizeAnimationEnabled") ? (byte) -1 : Ascii.RS;
                break;
            case 1357942638:
                b7 = !str.equals("sheetGrabberVisible") ? (byte) -1 : Ascii.US;
                break;
            case 1387359683:
                b7 = !str.equals("statusBarAnimation") ? (byte) -1 : (byte) 32;
                break;
            case 1729091548:
                b7 = !str.equals("nativeBackButtonDismissalEnabled") ? (byte) -1 : (byte) 33;
                break;
            case 2097450072:
                b7 = !str.equals("sheetExpandsWhenScrolledToEdge") ? (byte) -1 : (byte) 34;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 3:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 5:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackPresentation(t, (String) obj);
                break;
            case 8:
                ((RNSModalScreenManagerInterface) this.mViewManager).setActivityState(t, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 9:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 10:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarStyle(t, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 12:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackAnimation(t, (String) obj);
                break;
            case 13:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 14:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenId(t, obj == null ? "" : (String) obj);
                break;
            case 15:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 16:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t, (ReadableArray) obj);
                break;
            case 17:
                ((RNSModalScreenManagerInterface) this.mViewManager).setReplaceAnimation(t, (String) obj);
                break;
            case 18:
                ((RNSModalScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 19:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 20:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t, (String) obj);
                break;
            case 21:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t, (ReadableMap) obj);
                break;
            case 22:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenOrientation(t, obj != null ? (String) obj : null);
                break;
            case 23:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 24:
                ((RNSModalScreenManagerInterface) this.mViewManager).setTransitionDuration(t, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetShouldOverflowTopInset(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 26:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSwipeDirection(t, (String) obj);
                break;
            case 27:
                ((RNSModalScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 28:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 29:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetElevation(t, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetDefaultResizeAnimationEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 31:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 32:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t, obj != null ? (String) obj : null);
                break;
            case 33:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 34:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
