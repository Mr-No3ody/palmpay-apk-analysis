package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.QualityInfo;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressiveJpegConfig {
    boolean decodeProgressively();

    int getNextScanNumberToDecode(int i7);

    QualityInfo getQualityInfo(int i7);
}
