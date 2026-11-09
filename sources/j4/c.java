package j4;

import android.text.TextUtils;
import com.transsnet.palmpay.core.init.FlexiBankSdkInitTask;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38285a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(c.class.getSimpleName(), "getSimpleName(...)");
    }

    public static String a(String originBody) {
        Intrinsics.checkNotNullParameter(originBody, "originBody");
        if (TextUtils.isEmpty(originBody)) {
            return originBody;
        }
        if (com.flexibank.sdk.k.k()) {
            Intrinsics.checkNotNullParameter(originBody, "originBody");
            com.flexibank.sdk.k kVar = com.flexibank.sdk.k.f22317a;
            com.flexibank.sdk.k.o();
            String strBuildFlexiBankConfig$lambda$2 = FlexiBankSdkInitTask.buildFlexiBankConfig$lambda$2(originBody);
            Intrinsics.e(strBuildFlexiBankConfig$lambda$2);
            if (!TextUtils.isEmpty(strBuildFlexiBankConfig$lambda$2)) {
                return strBuildFlexiBankConfig$lambda$2;
            }
        }
        StringBuilder sb2 = new StringBuilder("{\"blackBox\":\"");
        if (StringsKt.A("EmptyBlackCode", "\"", false)) {
            sb2.append(y.k("EmptyBlackCode", "\"", "\\\""));
        } else {
            sb2.append("EmptyBlackCode");
        }
        if (originBody.equals("{}")) {
            sb2.append("\"");
        } else {
            sb2.append("\",");
        }
        String strSubstring = originBody.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
