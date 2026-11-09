package com.luck.lib.camerax.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.luck.lib.camerax.CustomCameraConfig;
import com.luck.lib.camerax.listener.CaptureListener;
import com.luck.lib.camerax.listener.IObtainCameraView;
import com.luck.lib.camerax.listener.OnSimpleXPermissionDescriptionListener;
import com.luck.lib.camerax.permissions.PermissionChecker;
import com.luck.lib.camerax.permissions.PermissionResultCallback;
import com.luck.lib.camerax.permissions.SimpleXPermissionUtil;
import com.luck.lib.camerax.utils.DoubleUtils;
import com.luck.lib.camerax.utils.SimpleXSpUtils;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
public class CaptureButton extends View {
    public static final int STATE_BAN = 5;
    public static final int STATE_IDLE = 1;
    public static final int STATE_LONG_PRESS = 3;
    public static final int STATE_PRESS = 2;
    public static final int STATE_RECORDER_ING = 4;
    private final Activity activity;
    private int buttonState;
    private float button_inside_radius;
    private float button_outside_radius;
    private float button_radius;
    private int button_size;
    private CaptureListener captureListener;
    private float center_X;
    private float center_Y;
    private int currentRecordedTime;
    private float event_Y;
    private int inside_reduce_size;
    private boolean isTakeCamera;
    private LongPressRunnable longPressRunnable;
    private Paint mPaint;
    private int maxDuration;
    private int minDuration;
    private int outside_add_size;
    private float progress;
    private int progressColor;
    private RectF rectF;
    private int state;
    private float strokeWidth;
    private RecordCountDownTimer timer;

