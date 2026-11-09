package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
@Deprecated
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void closeQuietly(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    @KeepForSdk
    public static boolean isGzipByteBuffer(@NonNull byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[0] & UnsignedBytes.MAX_VALUE)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@NonNull InputStream inputStream) throws IOException {
        return readInputStreamFully(inputStream, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static byte[] toByteArray(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    @KeepForSdk
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, boolean z3, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        long j6 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, i7);
                if (i10 == -1) {
                    break;
                }
                j6 += (long) i10;
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                if (z3) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z3) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j6;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@NonNull InputStream inputStream, boolean z3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z3, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
