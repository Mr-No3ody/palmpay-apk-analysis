package p250q8;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IDataUpdateListener;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import com.transsnet.adsdk.widgets.splash.SplashAdView;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ObservableOnSubscribe, Function, IRemoteDataListener, IDataUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashAdView f41465b;

    public /* synthetic */ b(SplashAdView splashAdView, int i7) {
        this.f41464a = i7;
        this.f41465b = splashAdView;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        switch (this.f41464a) {
            case 1:
                return this.f41465b.lambda$run$1((Boolean) obj);
            default:
                return this.f41465b.lambda$run$2((Boolean) obj);
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IDataUpdateListener
    public void dataUpdate(boolean z3, AdEntity adEntity) {
        this.f41465b.lambda$run$6(z3, adEntity);
    }

    @Override // com.transsnet.adsdk.interfaces.IRemoteDataListener
    public void emptyData(boolean z3) {
        this.f41465b.lambda$run$4(z3);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) throws Exception {
        switch (this.f41464a) {
            case 0:
                this.f41465b.lambda$run$0(observableEmitter);
                break;
            default:
                this.f41465b.lambda$initAdData$7(observableEmitter);
                break;
        }
    }
}
