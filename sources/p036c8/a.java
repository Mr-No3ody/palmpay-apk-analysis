package p036c8;

import Ab.C;
import Fe.h0;
import android.animation.FloatEvaluator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends FloatEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f18871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f18872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Number f18873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Number f18874d;

    public a(C startValueProvider, h0 endValueProvider) {
        Intrinsics.checkNotNullParameter(startValueProvider, "startValueProvider");
        Intrinsics.checkNotNullParameter(endValueProvider, "endValueProvider");
        this.f18871a = startValueProvider;
        this.f18872b = endValueProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f10, Number number, Number number2) {
        if (this.f18873c == null) {
            this.f18873c = (Number) this.f18871a.invoke(number);
        }
        Number number3 = this.f18873c;
        if (this.f18874d == null) {
            this.f18872b.invoke(number2);
            this.f18874d = Float.valueOf(0.0f);
        }
        Number number4 = this.f18874d;
        if (number3 == null || number4 == null) {
            return null;
        }
        return super.evaluate(f10, number3, number4);
    }
}
