package com.transsnet.adsdk.interfaces;

import android.content.Context;
import com.transsnet.adsdk.data.bean.resp.AdBean;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IBatchAdView {
    /* JADX INFO: renamed from: getAdSlotId */
    String getMSlotId();

    List<String> getNotShowAdList();

    Context getViewContext();

    void markAdBatchPull(boolean enable);

    void refreshAd(AdBean adBean);
}
