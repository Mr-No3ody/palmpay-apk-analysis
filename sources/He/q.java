package He;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f3908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AppCompatTextView textView) {
        super(textView);
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f3908a = textView;
    }
}
