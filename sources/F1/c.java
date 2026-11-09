package F1;

import com.airbnb.lottie.animation.keyframe.i;
import com.airbnb.lottie.animation.keyframe.l;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AnimatableValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2517a;

    public c() {
        this.f2517a = new ArrayList();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public com.airbnb.lottie.animation.keyframe.d createAnimation() {
        ArrayList arrayList = this.f2517a;
        return ((p243q1.a) arrayList.get(0)).c() ? new i(arrayList, 1) : new l(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List getKeyframes() {
        return this.f2517a;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        ArrayList arrayList = this.f2517a;
        return arrayList.size() == 1 && ((p243q1.a) arrayList.get(0)).c();
    }

    public c(ArrayList arrayList) {
        this.f2517a = arrayList;
    }
}
