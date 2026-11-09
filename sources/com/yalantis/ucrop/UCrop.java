package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class UCrop {
    public static final String EXTRA_ASPECT_RATIO_X = "com.yalantis.ucrop.AspectRatioX";
    public static final String EXTRA_ASPECT_RATIO_Y = "com.yalantis.ucrop.AspectRatioY";
    public static final String EXTRA_CROP_INPUT_ORIGINAL = "com.yalantis.ucrop.CropInputOriginal";
    public static final String EXTRA_CROP_TOTAL_DATA_SOURCE = "com.yalantis.ucrop.CropTotalDataSource";
    public static final String EXTRA_ERROR = "com.yalantis.ucrop.Error";
    public static final String EXTRA_INPUT_URI = "com.yalantis.ucrop.InputUri";
    public static final String EXTRA_MAX_SIZE_X = "com.yalantis.ucrop.MaxSizeX";
    public static final String EXTRA_MAX_SIZE_Y = "com.yalantis.ucrop.MaxSizeY";
    public static final String EXTRA_OUTPUT_CROP_ASPECT_RATIO = "com.yalantis.ucrop.CropAspectRatio";
    public static final String EXTRA_OUTPUT_IMAGE_HEIGHT = "com.yalantis.ucrop.ImageHeight";
    public static final String EXTRA_OUTPUT_IMAGE_WIDTH = "com.yalantis.ucrop.ImageWidth";
    public static final String EXTRA_OUTPUT_OFFSET_X = "com.yalantis.ucrop.OffsetX";
    public static final String EXTRA_OUTPUT_OFFSET_Y = "com.yalantis.ucrop.OffsetY";
    public static final String EXTRA_OUTPUT_URI = "com.yalantis.ucrop.OutputUri";
    private static final String EXTRA_PREFIX = "com.yalantis.ucrop";
    public static final int MIN_SIZE = 10;
    public static final int REQUEST_CROP = 69;
    public static final int RESULT_ERROR = 96;
    private Intent mCropIntent = new Intent();
    private Bundle mCropOptionsBundle;

    public static class Options {
        public static final String EXTRA_ALLOWED_GESTURES = "com.yalantis.ucrop.AllowedGestures";
        public static final String EXTRA_ASPECT_RATIO_OPTIONS = "com.yalantis.ucrop.AspectRatioOptions";
        public static final String EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT = "com.yalantis.ucrop.AspectRatioSelectedByDefault";
        public static final String EXTRA_CIRCLE_DIMMED_LAYER = "com.yalantis.ucrop.CircleDimmedLayer";
        public static final String EXTRA_CIRCLE_STROKE_COLOR = "com.yalantis.ucrop.CircleStrokeColor";
        public static final String EXTRA_CIRCLE_STROKE_WIDTH_LAYER = "com.yalantis.ucrop.CircleStrokeWidth";
        public static final String EXTRA_COMPRESSION_FORMAT_NAME = "com.yalantis.ucrop.CompressionFormatName";
        public static final String EXTRA_COMPRESSION_QUALITY = "com.yalantis.ucrop.CompressionQuality";
        public static final String EXTRA_CROP_CUSTOM_LOADER_BITMAP = "com.yalantis.ucrop.CustomLoaderCropBitmap";
        public static final String EXTRA_CROP_DRAG_CENTER = "com.yalantis.ucrop.DragSmoothToCenter";
        public static final String EXTRA_CROP_FORBID_GIF_WEBP = "com.yalantis.ucrop.ForbidCropGifWebp";
        public static final String EXTRA_CROP_FORBID_SKIP = "com.yalantis.ucrop.ForbidSkipCrop";
        public static final String EXTRA_CROP_FRAME_COLOR = "com.yalantis.ucrop.CropFrameColor";
        public static final String EXTRA_CROP_FRAME_STROKE_WIDTH = "com.yalantis.ucrop.CropFrameStrokeWidth";
        public static final String EXTRA_CROP_GRID_COLOR = "com.yalantis.ucrop.CropGridColor";
        public static final String EXTRA_CROP_GRID_COLUMN_COUNT = "com.yalantis.ucrop.CropGridColumnCount";
        public static final String EXTRA_CROP_GRID_ROW_COUNT = "com.yalantis.ucrop.CropGridRowCount";
        public static final String EXTRA_CROP_GRID_STROKE_WIDTH = "com.yalantis.ucrop.CropGridStrokeWidth";
        public static final String EXTRA_CROP_OUTPUT_DIR = "com.yalantis.ucrop.CropOutputDir";
        public static final String EXTRA_CROP_OUTPUT_FILE_NAME = "com.yalantis.ucrop.CropOutputFileName";
        public static final String EXTRA_DARK_STATUS_BAR_BLACK = "com.yalantis.ucrop.isDarkStatusBarBlack";
        public static final String EXTRA_DIMMED_LAYER_COLOR = "com.yalantis.ucrop.DimmedLayerColor";
        public static final String EXTRA_DRAG_IMAGES = "com.yalantis.ucrop.isDragImages";
        public static final String EXTRA_FREE_STYLE_CROP = "com.yalantis.ucrop.FreeStyleCrop";
        public static final String EXTRA_GALLERY_BAR_BACKGROUND = "com.yalantis.ucrop.GalleryBarBackground";
        public static final String EXTRA_HIDE_BOTTOM_CONTROLS = "com.yalantis.ucrop.HideBottomControls";
        public static final String EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration";
        public static final String EXTRA_MAX_BITMAP_SIZE = "com.yalantis.ucrop.MaxBitmapSize";
        public static final String EXTRA_MAX_SCALE_MULTIPLIER = "com.yalantis.ucrop.MaxScaleMultiplier";
        public static final String EXTRA_MULTIPLE_ASPECT_RATIO = "com.yalantis.ucrop.MultipleAspectRatio";
        public static final String EXTRA_SHOW_CROP_FRAME = "com.yalantis.ucrop.ShowCropFrame";
        public static final String EXTRA_SHOW_CROP_GRID = "com.yalantis.ucrop.ShowCropGrid";
        public static final String EXTRA_SKIP_CROP_MIME_TYPE = "com.yalantis.ucrop.SkipCropMimeType";
        public static final String EXTRA_STATUS_BAR_COLOR = "com.yalantis.ucrop.StatusBarColor";
        public static final String EXTRA_TOOL_BAR_COLOR = "com.yalantis.ucrop.ToolbarColor";
        public static final String EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE = "com.yalantis.ucrop.UcropColorControlsWidgetActive";
        public static final String EXTRA_UCROP_LOGO_COLOR = "com.yalantis.ucrop.UcropLogoColor";
        public static final String EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR = "com.yalantis.ucrop.UcropRootViewBackgroundColor";
        public static final String EXTRA_UCROP_TITLE_TEXT_SIZE_TOOLBAR = "com.yalantis.ucrop.UcropToolbarTitleTextSize";
        public static final String EXTRA_UCROP_TITLE_TEXT_TOOLBAR = "com.yalantis.ucrop.UcropToolbarTitleText";
        public static final String EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE = "com.yalantis.ucrop.UcropToolbarCancelDrawable";
        public static final String EXTRA_UCROP_WIDGET_COLOR_TOOLBAR = "com.yalantis.ucrop.UcropToolbarWidgetColor";
        public static final String EXTRA_UCROP_WIDGET_CROP_DRAWABLE = "com.yalantis.ucrop.UcropToolbarCropDrawable";
        private final Bundle mOptionBundle = new Bundle();

        @NonNull
        public Bundle getOptionBundle() {
            return this.mOptionBundle;
        }

        public void isCropDragSmoothToCenter(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_CROP_DRAG_CENTER, z3);
        }

        public void isDarkStatusBarBlack(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_DARK_STATUS_BAR_BLACK, z3);
        }

        public void isDragCropImages(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_DRAG_IMAGES, z3);
        }

        public void isForbidCropGifWebp(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_CROP_FORBID_GIF_WEBP, z3);
        }

        public void isForbidSkipMultipleCrop(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_CROP_FORBID_SKIP, z3);
        }

        public void isUseCustomLoaderBitmap(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_CROP_CUSTOM_LOADER_BITMAP, z3);
        }

        public void setActiveControlsWidgetColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, i7);
        }

        public void setAllowedGestures(int i7, int i10, int i11) {
            this.mOptionBundle.putIntArray(EXTRA_ALLOWED_GESTURES, new int[]{i7, i10, i11});
        }

        public void setAspectRatioOptions(int i7, AspectRatio... aspectRatioArr) {
            if (i7 < aspectRatioArr.length) {
                this.mOptionBundle.putInt(EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, i7);
                this.mOptionBundle.putParcelableArrayList(EXTRA_ASPECT_RATIO_OPTIONS, new ArrayList<>(Arrays.asList(aspectRatioArr)));
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Index [selectedByDefault = " + i7 + "] (0-based) cannot be higher or equal than aspect ratio options count [count = " + aspectRatioArr.length + "].");
        }

        public void setCircleDimmedLayer(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_CIRCLE_DIMMED_LAYER, z3);
        }

        public void setCircleStrokeColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_CIRCLE_STROKE_COLOR, i7);
        }

        public void setCircleStrokeWidth(@IntRange(from = 0) int i7) {
            this.mOptionBundle.putInt(EXTRA_CIRCLE_STROKE_WIDTH_LAYER, i7);
        }

        public void setCompressionFormat(@NonNull Bitmap.CompressFormat compressFormat) {
            this.mOptionBundle.putString(EXTRA_COMPRESSION_FORMAT_NAME, compressFormat.name());
        }

        public void setCompressionQuality(@IntRange(from = 0) int i7) {
            this.mOptionBundle.putInt(EXTRA_COMPRESSION_QUALITY, i7);
        }

        public void setCropFrameColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_CROP_FRAME_COLOR, i7);
        }

        public void setCropFrameStrokeWidth(@IntRange(from = 0) int i7) {
            this.mOptionBundle.putInt(EXTRA_CROP_FRAME_STROKE_WIDTH, i7);
        }

        public void setCropGalleryBarBackgroundResources(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_GALLERY_BAR_BACKGROUND, i7);
        }

        public void setCropGridColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLOR, i7);
        }

        public void setCropGridColumnCount(@IntRange(from = 0) int i7) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLUMN_COUNT, i7);
        }

        public void setCropGridRowCount(@IntRange(from = 0) int i7) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_ROW_COUNT, i7);
        }

        public void setCropGridStrokeWidth(@IntRange(from = 0) int i7) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_STROKE_WIDTH, i7);
        }

        public void setCropOutputFileName(@NonNull String str) {
            this.mOptionBundle.putString(EXTRA_CROP_OUTPUT_FILE_NAME, str);
        }

        public void setCropOutputPathDir(@NonNull String str) {
            this.mOptionBundle.putString(EXTRA_CROP_OUTPUT_DIR, str);
        }

        public void setDimmedLayerColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_DIMMED_LAYER_COLOR, i7);
        }

        public void setFreeStyleCropEnabled(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_FREE_STYLE_CROP, z3);
        }

        public void setHideBottomControls(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_HIDE_BOTTOM_CONTROLS, z3);
        }

        public void setImageToCropBoundsAnimDuration(@IntRange(from = 10) int i7) {
            this.mOptionBundle.putInt(EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, i7);
        }

        public void setLogoColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_UCROP_LOGO_COLOR, i7);
        }

        public void setMaxBitmapSize(@IntRange(from = 10) int i7) {
            this.mOptionBundle.putInt(EXTRA_MAX_BITMAP_SIZE, i7);
        }

        public void setMaxScaleMultiplier(@FloatRange(from = 1.0d, fromInclusive = false) float f10) {
            this.mOptionBundle.putFloat(EXTRA_MAX_SCALE_MULTIPLIER, f10);
        }

        public void setMultipleCropAspectRatio(AspectRatio... aspectRatioArr) {
            float f10 = this.mOptionBundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_X, 0.0f);
            float f11 = this.mOptionBundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_Y, 0.0f);
            if (aspectRatioArr.length > 0 && f10 <= 0.0f && f11 <= 0.0f) {
                withAspectRatio(aspectRatioArr[0].getAspectRatioX(), aspectRatioArr[0].getAspectRatioY());
            }
            this.mOptionBundle.putParcelableArrayList(EXTRA_MULTIPLE_ASPECT_RATIO, new ArrayList<>(Arrays.asList(aspectRatioArr)));
        }

        public void setRootViewBackgroundColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, i7);
        }

        public void setShowCropFrame(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_FRAME, z3);
        }

        public void setShowCropGrid(boolean z3) {
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_GRID, z3);
        }

        public void setSkipCropMimeType(String... strArr) {
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            this.mOptionBundle.putStringArrayList(EXTRA_SKIP_CROP_MIME_TYPE, new ArrayList<>(Arrays.asList(strArr)));
        }

        public void setStatusBarColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_STATUS_BAR_COLOR, i7);
        }

        public void setToolbarCancelDrawable(@DrawableRes int i7) {
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE, i7);
        }

        public void setToolbarColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_TOOL_BAR_COLOR, i7);
        }

        public void setToolbarCropDrawable(@DrawableRes int i7) {
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_CROP_DRAWABLE, i7);
        }

        public void setToolbarTitle(@Nullable String str) {
            this.mOptionBundle.putString(EXTRA_UCROP_TITLE_TEXT_TOOLBAR, str);
        }

        public void setToolbarTitleSize(int i7) {
            if (i7 > 0) {
                this.mOptionBundle.putInt(EXTRA_UCROP_TITLE_TEXT_SIZE_TOOLBAR, i7);
            }
        }

        public void setToolbarWidgetColor(@ColorInt int i7) {
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, i7);
        }

        public void useSourceImageAspectRatio() {
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, 0.0f);
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, 0.0f);
        }

        public void withAspectRatio(float f10, float f11) {
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, f10);
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, f11);
        }

        public void withMaxResultSize(@IntRange(from = 10) int i7, @IntRange(from = 10) int i10) {
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_X, i7);
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_Y, i10);
        }
    }

    private UCrop(@NonNull Uri uri, @NonNull Uri uri2) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelable(EXTRA_INPUT_URI, uri);
        this.mCropOptionsBundle.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    @Nullable
    public static Throwable getError(@NonNull Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    @Nullable
    public static Uri getOutput(@NonNull Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    public static float getOutputCropAspectRatio(@NonNull Intent intent) {
        return intent.getFloatExtra("com.yalantis.ucrop.CropAspectRatio", 0.0f);
    }

    public static int getOutputImageHeight(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1);
    }

    public static int getOutputImageOffsetX(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetX", 0);
    }

    public static int getOutputImageOffsetY(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetY", 0);
    }

    public static int getOutputImageWidth(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1);
    }

    public static UCrop of(@NonNull Uri uri, @NonNull Uri uri2, ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            throw new IllegalArgumentException("Missing required parameters, count cannot be less than 1");
        }
        return arrayList.size() == 1 ? new UCrop(uri, uri2) : new UCrop(uri, uri2, arrayList);
    }

    public UCropFragment getFragment() {
        return UCropFragment.newInstance(this.mCropOptionsBundle);
    }

    public Intent getIntent(@NonNull Context context) {
        ArrayList<String> stringArrayList = this.mCropOptionsBundle.getStringArrayList(EXTRA_CROP_TOTAL_DATA_SOURCE);
        if (stringArrayList == null || stringArrayList.size() <= 1) {
            this.mCropIntent.setClass(context, UCropActivity.class);
        } else {
            this.mCropIntent.setClass(context, UCropMultipleActivity.class);
        }
        this.mCropIntent.putExtras(this.mCropOptionsBundle);
        return this.mCropIntent;
    }

    public void setImageEngine(UCropImageEngine uCropImageEngine) {
        ArrayList<String> stringArrayList = this.mCropOptionsBundle.getStringArrayList(EXTRA_CROP_TOTAL_DATA_SOURCE);
        boolean z3 = this.mCropOptionsBundle.getBoolean(Options.EXTRA_CROP_CUSTOM_LOADER_BITMAP, false);
        if (((stringArrayList != null && stringArrayList.size() > 1) || z3) && uCropImageEngine == null) {
            throw new NullPointerException("Missing ImageEngine,please implement UCrop.setImageEngine");
        }
        UCropDevelopConfig.imageEngine = uCropImageEngine;
    }

    public void start(@NonNull Activity activity) {
        start(activity, 69);
    }

    public void startEdit(@NonNull Context context, @NonNull Fragment fragment, int i7) {
        fragment.startActivityForResult(getIntent(context), i7);
    }

    public UCrop useSourceImageAspectRatio() {
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, 0.0f);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, 0.0f);
        return this;
    }

    public UCrop withAspectRatio(float f10, float f11) {
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, f10);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, f11);
        return this;
    }

    public UCrop withMaxResultSize(@IntRange(from = 10) int i7, @IntRange(from = 10) int i10) {
        if (i7 < 10) {
            i7 = 10;
        }
        if (i10 < 10) {
            i10 = 10;
        }
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_X, i7);
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_Y, i10);
        return this;
    }

    public UCrop withOptions(@NonNull Options options) {
        this.mCropOptionsBundle.putAll(options.getOptionBundle());
        return this;
    }

    public UCropFragment getFragment(Bundle bundle) {
        this.mCropOptionsBundle = bundle;
        return getFragment();
    }

    public void start(@NonNull Activity activity, int i7) {
        activity.startActivityForResult(getIntent(activity), i7);
    }

    public void start(@NonNull Context context, @NonNull Fragment fragment) {
        start(context, fragment, 69);
    }

    public void start(@NonNull Context context, @NonNull Fragment fragment, int i7) {
        fragment.startActivityForResult(getIntent(context), i7);
    }

    private UCrop(@NonNull Uri uri, @NonNull Uri uri2, ArrayList<String> arrayList) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelable(EXTRA_INPUT_URI, uri);
        this.mCropOptionsBundle.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
        this.mCropOptionsBundle.putStringArrayList(EXTRA_CROP_TOTAL_DATA_SOURCE, arrayList);
    }

    public static <T> UCrop of(@NonNull Uri uri, @NonNull Uri uri2) {
        return new UCrop(uri, uri2);
    }
}
