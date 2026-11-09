package p202n9;

import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.airtime.ui.view.GroupPurchaseAvatarLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f39867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupPurchaseAvatarLayout f39868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f39869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f39870d;

    public e(View container, GroupPurchaseAvatarLayout avatarLayout, TextView nameView, TextView priceView) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(avatarLayout, "avatarLayout");
        Intrinsics.checkNotNullParameter(nameView, "nameView");
        Intrinsics.checkNotNullParameter(priceView, "priceView");
        this.f39867a = container;
        this.f39868b = avatarLayout;
        this.f39869c = nameView;
        this.f39870d = priceView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.c(this.f39867a, eVar.f39867a) && Intrinsics.c(this.f39868b, eVar.f39868b) && Intrinsics.c(this.f39869c, eVar.f39869c) && Intrinsics.c(this.f39870d, eVar.f39870d);
    }

    public final int hashCode() {
        return this.f39870d.hashCode() + ((this.f39869c.hashCode() + ((this.f39868b.hashCode() + (this.f39867a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GroupPurchaseHolder(container=" + this.f39867a + ", avatarLayout=" + this.f39868b + ", nameView=" + this.f39869c + ", priceView=" + this.f39870d + ")";
    }
}
