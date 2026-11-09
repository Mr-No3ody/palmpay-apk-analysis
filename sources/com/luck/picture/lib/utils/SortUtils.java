package com.luck.picture.lib.utils;

import androidx.camera.core.impl.C0998p0;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SortUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortFolder$0(LocalMediaFolder localMediaFolder, LocalMediaFolder localMediaFolder2) {
        if (localMediaFolder.getData() == null || localMediaFolder2.getData() == null) {
            return 0;
        }
        return Integer.compare(localMediaFolder2.getFolderTotalNum(), localMediaFolder.getFolderTotalNum());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortLocalMediaAddedTime$1(LocalMedia localMedia, LocalMedia localMedia2) {
        return Long.compare(localMedia2.getDateAddedTime(), localMedia.getDateAddedTime());
    }

    public static void sortFolder(List<LocalMediaFolder> list) {
        Collections.sort(list, new C0998p0(8));
    }

    public static void sortLocalMediaAddedTime(List<LocalMedia> list) {
        Collections.sort(list, new C0998p0(7));
    }
}
