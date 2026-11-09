package org.chromium.net.apihelpers;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements UploadDataProviders$FileChannelProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41015b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f41014a = i7;
        this.f41015b = obj;
    }

    @Override // org.chromium.net.apihelpers.UploadDataProviders$FileChannelProvider
    public final FileChannel getChannel() throws IOException {
        switch (this.f41014a) {
            case 0:
                return new FileInputStream((File) this.f41015b).getChannel();
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f41015b;
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
        }
    }
}
