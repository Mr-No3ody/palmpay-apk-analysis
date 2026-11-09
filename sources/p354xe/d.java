package p354xe;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.k;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements LottieListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f43921b;

    public /* synthetic */ d(f fVar, int i7) {
        this.f43920a = i7;
        this.f43921b = fVar;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        k kVar = (k) obj;
        switch (this.f43920a) {
            case 0:
                f fVar = this.f43921b;
                LottieAnimationView lottieAnimationViewD = fVar.d(fVar.itemView.getContext());
                lottieAnimationViewD.setComposition(kVar);
                lottieAnimationViewD.e();
                break;
            default:
                f fVar2 = this.f43921b;
                fVar2.f43926d.setComposition(kVar);
                fVar2.f43926d.e();
                break;
        }
    }
}
