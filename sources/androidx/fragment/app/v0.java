package androidx.fragment.app;

import android.view.View;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f17221c;

    public /* synthetic */ v0(Object obj, x0 x0Var, int i7) {
        this.f17219a = i7;
        this.f17220b = obj;
        this.f17221c = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17219a) {
            case 0:
                D0 this$0 = (D0) this.f17220b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                x0 operation = this.f17221c;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                if (this$0.f16975b.contains(operation)) {
                    B0 b0 = operation.f17246a;
                    View view = operation.f17248c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    b0.a(view);
                }
                break;
            case 1:
                D0 this$1 = (D0) this.f17220b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                x0 operation2 = this.f17221c;
                Intrinsics.checkNotNullParameter(operation2, "$operation");
                this$1.f16975b.remove(operation2);
                this$1.f16976c.remove(operation2);
                break;
            default:
                C1173h transitionInfo = (C1173h) this.f17220b;
                Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
                x0 operation3 = this.f17221c;
                Intrinsics.checkNotNullParameter(operation3, "$operation");
                transitionInfo.a();
                if (Z.L(2)) {
                    Objects.toString(operation3);
                }
                break;
        }
    }
}
