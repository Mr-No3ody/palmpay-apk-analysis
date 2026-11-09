package com.luck.picture.lib.loader;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.interfaces.OnQueryAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IBridgeMediaLoader {
    protected static final String COLUMN_COUNT = "count";
    protected static final String DISTINCT_BUCKET_Id = "DISTINCT bucket_id";
    protected static final String GROUP_BY_BUCKET_Id = " GROUP BY (bucket_id";
    protected static final int MAX_SORT_SIZE = 60;
    protected static final String NOT_BMP = " AND (mime_type!='image/bmp')";
    protected static final String NOT_GIF = " AND (mime_type!='image/gif')";
    protected static final String NOT_HEIC = " AND (mime_type!='image/heic')";
    protected static final String NOT_VND_WAP_BMP = " AND (mime_type!='image/vnd.wap.wbmp')";
    protected static final String NOT_WEBP = " AND (mime_type!='image/webp')";
    protected static final String NOT_XMS_BMP = " AND (mime_type!='image/x-ms-bmp')";
    protected static final String ORDER_BY = "date_modified DESC";
    protected static final String TAG = "IBridgeMediaLoader";
    protected final SelectorConfig mConfig;
    private final Context mContext;
    protected static final Uri QUERY_URI = MediaStore.Files.getContentUri("external");
    protected static final String COLUMN_DURATION = "duration";
    protected static final String COLUMN_BUCKET_DISPLAY_NAME = "bucket_display_name";
    protected static final String COLUMN_BUCKET_ID = "bucket_id";
    protected static final String COLUMN_ORIENTATION = "orientation";
    protected static final String[] PROJECTION = {"_id", "_data", "mime_type", "width", "height", COLUMN_DURATION, "_size", COLUMN_BUCKET_DISPLAY_NAME, "_display_name", COLUMN_BUCKET_ID, "date_added", COLUMN_ORIENTATION};
    protected static final String[] ALL_PROJECTION = {"_id", "_data", "mime_type", "width", "height", COLUMN_DURATION, "_size", COLUMN_BUCKET_DISPLAY_NAME, "_display_name", COLUMN_BUCKET_ID, "date_added", COLUMN_ORIENTATION, "COUNT(*) AS count"};

    public IBridgeMediaLoader(Context context, SelectorConfig selectorConfig) {
        this.mContext = context;
        this.mConfig = selectorConfig;
    }

    public abstract String getAlbumFirstCover(long j6);

    public String getAudioMimeTypeCondition() {
        List<String> list = getConfig().queryOnlyAudioList;
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (i7 < list.size()) {
            String str = list.get(i7);
            sb2.append(i7 == 0 ? " AND " : " OR ");
            sb2.append("mime_type='");
            sb2.append(str);
            sb2.append("'");
            i7++;
        }
        return sb2.toString();
    }

    public SelectorConfig getConfig() {
        return this.mConfig;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDurationCondition() {
        return String.format(Locale.CHINA, "%d <%s duration and duration <= %d", Long.valueOf(Math.max(0L, getConfig().filterVideoMinSecond)), "=", Long.valueOf(getConfig().filterVideoMaxSecond == 0 ? Long.MAX_VALUE : getConfig().filterVideoMaxSecond));
    }

    public String getFileSizeCondition() {
        return String.format(Locale.CHINA, "%d <%s _size and _size <= %d", Long.valueOf(Math.max(0L, getConfig().filterMinFileSize)), "=", Long.valueOf(getConfig().filterMaxFileSize == 0 ? Long.MAX_VALUE : getConfig().filterMaxFileSize));
    }

    public String getImageMimeTypeCondition() {
        List<String> list = getConfig().queryOnlyImageList;
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (i7 < list.size()) {
            String str = list.get(i7);
            sb2.append(i7 == 0 ? " AND " : " OR ");
            sb2.append("mime_type='");
            sb2.append(str);
            sb2.append("'");
            i7++;
        }
        if (!getConfig().isGif && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofGIF())) {
            sb2.append(NOT_GIF);
        }
        if (!getConfig().isWebp && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofWEBP())) {
            sb2.append(NOT_WEBP);
        }
        if (!getConfig().isBmp && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofBMP()) && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofXmsBMP()) && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofWapBMP())) {
            sb2.append(" AND (mime_type!='image/bmp') AND (mime_type!='image/x-ms-bmp') AND (mime_type!='image/vnd.wap.wbmp')");
        }
        if (!getConfig().isHeic && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofHeic())) {
            sb2.append(NOT_HEIC);
        }
        return sb2.toString();
    }

    public abstract String getSelection();

    public abstract String[] getSelectionArgs();

    public abstract String getSortOrder();

    public String getVideoMimeTypeCondition() {
        List<String> list = getConfig().queryOnlyVideoList;
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (i7 < list.size()) {
            String str = list.get(i7);
            sb2.append(i7 == 0 ? " AND " : " OR ");
            sb2.append("mime_type='");
            sb2.append(str);
            sb2.append("'");
            i7++;
        }
        return sb2.toString();
    }

    public abstract void loadAllAlbum(OnQueryAllAlbumListener<LocalMediaFolder> onQueryAllAlbumListener);

    public abstract void loadOnlyInAppDirAllMedia(OnQueryAlbumListener<LocalMediaFolder> onQueryAlbumListener);

    public abstract void loadPageMediaData(long j6, int i7, int i10, OnQueryDataResultListener<LocalMedia> onQueryDataResultListener);

    public abstract LocalMedia parseLocalMedia(Cursor cursor, boolean z3);
}
