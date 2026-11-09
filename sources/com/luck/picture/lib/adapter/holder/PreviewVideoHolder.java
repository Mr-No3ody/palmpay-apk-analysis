package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.engine.MediaPlayerEngine;
import com.luck.picture.lib.engine.VideoPlayerEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnPlayerListener;
import com.luck.picture.lib.photoview.OnViewTapListener;
import com.luck.picture.lib.utils.IntentUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewVideoHolder extends BasePreviewHolder {
    private boolean isPlayed;
    public ImageView ivPlayButton;
    private final OnPlayerListener mPlayerListener;
    public ProgressBar progress;
    public View videoPlayer;

    public PreviewVideoHolder(@NonNull View view) {
        super(view);
        this.isPlayed = false;
        this.mPlayerListener = new OnPlayerListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.5
            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerEnd() {
                PreviewVideoHolder.this.playerDefaultUI();
            }

            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerError() {
                PreviewVideoHolder.this.playerDefaultUI();
            }

            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerLoading() {
                PreviewVideoHolder.this.progress.setVisibility(0);
            }

            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerReady() {
                PreviewVideoHolder.this.playerIngUI();
            }
        };
        this.ivPlayButton = (ImageView) view.findViewById(R.id.iv_play_video);
        this.progress = (ProgressBar) view.findViewById(R.id.progress);
        this.ivPlayButton.setVisibility(this.selectorConfig.isPreviewZoomEffect ? 8 : 0);
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.videoPlayerEngine == null) {
            selectorConfig.videoPlayerEngine = new MediaPlayerEngine();
        }
        View viewOnCreateVideoPlayer = this.selectorConfig.videoPlayerEngine.onCreateVideoPlayer(view.getContext());
        this.videoPlayer = viewOnCreateVideoPlayer;
        if (viewOnCreateVideoPlayer == null) {
            throw new NullPointerException(u.l(VideoPlayerEngine.class, "onCreateVideoPlayer cannot be empty,Please implement "));
        }
        if (viewOnCreateVideoPlayer.getLayoutParams() == null) {
            this.videoPlayer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.indexOfChild(this.videoPlayer) != -1) {
            viewGroup.removeView(this.videoPlayer);
        }
        viewGroup.addView(this.videoPlayer, 0);
        this.videoPlayer.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchPlay() {
        if (!this.isPlayed) {
            startPlay();
        } else if (isPlaying()) {
            onPause();
        } else {
            onResume();
        }
    }

    private void onResume() {
        this.ivPlayButton.setVisibility(8);
        VideoPlayerEngine videoPlayerEngine = this.selectorConfig.videoPlayerEngine;
        if (videoPlayerEngine != null) {
            videoPlayerEngine.onResume(this.videoPlayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playerDefaultUI() {
        this.isPlayed = false;
        this.ivPlayButton.setVisibility(0);
        this.progress.setVisibility(8);
        this.coverImageView.setVisibility(0);
        this.videoPlayer.setVisibility(8);
        BasePreviewHolder.OnPreviewEventListener onPreviewEventListener = this.mPreviewEventListener;
        if (onPreviewEventListener != null) {
            onPreviewEventListener.onPreviewVideoTitle(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playerIngUI() {
        this.progress.setVisibility(8);
        this.ivPlayButton.setVisibility(8);
        this.coverImageView.setVisibility(8);
        this.videoPlayer.setVisibility(0);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void bindData(LocalMedia localMedia, int i7) {
        super.bindData(localMedia, i7);
        setScaleDisplaySize(localMedia);
        this.ivPlayButton.setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
                if (previewVideoHolder.selectorConfig.isPauseResumePlay) {
                    previewVideoHolder.dispatchPlay();
                } else {
                    previewVideoHolder.startPlay();
                }
            }
        });
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
                if (previewVideoHolder.selectorConfig.isPauseResumePlay) {
                    previewVideoHolder.dispatchPlay();
                    return;
                }
                BasePreviewHolder.OnPreviewEventListener onPreviewEventListener = previewVideoHolder.mPreviewEventListener;
                if (onPreviewEventListener != null) {
                    onPreviewEventListener.onBackPressed();
                }
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void findViews(View view) {
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public boolean isPlaying() {
        VideoPlayerEngine videoPlayerEngine = this.selectorConfig.videoPlayerEngine;
        return videoPlayerEngine != null && videoPlayerEngine.isPlaying(this.videoPlayer);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void loadImage(LocalMedia localMedia, int i7, int i10) {
        if (this.selectorConfig.imageEngine != null) {
            String availablePath = localMedia.getAvailablePath();
            if (i7 == -1 && i10 == -1) {
                this.selectorConfig.imageEngine.loadImage(this.itemView.getContext(), availablePath, this.coverImageView);
            } else {
                this.selectorConfig.imageEngine.loadImage(this.itemView.getContext(), this.coverImageView, availablePath, i7, i10);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onClickBackPressed() {
        this.coverImageView.setOnViewTapListener(new OnViewTapListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.1
            @Override // com.luck.picture.lib.photoview.OnViewTapListener
            public void onViewTap(View view, float f10, float f11) {
                BasePreviewHolder.OnPreviewEventListener onPreviewEventListener = PreviewVideoHolder.this.mPreviewEventListener;
                if (onPreviewEventListener != null) {
                    onPreviewEventListener.onBackPressed();
                }
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onLongPressDownload(final LocalMedia localMedia) {
        this.coverImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                BasePreviewHolder.OnPreviewEventListener onPreviewEventListener = PreviewVideoHolder.this.mPreviewEventListener;
                if (onPreviewEventListener == null) {
                    return false;
                }
                onPreviewEventListener.onLongPressDownload(localMedia);
                return false;
            }
        });
    }

    public void onPause() {
        this.ivPlayButton.setVisibility(0);
        VideoPlayerEngine videoPlayerEngine = this.selectorConfig.videoPlayerEngine;
        if (videoPlayerEngine != null) {
            videoPlayerEngine.onPause(this.videoPlayer);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onViewAttachedToWindow() {
        VideoPlayerEngine videoPlayerEngine = this.selectorConfig.videoPlayerEngine;
        if (videoPlayerEngine != null) {
            videoPlayerEngine.onPlayerAttachedToWindow(this.videoPlayer);
            this.selectorConfig.videoPlayerEngine.addPlayListener(this.mPlayerListener);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onViewDetachedFromWindow() {
        VideoPlayerEngine videoPlayerEngine = this.selectorConfig.videoPlayerEngine;
        if (videoPlayerEngine != null) {
            videoPlayerEngine.onPlayerDetachedFromWindow(this.videoPlayer);
            this.selectorConfig.videoPlayerEngine.removePlayListener(this.mPlayerListener);
        }
        playerDefaultUI();
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void release() {
        VideoPlayerEngine videoPlayerEngine = this.selectorConfig.videoPlayerEngine;
        if (videoPlayerEngine != null) {
            videoPlayerEngine.removePlayListener(this.mPlayerListener);
            this.selectorConfig.videoPlayerEngine.destroy(this.videoPlayer);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void resumePausePlay() {
        if (isPlaying()) {
            onPause();
        } else {
            onResume();
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void setScaleDisplaySize(LocalMedia localMedia) {
        super.setScaleDisplaySize(localMedia);
        if (this.selectorConfig.isPreviewZoomEffect || this.screenWidth >= this.screenHeight) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.videoPlayer.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.screenWidth;
            layoutParams2.height = this.screenAppInHeight;
            layoutParams2.gravity = 17;
            return;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.width = this.screenWidth;
            layoutParams3.height = this.screenAppInHeight;
            layoutParams3.addRule(13);
            return;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams4.width = this.screenWidth;
            layoutParams4.height = this.screenAppInHeight;
            layoutParams4.gravity = 17;
            return;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams5).width = this.screenWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams5).height = this.screenAppInHeight;
            layoutParams5.f15650i = 0;
            layoutParams5.f15655l = 0;
        }
    }

    public void startPlay() {
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isUseSystemVideoPlayer) {
            IntentUtils.startSystemPlayerVideo(this.itemView.getContext(), this.media.getAvailablePath());
            return;
        }
        if (this.videoPlayer == null) {
            throw new NullPointerException(u.l(VideoPlayerEngine.class, "VideoPlayer cannot be empty,Please implement "));
        }
        if (selectorConfig.videoPlayerEngine != null) {
            this.progress.setVisibility(0);
            this.ivPlayButton.setVisibility(8);
            this.mPreviewEventListener.onPreviewVideoTitle(this.media.getFileName());
            this.isPlayed = true;
            this.selectorConfig.videoPlayerEngine.onStarPlayer(this.videoPlayer, this.media);
        }
    }
}
