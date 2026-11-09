package com.transsnet.adsdk.interfaces;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IMultipleUpdateListener {
    void dataUpdate(boolean show, List<AdEntity> newData);
}
