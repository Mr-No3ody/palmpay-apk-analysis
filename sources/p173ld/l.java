package p173ld;

import L6.b;
import M1.j;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p159kd.e;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39331a;

    public final void a(TextView textView) {
        String str = this.f39331a;
        if (str == null || StringsKt.F(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(textView.getText());
        String string = spannableString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = this.f39331a.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        int iE = StringsKt.E(upperCase, upperCase2, 0, false, 6);
        if (iE != -1) {
            spannableString.setSpan(new ForegroundColorSpan(CommonViewExtKt.colorInt(b.ppColorPrimary, getContext())), iE, this.f39331a.length() + iE, 18);
            textView.setText(spannableString);
        }
    }

    public final void b(BaseViewHolder baseViewHolder, int i7, String str) {
        baseViewHolder.setGone(e.iv_searchType, i7 == 0).setImageResource(e.iv_searchType, i7).setText(e.tv_searchType, str).setGone(e.ll_search_type, false);
        a((TextView) baseViewHolder.getView(e.tv_searchType));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0281  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x0308  */
    /* JADX WARN: Code duplicated, block: B:119:0x0317  */
    /* JADX WARN: Code duplicated, block: B:125:0x0347  */
    /* JADX WARN: Code duplicated, block: B:127:0x034b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0356  */
    /* JADX WARN: Code duplicated, block: B:131:0x0365  */
    /* JADX WARN: Code duplicated, block: B:138:0x037c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0387  */
    /* JADX WARN: Code duplicated, block: B:142:0x0396  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:149:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:161:0x040a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0419  */
    /* JADX WARN: Code duplicated, block: B:164:0x043a  */
    /* JADX WARN: Code duplicated, block: B:166:0x043e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0449  */
    /* JADX WARN: Code duplicated, block: B:170:0x0458  */
    /* JADX WARN: Code duplicated, block: B:86:0x0229  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0238  */
    /* JADX WARN: Code duplicated, block: B:92:0x0247  */
    /* JADX WARN: Code duplicated, block: B:95:0x0263  */
    /* JADX WARN: Code duplicated, block: B:97:0x0267  */
    /* JADX WARN: Code duplicated, block: B:99:0x0272  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:125:0x0347
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // M1.j
    public final void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p173ld.l.convert(com.chad.library.adapter.base.viewholder.BaseViewHolder, java.lang.Object):void");
    }
}
