package com.luck.picture.lib.adapter.holder;

import android.view.View;
import androidx.annotation.NonNull;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.photoview.OnViewTapListener;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewImageHolder extends BasePreviewHolder {
    public PreviewImageHolder(@NonNull View view) {
        super(view);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void findViews(View view) {
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
        this.coverImageView.setOnViewTapListener(new OnViewTapListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewImageHolder.1
            @Override // com.luck.picture.lib.photoview.OnViewTapListener
            public void onViewTap(View view, float f10, float f11) {
                BasePreviewHolder.OnPreviewEventListener onPreviewEventListener = PreviewImageHolder.this.mPreviewEventListener;
                if (onPreviewEventListener != null) {
                    onPreviewEventListener.onBackPressed();
                }
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onLongPressDownload(final LocalMedia localMedia) {
        this.coverImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewImageHolder.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                BasePreviewHolder.OnPreviewEventListener onPreviewEventListener = PreviewImageHolder.this.mPreviewEventListener;
                if (onPreviewEventListener == null) {
                    return false;
                }
                onPreviewEventListener.onLongPressDownload(localMedia);
                return false;
            }
        });
    }
}
