package Uc;

import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PPositionSelectorView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Uc.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0666k0 implements ReadOnlyProperty, P2PPositionSelectorView.OnAreaChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9667a;

    public /* synthetic */ C0666k0(NearbyAgent2Page nearbyAgent2Page) {
        this.f9667a = nearbyAgent2Page;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object obj, KProperty kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
        Object value = this.f9667a.f32891B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return ((P2PPositionSelectorView) value).getSelectAreaId();
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PPositionSelectorView.OnAreaChangedListener
    public void onAreaChange() {
        int i7 = NearbyAgent2Page.f32889k0;
        this.f9667a.n().d(1);
    }
}
