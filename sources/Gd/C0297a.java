package Gd;

import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.send_money.bean.RecentlyCompensationBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Gd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0297a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dg.a f3327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f3329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f3331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f3332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f3334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f3335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecentlyCompensationBean f3336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CountDownTimer f3337k;

    public C0297a(ViewStub viewStub, Dg.a aVar) {
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        this.f3327a = aVar;
        View viewInflate = viewStub.inflate();
        this.f3328b = viewInflate;
        if (viewInflate != null) {
            this.f3329c = (ImageView) viewInflate.findViewById(p159kd.e.ivRefundIcon);
            this.f3330d = (TextView) viewInflate.findViewById(p159kd.e.tvRefundTitle);
            this.f3331e = (TextView) viewInflate.findViewById(p159kd.e.tvRefundDesc);
            this.f3332f = (TextView) viewInflate.findViewById(p159kd.e.tvSendTitle);
            this.f3333g = (TextView) viewInflate.findViewById(p159kd.e.tvSendTime);
            this.f3334h = (TextView) viewInflate.findViewById(p159kd.e.btnView);
            this.f3335i = viewInflate.findViewById(p159kd.e.vPoint2);
        }
    }
}
