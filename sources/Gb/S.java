package Gb;

import android.content.Context;
import android.view.View;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfo;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class S implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TotalOutstandingView f3258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OutstandingContentInfo f3259c;

    public /* synthetic */ S(OutstandingContentInfo outstandingContentInfo, TotalOutstandingView totalOutstandingView, int i7) {
        this.f3257a = i7;
        this.f3259c = outstandingContentInfo;
        this.f3258b = totalOutstandingView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long validUntil;
        Long validUntil2;
        TotalOutstandingView totalOutstandingView = this.f3258b;
        OutstandingContentInfo outstandingContentInfo = this.f3259c;
        switch (this.f3257a) {
            case 0:
                int i7 = TotalOutstandingView.f30883d;
                totalOutstandingView.h(outstandingContentInfo);
                break;
            case 1:
                int i10 = TotalOutstandingView.f30883d;
                totalOutstandingView.h(outstandingContentInfo);
                break;
            case 2:
                int i11 = TotalOutstandingView.f30883d;
                Context context = totalOutstandingView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Fb.i.e(context, outstandingContentInfo);
                break;
            case 3:
                int i12 = TotalOutstandingView.f30883d;
                WaiverInfo waiverInfo = outstandingContentInfo.waiverInfo;
                if (waiverInfo != null && Intrinsics.c(waiverInfo.getWaiverEnable(), Boolean.TRUE) && (validUntil = waiverInfo.getValidUntil()) != null && validUntil.longValue() > System.currentTimeMillis()) {
                    Context context2 = totalOutstandingView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    Fb.i.e(context2, outstandingContentInfo);
                } else {
                    totalOutstandingView.h(outstandingContentInfo);
                }
                break;
            default:
                int i13 = TotalOutstandingView.f30883d;
                WaiverInfo waiverInfo2 = outstandingContentInfo.waiverInfo;
                if (waiverInfo2 != null && Intrinsics.c(waiverInfo2.getWaiverEnable(), Boolean.TRUE) && (validUntil2 = waiverInfo2.getValidUntil()) != null && validUntil2.longValue() > System.currentTimeMillis()) {
                    Context context3 = totalOutstandingView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    Fb.i.e(context3, outstandingContentInfo);
                } else {
                    totalOutstandingView.h(outstandingContentInfo);
                }
                break;
        }
    }

    public /* synthetic */ S(TotalOutstandingView totalOutstandingView, OutstandingContentInfo outstandingContentInfo, int i7) {
        this.f3257a = i7;
        this.f3258b = totalOutstandingView;
        this.f3259c = outstandingContentInfo;
    }
}
