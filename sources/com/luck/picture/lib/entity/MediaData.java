package com.luck.picture.lib.entity;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MediaData {
    public ArrayList<LocalMedia> data;
    public boolean isHasNextMore;

    public MediaData() {
    }

    public MediaData(boolean z3, ArrayList<LocalMedia> arrayList) {
        this.isHasNextMore = z3;
        this.data = arrayList;
    }
}
