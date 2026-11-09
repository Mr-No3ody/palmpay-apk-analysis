package com.appsflyer.internal;

import android.util.Base64;
import androidx.camera.camera2.internal.F;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "", "", "p0", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "AFAdRevenueData", "()Lorg/json/JSONObject;", "getRevenue", "()Ljava/lang/String;", "toString", "getMonetizationNetwork", "I", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMediationNetwork", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AFc1bSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    final String getMonetizationNetwork;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public String getMediationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    int getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public String AFAdRevenueData;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1bSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK$AFa1zSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getRevenue", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1bSDK;", "AFAdRevenueData", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1bSDK;", "getCurrencyIso4217Code", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExceptionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n13579#2,2:95\n*S KotlinDebug\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n*L\n65#1:95,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public static AFc1bSDK AFAdRevenueData(@NotNull String p3) {
            Intrinsics.checkNotNullParameter(p3, "");
            List<String> listSplit$default = StringsKt__StringsKt.split$default(p3, new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, null);
            if (listSplit$default.size() == 4) {
                String currencyIso4217Code = null;
                String currencyIso4217Code2 = null;
                String currencyIso4217Code3 = null;
                Integer numValueOf = null;
                for (String str : listSplit$default) {
                    if (y.m(str, "label=", false)) {
                        currencyIso4217Code = getCurrencyIso4217Code(str, "label=");
                    } else if (y.m(str, "hashName=", false)) {
                        currencyIso4217Code2 = getCurrencyIso4217Code(str, "hashName=");
                    } else if (!y.m(str, "stackTrace=", false)) {
                        if (!y.m(str, "c=", false)) {
                            break;
                        }
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.V(strSubstring).toString()));
                    } else {
                        currencyIso4217Code3 = getCurrencyIso4217Code(str, "stackTrace=");
                    }
                }
                if (!getRevenue(numValueOf, currencyIso4217Code, currencyIso4217Code2, currencyIso4217Code3)) {
                    Intrinsics.e(currencyIso4217Code);
                    Intrinsics.e(currencyIso4217Code2);
                    Intrinsics.e(currencyIso4217Code3);
                    Intrinsics.e(numValueOf);
                    return new AFc1bSDK(currencyIso4217Code, currencyIso4217Code2, currencyIso4217Code3, numValueOf.intValue());
                }
            }
            return null;
        }

        private static String getCurrencyIso4217Code(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.V(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }

        private static boolean getRevenue(Integer p3, String... p10) {
            boolean z3 = p3 == null;
            int length = p10.length;
            for (int i7 = 0; i7 < 3; i7++) {
                String str = p10[i7];
                z3 = z3 || str == null || str.length() == 0;
            }
            return z3;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFc1bSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = str3;
        this.getCurrencyIso4217Code = i7;
    }

    @NotNull
    public final JSONObject AFAdRevenueData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.getMediationNetwork);
        jSONObject.put("hash_name", this.getMonetizationNetwork);
        jSONObject.put("st", this.AFAdRevenueData);
        jSONObject.put("c", String.valueOf(this.getCurrencyIso4217Code));
        return jSONObject;
    }

    public final boolean equals(@Nullable Object p3) {
        if (this == p3) {
            return true;
        }
        if (!(p3 instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) p3;
        return Intrinsics.c(this.getMediationNetwork, aFc1bSDK.getMediationNetwork) && Intrinsics.c(this.getMonetizationNetwork, aFc1bSDK.getMonetizationNetwork) && Intrinsics.c(this.AFAdRevenueData, aFc1bSDK.AFAdRevenueData) && this.getCurrencyIso4217Code == aFc1bSDK.getCurrencyIso4217Code;
    }

    @NotNull
    public final String getRevenue() {
        String str = this.getMediationNetwork;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMonetizationNetwork;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.AFAdRevenueData;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        String strEncodeToString3 = Base64.encodeToString(bytes3, 2);
        int i7 = this.getCurrencyIso4217Code;
        StringBuilder sbF = F.f("label=", strEncodeToString, "\nhashName=", strEncodeToString2, "\nstackTrace=");
        sbF.append(strEncodeToString3);
        sbF.append("\nc=");
        sbF.append(i7);
        return sbF.toString();
    }

    public final int hashCode() {
        return Integer.hashCode(this.getCurrencyIso4217Code) + ((this.AFAdRevenueData.hashCode() + ((this.getMonetizationNetwork.hashCode() + (this.getMediationNetwork.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getMediationNetwork;
        String str2 = this.getMonetizationNetwork;
        String str3 = this.AFAdRevenueData;
        int i7 = this.getCurrencyIso4217Code;
        StringBuilder sbF = F.f("ExceptionInfo(label=", str, ", hashName=", str2, ", stackTrace=");
        sbF.append(str3);
        sbF.append(", counter=");
        sbF.append(i7);
        sbF.append(")");
        return sbF.toString();
    }

    public /* synthetic */ AFc1bSDK(String str, String str2, String str3, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? 1 : i7);
    }
}
