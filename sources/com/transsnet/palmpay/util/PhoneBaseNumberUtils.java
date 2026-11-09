package com.transsnet.palmpay.util;

import C0.G;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J$\u0010\u000f\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/util/PhoneBaseNumberUtils;", "", "()V", "formatMobileNumber", "", "number", "hideMiddleNum", "", "getFullMobileNumber", "mobile", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getMobileNumberAcceptedLength", "", "getMobileNumberValidLength", "getValidMobileNumber", "isValidMobileNumber", "ignoreFirstZero", "lib_util_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhoneBaseNumberUtils {

    @NotNull
    public static final PhoneBaseNumberUtils INSTANCE = new PhoneBaseNumberUtils();

    private PhoneBaseNumberUtils() {
    }

    public static /* synthetic */ boolean isValidMobileNumber$default(PhoneBaseNumberUtils phoneBaseNumberUtils, String str, String str2, boolean z3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z3 = false;
        }
        return phoneBaseNumberUtils.isValidMobileNumber(str, str2, z3);
    }

    @Nullable
    public final String formatMobileNumber(@Nullable String number, boolean hideMiddleNum) {
        if (TextUtils.isEmpty(number)) {
            return number;
        }
        Integer numValueOf = number != null ? Integer.valueOf(number.length()) : null;
        if (numValueOf != null && numValueOf.intValue() == 11) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = number.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(" ");
            if (hideMiddleNum) {
                sb2.append("****");
            } else {
                String strSubstring2 = number.substring(3, 7);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring2);
            }
            sb2.append(" ");
            String strSubstring3 = number.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring3);
            return sb2.toString();
        }
        if ((numValueOf == null || numValueOf.intValue() != 10) && (numValueOf == null || numValueOf.intValue() != 9)) {
            return number;
        }
        StringBuilder sb3 = new StringBuilder();
        String strSubstring4 = number.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
        sb3.append(strSubstring4);
        sb3.append(" ");
        if (hideMiddleNum) {
            sb3.append("***");
        } else {
            String strSubstring5 = number.substring(3, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            sb3.append(strSubstring5);
        }
        sb3.append(" ");
        String strSubstring6 = number.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring6, "this as java.lang.String).substring(startIndex)");
        sb3.append(strSubstring6);
        return sb3.toString();
    }

    @Nullable
    public final String getFullMobileNumber(@Nullable String mobile, @Nullable String countryCode) {
        String validMobileNumber = getValidMobileNumber(mobile, countryCode);
        if (!isValidMobileNumber(validMobileNumber, countryCode, false)) {
            return "";
        }
        if ("NG".equalsIgnoreCase(countryCode)) {
            return G.o("0234", validMobileNumber);
        }
        if ("GH".equalsIgnoreCase(countryCode)) {
            return G.o("0233", validMobileNumber);
        }
        if ("TZ".equalsIgnoreCase(countryCode)) {
            return G.o("0255", validMobileNumber);
        }
        if ("AO".equalsIgnoreCase(countryCode)) {
            return G.o("0244", validMobileNumber);
        }
        if ("BD".equalsIgnoreCase(countryCode)) {
            return G.o("0880", validMobileNumber);
        }
        if ("PK".equalsIgnoreCase(countryCode)) {
            return G.o("0092", validMobileNumber);
        }
        return "UG".equalsIgnoreCase(countryCode) ? G.o("0256", validMobileNumber) : "";
    }

    public final int getMobileNumberAcceptedLength(@Nullable String countryCode) {
        return ("AO".equalsIgnoreCase(countryCode) || "GH".equalsIgnoreCase(countryCode)) ? getMobileNumberValidLength(countryCode) : getMobileNumberValidLength(countryCode) - 1;
    }

    public final int getMobileNumberValidLength(@Nullable String countryCode) {
        if ("NG".equalsIgnoreCase(countryCode) || "PK".equalsIgnoreCase(countryCode)) {
            return 11;
        }
        if ("GH".equalsIgnoreCase(countryCode) || "TZ".equalsIgnoreCase(countryCode) || "BD".equalsIgnoreCase(countryCode) || "UG".equalsIgnoreCase(countryCode)) {
            return 10;
        }
        return "AO".equalsIgnoreCase(countryCode) ? 9 : 11;
    }

    @Nullable
    public final String getValidMobileNumber(@Nullable String mobile, @Nullable String countryCode) {
        if (TextUtils.isEmpty(mobile)) {
            return mobile;
        }
        Integer numValueOf = mobile != null ? Integer.valueOf(mobile.length()) : null;
        return (numValueOf != null && numValueOf.intValue() == getMobileNumberAcceptedLength(countryCode) && numValueOf.intValue() < getMobileNumberValidLength(countryCode)) ? G.o("0", mobile) : mobile;
    }

    public final boolean isValidMobileNumber(@Nullable String number, @Nullable String countryCode, boolean ignoreFirstZero) {
        if (!TextUtils.isEmpty(number) && TextUtils.isDigitsOnly(number)) {
            if (number != null && number.length() == getMobileNumberValidLength(countryCode)) {
                return true;
            }
            if (number != null && ignoreFirstZero && !y.m(number, "0", false) && number.length() == INSTANCE.getMobileNumberAcceptedLength(countryCode)) {
                return true;
            }
        }
        return false;
    }
}
