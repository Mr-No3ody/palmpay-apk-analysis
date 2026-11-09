package com.nimbusds.jose.shaded.gson;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f23692a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f23692a = bool;
    }

    public static boolean d(s sVar) {
        Serializable serializable = sVar.f23692a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean a() {
        Serializable serializable = this.f23692a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c());
    }

    public final Number b() {
        Serializable serializable = this.f23692a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.nimbusds.jose.shaded.gson.internal.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String c() {
        Serializable serializable = this.f23692a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = this.f23692a;
        Serializable serializable2 = sVar.f23692a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (d(this) && d(sVar)) {
            return b().longValue() == sVar.b().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = b().doubleValue();
        double dDoubleValue2 = sVar.b().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f23692a;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            jDoubleToLongBits = b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f23692a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f23692a = str;
    }
}
