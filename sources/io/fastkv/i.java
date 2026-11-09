package io.fastkv;

import com.alibaba.android.arouter.utils.Consts;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j {
    @Override // io.fastkv.b
    public final byte a() {
        return (byte) 6;
    }

    @Override // io.fastkv.b
    public final boolean b() {
        String str = (String) this.f37635b;
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    @Override // io.fastkv.b
    public final float c() {
        String str = (String) this.f37635b;
        if (str == null || str.isEmpty()) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    @Override // io.fastkv.b
    public final int d() {
        String str = (String) this.f37635b;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            return str.contains(Consts.DOT) ? (int) Double.parseDouble(str) : Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // io.fastkv.b
    public final long e() {
        String str = (String) this.f37635b;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            return str.contains(Consts.DOT) ? (long) Double.parseDouble(str) : Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // io.fastkv.b
    public final String f() {
        Object obj = this.f37635b;
        return obj != null ? (String) obj : "";
    }
}
