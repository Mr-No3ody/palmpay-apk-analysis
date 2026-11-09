package com.luck.picture.lib.basic;

import android.app.Activity;
import android.text.TextUtils;
import com.luck.picture.lib.config.FileSizeUnit;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.interfaces.OnQueryDataSourceListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.luck.picture.lib.loader.IBridgeMediaLoader;
import com.luck.picture.lib.loader.LocalMediaLoader;
import com.luck.picture.lib.loader.LocalMediaPageLoader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PictureSelectionQueryModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionQueryModel(PictureSelector pictureSelector, int i7) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i7;
    }

    public IBridgeMediaLoader buildMediaLoader() {
        Activity activity = this.selector.getActivity();
        if (activity != null) {
            return this.selectionConfig.isPageStrategy ? new LocalMediaPageLoader(activity, this.selectionConfig) : new LocalMediaLoader(activity, this.selectionConfig);
        }
        throw new NullPointerException("Activity cannot be null");
    }

    public PictureSelectionQueryModel isBmp(boolean z3) {
        this.selectionConfig.isBmp = z3;
        return this;
    }

    public PictureSelectionQueryModel isGif(boolean z3) {
        this.selectionConfig.isGif = z3;
        return this;
    }

    public PictureSelectionQueryModel isHeic(boolean z3) {
        this.selectionConfig.isHeic = z3;
        return this;
    }

    public PictureSelectionQueryModel isPageStrategy(boolean z3) {
        this.selectionConfig.isPageStrategy = z3;
        return this;
    }

    public PictureSelectionQueryModel isWebp(boolean z3) {
        this.selectionConfig.isWebp = z3;
        return this;
    }

    public void obtainAlbumData(final OnQueryDataSourceListener<LocalMediaFolder> onQueryDataSourceListener) {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (onQueryDataSourceListener == null) {
            throw new NullPointerException("OnQueryDataSourceListener cannot be null");
        }
        (this.selectionConfig.isPageStrategy ? new LocalMediaPageLoader(activity, this.selectionConfig) : new LocalMediaLoader(activity, this.selectionConfig)).loadAllAlbum(new OnQueryAllAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.1
            @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
            public void onComplete(List<LocalMediaFolder> list) {
                onQueryDataSourceListener.onComplete(list);
            }
        });
    }

    public void obtainMediaData(final OnQueryDataSourceListener<LocalMedia> onQueryDataSourceListener) {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (onQueryDataSourceListener == null) {
            throw new NullPointerException("OnQueryDataSourceListener cannot be null");
        }
        final IBridgeMediaLoader localMediaPageLoader = this.selectionConfig.isPageStrategy ? new LocalMediaPageLoader(activity, this.selectionConfig) : new LocalMediaLoader(activity, this.selectionConfig);
        localMediaPageLoader.loadAllAlbum(new OnQueryAllAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.2
            @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
            public void onComplete(List<LocalMediaFolder> list) {
                if (list == null || list.size() <= 0) {
                    return;
                }
                LocalMediaFolder localMediaFolder = list.get(0);
                if (PictureSelectionQueryModel.this.selectionConfig.isPageStrategy) {
                    localMediaPageLoader.loadPageMediaData(localMediaFolder.getBucketId(), 1, PictureSelectionQueryModel.this.selectionConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.2.1
                        @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                        public void onComplete(ArrayList<LocalMedia> arrayList, boolean z3) {
                            onQueryDataSourceListener.onComplete(arrayList);
                        }
                    });
                } else {
                    onQueryDataSourceListener.onComplete(localMediaFolder.getData());
                }
            }
        });
    }

    public PictureSelectionQueryModel setFilterMaxFileSize(long j6) {
        if (j6 >= FileSizeUnit.MB) {
            this.selectionConfig.filterMaxFileSize = j6;
            return this;
        }
        this.selectionConfig.filterMaxFileSize = j6 * FileSizeUnit.KB;
        return this;
    }

    public PictureSelectionQueryModel setFilterMinFileSize(long j6) {
        if (j6 >= FileSizeUnit.MB) {
            this.selectionConfig.filterMinFileSize = j6;
            return this;
        }
        this.selectionConfig.filterMinFileSize = j6 * FileSizeUnit.KB;
        return this;
    }

    public PictureSelectionQueryModel setFilterVideoMaxSecond(int i7) {
        this.selectionConfig.filterVideoMaxSecond = i7 * 1000;
        return this;
    }

    public PictureSelectionQueryModel setFilterVideoMinSecond(int i7) {
        this.selectionConfig.filterVideoMinSecond = i7 * 1000;
        return this;
    }

    public PictureSelectionQueryModel setQueryFilterListener(OnQueryFilterListener onQueryFilterListener) {
        this.selectionConfig.onQueryFilterListener = onQueryFilterListener;
        return this;
    }

    public PictureSelectionQueryModel setQuerySortOrder(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.selectionConfig.sortOrder = str;
        }
        return this;
    }

    public PictureSelectionQueryModel isPageStrategy(boolean z3, int i7) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isPageStrategy = z3;
        if (i7 < 10) {
            i7 = 60;
        }
        selectorConfig.pageSize = i7;
        return this;
    }

    public PictureSelectionQueryModel isPageStrategy(boolean z3, int i7, boolean z8) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isPageStrategy = z3;
        if (i7 < 10) {
            i7 = 60;
        }
        selectorConfig.pageSize = i7;
        selectorConfig.isFilterInvalidFile = z8;
        return this;
    }
}
