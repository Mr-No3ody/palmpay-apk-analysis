package com.luck.picture.lib.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.config.InjectResourceSource;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PicturePreviewAdapter extends RecyclerView.Adapter<BasePreviewHolder> {
    private List<LocalMedia> mData;
    private final LinkedHashMap<Integer, BasePreviewHolder> mHolderCache;
    private BasePreviewHolder.OnPreviewEventListener onPreviewEventListener;
    private final SelectorConfig selectorConfig;

    public PicturePreviewAdapter() {
        this(SelectorProviders.getInstance().getSelectorConfig());
    }

    public void destroy() {
        Iterator<Integer> it = this.mHolderCache.keySet().iterator();
        while (it.hasNext()) {
            BasePreviewHolder basePreviewHolder = this.mHolderCache.get(it.next());
            if (basePreviewHolder != null) {
                basePreviewHolder.release();
            }
        }
    }

    public BasePreviewHolder getCurrentHolder(int i7) {
        return this.mHolderCache.get(Integer.valueOf(i7));
    }

    public LocalMedia getItem(int i7) {
        if (i7 > this.mData.size()) {
            return null;
        }
        return this.mData.get(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<LocalMedia> list = this.mData;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i7) {
        if (PictureMimeType.isHasVideo(this.mData.get(i7).getMimeType())) {
            return 2;
        }
        return PictureMimeType.isHasAudio(this.mData.get(i7).getMimeType()) ? 3 : 1;
    }

    public boolean isPlaying(int i7) {
        BasePreviewHolder currentHolder = getCurrentHolder(i7);
        return currentHolder != null && currentHolder.isPlaying();
    }

    public void setCoverScaleType(int i7) {
        BasePreviewHolder currentHolder = getCurrentHolder(i7);
        if (currentHolder != null) {
            LocalMedia item = getItem(i7);
            if (item.getWidth() == 0 && item.getHeight() == 0) {
                currentHolder.coverImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                currentHolder.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    public void setData(List<LocalMedia> list) {
        this.mData = list;
    }

    public void setOnPreviewEventListener(BasePreviewHolder.OnPreviewEventListener onPreviewEventListener) {
        this.onPreviewEventListener = onPreviewEventListener;
    }

    public void setVideoPlayButtonUI(int i7) {
        BasePreviewHolder currentHolder = getCurrentHolder(i7);
        if (currentHolder instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) currentHolder;
            if (previewVideoHolder.isPlaying()) {
                return;
            }
            previewVideoHolder.ivPlayButton.setVisibility(0);
        }
    }

    public void startAutoVideoPlay(int i7) {
        BasePreviewHolder currentHolder = getCurrentHolder(i7);
        if (currentHolder instanceof PreviewVideoHolder) {
            ((PreviewVideoHolder) currentHolder).startPlay();
        }
    }

    public PicturePreviewAdapter(SelectorConfig selectorConfig) {
        this.mHolderCache = new LinkedHashMap<>();
        this.selectorConfig = selectorConfig;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull BasePreviewHolder basePreviewHolder, int i7) {
        basePreviewHolder.setOnPreviewEventListener(this.onPreviewEventListener);
        LocalMedia item = getItem(i7);
        this.mHolderCache.put(Integer.valueOf(i7), basePreviewHolder);
        basePreviewHolder.bindData(item, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public BasePreviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i7) {
        if (i7 == 2) {
            int layoutResource = InjectResourceSource.getLayoutResource(viewGroup.getContext(), 8, this.selectorConfig);
            if (layoutResource == 0) {
                layoutResource = R.layout.ps_preview_video;
            }
            return BasePreviewHolder.generate(viewGroup, i7, layoutResource);
        }
        if (i7 == 3) {
            int layoutResource2 = InjectResourceSource.getLayoutResource(viewGroup.getContext(), 10, this.selectorConfig);
            if (layoutResource2 == 0) {
                layoutResource2 = R.layout.ps_preview_audio;
            }
            return BasePreviewHolder.generate(viewGroup, i7, layoutResource2);
        }
        int layoutResource3 = InjectResourceSource.getLayoutResource(viewGroup.getContext(), 7, this.selectorConfig);
        if (layoutResource3 == 0) {
            layoutResource3 = R.layout.ps_preview_image;
        }
        return BasePreviewHolder.generate(viewGroup, i7, layoutResource3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull BasePreviewHolder basePreviewHolder) {
        super.onViewAttachedToWindow(basePreviewHolder);
        basePreviewHolder.onViewAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull BasePreviewHolder basePreviewHolder) {
        super.onViewDetachedFromWindow(basePreviewHolder);
        basePreviewHolder.onViewDetachedFromWindow();
    }
}
