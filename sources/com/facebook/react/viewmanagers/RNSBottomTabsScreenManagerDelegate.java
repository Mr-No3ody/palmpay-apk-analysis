package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface;
import com.google.api.Service;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public class RNSBottomTabsScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSBottomTabsScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSBottomTabsScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, @Nullable Object obj) {
        str.getClass();
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    b7 = 0;
                }
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    b7 = 1;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b7 = 2;
                }
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    b7 = 3;
                }
                break;
            case -1770963447:
                if (str.equals("specialEffects")) {
                    b7 = 4;
                }
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    b7 = 5;
                }
                break;
            case -1559978286:
                if (str.equals("iconResourceName")) {
                    b7 = 6;
                }
                break;
            case -1439500848:
                if (str.equals("orientation")) {
                    b7 = 7;
                }
                break;
            case -1270820115:
                if (str.equals("isFocused")) {
                    b7 = 8;
                }
                break;
            case -1186468415:
                if (str.equals("overrideScrollViewContentInsetAdjustmentBehavior")) {
                    b7 = 9;
                }
                break;
            case -1167193694:
                if (str.equals("isTitleUndefined")) {
                    b7 = 10;
                }
                break;
            case -881409398:
                if (str.equals("tabKey")) {
                    b7 = Ascii.VT;
                }
                break;
            case -776576227:
                if (str.equals("iconImageSource")) {
                    b7 = Ascii.FF;
                }
                break;
            case -737911981:
                if (str.equals("iconType")) {
                    b7 = Ascii.CR;
                }
                break;
            case -558395241:
                if (str.equals("tabBarItemAccessibilityLabel")) {
                    b7 = Ascii.SO;
                }
                break;
            case -270334418:
                if (str.equals("scrollEdgeAppearance")) {
                    b7 = Ascii.SI;
                }
                break;
            case -10721392:
                if (str.equals("drawableIconResourceName")) {
                    b7 = Ascii.DLE;
                }
                break;
            case 28389121:
                if (str.equals("standardAppearance")) {
                    b7 = 17;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    b7 = Ascii.DC2;
                }
                break;
            case 642560482:
                if (str.equals("systemItem")) {
                    b7 = 19;
                }
                break;
            case 1001537282:
                if (str.equals("selectedIconImageSource")) {
                    b7 = Ascii.DC4;
                }
                break;
            case 1072026510:
                if (str.equals("badgeValue")) {
                    b7 = Ascii.NAK;
                }
                break;
            case 1519110851:
                if (str.equals("tabBarItemBadgeBackgroundColor")) {
                    b7 = Ascii.SYN;
                }
                break;
            case 1577043198:
                if (str.equals("tabBarItemTestID")) {
                    b7 = Ascii.ETB;
                }
                break;
            case 1595935908:
                if (str.equals("tabBarItemBadgeTextColor")) {
                    b7 = Ascii.CAN;
                }
                break;
            case 2021932941:
                if (str.equals("selectedIconResourceName")) {
                    b7 = Ascii.EM;
                }
                break;
            case 2109188258:
                if (str.equals("imageIconResource")) {
                    b7 = Ascii.SUB;
                }
                break;
        }
        switch (b7) {
            case 0:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setBottomScrollEdgeEffect(t, (String) obj);
                break;
            case 1:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTopScrollEdgeEffect(t, (String) obj);
                break;
            case 2:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setUserInterfaceStyle(t, (String) obj);
                break;
            case 3:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setLeftScrollEdgeEffect(t, (String) obj);
                break;
            case 4:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSpecialEffects(t, (ReadableMap) obj);
                break;
            case 5:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setRightScrollEdgeEffect(t, (String) obj);
                break;
            case 6:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconResourceName(t, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setOrientation(t, (String) obj);
                break;
            case 8:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIsFocused(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setOverrideScrollViewContentInsetAdjustmentBehavior(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIsTitleUndefined(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabKey(t, obj != null ? (String) obj : null);
                break;
            case 12:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconImageSource(t, (ReadableMap) obj);
                break;
            case 13:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconType(t, (String) obj);
                break;
            case 14:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemAccessibilityLabel(t, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setScrollEdgeAppearance(t, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setDrawableIconResourceName(t, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setStandardAppearance(t, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTitle(t, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSystemItem(t, (String) obj);
                break;
            case 20:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSelectedIconImageSource(t, (ReadableMap) obj);
                break;
            case 21:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setBadgeValue(t, obj != null ? (String) obj : null);
                break;
            case 22:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 23:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemTestID(t, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeTextColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSelectedIconResourceName(t, obj != null ? (String) obj : null);
                break;
            case 26:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setImageIconResource(t, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
