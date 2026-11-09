package com.palmpay.lib.scanplus.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.palmpay.lib.scanplus.bean.CameraDataBean;
import com.palmpay.lib.scanplus.bean.ScanType;
import com.palmpay.lib.scanplus.code.YuvUtils;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/palmpay/lib/scanplus/view/CameraView;", "Landroid/widget/FrameLayout;", "Landroid/hardware/Camera$PreviewCallback;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/hardware/Camera;", "camera", "", "setCameraDisplayOrientation", "(Landroid/hardware/Camera;)V", "Lkotlin/Function1;", "Lcom/palmpay/lib/scanplus/bean/CameraDataBean;", "action", "setOnAnalyzerListener", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/palmpay/lib/scanplus/bean/ScanType;", "scanType", "setScanType", "(Lcom/palmpay/lib/scanplus/bean/ScanType;)V", "a", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCameraView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraView.kt\ncom/palmpay/lib/scanplus/view/CameraView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1855#2,2:265\n*S KotlinDebug\n*F\n+ 1 CameraView.kt\ncom/palmpay/lib/scanplus/view/CameraView\n*L\n60#1:265,2\n*E\n"})
public final class CameraView extends FrameLayout implements Camera.PreviewCallback, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f23989i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceView f23990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Camera f23991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Matrix f23992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1 f23993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final YuvUtils f23994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScanType f23996g;

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
    public CameraView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(CameraView this$0) {
        float f10;
        Camera.Parameters parameters;
        Camera.Size pictureSize;
        Camera.Parameters parameters2;
        Camera.Size pictureSize2;
        List<Integer> supportedPreviewFormats;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Looper.prepare();
        try {
            Camera cameraOpen = Camera.open();
            this$0.f23991b = cameraOpen;
            Camera.Parameters parameters3 = cameraOpen != null ? cameraOpen.getParameters() : null;
            Camera.Size sizeC = c(this$0.f23991b, this$0.getWidth(), this$0.getHeight());
            if (sizeC != null) {
                if (parameters3 != null) {
                    parameters3.setPictureSize(sizeC.width, sizeC.height);
                }
                if (parameters3 != null) {
                    parameters3.setPreviewSize(sizeC.width, sizeC.height);
                }
            }
            if (parameters3 != null && (supportedPreviewFormats = parameters3.getSupportedPreviewFormats()) != null) {
                for (Integer num : supportedPreviewFormats) {
                    if (num != null && 17 == num.intValue()) {
                        parameters3.setPreviewFormat(17);
                    }
                }
            }
            if (parameters3 != null) {
                parameters3.setFocusMode("continuous-picture");
            }
            Camera camera = this$0.f23991b;
            if (camera != null) {
                camera.setParameters(parameters3);
            }
            this$0.setCameraDisplayOrientation(this$0.f23991b);
            Camera camera2 = this$0.f23991b;
            if (camera2 != null) {
                camera2.setPreviewCallback(this$0);
            }
            Camera camera3 = this$0.f23991b;
            SurfaceView surfaceView = this$0.f23990a;
            if (camera3 != null) {
                camera3.setPreviewDisplay(surfaceView.getHolder());
            }
            int width = this$0.getWidth();
            int height = this$0.getHeight();
            Camera camera4 = this$0.f23991b;
            int i7 = 0;
            int i10 = (camera4 == null || (parameters2 = camera4.getParameters()) == null || (pictureSize2 = parameters2.getPictureSize()) == null) ? 0 : pictureSize2.width;
            Camera camera5 = this$0.f23991b;
            if (camera5 != null && (parameters = camera5.getParameters()) != null && (pictureSize = parameters.getPictureSize()) != null) {
                i7 = pictureSize.height;
            }
            float f11 = i7 / i10;
            float f12 = width;
            float f13 = height;
            float f14 = f12 / f13;
            float f15 = 1.0f;
            if (f14 < f11) {
                float f16 = f11 / f14;
                f10 = 1.0f;
                f15 = f16;
            } else {
                f10 = f14 / f11;
            }
            float f17 = 2;
            float f18 = (f12 - (f12 * f15)) / f17;
            float f19 = (f13 - (f13 * f10)) / f17;
            Matrix matrix = new Matrix();
            matrix.postScale(f15, f10);
            matrix.postTranslate(f18, f19);
            this$0.f23992c = matrix;
            Context context = this$0.getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new K6.a(this$0, 2));
            surfaceView.getHolder().addCallback(this$0);
            Camera camera6 = this$0.f23991b;
            if (camera6 != null) {
                camera6.startPreview();
            }
        } catch (Exception unused) {
        }
        Looper.loop();
    }

    public static Camera.Size c(Camera camera, float f10, float f11) {
        if (camera == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        float f12 = f10 / f11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        float f13 = 0.0f;
        for (Camera.Size size : supportedPreviewSizes) {
            if (!linkedHashMap.containsKey(Float.valueOf(size.height / size.width))) {
                Float fValueOf = Float.valueOf(size.height / size.width);
                Intrinsics.checkNotNullExpressionValue(size, "size");
                linkedHashMap.put(fValueOf, size);
            }
            if (f13 == 0.0f || Math.abs(f12 - (size.height / size.width)) < Math.abs(f12 - f13)) {
                f13 = size.height / size.width;
            }
        }
        return (Camera.Size) linkedHashMap.get(Float.valueOf(f13));
    }

    private final void setCameraDisplayOrientation(Camera camera) {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i7 = 0;
            Camera.getCameraInfo(0, cameraInfo);
            Context context = getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type android.app.Activity");
            int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    i7 = 90;
                } else if (rotation == 2) {
                    i7 = 180;
                } else if (rotation == 3) {
                    i7 = 270;
                }
            }
            int i10 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i7) % MessageEvent.EVENT_CL_REPAYMENT_FAILED)) % MessageEvent.EVENT_CL_REPAYMENT_FAILED : ((cameraInfo.orientation - i7) + MessageEvent.EVENT_CL_REPAYMENT_FAILED) % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
            if (camera != null) {
                camera.setDisplayOrientation(i10);
            }
        } catch (Exception unused) {
        }
    }

    public final void b() {
        try {
            this.f23993d = null;
            Camera camera = this.f23991b;
            if (camera != null) {
                camera.setPreviewCallback(null);
            }
            Camera camera2 = this.f23991b;
            if (camera2 != null) {
                camera2.release();
            }
            this.f23991b = null;
            this.f23990a.destroyDrawingCache();
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Parameters parameters;
        Camera.Size pictureSize;
        Camera.Parameters parameters2;
        Camera.Size pictureSize2;
        Camera.Parameters parameters3;
        Camera.Size previewSize;
        Camera.Parameters parameters4;
        Camera.Size previewSize2;
        Camera.Parameters parameters5;
        Camera.Parameters parameters6;
        if (bArr != null) {
            if (camera != null && (parameters6 = camera.getParameters()) != null) {
                parameters6.getPreviewSize();
            }
            if (camera != null && (parameters5 = camera.getParameters()) != null) {
                parameters5.getPreviewSize();
            }
            if (this.f23996g == ScanType.SCAN_FULL_SCREEN) {
                Function1 function1 = this.f23993d;
                if (function1 != null) {
                    function1.invoke(new CameraDataBean(bArr, (camera == null || (parameters4 = camera.getParameters()) == null || (previewSize2 = parameters4.getPreviewSize()) == null) ? getWidth() : previewSize2.width, (camera == null || (parameters3 = camera.getParameters()) == null || (previewSize = parameters3.getPreviewSize()) == null) ? getHeight() : previewSize.height));
                    return;
                }
                return;
            }
            Function1 function2 = this.f23993d;
            if (function2 != null) {
                float[] fArr = new float[9];
                Matrix matrix = this.f23992c;
                if (matrix != null) {
                    matrix.getValues(fArr);
                }
                int i7 = 0;
                int width = (int) (getWidth() * fArr[0]);
                int height = (int) (getHeight() * fArr[4]);
                Camera camera2 = this.f23991b;
                int i10 = (camera2 == null || (parameters2 = camera2.getParameters()) == null || (pictureSize2 = parameters2.getPictureSize()) == null) ? 0 : pictureSize2.width;
                Camera camera3 = this.f23991b;
                if (camera3 != null && (parameters = camera3.getParameters()) != null && (pictureSize = parameters.getPictureSize()) != null) {
                    i7 = pictureSize.height;
                }
                byte[] bArr2 = new byte[((getHeight() * getWidth()) * 3) / 2];
                this.f23994e.scaleAndclipping(bArr, bArr2, i10, i7, (int) Math.abs(fArr[5]), (int) Math.abs(fArr[2]), getHeight(), getWidth(), height, width);
                function2.invoke(new CameraDataBean(bArr2, getHeight(), getWidth()));
            }
        }
    }

    public final void setOnAnalyzerListener(@Nullable Function1<? super CameraDataBean, Unit> action) {
        this.f23993d = action;
    }

    public final void setScanType(@NotNull ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        this.f23996g = scanType;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            Camera camera = this.f23991b;
            if (camera != null) {
                camera.startPreview();
            }
            Camera camera2 = this.f23991b;
            if (camera2 != null) {
                camera2.setPreviewDisplay(holder);
            }
            Camera camera3 = this.f23991b;
            if (camera3 != null) {
                camera3.setPreviewCallback(this);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            Camera camera = this.f23991b;
            if (camera != null) {
                camera.stopPreview();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SurfaceView surfaceView = new SurfaceView(context);
        this.f23990a = surfaceView;
        this.f23994e = new YuvUtils();
        this.f23996g = ScanType.SCAN_FULL_SCREEN;
        addView(surfaceView);
        post(new K6.a(this, 0));
    }
}
