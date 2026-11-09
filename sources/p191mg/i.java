package p191mg;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i extends m implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SerialDescriptor p3 = (SerialDescriptor) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(p3, "p0");
        j jVar = (j) this.receiver;
        jVar.getClass();
        boolean z3 = !p3.isElementOptional(iIntValue) && p3.getElementDescriptor(iIntValue).isNullable();
        jVar.f39730b = z3;
        return Boolean.valueOf(z3);
    }
}
