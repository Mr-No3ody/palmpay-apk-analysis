package com.transsnet.adsdk.widgets.MarqueeTextView;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IDataUpdateListener;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function, Predicate, IRemoteDataListener, IDataUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeView f25595b;

    public /* synthetic */ b(MarqueeView marqueeView, int i7) {
        this.f25594a = i7;
        this.f25595b = marqueeView;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        switch (this.f25594a) {
            case 0:
                return this.f25595b.lambda$loadAdData$3((Boolean) obj);
            case 1:
                return this.f25595b.lambda$loadAdData$4((Boolean) obj);
            default:
                return this.f25595b.lambda$loadAdData$6((Boolean) obj);
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IDataUpdateListener
    public void dataUpdate(boolean z3, AdEntity adEntity) {
        this.f25595b.lambda$loadAdData$10(z3, adEntity);
    }

    @Override // com.transsnet.adsdk.interfaces.IRemoteDataListener
    public void emptyData(boolean z3) {
        this.f25595b.lambda$loadAdData$8(z3);
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(Object obj) {
        return this.f25595b.lambda$loadAdData$5((Boolean) obj);
    }
}
