package com.luck.lib.camerax;

import Da.g;
import E.A;
import E.C;
import E.C0211p;
import E.C0217w;
import E.C0218x;
import E.C0219y;
import E.L;
import E.N;
import E.O;
import E.P;
import E.Q;
import E.Z;
import E.b0;
import E.o0;
import E.p0;
import Yd.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.display.DisplayManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.C0933i0;
import androidx.camera.camera2.internal.M;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0984i0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.internal.f;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.h;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.B;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import com.luck.lib.camerax.listener.CameraListener;
import com.luck.lib.camerax.listener.CameraXOrientationEventListener;
import com.luck.lib.camerax.listener.CameraXPreviewViewTouchListener;
import com.luck.lib.camerax.listener.CaptureListener;
import com.luck.lib.camerax.listener.ClickListener;
import com.luck.lib.camerax.listener.ImageCallbackListener;
import com.luck.lib.camerax.listener.OnSimpleXPermissionDescriptionListener;
import com.luck.lib.camerax.listener.TypeListener;
import com.luck.lib.camerax.permissions.PermissionChecker;
import com.luck.lib.camerax.permissions.PermissionResultCallback;
import com.luck.lib.camerax.permissions.SimpleXPermissionUtil;
import com.luck.lib.camerax.utils.CameraUtils;
import com.luck.lib.camerax.utils.DensityUtil;
import com.luck.lib.camerax.utils.FileUtils;
import com.luck.lib.camerax.utils.SimpleXSpUtils;
import com.luck.lib.camerax.widget.CaptureLayout;
import com.luck.lib.camerax.widget.FocusImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import p118hf.a;
import p279s5.d;

/* JADX INFO: loaded from: classes3.dex */
public class CustomCameraView extends RelativeLayout implements CameraXOrientationEventListener.OnOrientationChangedListener {
    private static final double RATIO_16_9_VALUE = 1.7777777777777777d;
    private static final double RATIO_4_3_VALUE = 1.3333333333333333d;
    private static final int TYPE_FLASH_AUTO = 33;
    private static final int TYPE_FLASH_OFF = 35;
    private static final int TYPE_FLASH_ON = 34;
    private Activity activity;
    private int buttonFeatures;
    private int displayId;
    private DisplayListener displayListener;
    private DisplayManager displayManager;
    private FocusImageView focusImageView;
    private String imageFormat;
    private String imageFormatForQ;
    private boolean isAutoRotation;
    private boolean isDisplayRecordTime;
    private boolean isManualFocus;
    private boolean isZoomPreview;
    private int lensFacing;
    private CameraControl mCameraControl;
    private CameraInfo mCameraInfo;
    private CameraListener mCameraListener;
    private PreviewView mCameraPreviewView;
    private h mCameraProvider;
    private CaptureLayout mCaptureLayout;
    private ImageView mFlashLamp;
    private C mImageAnalyzer;
    private ImageCallbackListener mImageCallbackListener;
    private P mImageCapture;
    private ImageView mImagePreview;
    private View mImagePreviewBg;
    private MediaPlayer mMediaPlayer;
    private ClickListener mOnClickListener;
    private ImageView mSwitchCamera;
    private TextureView mTextureView;
    private VideoCapture mVideoCapture;
    private Executor mainExecutor;
    private CameraXOrientationEventListener orientationEventListener;
    private String outPutCameraDir;
    private String outPutCameraFileName;
    private long recordTime;
    private int recordVideoMinSecond;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;
    private TextView tvCurrentTime;
    private int typeFlash;
    private int useCameraCases;
    private int videoBitRate;
    private String videoFormat;
    private String videoFormatForQ;
    private int videoFrameRate;

    /* JADX INFO: renamed from: com.luck.lib.camerax.CustomCameraView$3, reason: invalid class name */
    public class AnonymousClass3 implements CaptureListener {
        public AnonymousClass3() {
        }

