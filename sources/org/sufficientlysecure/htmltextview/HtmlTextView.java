package org.sufficientlysecure.htmltextview;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.QuoteSpan;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.util.Scanner;
import java.util.Stack;

/* JADX INFO: loaded from: classes4.dex */
public class HtmlTextView extends JellyBeanSpanFixTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f41113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f41114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnClickATagListener f41115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41117g;

    public HtmlTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f41111a = getResources().getColor(s.White);
        this.f41112b = getResources().getColor(s.black);
        this.f41113c = 10.0f;
        this.f41114d = 20.0f;
        this.f41116f = 24.0f;
        this.f41117g = true;
    }

    public final void a(String str) {
        q qVar = new q(this);
        float f10 = this.f41116f;
        boolean z3 = this.f41117g;
        p pVar = new p();
        pVar.f41139a = new Stack();
        pVar.f41140b = new Stack();
        pVar.f41141c = new StringBuilder();
        pVar.f41142d = 0;
        pVar.f41143e = qVar;
        p.f41137f = Math.round(f10);
        Spanned spannedFromHtml = null;
        String strReplace = str == null ? null : "<HTML_TEXTVIEW_ESCAPED_PLACEHOLDER></HTML_TEXTVIEW_ESCAPED_PLACEHOLDER>".concat(str).replace("<ul", "<HTML_TEXTVIEW_ESCAPED_UL_TAG").replace("</ul>", "</HTML_TEXTVIEW_ESCAPED_UL_TAG>").replace("<ol", "<HTML_TEXTVIEW_ESCAPED_OL_TAG").replace("</ol>", "</HTML_TEXTVIEW_ESCAPED_OL_TAG>").replace("<li", "<HTML_TEXTVIEW_ESCAPED_LI_TAG").replace("</li>", "</HTML_TEXTVIEW_ESCAPED_LI_TAG>").replace("<a", "<HTML_TEXTVIEW_ESCAPED_A_TAG").replace("</a>", "</HTML_TEXTVIEW_ESCAPED_A_TAG>");
        if (z3) {
            Spanned spannedFromHtml2 = Html.fromHtml(strReplace, null, new t(pVar));
            if (spannedFromHtml2 != null) {
                spannedFromHtml = spannedFromHtml2;
                while (spannedFromHtml.length() > 0 && spannedFromHtml.charAt(spannedFromHtml.length() - 1) == '\n') {
                    spannedFromHtml = (Spanned) spannedFromHtml.subSequence(0, spannedFromHtml.length() - 1);
                }
            }
        } else {
            spannedFromHtml = Html.fromHtml(strReplace, null, new t(pVar));
        }
        Spannable spannable = (Spannable) spannedFromHtml;
        for (QuoteSpan quoteSpan : (QuoteSpan[]) spannable.getSpans(0, spannable.length() - 1, QuoteSpan.class)) {
            int spanStart = spannable.getSpanStart(quoteSpan);
            int spanEnd = spannable.getSpanEnd(quoteSpan);
            int spanFlags = spannable.getSpanFlags(quoteSpan);
            spannable.removeSpan(quoteSpan);
            c cVar = new c();
            cVar.f41122a = this.f41111a;
            cVar.f41123b = this.f41112b;
            cVar.f41124c = this.f41113c;
            cVar.f41125d = this.f41114d;
            spannable.setSpan(cVar, spanStart, spanEnd, spanFlags);
        }
        setText(spannedFromHtml);
        if (r.f41145a == null) {
            r.f41145a = new r();
        }
        setMovementMethod(r.f41145a);
    }

    public void setClickableTableSpan(@Nullable a aVar) {
    }

    public void setDrawTableLinkSpan(@Nullable d dVar) {
    }

    public void setHtml(@NonNull String str) {
        a(str);
    }

    public void setListIndentPx(float f10) {
        this.f41116f = f10;
    }

    public void setOnClickATagListener(@Nullable OnClickATagListener onClickATagListener) {
        this.f41115e = onClickATagListener;
    }

    public void setRemoveTrailingWhiteSpace(boolean z3) {
        this.f41117g = z3;
    }

    public void setHtml(@RawRes int i7) {
        Scanner scannerUseDelimiter = new Scanner(getContext().getResources().openRawResource(i7)).useDelimiter("\\A");
        a(scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "");
    }

    public HtmlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41111a = getResources().getColor(s.White);
        this.f41112b = getResources().getColor(s.black);
        this.f41113c = 10.0f;
        this.f41114d = 20.0f;
        this.f41116f = 24.0f;
        this.f41117g = true;
    }

    public HtmlTextView(Context context) {
        super(context);
        this.f41111a = getResources().getColor(s.White);
        this.f41112b = getResources().getColor(s.black);
        this.f41113c = 10.0f;
        this.f41114d = 20.0f;
        this.f41116f = 24.0f;
        this.f41117g = true;
    }
}
