package Fb;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.transsnet.palmpay.credit.bean.resp.Reason;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f2643b;

    public /* synthetic */ h(Set set, int i7) {
        this.f2642a = i7;
        this.f2643b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2642a) {
            case 0:
                Reason reason = (Reason) obj;
                Intrinsics.checkNotNullParameter(reason, "reason");
                String secondReasonCode = reason.getSecondReasonCode();
                return Boolean.valueOf(secondReasonCode != null ? this.f2643b.contains(secondReasonCode) : false);
            default:
                return NativeAnimatedModule.userDrivenScrollEnded$lambda$2$lambda$1(this.f2643b, (ReadableArrayBuilder) obj);
        }
    }
}
