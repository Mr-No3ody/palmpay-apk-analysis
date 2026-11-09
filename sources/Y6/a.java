package Y6;

import C0.G;
import com.palmpay.lib.ui.picker.picker.interfac.IPickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements IPickerItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11304b;

    public a(String itemName, String itemId) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f11303a = itemName;
        this.f11304b = itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f11303a, aVar.f11303a) && Intrinsics.c(this.f11304b, aVar.f11304b);
    }

    @Override // com.palmpay.lib.ui.picker.picker.interfac.IPickerItem
    public final String getItemId() {
        return this.f11304b;
    }

    @Override // com.palmpay.lib.ui.picker.picker.interfac.IPickerItem
    public final String getItemName() {
        return this.f11303a;
    }

    public final int hashCode() {
        return this.f11304b.hashCode() + (this.f11303a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PickerData(itemName=");
        sb2.append(this.f11303a);
        sb2.append(", itemId=");
        return G.r(sb2, this.f11304b, ")");
    }
}
