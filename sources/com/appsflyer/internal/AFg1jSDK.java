package com.appsflyer.internal;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.camera.video.u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1jSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1tSDK> getRevenue = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    public enum AFa1tSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private void getCurrencyIso4217Code() throws AFg1iSDK {
        if (this.getRevenue.isEmpty()) {
            return;
        }
        AFa1tSDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1tSDK.EMPTY_ARRAY) {
            AFa1tSDK aFa1tSDK = AFa1tSDK.NONEMPTY_ARRAY;
            List<AFa1tSDK> list = this.getRevenue;
            list.set(list.size() - 1, aFa1tSDK);
        } else {
            if (monetizationNetwork == AFa1tSDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (monetizationNetwork != AFa1tSDK.DANGLING_KEY) {
                if (monetizationNetwork != AFa1tSDK.NULL) {
                    throw new AFg1iSDK("Nesting problem");
                }
            } else {
                this.getMediationNetwork.append(":");
                AFa1tSDK aFa1tSDK2 = AFa1tSDK.NONEMPTY_OBJECT;
                List<AFa1tSDK> list2 = this.getRevenue;
                list2.set(list2.size() - 1, aFa1tSDK2);
            }
        }
    }

    private AFa1tSDK getMonetizationNetwork() throws AFg1iSDK {
        if (this.getRevenue.isEmpty()) {
            throw new AFg1iSDK("Nesting problem");
        }
        return (AFa1tSDK) u.e(1, this.getRevenue);
    }

    public final void AFAdRevenueData(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\f') {
                this.getMediationNetwork.append("\\f");
            } else if (cCharAt == '\r') {
                this.getMediationNetwork.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.getMediationNetwork.append("\\b");
                        break;
                    case '\t':
                        this.getMediationNetwork.append("\\t");
                        break;
                    case '\n':
                        this.getMediationNetwork.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            this.getMediationNetwork.append(cCharAt);
                        }
                        break;
                }
            } else {
                StringBuilder sb2 = this.getMediationNetwork;
                sb2.append('\\');
                sb2.append(cCharAt);
            }
        }
        this.getMediationNetwork.append("\"");
    }

    public final AFg1jSDK getMediationNetwork(AFa1tSDK aFa1tSDK, String str) throws AFg1iSDK {
        if (this.getRevenue.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFg1iSDK("Nesting problem: multiple top-level roots");
        }
        getCurrencyIso4217Code();
        this.getRevenue.add(aFa1tSDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final AFg1jSDK getRevenue(AFa1tSDK aFa1tSDK, AFa1tSDK aFa1tSDK2, String str) throws AFg1iSDK {
        AFa1tSDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork != aFa1tSDK2 && monetizationNetwork != aFa1tSDK) {
            throw new AFg1iSDK("Nesting problem");
        }
        List<AFa1tSDK> list = this.getRevenue;
        list.remove(list.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }

    public final void getRevenue() throws AFg1iSDK {
        AFa1tSDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1tSDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (monetizationNetwork != AFa1tSDK.EMPTY_OBJECT) {
            throw new AFg1iSDK("Nesting problem");
        }
        AFa1tSDK aFa1tSDK = AFa1tSDK.DANGLING_KEY;
        List<AFa1tSDK> list = this.getRevenue;
        list.set(list.size() - 1, aFa1tSDK);
    }

    public final AFg1jSDK getMonetizationNetwork(Object obj) throws AFg1iSDK {
        if (!this.getRevenue.isEmpty()) {
            if (((Class) AFa1jSDK.getMonetizationNetwork(TextUtils.indexOf("", "", 0, 0) + 36, 323 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).isInstance(obj)) {
                try {
                    Object[] objArr = {this};
                    Map map = AFa1jSDK.unregisterClient;
                    Object declaredMethod = map.get(-289663571);
                    if (declaredMethod == null) {
                        declaredMethod = ((Class) AFa1jSDK.getMonetizationNetwork(TextUtils.getOffsetBefore("", 0) + 36, (Process.myTid() >> 22) + 322, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getDeclaredMethod("getRevenue", AFg1jSDK.class);
                        map.put(-289663571, declaredMethod);
                    }
                    ((Method) declaredMethod).invoke(obj, objArr);
                    return this;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (obj instanceof AFg1kSDK) {
                ((AFg1kSDK) obj).AFAdRevenueData(this);
                return this;
            }
            getCurrencyIso4217Code();
            if (obj != null && !(obj instanceof Boolean) && obj != AFg1kSDK.AFAdRevenueData) {
                if (obj instanceof Number) {
                    this.getMediationNetwork.append(AFg1kSDK.getRevenue((Number) obj));
                    return this;
                }
                AFAdRevenueData(obj.toString());
                return this;
            }
            this.getMediationNetwork.append(obj);
            return this;
        }
        throw new AFg1iSDK("Nesting problem");
    }
}
