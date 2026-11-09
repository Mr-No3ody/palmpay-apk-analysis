package p284sb;

import android.widget.TextView;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42144a;

    public W(SearchMIDActivity searchMIDActivity) {
        this.f42144a = searchMIDActivity;
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SearchMIDActivity searchMIDActivity = this.f42144a;
        Object value2 = searchMIDActivity.f28789d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        DigitalKeyboardView digitalKeyboardView = (DigitalKeyboardView) value2;
        digitalKeyboardView.setDigitalKeyboardClickListener(new V(searchMIDActivity));
        digitalKeyboardView.setActionButtonEnable(value.length() == 8 || value.length() == 10);
    }

    public final void b(ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        SearchMIDActivity searchMIDActivity = this.f42144a;
        t tVar = searchMIDActivity.f28785C;
        P p3 = (P) tVar.getValue();
        p3.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        p3.f42135a = list;
        p3.notifyDataSetChanged();
        Object value = searchMIDActivity.f28792g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        if (((P) tVar.getValue()).getItemCount() > 0) {
            h.C(textView);
        } else {
            h.c(textView);
        }
    }
}
