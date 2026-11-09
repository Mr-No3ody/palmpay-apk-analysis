package com.luck.picture.lib.basic;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.PictureSelectorPreviewFragment;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.engine.ImageEngine;
import com.luck.picture.lib.engine.VideoPlayerEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnCustomLoadingListener;
import com.luck.picture.lib.interfaces.OnExternalPreviewEventListener;
import com.luck.picture.lib.interfaces.OnInjectActivityPreviewListener;
import com.luck.picture.lib.interfaces.OnInjectLayoutResourceListener;
import com.luck.picture.lib.magical.BuildRecycleItemViewParams;
import com.luck.picture.lib.style.PictureSelectorStyle;
import com.luck.picture.lib.utils.ActivityCompatHelper;
import com.luck.picture.lib.utils.DensityUtil;
import com.luck.picture.lib.utils.DoubleUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class PictureSelectionPreviewModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionPreviewModel(PictureSelector pictureSelector) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.isPreviewZoomEffect = false;
    }

    public PictureSelectionPreviewModel isAutoVideoPlay(boolean z3) {
        this.selectionConfig.isAutoVideoPlay = z3;
        return this;
    }

    @Deprecated
    public PictureSelectionPreviewModel isEnableVideoSize(boolean z3) {
        this.selectionConfig.isSyncWidthAndHeight = z3;
        return this;
    }

    public PictureSelectionPreviewModel isHidePreviewDownload(boolean z3) {
        this.selectionConfig.isHidePreviewDownload = z3;
        return this;
    }

    public PictureSelectionPreviewModel isLoopAutoVideoPlay(boolean z3) {
        this.selectionConfig.isLoopAutoPlay = z3;
        return this;
    }

    public PictureSelectionPreviewModel isNewKeyBackMode(boolean z3) {
        this.selectionConfig.isNewKeyBackMode = z3;
        return this;
    }

    public PictureSelectionPreviewModel isPreviewFullScreenMode(boolean z3) {
        this.selectionConfig.isPreviewFullScreenMode = z3;
        return this;
    }

    public PictureSelectionPreviewModel isPreviewZoomEffect(boolean z3, ViewGroup viewGroup) {
        return isPreviewZoomEffect(z3, this.selectionConfig.isPreviewFullScreenMode, viewGroup);
    }

    public PictureSelectionPreviewModel isSyncWidthAndHeight(boolean z3) {
        this.selectionConfig.isSyncWidthAndHeight = z3;
        return this;
    }

    public PictureSelectionPreviewModel isUseSystemVideoPlayer(boolean z3) {
        this.selectionConfig.isUseSystemVideoPlayer = z3;
        return this;
    }

    public PictureSelectionPreviewModel isVideoPauseResumePlay(boolean z3) {
        this.selectionConfig.isPauseResumePlay = z3;
        return this;
    }

    public PictureSelectionPreviewModel setAttachViewLifecycle(IBridgeViewLifecycle iBridgeViewLifecycle) {
        this.selectionConfig.viewLifecycle = iBridgeViewLifecycle;
        return this;
    }

    public PictureSelectionPreviewModel setCustomLoadingListener(OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public PictureSelectionPreviewModel setDefaultLanguage(int i7) {
        this.selectionConfig.defaultLanguage = i7;
        return this;
    }

    public PictureSelectionPreviewModel setExternalPreviewEventListener(OnExternalPreviewEventListener onExternalPreviewEventListener) {
        this.selectionConfig.onExternalPreviewEventListener = onExternalPreviewEventListener;
        return this;
    }

    public PictureSelectionPreviewModel setImageEngine(ImageEngine imageEngine) {
        this.selectionConfig.imageEngine = imageEngine;
        return this;
    }

    public PictureSelectionPreviewModel setInjectActivityPreviewFragment(OnInjectActivityPreviewListener onInjectActivityPreviewListener) {
        this.selectionConfig.onInjectActivityPreviewListener = onInjectActivityPreviewListener;
        return this;
    }

    public PictureSelectionPreviewModel setInjectLayoutResourceListener(OnInjectLayoutResourceListener onInjectLayoutResourceListener) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isInjectLayoutResource = onInjectLayoutResourceListener != null;
        selectorConfig.onLayoutResourceListener = onInjectLayoutResourceListener;
        return this;
    }

    public PictureSelectionPreviewModel setLanguage(int i7) {
        this.selectionConfig.language = i7;
        return this;
    }

    public PictureSelectionPreviewModel setSelectorUIStyle(PictureSelectorStyle pictureSelectorStyle) {
        if (pictureSelectorStyle != null) {
            this.selectionConfig.selectorStyle = pictureSelectorStyle;
        }
        return this;
    }

    public PictureSelectionPreviewModel setVideoPlayerEngine(VideoPlayerEngine videoPlayerEngine) {
        this.selectionConfig.videoPlayerEngine = videoPlayerEngine;
        return this;
    }

    public void startActivityPreview(int i7, boolean z3, ArrayList<LocalMedia> arrayList) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.imageEngine == null && selectorConfig.chooseMode != SelectMimeType.ofAudio()) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        if (arrayList == null || arrayList.size() == 0) {
            throw new NullPointerException("preview data is null");
        }
        Intent intent = new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class);
        this.selectionConfig.addSelectedPreviewResult(arrayList);
        intent.putExtra(PictureConfig.EXTRA_EXTERNAL_PREVIEW, true);
        intent.putExtra(PictureConfig.EXTRA_MODE_TYPE_SOURCE, 2);
        intent.putExtra(PictureConfig.EXTRA_PREVIEW_CURRENT_POSITION, i7);
        intent.putExtra(PictureConfig.EXTRA_EXTERNAL_PREVIEW_DISPLAY_DELETE, z3);
        Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivity(intent);
        } else {
            activity.startActivity(intent);
        }
        SelectorConfig selectorConfig2 = this.selectionConfig;
        if (!selectorConfig2.isPreviewZoomEffect) {
            activity.overridePendingTransition(selectorConfig2.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, R.anim.ps_anim_fade_in);
        } else {
            int i10 = R.anim.ps_anim_fade_in;
            activity.overridePendingTransition(i10, i10);
        }
    }

    public void startFragmentPreview(int i7, boolean z3, ArrayList<LocalMedia> arrayList) {
        startFragmentPreview(null, i7, z3, arrayList);
    }

    public PictureSelectionPreviewModel isPreviewZoomEffect(boolean z3, boolean z8, ViewGroup viewGroup) {
        if ((viewGroup instanceof RecyclerView) || (viewGroup instanceof ListView)) {
            if (z3) {
                if (z8) {
                    BuildRecycleItemViewParams.generateViewParams(viewGroup, 0);
                } else {
                    BuildRecycleItemViewParams.generateViewParams(viewGroup, DensityUtil.getStatusBarHeight(this.selector.getActivity()));
                }
            }
            this.selectionConfig.isPreviewZoomEffect = z3;
            return this;
        }
        throw new IllegalArgumentException(viewGroup.getClass().getCanonicalName() + " Must be " + RecyclerView.class + " or " + ListView.class);
    }

    public void startFragmentPreview(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, int i7, boolean z3, ArrayList<LocalMedia> arrayList) {
        String fragmentTag;
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.imageEngine == null && selectorConfig.chooseMode != SelectMimeType.ofAudio()) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        if (arrayList == null || arrayList.size() == 0) {
            throw new NullPointerException("preview data is null");
        }
        Z supportFragmentManager = activity instanceof E ? ((E) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        if (pictureSelectorPreviewFragment != null) {
            fragmentTag = pictureSelectorPreviewFragment.getFragmentTag();
        } else {
            fragmentTag = PictureSelectorPreviewFragment.TAG;
            pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.newInstance();
        }
        if (ActivityCompatHelper.checkFragmentNonExits((E) activity, fragmentTag)) {
            ArrayList<LocalMedia> arrayList2 = new ArrayList<>(arrayList);
            pictureSelectorPreviewFragment.setExternalPreviewData(i7, arrayList2.size(), arrayList2, z3);
            FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, fragmentTag, pictureSelectorPreviewFragment);
        }
    }
}
