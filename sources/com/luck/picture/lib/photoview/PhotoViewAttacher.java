package com.luck.picture.lib.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.camera.video.u;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoViewAttacher implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static final float DEFAULT_MAX_SCALE = 3.0f;
    private static final float DEFAULT_MID_SCALE = 1.75f;
    private static final float DEFAULT_MIN_SCALE = 1.0f;
    private static final int DEFAULT_ZOOM_DURATION = 200;
    private static final int HORIZONTAL_EDGE_BOTH = 2;
    private static final int HORIZONTAL_EDGE_LEFT = 0;
    private static final int HORIZONTAL_EDGE_NONE = -1;
    private static final int HORIZONTAL_EDGE_RIGHT = 1;
    private static final int SINGLE_TOUCH = 1;
    private static final int VERTICAL_EDGE_BOTH = 2;
    private static final int VERTICAL_EDGE_BOTTOM = 1;
    private static final int VERTICAL_EDGE_NONE = -1;
    private static final int VERTICAL_EDGE_TOP = 0;
    private float mBaseRotation;
    private FlingRunnable mCurrentFlingRunnable;
    private GestureDetector mGestureDetector;
    private final ImageView mImageView;
    private View.OnLongClickListener mLongClickListener;
    private OnMatrixChangedListener mMatrixChangeListener;
    private View.OnClickListener mOnClickListener;
    private OnViewDragListener mOnViewDragListener;
    private OnOutsidePhotoTapListener mOutsidePhotoTapListener;
    private OnPhotoTapListener mPhotoTapListener;
    private OnScaleChangedListener mScaleChangeListener;
    private CustomGestureDetector mScaleDragDetector;
    private OnSingleFlingListener mSingleFlingListener;
    private OnViewTapListener mViewTapListener;
    private final OnGestureListener onGestureListener;
    private Interpolator mInterpolator = new AccelerateDecelerateInterpolator();
    private int mZoomDuration = 200;
    private float mMinScale = 1.0f;
    private float mMidScale = DEFAULT_MID_SCALE;
    private float mMaxScale = DEFAULT_MAX_SCALE;
    private boolean mAllowParentInterceptOnEdge = true;
    private boolean mBlockParentIntercept = false;
    private final Matrix mBaseMatrix = new Matrix();
    private final Matrix mDrawMatrix = new Matrix();
    private final Matrix mSuppMatrix = new Matrix();
    private final RectF mDisplayRect = new RectF();
    private final float[] mMatrixValues = new float[9];
    private int mHorizontalScrollEdge = 2;
    private int mVerticalScrollEdge = 2;
    private boolean mZoomEnabled = true;
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: com.luck.picture.lib.photoview.PhotoViewAttacher$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class AnimatedZoomRunnable implements Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final long mStartTime = System.currentTimeMillis();
        private final float mZoomEnd;
        private final float mZoomStart;

        public AnimatedZoomRunnable(float f10, float f11, float f12, float f13) {
            this.mFocalX = f12;
            this.mFocalY = f13;
            this.mZoomStart = f10;
            this.mZoomEnd = f11;
        }

        private float interpolate() {
            return PhotoViewAttacher.this.mInterpolator.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.mStartTime) * 1.0f) / PhotoViewAttacher.this.mZoomDuration));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fInterpolate = interpolate();
            float f10 = this.mZoomStart;
            PhotoViewAttacher.this.onGestureListener.onScale(d0.e(this.mZoomEnd, f10, fInterpolate, f10) / PhotoViewAttacher.this.getScale(), this.mFocalX, this.mFocalY);
            if (fInterpolate < 1.0f) {
                Compat.postOnAnimation(PhotoViewAttacher.this.mImageView, this);
            }
        }
    }

    public class FlingRunnable implements Runnable {
        private int mCurrentX;
        private int mCurrentY;
        private final OverScroller mScroller;

        public FlingRunnable(Context context) {
            this.mScroller = new OverScroller(context);
        }

        public void cancelFling() {
            this.mScroller.forceFinished(true);
        }

        public void fling(int i7, int i10, int i11, int i12) {
            int i13;
            int iRound;
            int i14;
            int iRound2;
            RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int iRound3 = Math.round(-displayRect.left);
            float f10 = i7;
            if (f10 < displayRect.width()) {
                iRound = Math.round(displayRect.width() - f10);
                i13 = 0;
            } else {
                i13 = iRound3;
                iRound = i13;
            }
            int iRound4 = Math.round(-displayRect.top);
            float f11 = i10;
            if (f11 < displayRect.height()) {
                iRound2 = Math.round(displayRect.height() - f11);
                i14 = 0;
            } else {
                i14 = iRound4;
                iRound2 = i14;
            }
            this.mCurrentX = iRound3;
            this.mCurrentY = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.mScroller.fling(iRound3, iRound4, i11, i12, i13, iRound, i14, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                PhotoViewAttacher.this.mSuppMatrix.postTranslate(this.mCurrentX - currX, this.mCurrentY - currY);
                PhotoViewAttacher.this.checkAndDisplayMatrix();
                this.mCurrentX = currX;
                this.mCurrentY = currY;
                Compat.postOnAnimation(PhotoViewAttacher.this.mImageView, this);
            }
        }
    }

    public PhotoViewAttacher(ImageView imageView) {
        OnGestureListener onGestureListener = new OnGestureListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.1
            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onDrag(float f10, float f11) {
                if (PhotoViewAttacher.this.mScaleDragDetector.isScaling()) {
                    return;
                }
                if (PhotoViewAttacher.this.mOnViewDragListener != null) {
                    PhotoViewAttacher.this.mOnViewDragListener.onDrag(f10, f11);
                }
                PhotoViewAttacher.this.mSuppMatrix.postTranslate(f10, f11);
                PhotoViewAttacher.this.checkAndDisplayMatrix();
                ViewParent parent = PhotoViewAttacher.this.mImageView.getParent();
                if (!PhotoViewAttacher.this.mAllowParentInterceptOnEdge || PhotoViewAttacher.this.mScaleDragDetector.isScaling() || PhotoViewAttacher.this.mBlockParentIntercept) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((PhotoViewAttacher.this.mHorizontalScrollEdge == 2 || ((PhotoViewAttacher.this.mHorizontalScrollEdge == 0 && f10 >= 1.0f) || ((PhotoViewAttacher.this.mHorizontalScrollEdge == 1 && f10 <= -1.0f) || ((PhotoViewAttacher.this.mVerticalScrollEdge == 0 && f11 >= 1.0f) || (PhotoViewAttacher.this.mVerticalScrollEdge == 1 && f11 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onFling(float f10, float f11, float f12, float f13) {
                PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                photoViewAttacher.mCurrentFlingRunnable = photoViewAttacher.new FlingRunnable(photoViewAttacher.mImageView.getContext());
                FlingRunnable flingRunnable = PhotoViewAttacher.this.mCurrentFlingRunnable;
                PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                int imageViewWidth = photoViewAttacher2.getImageViewWidth(photoViewAttacher2.mImageView);
                PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                flingRunnable.fling(imageViewWidth, photoViewAttacher3.getImageViewHeight(photoViewAttacher3.mImageView), (int) f12, (int) f13);
                PhotoViewAttacher.this.mImageView.post(PhotoViewAttacher.this.mCurrentFlingRunnable);
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onScale(float f10, float f11, float f12) {
                onScale(f10, f11, f12, 0.0f, 0.0f);
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onScale(float f10, float f11, float f12, float f13, float f14) {
                if (PhotoViewAttacher.this.getScale() < PhotoViewAttacher.this.mMaxScale || f10 < 1.0f) {
                    if (PhotoViewAttacher.this.mScaleChangeListener != null) {
                        PhotoViewAttacher.this.mScaleChangeListener.onScaleChange(f10, f11, f12);
                    }
                    PhotoViewAttacher.this.mSuppMatrix.postScale(f10, f10, f11, f12);
                    PhotoViewAttacher.this.mSuppMatrix.postTranslate(f13, f14);
                    PhotoViewAttacher.this.checkAndDisplayMatrix();
                }
            }
        };
        this.onGestureListener = onGestureListener;
        this.mImageView = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.mBaseRotation = 0.0f;
        this.mScaleDragDetector = new CustomGestureDetector(imageView.getContext(), onGestureListener);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
                if (PhotoViewAttacher.this.mSingleFlingListener == null || PhotoViewAttacher.this.getScale() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                return PhotoViewAttacher.this.mSingleFlingListener.onFling(motionEvent, motionEvent2, f10, f11);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (PhotoViewAttacher.this.mLongClickListener != null) {
                    PhotoViewAttacher.this.mLongClickListener.onLongClick(PhotoViewAttacher.this.mImageView);
                }
            }
        });
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.3
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                try {
                    float scale = PhotoViewAttacher.this.getScale();
                    float x3 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    if (scale < PhotoViewAttacher.this.getMediumScale()) {
                        PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                        photoViewAttacher.setScale(photoViewAttacher.getMediumScale(), x3, y8, true);
                    } else if (scale < PhotoViewAttacher.this.getMediumScale() || scale >= PhotoViewAttacher.this.getMaximumScale()) {
                        PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                        photoViewAttacher2.setScale(photoViewAttacher2.getMinimumScale(), x3, y8, true);
                    } else {
                        PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                        photoViewAttacher3.setScale(photoViewAttacher3.getMaximumScale(), x3, y8, true);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (PhotoViewAttacher.this.mOnClickListener != null) {
                    PhotoViewAttacher.this.mOnClickListener.onClick(PhotoViewAttacher.this.mImageView);
                }
                RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
                float x3 = motionEvent.getX();
                float y8 = motionEvent.getY();
                if (PhotoViewAttacher.this.mViewTapListener != null) {
                    PhotoViewAttacher.this.mViewTapListener.onViewTap(PhotoViewAttacher.this.mImageView, x3, y8);
                }
                if (displayRect == null) {
                    return false;
                }
                if (!displayRect.contains(x3, y8)) {
                    if (PhotoViewAttacher.this.mOutsidePhotoTapListener == null) {
                        return false;
                    }
                    PhotoViewAttacher.this.mOutsidePhotoTapListener.onOutsidePhotoTap(PhotoViewAttacher.this.mImageView);
                    return false;
                }
                float fWidth = (x3 - displayRect.left) / displayRect.width();
                float fHeight = (y8 - displayRect.top) / displayRect.height();
                if (PhotoViewAttacher.this.mPhotoTapListener == null) {
                    return true;
                }
                PhotoViewAttacher.this.mPhotoTapListener.onPhotoTap(PhotoViewAttacher.this.mImageView, fWidth, fHeight);
                return true;
            }
        });
    }

    private void cancelFling() {
        FlingRunnable flingRunnable = this.mCurrentFlingRunnable;
        if (flingRunnable != null) {
            flingRunnable.cancelFling();
            this.mCurrentFlingRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private boolean checkMatrixBounds() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF displayRect = getDisplayRect(getDrawMatrix());
        if (displayRect == null) {
            return false;
        }
        float fHeight = displayRect.height();
        float fWidth = displayRect.width();
        float imageViewHeight = getImageViewHeight(this.mImageView);
        float f15 = 0.0f;
        if (fHeight <= imageViewHeight) {
            int i7 = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i7 != 2) {
                if (i7 != 3) {
                    f13 = (imageViewHeight - fHeight) / 2.0f;
                    f14 = displayRect.top;
                } else {
                    f13 = imageViewHeight - fHeight;
                    f14 = displayRect.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -displayRect.top;
            }
            this.mVerticalScrollEdge = 2;
        } else {
            float f16 = displayRect.top;
            if (f16 > 0.0f) {
                this.mVerticalScrollEdge = 0;
                f10 = -f16;
            } else {
                float f17 = displayRect.bottom;
                if (f17 < imageViewHeight) {
                    this.mVerticalScrollEdge = 1;
                    f10 = imageViewHeight - f17;
                } else {
                    this.mVerticalScrollEdge = -1;
                    f10 = 0.0f;
                }
            }
        }
        float imageViewWidth = getImageViewWidth(this.mImageView);
        if (fWidth <= imageViewWidth) {
            int i10 = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f11 = (imageViewWidth - fWidth) / 2.0f;
                    f12 = displayRect.left;
                } else {
                    f11 = imageViewWidth - fWidth;
                    f12 = displayRect.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -displayRect.left;
            }
            this.mHorizontalScrollEdge = 2;
        } else {
            float f18 = displayRect.left;
            if (f18 > 0.0f) {
                this.mHorizontalScrollEdge = 0;
                f15 = -f18;
            } else {
                float f19 = displayRect.right;
                if (f19 < imageViewWidth) {
                    f15 = imageViewWidth - f19;
                    this.mHorizontalScrollEdge = 1;
                } else {
                    this.mHorizontalScrollEdge = -1;
                }
            }
        }
        this.mSuppMatrix.postTranslate(f15, f10);
        return true;
    }

    private Matrix getDrawMatrix() {
        this.mDrawMatrix.set(this.mBaseMatrix);
        this.mDrawMatrix.postConcat(this.mSuppMatrix);
        return this.mDrawMatrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewHeight(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewWidth(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float getValue(Matrix matrix, int i7) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i7];
    }

    private void resetMatrix() {
        this.mSuppMatrix.reset();
        setRotationBy(this.mBaseRotation);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    private void setImageViewMatrix(Matrix matrix) {
        RectF displayRect;
        this.mImageView.setImageMatrix(matrix);
        if (this.mMatrixChangeListener == null || (displayRect = getDisplayRect(matrix)) == null) {
            return;
        }
        this.mMatrixChangeListener.onMatrixChanged(displayRect);
    }

    private void updateBaseMatrix(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float imageViewWidth = getImageViewWidth(this.mImageView);
        float imageViewHeight = getImageViewHeight(this.mImageView);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.mBaseMatrix.reset();
        float f10 = intrinsicWidth;
        float f11 = imageViewWidth / f10;
        float f12 = intrinsicHeight;
        float f13 = imageViewHeight / f12;
        ImageView.ScaleType scaleType = this.mScaleType;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.mBaseMatrix.postTranslate((imageViewWidth - f10) / 2.0f, (imageViewHeight - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.mBaseMatrix.postScale(fMax, fMax);
            this.mBaseMatrix.postTranslate(u.a(f10, fMax, imageViewWidth, 2.0f), u.a(f12, fMax, imageViewHeight, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.mBaseMatrix.postScale(fMin, fMin);
            this.mBaseMatrix.postTranslate(u.a(f10, fMin, imageViewWidth, 2.0f), u.a(f12, fMin, imageViewHeight, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, imageViewWidth, imageViewHeight);
            if (((int) this.mBaseRotation) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i7 = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i7 == 1) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i7 == 2) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i7 == 3) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i7 == 4) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        resetMatrix();
    }

    public void getDisplayMatrix(Matrix matrix) {
        matrix.set(getDrawMatrix());
    }

    public RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    public Matrix getImageMatrix() {
        return this.mDrawMatrix;
    }

    public float getMaximumScale() {
        return this.mMaxScale;
    }

    public float getMediumScale() {
        return this.mMidScale;
    }

    public float getMinimumScale() {
        return this.mMinScale;
    }

    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(getValue(this.mSuppMatrix, 0), 2.0d)) + ((float) Math.pow(getValue(this.mSuppMatrix, 3), 2.0d)));
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public void getSuppMatrix(Matrix matrix) {
        matrix.set(this.mSuppMatrix);
    }

    @Deprecated
    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public boolean isZoomable() {
        return this.mZoomEnabled;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i7 == i13 && i10 == i14 && i11 == i15 && i12 == i16) {
            return;
        }
        updateBaseMatrix(this.mImageView.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        CustomGestureDetector customGestureDetector;
        GestureDetector gestureDetector;
        boolean zIsScaling;
        boolean zIsDragging;
        boolean z8;
        boolean z10;
        RectF displayRect;
        boolean z11 = false;
        if (!this.mZoomEnabled || !Util.hasDrawable((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (getScale() < this.mMinScale) {
                    RectF displayRect2 = getDisplayRect();
                    if (displayRect2 != null) {
                        view.post(new AnimatedZoomRunnable(getScale(), this.mMinScale, displayRect2.centerX(), displayRect2.centerY()));
                        z3 = true;
                    }
                } else if (getScale() > this.mMaxScale && (displayRect = getDisplayRect()) != null) {
                    view.post(new AnimatedZoomRunnable(getScale(), this.mMaxScale, displayRect.centerX(), displayRect.centerY()));
                    z3 = true;
                }
            }
            customGestureDetector = this.mScaleDragDetector;
            if (customGestureDetector != null) {
                zIsScaling = customGestureDetector.isScaling();
                zIsDragging = this.mScaleDragDetector.isDragging();
                boolean zOnTouchEvent = this.mScaleDragDetector.onTouchEvent(motionEvent);
                if (!zIsScaling || this.mScaleDragDetector.isScaling()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!zIsDragging || this.mScaleDragDetector.isDragging()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z8 && z10) {
                    z11 = true;
                }
                this.mBlockParentIntercept = z11;
                z3 = zOnTouchEvent;
            }
            gestureDetector = this.mGestureDetector;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z3;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        cancelFling();
        z3 = false;
        customGestureDetector = this.mScaleDragDetector;
        if (customGestureDetector != null) {
            zIsScaling = customGestureDetector.isScaling();
            zIsDragging = this.mScaleDragDetector.isDragging();
            boolean zOnTouchEvent2 = this.mScaleDragDetector.onTouchEvent(motionEvent);
            if (zIsScaling) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (zIsDragging) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z8) {
                z11 = true;
            }
            this.mBlockParentIntercept = z11;
            z3 = zOnTouchEvent2;
        }
        gestureDetector = this.mGestureDetector;
        if (gestureDetector == null) {
        }
        return z3;
    }

    public void setAllowParentInterceptOnEdge(boolean z3) {
        this.mAllowParentInterceptOnEdge = z3;
    }

    public void setBaseRotation(float f10) {
        this.mBaseRotation = f10 % 360.0f;
        update();
        setRotationBy(this.mBaseRotation);
        checkAndDisplayMatrix();
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if (this.mImageView.getDrawable() == null) {
            return false;
        }
        this.mSuppMatrix.set(matrix);
        checkAndDisplayMatrix();
        return true;
    }

    public void setMaximumScale(float f10) {
        Util.checkZoomLevels(this.mMinScale, this.mMidScale, f10);
        this.mMaxScale = f10;
    }

    public void setMediumScale(float f10) {
        Util.checkZoomLevels(this.mMinScale, f10, this.mMaxScale);
        this.mMidScale = f10;
    }

    public void setMinimumScale(float f10) {
        Util.checkZoomLevels(f10, this.mMidScale, this.mMaxScale);
        this.mMinScale = f10;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.mMatrixChangeListener = onMatrixChangedListener;
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.mOutsidePhotoTapListener = onOutsidePhotoTapListener;
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.mPhotoTapListener = onPhotoTapListener;
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.mScaleChangeListener = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.mSingleFlingListener = onSingleFlingListener;
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.mOnViewDragListener = onViewDragListener;
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.mViewTapListener = onViewTapListener;
    }

    public void setRotationBy(float f10) {
        this.mSuppMatrix.postRotate(f10 % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setRotationTo(float f10) {
        this.mSuppMatrix.setRotate(f10 % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setScale(float f10) {
        setScale(f10, false);
    }

    public void setScaleLevels(float f10, float f11, float f12) {
        Util.checkZoomLevels(f10, f11, f12);
        this.mMinScale = f10;
        this.mMidScale = f11;
        this.mMaxScale = f12;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!Util.isSupportedScaleType(scaleType) || scaleType == this.mScaleType) {
            return;
        }
        this.mScaleType = scaleType;
        update();
    }

    public void setZoomInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setZoomTransitionDuration(int i7) {
        this.mZoomDuration = i7;
    }

    public void setZoomable(boolean z3) {
        this.mZoomEnabled = z3;
        update();
    }

    public void update() {
        if (this.mZoomEnabled) {
            updateBaseMatrix(this.mImageView.getDrawable());
        } else {
            resetMatrix();
        }
    }

    public void setScale(float f10, boolean z3) {
        setScale(f10, this.mImageView.getRight() / 2, this.mImageView.getBottom() / 2, z3);
    }

    private RectF getDisplayRect(Matrix matrix) {
        Drawable drawable = this.mImageView.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.mDisplayRect.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.mDisplayRect);
        return this.mDisplayRect;
    }

    public void setScale(float f10, float f11, float f12, boolean z3) {
        if (f10 < this.mMinScale || f10 > this.mMaxScale) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z3) {
            this.mImageView.post(new AnimatedZoomRunnable(getScale(), f10, f11, f12));
        } else {
            this.mSuppMatrix.setScale(f10, f10, f11, f12);
            checkAndDisplayMatrix();
        }
    }
}
