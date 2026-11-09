package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AbstractC0841t;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.n1;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.X;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.SelectedStateListDrawable;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class UCropFragment extends Fragment {
    public static final int ALL = 3;
    private static final long CONTROLS_ANIMATION_DURATION = 50;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final int ROTATE_WIDGET_SENSITIVITY_COEFFICIENT = 42;
    public static final int SCALE = 1;
    private static final int SCALE_WIDGET_SENSITIVITY_COEFFICIENT = 15000;
    private static final int TABS_COUNT = 3;
    private UCropFragmentCallback callback;
    private boolean isUseCustomBitmap;
    private int mActiveControlsWidgetColor;
    private View mBlockingView;
    private Transition mControlsTransition;
    private GestureCropImageView mGestureCropImageView;
    private ViewGroup mLayoutAspectRatio;
    private ViewGroup mLayoutRotate;
    private ViewGroup mLayoutScale;
    private int mLogoColor;
    private OverlayView mOverlayView;

    @ColorInt
    private int mRootViewBackgroundColor;
    private boolean mShowBottomControls;
    private TextView mTextViewRotateAngle;
    private TextView mTextViewScalePercent;
    private UCropView mUCropView;
    private ViewGroup mWrapperStateAspectRatio;
    private ViewGroup mWrapperStateRotate;
    private ViewGroup mWrapperStateScale;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    public static final String TAG = "UCropFragment";
    private final List<ViewGroup> mCropAspectRatioViews = new ArrayList();
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = 90;
    private int[] mAllowedGestures = {1, 2, 3};
    private final TransformImageView.TransformImageListener mImageListener = new TransformImageView.TransformImageListener() { // from class: com.yalantis.ucrop.UCropFragment.1
        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadComplete() {
            UCropFragment.this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropFragment.this.mBlockingView.setClickable(false);
            UCropFragment.this.callback.loadingProgress(false);
            if (UCropFragment.this.getArguments().getBoolean(UCrop.Options.EXTRA_CROP_FORBID_GIF_WEBP, false)) {
                String mimeTypeFromMediaContentUri = FileUtils.getMimeTypeFromMediaContentUri(UCropFragment.this.getContext(), (Uri) UCropFragment.this.getArguments().getParcelable(UCrop.EXTRA_INPUT_URI));
                if (FileUtils.isGif(mimeTypeFromMediaContentUri) || FileUtils.isWebp(mimeTypeFromMediaContentUri)) {
                    UCropFragment.this.mBlockingView.setClickable(true);
                }
            }
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadFailure(@NonNull Exception exc) {
            UCropFragment.this.callback.onCropFinish(UCropFragment.this.getError(exc));
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onRotate(float f10) {
            UCropFragment.this.setAngleText(f10);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onScale(float f10) {
            UCropFragment.this.setScaleText(f10);
        }
    };
    private final View.OnClickListener mStateClickListener = new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.7
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropFragment.this.setWidgetState(view.getId());
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    public static class UCropResult {
        public int mResultCode;
        public Intent mResultData;

        public UCropResult(int i7, Intent intent) {
            this.mResultCode = i7;
            this.mResultData = intent;
        }
    }

    static {
        r rVar = AbstractC0841t.f12314a;
        int i7 = n1.f12981a;
    }

    private void addBlockingView(View view) {
        if (this.mBlockingView == null) {
            this.mBlockingView = new View(getContext());
            this.mBlockingView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.mBlockingView.setClickable(true);
        }
        ((RelativeLayout) view.findViewById(R.id.ucrop_photobox)).addView(this.mBlockingView);
    }

    private void changeSelectedTab(int i7) {
        if (getView() != null) {
            X.a((ViewGroup) getView().findViewById(R.id.ucrop_photobox), this.mControlsTransition);
        }
        this.mWrapperStateScale.findViewById(R.id.text_view_scale).setVisibility(i7 == R.id.state_scale ? 0 : 8);
        this.mWrapperStateAspectRatio.findViewById(R.id.text_view_crop).setVisibility(i7 == R.id.state_aspect_ratio ? 0 : 8);
        this.mWrapperStateRotate.findViewById(R.id.text_view_rotate).setVisibility(i7 == R.id.state_rotate ? 0 : 8);
    }

    private void initiateRootViews(View view) {
        UCropView uCropView = (UCropView) view.findViewById(R.id.ucrop);
        this.mUCropView = uCropView;
        this.mGestureCropImageView = uCropView.getCropImageView();
        this.mOverlayView = this.mUCropView.getOverlayView();
        this.mGestureCropImageView.setTransformImageListener(this.mImageListener);
        ((ImageView) view.findViewById(R.id.image_view_logo)).setColorFilter(this.mLogoColor, PorterDuff.Mode.SRC_ATOP);
        view.findViewById(R.id.ucrop_frame).setBackgroundColor(this.mRootViewBackgroundColor);
    }

    public static UCropFragment newInstance(Bundle bundle) {
        UCropFragment uCropFragment = new UCropFragment();
        uCropFragment.setArguments(bundle);
        return uCropFragment;
    }

    private void processOptions(@NonNull Bundle bundle) {
        String string = bundle.getString(UCrop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(string) ? Bitmap.CompressFormat.valueOf(string) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = compressFormatValueOf;
        this.mCompressQuality = bundle.getInt(UCrop.Options.EXTRA_COMPRESSION_QUALITY, 90);
        this.isUseCustomBitmap = bundle.getBoolean(UCrop.Options.EXTRA_CROP_CUSTOM_LOADER_BITMAP, false);
        int[] intArray = bundle.getIntArray(UCrop.Options.EXTRA_ALLOWED_GESTURES);
        if (intArray != null && intArray.length == 3) {
            this.mAllowedGestures = intArray;
        }
        this.mGestureCropImageView.setMaxBitmapSize(bundle.getInt(UCrop.Options.EXTRA_MAX_BITMAP_SIZE, 0));
        this.mGestureCropImageView.setMaxScaleMultiplier(bundle.getFloat(UCrop.Options.EXTRA_MAX_SCALE_MULTIPLIER, 10.0f));
        this.mGestureCropImageView.setImageToWrapCropBoundsAnimDuration(bundle.getInt(UCrop.Options.EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 500));
        this.mOverlayView.setFreestyleCropEnabled(bundle.getBoolean(UCrop.Options.EXTRA_FREE_STYLE_CROP, false));
        this.mOverlayView.setDragSmoothToCenter(bundle.getBoolean(UCrop.Options.EXTRA_CROP_DRAG_CENTER, false));
        this.mOverlayView.setDimmedColor(bundle.getInt(UCrop.Options.EXTRA_DIMMED_LAYER_COLOR, getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.mOverlayView.setCircleStrokeColor(bundle.getInt(UCrop.Options.EXTRA_CIRCLE_STROKE_COLOR, getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.mOverlayView.setCircleDimmedLayer(bundle.getBoolean(UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false));
        this.mOverlayView.setShowCropFrame(bundle.getBoolean(UCrop.Options.EXTRA_SHOW_CROP_FRAME, true));
        this.mOverlayView.setCropFrameColor(bundle.getInt(UCrop.Options.EXTRA_CROP_FRAME_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.mOverlayView.setCropFrameStrokeWidth(bundle.getInt(UCrop.Options.EXTRA_CROP_FRAME_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.mOverlayView.setShowCropGrid(bundle.getBoolean(UCrop.Options.EXTRA_SHOW_CROP_GRID, true));
        this.mOverlayView.setCropGridRowCount(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_ROW_COUNT, 2));
        this.mOverlayView.setCropGridColumnCount(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_COLUMN_COUNT, 2));
        this.mOverlayView.setCropGridColor(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.mOverlayView.setCropGridStrokeWidth(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
        this.mOverlayView.setDimmedStrokeWidth(bundle.getInt(UCrop.Options.EXTRA_CIRCLE_STROKE_WIDTH_LAYER, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
        float f10 = bundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_X, -1.0f);
        float f11 = bundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_Y, -1.0f);
        int i7 = bundle.getInt(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (f10 >= 0.0f && f11 >= 0.0f) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f12 = f10 / f11;
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(f12) ? 0.0f : f12);
        } else if (parcelableArrayList == null || i7 >= parcelableArrayList.size()) {
            this.mGestureCropImageView.setTargetAspectRatio(0.0f);
        } else {
            float aspectRatioX = ((AspectRatio) parcelableArrayList.get(i7)).getAspectRatioX() / ((AspectRatio) parcelableArrayList.get(i7)).getAspectRatioY();
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
        }
        int i10 = bundle.getInt(UCrop.EXTRA_MAX_SIZE_X, 0);
        int i11 = bundle.getInt(UCrop.EXTRA_MAX_SIZE_Y, 0);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.mGestureCropImageView.setMaxResultImageSizeX(i10);
        this.mGestureCropImageView.setMaxResultImageSizeY(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetRotation() {
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rotateByAngle(int i7) {
        this.mGestureCropImageView.postRotate(i7);
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    private void setAllowedGestures(int i7) {
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        int i10 = this.mAllowedGestures[i7];
        gestureCropImageView.setScaleEnabled(i10 == 3 || i10 == 1);
        GestureCropImageView gestureCropImageView2 = this.mGestureCropImageView;
        int i11 = this.mAllowedGestures[i7];
        gestureCropImageView2.setRotateEnabled(i11 == 3 || i11 == 2);
        this.mGestureCropImageView.setGestureEnabled(getArguments().getBoolean(UCrop.Options.EXTRA_DRAG_IMAGES, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleText(float f10) {
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
        }
    }

    private void setAngleTextColor(int i7) {
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setTextColor(i7);
        }
    }

    private void setImageData(@NonNull Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(UCrop.EXTRA_INPUT_URI);
        Uri uri2 = (Uri) bundle.getParcelable("com.yalantis.ucrop.OutputUri");
        processOptions(bundle);
        if (uri == null || uri2 == null) {
            this.callback.onCropFinish(getError(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent))));
            return;
        }
        try {
            this.mGestureCropImageView.setImageUri(uri, FileUtils.replaceOutputUri(getContext(), bundle.getBoolean(UCrop.Options.EXTRA_CROP_FORBID_GIF_WEBP, false), uri, uri2), this.isUseCustomBitmap);
        } catch (Exception e10) {
            this.callback.onCropFinish(getError(e10));
        }
    }

    private void setInitialState() {
        if (!this.mShowBottomControls) {
            setAllowedGestures(0);
        } else if (this.mWrapperStateAspectRatio.getVisibility() == 0) {
            setWidgetState(R.id.state_aspect_ratio);
        } else {
            setWidgetState(R.id.state_scale);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleText(float f10) {
        TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    private void setScaleTextColor(int i7) {
        TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setTextColor(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetState(@IdRes int i7) {
        if (this.mShowBottomControls) {
            this.mWrapperStateAspectRatio.setSelected(i7 == R.id.state_aspect_ratio);
            this.mWrapperStateRotate.setSelected(i7 == R.id.state_rotate);
            this.mWrapperStateScale.setSelected(i7 == R.id.state_scale);
            this.mLayoutAspectRatio.setVisibility(i7 == R.id.state_aspect_ratio ? 0 : 8);
            this.mLayoutRotate.setVisibility(i7 == R.id.state_rotate ? 0 : 8);
            this.mLayoutScale.setVisibility(i7 == R.id.state_scale ? 0 : 8);
            changeSelectedTab(i7);
            if (i7 == R.id.state_scale) {
                setAllowedGestures(0);
            } else if (i7 == R.id.state_rotate) {
                setAllowedGestures(1);
            } else {
                setAllowedGestures(2);
            }
        }
    }

    private void setupAspectRatioWidget(@NonNull Bundle bundle, View view) {
        int i7 = bundle.getInt(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList<AspectRatio> parcelableArrayList = bundle.getParcelableArrayList(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            parcelableArrayList = new ArrayList();
            parcelableArrayList.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayList.add(new AspectRatio(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayList.add(new AspectRatio(null, 16.0f, 9.0f));
            i7 = 2;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (AspectRatio aspectRatio : parcelableArrayList) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.mActiveControlsWidgetColor);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.mCropAspectRatioViews.add(frameLayout);
        }
        this.mCropAspectRatioViews.get(i7).setSelected(true);
        Iterator<ViewGroup> it = this.mCropAspectRatioViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    UCropFragment.this.mGestureCropImageView.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view2).getChildAt(0)).getAspectRatio(view2.isSelected()));
                    UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
                    if (view2.isSelected()) {
                        return;
                    }
                    for (ViewGroup viewGroup : UCropFragment.this.mCropAspectRatioViews) {
                        viewGroup.setSelected(viewGroup == view2);
                    }
                }
            });
        }
    }

    private void setupRotateWidget(View view) {
        this.mTextViewRotateAngle = (TextView) view.findViewById(R.id.text_view_rotate);
        ((HorizontalProgressWheelView) view.findViewById(R.id.rotate_scroll_wheel)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropFragment.3
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f10, float f11) {
                UCropFragment.this.mGestureCropImageView.postRotate(f10 / 42.0f);
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) view.findViewById(R.id.rotate_scroll_wheel)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        view.findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                UCropFragment.this.resetRotation();
            }
        });
        view.findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                UCropFragment.this.rotateByAngle(90);
            }
        });
        setAngleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupScaleWidget(View view) {
        this.mTextViewScalePercent = (TextView) view.findViewById(R.id.text_view_scale);
        ((HorizontalProgressWheelView) view.findViewById(R.id.scale_scroll_wheel)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropFragment.6
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f10, float f11) {
                if (f10 > 0.0f) {
                    UCropFragment.this.mGestureCropImageView.zoomInImage((((UCropFragment.this.mGestureCropImageView.getMaxScale() - UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f) * f10) + UCropFragment.this.mGestureCropImageView.getCurrentScale());
                } else {
                    UCropFragment.this.mGestureCropImageView.zoomOutImage((((UCropFragment.this.mGestureCropImageView.getMaxScale() - UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f) * f10) + UCropFragment.this.mGestureCropImageView.getCurrentScale());
                }
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) view.findViewById(R.id.scale_scroll_wheel)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        setScaleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupStatesWrapper(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view_state_scale);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new SelectedStateListDrawable(imageView.getDrawable(), this.mActiveControlsWidgetColor));
        imageView2.setImageDrawable(new SelectedStateListDrawable(imageView2.getDrawable(), this.mActiveControlsWidgetColor));
        imageView3.setImageDrawable(new SelectedStateListDrawable(imageView3.getDrawable(), this.mActiveControlsWidgetColor));
    }

    public void cropAndSaveImage() {
        this.mBlockingView.setClickable(true);
        this.callback.loadingProgress(true);
        this.mGestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new BitmapCropCallback() { // from class: com.yalantis.ucrop.UCropFragment.8
            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onBitmapCropped(@NonNull Uri uri, int i7, int i10, int i11, int i12) {
                UCropFragmentCallback uCropFragmentCallback = UCropFragment.this.callback;
                UCropFragment uCropFragment = UCropFragment.this;
                uCropFragmentCallback.onCropFinish(uCropFragment.getResult(uri, uCropFragment.mGestureCropImageView.getTargetAspectRatio(), i7, i10, i11, i12));
                UCropFragment.this.callback.loadingProgress(false);
            }

            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onCropFailure(@NonNull Throwable th) {
                UCropFragment.this.callback.onCropFinish(UCropFragment.this.getError(th));
            }
        });
    }

    public void fragmentReVisible() {
        setImageData(getArguments());
        this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
        boolean z3 = false;
        this.callback.loadingProgress(false);
        if (getArguments().getBoolean(UCrop.Options.EXTRA_CROP_FORBID_GIF_WEBP, false)) {
            String mimeTypeFromMediaContentUri = FileUtils.getMimeTypeFromMediaContentUri(getContext(), (Uri) getArguments().getParcelable(UCrop.EXTRA_INPUT_URI));
            if (FileUtils.isGif(mimeTypeFromMediaContentUri) || FileUtils.isWebp(mimeTypeFromMediaContentUri)) {
                z3 = true;
            }
        }
        this.mBlockingView.setClickable(z3);
    }

    public UCropResult getError(Throwable th) {
        return new UCropResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    public UCropResult getResult(Uri uri, float f10, int i7, int i10, int i11, int i12) {
        return new UCropResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i11).putExtra("com.yalantis.ucrop.ImageHeight", i12).putExtra("com.yalantis.ucrop.OffsetX", i7).putExtra("com.yalantis.ucrop.OffsetY", i10).putExtra(UCrop.EXTRA_CROP_INPUT_ORIGINAL, FileUtils.getInputPath((Uri) getArguments().getParcelable(UCrop.EXTRA_INPUT_URI))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof UCropFragmentCallback) {
            this.callback = (UCropFragmentCallback) getParentFragment();
        } else {
            if (context instanceof UCropFragmentCallback) {
                this.callback = (UCropFragmentCallback) context;
                return;
            }
            throw new IllegalArgumentException(context.toString() + " must implement UCropFragmentCallback");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_fragment_photobox, viewGroup, false);
        Bundle arguments = getArguments();
        setupViews(viewInflate, arguments);
        setImageData(arguments);
        setInitialState();
        addBlockingView(viewInflate);
        return viewInflate;
    }

    public void setCallback(UCropFragmentCallback uCropFragmentCallback) {
        this.callback = uCropFragmentCallback;
    }

    public void setupViews(View view, Bundle bundle) {
        this.mActiveControlsWidgetColor = bundle.getInt(UCrop.Options.EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, getContext().getColor(R.color.ucrop_color_active_controls_color));
        this.mLogoColor = bundle.getInt(UCrop.Options.EXTRA_UCROP_LOGO_COLOR, getContext().getColor(R.color.ucrop_color_default_logo));
        this.mShowBottomControls = !bundle.getBoolean(UCrop.Options.EXTRA_HIDE_BOTTOM_CONTROLS, false);
        this.mRootViewBackgroundColor = bundle.getInt(UCrop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, getContext().getColor(R.color.ucrop_color_crop_background));
        initiateRootViews(view);
        this.callback.loadingProgress(true);
        if (!this.mShowBottomControls) {
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.ucrop_frame).getLayoutParams()).bottomMargin = 0;
            view.findViewById(R.id.ucrop_frame).requestLayout();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.controls_wrapper);
        viewGroup.setVisibility(0);
        LayoutInflater.from(getContext()).inflate(R.layout.ucrop_controls, viewGroup, true);
        AutoTransition autoTransition = new AutoTransition();
        this.mControlsTransition = autoTransition;
        autoTransition.i(CONTROLS_ANIMATION_DURATION);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.state_aspect_ratio);
        this.mWrapperStateAspectRatio = viewGroup2;
        viewGroup2.setOnClickListener(this.mStateClickListener);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.state_rotate);
        this.mWrapperStateRotate = viewGroup3;
        viewGroup3.setOnClickListener(this.mStateClickListener);
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.state_scale);
        this.mWrapperStateScale = viewGroup4;
        viewGroup4.setOnClickListener(this.mStateClickListener);
        this.mLayoutAspectRatio = (ViewGroup) view.findViewById(R.id.layout_aspect_ratio);
        this.mLayoutRotate = (ViewGroup) view.findViewById(R.id.layout_rotate_wheel);
        this.mLayoutScale = (ViewGroup) view.findViewById(R.id.layout_scale_wheel);
        setupAspectRatioWidget(bundle, view);
        setupRotateWidget(view);
        setupScaleWidget(view);
        setupStatesWrapper(view);
    }
}
