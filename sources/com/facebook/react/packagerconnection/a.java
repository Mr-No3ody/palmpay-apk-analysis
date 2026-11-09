package com.facebook.react.packagerconnection;

import F6.d;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.api.Service;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.init.InitTask6;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.core.ui.fragment.AddBankCardFragmentV2;
import com.transsnet.palmpay.credit.ui.dialog.CLFillYourInformationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CreditApplicationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.DownloadCashPageDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.SelectKeepTimeDialogFragment;
import com.transsnet.palmpay.util.GooglePlayInnerAppHelper;
import com.transsnet.palmpay.util.RecentMenuCache;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p135j0.C1767a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21758a;

    public /* synthetic */ a(int i7) {
        this.f21758a = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21758a) {
            case 0:
                return Boolean.valueOf(FileIoHandler.run$lambda$1$lambda$0((Map.Entry) obj));
            case 1:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$0((C1767a) obj);
            case 2:
                return Boolean.valueOf(MarqueeViewV2.fetchData$lambda$3((Boolean) obj));
            case 3:
                return Boolean.valueOf(SingleAdView.fetchData$lambda$4((Boolean) obj));
            case 4:
                return InitTask6.setRxJavaErrorHandler$lambda$0((Throwable) obj);
            case 5:
                int i7 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 6:
                String error = (String) obj;
                int i10 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(error, "error");
                ToastUtils.showLong(error, new Object[0]);
                return Unit.f38893a;
            case 7:
                String error2 = (String) obj;
                int i11 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(error2, "error");
                ToastUtils.showLong(error2, new Object[0]);
                return Unit.f38893a;
            case 8:
                String error3 = (String) obj;
                int i12 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(error3, "error");
                ToastUtils.showLong(error3, new Object[0]);
                return Unit.f38893a;
            case 9:
                IconicsDrawable apply = (IconicsDrawable) obj;
                int i13 = AddBankCardFragmentV2.f27826C0;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 24);
                return Unit.f38893a;
            case 10:
                String it = (String) obj;
                int i14 = AddBankCardFragmentV2.f27826C0;
                Intrinsics.checkNotNullParameter(it, "it");
                ToastUtils.showLong(it, new Object[0]);
                return Unit.f38893a;
            case 11:
                Long it2 = (Long) obj;
                CLFillYourInformationDialogFragment.a aVar = CLFillYourInformationDialogFragment.f29940M;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Long.valueOf(((long) 3) - it2.longValue());
            case 12:
                CLFillYourInformationDialogFragment.a aVar2 = CLFillYourInformationDialogFragment.f29940M;
                d.c("CLFillYourInformationDialogFragment", "倒计时 error");
                return Unit.f38893a;
            case 13:
                Long it3 = (Long) obj;
                CreditApplicationDialogFragment.a aVar3 = CreditApplicationDialogFragment.f29952L;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Long.valueOf(((long) 3) - it3.longValue());
            case 14:
                CreditApplicationDialogFragment.a aVar4 = CreditApplicationDialogFragment.f29952L;
                d.c("倒计时 error", new Object[0]);
                return Unit.f38893a;
            case 15:
                Long it4 = (Long) obj;
                DownloadCashPageDialogFragment.a aVar5 = DownloadCashPageDialogFragment.f29959L;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Long.valueOf(((long) 3) - it4.longValue());
            case 16:
                DownloadCashPageDialogFragment.a aVar6 = DownloadCashPageDialogFragment.f29959L;
                d.c("倒计时 error", new Object[0]);
                return Unit.f38893a;
            case 17:
                SelectKeepTimeDialogFragment.a aVar7 = SelectKeepTimeDialogFragment.f30022X;
                return Unit.f38893a;
            case 18:
                return GooglePlayInnerAppHelper.innerAppForceUpdate$lambda$0((AppUpdateInfo) obj);
            case 19:
                return RecentMenuCache.hashMenuName$lambda$0(((Byte) obj).byteValue());
            case 20:
                return RecentMenuCache.saveRecentMenus$lambda$5((RecentMenuCache.RecentMenuKey) obj);
            case 21:
                return Unit.f38893a;
            case 22:
                return Unit.f38893a;
            case 23:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case 24:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                String str = (String) obj;
                ToastUtils.showLong(str, new Object[0]);
                D3.a.L("pin", str);
                return Unit.f38893a;
            case 26:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case 27:
                String str2 = (String) obj;
                ToastUtils.showLong(str2, new Object[0]);
                D3.a.L("password", str2);
                return Unit.f38893a;
            case 28:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            default:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
        }
    }
}
