package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class K extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f21488c;

    static {
        new J(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f21488c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final p109h3.e b(com.facebook.imagepipeline.request.d imageRequest) throws IOException {
        p109h3.e eVarA;
        InputStream inputStreamCreateInputStream;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        Uri uri = p333w2.a.f43254a;
        String path = sourceUri.getPath();
        ContentResolver contentResolver = this.f21488c;
        if (path == null || !FirebaseAnalytics.Param.CONTENT.equals(p333w2.a.b(sourceUri)) || !"com.android.contacts".equals(sourceUri.getAuthority()) || sourceUri.getPath().startsWith(p333w2.a.f43254a.getPath())) {
            String string = sourceUri.toString();
            if (string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(sourceUri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    eVarA = a((int) parcelFileDescriptorOpenFileDescriptor.getStatSize(), new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
                    Intrinsics.checkNotNullExpressionValue(eVarA, "getEncodedImage(...)");
                    parcelFileDescriptorOpenFileDescriptor.close();
                    if (eVarA != null) {
                        return eVarA;
                    }
                } catch (FileNotFoundException unused) {
                    eVarA = null;
                }
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(sourceUri);
            if (inputStreamOpenInputStream != null) {
                return a(-1, inputStreamOpenInputStream);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string2 = sourceUri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (kotlin.text.y.g(string2, "/photo", false)) {
            inputStreamCreateInputStream = contentResolver.openInputStream(sourceUri);
        } else {
            String string3 = sourceUri.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            if (kotlin.text.y.g(string3, "/display_photo", false)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(sourceUri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused2) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, sourceUri);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return a(-1, inputStreamCreateInputStream);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final String c() {
        return "LocalContentUriFetchProducer";
    }
}
