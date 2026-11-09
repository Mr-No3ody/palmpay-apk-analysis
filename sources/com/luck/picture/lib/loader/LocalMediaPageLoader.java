package com.luck.picture.lib.loader;

import C0.G;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.FileSizeUnit;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.entity.MediaData;
import com.luck.picture.lib.interfaces.OnQueryAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.luck.picture.lib.utils.MediaUtils;
import com.luck.picture.lib.utils.PictureFileUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.SortUtils;
import com.luck.picture.lib.utils.ValueOf;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalMediaPageLoader extends IBridgeMediaLoader {
    public LocalMediaPageLoader(Context context, SelectorConfig selectorConfig) {
        super(context, selectorConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFirstCoverMimeType(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFirstUri(Cursor cursor) {
        return MediaUtils.getRealPathUri(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFirstUrl(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageSelection(long j6) {
        String durationCondition = getDurationCondition();
        String fileSizeCondition = getFileSizeCondition();
        int i7 = getConfig().chooseMode;
        if (i7 == 0) {
            return getPageSelectionArgsForAllMediaCondition(j6, getImageMimeTypeCondition(), getVideoMimeTypeCondition(), durationCondition, fileSizeCondition);
        }
        if (i7 == 1) {
            return getPageSelectionArgsForImageMediaCondition(j6, getImageMimeTypeCondition(), fileSizeCondition);
        }
        if (i7 == 2) {
            return getPageSelectionArgsForVideoMediaCondition(j6, getVideoMimeTypeCondition(), durationCondition, fileSizeCondition);
        }
        if (i7 != 3) {
            return null;
        }
        return getPageSelectionArgsForAudioMediaCondition(j6, getAudioMimeTypeCondition(), durationCondition, fileSizeCondition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] getPageSelectionArgs(long j6) {
        int i7 = getConfig().chooseMode;
        if (i7 == 0) {
            return j6 == -1 ? new String[]{String.valueOf(1), String.valueOf(3)} : new String[]{String.valueOf(1), String.valueOf(3), ValueOf.toString(Long.valueOf(j6))};
        }
        if (i7 == 1) {
            return getSelectionArgsForPageSingleMediaType(1, j6);
        }
        if (i7 == 2) {
            return getSelectionArgsForPageSingleMediaType(3, j6);
        }
        if (i7 != 3) {
            return null;
        }
        return getSelectionArgsForPageSingleMediaType(2, j6);
    }

    private static String getPageSelectionArgsForAllMediaCondition(long j6, String str, String str2, String str3, String str4) {
        StringBuilder sbF = F.f("(media_type=?", str, " OR media_type=?", str2, " AND ");
        sbF.append(str3);
        sbF.append(") AND ");
        if (j6 != -1) {
            return G.r(sbF, "bucket_id=? AND ", str4);
        }
        sbF.append(str4);
        return sbF.toString();
    }

    private static String getPageSelectionArgsForAudioMediaCondition(long j6, String str, String str2, String str3) {
        StringBuilder sbF = F.f("(media_type=?", str, " AND ", str2, ") AND ");
        if (j6 != -1) {
            return G.r(sbF, "bucket_id=? AND ", str3);
        }
        sbF.append(str3);
        return sbF.toString();
    }

    private static String getPageSelectionArgsForImageMediaCondition(long j6, String str, String str2) {
        StringBuilder sb2 = new StringBuilder("(media_type=?");
        return j6 == -1 ? F.d(sb2, str, ") AND ", str2) : F.d(sb2, str, ") AND bucket_id=? AND ", str2);
    }

    private static String getPageSelectionArgsForVideoMediaCondition(long j6, String str, String str2, String str3) {
        StringBuilder sbF = F.f("(media_type=?", str, " AND ", str2, ") AND ");
        if (j6 != -1) {
            return G.r(sbF, "bucket_id=? AND ", str3);
        }
        sbF.append(str3);
        return sbF.toString();
    }

    private String getSelectionArgsForAllMediaCondition(String str, String str2, String str3, String str4) {
        StringBuilder sbF = F.f("(media_type=?", str3, " OR media_type=?", str4, " AND ");
        u.w(sbF, str, ") AND ", str2);
        if (isWithAllQuery()) {
            return sbF.toString();
        }
        sbF.append(") GROUP BY (bucket_id");
        return sbF.toString();
    }

    private String getSelectionArgsForAudioMediaCondition(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (isWithAllQuery()) {
            return G.s(sb2, "media_type=?", str2, " AND ", str);
        }
        u.x(sb2, "(media_type=?", str2, ") AND ", str);
        sb2.append(") GROUP BY (bucket_id");
        return sb2.toString();
    }

    private String getSelectionArgsForImageMediaCondition(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (isWithAllQuery()) {
            return G.s(sb2, "media_type=?", str2, " AND ", str);
        }
        u.x(sb2, "(media_type=?", str2, ") AND ", str);
        sb2.append(") GROUP BY (bucket_id");
        return sb2.toString();
    }

    private static String[] getSelectionArgsForPageSingleMediaType(int i7, long j6) {
        return j6 == -1 ? new String[]{String.valueOf(i7)} : new String[]{String.valueOf(i7), ValueOf.toString(Long.valueOf(j6))};
    }

    private String getSelectionArgsForVideoMediaCondition(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (isWithAllQuery()) {
            return G.s(sb2, "media_type=?", str2, " AND ", str);
        }
        u.x(sb2, "(media_type=?", str2, ") AND ", str);
        sb2.append(") GROUP BY (bucket_id");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isWithAllQuery() {
        if (SdkVersionUtils.isQ()) {
            return true;
        }
        return getConfig().isPageSyncAsCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void synchronousFirstCover(List<LocalMediaFolder> list) throws Throwable {
        for (int i7 = 0; i7 < list.size(); i7++) {
            LocalMediaFolder localMediaFolder = list.get(i7);
            if (localMediaFolder != null) {
                String albumFirstCover = getAlbumFirstCover(localMediaFolder.getBucketId());
                if (!TextUtils.isEmpty(albumFirstCover)) {
                    localMediaFolder.setFirstImagePath(albumFirstCover);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public String getAlbumFirstCover(long j6) throws Throwable {
        Throwable th;
        Exception exc;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2 = null;
        try {
            if (SdkVersionUtils.isR()) {
                cursorQuery = getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, new String[]{"_id", "mime_type", "_data"}, MediaUtils.createQueryArgsBundle(getPageSelection(j6), getPageSelectionArgs(j6), 1, 0, getSortOrder()), null);
            } else {
                cursorQuery = getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, new String[]{"_id", "mime_type", "_data"}, getPageSelection(j6), getPageSelectionArgs(j6), getSortOrder() + " limit 1 offset 0");
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        if (cursorQuery.moveToFirst()) {
                            String realPathUri = SdkVersionUtils.isQ() ? MediaUtils.getRealPathUri(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"))) : cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return realPathUri;
                        }
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                            return null;
                        }
                    } else if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                        return null;
                    }
                } catch (Exception e10) {
                    cursor = cursorQuery;
                    exc = e10;
                    try {
                        exc.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null || cursor2.isClosed()) {
                            throw th;
                        }
                        cursor2.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    cursor2 = cursorQuery;
                    th = th3;
                    if (cursor2 != null) {
                        throw th;
                    }
                    throw th;
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
                return null;
            }
        } catch (Exception e11) {
            exc = e11;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
        return null;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public String getSelection() {
        String durationCondition = getDurationCondition();
        String fileSizeCondition = getFileSizeCondition();
        int i7 = getConfig().chooseMode;
        if (i7 == 0) {
            return getSelectionArgsForAllMediaCondition(durationCondition, fileSizeCondition, getImageMimeTypeCondition(), getVideoMimeTypeCondition());
        }
        if (i7 == 1) {
            return getSelectionArgsForImageMediaCondition(fileSizeCondition, getImageMimeTypeCondition());
        }
        if (i7 == 2) {
            return getSelectionArgsForVideoMediaCondition(durationCondition, getVideoMimeTypeCondition());
        }
        if (i7 != 3) {
            return null;
        }
        return getSelectionArgsForAudioMediaCondition(durationCondition, getAudioMimeTypeCondition());
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public String[] getSelectionArgs() {
        int i7 = getConfig().chooseMode;
        if (i7 == 0) {
            return new String[]{String.valueOf(1), String.valueOf(3)};
        }
        if (i7 == 1) {
            return new String[]{String.valueOf(1)};
        }
        if (i7 == 2) {
            return new String[]{String.valueOf(3)};
        }
        if (i7 != 3) {
            return null;
        }
        return new String[]{String.valueOf(2)};
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public String getSortOrder() {
        return TextUtils.isEmpty(getConfig().sortOrder) ? "date_modified DESC" : getConfig().sortOrder;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadAllAlbum(final OnQueryAllAlbumListener<LocalMediaFolder> onQueryAllAlbumListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<List<LocalMediaFolder>>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.3
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public List<LocalMediaFolder> doInBackground() {
                int folderTotalNum;
                String string;
                Context context;
                int i7;
                Cursor cursorQuery = LocalMediaPageLoader.this.getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, LocalMediaPageLoader.this.isWithAllQuery() ? IBridgeMediaLoader.PROJECTION : IBridgeMediaLoader.ALL_PROJECTION, LocalMediaPageLoader.this.getSelection(), LocalMediaPageLoader.this.getSelectionArgs(), LocalMediaPageLoader.this.getSortOrder());
                try {
                    if (cursorQuery != null) {
                        try {
                            int count = cursorQuery.getCount();
                            ArrayList<LocalMediaFolder> arrayList = new ArrayList();
                            if (count > 0) {
                                if (LocalMediaPageLoader.this.isWithAllQuery()) {
                                    HashMap map = new HashMap();
                                    HashSet hashSet = new HashSet();
                                    while (cursorQuery.moveToNext()) {
                                        if (LocalMediaPageLoader.this.getConfig().isPageSyncAsCount) {
                                            LocalMedia localMedia = LocalMediaPageLoader.this.parseLocalMedia(cursorQuery, true);
                                            if (localMedia != null) {
                                                localMedia.recycle();
                                            }
                                        }
                                        long j6 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                        Long l5 = (Long) map.get(Long.valueOf(j6));
                                        map.put(Long.valueOf(j6), l5 == null ? 1L : Long.valueOf(l5.longValue() + 1));
                                        if (!hashSet.contains(Long.valueOf(j6))) {
                                            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                                            localMediaFolder.setBucketId(j6);
                                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                                            if (map.containsKey(Long.valueOf(j6))) {
                                                Long l6 = (Long) map.get(Long.valueOf(j6));
                                                l6.longValue();
                                                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                                                localMediaFolder.setFolderName(string2);
                                                localMediaFolder.setFolderTotalNum(ValueOf.toInt(l6));
                                                localMediaFolder.setFirstImagePath(MediaUtils.getRealPathUri(j10, string3));
                                                localMediaFolder.setFirstMimeType(string3);
                                                arrayList.add(localMediaFolder);
                                                hashSet = hashSet;
                                                hashSet.add(Long.valueOf(j6));
                                            }
                                        }
                                    }
                                    folderTotalNum = 0;
                                    for (LocalMediaFolder localMediaFolder2 : arrayList) {
                                        int i10 = ValueOf.toInt(map.get(Long.valueOf(localMediaFolder2.getBucketId())));
                                        localMediaFolder2.setFolderTotalNum(i10);
                                        folderTotalNum += i10;
                                    }
                                } else {
                                    cursorQuery.moveToFirst();
                                    int i11 = 0;
                                    do {
                                        String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                        String string5 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                        String string6 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                                        long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                        int i12 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(CodePushConstants.LATEST_ROLLBACK_COUNT_KEY));
                                        LocalMediaFolder localMediaFolder3 = new LocalMediaFolder();
                                        localMediaFolder3.setBucketId(j11);
                                        localMediaFolder3.setFirstImagePath(string4);
                                        localMediaFolder3.setFolderName(string5);
                                        localMediaFolder3.setFirstMimeType(string6);
                                        localMediaFolder3.setFolderTotalNum(i12);
                                        arrayList.add(localMediaFolder3);
                                        i11 += i12;
                                    } while (cursorQuery.moveToNext());
                                    folderTotalNum = i11;
                                }
                                LocalMediaFolder localMediaFolder4 = new LocalMediaFolder();
                                LocalMediaFolder localMediaFolderLoadInAppSandboxFolderFile = SandboxFileLoader.loadInAppSandboxFolderFile(LocalMediaPageLoader.this.getContext(), LocalMediaPageLoader.this.getConfig().sandboxDir);
                                if (localMediaFolderLoadInAppSandboxFolderFile != null) {
                                    arrayList.add(localMediaFolderLoadInAppSandboxFolderFile);
                                    long jLastModified = new File(localMediaFolderLoadInAppSandboxFolderFile.getFirstImagePath()).lastModified();
                                    folderTotalNum += localMediaFolderLoadInAppSandboxFolderFile.getFolderTotalNum();
                                    localMediaFolder4.setData(new ArrayList<>());
                                    if (cursorQuery.moveToFirst()) {
                                        localMediaFolder4.setFirstImagePath(SdkVersionUtils.isQ() ? LocalMediaPageLoader.getFirstUri(cursorQuery) : LocalMediaPageLoader.getFirstUrl(cursorQuery));
                                        localMediaFolder4.setFirstMimeType(LocalMediaPageLoader.getFirstCoverMimeType(cursorQuery));
                                        if (jLastModified > (PictureMimeType.isContent(localMediaFolder4.getFirstImagePath()) ? new File(PictureFileUtils.getPath(LocalMediaPageLoader.this.getContext(), Uri.parse(localMediaFolder4.getFirstImagePath()))).lastModified() : new File(localMediaFolder4.getFirstImagePath()).lastModified())) {
                                            localMediaFolder4.setFirstImagePath(localMediaFolderLoadInAppSandboxFolderFile.getFirstImagePath());
                                            localMediaFolder4.setFirstMimeType(localMediaFolderLoadInAppSandboxFolderFile.getFirstMimeType());
                                        }
                                    }
                                } else if (cursorQuery.moveToFirst()) {
                                    localMediaFolder4.setFirstImagePath(SdkVersionUtils.isQ() ? LocalMediaPageLoader.getFirstUri(cursorQuery) : LocalMediaPageLoader.getFirstUrl(cursorQuery));
                                    localMediaFolder4.setFirstMimeType(LocalMediaPageLoader.getFirstCoverMimeType(cursorQuery));
                                }
                                if (folderTotalNum != 0) {
                                    SortUtils.sortFolder(arrayList);
                                    localMediaFolder4.setFolderTotalNum(folderTotalNum);
                                    localMediaFolder4.setBucketId(-1L);
                                    if (TextUtils.isEmpty(LocalMediaPageLoader.this.getConfig().defaultAlbumName)) {
                                        if (LocalMediaPageLoader.this.getConfig().chooseMode == SelectMimeType.ofAudio()) {
                                            context = LocalMediaPageLoader.this.getContext();
                                            i7 = R.string.ps_all_audio;
                                        } else {
                                            context = LocalMediaPageLoader.this.getContext();
                                            i7 = R.string.ps_camera_roll;
                                        }
                                        string = context.getString(i7);
                                    } else {
                                        string = LocalMediaPageLoader.this.getConfig().defaultAlbumName;
                                    }
                                    localMediaFolder4.setFolderName(string);
                                    arrayList.add(0, localMediaFolder4);
                                    if (LocalMediaPageLoader.this.getConfig().isSyncCover && LocalMediaPageLoader.this.getConfig().chooseMode == SelectMimeType.ofAll()) {
                                        LocalMediaPageLoader.this.synchronousFirstCover(arrayList);
                                    }
                                    if (!cursorQuery.isClosed()) {
                                        cursorQuery.close();
                                    }
                                } else if (!cursorQuery.isClosed()) {
                                    cursorQuery.close();
                                    return arrayList;
                                }
                                return arrayList;
                            }
                            if (cursorQuery != null && !cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            String str = IBridgeMediaLoader.TAG;
                            e10.getMessage();
                            if (!cursorQuery.isClosed()) {
                            }
                            return new ArrayList();
                        }
                    } else if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return new ArrayList();
                } catch (Throwable th) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(List<LocalMediaFolder> list) {
                PictureThreadUtils.cancel(this);
                LocalMedia.destroyPool();
                OnQueryAllAlbumListener onQueryAllAlbumListener2 = onQueryAllAlbumListener;
                if (onQueryAllAlbumListener2 != null) {
                    onQueryAllAlbumListener2.onComplete(list);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadOnlyInAppDirAllMedia(final OnQueryAlbumListener<LocalMediaFolder> onQueryAlbumListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<LocalMediaFolder>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public LocalMediaFolder doInBackground() {
                return SandboxFileLoader.loadInAppSandboxFolderFile(LocalMediaPageLoader.this.getContext(), LocalMediaPageLoader.this.getConfig().sandboxDir);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(LocalMediaFolder localMediaFolder) {
                PictureThreadUtils.cancel(this);
                OnQueryAlbumListener onQueryAlbumListener2 = onQueryAlbumListener;
                if (onQueryAlbumListener2 != null) {
                    onQueryAlbumListener2.onComplete(localMediaFolder);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadPageMediaData(final long j6, final int i7, final int i10, final OnQueryDataResultListener<LocalMedia> onQueryDataResultListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaData>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.1
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaData doInBackground() {
                String sortOrder;
                Cursor cursorQuery;
                ArrayList<LocalMedia> arrayListLoadInAppSandboxFile;
                Cursor cursor = null;
                try {
                    try {
                        boolean z3 = true;
                        if (SdkVersionUtils.isR()) {
                            String pageSelection = LocalMediaPageLoader.this.getPageSelection(j6);
                            String[] pageSelectionArgs = LocalMediaPageLoader.this.getPageSelectionArgs(j6);
                            int i11 = i10;
                            cursorQuery = LocalMediaPageLoader.this.getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, IBridgeMediaLoader.PROJECTION, MediaUtils.createQueryArgsBundle(pageSelection, pageSelectionArgs, i11, (i7 - 1) * i11, LocalMediaPageLoader.this.getSortOrder()), null);
                        } else {
                            if (i7 == -1) {
                                sortOrder = LocalMediaPageLoader.this.getSortOrder();
                            } else {
                                sortOrder = LocalMediaPageLoader.this.getSortOrder() + " limit " + i10 + " offset " + ((i7 - 1) * i10);
                            }
                            cursorQuery = LocalMediaPageLoader.this.getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, IBridgeMediaLoader.PROJECTION, LocalMediaPageLoader.this.getPageSelection(j6), LocalMediaPageLoader.this.getPageSelectionArgs(j6), sortOrder);
                        }
                        cursor = cursorQuery;
                        if (cursor == null) {
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return new MediaData();
                        }
                        ArrayList arrayList = new ArrayList();
                        if (cursor.getCount() > 0) {
                            cursor.moveToFirst();
                            do {
                                LocalMedia localMedia = LocalMediaPageLoader.this.parseLocalMedia(cursor, false);
                                if (localMedia != null) {
                                    arrayList.add(localMedia);
                                }
                            } while (cursor.moveToNext());
                        }
                        if (j6 == -1 && i7 == 1 && (arrayListLoadInAppSandboxFile = SandboxFileLoader.loadInAppSandboxFile(LocalMediaPageLoader.this.getContext(), LocalMediaPageLoader.this.getConfig().sandboxDir)) != null) {
                            arrayList.addAll(arrayListLoadInAppSandboxFile);
                            SortUtils.sortLocalMediaAddedTime(arrayList);
                        }
                        if (cursor.getCount() <= 0) {
                            z3 = false;
                        }
                        MediaData mediaData = new MediaData(z3, arrayList);
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                        return mediaData;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        String str = IBridgeMediaLoader.TAG;
                        e10.getMessage();
                        MediaData mediaData2 = new MediaData();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return mediaData2;
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaData mediaData) {
                PictureThreadUtils.cancel(this);
                OnQueryDataResultListener onQueryDataResultListener2 = onQueryDataResultListener;
                if (onQueryDataResultListener2 != null) {
                    ArrayList<LocalMedia> arrayList = mediaData.data;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    onQueryDataResultListener2.onComplete(arrayList, mediaData.isHasNextMore);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public LocalMedia parseLocalMedia(Cursor cursor, boolean z3) {
        int i7;
        String[] strArr = IBridgeMediaLoader.PROJECTION;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(strArr[0]);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(strArr[1]);
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(strArr[2]);
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(strArr[3]);
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(strArr[4]);
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(strArr[5]);
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(strArr[6]);
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow(strArr[7]);
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow(strArr[8]);
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow(strArr[9]);
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow(strArr[10]);
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow(strArr[11]);
        long j6 = cursor.getLong(columnIndexOrThrow);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String realPathUri = SdkVersionUtils.isQ() ? MediaUtils.getRealPathUri(j6, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = PictureMimeType.ofJPEG();
        }
        if (getConfig().isFilterInvalidFile) {
            if (PictureMimeType.isHasImage(string)) {
                if (!TextUtils.isEmpty(string2) && !PictureFileUtils.isImageFileExists(string2)) {
                    return null;
                }
            } else if (!PictureFileUtils.isFileExists(string2)) {
                return null;
            }
        }
        if (string.endsWith(SelectMimeType.SYSTEM_IMAGE)) {
            String mimeTypeFromMediaUrl = MediaUtils.getMimeTypeFromMediaUrl(string2);
            if (!getConfig().isGif && PictureMimeType.isHasGif(mimeTypeFromMediaUrl)) {
                return null;
            }
            string = mimeTypeFromMediaUrl;
        }
        if (string.endsWith(SelectMimeType.SYSTEM_IMAGE)) {
            return null;
        }
        if (!getConfig().isWebp && string.startsWith(PictureMimeType.ofWEBP())) {
            return null;
        }
        if (!getConfig().isBmp && PictureMimeType.isHasBmp(string)) {
            return null;
        }
        if (!getConfig().isHeic && PictureMimeType.isHasHeic(string)) {
            return null;
        }
        int i10 = cursor.getInt(columnIndexOrThrow4);
        int i11 = cursor.getInt(columnIndexOrThrow5);
        int i12 = cursor.getInt(columnIndexOrThrow12);
        if (i12 == 90 || i12 == 270) {
            i7 = cursor.getInt(columnIndexOrThrow5);
            i11 = cursor.getInt(columnIndexOrThrow4);
        } else {
            i7 = i10;
        }
        int i13 = i11;
        long j10 = cursor.getLong(columnIndexOrThrow6);
        long j11 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        long j12 = cursor.getLong(columnIndexOrThrow10);
        long j13 = cursor.getLong(columnIndexOrThrow11);
        String urlToFileName = TextUtils.isEmpty(string4) ? PictureMimeType.getUrlToFileName(string2) : string4;
        if (getConfig().isFilterSizeDuration && j11 > 0 && j11 < FileSizeUnit.KB) {
            return null;
        }
        if (PictureMimeType.isHasVideo(string) || PictureMimeType.isHasAudio(string)) {
            if (getConfig().filterVideoMinSecond > 0 && j10 < getConfig().filterVideoMinSecond) {
                return null;
            }
            if (getConfig().filterVideoMaxSecond > 0 && j10 > getConfig().filterVideoMaxSecond) {
                return null;
            }
            if (getConfig().isFilterSizeDuration && j10 <= 0) {
                return null;
            }
        } else {
            j13 = j13;
        }
        LocalMedia localMediaObtain = z3 ? LocalMedia.obtain() : LocalMedia.create();
        localMediaObtain.setId(j6);
        localMediaObtain.setBucketId(j12);
        localMediaObtain.setPath(realPathUri);
        localMediaObtain.setRealPath(string2);
        localMediaObtain.setFileName(urlToFileName);
        localMediaObtain.setParentFolderName(string3);
        localMediaObtain.setDuration(j10);
        localMediaObtain.setChooseModel(getConfig().chooseMode);
        localMediaObtain.setMimeType(string);
        localMediaObtain.setWidth(i7);
        localMediaObtain.setHeight(i13);
        localMediaObtain.setSize(j11);
        localMediaObtain.setDateAddedTime(j13);
        OnQueryFilterListener onQueryFilterListener = this.mConfig.onQueryFilterListener;
        if (onQueryFilterListener == null || !onQueryFilterListener.onFilter(localMediaObtain)) {
            return localMediaObtain;
        }
        return null;
    }
}
