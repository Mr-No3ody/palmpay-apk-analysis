package com.google.mlkit.common.sdkinternal.model;

import N8.q0;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class LocalModelLoader {
    private MappedByteBuffer zza;
    private final Context zzb;
    private final LocalModel zzc;

    @KeepForSdk
    public LocalModelLoader(@NonNull Context context, @NonNull LocalModel localModel) {
        this.zzb = context;
        this.zzc = localModel;
    }

    @NonNull
    @KeepForSdk
    public LocalModel getLocalModel() {
        return this.zzc;
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public MappedByteBuffer load() throws MlKitException, IllegalAccessException, InvocationTargetException {
        Preconditions.checkNotNull(this.zzb, "Context can not be null");
        Preconditions.checkNotNull(this.zzc, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.zza;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        String absoluteFilePath = this.zzc.getAbsoluteFilePath();
        String assetFilePath = this.zzc.getAssetFilePath();
        Uri uri = this.zzc.getUri();
        if (absoluteFilePath != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(absoluteFilePath, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        this.zza = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        channel.close();
                        randomAccessFile.close();
                        return this.zza;
                    } catch (Throwable th) {
                        if (channel == null) {
                            throw th;
                        }
                        try {
                            channel.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                        throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e);
                    }
                } catch (Throwable th3) {
                    try {
                        randomAccessFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e10);
            }
        }
        if (assetFilePath != null) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.zzb.getAssets().openFd(assetFilePath);
                try {
                    FileChannel channel2 = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel();
                    try {
                        this.zza = channel2.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                        channel2.close();
                        assetFileDescriptorOpenFd.close();
                        return this.zza;
                    } catch (Throwable th5) {
                        if (channel2 == null) {
                            throw th5;
                        }
                        try {
                            channel2.close();
                            throw th5;
                        } catch (Throwable th6) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                            throw th5;
                        }
                        throw new MlKitException(q0.k("Can not load the file from asset: ", assetFilePath, ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"), 14, e);
                    }
                } catch (Throwable th7) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th7;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th7;
                    } catch (Throwable th8) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                        throw th7;
                    }
                }
            } catch (IOException e11) {
                throw new MlKitException(q0.k("Can not load the file from asset: ", assetFilePath, ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"), 14, e11);
            }
        }
        if (uri == null) {
            throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
        }
        try {
            AssetFileDescriptor assetFileDescriptorZza = zzi.zza(this.zzb, uri, "r");
            try {
                FileChannel channel3 = assetFileDescriptorZza.createInputStream().getChannel();
                try {
                    this.zza = channel3.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorZza.getStartOffset(), assetFileDescriptorZza.getLength());
                    channel3.close();
                    assetFileDescriptorZza.close();
                    return this.zza;
                } catch (Throwable th9) {
                    if (channel3 == null) {
                        throw th9;
                    }
                    try {
                        channel3.close();
                        throw th9;
                    } catch (Throwable th10) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th10);
                        throw th9;
                    }
                    throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e);
                }
            } catch (Throwable th11) {
                if (assetFileDescriptorZza == null) {
                    throw th11;
                }
                try {
                    assetFileDescriptorZza.close();
                    throw th11;
                } catch (Throwable th12) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th11, th12);
                    throw th11;
                }
            }
        } catch (IOException e12) {
            throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e12);
        }
    }
}
