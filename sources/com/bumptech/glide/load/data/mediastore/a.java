package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThumbnailQuery {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f20551c = {"_data"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f20552d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f20554b;

    public /* synthetic */ a(ContentResolver contentResolver, int i7) {
        this.f20553a = i7;
        this.f20554b = contentResolver;
    }

    @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
    public final Cursor query(Uri uri) {
        switch (this.f20553a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f20554b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f20551c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f20554b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f20552d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
