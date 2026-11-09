package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class E implements VideoDecoder$MediaInitializer, Downsampler$DecodeCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20896a;

    @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public void initializeExtractor(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f20896a) {
            case 0:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            case 1:
                mediaExtractor.setDataSource(new F((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f20896a) {
            case 0:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            case 1:
                mediaMetadataRetriever.setDataSource(new F((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks
    public void onObtainBounds() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks
    public void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) {
    }
}
