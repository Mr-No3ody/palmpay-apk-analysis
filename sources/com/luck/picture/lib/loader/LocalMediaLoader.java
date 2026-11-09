package com.luck.picture.lib.loader;

import C0.G;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.FileSizeUnit;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.interfaces.OnQueryAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.luck.picture.lib.utils.MediaUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.SortUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalMediaLoader extends IBridgeMediaLoader {
    public LocalMediaLoader(Context context, SelectorConfig selectorConfig) {
        super(context, selectorConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LocalMediaFolder getImageFolder(String str, String str2, String str3, List<LocalMediaFolder> list) {
        for (LocalMediaFolder localMediaFolder : list) {
            String folderName = localMediaFolder.getFolderName();
            if (!TextUtils.isEmpty(folderName) && TextUtils.equals(folderName, str3)) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.setFolderName(str3);
        localMediaFolder2.setFirstImagePath(str);
        localMediaFolder2.setFirstMimeType(str2);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }

    private static String getSelectionArgsForAllMediaCondition(String str, String str2, String str3, String str4) {
        return F.d(F.f("(media_type=?", str3, " OR media_type=?", str4, " AND "), str, ") AND ", str2);
    }

    private static String getSelectionArgsForAudioMediaCondition(String str, String str2) {
        return G.p("media_type=?", str2, " AND ", str);
    }

    private static String getSelectionArgsForImageMediaCondition(String str, String str2) {
        return G.p("media_type=?", str2, " AND ", str);
    }

    private static String getSelectionArgsForVideoMediaCondition(String str, String str2) {
        return G.p("media_type=?", str2, " AND ", str);
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public String getAlbumFirstCover(long j6) {
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
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<List<LocalMediaFolder>>() { // from class: com.luck.picture.lib.loader.LocalMediaLoader.1
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public List<LocalMediaFolder> doInBackground() {
                String string;
                Context context;
                int i7;
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = LocalMediaLoader.this.getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, IBridgeMediaLoader.PROJECTION, LocalMediaLoader.this.getSelection(), LocalMediaLoader.this.getSelectionArgs(), LocalMediaLoader.this.getSortOrder());
                try {
                    if (cursorQuery != null) {
                        try {
                            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                            ArrayList<LocalMedia> arrayList2 = new ArrayList<>();
                            if (cursorQuery.getCount() > 0) {
                                cursorQuery.moveToFirst();
                                do {
                                    LocalMedia localMedia = LocalMediaLoader.this.parseLocalMedia(cursorQuery, false);
                                    if (localMedia != null) {
                                        LocalMediaFolder imageFolder = LocalMediaLoader.this.getImageFolder(localMedia.getPath(), localMedia.getMimeType(), localMedia.getParentFolderName(), arrayList);
                                        imageFolder.setBucketId(localMedia.getBucketId());
                                        imageFolder.getData().add(localMedia);
                                        imageFolder.setFolderTotalNum(imageFolder.getFolderTotalNum() + 1);
                                        imageFolder.setBucketId(localMedia.getBucketId());
                                        arrayList2.add(localMedia);
                                        localMediaFolder.setFolderTotalNum(localMediaFolder.getFolderTotalNum() + 1);
                                    }
                                } while (cursorQuery.moveToNext());
                                LocalMediaFolder localMediaFolderLoadInAppSandboxFolderFile = SandboxFileLoader.loadInAppSandboxFolderFile(LocalMediaLoader.this.getContext(), LocalMediaLoader.this.getConfig().sandboxDir);
                                if (localMediaFolderLoadInAppSandboxFolderFile != null) {
                                    arrayList.add(localMediaFolderLoadInAppSandboxFolderFile);
                                    localMediaFolder.setFolderTotalNum(localMediaFolder.getFolderTotalNum() + localMediaFolderLoadInAppSandboxFolderFile.getFolderTotalNum());
                                    localMediaFolder.setData(localMediaFolderLoadInAppSandboxFolderFile.getData());
                                    arrayList2.addAll(0, localMediaFolderLoadInAppSandboxFolderFile.getData());
                                    if (60 > localMediaFolderLoadInAppSandboxFolderFile.getFolderTotalNum()) {
                                        if (arrayList2.size() > 60) {
                                            SortUtils.sortLocalMediaAddedTime(arrayList2.subList(0, 60));
                                        } else {
                                            SortUtils.sortLocalMediaAddedTime(arrayList2);
                                        }
                                    }
                                }
                                if (arrayList2.size() > 0) {
                                    SortUtils.sortFolder(arrayList);
                                    arrayList.add(0, localMediaFolder);
                                    localMediaFolder.setFirstImagePath(arrayList2.get(0).getPath());
                                    localMediaFolder.setFirstMimeType(arrayList2.get(0).getMimeType());
                                    if (TextUtils.isEmpty(LocalMediaLoader.this.getConfig().defaultAlbumName)) {
                                        if (LocalMediaLoader.this.getConfig().chooseMode == SelectMimeType.ofAudio()) {
                                            context = LocalMediaLoader.this.getContext();
                                            i7 = R.string.ps_all_audio;
                                        } else {
                                            context = LocalMediaLoader.this.getContext();
                                            i7 = R.string.ps_camera_roll;
                                        }
                                        string = context.getString(i7);
                                    } else {
                                        string = LocalMediaLoader.this.getConfig().defaultAlbumName;
                                    }
                                    localMediaFolder.setFolderName(string);
                                    localMediaFolder.setBucketId(-1L);
                                    localMediaFolder.setData(arrayList2);
                                }
                            }
                            if (cursorQuery != null && !cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                        }
                    } else if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
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
                OnQueryAllAlbumListener onQueryAllAlbumListener2 = onQueryAllAlbumListener;
                if (onQueryAllAlbumListener2 != null) {
                    onQueryAllAlbumListener2.onComplete(list);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadOnlyInAppDirAllMedia(final OnQueryAlbumListener<LocalMediaFolder> onQueryAlbumListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<LocalMediaFolder>() { // from class: com.luck.picture.lib.loader.LocalMediaLoader.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public LocalMediaFolder doInBackground() {
                return SandboxFileLoader.loadInAppSandboxFolderFile(LocalMediaLoader.this.getContext(), LocalMediaLoader.this.getConfig().sandboxDir);
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
    public void loadPageMediaData(long j6, int i7, int i10, OnQueryDataResultListener<LocalMedia> onQueryDataResultListener) {
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
        long j10 = cursor.getLong(columnIndexOrThrow11);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String realPathUri = SdkVersionUtils.isQ() ? MediaUtils.getRealPathUri(j6, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = PictureMimeType.ofJPEG();
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
        long j11 = cursor.getLong(columnIndexOrThrow6);
        long j12 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        long j13 = cursor.getLong(columnIndexOrThrow10);
        String urlToFileName = TextUtils.isEmpty(string4) ? PictureMimeType.getUrlToFileName(string2) : string4;
        if (getConfig().isFilterSizeDuration && j12 > 0 && j12 < FileSizeUnit.KB) {
            return null;
        }
        if (PictureMimeType.isHasVideo(string) || PictureMimeType.isHasAudio(string)) {
            if (getConfig().filterVideoMinSecond > 0 && j11 < getConfig().filterVideoMinSecond) {
                return null;
            }
            if (getConfig().filterVideoMaxSecond > 0 && j11 > getConfig().filterVideoMaxSecond) {
                return null;
            }
            if (getConfig().isFilterSizeDuration && j11 <= 0) {
                return null;
            }
        } else {
            j12 = j12;
        }
        LocalMedia localMediaCreate = LocalMedia.create();
        localMediaCreate.setId(j6);
        localMediaCreate.setBucketId(j13);
        localMediaCreate.setPath(realPathUri);
        localMediaCreate.setRealPath(string2);
        localMediaCreate.setFileName(urlToFileName);
        localMediaCreate.setParentFolderName(string3);
        localMediaCreate.setDuration(j11);
        localMediaCreate.setChooseModel(getConfig().chooseMode);
        localMediaCreate.setMimeType(string);
        localMediaCreate.setWidth(i7);
        localMediaCreate.setHeight(i13);
        localMediaCreate.setSize(j12);
        localMediaCreate.setDateAddedTime(j10);
        OnQueryFilterListener onQueryFilterListener = this.mConfig.onQueryFilterListener;
        if (onQueryFilterListener == null || !onQueryFilterListener.onFilter(localMediaCreate)) {
            return localMediaCreate;
        }
        return null;
    }
}
