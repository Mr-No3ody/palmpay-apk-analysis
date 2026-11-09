package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelFileDescriptor f20523a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f20523a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f20523a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e10) {
            throw new IOException(e10);
        }
    }
}
