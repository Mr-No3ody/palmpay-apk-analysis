package com.transsnet.palmpay.core.base;

import android.text.TextUtils;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j implements IBasePresenter, IBaseSubscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBaseView f27351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p103gf.a f27352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f27353c;

    @Override // com.transsnet.palmpay.core.base.IBasePresenter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void attachView(IBaseView iBaseView) {
        this.f27351a = iBaseView;
    }

    @Override // com.transsnet.palmpay.core.base.IBaseSubscription
    public final void addSubscription(Disposable disposable) {
        if (this.f27352b == null) {
            this.f27352b = new p103gf.a();
        }
        this.f27352b.add(disposable);
    }

    @Override // com.transsnet.palmpay.core.base.IBasePresenter
    public void detachView() {
        unSubscribe();
        this.f27351a = null;
    }

    @Override // com.transsnet.palmpay.core.base.IBaseSubscription
    public final boolean isIntervalTimeLiness(String str, long j6) {
        HashMap map = this.f27353c;
        if (map == null || map.isEmpty() || !this.f27353c.containsKey(str)) {
            return false;
        }
        return System.currentTimeMillis() - ((Long) this.f27353c.get(str)).longValue() < j6;
    }

    @Override // com.transsnet.palmpay.core.base.IBaseSubscription
    public final void removeTimeLiness(String str) {
        HashMap map = this.f27353c;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.f27353c.remove(str);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseSubscription
    public final void setIntervalTimeLiness(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f27353c == null) {
            this.f27353c = new HashMap();
        }
        this.f27353c.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.transsnet.palmpay.core.base.IBaseSubscription
    public final void unSubscribe() {
        p103gf.a aVar = this.f27352b;
        if (aVar != null) {
            aVar.dispose();
            this.f27352b = null;
        }
    }
}
