package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imageutils.JfifUtil;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class L extends P implements ThumbnailProducer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f21489d = {"_id", "_data"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f21490e = {"_data"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Rect f21491f = new Rect(0, 0, 512, MessageEvent.EVENT_GO_TO_PERSON_TRANSFER);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Rect f21492g = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f21493c;

    public L(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        this.f21493c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final p109h3.e b(com.facebook.imagepipeline.request.d dVar) {
        com.facebook.imagepipeline.common.g resizeOptions;
        p109h3.e eVarD;
        Uri sourceUri = dVar.getSourceUri();
        Uri uri = p333w2.a.f43254a;
        String string = sourceUri.toString();
        int autoRotateAngleFromOrientation = 0;
        if ((string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) && (resizeOptions = dVar.getResizeOptions()) != null) {
            Cursor cursorQuery = this.f21493c.query(sourceUri, f21489d, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToFirst() || (eVarD = d(resizeOptions, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                        cursorQuery.close();
                        return null;
                    }
                    int columnIndex = cursorQuery.getColumnIndex("_data");
                    if (columnIndex >= 0) {
                        String string2 = cursorQuery.getString(columnIndex);
                        if (string2 != null) {
                            try {
                                autoRotateAngleFromOrientation = JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(string2).getAttributeInt("Orientation", 1));
                            } catch (IOException e10) {
                                p229p2.b bVar = p229p2.a.f41180a;
                                if (bVar.isLoggable(6)) {
                                    bVar.e(L.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string2), e10);
                                }
                            }
                        }
                        eVarD.f37276c = autoRotateAngleFromOrientation;
                    }
                    cursorQuery.close();
                    return eVarD;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final String c() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    @Override // com.facebook.imagepipeline.producers.ThumbnailProducer
    public final boolean canProvideImageForSize(com.facebook.imagepipeline.common.g gVar) {
        Rect rect = f21491f;
        return io.fastkv.n.s(rect.width(), rect.height(), gVar);
    }

    public final p109h3.e d(com.facebook.imagepipeline.common.g gVar, long j6) {
        int i7;
        int columnIndex;
        Rect rect = f21492g;
        if (io.fastkv.n.s(rect.width(), rect.height(), gVar)) {
            i7 = 3;
        } else {
            Rect rect2 = f21491f;
            i7 = io.fastkv.n.s(rect2.width(), rect2.height(), gVar) ? 1 : 0;
        }
        if (i7 != 0) {
            Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f21493c, j6, i7, f21490e);
            if (cursorQueryMiniThumbnail != null) {
                try {
                    if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                        String string = cursorQueryMiniThumbnail.getString(columnIndex);
                        string.getClass();
                        if (new File(string).exists()) {
                            return a((int) new File(string).length(), new FileInputStream(string));
                        }
                    }
                    return null;
                } finally {
                    cursorQueryMiniThumbnail.close();
                }
            }
        }
        return null;
    }
}
