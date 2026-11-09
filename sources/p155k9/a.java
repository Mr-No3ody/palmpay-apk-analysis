package p155k9;

import M1.j;
import Pa.r0;
import Pd.c;
import Pd.d;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.airtime.bean.BillerBottomMenuBean;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38700b;

    public a(boolean z3) {
        super(d.qt_airtime_menu_item, null);
        this.f38699a = z3;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillerBottomMenuBean item = (BillerBottomMenuBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.itemView.setBackgroundResource(Intrinsics.c(this.f38700b, "04") ? r.cv_shape_rect_corner_12_bg_white : p025ba.d.core_shape_rect_corner_12_bg_white_stroke);
        ImageView imageView = (ImageView) holder.getView(c.ami_menu_iv);
        if (this.f38699a) {
            if (!TextUtils.isEmpty(item.getDarkIcon())) {
                r0.l1(item.getDarkIcon(), imageView);
            }
        } else if (!TextUtils.isEmpty(item.getIcon())) {
            r0.l1(item.getIcon(), imageView);
        }
        if (!TextUtils.isEmpty(item.getTitle())) {
            int i7 = c.ami_menu_tv;
            String title = item.getTitle();
            if (title == null) {
                title = "";
            }
            holder.setText(i7, y.k(title, "##", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
        }
        if (TextUtils.isEmpty(item.getSubhead())) {
            return;
        }
        holder.setText(c.ami_desc_tv, item.getSubhead());
    }
}
