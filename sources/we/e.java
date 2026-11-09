package we;

import Bc.z;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends BaseViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f43459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f43460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f43460b = new d(itemView, 0);
        int i7 = Ac.e.btnRight;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, itemView);
        if (ppButton != null) {
            i7 = Ac.e.ivIcon;
            ImageView imageView = (ImageView) p059e1.a.m(i7, itemView);
            if (imageView != null) {
                i7 = Ac.e.tvTaskDesc;
                TextView textView = (TextView) p059e1.a.m(i7, itemView);
                if (textView != null) {
                    i7 = Ac.e.tvTaskTitle;
                    TextView textView2 = (TextView) p059e1.a.m(i7, itemView);
                    if (textView2 != null) {
                        this.f43459a = new z((ConstraintLayout) itemView, ppButton, imageView, textView, textView2, 1);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i7)));
    }
}
