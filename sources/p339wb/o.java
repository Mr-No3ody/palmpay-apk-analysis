package p339wb;

import Kb.b;
import Ya.e;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43385g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f43386i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, View itemView) {
        super(pVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f43386i = pVar;
        a(itemView);
        this.f43382d = (TextView) itemView.findViewById(e.tvProduct);
        this.f43383e = (TextView) itemView.findViewById(e.tvDesc);
        this.f43384f = (TextView) itemView.findViewById(e.tvAmount);
        this.f43385g = (TextView) itemView.findViewById(e.tvLateFee);
    }
}
