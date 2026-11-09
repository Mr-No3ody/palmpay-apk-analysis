package p183m6;

import Wf.AbstractC0780y;
import Wf.V;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p010a9.f;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f39531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39532f;

    static {
        new o(null);
    }

    public q(i cache, String str) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f39531e = cache;
        this.f39532f = str;
    }

    @Override // p183m6.n
    public final void a(f fVar, String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        AbstractC0780y.m(V.f10828a, null, null, new p(this, C1847n.y(keys), new WeakReference(fVar), null), 3);
    }

    @Override // p183m6.n
    public final boolean b(String key, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strC = this.f39531e.c(key);
        if (strC != null) {
            String string = StringsKt.V(strC).toString();
            if (string.length() != 0) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                int iHashCode = lowerCase.hashCode();
                if (iHashCode != 48) {
                    if (iHashCode != 49) {
                        if (iHashCode != 102) {
                            if (iHashCode != 110) {
                                if (iHashCode != 116) {
                                    if (iHashCode != 121) {
                                        if (iHashCode != 3521) {
                                            if (iHashCode != 119527) {
                                                if (iHashCode != 3569038) {
                                                    if (iHashCode == 97196323 && lowerCase.equals("false")) {
                                                        return false;
                                                    }
                                                } else if (lowerCase.equals("true")) {
                                                    return true;
                                                }
                                            } else if (lowerCase.equals("yes")) {
                                                return true;
                                            }
                                        } else if (lowerCase.equals("no")) {
                                            return false;
                                        }
                                    } else if (lowerCase.equals("y")) {
                                        return true;
                                    }
                                } else if (lowerCase.equals("t")) {
                                    return true;
                                }
                            } else if (lowerCase.equals("n")) {
                                return false;
                            }
                        } else if (lowerCase.equals("f")) {
                            return false;
                        }
                    } else if (lowerCase.equals("1")) {
                        return true;
                    }
                } else if (lowerCase.equals("0")) {
                    return false;
                }
            }
        }
        return z3;
    }

    @Override // p183m6.n
    public final Number c(String key, Number number) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(number, "default");
        String strC = this.f39531e.c(key);
        if (strC != null) {
            try {
                if (number instanceof Double) {
                    return Double.valueOf(Double.parseDouble(strC));
                }
                if (number instanceof Long) {
                    return Long.valueOf(Long.parseLong(strC));
                }
                if (number instanceof Short) {
                    return Short.valueOf(Short.parseShort(strC));
                }
                if (number instanceof Byte) {
                    return Byte.valueOf(Byte.parseByte(strC));
                }
                return number instanceof Float ? Float.valueOf(Float.parseFloat(strC)) : Integer.valueOf(Integer.parseInt(strC));
            } catch (NumberFormatException e10) {
                Log.e("RC_RealRemote", "Error parsing number from config", e10);
            }
        }
        return number;
    }

    @Override // p183m6.n
    public final String d(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        String strC = this.f39531e.c(key);
        return strC == null ? str : strC;
    }

    @Override // p183m6.n
    public final void e(String str) {
        this.f39532f = str;
        this.f39531e.f39512e = str;
    }
}
