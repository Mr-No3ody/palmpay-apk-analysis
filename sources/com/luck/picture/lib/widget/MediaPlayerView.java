package com.luck.picture.lib.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPlayerView extends FrameLayout implements SurfaceHolder.Callback {
    private MediaPlayer mediaPlayer;
    private VideoSurfaceView surfaceView;

    public static class VideoSurfaceView extends SurfaceView {
        private int videoHeight;
        private int videoWidth;

        public VideoSurfaceView(Context context) {
            this(context, null);
        }

        public void adjustVideoSize(int i7, int i10) {
            if (i7 == 0 || i10 == 0) {
                return;
            }
            this.videoWidth = i7;
            this.videoHeight = i10;
            getHolder().setFixedSize(i7, i10);
            requestLayout();
        }

        @Override // android.view.SurfaceView, android.view.View
        public void onMeasure(int i7, int i10) {
            int i11;
            int defaultSize = View.getDefaultSize(this.videoWidth, i7);
            int defaultSize2 = View.getDefaultSize(this.videoHeight, i10);
            if (this.videoWidth > 0 && this.videoHeight > 0) {
                int mode = View.MeasureSpec.getMode(i7);
                int size = View.MeasureSpec.getSize(i7);
                int mode2 = View.MeasureSpec.getMode(i10);
                int size2 = View.MeasureSpec.getSize(i10);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i12 = this.videoWidth;
                    int i13 = i12 * size2;
                    int i14 = this.videoHeight;
                    if (i13 < size * i14) {
                        defaultSize = (i12 * size2) / i14;
                    } else {
                        if (i12 * size2 > size * i14) {
                            defaultSize2 = (i14 * size) / i12;
                            defaultSize = size;
                        }
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else if (mode == 1073741824) {
                    int i15 = (this.videoHeight * size) / this.videoWidth;
                    if (mode2 != Integer.MIN_VALUE || i15 <= size2) {
                        defaultSize2 = i15;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i11 = (this.videoWidth * size2) / this.videoHeight;
                        if (mode == Integer.MIN_VALUE && i11 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        int i16 = this.videoWidth;
                        int i17 = this.videoHeight;
                        if (mode2 != Integer.MIN_VALUE || i17 <= size2) {
                            i11 = i16;
                            size2 = i17;
                        } else {
                            i11 = (size2 * i16) / i17;
                        }
                        if (mode == Integer.MIN_VALUE && i11 > size) {
                            defaultSize2 = (i17 * size) / i16;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i11;
                    defaultSize2 = size2;
                }
            }
            setMeasuredDimension(defaultSize, defaultSize2);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
        }
    }

    public MediaPlayerView(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        this.surfaceView = new VideoSurfaceView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.surfaceView.setLayoutParams(layoutParams);
        addView(this.surfaceView);
        SurfaceHolder holder = this.surfaceView.getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public void clearCanvas() {
        this.surfaceView.getHolder().setFormat(-1);
        this.surfaceView.getHolder().setFormat(-2);
    }

    public MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public VideoSurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    public MediaPlayer initMediaPlayer() {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = new MediaPlayer();
        }
        this.mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.luck.picture.lib.widget.MediaPlayerView.1
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i7, int i10) {
                MediaPlayerView.this.surfaceView.adjustVideoSize(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            }
        });
        return this.mediaPlayer;
    }

    public void release() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer.setOnPreparedListener(null);
            this.mediaPlayer.setOnCompletionListener(null);
            this.mediaPlayer.setOnErrorListener(null);
            this.mediaPlayer = null;
        }
    }

    public void start(String str) {
        try {
            if (PictureMimeType.isContent(str)) {
                this.mediaPlayer.setDataSource(getContext(), Uri.parse(str));
            } else {
                this.mediaPlayer.setDataSource(str);
            }
            this.mediaPlayer.prepareAsync();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        this.mediaPlayer.setAudioStreamType(3);
        this.mediaPlayer.setDisplay(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        init();
    }
}
