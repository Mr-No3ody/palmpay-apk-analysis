package androidx.camera.core.impl;

import com.facebook.react.uimanager.ViewAtIndex;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherImpl;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.utils.SortUtils;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.camera.core.impl.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0998p0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14123a;

    public /* synthetic */ C0998p0(int i7) {
        this.f14123a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14123a) {
            case 0:
                return ((C0971c) ((V) obj)).f14031a.compareTo(((C0971c) ((V) obj2)).f14031a);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b7 = bArr[i7];
                    byte b10 = bArr2[i7];
                    if (b7 != b10) {
                        return b7 - b10;
                    }
                }
                return 0;
            case 2:
                return ViewAtIndex.COMPARATOR$lambda$0((ViewAtIndex) obj, (ViewAtIndex) obj2);
            case 3:
                return EventDispatcherImpl.EVENT_COMPARATOR$lambda$5((Event) obj, (Event) obj2);
            case 4:
                return ((Double) obj).compareTo((Double) obj2);
            case 5:
                return CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
            case 6:
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            case 7:
                return SortUtils.lambda$sortLocalMediaAddedTime$1((LocalMedia) obj, (LocalMedia) obj2);
            case 8:
                return SortUtils.lambda$sortFolder$0((LocalMediaFolder) obj, (LocalMediaFolder) obj2);
            default:
                BillerListItemBean billerListItemBean = (BillerListItemBean) obj;
                BillerListItemBean billerListItemBean2 = (BillerListItemBean) obj2;
                Intrinsics.e(billerListItemBean);
                String billerName = billerListItemBean.getBillerName();
                Intrinsics.e(billerName);
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String lowerCase = billerName.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                Intrinsics.e(billerListItemBean2);
                String billerName2 = billerListItemBean2.getBillerName();
                Intrinsics.e(billerName2);
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String lowerCase2 = billerName2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return lowerCase.compareTo(lowerCase2);
        }
    }
}