    public class LongPressRunnable implements Runnable {
        private LongPressRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CaptureButton.this.state = 3;
            if (PermissionChecker.checkSelfPermission(CaptureButton.this.getContext(), new String[]{"android.permission.RECORD_AUDIO"})) {
                CaptureButton captureButton = CaptureButton.this;
                captureButton.startRecordAnimation(captureButton.button_outside_radius, CaptureButton.this.button_outside_radius + CaptureButton.this.outside_add_size, CaptureButton.this.button_inside_radius, CaptureButton.this.button_inside_radius - CaptureButton.this.inside_reduce_size);
            } else {
                CaptureButton.this.onExplainCallback();
                CaptureButton.this.handlerPressByState();
                PermissionChecker.getInstance().requestPermissions(CaptureButton.this.activity, new String[]{"android.permission.RECORD_AUDIO"}, new PermissionResultCallback() { // from class: com.luck.lib.camerax.widget.CaptureButton.LongPressRunnable.1
                    @Override // com.luck.lib.camerax.permissions.PermissionResultCallback
                    public void onDenied() {
                        OnSimpleXPermissionDescriptionListener onSimpleXPermissionDescriptionListener;
                        if (CustomCameraConfig.deniedListener == null) {
                            SimpleXPermissionUtil.goIntentSetting(CaptureButton.this.activity, PermissionChecker.PERMISSION_RECORD_AUDIO_SETTING_CODE);
                            return;
                        }
                        SimpleXSpUtils.putBoolean(CaptureButton.this.getContext(), "android.permission.RECORD_AUDIO", true);
                        CustomCameraConfig.deniedListener.onDenied(CaptureButton.this.getContext(), "android.permission.RECORD_AUDIO", PermissionChecker.PERMISSION_RECORD_AUDIO_SETTING_CODE);
                        ViewGroup customCameraView = CaptureButton.this.getCustomCameraView();
                        if (customCameraView == null || (onSimpleXPermissionDescriptionListener = CustomCameraConfig.explainListener) == null) {
                            return;
                        }
                        onSimpleXPermissionDescriptionListener.onDismiss(customCameraView);
                    }

                    @Override // com.luck.lib.camerax.permissions.PermissionResultCallback
                    public void onGranted() {
                        OnSimpleXPermissionDescriptionListener onSimpleXPermissionDescriptionListener;
                        CaptureButton captureButton2 = CaptureButton.this;
                        captureButton2.postDelayed(captureButton2.longPressRunnable, 500L);
                        ViewGroup customCameraView = CaptureButton.this.getCustomCameraView();
                        if (customCameraView == null || (onSimpleXPermissionDescriptionListener = CustomCameraConfig.explainListener) == null) {
                            return;
                        }
                        onSimpleXPermissionDescriptionListener.onDismiss(customCameraView);
                    }
                });
            }
        }
    }

    public class RecordCountDownTimer extends CountDownTimer {
        public RecordCountDownTimer(long j6, long j10) {
            super(j6, j10);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CaptureButton.this.recordEnd();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j6) {
            CaptureButton.this.updateProgress(j6);
        }
    }

    public CaptureButton(Context context) {
        super(context);
        this.progressColor = -300503530;
        this.isTakeCamera = true;
        this.activity = (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getCustomCameraView() {
        ComponentCallbacks2 componentCallbacks2 = this.activity;
        if (componentCallbacks2 instanceof IObtainCameraView) {
            return ((IObtainCameraView) componentCallbacks2).getCustomCameraView();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerPressByState() {
        int i7;
        removeCallbacks(this.longPressRunnable);
        int i10 = this.state;
        if (i10 != 2) {
            if ((i10 == 3 || i10 == 4) && PermissionChecker.checkSelfPermission(getContext(), new String[]{"android.permission.RECORD_AUDIO"})) {
                this.timer.cancel();
                recordEnd();
            }
        } else if (this.captureListener == null || !((i7 = this.buttonState) == 1 || i7 == 0)) {
            this.state = 1;
        } else {
            startCaptureAnimation(this.button_inside_radius);
        }
        this.state = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCaptureAnimation$0(ValueAnimator valueAnimator) {
        this.button_inside_radius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecordAnimation$1(ValueAnimator valueAnimator) {
        this.button_outside_radius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecordAnimation$2(ValueAnimator valueAnimator) {
        this.button_inside_radius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExplainCallback() {
        ViewGroup customCameraView;
        if (CustomCameraConfig.explainListener == null || SimpleXSpUtils.getBoolean(getContext(), "android.permission.RECORD_AUDIO", false) || (customCameraView = getCustomCameraView()) == null) {
            return;
        }
        CustomCameraConfig.explainListener.onPermissionDescription(getContext(), customCameraView, "android.permission.RECORD_AUDIO");
    }

    private void resetRecordAnim() {
        this.state = 5;
        this.progress = 0.0f;
        invalidate();
        float f10 = this.button_outside_radius;
        float f11 = this.button_radius;
        startRecordAnimation(f10, f11, this.button_inside_radius, 0.75f * f11);
    }

    private void startCaptureAnimation(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.75f * f10, f10);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 2));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.luck.lib.camerax.widget.CaptureButton.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (CaptureButton.this.captureListener != null) {
                    CaptureButton.this.captureListener.takePictures();
                }
                CaptureButton.this.state = 5;
            }
        });
        valueAnimatorOfFloat.setDuration(50L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRecordAnimation(float f10, float f11, float f12, float f13) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f12, f13);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 0));
        valueAnimatorOfFloat2.addUpdateListener(new a(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.luck.lib.camerax.widget.CaptureButton.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (DoubleUtils.isFastDoubleClick()) {
                    return;
                }
                if (CaptureButton.this.state != 3) {
                    CaptureButton.this.state = 1;
                    return;
                }
                if (CaptureButton.this.captureListener != null) {
                    CaptureButton.this.captureListener.recordStart();
                }
                CaptureButton.this.state = 4;
                CaptureButton.this.timer.start();
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(100L);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress(long j6) {
        int i7 = this.maxDuration;
        this.currentRecordedTime = (int) (((long) i7) - j6);
        this.progress = 360.0f - ((j6 / i7) * 360.0f);
        invalidate();
        CaptureListener captureListener = this.captureListener;
        if (captureListener != null) {
            captureListener.changeTime(j6);
        }
    }

    public int getButtonFeatures() {
        return this.buttonState;
    }

    public boolean isIdle() {
        return this.state == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(-287515428);
        canvas.drawCircle(this.center_X, this.center_Y, this.button_outside_radius, this.mPaint);
        this.mPaint.setColor(-1);
        canvas.drawCircle(this.center_X, this.center_Y, this.button_inside_radius, this.mPaint);
        if (this.state == 4) {
            this.mPaint.setColor(this.progressColor);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setStrokeWidth(this.strokeWidth);
            canvas.drawArc(this.rectF, -90.0f, this.progress, false, this.mPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int i11 = this.button_size;
        int i12 = this.outside_add_size;
        setMeasuredDimension((i12 * 2) + i11, (i12 * 2) + i11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CaptureListener captureListener;
        int i7;
        if (this.isTakeCamera) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    handlerPressByState();
                } else if (action == 2 && (captureListener = this.captureListener) != null && this.state == 4 && ((i7 = this.buttonState) == 2 || i7 == 0)) {
                    captureListener.recordZoom(this.event_Y - motionEvent.getY());
                }
            } else if (motionEvent.getPointerCount() <= 1 && this.state == 1) {
                this.event_Y = motionEvent.getY();
                this.state = 2;
                if (this.buttonState != 1) {
                    postDelayed(this.longPressRunnable, 500L);
                }
            }
        }
        return true;
    }

    public void recordEnd() {
        CaptureListener captureListener = this.captureListener;
        if (captureListener != null) {
            int i7 = this.currentRecordedTime;
            if (i7 < this.minDuration) {
                captureListener.recordShort(i7);
            } else {
                captureListener.recordEnd(i7);
            }
        }
        resetRecordAnim();
    }

    public void resetState() {
        this.state = 1;
    }

    public void setButtonCaptureEnabled(boolean z3) {
        this.isTakeCamera = z3;
    }

    public void setButtonFeatures(int i7) {
        this.buttonState = i7;
    }

    public void setCaptureListener(CaptureListener captureListener) {
        this.captureListener = captureListener;
    }

    public void setMaxDuration(int i7) {
        this.maxDuration = i7;
        int i10 = this.maxDuration;
        this.timer = new RecordCountDownTimer(i10, i10 / MessageEvent.EVENT_CL_REPAYMENT_FAILED);
    }

    public void setMinDuration(int i7) {
        this.minDuration = i7;
    }

    public void setProgressColor(int i7) {
        this.progressColor = i7;
    }

    public CaptureButton(Context context, int i7) {
        super(context);
        this.progressColor = -300503530;
        this.isTakeCamera = true;
        this.activity = (Activity) context;
        this.button_size = i7;
        float f10 = i7 / 2.0f;
        this.button_radius = f10;
        this.button_outside_radius = f10;
        this.button_inside_radius = f10 * 0.75f;
        this.strokeWidth = i7 / 15;
        int i10 = i7 / 8;
        this.outside_add_size = i10;
        this.inside_reduce_size = i10;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.progress = 0.0f;
        this.longPressRunnable = new LongPressRunnable();
        this.state = 1;
        this.buttonState = 0;
        this.maxDuration = CustomCameraConfig.DEFAULT_MAX_RECORD_VIDEO;
        this.minDuration = 1500;
        int i11 = this.button_size;
        int i12 = this.outside_add_size;
        this.center_X = ((i12 * 2) + i11) / 2;
        this.center_Y = ((i12 * 2) + i11) / 2;
        float f11 = this.center_X;
        float f12 = this.button_radius;
        int i13 = this.outside_add_size;
        float f13 = this.strokeWidth;
        float f14 = this.center_Y;
        this.rectF = new RectF(f11 - ((i13 + f12) - (f13 / 2.0f)), f14 - ((i13 + f12) - (f13 / 2.0f)), ((i13 + f12) - (f13 / 2.0f)) + f11, ((f12 + i13) - (f13 / 2.0f)) + f14);
        int i14 = this.maxDuration;
        this.timer = new RecordCountDownTimer(i14, i14 / MessageEvent.EVENT_CL_REPAYMENT_FAILED);
    }
}
