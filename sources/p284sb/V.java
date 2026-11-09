package p284sb;

import C0.G;
import com.alibaba.android.arouter.utils.Consts;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42143a;

    public V(SearchMIDActivity searchMIDActivity) {
        this.f42143a = searchMIDActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
        SearchMIDActivity searchMIDActivity = this.f42143a;
        T tO = searchMIDActivity.o();
        SearchMIDActivity searchMIDActivity2 = searchMIDActivity.o().f42140a;
        tO.b(searchMIDActivity2.n().length() == 8 ? G.o("M010001", searchMIDActivity2.n()) : searchMIDActivity2.n());
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        SearchMIDActivity searchMIDActivity = this.f42143a;
        if (searchMIDActivity.n().length() > 0) {
            String strSubstring = searchMIDActivity.n().substring(0, searchMIDActivity.n().length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            searchMIDActivity.q(strSubstring);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDigitalClick(CharSequence digital) {
        Intrinsics.checkNotNullParameter(digital, "digital");
        if (Intrinsics.c(digital, Consts.DOT)) {
            return;
        }
        SearchMIDActivity searchMIDActivity = this.f42143a;
        searchMIDActivity.q(searchMIDActivity.n() + ((Object) digital));
    }
}
