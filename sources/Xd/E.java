package Xd;

import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f11133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f11134c;

    public /* synthetic */ E(TextView textView, BaseViewHolder baseViewHolder, int i7) {
        this.f11132a = i7;
        this.f11133b = textView;
        this.f11134c = baseViewHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11132a) {
            case 0:
                int ellipsisCount = this.f11133b.getLayout().getEllipsisCount(0);
                BaseViewHolder baseViewHolder = this.f11134c;
                if (ellipsisCount <= 0) {
                    baseViewHolder.setGone(Pd.c.iv_more, true);
                } else {
                    baseViewHolder.setGone(Pd.c.iv_more, false);
                }
                break;
            default:
                int ellipsisCount2 = this.f11133b.getLayout().getEllipsisCount(0);
                BaseViewHolder baseViewHolder2 = this.f11134c;
                if (ellipsisCount2 <= 0) {
                    baseViewHolder2.setGone(Pd.c.iv_more, true);
                } else {
                    baseViewHolder2.setGone(Pd.c.iv_more, false);
                }
                break;
        }
    }
}
