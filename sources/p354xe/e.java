package p354xe;

import Kb.b;
import Pa.r0;
import com.airbnb.lottie.LottieListener;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.main.export.bean.rsp.ProductData;
import p385ze.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements LottieListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f43923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43924c;

    public /* synthetic */ e(b bVar, Object obj, int i7) {
        this.f43922a = i7;
        this.f43923b = bVar;
        this.f43924c = obj;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        switch (this.f43922a) {
            case 0:
                HomePageMenuData homePageMenuData = (HomePageMenuData) this.f43924c;
                f fVar = (f) this.f43923b;
                r0.h1(fVar.d(fVar.itemView.getContext()), homePageMenuData.iconUrlBig, r.cv_palmpay_icon_gray);
                break;
            default:
                ProductData productData = (ProductData) this.f43924c;
                g gVar = (g) this.f43923b;
                r0.h1(gVar.d(gVar.itemView.getContext()), productData.imageUrl, r.cv_palmpay_icon_gray);
                break;
        }
    }
}
