package V3;

import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckWithFaceRecognitionFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FlexiBankCheckWithFaceRecognitionFragment f9994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f9995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FlexiBankCheckWithFaceRecognitionFragment caller) {
        super(caller, new a(4), 0);
        Intrinsics.checkNotNullParameter(caller, "caller");
        this.f9994f = caller;
        Intrinsics.checkNotNullParameter(caller, "caller");
        this.f9995g = new c(caller, new a(0), 0);
    }
}
