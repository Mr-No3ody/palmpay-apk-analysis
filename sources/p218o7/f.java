package p218o7;

import com.permissionx.guolindev.request.InvisibleFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvisibleFragment f40074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f40075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InvisibleFragment invisibleFragment, Boolean bool, int i7) {
        super(0);
        this.f40073a = i7;
        this.f40074b = invisibleFragment;
        this.f40075c = bool;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40073a) {
            case 0:
                Boolean granted = this.f40075c;
                Intrinsics.checkNotNullExpressionValue(granted, "granted");
                boolean zBooleanValue = granted.booleanValue();
                InvisibleFragment invisibleFragment = this.f40074b;
                if (invisibleFragment.f()) {
                    invisibleFragment.h(new d(zBooleanValue, invisibleFragment, 0));
                }
                break;
            default:
                Boolean granted2 = this.f40075c;
                Intrinsics.checkNotNullExpressionValue(granted2, "granted");
                boolean zBooleanValue2 = granted2.booleanValue();
                InvisibleFragment invisibleFragment2 = this.f40074b;
                if (invisibleFragment2.f()) {
                    invisibleFragment2.h(new d(zBooleanValue2, invisibleFragment2, 1));
                }
                break;
        }
        return Unit.f38893a;
    }
}
