package com.transsnet.adsdk.widgets.MarqueeTextView;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IDataUpdateListener;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function, IRemoteDataListener, IDataUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarqueeViewV2 f25598a;

    public /* synthetic */ d(MarqueeViewV2 marqueeViewV2) {
        this.f25598a = marqueeViewV2;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return MarqueeViewV2.fetchData$lambda$11(this.f25598a, (Boolean) obj);
    }

    @Override // com.transsnet.adsdk.interfaces.IDataUpdateListener
    public void dataUpdate(boolean z3, AdEntity adEntity) {
        MarqueeViewV2.fetchData$lambda$13(this.f25598a, z3, adEntity);
    }

    @Override // com.transsnet.adsdk.interfaces.IRemoteDataListener
    public void emptyData(boolean z3) {
        this.f25598a.postFailResult();
    }
}
