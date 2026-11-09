package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;
import com.google.common.base.Ascii;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes.dex */
public class RNSVGFeCompositeManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeCompositeManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeCompositeManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, @Nullable Object obj) {
        str.getClass();
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals("height")) {
                    b7 = 0;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    b7 = 1;
                }
                break;
            case KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP /* 120 */:
                if (str.equals("x")) {
                    b7 = 2;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b7 = 3;
                }
                break;
            case 3366:
                if (str.equals("k1")) {
                    b7 = 4;
                }
                break;
            case 3367:
                if (str.equals(TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS)) {
                    b7 = 5;
                }
                break;
            case 3368:
                if (str.equals("k3")) {
                    b7 = 6;
                }
                break;
            case 3369:
                if (str.equals("k4")) {
                    b7 = 7;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b7 = 8;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    b7 = 9;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b7 = 10;
                }
                break;
            case 1662708749:
                if (str.equals("operator1")) {
                    b7 = Ascii.VT;
                }
                break;
        }
        switch (b7) {
            case 0:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setHeight(t, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setResult(t, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setX(t, new DynamicFromObject(obj));
                break;
            case 3:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setY(t, new DynamicFromObject(obj));
                break;
            case 4:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK1(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 5:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK2(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 6:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK3(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 7:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setK4(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setIn1(t, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setIn2(t, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setWidth(t, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setOperator1(t, (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
