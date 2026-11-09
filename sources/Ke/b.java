package Ke;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f5424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f5425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f5426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f5427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f5428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SlideMenuListRsp.BusinessMenuData f5429g;

    public b(ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        View viewInflate = viewStub.inflate();
        this.f5423a = viewInflate;
        if (viewInflate != null) {
            this.f5424b = (ImageView) viewInflate.findViewById(Ac.e.iv_icon);
            this.f5425c = (TextView) viewInflate.findViewById(Ac.e.tv_title);
            this.f5426d = (TextView) viewInflate.findViewById(Ac.e.tv_remark);
            this.f5427e = (TextView) viewInflate.findViewById(Ac.e.tv_view);
            this.f5428f = (ImageView) viewInflate.findViewById(Ac.e.iv_ad);
        }
    }
}
