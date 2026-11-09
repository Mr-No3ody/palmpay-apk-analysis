package org.sufficientlysecure.htmltextview;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements HtmlFormatter$TagClickListenerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HtmlTextView f41144a;

    public q(HtmlTextView htmlTextView) {
        this.f41144a = htmlTextView;
    }

    @Override // org.sufficientlysecure.htmltextview.HtmlFormatter$TagClickListenerProvider
    public final OnClickATagListener provideTagClickListener() {
        return this.f41144a.f41115e;
    }
}