        @Override // com.luck.lib.camerax.listener.CaptureListener
        public void changeTime(long j6) {
            if (CustomCameraView.this.isDisplayRecordTime && CustomCameraView.this.tvCurrentTime.getVisibility() == 0) {
                Locale locale = Locale.getDefault();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                String str = String.format(locale, "%02d:%02d", Long.valueOf(timeUnit.toMinutes(j6)), Long.valueOf(timeUnit.toSeconds(j6) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j6))));
                if (!TextUtils.equals(str, CustomCameraView.this.tvCurrentTime.getText())) {
                    CustomCameraView.this.tvCurrentTime.setText(str);
                }
                if (TextUtils.equals("00:00", CustomCameraView.this.tvCurrentTime.getText())) {
                    CustomCameraView.this.tvCurrentTime.setVisibility(8);
                }
            }
        }

        @Override // com.luck.lib.camerax.listener.CaptureListener
        public void recordEnd(long j6) {
            CustomCameraView.this.recordTime = j6;
            try {
                CustomCameraView.this.mVideoCapture.stopRecording();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.luck.lib.camerax.listener.CaptureListener
        public void recordError() {
            if (CustomCameraView.this.mCameraListener != null) {
                CustomCameraView.this.mCameraListener.onError(0, "An unknown error", null);
            }
        }

        @Override // com.luck.lib.camerax.listener.CaptureListener
        public void recordShort(long j6) {
            CustomCameraView.this.recordTime = j6;
            CustomCameraView.this.mSwitchCamera.setVisibility(0);
            CustomCameraView.this.mFlashLamp.setVisibility(0);
            CustomCameraView.this.tvCurrentTime.setVisibility(8);
            CustomCameraView.this.mCaptureLayout.resetCaptureLayout();
            CustomCameraView.this.mCaptureLayout.setTextWithAnimation(CustomCameraView.this.getContext().getString(R.string.picture_recording_time_is_short));
            try {
                CustomCameraView.this.mVideoCapture.stopRecording();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.luck.lib.camerax.listener.CaptureListener
        public void recordStart() {
            if (!CustomCameraView.this.mCameraProvider.isBound(CustomCameraView.this.mVideoCapture)) {
                CustomCameraView.this.bindCameraVideoUseCases();
            }
            CustomCameraView.this.useCameraCases = 4;
            CustomCameraView.this.mSwitchCamera.setVisibility(4);
            CustomCameraView.this.mFlashLamp.setVisibility(4);
            CustomCameraView.this.tvCurrentTime.setVisibility(CustomCameraView.this.isDisplayRecordTime ? 0 : 8);
            CustomCameraView.this.mVideoCapture.startRecording(new VideoCapture.OutputFileOptions.Builder(CustomCameraView.this.isSaveExternal() ? FileUtils.createTempFile(CustomCameraView.this.getContext(), true) : FileUtils.createCameraFile(CustomCameraView.this.getContext(), 2, CustomCameraView.this.outPutCameraFileName, CustomCameraView.this.videoFormat, CustomCameraView.this.outPutCameraDir)).build(), CustomCameraView.this.mainExecutor, new VideoCapture.OnVideoSavedCallback() { // from class: com.luck.lib.camerax.CustomCameraView.3.1
                public void onError(int i7, @NonNull @NotNull String str, @Nullable @org.jetbrains.annotations.Nullable Throwable th) {
                    if (CustomCameraView.this.mCameraListener != null) {
                        if (i7 == 6 || i7 == 2) {
                            AnonymousClass3.this.recordShort(0L);
                        } else {
                            CustomCameraView.this.mCameraListener.onError(i7, str, th);
                        }
                    }
                }

                public void onVideoSaved(@NonNull @NotNull VideoCapture.OutputFileResults outputFileResults) {
                    if (CustomCameraView.this.recordTime < (CustomCameraView.this.recordVideoMinSecond <= 0 ? 1500L : CustomCameraView.this.recordVideoMinSecond) || outputFileResults.getSavedUri() == null) {
                        return;
                    }
                    Uri savedUri = outputFileResults.getSavedUri();
                    SimpleCameraX.putOutputUri(CustomCameraView.this.activity.getIntent(), savedUri);
                    String string = FileUtils.isContent(savedUri.toString()) ? savedUri.toString() : savedUri.getPath();
                    CustomCameraView.this.mTextureView.setVisibility(0);
                    CustomCameraView.this.tvCurrentTime.setVisibility(8);
                    if (CustomCameraView.this.mTextureView.isAvailable()) {
                        CustomCameraView.this.startVideoPlay(string);
                    } else {
                        CustomCameraView.this.mTextureView.setSurfaceTextureListener(CustomCameraView.this.surfaceTextureListener);
                    }
                }
            });
        }

        @Override // com.luck.lib.camerax.listener.CaptureListener
        public void recordZoom(float f10) {
        }

        @Override // com.luck.lib.camerax.listener.CaptureListener
        public void takePictures() {
            if (!CustomCameraView.this.mCameraProvider.isBound(CustomCameraView.this.mImageCapture)) {
                CustomCameraView.this.bindCameraImageUseCases();
            }
            CustomCameraView.this.useCameraCases = 1;
            CustomCameraView.this.mCaptureLayout.setButtonCaptureEnabled(false);
            CustomCameraView.this.mSwitchCamera.setVisibility(4);
            CustomCameraView.this.mFlashLamp.setVisibility(4);
            CustomCameraView.this.tvCurrentTime.setVisibility(8);
            N n10 = new N(0, false);
            n10.f1938b = CustomCameraView.this.isReversedHorizontal();
            d dVar = new d(2, CustomCameraView.this.isSaveExternal() ? FileUtils.createTempFile(CustomCameraView.this.getContext(), false) : FileUtils.createCameraFile(CustomCameraView.this.getContext(), 1, CustomCameraView.this.outPutCameraFileName, CustomCameraView.this.imageFormat, CustomCameraView.this.outPutCameraDir), n10);
            P p3 = CustomCameraView.this.mImageCapture;
            Executor executor = CustomCameraView.this.mainExecutor;
            CustomCameraView customCameraView = CustomCameraView.this;
            MyImageResultCallback myImageResultCallback = new MyImageResultCallback(customCameraView, customCameraView.mImagePreview, CustomCameraView.this.mImagePreviewBg, CustomCameraView.this.mCaptureLayout, CustomCameraView.this.mImageCallbackListener, CustomCameraView.this.mCameraListener);
            p3.getClass();
            if (Looper.getMainLooper() != Looper.myLooper()) {
                b.S().execute(new g(p3, dVar, executor, myImageResultCallback, 1));
            } else {
                p3.J(executor, null, myImageResultCallback, dVar);
            }
        }
    }

    public class DisplayListener implements DisplayManager.DisplayListener {
        private DisplayListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            CameraInternal cameraInternalB;
            if (i7 == CustomCameraView.this.displayId) {
                if (CustomCameraView.this.mImageCapture != null) {
                    CustomCameraView.this.mImageCapture.I(CustomCameraView.this.mCameraPreviewView.getDisplay().getRotation());
                }
                if (CustomCameraView.this.mImageAnalyzer != null) {
                    C c6 = CustomCameraView.this.mImageAnalyzer;
                    if (!c6.z(CustomCameraView.this.mCameraPreviewView.getDisplay().getRotation()) || (cameraInternalB = c6.b()) == null) {
                        return;
                    }
                    c6.f1889o.f1914b = c6.g(cameraInternalB, false);
                }
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
        }
    }

    public static class MyImageResultCallback implements ImageCapture$OnImageSavedCallback {
        private final WeakReference<CameraListener> mCameraListenerReference;
        private final WeakReference<CustomCameraView> mCameraViewLayoutReference;
        private final WeakReference<CaptureLayout> mCaptureLayoutReference;
        private final WeakReference<ImageCallbackListener> mImageCallbackListenerReference;
        private final WeakReference<View> mImagePreviewBgReference;
        private final WeakReference<ImageView> mImagePreviewReference;

        public MyImageResultCallback(CustomCameraView customCameraView, ImageView imageView, View view, CaptureLayout captureLayout, ImageCallbackListener imageCallbackListener, CameraListener cameraListener) {
            this.mCameraViewLayoutReference = new WeakReference<>(customCameraView);
            this.mImagePreviewReference = new WeakReference<>(imageView);
            this.mImagePreviewBgReference = new WeakReference<>(view);
            this.mCaptureLayoutReference = new WeakReference<>(captureLayout);
            this.mImageCallbackListenerReference = new WeakReference<>(imageCallbackListener);
            this.mCameraListenerReference = new WeakReference<>(cameraListener);
        }

        @Override // androidx.camera.core.ImageCapture$OnImageSavedCallback
        public void onError(@NonNull Q q10) {
            if (this.mCaptureLayoutReference.get() != null) {
                this.mCaptureLayoutReference.get().setButtonCaptureEnabled(true);
            }
            if (this.mCameraListenerReference.get() != null) {
                this.mCameraListenerReference.get().onError(q10.f1951a, q10.getMessage(), q10.getCause());
            }
        }

        @Override // androidx.camera.core.ImageCapture$OnImageSavedCallback
        public void onImageSaved(@NonNull O o10) {
            Uri uri = o10.f1939a;
            if (uri != null) {
                CustomCameraView customCameraView = this.mCameraViewLayoutReference.get();
                if (customCameraView != null) {
                    customCameraView.stopCheckOrientation();
                }
                ImageView imageView = this.mImagePreviewReference.get();
                if (imageView != null) {
                    SimpleCameraX.putOutputUri(((Activity) imageView.getContext()).getIntent(), uri);
                    imageView.setVisibility(0);
                    if (customCameraView != null && customCameraView.isAutoRotation) {
                        int targetRotation = customCameraView.getTargetRotation();
                        if (targetRotation == 1 || targetRotation == 3) {
                            imageView.setAdjustViewBounds(true);
                        } else {
                            imageView.setAdjustViewBounds(false);
                            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                        View view = this.mImagePreviewBgReference.get();
                        if (view != null) {
                            view.animate().alpha(1.0f).setDuration(220L).start();
                        }
                    }
                    ImageCallbackListener imageCallbackListener = this.mImageCallbackListenerReference.get();
                    if (imageCallbackListener != null) {
                        imageCallbackListener.onLoadImage(FileUtils.isContent(uri.toString()) ? uri.toString() : uri.getPath(), imageView);
                    }
                }
                CaptureLayout captureLayout = this.mCaptureLayoutReference.get();
                if (captureLayout != null) {
                    captureLayout.setButtonCaptureEnabled(true);
                    captureLayout.startTypeBtnAnimator();
                }
            }
        }
    }

    public CustomCameraView(Context context) {
        super(context);
        this.typeFlash = 35;
        this.displayId = -1;
        this.useCameraCases = 1;
        this.lensFacing = 1;
        this.recordTime = 0L;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.luck.lib.camerax.CustomCameraView.9
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
                CustomCameraView.this.startVideoPlay(SimpleCameraX.getOutputPath(CustomCameraView.this.activity.getIntent()));
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        initView();
    }

    private int aspectRatio(int i7, int i10) {
        double dMax = ((double) Math.max(i7, i10)) / ((double) Math.min(i7, i10));
        return Math.abs(dMax - RATIO_4_3_VALUE) <= Math.abs(dMax - RATIO_16_9_VALUE) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindCameraImageUseCases() {
        try {
            int iAspectRatio = aspectRatio(DensityUtil.getScreenWidth(getContext()), DensityUtil.getScreenHeight(getContext()));
            int rotation = this.mCameraPreviewView.getDisplay().getRotation();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = this.lensFacing;
            a.k(i7 != -1, "The specified lens facing is invalid.");
            linkedHashSet.add(new C0984i0(i7));
            C0211p c0211p = new C0211p(linkedHashSet);
            Z z3 = new Z();
            z3.b(iAspectRatio);
            z3.d(rotation);
            b0 b0VarA = z3.build();
            buildImageCapture();
            A a3 = new A();
            a3.b(iAspectRatio);
            a3.f1886a.insertOption(ImageOutputConfig.f13906x, Integer.valueOf(rotation));
            this.mImageAnalyzer = a3.build();
            this.mCameraProvider.unbindAll();
            LifecycleCamera lifecycleCameraD = this.mCameraProvider.d((LifecycleOwner) getContext(), c0211p, b0VarA, this.mImageCapture, this.mImageAnalyzer);
            b0VarA.E(this.mCameraPreviewView.getSurfaceProvider());
            setFlashMode();
            f fVar = lifecycleCameraD.f14512c;
            this.mCameraInfo = fVar.f14330H;
            this.mCameraControl = fVar.f14329C;
            initCameraPreviewListener();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindCameraUseCases() {
        h hVar = this.mCameraProvider;
        if (hVar != null && isBackCameraLevel3Device(hVar)) {
            if (2 == this.buttonFeatures) {
                bindCameraVideoUseCases();
                return;
            } else {
                bindCameraImageUseCases();
                return;
            }
        }
        int i7 = this.buttonFeatures;
        if (i7 == 1) {
            bindCameraImageUseCases();
        } else if (i7 != 2) {
            bindCameraWithUserCases();
        } else {
            bindCameraVideoUseCases();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindCameraVideoUseCases() {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = this.lensFacing;
            a.k(i7 != -1, "The specified lens facing is invalid.");
            linkedHashSet.add(new C0984i0(i7));
            C0211p c0211p = new C0211p(linkedHashSet);
            Z z3 = new Z();
            z3.d(this.mCameraPreviewView.getDisplay().getRotation());
            b0 b0VarA = z3.build();
            buildVideoCapture();
            this.mCameraProvider.unbindAll();
            LifecycleCamera lifecycleCameraD = this.mCameraProvider.d((LifecycleOwner) getContext(), c0211p, b0VarA, this.mVideoCapture);
            b0VarA.E(this.mCameraPreviewView.getSurfaceProvider());
            f fVar = lifecycleCameraD.f14512c;
            this.mCameraInfo = fVar.f14330H;
            this.mCameraControl = fVar.f14329C;
            initCameraPreviewListener();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void bindCameraWithUserCases() {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = this.lensFacing;
            a.k(i7 != -1, "The specified lens facing is invalid.");
            linkedHashSet.add(new C0984i0(i7));
            C0211p c0211p = new C0211p(linkedHashSet);
            Z z3 = new Z();
            z3.d(this.mCameraPreviewView.getDisplay().getRotation());
            b0 b0VarA = z3.build();
            buildImageCapture();
            buildVideoCapture();
            o0 o0Var = new o0();
            o0Var.a(b0VarA);
            o0Var.a(this.mImageCapture);
            o0Var.a(this.mVideoCapture);
            p0 p0VarB = o0Var.b();
            this.mCameraProvider.unbindAll();
            LifecycleCamera lifecycleCameraC = this.mCameraProvider.c((LifecycleOwner) getContext(), c0211p, p0VarB);
            b0VarA.E(this.mCameraPreviewView.getSurfaceProvider());
            setFlashMode();
            f fVar = lifecycleCameraC.f14512c;
            this.mCameraInfo = fVar.f14330H;
            this.mCameraControl = fVar.f14329C;
            initCameraPreviewListener();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void buildImageCapture() {
        int iAspectRatio = aspectRatio(DensityUtil.getScreenWidth(getContext()), DensityUtil.getScreenHeight(getContext()));
        L l5 = new L();
        C0971c c0971c = C0982h0.f14069b;
        C0992m0 c0992m0 = l5.f1935a;
        c0992m0.insertOption(c0971c, 1);
        l5.b(iAspectRatio);
        c0992m0.insertOption(ImageOutputConfig.f13906x, Integer.valueOf(this.mCameraPreviewView.getDisplay().getRotation()));
        this.mImageCapture = l5.build();
    }

    @SuppressLint({"RestrictedApi"})
    private void buildVideoCapture() {
        VideoCapture.Builder builder = new VideoCapture.Builder();
        builder.setTargetRotation(this.mCameraPreviewView.getDisplay().getRotation());
        int i7 = this.videoFrameRate;
        if (i7 > 0) {
            builder.setVideoFrameRate(i7);
        }
        int i10 = this.videoBitRate;
        if (i10 > 0) {
            builder.setBitRate(i10);
        }
        this.mVideoCapture = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTargetRotation() {
        return this.mImageCapture.j();
    }

    private void initCameraPreviewListener() {
        final B zoomState = this.mCameraInfo.getZoomState();
        CameraXPreviewViewTouchListener cameraXPreviewViewTouchListener = new CameraXPreviewViewTouchListener(getContext());
        cameraXPreviewViewTouchListener.setCustomTouchListener(new CameraXPreviewViewTouchListener.CustomTouchListener() { // from class: com.luck.lib.camerax.CustomCameraView.8
            @Override // com.luck.lib.camerax.listener.CameraXPreviewViewTouchListener.CustomTouchListener
            public void click(float f10, float f11) {
                if (CustomCameraView.this.isManualFocus) {
                    C0217w c0217w = new C0217w(CustomCameraView.this.mCameraPreviewView.getMeteringPointFactory().a(f10, f11, 0.15f));
                    c0217w.f2133d = TimeUnit.SECONDS.toMillis(3L);
                    C0218x c0218x = new C0218x(c0217w);
                    if (CustomCameraView.this.mCameraInfo.isFocusMeteringSupported(c0218x)) {
                        CustomCameraView.this.mCameraControl.cancelFocusAndMetering();
                        CustomCameraView.this.focusImageView.setDisappear(false);
                        CustomCameraView.this.focusImageView.startFocus(new Point((int) f10, (int) f11));
                        final ListenableFuture<C0219y> listenableFutureStartFocusAndMetering = CustomCameraView.this.mCameraControl.startFocusAndMetering(c0218x);
                        listenableFutureStartFocusAndMetering.addListener(new Runnable() { // from class: com.luck.lib.camerax.CustomCameraView.8.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    C0219y c0219y = (C0219y) listenableFutureStartFocusAndMetering.get();
                                    CustomCameraView.this.focusImageView.setDisappear(true);
                                    if (c0219y.f2138a) {
                                        CustomCameraView.this.focusImageView.onFocusSuccess();
                                    } else {
                                        CustomCameraView.this.focusImageView.onFocusFailed();
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }, CustomCameraView.this.mainExecutor);
                    }
                }
            }

            @Override // com.luck.lib.camerax.listener.CameraXPreviewViewTouchListener.CustomTouchListener
            public void doubleClick(float f10, float f11) {
                if (!CustomCameraView.this.isZoomPreview || zoomState.d() == null) {
                    return;
                }
                if (((ZoomState) zoomState.d()).getZoomRatio() > ((ZoomState) zoomState.d()).getMinZoomRatio()) {
                    CustomCameraView.this.mCameraControl.setLinearZoom(0.0f);
                } else {
                    CustomCameraView.this.mCameraControl.setLinearZoom(0.5f);
                }
            }

            @Override // com.luck.lib.camerax.listener.CameraXPreviewViewTouchListener.CustomTouchListener
            public void zoom(float f10) {
                if (!CustomCameraView.this.isZoomPreview || zoomState.d() == null) {
                    return;
                }
                CustomCameraView.this.mCameraControl.setZoomRatio(((ZoomState) zoomState.d()).getZoomRatio() * f10);
            }
        });
        this.mCameraPreviewView.setOnTouchListener(cameraXPreviewViewTouchListener);
    }

    private void initView() {
        View.inflate(getContext(), R.layout.picture_camera_view, this);
        this.activity = (Activity) getContext();
        setBackgroundColor(getContext().getColor(R.color.picture_color_black));
        this.mCameraPreviewView = (PreviewView) findViewById(R.id.cameraPreviewView);
        this.mTextureView = (TextureView) findViewById(R.id.video_play_preview);
        this.focusImageView = (FocusImageView) findViewById(R.id.focus_view);
        this.mImagePreview = (ImageView) findViewById(R.id.cover_preview);
        this.mImagePreviewBg = findViewById(R.id.cover_preview_bg);
        this.mSwitchCamera = (ImageView) findViewById(R.id.image_switch);
        this.mFlashLamp = (ImageView) findViewById(R.id.image_flash);
        this.mCaptureLayout = (CaptureLayout) findViewById(R.id.capture_layout);
        this.tvCurrentTime = (TextView) findViewById(R.id.tv_current_time);
        this.mSwitchCamera.setImageResource(R.drawable.picture_ic_camera);
        this.displayManager = (DisplayManager) getContext().getSystemService("display");
        DisplayListener displayListener = new DisplayListener();
        this.displayListener = displayListener;
        this.displayManager.registerDisplayListener(displayListener, null);
        this.mainExecutor = androidx.core.content.d.d(getContext());
        this.mCameraPreviewView.post(new Runnable() { // from class: com.luck.lib.camerax.CustomCameraView.1
            @Override // java.lang.Runnable
            public void run() {
                Display display;
                if (CustomCameraView.this.mCameraPreviewView == null || (display = CustomCameraView.this.mCameraPreviewView.getDisplay()) == null) {
                    return;
                }
                CustomCameraView.this.displayId = display.getDisplayId();
            }
        });
        this.mFlashLamp.setOnClickListener(new i(this, 17));
        this.mSwitchCamera.setOnClickListener(new View.OnClickListener() { // from class: com.luck.lib.camerax.CustomCameraView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomCameraView.this.toggleCamera();
            }
        });
        this.mCaptureLayout.setCaptureListener(new AnonymousClass3());
        this.mCaptureLayout.setTypeListener(new TypeListener() { // from class: com.luck.lib.camerax.CustomCameraView.4
            @Override // com.luck.lib.camerax.listener.TypeListener
            public void cancel() {
                CustomCameraView.this.onCancelMedia();
            }

            @Override // com.luck.lib.camerax.listener.TypeListener
            public void confirm() {
                String outputPath = SimpleCameraX.getOutputPath(CustomCameraView.this.activity.getIntent());
                if (CustomCameraView.this.isSaveExternal()) {
                    CustomCameraView customCameraView = CustomCameraView.this;
                    outputPath = customCameraView.isMergeExternalStorageState(customCameraView.activity, outputPath);
                } else if (CustomCameraView.this.isImageCaptureEnabled() && CustomCameraView.this.isReversedHorizontal()) {
                    File fileCreateCameraFile = FileUtils.createCameraFile(CustomCameraView.this.getContext(), 1, CustomCameraView.this.outPutCameraFileName, CustomCameraView.this.imageFormat, CustomCameraView.this.outPutCameraDir);
                    if (FileUtils.copyPath(CustomCameraView.this.activity, outputPath, fileCreateCameraFile.getAbsolutePath())) {
                        outputPath = fileCreateCameraFile.getAbsolutePath();
                        SimpleCameraX.putOutputUri(CustomCameraView.this.activity.getIntent(), Uri.fromFile(fileCreateCameraFile));
                    }
                }
                if (!CustomCameraView.this.isImageCaptureEnabled()) {
                    CustomCameraView.this.stopVideoPlay();
                    if (CustomCameraView.this.mCameraListener != null) {
                        CustomCameraView.this.mCameraListener.onRecordSuccess(outputPath);
                        return;
                    }
                    return;
                }
                CustomCameraView.this.mImagePreview.setVisibility(4);
                CustomCameraView.this.mImagePreviewBg.setAlpha(0.0f);
                if (CustomCameraView.this.mCameraListener != null) {
                    CustomCameraView.this.mCameraListener.onPictureSuccess(outputPath);
                }
            }
        });
        this.mCaptureLayout.setLeftClickListener(new ClickListener() { // from class: com.luck.lib.camerax.CustomCameraView.5
            @Override // com.luck.lib.camerax.listener.ClickListener
            public void onClick() {
                if (CustomCameraView.this.mOnClickListener != null) {
                    CustomCameraView.this.mOnClickListener.onClick();
                }
            }
        });
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private boolean isBackCameraLevel3Device(h hVar) {
        List listA = C0211p.f2092c.a((ArrayList) hVar.getAvailableCameraInfos());
        if (listA.isEmpty()) {
            return false;
        }
        p1.d dVarF = p1.d.f((CameraInfo) listA.get(0));
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        C0933i0 c0933i0 = (C0933i0) dVarF.f41179c;
        return Objects.equals(c0933i0 != null ? c0933i0.f13555b.a(key) : ((M) dVarF.f41178b).f13229b.a(key), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isImageCaptureEnabled() {
        return this.useCameraCases == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String isMergeExternalStorageState(Activity activity, String str) {
        Uri uriInsert;
        try {
            if (isImageCaptureEnabled() && isReversedHorizontal()) {
                File fileCreateTempFile = FileUtils.createTempFile(activity, false);
                if (FileUtils.copyPath(activity, str, fileCreateTempFile.getAbsolutePath())) {
                    str = fileCreateTempFile.getAbsolutePath();
                }
            }
            if (isImageCaptureEnabled()) {
                uriInsert = getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, CameraUtils.buildImageContentValues(this.outPutCameraFileName, this.imageFormatForQ));
            } else {
                uriInsert = getContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, CameraUtils.buildVideoContentValues(this.outPutCameraFileName, this.videoFormatForQ));
            }
            if (uriInsert != null) {
                if (FileUtils.writeFileFromIS(new FileInputStream(str), getContext().getContentResolver().openOutputStream(uriInsert))) {
                    FileUtils.deleteFile(getContext(), str);
                    SimpleCameraX.putOutputUri(activity.getIntent(), uriInsert);
                    return uriInsert.toString();
                }
            }
            return str;
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReversedHorizontal() {
        return this.lensFacing == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSaveExternal() {
        return Build.VERSION.SDK_INT >= 29 && TextUtils.isEmpty(this.outPutCameraDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        int i7 = this.typeFlash + 1;
        this.typeFlash = i7;
        if (i7 > 35) {
            this.typeFlash = 33;
        }
        setFlashMode();
    }

    private void resetState() {
        if (isImageCaptureEnabled()) {
            this.mImagePreview.setVisibility(4);
            this.mImagePreviewBg.setAlpha(0.0f);
        } else {
            try {
                this.mVideoCapture.stopRecording();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.mSwitchCamera.setVisibility(0);
        this.mFlashLamp.setVisibility(0);
        this.mCaptureLayout.resetCaptureLayout();
    }

    private void setFlashMode() {
        if (this.mImageCapture == null) {
            return;
        }
        switch (this.typeFlash) {
            case 33:
                this.mFlashLamp.setImageResource(R.drawable.picture_ic_flash_auto);
                this.mImageCapture.H(0);
                break;
            case 34:
                this.mFlashLamp.setImageResource(R.drawable.picture_ic_flash_on);
                this.mImageCapture.H(1);
                break;
            case 35:
                this.mFlashLamp.setImageResource(R.drawable.picture_ic_flash_off);
                this.mImageCapture.H(2);
                break;
        }
    }

    private void startCheckOrientation() {
        CameraXOrientationEventListener cameraXOrientationEventListener = this.orientationEventListener;
        if (cameraXOrientationEventListener != null) {
            cameraXOrientationEventListener.star();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVideoPlay(String str) {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer == null) {
                this.mMediaPlayer = new MediaPlayer();
            } else {
                mediaPlayer.reset();
            }
            if (FileUtils.isContent(str)) {
                this.mMediaPlayer.setDataSource(getContext(), Uri.parse(str));
            } else {
                this.mMediaPlayer.setDataSource(str);
            }
            this.mMediaPlayer.setSurface(new Surface(this.mTextureView.getSurfaceTexture()));
            this.mMediaPlayer.setVideoScalingMode(1);
            this.mMediaPlayer.setAudioStreamType(3);
            this.mMediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.luck.lib.camerax.CustomCameraView.10
                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i7, int i10) {
                    CustomCameraView customCameraView = CustomCameraView.this;
                    customCameraView.updateVideoViewSize(customCameraView.mMediaPlayer.getVideoWidth(), CustomCameraView.this.mMediaPlayer.getVideoHeight());
                }
            });
            this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.luck.lib.camerax.CustomCameraView.11
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer2) {
                    CustomCameraView.this.mMediaPlayer.start();
                }
            });
            this.mMediaPlayer.setLooping(true);
            this.mMediaPlayer.prepareAsync();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopVideoPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.mMediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        this.mTextureView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVideoViewSize(float f10, float f11) {
        if (f10 > f11) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) ((f11 / f10) * getWidth()));
            layoutParams.addRule(13, -1);
            this.mTextureView.setLayoutParams(layoutParams);
        }
    }

    public void buildUseCameraCases() {
        final ListenableFuture<h> fVar = h.f14527i.getInstance(getContext());
        fVar.addListener(new Runnable() { // from class: com.luck.lib.camerax.CustomCameraView.7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CustomCameraView.this.mCameraProvider = (h) fVar.get();
                    CustomCameraView.this.bindCameraUseCases();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }, this.mainExecutor);
    }

    public void onCancelMedia() {
        FileUtils.deleteFile(getContext(), SimpleCameraX.getOutputPath(this.activity.getIntent()));
        stopVideoPlay();
        resetState();
        startCheckOrientation();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        buildUseCameraCases();
    }

    public void onDestroy() {
        this.displayManager.unregisterDisplayListener(this.displayListener);
        stopCheckOrientation();
        this.focusImageView.destroy();
    }

    @Override // com.luck.lib.camerax.listener.CameraXOrientationEventListener.OnOrientationChangedListener
    public void onOrientationChanged(int i7) {
        CameraInternal cameraInternalB;
        P p3 = this.mImageCapture;
        if (p3 != null) {
            p3.I(i7);
        }
        C c6 = this.mImageAnalyzer;
        if (c6 == null || !c6.z(i7) || (cameraInternalB = c6.b()) == null) {
            return;
        }
        c6.f1889o.f1914b = c6.g(cameraInternalB, false);
    }

    public void setCameraConfig(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        boolean z3 = extras.getBoolean(SimpleCameraX.EXTRA_CAMERA_AROUND_STATE, false);
        this.buttonFeatures = extras.getInt(SimpleCameraX.EXTRA_CAMERA_MODE, 0);
        this.lensFacing = !z3 ? 1 : 0;
        this.outPutCameraDir = extras.getString(SimpleCameraX.EXTRA_OUTPUT_PATH_DIR);
        this.outPutCameraFileName = extras.getString(SimpleCameraX.EXTRA_CAMERA_FILE_NAME);
        this.videoFrameRate = extras.getInt(SimpleCameraX.EXTRA_VIDEO_FRAME_RATE);
        this.videoBitRate = extras.getInt(SimpleCameraX.EXTRA_VIDEO_BIT_RATE);
        this.isManualFocus = extras.getBoolean(SimpleCameraX.EXTRA_MANUAL_FOCUS);
        this.isZoomPreview = extras.getBoolean(SimpleCameraX.EXTRA_ZOOM_PREVIEW);
        this.isAutoRotation = extras.getBoolean(SimpleCameraX.EXTRA_AUTO_ROTATION);
        int i7 = extras.getInt(SimpleCameraX.EXTRA_RECORD_VIDEO_MAX_SECOND, CustomCameraConfig.DEFAULT_MAX_RECORD_VIDEO);
        this.recordVideoMinSecond = extras.getInt(SimpleCameraX.EXTRA_RECORD_VIDEO_MIN_SECOND, 1500);
        this.imageFormat = extras.getString(SimpleCameraX.EXTRA_CAMERA_IMAGE_FORMAT, ".jpeg");
        this.imageFormatForQ = extras.getString(SimpleCameraX.EXTRA_CAMERA_IMAGE_FORMAT_FOR_Q, "image/jpeg");
        this.videoFormat = extras.getString(SimpleCameraX.EXTRA_CAMERA_VIDEO_FORMAT, ".mp4");
        this.videoFormatForQ = extras.getString(SimpleCameraX.EXTRA_CAMERA_VIDEO_FORMAT_FOR_Q, "video/mp4");
        int i10 = extras.getInt(SimpleCameraX.EXTRA_CAPTURE_LOADING_COLOR, -8552961);
        this.isDisplayRecordTime = extras.getBoolean(SimpleCameraX.EXTRA_DISPLAY_RECORD_CHANGE_TIME, false);
        this.mCaptureLayout.setButtonFeatures(this.buttonFeatures);
        if (i7 > 0) {
            setRecordVideoMaxTime(i7);
        }
        int i11 = this.recordVideoMinSecond;
        if (i11 > 0) {
            setRecordVideoMinTime(i11);
        }
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j6 = i7;
        this.tvCurrentTime.setText(String.format(locale, "%02d:%02d", Long.valueOf(timeUnit.toMinutes(j6)), Long.valueOf(timeUnit.toSeconds(j6) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j6)))));
        if (this.isAutoRotation && this.buttonFeatures != 2) {
            this.orientationEventListener = new CameraXOrientationEventListener(getContext(), this);
            startCheckOrientation();
        }
        setCaptureLoadingColor(i10);
        setProgressColor(i10);
        if (PermissionChecker.checkSelfPermission(getContext(), new String[]{"android.permission.CAMERA"})) {
            buildUseCameraCases();
            return;
        }
        if (CustomCameraConfig.explainListener != null && !SimpleXSpUtils.getBoolean(getContext(), "android.permission.CAMERA", false)) {
            CustomCameraConfig.explainListener.onPermissionDescription(getContext(), this, "android.permission.CAMERA");
        }
        PermissionChecker.getInstance().requestPermissions(this.activity, new String[]{"android.permission.CAMERA"}, new PermissionResultCallback() { // from class: com.luck.lib.camerax.CustomCameraView.6
            @Override // com.luck.lib.camerax.permissions.PermissionResultCallback
            public void onDenied() {
                if (CustomCameraConfig.deniedListener == null) {
                    SimpleXPermissionUtil.goIntentSetting(CustomCameraView.this.activity, 1102);
                    return;
                }
                SimpleXSpUtils.putBoolean(CustomCameraView.this.getContext(), "android.permission.CAMERA", true);
                CustomCameraConfig.deniedListener.onDenied(CustomCameraView.this.getContext(), "android.permission.CAMERA", 1102);
                OnSimpleXPermissionDescriptionListener onSimpleXPermissionDescriptionListener = CustomCameraConfig.explainListener;
                if (onSimpleXPermissionDescriptionListener != null) {
                    onSimpleXPermissionDescriptionListener.onDismiss(CustomCameraView.this);
                }
            }

            @Override // com.luck.lib.camerax.permissions.PermissionResultCallback
            public void onGranted() {
                CustomCameraView.this.buildUseCameraCases();
                OnSimpleXPermissionDescriptionListener onSimpleXPermissionDescriptionListener = CustomCameraConfig.explainListener;
                if (onSimpleXPermissionDescriptionListener != null) {
                    onSimpleXPermissionDescriptionListener.onDismiss(CustomCameraView.this);
                }
            }
        });
    }

    public void setCameraListener(CameraListener cameraListener) {
        this.mCameraListener = cameraListener;
    }

    public void setCaptureLoadingColor(int i7) {
        this.mCaptureLayout.setCaptureLoadingColor(i7);
    }

    public void setImageCallbackListener(ImageCallbackListener imageCallbackListener) {
        this.mImageCallbackListener = imageCallbackListener;
    }

    public void setOnCancelClickListener(ClickListener clickListener) {
        this.mOnClickListener = clickListener;
    }

    public void setProgressColor(int i7) {
        this.mCaptureLayout.setProgressColor(i7);
    }

    public void setRecordVideoMaxTime(int i7) {
        this.mCaptureLayout.setDuration(i7);
    }

    public void setRecordVideoMinTime(int i7) {
        this.mCaptureLayout.setMinDuration(i7);
    }

    public void stopCheckOrientation() {
        CameraXOrientationEventListener cameraXOrientationEventListener = this.orientationEventListener;
        if (cameraXOrientationEventListener != null) {
            cameraXOrientationEventListener.stop();
        }
    }

    public void toggleCamera() {
        this.lensFacing = this.lensFacing == 0 ? 1 : 0;
        bindCameraUseCases();
    }

    public CustomCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.typeFlash = 35;
        this.displayId = -1;
        this.useCameraCases = 1;
        this.lensFacing = 1;
        this.recordTime = 0L;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.luck.lib.camerax.CustomCameraView.9
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
                CustomCameraView.this.startVideoPlay(SimpleCameraX.getOutputPath(CustomCameraView.this.activity.getIntent()));
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        initView();
    }

    public CustomCameraView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.typeFlash = 35;
        this.displayId = -1;
        this.useCameraCases = 1;
        this.lensFacing = 1;
        this.recordTime = 0L;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.luck.lib.camerax.CustomCameraView.9
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
                CustomCameraView.this.startVideoPlay(SimpleCameraX.getOutputPath(CustomCameraView.this.activity.getIntent()));
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        initView();
    }
}
