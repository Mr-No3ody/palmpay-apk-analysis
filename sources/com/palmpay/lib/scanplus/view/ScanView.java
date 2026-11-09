package com.palmpay.lib.scanplus.view;

import C0.C0127t;
import I6.g;
import I6.j;
import I6.m;
import K6.e;
import K6.f;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.camera.core.impl.z0;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.h;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.flexbox.FlexItem;
import com.google.firebase.messaging.Constants;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import com.microsoft.codepush.react.CodePushConstants;
import com.palmpay.lib.scanplus.bean.BoxHornType;
import com.palmpay.lib.scanplus.bean.CameraDataBean;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.palmpay.lib.scanplus.bean.ScanType;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001eB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0019¢\u0006\u0004\b%\u0010\u001cJ\u0017\u0010'\u001a\u00020\n2\b\b\u0001\u0010&\u001a\u00020\u0019¢\u0006\u0004\b'\u0010\u001cJ\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010\u001cJ\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0019¢\u0006\u0004\b+\u0010\u001cJ\u0015\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0019¢\u0006\u0004\b-\u0010\u001cJ\u0015\u0010.\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u001e¢\u0006\u0004\b.\u0010!J\u0015\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001e¢\u0006\u0004\b0\u0010!J\u0015\u00101\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b1\u0010\u001cJ\u0015\u00102\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b2\u0010\u001cJ\u0015\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001e¢\u0006\u0004\b4\u0010!J\u0015\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u001e¢\u0006\u0004\b6\u0010!J\u0015\u00108\u001a\u00020\n2\u0006\u00107\u001a\u00020\u001e¢\u0006\u0004\b8\u0010!J\u0015\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\u001e¢\u0006\u0004\b:\u0010!J\u0015\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u001e¢\u0006\u0004\b@\u0010!J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001e¢\u0006\u0004\bB\u0010!J\u0015\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u0019¢\u0006\u0004\bD\u0010\u001cJ\u0015\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u001e¢\u0006\u0004\bJ\u0010!J\u0015\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u001e¢\u0006\u0004\bL\u0010!J\u0015\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0019\u0010R\u001a\u00020\n2\b\b\u0001\u0010Q\u001a\u00020\u0019H\u0007¢\u0006\u0004\bR\u0010\u001cJ\u0015\u0010U\u001a\u00020\n2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u00020\n2\b\b\u0001\u0010Q\u001a\u00020\u0019H\u0007¢\u0006\u0004\bW\u0010\u001cJ\u0015\u0010X\u001a\u00020\n2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bX\u0010VJ\u0017\u0010[\u001a\u00020\n2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u001b\u0010]\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/palmpay/lib/scanplus/view/ScanView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "useCameraX", "", "setCamera", "(Z)V", "Lcom/palmpay/lib/scanplus/callback/OnScanListener;", "onScanListener", "setOnScanListener", "(Lcom/palmpay/lib/scanplus/callback/OnScanListener;)V", "Lcom/palmpay/lib/scanplus/bean/ScanType;", "scanType", "setScanType", "(Lcom/palmpay/lib/scanplus/bean/ScanType;)V", "", "cancelText", "setCancelText", "(Ljava/lang/String;)V", "", ViewProps.COLOR, "setCancelColorRes", "(I)V", "setCancelColor", "", "cancelTextSize", "setCancelTextSize", "(F)V", "cancelTop", "setCancelTop", "cancelLeft", "setCancelLeft", "pointViewRes", "setPointViewRes", "pointViewColor", "setPointViewColor", "size", "setPointViewSize", "successColorRes", "setSuccessColorRes", "setBoxSize", "round", "setBoxRound", "setMantleColor", "setBoxStrokeColor", "strokeWidth", "setBoxStrokeWidth", "lineWidth", "setLineWidth", ViewProps.LINE_HEIGHT, "setLineHeight", "lineTop", "setLineTop", "", "lineColor", "setLineColor", "([I)V", "hornWidth", "setHornWidth", "hornLength", "setHornLength", "hornColor", "setHornColor", "Lcom/palmpay/lib/scanplus/bean/BoxHornType;", "boxType", "setBoxType", "(Lcom/palmpay/lib/scanplus/bean/BoxHornType;)V", "animatorWidth", "setAnimatorWidth", "animatorDistance", "setAnimatorDistance", "", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "setAnimatorTime", "(J)V", "id", "setLineBitmapRes", "Landroid/graphics/Bitmap;", "bitmap", "setLineBitmap", "(Landroid/graphics/Bitmap;)V", "setTrailingBitmapRes", "setTrailingBitmap", "Lcom/palmpay/lib/scanplus/bean/CameraDataBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setCameraData", "(Lcom/palmpay/lib/scanplus/bean/CameraDataBean;)V", "setParameters", "(Landroid/util/AttributeSet;)V", "Lcom/google/zxing/MultiFormatReader;", "p", "Lkotlin/Lazy;", "getMMultiFormatReader", "()Lcom/google/zxing/MultiFormatReader;", "mMultiFormatReader", "a", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScanView extends FrameLayout {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CameraXView f24042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CodePointView f24043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BoxView f24044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1205o f24045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnScanListener f24046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CameraView f24047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScanType f24048g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24050j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C4.a f24051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f24052p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final MultiFormatReader getMMultiFormatReader() {
        return (MultiFormatReader) this.f24052p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void setCameraData(CameraDataBean data) {
        try {
            if (this.f24049i) {
                return;
            }
            ScanType scanType = this.f24048g;
            boolean z3 = true;
            if (scanType == ScanType.SCAN_FULL_SCREEN) {
                byte[] data2 = data.getData();
                Intrinsics.checkNotNullExpressionValue(data2, "data.data");
                ArrayList arrayListG = g(data2, data.getWidth(), data.getHeight(), null);
                if (!arrayListG.isEmpty()) {
                    this.f24051o.e();
                    OnScanListener onScanListener = this.f24046e;
                    if (onScanListener != null && onScanListener.onResult(arrayListG)) {
                        this.f24049i = true;
                        CameraView cameraView = this.f24047f;
                        if (cameraView != null) {
                            try {
                                Camera camera = cameraView.f23991b;
                                if (camera != null) {
                                    camera.stopPreview();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        Context context = getContext();
                        Intrinsics.f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        ((E) context).runOnUiThread(new e(this, arrayListG, 0));
                    }
                }
            } else if (scanType == ScanType.SCAN_BOX) {
                byte[] data3 = data.getData();
                Intrinsics.checkNotNullExpressionValue(data3, "data.data");
                ArrayList arrayListG2 = g(data3, data.getWidth(), data.getHeight(), new Rect((int) this.f24044c.getBoxRect().left, (int) this.f24044c.getBoxRect().top, (int) this.f24044c.getBoxRect().right, (int) this.f24044c.getBoxRect().bottom));
                if (!arrayListG2.isEmpty()) {
                    this.f24051o.e();
                    OnScanListener onScanListener2 = this.f24046e;
                    if (onScanListener2 == null || !onScanListener2.onResult(arrayListG2)) {
                        z3 = false;
                    }
                    this.f24049i = z3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void setParameters(AttributeSet attrs) {
        float fS;
        int iS;
        int iS2;
        int iS3;
        float fS2;
        ScanLineView scanLineView;
        float fR;
        ScanLineView scanLineView2;
        float fS3;
        float fS4;
        ScanLineView scanLineView3;
        ScanLineView scanLineView4;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, m.ScanView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…it, R.styleable.ScanView)");
            setCamera(typedArrayObtainStyledAttributes.getBoolean(m.ScanView_useCamera, true));
            int i7 = typedArrayObtainStyledAttributes.getInt(m.ScanView_scanType, 0);
            ScanType scanType = (i7 == 0 || i7 != 1) ? ScanType.SCAN_FULL_SCREEN : ScanType.SCAN_BOX;
            this.f24048g = scanType;
            h();
            String cancelText = typedArrayObtainStyledAttributes.getString(m.ScanView_cancelText);
            if (cancelText != null) {
                Intrinsics.checkNotNullExpressionValue(cancelText, "cancelText");
                setCancelText(cancelText);
            }
            int i10 = m.ScanView_cancelTextColor;
            Context context = getContext();
            CodePointView codePointView = this.f24043b;
            setCancelColor(typedArrayObtainStyledAttributes.getColor(i10, context.getColor(codePointView != null ? codePointView.getCancelColor() : I6.e.width)));
            int i11 = m.ScanView_cancelTextSize;
            CodePointView codePointView2 = this.f24043b;
            if (codePointView2 != null) {
                fS = codePointView2.getCancelSize();
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                fS = J3.a.S(16, context2);
            }
            setCancelTextSize(typedArrayObtainStyledAttributes.getDimension(i11, fS));
            int i12 = m.ScanView_cancelTop;
            CodePointView codePointView3 = this.f24043b;
            if (codePointView3 != null) {
                iS = codePointView3.getCancelTop();
            } else {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                iS = (int) J3.a.S(40, context3);
            }
            setCancelTop(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i12, iS));
            int i13 = m.ScanView_cancelLeft;
            CodePointView codePointView4 = this.f24043b;
            if (codePointView4 != null) {
                iS2 = codePointView4.getCancelLeft();
            } else {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "context");
                iS2 = (int) J3.a.S(20, context4);
            }
            setCancelLeft(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i13, iS2));
            setPointViewRes(typedArrayObtainStyledAttributes.getResourceId(m.ScanView_pointViewRes, g.scan_code_point));
            int i14 = m.ScanView_pointSize;
            CodePointView codePointView5 = this.f24043b;
            if (codePointView5 != null) {
                iS3 = codePointView5.getPointViewSize();
            } else {
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "context");
                iS3 = (int) J3.a.S(50, context5);
            }
            setPointViewSize(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i14, iS3));
            int i15 = m.ScanView_successRes;
            CodePointView codePointView6 = this.f24043b;
            setSuccessColorRes(typedArrayObtainStyledAttributes.getColor(i15, codePointView6 != null ? codePointView6.getSuccessColorRes() : FlexItem.MAX_SIZE));
            int i16 = m.ScanView_boxSize;
            BoxView boxView = this.f24044c;
            setBoxSize(typedArrayObtainStyledAttributes.getDimension(i16, boxView.getBoxSize()));
            setBoxRound(typedArrayObtainStyledAttributes.getDimension(m.ScanView_boxRound, boxView.getBoxRound()));
            setMantleColor(typedArrayObtainStyledAttributes.getColor(m.ScanView_mantleColor, boxView.getMantleColor()));
            setBoxStrokeColor(typedArrayObtainStyledAttributes.getColor(m.ScanView_boxStrokeColor, boxView.getBoxStrokeColor()));
            setBoxStrokeWidth(typedArrayObtainStyledAttributes.getDimension(m.ScanView_boxStrokeWidth, boxView.getBoxStrokeWidth()));
            int i17 = m.ScanView_lineWidth;
            ScanType scanType2 = this.f24048g;
            ScanType scanType3 = ScanType.SCAN_BOX;
            if (scanType2 == scanType3) {
                fS2 = boxView.getBoxSize();
            } else {
                CodePointView codePointView7 = this.f24043b;
                if (codePointView7 == null || (scanLineView = codePointView7.getScanLineView()) == null) {
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "context");
                    fS2 = J3.a.S(320, context6);
                } else {
                    fS2 = scanLineView.getLineWidth();
                }
            }
            setLineWidth(typedArrayObtainStyledAttributes.getDimension(i17, fS2));
            int i18 = m.ScanView_lineHeight;
            if (this.f24048g == scanType3) {
                fR = boxView.getLineHeight();
            } else {
                CodePointView codePointView8 = this.f24043b;
                if (codePointView8 == null || (scanLineView2 = codePointView8.getScanLineView()) == null) {
                    Context context7 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "context");
                    fR = (float) J3.a.R(context7);
                } else {
                    fR = scanLineView2.getLineHeight();
                }
            }
            setLineHeight(typedArrayObtainStyledAttributes.getDimension(i18, fR));
            setLineTop(typedArrayObtainStyledAttributes.getDimension(m.ScanView_lineTop, 0.0f));
            setHornWidth(typedArrayObtainStyledAttributes.getDimension(m.ScanView_hornWidth, boxView.getHornWidth()));
            setHornLength(typedArrayObtainStyledAttributes.getDimension(m.ScanView_hornLength, boxView.getHornLength()));
            setHornColor(typedArrayObtainStyledAttributes.getColor(m.ScanView_hornColor, boxView.getHornColor()));
            int i19 = typedArrayObtainStyledAttributes.getInt(m.ScanView_scanBoxHornType, 0);
            BoxHornType boxHornType = (i19 == 0 || i19 != 1) ? BoxHornType.ROUND : BoxHornType.HORN;
            setBoxType(boxHornType);
            int i20 = m.ScanView_animatorWidth;
            CodePointView codePointView9 = this.f24043b;
            if (codePointView9 == null || (scanLineView4 = codePointView9.getScanLineView()) == null) {
                Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "context");
                fS3 = J3.a.S(180, context8);
            } else {
                fS3 = scanLineView4.getAnimatorWidth();
            }
            setAnimatorWidth(typedArrayObtainStyledAttributes.getDimension(i20, fS3));
            int i21 = m.ScanView_animatorDistance;
            CodePointView codePointView10 = this.f24043b;
            if (codePointView10 == null || (scanLineView3 = codePointView10.getScanLineView()) == null) {
                Context context9 = getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "context");
                fS4 = J3.a.S(300, context9);
            } else {
                fS4 = scanLineView3.getAnimatorHeight();
            }
            setAnimatorDistance(typedArrayObtainStyledAttributes.getDimension(i21, fS4));
            setAnimatorTime(typedArrayObtainStyledAttributes.getInt(m.ScanView_animatorTime, this.f24048g == scanType3 ? 4000 : com.google.firebase.perf.util.Constants.MAX_URL_LENGTH));
            setLineBitmapRes(typedArrayObtainStyledAttributes.getResourceId(m.ScanView_lineBitmap, 0));
            setTrailingBitmapRes(typedArrayObtainStyledAttributes.getResourceId(m.ScanView_trailingBitmap, g.scankit_scan_tail));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final Result b(byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14) {
        Result resultC = null;
        try {
            System.currentTimeMillis();
            resultC = c(new PlanarYUVLuminanceSource(bArr, i7, i10, i11, i12, i13, i14, false));
            if (resultC == null) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i15 = 0; i15 < i10; i15++) {
                    for (int i16 = 0; i16 < i7; i16++) {
                        bArr2[(((i16 * i10) + i10) - i15) - 1] = bArr[(i15 * i7) + i16];
                    }
                }
                resultC = c(new PlanarYUVLuminanceSource(bArr2, i10, i7, i12, i11, i14, i13, false));
            }
            if (resultC != null) {
                System.currentTimeMillis();
            }
            return resultC;
        } catch (Exception unused) {
            return resultC;
        } finally {
            getMMultiFormatReader().reset();
        }
    }

    public final Result c(PlanarYUVLuminanceSource planarYUVLuminanceSource) {
        Result resultDecodeWithState;
        try {
            resultDecodeWithState = getMMultiFormatReader().decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource)));
        } catch (Exception unused) {
            resultDecodeWithState = null;
        }
        if (resultDecodeWithState != null) {
            return resultDecodeWithState;
        }
        try {
            return getMMultiFormatReader().decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(planarYUVLuminanceSource)));
        } catch (Exception unused2) {
            return resultDecodeWithState;
        }
    }

    public final void d() {
        z0 z0Var;
        if (this.f24050j) {
            CameraXView cameraXView = this.f24042a;
            if (cameraXView != null) {
                boolean z3 = !cameraXView.f24006o;
                cameraXView.f24006o = z3;
                LifecycleCamera lifecycleCamera = cameraXView.f24004i;
                if (lifecycleCamera == null || (z0Var = lifecycleCamera.f14512c.f14329C) == null) {
                    return;
                }
                z0Var.enableTorch(z3);
                return;
            }
            return;
        }
        CameraView cameraView = this.f24047f;
        if (cameraView != null) {
            try {
                Camera camera = cameraView.f23991b;
                Camera.Parameters parameters = camera != null ? camera.getParameters() : null;
                boolean z8 = cameraView.f23995f;
                cameraView.f23995f = !z8;
                if (z8) {
                    if (parameters != null) {
                        parameters.setFlashMode("off");
                    }
                } else if (parameters != null) {
                    parameters.setFlashMode(ViewProps.ON);
                }
                Camera camera2 = cameraView.f23991b;
                if (camera2 == null) {
                    return;
                }
                camera2.setParameters(parameters);
            } catch (Exception unused) {
            }
        }
    }

    public final Rect e(Rect rect, int i7, int i10) {
        if (rect == null) {
            return null;
        }
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (i7 == measuredWidth && i10 == measuredHeight) {
            return rect;
        }
        if (i7 == measuredHeight && i10 == measuredWidth) {
            return new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        Rect rect2 = new Rect(rect);
        float f10 = (i10 * 1.0f) / measuredHeight;
        rect2.left = (int) (rect2.left * f10);
        rect2.right = (int) (rect2.right * f10);
        rect2.top = (int) (rect2.top * f10);
        rect2.bottom = (int) (rect2.bottom * f10);
        return rect2;
    }

    public final void f(boolean z3) {
        Camera camera;
        this.f24049i = z3;
        try {
            if (z3) {
                CameraView cameraView = this.f24047f;
                if (cameraView == null || (camera = cameraView.f23991b) == null) {
                    return;
                }
                camera.stopPreview();
                return;
            }
            if (this.f24050j) {
                AbstractC1205o abstractC1205o = this.f24045d;
                if (abstractC1205o instanceof C1212w) {
                    ((C1212w) abstractC1205o).g(EnumC1204n.f17464e);
                    return;
                }
                return;
            }
            CameraView cameraView2 = this.f24047f;
            if (cameraView2 != null) {
                Camera camera2 = cameraView2.f23991b;
                if (camera2 != null) {
                    camera2.startPreview();
                }
                Camera camera3 = cameraView2.f23991b;
                if (camera3 != null) {
                    camera3.setPreviewDisplay(cameraView2.f23990a.getHolder());
                }
                Camera camera4 = cameraView2.f23991b;
                if (camera4 != null) {
                    camera4.setPreviewCallback(cameraView2);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final ArrayList g(byte[] bArr, int i7, int i10, Rect rect) {
        ArrayList arrayList = new ArrayList();
        try {
            Rect rectE = e(rect, i7, i10);
            Result resultB = rectE != null ? b(bArr, i7, i10, rectE.left, rectE.top, rectE.width(), rectE.height()) : b(bArr, i7, i10, 0, 0, i7, i10);
            if (resultB != null) {
                arrayList.add(new CodeBean(null, resultB.getRawBytes(), resultB.getText(), resultB.getBarcodeFormat().name(), null, null, null, null, null));
            }
            if (resultB != null) {
                resultB.getText();
            }
            return arrayList;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "error null";
            }
            Log.e("ScanView", message);
            return arrayList;
        } finally {
            getMMultiFormatReader().reset();
        }
    }

    public final void h() {
        ScanType scanType = this.f24048g;
        ScanType scanType2 = ScanType.SCAN_FULL_SCREEN;
        BoxView boxView = this.f24044c;
        if (scanType == scanType2) {
            CodePointView codePointView = this.f24043b;
            if (codePointView != null) {
                codePointView.setVisibility(0);
            }
            boxView.setVisibility(8);
            return;
        }
        CodePointView codePointView2 = this.f24043b;
        if (codePointView2 != null) {
            codePointView2.setVisibility(8);
        }
        boxView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        this.f24049i = true;
        if (this.f24050j) {
            CameraXView cameraXView = this.f24042a;
            if (cameraXView != null) {
                cameraXView.setOnAnalyzerListener(null);
            }
            CameraXView cameraXView2 = this.f24042a;
            if (cameraXView2 != null) {
                ((h) cameraXView2.f23998b.get()).unbindAll();
            }
        } else {
            CameraView cameraView = this.f24047f;
            if (cameraView != null) {
                cameraView.b();
            }
        }
        CodePointView codePointView = this.f24043b;
        if (codePointView != null) {
            ArrayList arrayList = codePointView.f24009a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnimatorSet) it.next()).cancel();
            }
            arrayList.clear();
            codePointView.scanLineView.a();
        }
        this.f24043b = null;
        BoxView boxView = this.f24044c;
        ValueAnimator valueAnimator = boxView.f23969A;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ValueAnimator valueAnimator2 = boxView.f23969A;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        SoundPool soundPool = (SoundPool) this.f24051o.f1156c;
        if (soundPool != null) {
            soundPool.release();
        }
    }

    public final void setAnimatorDistance(float animatorDistance) {
        CodePointView codePointView = this.f24043b;
        ScanLineView scanLineView = codePointView != null ? codePointView.getScanLineView() : null;
        if (scanLineView == null) {
            return;
        }
        scanLineView.setAnimatorHeight(animatorDistance);
    }

    public final void setAnimatorTime(long time) {
        if (this.f24048g == ScanType.SCAN_BOX) {
            BoxView boxView = this.f24044c;
            boxView.setLineAnimatorDuration(time);
            boxView.a();
        } else {
            CodePointView codePointView = this.f24043b;
            ScanLineView scanLineView = codePointView != null ? codePointView.getScanLineView() : null;
            if (scanLineView == null) {
                return;
            }
            scanLineView.setAnimatorTime(time);
        }
    }

    public final void setAnimatorWidth(float animatorWidth) {
        CodePointView codePointView = this.f24043b;
        ScanLineView scanLineView = codePointView != null ? codePointView.getScanLineView() : null;
        if (scanLineView == null) {
            return;
        }
        scanLineView.setAnimatorWidth(animatorWidth);
    }

    public final void setBoxRound(float round) {
        this.f24044c.setBoxRound(round);
    }

    public final void setBoxSize(float size) {
        BoxView boxView = this.f24044c;
        boxView.setBoxSize(size);
        boxView.a();
    }

    public final void setBoxStrokeColor(int color) {
        this.f24044c.setBoxStrokeColor(color);
    }

    public final void setBoxStrokeWidth(float strokeWidth) {
        this.f24044c.setBoxStrokeWidth(strokeWidth);
    }

    public final void setBoxType(@NotNull BoxHornType boxType) {
        Intrinsics.checkNotNullParameter(boxType, "boxType");
        this.f24044c.setBoxType(boxType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCamera(boolean useCameraX) {
        this.f24050j = useCameraX;
        CameraXView cameraXView = this.f24042a;
        if (cameraXView != null) {
            ((h) cameraXView.f23998b.get()).unbindAll();
            removeView(cameraXView);
            cameraXView.setOnAnalyzerListener(null);
        }
        CameraView cameraView = this.f24047f;
        if (cameraView != null) {
            cameraView.setOnAnalyzerListener(null);
            cameraView.b();
            removeView(cameraView);
        }
        if (useCameraX) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            CameraXView cameraXView2 = new CameraXView(context, null);
            this.f24042a = cameraXView2;
            addView(cameraXView2, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            CameraView cameraView2 = new CameraView(context2, null);
            this.f24047f = cameraView2;
            cameraView2.setScanType(this.f24048g);
            addView(this.f24047f, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f24050j) {
            CameraXView cameraXView3 = this.f24042a;
            if (cameraXView3 != null) {
                cameraXView3.setOnAnalyzerListener(new K6.h(this, 0));
                return;
            }
            return;
        }
        CameraView cameraView3 = this.f24047f;
        if (cameraView3 != null) {
            cameraView3.setOnAnalyzerListener(new f(this, 1));
        }
    }

    public final void setCancelColor(int color) {
        CodePointView codePointView = this.f24043b;
        if (codePointView != null) {
            codePointView.setCancelTextColor(color);
        }
    }

    public final void setCancelColorRes(@ColorRes int color) {
        CodePointView codePointView = this.f24043b;
        if (codePointView != null) {
            codePointView.setCancelTextColor(getContext().getColor(color));
        }
    }

    public final void setCancelLeft(int cancelLeft) {
        CodePointView codePointView = this.f24043b;
        if (codePointView == null) {
            return;
        }
        codePointView.setCancelLeft(cancelLeft);
    }

    public final void setCancelText(@NotNull String cancelText) {
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        CodePointView codePointView = this.f24043b;
        if (codePointView != null) {
            codePointView.setCancelText(cancelText);
        }
    }

    public final void setCancelTextSize(float cancelTextSize) {
        CodePointView codePointView = this.f24043b;
        if (codePointView != null) {
            codePointView.setCancelTextSize(cancelTextSize);
        }
    }

    public final void setCancelTop(int cancelTop) {
        CodePointView codePointView = this.f24043b;
        if (codePointView == null) {
            return;
        }
        codePointView.setCancelTop(cancelTop);
    }

    public final void setHornColor(int hornColor) {
        this.f24044c.setHornColor(hornColor);
    }

    public final void setHornLength(float hornLength) {
        this.f24044c.setHornLength(hornLength);
    }

    public final void setHornWidth(float hornWidth) {
        this.f24044c.setHornWidth(hornWidth);
    }

    public final void setLineBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f24044c.setLineBitmap(bitmap);
        CodePointView codePointView = this.f24043b;
        ScanLineView scanLineView = codePointView != null ? codePointView.getScanLineView() : null;
        if (scanLineView == null) {
            return;
        }
        scanLineView.setLineBitmap(bitmap);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void setLineBitmapRes(@DrawableRes int id2) {
        Drawable drawable;
        if (id2 == 0 || (drawable = getContext().getDrawable(id2)) == null) {
            return;
        }
        setLineBitmap(p264r5.a.I(drawable));
    }

    public final void setLineColor(@NotNull int[] lineColor) {
        Intrinsics.checkNotNullParameter(lineColor, "lineColor");
        BoxView boxView = this.f24044c;
        boxView.setLineColor(lineColor);
        boxView.invalidate();
    }

    public final void setLineHeight(float lineHeight) {
        this.f24044c.setLineHeight(lineHeight);
        CodePointView codePointView = this.f24043b;
        ScanLineView scanLineView = codePointView != null ? codePointView.getScanLineView() : null;
        if (scanLineView == null) {
            return;
        }
        scanLineView.setLineHeight(lineHeight);
    }

    public final void setLineTop(float lineTop) {
        this.f24044c.setBoxTop(lineTop);
        CodePointView codePointView = this.f24043b;
        ScanLineView scanLineView = codePointView != null ? codePointView.getScanLineView() : null;
        if (scanLineView == null) {
            return;
        }
        scanLineView.setLineTop(lineTop);
    }

    public final void setLineWidth(float lineWidth) {
        this.f24044c.setLineWidth(lineWidth);
        CodePointView codePointView = this.f24043b;
        ScanLineView scanLineView = codePointView != null ? codePointView.getScanLineView() : null;
        if (scanLineView == null) {
            return;
        }
        scanLineView.setLineWidth(lineWidth);
    }

    public final void setMantleColor(int color) {
        this.f24044c.setMantleColor(color);
    }

    public final void setOnScanListener(@Nullable OnScanListener onScanListener) {
        this.f24046e = onScanListener;
    }

    public final void setPointViewColor(int pointViewColor) {
        CodePointView codePointView = this.f24043b;
        if (codePointView == null) {
            return;
        }
        codePointView.setPointViewColor(pointViewColor);
    }

    public final void setPointViewRes(@DrawableRes int pointViewRes) {
        CodePointView codePointView = this.f24043b;
        if (codePointView == null) {
            return;
        }
        codePointView.setPointViewRes(pointViewRes);
    }

    public final void setPointViewSize(int size) {
        CodePointView codePointView = this.f24043b;
        if (codePointView == null) {
            return;
        }
        codePointView.setPointViewSize(size);
    }

    public final void setScanType(@NotNull ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        this.f24048g = scanType;
        h();
    }

    public final void setSuccessColorRes(int successColorRes) {
        CodePointView codePointView = this.f24043b;
        if (codePointView == null) {
            return;
        }
        codePointView.setSuccessColorRes(successColorRes);
    }

    public final void setTrailingBitmap(@NotNull Bitmap bitmap) {
        ScanLineView scanLineView;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        CodePointView codePointView = this.f24043b;
        if (codePointView == null || (scanLineView = codePointView.getScanLineView()) == null) {
            return;
        }
        scanLineView.setTrailingBitmap(bitmap);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void setTrailingBitmapRes(@DrawableRes int id2) {
        ScanLineView scanLineView;
        CodePointView codePointView = this.f24043b;
        if (codePointView == null || (scanLineView = codePointView.getScanLineView()) == null) {
            return;
        }
        scanLineView.setTrailingBitmapRes(id2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24048g = ScanType.SCAN_FULL_SCREEN;
        this.f24050j = true;
        C4.a aVar = new C4.a(5, false);
        aVar.f1155b = -1;
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(2).build()).build();
        aVar.f1156c = soundPoolBuild;
        this.f24051o = aVar;
        this.f24052p = C2131j.b(K6.g.f4950a);
        AbstractC1205o lifecycle = ((E) context).getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "context as FragmentActivity).lifecycle");
        this.f24045d = lifecycle;
        aVar.f1155b = soundPoolBuild.load(context, j.voice_correct, 1);
        AttributeSet attributeSet2 = null;
        int i7 = 6;
        int i10 = 0;
        CodePointView codePointView = new CodePointView(context, attributeSet2, i7, i10);
        this.f24043b = codePointView;
        addView(codePointView, new FrameLayout.LayoutParams(-1, -1));
        BoxView boxView = new BoxView(context, attributeSet2, i7, i10);
        this.f24044c = boxView;
        addView(boxView, new FrameLayout.LayoutParams(-1, -1));
        setParameters(attributeSet);
        CodePointView codePointView2 = this.f24043b;
        if (codePointView2 != null) {
            codePointView2.setCancelButtonListener(new C0127t(this, 5));
        }
        CodePointView codePointView3 = this.f24043b;
        if (codePointView3 != null) {
            codePointView3.setPointButtonListener(new f(this, 0));
        }
        lifecycle.a(new LifecycleEventObserver() { // from class: com.palmpay.lib.scanplus.view.ScanView.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i11 = com.palmpay.lib.scanplus.view.a.f24054a[event.ordinal()];
                ScanView scanView = ScanView.this;
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                    scanView.f24045d.b(this);
                } else {
                    CodePointView codePointView4 = scanView.f24043b;
                    if (codePointView4 != null) {
                        codePointView4.a();
                    }
                }
            }
        });
        getMMultiFormatReader().setHints(J6.a.f4539a);
    }
}
