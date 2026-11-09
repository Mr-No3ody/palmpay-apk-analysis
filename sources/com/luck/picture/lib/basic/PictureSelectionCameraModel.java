package com.luck.picture.lib.basic;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.a;
import androidx.camera.video.u;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.luck.picture.lib.PictureOnlyCameraFragment;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.FileSizeUnit;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.engine.CompressEngine;
import com.luck.picture.lib.engine.CompressFileEngine;
import com.luck.picture.lib.engine.CropEngine;
import com.luck.picture.lib.engine.CropFileEngine;
import com.luck.picture.lib.engine.SandboxFileEngine;
import com.luck.picture.lib.engine.UriToFileTransformEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnBitmapWatermarkEventListener;
import com.luck.picture.lib.interfaces.OnCameraInterceptListener;
import com.luck.picture.lib.interfaces.OnCustomLoadingListener;
import com.luck.picture.lib.interfaces.OnPermissionDeniedListener;
import com.luck.picture.lib.interfaces.OnPermissionDescriptionListener;
import com.luck.picture.lib.interfaces.OnPermissionsInterceptListener;
import com.luck.picture.lib.interfaces.OnRecordAudioInterceptListener;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.luck.picture.lib.interfaces.OnSelectLimitTipsListener;
import com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener;
import com.luck.picture.lib.utils.DoubleUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PictureSelectionCameraModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionCameraModel(PictureSelector pictureSelector, int i7) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i7;
        selectorConfig.isOnlyCamera = true;
        selectorConfig.isDisplayTimeAxis = false;
        selectorConfig.isPreviewFullScreenMode = false;
        selectorConfig.isPreviewZoomEffect = false;
        selectorConfig.isOpenClickSound = false;
    }

    private PictureSelectionCameraModel setMaxSelectNum(int i7) {
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1) {
            i7 = 1;
        }
        selectorConfig.maxSelectNum = i7;
        return this;
    }

    public PictureOnlyCameraFragment build() {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (!(activity instanceof IBridgePictureBehavior)) {
            throw new NullPointerException(u.l(IBridgePictureBehavior.class, "Use only build PictureOnlyCameraFragment,Activity or Fragment interface needs to be implemented "));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        selectorConfig.onResultCallListener = null;
        return new PictureOnlyCameraFragment();
    }

    public PictureOnlyCameraFragment buildLaunch(int i7, OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (onResultCallbackListener == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = true;
        selectorConfig.isActivityResultBack = false;
        selectorConfig.onResultCallListener = onResultCallbackListener;
        Z supportFragmentManager = activity instanceof E ? ((E) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        PictureOnlyCameraFragment pictureOnlyCameraFragment = new PictureOnlyCameraFragment();
        Fragment fragmentE = supportFragmentManager.E(pictureOnlyCameraFragment.getFragmentTag());
        if (fragmentE != null) {
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.m(fragmentE);
            c1161a.h(true);
        }
        C1161a c1161a2 = new C1161a(supportFragmentManager);
        c1161a2.d(i7, pictureOnlyCameraFragment, pictureOnlyCameraFragment.getFragmentTag(), 1);
        c1161a2.c(pictureOnlyCameraFragment.getFragmentTag());
        c1161a2.h(true);
        return pictureOnlyCameraFragment;
    }

    public void forResult() {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        Z supportFragmentManager = activity instanceof E ? ((E) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        if (!(activity instanceof IBridgePictureBehavior)) {
            throw new NullPointerException(u.l(IBridgePictureBehavior.class, "Use only camera openCamera mode,Activity or Fragment interface needs to be implemented "));
        }
        String str = PictureOnlyCameraFragment.TAG;
        Fragment fragmentE = supportFragmentManager.E(str);
        if (fragmentE != null) {
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.m(fragmentE);
            c1161a.h(true);
        }
        FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, PictureOnlyCameraFragment.newInstance());
    }

    public void forResultActivity(int i7) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        Intent intent = new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class);
        Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, i7);
        } else {
            activity.startActivityForResult(intent, i7);
        }
        activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public PictureSelectionCameraModel isCameraAroundState(boolean z3) {
        this.selectionConfig.isCameraAroundState = z3;
        return this;
    }

    public PictureSelectionCameraModel isCameraForegroundService(boolean z3) {
        this.selectionConfig.isCameraForegroundService = z3;
        return this;
    }

    public PictureSelectionCameraModel isCameraRotateImage(boolean z3) {
        this.selectionConfig.isCameraRotateImage = z3;
        return this;
    }

    public PictureSelectionCameraModel isNewKeyBackMode(boolean z3) {
        this.selectionConfig.isNewKeyBackMode = z3;
        return this;
    }

    public PictureSelectionCameraModel isOriginalControl(boolean z3) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isOriginalControl = z3;
        selectorConfig.isCheckOriginalImage = z3;
        return this;
    }

    public PictureSelectionCameraModel isOriginalSkipCompress(boolean z3) {
        this.selectionConfig.isOriginalSkipCompress = z3;
        return this;
    }

    public PictureSelectionCameraModel isQuickCapture(boolean z3) {
        this.selectionConfig.isQuickCapture = z3;
        return this;
    }

    public PictureSelectionCameraModel setAddBitmapWatermarkListener(OnBitmapWatermarkEventListener onBitmapWatermarkEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onBitmapWatermarkListener = onBitmapWatermarkEventListener;
        }
        return this;
    }

    public PictureSelectionCameraModel setCameraImageFormat(String str) {
        this.selectionConfig.cameraImageFormat = str;
        return this;
    }

    public PictureSelectionCameraModel setCameraImageFormatForQ(String str) {
        this.selectionConfig.cameraImageFormatForQ = str;
        return this;
    }

    public PictureSelectionCameraModel setCameraInterceptListener(OnCameraInterceptListener onCameraInterceptListener) {
        this.selectionConfig.onCameraInterceptListener = onCameraInterceptListener;
        return this;
    }

    public PictureSelectionCameraModel setCameraVideoFormat(String str) {
        this.selectionConfig.cameraVideoFormat = str;
        return this;
    }

    public PictureSelectionCameraModel setCameraVideoFormatForQ(String str) {
        this.selectionConfig.cameraVideoFormatForQ = str;
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setCompressEngine(CompressEngine compressEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressEngine = compressEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setCropEngine(CropEngine cropEngine) {
        this.selectionConfig.cropEngine = cropEngine;
        return this;
    }

    public PictureSelectionCameraModel setCustomLoadingListener(OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public PictureSelectionCameraModel setDefaultLanguage(int i7) {
        this.selectionConfig.defaultLanguage = i7;
        return this;
    }

    public PictureSelectionCameraModel setLanguage(int i7) {
        this.selectionConfig.language = i7;
        return this;
    }

    public PictureSelectionCameraModel setMaxVideoSelectNum(int i7) {
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.chooseMode == SelectMimeType.ofVideo()) {
            i7 = 0;
        }
        selectorConfig.maxVideoSelectNum = i7;
        return this;
    }

    public PictureSelectionCameraModel setOfAllCameraType(int i7) {
        this.selectionConfig.ofAllCameraType = i7;
        return this;
    }

    public PictureSelectionCameraModel setOutputAudioDir(String str) {
        this.selectionConfig.outPutAudioDir = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputAudioFileName(String str) {
        this.selectionConfig.outPutAudioFileName = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputCameraDir(String str) {
        this.selectionConfig.outPutCameraDir = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputCameraImageFileName(String str) {
        this.selectionConfig.outPutCameraImageFileName = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputCameraVideoFileName(String str) {
        this.selectionConfig.outPutCameraVideoFileName = str;
        return this;
    }

    public PictureSelectionCameraModel setPermissionDeniedListener(OnPermissionDeniedListener onPermissionDeniedListener) {
        this.selectionConfig.onPermissionDeniedListener = onPermissionDeniedListener;
        return this;
    }

    public PictureSelectionCameraModel setPermissionDescriptionListener(OnPermissionDescriptionListener onPermissionDescriptionListener) {
        this.selectionConfig.onPermissionDescriptionListener = onPermissionDescriptionListener;
        return this;
    }

    public PictureSelectionCameraModel setPermissionsInterceptListener(OnPermissionsInterceptListener onPermissionsInterceptListener) {
        this.selectionConfig.onPermissionsEventListener = onPermissionsInterceptListener;
        return this;
    }

    public PictureSelectionCameraModel setRecordAudioInterceptListener(OnRecordAudioInterceptListener onRecordAudioInterceptListener) {
        this.selectionConfig.onRecordAudioListener = onRecordAudioInterceptListener;
        return this;
    }

    public PictureSelectionCameraModel setRecordVideoMaxSecond(int i7) {
        this.selectionConfig.recordVideoMaxSecond = i7;
        return this;
    }

    public PictureSelectionCameraModel setRecordVideoMinSecond(int i7) {
        this.selectionConfig.recordVideoMinSecond = i7;
        return this;
    }

    public PictureSelectionCameraModel setRequestedOrientation(int i7) {
        this.selectionConfig.requestedOrientation = i7;
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setSandboxFileEngine(SandboxFileEngine sandboxFileEngine) {
        if (!SdkVersionUtils.isQ()) {
            this.selectionConfig.isSandboxFileEngine = false;
            return this;
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.sandboxFileEngine = sandboxFileEngine;
        selectorConfig.isSandboxFileEngine = true;
        return this;
    }

    public PictureSelectionCameraModel setSelectLimitTipsListener(OnSelectLimitTipsListener onSelectLimitTipsListener) {
        this.selectionConfig.onSelectLimitTipsListener = onSelectLimitTipsListener;
        return this;
    }

    public PictureSelectionCameraModel setSelectMaxDurationSecond(int i7) {
        this.selectionConfig.selectMaxDurationSecond = i7 * 1000;
        return this;
    }

    public PictureSelectionCameraModel setSelectMaxFileSize(long j6) {
        if (j6 >= FileSizeUnit.MB) {
            this.selectionConfig.selectMaxFileSize = j6;
            return this;
        }
        this.selectionConfig.selectMaxFileSize = j6 * FileSizeUnit.KB;
        return this;
    }

    public PictureSelectionCameraModel setSelectMinDurationSecond(int i7) {
        this.selectionConfig.selectMinDurationSecond = i7 * 1000;
        return this;
    }

    public PictureSelectionCameraModel setSelectMinFileSize(long j6) {
        if (j6 >= FileSizeUnit.MB) {
            this.selectionConfig.selectMinFileSize = j6;
            return this;
        }
        this.selectionConfig.selectMinFileSize = j6 * FileSizeUnit.KB;
        return this;
    }

    public PictureSelectionCameraModel setSelectedData(List<LocalMedia> list) {
        if (list == null) {
            return this;
        }
        setMaxSelectNum(list.size() + 1);
        setMaxVideoSelectNum(list.size() + 1);
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1 && selectorConfig.isDirectReturnSingle) {
            selectorConfig.selectedResult.clear();
            return this;
        }
        selectorConfig.addAllSelectResult(new ArrayList<>(list));
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setVideoQuality(int i7) {
        this.selectionConfig.videoQuality = i7;
        return this;
    }

    public PictureSelectionCameraModel setVideoThumbnailListener(OnVideoThumbnailEventListener onVideoThumbnailEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onVideoThumbnailEventListener = onVideoThumbnailEventListener;
        }
        return this;
    }

    public PictureSelectionCameraModel setCropEngine(CropFileEngine cropFileEngine) {
        this.selectionConfig.cropFileEngine = cropFileEngine;
        return this;
    }

    public PictureSelectionCameraModel setCompressEngine(CompressFileEngine compressFileEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressFileEngine = compressFileEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    public PictureSelectionCameraModel setSandboxFileEngine(UriToFileTransformEngine uriToFileTransformEngine) {
        if (SdkVersionUtils.isQ()) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.uriToFileTransformEngine = uriToFileTransformEngine;
            selectorConfig.isSandboxFileEngine = true;
            return this;
        }
        this.selectionConfig.isSandboxFileEngine = false;
        return this;
    }

    public void forResultActivity(a aVar) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (aVar != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = false;
            selectorConfig.isActivityResultBack = true;
            aVar.a(new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class));
            activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
            return;
        }
        throw new NullPointerException("ActivityResultLauncher cannot be null");
    }

    public void forResultActivity(OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (onResultCallbackListener != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = true;
            selectorConfig.isActivityResultBack = false;
            selectorConfig.onResultCallListener = onResultCallbackListener;
            activity.startActivity(new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class));
            activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
            return;
        }
        throw new NullPointerException("OnResultCallbackListener cannot be null");
    }

    public void forResult(OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (onResultCallbackListener != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = true;
            selectorConfig.isActivityResultBack = false;
            selectorConfig.onResultCallListener = onResultCallbackListener;
            Z supportFragmentManager = activity instanceof E ? ((E) activity).getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                String str = PictureOnlyCameraFragment.TAG;
                Fragment fragmentE = supportFragmentManager.E(str);
                if (fragmentE != null) {
                    C1161a c1161a = new C1161a(supportFragmentManager);
                    c1161a.m(fragmentE);
                    c1161a.h(true);
                }
                FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, PictureOnlyCameraFragment.newInstance());
                return;
            }
            throw new NullPointerException("FragmentManager cannot be null");
        }
        throw new NullPointerException("OnResultCallbackListener cannot be null");
    }
}
