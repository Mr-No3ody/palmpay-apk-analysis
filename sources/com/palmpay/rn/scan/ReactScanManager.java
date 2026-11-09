package com.palmpay.rn.scan;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.didiglobal.booster.instrument.ShadowThread;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.palmpay.lib.scanplus.bean.BoxHornType;
import com.palmpay.lib.scanplus.bean.ScanType;
import com.palmpay.lib.scanplus.view.ScanView;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import p169l7.a;
import p169l7.b;
import p169l7.c;

/* JADX INFO: loaded from: classes3.dex */
public class ReactScanManager extends SimpleViewManager<ScanView> {
    public static final String REACT_CLASS = "PPRNScanner";
    private boolean isContinuous = true;
    private ReactApplicationContext mCallerContext;

    public ReactScanManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchScanResult(ScanView scanView, WritableMap writableMap) {
        int id2 = scanView.getId();
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.mCallerContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new c(UIManagerHelper.getSurfaceId(scanView), id2, writableMap, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLineBitmap$1(ReadableMap readableMap, ScanView scanView) {
        try {
            Bitmap bitmapTryLoadIcon = tryLoadIcon(readableMap.getString("uri"));
            Activity currentActivity = this.mCallerContext.getCurrentActivity();
            if (currentActivity == null) {
                return;
            }
            currentActivity.runOnUiThread(new a(scanView, bitmapTryLoadIcon, 0));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrailingBitmap$3(ReadableMap readableMap, ScanView scanView) {
        try {
            Bitmap bitmapTryLoadIcon = tryLoadIcon(readableMap.getString("uri"));
            Activity currentActivity = this.mCallerContext.getCurrentActivity();
            if (currentActivity == null) {
                return;
            }
            currentActivity.runOnUiThread(new a(scanView, bitmapTryLoadIcon, 1));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private Bitmap tryLoadIcon(String str) throws IOException {
        return BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(str)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put("scanResult", MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onChange"))).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "isContinuous")
    public void isContinuous(ScanView scanView, boolean z3) {
        this.isContinuous = z3;
    }

    @ReactProp(name = "pause")
    public void pause(ScanView scanView, boolean z3) {
        scanView.f(z3);
    }

    @ReactProp(name = "release")
    public void release(ScanView scanView, boolean z3) {
        if (z3) {
            scanView.i();
        }
    }

    @ReactProp(name = "scanType")
    public void scanType(ScanView scanView, int i7) {
        if (i7 == 1) {
            scanView.setScanType(ScanType.SCAN_FULL_SCREEN);
        } else if (i7 == 2) {
            scanView.setScanType(ScanType.SCAN_BOX);
        } else {
            scanView.setScanType(ScanType.SCAN_FULL_SCREEN);
        }
    }

    @ReactProp(name = "animatorDistance")
    public void setAnimatorDistance(ScanView scanView, float f10) {
        scanView.setAnimatorDistance(f10);
    }

    @ReactProp(name = "animatorTime")
    public void setAnimatorTime(ScanView scanView, double d2) {
        scanView.setAnimatorTime((long) d2);
    }

    @ReactProp(name = "animatorWidth")
    public void setAnimatorWidth(ScanView scanView, float f10) {
        scanView.setAnimatorWidth(f10);
    }

    @ReactProp(name = "round")
    public void setBoxRound(ScanView scanView, float f10) {
        scanView.setBoxRound(f10);
    }

    @ReactProp(name = "boxSize")
    public void setBoxSize(ScanView scanView, float f10) {
        scanView.setBoxSize(f10);
    }

    @ReactProp(name = "boxStrokeColor")
    public void setBoxStrokeColor(ScanView scanView, String str) {
        scanView.setBoxStrokeColor(Color.parseColor(str));
    }

    @ReactProp(name = "boxStrokeWidth")
    public void setBoxStrokeWidth(ScanView scanView, float f10) {
        scanView.setBoxStrokeWidth(f10);
    }

    @ReactProp(name = "boxType")
    public void setBoxType(ScanView scanView, int i7) {
        if (i7 == 1) {
            scanView.setBoxType(BoxHornType.ROUND);
        } else if (i7 == 2) {
            scanView.setBoxType(BoxHornType.HORN);
        } else {
            scanView.setBoxType(BoxHornType.ROUND);
        }
    }

    @ReactProp(name = "cancelText")
    public void setCancelText(ScanView scanView, String str) {
        scanView.setCancelText(str);
    }

    @ReactProp(name = "hornColor")
    public void setHornColor(ScanView scanView, String str) {
        scanView.setHornColor(Color.parseColor(str));
    }

    @ReactProp(name = "hornLength")
    public void setHornLength(ScanView scanView, float f10) {
        scanView.setHornLength(f10);
    }

    @ReactProp(name = "hornWidth")
    public void setHornWidth(ScanView scanView, float f10) {
        scanView.setHornWidth(f10);
    }

    @ReactProp(name = "lineImg")
    public void setLineBitmap(ScanView scanView, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        ShadowThread.setThreadName(new ShadowThread(new b(this, readableMap, scanView, 1), "\u200bcom.palmpay.rn.scan.ReactScanManager"), "\u200bcom.palmpay.rn.scan.ReactScanManager").start();
    }

    @ReactProp(name = "lineColor")
    public void setLineColor(ScanView scanView, ReadableArray readableArray) {
        int[] iArr = new int[3];
        for (int i7 = 0; i7 < readableArray.size() && i7 <= 2; i7++) {
            iArr[i7] = Color.parseColor(readableArray.getString(i7));
        }
        scanView.setLineColor(iArr);
    }

    @ReactProp(name = ViewProps.LINE_HEIGHT)
    public void setLineHeight(ScanView scanView, float f10) {
        scanView.setLineHeight(f10);
    }

    @ReactProp(name = "lineTop")
    public void setLineTop(ScanView scanView, float f10) {
        scanView.setLineTop(f10);
    }

    @ReactProp(name = "lineWidth")
    public void setLineWidth(ScanView scanView, float f10) {
        scanView.setLineWidth(f10);
    }

    @ReactProp(name = "mantleColor")
    public void setMantleColor(ScanView scanView, String str) {
        scanView.setMantleColor(Color.parseColor(str));
    }

    @ReactProp(name = "pointViewColor")
    public void setPointViewColor(ScanView scanView, String str) {
        scanView.setPointViewColor(Color.parseColor(str));
    }

    @ReactProp(name = "successColor")
    public void setSuccessColorRes(ScanView scanView, String str) {
        scanView.setSuccessColorRes(Color.parseColor(str));
    }

    @ReactProp(name = "trailingBitmap")
    public void setTrailingBitmap(ScanView scanView, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        ShadowThread.setThreadName(new ShadowThread(new b(this, readableMap, scanView, 0), "\u200bcom.palmpay.rn.scan.ReactScanManager"), "\u200bcom.palmpay.rn.scan.ReactScanManager").start();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public ScanView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        if (themedReactContext.getCurrentActivity() == null) {
            throw new IllegalStateException("Cannot create ScanView without a current Activity");
        }
        ScanView scanView = new ScanView(themedReactContext.getCurrentActivity());
        scanView.setCamera(false);
        scanView.setOnScanListener(new androidx.work.impl.model.b(this, 14, scanView, false));
        return scanView;
    }
}
